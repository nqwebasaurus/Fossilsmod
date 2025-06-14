package fossils.fossils.client.blockentity.model.chaoyangopterus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChaoyangopterusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
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

	public ChaoyangopterusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.body1 = this.chest1.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 28.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.25F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4776F, 2.2083F, -0.5805F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = chest1.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(54, 23).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 5).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest5_r1 = chest1.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(33, 23).mirror().addBox(-0.6197F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.6963F, -2.8469F, 1.9477F, 0.6105F, -0.2383F));

		PartDefinition chest4_r1 = chest1.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(29, 29).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6963F, -1.3469F, 0.1767F, 0.4736F, 0.0813F));

		PartDefinition chest5_r2 = chest1.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.2362F, 0.0906F, -0.6958F));

		PartDefinition chest5_r3 = chest1.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(41, 8).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.2567F, 0.3201F, -1.2334F));

		PartDefinition chest4_r2 = chest1.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4436F, -2.2877F, 0.3904F, 0.1198F, -0.6404F));

		PartDefinition chest6_r1 = chest1.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6436F, -0.2877F, 0.1426F, 0.2093F, -1.3024F));

		PartDefinition chest4_r3 = chest1.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(33, 23).addBox(-0.3803F, -0.6653F, -2.8318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.6963F, -2.8469F, 1.9477F, -0.6105F, 0.2383F));

		PartDefinition chest3_r1 = chest1.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(29, 29).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.6963F, -1.3469F, 0.1767F, -0.4736F, -0.0813F));

		PartDefinition chest4_r4 = chest1.addOrReplaceChild("chest4_r4", CubeListBuilder.create().texOffs(53, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.2362F, -0.0906F, 0.6958F));

		PartDefinition chest4_r5 = chest1.addOrReplaceChild("chest4_r5", CubeListBuilder.create().texOffs(41, 8).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.2567F, -0.3201F, 1.2334F));

		PartDefinition chest3_r2 = chest1.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(53, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4436F, -2.2877F, 0.3904F, -0.1198F, 0.6404F));

		PartDefinition chest2_r2 = chest1.addOrReplaceChild("chest2_r2", CubeListBuilder.create().texOffs(26, 11).addBox(-1.5F, -0.5F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2791F, -1.0341F, -0.0262F, 0.0F, 0.0F));

		PartDefinition chest5_r4 = chest1.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(53, 36).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6436F, -0.2877F, 0.1426F, -0.2093F, 1.3024F));

		PartDefinition body1 = chest1.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1367F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(29, 43).addBox(0.0F, -0.2F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3428F, 3.5752F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(54, 26).addBox(0.0F, -0.5F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4684F, -0.0226F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body1.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(19, 52).mirror().addBox(-0.3F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(51, 43).mirror().addBox(-0.3F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.6867F, 0.964F, 1.9508F, -1.1013F, -0.2719F, -0.6165F));

		PartDefinition body6_r1 = body1.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-0.8044F, -0.7841F, -0.1476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 15).mirror().addBox(-0.8044F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.011F, 0.0056F, 2.7512F, -0.8029F, 0.0F, -0.6545F));

		PartDefinition body7_r1 = body1.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 0).addBox(2.3F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 0.0129F, 3.4686F, 0.2705F, 0.0F, 0.0F));

		PartDefinition body6_r2 = body1.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(24, 53).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(24, 53).addBox(2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-1.4F, -0.3486F, 3.5744F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body6_r3 = body1.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(37, 39).mirror().addBox(-0.1F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 39).addBox(0.9F, -0.6315F, -0.6971F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.043F, 2.6613F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body5_r2 = body1.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(20, 29).mirror().addBox(-0.3F, -0.5279F, -2.6834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.043F, 3.0613F, -0.1268F, -0.1854F, 0.0503F));

		PartDefinition chest6_r2 = body1.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(26, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.212F, 1.3898F, 0.2054F, 0.1483F, -0.953F));

		PartDefinition body4_r1 = body1.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(19, 52).addBox(-0.7F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(51, 43).addBox(-0.7F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.6867F, 0.964F, 1.9508F, -1.1013F, 0.2719F, 0.6165F));

		PartDefinition body5_r3 = body1.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(51, 19).addBox(-0.1956F, -0.7841F, -0.1476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(51, 15).addBox(-0.1956F, -0.7841F, -0.4476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.011F, 0.0056F, 2.7512F, -0.8029F, 0.0F, 0.6545F));

		PartDefinition body4_r2 = body1.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(20, 29).addBox(-0.7F, -0.5279F, -2.6834F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -0.043F, 3.0613F, -0.1268F, 0.1854F, -0.0503F));

		PartDefinition chest5_r5 = body1.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(26, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.212F, 1.3898F, 0.2054F, -0.1483F, 0.953F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(41, 32).addBox(-0.5F, -0.2053F, -0.0603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1663F, 4.099F, -0.3604F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 0.2816F, 2.9774F, -0.1195F, -0.1274F, -0.4204F));

		PartDefinition upperleg6_r1 = leftleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1669F, 4.6413F, -0.0605F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = leftleg1.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(24, 43).addBox(-1.1645F, -4.2167F, -0.7295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8606F, 3.7104F, -0.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0266F, 5.7318F, 0.1798F, 1.0227F, 0.0335F, 0.3905F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(9, 39).addBox(-1.15F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(14, 39).addBox(-0.3F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0885F, 2.7638F, 0.2437F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(21, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1711F, 6.9929F, 0.8682F, -0.4019F, 0.0788F, -0.0263F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 0.2816F, 2.9774F, 0.4914F, 0.1274F, 0.4204F));

		PartDefinition upperleg7_r1 = rightleg1.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(19, 47).mirror().addBox(-0.5F, -1.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1669F, 4.6413F, -0.0605F, 0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = rightleg1.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(24, 43).mirror().addBox(0.1645F, -4.2167F, -0.7295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8606F, 3.7104F, -0.1448F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0266F, 5.7318F, 0.1798F, 1.0227F, -0.0335F, -0.3905F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(0.15F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(14, 39).mirror().addBox(-0.7F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0885F, 2.7638F, 0.2437F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(21, 6).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1711F, 6.9929F, 0.8682F, -0.4019F, -0.0788F, 0.0263F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2925F, -3.1493F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(29, 54).addBox(0.0F, -1.2113F, 1.9962F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6734F, -2.4728F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(32, 54).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1853F, -2.0641F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -1.1005F, -0.1095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6734F, -2.4728F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(11, 29).addBox(-0.5F, -0.5F, -2.901F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(35, 54).addBox(0.0F, -0.8F, -1.901F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1207F, -2.5762F, -0.3172F, 0.4517F, 0.2035F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(24, 39).addBox(0.0F, -0.7036F, -1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0964F, -2.7411F, 0.2134F, 0.099F, -0.0193F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(53, 40).addBox(0.0F, -0.6876F, 0.7874F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 17).addBox(-0.5F, -0.3876F, -0.2126F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0929F, -3.8518F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.002F, 0.1422F, -3.9045F, 0.9922F, -0.1883F, 0.1206F));

		PartDefinition head4_r1 = head.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(7, 48).addBox(-0.5F, -2.1214F, -0.3179F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.496F, 1.1622F, -2.0788F, -0.5323F, 0.0F, 0.0F));

		PartDefinition head4_r2 = head.addOrReplaceChild("head4_r2", CubeListBuilder.create().texOffs(46, 40).addBox(-0.5F, -0.3F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.496F, -0.2107F, -0.9358F, -1.6144F, 0.0F, 0.0F));

		PartDefinition head4_r3 = head.addOrReplaceChild("head4_r3", CubeListBuilder.create().texOffs(44, 19).addBox(-0.5F, -1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.496F, 0.7622F, -1.5788F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, -0.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.004F, -0.4886F, -0.4231F, 0.5498F, 0.0F, 0.0F));

		PartDefinition head3_r2 = head.addOrReplaceChild("head3_r2", CubeListBuilder.create().texOffs(24, 49).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0058F, -0.6296F, 0.1139F, -1.0123F, 0.0F, 0.0F));

		PartDefinition head2_r1 = head.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -1.9038F, -1.9868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.496F, 2.209F, -1.3838F, -0.7767F, 0.0F, 0.0F));

		PartDefinition head3_r3 = head.addOrReplaceChild("head3_r3", CubeListBuilder.create().texOffs(53, 11).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 8).addBox(-0.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.299F, -1.1853F, 0.1472F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head1_r1 = head.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(44, 51).addBox(-0.2F, 0.5724F, 1.3206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.004F, -1.307F, -2.6717F, -0.0175F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0045F, 1.9856F, -1.3203F, 0.0262F, 0.0009F, 0.0001F));

		PartDefinition jaw4_r1 = jaw.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-0.2F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.005F, 0.3617F, -0.3214F, -0.0785F, -0.0008F, 0.0003F));

		PartDefinition jaw3_r1 = jaw.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.2F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.005F, 0.3617F, -0.3214F, -0.3403F, -0.0008F, 0.0003F));

		PartDefinition jaw4_r2 = jaw.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(53, 31).mirror().addBox(-0.1992F, -0.2462F, -0.7674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.005F, -0.4383F, -0.9214F, -0.2182F, -0.0008F, 0.0003F));

		PartDefinition jaw3_r2 = jaw.addOrReplaceChild("jaw3_r2", CubeListBuilder.create().texOffs(53, 31).addBox(-0.8008F, -0.2462F, -0.7674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.0F, -0.4383F, -0.9214F, -0.2182F, 0.0008F, -0.0003F));

		PartDefinition jaw3_r3 = jaw.addOrReplaceChild("jaw3_r3", CubeListBuilder.create().texOffs(48, 4).addBox(-0.8F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, 0.3617F, -0.3214F, -0.0785F, 0.0008F, -0.0003F));

		PartDefinition jaw2_r1 = jaw.addOrReplaceChild("jaw2_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.8F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.3617F, -0.3214F, -0.3403F, 0.0008F, -0.0003F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3922F, 0.2973F, -0.0456F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-0.5001F, -0.8704F, -1.8392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.503F, -0.0574F, -3.2949F, 0.1396F, -0.0002F, 0.0F));

		PartDefinition jaw4_r3 = jaw2.addOrReplaceChild("jaw4_r3", CubeListBuilder.create().texOffs(44, 15).mirror().addBox(-0.5001F, -0.278F, -1.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.503F, -0.8574F, -3.3949F, 0.0349F, -0.0002F, 0.0F));

		PartDefinition jaw3_r4 = jaw2.addOrReplaceChild("jaw3_r4", CubeListBuilder.create().texOffs(47, 27).mirror().addBox(-0.9984F, -0.2191F, -1.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.005F, -0.9F, -1.8F, 0.0F, -0.0002F, 0.0F));

		PartDefinition jaw4_r4 = jaw2.addOrReplaceChild("jaw4_r4", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.9984F, -0.7191F, -1.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.005F, -0.1F, -1.8F, -0.0349F, -0.0002F, 0.0F));

		PartDefinition jaw4_r5 = jaw2.addOrReplaceChild("jaw4_r5", CubeListBuilder.create().texOffs(43, 47).addBox(-0.4999F, -0.8704F, -1.8392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.498F, -0.0574F, -3.2949F, 0.1396F, 0.0002F, 0.0F));

		PartDefinition jaw3_r5 = jaw2.addOrReplaceChild("jaw3_r5", CubeListBuilder.create().texOffs(44, 15).addBox(-0.4999F, -0.278F, -1.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.498F, -0.8574F, -3.3949F, 0.0349F, 0.0002F, 0.0F));

		PartDefinition jaw3_r6 = jaw2.addOrReplaceChild("jaw3_r6", CubeListBuilder.create().texOffs(0, 48).addBox(-0.0016F, -0.7191F, -1.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.8F, -0.0349F, 0.0002F, 0.0F));

		PartDefinition jaw2_r2 = jaw2.addOrReplaceChild("jaw2_r2", CubeListBuilder.create().texOffs(47, 27).addBox(-0.0016F, -0.2191F, -1.7885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0F, 0.0002F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.75F, 0.2353F, 0.0F, 0.0F));

		PartDefinition jaw5 = jaw3.addOrReplaceChild("jaw5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -3.0F, 0.0454F, 0.0F, 0.0F));

		PartDefinition jaw8_r1 = jaw5.addOrReplaceChild("jaw8_r1", CubeListBuilder.create().texOffs(9, 34).addBox(-0.5015F, -0.7028F, -2.5029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, -1.075F, -3.0389F, -0.4625F, 0.0F, 0.0F));

		PartDefinition jaw7_r1 = jaw5.addOrReplaceChild("jaw7_r1", CubeListBuilder.create().texOffs(46, 8).addBox(-0.5015F, -0.5958F, -0.2931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.775F, -3.7389F, -0.288F, 0.0F, 0.0F));

		PartDefinition jaw7_r2 = jaw5.addOrReplaceChild("jaw7_r2", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5015F, -0.7364F, -1.6724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.075F, -5.0389F, -0.5498F, 0.0F, 0.0F));

		PartDefinition jaw6_r1 = jaw5.addOrReplaceChild("jaw6_r1", CubeListBuilder.create().texOffs(46, 36).addBox(-0.5015F, -0.2922F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -2.075F, -3.6389F, -0.3229F, 0.0F, 0.0F));

		PartDefinition jaw7_r3 = jaw5.addOrReplaceChild("jaw7_r3", CubeListBuilder.create().texOffs(12, 53).addBox(-0.8015F, -1.1329F, 2.9204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F))
				.texOffs(24, 17).addBox(-0.8015F, -0.8329F, -0.1796F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.3F, -1.0145F, -2.9034F, -0.384F, 0.0F, 0.0F));

		PartDefinition jaw5_r2 = jaw5.addOrReplaceChild("jaw5_r2", CubeListBuilder.create().texOffs(0, 24).addBox(-0.8015F, -0.2598F, -3.8198F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.8145F, 0.8966F, -0.2531F, 0.0F, 0.0F));

		PartDefinition shape64 = jaw5.addOrReplaceChild("shape64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1256F, -1.9026F, -1.4114F, 0.0F, 0.0F));

		PartDefinition underneck3 = jaw.addOrReplaceChild("underneck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7922F, -2.9027F, -0.2246F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6922F, -1.1027F, -0.055F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.004F, -0.1085F, -2.8891F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head3_r4 = head2.addOrReplaceChild("head3_r4", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -0.851F, -0.4273F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition head2_r2 = head2.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(13, 11).addBox(-1.0F, -0.851F, -3.8273F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.2F, 0.0611F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -7.5F, -0.1367F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.66F, 4.0F, 0.0948F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head5.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(11, 23).addBox(-0.5F, -0.3167F, -0.2487F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 1.4315F, -4.7556F, 0.2793F, 0.0F, 0.0F));

		PartDefinition head9_r1 = head5.addOrReplaceChild("head9_r1", CubeListBuilder.create().texOffs(41, 36).addBox(-0.5008F, -0.7871F, -0.1525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.9941F, -0.4653F, 1.0297F, -0.0008F, -0.0004F));

		PartDefinition head8_r2 = head5.addOrReplaceChild("head8_r2", CubeListBuilder.create().texOffs(29, 47).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9941F, -2.0653F, 0.2443F, -0.0005F, -0.0002F));

		PartDefinition head7_r1 = head5.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, -0.7252F, -0.2096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7315F, -3.4556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head8_r3 = head5.addOrReplaceChild("head8_r3", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5003F, -0.3277F, -0.2901F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 1.5315F, -5.6556F, 0.2443F, -0.0002F, -0.0001F));

		PartDefinition head7_r2 = head5.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5003F, -0.71F, -2.7037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.9315F, -5.1556F, -0.0349F, -0.0002F, -0.0001F));

		PartDefinition head6_r1 = head5.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(18, 34).addBox(-0.5008F, -0.7199F, -2.712F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7315F, -2.7556F, 0.0873F, -0.0002F, -0.0001F));

		PartDefinition lips1 = head3.addOrReplaceChild("lips1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 0.1F, 3.9F, 0.0025F, -0.0138F, 0.2732F));

		PartDefinition lips2 = head3.addOrReplaceChild("lips2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 0.1F, 3.9F, 0.0025F, 0.0138F, -0.2732F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.1559F, 0.0F, 0.0F));

		PartDefinition head15_r1 = head4.addOrReplaceChild("head15_r1", CubeListBuilder.create().texOffs(41, 4).addBox(-0.5F, -0.1875F, -0.2079F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.55F, 2.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition head12_r1 = head4.addOrReplaceChild("head12_r1", CubeListBuilder.create().texOffs(34, 51).addBox(-0.5F, -0.1991F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.65F, 1.6F, -0.2094F, 0.0005F, 0.0001F));

		PartDefinition head11_r1 = head4.addOrReplaceChild("head11_r1", CubeListBuilder.create().texOffs(29, 51).addBox(-0.5F, -0.2618F, -0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.65F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head4.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(42, 23).addBox(-0.5F, -0.2591F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head9_r2 = head4.addOrReplaceChild("head9_r2", CubeListBuilder.create().texOffs(37, 10).addBox(-0.5F, -0.3083F, -0.3065F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.95F, -2.7F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head8_r4 = head4.addOrReplaceChild("head8_r4", CubeListBuilder.create().texOffs(35, 15).addBox(-0.5F, -0.2221F, -0.23F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.45F, -5.2F, 0.2269F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head4.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(44, 43).addBox(-1.001F, -0.0693F, 0.2287F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0F, 1.2843F, 0.7186F, -0.9425F, 0.0016F, -0.0001F));

		PartDefinition head6_r3 = head4.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(0, 44).addBox(-0.9991F, -1.0624F, -0.1155F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.5843F, 1.9186F, -0.384F, 0.0016F, -0.0001F));

		PartDefinition head5_r1 = head4.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(37, 43).addBox(-1.0006F, -1.4766F, -0.1155F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5843F, 0.9186F, -0.7854F, 0.0016F, -0.0001F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.004F, 0.9497F, -0.2847F));

		PartDefinition head7_r3 = bone.addOrReplaceChild("head7_r3", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 47).addBox(1.3441F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.9241F, 0.1942F, -0.782F, -0.8378F, 0.0F, 0.0F));

		PartDefinition head8_r5 = bone.addOrReplaceChild("head8_r5", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-0.5304F, -1.6704F, -0.4773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(49, 23).addBox(1.1345F, -1.6704F, -0.4773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8041F, 0.1658F, -2.0119F, -0.7592F, 0.0F, 0.0F));

		PartDefinition head7_r4 = bone.addOrReplaceChild("head7_r4", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(-0.4402F, -1.5595F, 0.5135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 31).addBox(1.2248F, -1.5595F, 0.5135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8944F, -0.8056F, -2.2994F, -1.0734F, 0.0F, 0.0F));

		PartDefinition head8_r6 = bone.addOrReplaceChild("head8_r6", CubeListBuilder.create().texOffs(39, 51).mirror().addBox(-0.3897F, -0.7811F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)).mirror(false), PartPose.offsetAndRotation(-0.7944F, -0.9056F, -1.1994F, -3.0892F, -0.0062F, 0.004F));

		PartDefinition head7_r5 = bone.addOrReplaceChild("head7_r5", CubeListBuilder.create().texOffs(49, 51).mirror().addBox(-0.5102F, 0.0873F, 0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 52).mirror().addBox(-0.6402F, 0.0873F, 0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(49, 51).addBox(1.0948F, 0.0873F, 0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 52).addBox(1.2248F, 0.0873F, 0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7944F, -1.7056F, -1.2994F, -0.829F, 0.0F, 0.0F));

		PartDefinition head7_r6 = bone.addOrReplaceChild("head7_r6", CubeListBuilder.create().texOffs(39, 51).addBox(-0.6103F, -0.7811F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(0.7903F, -0.9056F, -1.1994F, -3.0892F, 0.0062F, -0.004F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.0F, -2.4F, 0.1227F, 0.0276F, 0.2358F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(35, 20).addBox(-0.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 51).addBox(-1.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7549F, 0.1825F, 0.4233F, -1.232F, 1.0483F, -1.3129F));

		PartDefinition wing10_r1 = leftwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(19, 39).addBox(-0.9072F, -1.9026F, -0.7631F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 39).addBox(-0.9072F, -1.9026F, 0.0369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4534F, 1.8204F, -0.2518F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(14, 48).addBox(-0.3631F, 0.5633F, -2.1225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4534F, 1.8204F, -0.2518F, 0.0F, -1.5708F, 0.4974F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(27, 34).addBox(-0.3607F, -0.1869F, -0.8325F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0869F, 5.8009F, 0.3333F, 0.3244F, 0.1557F, 0.4534F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3159F, 6.5818F, -0.136F, 1.4375F, -0.5083F, -0.3684F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.4714F, -0.8024F, -0.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0678F, 0.2873F, 8.3099F, 0.0885F, 0.162F, 0.2337F));

		PartDefinition wingfinger9_r1 = leftwing5.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -1.2F, -1.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0286F, 0.1976F, 5.0883F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(38, 28).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0413F, -0.1155F, 0.5237F, -2.7434F, -0.0989F, -2.0846F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(1.0649F, -0.8826F, 0.8782F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.0F, -2.4F, 0.3953F, 0.4053F, -0.1795F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(35, 20).mirror().addBox(-2.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 51).mirror().addBox(0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7549F, 0.1825F, 0.4233F, -1.9542F, -0.8632F, 1.9417F));

		PartDefinition wing11_r1 = rightwing2.addOrReplaceChild("wing11_r1", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.0928F, -1.9026F, -0.7631F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 39).mirror().addBox(-0.0928F, -1.9026F, 0.0369F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, 1.8204F, -0.2518F, 0.0F, 0.0F, 0.0F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(14, 48).mirror().addBox(-0.6369F, 0.5633F, -2.1225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4534F, 1.8204F, -0.2518F, 0.0F, 1.5708F, -0.4974F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(27, 34).mirror().addBox(-0.6393F, -0.1869F, -0.8325F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0869F, 5.8009F, 0.3333F, 0.3492F, -0.0834F, -0.6608F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3159F, 6.5818F, -0.136F, 1.5615F, 0.5239F, 0.6187F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.5286F, -0.8024F, -0.3117F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0678F, 0.2873F, 8.3099F, 0.0885F, -0.162F, -0.2337F));

		PartDefinition wingfinger10_r1 = rightwing5.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.5F, -1.2F, -1.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0286F, 0.1976F, 5.0883F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.1155F, 0.5237F, -2.132F, -0.0309F, 2.1009F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-1.0649F, -0.8826F, 0.8782F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		return LayerDefinition.create(meshdefinition, 58, 58);
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