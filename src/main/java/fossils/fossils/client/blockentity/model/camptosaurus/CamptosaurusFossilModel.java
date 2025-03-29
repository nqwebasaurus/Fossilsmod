package fossils.fossils.client.blockentity.model.camptosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamptosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Camptosaurus;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart OpposableL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart OpposableL2;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public CamptosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Camptosaurus = this.fossil.getChild("Camptosaurus");
		this.Tail1 = this.Camptosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.LegL = this.Camptosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Camptosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Body = this.Camptosaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.OpposableL = this.HandL.getChild("OpposableL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.OpposableL2 = this.HandL2.getChild("OpposableL2");
		this.Neck4 = this.Chest.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Camptosaurus = fossil.addOrReplaceChild("Camptosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, 0.0F));

		PartDefinition cube_r1 = Camptosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 81).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0071F, -2.1884F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Camptosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 29).addBox(0.0F, -3.7613F, -0.1874F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3071F, 3.1116F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Camptosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -3.6742F, -0.1577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4071F, 1.2116F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Camptosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 81).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0071F, -0.1884F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Camptosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 81).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4071F, -4.1884F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Camptosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 81).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5071F, -6.1884F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Camptosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(11, 54).mirror().addBox(-0.5F, -0.3174F, 0.0963F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.4357F, -4.6929F, -0.512F, 0.3924F, 0.0145F));

		PartDefinition cube_r8 = Camptosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(35, 41).mirror().addBox(-0.5521F, -0.3648F, -0.335F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.4357F, 0.1071F, -0.9638F, 0.3493F, 0.1429F));

		PartDefinition cube_r9 = Camptosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-0.5521F, -2.1287F, 5.9954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.4357F, 0.1071F, -1.243F, 0.3493F, 0.1429F));

		PartDefinition cube_r10 = Camptosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 78).mirror().addBox(-0.7733F, 7.1834F, 2.0162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.7128F, 0.1835F, 0.3229F, 0.0F, -0.0436F));

		PartDefinition cube_r11 = Camptosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-0.7733F, 0.5356F, 0.2851F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.7128F, 0.1835F, 0.6021F, 0.0F, -0.0436F));

		PartDefinition cube_r12 = Camptosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.5F, -1.8187F, -2.0047F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(16, 47).mirror().addBox(-0.5F, -0.8187F, -0.6047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(39, 16).mirror().addBox(-0.5F, -1.8187F, 0.5953F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.9128F, 0.1835F, -0.0087F, 0.0F, -0.6109F));

		PartDefinition cube_r13 = Camptosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(-0.5F, -0.4652F, -3.364F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.9128F, 0.1835F, -0.5847F, 0.0F, -0.6109F));

		PartDefinition cube_r14 = Camptosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-0.9438F, -0.3538F, -2.9226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.22F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.2581F, -6.1794F, -0.2746F, 0.2149F, -0.0238F));

		PartDefinition cube_r15 = Camptosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(-0.5F, -0.6175F, -3.2079F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.2581F, -2.7794F, 0.0785F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = Camptosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(-0.8785F, -1.0294F, -2.709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.1337F, -6.0722F, 0.2085F, 0.3018F, 0.0363F));

		PartDefinition cube_r17 = Camptosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.5F, -1.0323F, -2.8001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.1337F, -3.1722F, -0.0087F, 0.1309F, 0.0F));

		PartDefinition cube_r18 = Camptosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5F, -2.0455F, -0.9968F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(70, 0).addBox(5.5F, -2.0455F, -0.9968F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-3.0F, 0.8995F, 2.8152F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Camptosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(-0.5F, -0.0695F, 0.008F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 75).addBox(5.5F, -0.0695F, 0.008F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.0337F, 4.0278F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Camptosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 79).mirror().addBox(-0.5F, -1.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 0).addBox(5.5F, -1.0F, -3.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(61, 79).addBox(5.5F, -1.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-3.0F, -2.1337F, 0.5278F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Camptosaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 59).addBox(-0.1215F, -1.0294F, -2.709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.0F, -2.1337F, -6.0722F, 0.2085F, -0.3018F, -0.0363F));

		PartDefinition cube_r22 = Camptosaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5F, -1.0323F, -2.8001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.1337F, -3.1722F, -0.0087F, -0.1309F, 0.0F));

		PartDefinition cube_r23 = Camptosaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(77, 33).addBox(-0.0562F, -0.3538F, -2.9226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.22F)), PartPose.offsetAndRotation(3.0F, 1.2581F, -6.1794F, -0.2746F, -0.2149F, 0.0238F));

		PartDefinition cube_r24 = Camptosaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 71).addBox(-0.4479F, -2.1287F, 5.9954F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 4.4357F, 0.1071F, -1.243F, -0.3493F, -0.1429F));

		PartDefinition cube_r25 = Camptosaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 41).addBox(-0.4479F, -0.3648F, -0.335F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.0F, 4.4357F, 0.1071F, -0.9638F, -0.3493F, -0.1429F));

		PartDefinition cube_r26 = Camptosaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(11, 54).addBox(-0.5F, -0.3174F, 0.0963F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, 1.4357F, -4.6929F, -0.512F, -0.3924F, -0.0145F));

		PartDefinition cube_r27 = Camptosaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 73).addBox(-0.5F, -0.6175F, -3.2079F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(3.0F, 1.2581F, -2.7794F, 0.0785F, -0.1309F, 0.0F));

		PartDefinition cube_r28 = Camptosaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 47).addBox(-0.5F, -0.8187F, -0.6047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(76, 77).addBox(-0.5F, -1.8187F, -2.0047F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F))
				.texOffs(39, 16).addBox(-0.5F, -1.8187F, 0.5953F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1F, 2.9128F, 0.1835F, -0.0087F, 0.0F, 0.6109F));

		PartDefinition cube_r29 = Camptosaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 78).addBox(-0.2267F, 7.1834F, 2.0162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 3.7128F, 0.1835F, 0.3229F, 0.0F, 0.0436F));

		PartDefinition cube_r30 = Camptosaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 78).addBox(-0.2267F, 0.5356F, 0.2851F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.7128F, 0.1835F, 0.6021F, 0.0F, 0.0436F));

		PartDefinition cube_r31 = Camptosaurus.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 23).addBox(-0.5F, -0.4652F, -3.364F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.9128F, 0.1835F, -0.5847F, 0.0F, 0.6109F));

		PartDefinition cube_r32 = Camptosaurus.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 47).addBox(2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, -0.6355F, 0.3148F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Camptosaurus.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5759F, -6.7111F, -0.1878F, -0.0983F, -0.8838F));

		PartDefinition cube_r34 = Camptosaurus.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(7, 29).mirror().addBox(-1.905F, -0.4193F, -0.2895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3759F, -4.7111F, -0.1601F, -0.0645F, -0.8861F));

		PartDefinition cube_r35 = Camptosaurus.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 22).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3759F, -4.7111F, -0.1705F, 0.0361F, -0.5008F));

		PartDefinition cube_r36 = Camptosaurus.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5759F, -6.7111F, -0.2088F, 0.0151F, -0.5018F));

		PartDefinition cube_r37 = Camptosaurus.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(7, 29).addBox(0.905F, -0.4193F, -0.2895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3759F, -4.7111F, -0.1601F, 0.0645F, 0.8861F));

		PartDefinition cube_r38 = Camptosaurus.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(39, 22).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3759F, -4.7111F, -0.1705F, -0.0361F, 0.5008F));

		PartDefinition cube_r39 = Camptosaurus.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 58).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5759F, -6.7111F, -0.2088F, -0.0151F, 0.5018F));

		PartDefinition cube_r40 = Camptosaurus.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 29).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5759F, -6.7111F, -0.1878F, 0.0983F, 0.8838F));

		PartDefinition cube_r41 = Camptosaurus.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(32, 16).addBox(-0.5F, -1.2092F, -0.6091F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9897F, -7.5097F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail1 = Camptosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.1472F, -0.339F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.1F, -0.4378F, 0.0791F, -0.037F));

		PartDefinition cube_r42 = Tail1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 82).addBox(0.0F, -0.4618F, 0.8024F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 23).addBox(0.0F, -2.0855F, -0.7349F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6488F, 7.4856F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 85).addBox(0.0F, 0.5703F, 1.3745F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(0.0F, -1.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5528F, 2.161F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(24, 79).addBox(0.0F, -2.9996F, -0.5288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0913F, 9.2642F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(7, 81).addBox(0.0F, -3.2995F, -0.5393F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 7.2727F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 82).addBox(0.0F, -3.4996F, -0.534F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.096F, 5.2682F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(13, 5).addBox(0.0F, -3.9073F, -0.2446F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0483F, 2.9767F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(3, 55).addBox(0.0F, -3.7994F, -0.5445F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2006F, 1.28F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.3217F, -0.0194F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1528F, 9.561F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r49 = Tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 67).addBox(0.0F, -4.0997F, 3.4738F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2918F, 0.9025F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 20).addBox(0.0F, -0.8F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2768F, 11.8153F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(46, 53).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3031F, 9.6614F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(68, 74).addBox(0.0F, -4.9997F, 5.4738F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2918F, 0.6025F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 16).addBox(0.0F, -3.3997F, 1.4738F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2918F, 1.3025F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(86, 42).addBox(0.0F, -0.6978F, -0.4704F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3672F, 12.3793F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(58, 85).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7239F, 10.3488F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 85).addBox(0.0F, -0.5607F, 1.2113F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 0).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1945F, 6.3076F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(83, 45).addBox(0.0F, 2.4376F, 3.9887F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 82).addBox(0.0F, 0.974F, 2.4082F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.496F, -2.0754F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(84, 38).addBox(0.0F, -2.5997F, -0.5262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2918F, 1.7025F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.6272F, -0.3026F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.6217F, 12.7806F, 0.1965F, -0.2141F, -0.0423F));

		PartDefinition cube_r59 = Tail3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -1.45F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 18).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 0).addBox(0.0F, -0.45F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(0.0F, -0.05F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 34).addBox(0.0F, 0.15F, -5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4332F, 5.7557F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Tail3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 5).addBox(0.0F, 2.2468F, 8.5221F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 86).addBox(0.0F, 1.7331F, 6.5866F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 22).addBox(0.0F, 1.1217F, 4.6719F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 26).addBox(0.0F, 0.5102F, 2.7572F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 30).addBox(0.0F, -0.1012F, 0.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 34).addBox(0.0F, -0.9083F, -1.0307F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8236F, 1.8294F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3113F, 0.0311F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2272F, 12.4974F, 0.0928F, -0.3477F, -0.0317F));

		PartDefinition cube_r61 = Tail4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(39, 45).addBox(0.0F, 6.4819F, 17.9911F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 50).addBox(0.0F, 5.8015F, 16.1077F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 7).addBox(0.0F, 5.1211F, 14.2244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 59).addBox(0.0F, 4.4408F, 12.341F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 85).addBox(0.0F, 2.7604F, 10.4576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1395F, -10.6369F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1113F, 16.2311F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition LegL = Camptosaurus.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, -0.4622F, -1.4757F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -0.1F, -1.4F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r62 = LegL.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(69, 58).addBox(-2.0F, 3.5941F, 0.0317F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(72, 45).addBox(-2.0F, 0.0941F, 0.0317F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.9378F, -1.7757F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r63 = LegL.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -1.8F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.1527F, 0.2155F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r64 = LegL.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(57, 72).addBox(-2.0F, -0.5F, -0.1F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5378F, -1.3757F, -0.0698F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create().texOffs(34, 61).addBox(-1.523F, -0.0105F, -1.7564F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(5, 64).addBox(-1.5F, 2.7189F, -0.7564F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6378F, 1.0243F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r65 = KneeL.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -5.6F, -0.1F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 5.7189F, -0.2564F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r66 = KneeL.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(76, 64).addBox(-1.5F, 1.0F, -1.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7189F, 1.2436F, -0.3142F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create().texOffs(58, 61).addBox(-1.5F, -0.097F, -1.6092F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 13.5189F, 0.0436F, -0.7418F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(48, 31).addBox(-3.0F, -1.4F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.3996F, -0.8833F, -1.309F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(47, 21).addBox(-3.5F, -0.1F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 2.4F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LegL2 = Camptosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -0.4622F, -1.4757F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -0.1F, -1.4F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r67 = LegL2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(33, 69).addBox(-1.0F, 3.5941F, 0.0317F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 71).addBox(-1.0F, 0.0941F, 0.0317F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.9378F, -1.7757F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r68 = LegL2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 80).addBox(0.0F, -1.8F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.1527F, 0.2155F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r69 = LegL2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(72, 23).addBox(-1.0F, -0.5F, -0.1F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5378F, -1.3757F, -0.0698F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create().texOffs(61, 3).addBox(-0.477F, -0.0105F, -1.7564F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(63, 45).addBox(-0.5F, 2.7189F, -0.7564F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6378F, 1.0243F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r70 = KneeL2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 62).addBox(0.0F, -5.6F, -0.1F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 5.7189F, -0.2564F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r71 = KneeL2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(27, 75).addBox(-1.5F, 1.0F, -1.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7189F, 1.2436F, -0.3142F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create().texOffs(47, 61).addBox(-1.5F, -0.097F, -1.6092F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 13.5189F, 0.0436F, -1.0908F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -1.4F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.3996F, -0.8833F, -0.829F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(47, 14).addBox(-2.5F, -0.1F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.5F, 2.4F, 0.0F));

		PartDefinition Body = Camptosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -8.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, -0.2515F, 0.0213F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.181F, -6.6698F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(39, 81).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.507F, -0.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(16, 28).mirror().addBox(-5.3061F, -1.8156F, -0.2895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3759F, -2.2111F, -0.0937F, -0.0851F, -1.3218F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 9).mirror().addBox(-7.3061F, -1.8156F, -0.2895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2759F, -4.3111F, -0.0145F, 0.0715F, -1.1665F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-9.3061F, -1.8156F, -0.2895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0759F, -6.3111F, 0.0487F, 0.1965F, -1.1413F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-11.3061F, -1.8156F, -0.2895F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7241F, -8.0111F, 0.0987F, 0.299F, -1.1467F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 11).mirror().addBox(-12.3061F, -1.8156F, -0.2895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2241F, -10.0111F, 0.1351F, 0.398F, -1.1775F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(16, 18).mirror().addBox(-12.3061F, -1.8156F, -0.2895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -12.0111F, 0.1711F, 0.4978F, -1.214F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(65, 36).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -12.0111F, 0.4021F, 0.3455F, -0.6629F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2241F, -10.0111F, 0.3186F, 0.2771F, -0.6364F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7241F, -8.0111F, 0.2361F, 0.2096F, -0.613F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 45).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0759F, -6.3111F, 0.1409F, 0.1457F, -0.6122F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2759F, -4.3111F, 0.0233F, 0.0692F, -0.6415F));

		PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(34, 36).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3759F, -2.2111F, -0.1236F, -0.027F, -0.8005F));

		PartDefinition cube_r86 = Body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(34, 36).mirror().addBox(-2.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3759F, -0.2111F, -0.1846F, -0.0895F, -0.7969F));

		PartDefinition cube_r87 = Body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(43, 61).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3759F, -0.2111F, -0.2025F, 0.022F, -0.4145F));

		PartDefinition cube_r88 = Body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(43, 61).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3759F, -2.2111F, -0.1225F, 0.0571F, -0.4113F));

		PartDefinition cube_r89 = Body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2759F, -4.3111F, 0.0504F, 0.0894F, -0.2428F));

		PartDefinition cube_r90 = Body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0759F, -6.3111F, 0.1886F, 0.1144F, -0.212F));

		PartDefinition cube_r91 = Body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(69, 1).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7241F, -8.0111F, 0.3007F, 0.1368F, -0.2156F));

		PartDefinition cube_r92 = Body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2241F, -10.0111F, 0.4017F, 0.1683F, -0.2435F));

		PartDefinition cube_r93 = Body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-1.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8241F, -12.0111F, 0.503F, 0.2014F, -0.277F));

		PartDefinition cube_r94 = Body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(34, 36).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3759F, -0.2111F, -0.1846F, 0.0895F, 0.7969F));

		PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(43, 61).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3759F, -0.2111F, -0.2025F, -0.022F, 0.4145F));

		PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(43, 61).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3759F, -2.2111F, -0.1225F, -0.0571F, 0.4113F));

		PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(34, 36).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3759F, -2.2111F, -0.1236F, 0.027F, 0.8005F));

		PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(16, 28).addBox(2.3061F, -1.8156F, -0.2895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3759F, -2.2111F, -0.0937F, 0.0851F, 1.3218F));

		PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(19, 9).addBox(2.3061F, -1.8156F, -0.2895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2759F, -4.3111F, -0.0145F, -0.0715F, 1.1665F));

		PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(25, 54).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2759F, -4.3111F, 0.0233F, -0.0692F, 0.6415F));

		PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(20, 62).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2759F, -4.3111F, 0.0504F, -0.0894F, 0.2428F));

		PartDefinition cube_r102 = Body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(57, 45).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0759F, -6.3111F, 0.1409F, -0.1457F, 0.6122F));

		PartDefinition cube_r103 = Body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(61, 11).addBox(2.3061F, -1.8156F, -0.2895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0759F, -6.3111F, 0.0487F, -0.1965F, 1.1413F));

		PartDefinition cube_r104 = Body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 40).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0759F, -6.3111F, 0.1886F, -0.1144F, 0.212F));

		PartDefinition cube_r105 = Body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 1).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7241F, -8.0111F, 0.3007F, -0.1368F, 0.2156F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 14).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7241F, -8.0111F, 0.2361F, -0.2096F, 0.613F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(55, 38).addBox(2.3061F, -1.8156F, -0.2895F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7241F, -8.0111F, 0.0987F, -0.299F, 1.1467F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 70).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2241F, -10.0111F, 0.4017F, -0.1683F, 0.2435F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 0).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2241F, -10.0111F, 0.3186F, -0.2771F, 0.6364F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 11).addBox(2.3061F, -1.8156F, -0.2895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2241F, -10.0111F, 0.1351F, -0.398F, 1.1775F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(16, 18).addBox(2.3061F, -1.8156F, -0.2895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -12.0111F, 0.1711F, -0.4978F, 1.214F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(65, 36).addBox(0.905F, -0.4193F, -0.2895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -12.0111F, 0.4021F, -0.3455F, 0.6629F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 54).addBox(0.004F, -0.0406F, -0.3258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8241F, -12.0111F, 0.503F, -0.2014F, 0.277F));

		PartDefinition cube_r114 = Body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(28, 50).addBox(0.0F, -0.0552F, 0.1445F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.2F, -12.6F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(39, 81).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.207F, -2.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 84).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.907F, -4.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(49, 84).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.607F, -6.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 85).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.707F, -8.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 50).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.107F, -10.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(52, 84).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.693F, -12.0971F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8F, -12.3F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-0.7F, 0.025F, -0.4601F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 10.7414F, -1.0309F, -0.0069F, -0.616F, 0.228F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(13, 36).mirror().addBox(-0.7F, 0.025F, -0.4601F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 10.7414F, -1.0309F, 0.0766F, -0.7992F, 0.2203F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(23, 36).mirror().addBox(-0.7F, 0.025F, -0.4601F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 10.7414F, -1.0309F, 0.0649F, -0.6596F, 0.2246F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-0.7F, 0.025F, -0.4601F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 10.7414F, -1.0309F, 0.1579F, -0.8859F, 0.205F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.7F, 0.025F, -0.4601F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 10.7414F, -1.0309F, 0.3633F, -1.2068F, 0.2544F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-2.3F, 0.3496F, -0.4496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(7, 11).mirror().addBox(-3.3F, 0.3496F, -2.3496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(7, 11).addBox(-0.7F, 0.3496F, -2.3496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(69, 64).addBox(-0.7F, 0.3496F, -0.4496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 9.6F, -2.2F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 50).mirror().addBox(-0.5F, -3.6614F, -0.6413F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.7088F, -4.4672F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.371F, -0.9334F, -2.8138F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9993F, 6.5422F, -5.6534F, 1.2547F, -0.6205F, -0.593F));

		PartDefinition cube_r129 = Chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(16, 20).mirror().addBox(-0.5F, -1.3106F, -2.6554F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 4.6301F, -3.4503F, 0.9279F, -0.2608F, 0.134F));

		PartDefinition cube_r130 = Chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-0.4095F, -0.8471F, -0.1039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.3301F, -2.6503F, 0.8023F, -0.1707F, 0.2312F));

		PartDefinition cube_r131 = Chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 0).addBox(-0.3F, 0.025F, -0.4601F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 10.7414F, -1.0309F, -0.0069F, 0.616F, -0.228F));

		PartDefinition cube_r132 = Chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(23, 36).addBox(-0.3F, 0.025F, -0.4601F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 10.7414F, -1.0309F, 0.0649F, 0.6596F, -0.2246F));

		PartDefinition cube_r133 = Chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(13, 36).addBox(-0.3F, 0.025F, -0.4601F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 10.7414F, -1.0309F, 0.0766F, 0.7992F, -0.2203F));

		PartDefinition cube_r134 = Chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(52, 7).addBox(-0.3F, 0.025F, -0.4601F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 10.7414F, -1.0309F, 0.1579F, 0.8859F, -0.205F));

		PartDefinition cube_r135 = Chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 11).addBox(-0.3F, 0.025F, -0.4601F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 10.7414F, -1.0309F, 0.3633F, 1.2068F, -0.2544F));

		PartDefinition cube_r136 = Chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(-11.4724F, -1.7615F, -0.3865F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3241F, -1.1111F, 0.1808F, 0.5225F, -1.2267F));

		PartDefinition cube_r137 = Chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(-10.4724F, -1.7615F, -0.3865F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6241F, -2.8111F, 0.2165F, 0.6044F, -1.2076F));

		PartDefinition cube_r138 = Chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-9.4724F, -1.7615F, -0.3865F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0241F, -4.2111F, 0.1875F, 0.7429F, -1.2101F));

		PartDefinition cube_r139 = Chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(-7.4724F, -1.7615F, -0.3865F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6241F, -5.4111F, 0.1589F, 0.8776F, -1.2653F));

		PartDefinition cube_r140 = Chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(8, 75).mirror().addBox(-3.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6241F, -5.4111F, 0.6424F, 0.6632F, -0.5882F));

		PartDefinition cube_r141 = Chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-3.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0241F, -4.2111F, 0.5634F, 0.5436F, -0.5987F));

		PartDefinition cube_r142 = Chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(23, 73).mirror().addBox(-3.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6241F, -2.8111F, 0.4983F, 0.4156F, -0.6445F));

		PartDefinition cube_r143 = Chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-3.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3241F, -1.1111F, 0.4237F, 0.3622F, -0.6728F));

		PartDefinition cube_r144 = Chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-1.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3241F, -1.1111F, 0.5285F, 0.2093F, -0.2892F));

		PartDefinition cube_r145 = Chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(23, 75).mirror().addBox(-1.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6241F, -2.8111F, 0.6145F, 0.2334F, -0.2703F));

		PartDefinition cube_r146 = Chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(36, 75).mirror().addBox(-1.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0241F, -4.2111F, 0.7191F, 0.3314F, -0.2254F));

		PartDefinition cube_r147 = Chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(8, 77).mirror().addBox(-1.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6241F, -5.4111F, 0.8309F, 0.4193F, -0.2188F));

		PartDefinition cube_r148 = Chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(45, 41).addBox(2.4724F, -1.7615F, -0.3865F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3241F, -1.1111F, 0.1808F, -0.5225F, 1.2267F));

		PartDefinition cube_r149 = Chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(72, 52).addBox(1.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3241F, -1.1111F, 0.4237F, -0.3622F, 0.6728F));

		PartDefinition cube_r150 = Chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 32).addBox(0.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3241F, -1.1111F, 0.5285F, -0.2093F, 0.2892F));

		PartDefinition cube_r151 = Chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 75).addBox(0.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6241F, -2.8111F, 0.6145F, -0.2334F, 0.2703F));

		PartDefinition cube_r152 = Chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(23, 73).addBox(1.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6241F, -2.8111F, 0.4983F, -0.4156F, 0.6445F));

		PartDefinition cube_r153 = Chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(57, 43).addBox(2.4724F, -1.7615F, -0.3865F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6241F, -2.8111F, 0.2165F, -0.6044F, 1.2076F));

		PartDefinition cube_r154 = Chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(36, 75).addBox(0.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0241F, -4.2111F, 0.7191F, -0.3314F, 0.2254F));

		PartDefinition cube_r155 = Chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(74, 30).addBox(1.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0241F, -4.2111F, 0.5634F, -0.5436F, 0.5987F));

		PartDefinition cube_r156 = Chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(61, 56).addBox(2.4724F, -1.7615F, -0.3865F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0241F, -4.2111F, 0.1875F, -0.7429F, 1.2101F));

		PartDefinition cube_r157 = Chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(8, 77).addBox(0.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6241F, -5.4111F, 0.8309F, -0.4193F, 0.2188F));

		PartDefinition cube_r158 = Chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(8, 75).addBox(1.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6241F, -5.4111F, 0.6424F, -0.6632F, 0.5882F));

		PartDefinition cube_r159 = Chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(19, 11).addBox(2.4724F, -1.7615F, -0.3865F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6241F, -5.4111F, 0.1589F, -0.8776F, 1.2653F));

		PartDefinition cube_r160 = Chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5905F, -0.8471F, -0.1039F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 2.3301F, -2.6503F, 0.8023F, 0.1707F, -0.2312F));

		PartDefinition cube_r161 = Chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 34).addBox(-0.629F, -0.9334F, -2.8138F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9993F, 6.5422F, -5.6534F, 1.2547F, 0.6205F, 0.593F));

		PartDefinition cube_r162 = Chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5F, -1.3106F, -2.6554F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 4.6301F, -3.4503F, 0.9279F, 0.2608F, -0.134F));

		PartDefinition cube_r163 = Chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, -0.5679F, -8.7803F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2957F, 0.0961F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(70, 36).addBox(0.0F, -0.1954F, -0.0788F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9043F, -2.9039F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(84, 75).addBox(0.0F, -1.5F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5107F, -0.759F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 81).addBox(0.0F, -1.3F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5212F, -2.5437F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, -1.8F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 85).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6811F, -6.0855F, 0.2793F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(54, 79).addBox(-0.6F, 3.3996F, -0.2623F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 8.6F, -4.3F, 0.4728F, 0.0998F, -0.1434F));

		PartDefinition cube_r168 = ArmL.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(23, 36).addBox(-0.9F, -0.4636F, -1.2251F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.4F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition cube_r169 = ArmL.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(11, 47).addBox(-0.6F, -0.4985F, 0.0734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create().texOffs(46, 44).addBox(-1.0427F, -1.2082F, -5.8535F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(52, 53).addBox(-0.5427F, -2.2082F, -5.8535F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 7.2455F, 0.4442F, 0.5132F, 0.2151F, -0.0303F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(70, 13).addBox(-1.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6573F, -0.7082F, -5.8535F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r170 = HandL.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition OpposableL = HandL.addOrReplaceChild("OpposableL", CubeListBuilder.create().texOffs(53, 53).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create().texOffs(17, 79).addBox(-1.4F, 3.3996F, -0.2623F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 8.6F, -4.3F, 0.9528F, -0.0998F, 0.1434F));

		PartDefinition cube_r171 = ArmL2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(13, 36).addBox(-0.1F, -0.4636F, -1.2251F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.4F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r172 = ArmL2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 47).addBox(-0.4F, -0.4985F, 0.0734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create().texOffs(17, 45).addBox(-0.9573F, -1.2082F, -5.8535F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(37, 53).addBox(-0.4573F, -2.2082F, -5.8535F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 7.2455F, 0.4442F, 0.2951F, -0.2151F, 0.0303F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(32, 20).addBox(0.0F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6573F, -0.7082F, -5.8535F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r173 = HandL2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition OpposableL2 = HandL2.addOrReplaceChild("OpposableL2", CubeListBuilder.create().texOffs(24, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.2161F, -0.149F, -0.5947F));

		PartDefinition Neck4 = Chest.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -6.3F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r174 = Neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(62, 16).addBox(-0.5F, -0.0296F, -0.0247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.8739F, -4.5769F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(23, 85).addBox(0.0F, -2.6F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 17).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9486F, -3.1147F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-6.4724F, -1.7615F, -0.3865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5241F, -1.3111F, 0.0569F, 0.9469F, -1.3635F));

		PartDefinition cube_r177 = Neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-3.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5241F, -1.3111F, 0.6404F, 0.7564F, -0.6071F));

		PartDefinition cube_r178 = Neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(-1.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5241F, -1.3111F, 0.8678F, 0.5065F, -0.2198F));

		PartDefinition cube_r179 = Neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(74, 7).addBox(0.0583F, 0.1243F, -0.4251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5241F, -1.3111F, 0.8678F, -0.5065F, 0.2198F));

		PartDefinition cube_r180 = Neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 23).addBox(1.0219F, -0.2893F, -0.3865F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5241F, -1.3111F, 0.6404F, -0.7564F, 0.6071F));

		PartDefinition cube_r181 = Neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 27).addBox(2.4724F, -1.7615F, -0.3865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5241F, -1.3111F, 0.0569F, -0.9469F, 1.3635F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.3F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition cube_r182 = Neck3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(68, 74).addBox(-0.5F, -0.7348F, -0.1304F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3156F, -3.5699F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Neck3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, -1.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 38).addBox(0.0F, -1.5F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6252F, -1.7218F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4584F, -3.3099F, -0.0131F, 0.0434F, -0.0422F));

		PartDefinition cube_r184 = Neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 0).addBox(0.0F, -1.0108F, 4.9161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 41).addBox(0.0F, -1.0108F, 2.9161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 45).addBox(0.0F, -0.9108F, 0.9161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-0.5F, -0.1108F, -0.0839F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -5.069F, -2.9311F, -0.9861F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -2.9F, -0.1572F, 0.0431F, -0.0068F));

		PartDefinition cube_r185 = Neck1.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 7).addBox(0.0F, -1.0455F, 0.1847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 0).addBox(-0.5F, -0.6455F, -0.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0203F, -1.2957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.103F, -1.5206F, -0.2414F, 0.0876F, 0.0016F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-0.5602F, -0.1966F, -0.545F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9568F, -0.671F, -4.2909F, 0.6384F, -0.5393F, -0.2999F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(39, 31).mirror().addBox(-0.23F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(39, 31).addBox(1.03F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9F, 0.9358F, -4.7021F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-0.43F, 0.75F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(8, 0).mirror().addBox(-0.62F, 0.35F, -0.6651F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(57, 47).mirror().addBox(-0.65F, 0.75F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(57, 47).addBox(1.65F, 0.75F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(8, 0).addBox(1.62F, 0.35F, -0.6651F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 30).addBox(1.43F, 0.75F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(77, 12).addBox(-0.5F, 0.05F, -0.2651F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.4F, -3.5F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 81).addBox(1.8F, -0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.15F, -0.8091F, -1.2735F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 54).addBox(-0.4398F, -0.1966F, -0.545F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9568F, -0.671F, -4.2909F, 0.6384F, 0.5393F, 0.2999F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(79, 57).addBox(-2.0F, -0.0437F, -1.0322F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3F, -3.5F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(77, 7).addBox(-1.5F, -0.0276F, 0.051F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8465F, -1.8745F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(34, 38).mirror().addBox(-0.7F, -0.0782F, 0.2062F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -6.4F, 0.2281F, -0.1207F, -0.0192F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 38).addBox(0.7F, -0.0782F, 0.2062F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -6.4F, 0.2281F, 0.1207F, 0.0192F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(45, 43).addBox(-0.5F, 0.0414F, -0.0034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.5F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(82, 61).addBox(-1.0F, -0.0194F, -0.0019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.2F, -6.3F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(35, 7).addBox(-1.0F, -0.528F, -0.5699F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.1F, -6.9F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(32, 31).addBox(-1.0F, -0.0517F, -0.9492F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.7F, -7.7F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(69, 13).addBox(-1.0F, -0.0366F, -1.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.9F, -7.0F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(82, 70).addBox(-1.5F, 0.0353F, -0.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8F, -7.0F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, 0.0035F, -0.0627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 1.6F, -7.7F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 30).addBox(-1.5F, -0.08F, -0.006F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 1.1F, -6.9F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(1, 75).mirror().addBox(0.0F, 0.017F, 0.2698F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2F, -6.9F, 0.2461F, -0.1185F, -0.0297F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(1, 75).addBox(-1.0F, 0.017F, 0.2698F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2F, -6.9F, 0.2461F, 0.1185F, 0.0297F));

		PartDefinition cube_r205 = Head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(20, 67).addBox(-1.5F, -0.1F, -6.7F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -0.5F, -0.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-1.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 25).addBox(0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8636F, 0.1707F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(66, 68).addBox(-1.5F, -1.9711F, -0.1211F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.2844F, -2.716F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(32, 45).addBox(-1.0F, 0.0829F, -6.5013F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -0.2F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-1.5F, -0.2F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(77, 52).addBox(0.5F, -0.2F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.2981F, -1.3263F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-1.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(79, 41).addBox(0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.5171F, -2.6013F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-1.4448F, -0.0145F, -1.5662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5171F, -2.5013F, 0.2804F, -0.1207F, -0.0192F));

		PartDefinition cube_r211 = Jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 67).mirror().addBox(-1.076F, -0.0398F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1171F, -5.5013F, -0.0512F, -0.1207F, -0.0192F));

		PartDefinition cube_r212 = Jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-1.0F, -0.0782F, -0.2938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0829F, -6.1013F, 0.263F, -0.1207F, -0.0192F));

		PartDefinition cube_r213 = Jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(46, 53).mirror().addBox(-0.2593F, -0.1871F, -0.0393F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7408F, 0.2963F, -6.1131F, 0.0012F, -0.1207F, -0.0192F));

		PartDefinition cube_r214 = Jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8661F, 0.1958F, -4.7567F, 0.0273F, -0.1207F, -0.0192F));

		PartDefinition cube_r215 = Jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(28, 45).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8661F, 0.1958F, -4.7567F, 0.0273F, 0.1207F, 0.0192F));

		PartDefinition cube_r216 = Jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(46, 53).addBox(-0.7407F, -0.1871F, -0.0393F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7408F, 0.2963F, -6.1131F, 0.0012F, 0.1207F, 0.0192F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(9, 55).addBox(0.4448F, -0.0145F, -1.5662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.5171F, -2.5013F, 0.2804F, 0.1207F, 0.0192F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(29, 67).addBox(0.076F, -0.0398F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.1171F, -5.5013F, -0.0512F, 0.1207F, 0.0192F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(67, 58).addBox(0.0F, -0.0782F, -0.2938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.0829F, -6.1013F, 0.263F, 0.1207F, 0.0192F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(48, 7).addBox(-1.0F, -1.04F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.0829F, -6.6013F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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