package fossils.fossils.client.blockentity.model.silesaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SilesaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Silesaurus;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart MetacarpalL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart MetacarpalL2;
	private final ModelPart HandL2;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public SilesaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Silesaurus = this.fossil.getChild("Silesaurus");
		this.LegL = this.Silesaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.LegL2 = this.Silesaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL2 = this.MetatarsalL2.getChild("FootL2");
		this.Tail1 = this.Silesaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Silesaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.MetacarpalL = this.ElbowL.getChild("MetacarpalL");
		this.HandL = this.MetacarpalL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.MetacarpalL2 = this.ElbowL2.getChild("MetacarpalL2");
		this.HandL2 = this.MetacarpalL2.getChild("HandL2");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Silesaurus = fossil.addOrReplaceChild("Silesaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -22.8F, 3.0F));

		PartDefinition Basin_r1 = Silesaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5F, -2.0909F, -0.0024F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, 2.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Silesaurus.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(17, 44).mirror().addBox(-1.0F, 0.4F, 1.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 44).addBox(1.0F, 0.4F, 1.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(23, 35).addBox(0.0F, -0.1F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = Silesaurus.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(-0.5F, -2.0883F, -0.3255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.8023F, 0.9679F, -2.034F, 0.2697F, -0.1768F));

		PartDefinition Basin_r4 = Silesaurus.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.8605F, -3.0345F, -0.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.629F, 3.722F, 2.8434F, -1.9729F, 0.2697F, -0.1768F));

		PartDefinition Basin_r5 = Silesaurus.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.8605F, -1.7314F, -0.3805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.629F, 3.722F, 2.8434F, -2.13F, 0.2697F, -0.1768F));

		PartDefinition Basin_r6 = Silesaurus.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-0.5F, -2.4456F, -0.5385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.8023F, 0.9679F, -2.13F, 0.2697F, -0.1768F));

		PartDefinition Basin_r7 = Silesaurus.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.5F, -1.3607F, -0.3588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.4314F, -2.135F, -1.405F, 0.0F, -0.3927F));

		PartDefinition Basin_r8 = Silesaurus.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(17, 37).mirror().addBox(-0.5F, -0.741F, -0.5767F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6674F, 5.6487F, -5.0282F, -0.4451F, 0.0F, -0.2182F));

		PartDefinition Basin_r9 = Silesaurus.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(67, 52).mirror().addBox(-0.5F, -2.2474F, -0.6867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.6674F, 5.6487F, -5.0282F, -0.6545F, 0.0F, -0.2182F));

		PartDefinition Basin_r10 = Silesaurus.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-0.5F, -0.2042F, -0.6713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.4314F, -2.135F, -0.7592F, 0.0F, -0.3927F));

		PartDefinition Basin_r11 = Silesaurus.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.5F, -2.0084F, -0.0548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 0).addBox(2.9F, -2.0084F, -0.0548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 1.4314F, -2.235F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Basin_r12 = Silesaurus.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-0.5F, -0.9508F, -1.9606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(60, 52).addBox(2.9F, -0.9508F, -1.9606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7F, 3.0314F, -0.835F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Basin_r13 = Silesaurus.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(59, 8).mirror().addBox(-0.5F, -0.033F, -1.9536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 8).addBox(2.9F, -0.033F, -1.9536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.9314F, 0.965F, 0.096F, 0.0F, 0.0F));

		PartDefinition Basin_r14 = Silesaurus.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-0.5F, -1.0739F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 70).addBox(2.9F, -1.0739F, -0.998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.4314F, 1.665F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Basin_r15 = Silesaurus.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(10, 75).addBox(2.9F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7F, 0.4314F, 0.865F, -0.8988F, 0.0F, 0.0F));

		PartDefinition Basin_r16 = Silesaurus.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(57, 14).addBox(2.9F, -0.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.7F, 0.4173F, 0.0107F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Basin_r17 = Silesaurus.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-2.0F, -0.9728F, -1.961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 24).addBox(1.4F, -0.9728F, -1.961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.5F, 2.8F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Basin_r18 = Silesaurus.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(14, 62).mirror().addBox(-2.0F, -0.9983F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 62).addBox(1.4F, -0.9983F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.9F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Basin_r19 = Silesaurus.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-2.0F, -0.8477F, -0.0986F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(55, 43).addBox(1.4F, -0.8477F, -0.0986F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, -0.1F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Silesaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-1.9041F, -0.4315F, -0.5405F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -2.6269F, -0.1248F, 0.02F, -1.0076F));

		PartDefinition cube_r2 = Silesaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-1.0022F, 0.0255F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -2.6269F, -0.1078F, 0.0507F, -0.537F));

		PartDefinition cube_r3 = Silesaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 10).addBox(0.9041F, -0.4315F, -0.5405F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -2.6269F, -0.1248F, -0.02F, 1.0076F));

		PartDefinition cube_r4 = Silesaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 14).addBox(0.0021F, 0.0255F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -2.6269F, -0.1078F, -0.0507F, 0.537F));

		PartDefinition Basin_r20 = Silesaurus.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(13, 45).addBox(-0.5F, -2.0957F, 0.0001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Basin_r21 = Silesaurus.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(36, 74).addBox(-0.5F, -1.8006F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Basin_r22 = Silesaurus.addOrReplaceChild("Basin_r22", CubeListBuilder.create().texOffs(76, 39).addBox(-0.5F, -1.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Basin_r23 = Silesaurus.addOrReplaceChild("Basin_r23", CubeListBuilder.create().texOffs(17, 37).addBox(-0.5F, -0.741F, -0.5767F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6674F, 5.6487F, -5.0282F, -0.4451F, 0.0F, 0.2182F));

		PartDefinition Basin_r24 = Silesaurus.addOrReplaceChild("Basin_r24", CubeListBuilder.create().texOffs(67, 52).addBox(-0.5F, -2.2474F, -0.6867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.6674F, 5.6487F, -5.0282F, -0.6545F, 0.0F, 0.2182F));

		PartDefinition Basin_r25 = Silesaurus.addOrReplaceChild("Basin_r25", CubeListBuilder.create().texOffs(66, 4).addBox(-0.1395F, -3.0345F, -0.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.629F, 3.722F, 2.8434F, -1.9729F, -0.2697F, 0.1768F));

		PartDefinition Basin_r26 = Silesaurus.addOrReplaceChild("Basin_r26", CubeListBuilder.create().texOffs(0, 67).addBox(-0.1395F, -1.7314F, -0.3805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.629F, 3.722F, 2.8434F, -2.13F, -0.2697F, 0.1768F));

		PartDefinition Basin_r27 = Silesaurus.addOrReplaceChild("Basin_r27", CubeListBuilder.create().texOffs(39, 62).addBox(-0.5F, -2.0883F, -0.3255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7F, 2.8023F, 0.9679F, -2.034F, -0.2697F, 0.1768F));

		PartDefinition Basin_r28 = Silesaurus.addOrReplaceChild("Basin_r28", CubeListBuilder.create().texOffs(64, 32).addBox(-0.5F, -2.4456F, -0.5385F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 2.8023F, 0.9679F, -2.13F, -0.2697F, 0.1768F));

		PartDefinition Basin_r29 = Silesaurus.addOrReplaceChild("Basin_r29", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -1.3607F, -0.3588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.7F, 2.4314F, -2.135F, -1.405F, 0.0F, 0.3927F));

		PartDefinition Basin_r30 = Silesaurus.addOrReplaceChild("Basin_r30", CubeListBuilder.create().texOffs(49, 65).addBox(-0.5F, -0.2042F, -0.6713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 2.4314F, -2.135F, -0.7592F, 0.0F, 0.3927F));

		PartDefinition LegL = Silesaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offset(3.2F, 1.4891F, -0.2853F));

		PartDefinition cube_r5 = LegL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 65).addBox(-1.0F, -1.9162F, -0.2129F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 2.8921F, -0.3542F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LegL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 4).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2284F, -0.1088F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = LegL.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 68).addBox(-1.0F, -2.065F, -0.9971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.7921F, -0.0542F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r8 = LegL.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 68).addBox(-1.0F, -0.065F, -0.9971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7921F, -0.0542F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r9 = LegL.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 68).addBox(-1.0F, -0.0458F, 0.0027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.7921F, -1.1542F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r10 = LegL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 68).addBox(-1.0F, -0.0433F, 0.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7921F, -1.0542F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = LegL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 67).addBox(-1.0F, -0.0866F, -0.9829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.2921F, 0.5458F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r12 = LegL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 67).addBox(-1.0F, 0.072F, -0.96F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.1921F, 1.0458F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = LegL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 68).addBox(-1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 50).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3921F, -0.0542F, 0.3491F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.4508F, 0.0988F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r14 = KneeL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.45F, 4.371F, -0.2612F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r15 = KneeL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 61).addBox(-0.2F, -2.5F, -1.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 2.771F, 0.2388F, -1.5708F, 1.2566F, -1.5708F));

		PartDefinition cube_r16 = KneeL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 32).addBox(-0.1F, -4.2F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(13, 50).addBox(-0.1F, -3.5F, -1.05F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.371F, 0.2388F, 0.0F, 1.5708F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create().texOffs(32, 55).addBox(-1.0F, -0.0041F, -0.3967F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 8.8959F, -0.2334F, -0.8988F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0458F, 0.0285F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r17 = FootL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 9).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0984F, -1.2697F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r18 = FootL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 9).addBox(-1.5F, -0.6F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0643F, -0.0766F, -0.0524F, 0.0F, 0.0F));

		PartDefinition LegL2 = Silesaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.4891F, -0.2853F, -1.1082F, 0.1167F, -0.037F));

		PartDefinition cube_r19 = LegL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(0.0F, -1.9162F, -0.2129F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8921F, -0.3542F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r20 = LegL2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.2284F, -0.1088F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r21 = LegL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(0.0F, -2.065F, -0.9971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7921F, -0.0542F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r22 = LegL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(0.0F, -0.065F, -0.9971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7921F, -0.0542F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r23 = LegL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(0.0F, -0.0458F, 0.0027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7921F, -1.1542F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r24 = LegL2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(0.0F, -0.0433F, 0.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7921F, -1.0542F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r25 = LegL2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(0.0F, -0.0866F, -0.9829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.2921F, 0.5458F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = LegL2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(0.0F, 0.072F, -0.96F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1921F, 1.0458F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r27 = LegL2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 50).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3921F, -0.0542F, 0.3491F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.4508F, 0.0988F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r28 = KneeL2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 4.371F, -0.2612F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r29 = KneeL2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-0.8F, -2.5F, -1.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.771F, 0.2388F, -1.5708F, -1.2566F, 1.5708F));

		PartDefinition cube_r30 = KneeL2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.9F, -4.2F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(13, 50).mirror().addBox(-0.9F, -3.5F, -1.05F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 4.371F, 0.2388F, 0.0F, -1.5708F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-1.0F, -0.0041F, -0.3967F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 8.8959F, -0.2334F, -1.4224F, 0.0F, 0.0F));

		PartDefinition FootL2 = MetatarsalL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0458F, 0.0285F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r31 = FootL2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 9).mirror().addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0984F, -1.2697F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r32 = FootL2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-1.5F, -0.6F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0643F, -0.0766F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail1 = Silesaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Tail1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 76).addBox(0.0F, -1.8203F, -2.1354F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(50, 70).addBox(0.0F, -1.3203F, -0.1354F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5F, 2.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Tail1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(33, 74).addBox(0.0F, -0.2203F, 3.8646F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(30, 74).addBox(0.0F, -0.6203F, 1.8646F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(9, 51).addBox(0.0F, -1.4203F, -0.1354F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5F, 4.9F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Tail1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 76).mirror().addBox(0.0F, -0.2961F, 7.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 76).mirror().addBox(0.0F, -0.2961F, 5.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 76).mirror().addBox(0.0F, -0.2961F, 3.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 65).mirror().addBox(0.0F, -0.2961F, 1.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 76).mirror().addBox(0.0F, -0.2961F, -0.0781F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1F, 0.9F, -0.0437F, 0.0523F, -0.0023F));

		PartDefinition cube_r36 = Tail1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(76, 76).addBox(-1.0F, -0.2961F, 7.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 76).addBox(-1.0F, -0.2961F, 5.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 76).addBox(-1.0F, -0.2961F, 3.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 65).addBox(-1.0F, -0.2961F, 1.9219F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 76).addBox(-1.0F, -0.2961F, -0.0781F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1F, 0.9F, -0.0437F, -0.0523F, 0.0023F));

		PartDefinition cube_r37 = Tail1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.8354F, -0.179F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Tail1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 6).addBox(0.0F, -1.2273F, -0.9655F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, 9.9F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Tail1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 50).addBox(0.0F, -1.5903F, 1.0127F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(77, 27).addBox(0.0F, -1.4903F, -0.9873F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Tail1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(6, 77).addBox(0.0F, -2.1012F, 2.0567F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(3, 77).addBox(0.0F, -2.0012F, 0.0567F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.8607F, -0.1009F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5564F, 10.8991F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r41 = Tail2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 78).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8607F, 7.8991F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Tail2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(61, 78).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8607F, 5.8991F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 47).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8607F, 3.8991F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 78).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8607F, 1.8991F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 78).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8607F, -0.1009F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Tail2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(30, 79).addBox(0.0F, 3.6797F, 13.8646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 77).addBox(0.0F, 2.5797F, 11.8646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(58, 76).addBox(0.0F, 2.1797F, 9.8646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(45, 76).addBox(0.0F, 1.7797F, 7.8646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(76, 43).addBox(0.0F, 1.2797F, 5.8646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9436F, -5.9991F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -0.6822F, -0.0185F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.001F))
				.texOffs(70, 78).addBox(0.0F, -1.1822F, 1.9815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(73, 78).addBox(0.0F, -1.0822F, 3.9815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(78, 73).addBox(0.0F, -1.0822F, 5.9815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(76, 78).addBox(0.0F, -0.9822F, 7.9815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1936F, 9.8118F, 0.0262F, -0.0436F, -0.0011F));

		PartDefinition cube_r47 = Tail3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 34).addBox(0.0F, -0.4F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(33, 79).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1845F, 7.2935F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(79, 31).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3349F, 5.2891F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(79, 40).addBox(0.0F, 4.6797F, 17.8646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(79, 37).addBox(0.0F, 4.2797F, 15.8646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1372F, -15.8108F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 78).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.3822F, -0.0185F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(23, 25).addBox(-0.5F, -0.3974F, -0.04F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(79, 21).addBox(0.0F, -0.5974F, -0.04F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 24).addBox(0.0F, -0.5974F, 1.96F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.257F, 9.9231F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.3974F, -0.04F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.035F, 7.8917F, -0.1072F, -0.217F, 0.0232F));

		PartDefinition Body = Silesaurus.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(25, 0).addBox(-2.5F, 6.2759F, -9.985F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1995F, -2.9791F, 0.0524F, -0.0436F, -0.0023F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(39, 76).addBox(0.0F, -1.2059F, 0.0137F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(24, 78).addBox(0.0F, -1.0408F, 0.0134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(46, 14).addBox(-0.5F, -0.0408F, 0.0134F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-1.0006F, 0.0211F, -0.5138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -1.6268F, -0.0271F, 0.0843F, -0.4792F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-2.9008F, -0.4348F, -0.5376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -1.6268F, -0.0682F, 0.0865F, -0.9522F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(-4.2625F, -1.8667F, -0.5376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -1.6268F, -0.103F, 0.0391F, -1.4923F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-5.2733F, -1.8755F, -0.441F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -3.7268F, -0.0826F, 0.1596F, -1.4031F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-2.9146F, -0.4367F, -0.441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -3.7268F, 0.0122F, 0.1792F, -0.8543F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-1.0115F, 0.0251F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -3.7268F, 0.0868F, 0.1303F, -0.3798F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-6.1538F, -1.9037F, -0.5278F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -5.6269F, -0.0655F, 0.2092F, -1.3825F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(-2.8266F, -0.5225F, -0.5278F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -5.6269F, 0.0533F, 0.2126F, -0.8288F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.9741F, -0.0908F, -0.5052F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -5.6269F, 0.1383F, 0.1417F, -0.3553F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -7.6269F, 0.1231F, 0.2676F, -0.7948F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -7.6269F, 0.2247F, 0.1598F, -0.3249F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(48, 2).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -7.6269F, -0.0362F, 0.2917F, -1.3577F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -9.7269F, 0.2776F, 0.1666F, -0.2987F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -9.7269F, 0.1685F, 0.2972F, -0.7645F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-7.306F, -1.8721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -9.7269F, -0.0142F, 0.3401F, -1.3333F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(64, 46).addBox(2.2625F, -1.8667F, -0.5376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -1.6268F, -0.103F, -0.0391F, 1.4923F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 8).addBox(0.9008F, -0.4348F, -0.5376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -1.6268F, -0.0682F, -0.0865F, 0.9522F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 12).addBox(0.0006F, 0.0211F, -0.5138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -1.6268F, -0.0271F, -0.0843F, 0.4792F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 71).addBox(0.0115F, 0.0251F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -3.7268F, 0.0868F, -0.1303F, 0.3798F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 59).addBox(0.9146F, -0.4367F, -0.441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -3.7268F, 0.0122F, -0.1792F, 0.8543F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(23, 60).addBox(2.2734F, -1.8755F, -0.441F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -3.7268F, -0.0826F, -0.1596F, 1.4031F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(76, 16).addBox(-0.0259F, -0.0908F, -0.5052F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -5.6269F, 0.1383F, -0.1417F, 0.3553F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 10).addBox(0.8266F, -0.5225F, -0.5278F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -5.6269F, 0.0533F, -0.2126F, 0.8288F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 57).addBox(2.1538F, -1.9037F, -0.5278F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -5.6269F, -0.0655F, -0.2092F, 1.3825F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 2).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -7.6269F, -0.0362F, -0.2917F, 1.3577F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(53, 77).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -7.6269F, 0.2247F, -0.1598F, 0.3249F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(66, 48).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -7.6269F, 0.1231F, -0.2676F, 0.7948F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 56).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -9.7269F, 0.2776F, -0.1666F, 0.2987F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 21).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -9.7269F, 0.1685F, -0.2972F, 0.7645F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 0).addBox(2.306F, -1.8721F, -0.3859F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -9.7269F, -0.0142F, -0.3401F, 1.3333F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(21, 78).addBox(0.0F, -1.001F, 0.0155F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(48, 79).addBox(0.0F, -1.0213F, 2.0267F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(78, 18).addBox(0.0F, -0.9213F, 0.0267F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(40, 43).addBox(-0.5F, -0.0213F, 0.0267F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2739F, -10.0862F, -0.0444F, -0.1308F, 0.0058F));

		PartDefinition cube_r85 = Chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.3922F, -0.5602F, -0.2225F));

		PartDefinition cube_r86 = Chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.5798F, -0.7692F, -0.3853F));

		PartDefinition cube_r87 = Chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.9264F, -0.975F, -0.7223F));

		PartDefinition cube_r88 = Chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-1.7F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4305F, 7.3543F, -1.2243F, -0.3456F, -0.1585F, 1.1651F));

		PartDefinition cube_r89 = Chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.6F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.3598F, 7.4089F, -1.3339F, -0.3463F, 0.1702F, 1.0472F));

		PartDefinition cube_r90 = Chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-0.3F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(25, 75).mirror().addBox(0.4F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.5893F, 4.8636F, -1.4336F, -1.828F, 1.2176F, -0.7358F));

		PartDefinition cube_r91 = Chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(53, 74).mirror().addBox(-0.1F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.4435F, 1.8508F, 1.833F, -0.0346F, 0.8272F, 1.5426F));

		PartDefinition cube_r92 = Chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.4146F, 2.6936F, 0.6977F, -0.0264F, 0.4783F, 1.5559F));

		PartDefinition cube_r93 = Chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4155F, 1.774F, 0.6316F, -0.0237F, 0.1468F, 1.5646F));

		PartDefinition cube_r94 = Chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(-0.75F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(64, 70).mirror().addBox(-1.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4035F, 3.1631F, 0.2811F, -0.0323F, 0.7575F, 1.5459F));

		PartDefinition cube_r95 = Chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-5.2564F, -1.8597F, -0.5975F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, 0.0853F, 0.6573F, -1.5672F));

		PartDefinition cube_r96 = Chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-0.9929F, 0.0199F, -0.5739F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, 0.6027F, 0.2507F, -0.5128F));

		PartDefinition cube_r97 = Chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(-2.892F, -0.432F, -0.5975F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3269F, 0.4412F, 0.5109F, -0.9382F));

		PartDefinition cube_r98 = Chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-6.235F, -1.8843F, -0.4707F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8255F, -3.3269F, 0.0245F, 0.4385F, -1.4055F));

		PartDefinition cube_r99 = Chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.9993F, -0.0119F, -0.447F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8255F, -3.3269F, 0.3822F, 0.1859F, -0.3672F));

		PartDefinition cube_r100 = Chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-2.8862F, -0.464F, -0.4707F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8255F, -3.3269F, 0.2568F, 0.3602F, -0.8229F));

		PartDefinition cube_r101 = Chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-2.9592F, -0.3862F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -1.5269F, 0.2394F, 0.3527F, -0.8116F));

		PartDefinition cube_r102 = Chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 33).mirror().addBox(-7.3376F, -1.8551F, -0.5137F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -1.5269F, 0.014F, 0.4232F, -1.3925F));

		PartDefinition cube_r103 = Chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-1.03F, 0.0907F, -0.4887F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3255F, -1.5269F, 0.3639F, 0.1863F, -0.3532F));

		PartDefinition cube_r104 = Chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5279F, 5.9727F, -2.7156F, -0.4509F, 0.6958F, 0.8074F));

		PartDefinition cube_r105 = Chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 51).addBox(-3.25F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(64, 70).addBox(0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4035F, 3.1631F, 0.2811F, -0.0323F, -0.7575F, -1.5459F));

		PartDefinition cube_r106 = Chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.4146F, 2.6936F, 0.6977F, -0.0264F, -0.4783F, -1.5559F));

		PartDefinition cube_r107 = Chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 74).addBox(-0.9F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.4435F, 1.8508F, 1.833F, -0.0346F, -0.8272F, -1.5426F));

		PartDefinition cube_r108 = Chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(40, 70).addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.4155F, 1.774F, 0.6316F, -0.0237F, -0.1468F, -1.5646F));

		PartDefinition cube_r109 = Chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(62, 28).addBox(-0.7F, -0.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(25, 75).addBox(-1.4F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.5893F, 4.8636F, -1.4336F, -1.828F, -1.2176F, 0.7358F));

		PartDefinition cube_r110 = Chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 56).addBox(-0.3F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4305F, 7.3543F, -1.2243F, -0.3456F, 0.1585F, -1.1651F));

		PartDefinition cube_r111 = Chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 3).addBox(-0.4F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.3598F, 7.4089F, -1.3339F, -0.3463F, -0.1702F, -1.0472F));

		PartDefinition cube_r112 = Chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 20).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5279F, 5.9727F, -2.7156F, -0.4509F, -0.6958F, -0.8074F));

		PartDefinition cube_r113 = Chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.3922F, 0.5602F, 0.2225F));

		PartDefinition cube_r114 = Chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.5798F, 0.7692F, 0.3853F));

		PartDefinition cube_r115 = Chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(46, 20).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5655F, 0.1691F, 0.9264F, 0.975F, 0.7223F));

		PartDefinition cube_r116 = Chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(49, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(39, 59).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.1075F, -2.1868F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(18, 78).addBox(0.0F, -1.7261F, 4.0308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 25).addBox(-0.5F, -0.9261F, 0.0308F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -5.8F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0717F, -3.4897F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(28, 62).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3031F, -5.4788F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(66, 19).addBox(0.892F, -0.432F, -0.5975F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, 0.4412F, -0.5109F, 0.9382F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(77, 62).addBox(-0.0071F, 0.0199F, -0.5739F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, 0.6027F, -0.2507F, 0.5128F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(14, 60).addBox(2.2564F, -1.8597F, -0.5975F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3269F, 0.0853F, -0.6573F, 1.5672F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(14, 66).addBox(0.8862F, -0.464F, -0.4707F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8255F, -3.3269F, 0.2568F, -0.3602F, 0.8229F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 60).addBox(-0.0007F, -0.0119F, -0.447F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8255F, -3.3269F, 0.3822F, -0.1859F, 0.3672F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 48).addBox(2.235F, -1.8843F, -0.4707F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8255F, -3.3269F, 0.0245F, -0.4385F, 1.4055F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(77, 54).addBox(0.03F, 0.0907F, -0.4887F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -1.5269F, 0.3639F, -0.1863F, 0.3532F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(42, 33).addBox(2.3376F, -1.8551F, -0.5137F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -1.5269F, 0.014F, -0.4232F, 1.3925F));

		PartDefinition cube_r128 = Chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(21, 66).addBox(0.9592F, -0.3862F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3255F, -1.5269F, 0.2394F, -0.3527F, 0.8116F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 7.1F, -2.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r129 = ArmL.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(69, 70).addBox(-0.7F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.2265F, -0.1985F, -0.1231F, 0.0447F, 0.3463F));

		PartDefinition cube_r130 = ArmL.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(15, 75).addBox(0.0F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.4092F, 0.0505F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r131 = ArmL.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(57, 24).addBox(-1.0F, -0.1F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create().texOffs(18, 50).addBox(-0.1F, 1.0F, -1.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.0569F, 0.1241F, -1.5708F, -0.5411F, -1.5708F));

		PartDefinition cube_r132 = ElbowL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(35, 44).addBox(0.0F, 0.0F, 0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition MetacarpalL = ElbowL.addOrReplaceChild("MetacarpalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 8.914F, -0.6001F, -0.6981F, -1.5533F, 1.5708F));

		PartDefinition cube_r133 = MetacarpalL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(54, 65).addBox(-1.0F, 0.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition HandL = MetacarpalL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6777F, 0.5719F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r134 = HandL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(21, 62).addBox(-1.0F, -0.1903F, -0.2416F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -1.4486F, 0.0F, 0.0F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 7.1F, -2.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = ArmL2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-0.3F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2265F, -0.1985F, -0.1231F, -0.0447F, -0.3463F));

		PartDefinition cube_r136 = ArmL2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-1.0F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.4092F, 0.0505F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r137 = ArmL2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(0.0F, -0.1F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-0.9F, 1.0F, -1.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0569F, 0.1241F, -1.6537F, 0.3574F, 1.3376F));

		PartDefinition cube_r138 = ElbowL2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-1.0F, 0.0F, 0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition MetacarpalL2 = ElbowL2.addOrReplaceChild("MetacarpalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 8.914F, -0.6001F, 1.6495F, 1.4561F, 1.1699F));

		PartDefinition cube_r139 = MetacarpalL2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-1.0F, 0.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition HandL2 = MetacarpalL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6777F, 0.5719F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r140 = HandL2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(21, 62).mirror().addBox(-1.0F, -0.1903F, -0.2416F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, -1.4486F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9223F, -5.7458F, -0.1848F, -0.1287F, 0.024F));

		PartDefinition cube_r141 = Neck3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(12, 78).addBox(0.0F, -0.6872F, 0.977F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(48, 4).addBox(-0.5F, 0.0128F, -0.023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Neck3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-0.9711F, -0.0355F, -0.7375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.1268F, 0.6699F, 0.5018F, -0.5628F));

		PartDefinition cube_r143 = Neck3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-3.8435F, -0.4706F, -0.7603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.1268F, 0.3731F, 0.7638F, -1.0539F));

		PartDefinition cube_r144 = Neck3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 50).addBox(0.8435F, -0.4706F, -0.7603F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.1268F, 0.3731F, -0.7638F, 1.0539F));

		PartDefinition cube_r145 = Neck3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(77, 58).addBox(-0.0289F, -0.0355F, -0.7375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.1268F, 0.6699F, -0.5018F, 0.5628F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0043F, -2.7718F, 0.133F, -0.2163F, -0.0287F));

		PartDefinition cube_r146 = Neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, -1.9189F, 2.0564F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 35).addBox(0.0F, -2.1189F, 0.0564F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.9F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(50, 75).addBox(0.0F, -1.9F, -5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 35).addBox(-0.5F, -0.6F, -6.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.7F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.0269F, -0.4072F, -0.3071F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.5F, -0.6191F, -0.3711F, 0.2475F));

		PartDefinition cube_r149 = Neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.0024F, -0.4173F, -0.135F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7F, -2.2F, -0.651F, -0.2405F, 0.1898F));

		PartDefinition cube_r150 = Neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(58, 56).mirror().addBox(0.0113F, -0.5941F, -0.0566F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -4.3F, -0.5888F, -0.2451F, 0.1831F));

		PartDefinition cube_r151 = Neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 51).addBox(0.0269F, -0.4072F, -0.3071F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.5F, -0.6191F, 0.3711F, -0.2475F));

		PartDefinition cube_r152 = Neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 59).addBox(-0.0024F, -0.4173F, -0.135F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -2.2F, -0.651F, 0.2405F, -0.1898F));

		PartDefinition cube_r153 = Neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(58, 56).addBox(-0.0113F, -0.5941F, -0.0566F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -4.3F, -0.5888F, 0.2451F, -0.1831F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.4716F, -5.2193F, 0.0282F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Neck1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(9, 78).addBox(0.5F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Neck1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(66, 66).mirror().addBox(0.0161F, -0.5184F, -0.0376F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -0.8F, -0.4607F, -0.2928F, 0.1879F));

		PartDefinition cube_r156 = Neck1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(66, 66).addBox(-0.0161F, -0.5184F, -0.0376F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.8F, -0.4607F, 0.2928F, -0.1879F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -1.8F, 0.0F, -0.3927F, -0.1309F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(-1.5F, -0.18F, -0.7519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 66).addBox(-0.3F, -0.18F, -0.7519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 51).addBox(-1.4F, 0.028F, -1.9519F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -0.9F, -1.3F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-1.5F, -0.18F, -0.1519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 73).addBox(-0.3F, -0.18F, -0.1519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 65).addBox(-1.4F, 0.028F, 0.0481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.4F, -0.9F, -1.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-1.2F, 0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 15).addBox(0.2F, 0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4233F, -0.5262F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-1.0F, -0.9049F, -0.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 72).addBox(0.22F, -0.9049F, -0.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.11F, 0.0957F, -1.5952F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-1.0F, -0.9044F, -0.0376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(71, 38).mirror().addBox(-1.0F, -0.9044F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 50).mirror().addBox(-1.0F, 0.0956F, -3.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 50).addBox(0.22F, 0.0956F, -3.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 72).addBox(0.22F, -0.9044F, -0.0376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(71, 38).addBox(0.22F, -0.9044F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.11F, 0.8957F, -1.5952F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-1.0F, -0.8877F, -0.8733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(35, 71).addBox(0.22F, -0.8877F, -0.8733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.11F, 1.3957F, -2.1952F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-1.0F, -0.9128F, -0.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(30, 71).addBox(0.22F, -0.9128F, -0.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.11F, 1.4957F, -2.9952F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-1.0F, -0.7419F, -0.878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(71, 35).addBox(0.22F, -0.7419F, -0.878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.11F, 1.2957F, -2.0952F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-1.0F, -0.9014F, -0.8656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(71, 41).addBox(0.22F, -0.9014F, -0.8656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.11F, 0.0957F, -1.6952F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-1.0F, -1.3953F, -0.876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(71, 44).mirror().addBox(-1.0F, -0.8953F, -0.876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-1.19F, -1.0953F, -1.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 72).mirror().addBox(-1.02F, -1.0953F, -1.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 72).addBox(0.41F, -1.0953F, -1.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 72).addBox(0.24F, -1.0953F, -1.176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 65).addBox(0.22F, -1.3953F, -0.876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(71, 44).addBox(0.22F, -0.8953F, -0.876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.11F, -0.3043F, -2.3952F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(53, 71).mirror().addBox(-1.0F, -0.9318F, -0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(53, 71).addBox(0.22F, -0.9318F, -0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.11F, 0.9957F, -3.5952F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 62).mirror().addBox(-1.0F, -0.1109F, -0.8805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1076F)).mirror(false)
				.texOffs(72, 62).addBox(0.22F, -0.1109F, -0.8805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1076F)), PartPose.offsetAndRotation(-0.11F, 0.9957F, -4.8952F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-1.0F, -0.9095F, -0.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1076F)).mirror(false)
				.texOffs(72, 53).addBox(0.22F, -0.9095F, -0.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1076F)), PartPose.offsetAndRotation(-0.11F, 1.9957F, -4.2952F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-1.0F, -0.0949F, -0.8419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(72, 59).addBox(0.22F, -0.0949F, -0.8419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.11F, 0.6957F, -4.1952F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-1.0F, -0.0844F, -0.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 56).addBox(0.22F, -0.0844F, -0.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.11F, 0.9957F, -3.6952F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-1.1F, -0.248F, -0.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(73, 18).mirror().addBox(-0.66F, 2.052F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(73, 7).mirror().addBox(-0.66F, 2.352F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(73, 18).addBox(-0.12F, 2.052F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(73, 7).addBox(-0.12F, 2.352F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 0).addBox(0.32F, -0.248F, -0.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.11F, 1.1957F, -3.4952F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-1.4F, -1.0056F, 0.0487F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 67).addBox(0.4F, -1.0056F, 0.0487F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4886F, -4.0534F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 62).mirror().addBox(-1.4F, -0.7473F, -0.8934F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 12).mirror().addBox(-1.5F, -1.0473F, -0.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(44, 62).addBox(0.2F, -0.7473F, -0.8934F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 12).addBox(-0.7F, -1.0473F, -0.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.3886F, -4.2534F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(0.0F, -0.9861F, -0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(20, 75).addBox(0.4F, -0.9861F, -0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.7485F, -6.0996F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(0.1F, -1.0536F, -1.0145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 43).addBox(1.3F, -1.0536F, -1.0145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.8485F, -5.0996F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.5F, -0.8529F, -0.4844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1497F)).mirror(false)
				.texOffs(69, 26).addBox(-0.3F, -0.5529F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(7, 60).addBox(-0.3F, -0.8529F, -0.4844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1499F)), PartPose.offsetAndRotation(-0.1F, 2.9F, -6.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-0.5F, -0.1459F, -0.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(69, 23).addBox(-0.3F, -0.1459F, -0.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 2.4F, -7.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(54, 68).mirror().addBox(-0.5F, -0.0144F, -0.9533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(54, 68).addBox(-0.1F, -0.0144F, -0.9533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2F, 1.3F, -5.7F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-1.5F, -0.0014F, -1.0348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(5, 71).addBox(-0.7F, -0.0014F, -1.0348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6F, 0.7F, -4.8F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(36, 9).mirror().addBox(-0.6121F, -0.5112F, -1.7459F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9673F, 0.6456F, -4.3576F, 0.5973F, -0.288F, -0.0677F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.8046F, -0.5262F, 0.1864F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.9673F, 0.6456F, -4.3576F, 0.5316F, 0.2094F, 0.2596F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(64, 13).mirror().addBox(-0.5831F, -0.5112F, -0.0738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 64).mirror().addBox(-0.5831F, -0.5112F, -0.4738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.9673F, 0.6456F, -4.3576F, 0.5732F, -0.1059F, 0.055F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(64, 40).addBox(-0.5F, 0.0147F, -2.0071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(61, 0).addBox(-0.5F, 0.0147F, -1.0071F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -3.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(64, 13).addBox(-1.4169F, -0.5112F, -0.0738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 64).addBox(-1.4169F, -0.5112F, -0.4738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.9673F, 0.6456F, -4.3576F, 0.5732F, 0.1059F, -0.055F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(36, 9).addBox(-1.3879F, -0.5112F, -1.7459F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9673F, 0.6456F, -4.3576F, 0.5973F, 0.288F, 0.0677F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 64).addBox(-1.1954F, -0.5262F, 0.1864F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.9673F, 0.6456F, -4.3576F, 0.5316F, -0.2094F, -0.2596F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 33).addBox(-1.5F, -1.0321F, -0.1153F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.6F, -1.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(64, 16).addBox(-1.5F, -0.9714F, -0.0573F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 1.8F, -2.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 43).addBox(-0.5F, -0.9535F, -0.1738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.9886F, -3.3534F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5F, -0.4786F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6886F, -3.9534F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(40, 54).addBox(0.6F, -0.1F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F))
				.texOffs(69, 32).addBox(0.2F, -1.2291F, -7.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(40, 54).mirror().addBox(-0.6F, -0.1F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(69, 32).mirror().addBox(-0.2F, -1.2291F, -7.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0315F, 0.6908F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-0.6284F, -0.2877F, 2.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 61).mirror().addBox(-0.6284F, -0.2877F, 0.9915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0F, -3.1F, 0.0831F, -0.0533F, 0.0226F));

		PartDefinition cube_r193 = Jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 74).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 21).addBox(0.92F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 74).addBox(0.92F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.21F, 0.3459F, -2.7602F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.5F, -0.2141F, 0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(0, 74).addBox(-0.7F, -0.2141F, 0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.1F, -0.9F, -5.9F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(-1.3F, -0.4913F, -1.1446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(69, 29).mirror().addBox(-1.4F, -0.1913F, -1.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(68, 73).mirror().addBox(-1.4F, -0.1913F, -1.3446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(71, 4).mirror().addBox(-1.6F, -0.1913F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(69, 29).addBox(-0.8F, -0.1913F, -1.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(73, 73).addBox(-0.9F, -0.4913F, -1.1446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(68, 73).addBox(-0.8F, -0.1913F, -1.3446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(71, 4).addBox(-0.6F, -0.1913F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.1F, -0.5F, -5.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(-2.5F, -0.2657F, -0.2282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 73).mirror().addBox(-2.5F, -0.2657F, -0.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 73).addBox(-1.3F, -0.2657F, -0.2282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 73).addBox(-1.3F, -0.2657F, -0.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 0.0F, -1.4F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-2.0F, -0.1F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(55, 38).addBox(-0.8F, -0.1F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, -0.6F, -5.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-2.0F, -0.8391F, -0.1589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(73, 47).addBox(-0.8F, -0.8391F, -0.1589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 0.7F, -2.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(48, 61).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0F, -3.1F, -0.2269F, -0.3142F, 0.0F));

		PartDefinition cube_r200 = Jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(-2.0F, -0.8393F, -0.1906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(23, 55).addBox(-0.8F, -0.8393F, -0.1906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.4F, 0.1F, -5.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-2.0F, -0.1873F, -0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1499F)).mirror(false)
				.texOffs(0, 71).addBox(-0.8F, -0.1873F, -0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1499F)), PartPose.offsetAndRotation(1.4F, -0.6F, -2.8F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(63, 73).addBox(0.0F, -0.6718F, -1.1395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(30, 68).addBox(0.0F, -0.6718F, -0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.3F, -7.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 24).addBox(-0.3716F, -0.2877F, 2.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 61).addBox(-0.3716F, -0.2877F, 0.9915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.0F, -3.1F, 0.0831F, 0.0533F, -0.0226F));

		PartDefinition cube_r204 = Jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(48, 61).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.0F, -3.1F, -0.2269F, 0.3142F, 0.0F));

		return LayerDefinition.create(meshdefinition, 82, 82);
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