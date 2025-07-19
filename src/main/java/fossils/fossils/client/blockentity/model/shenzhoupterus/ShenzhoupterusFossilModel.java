package fossils.fossils.client.blockentity.model.shenzhoupterus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShenzhoupterusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart jaw5;
	private final ModelPart shape64;
	private final ModelPart underneck3;
	private final ModelPart gums1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart lips1;
	private final ModelPart lips2;
	private final ModelPart head4;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;

	public ShenzhoupterusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.body1 = this.chest1.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.jaw5 = this.jaw3.getChild("jaw5");
		this.shape64 = this.jaw5.getChild("shape64");
		this.underneck3 = this.jaw.getChild("underneck3");
		this.gums1 = this.jaw.getChild("gums1");
		this.head2 = this.head.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.lips1 = this.head3.getChild("lips1");
		this.lips2 = this.head3.getChild("lips2");
		this.head4 = this.head2.getChild("head4");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 28.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.25F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4776F, 2.2083F, -0.1522F, 0.1022F, -0.6749F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(56, 25).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 37).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(29, 37).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.6963F, -2.8469F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6963F, -1.3469F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(42, 27).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(29, 37).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.6963F, -2.8469F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6963F, -1.3469F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(54, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(42, 27).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(48, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(11, 31).addBox(-1.5F, -0.5F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.0262F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(53, 20).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2112F, 0.1297F, -0.0179F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(5, 44).addBox(0.0F, -0.2F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3428F, 3.5752F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(56, 28).addBox(0.0F, -0.5F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 25).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4684F, -0.0226F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.3F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(49, 31).mirror().addBox(-0.3F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.6867F, 0.964F, 1.9508F, -1.1013F, -0.2719F, -0.6165F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-0.8044F, -0.7841F, -0.1476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 50).mirror().addBox(-0.8044F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.011F, 0.0056F, 2.7512F, -0.8029F, 0.0F, -0.6545F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 42).addBox(2.3F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 0.0129F, 3.4686F, 0.2705F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(46, 55).addBox(2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.3486F, 3.5744F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-0.1F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 23).addBox(0.9F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.043F, 2.6613F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-0.3F, -0.5279F, -2.6834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.043F, 3.0613F, -0.1268F, -0.1854F, 0.0503F));

		PartDefinition chest6_r2 = body1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.212F, 1.3898F, 0.2054F, 0.1483F, -0.953F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(30, 55).addBox(-0.7F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(49, 31).addBox(-0.7F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.6867F, 0.964F, 1.9508F, -1.1013F, 0.2719F, 0.6165F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(15, 54).addBox(-0.1956F, -0.7841F, -0.1476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 50).addBox(-0.1956F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.011F, 0.0056F, 2.7512F, -0.8029F, 0.0F, 0.6545F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(11, 35).addBox(-0.7F, -0.5279F, -2.6834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -0.043F, 3.0613F, -0.1268F, 0.1854F, -0.0503F));

		PartDefinition chest5_r5 = body1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(33, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.212F, 1.3898F, 0.2054F, -0.1483F, 0.953F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(43, 42).addBox(-0.5F, -0.2053F, -0.0603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1663F, 4.099F, 0.0243F, 0.2039F, -0.078F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 0.2816F, 2.9774F, 0.5095F, 0.0453F, 1.5879F));

		PartDefinition upperleg7_r1 = rightleg1.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.5F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1669F, 4.6413F, -0.0605F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = rightleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(36, 46).mirror().addBox(0.1645F, -4.2167F, -0.7295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8606F, 3.7104F, -0.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0266F, 5.7318F, 0.1798F, 0.4685F, -0.2917F, -0.1681F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(14, 40).mirror().addBox(0.15F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 41).mirror().addBox(-0.7F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0885F, 2.7638F, 0.2437F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1711F, 6.9929F, 0.8682F, 1.4046F, -0.0804F, 0.024F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5385F, 1.2638F, 0.8437F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 0.2816F, 2.9774F, 0.8829F, -0.0962F, -1.3766F));

		PartDefinition upperleg8_r1 = leftleg1.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1669F, 4.6413F, -0.0605F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = leftleg1.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(36, 46).addBox(-1.1645F, -4.2167F, -0.7295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8606F, 3.7104F, -0.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0266F, 5.7318F, 0.1798F, 0.4685F, 0.2917F, 0.1681F));

		PartDefinition leg8_r1 = leftleg2.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(14, 40).addBox(-1.15F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 41).addBox(-0.3F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0885F, 2.7638F, 0.2437F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1711F, 6.9929F, 0.8682F, 1.4046F, 0.0804F, -0.024F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5385F, 1.2638F, 0.8437F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2925F, -3.1493F, -0.2346F, 0.2549F, -0.0602F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(35, 56).addBox(0.0F, -1.2113F, 1.9962F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6734F, -2.4728F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(38, 56).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1853F, -2.0641F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(37, 18).addBox(-0.5F, -1.1005F, -0.1095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6734F, -2.4728F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(33, 24).addBox(-0.5F, -0.5F, -2.901F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(57, 0).addBox(0.0F, -0.8F, -1.901F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1207F, -2.5762F, -0.1863F, 0.4517F, 0.2035F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(5, 41).addBox(0.0F, -0.7036F, -1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0964F, -2.7411F, -0.1984F, 0.1616F, 0.3224F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(56, 22).addBox(0.0F, -0.6876F, 0.7874F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.5F, -0.3876F, -0.2126F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0929F, -3.8518F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0148F, -4.0109F, 0.658F, 0.0653F, 0.1119F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-0.8F, -0.4276F, 1.3206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 38).addBox(-0.1943F, -0.4276F, 1.3206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0029F, -1.5245F, -2.7236F, -0.0175F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(31, 51).mirror().addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0964F, 0.0355F, -0.4468F, -0.48F, -0.0013F, -0.0002F));

		PartDefinition head5_r2 = head.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(31, 31).mirror().addBox(-0.9F, -1.9666F, -0.0516F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(31, 31).addBox(-0.0943F, -1.9666F, -0.0516F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0029F, -1.9371F, -1.7962F, -2.0246F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(55, 13).addBox(0.3057F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4029F, 1.0434F, -1.5632F, -0.6632F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-1.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(20, 54).addBox(-0.1943F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0971F, 0.696F, -1.2036F, -0.8029F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(54, 37).addBox(-0.1943F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0971F, 0.4145F, -0.9153F, -1.2392F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(31, 51).addBox(0.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0964F, 0.0355F, -0.4468F, -0.48F, 0.0013F, 0.0002F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(21, 6).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0046F, -1.043F, 0.0982F, -1.2566F, 0.0F, 0.0F));

		PartDefinition head5_r3 = head.addOrReplaceChild("head5_r3", CubeListBuilder.create().texOffs(48, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0029F, -2.8393F, -0.1333F, -0.4887F, 0.0F, 0.0F));

		PartDefinition head4_r4 = head.addOrReplaceChild("head4_r4", CubeListBuilder.create().texOffs(48, 8).addBox(-0.5F, -0.7942F, -0.1623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0029F, -2.8168F, -1.3304F, -0.6632F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(54, 34).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0029F, -2.0168F, -0.9304F, -0.5061F, 0.0F, 0.0F));

		PartDefinition head3_r4 = head.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(22, 31).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0029F, -1.6383F, -0.1213F, -0.1396F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(54, 31).addBox(-0.5F, 0.9778F, -0.0196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0029F, -3.3245F, -0.5236F, -0.4014F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0029F, 1.7481F, -1.519F, -0.0611F, 0.0009F, 0.0001F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(41, 50).mirror().addBox(-0.1F, -0.7995F, -0.4999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 50).addBox(1.1064F, -0.7995F, -0.4999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0061F, 0.2397F, -0.5955F, -0.5585F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0003F, 0.2702F, 0.0232F, 0.3471F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(-0.9F, -0.7594F, -2.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(29, 47).addBox(-0.0936F, -0.7594F, -2.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.0064F, 0.1F, -3.2F, 0.1833F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.9F, -0.7849F, -0.2535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(50, 0).addBox(-0.0936F, -0.7849F, -0.2535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0064F, 0.2F, -3.6F, 0.096F, 0.0F, 0.0F));

		PartDefinition jaw3_r2 = jaw2.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.9F, -0.2425F, -4.8075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 18).addBox(-0.0936F, -0.2425F, -4.8075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0064F, -0.6F, -0.6F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw5.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(39, 5).addBox(-0.5F, -0.7107F, -2.7294F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -0.1283F, -3.1148F, -0.3578F, 0.0F, 0.0F));

		PartDefinition jaw7_r1 = jaw5.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(49, 27).addBox(-0.5F, -0.4612F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.7866F, -3.1288F, -0.1484F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw5.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5F, -0.4404F, -3.5392F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -0.7283F, -2.9148F, -0.2007F, 0.0F, 0.0F));

		PartDefinition jaw8_r2 = jaw5.addOrReplaceChild("jaw8_r2", CubeListBuilder.create().texOffs(55, 46).addBox(-0.5F, -1.205F, -0.3912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F))
				.texOffs(19, 50).addBox(-0.5F, -0.805F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.6717F, -0.9148F, 0.1396F, 0.0F, 0.0F));

		PartDefinition jaw6_r2 = jaw5.addOrReplaceChild("jaw6_r2", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, -0.0795F, -0.3825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.8283F, -2.9148F, -0.3491F, 0.0F, 0.0F));

		PartDefinition jaw5_r2 = jaw5.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, -0.3032F, 0.0021F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.8283F, -2.9148F, -0.1658F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0003F, 0.6702F, -3.1768F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0003F, 0.5702F, -1.3768F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0029F, -0.326F, -2.941F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head2_r3 = head2.addOrReplaceChild("head2_r3", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.9858F, -4.6221F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head5.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(26, 18).addBox(-0.5F, -0.6863F, -1.529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9315F, -3.1556F, 0.4189F, 0.0F, 0.0F));

		PartDefinition head8_r2 = head5.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(12, 49).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9941F, -2.0653F, 0.2443F, -0.0005F, -0.0002F));

		PartDefinition head7_r1 = head5.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5F, -0.8268F, -3.7283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.4315F, 0.0444F, 0.0524F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head5.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5002F, -0.2689F, -0.3579F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 1.5315F, -5.9556F, 0.384F, -0.0002F, -0.0001F));

		PartDefinition head6_r1 = head5.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5008F, -0.721F, -4.7329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.5315F, -2.7556F, 0.1396F, -0.0002F, -0.0001F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head16_r1 = head4.addOrReplaceChild("head16_r1", CubeListBuilder.create().texOffs(5, 49).addBox(-0.5F, -0.1F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F))
				.texOffs(48, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1062F, 4.2209F, 0.1396F, 0.0F, 0.0F));

		PartDefinition head13_r1 = head4.addOrReplaceChild("head13_r1", CubeListBuilder.create().texOffs(36, 52).addBox(-0.5F, -1.0924F, -0.0449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.55F, 3.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head4.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(41, 46).addBox(-0.5F, -0.2034F, -0.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.65F, 2.1F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head11_r1 = head4.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(46, 18).addBox(-0.5F, -0.3549F, -0.2416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, -1.45F, 0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head4.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(50, 42).addBox(-0.5F, -0.254F, -0.2567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.05F, -0.9F, 0.3142F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head4.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(40, 29).addBox(-0.5F, -0.1936F, -0.293F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.05F, -3.2F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head8_r3 = head4.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.1936F, -2.793F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.05F, -3.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition head8_r4 = head4.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(53, 54).addBox(-1.0012F, -0.1278F, -0.1138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5003F, -0.208F, 0.8367F, 0.1396F, 0.0016F, -0.0001F));

		PartDefinition head7_r3 = head4.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(41, 54).addBox(-1.0F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5003F, 0.692F, 1.5367F, -0.384F, 0.0016F, -0.0001F));

		PartDefinition head6_r2 = head4.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(29, 42).addBox(-1.0028F, -1.9004F, -0.1755F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5F, 1.1843F, -0.3814F, -0.8901F, 0.0016F, -0.0001F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0035F, -0.0871F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.6843F, -0.8814F, -0.4887F, 0.0013F, -0.0001F));

		PartDefinition head5_r4 = head4.addOrReplaceChild("head5_r4", CubeListBuilder.create().texOffs(47, 34).addBox(-0.9999F, 1.5707F, -1.0489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.3843F, 1.4186F, -0.6807F, 0.0016F, -0.0001F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0029F, 0.7322F, -0.3366F));

		PartDefinition head8_r5 = bone.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-0.5F, -1.5941F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 55).mirror().addBox(-0.5F, -1.7941F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 55).addBox(1.1457F, -1.7941F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(53, 16).addBox(1.1457F, -1.5941F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8257F, 0.1067F, -0.9305F, -0.8552F, 0.0F, 0.0F));

		PartDefinition head7_r4 = bone.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(5, 53).addBox(1.1457F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.8257F, -0.3933F, -0.4305F, -0.9774F, 0.0F, 0.0F));

		PartDefinition head8_r6 = bone.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(26, 51).mirror().addBox(-0.3288F, -1.5709F, -0.507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(26, 51).addBox(1.1139F, -1.5709F, -0.507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.8954F, -0.8888F, -1.5292F, -0.9163F, 0.0F, 0.0F));

		PartDefinition head7_r5 = bone.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-0.3288F, -0.862F, -0.0808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 22).addBox(1.1139F, -0.862F, -0.0808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8954F, -1.5888F, -0.8292F, -1.2305F, 0.0F, 0.0F));

		PartDefinition head10_r2 = bone.addOrReplaceChild("head10_r2", CubeListBuilder.create().texOffs(55, 7).mirror().addBox(-0.3288F, -0.6832F, -0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(55, 7).addBox(1.1139F, -0.6832F, -0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.8954F, -1.8888F, -0.2292F, -2.2777F, 0.0F, 0.0F));

		PartDefinition head9_r2 = bone.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-0.3288F, -0.6936F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 4).addBox(1.1139F, -0.6936F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8954F, -1.7888F, -0.6292F, -1.4224F, 0.0F, 0.0F));

		PartDefinition head7_r6 = bone.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.3503F, -0.231F, 0.6724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 34).mirror().addBox(-0.4388F, -0.231F, 0.6724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)).mirror(false)
				.texOffs(25, 55).addBox(1.1354F, -0.231F, 0.6724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 34).addBox(0.2239F, -0.231F, 0.6724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)), PartPose.offsetAndRotation(-0.8954F, -2.5888F, -0.8292F, -0.9861F, 0.0F, 0.0F));

		PartDefinition head11_r2 = bone.addOrReplaceChild("head11_r2", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-0.3288F, -0.6603F, -0.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(55, 10).addBox(1.1139F, -0.6603F, -0.2895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.8954F, -1.5888F, 0.0708F, -2.9932F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.0F, -2.4F, -0.4435F, 0.3857F, -0.0804F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(39, 15).mirror().addBox(-2.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 53).mirror().addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7549F, 0.1825F, 0.4233F, -1.4079F, -0.8455F, 2.9161F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(-0.0928F, -1.9026F, -0.7631F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 42).mirror().addBox(-0.0928F, -1.9026F, 0.0369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, 1.8204F, -0.2518F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.6369F, 0.5633F, -2.1225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, 1.8204F, -0.2518F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(9, 40).mirror().addBox(-0.6393F, -0.1869F, -0.8325F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0869F, 5.8009F, 0.3333F, 0.4445F, -0.6088F, -0.6086F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3159F, 6.5818F, -0.136F, 1.962F, 0.9707F, -2.9828F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.5286F, -0.8024F, -0.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0678F, 0.2873F, 8.3099F, 0.1467F, 0.1095F, -0.1703F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(15, 11).mirror().addBox(-0.5F, -1.2F, -1.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0286F, 0.1976F, 5.0883F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, 1.2451F, -1.4993F, 2.6545F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.0F, -2.4F, -0.3351F, -0.1271F, -0.2207F));

		PartDefinition upperwing10_r1 = leftwing1.addOrReplaceChild("upperwing10_r1", CubeListBuilder.create().texOffs(39, 15).addBox(-0.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 53).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7549F, 0.1825F, 0.4233F, -1.1897F, 0.8455F, -2.9161F));

		PartDefinition wing12_r1 = leftwing2.addOrReplaceChild("wing12_r1", CubeListBuilder.create().texOffs(19, 42).addBox(-0.9072F, -1.9026F, -0.7631F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 42).addBox(-0.9072F, -1.9026F, 0.0369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4534F, 1.8204F, -0.2518F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(48, 50).addBox(-0.3631F, 0.5633F, -2.1225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4534F, 1.8204F, -0.2518F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(9, 40).addBox(-0.3607F, -0.1869F, -0.8325F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0869F, 5.8009F, 0.3333F, 0.0094F, 0.4544F, 0.5224F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3159F, 6.5818F, -0.136F, 1.7276F, -0.6783F, -2.8597F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 25).addBox(-0.4714F, -0.8024F, -0.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0678F, 0.2873F, 8.3099F, 0.1477F, 0.2522F, -0.6392F));

		PartDefinition wingfinger11_r1 = leftwing5.addOrReplaceChild("wingfinger11_r1", CubeListBuilder.create().texOffs(15, 11).addBox(-0.5F, -1.2F, -1.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0286F, 0.1976F, 5.0883F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, 1.2451F, 1.4993F, -2.6545F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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