package fossils.fossils.client.blockentity.model.dsungaripterus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DsungaripterusFossilModel extends SkullModelBase {
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

	public DsungaripterusFossilModel(ModelPart root) {
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

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -12.1808F, 3.5991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body5_r1 = main.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.9754F, -0.945F, -2.1958F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.4258F, -0.1752F, 0.0789F));

		PartDefinition body6_r1 = main.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(19, 47).mirror().addBox(-1.0369F, -1.5364F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(19, 47).addBox(1.7631F, -1.5364F, -0.606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.8116F, 0.0F, 0.0F));

		PartDefinition body7_r1 = main.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-1.0369F, -0.9031F, -0.2985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(31, 54).addBox(1.7631F, -0.9031F, -0.2985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.3229F, 0.0F, 0.0F));

		PartDefinition body6_r2 = main.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(14, 42).mirror().addBox(-0.6369F, -0.945F, -0.8318F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(14, 42).addBox(0.3631F, -0.945F, -0.8318F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body5_r2 = main.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.7458F, -1.0354F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.9279F, -0.0954F, -0.6485F));

		PartDefinition body6_r3 = main.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.7458F, -1.2168F, -0.5375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -1.1722F, -0.0954F, -0.6485F));

		PartDefinition body4_r1 = main.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(-0.5946F, 0.4459F, -0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3631F, 0.6459F, -0.1737F, -0.801F, 0.0299F, -0.5268F));

		PartDefinition body4_r2 = main.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(0, 35).addBox(-0.0246F, -0.945F, -2.1958F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.4258F, 0.1752F, -0.0789F));

		PartDefinition chest5_r1 = main.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(63, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.238F, -0.5945F, -0.1562F, 0.2324F, 0.7545F));

		PartDefinition chest6_r1 = main.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(61, 28).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.238F, -0.5945F, 0.0084F, 0.2791F, 1.3848F));

		PartDefinition chest6_r2 = main.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(63, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.238F, -0.5945F, -0.1562F, -0.2324F, -0.7545F));

		PartDefinition chest7_r1 = main.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.238F, -0.5945F, 0.0084F, -0.2791F, -1.3848F));

		PartDefinition body4_r3 = main.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(0, 58).addBox(-0.2542F, -1.0354F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.9279F, 0.0954F, 0.6485F));

		PartDefinition body5_r3 = main.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(45, 0).addBox(-0.2542F, -1.2168F, -0.5375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -1.1722F, 0.0954F, 0.6485F));

		PartDefinition body3_r1 = main.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(55, 57).addBox(-0.4054F, 0.4459F, -0.1318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3631F, 0.6459F, -0.1737F, -0.801F, -0.0299F, 0.5268F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 45).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.5918F, -1.0584F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(15, 22).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6612F, 1.3135F, 0.2698F, 1.0865F, 0.0F, -0.3927F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0F, -0.4F, 0.2897F, 0.1207F, -0.0244F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(28, 28).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4924F, 6.2871F, 0.0886F, 0.8297F, 0.0151F, 0.0859F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(14, 50).addBox(-0.6F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6612F, 1.3135F, 0.2698F, 0.9992F, 0.0F, 0.3927F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.4F, 0.5099F, -0.1003F, -0.083F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4924F, 6.2871F, 0.0886F, 1.0915F, -0.0151F, -0.0859F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.4663F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2418F, 0.6533F, -0.2793F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 20).addBox(-0.5F, -1.4464F, -5.5554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.1284F, -0.3503F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 33).addBox(-1.5F, -1.1F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1127F, -0.3414F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest7_r2 = body.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(48, 57).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -4.0442F, 0.1285F, 0.1588F, -1.3224F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(31, 38).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6191F, -3.5035F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(40, 14).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.6191F, -5.0035F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -4.0442F, 0.196F, 0.057F, -0.7162F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(5, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -2.2442F, 0.0356F, -0.0779F, -0.6971F));

		PartDefinition chest6_r4 = body.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9664F, -2.2442F, 0.0738F, -0.0434F, -1.3081F));

		PartDefinition chest6_r5 = body.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(48, 57).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -4.0442F, 0.1285F, -0.1588F, 1.3224F));

		PartDefinition chest3_r1 = body.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(31, 38).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6191F, -3.5035F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r2 = body.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(40, 14).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.6191F, -5.0035F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest2_r1 = body.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(15, 28).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1562F, -4.5323F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = body.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(63, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -4.0442F, 0.196F, -0.057F, 0.7162F));

		PartDefinition chest4_r3 = body.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(5, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -2.2442F, 0.0356F, 0.0779F, 0.6971F));

		PartDefinition chest5_r5 = body.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(56, 42).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9664F, -2.2442F, 0.0738F, 0.0434F, 1.3081F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 10).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.444F, -2.5504F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftWing = body.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 0.85F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 24).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0453F, 0.0848F, -4.1926F, 0.2982F, 0.3645F, -1.649F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(21, 33).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(11, 33).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2187F, 4.7548F, -0.0313F, -0.5382F, -0.2544F, -0.1714F));

		PartDefinition cube_r4 = leftWing2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 56).addBox(-0.5F, -2.6F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 6.3F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(30, 43).addBox(-1.0F, 0.0F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4908F, 6.8928F, -1.1621F, 0.2109F, -0.0858F, 0.2149F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4272F, 4.3229F, 0.0392F, 0.1771F, -0.1095F, 1.6343F));

		PartDefinition cube_r5 = hand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 19).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 1.4082F, 0.1073F, -1.7205F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -0.3783F, -0.264F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1684F, 4.5935F, 0.7899F, -1.4813F, 0.3182F, 0.1957F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create().texOffs(21, 20).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0554F, 0.575F, 7.5798F, -0.04F, -0.3441F, -0.027F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0243F, 0.0142F, 6.0192F, 0.1749F, -0.2523F, -0.0731F));

		PartDefinition rightWing = body.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, 0.85F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 9).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0453F, 0.0848F, -4.1926F, 0.2193F, -0.3191F, 1.6411F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(26, 33).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(16, 33).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2187F, 4.7548F, -0.0313F, -0.3657F, 0.2039F, 0.281F));

		PartDefinition cube_r6 = rightWing2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 25).addBox(-0.5F, -2.6F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 6.3F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(35, 43).addBox(0.0F, 0.0F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4908F, 6.8928F, -1.1621F, 0.2574F, 0.0642F, -0.1769F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(40, 45).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0772F, 4.3229F, 0.0392F, 1.6711F, -0.0938F, -0.0301F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(21, 10).addBox(0.0F, -0.3238F, -0.2067F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1038F, 4.6131F, 0.9041F, -1.4941F, 0.017F, -0.2175F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1506F, 0.6924F, 7.6102F, 0.0315F, 0.2676F, -0.1082F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0243F, 0.0142F, 6.0192F, 0.1723F, 0.2101F, 0.0616F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1406F, -5.2628F, 0.1761F, 0.2579F, 0.0453F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 40).addBox(-0.5F, -0.9206F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.35F, -2.7F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -1.0663F, -2.8988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9684F, -3.9939F, -0.3703F, 0.4518F, -0.1679F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2529F, -2.7561F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.75F, -3.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4246F, -3.4906F, 0.2706F, 0.2527F, 0.0692F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 22).addBox(-1.0F, -0.3422F, -1.1656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F))
				.texOffs(63, 6).addBox(-1.0F, -0.3216F, -0.7656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.0F, 0.4793F, -5.8155F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 8).addBox(-1.0F, -0.2742F, -1.6824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.0F, -0.1207F, -5.1155F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.1389F, -5.7084F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-0.5F, -0.3902F, -1.8957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.9016F, -3.0923F, -0.0785F, -0.1222F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-0.5F, -0.4459F, -1.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.9016F, -3.0923F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 61).mirror().addBox(-0.5F, -0.5781F, -0.7074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.9016F, -3.0923F, 0.1484F, -0.1222F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 19).mirror().addBox(-0.0474F, -0.5418F, -0.851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.013F, 0.3546F, -4.2845F, -0.0865F, 0.0253F, 0.1517F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(0.0F, -1.0076F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, -0.1392F, -0.0964F, 0.1623F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 62).mirror().addBox(0.0F, -0.7789F, -1.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, -0.1741F, -0.0964F, 0.1623F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(0.0F, -1.2495F, -2.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, 0.0877F, -0.0964F, 0.1623F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-0.22F, 0.438F, -1.1815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, -1.6053F, -0.0964F, 0.1623F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 57).mirror().addBox(-0.22F, 2.2095F, -1.4407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, -1.5093F, -0.0964F, 0.1623F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 62).mirror().addBox(0.0F, -0.9078F, -3.7832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, -0.0345F, -0.0964F, 0.1623F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 35).mirror().addBox(-0.22F, -2.5366F, -3.3222F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, 0.3844F, -0.0964F, 0.1623F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-0.22F, -2.3453F, -1.2676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 54).mirror().addBox(-0.22F, -1.7781F, -2.2676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7793F, -0.5155F, 0.14F, -0.0964F, 0.1623F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-0.4F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(31, 58).addBox(1.24F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.42F, -0.1982F, -0.2999F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.49F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(62, 53).mirror().addBox(-0.65F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 62).mirror().addBox(-0.75F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)).mirror(false)
				.texOffs(46, 62).addBox(0.89F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 62).addBox(1.15F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F))
				.texOffs(62, 53).addBox(1.05F, 1.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -3.4207F, -0.1155F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 61).addBox(-0.5F, -0.5781F, -0.7074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.9016F, -3.0923F, 0.1484F, 0.1222F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 47).addBox(-0.5F, -0.4459F, -1.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.9016F, -3.0923F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.0539F, -5.1061F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(61, 44).addBox(-0.5F, -0.3902F, -1.8957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.9016F, -3.0923F, -0.0785F, 0.1222F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 50).addBox(-1.0F, -0.7103F, -0.2679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 1.0793F, -5.8155F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(61, 25).addBox(-1.0F, -0.6888F, -1.068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(24, 61).addBox(-1.0F, -0.6888F, -0.668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.0793F, -7.7155F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 54).addBox(-1.0F, -0.6765F, -1.6679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.0793F, -6.3155F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 50).addBox(-1.0F, -0.7103F, -0.7679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 1.0793F, -5.8155F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 56).addBox(-0.5F, -0.4892F, -0.3088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -1.4921F, -2.1671F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, -0.7245F, -0.2881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.2612F, -3.7534F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(23, 42).addBox(-0.5F, -1.716F, -0.3497F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.7612F, -5.0534F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5F, -0.6303F, -0.8811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.5F, -0.1612F, -5.0534F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 55).addBox(-0.5F, -0.0757F, -1.1939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.1612F, -5.0534F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 44).addBox(-0.5F, -0.3265F, -0.8974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -0.1612F, -5.0534F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 53).addBox(-0.5F, -0.0588F, -0.962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.5F, -0.1612F, -5.0534F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -0.49F, -1.3641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, -0.1612F, -5.0534F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 19).addBox(-0.9526F, -0.5418F, -0.851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.013F, 0.3546F, -4.2845F, -0.0865F, -0.0253F, -0.1517F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(15, 62).addBox(-1.0F, -0.9078F, -3.7832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, -0.0345F, 0.0964F, -0.1623F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 59).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6793F, -2.3155F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 16).addBox(-1.0F, -1.2495F, -2.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, 0.0877F, 0.0964F, -0.1623F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 30).addBox(-0.5F, -0.2F, -2.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.213F, -2.4483F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 30).addBox(-0.5F, -0.8086F, -0.7445F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.467F, 0.5908F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 36).addBox(-0.5F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.767F, 0.0908F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.8706F, 0.4361F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 39).addBox(-0.5F, -0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4914F, -0.8705F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 12).addBox(-1.0F, -2.0F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.2533F, 0.3318F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 42).addBox(-1.0F, -1.0708F, -0.0314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7337F, -0.6146F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 48).addBox(-1.0F, -1.0076F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, -0.1392F, 0.0964F, -0.1623F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 51).addBox(-0.5F, 0.0225F, -0.9993F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(57, 52).addBox(0.0F, 0.0225F, -1.9993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.9136F, -0.5462F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 57).addBox(-0.78F, 2.2095F, -1.4407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, -1.5093F, 0.0964F, -0.1623F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 56).addBox(-0.78F, 0.438F, -1.1815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, -1.6053F, 0.0964F, -0.1623F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(41, 61).addBox(-0.78F, -2.3453F, -1.2676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 54).addBox(-0.78F, -1.7781F, -2.2676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, 0.14F, 0.0964F, -0.1623F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 35).addBox(-0.78F, -2.5366F, -3.3222F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, 0.3844F, 0.0964F, -0.1623F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(29, 62).addBox(-1.0F, -0.7789F, -1.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 0.7793F, -0.5155F, -0.1741F, 0.0964F, -0.1623F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.776F, -0.8298F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 46).addBox(-0.5F, -0.337F, -0.3099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -0.8F, -6.3F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 5).addBox(-0.5F, -0.337F, -0.3099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5F, -0.8F, -6.3F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 36).addBox(-0.5F, -0.645F, -1.6798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.4F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-0.4743F, -0.4898F, -4.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(60, 56).mirror().addBox(-0.4743F, -0.4898F, -3.5222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(36, 60).mirror().addBox(-0.4743F, -0.4898F, -4.1222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(7, 50).mirror().addBox(-0.4743F, -0.2898F, -4.1222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(52, 0).mirror().addBox(-0.4743F, -0.0382F, -4.2222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.3F, -0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.1311F, -0.401F, -2.7593F, -0.0616F, -0.1223F, 0.0032F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(60, 59).mirror().addBox(-0.4826F, -0.394F, -0.4017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.2242F, -0.4521F, -3.6577F, 0.0606F, -0.1223F, 0.0032F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(-0.4063F, -0.1666F, -0.7487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(39, 25).mirror().addBox(-0.4063F, -0.1666F, -2.9487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.3F, -0.0611F, -0.1571F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.4063F, -0.5783F, -2.3705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.3F, -0.0087F, -0.1571F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(47, 49).mirror().addBox(-1.7F, -0.3251F, -0.5801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.2F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-0.4743F, -0.6F, -3.6924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.3F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(50, 53).addBox(0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.2286F, -0.7064F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 28).mirror().addBox(-0.4063F, -0.467F, -1.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.3F, -0.1658F, -0.1571F, 0.0F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-1.7F, -0.4F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.1F, -0.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 32).addBox(-0.5257F, -0.6F, -3.6924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.1F, -1.3F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(10, 61).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.8689F, -0.401F, -2.7593F, -0.0616F, 0.1223F, -0.0032F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 59).addBox(-0.5174F, -0.394F, -0.4017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.7758F, -0.4521F, -3.6577F, 0.0606F, 0.1223F, -0.0032F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(60, 56).addBox(-0.5257F, -0.4898F, -3.5222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(59, 3).addBox(-0.5257F, -0.4898F, -4.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(36, 60).addBox(-0.5257F, -0.4898F, -4.1222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(7, 50).addBox(-0.5257F, -0.2898F, -4.1222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F))
				.texOffs(52, 0).addBox(-0.5257F, -0.0382F, -4.2222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.2F, -0.1F, -1.3F, -0.1134F, 0.1745F, 0.0F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 59).addBox(-0.5937F, -0.1666F, -0.7487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(39, 25).addBox(-0.5937F, -0.1666F, -2.9487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.1F, -1.3F, -0.0611F, 0.1571F, 0.0F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5937F, -0.5783F, -2.3705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.2F, -0.1F, -1.3F, -0.0087F, 0.1571F, 0.0F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 28).addBox(-0.5937F, -0.467F, -1.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.2F, -0.1F, -1.3F, -0.1658F, 0.1571F, 0.0F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(47, 49).addBox(0.7F, -0.3251F, -0.5801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 21).addBox(0.7F, -0.4F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.9F, -0.2269F, 0.0F, 0.0F));

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