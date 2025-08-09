package fossils.fossils.client.blockentity.model.heterodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HeterodontosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Heterodontosaurus;
	private final ModelPart bone2;
	private final ModelPart bone3;
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
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Chest;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Neck4;
	private final ModelPart head;
	private final ModelPart lefFace;
	private final ModelPart lefFace2;
	private final ModelPart jaw;

	public HeterodontosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Heterodontosaurus = this.fossil.getChild("Heterodontosaurus");
		this.bone2 = this.Heterodontosaurus.getChild("bone2");
		this.bone3 = this.Heterodontosaurus.getChild("bone3");
		this.LegL = this.Heterodontosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Heterodontosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Tail1 = this.Heterodontosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Body = this.Heterodontosaurus.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Chest = this.body2.getChild("Chest");
		this.bone = this.Chest.getChild("bone");
		this.bone4 = this.Chest.getChild("bone4");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Neck4 = this.Neck1.getChild("Neck4");
		this.head = this.Neck4.getChild("head");
		this.lefFace = this.head.getChild("lefFace");
		this.lefFace2 = this.head.getChild("lefFace2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Heterodontosaurus = fossil.addOrReplaceChild("Heterodontosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.0F, 2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Heterodontosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(71, 53).addBox(-0.5F, -0.757F, 1.8476F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 23).mirror().addBox(-2.0F, 0.193F, 1.8476F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 23).addBox(0.0F, 0.193F, 1.8476F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 38).addBox(-1.0F, -0.307F, 0.8476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.5F, -1.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Heterodontosaurus.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.2F, -0.728F, -0.0446F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(62, 33).addBox(-0.5F, -0.675F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1703F, 2.1493F, 0.67F, -0.829F, -0.3491F, 0.0F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(62, 30).addBox(-0.5F, -0.675F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.1703F, 2.1493F, 0.67F, -1.0472F, -0.3491F, 0.0F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.7229F, -0.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.296F))
				.texOffs(22, 33).addBox(-0.5F, -0.2622F, -0.8525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 2.1413F, 0.202F, -0.48F, -0.3491F, 0.0F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(40, 43).addBox(-0.4F, -0.2474F, -1.5069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 1.8413F, -0.198F, -0.5785F, -0.2457F, 0.0914F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(46, 12).addBox(-0.4F, -0.1974F, -1.5819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.8413F, -0.198F, -0.3604F, -0.2457F, 0.0914F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(33, 43).addBox(-0.5F, -0.3511F, -0.4105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9092F, 3.863F, 2.7F, -0.7679F, -0.3491F, 0.0F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(12, 43).addBox(-0.5F, -0.3511F, -0.3105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5243F, 3.0303F, 1.6425F, -0.637F, -0.3491F, 0.0F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(33, 20).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8401F, 3.1933F, 2.5103F, -0.7425F, -0.1942F, -0.0267F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(31, 34).addBox(-1.0F, -6.507F, -0.4524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, 6.428F, -0.6554F, -0.1571F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(41, 39).addBox(-0.5F, -0.1178F, -0.1752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -0.0799F, 0.5115F, -0.288F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(25, 62).addBox(-0.5F, -0.1178F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -0.184F, -0.0794F, -0.1745F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8544F, 0.3405F, -0.48F, 0.0F, 0.0F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(5, 65).addBox(-0.3344F, -0.5996F, -0.8764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.9F, 0.7586F, -0.2721F, 0.0041F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(67, 48).addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1292F, 0.0445F, -1.4762F, 0.3491F, -0.0873F, 0.0F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(68, 6).addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0691F, -0.0771F, -0.7895F, 0.1745F, -0.0873F, 0.0F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(67, 45).addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0083F, -0.1381F, -0.0948F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition bone3 = Heterodontosaurus.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.2F, -0.728F, -0.0446F));

		PartDefinition basin_r18 = bone3.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-0.5F, -0.675F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1703F, 2.1493F, 0.67F, -0.829F, 0.3491F, 0.0F));

		PartDefinition basin_r19 = bone3.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-0.5F, -0.675F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.1703F, 2.1493F, 0.67F, -1.0472F, 0.3491F, 0.0F));

		PartDefinition basin_r20 = bone3.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.5F, -0.7229F, -0.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(22, 33).mirror().addBox(-0.5F, -0.2622F, -0.8525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1413F, 0.202F, -0.48F, 0.3491F, 0.0F));

		PartDefinition basin_r21 = bone3.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(-0.6F, -0.2474F, -1.5069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8413F, -0.198F, -0.5785F, 0.2457F, -0.0914F));

		PartDefinition basin_r22 = bone3.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-0.6F, -0.1974F, -1.5819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8413F, -0.198F, -0.3604F, 0.2457F, -0.0914F));

		PartDefinition basin_r23 = bone3.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(33, 43).mirror().addBox(-0.5F, -0.3511F, -0.4105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9092F, 3.863F, 2.7F, -0.7679F, 0.3491F, 0.0F));

		PartDefinition basin_r24 = bone3.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(12, 43).mirror().addBox(-0.5F, -0.3511F, -0.3105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5243F, 3.0303F, 1.6425F, -0.637F, 0.3491F, 0.0F));

		PartDefinition basin_r25 = bone3.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(33, 20).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8401F, 3.1933F, 2.5103F, -0.7425F, 0.1942F, 0.0267F));

		PartDefinition basin_r26 = bone3.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(31, 34).mirror().addBox(0.0F, -6.507F, -0.4524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.428F, -0.6554F, -0.1571F, 0.0F, 0.0F));

		PartDefinition basin_r27 = bone3.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(41, 39).mirror().addBox(-0.5F, -0.1178F, -0.1752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0799F, 0.5115F, -0.288F, 0.0F, 0.0F));

		PartDefinition basin_r28 = bone3.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(25, 62).mirror().addBox(-0.5F, -0.1178F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.184F, -0.0794F, -0.1745F, 0.0F, 0.0F));

		PartDefinition basin_r29 = bone3.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8544F, 0.3405F, -0.48F, 0.0F, 0.0F));

		PartDefinition basin_r30 = bone3.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-0.6656F, -0.5996F, -0.8764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -1.9F, 0.7586F, 0.2721F, -0.0041F));

		PartDefinition basin_r31 = bone3.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1292F, 0.0445F, -1.4762F, 0.3491F, 0.0873F, 0.0F));

		PartDefinition basin_r32 = bone3.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0691F, -0.0771F, -0.7895F, 0.1745F, 0.0873F, 0.0F));

		PartDefinition basin_r33 = bone3.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-0.5F, -0.1718F, -0.8966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0083F, -0.1381F, -0.0948F, 0.0873F, 0.0873F, 0.0F));

		PartDefinition LegL = Heterodontosaurus.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(10, 51).addBox(-0.5F, 2.0989F, -0.8998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(1.9F, 0.5065F, 0.3316F));

		PartDefinition cube_r1 = LegL.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 36).addBox(-0.5F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7197F, 0.3095F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r2 = LegL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5F, 0.05F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.003F, -0.162F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r3 = LegL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 47).addBox(-1.1F, -0.125F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.4101F, -0.0428F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LegL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.0514F, 0.1028F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r5 = LegL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 51).addBox(-1.1F, -0.1413F, -0.1429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, 3.9402F, -0.7568F, 0.0873F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.585F, 5.5996F, 0.049F, -0.0399F, 0.0F, 0.0F));

		PartDefinition cube_r6 = KneeL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 55).addBox(-0.5F, -3.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 17).addBox(-0.5F, -3.7F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 2.0458F, 2.8186F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r7 = KneeL.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 55).addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 0.0366F, 0.5552F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r8 = KneeL.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 43).addBox(-0.4F, 5.0953F, -0.5685F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(33, 25).addBox(-1.1F, 2.5953F, -0.4685F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8047F, -1.7701F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r9 = KneeL.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 3).addBox(-0.5F, -1.15F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 0).addBox(-0.5F, -1.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 0.6684F, 0.9524F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r10 = KneeL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 0.6684F, 0.9524F, 1.3701F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9732F, 6.5912F, -0.3687F, 0.0F, 0.0F));

		PartDefinition cube_r11 = MetatarsalL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(11, 22).addBox(-1.1F, -0.8F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.9599F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.734F, 1.9945F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = FootL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 29).addBox(-1.6F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1048F, -0.5624F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r13 = FootL2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 25).addBox(-1.6F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.325F, -0.3F, 0.9599F, 0.0F, 0.0F));

		PartDefinition LegL2 = Heterodontosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.5F, 2.0989F, -0.8998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.5065F, 0.3316F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r14 = LegL2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-0.5F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7197F, 0.3095F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r15 = LegL2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.5F, 0.05F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.003F, -0.162F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r16 = LegL2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 47).mirror().addBox(0.1F, -0.125F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4101F, -0.0428F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LegL2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0514F, 0.1028F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r18 = LegL2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(0.1F, -0.1413F, -0.1429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.9402F, -0.7568F, 0.0873F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.585F, 5.5996F, 0.049F, 1.0073F, 0.0F, 0.0F));

		PartDefinition cube_r19 = KneeL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-0.5F, -3.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 17).mirror().addBox(-0.5F, -3.7F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.0458F, 2.8186F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r20 = KneeL2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0366F, 0.5552F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r21 = KneeL2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.6F, 5.0953F, -0.5685F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(33, 25).mirror().addBox(0.1F, 2.5953F, -0.4685F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8047F, -1.7701F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r22 = KneeL2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 3).mirror().addBox(-0.5F, -1.15F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 0).mirror().addBox(-0.5F, -1.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.6684F, 0.9524F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r23 = KneeL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.6684F, 0.9524F, 1.3701F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9732F, 6.5912F, -1.765F, 0.0F, 0.0F));

		PartDefinition cube_r24 = MetatarsalL2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(11, 22).mirror().addBox(0.1F, -0.8F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.9599F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.734F, 1.9945F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r25 = FootL3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 29).mirror().addBox(-0.4F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1048F, -0.5624F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = FootL4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 25).mirror().addBox(-0.4F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.325F, -0.3F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tail1 = Heterodontosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, 2.675F, -0.0011F, -0.1745F, 0.0F));

		PartDefinition cube_r27 = Tail1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 71).addBox(0.0F, -0.5374F, 3.9142F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 71).addBox(0.0F, -0.5374F, 1.9142F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 71).addBox(0.0F, -0.5374F, -0.0858F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 8).addBox(-0.5F, -0.1374F, -0.0858F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Tail1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 34).addBox(0.0F, 0.6F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 71).addBox(0.0F, -0.6F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6006F, 0.2113F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Tail1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.8F, 0.3626F, -0.0858F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.1F, -0.1048F, 0.0347F, -0.0037F));

		PartDefinition cube_r30 = Tail1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 16).addBox(-0.2F, 0.3626F, -0.0858F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -0.1F, -0.1048F, -0.0347F, 0.0037F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(55, 70).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 70).addBox(0.0F, -0.5F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.625F, -0.0076F, -0.0873F, 0.0007F));

		PartDefinition cube_r31 = Tail2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(67, 70).addBox(0.0F, 3.9F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 66).addBox(0.0F, 2.8F, 3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4006F, -4.4137F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Tail2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-1.05F, 0.3F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r33 = Tail2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 39).addBox(0.05F, 0.3F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 3.9F, 0.055F, 0.0871F, 0.0048F));

		PartDefinition cube_r34 = Tail3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(61, 70).addBox(-0.5F, -0.5F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 60).addBox(-0.5F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.041F, -0.0028F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Tail3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, 5.9F, 9.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 69).addBox(0.0F, 4.9F, 7.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2756F, -8.3137F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(15, 15).addBox(-0.5F, -0.4573F, -0.0084F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F))
				.texOffs(70, 63).addBox(0.0F, -0.6573F, 0.9916F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 70).addBox(0.0F, -0.6573F, 2.9916F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.034F, 3.8972F, 0.0152F, 0.1309F, 0.002F));

		PartDefinition cube_r36 = Tail4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 70).addBox(0.0F, 8.1F, 13.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 17).addBox(0.0F, 6.9F, 11.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2416F, -12.2109F, 0.5498F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4573F, -0.0084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.95F, -0.1168F, 0.13F, -0.0152F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.4573F, -0.0084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.95F, -0.1335F, 0.1038F, -0.2321F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.4573F, -0.0084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.975F, -0.0896F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -0.4573F, -0.0084F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.95F, -0.065F, -0.2177F, 0.0141F));

		PartDefinition Body = Heterodontosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -0.5F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 56).addBox(0.0F, -0.5282F, -0.0536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5874F, -0.8385F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 72).addBox(0.0F, -0.5556F, -0.0516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6874F, -2.8385F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 8).addBox(1.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.855F, -2.035F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, -0.0068F, -0.052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6874F, -3.8385F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2354F, -0.1784F, 0.1553F, 0.1189F, -0.6629F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3354F, -2.2284F, 0.2807F, 0.1151F, -0.6545F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3354F, -2.2284F, 0.2168F, 0.213F, -1.0402F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 42).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2354F, -0.1784F, 0.1553F, -0.1189F, 0.6629F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 50).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3354F, -2.2284F, 0.2168F, -0.213F, 1.0402F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 21).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3354F, -2.2284F, 0.2807F, -0.1151F, 0.6545F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 72).addBox(0.0F, -0.604F, 0.0249F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 72).addBox(0.0F, -0.5726F, -0.9706F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0396F, -0.4034F, 0.4481F, 0.1729F, -0.6094F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 50).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0396F, -0.4034F, 0.3543F, 0.3281F, -0.9823F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(28, 20).mirror().addBox(-3.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0396F, -0.4034F, 0.1592F, 0.4528F, -1.4847F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3396F, -2.2034F, 0.5099F, 0.2073F, -0.5802F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(34, 50).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3396F, -2.2034F, 0.4014F, 0.3822F, -0.9485F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 46).mirror().addBox(-4.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3396F, -2.2034F, 0.1731F, 0.5215F, -1.4608F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 20).addBox(2.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0396F, -0.4034F, 0.1592F, -0.4528F, 1.4847F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 50).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0396F, -0.4034F, 0.3543F, -0.3281F, 0.9823F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 35).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0396F, -0.4034F, 0.4481F, -0.1729F, 0.6094F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 46).addBox(2.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3396F, -2.2034F, 0.1731F, -0.5215F, 1.4608F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 50).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3396F, -2.2034F, 0.4014F, -0.3822F, 0.9485F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(42, 23).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3396F, -2.2034F, 0.5099F, -0.2073F, 0.5802F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 28).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4602F, 4.9898F, -2.3014F, -0.1604F, -0.3516F, 0.7419F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4602F, 4.9898F, -2.3014F, -0.1454F, -0.6195F, 0.7845F));

		PartDefinition cube_r64 = Chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0896F, -3.0534F, 0.4553F, 0.4384F, -0.76F));

		PartDefinition cube_r65 = Chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 41).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0896F, -3.0534F, 0.2474F, 0.5758F, -1.1822F));

		PartDefinition cube_r66 = Chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-3.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0896F, -3.0534F, -0.085F, 0.6161F, -1.7628F));

		PartDefinition cube_r67 = Chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-4.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4146F, -1.1784F, 0.1123F, 0.5596F, -1.5823F));

		PartDefinition cube_r68 = Chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4146F, -1.1784F, 0.5069F, 0.2718F, -0.6711F));

		PartDefinition cube_r69 = Chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(-2.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4146F, -1.1784F, 0.3728F, 0.4412F, -1.0501F));

		PartDefinition cube_r70 = Chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(30, 70).addBox(2.4282F, -1.6854F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0896F, -3.0534F, -0.085F, -0.6161F, 1.7628F));

		PartDefinition cube_r71 = Chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 41).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0896F, -3.0534F, 0.2474F, -0.5758F, 1.1822F));

		PartDefinition cube_r72 = Chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(35, 70).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0896F, -3.0534F, 0.4553F, -0.4384F, 0.76F));

		PartDefinition cube_r73 = Chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(50, 48).addBox(0.9321F, -0.3737F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4146F, -1.1784F, 0.3728F, -0.4412F, 1.0501F));

		PartDefinition cube_r74 = Chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 25).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4146F, -1.1784F, 0.5069F, -0.2718F, 0.6711F));

		PartDefinition cube_r75 = Chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 37).addBox(2.4282F, -1.6854F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4146F, -1.1784F, 0.1123F, -0.5596F, 1.5823F));

		PartDefinition cube_r76 = Chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(52, 70).addBox(0.0F, -1.9F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 28).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.2F, -2.8F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 70).addBox(0.0F, -0.8587F, -0.9708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(22, 28).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4602F, 4.9898F, -2.3014F, -0.1604F, 0.3516F, -0.7419F));

		PartDefinition cube_r79 = Chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 47).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4602F, 4.9898F, -2.3014F, -0.1454F, 0.6195F, -0.7845F));

		PartDefinition cube_r80 = Chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 47).addBox(-0.5F, 0.7F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 3.9476F, -1.7064F, -0.5149F, 0.0F, 0.0F));

		PartDefinition bone = Chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.5F, 1.3708F, -2.2531F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.2208F, -0.9081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -1.2432F, 1.8286F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(57, 30).addBox(-0.5F, -0.8604F, -0.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7432F, 2.2286F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(56, 55).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.6682F, 1.6536F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(63, 39).addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.9395F, 2.6364F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(62, 45).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -0.7938F, 2.917F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(36, 58).addBox(-0.5F, -0.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, -0.7938F, 2.917F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(31, 58).addBox(-0.5F, -0.125F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(15, 58).addBox(-0.5F, -0.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.2202F, 2.4875F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(26, 43).addBox(-0.5F, -0.85F, -0.2746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.825F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 43).addBox(-0.5F, -0.8709F, -0.3145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.925F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(58, 0).addBox(-0.9F, -0.7093F, -0.3052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -1.6842F, 0.3491F, 0.2182F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(58, 12).addBox(-0.9F, -0.4129F, 0.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(10, 58).addBox(-0.9F, -0.4129F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -1.8151F, 0.3491F, 0.2182F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(58, 9).addBox(-0.9F, 0.5244F, -0.0041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -1.0734F, 0.3491F, 0.2182F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(58, 6).addBox(-0.9F, 0.3227F, -0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -1.5097F, 0.3491F, 0.2182F));

		PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(58, 3).addBox(-0.9F, 0.1911F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F))
				.texOffs(57, 49).addBox(-0.9F, -0.2089F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -0.9861F, 0.3491F, 0.2182F));

		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 46).addBox(-0.9F, -0.4914F, -0.8911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)), PartPose.offsetAndRotation(0.3F, 1.725F, -1.2F, -0.1134F, 0.3491F, 0.2182F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.275F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.3708F, -2.2531F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.5F, -0.2208F, -0.9081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2432F, 1.8286F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-0.5F, -0.8604F, -0.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7432F, 2.2286F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6682F, 1.6536F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9395F, 2.6364F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7938F, 2.917F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.5F, -0.25F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7938F, 2.917F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-0.5F, -0.125F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(15, 58).mirror().addBox(-0.5F, -0.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2202F, 2.4875F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 43).mirror().addBox(-0.5F, -0.85F, -0.2746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.825F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(-0.5F, -0.8709F, -0.3145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 0.925F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.1F, -0.7093F, -0.3052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -1.6842F, -0.3491F, -0.2182F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-0.1F, -0.4129F, 0.1996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(10, 58).mirror().addBox(-0.1F, -0.4129F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -1.8151F, -0.3491F, -0.2182F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-0.1F, 0.5244F, -0.0041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -1.0734F, -0.3491F, -0.2182F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-0.1F, 0.3227F, -0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -1.5097F, -0.3491F, -0.2182F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-0.1F, 0.1911F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)).mirror(false)
				.texOffs(57, 49).mirror().addBox(-0.1F, -0.2089F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -0.9861F, -0.3491F, -0.2182F));

		PartDefinition cube_r111 = bone4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-0.1F, -0.4914F, -0.8911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.725F, -1.2F, -0.1134F, -0.3491F, -0.2182F));

		PartDefinition cube_r112 = bone4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.5F, -0.275F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.8029F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.632F, 4.0882F, -3.2454F, 0.4677F, 0.3814F, -0.199F));

		PartDefinition cube_r113 = ArmL.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 22).addBox(1.4F, -0.7373F, -0.0701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.9F, 0.5F, -0.1F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r114 = ArmL.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 50).addBox(-0.5F, -1.65F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 49).addBox(-0.5F, -1.65F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0F, 1.1709F, 0.3547F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r115 = ArmL.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 55).addBox(-0.5F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1709F, 0.3547F, -0.2182F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0332F, 3.2551F, 2.784F, -0.9166F, 0.0038F, -0.0123F));

		PartDefinition cube_r116 = ElbowL.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(5, 47).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r117 = ElbowL.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(40, 33).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7493F, -1.3899F, -0.4276F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.6F));

		PartDefinition cube_r118 = HandL.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(28, 54).addBox(0.49F, -0.1F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, 0.0F, -0.9174F, 0.078F, 0.1946F));

		PartDefinition cube_r119 = HandL.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 37).addBox(0.5F, -0.1F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, 0.0F, -0.5683F, 0.078F, 0.1946F));

		PartDefinition cube_r120 = HandL.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(26, 71).addBox(0.5252F, 0.4F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, 0.1F, 0.6534F, 0.078F, 0.1946F));

		PartDefinition cube_r121 = HandL.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 51).addBox(0.52F, -0.1F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1F, 0.1F, -0.3065F, 0.078F, 0.1946F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.632F, 4.0882F, -3.2454F, 0.6208F, -0.1863F, 0.1246F));

		PartDefinition cube_r122 = ArmL2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-2.4F, -0.7373F, -0.0701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.5F, -0.1F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r123 = ArmL2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(29, 50).mirror().addBox(-0.5F, -1.65F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.5F, -1.65F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1709F, 0.3547F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r124 = ArmL2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(10, 55).mirror().addBox(-0.5F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1709F, 0.3547F, -0.2182F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0332F, 3.2551F, 2.784F, -0.9336F, -0.0023F, -0.1309F));

		PartDefinition cube_r125 = ElbowL2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(5, 47).mirror().addBox(-0.5F, -0.3F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r126 = ElbowL2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7493F, -1.3899F, -0.4276F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.6F));

		PartDefinition cube_r127 = HandL2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(28, 54).mirror().addBox(-0.49F, -0.1F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1F, 0.0F, -0.9174F, -0.078F, -0.1946F));

		PartDefinition cube_r128 = HandL2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-0.5F, -0.1F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1F, 0.0F, -0.5683F, -0.078F, -0.1946F));

		PartDefinition cube_r129 = HandL2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(26, 71).mirror().addBox(-0.5252F, 0.4F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1F, 0.1F, 0.6534F, -0.078F, -0.1946F));

		PartDefinition cube_r130 = HandL2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-0.52F, -0.1F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1F, 0.1F, -0.3065F, -0.078F, -0.1946F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.35F, -3.45F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Neck3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 70).addBox(0.0F, -0.5546F, -0.0577F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8999F, -1.6956F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Neck3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 43).addBox(-0.5F, 0.5465F, 0.8357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6999F, -2.3956F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Neck3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-1.9321F, -0.3737F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4854F, -1.4534F, 0.1031F, 0.6091F, -1.4811F));

		PartDefinition cube_r134 = Neck3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4854F, -1.4534F, 0.3491F, 0.5193F, -1.0273F));

		PartDefinition cube_r135 = Neck3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 70).addBox(0.9321F, -0.3737F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4854F, -1.4534F, 0.1031F, -0.6091F, 1.4811F));

		PartDefinition cube_r136 = Neck3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 27).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4854F, -1.4534F, 0.3491F, -0.5193F, 1.0273F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4499F, -1.7206F, 0.0596F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Neck2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(12, 72).addBox(0.0F, -0.4425F, 0.94F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 47).addBox(-0.5F, -0.1425F, 0.94F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -2.2F, -1.8F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Neck2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(51, 39).mirror().addBox(-2.0042F, 0.0114F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1855F, -1.2328F, 0.1305F, 0.476F, -1.2623F));

		PartDefinition cube_r139 = Neck2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(51, 39).addBox(0.0042F, 0.0114F, -0.7245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1855F, -1.2328F, 0.1305F, -0.476F, 1.2623F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -1.375F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Neck1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(43, 70).addBox(0.0F, -0.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 39).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9148F, -0.7114F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Neck1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3355F, -1.3578F, 0.5287F, 1.0739F, -0.9689F));

		PartDefinition cube_r142 = Neck1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 51).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3355F, -1.3578F, 0.5287F, -1.0739F, 0.9689F));

		PartDefinition Neck4 = Neck1.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Neck4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 39).addBox(-0.5F, -0.45F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 36).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(-0.3F, -1.1418F, -1.173F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Neck4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-1.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3855F, -1.5328F, 0.4801F, 1.0374F, -1.0112F));

		PartDefinition cube_r145 = Neck4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(10, 70).addBox(0.0042F, 0.0114F, -0.7245F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3855F, -1.5328F, 0.4801F, -1.0374F, 1.0112F));

		PartDefinition cube_r146 = Neck4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 68).addBox(-0.5F, -0.4736F, -0.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 68).addBox(-0.2F, 0.0264F, -1.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.9148F, -1.7114F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Neck4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(39, 13).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9148F, -0.7114F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = Neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, -1.171F, -1.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.017F))
				.texOffs(15, 55).addBox(-0.5F, -1.171F, -0.93F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, -0.5654F, -2.3655F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 29).addBox(-1.0F, 0.0F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, -1.146F, -1.155F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(29, 47).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(0.0F, -1.146F, -1.155F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(47, 43).addBox(-1.3F, 0.35F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(36, 47).addBox(-1.3F, 0.2F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 26).addBox(-1.3F, 0.2F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.3871F, -1.2186F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 64).addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.4108F, -5.2416F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.2066F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5956F, -5.0738F, 0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -0.2066F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0795F, -5.4285F, 0.9381F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(64, 42).addBox(-0.8806F, -0.3136F, -2.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, -0.1065F, -2.9213F, 0.4911F, 0.2168F, 0.025F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5F, -0.8918F, -0.8959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7289F, -3.7163F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(35, 64).addBox(-0.5F, -0.0918F, -0.8709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.3651F, -3.5068F, 0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(58, 39).addBox(-0.5F, -0.0931F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.8119F, -2.8839F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(23, 56).addBox(-0.5F, -0.0931F, -0.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0855F, -2.1321F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 39).addBox(-1.3F, -1.2F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.0527F, -1.0377F, -0.5672F, 0.0F, 0.0F));

		PartDefinition lefFace = head.addOrReplaceChild("lefFace", CubeListBuilder.create(), PartPose.offset(0.0736F, 1.6649F, -5.2388F));

		PartDefinition cube_r160 = lefFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(39, 5).addBox(-0.625F, -0.6F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 52).addBox(-0.625F, -1.6F, -2.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(39, 52).addBox(-0.625F, -1.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8264F, 0.1221F, 4.6435F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r161 = lefFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 53).addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.7014F, -1.5944F, 5.5061F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r162 = lefFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 5).addBox(-1.5F, -0.3F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.7014F, -2.4178F, 5.4022F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r163 = lefFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(47, 20).addBox(-1.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7014F, -2.4178F, 5.4022F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r164 = lefFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(47, 23).addBox(-1.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7014F, -2.0932F, 5.6359F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r165 = lefFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 12).addBox(-0.9F, -0.2136F, -0.7899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0514F, -2.494F, 3.9844F, 1.165F, 0.0F, 0.0F));

		PartDefinition cube_r166 = lefFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(63, 9).addBox(-0.9F, -0.8136F, -0.7648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.0514F, -2.5905F, 4.5766F, 1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r167 = lefFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(63, 6).addBox(-0.9F, -0.3136F, -0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0514F, -2.5919F, 4.6797F, 1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r168 = lefFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(31, 55).addBox(-0.9F, -0.8136F, -0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0514F, -1.9893F, 4.9195F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r169 = lefFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(41, 55).addBox(-0.9F, 0.1864F, -0.9399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0514F, -1.4098F, 3.299F, 2.2995F, 0.0F, 0.0F));

		PartDefinition cube_r170 = lefFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 65).addBox(-0.9F, -0.6386F, -0.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(64, 24).addBox(-0.9F, -0.3636F, -0.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.1514F, -0.9996F, 3.7793F, -1.2348F, 0.0F, 0.0F));

		PartDefinition cube_r171 = lefFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(64, 21).addBox(-0.9F, -0.2136F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1514F, -1.648F, 3.6916F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r172 = lefFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(63, 36).addBox(-0.9F, -0.2136F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.0514F, -1.9427F, 3.7476F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r173 = lefFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(44, 52).addBox(-0.675F, 0.0615F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 32).addBox(-0.85F, 0.0615F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, -1.3308F, 0.1745F, 0.0F));

		PartDefinition cube_r174 = lefFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(54, 24).addBox(-0.775F, -1.0966F, -1.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 0.0742F, 0.1745F, 0.0F));

		PartDefinition cube_r175 = lefFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(53, 12).addBox(-0.775F, 0.0F, -1.4034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, -0.9381F, 0.1745F, 0.0F));

		PartDefinition cube_r176 = lefFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 21).addBox(-0.775F, 0.6039F, -0.5267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, -1.7235F, 0.1745F, 0.0F));

		PartDefinition cube_r177 = lefFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(53, 9).addBox(-0.775F, 0.0701F, 0.3375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, -2.4566F, 0.1745F, 0.0F));

		PartDefinition cube_r178 = lefFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(54, 18).addBox(-0.775F, -0.7151F, 0.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 3.1285F, 0.1745F, 0.0F));

		PartDefinition cube_r179 = lefFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(54, 15).addBox(-0.775F, -0.8613F, -0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 2.2995F, 0.1745F, 0.0F));

		PartDefinition cube_r180 = lefFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(53, 6).addBox(-0.775F, -0.7453F, -0.3036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 1.2959F, 0.1745F, 0.0F));

		PartDefinition cube_r181 = lefFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(54, 27).addBox(-0.775F, -0.9862F, -0.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 0.8159F, 0.1745F, 0.0F));

		PartDefinition cube_r182 = lefFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(54, 43).addBox(-0.9F, -1.2031F, -0.755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, 0.3098F, 0.1745F, 0.0F));

		PartDefinition cube_r183 = lefFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.8264F, -0.1746F, 3.7938F, -2.3867F, 0.0F, 0.0F));

		PartDefinition cube_r184 = lefFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(53, 3).addBox(-0.5F, -0.325F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.8264F, -0.1746F, 3.7938F, -2.954F, 0.0F, 0.0F));

		PartDefinition cube_r185 = lefFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(49, 52).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.8264F, -0.1746F, 3.7938F, -1.9068F, 0.0F, 0.0F));

		PartDefinition cube_r186 = lefFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 52).addBox(-0.9F, -0.7878F, -0.8969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.9264F, -0.4628F, 3.0809F, -2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r187 = lefFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(47, 16).addBox(-0.8966F, 0.7164F, -1.4466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, -0.0325F, 0.2168F, 0.025F));

		PartDefinition cube_r188 = lefFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(10, 67).addBox(-0.6704F, -0.9095F, -0.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0456F, -1.9691F, 2.1023F, -1.2435F, 0.2154F, -0.0768F));

		PartDefinition cube_r189 = lefFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(66, 57).addBox(-0.6704F, -0.6248F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0456F, -1.9691F, 2.1023F, -1.1562F, 0.2154F, -0.0768F));

		PartDefinition cube_r190 = lefFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(66, 54).addBox(-0.6438F, -0.6447F, -0.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8956F, -1.8441F, 1.8773F, -1.1192F, 0.5062F, -0.0425F));

		PartDefinition cube_r191 = lefFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(51, 55).addBox(-0.8692F, -0.3792F, -0.5321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(46, 58).addBox(-0.8692F, -0.6792F, -0.5321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0648F, -0.7874F, 2.3148F, -1.7148F, 0.6807F, 0.0F));

		PartDefinition cube_r192 = lefFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(23, 52).addBox(-0.6564F, -1.6764F, -0.5059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1369F, -0.7706F, 2.6928F, -1.6902F, -0.3591F, 0.1331F));

		PartDefinition cube_r193 = lefFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(65, 64).addBox(-0.5217F, -0.9884F, -0.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 61).addBox(-0.5217F, -0.6884F, -0.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4956F, -1.4691F, 1.5773F, -0.9294F, 0.6807F, 0.0F));

		PartDefinition cube_r194 = lefFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(55, 64).addBox(-0.5466F, 0.6447F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(64, 51).addBox(-0.5466F, 0.8447F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, -0.7568F, 0.2168F, 0.025F));

		PartDefinition cube_r195 = lefFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 64).addBox(-0.5966F, 0.3806F, -0.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(64, 27).addBox(-0.5966F, 0.3806F, -0.2911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, -0.8877F, 0.2168F, 0.025F));

		PartDefinition cube_r196 = lefFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(15, 64).addBox(-0.9F, 0.0845F, 0.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9264F, -1.531F, 3.2882F, -1.2086F, 0.1745F, 0.0F));

		PartDefinition cube_r197 = lefFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(65, 67).addBox(-0.8716F, 0.4651F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, -0.1198F, 0.2168F, 0.025F));

		PartDefinition cube_r198 = lefFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 18).addBox(-0.8716F, 0.4458F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, -0.207F, 0.2168F, 0.025F));

		PartDefinition cube_r199 = lefFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(39, 9).addBox(-0.8716F, -0.5731F, -1.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, 0.622F, 0.2168F, 0.025F));

		PartDefinition cube_r200 = lefFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(40, 67).addBox(-0.8806F, -0.4386F, -2.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, 0.4911F, 0.2168F, 0.025F));

		PartDefinition cube_r201 = lefFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(20, 65).addBox(-0.8716F, 0.3088F, -1.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.7264F, -1.7715F, 2.3175F, 0.142F, 0.2168F, 0.025F));

		PartDefinition cube_r202 = lefFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 12).addBox(-0.7863F, -0.4557F, -0.7677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3014F, -0.7909F, 0.8524F, 0.4528F, -0.0519F, -0.0694F));

		PartDefinition cube_r203 = lefFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 18).addBox(-0.7863F, -0.7039F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3014F, -0.7909F, 0.8524F, 0.4266F, -0.0519F, -0.0694F));

		PartDefinition cube_r204 = lefFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(30, 67).addBox(-0.4051F, -0.5022F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F))
				.texOffs(67, 33).addBox(-0.4051F, -0.7022F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.1852F, -0.7789F, 0.252F, -0.7646F, 0.087F, -0.1587F));

		PartDefinition cube_r205 = lefFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 3).addBox(-0.4051F, -0.4173F, -0.5653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1852F, -0.7789F, 0.252F, -0.0316F, 0.087F, -0.1587F));

		PartDefinition cube_r206 = lefFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(5, 68).addBox(-0.4051F, -0.4419F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.1852F, -0.7789F, 0.252F, 0.7102F, 0.087F, -0.1587F));

		PartDefinition cube_r207 = lefFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 67).addBox(-0.4051F, -0.3458F, -0.5572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.1852F, -0.7789F, 0.252F, -0.4679F, 0.087F, -0.1587F));

		PartDefinition cube_r208 = lefFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(69, 15).addBox(-0.63F, -0.3806F, -0.5786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1852F, -0.7789F, 0.252F, 0.9284F, 0.087F, -0.1587F));

		PartDefinition cube_r209 = lefFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(68, 9).addBox(-0.75F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4216F, -0.0618F, 0.461F, 0.9155F, -0.0751F, -0.2365F));

		PartDefinition cube_r210 = lefFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(40, 64).addBox(-0.5073F, -0.621F, -0.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 67).addBox(-0.5073F, -0.321F, -0.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(60, 67).addBox(-0.483F, -0.315F, -0.4631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 67).addBox(-0.483F, -0.315F, -0.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1256F, -0.1167F, 0.1729F, 1.7279F, 0.384F, 0.0F));

		PartDefinition cube_r211 = lefFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 64).addBox(-0.4823F, -0.4138F, -0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1256F, -0.1167F, 0.1729F, 2.4171F, 0.5353F, 0.1757F));

		PartDefinition cube_r212 = lefFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 64).addBox(-0.5073F, -0.7638F, -0.4349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(45, 67).addBox(-0.483F, -0.6968F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1256F, -0.1167F, 0.1729F, 1.5533F, 0.384F, 0.0F));

		PartDefinition lefFace2 = head.addOrReplaceChild("lefFace2", CubeListBuilder.create(), PartPose.offset(-0.0736F, 1.6649F, -5.2388F));

		PartDefinition cube_r213 = lefFace2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(39, 5).mirror().addBox(-0.375F, -0.6F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 52).mirror().addBox(-0.375F, -1.6F, -2.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(39, 52).mirror().addBox(-0.375F, -1.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8264F, 0.1221F, 4.6435F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r214 = lefFace2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.7014F, -1.5944F, 5.5061F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r215 = lefFace2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-0.5F, -0.3F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.7014F, -2.4178F, 5.4022F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r216 = lefFace2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(47, 20).mirror().addBox(-0.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7014F, -2.4178F, 5.4022F, -0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r217 = lefFace2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(47, 23).mirror().addBox(-0.5F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7014F, -2.0932F, 5.6359F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r218 = lefFace2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.1F, -0.2136F, -0.7899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -2.494F, 3.9844F, 1.165F, 0.0F, 0.0F));

		PartDefinition cube_r219 = lefFace2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-0.1F, -0.8136F, -0.7648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -2.5905F, 4.5766F, 1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r220 = lefFace2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-0.1F, -0.3136F, -0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -2.5919F, 4.6797F, 1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r221 = lefFace2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(-0.1F, -0.8136F, -0.8148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -1.9893F, 4.9195F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r222 = lefFace2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(41, 55).mirror().addBox(-0.1F, 0.1864F, -0.9399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -1.4098F, 3.299F, 2.2995F, 0.0F, 0.0F));

		PartDefinition cube_r223 = lefFace2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(-0.1F, -0.6386F, -0.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(64, 24).mirror().addBox(-0.1F, -0.3636F, -0.6898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.1514F, -0.9996F, 3.7793F, -1.2348F, 0.0F, 0.0F));

		PartDefinition cube_r224 = lefFace2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-0.1F, -0.2136F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1514F, -1.648F, 3.6916F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r225 = lefFace2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(63, 36).mirror().addBox(-0.1F, -0.2136F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.0514F, -1.9427F, 3.7476F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r226 = lefFace2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.325F, 0.0615F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(52, 32).mirror().addBox(-0.15F, 0.0615F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, -1.3308F, -0.1745F, 0.0F));

		PartDefinition cube_r227 = lefFace2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(-0.225F, -1.0966F, -1.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 0.0742F, -0.1745F, 0.0F));

		PartDefinition cube_r228 = lefFace2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-0.225F, 0.0F, -1.4034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, -0.9381F, -0.1745F, 0.0F));

		PartDefinition cube_r229 = lefFace2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-0.225F, 0.6039F, -0.5267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, -1.7235F, -0.1745F, 0.0F));

		PartDefinition cube_r230 = lefFace2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(53, 9).mirror().addBox(-0.225F, 0.0701F, 0.3375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, -2.4566F, -0.1745F, 0.0F));

		PartDefinition cube_r231 = lefFace2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-0.225F, -0.7151F, 0.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 3.1285F, -0.1745F, 0.0F));

		PartDefinition cube_r232 = lefFace2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-0.225F, -0.8613F, -0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 2.2995F, -0.1745F, 0.0F));

		PartDefinition cube_r233 = lefFace2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-0.225F, -0.7453F, -0.3036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 1.2959F, -0.1745F, 0.0F));

		PartDefinition cube_r234 = lefFace2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.225F, -0.9862F, -0.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 0.8159F, -0.1745F, 0.0F));

		PartDefinition cube_r235 = lefFace2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-0.1F, -1.2031F, -0.755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, 0.3098F, -0.1745F, 0.0F));

		PartDefinition cube_r236 = lefFace2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.8264F, -0.1746F, 3.7938F, -2.3867F, 0.0F, 0.0F));

		PartDefinition cube_r237 = lefFace2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(-0.5F, -0.325F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.8264F, -0.1746F, 3.7938F, -2.954F, 0.0F, 0.0F));

		PartDefinition cube_r238 = lefFace2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(49, 52).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-0.8264F, -0.1746F, 3.7938F, -1.9068F, 0.0F, 0.0F));

		PartDefinition cube_r239 = lefFace2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(-0.1F, -0.7878F, -0.8969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -0.4628F, 3.0809F, -2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r240 = lefFace2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-0.1034F, 0.7164F, -1.4466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, -0.0325F, -0.2168F, -0.025F));

		PartDefinition cube_r241 = lefFace2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.3296F, -0.9095F, -0.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0456F, -1.9691F, 2.1023F, -1.2435F, -0.2154F, 0.0768F));

		PartDefinition cube_r242 = lefFace2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-0.3296F, -0.6248F, -0.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0456F, -1.9691F, 2.1023F, -1.1562F, -0.2154F, 0.0768F));

		PartDefinition cube_r243 = lefFace2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(66, 54).mirror().addBox(-0.3562F, -0.6447F, -0.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8956F, -1.8441F, 1.8773F, -1.1192F, -0.5062F, 0.0425F));

		PartDefinition cube_r244 = lefFace2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-0.1308F, -0.3792F, -0.5321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(46, 58).mirror().addBox(-0.1308F, -0.6792F, -0.5321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0648F, -0.7874F, 2.3148F, -1.7148F, -0.6807F, 0.0F));

		PartDefinition cube_r245 = lefFace2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(-0.3436F, -1.6764F, -0.5059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1369F, -0.7706F, 2.6928F, -1.6902F, 0.3591F, -0.1331F));

		PartDefinition cube_r246 = lefFace2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 64).mirror().addBox(-0.4783F, -0.9884F, -0.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 61).mirror().addBox(-0.4783F, -0.6884F, -0.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4956F, -1.4691F, 1.5773F, -0.9294F, -0.6807F, 0.0F));

		PartDefinition cube_r247 = lefFace2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(-0.4534F, 0.6447F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(64, 51).mirror().addBox(-0.4534F, 0.8447F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, -0.7568F, -0.2168F, -0.025F));

		PartDefinition cube_r248 = lefFace2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.4034F, 0.3806F, -0.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(64, 27).mirror().addBox(-0.4034F, 0.3806F, -0.2911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, -0.8877F, -0.2168F, -0.025F));

		PartDefinition cube_r249 = lefFace2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-0.1F, 0.0845F, 0.0286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9264F, -1.531F, 3.2882F, -1.2086F, -0.1745F, 0.0F));

		PartDefinition cube_r250 = lefFace2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-0.1284F, 0.4651F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, -0.1198F, -0.2168F, -0.025F));

		PartDefinition cube_r251 = lefFace2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-0.1284F, 0.4458F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, -0.207F, -0.2168F, -0.025F));

		PartDefinition cube_r252 = lefFace2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(39, 9).mirror().addBox(-0.1284F, -0.5731F, -1.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, 0.622F, -0.2168F, -0.025F));

		PartDefinition cube_r253 = lefFace2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-0.1194F, -0.4386F, -2.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, 0.4911F, -0.2168F, -0.025F));

		PartDefinition cube_r254 = lefFace2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-0.1284F, 0.3088F, -1.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.7264F, -1.7715F, 2.3175F, 0.142F, -0.2168F, -0.025F));

		PartDefinition cube_r255 = lefFace2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-0.2137F, -0.4557F, -0.7677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3014F, -0.7909F, 0.8524F, 0.4528F, 0.0519F, 0.0694F));

		PartDefinition cube_r256 = lefFace2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-0.2137F, -0.7039F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3014F, -0.7909F, 0.8524F, 0.4266F, 0.0519F, 0.0694F));

		PartDefinition cube_r257 = lefFace2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.595F, -0.5022F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false)
				.texOffs(67, 33).mirror().addBox(-0.595F, -0.7022F, -0.5344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.1852F, -0.7789F, 0.252F, -0.7646F, -0.087F, 0.1587F));

		PartDefinition cube_r258 = lefFace2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(-0.595F, -0.4173F, -0.5653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1852F, -0.7789F, 0.252F, -0.0316F, -0.087F, 0.1587F));

		PartDefinition cube_r259 = lefFace2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.595F, -0.4419F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-0.1852F, -0.7789F, 0.252F, 0.7102F, -0.087F, 0.1587F));

		PartDefinition cube_r260 = lefFace2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(-0.595F, -0.3458F, -0.5572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.1852F, -0.7789F, 0.252F, -0.4679F, -0.087F, 0.1587F));

		PartDefinition cube_r261 = lefFace2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-0.3699F, -0.3806F, -0.5786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1852F, -0.7789F, 0.252F, 0.9284F, -0.087F, 0.1587F));

		PartDefinition cube_r262 = lefFace2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(68, 9).mirror().addBox(-0.25F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4216F, -0.0618F, 0.461F, 0.9155F, 0.0751F, 0.2365F));

		PartDefinition cube_r263 = lefFace2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-0.4927F, -0.621F, -0.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 67).mirror().addBox(-0.4927F, -0.321F, -0.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(60, 67).mirror().addBox(-0.517F, -0.315F, -0.4631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(55, 67).mirror().addBox(-0.517F, -0.315F, -0.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1256F, -0.1167F, 0.1729F, 1.7279F, -0.384F, 0.0F));

		PartDefinition cube_r264 = lefFace2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.5177F, -0.4138F, -0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1256F, -0.1167F, 0.1729F, 2.4171F, -0.5353F, -0.1757F));

		PartDefinition cube_r265 = lefFace2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.4927F, -0.7638F, -0.4349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(45, 67).mirror().addBox(-0.517F, -0.6968F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1256F, -0.1167F, 0.1729F, 1.5533F, -0.384F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9597F, -0.677F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.2991F, -0.3001F, -0.0677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.2269F, -0.0436F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.2991F, 1.1449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(5, 59).mirror().addBox(-0.2991F, 0.9449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.2991F, 0.5449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -1.789F, -0.0436F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.2991F, 0.1692F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -1.8762F, -0.0436F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-0.2991F, -0.272F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -0.829F, -0.0436F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-0.2991F, -0.4181F, -2.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -0.1222F, -0.0436F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(59, 21).mirror().addBox(-0.2991F, -0.658F, -1.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(20, 59).mirror().addBox(-0.2991F, -0.658F, -1.8215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.4451F, -0.0436F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.2991F, -0.4583F, -2.0924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(59, 24).mirror().addBox(-0.2991F, -0.0833F, -2.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.0524F, -0.0436F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-0.2991F, -1.8952F, -1.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.7941F, -0.0436F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(59, 42).mirror().addBox(-0.7335F, -1.8573F, -1.718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.7941F, -0.288F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.7335F, -0.4058F, -2.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 59).mirror().addBox(-0.7335F, -0.0058F, -2.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.0087F, -0.288F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-0.7335F, -1.3898F, -2.6682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(15, 61).mirror().addBox(-0.7335F, -1.3898F, -2.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.5018F, -0.288F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(46, 8).mirror().addBox(-0.7335F, -0.8344F, -3.676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(46, 4).mirror().addBox(-0.7335F, -1.1344F, -3.676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.2269F, -0.288F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-0.7335F, -1.3949F, -2.2987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.3578F, -0.288F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.7335F, -0.607F, -3.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.1745F, -0.288F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-0.7335F, -0.5048F, -3.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.1396F, -0.288F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.3295F, 3.4315F, -0.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(61, 58).mirror().addBox(-0.3295F, 3.2315F, -0.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -1.4312F, -0.1658F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.5F, -0.4892F, -0.6373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3029F, 0.0288F, -3.6517F, -1.4114F, -0.1658F, -0.3407F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5F, -0.4892F, -0.3626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.3029F, 0.0288F, -3.6517F, -1.2543F, -0.1658F, -0.3407F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(61, 55).mirror().addBox(-0.3295F, 1.1783F, -3.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, -0.384F, -0.1658F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.3295F, -4.4388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(15, 67).mirror().addBox(-0.3295F, -4.2388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(60, 64).mirror().addBox(-0.3295F, -3.8388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 1.2305F, -0.1658F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.3295F, -0.2135F, -3.9807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.096F, -0.1658F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.7335F, -0.2108F, -3.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 61).mirror().addBox(-0.7335F, -0.2108F, -3.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.096F, -0.288F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.7335F, -0.0792F, -2.8198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.0436F, -0.288F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-0.2991F, -0.528F, -1.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.3054F, -0.0436F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-0.2991F, -0.3701F, -1.3874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.0713F, 0.2092F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(64, 15).addBox(-0.7009F, -0.3001F, -0.0677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.2269F, 0.0436F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(59, 15).addBox(-0.7009F, 1.1449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(5, 59).addBox(-0.7009F, 0.9449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 59).addBox(-0.7009F, 0.5449F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -1.789F, 0.0436F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(56, 58).addBox(-0.7009F, 0.1692F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -1.8762F, 0.0436F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 58).addBox(-0.7009F, -0.272F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -0.829F, 0.0436F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(45, 33).addBox(-0.7009F, -0.4181F, -2.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -0.1222F, 0.0436F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(59, 21).addBox(-0.7009F, -0.658F, -1.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(20, 59).addBox(-0.7009F, -0.658F, -1.8215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.4451F, 0.0436F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(46, 0).addBox(-0.7009F, -0.4583F, -2.0924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(59, 24).addBox(-0.7009F, -0.0833F, -2.0924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.0524F, 0.0436F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(59, 52).addBox(-0.7009F, -1.8952F, -1.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.7941F, 0.0436F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(59, 42).addBox(-0.2665F, -1.8573F, -1.718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.7941F, 0.288F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(59, 27).addBox(-0.2665F, -0.4058F, -2.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 59).addBox(-0.2665F, -0.0058F, -2.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.0087F, 0.288F, 0.0F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(30, 61).addBox(-0.2665F, -1.3898F, -2.6682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(15, 61).addBox(-0.2665F, -1.3898F, -2.4932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.5018F, 0.288F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(46, 8).addBox(-0.2665F, -0.8344F, -3.676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(46, 4).addBox(-0.2665F, -1.1344F, -3.676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.2269F, 0.288F, 0.0F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(20, 62).addBox(-0.2665F, -1.3949F, -2.2987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.3578F, 0.288F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(45, 61).addBox(-0.2665F, -0.607F, -3.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.1745F, 0.288F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(40, 61).addBox(-0.2665F, -0.5048F, -3.23F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.1396F, 0.288F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(60, 61).addBox(-0.6705F, 3.4315F, -0.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(61, 58).addBox(-0.6705F, 3.2315F, -0.6319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -1.4312F, 0.1658F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, -0.4892F, -0.6373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3029F, 0.0288F, -3.6517F, -1.4114F, 0.1658F, 0.3407F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.4892F, -0.3626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.3029F, 0.0288F, -3.6517F, -1.2543F, 0.1658F, 0.3407F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(61, 55).addBox(-0.6705F, 1.1783F, -3.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, -0.384F, 0.1658F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 65).addBox(-0.6705F, -4.4388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(15, 67).addBox(-0.6705F, -4.2388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(60, 64).addBox(-0.6705F, -3.8388F, -2.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 1.2305F, 0.1658F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(55, 61).addBox(-0.6705F, -0.2135F, -3.9807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.096F, 0.1658F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(50, 61).addBox(-0.2665F, -0.2108F, -3.6276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 61).addBox(-0.2665F, -0.2108F, -3.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.096F, 0.288F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(10, 61).addBox(-0.2665F, -0.0792F, -2.8198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.0436F, 0.288F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(59, 18).addBox(-0.7009F, -0.528F, -1.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.3054F, 0.0436F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(27, 39).addBox(-0.7009F, -0.3701F, -1.3874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 0.0713F, 0.2092F, 0.0F, 0.0436F, 0.0F));

		return LayerDefinition.create(meshdefinition, 74, 74);
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