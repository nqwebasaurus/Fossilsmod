package fossils.fossils.client.blockentity.model.tupandactylusimperator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupandactylusimperatorFossilModel extends SkullModelBase {
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

	public TupandactylusimperatorFossilModel(ModelPart root) {
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

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.425F, -0.9694F, -0.7466F, 0.4681F, 0.4803F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(38, 45).mirror().addBox(0.5174F, -0.0211F, -0.6544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.3037F, -1.5469F, 2.2444F, 0.6105F, -0.2383F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-0.6334F, -0.4061F, 0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.5037F, -2.9469F, 1.4822F, 0.5761F, -0.0103F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(12, 33).mirror().addBox(-0.9074F, 0.1775F, -0.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6963F, -3.1469F, 0.1579F, 0.2474F, 0.0746F));

		PartDefinition chest7_r1 = chest1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 1.7123F, 0.1239F, 0.142F, -1.3057F));

		PartDefinition chest6_r2 = chest1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(41, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, 1.7123F, 0.1826F, 0.0458F, -0.6994F));

		PartDefinition chest6_r3 = chest1.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(32, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-0.9074F, -0.181F, 2.6195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6963F, -3.1469F, 0.0357F, 0.2474F, 0.0746F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(28, 3).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest5_r5 = chest1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(63, 22).addBox(-0.3666F, -0.4061F, 0.0149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 1.5037F, -2.9469F, 1.4822F, -0.5761F, 0.0103F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(38, 45).addBox(-1.5174F, -0.0211F, -0.6544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 3.3037F, -1.5469F, 2.2444F, -0.6105F, 0.2383F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(39, 19).addBox(-0.0926F, -0.181F, 2.6195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.6963F, -3.1469F, 0.0357F, -0.2474F, -0.0746F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(12, 33).addBox(-0.0926F, 0.1775F, -0.0121F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -0.6963F, -3.1469F, 0.1579F, -0.2474F, -0.0746F));

		PartDefinition chest6_r4 = chest1.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(47, 28).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.7123F, 0.1239F, -0.142F, 1.3057F));

		PartDefinition chest5_r6 = chest1.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(41, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.7123F, 0.1826F, -0.0458F, 0.6994F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r6 = chest1.addOrReplaceChild("chest4_r6", CubeListBuilder.create().texOffs(28, 3).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(18, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, 1.8311F, -0.3217F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r7 = chest1.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(63, 38).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(18, 9).addBox(0.0F, -0.3924F, 1.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 64).addBox(-0.5F, 0.0076F, 0.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.1F, 0.0F, 0.0F, 0.0F));

		PartDefinition chest3_r4 = chest1.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(12, 33).addBox(0.0F, -0.7123F, 2.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 28).addBox(0.0F, -0.7123F, 0.6852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 41).addBox(-0.5F, -0.3123F, -0.3148F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 4.9F, -0.2163F, -0.1298F, 0.0168F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(45, 19).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.368F, 3.4013F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(38, 45).addBox(0.0F, -0.5F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 45).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4937F, -0.1965F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(-0.4288F, -0.2595F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5397F, 2.2856F, 0.3375F, -1.1183F, 0.1083F, -0.5174F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-0.3482F, -0.4755F, -0.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5397F, 2.1856F, 1.5375F, -1.3277F, 0.1083F, -0.5174F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(0.5958F, -0.1553F, -1.027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.2644F, 3.1611F, -1.501F, 0.0F, -0.6545F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-0.5F, -0.8145F, 0.2098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.4644F, 2.9611F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body7_r2 = body1.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(61, 11).addBox(2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.2758F, 3.5428F, -1.9809F, 0.0F, 0.0F));

		PartDefinition body8_r1 = body1.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 45).addBox(2.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 0.4923F, 2.7564F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(65, 30).addBox(2.3F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.551F, 3.6624F, -0.4102F, 0.0F, 0.0F));

		PartDefinition body7_r3 = body1.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(13, 61).mirror().addBox(-0.5F, -0.2913F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(13, 61).addBox(2.3F, -0.2913F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.1279F, 1.6043F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, -0.2F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 47).addBox(0.0F, -0.2F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.1169F, 2.814F, -0.192F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-0.3604F, -0.3644F, -2.7508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0683F, 1.5873F, -0.1094F, -0.1854F, 0.0503F));

		PartDefinition chest6_r5 = body1.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.9869F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2372F, 1.2158F, 0.2031F, 0.0116F, -0.9814F));

		PartDefinition chest8_r1 = body1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(31, 30).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, -1.1877F, 0.1379F, 0.1925F, -1.3033F));

		PartDefinition chest7_r2 = body1.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, -1.1877F, 0.2228F, 0.0794F, -0.6969F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5712F, -0.2595F, -0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5397F, 2.2856F, 0.3375F, -1.1183F, -0.1083F, 0.5174F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(9, 46).addBox(-0.6518F, -0.4755F, -0.4833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5397F, 2.1856F, 1.5375F, -1.3277F, -0.1083F, 0.5174F));

		PartDefinition body6_r4 = body1.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(44, 10).addBox(-1.5958F, -0.1553F, -1.027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6F, 2.2644F, 3.1611F, -1.501F, 0.0F, 0.6545F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(42, 62).addBox(-0.5F, -0.8145F, 0.2098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.4644F, 2.9611F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(41, 28).addBox(-0.6396F, -0.3644F, -2.7508F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -0.0683F, 1.5873F, -0.1094F, 0.1854F, -0.0503F));

		PartDefinition chest5_r8 = body1.addOrReplaceChild("chest5_r8", CubeListBuilder.create().texOffs(55, 0).addBox(-0.0131F, -0.0493F, -0.8967F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2372F, 1.2158F, 0.2031F, -0.0116F, 0.9814F));

		PartDefinition chest7_r3 = body1.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(31, 30).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, -1.1877F, 0.1379F, -0.1925F, 1.3033F));

		PartDefinition chest6_r6 = body1.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(24, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, -1.1877F, 0.2228F, -0.0794F, 0.6969F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(36, 3).addBox(-0.5F, -1.0604F, 0.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6063F, 3.7035F, -0.2241F, -0.1703F, 0.0386F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(30, 59).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.8217F, 2.3788F, 0.7524F, -0.1502F, -1.3956F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.31F, 7.0094F, 0.2905F, 0.7303F, 0.2917F, 0.1681F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 52).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, 10.3798F, 0.6075F, 1.4046F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(25, 59).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.8217F, 2.3788F, 0.6215F, 0.1502F, 1.3956F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.31F, 7.0094F, 0.2905F, 0.8175F, -0.2917F, -0.1681F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(20, 46).addBox(0.15F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 10).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, 10.3798F, 0.6075F, 1.4046F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, 0.1053F, -0.0136F, -0.0862F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -1.2F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 50).addBox(0.0F, -1.2F, -2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 10).addBox(-0.5F, -0.9F, -3.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8445F, -0.5832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(25, 53).addBox(-0.5F, -0.4178F, -3.9187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(0, 10).addBox(0.0F, -0.7178F, -2.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 53).addBox(0.0F, -0.7178F, -0.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -3.9832F, 0.1239F, 0.3054F, -0.082F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0178F, -3.8187F, -0.0343F, 0.3421F, -0.071F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(67, 44).addBox(0.0F, -0.6F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 36).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.1519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -2.5043F, 2.0418F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2335F, -3.4161F, 0.8739F, -0.1344F, 0.1117F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(18, 0).mirror().addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.32F, 0.2782F, 0.8997F, -0.8465F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-0.66F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 67).mirror().addBox(-0.45F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 66).mirror().addBox(-0.34F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 66).addBox(1.68F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(67, 26).addBox(2.0F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 67).addBox(1.79F, -0.85F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.17F, -0.5729F, 0.425F, -0.7941F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-0.5F, -0.9863F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(66, 40).addBox(1.52F, -0.9863F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.01F, -1.408F, -0.0394F, -1.3439F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 0).addBox(1.52F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.01F, -0.608F, 0.4606F, -0.4363F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.32F, 0.2782F, 0.8997F, -0.8465F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(36, 53).addBox(-1.5F, -2.2F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0862F, -1.3866F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(9, 25).addBox(-0.5F, -2.7F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0275F, 0.0464F, -0.9163F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(29, 22).addBox(-1.0F, -2.4175F, -0.0153F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.7222F, -0.1179F, -1.8937F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.013F, -14.9101F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0553F, 16.8205F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(12, 35).addBox(-0.5F, -0.349F, -8.1787F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4553F, 3.0205F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4432F, -0.4969F, 0.4974F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(12, 38).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.1029F, -1.8606F, 0.0524F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(46, 39).addBox(-1.5F, -0.0555F, -1.987F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6882F, -1.5809F, 0.1396F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(59, 41).addBox(-1.5F, -0.6F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1118F, -0.8809F, -0.3142F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1772F, -0.2629F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(33, 35).addBox(-1.0F, -0.0307F, -0.0057F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3F, -10.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw5.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.875F, -6.7882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.8256F, 0.3974F, -0.0175F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -4.1F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw9_r1 = jaw4.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.0138F, -0.9036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.17F, -6.7413F, 2.618F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw4.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(8, 17).addBox(-0.5F, -0.0174F, -0.9974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 1.57F, -6.0413F, -3.1067F, 0.0F, 0.0F));

		PartDefinition jaw7_r1 = jaw4.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(55, 62).addBox(-0.5F, 0.0022F, 0.0216F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, 1.1951F, -6.7906F, 2.2166F, 0.0F, 0.0F));

		PartDefinition jaw7_r2 = jaw4.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, -2.4796F, 0.3533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(62, 55).addBox(-0.5F, -1.9796F, -0.0467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.0F, 1.4951F, -4.9906F, 0.6109F, 0.0F, 0.0F));

		PartDefinition jaw5_r2 = jaw4.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(42, 59).addBox(-0.5F, -1.8343F, -0.034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(62, 64).addBox(-0.5F, -0.9343F, -0.034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.3374F, -3.4172F, 0.9599F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5772F, -3.4629F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, -1.6629F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -2.6969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head2.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(28, 45).addBox(-1.0F, -1.0583F, -5.0291F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 2.3F, -4.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head2.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0583F, -0.0291F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.3F, -4.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head5.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(53, 28).addBox(-0.5F, -0.0726F, -0.1933F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0315F, -8.0556F, 0.3491F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.0057F, -0.1278F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.021F)), PartPose.offsetAndRotation(0.0F, 1.3896F, -11.3886F, 1.1519F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head4.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(61, 7).addBox(-1.0F, -1.037F, 0.0281F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.0226F, 1.6536F, 0.2356F, 0.0F, 0.0F));

		PartDefinition head6_r5 = head4.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(3, 3).addBox(-1.0F, 1.1F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2226F, -0.4464F, -0.2705F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head4.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(3, 3).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.0405F, 2.1287F, -0.3142F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head4.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(41, 19).addBox(-0.5F, -0.0286F, -6.8882F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(42, 6).addBox(-0.5F, 0.9714F, -6.8882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.85F, -2.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head6_r6 = head4.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(42, 6).addBox(0.0F, -1.959F, -1.0453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.4674F, -6.7528F, -1.3439F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head4.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(42, 6).addBox(0.0F, -2.0229F, -1.0086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.4326F, -8.1528F, -0.9774F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.2568F, 7.7531F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest4_r1 = crest1.addOrReplaceChild("crest4_r1", CubeListBuilder.create().texOffs(49, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2855F, -16.3311F, -2.7489F, 0.0F, 0.0F));

		PartDefinition crest6_r1 = crest1.addOrReplaceChild("crest6_r1", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -0.152F, -0.0386F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.3896F, -13.2386F, -1.2479F, 0.0F, 0.0F));

		PartDefinition crest5_r1 = crest1.addOrReplaceChild("crest5_r1", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -0.037F, -0.0553F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, -0.2104F, -14.2386F, -0.9512F, 0.0F, 0.0F));

		PartDefinition crest4_r2 = crest1.addOrReplaceChild("crest4_r2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.0473F, 0.1255F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.0F, -1.4104F, -15.9386F, -0.6196F, 0.0F, 0.0F));

		PartDefinition crest6_r2 = crest1.addOrReplaceChild("crest6_r2", CubeListBuilder.create().texOffs(15, 46).addBox(-0.5F, -12.7665F, -0.2693F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, -6.6104F, -15.7386F, -0.5847F, 0.0F, 0.0F));

		PartDefinition crest5_r2 = crest1.addOrReplaceChild("crest5_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -9.4665F, -0.2503F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 0).addBox(-0.5F, -6.8665F, -0.0503F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(59, 15).addBox(-0.5F, -3.9665F, -0.0503F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.7896F, -19.2386F, -0.3927F, 0.0F, 0.0F));

		PartDefinition crest2_r1 = crest1.addOrReplaceChild("crest2_r1", CubeListBuilder.create().texOffs(62, 50).addBox(-0.5F, -2.0019F, -0.2064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.0F, 3.6896F, -19.6386F, -0.288F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.5F, -1.1F, -0.2106F, -0.5437F, -0.4287F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(29, 19).addBox(-0.25F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 10).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4709F, 0.2106F, -0.2119F, -1.4413F, 0.5865F, -2.9665F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(56, 7).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 59).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-0.3631F, 0.9633F, -3.2225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(47, 53).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7436F, 7.6223F, -0.3825F, 0.1002F, 0.2192F, 0.5542F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(19, 3).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1051F, 9.0992F, 0.6788F, 1.9385F, -0.6132F, -3.0972F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1256F, 0.4829F, 13.3508F, 0.1461F, 0.0632F, 0.1958F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(29, 24).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(60, 60).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, 1.2451F, 1.4993F, -2.6545F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.5F, -1.1F, -0.2608F, 0.5233F, 0.3301F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(28, 0).addBox(-4.75F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 9).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4709F, 0.2106F, -0.2119F, -1.4079F, -0.8455F, 2.9161F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(52, 53).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 52).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(24, 33).addBox(-0.6369F, 0.9633F, -3.2225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(10, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7436F, 7.6223F, -0.3825F, 0.0179F, -0.2401F, -0.1963F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1051F, 9.0992F, 0.6788F, 1.8949F, 0.6132F, 3.0972F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1256F, 0.4829F, 13.3508F, 0.1461F, -0.0632F, -0.1958F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(60, 34).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, 1.2451F, -1.4993F, 2.6545F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 74, 74);
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