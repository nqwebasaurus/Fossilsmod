package fossils.fossils.client.blockentity.model.hatzegopteryx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HatzegopteryxFossilModel extends SkullModelBase {
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
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart crest1;
	private final ModelPart crest2;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart lefthand2;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart righthand2;

	public HatzegopteryxFossilModel(ModelPart root) {
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
		this.neck = this.neck1.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
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
		this.leftFace = this.head2.getChild("leftFace");
		this.rightFace = this.head2.getChild("rightFace");
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.righthand2 = this.rightwing4.getChild("righthand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.454F, -1.0949F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(117, 107).addBox(-0.0357F, -1.8896F, -0.8935F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0357F, -9.3768F, 4.8614F, -0.7225F, 0.0F, 0.0F));

		PartDefinition chest8_r1 = chest1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(119, 115).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 5.6123F, 0.0749F, -0.0142F, -0.5976F));

		PartDefinition chest9_r1 = chest1.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 5.6123F, 0.0695F, 0.0313F, -1.2069F));

		PartDefinition chest7_r1 = chest1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 3.6123F, 0.176F, 0.0545F, -0.5956F));

		PartDefinition chest8_r2 = chest1.addOrReplaceChild("chest8_r2", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-3.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 3.6123F, 0.1134F, 0.1454F, -1.203F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(120, 37).mirror().addBox(-0.693F, -0.1785F, -0.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8496F, -1.3925F, 0.5969F, 0.3399F, 0.1735F, 0.1921F));

		PartDefinition chest7_r2 = chest1.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(7, 117).mirror().addBox(-0.6441F, -2.4125F, -1.5942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9059F, 1.6566F, -0.4008F, 0.8921F, 0.5762F, 0.001F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(105, 113).mirror().addBox(-0.2299F, -0.5395F, -1.9033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7253F, -0.3664F, -0.5074F, 1.2816F, 0.147F, 0.1075F));

		PartDefinition chest7_r3 = chest1.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(114, 103).mirror().addBox(-0.0133F, -0.4936F, -2.9506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7253F, -0.3664F, -0.5074F, 1.3027F, 0.5714F, -0.0154F));

		PartDefinition chest6_r2 = chest1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(85, 116).mirror().addBox(-0.6441F, -2.1964F, -0.7536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9059F, 1.6566F, -0.4008F, 1.503F, 0.5762F, 0.001F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(108, 108).mirror().addBox(-0.5289F, -1.8598F, -1.4592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9059F, 1.8566F, -0.4008F, 2.4696F, 0.6495F, -0.0218F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(43, 116).mirror().addBox(-1.3841F, -2.1922F, 0.4429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9059F, 1.6566F, -0.4008F, 0.5842F, 0.1735F, 0.1921F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-1.3841F, -2.084F, -0.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9059F, 1.6566F, -0.4008F, 0.7064F, 0.1735F, 0.1921F));

		PartDefinition chest7_r4 = chest1.addOrReplaceChild("chest7_r4", CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-4.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 1.6123F, 0.1521F, 0.243F, -1.1955F));

		PartDefinition chest6_r3 = chest1.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.6436F, 1.6123F, 0.2632F, 0.113F, -0.5883F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(86, 120).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.5436F, -0.2877F, 0.3588F, 0.1904F, -0.4866F));

		PartDefinition chest5_r5 = chest1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(95, 31).mirror().addBox(-4.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.3436F, -1.8877F, 0.3147F, 0.4677F, -1.1412F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(97, 121).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.3436F, -1.8877F, 0.5191F, 0.2124F, -0.5493F));

		PartDefinition chest6_r4 = chest1.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(93, 84).mirror().addBox(-4.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.5436F, -0.2877F, 0.1869F, 0.3606F, -1.0979F));

		PartDefinition chest6_r5 = chest1.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(114, 103).addBox(-0.9867F, -0.4936F, -2.9506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6539F, -0.3664F, -0.5074F, 1.3027F, -0.5714F, 0.0154F));

		PartDefinition chest6_r6 = chest1.addOrReplaceChild("chest6_r6", CubeListBuilder.create().texOffs(7, 117).addBox(-0.3559F, -2.4125F, -1.5942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8344F, 1.6566F, -0.4008F, 0.8921F, -0.5762F, -0.001F));

		PartDefinition chest5_r6 = chest1.addOrReplaceChild("chest5_r6", CubeListBuilder.create().texOffs(85, 116).addBox(-0.3559F, -2.1964F, -0.7536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8344F, 1.6566F, -0.4008F, 1.503F, -0.5762F, -0.001F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(108, 108).addBox(-0.4711F, -1.8598F, -1.4592F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8344F, 1.8566F, -0.4008F, 2.4696F, -0.6495F, 0.0218F));

		PartDefinition chest5_r7 = chest1.addOrReplaceChild("chest5_r7", CubeListBuilder.create().texOffs(120, 37).addBox(-0.307F, -0.1785F, -0.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7781F, -1.3925F, 0.5969F, 0.3399F, -0.1735F, -0.1921F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(43, 116).addBox(0.3841F, -2.1922F, 0.4429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8344F, 1.6566F, -0.4008F, 0.5842F, -0.1735F, -0.1921F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(105, 113).addBox(-0.7701F, -0.5395F, -1.9033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6539F, -0.3664F, -0.5074F, 1.2816F, -0.147F, -0.1075F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(0, 116).addBox(0.3841F, -2.084F, -0.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8344F, 1.6566F, -0.4008F, 0.7064F, -0.1735F, -0.1921F));

		PartDefinition chest8_r3 = chest1.addOrReplaceChild("chest8_r3", CubeListBuilder.create().texOffs(108, 62).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 5.6123F, 0.0695F, -0.0313F, 1.2069F));

		PartDefinition chest7_r5 = chest1.addOrReplaceChild("chest7_r5", CubeListBuilder.create().texOffs(119, 115).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 5.6123F, 0.0749F, 0.0142F, 0.5976F));

		PartDefinition chest7_r6 = chest1.addOrReplaceChild("chest7_r6", CubeListBuilder.create().texOffs(0, 98).addBox(0.8192F, -0.5736F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 3.6123F, 0.1134F, -0.1454F, 1.203F));

		PartDefinition chest6_r7 = chest1.addOrReplaceChild("chest6_r7", CubeListBuilder.create().texOffs(117, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 3.6123F, 0.176F, -0.0545F, 0.5956F));

		PartDefinition chest6_r8 = chest1.addOrReplaceChild("chest6_r8", CubeListBuilder.create().texOffs(78, 33).addBox(0.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.6123F, 0.1521F, -0.243F, 1.1955F));

		PartDefinition chest5_r8 = chest1.addOrReplaceChild("chest5_r8", CubeListBuilder.create().texOffs(68, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, 1.6123F, 0.2632F, -0.113F, 0.5883F));

		PartDefinition chest4_r6 = chest1.addOrReplaceChild("chest4_r6", CubeListBuilder.create().texOffs(86, 120).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5436F, -0.2877F, 0.3588F, -0.1904F, 0.4866F));

		PartDefinition chest4_r7 = chest1.addOrReplaceChild("chest4_r7", CubeListBuilder.create().texOffs(95, 31).addBox(0.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, -1.8877F, 0.3147F, -0.4677F, 1.1412F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(97, 121).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, -1.8877F, 0.5191F, -0.2124F, 0.5493F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(35, 106).addBox(-1.5357F, -0.884F, -2.4576F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6328F, 0.6496F, -0.5236F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(24, 106).addBox(-1.5357F, -1.1664F, -0.8402F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.6328F, 0.6496F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest5_r9 = chest1.addOrReplaceChild("chest5_r9", CubeListBuilder.create().texOffs(93, 84).addBox(0.8192F, -0.5736F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5436F, -0.2877F, 0.1869F, -0.3606F, 1.0979F));

		PartDefinition chest3_r4 = chest1.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(9, 112).addBox(-0.0357F, -0.6924F, 0.0318F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(99, 108).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.1F, 0.0F, 0.0F, 0.0F));

		PartDefinition chest4_r8 = chest1.addOrReplaceChild("chest4_r8", CubeListBuilder.create().texOffs(97, 13).addBox(-2.0357F, -1.0848F, 0.0399F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5328F, 3.0496F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest3_r5 = chest1.addOrReplaceChild("chest3_r5", CubeListBuilder.create().texOffs(104, 99).addBox(-1.5357F, 0.0583F, 1.0413F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.6328F, 0.6496F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest4_r9 = chest1.addOrReplaceChild("chest4_r9", CubeListBuilder.create().texOffs(59, 78).addBox(-0.0357F, -0.4924F, 1.0318F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 4).addBox(-0.5357F, 0.0076F, 0.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.1F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(59, 75).addBox(-0.0357F, -1.3123F, 0.0852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 102).addBox(-0.5357F, -0.3123F, -0.3148F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.5F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(46, 106).addBox(-0.5F, -0.1016F, 2.1803F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 106).mirror().addBox(-1.5715F, -0.1016F, 2.1803F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.49F, 5.8335F, -0.0147F, 0.1758F, 0.0847F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(59, 72).addBox(-0.0357F, 0.0018F, 0.0282F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6405F, 4.9428F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(112, 117).addBox(-0.0357F, -0.0018F, -2.024F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0405F, 3.0428F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(107, 117).addBox(-0.0357F, -0.0025F, 0.0021F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0405F, 3.0428F, -0.2094F, 0.0005F, -0.0004F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(115, 91).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4438F, 0.5517F, 2.4838F, -0.4821F, -0.1256F, -0.0297F));

		PartDefinition body9_r1 = body1.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(62, 118).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 118).mirror().addBox(-0.5F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(62, 118).addBox(2.3715F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 118).addBox(2.3715F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.4715F, 1.4531F, 3.6384F, -1.3875F, 0.0F, 0.0F));

		PartDefinition body9_r2 = body1.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-0.9589F, 0.0738F, 0.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(112, 113).mirror().addBox(-0.9589F, -0.3262F, 0.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.7715F, 0.5722F, 4.4936F, -1.1647F, 0.0637F, -0.6518F));

		PartDefinition body8_r1 = body1.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(119, 68).mirror().addBox(-0.5F, -0.9078F, -1.9997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 12).mirror().addBox(-0.5F, -0.9078F, -1.1997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 16).mirror().addBox(-0.5F, -0.9078F, -1.5997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(119, 12).addBox(2.3715F, -0.9078F, -1.1997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(119, 68).addBox(2.3715F, -0.9078F, -1.9997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(119, 16).addBox(2.3715F, -0.9078F, -1.5997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4715F, 0.5722F, 4.5936F, 0.1833F, 0.0F, 0.0F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(16, 116).mirror().addBox(-0.4582F, -0.2953F, -0.2755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4715F, -0.3278F, 1.9936F, -0.4327F, -0.0619F, -0.0184F));

		PartDefinition body7_r2 = body1.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(115, 79).mirror().addBox(-0.9589F, 0.2249F, 0.4891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7715F, 0.5722F, 4.4936F, -0.7458F, 0.0637F, -0.6518F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(119, 72).mirror().addBox(-0.4773F, -0.2385F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(120, 34).mirror().addBox(-0.4773F, -0.6385F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7275F, 3.4766F, 2.4964F, 0.0954F, 0.3394F, -0.412F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(66, 108).mirror().addBox(-0.642F, 0.5146F, -2.3361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.4715F, 0.3722F, 3.7936F, -0.7439F, -0.1256F, -0.0297F));

		PartDefinition body9_r3 = body1.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(14, 120).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.314F)).mirror(false)
				.texOffs(14, 120).addBox(2.3715F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.314F)), PartPose.offsetAndRotation(-1.4715F, 0.5316F, 5.9949F, -1.6144F, 0.0F, 0.0F));

		PartDefinition body7_r3 = body1.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(115, 75).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(115, 75).addBox(2.3715F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4715F, 0.1576F, 5.8197F, -0.7592F, 0.0F, 0.0F));

		PartDefinition body9_r4 = body1.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(115, 83).mirror().addBox(-0.5F, -0.6877F, -0.3565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(115, 83).addBox(2.3715F, -0.6877F, -0.3565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4715F, 0.1722F, 5.5936F, -2.2777F, 0.0F, 0.0F));

		PartDefinition body8_r2 = body1.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-0.5F, -0.7287F, -1.1086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.313F)).mirror(false)
				.texOffs(117, 0).addBox(2.3715F, -0.7287F, -1.1086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.313F)), PartPose.offsetAndRotation(-1.4715F, 0.5722F, 4.8936F, -2.33F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(102, 117).mirror().addBox(-0.5782F, -1.4553F, -0.2709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.7275F, 3.4766F, 2.4964F, -0.8645F, 0.3394F, -0.412F));

		PartDefinition body7_r4 = body1.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(50, 111).mirror().addBox(-0.9643F, -0.1353F, 0.7771F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.7715F, 0.5722F, 4.4936F, -1.4178F, 0.0637F, -0.6518F));

		PartDefinition body6_r4 = body1.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(78, 116).mirror().addBox(-0.9589F, 0.4484F, 0.2624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7715F, 0.5722F, 4.4936F, -0.4404F, 0.0637F, -0.6518F));

		PartDefinition body8_r3 = body1.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(91, 111).mirror().addBox(-0.5F, -0.7922F, -1.0997F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(91, 111).addBox(2.3715F, -0.7922F, -1.0997F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.4715F, 0.5722F, 4.5936F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body7_r5 = body1.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(115, 64).mirror().addBox(-0.5F, -0.5625F, -1.1421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(115, 64).addBox(2.3715F, -0.5625F, -1.1421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4715F, 0.5722F, 4.8936F, -2.138F, 0.0F, 0.0F));

		PartDefinition body6_r5 = body1.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.4715F, -0.2775F, 5.293F, -0.096F, 0.0046F, -0.0028F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(115, 95).mirror().addBox(-0.8183F, -0.2778F, -3.5728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4715F, 0.3722F, 3.7936F, -0.3869F, -0.1896F, 0.0304F));

		PartDefinition chest8_r4 = body1.addOrReplaceChild("chest8_r4", CubeListBuilder.create().texOffs(67, 121).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.1637F, 1.1495F, 0.1594F, 0.2682F, -1.2984F));

		PartDefinition chest7_r7 = body1.addOrReplaceChild("chest7_r7", CubeListBuilder.create().texOffs(5, 121).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5715F, -0.1637F, 1.1495F, 0.2835F, 0.1297F, -0.6906F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(119, 72).addBox(-0.5227F, -0.2385F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(120, 34).addBox(-0.5227F, -0.6385F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.656F, 3.4766F, 2.4964F, 0.0954F, -0.3394F, 0.412F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(102, 117).addBox(-0.4218F, -1.4553F, -0.2709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.656F, 3.4766F, 2.4964F, -0.8645F, -0.3394F, 0.412F));

		PartDefinition body6_r6 = body1.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(50, 111).addBox(-0.0357F, -0.1353F, 0.7771F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.7F, 0.5722F, 4.4936F, -1.4178F, -0.0637F, 0.6518F));

		PartDefinition body8_r4 = body1.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(114, 99).addBox(-0.0411F, 0.0738F, 0.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(112, 113).addBox(-0.0411F, -0.3262F, 0.6739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.7F, 0.5722F, 4.4936F, -1.1647F, -0.0637F, 0.6518F));

		PartDefinition body6_r7 = body1.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(115, 79).addBox(-0.0411F, 0.2249F, 0.4891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7F, 0.5722F, 4.4936F, -0.7458F, -0.0637F, 0.6518F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(78, 116).addBox(-0.0411F, 0.4484F, 0.2624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7F, 0.5722F, 4.4936F, -0.4404F, -0.0637F, 0.6518F));

		PartDefinition body5_r4 = body1.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.4F, -0.2775F, 5.293F, -0.096F, -0.0046F, 0.0028F));

		PartDefinition body6_r8 = body1.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(115, 91).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3723F, 0.5517F, 2.4838F, -0.4821F, 0.1256F, 0.0297F));

		PartDefinition body5_r5 = body1.addOrReplaceChild("body5_r5", CubeListBuilder.create().texOffs(66, 108).addBox(-0.358F, 0.5146F, -2.3361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.4F, 0.3722F, 3.7936F, -0.7439F, 0.1256F, 0.0297F));

		PartDefinition body5_r6 = body1.addOrReplaceChild("body5_r6", CubeListBuilder.create().texOffs(16, 116).addBox(-0.5418F, -0.2953F, -0.2755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -0.3278F, 1.9936F, -0.4327F, 0.0619F, 0.0184F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(115, 95).addBox(-0.1817F, -0.2778F, -3.5728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.3722F, 3.7936F, -0.3869F, 0.1896F, -0.0304F));

		PartDefinition chest7_r8 = body1.addOrReplaceChild("chest7_r8", CubeListBuilder.create().texOffs(67, 121).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1637F, 1.1495F, 0.1594F, -0.2682F, 1.2984F));

		PartDefinition chest6_r9 = body1.addOrReplaceChild("chest6_r9", CubeListBuilder.create().texOffs(5, 121).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1637F, 1.1495F, 0.2835F, -0.1297F, 0.6906F));

		PartDefinition body2_r2 = body1.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(90, 102).addBox(-2.0357F, -0.4959F, -1.0081F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8381F, 1.7059F, 0.6283F, -0.0032F, 0.0021F));

		PartDefinition body1_r1 = body1.addOrReplaceChild("body1_r1", CubeListBuilder.create().texOffs(31, 99).addBox(-0.5357F, -0.1F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3138F, 1.5406F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(44, 99).addBox(-0.5357F, -0.3629F, -0.4251F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0777F, 5.5403F, -0.0393F, 0.3052F, -0.0118F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(108, 34).addBox(-0.2279F, -0.2807F, -0.4087F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5402F, 1.2802F, 4.3609F, 0.7393F, -0.0173F, -0.2564F));

		PartDefinition upperleg7_r1 = leftleg1.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(84, 108).addBox(2.7F, 6.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(57, 36).addBox(2.7F, -1.2F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9279F, 7.9193F, -0.0087F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = leftleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(28, 117).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2721F, 0.2193F, 0.0913F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4789F, 15.4725F, 1.7824F, 0.8085F, 0.1461F, 0.2048F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(0, 72).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 36).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(10, 72).addBox(-1.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6634F, 23.8549F, 2.0793F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(108, 48).addBox(-0.7721F, -0.2807F, -0.4087F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6117F, 1.2802F, 4.3609F, 1.2629F, 0.0173F, 0.2564F));

		PartDefinition upperleg8_r1 = rightleg1.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(78, 113).addBox(-3.7F, 6.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(57, 46).addBox(-3.7F, -1.2F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9279F, 7.9193F, -0.0087F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = rightleg1.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(33, 117).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2721F, 0.2193F, 0.0913F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4789F, 15.4725F, 1.7824F, 0.5177F, -0.2349F, -0.0517F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(5, 72).addBox(0.15F, -2.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 62).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(31, 72).addBox(-2.0F, -0.5F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6634F, 23.8549F, 2.0793F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0913F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -2.9F, 0.1496F, -0.1295F, -0.0195F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(29, 111).addBox(-0.0357F, -1.0317F, -3.0517F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7555F, 0.1133F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(108, 29).addBox(-0.5357F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck1.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0288F, -2.8865F, -0.0528F, -0.1307F, 0.0069F));

		PartDefinition neck2_r1 = neck.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(68, 102).addBox(-0.5357F, -0.8258F, -4.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck2_r2 = neck.addOrReplaceChild("neck2_r2", CubeListBuilder.create().texOffs(24, 100).addBox(-0.0357F, -0.9F, -2.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -1.2722F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(31, 81).addBox(-0.5357F, -0.4178F, -6.9187F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6275F, -3.6739F, -0.0734F, -0.0281F, -0.1489F));

		PartDefinition neck3_r2 = neck2.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(106, 64).addBox(-0.0357F, -0.1F, -4.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3178F, -0.6187F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0477F, -6.8394F, -0.1041F, -0.2604F, 0.0269F));

		PartDefinition neck3_r3 = neck3.addOrReplaceChild("neck3_r3", CubeListBuilder.create().texOffs(78, 24).addBox(-0.5357F, -0.3F, -6.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5807F, -6.9432F, -0.1891F, -0.0468F, -0.1223F));

		PartDefinition neck4_r1 = neck4.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(91, 86).addBox(-0.5357F, -0.3F, -11.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2967F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4792F, -5.8484F, -0.3752F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = neck5.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(78, 95).addBox(-0.5357F, -0.3F, -10.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2993F, 5.5209F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.355F, -4.7851F, 1.6232F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(106, 82).mirror().addBox(-0.998F, -0.2295F, 0.3182F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(106, 82).mirror().addBox(-1.498F, -0.2295F, -0.9818F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(106, 82).addBox(-0.4306F, -0.2295F, -0.9818F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0715F, -1.7779F, 1.46F, -2.0857F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(120, 54).addBox(-0.5337F, -0.6F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 111).addBox(-0.5337F, -0.6F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.002F, -2.166F, 2.548F, -1.1694F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(113, 34).addBox(-0.5337F, -0.1107F, -2.0965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -3.1976F, 2.69F, -0.6458F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(43, 111).addBox(-0.5357F, -0.1041F, -0.001F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.311F, -0.8016F, -0.4538F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(64, 113).addBox(-0.5357F, -0.0511F, -0.0092F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -5.911F, -2.7016F, -0.2793F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(108, 24).addBox(-0.4804F, -0.8732F, -1.3468F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.911F, -3.9016F, -0.5061F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(11, 107).addBox(-0.4804F, -0.2546F, -1.5201F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.911F, -3.9016F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(71, 113).addBox(-0.5357F, -1.2662F, -1.0229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.911F, -3.9016F, -0.192F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9329F, -2.0184F, 0.2365F, -0.0003F, -0.0014F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(0.0F, -0.7265F, -2.9562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9715F, -0.4882F, -0.6809F, -0.1409F, -0.1562F, 0.0166F));

		PartDefinition jaw5_r1 = jaw.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(0.0F, -0.3431F, -1.1698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9715F, -0.4882F, -0.6809F, -0.5074F, -0.1562F, 0.0166F));

		PartDefinition jaw4_r2 = jaw.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(120, 40).mirror().addBox(0.0F, 0.4621F, -1.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9715F, -0.4882F, -0.6809F, -0.3853F, -0.1562F, 0.0166F));

		PartDefinition jaw5_r2 = jaw.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(113, 39).mirror().addBox(0.0F, -0.0014F, -2.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9715F, -0.4882F, -0.6809F, -0.0886F, -0.1562F, 0.0166F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(117, 8).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5099F, -0.0328F, -0.4455F, 0.1732F, -0.1562F, 0.0166F));

		PartDefinition jaw7_r1 = jaw.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(91, 94).mirror().addBox(0.0F, -0.9289F, -0.052F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0715F, 1.7788F, -11.3711F, 0.0011F, -0.1565F, -0.0138F));

		PartDefinition jaw6_r1 = jaw.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.9089F, -0.3304F, 5.7756F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0715F, 1.7788F, -11.3711F, 0.1045F, -0.0003F, 0.0027F));

		PartDefinition jaw6_r2 = jaw.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(91, 94).addBox(0.0F, -0.9289F, -0.052F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7788F, -11.3711F, 0.0011F, 0.1565F, 0.0138F));

		PartDefinition jaw5_r3 = jaw.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(93, 64).addBox(0.9089F, -0.3304F, 5.7756F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7788F, -11.3711F, 0.1045F, 0.0003F, -0.0027F));

		PartDefinition jaw4_r3 = jaw.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(113, 39).addBox(-1.0F, -0.0014F, -2.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9F, -0.4882F, -0.6809F, -0.0886F, 0.1562F, -0.0166F));

		PartDefinition jaw4_r4 = jaw.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(98, 113).addBox(-1.0F, -0.3431F, -1.1698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9F, -0.4882F, -0.6809F, -0.5074F, 0.1562F, -0.0166F));

		PartDefinition jaw3_r2 = jaw.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(112, 14).addBox(-1.0F, -0.7265F, -2.9562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9F, -0.4882F, -0.6809F, -0.1409F, 0.1562F, -0.0166F));

		PartDefinition jaw3_r3 = jaw.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(120, 40).addBox(-1.0F, 0.4621F, -1.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9F, -0.4882F, -0.6809F, -0.3853F, 0.1562F, -0.0166F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(117, 8).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4384F, -0.0328F, -0.4455F, 0.1732F, 0.1562F, -0.0166F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1772F, -0.2629F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw6_r3 = jaw2.addOrReplaceChild("jaw6_r3", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-0.5F, -0.9936F, -0.2514F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(74, 66).addBox(-0.2432F, -0.9936F, -0.2514F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1641F, 6.2829F, -23.494F, 0.384F, 0.0F, 0.0F));

		PartDefinition jaw7_r2 = jaw2.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-0.5927F, -0.0408F, -0.0697F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(74, 76).addBox(-0.3359F, -0.0408F, -0.0697F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0715F, 3.4F, -21.9F, 0.2967F, 0.0F, 0.0F));

		PartDefinition jaw3_r4 = jaw2.addOrReplaceChild("jaw3_r4", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-0.2F, -0.0467F, -0.027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3715F, -1.2F, -6.3F, 0.1222F, 0.0003F, 0.0009F));

		PartDefinition jaw7_r3 = jaw2.addOrReplaceChild("jaw7_r3", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(0.0F, 0.158F, -8.1535F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, 0.1F, -8.9F, 0.2614F, -0.0704F, 0.0045F));

		PartDefinition jaw5_r4 = jaw2.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(74, 56).mirror().addBox(0.0F, -0.6906F, -8.1653F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, 0.1F, -8.9F, 0.2967F, -0.0873F, 0.0F));

		PartDefinition jaw5_r5 = jaw2.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(110, 18).mirror().addBox(0.0F, 0.4158F, -2.8706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5715F, -0.7F, -6.3F, 0.2094F, -0.0873F, 0.0F));

		PartDefinition jaw4_r5 = jaw2.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(0.0F, -0.5387F, -2.9046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.5715F, -0.7F, -6.3F, 0.2443F, -0.0873F, 0.0F));

		PartDefinition jaw4_r6 = jaw2.addOrReplaceChild("jaw4_r6", CubeListBuilder.create().texOffs(108, 57).mirror().addBox(-0.2F, 0.4002F, -3.1629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3715F, -1.2F, -3.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition jaw3_r5 = jaw2.addOrReplaceChild("jaw3_r5", CubeListBuilder.create().texOffs(108, 57).addBox(-0.8F, 0.4002F, -3.1629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3F, -1.2F, -3.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition jaw4_r7 = jaw2.addOrReplaceChild("jaw4_r7", CubeListBuilder.create().texOffs(110, 18).addBox(-1.0F, 0.4158F, -2.8706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5F, -0.7F, -6.3F, 0.2094F, 0.0873F, 0.0F));

		PartDefinition jaw6_r4 = jaw2.addOrReplaceChild("jaw6_r4", CubeListBuilder.create().texOffs(74, 36).addBox(-1.0F, 0.158F, -8.1535F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.1F, -8.9F, 0.2614F, 0.0704F, -0.0045F));

		PartDefinition jaw5_r6 = jaw2.addOrReplaceChild("jaw5_r6", CubeListBuilder.create().texOffs(103, 102).addBox(-0.5357F, 0.6347F, -9.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.1F, -16.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition jaw4_r8 = jaw2.addOrReplaceChild("jaw4_r8", CubeListBuilder.create().texOffs(74, 56).addBox(-1.0F, -0.6906F, -8.1653F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1F, 0.1F, -8.9F, 0.2967F, 0.0873F, 0.0F));

		PartDefinition jaw3_r6 = jaw2.addOrReplaceChild("jaw3_r6", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, -0.5387F, -2.9046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -0.7F, -6.3F, 0.2443F, 0.0873F, 0.0F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(75, 108).addBox(-0.8F, -0.0467F, -0.027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, -1.2F, -6.3F, 0.1222F, -0.0003F, -0.0009F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw6_r5 = jaw5.addOrReplaceChild("jaw6_r5", CubeListBuilder.create().texOffs(113, 53).addBox(-0.5357F, -1.7451F, -5.879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2132F, -15.4768F, 0.2269F, 0.0F, 0.0F));

		PartDefinition jaw5_r7 = jaw5.addOrReplaceChild("jaw5_r7", CubeListBuilder.create().texOffs(78, 14).addBox(-0.5357F, -1.6839F, -8.357F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.0132F, -20.6768F, 0.1222F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -4.1F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw4.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(50, 116).addBox(-0.4357F, -0.9F, 3.7785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1F, 5.37F, -16.6413F, -3.0369F, 0.0F, 0.0F));

		PartDefinition jaw7_r4 = jaw4.addOrReplaceChild("jaw7_r4", CubeListBuilder.create().texOffs(74, 86).addBox(-0.5526F, -0.5F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0169F, 6.8639F, -25.3826F, -2.9845F, 0.0F, 0.0F));

		PartDefinition jaw7_r5 = jaw4.addOrReplaceChild("jaw7_r5", CubeListBuilder.create().texOffs(117, 23).addBox(-0.4357F, 0.1686F, -10.2227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.019F))
				.texOffs(57, 102).addBox(-0.4357F, -0.6314F, -4.2227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F))
				.texOffs(13, 100).addBox(-0.4357F, -0.6314F, -8.2227F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.1F, 3.0946F, -15.5339F, 0.2793F, 0.0F, 0.0F));

		PartDefinition jaw4_r9 = jaw4.addOrReplaceChild("jaw4_r9", CubeListBuilder.create().texOffs(117, 27).addBox(-0.5357F, -3.5542F, -5.181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.1374F, -14.8172F, 0.733F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5772F, -3.4629F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, -1.6629F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5125F, -3.419F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(93, 49).addBox(-1.9355F, -0.084F, -10.023F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4F, 1.2831F, -8.0396F, 0.1287F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head2.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(0, 106).addBox(-1.1F, -0.9428F, -0.6662F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 1.7F, -1.5F, -0.672F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head2.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(117, 117).addBox(-1.0F, 0.0029F, -0.9739F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.9F, -1.6F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head2.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(115, 87).addBox(-1.0F, 1.4999F, 1.2425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -5.3F, 1.0908F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head2.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(101, 7).addBox(-1.0F, -0.089F, 0.1231F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.8F, -5.3F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head5.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5357F, -2.8083F, -13.9576F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -10.1487F, 0.5061F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head5.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5357F, -0.0018F, 0.0945F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1685F, -15.3556F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head5.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(74, 46).addBox(-0.6345F, -4.9634F, -7.0769F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0988F, 3.5951F, -13.7014F, 0.4887F, 0.0F, 0.0003F));

		PartDefinition head9_r2 = head5.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(20, 111).addBox(-0.6345F, 0.0102F, -2.9865F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0988F, 4.0951F, -24.9014F, 0.5934F, 0.0F, 0.0003F));

		PartDefinition head8_r1 = head5.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(65, 90).addBox(-0.6345F, -5.3297F, -9.8443F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0988F, 3.5951F, -13.7014F, 0.541F, 0.0F, 0.0003F));

		PartDefinition head8_r2 = head5.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(90, 106).addBox(-0.6345F, -1.851F, -8.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0988F, 3.5951F, -13.7014F, 0.2094F, 0.0F, 0.0003F));

		PartDefinition head7_r1 = head5.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(95, 24).addBox(-0.6345F, -0.891F, 0.1047F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0988F, 5.3951F, -23.9014F, 0.1571F, 0.0F, 0.0003F));

		PartDefinition head6_r2 = head5.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(31, 90).addBox(-0.6345F, -2.8266F, -16.8758F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0988F, 3.5951F, -13.7014F, 0.3665F, 0.0F, 0.0003F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head4.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(106, 88).addBox(-0.5357F, -1.3694F, -0.9704F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.45F, -3.2F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(110, 70).addBox(-0.5357F, -1.5001F, -0.7715F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.65F, -6.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head4.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(65, 95).addBox(-0.5357F, -0.0486F, -4.9704F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -4.15F, -6.9F, 0.0698F, 0.0001F, 0.0003F));

		PartDefinition head7_r3 = head4.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(117, 43).addBox(-0.5357F, -2.6061F, -1.084F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0878F, -13.7651F, -1.2915F, 0.0F, 0.0F));

		PartDefinition head7_r4 = head4.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(117, 57).addBox(-0.5357F, -0.1213F, -1.0416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9878F, -16.4651F, -1.0821F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head4.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(38, 117).addBox(-0.5357F, -0.3743F, -3.2515F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0122F, -13.1651F, -1.1694F, 0.0F, 0.0F));

		PartDefinition head5_r4 = head4.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(97, 117).addBox(-0.617F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0813F, 0.2007F, -18.9676F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head4_r5 = head4.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(93, 76).addBox(-0.6345F, -5.8521F, -6.2606F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0988F, 4.9351F, -17.2014F, 0.1222F, 0.0001F, 0.0003F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7136F, 1.3571F, -1.2198F));

		PartDefinition head4_r6 = leftFace.addOrReplaceChild("head4_r6", CubeListBuilder.create().texOffs(57, 99).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4336F, 0.1227F, -0.0983F));

		PartDefinition head8_r3 = leftFace.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(93, 41).addBox(-0.0259F, -0.8442F, -5.8783F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.613F, 1.9523F, -16.0783F, 0.1374F, 0.0935F, -0.0476F));

		PartDefinition head3_r4 = leftFace.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5284F, -0.0782F, -9.6999F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6864F, -0.074F, -6.8198F, 0.1287F, 0.0933F, -0.0477F));

		PartDefinition head3_r5 = leftFace.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(48, 91).addBox(-1.5256F, -1.4059F, -10.1409F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.7864F, 0.2429F, -0.6802F, 0.1483F, 0.0349F, 0.0037F));

		PartDefinition head2_r3 = leftFace.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(93, 57).addBox(-1.8918F, -0.8361F, -4.2965F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7864F, 0.2429F, -0.6802F, 0.0087F, -0.0524F, 0.0F));

		PartDefinition head3_r6 = leftFace.addOrReplaceChild("head3_r6", CubeListBuilder.create().texOffs(104, 94).addBox(-1.9F, -0.7152F, -3.0407F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.2864F, 1.6429F, 1.7198F, -0.678F, 0.1227F, -0.0983F));

		PartDefinition head5_r5 = leftFace.addOrReplaceChild("head5_r5", CubeListBuilder.create().texOffs(106, 76).addBox(-1.9769F, -1.5501F, -3.5868F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2864F, 0.9025F, 3.1363F, -0.7531F, 0.0847F, -0.0616F));

		PartDefinition head9_r3 = leftFace.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(81, 120).addBox(-0.5697F, 0.0301F, -0.3464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(76, 120).addBox(-0.5697F, -0.4699F, -0.3464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.9867F, -1.1093F, 1.9532F, -0.6479F, 0.0952F, -0.0437F));

		PartDefinition head7_r5 = leftFace.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(120, 51).addBox(-0.4997F, -0.8384F, -0.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(120, 48).addBox(-0.3897F, -0.8384F, -0.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.9867F, -1.1093F, 1.9532F, -0.7089F, 0.0952F, -0.0437F));

		PartDefinition head7_r6 = leftFace.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(43, 120).addBox(-0.5697F, -0.9244F, -0.8514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.9867F, -1.1093F, 1.9532F, -0.8049F, 0.0952F, -0.0437F));

		PartDefinition head6_r5 = leftFace.addOrReplaceChild("head6_r5", CubeListBuilder.create().texOffs(117, 31).addBox(-0.5697F, -0.6958F, -0.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(119, 20).addBox(-0.5697F, -0.0958F, -0.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9867F, -1.1093F, 1.9532F, -0.229F, 0.0952F, -0.0437F));

		PartDefinition head8_r4 = leftFace.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(48, 120).addBox(-0.5697F, -0.7254F, -0.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.9867F, -1.1093F, 1.9532F, -1.5205F, 0.0952F, -0.0437F));

		PartDefinition head6_r6 = leftFace.addOrReplaceChild("head6_r6", CubeListBuilder.create().texOffs(71, 117).addBox(-0.58F, -1.2506F, -1.5403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2864F, 0.9025F, 3.1363F, -1.0408F, 0.091F, -0.0519F));

		PartDefinition head6_r7 = leftFace.addOrReplaceChild("head6_r7", CubeListBuilder.create().texOffs(59, 84).addBox(-1.9F, -0.8068F, -2.2265F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2864F, 0.9025F, 3.1363F, -1.2942F, 0.0847F, -0.0616F));

		PartDefinition head3_r7 = leftFace.addOrReplaceChild("head3_r7", CubeListBuilder.create().texOffs(101, 0).addBox(-1.9769F, -4.7688F, -2.2805F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2864F, 0.9025F, 3.1363F, -0.046F, 0.091F, -0.0519F));

		PartDefinition head4_r7 = leftFace.addOrReplaceChild("head4_r7", CubeListBuilder.create().texOffs(84, 111).addBox(-0.5F, -1.4873F, -0.6127F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5843F, -0.9837F, 5.4681F, -0.5265F, -0.0869F, -0.0994F));

		PartDefinition head3_r8 = leftFace.addOrReplaceChild("head3_r8", CubeListBuilder.create().texOffs(36, 111).addBox(-0.5F, -0.917F, -0.7818F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5843F, -0.9837F, 5.4681F, -1.5563F, -0.0869F, -0.0994F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7851F, 1.3571F, -1.2198F));

		PartDefinition head5_r6 = rightFace.addOrReplaceChild("head5_r6", CubeListBuilder.create().texOffs(57, 99).mirror().addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4336F, -0.1227F, 0.0983F));

		PartDefinition head9_r4 = rightFace.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(-1.2452F, -0.8281F, -5.8548F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8857F, 1.9523F, -16.0783F, 0.1374F, -0.0938F, 0.0458F));

		PartDefinition head4_r8 = rightFace.addOrReplaceChild("head4_r8", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-0.4712F, -0.0782F, -9.6999F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6864F, -0.074F, -6.8198F, 0.1287F, -0.0933F, 0.0477F));

		PartDefinition head4_r9 = rightFace.addOrReplaceChild("head4_r9", CubeListBuilder.create().texOffs(48, 91).mirror().addBox(-0.4744F, -1.4059F, -10.1409F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7864F, 0.2429F, -0.6802F, 0.1483F, -0.0349F, -0.0037F));

		PartDefinition head3_r9 = rightFace.addOrReplaceChild("head3_r9", CubeListBuilder.create().texOffs(93, 57).mirror().addBox(-0.1082F, -0.8361F, -4.2965F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7864F, 0.2429F, -0.6802F, 0.0087F, 0.0524F, 0.0F));

		PartDefinition head4_r10 = rightFace.addOrReplaceChild("head4_r10", CubeListBuilder.create().texOffs(104, 94).mirror().addBox(-0.1F, -0.7152F, -3.0407F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2864F, 1.6429F, 1.7198F, -0.678F, -0.1227F, 0.0983F));

		PartDefinition head6_r8 = rightFace.addOrReplaceChild("head6_r8", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(-0.0231F, -1.5501F, -3.5868F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2864F, 0.9025F, 3.1363F, -0.7531F, -0.0847F, 0.0616F));

		PartDefinition head10_r2 = rightFace.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(81, 120).mirror().addBox(-0.4303F, 0.0301F, -0.3464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(76, 120).mirror().addBox(-0.4303F, -0.4699F, -0.3464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -1.1093F, 1.9532F, -0.6479F, -0.0952F, 0.0437F));

		PartDefinition head8_r5 = rightFace.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-0.5003F, -0.8384F, -0.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(120, 48).mirror().addBox(-0.6103F, -0.8384F, -0.7502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -1.1093F, 1.9532F, -0.7089F, -0.0952F, 0.0437F));

		PartDefinition head8_r6 = rightFace.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(43, 120).mirror().addBox(-0.4303F, -0.9244F, -0.8514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -1.1093F, 1.9532F, -0.8049F, -0.0952F, 0.0437F));

		PartDefinition head7_r7 = rightFace.addOrReplaceChild("head7_r7", CubeListBuilder.create().texOffs(117, 31).mirror().addBox(-0.4303F, -0.6958F, -0.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(119, 20).mirror().addBox(-0.4303F, -0.0958F, -0.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -1.1093F, 1.9532F, -0.229F, -0.0952F, 0.0437F));

		PartDefinition head9_r5 = rightFace.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(48, 120).mirror().addBox(-0.4303F, -0.7254F, -0.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -1.1093F, 1.9532F, -1.5205F, -0.0952F, 0.0437F));

		PartDefinition head7_r8 = rightFace.addOrReplaceChild("head7_r8", CubeListBuilder.create().texOffs(71, 117).mirror().addBox(-0.42F, -1.2506F, -1.5403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2864F, 0.9025F, 3.1363F, -1.0408F, -0.091F, 0.0519F));

		PartDefinition head7_r9 = rightFace.addOrReplaceChild("head7_r9", CubeListBuilder.create().texOffs(59, 84).mirror().addBox(-0.1F, -0.8068F, -2.2265F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2864F, 0.9025F, 3.1363F, -1.2942F, -0.0847F, 0.0616F));

		PartDefinition head4_r11 = rightFace.addOrReplaceChild("head4_r11", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.0231F, -4.7688F, -2.2805F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2864F, 0.9025F, 3.1363F, -0.046F, -0.091F, 0.0519F));

		PartDefinition head5_r7 = rightFace.addOrReplaceChild("head5_r7", CubeListBuilder.create().texOffs(84, 111).mirror().addBox(-0.5F, -1.4873F, -0.6127F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5843F, -0.9837F, 5.4681F, -0.5265F, 0.0869F, 0.0994F));

		PartDefinition head4_r12 = rightFace.addOrReplaceChild("head4_r12", CubeListBuilder.create().texOffs(36, 111).mirror().addBox(-0.5F, -0.917F, -0.7818F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5843F, -0.9837F, 5.4681F, -1.5563F, 0.0869F, 0.0994F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3581F, 1.9773F, -1.4163F, 0.2282F, -0.7691F, 0.7079F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(84, 9).addBox(-4.0F, -0.7F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.7482F, 0.0103F, 0.1644F, -1.1754F, 0.1128F, 0.047F));

		PartDefinition upperwing8_r2 = leftwing1.addOrReplaceChild("upperwing8_r2", CubeListBuilder.create().texOffs(108, 43).addBox(-1.8F, -2.6F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0724F, -0.0843F, 0.3928F, -0.879F, -0.9275F, -0.5853F));

		PartDefinition upperwing7_r1 = leftwing1.addOrReplaceChild("upperwing7_r1", CubeListBuilder.create().texOffs(113, 48).addBox(-1.0F, -1.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2482F, 0.7374F, -1.5909F, -1.1532F, 0.3375F, 0.1459F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2415F, 0.4758F, -1.3315F, -1.998F, 0.4378F, -2.6739F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(17, 81).addBox(-1.6072F, -2.9026F, -0.7631F, 2.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 72).addBox(-1.6072F, -2.9026F, 0.0369F, 2.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.5824F, -7.2594F, -1.8011F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4364F, 16.5119F, 0.461F, 0.0F, -1.5708F, 0.0785F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(23, 116).addBox(-1.5824F, -3.1517F, -0.6623F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4364F, 16.5119F, 0.461F, 0.0F, -1.5708F, 0.48F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(62, 36).addBox(-1.2501F, -1.3464F, 0.0202F, 2.0F, 22.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7356F, 17.7401F, -0.5254F, 0.1797F, 0.2226F, 0.5186F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0799F, -0.5164F, -0.654F, 2.0F, 1.0F, 26.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.206F, 20.9665F, 0.1838F, 1.4671F, 0.3755F, -0.3424F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 56).addBox(-0.6F, -1.0F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1025F, 0.1525F, 25.3321F, 0.1352F, 0.0277F, 0.7257F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(57, 14).addBox(-0.7F, -0.8995F, 0.2769F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.1407F, 0.121F, 0.0171F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(97, 18).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0528F, -0.2253F, 0.1507F, -2.1471F, 0.4613F, 0.445F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4296F, 1.9773F, -1.4163F, 0.198F, 0.5985F, -0.7555F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(93, 72).addBox(-3.0F, -0.7F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.7482F, 0.0103F, 0.1644F, -1.1754F, -0.1128F, -0.047F));

		PartDefinition upperwing9_r2 = rightwing1.addOrReplaceChild("upperwing9_r2", CubeListBuilder.create().texOffs(57, 108).addBox(-1.2F, -2.6F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0724F, -0.0843F, 0.3928F, -0.879F, 0.9275F, 0.5853F));

		PartDefinition upperwing8_r3 = rightwing1.addOrReplaceChild("upperwing8_r3", CubeListBuilder.create().texOffs(57, 113).addBox(-1.0F, -1.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2482F, 0.7374F, -1.5909F, -1.1532F, -0.3375F, -0.1459F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2415F, 0.4758F, -1.3315F, -2.1547F, -0.8222F, 2.9341F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(24, 81).addBox(-0.3928F, -2.9026F, -0.7631F, 2.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 81).addBox(-0.3928F, -2.9026F, 0.0369F, 2.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing10_r2 = rightwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(112, 7).addBox(0.5824F, -7.2594F, -1.8011F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.4364F, 16.5119F, 0.461F, 0.0F, 1.5708F, -0.0785F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(92, 116).addBox(0.5824F, -3.1517F, -0.6623F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.4364F, 16.5119F, 0.461F, 0.0F, 1.5708F, -0.48F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(62, 60).addBox(-0.7499F, -1.3464F, 0.0202F, 2.0F, 22.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7356F, 17.7401F, -0.5254F, 0.2154F, -0.497F, -0.7504F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.9201F, -0.5164F, -0.654F, 2.0F, 1.0F, 26.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.206F, 20.9665F, 0.1838F, 1.4843F, -0.3796F, 0.2956F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(31, 56).addBox(-0.4F, -1.0F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1025F, 0.1525F, 25.3321F, 0.1352F, -0.0277F, -0.7257F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(57, 25).addBox(-0.3F, -0.8995F, 0.2769F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.1407F, -0.121F, -0.0171F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(0, 100).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0528F, -0.2253F, 0.1507F, -1.6637F, -0.1702F, -0.8462F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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