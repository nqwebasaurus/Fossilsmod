package fossils.fossils.client.blockentity.model.jianchangnathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JianchangnathusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
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

	public JianchangnathusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.body1 = this.chest1.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
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

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0681F, -1.5176F, -0.6241F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(45, 53).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0503F, -0.3905F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(59, 40).addBox(0.0F, -0.7F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 43).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(45, 43).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.2963F, -2.4469F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2963F, -0.9469F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(20, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(59, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(45, 43).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.2963F, -2.4469F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.2963F, -0.9469F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(20, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(59, 30).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(59, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(26, 28).addBox(-1.5F, 0.6F, -0.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(13, 26).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 0.1F, -0.0494F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(22, 49).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.032F, 3.5171F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(59, 37).addBox(0.0F, -0.5F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1576F, -0.0808F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(58, 24).addBox(-0.5F, -0.5F, -0.6869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(25, 57).addBox(-0.5F, -0.5F, -0.3131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.1318F, 2.6136F, 4.0665F, -0.8269F, 0.0282F, 0.1083F));

		PartDefinition chest7_r1 = body1.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1564F, 3.6123F, -0.0728F, -0.1669F, -0.6838F));

		PartDefinition chest8_r1 = body1.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1564F, 3.6123F, 0.0371F, -0.1782F, -1.3041F));

		PartDefinition chest6_r2 = body1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(47, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1564F, 1.6123F, 0.1826F, 0.0458F, -0.6994F));

		PartDefinition chest7_r2 = body1.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(39, 31).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1564F, 1.6123F, 0.1239F, 0.142F, -1.3057F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(-0.0369F, 0.9758F, -0.0098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.9031F, -0.7859F, 0.0386F, -0.5263F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-0.3059F, -0.5403F, -0.6344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.9031F, -0.9139F, -0.0848F, -0.6498F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-0.3059F, -0.5942F, -0.2612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.9031F, -1.1582F, -0.0848F, -0.6498F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(48, 3).mirror().addBox(-0.3F, -0.7911F, -0.3333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 3).addBox(2.5F, -0.7911F, -0.3333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.3031F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(42, 17).mirror().addBox(0.1F, -0.6245F, -1.1093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 17).addBox(1.1F, -0.6245F, -1.1093F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.9031F, -0.4014F, 0.0F, 0.0F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-0.3049F, -0.6245F, -2.9088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.8678F, 5.9031F, -0.2336F, -0.1766F, 0.0758F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(10, 53).addBox(-0.9631F, 0.9758F, -0.0098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6F, 0.8678F, 5.9031F, -0.7859F, -0.0386F, 0.5263F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(5, 53).addBox(-0.6941F, -0.5403F, -0.6344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6F, 0.8678F, 5.9031F, -0.9139F, 0.0848F, 0.6498F));

		PartDefinition body5_r4 = body1.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(47, 31).addBox(-0.6941F, -0.5942F, -0.2612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.8678F, 5.9031F, -1.1582F, 0.0848F, 0.6498F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(38, 21).addBox(-0.6951F, -0.6245F, -2.9088F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.8678F, 5.9031F, -0.2336F, 0.1766F, -0.0758F));

		PartDefinition body2_r2 = body1.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(39, 26).addBox(-0.5F, 0.0431F, 0.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1576F, 4.0192F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2_r3 = body1.addOrReplaceChild("body2_r3", CubeListBuilder.create().texOffs(13, 28).addBox(-1.5F, -0.9515F, -2.9056F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9424F, 4.1192F, 0.2967F, 0.0F, 0.0F));

		PartDefinition chest7_r3 = body1.addOrReplaceChild("chest7_r3", CubeListBuilder.create().texOffs(51, 19).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1564F, 3.6123F, 0.0371F, 0.1782F, 1.3041F));

		PartDefinition chest6_r3 = body1.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(30, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1564F, 3.6123F, -0.0728F, 0.1669F, 0.6838F));

		PartDefinition chest6_r4 = body1.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(39, 31).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1564F, 1.6123F, 0.1239F, -0.142F, 1.3057F));

		PartDefinition chest5_r5 = body1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(47, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1564F, 1.6123F, 0.1826F, -0.0458F, 0.6994F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, -0.4684F, -0.0634F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6975F, 6.8519F, 0.6432F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, -0.4684F, -0.0634F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.009F, 2.7893F, 0.4266F, 0.076F, 0.0429F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4997F, -0.0911F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0283F, 6.9994F, 0.2159F, 0.087F, 0.0074F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(16, 38).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4601F, 0.8564F, 5.4692F, -0.1631F, -0.1274F, -0.4204F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 3.9933F, 0.3866F, 0.7593F, 0.1076F, 0.3583F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(25, 48).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 25).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(11, 33).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, 3.9665F, 0.196F, -0.0927F, 0.0938F, 0.0177F));

		PartDefinition feet6_r1 = leftfoot.addOrReplaceChild("feet6_r1", CubeListBuilder.create().texOffs(36, 43).addBox(-0.4F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8F, 0.3F, 0.0F, 0.2265F, -0.5556F, -0.121F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(16, 38).mirror().addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4601F, 0.8564F, 5.4692F, 0.0551F, 0.1274F, 0.4204F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 3.9933F, 0.3866F, 0.7593F, -0.1076F, -0.3583F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(25, 48).mirror().addBox(0.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 25).mirror().addBox(-0.95F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, 3.9665F, 0.196F, -0.3545F, -0.0938F, -0.0177F));

		PartDefinition feet7_r1 = rightfoot.addOrReplaceChild("feet7_r1", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-0.6F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8F, 0.3F, 0.0F, 0.2265F, 0.5556F, 0.121F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, -0.1772F, -0.1719F, 0.0306F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(38, 59).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1539F, -0.8135F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(48, 7).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8445F, -0.5832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(45, 38).addBox(-0.5F, -0.4178F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(35, 59).addBox(0.0F, -0.6178F, -1.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4119F, -1.1294F, -0.3352F, -0.5416F, 0.1777F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0178F, -2.8187F, -0.608F, -0.4131F, -0.5232F));

		PartDefinition neck3_r1 = neck3.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(55, 6).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.1519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0527F, -0.5388F, 1.7645F, -0.1879F, -1.034F));

		PartDefinition head10_r1 = head.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(0.56F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(51, 11).addBox(1.08F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.32F, -1.9702F, -4.8978F, -1.4748F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(56, 21).mirror().addBox(-0.53F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(56, 21).addBox(0.55F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.51F, -1.2194F, -4.1212F, -2.81F, 0.0F, 0.0F));

		PartDefinition head11_r2 = head.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-0.53F, -0.1304F, -0.07F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(30, 56).addBox(0.55F, -0.1304F, -0.07F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.51F, -0.6655F, -3.6054F, 2.8711F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(35, 56).mirror().addBox(-0.53F, -0.9022F, -0.9156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 56).mirror().addBox(-0.53F, -0.9022F, -1.2156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(40, 56).addBox(0.55F, -0.9022F, -1.2156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(35, 56).addBox(0.55F, -0.9022F, -0.9156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.51F, -1.8194F, -3.9212F, -3.0718F, 0.0F, 0.0F));

		PartDefinition head10_r2 = head.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.53F, -0.1498F, -0.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(20, 56).addBox(0.55F, -0.1498F, -0.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.51F, -0.5655F, -2.8054F, 2.9932F, 0.0F, 0.0F));

		PartDefinition head11_r3 = head.addOrReplaceChild("head11_r3", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-0.5F, -2.2231F, -0.5485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(12, 49).mirror().addBox(-0.5F, -1.7231F, -0.5485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(54, 37).addBox(1.14F, -2.2231F, -0.5485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(12, 49).addBox(1.14F, -1.7231F, -0.5485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.82F, 0.2111F, -0.97F, -1.1781F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 53).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 53).addBox(1.14F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 52).addBox(1.14F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.82F, 0.1111F, -0.47F, -1.021F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-0.5F, -0.3191F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(30, 52).addBox(1.14F, -0.3191F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.82F, -0.4889F, 0.43F, -1.405F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.5F, -0.2999F, -0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(25, 54).addBox(1.14F, -0.2999F, -0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.82F, -0.4889F, -0.97F, -1.0908F, 0.0F, 0.0F));

		PartDefinition head11_r4 = head.addOrReplaceChild("head11_r4", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-0.5F, -0.3046F, 0.0448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(54, 31).mirror().addBox(-0.5F, -0.3046F, -0.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 34).addBox(1.14F, -0.3046F, 0.0448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(54, 31).addBox(1.14F, -0.3046F, -0.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.82F, -0.1889F, -1.27F, -0.6196F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-1.52F, -0.007F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(56, 15).addBox(-0.48F, -0.007F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1682F, -1.9652F, -2.5395F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(49, 48).mirror().addBox(-1.52F, -0.0185F, 0.0653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(49, 48).addBox(-0.48F, -0.0185F, 0.0653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.7682F, -0.3652F, -1.2828F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(55, 3).mirror().addBox(-1.52F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(55, 3).addBox(-0.48F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.4682F, -0.7652F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-1.52F, 0.0314F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 56).addBox(-0.48F, 0.0314F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3682F, -1.0652F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head7_r4 = head.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-1.64F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 52).mirror().addBox(-1.85F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 52).addBox(-0.15F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 27).addBox(-0.36F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.4682F, -0.9652F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head9_r2 = head.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-1.52F, 0.0505F, -0.9733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(56, 18).addBox(-0.48F, 0.0505F, -0.9733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.9682F, -2.4652F, -2.9583F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(42, 12).addBox(-1.0F, -0.0196F, -0.9001F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(-1.0F, -0.0196F, -0.0001F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.3862F, -1.7866F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0045F, 0.589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(54, 55).addBox(-0.5F, 0.0045F, -0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.8275F, 1.0464F, -1.3003F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(54, 49).addBox(-0.5F, 0.0109F, -0.0111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4275F, 0.2464F, -0.637F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(36, 38).addBox(-1.0F, -0.3807F, -1.9489F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1275F, 0.6464F, -1.117F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(38, 33).addBox(-0.5F, 0.0243F, -2.9735F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4553F, 0.2205F, -0.0524F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8138F, -0.6593F, -0.4538F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1834F, -2.702F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4394F, 0.3975F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw2.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-0.302F, -0.7742F, -0.7545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 53).mirror().addBox(-0.302F, -1.0742F, -0.7545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.6987F, -6.935F, 0.5429F, 0.2097F, -0.6247F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.0105F, -0.5622F, -0.531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 58).mirror().addBox(-0.0105F, -1.0622F, -0.531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.3987F, -6.235F, 0.4556F, 0.2097F, -0.6247F));

		PartDefinition jaw5_r2 = jaw2.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(53, 28).mirror().addBox(-0.2F, -1.1759F, -0.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(54, 40).mirror().addBox(-0.2F, -0.8759F, -0.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 43).mirror().addBox(-0.2F, -0.8759F, 0.7368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 46).mirror().addBox(-0.2F, -0.5759F, 1.7368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.1987F, -5.635F, 0.2811F, 0.2097F, -0.6247F));

		PartDefinition jaw5_r3 = jaw2.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(15, 53).addBox(-0.698F, -0.7742F, -0.7545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 53).addBox(-0.698F, -1.0742F, -0.7545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4F, 1.6987F, -6.935F, 0.5429F, -0.2097F, 0.6247F));

		PartDefinition jaw5_r4 = jaw2.addOrReplaceChild("jaw5_r4", CubeListBuilder.create().texOffs(55, 58).addBox(-0.9895F, -1.0622F, -0.531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(50, 58).addBox(-0.9895F, -0.5622F, -0.531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 1.3987F, -6.235F, 0.4556F, -0.2097F, 0.6247F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(53, 28).addBox(-0.8F, -1.1759F, -0.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 46).addBox(-0.8F, -0.5759F, 1.7368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 43).addBox(-0.8F, -0.8759F, 0.7368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 40).addBox(-0.8F, -0.8759F, -0.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 1.1987F, -5.635F, 0.2811F, -0.2097F, 0.6247F));

		PartDefinition jaw3_r1 = jaw2.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(25, 21).mirror().addBox(-0.8F, -0.0307F, -5.0057F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -1.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(25, 21).addBox(-0.2F, -0.0307F, -5.0057F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw5_r5 = jaw5.addOrReplaceChild("jaw5_r5", CubeListBuilder.create().texOffs(37, 48).addBox(-0.5F, 0.0078F, -1.918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8744F, -0.6026F, 0.192F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.9F, -0.0456F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8166F, -3.302F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7166F, -1.502F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -2.6969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head2.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(16, 44).mirror().addBox(-0.4324F, -1.0166F, -0.2915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(16, 44).addBox(0.1676F, -1.0166F, -0.2915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.3676F, 0.413F, -2.4497F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head2.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(27, 33).addBox(-1.0F, -1.006F, -2.9245F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 1.8F, 2.0F, -0.4625F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head7_r5 = head5.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(53, 25).addBox(-0.5F, -0.1186F, -1.5369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 59).addBox(-0.5F, -0.1186F, -0.7369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.3685F, -0.6556F, 0.2967F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head9_r3 = head4.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(56, 12).addBox(-0.5F, -0.998F, -1.7736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(44, 48).addBox(-0.5F, -2.998F, -0.9736F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.15F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head9_r4 = head4.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-0.0518F, -0.6338F, -1.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4327F, -4.9664F, 0.734F, 0.2442F, 0.4276F));

		PartDefinition head8_r3 = head4.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(-0.3F, -0.3455F, -1.3572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7327F, -4.6664F, 1.083F, 0.2442F, 0.4276F));

		PartDefinition head9_r5 = head4.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.3251F, -0.3497F, -0.6768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 59).mirror().addBox(-0.3251F, -0.3497F, -0.9768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3676F, 1.1996F, -3.9506F, 1.2461F, 0.211F, 0.545F));

		PartDefinition head10_r3 = head4.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5709F, 1.7837F, -2.84F, 1.1773F, 0.1824F, 0.4609F));

		PartDefinition head11_r5 = head4.addOrReplaceChild("head11_r5", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4535F, 2.0463F, -1.637F, 1.3082F, 0.1824F, 0.4609F));

		PartDefinition head12_r2 = head4.addOrReplaceChild("head12_r2", CubeListBuilder.create().texOffs(10, 57).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4327F, 2.2015F, -1.1621F, 1.4479F, 0.1824F, 0.4609F));

		PartDefinition head5_r2 = head4.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(17, 49).mirror().addBox(-0.8F, 0.2785F, -0.9802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(17, 49).addBox(-0.2F, 0.2785F, -0.9802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, -0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head8_r4 = head4.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(45, 56).addBox(-0.9482F, -0.6338F, -1.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.4327F, -4.9664F, 0.734F, -0.2442F, -0.4276F));

		PartDefinition head11_r6 = head4.addOrReplaceChild("head11_r6", CubeListBuilder.create().texOffs(10, 57).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4327F, 2.2015F, -1.1621F, 1.4479F, -0.1824F, -0.4609F));

		PartDefinition head10_r4 = head4.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(5, 57).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4535F, 2.0463F, -1.637F, 1.3082F, -0.1824F, -0.4609F));

		PartDefinition head9_r6 = head4.addOrReplaceChild("head9_r6", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5709F, 1.7837F, -2.84F, 1.1773F, -0.1824F, -0.4609F));

		PartDefinition head9_r7 = head4.addOrReplaceChild("head9_r7", CubeListBuilder.create().texOffs(15, 59).addBox(-0.6749F, -0.3497F, -0.9768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 59).addBox(-0.6749F, -0.3497F, -0.6768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3676F, 1.1996F, -3.9506F, 1.2461F, -0.211F, -0.545F));

		PartDefinition head7_r6 = head4.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(30, 48).addBox(-0.7F, -0.3455F, -1.3572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 0.7327F, -4.6664F, 1.083F, -0.2442F, -0.4276F));

		PartDefinition head6_r2 = head4.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(7, 49).addBox(-0.5F, -2.0241F, -0.0459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.55F, -2.9F, 1.1519F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head4.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(56, 9).addBox(-0.5F, -0.0215F, -0.9802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2568F, 4.7531F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.124F, 1.508F, -1.6002F, 0.5466F, -1.0342F, 0.3751F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.7F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3246F, 0.0368F, 0.2605F, -1.1639F, 0.2575F, 0.1093F));

		PartDefinition upperwing7_r1 = leftwing1.addOrReplaceChild("upperwing7_r1", CubeListBuilder.create().texOffs(35, 52).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7463F, -0.2855F, -0.8231F, -2.0317F, 0.0853F, -2.1427F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(11, 38).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 33).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(49, 52).addBox(-0.1511F, 3.2736F, -3.1009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(51, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6649F, 8.4184F, -0.4154F, 0.3349F, 0.2623F, 0.8907F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5799F, -0.5164F, 0.346F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.17F, 2.2328F, 0.3069F, 1.2659F, -0.5762F, -0.6295F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1226F, 0.5025F, 5.2223F, 0.2871F, -0.2658F, 0.1099F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5033F, -0.1277F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.4F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(47, 21).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1941F, -0.2764F, 0.7256F, -0.7055F, 0.5346F, 0.4364F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.124F, 1.508F, -1.6002F, 0.5466F, 1.0342F, -0.3751F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-2.3F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3246F, 0.0368F, 0.2605F, -1.1639F, -0.2575F, -0.1093F));

		PartDefinition upperwing8_r2 = rightwing1.addOrReplaceChild("upperwing8_r2", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7463F, -0.2855F, -0.8231F, -2.0317F, -0.0853F, 2.1427F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 33).mirror().addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.8489F, 3.2736F, -3.1009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6649F, 8.4184F, -0.4154F, 0.3349F, -0.2623F, -0.8907F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.4201F, -0.5164F, 0.346F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.17F, 2.2328F, 0.3069F, 1.1662F, 0.5154F, 0.438F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1226F, 0.5025F, 5.2223F, 0.2871F, 0.2658F, -0.1099F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.5033F, -0.1277F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 9.4F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1941F, -0.2764F, 0.7256F, -0.8403F, -0.4391F, -0.335F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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