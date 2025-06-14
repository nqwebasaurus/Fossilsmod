package fossils.fossils.client.blockentity.model.tapejara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TapejaraFossilModel extends SkullModelBase {
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

	public TapejaraFossilModel(ModelPart root) {
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

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.025F, -0.5694F, -0.6241F, 0.0F, 0.0F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0503F, -0.3905F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 11).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(30, 23).mirror().addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2F, -0.6963F, -2.8469F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(26, 6).mirror().addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.6963F, -1.3469F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(14, 29).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(36, 24).mirror().addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(26, 36).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest3_r4 = chest1.addOrReplaceChild("chest3_r4", CubeListBuilder.create().texOffs(30, 23).addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2F, -0.6963F, -2.8469F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(26, 6).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.6963F, -1.3469F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest2_r3 = chest1.addOrReplaceChild("chest2_r3", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.3F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest3_r5 = chest1.addOrReplaceChild("chest3_r5", CubeListBuilder.create().texOffs(14, 29).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(0, 16).addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest3_r6 = chest1.addOrReplaceChild("chest3_r6", CubeListBuilder.create().texOffs(36, 24).addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest2_r4 = chest1.addOrReplaceChild("chest2_r4", CubeListBuilder.create().texOffs(26, 36).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.1372F, -0.0865F, 0.0119F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9744F, 4.4978F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, -0.5F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 20).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.2397F, 0.8793F, 3.034F, -0.6645F, -0.1083F, 0.5174F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(43, 29).mirror().addBox(-0.1956F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(1.011F, -0.6259F, 3.6737F, -0.8029F, 0.0F, 0.6545F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(7, 34).mirror().addBox(-0.5F, -0.8145F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.2419F, 4.0576F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(37, 31).mirror().addBox(-0.5F, -0.5532F, -1.5217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 31).addBox(-3.3F, -0.5532F, -1.5217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, -0.4801F, 4.897F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(26, 39).addBox(-3.3F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.4F, -0.9801F, 4.497F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-1.9F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(0, 5).addBox(-2.9F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.4F, -0.6746F, 3.5838F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.7F, -0.5279F, -2.5834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6F, -0.6746F, 3.9838F, -0.2665F, 0.1854F, -0.0503F));

		PartDefinition chest5_r2 = body1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(18, 22).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8436F, 2.3123F, 0.2054F, -0.1483F, 0.953F));

		PartDefinition body3_r3 = body1.addOrReplaceChild("body3_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, -0.5279F, -2.5834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6F, -0.6746F, 3.9838F, -0.2665F, -0.1854F, 0.0503F));

		PartDefinition body4_r3 = body1.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(7, 34).addBox(-0.5F, -0.8145F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, -0.2419F, 4.0576F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body3_r4 = body1.addOrReplaceChild("body3_r4", CubeListBuilder.create().texOffs(43, 29).addBox(-0.8044F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.011F, -0.6259F, 3.6737F, -0.8029F, 0.0F, -0.6545F));

		PartDefinition body2_r2 = body1.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(42, 43).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.2397F, 0.8793F, 3.034F, -0.6645F, 0.1083F, -0.5174F));

		PartDefinition chest4_r5 = body1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(18, 22).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8436F, 2.3123F, 0.2054F, 0.1483F, -0.953F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(21, 36).addBox(-0.5F, -1.0604F, 0.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.7F, -0.2794F, -0.21F, 0.0597F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -0.35F, 3.9F, 0.2296F, -0.1274F, -0.4204F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 3.9933F, 0.3866F, 0.6682F, 0.1376F, 0.3263F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(12, 40).mirror().addBox(-1.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 39).mirror().addBox(-0.05F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0416F, 3.9665F, 0.196F, -0.3145F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -0.35F, 3.9F, 0.8841F, 0.1274F, 0.4204F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 3.9933F, 0.3866F, 0.8427F, -0.1376F, -0.3263F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(12, 40).addBox(0.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 39).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0416F, 3.9665F, 0.196F, -0.3145F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, -0.2626F, 0.0852F, -0.0189F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1539F, -0.8135F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.9F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8445F, -0.5832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(29, 17).addBox(-0.5F, -0.4178F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(45, 3).addBox(0.0F, -0.7178F, -2.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(0.0F, -0.7178F, -0.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -1.9832F, -0.2635F, 0.2127F, 0.255F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0178F, -2.8187F, -0.4101F, 0.0559F, 0.1654F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(10, 45).addBox(0.0F, -0.6F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 28).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.1519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0335F, -2.2161F, 0.9163F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(0.52F, -0.9447F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(35, 16).addBox(-0.52F, -0.9447F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.6722F, -5.3058F, 2.9758F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(8, 29).mirror().addBox(0.52F, -1.0F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 29).addBox(-0.52F, -1.0F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6804F, -3.7552F, -2.6354F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(0.52F, -2.0421F, -0.976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 43).addBox(-0.52F, -2.0421F, -0.976F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5404F, -2.0965F, -0.2705F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(0.52F, -1.0157F, -0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(39, 0).addBox(-0.52F, -1.0157F, -0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.6596F, -3.4965F, -1.5446F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(0.52F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 43).addBox(-0.52F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -0.5722F, -4.5058F, 2.0682F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(42, 16).mirror().addBox(0.52F, -3.0121F, 0.0287F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(42, 16).addBox(-0.52F, -3.0121F, 0.0287F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5404F, -1.9965F, 1.7715F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(32, 42).mirror().addBox(0.82F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 42).addBox(-1.82F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1014F, -0.0925F, -0.8116F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(0.51F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(42, 10).mirror().addBox(0.83F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 36).mirror().addBox(0.62F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 10).addBox(-1.83F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 36).addBox(-1.62F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 39).addBox(-1.51F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5682F, -0.9652F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(20, 14).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0862F, -1.3866F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(44, 33).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 26).addBox(-1.5F, -0.5F, -0.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0275F, 0.0464F, -0.9163F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.1276F, -0.6794F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1553F, -2.4795F, -0.0175F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4432F, -0.5969F, 0.7679F, 0.0F, 0.0F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(5, 39).mirror().addBox(0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 39).addBox(-1.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2078F, -2.3027F, -0.0349F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(17, 8).addBox(-1.0F, -0.5307F, -5.1057F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3922F, 0.2973F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw5.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5F, 0.225F, -2.7882F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.8256F, 0.3974F, -0.0175F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.9F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw4.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(22, 42).addBox(-0.5F, -0.2087F, -0.9486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, 0.97F, -6.7413F, 2.9147F, 0.0F, 0.0F));

		PartDefinition jaw8_r2 = jaw4.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(20, 31).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, 0.0648F, -6.9258F, 2.8449F, 0.0F, 0.0F));

		PartDefinition jaw7_r1 = jaw4.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(37, 26).addBox(-0.5F, 0.0022F, 0.0216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, 1.1951F, -6.7906F, 2.1468F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw4.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(40, 6).addBox(-0.5F, -0.605F, -0.1635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.9951F, -6.0906F, 0.9076F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw4.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(32, 4).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.6626F, -5.0172F, 0.2269F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7922F, -2.9027F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6922F, -1.1027F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -2.6969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head2.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0252F, -3.8289F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 2.3F, -0.2F, -0.0087F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head5.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(14, 31).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0315F, -0.6556F, 0.4363F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head8_r3 = head4.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.0725F, -0.1984F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.95F, -4.5F, 1.2741F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head4.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(35, 8).addBox(-0.5F, 0.2027F, -2.4684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.45F, -4.6F, 1.309F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head4.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(37, 35).addBox(-1.0F, 0.9F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(10, 22).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.35F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2568F, 4.7531F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest4_r1 = crest1.addOrReplaceChild("crest4_r1", CubeListBuilder.create().texOffs(42, 23).addBox(-0.5F, -1.9753F, 0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.642F, -10.086F, -2.3998F, 0.0F, 0.0F));

		PartDefinition crest3_r1 = crest1.addOrReplaceChild("crest3_r1", CubeListBuilder.create().texOffs(14, 36).addBox(-0.5F, -1.0186F, -0.0347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.342F, -11.086F, -1.3177F, 0.0F, 0.0F));

		PartDefinition crest2_r1 = crest1.addOrReplaceChild("crest2_r1", CubeListBuilder.create().texOffs(36, 20).addBox(-0.5F, -0.9617F, -0.0593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.542F, -11.586F, -0.5847F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.5F, -2.4F, 0.0342F, -0.0752F, 0.4299F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(38, 13).mirror().addBox(-0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 43).mirror().addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4709F, 0.2106F, -0.2119F, -1.0706F, 1.1687F, -1.5106F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(10, 11).mirror().addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 36).mirror().addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(17, 40).mirror().addBox(-0.3631F, -1.2367F, -1.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(32, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3415F, 4.754F, -0.649F, 0.2645F, 0.1014F, 0.6665F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1172F, 5.6557F, 0.301F, 1.5615F, -0.5239F, -0.6187F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(11, 14).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.2889F, 0.2876F, 0.2714F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, -2.1762F, -0.0989F, -2.0846F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.5F, -2.4F, -0.0965F, -0.0117F, -0.4215F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(38, 13).addBox(-1.75F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 43).addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4709F, 0.2106F, -0.2119F, -1.0161F, -1.2064F, 1.4518F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(10, 11).addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 36).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(17, 40).addBox(-0.6369F, -1.2367F, -1.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3415F, 4.754F, -0.649F, 0.2229F, -0.1756F, -0.3673F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1172F, 5.6557F, 0.301F, 1.4864F, 0.5178F, 0.4679F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(11, 14).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.2889F, -0.2876F, -0.2714F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(30, 0).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, -2.6655F, 0.1393F, 2.0067F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 48, 48);
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