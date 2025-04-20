package fossils.fossils.client.blockentity.model.aristonectes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AristonectesFossilModel extends SkullModelBase {
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

	public AristonectesFossilModel(ModelPart root) {
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
		this.Neck7 = this.Neck6.getChild("Neck7");
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

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.1563F, 9.9903F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, -4.9878F, 0.0712F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9936F, 4.7132F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 108).addBox(0.0F, -4.9143F, -0.2076F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.62F, 7.992F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 122).mirror().addBox(-4.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.0111F, 0.232F, -1.0593F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 122).mirror().addBox(-3.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.1655F, 0.1352F, -0.2839F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(128, 84).mirror().addBox(-1.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 11.2808F, 0.1807F, 0.1036F, -0.1559F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 88).mirror().addBox(-3.1173F, -0.0139F, -0.5262F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0556F, 0.1017F, -0.2083F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(128, 68).mirror().addBox(-1.1098F, 0.1317F, -0.516F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0424F, 0.099F, -0.0767F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(121, 114).mirror().addBox(-4.924F, -1.0766F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.0914F, 0.1004F, -0.5591F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 122).mirror().addBox(-5.726F, -3.3943F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6367F, 8.4808F, -0.1292F, 0.0414F, -1.0808F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 124).mirror().addBox(-4.8423F, -1.0187F, -0.6037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, -0.0085F, 0.0904F, -0.6265F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(126, 103).mirror().addBox(-1.0109F, 0.1454F, -0.5222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, 0.0263F, 0.052F, -0.1469F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 124).mirror().addBox(-3.021F, 0.0126F, -0.5315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, 0.0187F, 0.064F, -0.2774F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-6.6842F, -3.3034F, -0.6037F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0367F, 5.4808F, -0.0527F, 0.074F, -1.1517F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 122).addBox(2.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.0111F, -0.232F, 1.0593F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 122).addBox(1.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.1655F, -0.1352F, 0.2839F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(128, 84).addBox(0.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 11.2808F, 0.1807F, -0.1036F, 0.1559F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(120, 88).addBox(1.1173F, -0.0139F, -0.5262F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0556F, -0.1017F, 0.2083F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(128, 68).addBox(0.1098F, 0.1317F, -0.516F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0424F, -0.099F, 0.0767F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(121, 114).addBox(2.924F, -1.0766F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.0914F, -0.1004F, 0.5591F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 122).addBox(3.726F, -3.3943F, -0.6005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.6367F, 8.4808F, -0.1292F, -0.0414F, 1.0808F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 124).addBox(2.8423F, -1.0187F, -0.6037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, -0.0085F, -0.0904F, 0.6265F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(126, 103).addBox(0.0109F, 0.1454F, -0.5222F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, 0.0263F, -0.052F, 0.1469F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 124).addBox(1.021F, 0.0126F, -0.5315F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, 0.0187F, -0.064F, 0.2774F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(17, 91).addBox(3.6842F, -3.3034F, -0.6037F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0367F, 5.4808F, -0.0527F, -0.074F, 1.1517F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 0).addBox(-1.5F, -1.2022F, -0.115F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.7143F, 0.1281F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.2358F, -0.0424F, 0.0102F));

		PartDefinition cube_r26 = Tail.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(111, 70).addBox(0.0F, -5.6623F, 8.8445F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 111).addBox(0.0F, -5.6623F, 5.8445F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 111).addBox(0.0F, -5.2623F, 2.8445F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 78).addBox(0.0F, -4.7623F, -0.1555F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.507F, 0.1655F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Tail.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(94, 82).addBox(-2.0F, 2.9432F, 15.6272F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(63, 105).mirror().addBox(-2.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 105).addBox(1.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 10.0947F, -17.4239F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Tail.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(49, 35).mirror().addBox(-11.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 9.2473F, -20.0701F, 0.2449F, 0.4677F, 0.1122F));

		PartDefinition Hips_r3 = Tail.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(41, 103).mirror().addBox(-4.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, 9.0862F, -15.6329F, 0.2229F, 0.2044F, 0.046F));

		PartDefinition Hips_r4 = Tail.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(52, 105).mirror().addBox(2.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 12.5236F, -13.4854F, 0.5179F, -0.3691F, -0.2028F));

		PartDefinition Hips_r5 = Tail.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(112, 62).mirror().addBox(1.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 12.5236F, -13.4854F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition Hips_r6 = Tail.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-8.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1638F, 9.6568F, -13.059F, 1.2733F, 0.422F, 0.3198F));

		PartDefinition cube_r27 = Tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(125, 26).mirror().addBox(-1.4737F, 4.8005F, 20.1911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.3167F, -10.9485F, 0.3738F, 0.1396F, -0.6593F));

		PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 122).mirror().addBox(-4.3529F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9167F, -10.6485F, 0.3537F, 0.1947F, -0.6227F));

		PartDefinition cube_r29 = Tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(131, 56).mirror().addBox(-1.7399F, 3.5889F, 17.1429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9167F, -10.6485F, 0.3738F, 0.1396F, -0.5023F));

		PartDefinition cube_r30 = Tail.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 104).mirror().addBox(-8.0228F, -0.9625F, 16.6946F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.1282F, 0.4716F, -1.2852F));

		PartDefinition cube_r31 = Tail.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-5.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.416F, 0.2288F, -0.5049F));

		PartDefinition cube_r32 = Tail.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-2.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.9167F, -13.7485F, 0.4391F, 0.1663F, -0.3876F));

		PartDefinition Hips_r7 = Tail.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(49, 35).addBox(5.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 9.2473F, -20.0701F, 0.2449F, -0.4677F, -0.1122F));

		PartDefinition Hips_r8 = Tail.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(41, 103).addBox(2.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 9.0862F, -15.6329F, 0.2229F, -0.2044F, -0.046F));

		PartDefinition Hips_r9 = Tail.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(52, 105).addBox(-5.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 12.5236F, -13.4854F, 0.5179F, 0.3691F, 0.2028F));

		PartDefinition Hips_r10 = Tail.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(45, 94).addBox(-1.6F, 4.1745F, 16.6683F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 12.5236F, -13.4854F, 0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = Tail.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(112, 62).addBox(-3.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 12.5236F, -13.4854F, 0.4899F, 0.1932F, 0.102F));

		PartDefinition Hips_r12 = Tail.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(30, 99).addBox(7.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1638F, 9.6568F, -13.059F, 1.2733F, -0.422F, -0.3198F));

		PartDefinition cube_r33 = Tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(125, 26).addBox(0.4737F, 4.8005F, 20.1911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.3167F, -10.9485F, 0.3738F, -0.1396F, 0.6593F));

		PartDefinition cube_r34 = Tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 122).addBox(2.3529F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9167F, -10.6485F, 0.3537F, -0.1947F, 0.6227F));

		PartDefinition cube_r35 = Tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(131, 56).addBox(0.7399F, 3.5889F, 17.1429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9167F, -10.6485F, 0.3738F, -0.1396F, 0.5023F));

		PartDefinition cube_r36 = Tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(24, 104).addBox(7.0228F, -0.9625F, 16.6946F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.1282F, -0.4716F, 1.2852F));

		PartDefinition cube_r37 = Tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(33, 106).addBox(3.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.416F, -0.2288F, 0.5049F));

		PartDefinition cube_r38 = Tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(86, 14).addBox(1.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.9167F, -13.7485F, 0.4391F, -0.1663F, 0.3876F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create().texOffs(54, 102).addBox(-0.4971F, -0.4811F, -0.7574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.9F, 8.5106F, 3.4723F, 0.1359F, -0.1268F, 0.782F));

		PartDefinition cube_r39 = BackFlipperR2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(33, 108).addBox(8.9061F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(88, 34).addBox(9.3061F, 0.9166F, 14.5997F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4487F, -1.3977F, -17.2708F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r40 = BackFlipperR2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 19).addBox(-0.8066F, 0.9166F, -1.4755F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6513F, -1.3977F, 0.9292F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r41 = BackFlipperR2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 101).addBox(-0.3125F, 0.9166F, -0.06F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2487F, -1.3977F, -0.2708F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r42 = BackFlipperR2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(103, 101).addBox(-1.3485F, 0.9166F, -0.7866F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.7514F, -1.3977F, -0.3708F, 0.0F, 0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(47, 130).addBox(-0.225F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 105).addBox(-0.225F, -0.5307F, 1.4526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7288F, 0.0209F, 1.8225F, -0.0765F, -0.332F, 0.231F));

		PartDefinition cube_r43 = BackFlipperMiddleR2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(24, 119).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -0.0307F, -1.1474F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r44 = BackFlipperMiddleR2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 54).addBox(-0.8642F, 1.4166F, 0.5532F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5397F, -1.4473F, -3.7616F, 0.0F, 0.096F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(12.2241F, -0.0158F, -1.8824F, -0.0229F, -0.1289F, 0.176F));

		PartDefinition cube_r45 = BackFlipperEndR2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(41, 40).addBox(11.9583F, 1.4315F, -1.0613F, 17.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.55F, -1.4315F, 0.0311F, 0.0F, 0.096F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create().texOffs(67, 102).addBox(-4.5029F, -0.4811F, -0.7574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-5.9F, 8.5106F, 3.4723F, 0.2F, 0.1162F, -0.6344F));

		PartDefinition cube_r46 = BackFlipperR3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(42, 108).addBox(-10.9061F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(88, 42).addBox(-12.3061F, 0.9166F, 14.5997F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4487F, -1.3977F, -17.2708F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r47 = BackFlipperR3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 94).addBox(-3.1934F, 0.9166F, -1.4755F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6513F, -1.3977F, 0.9292F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r48 = BackFlipperR3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 102).addBox(-3.6875F, 0.9166F, -0.06F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2487F, -1.3977F, -0.2708F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r49 = BackFlipperR3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(13, 104).addBox(-0.6515F, 0.9166F, -0.7866F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-3.7514F, -1.3977F, -0.3708F, 0.0F, -0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(130, 49).addBox(-0.775F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 119).addBox(-0.775F, -0.5307F, 1.4526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7288F, 0.0209F, 1.8225F, -0.0765F, 0.332F, -0.231F));

		PartDefinition cube_r50 = BackFlipperMiddleR3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(95, 119).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -0.0307F, -1.1474F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r51 = BackFlipperMiddleR3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 62).addBox(-10.1358F, 1.4166F, 0.5532F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5397F, -1.4473F, -3.7616F, 0.0F, -0.096F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.2241F, -0.0158F, -1.8824F, -0.0341F, 0.1264F, -0.264F));

		PartDefinition cube_r52 = BackFlipperEndR3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(41, 47).addBox(-28.9583F, 1.4315F, -1.0613F, 17.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.55F, -1.4315F, 0.0311F, 0.0F, -0.096F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, -0.3113F, 0.8274F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.44F, 10.2261F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r53 = tail3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(7, 124).addBox(0.0F, -3.7548F, -0.6097F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2007F, 10.49F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(10, 124).addBox(0.0F, -4.615F, 5.9948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 112).addBox(0.0F, -4.715F, 2.9948F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 111).addBox(0.0F, -4.515F, -0.0052F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2963F, 1.8326F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 125).addBox(0.0F, 3.5688F, 25.7315F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 125).addBox(0.0F, 3.3688F, 23.7315F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 112).addBox(0.0F, 3.0688F, 21.7315F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 129).addBox(0.0F, 2.7688F, 19.7315F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 129).addBox(0.0F, 1.9688F, 17.7315F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9382F, -16.5186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(86, 24).addBox(-0.5F, -0.5259F, -0.135F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 10.8853F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r56 = tail4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(131, 102).addBox(0.0F, 4.6936F, 28.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 98).addBox(0.0F, 4.4936F, 26.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 129).addBox(0.0F, 3.3936F, 24.6658F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 129).addBox(0.0F, 3.1936F, 22.6658F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.124F, -22.4624F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(121, 129).addBox(-0.5F, -2.7583F, 0.0798F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5492F, 6.8078F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(118, 129).addBox(-0.5F, -2.9035F, 0.0892F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6442F, 4.8001F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(23, 84).addBox(-0.5F, -3.2473F, 0.0743F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5396F, 2.8028F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(103, 111).addBox(-0.5F, -3.591F, 0.0594F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4349F, 0.8056F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(73, 93).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(124, 129).addBox(0.0F, -3.1094F, 0.9396F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 129).addBox(0.0F, -2.9094F, 2.9396F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 128).addBox(0.0F, -2.8094F, 4.9396F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0517F, 7.8498F, -0.0701F, -0.0871F, 0.0061F));

		PartDefinition cube_r61 = tail5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(131, 110).addBox(0.0F, 4.9936F, 30.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 116).addBox(0.0F, 5.4936F, 34.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 106).addBox(0.0F, 5.2936F, 32.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0723F, -30.3122F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(131, 52).addBox(0.0F, -2.6094F, 1.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0175F, 6.9181F, -0.0788F, -0.087F, 0.0069F));

		PartDefinition cube_r62 = tail2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(79, 131).addBox(0.0F, -1.9273F, -1.0832F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5821F, 7.0227F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 106).addBox(0.0F, 6.8937F, 42.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 132).addBox(0.0F, 5.8937F, 40.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 132).addBox(0.0F, 5.7936F, 38.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 132).addBox(0.0F, 5.6936F, 36.6658F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0898F, -37.2303F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 131).addBox(0.0F, -1.9813F, -0.8746F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6281F, 4.8141F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(29, 129).addBox(0.0F, -2.1627F, -1.0685F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6467F, 1.0081F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(131, 36).addBox(0.0F, -2.2094F, 0.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 131).addBox(0.0F, -2.1094F, 2.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 131).addBox(0.0F, -1.9094F, 4.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 37).addBox(0.0F, -1.5094F, 8.9396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 130).addBox(0.0F, -1.7094F, 6.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.0007F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r66 = tail6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 133).addBox(0.0F, 7.9936F, 50.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 132).addBox(0.0F, 7.6936F, 48.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 132).addBox(0.0F, 7.5936F, 46.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 132).addBox(0.0F, 7.1936F, 44.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1119F, -44.2309F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 11.6366F, -18.8036F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, -0.062F, -0.1742F, 0.0108F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -2.0172F, -9.9992F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6538F, -18.8043F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 27).addBox(-7.0F, -1.9226F, -9.7972F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.2829F, 0.8944F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(56, 109).addBox(0.0F, -4.3951F, -7.0566F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 110).addBox(0.0F, -5.0951F, -4.1566F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 110).addBox(0.0F, -5.5951F, -1.1566F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 110).addBox(0.0F, -6.2951F, 1.8434F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -19.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(33, 54).addBox(-1.0F, -0.6205F, -12.9815F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -14.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(112, 54).addBox(0.0F, -4.9593F, -0.2377F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9125F, -7.687F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(43, 112).addBox(0.0F, -4.8407F, -0.7735F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5671F, -1.096F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 0).addBox(0.0F, -4.7191F, -1.793F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6718F, -3.0933F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 110).addBox(0.0F, -5.55F, -0.9F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4843F, -10.1517F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(107, 109).addBox(0.0F, -5.05F, 0.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2475F, -14.0782F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(120, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5682F, -0.0829F, -0.0688F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(76, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5728F, -0.0046F, -0.1738F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(121, 62).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.5446F, 0.202F, -0.457F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 35).mirror().addBox(-12.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -25.1117F, 0.3846F, 0.4418F, -0.9498F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 120).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5251F, -0.0903F, -0.0301F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(31, 120).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5309F, -0.0166F, -0.1384F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 121).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.5071F, 0.1787F, -0.4292F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-12.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -22.1117F, 0.3612F, 0.4037F, -0.9245F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(128, 114).mirror().addBox(-1.0021F, -0.0401F, -0.5517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.2861F, 0.07F, 0.0241F));

		PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(7, 122).mirror().addBox(-2.9879F, -0.1702F, -0.5608F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.2747F, 0.115F, -0.0994F));

		PartDefinition cube_r86 = Body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(14, 123).mirror().addBox(-4.7482F, -1.1791F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.2173F, 0.2244F, -0.4359F));

		PartDefinition cube_r87 = Body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(72, 108).mirror().addBox(-7.5225F, -3.3953F, -0.6313F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -1.1117F, 0.0741F, 0.3024F, -0.9728F));

		PartDefinition cube_r88 = Body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(123, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3261F, -0.0679F, -0.0136F));

		PartDefinition cube_r89 = Body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(123, 4).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3313F, -0.017F, -0.1344F));

		PartDefinition cube_r90 = Body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(123, 2).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.3148F, 0.1178F, -0.457F));

		PartDefinition cube_r91 = Body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(109, 14).mirror().addBox(-8.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2845F, -4.2117F, 0.2164F, 0.2584F, -0.9711F));

		PartDefinition cube_r92 = Body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 124).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3261F, -0.0679F, 0.0213F));

		PartDefinition cube_r93 = Body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(121, 84).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3313F, -0.017F, -0.0995F));

		PartDefinition cube_r94 = Body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(121, 82).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.3148F, 0.1178F, -0.4221F));

		PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-9.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0155F, -6.9117F, 0.2164F, 0.2584F, -0.9362F));

		PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.3612F, 0.4037F, -0.9245F));

		PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(110, 120).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5071F, 0.1787F, -0.4292F));

		PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(119, 112).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5309F, -0.0166F, -0.1384F));

		PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(118, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -19.1117F, 0.5251F, -0.0903F, -0.0301F));

		PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.2894F, 0.3248F, -0.9151F));

		PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4091F, 0.1416F, -0.4098F));

		PartDefinition cube_r102 = Body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4275F, -0.0234F, -0.1013F));

		PartDefinition cube_r103 = Body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(121, 122).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -15.9117F, 0.4212F, -0.0855F, 0.0141F));

		PartDefinition cube_r104 = Body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.2668F, 0.2868F, -0.9044F));

		PartDefinition cube_r105 = Body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(114, 122).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3715F, 0.1189F, -0.3972F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(107, 122).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3851F, -0.0336F, -0.0826F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 122).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -13.0117F, 0.3777F, -0.0908F, 0.0354F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(13, 102).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.2418F, 0.2833F, -0.877F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(121, 124).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3486F, 0.1274F, -0.3656F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(114, 124).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3662F, -0.0184F, -0.0477F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(107, 124).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -10.0117F, 0.3607F, -0.0735F, 0.0712F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(128, 114).addBox(0.0021F, -0.0401F, -0.5517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.283F, 0.0609F, -0.0241F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(7, 122).addBox(0.9879F, -0.1702F, -0.5608F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.2877F, 0.0153F, 0.0988F));

		PartDefinition cube_r114 = Body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(14, 123).addBox(2.7482F, -1.1791F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.2727F, -0.1055F, 0.4268F));

		PartDefinition cube_r115 = Body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(72, 108).addBox(3.5225F, -3.3953F, -0.6313F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -1.1117F, 0.1851F, -0.2271F, 0.9437F));

		PartDefinition cube_r116 = Body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(123, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3261F, 0.0679F, 0.0136F));

		PartDefinition cube_r117 = Body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(123, 4).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3313F, 0.017F, 0.1344F));

		PartDefinition cube_r118 = Body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(123, 2).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.3148F, -0.1178F, 0.457F));

		PartDefinition cube_r119 = Body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(109, 14).addBox(4.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2845F, -4.2117F, 0.2164F, -0.2584F, 0.9711F));

		PartDefinition cube_r120 = Body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 124).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3261F, 0.0679F, -0.0213F));

		PartDefinition cube_r121 = Body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(121, 84).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3313F, 0.017F, 0.0995F));

		PartDefinition cube_r122 = Body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(121, 82).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.3148F, -0.1178F, 0.4221F));

		PartDefinition cube_r123 = Body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 8).addBox(4.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0155F, -6.9117F, 0.2164F, -0.2584F, 0.9362F));

		PartDefinition cube_r124 = Body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 35).addBox(4.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.3846F, -0.4418F, 0.9498F));

		PartDefinition cube_r125 = Body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(121, 62).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5446F, -0.202F, 0.457F));

		PartDefinition cube_r126 = Body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5728F, 0.0046F, 0.1738F));

		PartDefinition cube_r127 = Body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(120, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -25.1117F, 0.5682F, 0.0829F, 0.0688F));

		PartDefinition cube_r128 = Body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(55, 24).addBox(4.0942F, -4.2155F, -0.6121F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.3612F, -0.4037F, 0.9245F));

		PartDefinition cube_r129 = Body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(45, 121).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5071F, -0.1787F, 0.4292F));

		PartDefinition cube_r130 = Body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(31, 120).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5309F, 0.0166F, 0.1384F));

		PartDefinition cube_r131 = Body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(38, 120).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -22.1117F, 0.5251F, 0.0903F, 0.0301F));

		PartDefinition cube_r132 = Body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(68, 37).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.3612F, -0.4037F, 0.9245F));

		PartDefinition cube_r133 = Body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(110, 120).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5071F, -0.1787F, 0.4292F));

		PartDefinition cube_r134 = Body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(119, 112).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5309F, 0.0166F, 0.1384F));

		PartDefinition cube_r135 = Body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(118, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -19.1117F, 0.5251F, 0.0903F, 0.0301F));

		PartDefinition cube_r136 = Body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 100).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.2894F, -0.3248F, 0.9151F));

		PartDefinition cube_r137 = Body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(123, 0).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4091F, -0.1416F, 0.4098F));

		PartDefinition cube_r138 = Body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 123).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4275F, 0.0234F, 0.1013F));

		PartDefinition cube_r139 = Body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(121, 122).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -15.9117F, 0.4212F, 0.0855F, -0.0141F));

		PartDefinition cube_r140 = Body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(94, 91).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.2668F, -0.2868F, 0.9044F));

		PartDefinition cube_r141 = Body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(114, 122).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3715F, -0.1189F, 0.3972F));

		PartDefinition cube_r142 = Body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(107, 122).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3851F, 0.0336F, 0.0826F));

		PartDefinition cube_r143 = Body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(88, 122).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -13.0117F, 0.3777F, 0.0908F, -0.0354F));

		PartDefinition cube_r144 = Body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(13, 102).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.2418F, -0.2833F, 0.877F));

		PartDefinition cube_r145 = Body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(121, 124).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3486F, -0.1274F, 0.3656F));

		PartDefinition cube_r146 = Body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(114, 124).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3662F, 0.0184F, 0.0477F));

		PartDefinition cube_r147 = Body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(107, 124).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -10.0117F, 0.3607F, 0.0735F, -0.0712F));

		PartDefinition cube_r148 = Body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.35F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -27.0F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r149 = Chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(66, 110).addBox(0.0F, -4.0784F, -1.5094F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0143F, -12.1728F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 94).addBox(-0.5F, -1.1784F, -3.1094F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -10.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 109).addBox(0.0F, -5.0075F, -1.0709F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2424F, -0.7409F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 109).addBox(0.0F, -4.7075F, 0.0291F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0342F, -4.8326F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 110).addBox(0.0F, -5.3075F, -1.0709F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -6.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(121, 78).mirror().addBox(-3.0936F, 0.1792F, -0.6439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.8036F, 0.2523F, -0.4068F));

		PartDefinition cube_r155 = Chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(132, 86).mirror().addBox(-1.0622F, 0.3202F, -0.6341F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.8207F, 0.1512F, -0.3219F));

		PartDefinition cube_r156 = Chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(121, 80).mirror().addBox(-4.9647F, -0.8864F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.7077F, 0.5103F, -0.6612F));

		PartDefinition cube_r157 = Chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(123, 98).mirror().addBox(-5.8564F, -3.25F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0845F, -12.7117F, 0.3567F, 0.7847F, -1.228F));

		PartDefinition cube_r158 = Chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(59, 124).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.7539F, 0.1287F, -0.3312F));

		PartDefinition cube_r159 = Chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(121, 96).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.7379F, 0.2241F, -0.4223F));

		PartDefinition cube_r160 = Chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(123, 76).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.646F, 0.4666F, -0.6902F));

		PartDefinition cube_r161 = Chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(116, 26).mirror().addBox(-7.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7845F, -9.7117F, 0.3255F, 0.7187F, -1.2493F));

		PartDefinition cube_r162 = Chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(121, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.6662F, 0.0231F, -0.1175F));

		PartDefinition cube_r163 = Chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(94, 87).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.3618F, 0.5846F, -1.0069F));

		PartDefinition cube_r164 = Chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(121, 66).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.5982F, 0.3367F, -0.4885F));

		PartDefinition cube_r165 = Chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(121, 64).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8845F, -3.6117F, 0.6597F, 0.1107F, -0.215F));

		PartDefinition cube_r166 = Chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(54, 100).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.2978F, 0.6523F, -1.0924F));

		PartDefinition cube_r167 = Chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(21, 123).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.587F, 0.4215F, -0.541F));

		PartDefinition cube_r168 = Chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(123, 20).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.673F, 0.1951F, -0.2613F));

		PartDefinition cube_r169 = Chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(123, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4845F, -6.7117F, 0.6875F, 0.1058F, -0.1645F));

		PartDefinition cube_r170 = Chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(121, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.5461F, 0.0027F, -0.1013F));

		PartDefinition cube_r171 = Chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(121, 92).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.5418F, 0.0781F, -0.2084F));

		PartDefinition cube_r172 = Chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(121, 90).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.4897F, 0.2725F, -0.5034F));

		PartDefinition cube_r173 = Chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-11.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -0.6117F, 0.2944F, 0.4775F, -1.0233F));

		PartDefinition Bodyfront_r1 = Chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(112, 109).mirror().addBox(3.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2142F, 11.079F, -5.3918F, -0.783F, 0.7737F, -1.3203F));

		PartDefinition Bodyfront_r2 = Chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(2.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 11.079F, -6.8918F, -0.4957F, 0.6358F, -0.3107F));

		PartDefinition Bodyfront_r3 = Chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(41, 99).mirror().addBox(0.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 11.079F, -6.8918F, -1.0123F, 1.1026F, -0.9599F));

		PartDefinition Bodyfront_r4 = Chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(101, 66).mirror().addBox(-1.879F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0141F, 10.979F, -6.8918F, -2.4733F, 1.0501F, -2.5798F));

		PartDefinition Bodyfront_r5 = Chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(96, 78).mirror().addBox(-6.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7856F, 10.5216F, -6.8658F, -0.1571F, 0.7618F, -0.1089F));

		PartDefinition cube_r174 = Chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(123, 98).addBox(3.8564F, -3.25F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.3567F, -0.7847F, 1.228F));

		PartDefinition cube_r175 = Chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(121, 80).addBox(2.9647F, -0.8864F, -0.7185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.7077F, -0.5103F, 0.6612F));

		PartDefinition cube_r176 = Chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(132, 86).addBox(0.0622F, 0.3202F, -0.6341F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.8207F, -0.1512F, 0.3219F));

		PartDefinition cube_r177 = Chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(121, 78).addBox(1.0936F, 0.1792F, -0.6439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0845F, -12.7117F, 0.8036F, -0.2523F, 0.4068F));

		PartDefinition cube_r178 = Chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(116, 26).addBox(4.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.3255F, -0.7187F, 1.2493F));

		PartDefinition cube_r179 = Chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(123, 76).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.646F, -0.4666F, 0.6902F));

		PartDefinition cube_r180 = Chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(121, 96).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.7379F, -0.2241F, 0.4223F));

		PartDefinition cube_r181 = Chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(59, 124).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7845F, -9.7117F, 0.7539F, -0.1287F, 0.3312F));

		PartDefinition cube_r182 = Chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(54, 100).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.2978F, -0.6523F, 1.0924F));

		PartDefinition cube_r183 = Chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(21, 123).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.587F, -0.4215F, 0.541F));

		PartDefinition cube_r184 = Chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(123, 20).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.673F, -0.1951F, 0.2613F));

		PartDefinition cube_r185 = Chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(123, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4845F, -6.7117F, 0.6875F, -0.1058F, 0.1645F));

		PartDefinition cube_r186 = Chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(121, 64).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.6597F, -0.1107F, 0.215F));

		PartDefinition cube_r187 = Chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(121, 66).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.5982F, -0.3367F, 0.4885F));

		PartDefinition cube_r188 = Chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(94, 87).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.3618F, -0.5846F, 1.0069F));

		PartDefinition cube_r189 = Chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(121, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8845F, -3.6117F, 0.6662F, -0.0231F, 0.1175F));

		PartDefinition cube_r190 = Chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(121, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.5505F, 0.0407F, 0.1014F));

		PartDefinition cube_r191 = Chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(121, 92).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.5508F, -0.0354F, 0.2079F));

		PartDefinition cube_r192 = Chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(121, 90).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.5113F, -0.2342F, 0.498F));

		PartDefinition cube_r193 = Chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(94, 89).addBox(4.0942F, -4.2155F, -0.6121F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -0.6117F, 0.3359F, -0.4544F, 1.0047F));

		PartDefinition cube_r194 = Chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(38, 112).addBox(0.0F, -4.7589F, -0.0861F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -10.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(112, 109).addBox(-5.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2142F, 11.079F, -5.3918F, -0.783F, -0.7737F, 1.3203F));

		PartDefinition Bodyfront_r7 = Chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(105, 24).addBox(-5.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.0141F, 11.079F, -6.8918F, -0.4957F, -0.6358F, 0.3107F));

		PartDefinition Bodyfront_r8 = Chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(41, 99).addBox(-4.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0141F, 11.079F, -6.8918F, -1.0123F, -1.1026F, 0.9599F));

		PartDefinition Bodyfront_r9 = Chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(88, 50).addBox(-5.5141F, -1.31F, -5.2127F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5141F, 11.079F, -6.8918F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(60, 94).addBox(-3.5141F, -1.0939F, -4.1474F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5141F, 11.079F, -6.8918F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(101, 66).addBox(-2.121F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0141F, 10.979F, -6.8918F, -2.4733F, -1.0501F, 2.5798F));

		PartDefinition Bodyfront_r12 = Chest.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 84).addBox(-4.2856F, -0.5226F, -0.1133F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2856F, 10.5216F, -6.8658F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Chest.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(96, 78).addBox(2.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7856F, 10.5216F, -6.8658F, -0.1571F, -0.7618F, 0.1089F));

		PartDefinition cube_r195 = Chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 70).addBox(-1.0F, -0.3F, -2.9F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -13.5F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r196 = Neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(5, 113).addBox(-1.0F, -4.4F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(41, 122).addBox(-1.0F, -4.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1047F, -4.9982F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Neck2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(131, 120).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.1117F, 0.5166F, 0.5463F, -0.4173F));

		PartDefinition cube_r199 = Neck2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(132, 11).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.4821F, 0.6098F, -0.4362F));

		PartDefinition cube_r200 = Neck2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(112, 114).mirror().addBox(-3.9679F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.3966F, 0.6738F, -0.5789F));

		PartDefinition cube_r201 = Neck2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(109, 16).mirror().addBox(-3.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.1117F, 0.4433F, 0.6148F, -0.5508F));

		PartDefinition cube_r202 = Neck2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(132, 11).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.4821F, -0.6098F, 0.4362F));

		PartDefinition cube_r203 = Neck2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(112, 114).addBox(0.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.3966F, -0.6738F, 0.5789F));

		PartDefinition cube_r204 = Neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(109, 16).addBox(0.9678F, -0.1151F, -0.4256F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.1117F, 0.4433F, -0.6148F, 0.5508F));

		PartDefinition cube_r205 = Neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(131, 120).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.1117F, 0.5166F, -0.5463F, 0.4173F));

		PartDefinition cube_r206 = Neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 93).addBox(-1.5F, -0.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1105F, -5.9049F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition cube_r207 = Neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(44, 123).addBox(-1.0F, -4.1F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -0.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(123, 34).addBox(-1.0F, -4.1F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(28, 123).addBox(-1.0F, -4.1F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(80, 122).addBox(-1.0F, -3.3F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6376F, -6.0393F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(123, 32).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2655F, -8.7117F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r212 = Neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(123, 30).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1655F, -6.7117F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r213 = Neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(123, 28).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1655F, -4.7117F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r214 = Neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2345F, -0.7117F, 0.3398F, 0.435F, -0.6122F));

		PartDefinition cube_r215 = Neck3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(123, 22).mirror().addBox(-1.9739F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0345F, -2.7117F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r216 = Neck3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(123, 32).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2655F, -8.7117F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r217 = Neck3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(123, 30).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1655F, -6.7117F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r218 = Neck3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(123, 28).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1655F, -4.7117F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r219 = Neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(123, 24).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2345F, -0.7117F, 0.3398F, -0.435F, 0.6122F));

		PartDefinition cube_r220 = Neck3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(123, 22).addBox(-0.0261F, 0.0119F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0345F, -2.7117F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r221 = Neck3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(58, 129).addBox(-1.0F, -2.9F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.791F, -8.234F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Neck3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(50, 70).addBox(-1.5F, -0.9F, -6.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -10.0F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r223 = Neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(130, 6).addBox(-1.0F, -3.7F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 129).addBox(-1.0F, -3.5F, -3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 129).addBox(-1.0F, -3.5F, -5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 129).addBox(-1.0F, -3.3F, -7.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 129).addBox(-1.0F, -3.2F, -9.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 82).addBox(-1.5F, -0.9F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r224 = Neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(123, 50).mirror().addBox(-1.6944F, 0.0285F, -0.6948F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4668F, -8.4866F, 0.3359F, 0.4103F, -0.6217F));

		PartDefinition cube_r225 = Neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 124).mirror().addBox(-1.5202F, -0.1557F, -0.6814F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0759F, -6.3124F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r226 = Neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(123, 42).mirror().addBox(-1.8657F, 0.0366F, -0.3839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1444F, -4.8007F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r227 = Neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(118, 16).mirror().addBox(-1.9532F, -0.0086F, -0.4178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0299F, -2.8083F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r228 = Neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(123, 40).mirror().addBox(-1.9358F, -0.0587F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2043F, -0.8159F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r229 = Neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(123, 50).addBox(-0.3056F, 0.0285F, -0.6948F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4668F, -8.4866F, 0.3359F, -0.4103F, 0.6217F));

		PartDefinition cube_r230 = Neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 124).addBox(-0.4798F, -0.1557F, -0.6814F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0759F, -6.3124F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r231 = Neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(123, 42).addBox(-0.1343F, 0.0366F, -0.3839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1444F, -4.8007F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r232 = Neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(118, 16).addBox(-0.0468F, -0.0086F, -0.4178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0299F, -2.8083F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r233 = Neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(123, 40).addBox(-0.0642F, -0.0587F, -0.357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2043F, -0.8159F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Neck5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(73, 129).addBox(-1.0F, -3.2F, -1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(130, 74).addBox(-1.0F, -2.9F, -3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 91).addBox(-1.5F, -1.0F, -6.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Neck5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(130, 70).addBox(-1.0F, -2.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.5954F, -5.6233F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Neck5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(123, 70).mirror().addBox(-1.6905F, -0.2752F, -0.1333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3459F, -5.7032F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r237 = Neck5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(123, 52).mirror().addBox(-1.7052F, -0.2551F, -0.1432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4157F, -3.7044F, 0.347F, 0.4761F, -0.5958F));

		PartDefinition cube_r238 = Neck5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(124, 54).mirror().addBox(-1.5186F, -0.3328F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.496F, -1.4058F, 0.347F, 0.4761F, -0.5958F));

		PartDefinition cube_r239 = Neck5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(123, 70).addBox(-0.3095F, -0.2752F, -0.1333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3459F, -5.7032F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r240 = Neck5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(123, 52).addBox(-0.2948F, -0.2551F, -0.1432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4157F, -3.7044F, 0.347F, -0.4761F, 0.5958F));

		PartDefinition cube_r241 = Neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(124, 54).addBox(-0.4814F, -0.3328F, -0.3529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.496F, -1.4058F, 0.347F, -0.4761F, 0.5958F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(27, 83).addBox(-0.5F, -0.7F, -8.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(92, 130).addBox(0.0F, -2.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 130).addBox(0.0F, -2.7F, -2.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 125).addBox(0.0F, -2.5F, -4.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 129).addBox(0.0F, -2.4F, -6.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 125).addBox(0.0F, -2.4F, -8.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r242 = Neck6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(101, 132).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0768F, -8.4466F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r243 = Neck6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-1.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0816F, -6.4441F, 0.3221F, 0.429F, -0.7133F));

		PartDefinition cube_r244 = Neck6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(123, 72).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0864F, -4.4416F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r245 = Neck6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, -0.0912F, -2.4391F, 0.3398F, 0.435F, -0.6122F));

		PartDefinition cube_r246 = Neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(124, 56).mirror().addBox(-1.1005F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4004F, 0.2812F, 0.3335F, 0.3938F, -0.6279F));

		PartDefinition cube_r247 = Neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 132).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0768F, -8.4466F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r248 = Neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(123, 74).addBox(-0.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0816F, -6.4441F, 0.3221F, -0.429F, 0.7133F));

		PartDefinition cube_r249 = Neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(123, 72).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0864F, -4.4416F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition cube_r250 = Neck6.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 125).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, -0.0912F, -2.4391F, 0.3398F, -0.435F, 0.6122F));

		PartDefinition cube_r251 = Neck6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(124, 56).addBox(-0.8995F, -0.5403F, -0.8236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4004F, 0.2812F, 0.3335F, -0.3938F, 0.6279F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5F, -0.5F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(18, 131).addBox(0.0F, -2.2F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 131).addBox(0.0F, -2.2F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 32).addBox(0.0F, -1.8F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r252 = Neck7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(106, 132).mirror().addBox(-0.7F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0755F, -7.6429F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r253 = Neck7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(17, 117).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.058F, -5.643F, 0.328F, 0.3526F, -0.6431F));

		PartDefinition cube_r254 = Neck7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(76, 118).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0406F, -3.6431F, 0.319F, 0.2698F, -0.6723F));

		PartDefinition cube_r255 = Neck7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(109, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4794F, 0.0231F, -1.6431F, 0.3231F, 0.3112F, -0.6579F));

		PartDefinition cube_r256 = Neck7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(106, 132).addBox(-0.3F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0755F, -7.6429F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r257 = Neck7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(17, 117).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.058F, -5.643F, 0.328F, -0.3526F, 0.6431F));

		PartDefinition cube_r258 = Neck7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(76, 118).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0406F, -3.6431F, 0.319F, -0.2698F, 0.6723F));

		PartDefinition cube_r259 = Neck7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(109, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4794F, 0.0231F, -1.6431F, 0.3231F, -0.3112F, 0.6579F));

		PartDefinition cube_r260 = Neck7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(47, 123).addBox(0.0F, -0.5F, -1.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -7.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1564F, -9.599F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-1.0688F, 0.1164F, 2.1653F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6585F, 1.0872F, -10.2866F, 0.2024F, -0.1283F, -0.0275F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(105, 93).addBox(0.0688F, 0.1164F, 2.1653F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6585F, 1.0872F, -10.2866F, 0.2024F, 0.1283F, 0.0275F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(116, 36).mirror().addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.2591F, -0.6488F, -0.2063F, -0.9162F, 0.0114F));

		PartDefinition cube_r264 = Head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(83, 124).mirror().addBox(-1.2F, -1.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4274F, 1.3437F, -0.4532F, 0.4863F, 0.5869F, 0.1679F));

		PartDefinition cube_r265 = Head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(95, 123).mirror().addBox(-0.3578F, -0.2F, -0.3922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9443F, -0.1296F, 0.0059F, 0.5934F, 0.0105F));

		PartDefinition cube_r266 = Head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(10, 130).mirror().addBox(-0.4174F, -0.7289F, -0.6958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, -1.2305F, -0.0448F, 0.5504F, 0.3343F, 0.8452F));

		PartDefinition cube_r267 = Head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(126, 111).mirror().addBox(-0.2202F, -0.8199F, -0.8935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -1.919F, -0.421F, 0.7972F, -0.0415F, 1.4194F));

		PartDefinition cube_r268 = Head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.1978F, -0.8004F, -0.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.55F, -1.7191F, -0.428F, 0.6338F, 0.1206F, 1.2604F));

		PartDefinition cube_r269 = Head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(129, 58).mirror().addBox(-0.1714F, -0.7781F, -0.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9443F, 0.2704F, 0.3279F, 0.3343F, 0.8452F));

		PartDefinition cube_r270 = Head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(116, 36).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.2591F, -0.6488F, -0.2063F, 0.9162F, -0.0114F));

		PartDefinition cube_r271 = Head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 60).addBox(-0.5F, -0.7989F, -3.7796F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.5F, 1.5511F, -6.9552F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(101, 54).addBox(-0.5F, -0.2339F, -3.8485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.0328F, -3.5979F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(80, 102).addBox(-0.5F, 0.7F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.9443F, -1.0296F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(72, 105).addBox(-1.0F, 0.0404F, -0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7492F, -4.0382F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(19, 128).addBox(-0.5F, 0.0349F, -1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0141F, -3.0284F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r276 = Head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(93, 127).addBox(0.0F, -0.0175F, -1.0002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -1.9792F, -2.029F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(127, 11).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.9443F, -1.0296F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(129, 58).addBox(-0.8286F, -0.7781F, -0.7371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.1F, -0.9443F, 0.2704F, 0.3279F, -0.3343F, -0.8452F));

		PartDefinition cube_r279 = Head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(126, 111).addBox(-0.7798F, -0.8199F, -0.8935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.15F, -1.919F, -0.421F, 0.7972F, 0.0415F, -1.4194F));

		PartDefinition cube_r280 = Head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(19, 125).addBox(-0.8022F, -0.8004F, -0.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.55F, -1.7191F, -0.428F, 0.6338F, -0.1206F, -1.2604F));

		PartDefinition cube_r281 = Head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 130).addBox(-0.5826F, -0.7289F, -0.6958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.55F, -1.2305F, -0.0448F, 0.5504F, -0.3343F, -0.8452F));

		PartDefinition cube_r282 = Head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(83, 124).addBox(0.2F, -1.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4274F, 1.3437F, -0.4532F, 0.4863F, -0.5869F, -0.1679F));

		PartDefinition cube_r283 = Head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(95, 123).addBox(-0.6422F, -0.2F, -0.3922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.9443F, -0.1296F, 0.0059F, -0.5934F, -0.0105F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1557F, -2.9796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r284 = forehead.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(118, 8).mirror().addBox(-0.2F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.1084F, -2.459F, 0.0535F, -0.0707F, -0.5367F));

		PartDefinition cube_r285 = forehead.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(62, 118).mirror().addBox(-0.7F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.1084F, -2.459F, 0.0556F, -0.2798F, -0.5483F));

		PartDefinition cube_r286 = forehead.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(69, 118).mirror().addBox(-0.625F, -0.35F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1017F, -3.5151F, -0.0615F, -0.0415F, -0.5921F));

		PartDefinition cube_r287 = forehead.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(31, 122).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5103F, -0.0188F, -4.9366F, -1.1542F, -0.1416F, 0.7225F));

		PartDefinition cube_r288 = forehead.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(83, 120).mirror().addBox(-0.3794F, -0.777F, -0.5107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.8656F, 0.0008F, -4.6963F, -0.9393F, -0.1029F, 0.8818F));

		PartDefinition cube_r289 = forehead.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(36, 122).mirror().addBox(-0.4719F, -0.8268F, -0.5222F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1656F, 0.1718F, -4.2264F, -0.757F, -0.2641F, 0.9247F));

		PartDefinition cube_r290 = forehead.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(124, 58).mirror().addBox(-0.4418F, -0.8586F, -0.3126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.4656F, 0.2744F, -3.9445F, -0.5967F, -0.2355F, 1.0714F));

		PartDefinition cube_r291 = forehead.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(87, 129).mirror().addBox(-0.5306F, -0.1441F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(128, 92).mirror().addBox(-0.5306F, 0.0559F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(24, 129).mirror().addBox(-0.5306F, -0.3441F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8585F, 0.5214F, -3.2642F, -0.5204F, -0.3028F, 1.0596F));

		PartDefinition cube_r292 = forehead.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(130, 14).mirror().addBox(-0.3463F, -0.4085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(130, 17).mirror().addBox(-0.3463F, -0.0085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(130, 29).mirror().addBox(-0.3463F, -0.2085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.1585F, 0.5642F, -2.8541F, -0.5029F, -0.3028F, 1.0596F));

		PartDefinition cube_r293 = forehead.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(130, 40).mirror().addBox(-0.3898F, -0.0936F, -0.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(130, 43).mirror().addBox(-0.3898F, -0.2936F, -0.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.2585F, 0.7352F, -2.3843F, -0.54F, -0.2498F, 1.1316F));

		PartDefinition cube_r294 = forehead.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(128, 122).mirror().addBox(-0.4693F, -0.2751F, -0.653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(32, 129).mirror().addBox(-0.4693F, -0.4751F, -0.653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.6585F, 0.9405F, -1.8204F, -0.4179F, -0.2498F, 1.1316F));

		PartDefinition cube_r295 = forehead.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(128, 89).mirror().addBox(-0.4343F, -0.0758F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(82, 128).mirror().addBox(-0.4343F, -0.2758F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.6585F, 0.8893F, -1.3762F, -0.2961F, -0.2902F, 1.0024F));

		PartDefinition cube_r296 = forehead.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(100, 125).mirror().addBox(-0.2565F, -0.2646F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(125, 47).mirror().addBox(-0.2565F, -0.4646F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(125, 105).mirror().addBox(-0.1065F, -0.2646F, -0.0387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(31, 126).mirror().addBox(-0.1065F, -0.4646F, -0.0387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(126, 34).mirror().addBox(0.0935F, -0.2646F, 0.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(36, 126).mirror().addBox(0.0935F, -0.4646F, 0.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.9585F, 0.9322F, -0.9661F, -0.1696F, -0.2902F, 1.0024F));

		PartDefinition cube_r297 = forehead.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(128, 62).mirror().addBox(-0.6115F, -0.3304F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(128, 65).mirror().addBox(-0.6115F, -0.1304F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.8585F, 1.2317F, 0.734F, -0.0125F, -0.2902F, 1.0024F));

		PartDefinition cube_r298 = forehead.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(103, 117).mirror().addBox(0.7655F, -0.5328F, -1.1829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1656F, 0.0008F, -4.6963F, -0.3521F, -0.6592F, 0.178F));

		PartDefinition cube_r299 = forehead.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5395F, -1.1386F, -0.631F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6585F, 0.9315F, -3.307F, -0.2252F, -0.3937F, 0.0751F));

		PartDefinition cube_r300 = forehead.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(103, 117).addBox(-1.7655F, -0.5328F, -1.1829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1656F, 0.0008F, -4.6963F, -0.3521F, 0.6592F, -0.178F));

		PartDefinition cube_r301 = forehead.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(128, 62).addBox(-0.3885F, -0.3304F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(128, 65).addBox(-0.3885F, -0.1304F, -0.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.8585F, 1.2317F, 0.734F, -0.0125F, 0.2902F, -1.0024F));

		PartDefinition cube_r302 = forehead.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(126, 34).addBox(-1.0935F, -0.2646F, 0.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(36, 126).addBox(-1.0935F, -0.4646F, 0.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(125, 105).addBox(-0.8935F, -0.2646F, -0.0387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 126).addBox(-0.8935F, -0.4646F, -0.0387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(125, 47).addBox(-0.7435F, -0.4646F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(100, 125).addBox(-0.7435F, -0.2646F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9585F, 0.9322F, -0.9661F, -0.1696F, 0.2902F, -1.0024F));

		PartDefinition cube_r303 = forehead.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(82, 128).addBox(-0.5657F, -0.2758F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(128, 89).addBox(-0.5657F, -0.0758F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6585F, 0.8893F, -1.3762F, -0.2961F, 0.2902F, -1.0024F));

		PartDefinition cube_r304 = forehead.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(32, 129).addBox(-0.5306F, -0.4751F, -0.653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(128, 122).addBox(-0.5306F, -0.2751F, -0.653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6585F, 0.9405F, -1.8204F, -0.4179F, 0.2498F, -1.1316F));

		PartDefinition cube_r305 = forehead.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(130, 43).addBox(-0.6102F, -0.2936F, -0.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(130, 40).addBox(-0.6102F, -0.0936F, -0.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2585F, 0.7352F, -2.3843F, -0.54F, 0.2498F, -1.1316F));

		PartDefinition cube_r306 = forehead.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(130, 14).addBox(-0.6537F, -0.4085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(130, 29).addBox(-0.6537F, -0.2085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(130, 17).addBox(-0.6537F, -0.0085F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.1585F, 0.5642F, -2.8541F, -0.5029F, 0.3028F, -1.0596F));

		PartDefinition cube_r307 = forehead.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(24, 129).addBox(-0.4694F, -0.3441F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 129).addBox(-0.4694F, -0.1441F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(128, 92).addBox(-0.4694F, 0.0559F, -0.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.8585F, 0.5214F, -3.2642F, -0.5204F, 0.3028F, -1.0596F));

		PartDefinition cube_r308 = forehead.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(124, 58).addBox(-0.5582F, -0.8586F, -0.3126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4656F, 0.2744F, -3.9445F, -0.5967F, 0.2355F, -1.0714F));

		PartDefinition cube_r309 = forehead.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(36, 122).addBox(-0.5281F, -0.8268F, -0.5222F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1656F, 0.1718F, -4.2264F, -0.757F, 0.2641F, -0.9247F));

		PartDefinition cube_r310 = forehead.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(31, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4897F, -0.0188F, -4.9366F, -1.1542F, 0.1416F, -0.7225F));

		PartDefinition cube_r311 = forehead.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 120).addBox(-0.6206F, -0.777F, -0.5107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1344F, 0.0008F, -4.6963F, -0.9393F, 0.1029F, -0.8818F));

		PartDefinition cube_r312 = forehead.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 106).addBox(-0.4605F, -1.1386F, -0.631F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6585F, 0.9315F, -3.307F, -0.2252F, 0.3937F, -0.0751F));

		PartDefinition cube_r313 = forehead.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(62, 118).addBox(-0.3F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.175F, 0.1084F, -2.459F, 0.0556F, 0.2798F, 0.5483F));

		PartDefinition cube_r314 = forehead.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(118, 8).addBox(-0.8F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.175F, 0.1084F, -2.459F, 0.0535F, 0.0707F, 0.5367F));

		PartDefinition cube_r315 = forehead.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(55, 118).addBox(-1.0F, -0.1061F, -0.2676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4746F, -3.219F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r316 = forehead.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(69, 118).addBox(-0.375F, -0.35F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.1017F, -3.5151F, -0.0615F, 0.0415F, 0.5921F));

		PartDefinition cube_r317 = forehead.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(118, 44).addBox(-1.0F, -0.2197F, -0.1966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4408F, -4.2955F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r318 = forehead.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(130, 46).addBox(-1.0F, -0.2292F, -0.1259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3641F, -4.9619F, 0.1004F, 0.0F, 0.0F));

		PartDefinition forehead2 = forehead.addOrReplaceChild("forehead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2476F, -1.2668F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r319 = forehead2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(114, 90).addBox(-0.7124F, -0.0239F, 0.0709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2876F, 0.9874F, -0.6189F, 0.2443F, 0.1571F, 0.0F));

		PartDefinition cube_r320 = forehead2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(128, 78).addBox(-0.7124F, 0.0821F, 1.9544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2876F, 0.9874F, -0.6189F, 0.2967F, 0.1571F, 0.0F));

		PartDefinition cube_r321 = forehead2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(116, 32).addBox(-0.5578F, -0.3523F, -0.8507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2859F, 1.6401F, 0.2027F, -0.3191F, 0.2964F, -0.8525F));

		PartDefinition cube_r322 = forehead2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(116, 4).addBox(-0.5578F, -0.65F, -0.7931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2859F, 1.6401F, 0.2027F, 0.0736F, 0.2964F, -0.8525F));

		PartDefinition cube_r323 = forehead2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(107, 19).addBox(-0.5635F, -1.1646F, -0.3312F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.0F, 2.2518F, 5.014F, -0.0338F, -0.0177F, -0.0094F));

		PartDefinition cube_r324 = forehead2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(107, 32).addBox(-0.6699F, -0.5732F, -0.2693F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 1.866F, 2.6452F, 0.0589F, 0.0462F, 0.0484F));

		PartDefinition cube_r325 = forehead2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 106).addBox(-0.5635F, -1.129F, -0.3656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.2518F, 5.014F, -0.1909F, -0.0177F, -0.0094F));

		PartDefinition cube_r326 = forehead2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(10, 113).addBox(-0.6434F, -0.2181F, -0.2594F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 0.8449F, 7.5734F, -0.2249F, -0.8066F, 0.0949F));

		PartDefinition cube_r327 = forehead2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(24, 106).addBox(-0.5635F, -1.6682F, -0.327F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 2.2518F, 5.014F, -0.0163F, -0.0177F, -0.0094F));

		PartDefinition cube_r328 = forehead2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(89, 105).addBox(-0.6369F, -1.1014F, -0.3768F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 1.866F, 2.6452F, 0.0722F, 0.0456F, -0.0505F));

		PartDefinition cube_r329 = forehead2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(126, 108).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5132F, 1.1829F, 1.8217F, -0.041F, 0.3942F, -0.7996F));

		PartDefinition cube_r330 = forehead2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(127, 86).addBox(-0.3463F, -0.556F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2859F, 1.6401F, 0.2027F, -0.406F, 0.2436F, -0.8458F));

		PartDefinition cube_r331 = forehead2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(105, 126).addBox(-0.8419F, -0.1716F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3124F, 0.8671F, 1.1393F, -0.2592F, 0.3942F, -0.7996F));

		PartDefinition cube_r332 = forehead2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(47, 127).addBox(-0.4201F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(77, 128).addBox(-0.5799F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7438F, 1.0847F, 1.8845F, -1.7383F, 0.3942F, -0.7996F));

		PartDefinition cube_r333 = forehead2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(128, 95).addBox(-0.5F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7309F, 1.1476F, 2.2474F, -0.7915F, 0.3942F, -0.7996F));

		PartDefinition cube_r334 = forehead2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(116, 28).addBox(-0.0902F, -0.5385F, -1.9405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3124F, 1.1243F, 2.7185F, 0.0026F, 0.3942F, -0.7996F));

		PartDefinition cube_r335 = forehead2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(116, 0).addBox(-0.0902F, 0.4615F, -1.9405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3124F, 1.1243F, 2.7185F, -0.0846F, 0.3942F, -0.7996F));

		PartDefinition cube_r336 = forehead2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(98, 128).addBox(0.5F, 0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(103, 129).addBox(0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.3F, 1.3138F, 3.0264F, 0.0866F, 0.1206F, -0.946F));

		PartDefinition forehead3 = forehead.addOrReplaceChild("forehead3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.2476F, -1.2668F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r337 = forehead3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(114, 90).mirror().addBox(-0.2876F, -0.0239F, 0.0709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.2876F, 0.9874F, -0.6189F, 0.2443F, -0.1571F, 0.0F));

		PartDefinition cube_r338 = forehead3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(128, 78).mirror().addBox(-0.2876F, 0.0821F, 1.9544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2876F, 0.9874F, -0.6189F, 0.2967F, -0.1571F, 0.0F));

		PartDefinition cube_r339 = forehead3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(116, 32).mirror().addBox(-0.4422F, -0.3523F, -0.8507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2859F, 1.6401F, 0.2027F, -0.3191F, -0.2964F, 0.8525F));

		PartDefinition cube_r340 = forehead3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(116, 4).mirror().addBox(-0.4422F, -0.65F, -0.7931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2859F, 1.6401F, 0.2027F, 0.0736F, -0.2964F, 0.8525F));

		PartDefinition cube_r341 = forehead3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(107, 19).mirror().addBox(-0.4364F, -1.1646F, -0.3312F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2518F, 5.014F, -0.0338F, 0.0177F, 0.0094F));

		PartDefinition cube_r342 = forehead3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(107, 32).mirror().addBox(-0.3301F, -0.5732F, -0.2693F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.866F, 2.6452F, 0.0589F, -0.0462F, -0.0484F));

		PartDefinition cube_r343 = forehead3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(98, 106).mirror().addBox(-0.4364F, -1.129F, -0.3656F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2518F, 5.014F, -0.1909F, 0.0177F, 0.0094F));

		PartDefinition cube_r344 = forehead3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.3566F, -0.2181F, -0.2594F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8449F, 7.5734F, -0.2249F, 0.8066F, -0.0949F));

		PartDefinition cube_r345 = forehead3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(24, 106).mirror().addBox(-0.4364F, -1.6682F, -0.327F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2518F, 5.014F, -0.0163F, 0.0177F, 0.0094F));

		PartDefinition cube_r346 = forehead3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 105).mirror().addBox(-0.3631F, -1.1014F, -0.3768F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.866F, 2.6452F, 0.0722F, -0.0456F, 0.0505F));

		PartDefinition cube_r347 = forehead3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(126, 108).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5132F, 1.1829F, 1.8217F, -0.041F, -0.3942F, 0.7996F));

		PartDefinition cube_r348 = forehead3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(127, 86).mirror().addBox(-0.6537F, -0.556F, -0.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2859F, 1.6401F, 0.2027F, -0.406F, -0.2436F, 0.8458F));

		PartDefinition cube_r349 = forehead3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(105, 126).mirror().addBox(-0.1581F, -0.1716F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3124F, 0.8671F, 1.1393F, -0.2592F, -0.3942F, 0.7996F));

		PartDefinition cube_r350 = forehead3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(47, 127).mirror().addBox(-0.5799F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(77, 128).mirror().addBox(-0.4201F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7438F, 1.0847F, 1.8845F, -1.7383F, -0.3942F, 0.7996F));

		PartDefinition cube_r351 = forehead3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-0.5F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7309F, 1.1476F, 2.2474F, -0.7915F, -0.3942F, 0.7996F));

		PartDefinition cube_r352 = forehead3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(116, 28).mirror().addBox(-0.9098F, -0.5385F, -1.9405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3124F, 1.1243F, 2.7185F, 0.0026F, -0.3942F, 0.7996F));

		PartDefinition cube_r353 = forehead3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(-0.9098F, 0.4615F, -1.9405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3124F, 1.1243F, 2.7185F, -0.0846F, -0.3942F, 0.7996F));

		PartDefinition cube_r354 = forehead3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 128).mirror().addBox(-1.5F, 0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(103, 129).mirror().addBox(-1.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.3138F, 3.0264F, 0.0866F, -0.1206F, 0.946F));

		PartDefinition cube_r355 = forehead3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(111, 86).mirror().addBox(-1.5F, 0.017F, 0.0006F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1882F, 2.182F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9709F, -0.2032F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-1.0477F, -0.6687F, -2.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.0053F, -0.3663F, -0.3917F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(126, 100).mirror().addBox(-0.525F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.479F, -0.945F, -5.2985F, 0.0466F, 0.0217F, -0.6079F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 126).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.4936F, -0.9659F, -5.8003F, 0.0466F, 0.0217F, -0.6079F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.4132F, -0.4981F, -0.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 126).mirror().addBox(-0.4132F, -0.6981F, -0.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.4339F, -0.8574F, -6.2929F, 0.1228F, -0.2247F, -0.7031F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(125, 126).mirror().addBox(-0.4577F, -0.4379F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(67, 126).mirror().addBox(-0.4577F, -0.6379F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.3089F, -0.9466F, -6.8005F, 0.1316F, -0.2197F, -0.743F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(120, 126).mirror().addBox(-0.4328F, -0.5235F, -0.5478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(62, 126).mirror().addBox(-0.4328F, -0.7235F, -0.5478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.1211F, -0.9036F, -7.3092F, 0.172F, -0.1899F, -0.9413F));

		PartDefinition cube_r362 = Jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(57, 126).mirror().addBox(-0.4066F, -0.7235F, -0.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(126, 119).mirror().addBox(-0.4066F, -0.5235F, -0.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-2.0071F, -0.9245F, -7.7897F, 0.2068F, -0.1856F, -1.0625F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(52, 126).mirror().addBox(-0.4283F, -0.7235F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(126, 116).mirror().addBox(-0.4283F, -0.5235F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8429F, -0.9665F, -8.2601F, 0.2001F, -0.284F, -0.8773F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(126, 37).mirror().addBox(-0.5424F, -0.8779F, -0.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(115, 126).mirror().addBox(-0.5424F, -0.6779F, -0.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.5146F, -0.9436F, -8.5917F, 0.1874F, -0.2924F, -0.8327F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-0.4044F, -0.7647F, -0.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(110, 126).mirror().addBox(-0.4044F, -0.5647F, -0.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.5146F, -1.005F, -9.2212F, 0.1539F, -0.3109F, -0.7201F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-0.4F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.2749F, -0.9856F, -9.7605F, 0.2152F, -0.4568F, -0.759F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(102, 121).mirror().addBox(-0.3852F, -1.0195F, -0.6723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9745F, -1.0334F, -10.2072F, 0.4856F, -0.6668F, -0.9785F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(86, 10).mirror().addBox(-0.425F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1603F, -1.2827F, -11.0133F, 0.917F, -0.5748F, -0.7399F));

		PartDefinition cube_r369 = Jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(121, 101).mirror().addBox(-0.525F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3745F, -1.2368F, -10.664F, 0.3794F, -0.7255F, -0.8132F));

		PartDefinition cube_r370 = Jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(114, 82).mirror().addBox(-0.487F, -0.8354F, -1.6008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -9.9F, -0.2427F, -0.7457F, 0.1954F));

		PartDefinition cube_r371 = Jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(114, 78).mirror().addBox(-0.487F, -0.7354F, -1.7258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -9.9F, -0.33F, -0.7457F, 0.1954F));

		PartDefinition cube_r372 = Jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-0.1387F, -0.9296F, -0.1439F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2586F, -8.5278F, -0.0696F, -0.2911F, 0.0583F));

		PartDefinition cube_r373 = Jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(107, 37).mirror().addBox(-0.1387F, -0.6346F, -0.2394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2586F, -8.5278F, -0.1918F, -0.2911F, 0.0583F));

		PartDefinition cube_r374 = Jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(112, 116).mirror().addBox(-0.1628F, -0.4332F, -1.8062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.7447F, -8.3827F, -0.0652F, -0.3608F, 0.0597F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(116, 22).mirror().addBox(-0.6702F, -0.2548F, -3.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.4F, -7.0F, -0.17F, -0.3608F, 0.0597F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(130, 3).mirror().addBox(-0.4096F, -0.3844F, -1.0766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.3659F, -0.027F, 0.0271F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(117, 54).mirror().addBox(-0.4096F, -0.0236F, -2.1291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(116, 40).mirror().addBox(-0.4096F, 0.5764F, -2.1291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(130, 0).mirror().addBox(-0.4096F, -0.5236F, -1.6291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.1913F, -0.027F, 0.0271F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(130, 23).mirror().addBox(-0.4096F, 0.0271F, -0.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 130).mirror().addBox(-0.4096F, 0.5271F, -0.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.8197F, -0.027F, 0.0271F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(116, 70).mirror().addBox(-0.4096F, 0.0967F, -3.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(114, 94).mirror().addBox(-0.4096F, 0.5466F, -3.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.1739F, -0.027F, 0.0271F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(81, 116).mirror().addBox(-0.4096F, 0.0102F, -5.2621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(114, 101).mirror().addBox(-0.4096F, 0.4102F, -5.3621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.1346F, -0.027F, 0.0271F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(116, 74).mirror().addBox(-0.4096F, -1.0823F, -5.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, 0.0355F, -0.027F, 0.0271F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(116, 50).mirror().addBox(-0.4096F, -0.7182F, -3.7742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.0692F, -0.027F, 0.0271F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-0.4096F, -0.6177F, -2.1998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.1215F, -0.027F, 0.0271F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(113, 129).mirror().addBox(-0.4096F, -0.3628F, -0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.1758F, -1.003F, -0.427F, -0.027F, 0.0271F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(108, 129).mirror().addBox(-0.6507F, 0.5609F, 0.4405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.1451F, -0.9822F, 0.6283F, 0.5411F, 0.0F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(114, 66).mirror().addBox(-0.6507F, -0.3559F, -0.4219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.1451F, -0.9822F, -0.3491F, 0.5411F, 0.0F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(116, 18).mirror().addBox(-0.6507F, 0.0451F, -0.4377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.1451F, -0.9822F, 0.0F, 0.5411F, 0.0F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(128, 81).addBox(0.0477F, -0.6687F, -2.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.0053F, 0.3663F, 0.3917F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(126, 100).addBox(-0.475F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.479F, -0.945F, -5.2985F, 0.0466F, -0.0217F, 0.6079F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(88, 126).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4936F, -0.9659F, -5.8003F, 0.0466F, -0.0217F, 0.6079F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 127).addBox(-0.5868F, -0.4981F, -0.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 126).addBox(-0.5868F, -0.6981F, -0.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4339F, -0.8574F, -6.2929F, 0.1228F, 0.2247F, 0.7031F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(125, 126).addBox(-0.5423F, -0.4379F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(67, 126).addBox(-0.5423F, -0.6379F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.3089F, -0.9466F, -6.8005F, 0.1316F, 0.2197F, 0.743F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(120, 126).addBox(-0.5672F, -0.5235F, -0.5478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(62, 126).addBox(-0.5672F, -0.7235F, -0.5478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.1211F, -0.9036F, -7.3092F, 0.172F, 0.1899F, 0.9413F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(57, 126).addBox(-0.5934F, -0.7235F, -0.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(126, 119).addBox(-0.5934F, -0.5235F, -0.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.0071F, -0.9245F, -7.7897F, 0.2068F, 0.1856F, 1.0625F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(52, 126).addBox(-0.5717F, -0.7235F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(126, 116).addBox(-0.5717F, -0.5235F, -0.5541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.8429F, -0.9665F, -8.2601F, 0.2001F, 0.284F, 0.8773F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(126, 37).addBox(-0.4576F, -0.8779F, -0.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(115, 126).addBox(-0.4576F, -0.6779F, -0.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.5146F, -0.9436F, -8.5917F, 0.1874F, 0.2924F, 0.8327F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(125, 44).addBox(-0.5956F, -0.7647F, -0.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(110, 126).addBox(-0.5956F, -0.5647F, -0.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.5146F, -1.005F, -9.2212F, 0.1539F, 0.3109F, 0.7201F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(49, 9).addBox(-0.6F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2749F, -0.9856F, -9.7605F, 0.2152F, 0.4568F, 0.759F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(102, 121).addBox(-0.6148F, -1.0195F, -0.6723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9745F, -1.0334F, -10.2072F, 0.4856F, 0.6668F, 0.9785F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(86, 10).addBox(-0.575F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1603F, -1.2827F, -11.0133F, 0.917F, 0.5748F, 0.7399F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(121, 101).addBox(-0.475F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3745F, -1.2368F, -10.664F, 0.3794F, 0.7255F, 0.8132F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(114, 82).addBox(-0.513F, -0.8354F, -1.6008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, -0.4F, -9.9F, -0.2427F, 0.7457F, -0.1954F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(114, 78).addBox(-0.513F, -0.7354F, -1.7258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.4F, -9.9F, -0.33F, 0.7457F, -0.1954F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(107, 42).addBox(-0.8613F, -0.9296F, -0.1439F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.9F, -0.2586F, -8.5278F, -0.0696F, 0.2911F, -0.0583F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(107, 37).addBox(-0.8613F, -0.6346F, -0.2394F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, -0.2586F, -8.5278F, -0.1918F, 0.2911F, -0.0583F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(112, 116).addBox(-0.8372F, -0.4332F, -1.8062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, -0.7447F, -8.3827F, -0.0652F, 0.3608F, -0.0597F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(116, 22).addBox(-0.3298F, -0.2548F, -3.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.9F, -0.4F, -7.0F, -0.17F, 0.3608F, -0.0597F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(130, 3).addBox(-0.5904F, -0.3844F, -1.0766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.3659F, 0.027F, -0.0271F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(117, 54).addBox(-0.5904F, -0.0236F, -2.1291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F))
				.texOffs(116, 40).addBox(-0.5904F, 0.5764F, -2.1291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(130, 0).addBox(-0.5904F, -0.5236F, -1.6291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.1913F, 0.027F, -0.0271F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(130, 23).addBox(-0.5904F, 0.0271F, -0.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 130).addBox(-0.5904F, 0.5271F, -0.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.8197F, 0.027F, -0.0271F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(116, 70).addBox(-0.5904F, 0.0967F, -3.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F))
				.texOffs(114, 94).addBox(-0.5904F, 0.5466F, -3.7113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.1739F, 0.027F, -0.0271F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(81, 116).addBox(-0.5904F, 0.0102F, -5.2621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F))
				.texOffs(114, 101).addBox(-0.5904F, 0.4102F, -5.3621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.1346F, 0.027F, -0.0271F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(116, 74).addBox(-0.5904F, -1.0823F, -5.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, 0.0355F, 0.027F, -0.0271F));

		PartDefinition cube_r414 = Jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(116, 50).addBox(-0.5904F, -0.7182F, -3.7742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.0692F, 0.027F, -0.0271F));

		PartDefinition cube_r415 = Jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 130).addBox(-0.5904F, -0.6177F, -2.1998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.1215F, 0.027F, -0.0271F));

		PartDefinition cube_r416 = Jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(113, 129).addBox(-0.5904F, -0.3628F, -0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.5F, -0.1758F, -1.003F, -0.427F, 0.027F, -0.0271F));

		PartDefinition cube_r417 = Jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(108, 129).addBox(-0.3493F, 0.5609F, 0.4405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.2F, -0.1451F, -0.9822F, 0.6283F, -0.5411F, 0.0F));

		PartDefinition cube_r418 = Jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(114, 66).addBox(-0.3493F, -0.3559F, -0.4219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.1451F, -0.9822F, -0.3491F, -0.5411F, 0.0F));

		PartDefinition cube_r419 = Jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(116, 18).addBox(-0.3493F, 0.0451F, -0.4377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2F, -0.1451F, -0.9822F, 0.0F, -0.5411F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7853F, 10.1441F, -8.6801F, -0.0143F, 0.194F, -0.7284F));

		PartDefinition cube_r420 = FrontFlipperR2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(119, 116).addBox(-2.0154F, -0.4899F, -0.0344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2577F, -0.1912F, -1.5936F, 0.0F, 0.0087F, 0.0F));

		PartDefinition cube_r421 = FrontFlipperR2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(107, 47).addBox(-2.0F, -0.5F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(3.2607F, -0.1811F, -1.7777F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r422 = FrontFlipperR2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0F, -0.5F, 0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.6215F, -0.1811F, 0.8991F, 3.1407F, 0.4363F, -3.1397F));

		PartDefinition cube_r423 = FrontFlipperR2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(74, 24).addBox(-19.1684F, 3.1028F, -2.5567F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8934F, -3.7839F, -18.3596F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r424 = FrontFlipperR2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(130, 20).addBox(-1.0272F, -0.4737F, -0.9964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2499F, -0.2075F, 0.2735F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r425 = FrontFlipperR2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(116, 98).addBox(-1.9527F, -0.4181F, -0.947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2474F, -0.263F, -0.8021F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r426 = FrontFlipperR2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(9, 109).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1426F, -0.1811F, 0.2569F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r427 = FrontFlipperR2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(96, 70).addBox(-5.6567F, 3.1028F, 15.9684F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4723F, -3.7839F, -17.8396F, 0.0F, 0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(105, 28).addBox(1.1884F, -0.3972F, -3.1294F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(125, 8).addBox(3.1884F, -0.3972F, 1.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 117).addBox(-0.2116F, -0.3972F, -2.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5701F, -0.2839F, -0.74F, -0.0113F, 0.0421F, -0.262F));

		PartDefinition cube_r428 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(10, 118).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, 0.1028F, 0.6706F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r429 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(105, 0).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0884F, 0.1028F, 0.1706F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r430 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(49, 27).addBox(-0.7519F, 3.9313F, -2.1709F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.56F, -3.8161F, -1.5147F, -0.0013F, 0.0697F, -0.0037F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.1695F, 0.0507F, -1.8509F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition cube_r431 = FrontFlipperEndR2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 13).addBox(12.2938F, 3.9479F, -3.4778F, 21.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.7185F, -3.8668F, 2.0712F, -0.0018F, 0.0697F, -0.0035F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7853F, 10.1441F, -8.6801F, -0.0618F, -0.1153F, 0.6451F));

		PartDefinition cube_r432 = FrontFlipperR3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(119, 119).addBox(0.0154F, -0.4899F, -0.0344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2577F, -0.1912F, -1.5936F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r433 = FrontFlipperR3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(107, 106).addBox(-2.0F, -0.5F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-3.2607F, -0.1811F, -1.7777F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r434 = FrontFlipperR3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(120, 12).addBox(-1.0F, -0.5F, 0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.6215F, -0.1811F, 0.8991F, 3.1407F, -0.4363F, 3.1397F));

		PartDefinition cube_r435 = FrontFlipperR3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(105, 98).addBox(15.1684F, 3.1028F, -2.5567F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.8934F, -3.7839F, -18.3596F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r436 = FrontFlipperR3.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(130, 26).addBox(0.0272F, -0.4737F, -0.9964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2499F, -0.2075F, 0.2735F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r437 = FrontFlipperR3.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(119, 109).addBox(-0.0473F, -0.4181F, -0.947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2474F, -0.263F, -0.8021F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r438 = FrontFlipperR3.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(109, 10).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1426F, -0.1811F, 0.2569F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r439 = FrontFlipperR3.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(96, 74).addBox(0.6567F, 3.1028F, 15.9684F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4723F, -3.7839F, -17.8396F, 0.0F, -0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(105, 50).addBox(-4.1884F, -0.3972F, -3.1294F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(125, 15).addBox(-4.1884F, -0.3972F, 1.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 58).addBox(-0.7884F, -0.3972F, -2.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5701F, -0.2839F, -0.74F, -0.0131F, -0.0416F, 0.3057F));

		PartDefinition cube_r440 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(88, 118).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7884F, 0.1028F, 0.6706F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r441 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(105, 4).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0884F, 0.1028F, 0.1706F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r442 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(55, 16).addBox(-10.2481F, 3.9313F, -2.1709F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.56F, -3.8161F, -1.5147F, -0.0013F, -0.0697F, 0.0037F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.1695F, 0.0507F, -1.8509F, -0.0172F, 0.1298F, -0.132F));

		PartDefinition cube_r443 = FrontFlipperEndR3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 20).addBox(-33.2938F, 3.9479F, -3.4778F, 21.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.7185F, -3.8668F, 2.0712F, -0.0018F, -0.0697F, 0.0035F));

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