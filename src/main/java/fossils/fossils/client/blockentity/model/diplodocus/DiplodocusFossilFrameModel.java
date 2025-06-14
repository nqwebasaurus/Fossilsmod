package fossils.fossils.client.blockentity.model.diplodocus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiplodocusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hip;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftLeg7;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;

	public DiplodocusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hip = this.root.getChild("hip");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftLeg7 = this.leftLeg6.getChild("leftLeg7");
		this.leftLeg8 = this.leftLeg7.getChild("leftLeg8");
		this.rightLeg5 = this.leftLeg.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm4 = this.leftArm.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightArm4 = this.leftArm.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -48.9F, 19.5F, 1.0F, 49.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(2, 1).addBox(-0.5F, -55.9F, -22.5F, 1.0F, 56.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(-12, 1).addBox(-14.0F, -40.0F, -22.52F, 28.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(-11, 1).addBox(-13.0F, -1.0F, 0.0F, 26.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -46.75F, 19.5F, -0.0019F, 0.0436F, -0.0437F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -51.05F, 1.0F));

		PartDefinition hip = root.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 20.0F));

		PartDefinition frame12_r1 = hip.addOrReplaceChild("frame12_r1", CubeListBuilder.create().texOffs(2, 79).addBox(1.51F, -0.0428F, -0.3692F, 1.0F, 1.0F, 28.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, -3.6F, -17.8F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(13.5F, 1.75F, 3.25F, 1.5272F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.0F, -5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0F, 4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -6.5F));

		PartDefinition leftLeg5 = leftLeg.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -6.05F, -4.05F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 1.7348F, -23.6514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg7 = leftLeg6.addOrReplaceChild("leftLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg7.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -8.3537F, -8.8561F));

		PartDefinition rightLeg5 = leftLeg.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-29.5F, -6.05F, -4.05F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 1.7348F, -23.6514F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.2194F, 0.0006F, 0.0103F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -8.3537F, -8.8561F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4F, 8.6F, -0.3846F, -0.1541F, -0.0311F));

		PartDefinition frame13_r1 = tail1.addOrReplaceChild("frame13_r1", CubeListBuilder.create().texOffs(43, 44).addBox(2.5F, 0.1F, -0.8F, 1.0F, 1.0F, 34.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0F, 2.0103F, 0.0003F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0897F, 31.7003F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition frame14_r1 = tail2.addOrReplaceChild("frame14_r1", CubeListBuilder.create().texOffs(3, 0).addBox(2.0F, 0.0F, -0.5F, 1.0F, 1.0F, 36.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5F, 2.5651F, 0.6421F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6349F, 35.3421F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition frame15_r1 = tail3.addOrReplaceChild("frame15_r1", CubeListBuilder.create().texOffs(46, -1).addBox(1.5F, 0.0F, 0.1F, 1.0F, 1.0F, 33.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 2.499F, 0.0489F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.201F, 32.2489F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition frame16_r1 = tail4.addOrReplaceChild("frame16_r1", CubeListBuilder.create().texOffs(0, 41).addBox(1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 35.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 2.3895F, -0.169F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2105F, 34.331F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frame17_r1 = tail5.addOrReplaceChild("frame17_r1", CubeListBuilder.create().texOffs(115, 116).addBox(1.52F, -3.0F, -3.0F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 4.2667F, 2.8181F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1667F, 17.8181F, 0.0436F, 0.0F, 0.0F));

		PartDefinition frame18_r1 = tail6.addOrReplaceChild("frame18_r1", CubeListBuilder.create().texOffs(0, 126).addBox(1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 0.999F, -0.0436F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.001F, 15.9564F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition frame19_r1 = tail7.addOrReplaceChild("frame19_r1", CubeListBuilder.create().texOffs(118, 45).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.9995F, -0.1671F, 0.0297F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.0005F, 16.0829F, 0.0F, 0.0873F, 0.0F));

		PartDefinition frame20_r1 = tail8.addOrReplaceChild("frame20_r1", CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.1F, -0.1F, 0.0087F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.35F, 16.0F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition frame21_r1 = tail9.addOrReplaceChild("frame21_r1", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, 0.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.4928F, -0.1598F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(157, 141).addBox(-0.5F, 0.4693F, -0.2064F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2928F, 14.9402F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition frame23_r1 = tail10.addOrReplaceChild("frame23_r1", CubeListBuilder.create().texOffs(181, 144).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4693F, 9.7936F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(74, 109).addBox(-0.5F, 0.5623F, -0.3625F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.2693F, 15.7936F, -0.4835F, 0.116F, -0.0607F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(84, 62).addBox(-0.5F, 0.5F, -0.25F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0623F, 13.6375F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -17.0F));

		PartDefinition frame11_r1 = body.addOrReplaceChild("frame11_r1", CubeListBuilder.create().texOffs(50, 109).addBox(2.0F, -0.0146F, 0.0856F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5F, 0.6F, -18.4F, -0.096F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -2.2F, -17.35F));

		PartDefinition frame10_r1 = chest.addOrReplaceChild("frame10_r1", CubeListBuilder.create().texOffs(40, 84).addBox(1.51F, 0.25F, -0.1678F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 2.4F, -15.25F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, 24.25F, -9.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3412F, -3.5576F, 0.5371F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 16.3588F, -1.2446F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1063F, 15.6475F, -3.1181F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm4 = leftArm.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-25.3412F, -3.5576F, 0.5371F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 16.3588F, -1.2446F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1063F, 15.6475F, -3.1181F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition frame9_r1 = neck1.addOrReplaceChild("frame9_r1", CubeListBuilder.create().texOffs(87, 36).addBox(1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 1.5877F, -20.2355F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5123F, -19.3355F, -0.3695F, 0.3272F, -0.1238F));

		PartDefinition frame8_r1 = neck2.addOrReplaceChild("frame8_r1", CubeListBuilder.create().texOffs(68, 84).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 2.3541F, -18.8767F, -0.0349F, -0.014F, 0.0006F));

		PartDefinition frame7_r1 = neck2.addOrReplaceChild("frame7_r1", CubeListBuilder.create().texOffs(152, 58).addBox(-0.5F, -0.2158F, 0.2349F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.5106F, -27.1233F, -0.3665F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4459F, -26.8767F, -0.2494F, 0.2127F, 0.2463F));

		PartDefinition frame6_r1 = neck3.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(76, 147).addBox(1.0F, -0.5193F, 0.1309F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 2.0214F, -9.9131F, -0.0875F, 0.0695F, -0.0061F));

		PartDefinition frame5_r1 = neck3.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(124, 89).addBox(0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.0214F, -25.4131F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6786F, -25.3131F, 0.1302F, -0.0076F, 0.1744F));

		PartDefinition frame4_r1 = neck4.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.1041F, -14.9626F, -0.0349F, 0.0174F, -0.0006F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4959F, -14.9626F, 0.4363F, 0.0F, 0.0F));

		PartDefinition frame3_r1 = neck5.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(93, 151).addBox(0.5F, 0.0763F, 0.1073F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.4855F, -9.6197F, -0.2094F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7855F, -9.0197F, 0.829F, 0.0F, 0.0F));

		PartDefinition frame2_r1 = neck6.addOrReplaceChild("frame2_r1", CubeListBuilder.create().texOffs(92, 114).addBox(0.51F, -0.1509F, -0.0049F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.5471F, -5.8028F, -0.4974F, 0.0F, 0.0F));

		PartDefinition frame1_r1 = neck6.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(120, 171).addBox(0.5F, 1.9639F, 0.4988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -3.7971F, -7.0528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition frame0_r1 = neck6.addOrReplaceChild("frame0_r1", CubeListBuilder.create().texOffs(121, 172).addBox(0.51F, 2.0052F, 0.4988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -3.9971F, -7.8528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0471F, -6.6028F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6299F, -1.6684F, 0.2618F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.2259F, -4.0487F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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