package fossils.fossils.client.blockentity.model.caiuajara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CaiuajaraFossilModel extends SkullModelBase {
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

	public CaiuajaraFossilModel(ModelPart root) {
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

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.025F, -0.5694F, -0.1836F, 0.0644F, -0.4081F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(59, 12).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0503F, -0.3905F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(10, 59).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 30).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(32, 5).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.6963F, -2.8469F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(18, 31).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6963F, -1.3469F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(47, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(42, 22).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(41, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(32, 5).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.6963F, -2.8469F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(18, 31).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6963F, -1.3469F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(47, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(42, 22).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r3 = chest1.addOrReplaceChild("chest3_r3", CubeListBuilder.create().texOffs(41, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.3F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(46, 12).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.1372F, 0.0865F, -0.0119F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(40, 58).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9744F, 4.4978F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(26, 44).addBox(0.0F, -0.5F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(50, 49).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2397F, 0.8793F, 3.034F, -0.6645F, -0.1083F, 0.5174F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.8044F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.011F, -0.6259F, 3.6737F, -0.8029F, 0.0F, -0.6545F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(37, 38).mirror().addBox(-0.5F, -0.8145F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2419F, 4.0576F, -1.0472F, 0.0F, -0.6545F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -0.5532F, -1.5217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 0).addBox(2.3F, -0.5532F, -1.5217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.4801F, 4.897F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(40, 24).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(40, 24).addBox(2.3F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.9801F, 4.497F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(33, 16).mirror().addBox(-0.1F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(33, 16).addBox(0.9F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.6746F, 3.5838F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(24, 19).mirror().addBox(-0.3F, -0.5279F, -2.5834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.6746F, 3.9838F, -0.2665F, -0.1854F, 0.0503F));

		PartDefinition chest6_r2 = body1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(31, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8436F, 2.3123F, 0.2054F, 0.1483F, -0.953F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-0.1956F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.011F, -0.6259F, 3.6737F, -0.8029F, 0.0F, 0.6545F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5F, -0.8145F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.2419F, 4.0576F, -1.0472F, 0.0F, 0.6545F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(24, 19).addBox(-0.7F, -0.5279F, -2.5834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -0.6746F, 3.9838F, -0.2665F, 0.1854F, -0.0503F));

		PartDefinition chest5_r5 = body1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(31, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8436F, 2.3123F, 0.2054F, -0.1483F, 0.953F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(5, 39).addBox(-0.5F, -1.0604F, 0.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.7F, -0.2823F, 0.2519F, -0.0722F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(18, 25).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.35F, 3.9F, 1.2186F, 0.1897F, -1.2344F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1435F, 3.9933F, 0.3866F, 0.7991F, 0.1376F, 0.3263F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(44, 41).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 45).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(21, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, 3.9665F, 0.196F, 0.9072F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(18, 25).mirror().addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.35F, 3.9F, 0.8259F, -0.1897F, 1.2344F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1435F, 3.9933F, 0.3866F, 0.3627F, -0.1376F, -0.3263F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(0.15F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 45).mirror().addBox(-0.95F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(21, 6).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, 3.9665F, 0.196F, 0.9945F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, -0.3927F, 0.2618F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(59, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1539F, -0.8135F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.9F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8445F, -0.5832F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.4178F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(30, 16).addBox(0.0F, -0.7178F, -2.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 52).addBox(0.0F, -0.7178F, -0.9187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -1.9832F, -0.3147F, 0.227F, -0.1627F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0178F, -2.8187F, -0.2916F, 0.3571F, -0.1882F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(43, 58).addBox(0.0F, -0.6F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 24).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.1519F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2456F, -2.8525F, 0.7137F, -0.3614F, 0.3876F));

		PartDefinition head10_r1 = head.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(15, 52).mirror().addBox(-0.5F, -1.0016F, -0.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 52).addBox(0.54F, -1.0016F, -0.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.52F, -0.4015F, -4.7309F, 2.0682F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-0.5F, -0.9275F, -0.9822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 57).mirror().addBox(-0.5F, -1.5275F, -0.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 57).addBox(0.54F, -1.5275F, -0.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 27).addBox(0.54F, -0.9275F, -0.9822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.52F, -1.0828F, -2.9735F, -3.0892F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-0.5F, -0.8642F, -0.9656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 56).addBox(0.54F, -0.8642F, -0.9656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.52F, 0.9202F, -2.1814F, -0.3927F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(52, 56).mirror().addBox(-0.5F, -1.0642F, -0.9656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(52, 56).addBox(0.54F, -1.0642F, -0.9656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.52F, 0.1811F, -1.8752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition head9_r2 = head.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(-0.5F, -2.0344F, -0.9242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(38, 50).addBox(0.54F, -2.0344F, -0.9242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.52F, -1.1003F, -2.8661F, 1.9635F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(33, 47).mirror().addBox(-0.5F, -1.829F, -0.9683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(33, 47).addBox(0.54F, -1.829F, -0.9683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.52F, -0.0007F, -3.2546F, 1.4748F, 0.0F, 0.0F));

		PartDefinition head8_r3 = head.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(32, 52).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 29).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 52).addBox(2.14F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 29).addBox(2.14F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.32F, 0.1014F, -0.0925F, -1.0559F, 0.0F, 0.0F));

		PartDefinition head8_r4 = head.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 21).mirror().addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.21F, -0.8552F, -1.5193F, -1.2828F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(37, 54).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.21F, -0.6621F, 0.1117F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head10_r2 = head.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.21F, -1.0518F, -0.3446F, -2.2777F, 0.0F, 0.0F));

		PartDefinition head9_r3 = head.addOrReplaceChild("head9_r3", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.21F, -1.0256F, -0.944F, -1.5272F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-0.5F, -1.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.21F, 0.5575F, -1.4544F, -0.096F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.21F, 0.8083F, -1.1271F, -0.9338F, 0.0F, 0.0F));

		PartDefinition head7_r3 = head.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-1.62F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 18).mirror().addBox(-1.83F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 18).addBox(0.83F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 35).addBox(0.62F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6682F, -0.9652F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head10_r3 = head.addOrReplaceChild("head10_r3", CubeListBuilder.create().texOffs(37, 54).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.21F, -0.6621F, 0.1117F, -3.1154F, 0.0F, 0.0F));

		PartDefinition head9_r4 = head.addOrReplaceChild("head9_r4", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.21F, -1.0518F, -0.3446F, -2.2777F, 0.0F, 0.0F));

		PartDefinition head8_r5 = head.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.21F, -1.0256F, -0.944F, -1.5272F, 0.0F, 0.0F));

		PartDefinition head8_r6 = head.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(54, 21).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 54).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.21F, -0.8552F, -1.5193F, -1.2828F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(49, 18).addBox(-0.5F, -1.6F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.21F, 0.5575F, -1.4544F, -0.096F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.21F, 0.8083F, -1.1271F, -0.9338F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0909F, -1.9385F, -0.4625F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.4591F, -1.896F, -1.5621F, 0.0F, 0.0F));

		PartDefinition head7_r4 = head.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(55, 46).addBox(-0.5F, -0.9999F, -0.5638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(51, 32).addBox(-0.5F, -0.4999F, -0.5638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.9709F, 1.9902F, -0.6021F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(5, 51).addBox(-0.5F, -0.1743F, -0.4074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.2609F, 2.0894F, -1.1432F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(45, 47).addBox(-0.5F, -2.3329F, 0.0139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3887F, -1.1587F, -1.3352F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(33, 20).addBox(-1.5F, 0.1F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.9381F, 0.6317F, -1.597F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4095F, -1.4869F, -1.0559F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(26, 47).addBox(-1.0F, -0.9957F, -0.8999F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.1742F, 1.0476F, -0.4974F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(54, 15).addBox(-0.5F, 0.1438F, 3.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 43).addBox(-0.5F, 0.1438F, 2.4383F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.9326F, -2.6832F, 0.2967F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(42, 18).addBox(-0.5F, -0.1939F, 1.1242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.9326F, -2.6832F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(49, 41).addBox(-0.5F, -1.2745F, -0.3233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -2.0723F, -2.6611F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head3_r4 = head.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(54, 12).addBox(-0.5F, -0.4745F, -0.4233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.9326F, -2.6832F, -0.9425F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(54, 40).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.0F, -2.0391F, -2.1299F, -0.0175F, 0.0F, 0.0F));

		PartDefinition head3_r5 = head.addOrReplaceChild("head3_r5", CubeListBuilder.create().texOffs(37, 43).addBox(-0.5F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -2.2818F, -1.5459F, -0.8552F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.995F, -1.3273F, -0.3316F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(9, 25).addBox(-0.5F, -0.2141F, -1.2375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, -1.9326F, -2.6832F, 0.1571F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5224F, -1.2924F, 0.0F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2832F, 0.202F, 0.3908F, 0.0F, 0.0F));

		PartDefinition jaw10_r1 = jaw2.addOrReplaceChild("jaw10_r1", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.9108F, -5.2007F, -0.384F, 0.0F, 0.0F));

		PartDefinition jaw9_r1 = jaw2.addOrReplaceChild("jaw9_r1", CubeListBuilder.create().texOffs(53, 9).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0962F, -4.63F, -0.3142F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw2.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(20, 57).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6279F, -3.8359F, 0.4189F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(52, 26).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 26).addBox(1.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.3906F, 0.0721F, -0.1571F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-0.5F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(56, 32).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(57, 24).addBox(1.5F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(56, 32).addBox(1.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, -0.5403F, -0.6303F, -0.384F, 0.0F, 0.0F));

		PartDefinition jaw5_r2 = jaw2.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(46, 8).mirror().addBox(-1.0F, -0.8307F, -1.7057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 8).addBox(0.4F, -0.8307F, -1.7057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 0.489F, -2.0906F, 0.2094F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw2.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(23, 40).mirror().addBox(-1.0F, -0.0307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(23, 40).addBox(0.4F, -0.0307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, -0.5F, -0.6F, 0.1222F, 0.0F, 0.0F));

		PartDefinition jaw13_r1 = jaw2.addOrReplaceChild("jaw13_r1", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-1.0F, -0.2809F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 3).mirror().addBox(-1.0F, -0.2809F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(43, 52).mirror().addBox(-1.0F, -0.2809F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.1272F, -5.9997F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw13_r2 = jaw2.addOrReplaceChild("jaw13_r2", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-1.0F, -0.6809F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.638F, -5.8831F, -0.2094F, 0.0F, 0.0F));

		PartDefinition jaw12_r1 = jaw2.addOrReplaceChild("jaw12_r1", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-1.0F, -0.6809F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6171F, -6.2825F, -0.0524F, 0.0F, 0.0F));

		PartDefinition jaw12_r2 = jaw2.addOrReplaceChild("jaw12_r2", CubeListBuilder.create().texOffs(12, 44).mirror().addBox(-1.0F, -0.2809F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.1272F, -5.9997F, 0.1047F, 0.0F, 0.0F));

		PartDefinition jaw9_r2 = jaw2.addOrReplaceChild("jaw9_r2", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-1.0F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 28).addBox(-0.6F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.2018F, -3.7198F, 0.1571F, 0.0F, 0.0F));

		PartDefinition jaw5_r3 = jaw2.addOrReplaceChild("jaw5_r3", CubeListBuilder.create().texOffs(5, 47).mirror().addBox(-1.0F, -0.2307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(5, 47).addBox(-0.6F, -0.2307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3F, -0.4245F, -3.7364F, 0.3316F, 0.0F, 0.0F));

		PartDefinition jaw4_r3 = jaw2.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-1.0F, -0.2307F, -2.0057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2093F)).mirror(false)
				.texOffs(30, 11).addBox(0.4F, -0.2307F, -2.0057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2093F)), PartPose.offsetAndRotation(-0.2F, -0.2911F, -1.9886F, -0.0698F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw2.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(39, 10).mirror().addBox(-1.0F, -0.2307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 10).addBox(0.4F, -0.2307F, -1.8057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.5F, -0.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition jaw12_r3 = jaw2.addOrReplaceChild("jaw12_r3", CubeListBuilder.create().texOffs(53, 6).addBox(0.0F, -0.2809F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 3).addBox(0.0F, -0.2809F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(43, 52).addBox(0.0F, -0.2809F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.1272F, -5.9997F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw12_r4 = jaw2.addOrReplaceChild("jaw12_r4", CubeListBuilder.create().texOffs(10, 56).addBox(0.0F, -0.6809F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.3F, 0.638F, -5.8831F, -0.2094F, 0.0F, 0.0F));

		PartDefinition jaw11_r1 = jaw2.addOrReplaceChild("jaw11_r1", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -0.6809F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.3F, 0.6171F, -6.2825F, -0.0524F, 0.0F, 0.0F));

		PartDefinition jaw11_r2 = jaw2.addOrReplaceChild("jaw11_r2", CubeListBuilder.create().texOffs(12, 44).addBox(0.0F, -0.2809F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3F, 0.1272F, -5.9997F, 0.1047F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw2.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(48, 5).addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, 1.0962F, -4.63F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9568F, -2.6969F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head4_r5 = head2.addOrReplaceChild("head4_r5", CubeListBuilder.create().texOffs(36, 29).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 2.0849F, -1.0359F, 0.0087F, 0.0F, 0.0F));

		PartDefinition head3_r6 = head2.addOrReplaceChild("head3_r6", CubeListBuilder.create().texOffs(23, 36).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 1.5589F, -2.0225F, -0.0262F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head9_r5 = head5.addOrReplaceChild("head9_r5", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-0.5F, -0.4142F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(25, 57).addBox(-0.1F, -0.4142F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 1.5849F, -0.8424F, 1.5533F, 0.0F, 0.0F));

		PartDefinition head8_r7 = head5.addOrReplaceChild("head8_r7", CubeListBuilder.create().texOffs(44, 33).mirror().addBox(-0.5F, -0.2793F, -0.3181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(44, 33).addBox(-0.1F, -0.2793F, -0.3181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2F, 2.0105F, -1.1585F, 1.1345F, 0.0F, 0.0F));

		PartDefinition head8_r8 = head5.addOrReplaceChild("head8_r8", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-0.5F, -0.6776F, -1.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(44, 37).addBox(-0.1F, -0.6776F, -1.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.2F, 1.6315F, -0.0556F, 0.5934F, 0.0F, 0.0F));

		PartDefinition head7_r5 = head5.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(27, 31).mirror().addBox(-0.5F, -0.6776F, -0.0663F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 31).addBox(-0.1F, -0.6776F, -0.0663F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.7499F, -1.7137F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head11_r2 = head4.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(53, 53).addBox(-0.5F, -0.0114F, -0.8984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.7888F, -1.1748F, 1.7453F, 0.0F, 0.0F));

		PartDefinition head10_r4 = head4.addOrReplaceChild("head10_r4", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.0114F, -0.7984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.7366F, -1.6721F, 1.4661F, 0.0F, 0.0F));

		PartDefinition head9_r6 = head4.addOrReplaceChild("head9_r6", CubeListBuilder.create().texOffs(57, 56).addBox(-0.5F, -0.0114F, -0.7984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -2.0378F, 0.8203F, 0.0F, 0.0F));

		PartDefinition head9_r7 = head4.addOrReplaceChild("head9_r7", CubeListBuilder.create().texOffs(48, 53).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.8607F, -3.4247F, 0.192F, 0.0F, 0.0F));

		PartDefinition head8_r9 = head4.addOrReplaceChild("head8_r9", CubeListBuilder.create().texOffs(37, 33).addBox(-0.5F, 0.1886F, -1.0984F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.95F, -4.5F, 1.2043F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(41, 4).addBox(-0.5F, -0.5625F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 2.2232F, -4.3226F, 1.4137F, 0.0F, 0.0F));

		PartDefinition head5_r4 = head4.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(19, 44).addBox(-1.0F, 0.9F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(21, 0).addBox(-1.0F, 0.9F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.35F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7836F, 4.6646F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest4_r1 = crest1.addOrReplaceChild("crest4_r1", CubeListBuilder.create().texOffs(12, 48).addBox(-0.5F, -1.9753F, 0.0053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2671F, -9.6413F, -3.0892F, 0.0F, 0.0F));

		PartDefinition crest5_r1 = crest1.addOrReplaceChild("crest5_r1", CubeListBuilder.create().texOffs(22, 50).addBox(-0.5F, -0.0186F, -0.3347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.044F, -8.721F, -0.7941F, 0.0F, 0.0F));

		PartDefinition crest4_r2 = crest1.addOrReplaceChild("crest4_r2", CubeListBuilder.create().texOffs(15, 55).addBox(-0.5F, -0.0186F, -0.0347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1652F, -9.1981F, -1.0734F, 0.0F, 0.0F));

		PartDefinition crest3_r1 = crest1.addOrReplaceChild("crest3_r1", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5F, -1.2186F, 1.2653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.342F, -11.086F, -1.3177F, 0.0F, 0.0F));

		PartDefinition crest8_r1 = crest1.addOrReplaceChild("crest8_r1", CubeListBuilder.create().texOffs(51, 36).addBox(-0.5F, -0.3506F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -4.2092F, -9.4572F, -0.2356F, 0.0F, 0.0F));

		PartDefinition crest8_r2 = crest1.addOrReplaceChild("crest8_r2", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.906F, -7.9678F, -1.3177F, 0.0F, 0.0F));

		PartDefinition crest7_r1 = crest1.addOrReplaceChild("crest7_r1", CubeListBuilder.create().texOffs(10, 52).addBox(-0.5F, -0.6437F, -0.5085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 1.7939F, -7.7524F, -1.6668F, 0.0F, 0.0F));

		PartDefinition crest7_r2 = crest1.addOrReplaceChild("crest7_r2", CubeListBuilder.create().texOffs(15, 58).addBox(-0.5F, -0.2506F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.7552F, -9.2084F, -0.4276F, 0.0F, 0.0F));

		PartDefinition crest6_r1 = crest1.addOrReplaceChild("crest6_r1", CubeListBuilder.create().texOffs(58, 9).addBox(-0.5F, -1.1506F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(58, 6).addBox(-0.5F, -0.8506F, -0.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.3621F, -10.16F, -0.672F, 0.0F, 0.0F));

		PartDefinition crest4_r3 = crest1.addOrReplaceChild("crest4_r3", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -1.6506F, -0.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.0741F, -10.7177F, -0.48F, 0.0F, 0.0F));

		PartDefinition crest3_r2 = crest1.addOrReplaceChild("crest3_r2", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.9617F, -0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.0F, -3.0741F, -10.7177F, -0.3229F, 0.0F, 0.0F));

		PartDefinition crest4_r4 = crest1.addOrReplaceChild("crest4_r4", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -0.9617F, -0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -2.2578F, -10.9323F, -0.2705F, 0.0F, 0.0F));

		PartDefinition crest3_r3 = crest1.addOrReplaceChild("crest3_r3", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -2.9617F, -0.0593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.6236F, -11.2606F, -0.1134F, 0.0F, 0.0F));

		PartDefinition crest3_r4 = crest1.addOrReplaceChild("crest3_r4", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, -4.7617F, 0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(24, 24).addBox(-0.5F, -3.8617F, -0.0593F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(0.0F, 4.42F, -11.4264F, -0.0436F, 0.0F, 0.0F));

		PartDefinition crest5_r2 = crest1.addOrReplaceChild("crest5_r2", CubeListBuilder.create().texOffs(55, 43).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 2.8193F, -8.8688F, -0.8814F, 0.0F, 0.0F));

		PartDefinition crest4_r5 = crest1.addOrReplaceChild("crest4_r5", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.027F)), PartPose.offsetAndRotation(0.0F, 3.317F, -8.9168F, -0.096F, 0.0F, 0.0F));

		PartDefinition crest3_r5 = crest1.addOrReplaceChild("crest3_r5", CubeListBuilder.create().texOffs(42, 55).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 2.6229F, -9.9059F, 0.5323F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.5F, -2.4F, -0.0229F, 0.2716F, -0.521F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(38, 47).addBox(-0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 45).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4709F, 0.2106F, -0.2119F, -1.6977F, 1.0403F, 2.7875F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(32, 36).addBox(-0.9072F, -2.9026F, -0.7631F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 38).addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(12, 39).addBox(-0.3631F, -1.2367F, -1.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0717F, 2.864F, -0.1798F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(18, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3415F, 4.754F, -0.649F, -0.0044F, 0.1681F, 0.5806F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1172F, 5.6557F, 0.301F, 1.8984F, 0.1508F, -2.7784F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(15, 11).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.309F, 0.4545F, 0.3265F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(9, 35).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, -0.3371F, -1.3691F, 0.4229F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.5F, -2.4F, -0.2917F, 0.2793F, -0.1116F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-1.75F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 45).mirror().addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4709F, 0.2106F, -0.2119F, -1.6699F, -0.8669F, -2.8215F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(-0.0928F, -2.9026F, -0.7631F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(12, 39).mirror().addBox(-0.6369F, -1.2367F, -1.3225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0717F, 2.864F, -0.1798F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(18, 36).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.3415F, 4.754F, -0.649F, -0.0141F, -0.6041F, -0.5303F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1172F, 5.6557F, 0.301F, 1.8984F, -0.1508F, 2.7784F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(15, 11).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.309F, -0.4545F, -0.3265F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.5F, -1.0F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 5.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(9, 35).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, -0.3371F, 1.3691F, -0.4229F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 63, 63);
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