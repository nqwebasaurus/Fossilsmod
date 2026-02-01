package fossils.fossils.client.blockentity.model.torvosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TorvosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;

	public TorvosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone5 = this.Hips.getChild("bone5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.101F, 3.0407F, -0.0384F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(76, 84).addBox(-0.002F, -5.925F, -4.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7323F, 4.9287F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(25, 60).addBox(0.0F, -5.9F, -6.0F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.994F, -1.0656F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.6F, 1.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2991F, -8.1287F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offset(3.9F, 0.4139F, 0.0874F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(118, 120).addBox(-0.5F, -2.5F, -0.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.705F, -1.0496F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(28, 117).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.8189F, -0.2961F, -1.0908F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(107, 48).addBox(-3.0F, -0.6F, -0.3F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -1.195F, -0.0496F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftleg1.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(115, 26).addBox(-1.0F, -1.35F, -2.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 14.1654F, 1.2084F, -0.8116F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftleg1.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(15, 93).addBox(-1.5F, 0.0046F, -1.4745F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6287F, 0.0915F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftleg1.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(46, 123).addBox(-1.0F, -3.0475F, 0.0403F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 14.3755F, -1.194F, 0.1614F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftleg1.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(126, 26).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6376F, -0.3772F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftleg1.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(126, 102).addBox(-1.5F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 9.8503F, -1.8435F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftleg1.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(78, 140).addBox(0.0F, 0.1F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.7461F, 1.9557F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftleg1.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(142, 101).addBox(0.0F, -1.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.3383F, 1.8387F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Leftleg1.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(42, 115).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7822F, 0.7114F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r12 = Leftleg1.addOrReplaceChild("Leftthigh_r12", CubeListBuilder.create().texOffs(109, 114).addBox(-2.0F, -8.0F, -2.45F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 10.8138F, 0.8189F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r13 = Leftleg1.addOrReplaceChild("Leftthigh_r13", CubeListBuilder.create().texOffs(128, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 7.7827F, -1.8506F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r14 = Leftleg1.addOrReplaceChild("Leftthigh_r14", CubeListBuilder.create().texOffs(82, 115).addBox(-2.0F, 0.1F, -0.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 2.7298F, -1.0517F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.9729F, 1.5977F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(124, 6).addBox(-2.5F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1687F, 0.6556F, 0.4547F, -1.5708F, 1.2654F, -1.5708F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(136, 115).addBox(-0.8F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1687F, 2.0019F, 1.1464F, -1.5708F, 0.7069F, -1.5708F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(83, 140).addBox(-0.9F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 0.1547F, -1.5708F, 1.3614F, -1.5708F));

		PartDefinition Leftshin_r4 = Leftleg2.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(142, 4).addBox(-0.8F, -4.4883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 0.1547F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition Leftshin_r5 = Leftleg2.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(136, 111).addBox(-2.2F, 2.4117F, 0.1687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 9.8439F, 0.1547F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftshin_r6 = Leftleg2.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(24, 100).addBox(-0.9F, -4.6883F, 0.0937F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(57, 99).addBox(-1.3F, -4.6883F, 0.0937F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, -0.3453F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r7 = Leftleg2.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(126, 78).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3313F, 14.4244F, -0.1817F, -1.5708F, 0.2618F, -1.5708F));

		PartDefinition Leftshin_r8 = Leftleg2.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(132, 130).addBox(-0.8F, 1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3313F, 10.8556F, 0.8547F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition Leftshin_r9 = Leftleg2.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(124, 10).addBox(-1.7F, -2.9883F, -1.8313F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 4.1439F, -0.1453F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition Leftshin_r10 = Leftleg2.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(20, 124).addBox(-1.0F, 0.0117F, -1.8313F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.5F, 9.1439F, -0.4453F, -1.5708F, 1.4835F, -1.5708F));

		PartDefinition Leftshin_r11 = Leftleg2.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(69, 91).addBox(-1.0F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, -0.4453F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r12 = Leftleg2.addOrReplaceChild("Leftshin_r12", CubeListBuilder.create().texOffs(104, 97).addBox(-2.0F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3313F, 0.5944F, 0.3418F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition Leftshin_r13 = Leftleg2.addOrReplaceChild("Leftshin_r13", CubeListBuilder.create().texOffs(29, 112).addBox(-2.3F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3313F, 1.0556F, -0.1453F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftshin_r14 = Leftleg2.addOrReplaceChild("Leftshin_r14", CubeListBuilder.create().texOffs(27, 130).addBox(-0.025F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3313F, 4.1803F, 1.4851F, -1.5708F, 1.3177F, -1.5708F));

		PartDefinition Leftshin_r15 = Leftleg2.addOrReplaceChild("Leftshin_r15", CubeListBuilder.create().texOffs(62, 91).addBox(-0.525F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.3313F, 7.1556F, 0.8547F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(62, 106).addBox(-0.9F, -0.1292F, -1.6609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 15.1494F, 0.815F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(57, 84).addBox(-3.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 6.7034F, -0.5313F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(56, 57).addBox(-3.0F, -0.5F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.48F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 0.4139F, 0.0874F, -1.074F, 0.2068F, 0.1617F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(28, 123).addBox(-1.5F, -2.5F, -0.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.705F, -1.0496F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(117, 34).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.8189F, -0.2961F, -1.0908F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(71, 108).addBox(0.0F, -0.6F, -0.3F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -1.195F, -0.0496F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightleg1.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(115, 79).addBox(-1.0F, -1.35F, -2.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 14.1654F, 1.2084F, -0.8116F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightleg1.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(89, 95).addBox(-1.5F, 0.0046F, -1.4745F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6287F, 0.0915F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightleg1.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(123, 70).addBox(-1.0F, -3.0475F, 0.0403F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 14.3755F, -1.194F, 0.1614F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightleg1.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(126, 83).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6376F, -0.3772F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightleg1.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(129, 43).addBox(-0.5F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 9.8503F, -1.8435F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightleg1.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(64, 141).addBox(-1.0F, 0.1F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7461F, 1.9557F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightleg1.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(145, 135).addBox(-1.0F, -1.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.3383F, 1.8387F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Rightleg1.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(51, 115).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.7822F, 0.7114F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r12 = Rightleg1.addOrReplaceChild("Rightthigh_r12", CubeListBuilder.create().texOffs(115, 6).addBox(0.0F, -8.0F, -2.45F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 10.8138F, 0.8189F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r13 = Rightleg1.addOrReplaceChild("Rightthigh_r13", CubeListBuilder.create().texOffs(128, 96).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 7.7827F, -1.8506F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r14 = Rightleg1.addOrReplaceChild("Rightthigh_r14", CubeListBuilder.create().texOffs(100, 116).addBox(0.0F, 0.1F, -0.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 2.7298F, -1.0517F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.9729F, 1.5977F, 1.3475F, 0.2129F, -0.0479F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(9, 124).addBox(-1.5F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1687F, 0.6556F, 0.4547F, -1.5708F, -1.2654F, 1.5708F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(139, 67).addBox(-1.2F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1687F, 2.0019F, 1.1464F, -1.5708F, -0.7069F, 1.5708F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(110, 141).addBox(-0.1F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 0.1547F, -1.5708F, -1.3614F, 1.5708F));

		PartDefinition Rightshin_r4 = Rightleg2.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(142, 20).addBox(-0.2F, -4.4883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 0.1547F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition Rightshin_r5 = Rightleg2.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(139, 63).addBox(0.2F, 2.4117F, 0.1687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 9.8439F, 0.1547F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightshin_r6 = Rightleg2.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(5, 104).addBox(-0.1F, -4.6883F, 0.0937F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(0, 104).addBox(0.3F, -4.6883F, 0.0937F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 5.6439F, -0.3453F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r7 = Rightleg2.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(126, 88).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3313F, 14.4244F, -0.1817F, -1.5708F, -0.2618F, 1.5708F));

		PartDefinition Rightshin_r8 = Rightleg2.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(133, 10).addBox(-0.2F, 1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.3313F, 10.8556F, 0.8547F, -1.5708F, -0.8727F, 1.5708F));

		PartDefinition Rightshin_r9 = Rightleg2.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(125, 64).addBox(-0.3F, -2.9883F, -1.8313F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 4.1439F, -0.1453F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition Rightshin_r10 = Rightleg2.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(81, 129).addBox(0.0F, 0.0117F, -1.8313F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.5F, 9.1439F, -0.4453F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition Rightshin_r11 = Rightleg2.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(37, 97).addBox(0.0F, -4.4883F, -1.8313F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 5.6439F, -0.4453F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r12 = Rightleg2.addOrReplaceChild("Rightshin_r12", CubeListBuilder.create().texOffs(109, 109).addBox(-2.0F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.3313F, 0.5944F, 0.3418F, -1.5708F, -1.3526F, 1.5708F));

		PartDefinition Rightshin_r13 = Rightleg2.addOrReplaceChild("Rightshin_r13", CubeListBuilder.create().texOffs(113, 21).addBox(-1.7F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3313F, 1.0556F, -0.1453F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightshin_r14 = Rightleg2.addOrReplaceChild("Rightshin_r14", CubeListBuilder.create().texOffs(19, 131).addBox(-0.975F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3313F, 4.1803F, 1.4851F, -1.5708F, -1.3177F, 1.5708F));

		PartDefinition Rightshin_r15 = Rightleg2.addOrReplaceChild("Rightshin_r15", CubeListBuilder.create().texOffs(30, 97).addBox(-0.475F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.3313F, 7.1556F, 0.8547F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(106, 87).addBox(-1.1F, -0.1292F, -1.6609F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 15.1494F, 0.815F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(85, 0).addBox(-2.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 6.7034F, -0.5313F, 1.0353F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(44, 67).addBox(-2.0F, -0.5F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0484F, 1.3314F, -0.035F));

		PartDefinition Box_r1 = bone3.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(0, 74).addBox(-0.4463F, 3.2355F, -1.2979F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.1989F, 0.0233F, 0.0407F));

		PartDefinition Box_r2 = bone3.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(126, 21).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5527F, -0.561F, 2.5348F, -1.4653F, -0.0114F, -0.1304F));

		PartDefinition Box_r3 = bone3.addOrReplaceChild("Box_r3", CubeListBuilder.create().texOffs(69, 71).addBox(-1.0569F, -1.1752F, -0.9889F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.3316F, 0.0F, -0.1309F));

		PartDefinition Box_r4 = bone3.addOrReplaceChild("Box_r4", CubeListBuilder.create().texOffs(34, 87).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4453F, -8.0398F, -5.083F, 0.0262F, 0.0F, -0.1309F));

		PartDefinition Box_r5 = bone3.addOrReplaceChild("Box_r5", CubeListBuilder.create().texOffs(93, 142).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.6803F, -2.229F, -7.3153F, -0.6981F, 0.0F, -0.1309F));

		PartDefinition Box_r6 = bone3.addOrReplaceChild("Box_r6", CubeListBuilder.create().texOffs(10, 116).addBox(-0.5F, -2.0F, -1.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.969F, -4.4221F, -6.4226F, -0.9599F, 0.0F, -0.1309F));

		PartDefinition Box_r7 = bone3.addOrReplaceChild("Box_r7", CubeListBuilder.create().texOffs(146, 69).addBox(0.8516F, 1.8125F, 0.0103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(82, 123).addBox(0.8516F, 0.2125F, 0.0103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.6792F, -7.0569F, -7.732F, -0.4712F, 0.0F, -0.1309F));

		PartDefinition Box_r8 = bone3.addOrReplaceChild("Box_r8", CubeListBuilder.create().texOffs(120, 40).addBox(0.8516F, 0.2125F, -3.0897F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.8061F, -8.0211F, -4.968F, 0.3142F, 0.0F, -0.1309F));

		PartDefinition Box_r9 = bone3.addOrReplaceChild("Box_r9", CubeListBuilder.create().texOffs(106, 57).addBox(-0.5F, -2.3F, -2.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7919F, -3.0764F, 5.7752F, 0.1047F, 0.0F, -0.1309F));

		PartDefinition Box_r10 = bone3.addOrReplaceChild("Box_r10", CubeListBuilder.create().texOffs(115, 85).addBox(-0.4983F, 0.4302F, -1.5701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9687F, -4.4815F, 7.9368F, 0.4806F, -0.0091F, -0.1306F));

		PartDefinition Box_r11 = bone3.addOrReplaceChild("Box_r11", CubeListBuilder.create().texOffs(133, 15).addBox(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9272F, -3.9748F, 8.2954F, -1.1862F, -0.0091F, -0.1306F));

		PartDefinition Box_r12 = bone3.addOrReplaceChild("Box_r12", CubeListBuilder.create().texOffs(136, 119).addBox(-0.4983F, -1.5425F, -0.2184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9687F, -4.2815F, 8.2368F, -0.2699F, -0.0091F, -0.1306F));

		PartDefinition Box_r13 = bone3.addOrReplaceChild("Box_r13", CubeListBuilder.create().texOffs(88, 130).addBox(-0.4983F, -1.4334F, -2.1102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.9687F, -4.4815F, 7.9368F, -0.5317F, -0.0091F, -0.1306F));

		PartDefinition Box_r14 = bone3.addOrReplaceChild("Box_r14", CubeListBuilder.create().texOffs(79, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4468F, -8.0512F, -0.0589F, -0.1745F, 0.0F, -0.1309F));

		PartDefinition Box_r15 = bone3.addOrReplaceChild("Box_r15", CubeListBuilder.create().texOffs(98, 109).addBox(0.8516F, -2.9293F, 3.5328F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.9F, -1.5F, 0.5061F, 0.0F, -0.1309F));

		PartDefinition Box_r16 = bone3.addOrReplaceChild("Box_r16", CubeListBuilder.create().texOffs(31, 45).addBox(-0.5F, -2.6F, -11.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.793F, -3.0849F, 4.5606F, -0.0175F, 0.0F, -0.1309F));

		PartDefinition Box_r17 = bone3.addOrReplaceChild("Box_r17", CubeListBuilder.create().texOffs(146, 37).addBox(-0.5271F, -0.169F, -0.2338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5728F, 11.2311F, -7.5963F, -1.1386F, 0.0223F, 0.0425F));

		PartDefinition Box_r18 = bone3.addOrReplaceChild("Box_r18", CubeListBuilder.create().texOffs(86, 136).addBox(-0.4641F, 0.8913F, 0.0407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F))
				.texOffs(79, 136).addBox(-0.4641F, 1.3913F, 0.0407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5728F, 11.4061F, -7.7213F, -0.7034F, 0.0075F, 0.0982F));

		PartDefinition Box_r19 = bone3.addOrReplaceChild("Box_r19", CubeListBuilder.create().texOffs(146, 63).addBox(-0.4641F, 2.0172F, -0.2828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-1.5728F, 11.4061F, -7.7213F, -0.2235F, 0.0075F, 0.0982F));

		PartDefinition Box_r20 = bone3.addOrReplaceChild("Box_r20", CubeListBuilder.create().texOffs(135, 88).addBox(-0.5271F, 1.1712F, -1.3208F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F))
				.texOffs(142, 77).addBox(-0.5271F, -1.4893F, -0.7227F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5728F, 11.2311F, -7.5963F, -0.4841F, 0.0223F, 0.0425F));

		PartDefinition Box_r21 = bone3.addOrReplaceChild("Box_r21", CubeListBuilder.create().texOffs(34, 142).addBox(-0.4829F, -4.0707F, -0.0139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6228F, 11.2311F, -7.5963F, -0.3229F, 0.0229F, 0.0569F));

		PartDefinition Box_r22 = bone3.addOrReplaceChild("Box_r22", CubeListBuilder.create().texOffs(142, 25).addBox(-0.5271F, -1.5102F, -0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.5728F, 11.2311F, -7.5963F, -0.519F, 0.0223F, 0.0425F));

		PartDefinition Box_r23 = bone3.addOrReplaceChild("Box_r23", CubeListBuilder.create().texOffs(59, 142).addBox(-0.4829F, -4.0459F, -0.4887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.6228F, 11.2311F, -7.5963F, -0.3447F, 0.0229F, 0.0569F));

		PartDefinition Box_r24 = bone3.addOrReplaceChild("Box_r24", CubeListBuilder.create().texOffs(135, 135).addBox(-0.0318F, -0.0387F, -0.3112F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(142, 82).addBox(-0.0318F, 1.9337F, 0.0696F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-1.1534F, 3.0054F, -4.9445F, -0.332F, -0.0052F, 0.1483F));

		PartDefinition Box_r25 = bone3.addOrReplaceChild("Box_r25", CubeListBuilder.create().texOffs(20, 141).addBox(-0.0318F, -0.9011F, 0.5933F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.1534F, 3.0054F, -4.9445F, -0.6112F, -0.0052F, 0.1483F));

		PartDefinition Box_r26 = bone3.addOrReplaceChild("Box_r26", CubeListBuilder.create().texOffs(109, 129).addBox(-0.0318F, -3.7473F, -0.2972F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.1534F, 3.0054F, -4.9445F, -1.3412F, 0.0383F, 0.1434F));

		PartDefinition Box_r27 = bone3.addOrReplaceChild("Box_r27", CubeListBuilder.create().texOffs(116, 132).addBox(-0.5F, -0.2348F, -0.3359F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5357F, 1.8289F, 2.8785F, -3.1071F, -0.2775F, 0.0586F));

		PartDefinition Box_r28 = bone3.addOrReplaceChild("Box_r28", CubeListBuilder.create().texOffs(91, 124).addBox(-0.5F, -0.85F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6335F, 3.2983F, 2.4415F, -1.3864F, -0.126F, 0.1628F));

		PartDefinition Box_r29 = bone3.addOrReplaceChild("Box_r29", CubeListBuilder.create().texOffs(142, 127).addBox(-0.5F, -1.7488F, -0.2725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.5357F, 1.8289F, 2.8785F, -2.6185F, -0.2775F, 0.0586F));

		PartDefinition Box_r30 = bone3.addOrReplaceChild("Box_r30", CubeListBuilder.create().texOffs(26, 136).addBox(-0.9706F, 0.0198F, -0.6275F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.19F, 4.5728F, 6.4305F, -1.861F, -0.2834F, 0.0083F));

		PartDefinition Box_r31 = bone3.addOrReplaceChild("Box_r31", CubeListBuilder.create().texOffs(54, 132).addBox(-0.9706F, -0.9802F, -0.6275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.19F, 4.5728F, 6.4305F, -2.018F, -0.2834F, 0.0083F));

		PartDefinition Box_r32 = bone3.addOrReplaceChild("Box_r32", CubeListBuilder.create().texOffs(145, 49).addBox(-0.5F, -0.9F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8715F, 7.5102F, 8.9951F, -2.849F, -0.0242F, 0.0438F));

		PartDefinition Box_r33 = bone3.addOrReplaceChild("Box_r33", CubeListBuilder.create().texOffs(142, 123).addBox(-0.9906F, -1.3964F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.19F, 4.5478F, 6.5055F, -2.1508F, -0.0242F, 0.0438F));

		PartDefinition Box_r34 = bone3.addOrReplaceChild("Box_r34", CubeListBuilder.create().texOffs(147, 26).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.9442F, 8.7924F, 9.6696F, -1.54F, -0.0242F, 0.0438F));

		PartDefinition Box_r35 = bone3.addOrReplaceChild("Box_r35", CubeListBuilder.create().texOffs(93, 146).addBox(-0.9906F, -4.7182F, -3.5513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.19F, 4.5478F, 6.5055F, -3.0235F, -0.0242F, 0.0438F));

		PartDefinition Box_r36 = bone3.addOrReplaceChild("Box_r36", CubeListBuilder.create().texOffs(105, 136).addBox(-0.5F, -0.725F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-1.8869F, 7.4089F, 9.811F, 2.5615F, -0.0242F, 0.0438F));

		PartDefinition Box_r37 = bone3.addOrReplaceChild("Box_r37", CubeListBuilder.create().texOffs(146, 72).addBox(-0.5F, -0.625F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.9421F, 8.2516F, 10.5638F, -1.7581F, -0.0242F, 0.0438F));

		PartDefinition Box_r38 = bone3.addOrReplaceChild("Box_r38", CubeListBuilder.create().texOffs(15, 141).addBox(-0.5F, -1.3F, -0.275F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.8191F, 6.4944F, 8.6689F, -2.5174F, -0.0242F, 0.0438F));

		PartDefinition Box_r39 = bone3.addOrReplaceChild("Box_r39", CubeListBuilder.create().texOffs(100, 138).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8191F, 6.4944F, 8.6689F, -2.4126F, -0.0242F, 0.0438F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.0484F, 1.3314F, -0.035F));

		PartDefinition Box_r40 = bone5.addOrReplaceChild("Box_r40", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5537F, 3.2355F, -1.2979F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.1989F, -0.0233F, -0.0407F));

		PartDefinition Box_r41 = bone5.addOrReplaceChild("Box_r41", CubeListBuilder.create().texOffs(126, 21).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5527F, -0.561F, 2.5348F, -1.4653F, 0.0114F, 0.1304F));

		PartDefinition Box_r42 = bone5.addOrReplaceChild("Box_r42", CubeListBuilder.create().texOffs(69, 71).mirror().addBox(0.0569F, -1.1752F, -0.9889F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.3316F, 0.0F, 0.1309F));

		PartDefinition Box_r43 = bone5.addOrReplaceChild("Box_r43", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4453F, -8.0398F, -5.083F, 0.0262F, 0.0F, 0.1309F));

		PartDefinition Box_r44 = bone5.addOrReplaceChild("Box_r44", CubeListBuilder.create().texOffs(93, 142).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.6803F, -2.229F, -7.3153F, -0.6981F, 0.0F, 0.1309F));

		PartDefinition Box_r45 = bone5.addOrReplaceChild("Box_r45", CubeListBuilder.create().texOffs(10, 116).mirror().addBox(-0.5F, -2.0F, -1.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.969F, -4.4221F, -6.4226F, -0.9599F, 0.0F, 0.1309F));

		PartDefinition Box_r46 = bone5.addOrReplaceChild("Box_r46", CubeListBuilder.create().texOffs(146, 69).mirror().addBox(-1.8516F, 1.8125F, 0.0103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(82, 123).mirror().addBox(-1.8516F, 0.2125F, 0.0103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.6792F, -7.0569F, -7.732F, -0.4712F, 0.0F, 0.1309F));

		PartDefinition Box_r47 = bone5.addOrReplaceChild("Box_r47", CubeListBuilder.create().texOffs(120, 40).mirror().addBox(-1.8516F, 0.2125F, -3.0897F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.8061F, -8.0211F, -4.968F, 0.3142F, 0.0F, 0.1309F));

		PartDefinition Box_r48 = bone5.addOrReplaceChild("Box_r48", CubeListBuilder.create().texOffs(106, 57).mirror().addBox(-0.5F, -2.3F, -2.6F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7919F, -3.0764F, 5.7752F, 0.1047F, 0.0F, 0.1309F));

		PartDefinition Box_r49 = bone5.addOrReplaceChild("Box_r49", CubeListBuilder.create().texOffs(115, 85).mirror().addBox(-0.5017F, 0.4302F, -1.5701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9687F, -4.4815F, 7.9368F, 0.4806F, 0.0091F, 0.1306F));

		PartDefinition Box_r50 = bone5.addOrReplaceChild("Box_r50", CubeListBuilder.create().texOffs(133, 15).mirror().addBox(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9272F, -3.9748F, 8.2954F, -1.1862F, 0.0091F, 0.1306F));

		PartDefinition Box_r51 = bone5.addOrReplaceChild("Box_r51", CubeListBuilder.create().texOffs(136, 119).mirror().addBox(-0.5017F, -1.5425F, -0.2184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9687F, -4.2815F, 8.2368F, -0.2699F, 0.0091F, 0.1306F));

		PartDefinition Box_r52 = bone5.addOrReplaceChild("Box_r52", CubeListBuilder.create().texOffs(88, 130).mirror().addBox(-0.5017F, -1.4334F, -2.1102F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.9687F, -4.4815F, 7.9368F, -0.5317F, 0.0091F, 0.1306F));

		PartDefinition Box_r53 = bone5.addOrReplaceChild("Box_r53", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4468F, -8.0512F, -0.0589F, -0.1745F, 0.0F, 0.1309F));

		PartDefinition Box_r54 = bone5.addOrReplaceChild("Box_r54", CubeListBuilder.create().texOffs(98, 109).mirror().addBox(-1.8516F, -2.9293F, 3.5328F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.9F, -1.5F, 0.5061F, 0.0F, 0.1309F));

		PartDefinition Box_r55 = bone5.addOrReplaceChild("Box_r55", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(-0.5F, -2.6F, -11.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.793F, -3.0849F, 4.5606F, -0.0175F, 0.0F, 0.1309F));

		PartDefinition Box_r56 = bone5.addOrReplaceChild("Box_r56", CubeListBuilder.create().texOffs(146, 37).mirror().addBox(-0.4729F, -0.169F, -0.2338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.5728F, 11.2311F, -7.5963F, -1.1386F, -0.0223F, -0.0425F));

		PartDefinition Box_r57 = bone5.addOrReplaceChild("Box_r57", CubeListBuilder.create().texOffs(86, 136).mirror().addBox(-0.5359F, 0.8913F, 0.0407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false)
				.texOffs(79, 136).mirror().addBox(-0.5359F, 1.3913F, 0.0407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.5728F, 11.4061F, -7.7213F, -0.7034F, -0.0075F, -0.0982F));

		PartDefinition Box_r58 = bone5.addOrReplaceChild("Box_r58", CubeListBuilder.create().texOffs(146, 63).mirror().addBox(-0.5359F, 2.0172F, -0.2828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(1.5728F, 11.4061F, -7.7213F, -0.2235F, -0.0075F, -0.0982F));

		PartDefinition Box_r59 = bone5.addOrReplaceChild("Box_r59", CubeListBuilder.create().texOffs(135, 88).mirror().addBox(-0.4729F, 1.1712F, -1.3208F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(142, 77).mirror().addBox(-0.4729F, -1.4893F, -0.7227F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5728F, 11.2311F, -7.5963F, -0.4841F, -0.0223F, -0.0425F));

		PartDefinition Box_r60 = bone5.addOrReplaceChild("Box_r60", CubeListBuilder.create().texOffs(34, 142).mirror().addBox(-0.5171F, -4.0707F, -0.0139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6228F, 11.2311F, -7.5963F, -0.3229F, -0.0229F, -0.0569F));

		PartDefinition Box_r61 = bone5.addOrReplaceChild("Box_r61", CubeListBuilder.create().texOffs(142, 25).mirror().addBox(-0.4729F, -1.5102F, -0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(1.5728F, 11.2311F, -7.5963F, -0.519F, -0.0223F, -0.0425F));

		PartDefinition Box_r62 = bone5.addOrReplaceChild("Box_r62", CubeListBuilder.create().texOffs(59, 142).mirror().addBox(-0.5171F, -4.0459F, -0.4887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.6228F, 11.2311F, -7.5963F, -0.3447F, -0.0229F, -0.0569F));

		PartDefinition Box_r63 = bone5.addOrReplaceChild("Box_r63", CubeListBuilder.create().texOffs(135, 135).mirror().addBox(-0.9682F, -0.0387F, -0.3112F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(142, 82).mirror().addBox(-0.9682F, 1.9337F, 0.0696F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(1.1534F, 3.0054F, -4.9445F, -0.332F, 0.0052F, -0.1483F));

		PartDefinition Box_r64 = bone5.addOrReplaceChild("Box_r64", CubeListBuilder.create().texOffs(20, 141).mirror().addBox(-0.9682F, -0.9011F, 0.5933F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.1534F, 3.0054F, -4.9445F, -0.6112F, 0.0052F, -0.1483F));

		PartDefinition Box_r65 = bone5.addOrReplaceChild("Box_r65", CubeListBuilder.create().texOffs(109, 129).mirror().addBox(-0.9682F, -3.7473F, -0.2972F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(1.1534F, 3.0054F, -4.9445F, -1.3412F, -0.0383F, -0.1434F));

		PartDefinition Box_r66 = bone5.addOrReplaceChild("Box_r66", CubeListBuilder.create().texOffs(116, 132).mirror().addBox(-0.5F, -0.2348F, -0.3359F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5357F, 1.8289F, 2.8785F, -3.1071F, 0.2775F, -0.0586F));

		PartDefinition Box_r67 = bone5.addOrReplaceChild("Box_r67", CubeListBuilder.create().texOffs(91, 124).mirror().addBox(-0.5F, -0.85F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6335F, 3.2983F, 2.4415F, -1.3864F, 0.126F, -0.1628F));

		PartDefinition Box_r68 = bone5.addOrReplaceChild("Box_r68", CubeListBuilder.create().texOffs(142, 127).mirror().addBox(-0.5F, -1.7488F, -0.2725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.5357F, 1.8289F, 2.8785F, -2.6185F, 0.2775F, -0.0586F));

		PartDefinition Box_r69 = bone5.addOrReplaceChild("Box_r69", CubeListBuilder.create().texOffs(26, 136).mirror().addBox(-0.0294F, 0.0198F, -0.6275F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(1.19F, 4.5728F, 6.4305F, -1.861F, 0.2834F, -0.0083F));

		PartDefinition Box_r70 = bone5.addOrReplaceChild("Box_r70", CubeListBuilder.create().texOffs(54, 132).mirror().addBox(-0.0294F, -0.9802F, -0.6275F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(1.19F, 4.5728F, 6.4305F, -2.018F, 0.2834F, -0.0083F));

		PartDefinition Box_r71 = bone5.addOrReplaceChild("Box_r71", CubeListBuilder.create().texOffs(145, 49).mirror().addBox(-0.5F, -0.9F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8715F, 7.5102F, 8.9951F, -2.849F, 0.0242F, -0.0438F));

		PartDefinition Box_r72 = bone5.addOrReplaceChild("Box_r72", CubeListBuilder.create().texOffs(142, 123).mirror().addBox(-0.0094F, -1.3964F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.19F, 4.5478F, 6.5055F, -2.1508F, 0.0242F, -0.0438F));

		PartDefinition Box_r73 = bone5.addOrReplaceChild("Box_r73", CubeListBuilder.create().texOffs(147, 26).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.9442F, 8.7924F, 9.6696F, -1.54F, 0.0242F, -0.0438F));

		PartDefinition Box_r74 = bone5.addOrReplaceChild("Box_r74", CubeListBuilder.create().texOffs(93, 146).mirror().addBox(-0.0094F, -4.7182F, -3.5513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(1.19F, 4.5478F, 6.5055F, -3.0235F, 0.0242F, -0.0438F));

		PartDefinition Box_r75 = bone5.addOrReplaceChild("Box_r75", CubeListBuilder.create().texOffs(105, 136).mirror().addBox(-0.5F, -0.725F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(1.8869F, 7.4089F, 9.811F, 2.5615F, 0.0242F, -0.0438F));

		PartDefinition Box_r76 = bone5.addOrReplaceChild("Box_r76", CubeListBuilder.create().texOffs(146, 72).mirror().addBox(-0.5F, -0.625F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.9421F, 8.2516F, 10.5638F, -1.7581F, 0.0242F, -0.0438F));

		PartDefinition Box_r77 = bone5.addOrReplaceChild("Box_r77", CubeListBuilder.create().texOffs(15, 141).mirror().addBox(-0.5F, -1.3F, -0.275F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.8191F, 6.4944F, 8.6689F, -2.5174F, 0.0242F, -0.0438F));

		PartDefinition Box_r78 = bone5.addOrReplaceChild("Box_r78", CubeListBuilder.create().texOffs(100, 138).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8191F, 6.4944F, 8.6689F, -2.4126F, 0.0242F, -0.0438F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -1.2975F, -9.8916F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(49, 129).addBox(0.0F, -6.9975F, -5.8916F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, -7.1287F, -0.014F, 0.0873F, -0.0012F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(55, 123).addBox(0.0F, -5.7F, -0.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2975F, -2.7916F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(25, 49).addBox(0.0F, -5.5F, -2.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2975F, -6.8916F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Box_r79 = Bodymiddle.addOrReplaceChild("Box_r79", CubeListBuilder.create().texOffs(100, 63).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.0098F, 0.0013F, -0.4538F));

		PartDefinition Box_r80 = Bodymiddle.addOrReplaceChild("Box_r80", CubeListBuilder.create().texOffs(128, 142).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.0091F, -0.0038F, -0.9774F));

		PartDefinition Box_r81 = Bodymiddle.addOrReplaceChild("Box_r81", CubeListBuilder.create().texOffs(142, 91).mirror().addBox(-4.0367F, -1.9076F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.006F, -0.0078F, -1.501F));

		PartDefinition Box_r82 = Bodymiddle.addOrReplaceChild("Box_r82", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.1071F, 0.0376F, -0.3296F));

		PartDefinition Box_r83 = Bodymiddle.addOrReplaceChild("Box_r83", CubeListBuilder.create().texOffs(140, 53).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.074F, 0.086F, -0.852F));

		PartDefinition Box_r84 = Bodymiddle.addOrReplaceChild("Box_r84", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-7.0367F, -1.9076F, -0.4895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.021F, 0.1115F, -1.3776F));

		PartDefinition Box_r85 = Bodymiddle.addOrReplaceChild("Box_r85", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.2908F, 0.0947F, -0.3F));

		PartDefinition Box_r86 = Bodymiddle.addOrReplaceChild("Box_r86", CubeListBuilder.create().texOffs(17, 74).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.2066F, 0.2266F, -0.8139F));

		PartDefinition Box_r87 = Bodymiddle.addOrReplaceChild("Box_r87", CubeListBuilder.create().texOffs(81, 65).mirror().addBox(-9.0367F, -1.9076F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.0637F, 0.2989F, -1.3515F));

		PartDefinition Box_r88 = Bodymiddle.addOrReplaceChild("Box_r88", CubeListBuilder.create().texOffs(100, 63).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.0098F, -0.0013F, 0.4538F));

		PartDefinition Box_r89 = Bodymiddle.addOrReplaceChild("Box_r89", CubeListBuilder.create().texOffs(128, 142).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.0091F, 0.0038F, 0.9774F));

		PartDefinition Box_r90 = Bodymiddle.addOrReplaceChild("Box_r90", CubeListBuilder.create().texOffs(142, 91).addBox(2.0367F, -1.9076F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.006F, 0.0078F, 1.501F));

		PartDefinition Box_r91 = Bodymiddle.addOrReplaceChild("Box_r91", CubeListBuilder.create().texOffs(99, 79).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.1071F, -0.0376F, 0.3296F));

		PartDefinition Box_r92 = Bodymiddle.addOrReplaceChild("Box_r92", CubeListBuilder.create().texOffs(140, 53).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.074F, -0.086F, 0.852F));

		PartDefinition Box_r93 = Bodymiddle.addOrReplaceChild("Box_r93", CubeListBuilder.create().texOffs(117, 62).addBox(2.0367F, -1.9076F, -0.4895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.021F, -0.1115F, 1.3776F));

		PartDefinition Box_r94 = Bodymiddle.addOrReplaceChild("Box_r94", CubeListBuilder.create().texOffs(25, 58).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.2908F, -0.0947F, 0.3F));

		PartDefinition Box_r95 = Bodymiddle.addOrReplaceChild("Box_r95", CubeListBuilder.create().texOffs(17, 74).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.2066F, -0.2266F, 0.8139F));

		PartDefinition Box_r96 = Bodymiddle.addOrReplaceChild("Box_r96", CubeListBuilder.create().texOffs(81, 65).addBox(2.0367F, -1.9076F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.0637F, -0.2989F, 1.3515F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(31, 33).addBox(-3.5F, -0.5F, -2.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.2025F, -7.8916F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 84).addBox(-1.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(60, 127).addBox(0.0F, -5.7F, -2.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6975F, -9.6916F, 0.0788F, 0.087F, 0.0069F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(95, 130).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Box_r97 = body.addOrReplaceChild("Box_r97", CubeListBuilder.create().texOffs(71, 106).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.258F, 0.082F, -0.2857F));

		PartDefinition Box_r98 = body.addOrReplaceChild("Box_r98", CubeListBuilder.create().texOffs(143, 45).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.1839F, 0.1994F, -0.8015F));

		PartDefinition Box_r99 = body.addOrReplaceChild("Box_r99", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(-12.0367F, -1.9076F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.0582F, 0.2643F, -1.3358F));

		PartDefinition Box_r100 = body.addOrReplaceChild("Box_r100", CubeListBuilder.create().texOffs(102, 42).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.3082F, 0.0975F, -0.2811F));

		PartDefinition Box_r101 = body.addOrReplaceChild("Box_r101", CubeListBuilder.create().texOffs(143, 43).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.2207F, 0.2375F, -0.7934F));

		PartDefinition Box_r102 = body.addOrReplaceChild("Box_r102", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-13.0367F, -1.9076F, -0.4895F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.0701F, 0.3154F, -1.3323F));

		PartDefinition Box_r103 = body.addOrReplaceChild("Box_r103", CubeListBuilder.create().texOffs(71, 106).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.258F, -0.082F, 0.2857F));

		PartDefinition Box_r104 = body.addOrReplaceChild("Box_r104", CubeListBuilder.create().texOffs(143, 45).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.1839F, -0.1994F, 0.8015F));

		PartDefinition Box_r105 = body.addOrReplaceChild("Box_r105", CubeListBuilder.create().texOffs(81, 61).addBox(2.0367F, -1.9076F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.0582F, -0.2643F, 1.3358F));

		PartDefinition Box_r106 = body.addOrReplaceChild("Box_r106", CubeListBuilder.create().texOffs(102, 42).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.3082F, -0.0975F, 0.2811F));

		PartDefinition Box_r107 = body.addOrReplaceChild("Box_r107", CubeListBuilder.create().texOffs(143, 43).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.2207F, -0.2375F, 0.7934F));

		PartDefinition Box_r108 = body.addOrReplaceChild("Box_r108", CubeListBuilder.create().texOffs(81, 57).addBox(2.0367F, -1.9076F, -0.4895F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.0701F, -0.3154F, 1.3323F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(62, 36).addBox(-3.0F, -2.0189F, -5.0902F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.4847F, -1.1974F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(134, 63).addBox(0.0F, -4.708F, -3.8038F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -7.15F, 0.0868F, 0.1268F, 0.0546F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(100, 130).addBox(0.0F, -4.3208F, 0.064F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7564F, -0.8706F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(72, 145).addBox(0.0F, -3.2208F, -1.036F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 117).addBox(0.0F, -3.2208F, 0.964F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0137F, -6.765F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(17, 76).addBox(-2.5F, -0.25F, -2.375F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 12.6364F, -2.4002F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Box_r109 = Bodyfront.addOrReplaceChild("Box_r109", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(-0.9383F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -7.3831F, 0.3243F, 0.105F, -0.2967F));

		PartDefinition Box_r110 = Bodyfront.addOrReplaceChild("Box_r110", CubeListBuilder.create().texOffs(144, 2).mirror().addBox(-2.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -7.3831F, 0.2313F, 0.2519F, -0.8081F));

		PartDefinition Box_r111 = Bodyfront.addOrReplaceChild("Box_r111", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-14.0367F, -1.9076F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -7.3831F, 0.0717F, 0.333F, -1.349F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-8.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6766F, 12.99F, -6.2206F, -0.796F, 0.8493F, -0.1584F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(115, 32).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6766F, 12.99F, -6.2206F, -0.4691F, 0.5595F, 0.0814F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(118, 54).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 12.6364F, -7.1772F, -0.4306F, 0.3426F, 0.1839F));

		PartDefinition Box_r112 = Bodyfront.addOrReplaceChild("Box_r112", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-15.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -5.3831F, 0.0717F, 0.333F, -1.349F));

		PartDefinition Box_r113 = Bodyfront.addOrReplaceChild("Box_r113", CubeListBuilder.create().texOffs(143, 110).mirror().addBox(-2.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -5.3831F, 0.2313F, 0.2519F, -0.8081F));

		PartDefinition Box_r114 = Bodyfront.addOrReplaceChild("Box_r114", CubeListBuilder.create().texOffs(150, 87).mirror().addBox(-0.9383F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1222F, -5.3831F, 0.3243F, 0.105F, -0.2967F));

		PartDefinition Box_r115 = Bodyfront.addOrReplaceChild("Box_r115", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-15.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.0785F, 0.3314F, -1.3125F));

		PartDefinition Box_r116 = Bodyfront.addOrReplaceChild("Box_r116", CubeListBuilder.create().texOffs(69, 143).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.2362F, 0.2472F, -0.7726F));

		PartDefinition Box_r117 = Bodyfront.addOrReplaceChild("Box_r117", CubeListBuilder.create().texOffs(148, 18).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.3262F, 0.0986F, -0.2622F));

		PartDefinition Box_r118 = Bodyfront.addOrReplaceChild("Box_r118", CubeListBuilder.create().texOffs(33, 15).mirror().addBox(-15.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.0788F, 0.3133F, -1.2957F));

		PartDefinition Box_r119 = Bodyfront.addOrReplaceChild("Box_r119", CubeListBuilder.create().texOffs(143, 47).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.2268F, 0.2315F, -0.758F));

		PartDefinition Box_r120 = Bodyfront.addOrReplaceChild("Box_r120", CubeListBuilder.create().texOffs(147, 108).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.3105F, 0.0894F, -0.2469F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(81, 63).addBox(0.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6766F, 12.99F, -6.2206F, -0.796F, -0.8493F, 0.1584F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(115, 32).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6766F, 12.99F, -6.2206F, -0.4691F, -0.5595F, -0.0814F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(118, 54).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 12.6364F, -7.1772F, -0.4306F, -0.3426F, -0.1839F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(117, 97).addBox(-2.7531F, 1.0135F, -2.7105F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.7531F, 11.4878F, -5.6163F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(112, 65).addBox(-3.2531F, 1.35F, -5.4245F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.7531F, 11.4878F, -5.6163F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -1.6208F, 4.864F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3274F, -12.7292F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r121 = Bodyfront.addOrReplaceChild("Box_r121", CubeListBuilder.create().texOffs(79, 44).addBox(2.0367F, -1.9076F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -7.3831F, 0.0717F, -0.333F, 1.349F));

		PartDefinition Box_r122 = Bodyfront.addOrReplaceChild("Box_r122", CubeListBuilder.create().texOffs(144, 2).addBox(0.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -7.3831F, 0.2313F, -0.2519F, 0.8081F));

		PartDefinition Box_r123 = Bodyfront.addOrReplaceChild("Box_r123", CubeListBuilder.create().texOffs(150, 110).addBox(-0.0617F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -7.3831F, 0.3243F, -0.105F, 0.2967F));

		PartDefinition Box_r124 = Bodyfront.addOrReplaceChild("Box_r124", CubeListBuilder.create().texOffs(69, 69).addBox(2.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -5.3831F, 0.0717F, -0.333F, 1.349F));

		PartDefinition Box_r125 = Bodyfront.addOrReplaceChild("Box_r125", CubeListBuilder.create().texOffs(143, 110).addBox(0.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -5.3831F, 0.2313F, -0.2519F, 0.8081F));

		PartDefinition Box_r126 = Bodyfront.addOrReplaceChild("Box_r126", CubeListBuilder.create().texOffs(150, 87).addBox(-0.0617F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1222F, -5.3831F, 0.3243F, -0.105F, 0.2967F));

		PartDefinition Box_r127 = Bodyfront.addOrReplaceChild("Box_r127", CubeListBuilder.create().texOffs(69, 67).addBox(2.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.0785F, -0.3314F, 1.3125F));

		PartDefinition Box_r128 = Bodyfront.addOrReplaceChild("Box_r128", CubeListBuilder.create().texOffs(69, 143).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.2362F, -0.2472F, 0.7726F));

		PartDefinition Box_r129 = Bodyfront.addOrReplaceChild("Box_r129", CubeListBuilder.create().texOffs(148, 18).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.3262F, -0.0986F, 0.2622F));

		PartDefinition Box_r130 = Bodyfront.addOrReplaceChild("Box_r130", CubeListBuilder.create().texOffs(33, 15).addBox(2.0367F, -1.9076F, -0.4895F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.0788F, -0.3133F, 1.2957F));

		PartDefinition Box_r131 = Bodyfront.addOrReplaceChild("Box_r131", CubeListBuilder.create().texOffs(143, 47).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.2268F, -0.2315F, 0.758F));

		PartDefinition Box_r132 = Bodyfront.addOrReplaceChild("Box_r132", CubeListBuilder.create().texOffs(147, 108).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.3105F, -0.0894F, 0.2469F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3652F, 9.1F, -8.062F, 0.5041F, 0.1644F, -0.0512F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(88, 140).addBox(-0.5F, -1.2796F, -1.0077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0505F, 4.0893F, 1.4467F, 0.466F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(25, 143).addBox(-0.5F, -1.9796F, -0.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.013F, 5.9879F, 0.3496F, 0.0384F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(20, 146).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.027F, 0.3351F, 0.0069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftarm1.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(146, 119).addBox(-0.5F, -1.025F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.027F, 2.6517F, -1.0283F, -2.1555F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftarm1.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(146, 116).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.027F, 1.7382F, -1.435F, -1.1519F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftarm1.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(134, 33).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.027F, -0.0648F, 0.0069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftarm1.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(139, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.027F, 0.0719F, -0.4741F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r8 = Leftarm1.addOrReplaceChild("Leftupperarm_r8", CubeListBuilder.create().texOffs(135, 142).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(109, 146).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.027F, -0.1649F, 1.4069F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(82, 108).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 136).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.023F, 6.1696F, 0.9034F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(96, 46).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.1309F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3652F, 9.1F, -8.062F, 0.5041F, -0.1644F, 0.0512F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(141, 38).addBox(-0.5F, -1.2796F, -1.0077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0505F, 4.0893F, 1.4467F, 0.466F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(104, 145).addBox(-0.5F, -1.9796F, -0.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.013F, 5.9879F, 0.3496F, 0.0384F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(146, 33).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.027F, 0.3351F, 0.0069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightarm1.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(20, 150).addBox(-0.5F, -1.025F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.027F, 2.6517F, -1.0283F, -2.1555F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightarm1.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(15, 150).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.027F, 1.7382F, -1.435F, -1.1519F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightarm1.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(135, 83).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.027F, -0.0648F, 0.0069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightarm1.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(139, 131).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.027F, 0.0719F, -0.4741F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r8 = Rightarm1.addOrReplaceChild("Rightupperarm_r8", CubeListBuilder.create().texOffs(85, 145).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(143, 149).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.027F, -0.1649F, 1.4069F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(130, 135).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 138).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.023F, 6.1696F, 0.9034F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(76, 97).addBox(0.0F, 0.0F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.1309F, 0.0F, -0.2182F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0315F, 4.6145F, -8.9167F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Box_r133 = bone2.addOrReplaceChild("Box_r133", CubeListBuilder.create().texOffs(143, 112).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4685F, -6.1281F, 7.0344F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Box_r134 = bone2.addOrReplaceChild("Box_r134", CubeListBuilder.create().texOffs(134, 38).addBox(-0.5F, -0.775F, -1.325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4685F, -6.1692F, 6.4831F, 0.4625F, 0.0F, 0.0F));

		PartDefinition Box_r135 = bone2.addOrReplaceChild("Box_r135", CubeListBuilder.create().texOffs(85, 26).addBox(-0.5F, -1.175F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4685F, -5.9479F, 6.9912F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Box_r136 = bone2.addOrReplaceChild("Box_r136", CubeListBuilder.create().texOffs(99, 65).addBox(-0.5F, 0.025F, -0.425F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4685F, -3.0927F, 1.6843F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Box_r137 = bone2.addOrReplaceChild("Box_r137", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4685F, -0.935F, 1.0564F, 0.829F, 0.0F, 0.0F));

		PartDefinition Box_r138 = bone2.addOrReplaceChild("Box_r138", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5864F, 0.1684F, -2.7054F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0145F)), PartPose.offsetAndRotation(-1.4408F, 4.9582F, -2.9178F, 1.7861F, 0.069F, 0.6514F));

		PartDefinition Box_r139 = bone2.addOrReplaceChild("Box_r139", CubeListBuilder.create().texOffs(87, 107).addBox(-0.5864F, -0.8872F, -1.7136F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4408F, 4.9582F, -2.9178F, 0.9571F, 0.069F, 0.6514F));

		PartDefinition Box_r140 = bone2.addOrReplaceChild("Box_r140", CubeListBuilder.create().texOffs(114, 70).addBox(-0.5864F, -3.3207F, -1.086F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4408F, 4.9582F, -2.9178F, 0.6953F, 0.069F, 0.6514F));

		PartDefinition Box_r141 = bone2.addOrReplaceChild("Box_r141", CubeListBuilder.create().texOffs(142, 87).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4685F, 1.064F, -4.3542F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Box_r142 = bone2.addOrReplaceChild("Box_r142", CubeListBuilder.create().texOffs(37, 123).addBox(-0.5F, -0.6F, -3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4685F, 3.2618F, -0.4593F, -1.85F, 0.0F, 0.0F));

		PartDefinition Box_r143 = bone2.addOrReplaceChild("Box_r143", CubeListBuilder.create().texOffs(104, 79).addBox(-0.5F, -2.9F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4685F, 1.064F, -4.3542F, -0.9774F, 0.0F, 0.0F));

		PartDefinition Box_r144 = bone2.addOrReplaceChild("Box_r144", CubeListBuilder.create().texOffs(122, 108).addBox(-0.5F, -1.2F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4685F, 1.3776F, -1.3706F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Box_r145 = bone2.addOrReplaceChild("Box_r145", CubeListBuilder.create().texOffs(132, 70).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4685F, 0.9232F, 0.1635F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r146 = bone2.addOrReplaceChild("Box_r146", CubeListBuilder.create().texOffs(44, 99).addBox(-0.5F, -1.5F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4685F, 2.0352F, -0.1879F, 0.8552F, 0.0F, 0.0F));

		PartDefinition Box_r147 = bone2.addOrReplaceChild("Box_r147", CubeListBuilder.create().texOffs(54, 140).addBox(-0.5864F, -2.9231F, -1.9343F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4408F, 4.9582F, -2.9178F, 0.4335F, 0.069F, 0.6514F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0315F, 4.6145F, -8.9167F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Box_r148 = bone4.addOrReplaceChild("Box_r148", CubeListBuilder.create().texOffs(143, 112).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, -6.1281F, 7.0344F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Box_r149 = bone4.addOrReplaceChild("Box_r149", CubeListBuilder.create().texOffs(134, 38).mirror().addBox(-0.5F, -0.775F, -1.325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, -6.1692F, 6.4831F, 0.4625F, 0.0F, 0.0F));

		PartDefinition Box_r150 = bone4.addOrReplaceChild("Box_r150", CubeListBuilder.create().texOffs(85, 26).mirror().addBox(-0.5F, -1.175F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, -5.9479F, 6.9912F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Box_r151 = bone4.addOrReplaceChild("Box_r151", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-0.5F, 0.025F, -0.425F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, -3.0927F, 1.6843F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Box_r152 = bone4.addOrReplaceChild("Box_r152", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.5F, -1.0F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, -0.935F, 1.0564F, 0.829F, 0.0F, 0.0F));

		PartDefinition Box_r153 = bone4.addOrReplaceChild("Box_r153", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-0.4136F, 0.1684F, -2.7054F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0145F)).mirror(false), PartPose.offsetAndRotation(1.4408F, 4.9582F, -2.9178F, 1.7861F, -0.069F, -0.6514F));

		PartDefinition Box_r154 = bone4.addOrReplaceChild("Box_r154", CubeListBuilder.create().texOffs(87, 107).mirror().addBox(-0.4136F, -0.8872F, -1.7136F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4408F, 4.9582F, -2.9178F, 0.9571F, -0.069F, -0.6514F));

		PartDefinition Box_r155 = bone4.addOrReplaceChild("Box_r155", CubeListBuilder.create().texOffs(114, 70).mirror().addBox(-0.4136F, -3.3207F, -1.086F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4408F, 4.9582F, -2.9178F, 0.6953F, -0.069F, -0.6514F));

		PartDefinition Box_r156 = bone4.addOrReplaceChild("Box_r156", CubeListBuilder.create().texOffs(142, 87).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 1.064F, -4.3542F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Box_r157 = bone4.addOrReplaceChild("Box_r157", CubeListBuilder.create().texOffs(37, 123).mirror().addBox(-0.5F, -0.6F, -3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 3.2618F, -0.4593F, -1.85F, 0.0F, 0.0F));

		PartDefinition Box_r158 = bone4.addOrReplaceChild("Box_r158", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.5F, -2.9F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 1.064F, -4.3542F, -0.9774F, 0.0F, 0.0F));

		PartDefinition Box_r159 = bone4.addOrReplaceChild("Box_r159", CubeListBuilder.create().texOffs(122, 108).mirror().addBox(-0.5F, -1.2F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 1.3776F, -1.3706F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Box_r160 = bone4.addOrReplaceChild("Box_r160", CubeListBuilder.create().texOffs(132, 70).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 0.9232F, 0.1635F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r161 = bone4.addOrReplaceChild("Box_r161", CubeListBuilder.create().texOffs(44, 99).mirror().addBox(-0.5F, -1.5F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4685F, 2.0352F, -0.1879F, 0.8552F, 0.0F, 0.0F));

		PartDefinition Box_r162 = bone4.addOrReplaceChild("Box_r162", CubeListBuilder.create().texOffs(54, 140).mirror().addBox(-0.4136F, -2.9231F, -1.9343F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4408F, 4.9582F, -2.9178F, 0.4335F, -0.069F, -0.6514F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2124F, -7.9894F, -0.1704F, 0.129F, -0.0221F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(105, 130).addBox(0.0F, -2.8F, -1.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -0.9316F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neck1.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(90, 145).addBox(0.0F, -2.6F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8262F, -3.9086F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Box_r163 = Neck1.addOrReplaceChild("Box_r163", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-13.0367F, -1.9076F, -0.4895F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0902F, -1.3937F, 0.106F, 0.469F, -1.3356F));

		PartDefinition Box_r164 = Neck1.addOrReplaceChild("Box_r164", CubeListBuilder.create().texOffs(52, 151).mirror().addBox(-0.9383F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0902F, -1.3937F, 0.4592F, 0.1447F, -0.2799F));

		PartDefinition Box_r165 = Neck1.addOrReplaceChild("Box_r165", CubeListBuilder.create().texOffs(144, 55).mirror().addBox(-2.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0902F, -1.3937F, 0.3339F, 0.3514F, -0.7775F));

		PartDefinition Box_r166 = Neck1.addOrReplaceChild("Box_r166", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-7.7176F, -0.5337F, -0.5395F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1098F, -3.3937F, 0.1182F, 0.4908F, -1.1346F));

		PartDefinition Box_r167 = Neck1.addOrReplaceChild("Box_r167", CubeListBuilder.create().texOffs(69, 151).mirror().addBox(-0.9383F, -0.09F, -0.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1098F, -3.3937F, 0.3561F, 0.3642F, -0.5744F));

		PartDefinition Box_r168 = Neck1.addOrReplaceChild("Box_r168", CubeListBuilder.create().texOffs(85, 42).addBox(0.7176F, -0.5337F, -0.5395F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1098F, -3.3937F, 0.1182F, -0.4908F, 1.1346F));

		PartDefinition Box_r169 = Neck1.addOrReplaceChild("Box_r169", CubeListBuilder.create().texOffs(69, 151).addBox(-0.0617F, -0.09F, -0.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1098F, -3.3937F, 0.3561F, -0.3642F, 0.5744F));

		PartDefinition Box_r170 = Neck1.addOrReplaceChild("Box_r170", CubeListBuilder.create().texOffs(144, 55).addBox(0.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0902F, -1.3937F, 0.3339F, -0.3514F, 0.7775F));

		PartDefinition Box_r171 = Neck1.addOrReplaceChild("Box_r171", CubeListBuilder.create().texOffs(52, 151).addBox(-0.0617F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0902F, -1.3937F, 0.4592F, -0.1447F, 0.2799F));

		PartDefinition Box_r172 = Neck1.addOrReplaceChild("Box_r172", CubeListBuilder.create().texOffs(81, 59).addBox(2.0367F, -1.9076F, -0.4895F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0902F, -1.3937F, 0.106F, -0.469F, 1.3356F));

		PartDefinition Neckbase_r3 = Neck1.addOrReplaceChild("Neckbase_r3", CubeListBuilder.create().texOffs(47, 91).addBox(-1.0F, -1.1F, -0.35F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.3859F, -4.4563F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6859F, -4.1563F, -0.1886F, 0.0758F, 0.1632F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(143, 116).addBox(0.0F, -2.8F, -1.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2989F, -0.5688F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r2 = Neck2.addOrReplaceChild("Neckmiddlebase_r2", CubeListBuilder.create().texOffs(5, 131).addBox(0.0F, -2.8F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1371F, -3.5661F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r173 = Neck2.addOrReplaceChild("Box_r173", CubeListBuilder.create().texOffs(102, 14).mirror().addBox(-3.9383F, -0.0899F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1761F, -2.9374F, 0.2242F, 0.8298F, -1.0372F));

		PartDefinition Box_r174 = Neck2.addOrReplaceChild("Box_r174", CubeListBuilder.create().texOffs(150, 93).mirror().addBox(-0.9383F, -0.09F, -0.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2761F, -0.9374F, 0.5706F, 0.4794F, -0.4861F));

		PartDefinition Box_r175 = Neck2.addOrReplaceChild("Box_r175", CubeListBuilder.create().texOffs(123, 76).mirror().addBox(-5.7176F, -0.5337F, -0.5395F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2761F, -0.9374F, 0.2421F, 0.6933F, -1.065F));

		PartDefinition Box_r176 = Neck2.addOrReplaceChild("Box_r176", CubeListBuilder.create().texOffs(102, 14).addBox(-0.0617F, -0.0899F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1761F, -2.9374F, 0.2242F, -0.8298F, 1.0372F));

		PartDefinition Box_r177 = Neck2.addOrReplaceChild("Box_r177", CubeListBuilder.create().texOffs(150, 93).addBox(-0.0617F, -0.09F, -0.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2761F, -0.9374F, 0.5706F, -0.4794F, 0.4861F));

		PartDefinition Box_r178 = Neck2.addOrReplaceChild("Box_r178", CubeListBuilder.create().texOffs(123, 76).addBox(0.7176F, -0.5337F, -0.5395F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2761F, -0.9374F, 0.2421F, -0.6933F, 1.065F));

		PartDefinition Neckmiddlebase_r3 = Neck2.addOrReplaceChild("Neckmiddlebase_r3", CubeListBuilder.create().texOffs(100, 23).addBox(-1.0F, -0.9F, 1.85F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1243F, -6.363F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(143, 140).addBox(0.0F, -4.1951F, -1.8111F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3583F, -4.3379F, -0.0269F, 0.0277F, 0.1723F));

		PartDefinition Box_r179 = Neck3.addOrReplaceChild("Box_r179", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(-3.9383F, -0.09F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4344F, -1.2994F, 0.2141F, 1.1967F, -1.1142F));

		PartDefinition Box_r180 = Neck3.addOrReplaceChild("Box_r180", CubeListBuilder.create().texOffs(130, 31).addBox(-0.0617F, -0.09F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4344F, -1.2994F, 0.2141F, -1.1967F, 1.1142F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(115, 91).addBox(-1.0F, -1.4F, 2.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2275F, -5.828F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(10, 104).addBox(0.0F, -3.2788F, -4.9904F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5745F, -2.4352F, 0.0085F, 0.4335F, -0.0516F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(148, 13).addBox(0.0F, -2.4F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -0.949F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Neck4.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(118, 145).addBox(0.0F, -2.2F, -1.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1045F, -1.948F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r181 = Neck4.addOrReplaceChild("Box_r181", CubeListBuilder.create().texOffs(131, 53).mirror().addBox(-2.9383F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1599F, -4.4643F, 0.1085F, 1.0734F, -1.2535F));

		PartDefinition Box_r182 = Neck4.addOrReplaceChild("Box_r182", CubeListBuilder.create().texOffs(130, 61).mirror().addBox(-3.9383F, 0.01F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1599F, -2.4643F, 0.2316F, 1.1033F, -1.0712F));

		PartDefinition Box_r183 = Neck4.addOrReplaceChild("Box_r183", CubeListBuilder.create().texOffs(131, 53).addBox(-0.0617F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1599F, -4.4643F, 0.1085F, -1.0734F, 1.2535F));

		PartDefinition Box_r184 = Neck4.addOrReplaceChild("Box_r184", CubeListBuilder.create().texOffs(130, 61).addBox(-0.0617F, 0.01F, -0.5395F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1599F, -2.4643F, 0.2316F, -1.1033F, 1.0712F));

		PartDefinition Neckfront_r3 = Neck4.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(89, 81).addBox(-1.0F, -1.4F, -1.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -4.0711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.9F, 0.1736F, 0.1615F, 0.0664F));

		PartDefinition Neckfront_r4 = Neck5.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(134, 146).addBox(0.0F, -2.1F, -0.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1916F, -1.7442F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neckfront_r5 = Neck5.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(150, 95).addBox(0.0F, -1.8F, -1.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2788F, -2.7404F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r185 = Neck5.addOrReplaceChild("Box_r185", CubeListBuilder.create().texOffs(136, 75).mirror().addBox(-2.9383F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0599F, -3.1643F, 0.1744F, 0.9322F, -1.1381F));

		PartDefinition Box_r186 = Neck5.addOrReplaceChild("Box_r186", CubeListBuilder.create().texOffs(135, 105).mirror().addBox(-2.9383F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0599F, -1.3643F, -0.0007F, 0.8159F, -1.4195F));

		PartDefinition Box_r187 = Neck5.addOrReplaceChild("Box_r187", CubeListBuilder.create().texOffs(136, 75).addBox(-0.0617F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0599F, -3.1643F, 0.1744F, -0.9322F, 1.1381F));

		PartDefinition Box_r188 = Neck5.addOrReplaceChild("Box_r188", CubeListBuilder.create().texOffs(135, 105).addBox(-0.0617F, -0.09F, -0.5395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0599F, -1.3643F, -0.0007F, -0.8159F, 1.4195F));

		PartDefinition Neckfront_r6 = Neck5.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(102, 7).addBox(-1.0F, -1.4F, -1.05F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.8711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.7F, 0.3238F, 0.2072F, 0.0689F));

		PartDefinition Neckfront_r7 = Neck6.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(105, 140).addBox(0.0F, -1.9F, -1.95F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9052F, -0.6654F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Box_r189 = Neck6.addOrReplaceChild("Box_r189", CubeListBuilder.create().texOffs(144, 0).mirror().addBox(-1.9383F, 0.01F, -0.5395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0401F, -1.0643F, 0.1245F, 0.5869F, -1.2094F));

		PartDefinition Box_r190 = Neck6.addOrReplaceChild("Box_r190", CubeListBuilder.create().texOffs(144, 0).addBox(-0.0617F, 0.01F, -0.5395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0401F, -1.0643F, 0.1245F, -0.5869F, 1.2094F));

		PartDefinition Neckfront_r8 = Neck6.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(128, 56).addBox(-1.0F, -1.4F, -1.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = Neck6.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(115, 102).addBox(-1.0F, -1.4F, -0.05F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2549F, -3.5694F, 0.0451F, -0.1289F, -0.0229F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(126, 93).addBox(-2.0F, -0.45F, -0.575F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3613F, 0.1637F, 0.829F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(109, 122).addBox(-1.0F, -4.886F, -2.1285F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9529F, -4.7936F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 127).addBox(-1.2483F, 0.3579F, -3.2009F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7483F, -2.3343F, -0.737F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 107).addBox(-1.7483F, -0.4662F, -1.1836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -0.5407F, -1.3718F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 137).addBox(-1.2483F, 0.4236F, -0.8976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -2.4098F, -1.8342F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(87, 102).addBox(-2.4947F, -0.9256F, -3.2296F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4947F, -1.5367F, -0.0401F, 1.2727F, 0.0094F, -0.0069F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(102, 37).addBox(-2.5056F, -0.7734F, -3.201F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5056F, -0.8209F, 0.5693F, 0.6793F, 0.0084F, -0.0081F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(85, 35).addBox(-2.0008F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0008F, -2.4077F, -3.332F, 1.5695F, 0.006F, -0.01F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(89, 89).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0023F, -2.2078F, -2.3892F, 1.3426F, 0.0065F, -0.0096F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(99, 73).addBox(-2.0F, -1.0F, -1.525F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0028F, -0.4481F, -2.0151F, 1.1942F, 0.0084F, -0.0081F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(71, 122).addBox(-3.0F, -2.6675F, -0.1213F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 5.057F, -0.0783F, 1.2305F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(60, 122).addBox(-3.0F, -2.8339F, -1.0701F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 4.557F, 0.8217F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r1 = Head.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -0.2031F, -3.9658F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.1466F, -4.7276F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r1 = Head.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(71, 116).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.362F, -16.4045F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r2 = Head.addOrReplaceChild("Upperjawslopebase_r2", CubeListBuilder.create().texOffs(44, 107).addBox(-1.0F, -0.0226F, 0.0028F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.3236F, -16.4181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r3 = Head.addOrReplaceChild("Upperjawslopebase_r3", CubeListBuilder.create().texOffs(86, 71).addBox(-0.5F, -1.925F, -2.05F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.5939F, -12.3262F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r4 = Head.addOrReplaceChild("Upperjawslopebase_r4", CubeListBuilder.create().texOffs(91, 116).addBox(-0.5F, -2.2873F, 0.1935F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.2667F, -10.161F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r5 = Head.addOrReplaceChild("Upperjawslopebase_r5", CubeListBuilder.create().texOffs(42, 129).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.6187F, -5.143F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r6 = Head.addOrReplaceChild("Upperjawslopebase_r6", CubeListBuilder.create().texOffs(74, 127).addBox(-0.5F, -2.3938F, 2.8126F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2667F, -10.161F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = Head.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(137, 93).addBox(-1.0F, 0.0F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -1.1784F, -19.1041F, 1.0647F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r3 = Head.addOrReplaceChild("Upperjawslopefront_r3", CubeListBuilder.create().texOffs(141, 30).addBox(-1.0F, 0.1F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(135, 25).addBox(-1.0F, -1.9F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.0263F, -17.5204F, 1.1868F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r4 = Head.addOrReplaceChild("Upperjawslopefront_r4", CubeListBuilder.create().texOffs(131, 107).addBox(-1.8F, 1.0304F, -1.4376F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 87).addBox(-1.8F, 0.0304F, -0.7376F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 0.4643F, -19.3176F, 1.405F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r7 = Head.addOrReplaceChild("Upperjawslopebase_r7", CubeListBuilder.create().texOffs(85, 16).addBox(-1.0F, 0.0023F, 0.0028F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.449F, -13.5132F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(102, 102).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 3.7375F, -4.9273F, -0.637F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(117, 0).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.2599F, -4.0746F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(60, 116).addBox(-3.0F, -4.272F, -1.076F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.0F, 4.8675F, -3.1458F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(102, 30).addBox(-3.0F, -3.872F, -3.076F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 4.946F, -0.1468F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(107, 42).addBox(-2.0F, -1.875F, -1.125F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5595F, -0.7423F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(104, 0).addBox(-3.0F, -2.1F, -1.85F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 3.2153F, 0.1455F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -12.8692F));

		PartDefinition Leftcrestbase_r1 = leftFace.addOrReplaceChild("Leftcrestbase_r1", CubeListBuilder.create().texOffs(85, 7).addBox(-0.5109F, -0.0289F, -6.9819F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2956F, -4.7381F, 6.6432F, 0.0633F, 0.12F, 0.2359F));

		PartDefinition Leftcrestbase_r2 = leftFace.addOrReplaceChild("Leftcrestbase_r2", CubeListBuilder.create().texOffs(150, 44).addBox(-0.5688F, -0.8337F, -0.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3035F, -3.9027F, 7.2803F, -0.0253F, 0.1331F, 0.1715F));

		PartDefinition Leftcrestbase_r3 = leftFace.addOrReplaceChild("Leftcrestbase_r3", CubeListBuilder.create().texOffs(15, 146).addBox(-0.5231F, -0.8487F, -0.141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3035F, -3.9027F, 7.2803F, -0.7126F, 0.3236F, -0.0008F));

		PartDefinition Upperjawfront_r1 = leftFace.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(45, 151).addBox(-0.283F, -0.6045F, -10.4026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1978F, 6.0469F, -0.096F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r2 = leftFace.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(30, 150).addBox(-0.5082F, -0.5989F, 4.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3677F, -0.0863F, 0.5378F, 0.0784F, 0.082F, -0.0047F));

		PartDefinition Upperjawfront_r3 = leftFace.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(114, 148).addBox(0.0F, -1.2F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 93).addBox(0.0F, -1.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 150).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1323F, 0.5137F, 0.6378F, 0.0785F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r4 = leftFace.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(151, 54).addBox(-0.075F, -0.8F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3269F, 0.2884F, -2.354F, -0.0088F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r5 = leftFace.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(98, 150).addBox(0.025F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3269F, 0.2884F, -2.354F, -0.0087F, 0.021F, -0.0043F));

		PartDefinition Upperjawfront_r6 = leftFace.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(75, 145).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.743F, -1.27F, -4.0223F, -0.4451F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r7 = leftFace.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(135, 78).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6201F, -0.5051F, -2.1784F, -0.3927F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r8 = leftFace.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(135, 20).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4913F, -0.1756F, -0.21F, -0.1658F, 0.0646F, -0.0047F));

		PartDefinition Leftcrestbase_r4 = leftFace.addOrReplaceChild("Leftcrestbase_r4", CubeListBuilder.create().texOffs(71, 139).addBox(-0.5651F, -0.572F, -0.8928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3035F, -3.9027F, 7.2803F, 0.5502F, 0.2932F, 0.1911F));

		PartDefinition Upperjawbase_r1 = leftFace.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(140, 14).addBox(-1.0182F, -4.2668F, -6.3508F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1978F, 6.0469F, -0.0251F, 0.0931F, -0.045F));

		PartDefinition Upperjawbase_r2 = leftFace.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.382F, -2.4966F, 2.4122F, 0.0009F, 0.0845F, -0.0465F));

		PartDefinition Upperjawbase_r3 = leftFace.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(13, 100).addBox(-1.2124F, -4.1153F, -0.0024F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3677F, -0.0863F, 0.5378F, -0.0608F, 0.1105F, -0.0451F));

		PartDefinition Upperjawbase_r4 = leftFace.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(19, 116).addBox(-1.2124F, -5.0393F, 2.7573F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3677F, -0.0863F, 0.5378F, -0.2964F, 0.1105F, -0.0451F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(147, 7).addBox(-0.5F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5839F, -4.2914F, -3.501F, -0.7854F, 0.0175F, 0.0F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(5, 137).addBox(-0.5F, 0.506F, -3.1626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(147, 4).addBox(-0.5F, 0.006F, -2.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(140, 10).addBox(-0.5F, 0.006F, -1.8626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.5341F, -5.1825F, -0.6448F, 0.0349F, 0.0175F, 0.0F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(143, 146).addBox(-0.5F, -0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5742F, -4.9779F, -2.9444F, 0.3142F, 0.0175F, 0.0F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(19, 137).addBox(1.0F, 0.7591F, -1.6069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 2.2077F, 14.2581F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(25, 150).addBox(-0.5F, -0.525F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3F, -1.654F, 13.6484F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftFace.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 147).addBox(-1.3067F, -1.1078F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4517F, -4.2963F, 12.1323F, 1.4522F, 0.7064F, -0.9867F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(150, 41).addBox(-0.595F, -0.9529F, -1.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(147, 23).addBox(-0.62F, -1.4529F, -1.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, -0.3927F, 0.0131F, 0.0F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(44, 148).addBox(-0.595F, 0.2531F, 0.2528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(39, 148).addBox(-0.595F, 0.2531F, 0.9028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, -1.2915F, 0.0131F, 0.0F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(137, 0).addBox(-0.595F, -0.4315F, -1.145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, 0.0175F, 0.0131F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(149, 90).addBox(-0.5F, 0.175F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(85, 149).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.345F, -3.3612F, 11.6984F, 0.637F, 0.0F, 0.0F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(138, 49).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.345F, -0.7585F, 11.8232F, 1.3614F, 0.0F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(80, 149).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.345F, 0.2158F, 12.0482F, -2.9147F, 0.0F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(75, 149).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.345F, 1.1991F, 12.2304F, -1.3875F, 0.0F, 0.0F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(64, 149).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.345F, 1.9707F, 11.5944F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(138, 43).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.345F, 1.9794F, 10.5944F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(148, 148).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.345F, 1.487F, 9.724F, 1.0559F, 0.0F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(80, 145).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.345F, 0.5503F, 9.3738F, 1.9286F, 0.0F, 0.0F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(34, 138).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.345F, -0.4451F, 9.278F, -3.0456F, 0.0F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(112, 137).addBox(-0.5F, -1.025F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.345F, -1.8867F, 10.1788F, -2.1293F, 0.0F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(137, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.345F, -3.0744F, 10.7076F, -1.9897F, 0.0F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(146, 142).addBox(-0.5F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.345F, -2.5929F, 11.3959F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(140, 135).addBox(-0.595F, -0.7233F, 0.048F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, -0.3229F, 0.0131F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(146, 139).addBox(-0.38F, -1.5051F, -0.3016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(146, 131).addBox(-0.59F, -1.5051F, -0.3016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, -0.0873F, 0.0131F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(141, 33).addBox(-0.62F, -1.5974F, -1.2646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, 2.6965F, 0.0131F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(148, 145).addBox(-0.62F, 0.8867F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, 2.0071F, 0.0131F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(148, 112).addBox(-0.62F, -0.401F, 1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, 1.1781F, 0.0131F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(39, 144).addBox(-0.62F, -1.8766F, -0.1755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.44F, -2.0086F, 8.3242F, 0.2182F, 0.0131F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(72, 134).addBox(-0.5165F, -1.4955F, -0.073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -0.1215F, 0.1409F, -0.0055F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(44, 144).addBox(-0.5165F, -2.3361F, -0.4472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -1.2123F, 0.1409F, -0.0055F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(123, 134).addBox(-0.4991F, -1.3945F, -1.4009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, 0.3149F, 0.1409F, -0.0055F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(42, 136).addBox(-0.4991F, 0.417F, -2.1133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -0.4356F, 0.1409F, -0.0055F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(147, 10).addBox(-0.4991F, 0.2729F, -1.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -0.6101F, 0.1409F, -0.0055F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(147, 127).addBox(-0.5165F, -0.2614F, 1.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -0.6276F, 0.1409F, -0.0055F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(135, 5).addBox(-0.5165F, -0.6172F, -0.342F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, -0.2785F, 0.1409F, -0.0055F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(148, 29).addBox(-0.5165F, 1.0747F, -0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(147, 20).addBox(-0.5165F, 1.0747F, 0.183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.017F, -2.8254F, 4.2673F, 1.1788F, 0.1409F, -0.0055F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(41, 140).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5444F, -4.4166F, -1.2375F, 0.3752F, 0.0175F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.2F, 1.962F, -12.8692F));

		PartDefinition Rightcrestbase_r1 = rightFace.addOrReplaceChild("Rightcrestbase_r1", CubeListBuilder.create().texOffs(85, 7).mirror().addBox(-0.4891F, -0.0289F, -6.9819F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2956F, -4.7381F, 6.6432F, 0.0633F, -0.12F, -0.2359F));

		PartDefinition Rightcrestbase_r2 = rightFace.addOrReplaceChild("Rightcrestbase_r2", CubeListBuilder.create().texOffs(150, 44).mirror().addBox(-0.4312F, -0.8337F, -0.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3035F, -3.9027F, 7.2803F, -0.0253F, -0.1331F, -0.1715F));

		PartDefinition Rightcrestbase_r3 = rightFace.addOrReplaceChild("Rightcrestbase_r3", CubeListBuilder.create().texOffs(15, 146).mirror().addBox(-0.4769F, -0.8487F, -0.141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3035F, -3.9027F, 7.2803F, -0.7126F, -0.3236F, 0.0008F));

		PartDefinition Upperjawfront_r9 = rightFace.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(45, 151).mirror().addBox(0.283F, -0.6045F, -10.4026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1978F, 6.0469F, -0.096F, -0.0646F, 0.0047F));

		PartDefinition Upperjawfront_r10 = rightFace.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(30, 150).mirror().addBox(0.5082F, -0.5989F, 4.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, -0.0863F, 0.5378F, 0.0784F, -0.082F, 0.0047F));

		PartDefinition Upperjawfront_r11 = rightFace.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(114, 148).mirror().addBox(0.0F, -1.2F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 93).mirror().addBox(0.0F, -1.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 150).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1323F, 0.5137F, 0.6378F, 0.0785F, -0.0646F, 0.0047F));

		PartDefinition Upperjawfront_r12 = rightFace.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(151, 54).mirror().addBox(0.075F, -0.8F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3269F, 0.2884F, -2.354F, -0.0088F, -0.0646F, 0.0047F));

		PartDefinition Upperjawfront_r13 = rightFace.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(98, 150).mirror().addBox(-0.025F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3269F, 0.2884F, -2.354F, -0.0087F, -0.021F, 0.0043F));

		PartDefinition Upperjawfront_r14 = rightFace.addOrReplaceChild("Upperjawfront_r14", CubeListBuilder.create().texOffs(75, 145).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.743F, -1.27F, -4.0223F, -0.4451F, -0.0646F, 0.0047F));

		PartDefinition Upperjawfront_r15 = rightFace.addOrReplaceChild("Upperjawfront_r15", CubeListBuilder.create().texOffs(135, 78).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6201F, -0.5051F, -2.1784F, -0.3927F, -0.0646F, 0.0047F));

		PartDefinition Upperjawfront_r16 = rightFace.addOrReplaceChild("Upperjawfront_r16", CubeListBuilder.create().texOffs(135, 20).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.1756F, -0.21F, -0.1658F, -0.0646F, 0.0047F));

		PartDefinition Rightcrestbase_r4 = rightFace.addOrReplaceChild("Rightcrestbase_r4", CubeListBuilder.create().texOffs(71, 139).mirror().addBox(-0.4349F, -0.572F, -0.8928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3035F, -3.9027F, 7.2803F, 0.5502F, -0.2932F, -0.1911F));

		PartDefinition Upperjawbase_r5 = rightFace.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(140, 14).mirror().addBox(0.0182F, -4.2668F, -6.3508F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1978F, 6.0469F, -0.0251F, -0.0931F, 0.045F));

		PartDefinition Upperjawbase_r6 = rightFace.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -1.7F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.382F, -2.4966F, 2.4122F, 0.0009F, -0.0845F, 0.0465F));

		PartDefinition Upperjawbase_r7 = rightFace.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(13, 100).mirror().addBox(0.2124F, -4.1153F, -0.0024F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, -0.0863F, 0.5378F, -0.0608F, -0.1105F, 0.0451F));

		PartDefinition Upperjawbase_r8 = rightFace.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(19, 116).mirror().addBox(0.2124F, -5.0393F, 2.7573F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, -0.0863F, 0.5378F, -0.2964F, -0.1105F, 0.0451F));

		PartDefinition Head_r51 = rightFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(147, 7).mirror().addBox(-0.5F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5839F, -4.2914F, -3.501F, -0.7854F, -0.0175F, 0.0F));

		PartDefinition Head_r52 = rightFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(5, 137).mirror().addBox(-0.5F, 0.506F, -3.1626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(147, 4).mirror().addBox(-0.5F, 0.006F, -2.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(140, 10).mirror().addBox(-0.5F, 0.006F, -1.8626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.5341F, -5.1825F, -0.6448F, 0.0349F, -0.0175F, 0.0F));

		PartDefinition Head_r53 = rightFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(143, 146).mirror().addBox(-0.5F, -0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5742F, -4.9779F, -2.9444F, 0.3142F, -0.0175F, 0.0F));

		PartDefinition Head_r54 = rightFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(19, 137).mirror().addBox(-2.0F, 0.7591F, -1.6069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2F, 2.2077F, 14.2581F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(25, 150).mirror().addBox(-0.5F, -0.525F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.654F, 13.6484F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r5 = rightFace.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 147).mirror().addBox(0.3067F, -1.1078F, -1.0738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.4517F, -4.2963F, 12.1323F, 1.4522F, -0.7064F, 0.9867F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(150, 41).mirror().addBox(-0.405F, -0.9529F, -1.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(147, 23).mirror().addBox(-0.38F, -1.4529F, -1.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, -0.3927F, -0.0131F, 0.0F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(44, 148).mirror().addBox(-0.405F, 0.2531F, 0.2528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(39, 148).mirror().addBox(-0.405F, 0.2531F, 0.9028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, -1.2915F, -0.0131F, 0.0F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-0.405F, -0.4315F, -1.145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, 0.0175F, -0.0131F, 0.0F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(149, 90).mirror().addBox(-0.5F, 0.175F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(85, 149).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -3.3612F, 11.6984F, 0.637F, 0.0F, 0.0F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(138, 49).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -0.7585F, 11.8232F, 1.3614F, 0.0F, 0.0F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(80, 149).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 0.2158F, 12.0482F, -2.9147F, 0.0F, 0.0F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(75, 149).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 1.1991F, 12.2304F, -1.3875F, 0.0F, 0.0F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(64, 149).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 1.9707F, 11.5944F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(138, 43).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 1.9794F, 10.5944F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(148, 148).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 1.487F, 9.724F, 1.0559F, 0.0F, 0.0F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(80, 145).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.345F, 0.5503F, 9.3738F, 1.9286F, 0.0F, 0.0F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(34, 138).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -0.4451F, 9.278F, -3.0456F, 0.0F, 0.0F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(112, 137).mirror().addBox(-0.5F, -1.025F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -1.8867F, 10.1788F, -2.1293F, 0.0F, 0.0F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(137, 97).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -3.0744F, 10.7076F, -1.9897F, 0.0F, 0.0F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(146, 142).mirror().addBox(-0.5F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.345F, -2.5929F, 11.3959F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(140, 135).mirror().addBox(-0.405F, -0.7233F, 0.048F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, -0.3229F, -0.0131F, 0.0F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(146, 139).mirror().addBox(-0.62F, -1.5051F, -0.3016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(146, 131).mirror().addBox(-0.41F, -1.5051F, -0.3016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, -0.0873F, -0.0131F, 0.0F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(141, 33).mirror().addBox(-0.38F, -1.5974F, -1.2646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, 2.6965F, -0.0131F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(148, 145).mirror().addBox(-0.38F, 0.8867F, -0.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, 2.0071F, -0.0131F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(148, 112).mirror().addBox(-0.38F, -0.401F, 1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, 1.1781F, -0.0131F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(39, 144).mirror().addBox(-0.38F, -1.8766F, -0.1755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.44F, -2.0086F, 8.3242F, 0.2182F, -0.0131F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(72, 134).mirror().addBox(-0.4835F, -1.4955F, -0.073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -0.1215F, -0.1409F, 0.0055F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(44, 144).mirror().addBox(-0.4835F, -2.3361F, -0.4472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -1.2123F, -0.1409F, 0.0055F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(123, 134).mirror().addBox(-0.5009F, -1.3945F, -1.4009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, 0.3149F, -0.1409F, 0.0055F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(42, 136).mirror().addBox(-0.5009F, 0.417F, -2.1133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -0.4356F, -0.1409F, 0.0055F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(147, 10).mirror().addBox(-0.5009F, 0.2729F, -1.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -0.6101F, -0.1409F, 0.0055F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(147, 127).mirror().addBox(-0.4835F, -0.2614F, 1.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -0.6276F, -0.1409F, 0.0055F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(135, 5).mirror().addBox(-0.4835F, -0.6172F, -0.342F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, -0.2785F, -0.1409F, 0.0055F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(148, 29).mirror().addBox(-0.4835F, 1.0747F, -0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(147, 20).mirror().addBox(-0.4835F, 1.0747F, 0.183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.017F, -2.8254F, 4.2673F, 1.1788F, -0.1409F, 0.0055F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(41, 140).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5444F, -4.4166F, -1.2375F, 0.3752F, -0.0175F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.539F, 0.1309F, 0.7348F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r1 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r1", CubeListBuilder.create().texOffs(93, 138).mirror().addBox(-0.5F, -1.1F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(93, 138).addBox(2.35F, -1.1F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.425F, 2.0645F, -5.789F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r2 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r2", CubeListBuilder.create().texOffs(151, 66).mirror().addBox(0.3112F, -1.6332F, -4.1288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -0.0701F, -0.0516F, -0.0146F));

		PartDefinition Lowerjawslopebase_r3 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r3", CubeListBuilder.create().texOffs(151, 62).mirror().addBox(0.3112F, -1.6061F, -2.6521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(151, 58).mirror().addBox(0.3112F, -1.7061F, -1.1521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -0.105F, -0.0516F, -0.0146F));

		PartDefinition Lowerjawslopebase_r4 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r4", CubeListBuilder.create().texOffs(151, 138).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7568F, 0.3352F, -13.8224F, -0.1037F, -0.1389F, -0.0147F));

		PartDefinition Lowerjawslopebase_r5 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r5", CubeListBuilder.create().texOffs(146, 66).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(146, 66).addBox(2.35F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.425F, 2.2553F, -4.8074F, -1.4137F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r6 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r6", CubeListBuilder.create().texOffs(109, 149).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(109, 149).addBox(2.35F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.425F, 2.0645F, -5.789F, -0.192F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r7 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r7", CubeListBuilder.create().texOffs(104, 149).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(104, 149).addBox(2.35F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.425F, 1.8823F, -6.7723F, 1.2566F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r8 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r8", CubeListBuilder.create().texOffs(93, 138).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(93, 138).addBox(2.35F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.425F, 2.0645F, -5.789F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r9 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r9", CubeListBuilder.create().texOffs(150, 47).mirror().addBox(-0.1104F, -3.7532F, -2.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 149).mirror().addBox(-0.1104F, -3.4532F, -2.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, 1.2914F, -0.0351F, 0.0037F));

		PartDefinition Lowerjawslopebase_r10 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r10", CubeListBuilder.create().texOffs(146, 60).mirror().addBox(-0.1104F, 0.3F, -2.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(135, 101).mirror().addBox(-0.1104F, 0.3F, -1.9249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 55).mirror().addBox(-0.1104F, -0.5938F, -1.6558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -0.0002F, -0.0351F, 0.0037F));

		PartDefinition Lowerjawslopebase_r11 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r11", CubeListBuilder.create().texOffs(118, 48).mirror().addBox(0.5732F, 0.7202F, -3.968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0044F)).mirror(false)
				.texOffs(117, 56).mirror().addBox(0.5732F, -0.0798F, -3.968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4056F, -11.2289F, 0.1319F, -0.1389F, -0.0147F));

		PartDefinition Lowerjawslopebase_r12 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r12", CubeListBuilder.create().texOffs(148, 151).mirror().addBox(0.8732F, -0.4549F, -1.7407F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4056F, -11.2289F, 0.001F, -0.1389F, -0.0147F));

		PartDefinition cube_r6 = Lowerjaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 16).mirror().addBox(-0.8517F, 0.0846F, 0.199F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5871F, 3.2181F, -2.8963F, 0.405F, -0.0434F, 0.0826F));

		PartDefinition cube_r7 = Lowerjaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 126).mirror().addBox(-0.759F, -0.0742F, -1.9677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5871F, 3.2181F, -2.8963F, 0.149F, -0.1925F, 0.0328F));

		PartDefinition cube_r8 = Lowerjaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(124, 16).mirror().addBox(-0.9459F, 0.2487F, -4.1441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5871F, 3.2181F, -2.8963F, -0.0619F, -0.3102F, -0.0508F));

		PartDefinition Lowerjawslopebase_r13 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r13", CubeListBuilder.create().texOffs(141, 59).mirror().addBox(-2.5F, -1.9F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 59).addBox(0.3F, -1.9F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.5076F, -7.1869F, -0.096F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r14 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r14", CubeListBuilder.create().texOffs(129, 114).mirror().addBox(-2.5F, -1.925F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(129, 114).addBox(0.3F, -1.925F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6F, 2.5164F, -6.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r15 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r15", CubeListBuilder.create().texOffs(64, 146).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 146).addBox(2.35F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.425F, 2.0645F, -5.789F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r16 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r16", CubeListBuilder.create().texOffs(65, 132).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(65, 132).addBox(2.3F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, 3.558F, -5.6232F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r17 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r17", CubeListBuilder.create().texOffs(132, 125).mirror().addBox(-2.5F, -1.775F, -2.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(132, 125).addBox(0.3F, -1.775F, -2.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8568F, -2.2456F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r18 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r18", CubeListBuilder.create().texOffs(64, 137).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 137).addBox(2.3F, -0.55F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 1.4266F, -1.9177F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r19 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r19", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-0.5F, -0.625F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2091F, 1.8169F, -9.1454F, -0.2094F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r20 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r20", CubeListBuilder.create().texOffs(118, 114).mirror().addBox(-0.5F, -0.425F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6553F, 2.1222F, -12.9156F, -0.0426F, -0.1389F, -0.0147F));

		PartDefinition Lowerjawslopebase_r21 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r21", CubeListBuilder.create().texOffs(146, 57).mirror().addBox(-0.1104F, 2.5263F, -3.3897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -0.742F, -0.0351F, 0.0037F));

		PartDefinition Lowerjawslopebase_r22 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r22", CubeListBuilder.create().texOffs(131, 111).mirror().addBox(-0.1104F, 3.7812F, -1.9574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -1.3092F, -0.0351F, 0.0037F));

		PartDefinition Lowerjawslopebase_r23 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r23", CubeListBuilder.create().texOffs(129, 48).mirror().addBox(-0.1104F, -0.4501F, -4.5355F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7954F, 1.3501F, -14.7476F, -0.0875F, -0.0351F, 0.0037F));

		PartDefinition Lowerjawslopebase_r24 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r24", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(0.1F, 0.0F, -4.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0032F, -0.5972F, -7.8058F, 0.2356F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r25 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r25", CubeListBuilder.create().texOffs(113, 14).mirror().addBox(-2.5F, 0.1F, -4.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(113, 14).addBox(0.3F, 0.1F, -4.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6F, -0.7642F, -3.8295F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r26 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r26", CubeListBuilder.create().texOffs(100, 124).mirror().addBox(-2.5F, 0.1F, -3.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(100, 124).addBox(0.3F, 0.1F, -3.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, -0.5549F, -0.8368F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r27 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r27", CubeListBuilder.create().texOffs(127, 120).mirror().addBox(-2.5F, -0.7F, -2.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(127, 120).addBox(0.3F, -0.7F, -2.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6F, -0.2722F, 0.8395F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r28 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r28", CubeListBuilder.create().texOffs(118, 127).mirror().addBox(-2.5F, -0.275F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 127).addBox(0.3F, -0.275F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2722F, 0.8395F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Lowerjaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 16).addBox(-0.1482F, 0.0846F, 0.199F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5871F, 3.2181F, -2.8963F, 0.405F, 0.0434F, -0.0826F));

		PartDefinition cube_r10 = Lowerjaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 126).addBox(-0.241F, -0.0742F, -1.9677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5871F, 3.2181F, -2.8963F, 0.149F, 0.1925F, -0.0328F));

		PartDefinition cube_r11 = Lowerjaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 16).addBox(-0.0541F, 0.2487F, -4.1441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5871F, 3.2181F, -2.8963F, -0.0619F, 0.3102F, 0.0508F));

		PartDefinition Lowerjawslopebase_r29 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r29", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5F, -0.625F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2091F, 1.8169F, -9.1454F, -0.2094F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r30 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r30", CubeListBuilder.create().texOffs(150, 47).addBox(-0.8896F, -3.7532F, -2.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 149).addBox(-0.8896F, -3.4532F, -2.0559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, 1.2914F, 0.0351F, -0.0037F));

		PartDefinition Lowerjawslopebase_r31 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r31", CubeListBuilder.create().texOffs(146, 60).addBox(-0.8896F, 0.3F, -2.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 101).addBox(-0.8896F, 0.3F, -1.9249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(137, 55).addBox(-0.8896F, -0.5938F, -1.6558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -0.0002F, 0.0351F, -0.0037F));

		PartDefinition Lowerjawslopebase_r32 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r32", CubeListBuilder.create().texOffs(118, 114).addBox(-0.5F, -0.425F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6553F, 2.1222F, -12.9156F, -0.0426F, 0.1389F, 0.0147F));

		PartDefinition Lowerjawslopebase_r33 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r33", CubeListBuilder.create().texOffs(146, 57).addBox(-0.8896F, 2.5263F, -3.3897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -0.742F, 0.0351F, -0.0037F));

		PartDefinition Lowerjawslopebase_r34 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r34", CubeListBuilder.create().texOffs(131, 111).addBox(-0.8896F, 3.7812F, -1.9574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -1.3092F, 0.0351F, -0.0037F));

		PartDefinition Lowerjawslopebase_r35 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r35", CubeListBuilder.create().texOffs(129, 48).addBox(-0.8896F, -0.4501F, -4.5355F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -0.0875F, 0.0351F, -0.0037F));

		PartDefinition Lowerjawslopebase_r36 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r36", CubeListBuilder.create().texOffs(151, 66).addBox(-0.3112F, -1.6332F, -4.1288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -0.0701F, 0.0516F, 0.0146F));

		PartDefinition Lowerjawslopebase_r37 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r37", CubeListBuilder.create().texOffs(151, 62).addBox(-0.3112F, -1.6061F, -2.6521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 58).addBox(-0.3112F, -1.7061F, -1.1521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7954F, 1.3501F, -14.7476F, -0.105F, 0.0516F, 0.0146F));

		PartDefinition Lowerjawslopebase_r38 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r38", CubeListBuilder.create().texOffs(151, 138).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7568F, 0.3352F, -13.8224F, -0.1037F, 0.1389F, 0.0147F));

		PartDefinition Lowerjawslopebase_r39 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r39", CubeListBuilder.create().texOffs(148, 151).addBox(-0.8732F, -0.4549F, -1.7407F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4056F, -11.2289F, 0.001F, 0.1389F, 0.0147F));

		PartDefinition Lowerjawslopebase_r40 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r40", CubeListBuilder.create().texOffs(118, 48).addBox(-1.5732F, 0.7202F, -3.968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0044F))
				.texOffs(117, 56).addBox(-1.5732F, -0.0798F, -3.968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4056F, -11.2289F, 0.1319F, 0.1389F, 0.0147F));

		PartDefinition Lowerjawslopebase_r41 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r41", CubeListBuilder.create().texOffs(57, 77).addBox(-1.1F, 0.0F, -4.05F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0032F, -0.5972F, -7.8058F, 0.2356F, 0.1396F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -1.4074F, -0.0052F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7991F, 6.8213F, -0.1233F, -0.0866F, 0.0107F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(129, 34).addBox(0.0F, -5.3F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 9.9948F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tail1.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(14, 128).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 6.9948F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tail1.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(9, 128).addBox(0.0F, -5.6F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 3.9948F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tail1.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(122, 139).addBox(0.0F, -0.9F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6193F, 10.0575F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tail1.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(0, 139).addBox(0.0F, -0.7F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6316F, 7.4788F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tail1.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(115, 141).addBox(0.0F, -0.3F, -0.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.54F, 5.6453F, 0.637F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tail1.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(36, 147).mirror().addBox(1.2F, -3.0F, -1.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 147).mirror().addBox(1.2F, -2.7F, 7.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 147).mirror().addBox(1.2F, -2.8F, 4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 146).mirror().addBox(1.2F, -2.9F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tailbase_r8 = Tail1.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(36, 147).addBox(-1.2F, -3.0F, -1.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 147).addBox(-1.2F, -2.7F, 7.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 147).addBox(-1.2F, -2.8F, 4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 146).addBox(-1.2F, -2.9F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tailbase_r9 = Tail1.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(21, 109).addBox(0.0F, -0.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.733F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tail1.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(127, 125).addBox(0.0F, -5.7F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 0.9948F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.1028F, -0.075F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3075F, 11.9948F, 0.1498F, -0.1232F, -0.0623F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(30, 144).addBox(0.0F, -3.85F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 10.925F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tail2.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(6, 141).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 8.925F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tail2.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(3, 141).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0028F, 6.925F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tail2.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(125, 139).addBox(0.0F, -0.3F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6434F, 6.9901F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Tailbase_r12 = Tail2.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(140, 140).addBox(0.0F, 0.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3323F, 11.2166F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tail2.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(31, 136).addBox(0.0F, -1.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6713F, 9.1831F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tail2.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(34, 130).addBox(0.0F, 0.1F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7352F, 4.522F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Tailbase_r15 = Tail2.addOrReplaceChild("Tailbase_r15", CubeListBuilder.create().texOffs(139, 123).addBox(0.0F, -0.2F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7313F, 2.7756F, 0.672F, 0.0F, 0.0F));

		PartDefinition Tailbase_r16 = Tail2.addOrReplaceChild("Tailbase_r16", CubeListBuilder.create().texOffs(150, 122).mirror().addBox(1.0F, -1.9F, 10.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 150).mirror().addBox(1.0F, -2.1F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(150, 103).mirror().addBox(1.0F, -2.3F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 150).mirror().addBox(1.0F, -2.4F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(150, 99).mirror().addBox(1.0F, -2.6F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0323F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tailbase_r17 = Tail2.addOrReplaceChild("Tailbase_r17", CubeListBuilder.create().texOffs(150, 122).addBox(-1.0F, -1.9F, 10.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 150).addBox(-1.0F, -2.1F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 103).addBox(-1.0F, -2.3F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 150).addBox(-1.0F, -2.4F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 99).addBox(-1.0F, -2.6F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0323F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tailbase_r18 = Tail2.addOrReplaceChild("Tailbase_r18", CubeListBuilder.create().texOffs(119, 137).addBox(0.0F, -0.3F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0323F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tail2.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(0, 131).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 3.925F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r5 = Tail2.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(37, 129).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 0.925F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(31, 17).addBox(-1.0F, -1.4296F, -0.2797F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2933F, 13.1973F, 0.0827F, -0.1706F, -0.0572F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(61, 147).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 11.7203F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tail3.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(58, 147).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 9.7203F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tail3.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(55, 145).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 7.7203F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r4 = Tail3.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(52, 145).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 5.7203F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r5 = Tail3.addOrReplaceChild("Tailmiddle_r5", CubeListBuilder.create().texOffs(145, 14).addBox(0.0F, -3.2F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 3.6203F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r6 = Tail3.addOrReplaceChild("Tailmiddle_r6", CubeListBuilder.create().texOffs(131, 144).addBox(0.0F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 1.7203F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r7 = Tail3.addOrReplaceChild("Tailmiddle_r7", CubeListBuilder.create().texOffs(128, 144).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, -0.2797F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Tailbase_r19 = Tail3.addOrReplaceChild("Tailbase_r19", CubeListBuilder.create().texOffs(101, 144).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0689F, 11.0577F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Tailbase_r20 = Tail3.addOrReplaceChild("Tailbase_r20", CubeListBuilder.create().texOffs(98, 144).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1784F, 8.9843F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Tailbase_r21 = Tail3.addOrReplaceChild("Tailbase_r21", CubeListBuilder.create().texOffs(144, 93).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3339F, 6.8711F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailbase_r22 = Tail3.addOrReplaceChild("Tailbase_r22", CubeListBuilder.create().texOffs(49, 144).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5812F, 4.7977F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Tailbase_r23 = Tail3.addOrReplaceChild("Tailbase_r23", CubeListBuilder.create().texOffs(12, 141).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2782F, 2.4851F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Tailbase_r24 = Tail3.addOrReplaceChild("Tailbase_r24", CubeListBuilder.create().texOffs(9, 141).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5255F, 0.4117F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -1.0054F, 0.0268F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 12.6838F, 0.0101F, 0.1314F, -0.0419F));

		PartDefinition Tailmiddleend_r1 = Tail4.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(3, 148).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 11.0268F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tail4.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(140, 147).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 9.0268F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tail4.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(124, 147).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 7.0268F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r4 = Tail4.addOrReplaceChild("Tailmiddleend_r4", CubeListBuilder.create().texOffs(147, 122).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 5.0268F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r5 = Tail4.addOrReplaceChild("Tailmiddleend_r5", CubeListBuilder.create().texOffs(121, 147).addBox(0.0F, -2.525F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 3.0268F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r6 = Tail4.addOrReplaceChild("Tailmiddleend_r6", CubeListBuilder.create().texOffs(147, 103).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 1.0268F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r25 = Tail4.addOrReplaceChild("Tailbase_r25", CubeListBuilder.create().texOffs(147, 98).addBox(0.0F, 8.6F, 36.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 93).addBox(0.0F, 7.9F, 34.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 85).addBox(0.0F, 7.3F, 32.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 80).addBox(0.0F, 6.6F, 30.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(147, 75).addBox(0.0F, 6.0F, 28.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8077F, -25.9762F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailbase_r26 = Tail4.addOrReplaceChild("Tailbase_r26", CubeListBuilder.create().texOffs(69, 145).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7584F, 0.7264F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(56, 45).addBox(-0.5F, -1.0015F, -0.043F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0059F, 12.947F, -0.1391F, 0.2594F, -0.0359F));

		PartDefinition Tailendbase_r1 = Tail5.addOrReplaceChild("Tailendbase_r1", CubeListBuilder.create().texOffs(151, 36).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 7.957F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r2 = Tail5.addOrReplaceChild("Tailendbase_r2", CubeListBuilder.create().texOffs(151, 32).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 5.957F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r3 = Tail5.addOrReplaceChild("Tailendbase_r3", CubeListBuilder.create().texOffs(151, 13).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 3.957F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r4 = Tail5.addOrReplaceChild("Tailendbase_r4", CubeListBuilder.create().texOffs(151, 0).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 1.957F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tailbase_r27 = Tail5.addOrReplaceChild("Tailbase_r27", CubeListBuilder.create().texOffs(150, 134).addBox(0.0F, 13.1F, 46.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 150).addBox(0.0F, 12.4F, 44.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 148).addBox(0.0F, 10.7F, 42.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 148).addBox(0.0F, 10.0F, 40.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 148).addBox(0.0F, 9.3F, 38.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8137F, -38.9232F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r5 = Tail5.addOrReplaceChild("Tailendbase_r5", CubeListBuilder.create().texOffs(127, 150).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, -0.043F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.5423F, -0.3842F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4089F, 10.1684F, -0.0971F, 0.1737F, -0.0168F));

		PartDefinition Tailend_r1 = Tail6.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(151, 70).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 7.6158F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tail6.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(86, 81).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 5.6158F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tail6.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(34, 84).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 3.6158F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tail6.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(42, 151).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 1.6158F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r28 = Tail6.addOrReplaceChild("Tailbase_r28", CubeListBuilder.create().texOffs(150, 83).addBox(0.0F, 15.9F, 54.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 75).addBox(0.0F, 15.1F, 52.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 50).addBox(0.0F, 14.5F, 50.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(150, 79).addBox(0.0F, 13.8F, 48.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2225F, -49.0916F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailend_r5 = Tail6.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(39, 151).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, -0.3842F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.025F, 9.55F, -0.1783F, 0.2148F, -0.0384F));

		PartDefinition Tailbase_r29 = Tail7.addOrReplaceChild("Tailbase_r29", CubeListBuilder.create().texOffs(133, 151).addBox(0.0F, 20.5F, 64.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 130).addBox(0.0F, 19.7F, 62.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 118).addBox(0.0F, 19.0F, 60.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 115).addBox(0.0F, 18.3F, 58.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 151).addBox(0.0F, 17.5F, 56.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1975F, -58.6416F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(38, 77).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.8F, -0.1325F, 0.173F, -0.023F));

		PartDefinition Tailbase_r30 = Tail8.addOrReplaceChild("Tailbase_r30", CubeListBuilder.create().texOffs(151, 141).addBox(0.0F, 22.0F, 68.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 151).addBox(0.0F, 21.3F, 66.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1975F, -68.4416F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(62, 24).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0182F, 7.9017F, -0.1551F, 0.302F, -0.0465F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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