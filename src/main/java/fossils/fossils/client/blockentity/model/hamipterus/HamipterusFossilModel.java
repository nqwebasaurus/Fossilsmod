package fossils.fossils.client.blockentity.model.hamipterus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HamipterusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public HamipterusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.tail = this.main.getChild("tail");
		this.body = this.main.getChild("body");
		this.leftWing = this.body.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.body.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -11.9755F, 4.5829F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body4_r1 = main.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5946F, 0.4459F, -0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.801F, 0.0299F, -0.5268F));

		PartDefinition body6_r1 = main.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(34, 49).mirror().addBox(-0.7458F, -1.2168F, -0.5375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -1.1722F, -0.0954F, -0.6485F));

		PartDefinition body5_r1 = main.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(58, 56).mirror().addBox(-0.7458F, -1.0354F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.9279F, -0.0954F, -0.6485F));

		PartDefinition body6_r2 = main.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.6369F, -0.945F, -0.8318F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 46).addBox(0.3631F, -0.945F, -0.8318F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body7_r1 = main.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-1.0369F, -0.9031F, -0.2985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 57).addBox(1.7631F, -0.9031F, -0.2985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.3229F, 0.0F, 0.0F));

		PartDefinition body6_r3 = main.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-1.0369F, -1.5364F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(52, 0).addBox(1.7631F, -1.5364F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.8116F, 0.0F, 0.0F));

		PartDefinition body5_r2 = main.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.9754F, -0.945F, -2.1958F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.4258F, -0.1752F, 0.0789F));

		PartDefinition body4_r2 = main.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(19, 39).addBox(-0.0246F, -0.945F, -2.1958F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.4258F, 0.1752F, -0.0789F));

		PartDefinition body4_r3 = main.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(58, 56).addBox(-0.2542F, -1.0354F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.9279F, 0.0954F, 0.6485F));

		PartDefinition body5_r3 = main.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(34, 49).addBox(-0.2542F, -1.2168F, -0.5375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -1.1722F, 0.0954F, 0.6485F));

		PartDefinition body3_r1 = main.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(59, 0).addBox(-0.4054F, 0.4459F, -0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.801F, -0.0299F, 0.5268F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.5918F, -1.0584F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(46, 55).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6612F, 1.3135F, 0.2698F, 0.0829F, 0.0F, -0.3927F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(19, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0F, -0.4F, 0.4217F, -0.1125F, 0.2359F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(11, 34).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4924F, 6.2871F, 0.0886F, -0.1719F, 0.0302F, 0.1719F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 56).addBox(-0.6F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6612F, 1.3135F, 0.2698F, 0.432F, 0.0F, 0.3927F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(24, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.4F, 0.4653F, 0.1125F, -0.2359F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4924F, 6.2871F, 0.0886F, -0.2611F, -0.0151F, -0.0859F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, -0.4663F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2418F, 0.6533F, -0.2793F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0011F, -1.1647F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 15).addBox(-1.5F, -1.1F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1127F, -0.3414F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.6191F, -5.0035F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6191F, -3.5035F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(53, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -4.0442F, 0.196F, 0.057F, -0.7162F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -4.0442F, 0.1285F, 0.1588F, -1.3224F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3664F, -0.2442F, -0.1562F, -0.2324F, -0.7545F));

		PartDefinition chest7_r2 = body.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3664F, -0.2442F, 0.0084F, -0.2791F, -1.3848F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(44, 28).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -2.2442F, 0.0738F, -0.0434F, -1.3081F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(30, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -2.2442F, 0.0356F, -0.0779F, -0.6971F));

		PartDefinition chest6_r4 = body.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(48, 63).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3664F, -0.2442F, 0.0084F, 0.2791F, 1.3848F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(63, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3664F, -0.2442F, -0.1562F, 0.2324F, 0.7545F));

		PartDefinition chest6_r5 = body.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(56, 48).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -4.0442F, 0.1285F, -0.1588F, 1.3224F));

		PartDefinition chest3_r1 = body.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(44, 23).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6191F, -3.5035F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r2 = body.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(46, 36).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.6191F, -5.0035F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest2_r1 = body.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1562F, -4.5323F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = body.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(53, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -4.0442F, 0.196F, -0.057F, 0.7162F));

		PartDefinition chest4_r3 = body.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(30, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -2.2442F, 0.0356F, 0.0779F, 0.6971F));

		PartDefinition chest5_r5 = body.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(44, 28).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -2.2442F, 0.0738F, 0.0434F, 1.3081F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.444F, -2.5504F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 32).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.55F, -4.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftWing = body.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(41, 55).addBox(-0.5F, 0.85F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 54).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0453F, 0.0848F, -4.1926F, 0.6339F, 0.291F, -0.3159F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(9, 39).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 0).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2187F, 4.7548F, -0.0313F, -1.3568F, -0.0087F, 0.3943F));

		PartDefinition cube_r5 = leftWing2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 12).addBox(-0.5F, -2.6F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 6.3F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, 0.0F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4908F, 6.8928F, -1.1621F, 0.5211F, 0.0445F, -0.0123F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(50, 15).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4272F, 4.3229F, 0.0392F, 0.0147F, -0.4282F, 2.5392F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1038F, 5.1131F, 1.4041F, 0.8222F, 0.0595F, 0.0639F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0554F, -0.0467F, 7.8438F, 0.2095F, -0.0795F, -0.0228F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0243F, 0.0142F, 6.0192F, 0.2539F, -0.0413F, -0.0169F));

		PartDefinition rightWing = body.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(55, 50).addBox(-0.5F, 0.85F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 36).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0453F, 0.0848F, -4.1926F, 1.1139F, -0.291F, 0.3159F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(14, 39).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 9).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2187F, 4.7548F, -0.0313F, -1.3568F, 0.0087F, -0.3943F));

		PartDefinition cube_r6 = rightWing2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, -2.6F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 6.3F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(29, 49).addBox(0.0F, 0.0F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4908F, 6.8928F, -1.1621F, 0.5211F, -0.0445F, 0.0123F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(41, 50).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4272F, 4.3229F, 0.0392F, 0.1763F, -0.0623F, -1.6649F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1038F, 5.1131F, 1.4041F, 0.9948F, 0.0F, 0.0F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create().texOffs(15, 20).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.0467F, 7.8438F, 0.2095F, 0.0795F, 0.0228F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(19, 10).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0243F, 0.0142F, 6.0192F, 0.2539F, 0.0413F, 0.0169F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0135F, -4.4967F, -0.6305F, 0.1393F, 0.1976F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 40).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, -1.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2064F, -1.7843F, -0.3509F, 0.0452F, -0.0025F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 41).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2529F, -2.7561F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.75F, -3.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 31).addBox(0.0F, -0.7F, -5.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6649F, -3.3188F, 0.4966F, -0.1724F, -0.4331F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 28).addBox(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.0F, -0.3725F, -11.4838F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(13, 28).addBox(-1.0F, -1.0F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 0.7F, -8.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 57).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -0.8715F, -7.2516F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.5017F, -8.3886F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 61).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.5F, -1.7069F, -8.9524F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 42).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.6244F, -9.4556F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 13).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -1.6105F, -9.0559F, -1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 45).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.5F, -1.7279F, -9.5521F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 12).addBox(-0.5F, -0.6276F, -0.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -1.1615F, -9.9635F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 48).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -0.4486F, -9.0863F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-0.2F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2125F, 0.0634F, -11.2421F, -0.268F, 0.1066F, 0.3696F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 61).mirror().addBox(-0.337F, -0.3721F, -0.4028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 17).mirror().addBox(-0.3554F, -0.4041F, 0.4025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 62).mirror().addBox(-0.3824F, -0.4507F, 1.3065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2125F, 0.2338F, -10.6668F, -0.1287F, 0.074F, 0.5188F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-0.4507F, -0.414F, -0.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2898F, 0.5838F, -8.0954F, -0.0851F, 0.074F, 0.5188F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 36).mirror().addBox(-0.5762F, -0.4307F, 0.3962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2898F, 0.6619F, -7.0934F, -0.0153F, 0.074F, 0.5188F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(-0.7196F, -0.305F, -0.5547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 63).mirror().addBox(-0.7346F, -0.2696F, 0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2898F, 0.6205F, -5.1939F, 0.0544F, 0.0043F, 0.515F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-0.42F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 62).mirror().addBox(-0.42F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(62, 10).addBox(0.42F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 62).addBox(0.42F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.6123F, -4.2108F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-0.42F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(58, 32).addBox(0.42F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.4613F, -3.8075F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 24).mirror().addBox(-0.42F, 0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(53, 20).mirror().addBox(-0.42F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(53, 24).addBox(0.42F, 0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(53, 20).addBox(0.42F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.9176F, -2.6402F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-0.42F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 58).addBox(0.42F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1824F, -2.1841F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-0.6F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 28).addBox(1.04F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.22F, -0.2001F, -0.3304F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(-0.42F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(63, 32).addBox(1.02F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3F, -1.0064F, -1.9031F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(63, 26).mirror().addBox(-0.42F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(63, 39).addBox(1.02F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 26).addBox(1.02F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3F, 0.1014F, -1.8268F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(-0.42F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(60, 23).mirror().addBox(-0.22F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 20).mirror().addBox(-0.44F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 60).mirror().addBox(-0.55F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 60).addBox(1.02F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(60, 23).addBox(0.82F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(22, 60).addBox(1.15F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 20).addBox(1.04F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.8F, -1.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-0.42F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 29).addBox(1.02F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.4521F, -2.1327F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 63).addBox(-0.2654F, -0.2696F, 0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 63).addBox(-0.2804F, -0.305F, -0.5547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7102F, 0.6205F, -5.1939F, 0.0544F, -0.0043F, -0.515F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 36).addBox(-0.4238F, -0.4307F, 0.3962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 62).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7102F, 0.6619F, -7.0934F, -0.0153F, -0.074F, -0.5188F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 16).addBox(-0.5493F, -0.414F, -0.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7102F, 0.5838F, -8.0954F, -0.0851F, -0.074F, -0.5188F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 62).addBox(-0.6176F, -0.4507F, 1.3065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 17).addBox(-0.6446F, -0.4041F, 0.4025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 61).addBox(-0.663F, -0.3721F, -0.4028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7875F, 0.2338F, -10.6668F, -0.1287F, -0.074F, -0.5188F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 60).addBox(-0.8F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7875F, 0.0634F, -11.2421F, -0.268F, -0.1066F, -0.3696F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(43, 5).addBox(-1.0F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.0F, -0.6517F, -5.7358F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(37, 39).addBox(-1.0F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.5F, -8.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 39).mirror().addBox(-0.7F, -0.9F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(28, 39).addBox(-0.3F, -0.9F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, 0.0F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.3923F, -2.8328F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(12, 53).addBox(-0.5F, -0.1F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.9464F, -0.2938F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(5, 53).addBox(-0.5F, -0.2F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.9464F, -0.2938F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6707F, -1.255F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 53).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.074F, -0.0527F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 44).addBox(-1.0F, -1.4F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.2456F, -0.6991F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(29, 44).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.3929F, -2.8307F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 44).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(43, 0).addBox(0.2F, -0.4F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 0).mirror().addBox(-0.2F, -0.4F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7985F, -1.6826F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 28).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -0.1359F, -7.9731F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(35, 26).addBox(-0.5F, -1.2F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.9F, -7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3034F)), PartPose.offsetAndRotation(0.5F, 0.6273F, -5.856F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(33, 34).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5F, 0.2476F, -8.1245F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.2968F, -0.6551F, -0.2034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 7).mirror().addBox(-0.2911F, -0.5129F, 0.6853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 4).mirror().addBox(-0.2873F, -0.4013F, 1.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-0.2342F, -0.347F, 2.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 60).mirror().addBox(-0.4271F, -0.354F, 5.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.3565F, -9.6283F, 0.0228F, -0.0783F, -0.4843F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-0.5269F, -0.535F, -1.0006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 60).mirror().addBox(-0.4731F, -0.465F, 0.0006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2837F, -0.2346F, -5.428F, 0.0228F, -0.0434F, -0.4836F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.0F, -0.7F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 33).addBox(0.0F, -0.7F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.3162F, -0.897F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 20).mirror().addBox(-1.0F, -0.3F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(30, 20).addBox(0.0F, -0.3F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -0.2F, -0.9F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-1.7F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.1F, -0.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(27, 60).addBox(-0.5729F, -0.354F, 5.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 62).addBox(-0.7658F, -0.347F, 2.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(59, 4).addBox(-0.7127F, -0.4013F, 1.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(59, 7).addBox(-0.7089F, -0.5129F, 0.6853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 61).addBox(-0.7032F, -0.6551F, -0.2034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, -0.3565F, -9.6283F, 0.0228F, 0.0783F, 0.4843F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 60).addBox(-0.5269F, -0.465F, 0.0006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 50).addBox(-0.4731F, -0.535F, -1.0006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7163F, -0.2346F, -5.428F, 0.0228F, 0.0434F, 0.4836F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(43, 10).addBox(-1.0F, -0.7F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.4F, -4.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 56).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, 0.1251F, -1.1055F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 56).addBox(0.7F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.9F, -0.2269F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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