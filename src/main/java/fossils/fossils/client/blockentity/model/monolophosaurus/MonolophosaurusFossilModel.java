package fossils.fossils.client.blockentity.model.monolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MonolophosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Monolophosaurus;
	private final ModelPart LegL;
	private final ModelPart TibiaL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart TibiaL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart ThroatPouch;
	private final ModelPart Skull;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public MonolophosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Monolophosaurus = this.fossil.getChild("Monolophosaurus");
		this.LegL = this.Monolophosaurus.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Monolophosaurus.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Body = this.Monolophosaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.ThroatPouch = this.Neck3.getChild("ThroatPouch");
		this.Skull = this.Neck3.getChild("Skull");
		this.Jaw = this.Skull.getChild("Jaw");
		this.Tail1 = this.Monolophosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Monolophosaurus = fossil.addOrReplaceChild("Monolophosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6122F, 4.9009F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Monolophosaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-0.0836F, -0.3517F, -1.9598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4288F, 2.0456F, 1.1053F, 2.0271F, -0.0204F, -0.5017F));

		PartDefinition Basin_r2 = Monolophosaurus.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-0.0598F, -1.0388F, -3.6906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4288F, 2.0456F, 1.1053F, 2.3753F, -0.014F, -0.488F));

		PartDefinition Basin_r3 = Monolophosaurus.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(0.0124F, -0.7848F, -1.8449F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2038F, 4.5706F, 3.5803F, 1.9419F, -0.0397F, -0.2196F));

		PartDefinition Basin_r4 = Monolophosaurus.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(75, 67).mirror().addBox(0.0124F, -0.7868F, -2.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2038F, 4.5706F, 3.5803F, 2.0728F, -0.0397F, -0.2196F));

		PartDefinition Basin_r5 = Monolophosaurus.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(0.0124F, -0.0717F, -2.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2038F, 4.5706F, 3.5803F, 1.5492F, -0.0397F, -0.2196F));

		PartDefinition Basin_r6 = Monolophosaurus.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(0.0124F, 0.7246F, -2.0993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2038F, 4.5706F, 3.5803F, 1.2437F, -0.0397F, -0.2196F));

		PartDefinition Basin_r7 = Monolophosaurus.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-0.8713F, 0.2113F, -1.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 42).mirror().addBox(-0.8713F, -0.4887F, -2.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 6.4108F, -3.4511F, 0.8895F, 0.0151F, -0.0423F));

		PartDefinition Basin_r8 = Monolophosaurus.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(77, 82).mirror().addBox(-0.8713F, -1.3272F, -2.2483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 6.4108F, -3.4511F, 1.544F, 0.0151F, -0.0423F));

		PartDefinition Basin_r9 = Monolophosaurus.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-0.8713F, -0.9659F, -2.1352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 6.4108F, -3.4511F, 1.1949F, 0.0151F, -0.0423F));

		PartDefinition Basin_r10 = Monolophosaurus.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-0.8713F, -0.9585F, -1.9278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 6.4108F, -3.4511F, 1.4131F, 0.0151F, -0.0423F));

		PartDefinition Basin_r11 = Monolophosaurus.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(0.0008F, -1.052F, -2.9145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5201F, 4.1108F, -2.4511F, 1.2385F, 0.0151F, -0.2605F));

		PartDefinition Basin_r12 = Monolophosaurus.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(0.0155F, -0.7131F, -1.9184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4201F, 2.6108F, -1.8511F, 1.0647F, 0.0F, -0.5236F));

		PartDefinition Basin_r13 = Monolophosaurus.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.1201F, 2.4108F, -1.5511F, -0.0262F, 0.0F, -0.0873F));

		PartDefinition Basin_r14 = Monolophosaurus.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-0.683F, 0.006F, 0.0357F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1185F, 0.3285F, -2.186F, -0.2007F, 0.0F, -0.0873F));

		PartDefinition Basin_r15 = Monolophosaurus.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2555F, 0.8622F, 0.6464F, -0.637F, 0.0F, -0.0873F));

		PartDefinition Basin_r16 = Monolophosaurus.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3234F, 0.0867F, -0.7153F, -1.0297F, 0.0F, -0.0873F));

		PartDefinition Basin_r17 = Monolophosaurus.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(-0.5F, -0.1F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4055F, -0.8514F, 0.6753F, -0.1134F, 0.0F, -0.0873F));

		PartDefinition Basin_r18 = Monolophosaurus.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-0.5F, 0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(37, 78).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 18).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8614F, -0.6085F, -3.4085F, 1.9202F, 0.2262F, 0.0469F));

		PartDefinition Basin_r19 = Monolophosaurus.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-0.5F, -0.1F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8216F, -1.5244F, -3.4223F, 1.1348F, 0.2262F, 0.0469F));

		PartDefinition Basin_r20 = Monolophosaurus.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-0.5F, -0.3F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6412F, -2.0982F, -2.7562F, 0.4803F, 0.2262F, 0.0469F));

		PartDefinition Basin_r21 = Monolophosaurus.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(46, 69).mirror().addBox(-2.5F, -0.0488F, -1.99F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(46, 69).addBox(2.1F, -0.0488F, -1.99F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -2.7F, 0.7F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Basin_r22 = Monolophosaurus.addOrReplaceChild("Basin_r22", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.5F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 27).mirror().addBox(-0.5F, -0.4F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4878F, -0.3859F, 3.7952F, 0.0175F, -0.1396F, 0.0F));

		PartDefinition Basin_r23 = Monolophosaurus.addOrReplaceChild("Basin_r23", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.6253F, -0.0747F, 0.0524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -1.9729F, 3.3586F, -0.3927F, -0.1396F, 0.0F));

		PartDefinition Basin_r24 = Monolophosaurus.addOrReplaceChild("Basin_r24", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-4.5F, 0.1312F, 2.7165F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 48).mirror().addBox(-4.5F, 0.1312F, -0.2835F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 48).addBox(-1.5F, 0.1312F, -0.2835F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 48).addBox(-1.5F, 0.1312F, 2.7165F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(23, 38).addBox(-2.5F, -0.3688F, 1.7165F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.8F, -3.9F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Basin_r25 = Monolophosaurus.addOrReplaceChild("Basin_r25", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3095F, 0.2456F, 0.4824F, -0.0698F, 0.0F, -0.0873F));

		PartDefinition Basin_r26 = Monolophosaurus.addOrReplaceChild("Basin_r26", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-2.5F, -1.1688F, 0.5165F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(39, 52).addBox(2.1F, -1.1688F, 0.5165F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -0.8F, -2.2F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Basin_r27 = Monolophosaurus.addOrReplaceChild("Basin_r27", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.6F, -0.0541F, -0.9593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -2.65F, -1.4F, 0.0876F, 0.2262F, 0.0469F));

		PartDefinition Basin_r28 = Monolophosaurus.addOrReplaceChild("Basin_r28", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-2.5F, -0.3385F, -1.994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 69).addBox(2.1F, -0.3385F, -1.994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -2.0F, 2.6F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Basin_r29 = Monolophosaurus.addOrReplaceChild("Basin_r29", CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-0.5F, -1.5071F, -0.5205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.7729F, 2.4586F, -0.3491F, -0.1396F, 0.0F));

		PartDefinition Basin_r30 = Monolophosaurus.addOrReplaceChild("Basin_r30", CubeListBuilder.create().texOffs(82, 68).addBox(-0.5F, 0.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(37, 78).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 18).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8614F, -0.6085F, -3.4085F, 1.9202F, -0.2262F, -0.0469F));

		PartDefinition Basin_r31 = Monolophosaurus.addOrReplaceChild("Basin_r31", CubeListBuilder.create().texOffs(89, 15).addBox(-0.5F, -0.1F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8216F, -1.5244F, -3.4223F, 1.1348F, -0.2262F, -0.0469F));

		PartDefinition Basin_r32 = Monolophosaurus.addOrReplaceChild("Basin_r32", CubeListBuilder.create().texOffs(87, 36).addBox(-0.5F, -0.3F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6412F, -2.0982F, -2.7562F, 0.4803F, -0.2262F, -0.0469F));

		PartDefinition Basin_r33 = Monolophosaurus.addOrReplaceChild("Basin_r33", CubeListBuilder.create().texOffs(84, 8).addBox(-0.4F, -0.0541F, -0.9593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -2.65F, -1.4F, 0.0876F, -0.2262F, -0.0469F));

		PartDefinition Basin_r34 = Monolophosaurus.addOrReplaceChild("Basin_r34", CubeListBuilder.create().texOffs(14, 76).addBox(-0.3747F, -0.0747F, 0.0524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3F, -1.9729F, 3.3586F, -0.3927F, 0.1396F, 0.0F));

		PartDefinition Basin_r35 = Monolophosaurus.addOrReplaceChild("Basin_r35", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5F, -1.5071F, -0.5205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3F, -0.7729F, 2.4586F, -0.3491F, 0.1396F, 0.0F));

		PartDefinition CaudalProximal_r1 = Monolophosaurus.addOrReplaceChild("CaudalProximal_r1", CubeListBuilder.create().texOffs(82, 56).addBox(0.0F, 2.5F, -4.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.612F, 9.5811F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Basin_r36 = Monolophosaurus.addOrReplaceChild("Basin_r36", CubeListBuilder.create().texOffs(42, 11).addBox(-1.0124F, 0.7246F, -2.0993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2038F, 4.5706F, 3.5803F, 1.2437F, 0.0397F, 0.2196F));

		PartDefinition Basin_r37 = Monolophosaurus.addOrReplaceChild("Basin_r37", CubeListBuilder.create().texOffs(89, 24).addBox(-1.0124F, -0.0717F, -2.501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2038F, 4.5706F, 3.5803F, 1.5492F, 0.0397F, 0.2196F));

		PartDefinition Basin_r38 = Monolophosaurus.addOrReplaceChild("Basin_r38", CubeListBuilder.create().texOffs(75, 67).addBox(-1.0124F, -0.7868F, -2.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2038F, 4.5706F, 3.5803F, 2.0728F, 0.0397F, 0.2196F));

		PartDefinition Basin_r39 = Monolophosaurus.addOrReplaceChild("Basin_r39", CubeListBuilder.create().texOffs(70, 10).addBox(-1.0124F, -0.7848F, -1.8449F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2038F, 4.5706F, 3.5803F, 1.9419F, 0.0397F, 0.2196F));

		PartDefinition Basin_r40 = Monolophosaurus.addOrReplaceChild("Basin_r40", CubeListBuilder.create().texOffs(9, 70).addBox(-0.9402F, -1.0388F, -3.6906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4288F, 2.0456F, 1.1053F, 2.3753F, 0.014F, 0.488F));

		PartDefinition Basin_r41 = Monolophosaurus.addOrReplaceChild("Basin_r41", CubeListBuilder.create().texOffs(70, 14).addBox(-0.9164F, -0.3517F, -1.9598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4288F, 2.0456F, 1.1053F, 2.0271F, 0.0204F, 0.5017F));

		PartDefinition Basin_r42 = Monolophosaurus.addOrReplaceChild("Basin_r42", CubeListBuilder.create().texOffs(89, 21).addBox(-0.1287F, 0.2113F, -1.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 42).addBox(-0.1287F, -0.4887F, -2.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0201F, 6.4108F, -3.4511F, 0.8895F, -0.0151F, 0.0423F));

		PartDefinition Basin_r43 = Monolophosaurus.addOrReplaceChild("Basin_r43", CubeListBuilder.create().texOffs(77, 82).addBox(-0.1287F, -1.3272F, -2.2483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0201F, 6.4108F, -3.4511F, 1.544F, -0.0151F, 0.0423F));

		PartDefinition Basin_r44 = Monolophosaurus.addOrReplaceChild("Basin_r44", CubeListBuilder.create().texOffs(70, 18).addBox(-0.1287F, -0.9659F, -2.1352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0201F, 6.4108F, -3.4511F, 1.1949F, -0.0151F, 0.0423F));

		PartDefinition Basin_r45 = Monolophosaurus.addOrReplaceChild("Basin_r45", CubeListBuilder.create().texOffs(70, 22).addBox(-0.1287F, -0.9585F, -1.9278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0201F, 6.4108F, -3.4511F, 1.4131F, -0.0151F, 0.0423F));

		PartDefinition Basin_r46 = Monolophosaurus.addOrReplaceChild("Basin_r46", CubeListBuilder.create().texOffs(43, 60).addBox(-1.0008F, -1.052F, -2.9145F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5201F, 4.1108F, -2.4511F, 1.2385F, -0.0151F, 0.2605F));

		PartDefinition Basin_r47 = Monolophosaurus.addOrReplaceChild("Basin_r47", CubeListBuilder.create().texOffs(75, 63).addBox(-1.0155F, -0.7131F, -1.9184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4201F, 2.6108F, -1.8511F, 1.0647F, 0.0F, 0.5236F));

		PartDefinition Basin_r48 = Monolophosaurus.addOrReplaceChild("Basin_r48", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.1201F, 2.4108F, -1.5511F, -0.0262F, 0.0F, 0.0873F));

		PartDefinition Basin_r49 = Monolophosaurus.addOrReplaceChild("Basin_r49", CubeListBuilder.create().texOffs(53, 69).addBox(-0.317F, 0.006F, 0.0357F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1185F, 0.3285F, -2.186F, -0.2007F, 0.0F, 0.0873F));

		PartDefinition Basin_r50 = Monolophosaurus.addOrReplaceChild("Basin_r50", CubeListBuilder.create().texOffs(55, 45).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3234F, 0.0867F, -0.7153F, -1.0297F, 0.0F, 0.0873F));

		PartDefinition Basin_r51 = Monolophosaurus.addOrReplaceChild("Basin_r51", CubeListBuilder.create().texOffs(27, 60).addBox(-0.5F, -0.1F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4055F, -0.8514F, 0.6753F, -0.1134F, 0.0F, 0.0873F));

		PartDefinition Basin_r52 = Monolophosaurus.addOrReplaceChild("Basin_r52", CubeListBuilder.create().texOffs(84, 77).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2555F, 0.8622F, 0.6464F, -0.637F, 0.0F, 0.0873F));

		PartDefinition Basin_r53 = Monolophosaurus.addOrReplaceChild("Basin_r53", CubeListBuilder.create().texOffs(9, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3095F, 0.2456F, 0.4824F, -0.0698F, 0.0F, 0.0873F));

		PartDefinition Basin_r54 = Monolophosaurus.addOrReplaceChild("Basin_r54", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 27).addBox(-0.5F, -0.4F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4878F, -0.3859F, 3.7952F, 0.0175F, 0.1396F, 0.0F));

		PartDefinition Basin_r55 = Monolophosaurus.addOrReplaceChild("Basin_r55", CubeListBuilder.create().texOffs(13, 84).addBox(0.0F, -1.5F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 52).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4273F, 0.9185F, -0.1571F, 0.0F, 0.0F));

		PartDefinition LegL = Monolophosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 1.5465F, 0.3241F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Femur_r1 = LegL.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(7, 78).addBox(-1.0F, -0.5034F, -0.2421F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 6.7132F, -3.7787F, -1.2741F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = LegL.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(64, 44).addBox(-1.0F, -0.425F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 7.3613F, -3.8283F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = LegL.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, -3.0213F, -0.1532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 7.2632F, -4.7287F, -0.5454F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = LegL.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(77, 58).addBox(-0.5F, -3.0213F, -0.1532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.2632F, -4.7287F, -0.4232F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = LegL.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(77, 17).addBox(0.5F, -3.0079F, 0.272F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(5, 83).addBox(0.5F, -2.0079F, -0.128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.52F, -3.5469F, -0.576F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = LegL.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(67, 86).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.1031F, -0.6228F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Femur_r7 = LegL.addOrReplaceChild("Femur_r7", CubeListBuilder.create().texOffs(77, 22).addBox(0.5F, -3.0375F, -0.0407F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 2.82F, -2.5469F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r8 = LegL.addOrReplaceChild("Femur_r8", CubeListBuilder.create().texOffs(82, 82).addBox(0.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 3.2961F, -0.3274F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r9 = LegL.addOrReplaceChild("Femur_r9", CubeListBuilder.create().texOffs(62, 86).addBox(0.5F, -0.1871F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.5F, 2.3415F, -0.0415F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r10 = LegL.addOrReplaceChild("Femur_r10", CubeListBuilder.create().texOffs(82, 60).addBox(0.5F, -0.1872F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.7961F, 0.3726F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r11 = LegL.addOrReplaceChild("Femur_r11", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5F, -0.8562F, -1.3007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2039F, 0.3726F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r12 = LegL.addOrReplaceChild("Femur_r12", CubeListBuilder.create().texOffs(77, 12).addBox(0.5F, -0.8562F, -0.5007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7961F, -0.0274F, -0.6545F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 8.5015F, -4.6158F, 0.4014F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r1 = TibiaL.addOrReplaceChild("TibioFibula_r1", CubeListBuilder.create().texOffs(36, 83).addBox(0.7F, -1.9603F, -0.8003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3737F, 1.4087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r2 = TibiaL.addOrReplaceChild("TibioFibula_r2", CubeListBuilder.create().texOffs(19, 83).addBox(0.7F, -1.7853F, -0.9003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.3737F, 1.4087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r3 = TibiaL.addOrReplaceChild("TibioFibula_r3", CubeListBuilder.create().texOffs(11, 53).addBox(0.7F, -5.6F, -0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r4 = TibiaL.addOrReplaceChild("TibioFibula_r4", CubeListBuilder.create().texOffs(38, 58).addBox(-1.0F, 2.2746F, 5.2868F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 60).addBox(-1.2F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2872F, 4.192F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Metatarsal_r1 = MetatarsalL.addOrReplaceChild("Metatarsal_r1", CubeListBuilder.create().texOffs(16, 62).addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(44, 33).addBox(-1.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.2786F, -1.4403F, 0.2618F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(0, 46).addBox(-1.5F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.5F, 0.05F, -2.3F));

		PartDefinition LegL2 = Monolophosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 1.5465F, 0.3241F, 0.4837F, -0.0365F, 0.0168F));

		PartDefinition Femur_r13 = LegL2.addOrReplaceChild("Femur_r13", CubeListBuilder.create().texOffs(76, 94).mirror().addBox(-1.0F, -0.5034F, -0.2421F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7132F, -3.7787F, -1.2741F, 0.0F, 0.0F));

		PartDefinition Femur_r14 = LegL2.addOrReplaceChild("Femur_r14", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-1.0F, -0.425F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3613F, -3.8283F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Femur_r15 = LegL2.addOrReplaceChild("Femur_r15", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -3.0213F, -0.1532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.2632F, -4.7287F, -0.5454F, 0.0F, 0.0F));

		PartDefinition Femur_r16 = LegL2.addOrReplaceChild("Femur_r16", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -3.0213F, -0.1532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.2632F, -4.7287F, -0.4232F, 0.0F, 0.0F));

		PartDefinition Femur_r17 = LegL2.addOrReplaceChild("Femur_r17", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.5F, -3.0079F, 0.272F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(92, 70).mirror().addBox(-1.5F, -2.0079F, -0.128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.52F, -3.5469F, -0.576F, 0.0F, 0.0F));

		PartDefinition Femur_r18 = LegL2.addOrReplaceChild("Femur_r18", CubeListBuilder.create().texOffs(92, 71).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1031F, -0.6228F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Femur_r19 = LegL2.addOrReplaceChild("Femur_r19", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.5F, -3.0375F, -0.0407F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.82F, -2.5469F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r20 = LegL2.addOrReplaceChild("Femur_r20", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.2961F, -0.3274F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r21 = LegL2.addOrReplaceChild("Femur_r21", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.5F, -0.1871F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.3415F, -0.0415F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r22 = LegL2.addOrReplaceChild("Femur_r22", CubeListBuilder.create().texOffs(92, 71).mirror().addBox(-1.5F, -0.1872F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7961F, 0.3726F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r23 = LegL2.addOrReplaceChild("Femur_r23", CubeListBuilder.create().texOffs(83, 92).mirror().addBox(-1.5F, -0.8562F, -1.3007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2039F, 0.3726F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r24 = LegL2.addOrReplaceChild("Femur_r24", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-1.5F, -0.8562F, -0.5007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7961F, -0.0274F, -0.6545F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 8.5015F, -4.6158F, 0.6196F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r5 = TibiaL2.addOrReplaceChild("TibioFibula_r5", CubeListBuilder.create().texOffs(50, 93).mirror().addBox(-1.7F, -1.9603F, -0.8003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3737F, 1.4087F, 0.0436F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r6 = TibiaL2.addOrReplaceChild("TibioFibula_r6", CubeListBuilder.create().texOffs(50, 93).mirror().addBox(-1.7F, -1.7853F, -0.9003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3737F, 1.4087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r7 = TibiaL2.addOrReplaceChild("TibioFibula_r7", CubeListBuilder.create().texOffs(92, 59).mirror().addBox(-1.7F, -5.6F, -0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r8 = TibiaL2.addOrReplaceChild("TibioFibula_r8", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(0.0F, 2.2746F, 5.2868F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 92).mirror().addBox(-0.8F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2872F, 4.192F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Metatarsal_r2 = MetatarsalL2.addOrReplaceChild("Metatarsal_r2", CubeListBuilder.create().texOffs(13, 29).mirror().addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create().texOffs(14, 20).mirror().addBox(-3.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.2786F, -1.4403F, 0.7418F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(14, 15).mirror().addBox(-2.5F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, -2.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Body = Monolophosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6825F, -4.1503F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(19, 39).addBox(0.0F, -2.1955F, -0.5792F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3441F, 1.6456F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(73, 83).addBox(0.0F, -3.3403F, 9.9956F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 83).addBox(0.0F, -3.2403F, 7.9956F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 83).addBox(0.0F, -3.0403F, 5.9956F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4314F, -11.0006F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Thorax_r3 = Body.addOrReplaceChild("Thorax_r3", CubeListBuilder.create().texOffs(89, 52).addBox(0.0F, -1.7894F, 0.0552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7314F, -7.0005F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Thorax_r4 = Body.addOrReplaceChild("Thorax_r4", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.141F, -10.4224F, 0.4113F, 0.2039F, -0.3988F));

		PartDefinition Thorax_r5 = Body.addOrReplaceChild("Thorax_r5", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-8.9917F, -2.5099F, -0.5221F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.141F, -10.4224F, 0.0795F, 0.4575F, -1.3371F));

		PartDefinition Thorax_r6 = Body.addOrReplaceChild("Thorax_r6", CubeListBuilder.create().texOffs(82, 40).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.141F, -10.4224F, 0.2902F, 0.3671F, -0.8214F));

		PartDefinition Thorax_r7 = Body.addOrReplaceChild("Thorax_r7", CubeListBuilder.create().texOffs(43, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -8.4224F, 0.3217F, 0.1659F, -0.4153F));

		PartDefinition Thorax_r8 = Body.addOrReplaceChild("Thorax_r8", CubeListBuilder.create().texOffs(15, 46).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -8.4224F, 0.2219F, 0.2961F, -0.8436F));

		PartDefinition Thorax_r9 = Body.addOrReplaceChild("Thorax_r9", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-7.9917F, -2.5099F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -8.4224F, 0.0557F, 0.364F, -1.3466F));

		PartDefinition Thorax_r10 = Body.addOrReplaceChild("Thorax_r10", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.059F, -0.5224F, -0.0997F, -0.1078F, -1.0872F));

		PartDefinition Thorax_r11 = Body.addOrReplaceChild("Thorax_r11", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.059F, -0.5224F, -0.1384F, -0.0667F, -0.6511F));

		PartDefinition Thorax_r12 = Body.addOrReplaceChild("Thorax_r12", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-3.9917F, -2.5099F, -0.5221F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -2.5224F, -0.0262F, -0.0117F, -1.4658F));

		PartDefinition Thorax_r13 = Body.addOrReplaceChild("Thorax_r13", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -2.5224F, -0.0277F, 0.0026F, -0.5497F));

		PartDefinition Thorax_r14 = Body.addOrReplaceChild("Thorax_r14", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.159F, -2.5224F, -0.0287F, 0.0018F, -0.986F));

		PartDefinition Thorax_r15 = Body.addOrReplaceChild("Thorax_r15", CubeListBuilder.create().texOffs(82, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -4.5224F, 0.1202F, 0.0782F, -0.4917F));

		PartDefinition Thorax_r16 = Body.addOrReplaceChild("Thorax_r16", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -4.5224F, 0.0736F, 0.1326F, -0.9272F));

		PartDefinition Thorax_r17 = Body.addOrReplaceChild("Thorax_r17", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-4.9917F, -2.5099F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -4.5224F, 0.0037F, 0.1515F, -1.4117F));

		PartDefinition Thorax_r18 = Body.addOrReplaceChild("Thorax_r18", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-6.9917F, -2.5099F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -6.5224F, 0.0355F, 0.2788F, -1.3529F));

		PartDefinition Thorax_r19 = Body.addOrReplaceChild("Thorax_r19", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -6.5224F, 0.1624F, 0.2304F, -0.8591F));

		PartDefinition Thorax_r20 = Body.addOrReplaceChild("Thorax_r20", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.259F, -6.5224F, 0.2411F, 0.1302F, -0.4271F));

		PartDefinition Thorax_r21 = Body.addOrReplaceChild("Thorax_r21", CubeListBuilder.create().texOffs(82, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.059F, -0.5224F, -0.1384F, 0.0667F, 0.6511F));

		PartDefinition Thorax_r22 = Body.addOrReplaceChild("Thorax_r22", CubeListBuilder.create().texOffs(82, 22).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.059F, -0.5224F, -0.0997F, 0.1078F, 1.0872F));

		PartDefinition Thorax_r23 = Body.addOrReplaceChild("Thorax_r23", CubeListBuilder.create().texOffs(82, 16).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -2.5224F, -0.0287F, -0.0018F, 0.986F));

		PartDefinition Thorax_r24 = Body.addOrReplaceChild("Thorax_r24", CubeListBuilder.create().texOffs(82, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -2.5224F, -0.0277F, -0.0026F, 0.5497F));

		PartDefinition Thorax_r25 = Body.addOrReplaceChild("Thorax_r25", CubeListBuilder.create().texOffs(65, 25).addBox(2.9917F, -2.5099F, -0.5221F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -2.5224F, -0.0262F, 0.0117F, 1.4658F));

		PartDefinition Thorax_r26 = Body.addOrReplaceChild("Thorax_r26", CubeListBuilder.create().texOffs(70, 81).addBox(2.9917F, -2.5099F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -4.5224F, 0.0037F, -0.1515F, 1.4117F));

		PartDefinition Thorax_r27 = Body.addOrReplaceChild("Thorax_r27", CubeListBuilder.create().texOffs(82, 12).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -4.5224F, 0.0736F, -0.1326F, 0.9272F));

		PartDefinition Thorax_r28 = Body.addOrReplaceChild("Thorax_r28", CubeListBuilder.create().texOffs(82, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -4.5224F, 0.1202F, -0.0782F, 0.4917F));

		PartDefinition Thorax_r29 = Body.addOrReplaceChild("Thorax_r29", CubeListBuilder.create().texOffs(82, 40).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.141F, -10.4224F, 0.2902F, -0.3671F, 0.8214F));

		PartDefinition Thorax_r30 = Body.addOrReplaceChild("Thorax_r30", CubeListBuilder.create().texOffs(50, 25).addBox(2.9917F, -2.5099F, -0.5221F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.141F, -10.4224F, 0.0795F, -0.4575F, 1.3371F));

		PartDefinition Thorax_r31 = Body.addOrReplaceChild("Thorax_r31", CubeListBuilder.create().texOffs(82, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.141F, -10.4224F, 0.4113F, -0.2039F, 0.3988F));

		PartDefinition Thorax_r32 = Body.addOrReplaceChild("Thorax_r32", CubeListBuilder.create().texOffs(59, 33).addBox(2.9917F, -2.5099F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -8.4224F, 0.0557F, -0.364F, 1.3466F));

		PartDefinition Thorax_r33 = Body.addOrReplaceChild("Thorax_r33", CubeListBuilder.create().texOffs(15, 46).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -8.4224F, 0.2219F, -0.2961F, 0.8436F));

		PartDefinition Thorax_r34 = Body.addOrReplaceChild("Thorax_r34", CubeListBuilder.create().texOffs(43, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.159F, -8.4224F, 0.3217F, -0.1659F, 0.4153F));

		PartDefinition Thorax_r35 = Body.addOrReplaceChild("Thorax_r35", CubeListBuilder.create().texOffs(5, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -6.5224F, 0.2411F, -0.1302F, 0.4271F));

		PartDefinition Thorax_r36 = Body.addOrReplaceChild("Thorax_r36", CubeListBuilder.create().texOffs(42, 81).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -6.5224F, 0.1624F, -0.2304F, 0.8591F));

		PartDefinition Thorax_r37 = Body.addOrReplaceChild("Thorax_r37", CubeListBuilder.create().texOffs(64, 48).addBox(2.9917F, -2.5099F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.259F, -6.5224F, 0.0355F, -0.2788F, 1.3529F));

		PartDefinition Thorax_r38 = Body.addOrReplaceChild("Thorax_r38", CubeListBuilder.create().texOffs(42, 38).addBox(-3.5F, -2.9586F, -0.1978F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.6713F, -3.2545F, -0.288F, 0.0F, 0.0F));

		PartDefinition Thorax_r39 = Body.addOrReplaceChild("Thorax_r39", CubeListBuilder.create().texOffs(0, 39).addBox(-3.5F, -2.045F, 0.1062F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.4713F, -7.3545F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Thorax_r40 = Body.addOrReplaceChild("Thorax_r40", CubeListBuilder.create().texOffs(44, 27).addBox(-3.0F, -1.0625F, 0.052F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.8713F, -11.2545F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Thorax_r41 = Body.addOrReplaceChild("Thorax_r41", CubeListBuilder.create().texOffs(10, 83).addBox(0.5F, -2.0255F, 0.0121F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4314F, -9.0006F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Thorax_r42 = Body.addOrReplaceChild("Thorax_r42", CubeListBuilder.create().texOffs(78, 89).addBox(0.5F, -1.4181F, -0.0302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7314F, -11.0006F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Thorax_r43 = Body.addOrReplaceChild("Thorax_r43", CubeListBuilder.create().texOffs(50, 19).addBox(0.0F, -0.0357F, -3.9979F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6314F, -7.0005F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Thorax_r44 = Body.addOrReplaceChild("Thorax_r44", CubeListBuilder.create().texOffs(23, 27).addBox(0.0F, 0.0F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4314F, 1.9994F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0686F, -10.9505F, 0.1398F, 0.0432F, 0.0061F));

		PartDefinition Scapulo_coracoid_r1 = Chest.addOrReplaceChild("Scapulo_coracoid_r1", CubeListBuilder.create().texOffs(89, 48).addBox(0.0F, -1.8746F, -0.1539F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1948F, -1.8634F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r2 = Chest.addOrReplaceChild("Scapulo_coracoid_r2", CubeListBuilder.create().texOffs(89, 30).addBox(0.0F, -1.5746F, -0.1538F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0379F, -3.8573F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r3 = Chest.addOrReplaceChild("Scapulo_coracoid_r3", CubeListBuilder.create().texOffs(58, 75).mirror().addBox(-0.5F, -0.6964F, -3.0955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 74).mirror().addBox(-0.5F, -0.5714F, -3.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 1.1155F, -1.9639F, 0.8639F, -0.1745F, 0.0F));

		PartDefinition Scapulo_coracoid_r4 = Chest.addOrReplaceChild("Scapulo_coracoid_r4", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(0.0619F, -1.1722F, -0.1611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.2155F, -2.3639F, 0.8229F, 0.0119F, 0.2406F));

		PartDefinition Scapulo_coracoid_r5 = Chest.addOrReplaceChild("Scapulo_coracoid_r5", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(0.0619F, -1.0592F, -0.0027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.2155F, -2.3639F, 0.7356F, 0.0119F, 0.2406F));

		PartDefinition Scapulo_coracoid_r6 = Chest.addOrReplaceChild("Scapulo_coracoid_r6", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-0.5F, -0.6F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5806F, 3.9214F, -5.4567F, 1.3805F, -0.4069F, -0.5842F));

		PartDefinition Scapulo_coracoid_r7 = Chest.addOrReplaceChild("Scapulo_coracoid_r7", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(0.0619F, -0.7795F, 1.9212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.2155F, -2.3639F, 1.041F, 0.0119F, 0.2406F));

		PartDefinition Scapulo_coracoid_r8 = Chest.addOrReplaceChild("Scapulo_coracoid_r8", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-0.1252F, -0.191F, -0.4745F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 6.8219F, -1.1025F, -0.6194F, -0.617F, 0.608F));

		PartDefinition Scapulo_coracoid_r9 = Chest.addOrReplaceChild("Scapulo_coracoid_r9", CubeListBuilder.create().texOffs(27, 55).mirror().addBox(-0.2275F, -0.1299F, -0.3782F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.15F, 6.8219F, -1.5025F, -0.6016F, -0.9196F, 0.6364F));

		PartDefinition Scapulo_coracoid_r10 = Chest.addOrReplaceChild("Scapulo_coracoid_r10", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(0.0105F, -0.0916F, -0.7815F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 6.4219F, -2.4025F, -1.7562F, -1.3328F, 2.1995F));

		PartDefinition Scapulo_coracoid_r11 = Chest.addOrReplaceChild("Scapulo_coracoid_r11", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.95F, -1.041F, -2.0846F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 68).addBox(1.45F, -1.041F, -2.0846F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.5219F, -4.1025F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r12 = Chest.addOrReplaceChild("Scapulo_coracoid_r12", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(0.05F, -0.9527F, -0.0377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 63).addBox(1.45F, -0.9527F, -0.0377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.4219F, -4.1025F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r13 = Chest.addOrReplaceChild("Scapulo_coracoid_r13", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9228F, 4.2054F, -4.4309F, 0.4206F, -0.4069F, -0.5842F));

		PartDefinition Scapulo_coracoid_r14 = Chest.addOrReplaceChild("Scapulo_coracoid_r14", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(0.0619F, -1.2602F, 1.6879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.2155F, -2.3639F, 0.6483F, 0.0119F, 0.2406F));

		PartDefinition Thorax_r45 = Chest.addOrReplaceChild("Thorax_r45", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-7.9917F, -2.5099F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3724F, -3.5719F, 0.0821F, 0.5285F, -1.4205F));

		PartDefinition Thorax_r46 = Chest.addOrReplaceChild("Thorax_r46", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3724F, -3.5719F, 0.4717F, 0.2437F, -0.4701F));

		PartDefinition Thorax_r47 = Chest.addOrReplaceChild("Thorax_r47", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3724F, -3.5719F, 0.3309F, 0.4274F, -0.8904F));

		PartDefinition Thorax_r48 = Chest.addOrReplaceChild("Thorax_r48", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(-8.9917F, -2.5099F, -0.5221F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0724F, -1.5719F, 0.0528F, 0.4002F, -1.3639F));

		PartDefinition Thorax_r49 = Chest.addOrReplaceChild("Thorax_r49", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-3.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0724F, -1.5719F, 0.2379F, 0.3291F, -0.8549F));

		PartDefinition Thorax_r50 = Chest.addOrReplaceChild("Thorax_r50", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0724F, -1.5719F, 0.3496F, 0.1896F, -0.4265F));

		PartDefinition Scapulo_coracoid_r15 = Chest.addOrReplaceChild("Scapulo_coracoid_r15", CubeListBuilder.create().texOffs(75, 54).addBox(-1.0619F, -1.1722F, -0.1611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 2.2155F, -2.3639F, 0.8229F, -0.0119F, -0.2406F));

		PartDefinition Scapulo_coracoid_r16 = Chest.addOrReplaceChild("Scapulo_coracoid_r16", CubeListBuilder.create().texOffs(75, 46).addBox(-1.0619F, -0.7795F, 1.9212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.4F, 2.2155F, -2.3639F, 1.041F, -0.0119F, -0.2406F));

		PartDefinition Scapulo_coracoid_r17 = Chest.addOrReplaceChild("Scapulo_coracoid_r17", CubeListBuilder.create().texOffs(75, 34).addBox(-1.0619F, -1.2602F, 1.6879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 2.2155F, -2.3639F, 0.6483F, -0.0119F, -0.2406F));

		PartDefinition Scapulo_coracoid_r18 = Chest.addOrReplaceChild("Scapulo_coracoid_r18", CubeListBuilder.create().texOffs(61, 65).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5806F, 3.9214F, -5.4567F, 1.3805F, 0.4069F, 0.5842F));

		PartDefinition Scapulo_coracoid_r19 = Chest.addOrReplaceChild("Scapulo_coracoid_r19", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9228F, 4.2054F, -4.4309F, 0.4206F, 0.4069F, 0.5842F));

		PartDefinition Scapulo_coracoid_r20 = Chest.addOrReplaceChild("Scapulo_coracoid_r20", CubeListBuilder.create().texOffs(61, 20).addBox(-1.0619F, -1.0592F, -0.0027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.4F, 2.2155F, -2.3639F, 0.7356F, -0.0119F, -0.2406F));

		PartDefinition Scapulo_coracoid_r21 = Chest.addOrReplaceChild("Scapulo_coracoid_r21", CubeListBuilder.create().texOffs(58, 75).addBox(-0.5F, -0.6964F, -3.0955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 74).addBox(-0.5F, -0.5714F, -3.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.9F, 1.1155F, -1.9639F, 0.8639F, 0.1745F, 0.0F));

		PartDefinition Scapulo_coracoid_r22 = Chest.addOrReplaceChild("Scapulo_coracoid_r22", CubeListBuilder.create().texOffs(48, 7).addBox(-0.8748F, -0.191F, -0.4745F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 6.8219F, -1.1025F, -0.6194F, 0.617F, -0.608F));

		PartDefinition Scapulo_coracoid_r23 = Chest.addOrReplaceChild("Scapulo_coracoid_r23", CubeListBuilder.create().texOffs(27, 55).addBox(-0.7725F, -0.1299F, -0.3782F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.15F, 6.8219F, -1.5025F, -0.6016F, 0.9196F, -0.6364F));

		PartDefinition Scapulo_coracoid_r24 = Chest.addOrReplaceChild("Scapulo_coracoid_r24", CubeListBuilder.create().texOffs(23, 65).addBox(-1.0105F, -0.0916F, -0.7815F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, 6.4219F, -2.4025F, -1.7562F, 1.3328F, -2.1995F));

		PartDefinition Scapulo_coracoid_r25 = Chest.addOrReplaceChild("Scapulo_coracoid_r25", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.0436F, 1.0009F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -6.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Thorax_r51 = Chest.addOrReplaceChild("Thorax_r51", CubeListBuilder.create().texOffs(82, 24).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3724F, -3.5719F, 0.3309F, -0.4274F, 0.8904F));

		PartDefinition Thorax_r52 = Chest.addOrReplaceChild("Thorax_r52", CubeListBuilder.create().texOffs(82, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3724F, -3.5719F, 0.4717F, -0.2437F, 0.4701F));

		PartDefinition Thorax_r53 = Chest.addOrReplaceChild("Thorax_r53", CubeListBuilder.create().texOffs(59, 35).addBox(2.9917F, -2.5099F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3724F, -3.5719F, 0.0821F, -0.5285F, 1.4205F));

		PartDefinition Thorax_r54 = Chest.addOrReplaceChild("Thorax_r54", CubeListBuilder.create().texOffs(27, 11).addBox(2.9917F, -2.5099F, -0.5221F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0724F, -1.5719F, 0.0528F, -0.4002F, 1.3639F));

		PartDefinition Thorax_r55 = Chest.addOrReplaceChild("Thorax_r55", CubeListBuilder.create().texOffs(63, 80).addBox(1.8126F, -0.8449F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0724F, -1.5719F, 0.2379F, -0.3291F, 0.8549F));

		PartDefinition Thorax_r56 = Chest.addOrReplaceChild("Thorax_r56", CubeListBuilder.create().texOffs(64, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0724F, -1.5719F, 0.3496F, -0.1896F, 0.4265F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8874F, 5.4053F, -4.0192F, -0.6163F, 0.2282F, -0.0705F));

		PartDefinition Humerus_r1 = ArmL.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(79, 50).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0023F, 2.6195F, 3.1984F, 0.48F, 0.0F, 0.0F));

		PartDefinition Humerus_r2 = ArmL.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0023F, -0.0963F, 0.1765F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Humerus_r3 = ArmL.addOrReplaceChild("Humerus_r3", CubeListBuilder.create().texOffs(79, 78).addBox(-2.0F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4977F, 1.3068F, 0.9518F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Humerus_r4 = ArmL.addOrReplaceChild("Humerus_r4", CubeListBuilder.create().texOffs(79, 74).addBox(-2.0F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4977F, 1.3068F, 0.9518F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Humerus_r5 = ArmL.addOrReplaceChild("Humerus_r5", CubeListBuilder.create().texOffs(58, 79).addBox(-2.0F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4977F, 1.3068F, 0.9518F, 1.0036F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4977F, 2.8522F, 3.2666F, -0.3053F, -0.1719F, -0.4971F));

		PartDefinition Radio_Ulna_r1 = ElbowL.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(67, 74).addBox(-1.0F, 0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 74).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0743F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(61, 37).addBox(-1.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 4.3828F, -2.1979F, -0.0681F, -0.298F, -0.1107F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8874F, 5.4053F, -4.0192F, -0.2545F, -0.2369F, 0.2047F));

		PartDefinition Humerus_r6 = ArmL2.addOrReplaceChild("Humerus_r6", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0023F, 2.6195F, 3.1984F, 0.48F, 0.0F, 0.0F));

		PartDefinition Humerus_r7 = ArmL2.addOrReplaceChild("Humerus_r7", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0023F, -0.0963F, 0.1765F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Humerus_r8 = ArmL2.addOrReplaceChild("Humerus_r8", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(1.0F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4977F, 1.3068F, 0.9518F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Humerus_r9 = ArmL2.addOrReplaceChild("Humerus_r9", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(1.0F, -1.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4977F, 1.3068F, 0.9518F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Humerus_r10 = ArmL2.addOrReplaceChild("Humerus_r10", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(1.0F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4977F, 1.3068F, 0.9518F, 1.0036F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4977F, 2.8522F, 3.2666F, -0.3271F, 0.2213F, 0.5742F));

		PartDefinition Radio_Ulna_r2 = ElbowL2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(92, 81).mirror().addBox(0.0F, 0.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(92, 81).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0743F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(0.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0025F, 4.3828F, -2.1979F, -0.0608F, 0.4323F, -0.3221F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4495F, -5.1295F, -0.0611F, 0.0F, 0.0F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(13, 89).addBox(0.0F, -1.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7305F, 0.2968F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Thorax_r57 = Neck1.addOrReplaceChild("Thorax_r57", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-2.0581F, 0.1075F, -0.3417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2014F, -0.3982F, 0.592F, 0.3995F, -0.7412F));

		PartDefinition Thorax_r58 = Neck1.addOrReplaceChild("Thorax_r58", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-6.9125F, -0.7724F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2014F, -0.3982F, 0.3762F, 0.6164F, -1.177F));

		PartDefinition CervicalProximal_r1 = Neck1.addOrReplaceChild("CervicalProximal_r1", CubeListBuilder.create().texOffs(49, 80).mirror().addBox(-0.0132F, -0.515F, -0.0134F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.814F, -1.9672F, -0.9863F, -0.2628F, 0.3327F));

		PartDefinition CervicalProximal_r2 = Neck1.addOrReplaceChild("CervicalProximal_r2", CubeListBuilder.create().texOffs(49, 80).addBox(0.0132F, -0.515F, -0.0134F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.814F, -1.9672F, -0.9863F, 0.2628F, -0.3327F));

		PartDefinition CervicalDistal_r2 = Neck1.addOrReplaceChild("CervicalDistal_r2", CubeListBuilder.create().texOffs(39, 48).addBox(0.0F, -1.25F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 13).addBox(-0.5F, 0.35F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2738F, -2.2762F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Thorax_r59 = Neck1.addOrReplaceChild("Thorax_r59", CubeListBuilder.create().texOffs(82, 72).addBox(0.0581F, 0.1075F, -0.3417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2014F, -0.3982F, 0.592F, -0.3995F, 0.7412F));

		PartDefinition Thorax_r60 = Neck1.addOrReplaceChild("Thorax_r60", CubeListBuilder.create().texOffs(59, 52).addBox(1.9125F, -0.7724F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2014F, -0.3982F, 0.3762F, -0.6164F, 1.177F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6738F, -2.6263F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(72, 88).addBox(0.0F, -1.5729F, 0.0161F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.021F, -0.6006F, -0.7069F, 0.0F, 0.0F));

		PartDefinition CervicalMedial_r2 = Neck2.addOrReplaceChild("CervicalMedial_r2", CubeListBuilder.create().texOffs(59, 88).addBox(0.0F, -1.5053F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2985F, -2.0427F, -0.8029F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r3 = Neck2.addOrReplaceChild("CervicalProximal_r3", CubeListBuilder.create().texOffs(80, 42).mirror().addBox(-0.0091F, -0.4416F, 0.0188F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0651F, -0.9221F, -0.9509F, -0.2363F, 0.2544F));

		PartDefinition CervicalProximal_r4 = Neck2.addOrReplaceChild("CervicalProximal_r4", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(0.0062F, -0.3646F, 0.1589F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6921F, -3.9292F, -0.9291F, -0.1065F, 0.0763F));

		PartDefinition CervicalProximal_r5 = Neck2.addOrReplaceChild("CervicalProximal_r5", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-0.0111F, -0.6427F, -0.0789F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1921F, -2.3292F, -1.0173F, -0.1527F, 0.1509F));

		PartDefinition CervicalProximal_r6 = Neck2.addOrReplaceChild("CervicalProximal_r6", CubeListBuilder.create().texOffs(31, 80).addBox(-0.0062F, -0.3646F, 0.1589F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6921F, -3.9292F, -0.9291F, 0.1065F, -0.0763F));

		PartDefinition CervicalProximal_r7 = Neck2.addOrReplaceChild("CervicalProximal_r7", CubeListBuilder.create().texOffs(80, 42).addBox(0.0091F, -0.4416F, 0.0188F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0651F, -0.9221F, -0.9509F, 0.2363F, -0.2544F));

		PartDefinition CervicalProximal_r8 = Neck2.addOrReplaceChild("CervicalProximal_r8", CubeListBuilder.create().texOffs(26, 80).addBox(0.0111F, -0.6427F, -0.0789F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1921F, -2.3292F, -1.0173F, 0.1527F, -0.1509F));

		PartDefinition CervicalMedial_r3 = Neck2.addOrReplaceChild("CervicalMedial_r3", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, 0.6F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.1349F, -3.1508F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6291F, -2.9863F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition CervicalProximal_r9 = Neck3.addOrReplaceChild("CervicalProximal_r9", CubeListBuilder.create().texOffs(0, 89).addBox(0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9783F, -2.8551F, -0.0087F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r10 = Neck3.addOrReplaceChild("CervicalProximal_r10", CubeListBuilder.create().texOffs(46, 88).addBox(0.0F, -1.5878F, 0.9552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7999F, -1.8256F, -0.288F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r11 = Neck3.addOrReplaceChild("CervicalProximal_r11", CubeListBuilder.create().texOffs(14, 80).mirror().addBox(0.0049F, -0.5651F, -0.0663F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.7551F, -0.4928F, -0.1065F, 0.0763F));

		PartDefinition CervicalProximal_r12 = Neck3.addOrReplaceChild("CervicalProximal_r12", CubeListBuilder.create().texOffs(14, 80).addBox(-0.0049F, -0.5651F, -0.0663F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.7551F, -0.4928F, 0.1065F, -0.0763F));

		PartDefinition CervicalProximal_r13 = Neck3.addOrReplaceChild("CervicalProximal_r13", CubeListBuilder.create().texOffs(92, 0).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0868F, -4.4326F, 0.4276F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r14 = Neck3.addOrReplaceChild("CervicalProximal_r14", CubeListBuilder.create().texOffs(32, 73).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -0.9783F, -2.8551F, 0.2531F, 0.0F, 0.0F));

		PartDefinition CervicalProximal_r15 = Neck3.addOrReplaceChild("CervicalProximal_r15", CubeListBuilder.create().texOffs(52, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9783F, -2.8551F, -0.1833F, 0.0F, 0.0F));

		PartDefinition ThroatPouch = Neck3.addOrReplaceChild("ThroatPouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2717F, -3.7551F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Skull = Neck3.addOrReplaceChild("Skull", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6694F, -4.6387F, 0.48F, 0.0F, 0.0F));

		PartDefinition Premaxilla_r1 = Skull.addOrReplaceChild("Premaxilla_r1", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(1.5F, -1.0008F, -1.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(84, 26).mirror().addBox(1.5F, -1.0008F, -1.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(84, 26).addBox(2.1F, -1.0008F, -1.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(24, 84).addBox(2.1F, -1.0008F, -1.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3F, 1.9F, -8.85F, 0.2007F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r1 = Skull.addOrReplaceChild("NasalCrest_r1", CubeListBuilder.create().texOffs(49, 84).mirror().addBox(-1.15F, 0.6637F, -1.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 29).mirror().addBox(-1.15F, -0.0363F, -1.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(29, 84).mirror().addBox(-1.15F, -0.0363F, -0.9447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 29).addBox(-0.15F, -0.0363F, -1.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(49, 84).addBox(-0.15F, 0.6637F, -1.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 84).addBox(-0.15F, -0.0363F, -0.9447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, -0.15F, -8.85F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Premaxilla_r2 = Skull.addOrReplaceChild("Premaxilla_r2", CubeListBuilder.create().texOffs(16, 72).mirror().addBox(1.5F, -1.0159F, 0.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(16, 72).addBox(2.1F, -1.0159F, 0.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.3F, 1.2F, -10.35F, -0.2793F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r2 = Skull.addOrReplaceChild("NasalCrest_r2", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.15F, -0.0153F, 0.2542F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 57).addBox(-0.15F, -0.0153F, 0.2542F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, -0.15F, -9.05F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Premaxilla_r3 = Skull.addOrReplaceChild("Premaxilla_r3", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.5F, -2.1901F, -0.9828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(0, 80).addBox(1.5F, -2.1901F, -0.9828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, 2.2F, -8.55F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Maxilla_r1 = Skull.addOrReplaceChild("Maxilla_r1", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-1.0F, -1.9772F, -1.9569F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(70, 5).addBox(0.0F, -1.9772F, -1.9569F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.0988F, -6.5284F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Maxilla_r2 = Skull.addOrReplaceChild("Maxilla_r2", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(0.0F, -0.7F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 90).addBox(1.6F, -0.7F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.3669F, -9.4834F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Maxilla_r3 = Skull.addOrReplaceChild("Maxilla_r3", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-0.3F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 90).mirror().addBox(-0.3F, -0.3F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 90).addBox(1.3F, -0.3F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 90).addBox(1.3F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1797F, -7.4897F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Maxilla_r4 = Skull.addOrReplaceChild("Maxilla_r4", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 90).addBox(1.6F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.0401F, -4.2927F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Maxilla_r5 = Skull.addOrReplaceChild("Maxilla_r5", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 78).addBox(0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.625F, 0.7363F, -6.437F, -0.4669F, 0.0F, 0.0F));

		PartDefinition Maxilla_r6 = Skull.addOrReplaceChild("Maxilla_r6", CubeListBuilder.create().texOffs(42, 45).mirror().addBox(-1.5F, 0.0008F, -3.9692F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(42, 45).addBox(-0.9F, 0.0008F, -3.9692F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -0.9762F, -2.9534F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Maxilla_r7 = Skull.addOrReplaceChild("Maxilla_r7", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-1.3F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 71).addBox(-0.7F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.5805F, -3.3048F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Maxilla_r8 = Skull.addOrReplaceChild("Maxilla_r8", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.5F, -0.9F, 1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(61, 0).addBox(-0.9F, -0.9F, 1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 1.0988F, -6.0284F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Maxilla_r9 = Skull.addOrReplaceChild("Maxilla_r9", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-1.5F, -2.0079F, -2.0029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 10).addBox(-0.9F, -2.0079F, -2.0029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 2.1488F, -4.6784F, -0.0087F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r3 = Skull.addOrReplaceChild("NasalCrest_r3", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-0.775F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 74).mirror().addBox(-0.775F, -0.3F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 74).addBox(-0.225F, -0.3F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(84, 50).addBox(-0.225F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.9391F, -4.5072F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Cranium_r1 = Skull.addOrReplaceChild("Cranium_r1", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-0.3875F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(89, 9).mirror().addBox(-0.5625F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(89, 9).addBox(2.0875F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(86, 86).addBox(1.9125F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2625F, -0.0432F, -2.2861F, -1.4399F, 0.0F, 0.0F));

		PartDefinition Cranium_r2 = Skull.addOrReplaceChild("Cranium_r2", CubeListBuilder.create().texOffs(61, 5).mirror().addBox(-0.5F, -0.1218F, -2.9705F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 74).mirror().addBox(-0.725F, -0.4218F, -2.5705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(23, 74).addBox(1.725F, -0.4218F, -2.5705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F))
				.texOffs(61, 5).addBox(1.5F, -0.1218F, -2.9705F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.2657F, -2.4107F, -1.7453F, 0.0F, 0.0F));

		PartDefinition Cranium_r3 = Skull.addOrReplaceChild("Cranium_r3", CubeListBuilder.create().texOffs(81, 86).mirror().addBox(-0.5F, -0.0042F, -1.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(81, 86).addBox(1.5F, -0.0042F, -1.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 2.4657F, -1.4107F, -1.7017F, 0.0F, 0.0F));

		PartDefinition Cranium_r4 = Skull.addOrReplaceChild("Cranium_r4", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-0.5F, -0.575F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 82).addBox(1.5F, -0.575F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.7657F, -0.0107F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Cranium_r5 = Skull.addOrReplaceChild("Cranium_r5", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 38).addBox(1.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.8157F, -0.4357F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Cranium_r6 = Skull.addOrReplaceChild("Cranium_r6", CubeListBuilder.create().texOffs(76, 86).mirror().addBox(-2.0F, 0.5144F, 0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(76, 86).addBox(0.0F, 0.5144F, 0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.0544F, 0.1159F, -0.7854F, 0.0F, 0.0F));

		PartDefinition PremaxillaryCrest_r1 = Skull.addOrReplaceChild("PremaxillaryCrest_r1", CubeListBuilder.create().texOffs(89, 27).addBox(-0.5F, -0.034F, -0.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4743F, -9.3819F, 0.48F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r4 = Skull.addOrReplaceChild("NasalCrest_r4", CubeListBuilder.create().texOffs(54, 83).addBox(-0.5F, -0.0137F, -0.0148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.6283F, -3.5592F, -0.2007F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r5 = Skull.addOrReplaceChild("NasalCrest_r5", CubeListBuilder.create().texOffs(41, 83).addBox(-0.5F, -0.0086F, -0.0098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5283F, -4.5592F, 0.1047F, 0.0F, 0.0F));

		PartDefinition NasalCrest_r6 = Skull.addOrReplaceChild("NasalCrest_r6", CubeListBuilder.create().texOffs(28, 48).addBox(-0.5F, -0.0181F, -0.0145F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9283F, -8.5092F, 0.1484F, 0.0F, 0.0F));

		PartDefinition nares_r1 = Skull.addOrReplaceChild("nares_r1", CubeListBuilder.create().texOffs(68, 83).addBox(-0.35F, -0.0255F, -0.0233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.15F, 0.225F, -10.025F, 0.8465F, 0.0F, 0.0F));

		PartDefinition Maxilla_r10 = Skull.addOrReplaceChild("Maxilla_r10", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-1.0F, -0.5F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(77, 27).addBox(-0.55F, -0.5F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.225F, 0.2076F, -7.24F, -1.4268F, 0.0F, 0.0F));

		PartDefinition Maxilla_r11 = Skull.addOrReplaceChild("Maxilla_r11", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-1.0F, -0.55F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 77).addBox(-0.55F, -0.55F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.225F, 0.3502F, -7.372F, -0.8378F, 0.0F, 0.0F));

		PartDefinition Maxilla_r12 = Skull.addOrReplaceChild("Maxilla_r12", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-1.0F, -0.1926F, -0.2037F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 30).addBox(-0.55F, -0.1926F, -0.2037F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.225F, -0.1674F, -7.59F, -1.2697F, 0.0F, 0.0F));

		PartDefinition Maxilla_r13 = Skull.addOrReplaceChild("Maxilla_r13", CubeListBuilder.create().texOffs(72, 50).mirror().addBox(-1.0F, -1.8097F, -0.7748F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(72, 50).addBox(-0.55F, -1.8097F, -0.7748F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.225F, 0.8576F, -8.965F, -1.4923F, 0.0F, 0.0F));

		PartDefinition Maxilla_r14 = Skull.addOrReplaceChild("Maxilla_r14", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(77, 0).addBox(-0.35F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.325F, 0.7721F, -3.9693F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Maxilla_r15 = Skull.addOrReplaceChild("Maxilla_r15", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-1.0F, -0.9831F, -1.007F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 9).mirror().addBox(-1.0F, -0.9831F, -1.557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(77, 9).addBox(-0.35F, -0.9831F, -1.557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(77, 6).addBox(-0.35F, -0.9831F, -1.007F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, 1.2971F, -4.4443F, -0.1614F, 0.0F, 0.0F));

		PartDefinition Maxilla_r16 = Skull.addOrReplaceChild("Maxilla_r16", CubeListBuilder.create().texOffs(43, 65).mirror().addBox(-1.0F, -1.0159F, -1.992F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(43, 65).addBox(-0.35F, -1.0159F, -1.992F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.325F, 0.3221F, -3.2443F, 0.3883F, 0.0F, 0.0F));

		PartDefinition Maxilla_r17 = Skull.addOrReplaceChild("Maxilla_r17", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(-1.0F, -0.9922F, -0.9823F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 3).addBox(-0.35F, -0.9922F, -0.9823F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, 1.2721F, -3.4693F, -0.2225F, 0.0F, 0.0F));

		PartDefinition Cranium_r7 = Skull.addOrReplaceChild("Cranium_r7", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-0.5F, -0.1994F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 83).mirror().addBox(-0.5F, -0.1994F, -1.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 83).addBox(1.95F, -0.1994F, -1.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 80).addBox(1.95F, -0.1994F, -0.7723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.225F, 1.7139F, -1.3583F, 2.6616F, 0.0F, 0.0F));

		PartDefinition Cranium_r8 = Skull.addOrReplaceChild("Cranium_r8", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(39, 74).addBox(1.95F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.225F, 0.9139F, -1.0333F, -1.6581F, 0.0F, 0.0F));

		PartDefinition Cranium_r9 = Skull.addOrReplaceChild("Cranium_r9", CubeListBuilder.create().texOffs(46, 74).mirror().addBox(-0.5F, -0.7997F, -0.2192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(46, 74).addBox(1.95F, -0.7997F, -0.2192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.225F, 1.7139F, -0.0583F, 2.0508F, 0.0F, 0.0F));

		PartDefinition Cranium_r10 = Skull.addOrReplaceChild("Cranium_r10", CubeListBuilder.create().texOffs(8, 88).mirror().addBox(-0.5F, -0.7745F, -0.1661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 3).mirror().addBox(-0.5F, -1.0245F, 0.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(89, 3).addBox(1.95F, -1.0245F, 0.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(8, 88).addBox(1.95F, -0.7745F, -0.1661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.225F, 0.6639F, -0.6333F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Cranium_r11 = Skull.addOrReplaceChild("Cranium_r11", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(-0.525F, -0.2131F, -0.1868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 65).mirror().addBox(-0.525F, 0.0619F, 0.4132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 62).mirror().addBox(-0.525F, 0.0619F, -0.1868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(87, 65).addBox(1.925F, 0.0619F, 0.4132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 62).addBox(1.925F, 0.0619F, -0.1868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(87, 59).addBox(1.925F, -0.2131F, -0.1868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, -0.7093F, -2.4357F, -1.0428F, 0.0F, 0.0F));

		PartDefinition Cranium_r12 = Skull.addOrReplaceChild("Cranium_r12", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.5F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(89, 6).addBox(1.95F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.225F, -0.0417F, -0.883F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Cranium_r13 = Skull.addOrReplaceChild("Cranium_r13", CubeListBuilder.create().texOffs(87, 56).mirror().addBox(-0.525F, -0.2127F, -0.1959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(87, 56).addBox(1.925F, -0.2127F, -0.1959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2F, -0.7343F, -1.8357F, -1.5141F, 0.0F, 0.0F));

		PartDefinition Cranium_r14 = Skull.addOrReplaceChild("Cranium_r14", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-0.525F, -0.2089F, -0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(54, 87).addBox(1.925F, -0.2089F, -0.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, -0.2093F, -1.5357F, -2.57F, 0.0F, 0.0F));

		PartDefinition Cranium_r15 = Skull.addOrReplaceChild("Cranium_r15", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(-0.525F, -0.2159F, -1.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 45).mirror().addBox(-0.525F, -0.2159F, -0.8087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(49, 87).addBox(1.925F, -0.2159F, -1.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 45).addBox(1.925F, -0.2159F, -0.8087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2F, 0.6157F, -1.9107F, -1.9897F, 0.0F, 0.0F));

		PartDefinition Cranium_r16 = Skull.addOrReplaceChild("Cranium_r16", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(87, 68).addBox(1.95F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.225F, 0.5354F, -2.3603F, -1.2174F, 0.0F, 0.0F));

		PartDefinition Cranium_r17 = Skull.addOrReplaceChild("Cranium_r17", CubeListBuilder.create().texOffs(42, 78).addBox(-1.0F, -0.0077F, -0.0091F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.65F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Cranium_r18 = Skull.addOrReplaceChild("Cranium_r18", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -0.0025F, 0.0071F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -1.95F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Cranium_r19 = Skull.addOrReplaceChild("Cranium_r19", CubeListBuilder.create().texOffs(52, 65).addBox(-1.0F, -0.0069F, -1.3431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 69).addBox(-1.0F, -0.0069F, -0.9431F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Cranium_r20 = Skull.addOrReplaceChild("Cranium_r20", CubeListBuilder.create().texOffs(16, 53).addBox(-1.0F, -1.0F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Jaw = Skull.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.35F, 0.55F, 0.48F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r1 = Jaw.addOrReplaceChild("DentaryProximalVentral_r1", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.5F, -1.254F, 0.0759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)).mirror(false)
				.texOffs(0, 72).addBox(-0.9F, -1.254F, 0.0759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(1.7F, 1.8027F, -4.7993F, -0.096F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r2 = Jaw.addOrReplaceChild("DentaryProximalVentral_r2", CubeListBuilder.create().texOffs(36, 87).mirror().addBox(-2.0F, 0.0595F, -1.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(31, 87).mirror().addBox(-1.9F, 0.0595F, -1.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false)
				.texOffs(26, 87).mirror().addBox(-1.9F, -0.0155F, -1.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false)
				.texOffs(21, 87).mirror().addBox(-2.0F, -0.0155F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false)
				.texOffs(36, 87).addBox(-1.0F, 0.0595F, -1.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(31, 87).addBox(-1.1F, 0.0595F, -1.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(26, 87).addBox(-1.1F, -0.0155F, -1.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.026F))
				.texOffs(21, 87).addBox(-1.0F, -0.0155F, -0.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.5F, 0.7277F, -8.1493F, -0.0829F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r3 = Jaw.addOrReplaceChild("DentaryProximalVentral_r3", CubeListBuilder.create().texOffs(91, 86).mirror().addBox(-0.5F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 91).mirror().addBox(-0.4F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 86).addBox(1.5F, -0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 91).addBox(1.4F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7389F, -6.5198F, 0.1353F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r4 = Jaw.addOrReplaceChild("DentaryProximalVentral_r4", CubeListBuilder.create().texOffs(6, 91).mirror().addBox(-2.0F, -0.6155F, -0.3748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 89).mirror().addBox(-2.0F, -0.3155F, -1.7748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 91).addBox(-0.8F, -0.6155F, -0.3748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 89).addBox(-0.8F, -0.3155F, -1.7748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.7277F, -8.0493F, -0.0829F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r5 = Jaw.addOrReplaceChild("DentaryProximalVentral_r5", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-2.0F, -0.0336F, -2.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(73, 42).addBox(-1.0F, -0.0336F, -2.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5F, 0.5777F, -6.5493F, 0.1047F, 0.0F, 0.0F));

		PartDefinition DentaryProximalVentral_r6 = Jaw.addOrReplaceChild("DentaryProximalVentral_r6", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-2.0F, -1.3987F, -1.5216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(68, 70).addBox(-0.4F, -1.3987F, -1.5216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.2F, 1.9027F, -4.9993F, 0.0262F, 0.0F, 0.0F));

		PartDefinition DentaryProximalDorsal_r1 = Jaw.addOrReplaceChild("DentaryProximalDorsal_r1", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-2.0F, -0.0384F, -1.873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(70, 59).addBox(-0.4F, -0.0384F, -1.873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.2F, 0.1027F, -5.0243F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Angular_Surangular_r1 = Jaw.addOrReplaceChild("Angular_Surangular_r1", CubeListBuilder.create().texOffs(16, 87).mirror().addBox(-0.5F, 0.275F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(3, 87).mirror().addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(16, 87).addBox(1.3F, 0.275F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(3, 87).addBox(1.3F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4F, 0.3631F, -2.5328F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Angular_Surangular_r2 = Jaw.addOrReplaceChild("Angular_Surangular_r2", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-0.5F, -0.0114F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(89, 12).addBox(1.1F, -0.0114F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, -0.0857F, -4.0575F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Angular_Surangular_r3 = Jaw.addOrReplaceChild("Angular_Surangular_r3", CubeListBuilder.create().texOffs(41, 87).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(41, 87).addBox(1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3F, 0.3893F, -3.5325F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Angular_Surangular_r4 = Jaw.addOrReplaceChild("Angular_Surangular_r4", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.5F, -1.128F, -0.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false)
				.texOffs(60, 71).mirror().addBox(-0.5F, -1.128F, -1.8687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(87, 0).addBox(1.3F, -1.128F, -0.2687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F))
				.texOffs(60, 71).addBox(1.3F, -1.128F, -1.8687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.4F, 0.8967F, -0.1925F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Cranium_r21 = Jaw.addOrReplaceChild("Cranium_r21", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-0.62F, -2.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 64).addBox(1.62F, -2.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.879F, -3.9917F, -1.4399F, 0.0F, 0.0F));

		PartDefinition Angular_Surangular_r5 = Jaw.addOrReplaceChild("Angular_Surangular_r5", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-0.5F, -0.011F, 0.0225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 26).addBox(1.3F, -0.011F, 0.0225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.2223F, -2.4743F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Monolophosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.357F, 5.6998F, -0.0699F, 0.0435F, -0.003F));

		PartDefinition CaudalProximal_r2 = Tail1.addOrReplaceChild("CaudalProximal_r2", CubeListBuilder.create().texOffs(68, 89).addBox(-0.5F, -1.6507F, -0.0055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.1171F, 7.9942F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r3 = Tail1.addOrReplaceChild("CaudalProximal_r3", CubeListBuilder.create().texOffs(65, 89).addBox(-0.5F, -1.838F, -0.0074F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.1171F, 5.9942F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r4 = Tail1.addOrReplaceChild("CaudalProximal_r4", CubeListBuilder.create().texOffs(62, 89).addBox(-0.5F, -1.9253F, -0.0049F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.2171F, 3.9942F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r5 = Tail1.addOrReplaceChild("CaudalProximal_r5", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -2.1128F, 0.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4171F, 1.9942F, -0.1745F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r6 = Tail1.addOrReplaceChild("CaudalProximal_r6", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4171F, -0.0058F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r7 = Tail1.addOrReplaceChild("CaudalProximal_r7", CubeListBuilder.create().texOffs(68, 65).addBox(0.0F, -0.5F, -2.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.3361F, 10.0419F, -0.8727F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r8 = Tail1.addOrReplaceChild("CaudalProximal_r8", CubeListBuilder.create().texOffs(68, 37).addBox(0.0F, -3.5F, 0.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 68).addBox(0.0F, -1.5F, -1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 54).addBox(0.0F, 0.5F, -3.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.255F, 3.8813F, -0.9599F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r9 = Tail1.addOrReplaceChild("CaudalProximal_r9", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4171F, -0.0058F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.2852F, 9.8962F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition CaudalMedioproximal_r1 = Tail2.addOrReplaceChild("CaudalMedioproximal_r1", CubeListBuilder.create().texOffs(23, 62).addBox(0.0F, -0.7492F, -0.0079F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6725F, 9.9324F, -0.0524F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r2 = Tail2.addOrReplaceChild("CaudalMedioproximal_r2", CubeListBuilder.create().texOffs(16, 84).addBox(0.0F, -0.8794F, -0.0056F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5725F, 7.9324F, -0.0524F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r3 = Tail2.addOrReplaceChild("CaudalMedioproximal_r3", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -1.2094F, 0.0037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2725F, 5.9324F, -0.0524F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r4 = Tail2.addOrReplaceChild("CaudalMedioproximal_r4", CubeListBuilder.create().texOffs(89, 75).addBox(0.0F, -1.3396F, 0.0024F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2725F, 3.9324F, -0.096F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r5 = Tail2.addOrReplaceChild("CaudalMedioproximal_r5", CubeListBuilder.create().texOffs(75, 89).addBox(0.0F, -1.4698F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2725F, 1.9324F, -0.1396F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r6 = Tail2.addOrReplaceChild("CaudalMedioproximal_r6", CubeListBuilder.create().texOffs(89, 71).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2725F, -0.0676F, -0.2269F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r10 = Tail2.addOrReplaceChild("CaudalProximal_r10", CubeListBuilder.create().texOffs(79, 30).addBox(0.0F, -10.5F, 5.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 46).addBox(0.0F, -8.5F, 4.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 36).addBox(0.0F, -6.5F, 2.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 69).addBox(0.0F, -4.5F, 0.9F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(68, 54).addBox(0.0F, -2.5F, -0.7F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0612F, 0.0376F, -0.8727F, 0.0F, 0.0F));

		PartDefinition CaudalMedioproximal_r7 = Tail2.addOrReplaceChild("CaudalMedioproximal_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2725F, -0.0676F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.1757F, 11.8114F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition CaudalMediodistal_r1 = Tail3.addOrReplaceChild("CaudalMediodistal_r1", CubeListBuilder.create().texOffs(90, 42).addBox(0.5F, -0.8705F, 1.9731F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 90).addBox(0.5F, -0.6705F, -0.0269F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1277F, 8.0099F, -0.2007F, 0.0F, 0.0F));

		PartDefinition CaudalMediodistal_r2 = Tail3.addOrReplaceChild("CaudalMediodistal_r2", CubeListBuilder.create().texOffs(87, 89).addBox(0.5F, -0.6105F, -0.0178F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0723F, 6.0099F, -0.2007F, 0.0F, 0.0F));

		PartDefinition CaudalMediodistal_r3 = Tail3.addOrReplaceChild("CaudalMediodistal_r3", CubeListBuilder.create().texOffs(84, 89).addBox(0.5F, -0.7502F, -0.0157F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1723F, 4.0099F, -0.2007F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r11 = Tail3.addOrReplaceChild("CaudalProximal_r11", CubeListBuilder.create().texOffs(40, 90).addBox(0.0F, -6.5F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 90).addBox(0.0F, -4.5F, 2.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 90).addBox(0.0F, -2.5F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 90).addBox(0.0F, -0.5F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.7458F, 2.6245F, -1.0908F, 0.0F, 0.0F));

		PartDefinition CaudalMediodistal_r4 = Tail3.addOrReplaceChild("CaudalMediodistal_r4", CubeListBuilder.create().texOffs(81, 89).addBox(0.5F, -0.6902F, -0.0067F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.3723F, 2.0099F, -0.1571F, 0.0F, 0.0F));

		PartDefinition CaudalMediodistal_r5 = Tail3.addOrReplaceChild("CaudalMediodistal_r5", CubeListBuilder.create().texOffs(89, 39).addBox(0.5F, -0.73F, -0.0045F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.4723F, 0.0099F, -0.1571F, 0.0F, 0.0F));

		PartDefinition CaudalMediodistal_r6 = Tail3.addOrReplaceChild("CaudalMediodistal_r6", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.5723F, -0.9901F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.6493F, 11.0355F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition CaudalDistal_r1 = Tail4.addOrReplaceChild("CaudalDistal_r1", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, -0.2F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 90).addBox(0.0F, -0.3F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 90).addBox(0.0F, -0.4F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 90).addBox(0.0F, -0.5F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 90).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.4003F, -0.1105F, -0.2705F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r12 = Tail4.addOrReplaceChild("CaudalProximal_r12", CubeListBuilder.create().texOffs(72, 34).addBox(0.0F, -8.5F, 4.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0964F, -8.411F, -1.0908F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.7997F, 10.1395F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition CaudalDistalmost_r1 = Tail5.addOrReplaceChild("CaudalDistalmost_r1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, 0.0F, -0.9F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, 1.05F, -0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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