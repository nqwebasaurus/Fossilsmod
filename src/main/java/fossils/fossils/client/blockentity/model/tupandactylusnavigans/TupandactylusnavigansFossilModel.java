package fossils.fossils.client.blockentity.model.tupandactylusnavigans;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupandactylusnavigansFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart jaw5;
	private final ModelPart shape64;
	private final ModelPart jaw4;
	private final ModelPart underneck3;
	private final ModelPart gums1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart lips1;
	private final ModelPart lips2;
	private final ModelPart head4;
	private final ModelPart crest1;
	private final ModelPart crest2;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4membrance;
	private final ModelPart leftwing3membrance;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;

	public TupandactylusnavigansFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.body1 = this.chest1.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.jaw5 = this.jaw3.getChild("jaw5");
		this.shape64 = this.jaw5.getChild("shape64");
		this.jaw4 = this.jaw2.getChild("jaw4");
		this.underneck3 = this.jaw.getChild("underneck3");
		this.gums1 = this.jaw.getChild("gums1");
		this.head2 = this.head.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.lips1 = this.head3.getChild("lips1");
		this.lips2 = this.head3.getChild("lips2");
		this.head4 = this.head2.getChild("head4");
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.25F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.425F, -0.9694F, -0.2728F, -0.0355F, -0.126F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.6334F, -0.4061F, 0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.5037F, -2.9469F, 1.4822F, 0.5761F, -0.0103F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-0.9074F, -0.181F, 2.6195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6963F, -3.1469F, 0.0357F, 0.2474F, 0.0746F));

		PartDefinition chest6_r2 = chest1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 1.7123F, 0.1826F, 0.0458F, -0.6994F));

		PartDefinition chest7_r1 = chest1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 1.7123F, 0.1239F, 0.142F, -1.3057F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(0.5174F, -0.0211F, -0.6544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.3037F, -1.5469F, 2.2444F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(33, 52).mirror().addBox(-0.9074F, 0.1775F, -0.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6963F, -3.1469F, 0.1579F, 0.2474F, 0.0746F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest6_r3 = chest1.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest5_r5 = chest1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(66, 9).addBox(-0.3666F, -0.4061F, 0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 1.5037F, -2.9469F, 1.4822F, -0.5761F, 0.0103F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(57, 9).addBox(-1.5174F, -0.0211F, -0.6544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 3.3037F, -1.5469F, 2.2444F, -0.6105F, 0.2383F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(56, 49).addBox(-0.0926F, -0.181F, 2.6195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.6963F, -3.1469F, 0.0357F, -0.2474F, -0.0746F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(33, 52).addBox(-0.0926F, 0.1775F, -0.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.6963F, -3.1469F, 0.1579F, -0.2474F, -0.0746F));

		PartDefinition chest6_r4 = chest1.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(66, 27).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.7123F, 0.1239F, -0.142F, 1.3057F));

		PartDefinition chest5_r6 = chest1.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(73, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.7123F, 0.1826F, -0.0458F, 0.6994F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(72, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r6 = chest1.addOrReplaceChild("chest4_r6", CubeListBuilder.create().texOffs(52, 20).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(72, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(28, 44).addBox(-1.5F, 1.8311F, -0.3217F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r7 = chest1.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(66, 25).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(28, 35).addBox(0.0F, -0.3924F, 1.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 55).addBox(-0.5F, 0.0076F, 0.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.1F, 0.0F, 0.0F, 0.0F));

		PartDefinition chest3_r4 = chest1.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(42, 52).addBox(0.0F, -0.7123F, 2.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 52).addBox(0.0F, -0.7123F, 0.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 22).addBox(-0.5F, -0.3123F, -0.3148F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 2.9F, -0.0407F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(10, 49).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6232F, 5.3849F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(10, 46).addBox(0.0F, -0.5F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 55).addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7488F, 1.7871F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.3482F, -0.4755F, -0.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5397F, 1.9304F, 3.5211F, -1.3277F, 0.1083F, -0.5174F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.4288F, -0.2595F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5397F, 2.0304F, 2.3211F, -1.1183F, 0.1083F, -0.5174F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(66, 13).addBox(2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.531F, 5.5265F, -1.9809F, 0.0F, 0.0F));

		PartDefinition body8_r1 = body1.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 64).addBox(2.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 0.2372F, 4.7401F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body7_r2 = body1.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(0.5958F, -0.1553F, -1.027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.0093F, 5.1447F, -1.501F, 0.0F, -0.6545F));

		PartDefinition chest6_r5 = body1.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-0.9869F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4924F, 3.1994F, 0.2031F, 0.0116F, -0.9814F));

		PartDefinition chest7_r2 = body1.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5987F, 0.796F, 0.2228F, 0.0794F, -0.6969F));

		PartDefinition chest8_r1 = body1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5987F, 0.796F, 0.1379F, 0.1925F, -1.3033F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(58, 63).mirror().addBox(-0.5F, -0.8145F, 0.2098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.2093F, 4.9447F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body7_r3 = body1.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.5F, -0.2913F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 63).addBox(2.3F, -0.2913F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.3831F, 3.5879F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(66, 33).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(66, 33).addBox(2.3F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.8061F, 5.6461F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-1.0F, -0.2F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 42).addBox(0.0F, -0.2F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.372F, 4.7976F, -0.192F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-0.3604F, -0.3644F, -2.7508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.3234F, 3.571F, -0.1094F, -0.1854F, 0.0503F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(72, 49).addBox(-0.5712F, -0.2595F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5397F, 2.0304F, 2.3211F, -1.1183F, -0.1083F, 0.5174F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(30, 70).addBox(-0.6518F, -0.4755F, -0.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5397F, 1.9304F, 3.5211F, -1.3277F, -0.1083F, 0.5174F));

		PartDefinition body6_r4 = body1.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(10, 62).addBox(-1.5958F, -0.1553F, -1.027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6F, 2.0093F, 5.1447F, -1.501F, 0.0F, 0.6545F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(58, 63).addBox(-0.5F, -0.8145F, 0.2098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.2093F, 4.9447F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(56, 54).addBox(-0.6396F, -0.3644F, -2.7508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -0.3234F, 3.571F, -0.1094F, 0.1854F, -0.0503F));

		PartDefinition chest5_r8 = body1.addOrReplaceChild("chest5_r8", CubeListBuilder.create().texOffs(73, 12).addBox(-0.0131F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4924F, 3.1994F, 0.2031F, -0.0116F, 0.9814F));

		PartDefinition chest7_r3 = body1.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(66, 44).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5987F, 0.796F, 0.1379F, -0.1925F, 1.3033F));

		PartDefinition chest6_r6 = body1.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(73, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5987F, 0.796F, 0.2228F, -0.0794F, 0.6969F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(62, 5).addBox(-0.5F, -1.0604F, 0.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3512F, 5.6871F, -0.2208F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(57, 0).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.5665F, 4.3625F, 1.0142F, -0.1502F, -1.3956F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.31F, 7.0094F, 0.2905F, 0.4685F, 0.2917F, 0.1681F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(18, 45).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 45).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(28, 38).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, 10.3798F, 0.6075F, 1.1865F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(5, 57).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.5665F, 4.3625F, 0.9928F, 0.2975F, 1.2995F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.31F, 7.0094F, 0.2905F, 0.4685F, -0.2917F, -0.1681F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(0, 46).addBox(0.15F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 45).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, 10.3798F, 0.6075F, 1.2301F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, -0.1575F, -0.1157F, 0.1067F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(43, 69).addBox(0.0F, -1.2F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 64).addBox(0.0F, -1.2F, -2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 32).addBox(-0.5F, -0.9F, -3.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8445F, -0.5832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(46, 34).addBox(-0.5F, -0.4178F, -3.9187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(28, 32).addBox(0.0F, -0.7178F, -2.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 55).addBox(0.0F, -0.7178F, -0.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -3.9832F, -0.1305F, 0.0406F, 0.0254F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0178F, -3.8187F, -0.129F, -0.3002F, -0.2163F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(35, 70).addBox(0.0F, -0.6F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 24).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.1519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2335F, -3.4161F, 0.8814F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(72, 52).addBox(0.92F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.71F, -0.3262F, 0.3578F, -1.1519F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(-0.5F, -0.8053F, -0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 72).addBox(0.92F, -0.8053F, -0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.71F, -0.8262F, 0.4578F, -1.9373F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(72, 67).mirror().addBox(-0.51F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 55).mirror().addBox(-0.35F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 67).addBox(1.25F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 55).addBox(1.09F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.87F, 0.0271F, 0.725F, -0.7941F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 71).addBox(0.92F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.71F, 0.3184F, 0.2774F, -0.192F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(5, 72).addBox(0.92F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.71F, 0.131F, 0.4766F, -0.6894F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.4461F, 1.0845F, -0.8901F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.82F, 0.4461F, 1.0845F, -0.8901F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(57, 14).addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4412F, 2.8191F, 0.2531F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(10, 67).addBox(-1.0F, -1.0393F, 0.0117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 2.9134F, 1.1257F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(17, 67).addBox(-1.5F, -1.6273F, -0.0047F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(66, 41).addBox(-1.5F, -0.9273F, -0.0047F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.3138F, 2.2134F, 0.8988F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(66, 17).addBox(-1.5F, -2.1388F, -0.9322F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.5138F, 2.3134F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(10, 58).addBox(-1.5F, -1.2683F, -2.2364F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9138F, 1.6134F, 0.4974F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(57, 29).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2955F, 0.5649F, -1.5882F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(31, 66).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.0F, -1.6825F, -0.9527F, -0.3665F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(66, 29).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2199F)), PartPose.offsetAndRotation(0.0F, -1.6825F, -0.9527F, -0.5934F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(66, 37).addBox(-0.5F, -0.3053F, -1.8099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7825F, -0.7527F, -0.1396F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6535F, -0.0432F, 0.4712F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(57, 34).addBox(-1.5F, -0.7809F, -1.4428F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.6971F, -4.0606F, -0.4363F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(33, 57).addBox(-1.5F, -0.5046F, -1.9321F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, -0.4971F, -2.3606F, -0.2793F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(57, 38).addBox(-1.5F, -0.2834F, -1.7395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3882F, -0.9809F, -0.2443F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(60, 59).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.1403F, -0.4696F, -0.5411F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(46, 28).addBox(-0.5F, -1.9269F, -8.5293F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.1772F, -0.2629F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw5_r2 = jaw5.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.1798F, -0.2724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -2.0819F, -2.1653F, 0.3142F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -4.1F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw9_r1 = jaw4.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, -0.2445F, -0.809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -0.43F, -2.6413F, 2.5307F, 0.0F, 0.0F));

		PartDefinition jaw9_r2 = jaw4.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(52, 68).addBox(-0.5F, -0.1703F, -1.0717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 68).addBox(-0.5F, -0.1703F, -0.7717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.03F, -2.1413F, 2.81F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw4.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(38, 69).addBox(-0.5F, -0.2191F, -0.7999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.832F, -3.0408F, 2.3038F, 0.0F, 0.0F));

		PartDefinition jaw7_r1 = jaw4.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(33, 61).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -1.932F, -2.8408F, 2.1642F, 0.0F, 0.0F));

		PartDefinition jaw7_r2 = jaw4.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -1.7614F, -1.8253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.1049F, -0.7906F, -0.3491F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw4.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(69, 4).addBox(-0.5F, -1.7563F, -0.1545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.1951F, -1.3906F, 0.4712F, 0.0F, 0.0F));

		PartDefinition jaw5_r3 = jaw4.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, -1.7949F, -0.8773F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -1.5626F, -0.3172F, 0.8901F, 0.0F, 0.0F));

		PartDefinition jaw5_r4 = jaw4.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(72, 46).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 62).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.1109F, -1.7581F, 1.6755F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5772F, -3.4629F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, -1.6629F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -2.6969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head2.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(15, 39).addBox(-1.0F, -0.7932F, -3.7226F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 2.3F, 0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head6_r5 = head5.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(46, 40).addBox(-0.5F, -1.0505F, -3.9518F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6315F, 1.1444F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head7_r4 = head4.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(66, 21).addBox(-0.5F, -0.0115F, 0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1896F, -5.0886F, 0.6283F, 0.0F, 0.0F));

		PartDefinition head7_r5 = head4.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(57, 19).addBox(-0.5F, 1.0364F, 1.1138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F))
				.texOffs(65, 51).addBox(-0.5F, 0.1364F, -0.0862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.021F)), PartPose.offsetAndRotation(0.0F, 2.3896F, -6.2886F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head6_r6 = head4.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(19, 58).addBox(-1.0F, -0.7706F, -1.6901F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.0226F, 1.1536F, -0.096F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head4.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(24, 67).addBox(-1.0F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.7225F, 1.3443F, -0.3316F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head4.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(25, 70).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2477F, -3.4164F, -0.8203F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.2568F, 7.7531F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest4_r1 = crest1.addOrReplaceChild("crest4_r1", CubeListBuilder.create().texOffs(70, 63).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.1692F, -10.8737F, -1.946F, 0.0F, 0.0F));

		PartDefinition crest8_r1 = crest1.addOrReplaceChild("crest8_r1", CubeListBuilder.create().texOffs(67, 69).addBox(-0.5F, -0.2839F, -0.4074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 5.218F, -9.3255F, -1.8762F, 0.0F, 0.0F));

		PartDefinition crest7_r1 = crest1.addOrReplaceChild("crest7_r1", CubeListBuilder.create().texOffs(15, 70).addBox(-0.5F, -0.1863F, -0.429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 5.218F, -9.2255F, -1.3177F, 0.0F, 0.0F));

		PartDefinition crest6_r1 = crest1.addOrReplaceChild("crest6_r1", CubeListBuilder.create().texOffs(65, 46).addBox(-0.5F, 20.5308F, -4.5587F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.028F)), PartPose.offsetAndRotation(0.0F, 1.8896F, 9.7614F, -1.2479F, 0.0F, 0.0F));

		PartDefinition crest6_r2 = crest1.addOrReplaceChild("crest6_r2", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5F, -11.8209F, -0.3636F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, -1.6917F, -13.3011F, 0.3403F, 0.0F, 0.0F));

		PartDefinition crest6_r3 = crest1.addOrReplaceChild("crest6_r3", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, -0.2518F, -0.4248F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.8917F, -13.3011F, 0.3229F, 0.0F, 0.0F));

		PartDefinition crest6_r4 = crest1.addOrReplaceChild("crest6_r4", CubeListBuilder.create().texOffs(43, 72).addBox(-0.5F, -0.3878F, -0.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(59, 46).addBox(-0.5F, 0.0122F, -0.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.9083F, -12.1011F, 1.0908F, 0.0F, 0.0F));

		PartDefinition crest4_r2 = crest1.addOrReplaceChild("crest4_r2", CubeListBuilder.create().texOffs(65, 63).addBox(-0.5F, -2.0449F, 0.0657F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 3.3083F, -12.3011F, 0.0785F, 0.0F, 0.0F));

		PartDefinition crest3_r1 = crest1.addOrReplaceChild("crest3_r1", CubeListBuilder.create().texOffs(62, 69).addBox(-0.5F, -1.9529F, -0.0288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.3701F, -13.0247F, -0.4974F, 0.0F, 0.0F));

		PartDefinition crest2_r1 = crest1.addOrReplaceChild("crest2_r1", CubeListBuilder.create().texOffs(69, 59).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.0F, 5.5522F, -12.9114F, -0.3752F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.5F, -1.1F, -0.3078F, -0.4988F, -0.2341F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(46, 46).addBox(-0.25F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 70).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4709F, 0.2106F, -0.2119F, -1.486F, 0.8768F, -2.761F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(51, 49).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 10).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-0.3631F, 0.9633F, -3.2225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(5, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7436F, 7.6223F, -0.3825F, 0.0391F, 0.2376F, 0.286F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1051F, 9.0992F, 0.6788F, 1.7203F, -0.6132F, -3.0972F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1256F, 0.4829F, 13.3508F, 0.1461F, 0.0632F, 0.1958F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(51, 59).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, 1.2451F, 1.4993F, -2.6545F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.5F, -1.1F, -0.3078F, 0.4988F, 0.2341F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(28, 49).addBox(-4.75F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 70).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4709F, 0.2106F, -0.2119F, -1.9655F, -1.0358F, -3.1168F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 52).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(0, 65).addBox(-0.6369F, 0.9633F, -3.2225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(46, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7436F, 7.6223F, -0.3825F, 0.0179F, -0.2401F, -0.1963F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 16).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1051F, 9.0992F, 0.6788F, 1.7203F, 0.6132F, 3.0972F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(31, 30).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1256F, 0.4829F, 13.3508F, 0.1461F, -0.0632F, -0.1958F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(31, 11).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(42, 60).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, 1.2451F, -1.4993F, 2.6545F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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