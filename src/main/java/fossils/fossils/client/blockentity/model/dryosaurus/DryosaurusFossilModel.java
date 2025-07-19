package fossils.fossils.client.blockentity.model.dryosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DryosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Dryosaurus;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Chest;
	private final ModelPart chest2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart TarsalsL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart TarsalsL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;

	public DryosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Dryosaurus = this.fossil.getChild("Dryosaurus");
		this.Body = this.Dryosaurus.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Chest = this.body2.getChild("Chest");
		this.chest2 = this.Chest.getChild("chest2");
		this.Neck1 = this.chest2.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.bone2 = this.Chest.getChild("bone2");
		this.bone3 = this.Chest.getChild("bone3");
		this.Tail1 = this.Dryosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.bone = this.Dryosaurus.getChild("bone");
		this.bone4 = this.Dryosaurus.getChild("bone4");
		this.LegL = this.Dryosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.TarsalsL = this.KneeL.getChild("TarsalsL");
		this.FootL = this.TarsalsL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Dryosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.TarsalsL2 = this.KneeL2.getChild("TarsalsL2");
		this.FootL3 = this.TarsalsL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Dryosaurus = fossil.addOrReplaceChild("Dryosaurus", CubeListBuilder.create(), PartPose.offset(1.0F, -20.6F, -4.7F));

		PartDefinition Basin_r1 = Dryosaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(59, 89).addBox(-0.6F, -1.6154F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.3226F, 10.3662F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Dryosaurus.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(20, 89).addBox(-0.6F, -1.3984F, -0.0562F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7226F, 8.5662F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = Dryosaurus.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(56, 89).addBox(-0.6F, -1.2479F, -0.0167F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1227F, 6.5662F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Basin_r4 = Dryosaurus.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(39, 43).mirror().addBox(-1.0F, -0.1467F, 2.9177F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 43).addBox(1.0F, -0.1467F, 2.9177F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(32, 27).addBox(0.0F, -0.6467F, 1.9177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.1227F, 3.5662F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Body = Dryosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.925F, 5.615F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -0.6904F, -0.2914F, -0.1933F, -0.8227F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -2.6904F, -0.1751F, -0.1304F, -0.7193F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -2.6904F, -0.1235F, -0.2051F, -1.2667F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -4.6904F, -0.0986F, -0.0875F, -0.6578F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 5).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -4.6904F, -0.0803F, -0.129F, -1.2041F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 76).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -0.6904F, -0.2914F, 0.1933F, 0.8227F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 3).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -2.6904F, -0.1235F, 0.2051F, 1.2667F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -2.6904F, -0.1751F, 0.1304F, 0.7193F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(72, 5).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -4.6904F, -0.0803F, 0.129F, 1.2041F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 74).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -4.6904F, -0.0986F, 0.0875F, 0.6578F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 55).addBox(-0.1F, -1.1397F, -0.0093F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.36F, -1.04F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 89).addBox(-0.1F, -1.3048F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.36F, -3.04F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 51).addBox(-0.1F, -1.3699F, -0.0081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.26F, -5.04F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 43).addBox(-0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.0F, 0.24F, -9.04F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5368F, 0.04F, -5.0331F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 89).addBox(-0.1F, -1.235F, -0.0084F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, -0.3F, -2.0069F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -1.6573F, -0.0834F, -0.0788F, -0.5543F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -1.6573F, -0.0718F, -0.1137F, -1.1004F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, -0.0076F, -0.0353F, -0.5237F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, -0.0295F, -0.0372F, -1.0687F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, -0.007F, -0.047F, -1.5926F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 18).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -1.6573F, -0.0718F, 0.1137F, 1.1004F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -1.6573F, -0.0834F, 0.0788F, 0.5543F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(90, 39).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, -0.0076F, 0.0353F, 0.5237F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 16).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, -0.0295F, 0.0372F, 1.0687F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 64).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, -0.007F, 0.047F, 1.5926F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(89, 35).addBox(-0.1F, -1.1001F, -0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, -0.3F, -4.0069F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4632F, 0.2F, -4.0069F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 0.1343F, -3.7965F, 0.0087F, -0.0436F, -0.0004F));

		PartDefinition cube_r28 = Chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(89, 31).addBox(-0.1F, -1.09F, -0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2157F, -2.0723F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 91).addBox(-0.1F, -0.8448F, 0.0091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0157F, -4.0723F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.4428F, -0.1237F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, 0.5843F, -4.8723F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(23, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, 0.0679F, 0.0084F, -0.4899F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, 0.0124F, 0.0393F, -1.0337F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, -0.0089F, 0.0402F, -1.5577F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, 0.0761F, 0.1538F, -0.9927F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(13, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, 0.1814F, 0.0738F, -0.4503F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, -0.0118F, 0.1711F, -1.5231F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 41).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, -0.0089F, -0.0402F, 1.5577F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 14).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, 0.0124F, -0.0393F, 1.0337F));

		PartDefinition cube_r39 = Chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, 0.0679F, -0.0084F, 0.4899F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(58, 27).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, -0.0118F, -0.1711F, 1.5231F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, 0.1814F, -0.0738F, 0.4503F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 12).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, 0.0761F, -0.1538F, 0.9927F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0368F, 0.6633F, -4.8199F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 91).addBox(-0.1F, -0.9931F, 0.0738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 0.0625F, -1.1092F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 91).addBox(-0.1F, -0.8082F, -0.0308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 0.6625F, -2.9093F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 91).addBox(-0.1F, -0.645F, 0.0872F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 1.3625F, -4.9092F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6067F, 7.6595F, -4.1512F, 0.0257F, -0.4116F, 0.2629F));

		PartDefinition cube_r47 = chest2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6067F, 7.6595F, -4.1512F, 0.1694F, -0.4633F, 0.2533F));

		PartDefinition cube_r48 = chest2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(47, 30).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6067F, 7.6595F, -4.1512F, 0.3356F, -0.6046F, 0.2015F));

		PartDefinition cube_r49 = chest2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(3, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, 0.5729F, 0.2799F, -0.5547F));

		PartDefinition cube_r50 = chest2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(58, 37).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, 0.3165F, 0.5279F, -1.085F));

		PartDefinition cube_r51 = chest2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, -0.0231F, 0.6073F, -1.7021F));

		PartDefinition cube_r52 = chest2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, 0.3346F, 0.1593F, -0.4673F));

		PartDefinition cube_r53 = chest2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, 0.1648F, 0.3055F, -1.0073F));

		PartDefinition cube_r54 = chest2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 24).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, -0.0158F, 0.3456F, -1.5591F));

		PartDefinition cube_r55 = chest2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 59).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, 0.2624F, 0.4548F, -1.0058F));

		PartDefinition cube_r56 = chest2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, -0.0205F, 0.5201F, -1.5959F));

		PartDefinition cube_r57 = chest2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, 0.492F, 0.2411F, -0.4708F));

		PartDefinition cube_r58 = chest2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 68).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, -0.0231F, -0.6073F, 1.7021F));

		PartDefinition cube_r59 = chest2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 37).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, 0.3165F, -0.5279F, 1.085F));

		PartDefinition cube_r60 = chest2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(3, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, 0.5729F, -0.2799F, 0.5547F));

		PartDefinition cube_r61 = chest2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(36, 24).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, -0.0158F, -0.3456F, 1.5591F));

		PartDefinition cube_r62 = chest2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 10).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, 0.1648F, -0.3055F, 1.0073F));

		PartDefinition cube_r63 = chest2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(89, 68).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, 0.3346F, -0.1593F, 0.4673F));

		PartDefinition cube_r64 = chest2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(89, 59).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, 0.492F, -0.2411F, 0.4708F));

		PartDefinition cube_r65 = chest2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 56).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, -0.0205F, -0.5201F, 1.5959F));

		PartDefinition cube_r66 = chest2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 59).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, 0.2624F, -0.4548F, 1.0058F));

		PartDefinition cube_r67 = chest2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3197F, 7.6595F, -4.1512F, 0.0257F, 0.4116F, -0.2629F));

		PartDefinition cube_r68 = chest2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3197F, 7.6595F, -4.1512F, 0.1694F, 0.4633F, -0.2533F));

		PartDefinition cube_r69 = chest2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(47, 30).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3197F, 7.6595F, -4.1512F, 0.3356F, 0.6046F, -0.2015F));

		PartDefinition cube_r70 = chest2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(75, 41).addBox(-0.5F, -0.9848F, -0.0003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4632F, 8.0938F, -4.8897F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = chest2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 20).addBox(-0.5F, 1.3F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4632F, 6.1938F, -3.3897F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r72 = chest2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, -0.6485F, -0.2526F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4632F, 2.1625F, -5.3093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Neck1 = chest2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 1.9715F, -5.4715F, 0.4785F, -0.0696F, -0.0271F));

		PartDefinition cube_r73 = Neck1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(91, 47).addBox(-0.6F, -0.5826F, -0.0154F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.76F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Neck1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 58).addBox(-1.0F, -0.3643F, 0.9478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.76F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Neck1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(81, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0185F, -0.5694F, 0.2576F, 0.1169F, -0.6874F));

		PartDefinition cube_r76 = Neck1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0185F, -0.5694F, 0.1197F, 0.2299F, -1.2287F));

		PartDefinition cube_r77 = Neck1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 39).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0185F, -0.5694F, 0.1197F, -0.2299F, 1.2287F));

		PartDefinition cube_r78 = Neck1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0185F, -0.5694F, 0.2576F, -0.1169F, 0.6874F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1987F, -1.5094F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 44).addBox(-0.6F, -0.7569F, 2.8488F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 61).addBox(-1.0F, -0.4569F, 1.8488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.28F, -3.06F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.1948F, -0.81F, 0.2969F, 0.4686F, -0.947F));

		PartDefinition cube_r81 = Neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 70).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, -0.1948F, -0.81F, 0.2969F, -0.4686F, 0.947F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.894F, -1.3812F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Neck3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 41).addBox(-0.6F, -0.7708F, 1.9426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 61).addBox(-1.0F, -0.5708F, 0.9426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -1.9785F, -2.2949F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Neck3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(-0.9348F, 0.0314F, -0.8316F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4258F, -0.4788F, 0.1584F, 0.4212F, -1.1388F));

		PartDefinition cube_r84 = Neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(86, 90).addBox(-0.0652F, 0.0314F, -0.8316F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4258F, -0.4788F, 0.1584F, -0.4212F, 1.1388F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4135F, -1.3549F, -0.7392F, -0.1875F, 0.0536F));

		PartDefinition cube_r85 = Neck4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 91).addBox(-0.1F, -0.5148F, 0.5993F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 41).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.44F, -1.5F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Neck4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(91, 5).mirror().addBox(-0.9348F, -0.0436F, -0.6816F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0876F, -0.5239F, 0.2366F, 0.9882F, -1.2582F));

		PartDefinition cube_r87 = Neck4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(91, 5).addBox(-0.0652F, -0.0436F, -0.6816F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0876F, -0.5239F, 0.2366F, -0.9882F, 1.2582F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.252F, -1.8251F, 0.1584F, -0.1293F, -0.0206F));

		PartDefinition cube_r88 = Neck5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 15).addBox(-0.1F, -0.6148F, 0.5993F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 49).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, -0.6332F, -1.4482F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Neck5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(91, 7).mirror().addBox(-0.9348F, -0.0186F, -0.6066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0604F, -0.5988F, 0.3775F, 1.0056F, -1.2337F));

		PartDefinition cube_r90 = Neck5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(91, 7).addBox(-0.0652F, -0.0186F, -0.6066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0604F, -0.5988F, 0.3775F, -1.0056F, 1.2337F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5428F, -1.6839F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Neck6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(22, 74).addBox(-0.1F, -0.7148F, 0.5993F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 62).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.3106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neck6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(91, 9).mirror().addBox(-0.9348F, 0.0564F, -0.7066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0824F, -0.5149F, 0.1048F, 0.7938F, -1.3359F));

		PartDefinition cube_r93 = Neck6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 9).addBox(-0.0652F, 0.0564F, -0.7066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0824F, -0.5149F, 0.1048F, -0.7938F, 1.3359F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.8503F, -1.1764F, -0.0717F, 0.0052F, -0.0871F));

		PartDefinition cube_r94 = Head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.5F, -0.207F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 43).addBox(0.5F, -0.207F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 11).addBox(-0.5F, -0.082F, -0.1003F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5F, -1.0928F, -0.0223F, -0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(0.0F, -0.2751F, -0.7686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 74).addBox(1.0F, -0.2751F, -0.7686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 59).addBox(0.0F, -0.1501F, -0.8686F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -1.0461F, -0.0679F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(65, 20).addBox(-1.5F, -1.45F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.5F, 1.1231F, -1.2929F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(58, 86).addBox(-2.0F, -0.1956F, -0.7988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.7039F, -5.0179F, 1.4443F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 86).addBox(-2.0F, -0.1931F, -0.6912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.5F, 1.2539F, -4.8179F, 1.1476F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(86, 9).addBox(-2.0F, -0.1436F, -0.8574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.6289F, -4.2929F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(59, 77).addBox(-2.0F, -0.1053F, -0.9077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.5F, 0.1289F, -3.6679F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 73).addBox(-2.0F, -0.1031F, -0.9128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -0.3461F, -3.0179F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 72).addBox(-1.5F, -0.0942F, -0.8974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -0.7461F, -2.3429F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 65).addBox(-2.0F, -0.103F, -0.9117F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.9961F, -1.5679F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 62).addBox(-2.0F, -0.1209F, -0.9118F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0F, -1.1961F, -0.7929F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(12, 69).addBox(-1.5F, -0.425F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, -0.3972F, -0.1464F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 8).addBox(-1.5F, -1.0044F, 0.0956F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.5F, 0.6086F, -1.1266F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(69, 14).addBox(-1.5F, -0.9508F, -0.0621F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 1.5587F, -1.1266F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 17).addBox(-1.5F, -0.35F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.5F, 1.1586F, -0.5266F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(68, 41).addBox(-1.5F, -0.675F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5F, 1.1586F, -0.5266F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9354F, 0.8576F, -2.2052F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 78).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5535F, -0.5406F, -0.6109F, 0.6332F, 0.2123F, 0.0828F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(79, 28).addBox(-0.8908F, -0.7746F, -0.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2754F, 0.3667F, -0.7452F, 0.4534F, 0.2223F, 0.0561F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(49, 77).addBox(-0.9408F, -0.8973F, -0.8698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0764F, 0.871F, 0.0348F, 0.0244F, 0.2229F, 0.043F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(54, 77).addBox(-0.9897F, -0.1065F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1498F, 0.2043F, 0.0789F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 78).addBox(-0.9897F, -1.4062F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7606F, 0.2043F, 0.0789F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 72).addBox(-0.9897F, -0.7585F, -1.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4552F, 0.2043F, 0.0789F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(77, 19).addBox(-0.475F, -0.2625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7354F, 0.5214F, -2.3381F, -0.516F, 0.1223F, 0.0555F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(22, 77).addBox(-0.5088F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7066F, 0.4904F, -2.3228F, -0.5239F, 0.0767F, -0.0244F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 22).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.6822F, 0.2957F, -2.2126F, -0.5236F, 0.0789F, -0.0206F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(64, 77).addBox(-0.775F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 0.9999F, -2.0174F, 1.0549F, 0.1699F, -0.0341F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 81).addBox(-0.775F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 0.9999F, -2.0174F, 1.0458F, 0.1828F, -0.0825F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 73).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5803F, -0.6127F, 0.0155F, 0.5203F, 0.2813F, 0.1753F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 73).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7297F, -0.2957F, -0.5088F, 0.6066F, 0.1314F, 0.0842F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(79, 31).addBox(-0.8993F, -0.1012F, -0.8829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4047F, -0.7707F, -1.4088F, 0.7296F, 0.1379F, 0.0901F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(79, 34).addBox(-0.5026F, -0.2253F, -0.6504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3268F, -1.0568F, 0.8251F, -0.9207F, 0.0785F, 0.0131F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(20, 83).addBox(-0.308F, -0.0402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(10, 83).addBox(-0.308F, -0.2402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(74, 82).addBox(-0.308F, -0.4402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0163F, -0.9209F, -0.2374F, -1.1786F, 0.8358F, 0.049F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 82).addBox(-0.308F, -0.4202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(47, 83).addBox(-0.308F, -0.0202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(82, 72).addBox(-0.308F, -0.2202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0163F, -0.9209F, -0.2374F, -1.3619F, 0.8358F, 0.049F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 81).addBox(-0.3318F, -0.4608F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.0163F, -0.9209F, -0.2374F, -1.2073F, 0.357F, -0.0368F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(81, 12).addBox(-0.5667F, -0.9797F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(81, 9).addBox(-0.5667F, -0.7797F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2837F, -0.9209F, -0.0374F, -1.2396F, 0.0102F, -0.1601F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 6).addBox(-0.5825F, -0.5819F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(0.2837F, -0.9209F, -0.0374F, -1.2382F, 0.0927F, -0.1316F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(74, 79).addBox(-0.3253F, -0.6133F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0163F, -0.9209F, -0.2374F, -1.2245F, 0.1933F, -0.0998F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 69).addBox(-0.4125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 79).addBox(-0.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3963F, -0.6204F, 0.2094F, -1.3265F, 0.0785F, 0.0131F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(79, 66).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.374F, -1.1371F, 0.2451F, -1.5882F, 0.0218F, 0.0141F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(79, 59).addBox(-0.4998F, -0.138F, -0.7058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4039F, -0.5804F, -0.0396F, -2.4288F, 0.1361F, 0.0308F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(79, 56).addBox(-0.4952F, -0.4358F, -0.2629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4039F, -0.5804F, -0.0396F, 3.1166F, 0.1658F, 0.0569F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(79, 53).addBox(-0.4952F, -0.7709F, -0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4039F, -0.5804F, -0.0396F, 2.3748F, 0.1658F, 0.0569F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(79, 37).addBox(-0.4998F, -0.2784F, -0.915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4039F, -0.5804F, -0.0396F, 1.5894F, 0.1658F, 0.0569F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(37, 79).addBox(-0.5026F, -0.1747F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3617F, -0.7299F, 0.4354F, 0.8465F, 0.0785F, 0.0131F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(32, 79).addBox(-0.5026F, -0.4376F, -0.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3617F, -0.7299F, 0.4354F, 0.0611F, 0.0785F, 0.0131F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(80, 75).addBox(0.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(64, 80).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7104F, -1.5239F, 1.5557F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(59, 80).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -1.309F, 1.2184F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7104F, -0.9124F, 1.1662F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(49, 80).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7104F, -0.5185F, 1.2356F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 40).addBox(0.0F, 0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 80).addBox(0.0F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(10, 80).addBox(0.0F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -0.7866F, 1.6213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, -1.6044F, -0.1794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2104F, -0.249F, 1.0786F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(77, 63).addBox(-1.1435F, -0.3099F, -2.3719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(10, 77).addBox(-1.0935F, -0.2599F, -2.5219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2817F, 0.1174F, 0.0603F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(5, 78).addBox(0.5F, 0.0206F, -0.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3354F, 0.501F, 2.3286F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 44).addBox(0.5F, -0.6511F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(41, 76).addBox(0.8F, -0.6511F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.4854F, -1.2739F, 2.7036F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(76, 47).addBox(0.5F, -1.8294F, 0.4061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(36, 76).addBox(0.8F, -1.8294F, 0.4061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 78).addBox(0.65F, -0.2044F, -0.7689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4854F, 0.501F, 2.3286F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 81).addBox(-0.5F, -0.5593F, -1.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.577F, 0.7773F, -0.4487F, 0.1699F, 0.2152F, 0.0251F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, -0.5149F, -0.723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.577F, 0.7773F, -0.4487F, 0.0826F, 0.2152F, 0.0251F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(81, 15).addBox(-0.5F, -0.5157F, -0.204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.577F, 0.7773F, -0.4487F, -0.0047F, 0.2152F, 0.0251F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 81).addBox(-0.5F, -0.4085F, 0.2368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.577F, 0.7773F, -0.4487F, 0.2135F, 0.2152F, 0.0251F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(55, 73).addBox(-0.5F, -1.8824F, -0.698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4354F, 0.7155F, 0.6373F, 0.242F, 0.1271F, 0.0313F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(79, 3).addBox(-1.1435F, -1.5289F, -2.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8839F, 0.1174F, 0.0603F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9354F, 0.8576F, -2.2052F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5535F, -0.5406F, -0.6109F, 0.6332F, -0.2123F, -0.0828F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-0.1092F, -0.7746F, -0.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2754F, 0.3667F, -0.7452F, 0.4534F, -0.2223F, -0.0561F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(-0.0592F, -0.8973F, -0.8698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0764F, 0.871F, 0.0348F, 0.0244F, -0.2229F, -0.043F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.0103F, -0.1065F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1498F, -0.2043F, -0.0789F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 78).mirror().addBox(-0.0103F, -1.4062F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7606F, -0.2043F, -0.0789F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.0103F, -0.7585F, -1.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4552F, -0.2043F, -0.0789F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(77, 19).mirror().addBox(-0.525F, -0.2625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7354F, 0.5214F, -2.3381F, -0.516F, -0.1223F, -0.0555F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-0.4912F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7066F, 0.4904F, -2.3228F, -0.5239F, -0.0767F, 0.0244F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.6822F, 0.2957F, -2.2126F, -0.5236F, -0.0789F, 0.0206F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(64, 77).mirror().addBox(-0.225F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5521F, 0.9999F, -2.0174F, 1.0549F, -0.1699F, 0.0341F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.225F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5521F, 0.9999F, -2.0174F, 1.0458F, -0.1828F, 0.0825F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5803F, -0.6127F, 0.0155F, 0.5203F, -0.2813F, -0.1753F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7297F, -0.2957F, -0.5088F, 0.6066F, -0.1314F, -0.0842F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(79, 31).mirror().addBox(-0.1007F, -0.1012F, -0.8829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4047F, -0.7707F, -1.4088F, 0.7296F, -0.1379F, -0.0901F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-0.4974F, -0.2253F, -0.6504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3268F, -1.0568F, 0.8251F, -0.9207F, -0.0785F, -0.0131F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.692F, -0.0402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(10, 83).mirror().addBox(-0.692F, -0.2402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(74, 82).mirror().addBox(-0.692F, -0.4402F, -0.4754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0163F, -0.9209F, -0.2374F, -1.1786F, -0.8358F, -0.049F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(79, 82).mirror().addBox(-0.692F, -0.4202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(47, 83).mirror().addBox(-0.692F, -0.0202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(82, 72).mirror().addBox(-0.692F, -0.2202F, -0.4748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0163F, -0.9209F, -0.2374F, -1.3619F, -0.8358F, -0.049F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.6682F, -0.4608F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(0.0163F, -0.9209F, -0.2374F, -1.2073F, -0.357F, 0.0368F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.4333F, -0.9797F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(81, 9).mirror().addBox(-0.4333F, -0.7797F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2837F, -0.9209F, -0.0374F, -1.2396F, -0.0102F, 0.1601F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-0.4175F, -0.5819F, -0.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(-0.2837F, -0.9209F, -0.0374F, -1.2382F, -0.0927F, 0.1316F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.6747F, -0.6133F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0163F, -0.9209F, -0.2374F, -1.2245F, -0.1933F, 0.0998F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(79, 69).mirror().addBox(-0.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 79).mirror().addBox(-0.4125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3963F, -0.6204F, 0.2094F, -1.3265F, -0.0785F, -0.0131F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.374F, -1.1371F, 0.2451F, -1.5882F, -0.0218F, -0.0141F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-0.5002F, -0.138F, -0.7058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4039F, -0.5804F, -0.0396F, -2.4288F, -0.1361F, -0.0308F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-0.5048F, -0.4358F, -0.2629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4039F, -0.5804F, -0.0396F, 3.1166F, -0.1658F, -0.0569F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-0.5048F, -0.7709F, -0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4039F, -0.5804F, -0.0396F, 2.3748F, -0.1658F, -0.0569F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-0.5002F, -0.2784F, -0.915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4039F, -0.5804F, -0.0396F, 1.5894F, -0.1658F, -0.0569F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(-0.4974F, -0.1747F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3617F, -0.7299F, 0.4354F, 0.8465F, -0.0785F, -0.0131F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(32, 79).mirror().addBox(-0.4974F, -0.4376F, -0.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3617F, -0.7299F, 0.4354F, 0.0611F, -0.0785F, -0.0131F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-1.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(64, 80).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.5239F, 1.5557F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(59, 80).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.309F, 1.2184F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.9124F, 1.1662F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(49, 80).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.5185F, 1.2356F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(-1.0F, 0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 80).mirror().addBox(-1.0F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(10, 80).mirror().addBox(-1.0F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.7866F, 1.6213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-0.5F, -1.6044F, -0.1794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -0.249F, 1.0786F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(0.1435F, -0.3099F, -2.3719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(10, 77).mirror().addBox(0.0935F, -0.2599F, -2.5219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2817F, -0.1174F, -0.0603F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-1.5F, 0.0206F, -0.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3354F, 0.501F, 2.3286F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-1.5F, -0.6511F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(41, 76).mirror().addBox(-1.8F, -0.6511F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.4854F, -1.2739F, 2.7036F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-1.5F, -1.8294F, 0.4061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(36, 76).mirror().addBox(-1.8F, -1.8294F, 0.4061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-1.65F, -0.2044F, -0.7689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4854F, 0.501F, 2.3286F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-0.5F, -0.5593F, -1.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.577F, 0.7773F, -0.4487F, 0.1699F, -0.2152F, -0.0251F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.5F, -0.5149F, -0.723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.577F, 0.7773F, -0.4487F, 0.0826F, -0.2152F, -0.0251F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(-0.5F, -0.5157F, -0.204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.577F, 0.7773F, -0.4487F, -0.0047F, -0.2152F, -0.0251F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.5F, -0.4085F, 0.2368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.577F, 0.7773F, -0.4487F, 0.2135F, -0.2152F, -0.0251F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-0.5F, -1.8824F, -0.698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4354F, 0.7155F, 0.6373F, 0.242F, -0.1271F, -0.0313F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(0.1435F, -1.5289F, -2.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8839F, -0.1174F, -0.0603F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9387F, -0.2272F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-1.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(15, 84).mirror().addBox(-1.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(25, 84).addBox(-0.35F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(15, 84).addBox(-0.35F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.425F, 0.1343F, -0.4356F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-1.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 84).addBox(-0.35F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.425F, -0.7137F, -0.406F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(-1.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(84, 3).addBox(-0.35F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.425F, -0.7588F, -0.9792F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-1.5F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 83).mirror().addBox(-1.5F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(0, 84).addBox(-0.35F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 83).addBox(-0.35F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.425F, -0.2663F, -1.6096F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-0.2F, -0.5562F, -0.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, 0.2269F, -0.2443F, 0.0F));

		PartDefinition cube_r205 = Jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-0.2F, -0.6155F, -1.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.0611F, -0.2443F, 0.0F));

		PartDefinition cube_r206 = Jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-0.2F, -0.5484F, -1.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.1484F, -0.2443F, 0.0F));

		PartDefinition cube_r207 = Jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.2F, -0.7667F, -1.9617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, 0.0262F, -0.2443F, 0.0F));

		PartDefinition cube_r208 = Jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(86, 42).mirror().addBox(-0.7953F, -0.7149F, -0.6674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.125F, 0.0918F, -3.1272F, 0.1309F, -0.1484F, 0.0F));

		PartDefinition cube_r209 = Jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.7953F, -0.5222F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.125F, 0.0918F, -3.1272F, -0.0436F, -0.1484F, 0.0F));

		PartDefinition cube_r210 = Jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.7709F, -0.5404F, -0.7627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.0918F, -3.6272F, -0.4756F, -0.1134F, 0.0F));

		PartDefinition cube_r211 = Jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-0.7709F, -0.3294F, -1.0751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.0918F, -3.6272F, -0.7461F, -0.1134F, 0.0F));

		PartDefinition cube_r212 = Jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(74, 57).mirror().addBox(-0.7709F, -0.4581F, -0.6943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.0918F, -3.6272F, -0.4145F, -0.1134F, 0.0F));

		PartDefinition cube_r213 = Jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.7953F, -0.3832F, -0.679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.125F, 0.0918F, -3.1272F, -0.24F, -0.1484F, 0.0F));

		PartDefinition cube_r214 = Jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-0.2F, -0.1086F, -1.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.1527F, -0.2443F, 0.0F));

		PartDefinition cube_r215 = Jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-0.2F, -0.3837F, -1.909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.0785F, -0.2443F, 0.0F));

		PartDefinition cube_r216 = Jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.2F, -0.4227F, -1.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(84, 27).mirror().addBox(-0.2F, -0.2227F, -1.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.0436F, -0.2443F, 0.0F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-1.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 84).mirror().addBox(-1.5F, -0.8F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(84, 52).addBox(-0.35F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 84).addBox(-0.35F, -0.8F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.425F, 0.7015F, -0.5257F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 83).mirror().addBox(-0.2F, -0.2273F, -0.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.0918F, -1.5772F, -0.0349F, -0.2443F, 0.0F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-1.5F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(62, 45).addBox(-0.35F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.425F, -0.2F, 0.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(57, 83).addBox(-0.8F, -0.5562F, -0.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, 0.2269F, 0.2443F, 0.0F));

		PartDefinition cube_r221 = Jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(86, 48).addBox(-0.8F, -0.6155F, -1.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.0611F, 0.2443F, 0.0F));

		PartDefinition cube_r222 = Jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(86, 45).addBox(-0.8F, -0.5484F, -1.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.1484F, 0.2443F, 0.0F));

		PartDefinition cube_r223 = Jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(45, 86).addBox(-0.8F, -0.7667F, -1.9617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, 0.0262F, 0.2443F, 0.0F));

		PartDefinition cube_r224 = Jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(86, 42).addBox(-0.2047F, -0.7149F, -0.6674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.125F, 0.0918F, -3.1272F, 0.1309F, 0.1484F, 0.0F));

		PartDefinition cube_r225 = Jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(20, 86).addBox(-0.2047F, -0.5222F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.125F, 0.0918F, -3.1272F, -0.0436F, 0.1484F, 0.0F));

		PartDefinition cube_r226 = Jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 87).addBox(-0.2291F, -0.5404F, -0.7627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.175F, 0.0918F, -3.6272F, -0.4756F, 0.1134F, 0.0F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 60).addBox(-0.2291F, -0.3294F, -1.0751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.175F, 0.0918F, -3.6272F, -0.7461F, 0.1134F, 0.0F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(74, 57).addBox(-0.2291F, -0.4581F, -0.6943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 0.0918F, -3.6272F, -0.4145F, 0.1134F, 0.0F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 15).addBox(-0.2047F, -0.3832F, -0.679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.125F, 0.0918F, -3.1272F, -0.24F, 0.1484F, 0.0F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 36).addBox(-0.8F, -0.1086F, -1.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.1527F, 0.2443F, 0.0F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(84, 33).addBox(-0.8F, -0.3837F, -1.909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.0785F, 0.2443F, 0.0F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(84, 30).addBox(-0.8F, -0.4227F, -1.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(84, 27).addBox(-0.8F, -0.2227F, -1.3229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.0436F, 0.2443F, 0.0F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(52, 83).addBox(-0.8F, -0.2273F, -0.7279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.875F, 0.0918F, -1.5772F, -0.0349F, 0.2443F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.968F, -10.7579F, 0.8024F, 0.1537F, 0.0329F));

		PartDefinition cube_r234 = ArmL.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(69, 53).addBox(-0.5F, 0.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2F, 1.892F, 0.1376F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r235 = ArmL.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(76, 7).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 1.5F, 0.3F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r236 = ArmL.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(67, 85).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(84, 68).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r237 = ArmL.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 1.6131F, 0.0357F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r238 = ArmL.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(85, 75).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2F, 0.9979F, -0.2983F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r239 = ArmL.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(84, 81).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 0.344F, -0.3202F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r240 = ArmL.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 78).addBox(-0.5F, -0.875F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, -0.4102F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.8558F, 2.121F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r241 = ElbowL.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(87, 0).addBox(0.0F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 87).addBox(0.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.495F, -0.7533F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r242 = ElbowL.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(15, 87).addBox(0.0F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(5, 87).addBox(0.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0745F, -3.1188F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r243 = ElbowL.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(72, 0).addBox(0.0F, 0.2F, -1.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(72, 20).addBox(0.0F, 1.125F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r244 = ElbowL.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -0.975F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 87).addBox(0.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, -0.1065F, -0.4839F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r245 = ElbowL.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(87, 71).addBox(0.0F, -1.275F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 61).addBox(0.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, 0.3629F, -1.3668F, -1.0821F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.0604F, -3.5109F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r246 = HandL.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(81, 46).addBox(-1.025F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(77, 25).addBox(-1.025F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, 0.1213F, 0.0493F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.968F, -10.7579F, 0.8024F, -0.1537F, -0.0329F));

		PartDefinition cube_r247 = ArmL2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, 1.892F, 0.1376F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r248 = ArmL2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 10).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 1.5F, 0.3F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r249 = ArmL2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 85).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(84, 84).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r250 = ArmL2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 1.6131F, 0.0357F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r251 = ArmL2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(86, 6).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.2F, 0.9979F, -0.2983F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r252 = ArmL2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 0.344F, -0.3202F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r253 = ArmL2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.875F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, -0.4102F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.8558F, 2.121F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r254 = ElbowL2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(25, 87).addBox(-1.0F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(87, 24).addBox(-1.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.495F, -0.7533F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r255 = ElbowL2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(87, 21).addBox(-1.0F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(87, 18).addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0745F, -3.1188F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r256 = ElbowL2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(12, 72).addBox(-1.0F, 0.2F, -1.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(26, 72).addBox(-1.0F, 1.125F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r257 = ElbowL2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(88, 87).addBox(-1.0F, -0.975F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(71, 88).addBox(-1.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, -0.1065F, -0.4839F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r258 = ElbowL2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 88).addBox(-1.0F, -1.275F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(35, 88).addBox(-1.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, 0.3629F, -1.3668F, -1.0821F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.0604F, -3.5109F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r259 = HandL2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(82, 21).addBox(0.025F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(82, 18).addBox(0.025F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, -0.1213F, -0.0493F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 5.4138F, -11.2701F, 0.0F, 0.0873F, 0.0873F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.825F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.7737F, -3.3564F, 3.2388F, 1.5719F, -0.2452F, -0.1688F));

		PartDefinition cube_r261 = bone2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(85, 39).addBox(0.2734F, -0.8667F, 4.1149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(44, 63).addBox(0.2734F, -0.8667F, 2.4149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.164F, -0.4665F, -0.4091F, 0.6119F, -0.2452F, -0.1688F));

		PartDefinition cube_r262 = bone2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(37, 65).addBox(-0.4815F, -0.0704F, -0.0541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.164F, -2.5665F, 1.291F, 0.8912F, -0.2452F, -0.1688F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(23, 64).addBox(-0.527F, -0.8719F, -0.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5251F, 0.9012F, 0.0504F, -2.9622F, 0.0116F, 0.3076F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, -0.25F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5178F, 0.7617F, -0.6568F, 1.4884F, 0.0116F, 0.3076F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 24).addBox(-0.527F, -1.1815F, 0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5251F, 0.9012F, 0.0504F, 1.0521F, 0.0116F, 0.3076F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(30, 65).addBox(-0.8F, 0.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0178F, 2.3969F, 0.9394F, 3.0478F, 0.0511F, 0.6327F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(84, 55).addBox(-0.8F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0178F, 2.3969F, 0.9394F, 2.2623F, -0.0793F, 0.645F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(51, 63).addBox(-0.527F, -0.0575F, -0.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5251F, 0.9012F, 0.0504F, 1.8375F, 0.0116F, 0.3076F));

		PartDefinition cube_r269 = bone2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(53, 46).addBox(-0.5F, -0.0467F, -0.2168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.164F, -0.4665F, -0.4091F, 0.8965F, 0.0F, 0.0F));

		PartDefinition bone3 = Chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 5.4138F, -11.2701F, 0.0F, -0.0873F, -0.0873F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -0.825F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.7737F, -3.3564F, 3.2388F, 1.5719F, 0.2452F, 0.1688F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-1.2734F, -0.8667F, 4.1149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(44, 63).mirror().addBox(-1.2734F, -0.8667F, 2.4149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.164F, -0.4665F, -0.4091F, 0.6119F, 0.2452F, 0.1688F));

		PartDefinition cube_r272 = bone3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(37, 65).mirror().addBox(-0.5185F, -0.0704F, -0.0541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.164F, -2.5665F, 1.291F, 0.8912F, 0.2452F, 0.1688F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-0.473F, -0.8719F, -0.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.5251F, 0.9012F, 0.0504F, -2.9622F, -0.0116F, -0.3076F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.5F, -0.25F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5178F, 0.7617F, -0.6568F, 1.4884F, -0.0116F, -0.3076F));

		PartDefinition cube_r275 = bone3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.473F, -1.1815F, 0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5251F, 0.9012F, 0.0504F, 1.0521F, -0.0116F, -0.3076F));

		PartDefinition cube_r276 = bone3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.2F, 0.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0178F, 2.3969F, 0.9394F, 3.0478F, -0.0511F, -0.6327F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-0.2F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0178F, 2.3969F, 0.9394F, 2.2623F, 0.0793F, -0.645F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.473F, -0.0575F, -0.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5251F, 0.9012F, 0.0504F, 1.8375F, -0.0116F, -0.3076F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-0.5F, -0.0467F, -0.2168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.164F, -0.4665F, -0.4091F, 0.8965F, 0.0F, 0.0F));

		PartDefinition Tail1 = Dryosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.6802F, 11.3635F, 0.02F, 0.1331F, -0.0839F));

		PartDefinition cube_r280 = Tail1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(89, 78).addBox(-1.6F, -1.9364F, -0.0531F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0659F, 4.9134F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Tail1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(89, 64).addBox(-1.6F, -2.0181F, -0.0607F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.4659F, 3.0134F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r282 = Tail1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(36, 50).addBox(-0.1F, -2.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5684F, 5.0755F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r283 = Tail1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(27, 54).addBox(-1.6F, 1.5753F, 1.1981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 90).addBox(-1.6F, 0.2753F, -0.8019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0341F, 1.0134F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Tail1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(91, 11).addBox(-1.6F, -2.1247F, -0.0019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.0341F, 1.0134F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r285 = Tail1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.4754F, 0.0884F, -0.0739F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2659F, 1.0134F, -0.2971F, 0.0501F, -0.0153F));

		PartDefinition cube_r286 = Tail1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5246F, 0.0884F, -0.0739F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2659F, 1.0134F, -0.2971F, -0.0501F, 0.0153F));

		PartDefinition cube_r287 = Tail1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(17, 27).addBox(-2.0F, -0.4835F, -0.1704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5F, 0.0659F, 0.1134F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.798F, 5.6645F, -0.1327F, 0.173F, -0.023F));

		PartDefinition cube_r288 = Tail2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 91).addBox(-0.5F, -1.0034F, -0.0041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5332F, 4.9579F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Tail2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5F, -1.1279F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1332F, 2.9579F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r290 = Tail2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(80, 85).addBox(-0.1F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0368F, 5.7479F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r291 = Tail2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(77, 85).addBox(-0.1F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8113F, 3.6721F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Tail2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(46, 76).addBox(-0.1F, -0.5F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7704F, -0.589F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Tail2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(89, 82).addBox(-0.5F, -1.4339F, -0.0022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3668F, 1.0579F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Tail2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-1.3007F, -0.0416F, -0.0082F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2332F, 0.9579F, -0.2099F, 0.0683F, -0.0145F));

		PartDefinition cube_r295 = Tail2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(36, 6).addBox(-0.6993F, -0.0416F, -0.0082F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2332F, 0.9579F, -0.2099F, -0.0683F, 0.0145F));

		PartDefinition cube_r296 = Tail2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(19, 0).addBox(-0.9F, -0.4915F, -0.3029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0332F, 0.2579F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4378F, 6.6528F, -0.0371F, 0.2157F, -0.0932F));

		PartDefinition cube_r297 = Tail3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(3, 92).addBox(-1.1F, -0.6718F, 0.0433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r298 = Tail3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(92, 0).addBox(-1.1F, -0.8378F, -0.0552F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, 2.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Tail3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(89, 27).addBox(-0.1F, 0.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 86).addBox(-0.1F, -0.6F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 86).addBox(-0.1F, -1.0F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.599F, -0.9048F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Tail3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(91, 90).addBox(-1.1F, -1.0216F, 0.0543F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Tail3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-0.7011F, -0.2179F, 0.0166F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1992F, 0.0028F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r302 = Tail3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(45, 35).addBox(-0.2989F, -0.2179F, 0.0166F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1992F, 0.0028F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r303 = Tail3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, 1.2F, -0.14F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.7F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.4017F, 0.0084F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4032F, 5.9596F, -0.0365F, -0.173F, 0.0493F));

		PartDefinition cube_r304 = Tail4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(92, 24).addBox(-0.6F, -0.5272F, -0.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3744F, 6.0473F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r305 = Tail4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(23, 92).addBox(-0.6F, -0.5272F, -0.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3744F, 4.0473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Tail4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(92, 21).addBox(-0.6F, -0.8272F, 0.0611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0744F, 1.9473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r307 = Tail4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(92, 18).addBox(-0.6F, -0.8773F, -0.1389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0744F, 0.1473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r308 = Tail4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(36, 56).addBox(-0.1F, 3.4F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 91).addBox(-0.1F, 2.1F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 91).addBox(-0.1F, 1.8F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 91).addBox(-0.1F, 1.5F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1958F, -6.8645F, 0.2705F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0177F, 7.9675F, 0.2922F, -0.3172F, -0.007F));

		PartDefinition cube_r309 = Tail5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(92, 36).addBox(-1.1F, -0.3061F, 0.0728F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.68F, 5.72F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r310 = Tail5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(92, 33).addBox(-1.1F, -0.4406F, -0.004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.38F, 3.82F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r311 = Tail5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(92, 30).addBox(-1.1F, -0.3281F, -0.046F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.12F, 1.92F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r312 = Tail5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(16, 92).addBox(-0.1F, -0.15F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 92).addBox(-0.1F, -0.225F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 92).addBox(-0.1F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2311F, 1.5692F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r313 = Tail5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(92, 27).addBox(-1.1F, -0.4861F, -0.1401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.32F, 0.02F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r314 = Tail5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1586F, 6.6534F, 0.0091F, -0.3554F, 0.1608F));

		PartDefinition cube_r315 = Tail6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(19, 18).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1885F, 6.7478F, -0.2579F, -0.3547F, 0.2159F));

		PartDefinition cube_r316 = Tail7.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Dryosaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2996F, -1.3875F, 7.1286F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r317 = bone.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(26, 43).addBox(-2.1F, -1.0346F, -5.031F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, 0.5F, 4.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r318 = bone.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(44, 67).addBox(-2.1F, 0.0255F, 0.0465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -1.5F, 3.6F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r319 = bone.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(7, 65).addBox(-2.1F, -0.0518F, 0.0097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.0F, 1.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r320 = bone.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 35).addBox(-2.1F, -1.0064F, -0.0617F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -0.725F, -4.7F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r321 = bone.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(65, 4).addBox(-2.1F, -0.016F, -2.0185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.325F, -3.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r322 = bone.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(65, 0).addBox(-2.1F, -0.0283F, -2.0199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.4F, -1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r323 = bone.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(53, 51).addBox(-2.1F, -0.6884F, 0.3975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.8F, -1.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r324 = bone.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(76, 16).addBox(-1.0F, -1.3135F, -1.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -0.4545F, 0.1813F, 0.5236F, 0.0F, 0.192F));

		PartDefinition cube_r325 = bone.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 65).addBox(-1.0F, -1.2057F, 0.5036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -0.4545F, 0.1813F, -0.7418F, 0.0F, 0.192F));

		PartDefinition cube_r326 = bone.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(18, 54).addBox(-0.8411F, -1.0087F, 2.4019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.95F, 4.0955F, 0.2813F, -0.9456F, 0.0514F, 0.1922F));

		PartDefinition cube_r327 = bone.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(56, 5).addBox(-0.8411F, -0.7326F, -0.221F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.95F, 4.0955F, 0.2813F, -0.8408F, 0.0514F, 0.1922F));

		PartDefinition cube_r328 = bone.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 0).addBox(-0.7899F, 0.7601F, 0.0282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 2.0455F, 0.1813F, -0.0835F, -0.137F, 0.4207F));

		PartDefinition cube_r329 = bone.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(9, 54).addBox(-0.7899F, -0.2338F, -1.0967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.9F, 2.0455F, 0.1813F, -0.8253F, -0.137F, 0.4207F));

		PartDefinition cube_r330 = bone.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(45, 59).addBox(-0.7899F, 0.1555F, 0.6884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.9F, 2.0455F, 0.1813F, -0.6071F, -0.137F, 0.4207F));

		PartDefinition cube_r331 = bone.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(69, 82).addBox(-0.1781F, 0.2549F, 4.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 62).addBox(-0.1781F, 0.2549F, 4.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-2.4F, 3.3455F, 1.7813F, -0.7577F, 0.0488F, 0.2094F));

		PartDefinition cube_r332 = bone.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 57).addBox(-0.1781F, -0.7209F, 1.7194F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.4F, 3.3455F, 1.7813F, -0.9759F, 0.0488F, 0.2094F));

		PartDefinition cube_r333 = bone.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(51, 10).addBox(-0.1781F, -0.327F, -0.9036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-2.4F, 3.3455F, 1.7813F, -0.7664F, 0.0488F, 0.2094F));

		PartDefinition cube_r334 = bone.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(56, 0).addBox(-0.7899F, -1.1511F, -1.1154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 2.0455F, 0.1813F, -1.3053F, -0.137F, 0.4207F));

		PartDefinition cube_r335 = bone.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(51, 15).addBox(-0.7708F, -0.2546F, 0.3296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.775F, 1.9455F, -1.6187F, -0.7985F, 0.0F, 0.5411F));

		PartDefinition cube_r336 = bone.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(35, 82).addBox(-0.7708F, -0.3546F, -0.2685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.775F, 1.9455F, -1.6187F, -0.9861F, 0.0F, 0.5411F));

		PartDefinition cube_r337 = bone.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(76, 13).addBox(-0.7708F, -0.5908F, -0.3119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(84, 58).addBox(-0.7708F, -0.1908F, -0.8119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.775F, 1.9455F, -1.6187F, -0.3752F, 0.0F, 0.5411F));

		PartDefinition cube_r338 = bone.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(52, 41).addBox(-1.0F, 1.0053F, -5.8192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, -0.4545F, 0.1813F, 0.2793F, 0.0F, 0.192F));

		PartDefinition cube_r339 = bone.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(75, 76).addBox(-1.0F, 0.0518F, -3.3377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -0.4545F, 0.1813F, 0.5847F, 0.0F, 0.192F));

		PartDefinition cube_r340 = bone.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -0.2643F, -1.5477F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.4545F, 0.1813F, -0.2618F, 0.0F, 0.192F));

		PartDefinition bone4 = Dryosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2996F, -1.3875F, 7.1286F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r341 = bone4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(26, 43).mirror().addBox(1.1F, -1.0346F, -5.031F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 4.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r342 = bone4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(1.1F, 0.0255F, 0.0465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5F, 3.6F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r343 = bone4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(1.1F, -0.0518F, 0.0097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 1.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(15, 35).mirror().addBox(1.1F, -1.0064F, -0.0617F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.725F, -4.7F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(1.1F, -0.016F, -2.0185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.325F, -3.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(1.1F, -0.0283F, -2.0199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4F, -1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(53, 51).mirror().addBox(1.1F, -0.6884F, 0.3975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8F, -1.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(0.0F, -1.3135F, -1.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.4545F, 0.1813F, 0.5236F, 0.0F, -0.192F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(0.0F, -1.2057F, 0.5036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.4545F, 0.1813F, -0.7418F, 0.0F, -0.192F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(18, 54).mirror().addBox(-0.1589F, -1.0087F, 2.4019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.95F, 4.0955F, 0.2813F, -0.9456F, -0.0514F, -0.1922F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-0.1589F, -0.7326F, -0.221F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.95F, 4.0955F, 0.2813F, -0.8408F, -0.0514F, -0.1922F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.2101F, 0.7601F, 0.0282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.0455F, 0.1813F, -0.0835F, 0.137F, -0.4207F));

		PartDefinition cube_r353 = bone4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(9, 54).mirror().addBox(-0.2101F, -0.2338F, -1.0967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.0455F, 0.1813F, -0.8253F, 0.137F, -0.4207F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-0.2101F, 0.1555F, 0.6884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.0455F, 0.1813F, -0.6071F, 0.137F, -0.4207F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.8219F, 0.2549F, 4.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(82, 62).mirror().addBox(-0.8219F, 0.2549F, 4.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(2.4F, 3.3455F, 1.7813F, -0.7577F, -0.0488F, -0.2094F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.8219F, -0.7209F, 1.7194F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.4F, 3.3455F, 1.7813F, -0.9759F, -0.0488F, -0.2094F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-0.8219F, -0.327F, -0.9036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(2.4F, 3.3455F, 1.7813F, -0.7664F, -0.0488F, -0.2094F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.2101F, -1.1511F, -1.1154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.0455F, 0.1813F, -1.3053F, 0.137F, -0.4207F));

		PartDefinition cube_r359 = bone4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(-0.2292F, -0.2546F, 0.3296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.775F, 1.9455F, -1.6187F, -0.7985F, 0.0F, -0.5411F));

		PartDefinition cube_r360 = bone4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.2292F, -0.3546F, -0.2685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.775F, 1.9455F, -1.6187F, -0.9861F, 0.0F, -0.5411F));

		PartDefinition cube_r361 = bone4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-0.2292F, -0.5908F, -0.3119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(84, 58).mirror().addBox(-0.2292F, -0.1908F, -0.8119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.775F, 1.9455F, -1.6187F, -0.3752F, 0.0F, -0.5411F));

		PartDefinition cube_r362 = bone4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(0.0F, 1.0053F, -5.8192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.4545F, 0.1813F, 0.2793F, 0.0F, -0.192F));

		PartDefinition cube_r363 = bone4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(0.0F, 0.0518F, -3.3377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.4545F, 0.1813F, 0.5847F, 0.0F, -0.192F));

		PartDefinition cube_r364 = bone4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.0F, -0.2643F, -1.5477F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.4545F, 0.1813F, -0.2618F, 0.0F, -0.192F));

		PartDefinition LegL = Dryosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -1.4432F, 7.3367F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r365 = LegL.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(58, 29).addBox(-1.0F, 1.6F, -0.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 29).addBox(-0.5F, 0.0F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4793F, -1.3887F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r366 = LegL.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(17, 74).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.4793F, -1.3887F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r367 = LegL.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(40, 71).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4822F, -1.5195F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r368 = LegL.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(72, 25).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.019F, 0.7749F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r369 = LegL.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(62, 53).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1187F, 0.8721F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r370 = LegL.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(51, 67).addBox(-1.0F, -1.6F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 50).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.543F, -0.825F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r371 = LegL.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(81, 49).addBox(-1.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 69).addBox(-1.0F, 0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.3018F, -0.5526F, -0.1745F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create().texOffs(69, 47).addBox(-1.01F, 7.6361F, -0.8052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4F, 9.6512F, -0.1829F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r372 = KneeL.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -0.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 0.4122F, 0.1622F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r373 = KneeL.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(58, 66).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r374 = KneeL.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(51, 70).addBox(-1.0F, -4.2F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(9, 59).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r375 = KneeL.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(67, 61).addBox(-1.0F, 0.0F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 69).addBox(-1.0F, -0.2F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 8.4361F, -0.5802F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r376 = KneeL.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(58, 70).addBox(-1.0F, -1.0F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 8.1951F, -0.1788F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r377 = KneeL.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(65, 66).addBox(-1.0F, -1.0F, -0.225F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.01F, 8.1951F, -0.1788F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r378 = KneeL.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(74, 37).addBox(-0.5F, -1.025F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(1.19F, 1.6616F, 0.694F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r379 = KneeL.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(31, 50).addBox(0.7F, -3.3F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r380 = KneeL.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(39, 49).addBox(-1.0F, -3.8F, -0.4F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, -0.0873F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create().texOffs(53, 56).addBox(-0.5F, -0.1233F, -0.4912F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 8.9861F, -0.6255F, -0.6981F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0737F, -0.2413F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r381 = FootL.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(9, 50).addBox(-1.01F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r382 = FootL2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(36, 12).addBox(-1.01F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

		PartDefinition LegL2 = Dryosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, -1.4432F, 7.3367F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r383 = LegL2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(58, 33).addBox(-1.0F, 1.6F, -0.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 33).addBox(-0.5F, 0.0F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4793F, -1.3887F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r384 = LegL2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(31, 74).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.4793F, -1.3887F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r385 = LegL2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(45, 71).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.4822F, -1.5195F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r386 = LegL2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(72, 64).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.019F, 0.7749F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r387 = LegL2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(65, 24).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1187F, 0.8721F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r388 = LegL2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(67, 58).addBox(-1.0F, -1.6F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 76).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.543F, -0.825F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r389 = LegL2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 69).addBox(0.0F, 0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.3018F, -0.5526F, -0.1745F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create().texOffs(69, 50).addBox(-0.99F, 7.6361F, -0.8052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4F, 9.6512F, -0.1829F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r390 = KneeL2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(67, 37).addBox(-1.0F, -0.95F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 0.4122F, 0.1622F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r391 = KneeL2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(67, 33).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r392 = KneeL2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(19, 71).addBox(-1.0F, -4.2F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(16, 59).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r393 = KneeL2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(21, 68).addBox(-1.0F, 0.0F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 44).addBox(-1.0F, -0.2F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 8.4361F, -0.5802F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r394 = KneeL2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(65, 70).addBox(-1.0F, -1.0F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 8.1951F, -0.1788F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r395 = KneeL2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(67, 29).addBox(-1.0F, -1.0F, -0.225F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.01F, 8.1951F, -0.1788F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r396 = KneeL2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(74, 53).addBox(-0.5F, -1.025F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.19F, 1.6616F, 0.694F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r397 = KneeL2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(51, 0).addBox(-1.7F, -3.3F, -0.2F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r398 = KneeL2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(46, 49).addBox(-1.0F, -3.8F, -0.4F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, -0.0873F, 0.0F, 0.0F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create().texOffs(58, 20).addBox(-1.5F, -0.1233F, -0.4912F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 8.9861F, -0.6255F, -2.0071F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0737F, -0.2413F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r399 = FootL3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(20, 50).addBox(-1.99F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r400 = FootL4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(36, 18).addBox(-1.99F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

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