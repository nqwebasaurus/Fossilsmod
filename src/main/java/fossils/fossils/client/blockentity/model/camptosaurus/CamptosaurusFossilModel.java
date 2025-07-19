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
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Chest;
	private final ModelPart chest2;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart tail;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;

	public CamptosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Camptosaurus = this.fossil.getChild("Camptosaurus");
		this.LegL = this.Camptosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.TarsalsL = this.KneeL.getChild("TarsalsL");
		this.FootL = this.TarsalsL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Camptosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.TarsalsL2 = this.KneeL2.getChild("TarsalsL2");
		this.FootL3 = this.TarsalsL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.bone2 = this.Camptosaurus.getChild("bone2");
		this.bone4 = this.Camptosaurus.getChild("bone4");
		this.body2 = this.Camptosaurus.getChild("body2");
		this.Body = this.body2.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Chest = this.body3.getChild("Chest");
		this.chest2 = this.Chest.getChild("chest2");
		this.ArmL = this.chest2.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.chest2.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.bone = this.chest2.getChild("bone");
		this.bone3 = this.chest2.getChild("bone3");
		this.Neck4 = this.chest2.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Neck5 = this.Neck1.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Tail1 = this.Camptosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.tail = this.Tail2.getChild("tail");
		this.Tail3 = this.tail.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Camptosaurus = fossil.addOrReplaceChild("Camptosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.7F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Camptosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 101).addBox(0.0F, -3.7F, -0.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6815F, -2.0375F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Camptosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 94).addBox(0.0F, -4.7613F, -0.1874F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3071F, 3.1116F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Camptosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 94).addBox(0.0F, -4.3742F, -0.1577F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4071F, 1.2116F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Camptosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 48).addBox(0.0F, -4.1F, -0.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4828F, -0.0602F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Camptosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 20).mirror().addBox(-2.5F, -0.2092F, 4.3909F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 20).addBox(0.5F, -0.2092F, 4.3909F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-0.5F, -1.2092F, 4.3909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9897F, -7.5097F, -0.096F, 0.0F, 0.0F));

		PartDefinition LegL = Camptosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7F, 0.8182F, -1.0751F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LegL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 59).addBox(-2.5F, -0.5F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.4337F, -0.6552F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r7 = LegL.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 16).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.811F, 0.95F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r8 = LegL.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 77).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 8.5161F, -1.2232F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r9 = LegL.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 77).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.5407F, -1.5361F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = LegL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 67).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5997F, 1.4907F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r11 = LegL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 64).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.53F, 0.4931F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = LegL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 71).addBox(-2.0F, -0.4F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.336F, 0.1433F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r13 = LegL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 29).addBox(-3.0F, -1.3F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 0.5944F, 1.5446F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r14 = LegL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 61).addBox(-2.0F, -4.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0F, 4.4838F, 0.6108F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r15 = LegL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(69, 59).addBox(-2.0F, 0.0F, 0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(77, 33).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 4.5414F, -1.5885F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r16 = LegL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 105).addBox(-0.5F, 0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(105, 31).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.225F, 1.304F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LegL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(105, 34).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7249F, 1.3171F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r18 = LegL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 97).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6837F, 0.7683F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r19 = LegL.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 28).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5414F, -1.5885F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r20 = LegL.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 69).addBox(-2.0F, -3.05F, -0.05F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 3.0402F, -1.4421F, 0.0436F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create().texOffs(92, 24).addBox(-1.01F, 10.4294F, -2.9089F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.9232F, 2.2098F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r21 = KneeL.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 50).addBox(-1.0F, 0.05F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.7177F, 1.5984F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r22 = KneeL.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 45).addBox(-1.0F, 0.05F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.01F, 0.8144F, 2.884F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r23 = KneeL.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 71).addBox(-1.0F, -0.025F, -0.15F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.01F, 1.3881F, -1.9152F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r24 = KneeL.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 80).addBox(-1.0F, -0.9F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.01F, 0.3192F, -1.031F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r25 = KneeL.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 74).addBox(-1.0F, -0.025F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F))
				.texOffs(78, 55).addBox(-1.0F, -0.025F, -1.025F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.01F, 3.9288F, -0.1019F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r26 = KneeL.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(77, 82).addBox(-1.0F, -0.45F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.01F, 9.7162F, -1.5129F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r27 = KneeL.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 86).addBox(-1.0F, 0.0F, -0.025F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.01F, 8.1238F, -1.1018F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r28 = KneeL.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(102, 97).addBox(-0.5F, -0.1F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.89F, 3.1066F, 1.2727F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r29 = KneeL.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(103, 81).addBox(-0.5F, -0.1F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.89F, 1.1761F, 0.8813F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r30 = KneeL.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 101).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.89F, 0.4124F, 1.3634F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r31 = KneeL.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(45, 103).addBox(-0.5F, -2.4F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.89F, 1.6616F, 0.494F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r32 = KneeL.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 87).addBox(-0.5F, -0.075F, -0.175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.89F, 0.7693F, 0.3765F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r33 = KneeL.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(103, 37).addBox(-0.5F, -2.275F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.89F, 1.6616F, 0.494F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r34 = KneeL.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(112, 15).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(117, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.89F, 10.4919F, -1.6096F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r35 = KneeL.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(101, 73).addBox(0.7F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.69F, 8.8946F, -0.4059F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r36 = KneeL.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(72, 101).addBox(0.7F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.69F, 8.8946F, -0.4059F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r37 = KneeL.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 87).addBox(0.7F, 0.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.69F, 3.9027F, -0.1036F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = KneeL.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 73).addBox(-1.0F, -2.8F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.01F, 4.1768F, 0.9082F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r39 = KneeL.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(80, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.01F, 11.0959F, -0.117F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r40 = KneeL.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 70).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.01F, 9.1396F, 0.2988F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r41 = KneeL.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 79).addBox(-1.0F, -3.8F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 7.9485F, 0.4451F, -0.1222F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create().texOffs(55, 29).addBox(-1.0F, -0.1233F, -1.4912F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 12.6147F, -1.9589F, -1.1781F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.6135F, -0.4366F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r42 = FootL.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(62, 47).addBox(-1.01F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r43 = FootL2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 17).addBox(-1.01F, 0.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

		PartDefinition LegL2 = Camptosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 0.8182F, -1.0751F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r44 = LegL2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 20).addBox(-0.5F, -0.5F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.4337F, -0.6552F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r45 = LegL2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 90).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.811F, 0.95F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r46 = LegL2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 8.5161F, -1.2232F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r47 = LegL2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(74, 77).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.5407F, -1.5361F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r48 = LegL2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(85, 55).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5997F, 1.4907F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r49 = LegL2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 85).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.0F, -1.53F, 0.4931F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r50 = LegL2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 71).addBox(0.0F, -0.4F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.336F, 0.1433F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r51 = LegL2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 0).addBox(0.0F, -1.3F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.5944F, 1.5446F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r52 = LegL2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 39).addBox(0.0F, -4.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.0F, 4.4838F, 0.6108F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r53 = LegL2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(11, 70).addBox(0.0F, 0.0F, 0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(65, 77).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 4.5414F, -1.5885F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r54 = LegL2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(105, 85).addBox(-0.5F, 0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(72, 105).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.225F, 1.304F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r55 = LegL2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 105).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7249F, 1.3171F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r56 = LegL2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 97).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6837F, 0.7683F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r57 = LegL2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 77).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.5414F, -1.5885F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r58 = LegL2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 5).addBox(0.0F, -3.05F, -0.05F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 3.0402F, -1.4421F, 0.0436F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create().texOffs(36, 94).addBox(-0.99F, 10.4294F, -2.9089F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.9232F, 2.2098F, 1.3598F, 0.0162F, -0.0017F));

		PartDefinition cube_r59 = KneeL2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(9, 76).addBox(-1.0F, 0.05F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.7177F, 1.5984F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r60 = KneeL2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(75, 65).addBox(-1.0F, 0.05F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.01F, 0.8144F, 2.884F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r61 = KneeL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 71).addBox(-1.0F, -0.025F, -0.15F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.01F, 1.3881F, -1.9152F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r62 = KneeL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 82).addBox(-1.0F, -0.9F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.01F, 0.3192F, -1.031F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r63 = KneeL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(87, 94).addBox(-1.0F, -0.025F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F))
				.texOffs(78, 70).addBox(-1.0F, -0.025F, -1.025F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.01F, 3.9288F, -0.1019F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r64 = KneeL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -0.45F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.01F, 9.7162F, -1.5129F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r65 = KneeL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 86).addBox(-1.0F, 0.0F, -0.025F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.01F, 8.1238F, -1.1018F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r66 = KneeL2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(102, 101).addBox(-0.5F, -0.1F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 3.1066F, 1.2727F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r67 = KneeL2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(103, 89).addBox(-0.5F, -0.1F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 1.1761F, 0.8813F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r68 = KneeL2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(16, 102).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.89F, 0.4124F, 1.3634F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r69 = KneeL2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(77, 103).addBox(-0.5F, -2.4F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.89F, 1.6616F, 0.494F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r70 = KneeL2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(49, 87).addBox(-0.5F, -0.075F, -0.175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.89F, 0.7693F, 0.3765F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r71 = KneeL2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(64, 103).addBox(-0.5F, -2.275F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 1.6616F, 0.494F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r72 = KneeL2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(39, 114).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(117, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 10.4919F, -1.6096F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r73 = KneeL2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 102).addBox(-1.7F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.69F, 8.8946F, -0.4059F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r74 = KneeL2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(86, 101).addBox(-1.7F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.69F, 8.8946F, -0.4059F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r75 = KneeL2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(39, 87).addBox(-1.7F, 0.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.69F, 3.9027F, -0.1036F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r76 = KneeL2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 17).addBox(-1.0F, -2.8F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.01F, 4.1768F, 0.9082F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r77 = KneeL2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(34, 82).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.01F, 11.0959F, -0.117F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r78 = KneeL2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 65).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.01F, 9.1396F, 0.2988F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r79 = KneeL2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 10).addBox(-1.0F, -3.8F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 7.9485F, 0.4451F, -0.1222F, 0.0F, 0.0F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create().texOffs(11, 56).addBox(-2.0F, -0.1233F, -1.4912F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 12.6147F, -1.9589F, -0.6981F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.6135F, -0.4366F, 0.1478F, 0.0F, 0.0F));

		PartDefinition cube_r80 = FootL3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(62, 51).addBox(-2.99F, 0.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r81 = FootL4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 44).addBox(-2.99F, 0.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = Camptosaurus.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.8F, -0.9897F, -7.5097F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(64, 65).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5856F, 11.0984F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(75, 91).addBox(-0.5F, -0.725F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.0F, 0.9218F, 10.7448F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(68, 94).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0F, -0.8529F, 13.8026F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(85, 70).addBox(2.5F, 0.0158F, 0.0159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.0641F, 12.8149F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 54).addBox(2.5F, -0.0592F, 0.2909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 94).addBox(2.5F, -0.0592F, -0.0091F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.4827F, 11.6083F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 82).addBox(2.5F, -0.9592F, -0.0091F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -1.4963F, 9.6494F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(88, 0).addBox(-1.4133F, -1.2731F, -6.7283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, 0.1951F, -0.5125F, -0.0273F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 87).addBox(-0.7754F, -0.195F, -4.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, -0.0349F, -0.384F, 0.0F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(88, 4).addBox(-0.7754F, -0.628F, -4.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, 0.0524F, -0.384F, 0.0F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(101, 58).addBox(2.5F, -0.9842F, -0.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6988F, 5.6642F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 87).addBox(0.0145F, 0.8223F, -1.0031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, -0.6196F, -0.1222F, 0.0F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 23).addBox(0.0145F, 0.1592F, -3.0249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, -0.1396F, -0.1222F, 0.0F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(29, 75).addBox(0.0145F, -0.3623F, -3.1279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4735F, -2.1148F, 6.7348F, -0.0349F, -0.1222F, 0.0F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 0).addBox(2.5F, -0.0342F, 1.9909F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4649F, 4.6577F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(114, 52).addBox(-1.1F, -0.4008F, -0.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 4.0194F, 8.5799F, 1.9984F, 0.0F, 0.4363F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(110, 46).addBox(-1.1F, -1.0433F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.25F, 4.0194F, 8.5799F, 2.2602F, 0.0F, 0.4363F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(112, 12).addBox(-1.1F, -0.2246F, -1.0244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0154F)), PartPose.offsetAndRotation(3.25F, 4.0194F, 8.5799F, 0.9076F, 0.0F, 0.4363F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(117, 12).addBox(0.0547F, -6.4934F, -1.2439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, -2.8013F, 0.0F, 0.1222F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 105).addBox(0.0547F, -6.2454F, 2.1694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, -2.2777F, 0.0F, 0.1222F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(110, 49).addBox(0.0547F, -3.0254F, 5.3164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, -1.6232F, 0.0F, 0.1222F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 110).addBox(0.0547F, 0.4042F, 5.4829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, -1.0996F, 0.0F, 0.1222F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(73, 97).addBox(0.0547F, 3.8072F, 0.8334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, 0.1222F, 0.0F, 0.1222F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(95, 27).addBox(0.0547F, 2.9899F, -0.7624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, 0.5149F, 0.0F, 0.1222F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(11, 95).addBox(0.0547F, -0.0008F, -1.0239F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.95F, 6.2194F, 11.2799F, 0.6021F, 0.0F, 0.1222F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 20).addBox(-0.5F, -1.0F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.0F, 2.5306F, 0.2439F, -0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 117).addBox(-0.044F, -4.6276F, 4.2648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(64, 110).addBox(-0.044F, -4.6276F, 4.8648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.2F, 6.6874F, 9.3789F, -1.8419F, -0.1275F, 0.051F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 114).addBox(-0.044F, -2.4208F, 6.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2F, 6.6874F, 9.3789F, -1.4056F, -0.1275F, 0.051F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 94).addBox(-0.044F, -1.2723F, 4.908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 6.6874F, 9.3789F, -1.2311F, -0.1275F, 0.051F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 82).addBox(-0.044F, -0.6418F, 2.4006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2F, 6.6874F, 9.3789F, -1.1089F, -0.1275F, 0.051F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(61, 82).addBox(-0.044F, -0.4593F, -0.1749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 6.6874F, 9.3789F, -1.0391F, -0.1275F, 0.051F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(68, 90).addBox(-0.8F, -1.9687F, 5.1406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.3F, 2.4874F, 4.079F, -0.9011F, -0.1386F, 0.138F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(114, 65).addBox(-0.8F, -1.0144F, 4.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 114).addBox(-0.8F, -1.0144F, 4.1665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3F, 2.4874F, 4.079F, -0.7266F, -0.1386F, 0.138F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 54).addBox(-0.8F, -0.6307F, -0.3791F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.3F, 2.4874F, 4.079F, -0.6393F, -0.1386F, 0.138F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(49, 52).addBox(-0.5F, -1.0F, -5.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0F, 2.4651F, 5.2434F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(110, 62).addBox(-0.5F, 0.05F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 59).addBox(-0.5F, -0.05F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(54, 110).addBox(-0.5F, -0.05F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0F, 0.6321F, -0.3315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(93, 85).addBox(-0.5F, -0.05F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.0F, 1.3325F, 1.5418F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(91, 90).addBox(-0.5F, -0.05F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.2148F, 3.0372F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 81).addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.0F, 1.8388F, 4.1555F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 94).addBox(-1.1F, 1.0031F, -0.8269F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 4.0194F, 8.5799F, 0.6894F, 0.0F, 0.4363F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 110).addBox(-1.1F, 0.2432F, -0.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.25F, 4.0194F, 8.5799F, 0.2967F, 0.0F, 0.4363F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(9, 86).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(3.0F, 2.4829F, 9.5097F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(99, 21).addBox(-0.5F, -2.7F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(0, 50).addBox(-0.5F, -2.7F, -1.7F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(3.0F, 1.5988F, 6.2665F, -0.6632F, 0.0F, 0.0F));

		PartDefinition bone4 = Camptosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.8F, -0.9897F, -7.5097F));

		PartDefinition cube_r124 = bone4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.5856F, 11.0984F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r125 = bone4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(-0.5F, -0.725F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.9218F, 10.7448F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r126 = bone4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.8529F, 13.8026F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r127 = bone4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 70).mirror().addBox(-3.5F, 0.0158F, 0.0159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0641F, 12.8149F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r128 = bone4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-3.5F, -0.0592F, 0.2909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 94).mirror().addBox(-3.5F, -0.0592F, -0.0091F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4827F, 11.6083F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r129 = bone4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-3.5F, -0.9592F, -0.0091F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4963F, 9.6494F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r130 = bone4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(0.4133F, -1.2731F, -6.7283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, 0.1951F, 0.5125F, 0.0273F));

		PartDefinition cube_r131 = bone4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(61, 87).mirror().addBox(-0.2246F, -0.195F, -4.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, -0.0349F, 0.384F, 0.0F));

		PartDefinition cube_r132 = bone4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.2246F, -0.628F, -4.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, 0.0524F, 0.384F, 0.0F));

		PartDefinition cube_r133 = bone4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 58).mirror().addBox(-3.5F, -0.9842F, -0.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6988F, 5.6642F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-1.0145F, 0.8223F, -1.0031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, -0.6196F, 0.1222F, 0.0F));

		PartDefinition cube_r135 = bone4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-1.0145F, 0.1592F, -3.0249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, -0.1396F, 0.1222F, 0.0F));

		PartDefinition cube_r136 = bone4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-1.0145F, -0.3623F, -3.1279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4735F, -2.1148F, 6.7348F, -0.0349F, 0.1222F, 0.0F));

		PartDefinition cube_r137 = bone4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-3.5F, -0.0342F, 1.9909F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4649F, 4.6577F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(114, 52).mirror().addBox(0.1F, -0.4008F, -0.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, 4.0194F, 8.5799F, 1.9984F, 0.0F, -0.4363F));

		PartDefinition cube_r139 = bone4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(110, 46).mirror().addBox(0.1F, -1.0433F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.25F, 4.0194F, 8.5799F, 2.2602F, 0.0F, -0.4363F));

		PartDefinition cube_r140 = bone4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(0.1F, -0.2246F, -1.0244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0154F)).mirror(false), PartPose.offsetAndRotation(-3.25F, 4.0194F, 8.5799F, 0.9076F, 0.0F, -0.4363F));

		PartDefinition cube_r141 = bone4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(117, 12).mirror().addBox(-1.0548F, -6.4934F, -1.2439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, -2.8013F, 0.0F, -0.1222F));

		PartDefinition cube_r142 = bone4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-1.0548F, -6.2454F, 2.1694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, -2.2777F, 0.0F, -0.1222F));

		PartDefinition cube_r143 = bone4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(110, 49).mirror().addBox(-1.0548F, -3.0254F, 5.3164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, -1.6232F, 0.0F, -0.1222F));

		PartDefinition cube_r144 = bone4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(49, 110).mirror().addBox(-1.0548F, 0.4042F, 5.4829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, -1.0996F, 0.0F, -0.1222F));

		PartDefinition cube_r145 = bone4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 97).mirror().addBox(-1.0548F, 3.8072F, 0.8334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, 0.1222F, 0.0F, -0.1222F));

		PartDefinition cube_r146 = bone4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-1.0548F, 2.9899F, -0.7624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, 0.5149F, 0.0F, -0.1222F));

		PartDefinition cube_r147 = bone4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(11, 95).mirror().addBox(-1.0548F, -0.0008F, -1.0239F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 6.2194F, 11.2799F, 0.6021F, 0.0F, -0.1222F));

		PartDefinition cube_r148 = bone4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-0.5F, -1.0F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.5306F, 0.2439F, -0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r149 = bone4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(28, 117).mirror().addBox(-0.956F, -4.6276F, 4.2648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(64, 110).mirror().addBox(-0.956F, -4.6276F, 4.8648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 6.6874F, 9.3789F, -1.8419F, 0.1275F, -0.051F));

		PartDefinition cube_r150 = bone4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(69, 114).mirror().addBox(-0.956F, -2.4208F, 6.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 6.6874F, 9.3789F, -1.4056F, 0.1275F, -0.051F));

		PartDefinition cube_r151 = bone4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(19, 94).mirror().addBox(-0.956F, -1.2723F, 4.908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 6.6874F, 9.3789F, -1.2311F, 0.1275F, -0.051F));

		PartDefinition cube_r152 = bone4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 82).mirror().addBox(-0.956F, -0.6418F, 2.4006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 6.6874F, 9.3789F, -1.1089F, 0.1275F, -0.051F));

		PartDefinition cube_r153 = bone4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 82).mirror().addBox(-0.956F, -0.4593F, -0.1749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 6.6874F, 9.3789F, -1.0391F, 0.1275F, -0.051F));

		PartDefinition cube_r154 = bone4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(-0.2F, -1.9687F, 5.1406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.4874F, 4.079F, -0.9011F, 0.1386F, -0.138F));

		PartDefinition cube_r155 = bone4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(114, 65).mirror().addBox(-0.2F, -1.0144F, 4.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 114).mirror().addBox(-0.2F, -1.0144F, 4.1665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.4874F, 4.079F, -0.7266F, 0.1386F, -0.138F));

		PartDefinition cube_r156 = bone4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-0.2F, -0.6307F, -0.3791F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.4874F, 4.079F, -0.6393F, 0.1386F, -0.138F));

		PartDefinition cube_r157 = bone4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.5F, -1.0F, -5.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.4651F, 5.2434F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(110, 62).mirror().addBox(-0.5F, 0.05F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 59).mirror().addBox(-0.5F, -0.05F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(54, 110).mirror().addBox(-0.5F, -0.05F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.6321F, -0.3315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-0.5F, -0.05F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.3325F, 1.5418F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(91, 90).mirror().addBox(-0.5F, -0.05F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.2148F, 3.0372F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(91, 81).mirror().addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.8388F, 4.1555F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(82, 94).mirror().addBox(0.1F, 1.0031F, -0.8269F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, 4.0194F, 8.5799F, 0.6894F, 0.0F, -0.4363F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 110).mirror().addBox(0.1F, 0.2432F, -0.3801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.25F, 4.0194F, 8.5799F, 0.2967F, 0.0F, -0.4363F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(9, 86).mirror().addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.4829F, 9.5097F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-0.5F, -2.7F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(0, 50).mirror().addBox(-0.5F, -2.7F, -1.7F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.5988F, 6.2665F, -0.6632F, 0.0F, 0.0F));

		PartDefinition body2 = Camptosaurus.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1071F, -3.0884F, 0.0438F, -0.0433F, -0.0057F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, -1.2092F, -0.6091F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1175F, -4.4213F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(13, 118).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2477F, -1.587F, -0.1015F, -0.0963F, -0.6901F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2477F, -1.587F, -0.0781F, -0.138F, -1.2369F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(115, 117).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0477F, -3.587F, -0.1015F, -0.0963F, -0.6901F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(97, 7).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0477F, -3.587F, -0.0781F, -0.138F, -1.2369F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 118).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2477F, -1.587F, -0.0781F, 0.138F, 1.2369F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(13, 118).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2477F, -1.587F, -0.1015F, 0.0963F, 0.6901F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(115, 117).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0477F, -3.587F, -0.1015F, 0.0963F, 0.6901F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(97, 7).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0477F, -3.587F, -0.0781F, 0.138F, 1.2369F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, -2.2F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.1F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(104, 16).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0769F, -3.8546F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Body = body2.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2179F, -5.2116F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r177 = Body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(17, 38).addBox(-0.5F, -0.2515F, 0.0213F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.181F, -6.6698F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(13, 104).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7986F, -0.5674F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(78, 97).addBox(0.0F, -3.5F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6003F, -2.4692F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 38).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -0.3754F, -0.0552F, -0.072F, -1.2393F));

		PartDefinition cube_r181 = Body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(105, 117).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -0.3754F, -0.0476F, -0.0518F, -0.6941F));

		PartDefinition cube_r182 = Body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -2.0754F, -0.0099F, -0.0725F, -1.5726F));

		PartDefinition cube_r183 = Body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -2.0754F, -0.0449F, -0.0579F, -1.048F));

		PartDefinition cube_r184 = Body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(117, 100).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -2.0754F, -0.0315F, -0.045F, -0.5029F));

		PartDefinition cube_r185 = Body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -4.0754F, 0.008F, 0.1011F, -1.5374F));

		PartDefinition cube_r186 = Body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -4.0754F, 0.0576F, 0.0835F, -1.0118F));

		PartDefinition cube_r187 = Body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 117).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1656F, -4.0754F, 0.1293F, 0.023F, -0.4698F));

		PartDefinition cube_r188 = Body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(117, 98).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4656F, -6.1754F, 0.2583F, 0.077F, -0.3586F));

		PartDefinition cube_r189 = Body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4656F, -6.1754F, 0.0228F, 0.2399F, -1.4302F));

		PartDefinition cube_r190 = Body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(23, 88).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4656F, -6.1754F, 0.1412F, 0.196F, -0.8954F));

		PartDefinition cube_r191 = Body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 117).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -0.3754F, -0.0476F, 0.0518F, 0.6941F));

		PartDefinition cube_r192 = Body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(89, 38).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -0.3754F, -0.0552F, 0.072F, 1.2393F));

		PartDefinition cube_r193 = Body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(117, 100).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -2.0754F, -0.0315F, 0.045F, 0.5029F));

		PartDefinition cube_r194 = Body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(84, 88).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -2.0754F, -0.0449F, 0.0579F, 1.048F));

		PartDefinition cube_r195 = Body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 95).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -2.0754F, -0.0099F, 0.0725F, 1.5726F));

		PartDefinition cube_r196 = Body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(100, 117).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -4.0754F, 0.1293F, -0.023F, 0.4698F));

		PartDefinition cube_r197 = Body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(68, 88).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -4.0754F, 0.0576F, -0.0835F, 1.0118F));

		PartDefinition cube_r198 = Body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(78, 62).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1656F, -4.0754F, 0.008F, -0.1011F, 1.5374F));

		PartDefinition cube_r199 = Body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(23, 88).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4656F, -6.1754F, 0.1412F, -0.196F, 0.8954F));

		PartDefinition cube_r200 = Body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(62, 57).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4656F, -6.1754F, 0.0228F, -0.2399F, 1.4302F));

		PartDefinition cube_r201 = Body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(117, 98).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4656F, -6.1754F, 0.2583F, -0.077F, 0.3586F));

		PartDefinition cube_r202 = Body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(64, 97).addBox(0.0F, -1.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.907F, -4.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 117).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.607F, -6.0971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.025F, -6.625F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 117).addBox(0.0F, -1.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.807F, -1.4971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(39, 117).addBox(0.0F, -1.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.207F, -3.4971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-10.9922F, -2.343F, -0.4258F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4406F, -3.2504F, 0.0407F, 0.3961F, -1.4246F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4406F, -3.2504F, 0.2398F, 0.3208F, -0.8701F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(116, 71).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4406F, -3.2504F, 0.4046F, 0.1362F, -0.343F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8406F, -1.4504F, 0.1842F, 0.2518F, -0.8859F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(42, 25).mirror().addBox(-9.9922F, -2.343F, -0.4258F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8406F, -1.4504F, 0.0305F, 0.3093F, -1.4281F));

		PartDefinition cube_r211 = body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(115, 84).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8406F, -1.4504F, 0.3231F, 0.1036F, -0.3527F));

		PartDefinition cube_r212 = body3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(116, 71).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4406F, -3.2504F, 0.4046F, -0.1362F, 0.343F));

		PartDefinition cube_r213 = body3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(86, 36).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4406F, -3.2504F, 0.2398F, -0.3208F, 0.8701F));

		PartDefinition cube_r214 = body3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(42, 23).addBox(2.9922F, -2.343F, -0.4258F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4406F, -3.2504F, 0.0407F, -0.3961F, 1.4246F));

		PartDefinition cube_r215 = body3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(115, 84).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8406F, -1.4504F, 0.3231F, -0.1036F, 0.3527F));

		PartDefinition cube_r216 = body3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(42, 25).addBox(2.9922F, -2.343F, -0.4258F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8406F, -1.4504F, 0.0305F, -0.3093F, 1.4281F));

		PartDefinition cube_r217 = body3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(85, 75).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8406F, -1.4504F, 0.1842F, -0.2518F, 0.8859F));

		PartDefinition cube_r218 = body3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(22, 61).addBox(0.0F, -0.0552F, 2.1445F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, -6.0F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Chest = body3.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4035F, -3.5136F, -0.2167F, -0.0669F, 0.1037F));

		PartDefinition cube_r219 = Chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -0.1954F, -0.0788F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9043F, -3.5038F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(10, 116).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3482F, -2.1089F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(62, 37).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3371F, -2.6368F, 0.1666F, 0.7511F, -1.3803F));

		PartDefinition cube_r222 = Chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3371F, -2.6368F, 0.5543F, 0.5591F, -0.7595F));

		PartDefinition cube_r223 = Chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 117).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3371F, -2.6368F, 0.7728F, 0.2108F, -0.3039F));

		PartDefinition cube_r224 = Chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-9.9922F, -2.343F, -0.4258F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0371F, -1.0368F, 0.077F, 0.656F, -1.4062F));

		PartDefinition cube_r225 = Chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0371F, -1.0368F, 0.4252F, 0.521F, -0.7938F));

		PartDefinition cube_r226 = Chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(116, 106).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0371F, -1.0368F, 0.6541F, 0.2277F, -0.2976F));

		PartDefinition cube_r227 = Chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(82, 117).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3371F, -2.6368F, 0.7728F, -0.2108F, 0.3039F));

		PartDefinition cube_r228 = Chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(88, 10).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3371F, -2.6368F, 0.5543F, -0.5591F, 0.7595F));

		PartDefinition cube_r229 = Chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(62, 37).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3371F, -2.6368F, 0.1666F, -0.7511F, 1.3803F));

		PartDefinition cube_r230 = Chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(55, 27).addBox(2.9922F, -2.343F, -0.4258F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0371F, -1.0368F, 0.077F, -0.656F, 1.4062F));

		PartDefinition cube_r231 = Chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(88, 8).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0371F, -1.0368F, 0.4252F, -0.521F, 0.7938F));

		PartDefinition cube_r232 = Chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(116, 106).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0371F, -1.0368F, 0.6541F, -0.2277F, 0.2976F));

		PartDefinition cube_r233 = Chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 110).addBox(0.0F, -2.6F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8327F, -3.6019F, 0.2793F, 0.0F, 0.0F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6043F, -3.1039F, 0.029F, -0.1288F, -0.0903F));

		PartDefinition cube_r234 = chest2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(82, 109).addBox(0.0F, -1.7F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 109).addBox(0.0F, -0.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0768F, -3.5817F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(18, 119).addBox(0.0F, -1.9F, -0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3472F, -4.8285F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.1F, -0.1F, 0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4934F, 8.2308F, 1.6173F, -0.0315F, -0.7633F, 0.5371F));

		PartDefinition cube_r237 = chest2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(43, 59).mirror().addBox(-0.1F, -0.1F, 0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4934F, 8.2308F, 1.6173F, 0.025F, -0.8593F, 0.5313F));

		PartDefinition cube_r238 = chest2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-0.4F, -0.1F, -0.6F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4934F, 8.2308F, 1.6173F, 0.1574F, -1.0162F, 0.5186F));

		PartDefinition cube_r239 = chest2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(83, 23).mirror().addBox(-0.5F, 0.2F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2019F, 8.1616F, 0.6685F, 0.3015F, -1.4088F, 0.4862F));

		PartDefinition cube_r240 = chest2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(110, 117).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9577F, -3.8329F, 1.0702F, 0.5433F, -0.3153F));

		PartDefinition cube_r241 = chest2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(73, 95).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9577F, -3.8329F, -0.2417F, 1.1137F, -1.8382F));

		PartDefinition cube_r242 = chest2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.9577F, -3.8329F, 0.6948F, 0.979F, -0.7826F));

		PartDefinition cube_r243 = chest2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(66, 34).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5327F, -2.5329F, -0.0984F, 0.9341F, -1.5916F));

		PartDefinition cube_r244 = chest2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5327F, -2.5329F, 0.536F, 0.8118F, -0.7834F));

		PartDefinition cube_r245 = chest2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(117, 96).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5327F, -2.5329F, 0.8823F, 0.4418F, -0.2807F));

		PartDefinition cube_r246 = chest2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(62, 55).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0327F, -1.0329F, 0.1098F, 0.8261F, -1.4364F));

		PartDefinition cube_r247 = chest2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0327F, -1.0329F, 0.5702F, 0.6431F, -0.7663F));

		PartDefinition cube_r248 = chest2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(117, 94).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0327F, -1.0329F, 0.8231F, 0.2803F, -0.3074F));

		PartDefinition cube_r249 = chest2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(89, 40).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9577F, -3.8329F, 0.6948F, -0.979F, 0.7826F));

		PartDefinition cube_r250 = chest2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(73, 95).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9577F, -3.8329F, -0.2417F, -1.1137F, 1.8382F));

		PartDefinition cube_r251 = chest2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(110, 117).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.9577F, -3.8329F, 1.0702F, -0.5433F, 0.3153F));

		PartDefinition cube_r252 = chest2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(117, 96).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5327F, -2.5329F, 0.8823F, -0.4418F, 0.2807F));

		PartDefinition cube_r253 = chest2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(88, 14).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5327F, -2.5329F, 0.536F, -0.8118F, 0.7834F));

		PartDefinition cube_r254 = chest2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(66, 34).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5327F, -2.5329F, -0.0984F, -0.9341F, 1.5916F));

		PartDefinition cube_r255 = chest2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(62, 55).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0327F, -1.0329F, 0.1098F, -0.8261F, 1.4364F));

		PartDefinition cube_r256 = chest2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 12).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0327F, -1.0329F, 0.5702F, -0.6431F, 0.7663F));

		PartDefinition cube_r257 = chest2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(117, 94).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0327F, -1.0329F, 0.8231F, -0.2803F, 0.3074F));

		PartDefinition cube_r258 = chest2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(34, 47).addBox(-0.9F, -0.1F, 0.1F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4934F, 8.2308F, 1.6173F, -0.0315F, 0.7633F, -0.5371F));

		PartDefinition cube_r259 = chest2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(43, 59).addBox(-0.9F, -0.1F, 0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4934F, 8.2308F, 1.6173F, 0.025F, 0.8593F, -0.5313F));

		PartDefinition cube_r260 = chest2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(22, 68).addBox(-0.6F, -0.1F, -0.6F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4934F, 8.2308F, 1.6173F, 0.1574F, 1.0162F, -0.5186F));

		PartDefinition cube_r261 = chest2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(83, 23).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2019F, 8.1616F, 0.6685F, 0.3015F, 1.4088F, -0.4862F));

		PartDefinition cube_r262 = chest2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.0305F, -0.0902F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8965F, -1.2655F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(59, 14).addBox(-1.0F, -1.7305F, -1.9902F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.7203F, -3.4721F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r264 = chest2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(34, 38).addBox(-0.5F, -0.5679F, -9.7803F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 2.6F, 0.733F, 0.0F, 0.0F));

		PartDefinition ArmL = chest2.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0072F, 6.6482F, -1.4589F, 0.4571F, 0.2708F, -0.1556F));

		PartDefinition cube_r265 = ArmL.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(35, 101).addBox(-0.5F, -1.175F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(117, 3).addBox(-0.5F, -0.175F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(116, 103).addBox(-0.5F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2376F, 6.6002F, 1.7354F, -0.0943F, -0.0087F, -0.0186F));

		PartDefinition cube_r266 = ArmL.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(110, 114).addBox(-0.5F, -0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.2158F, 5.4553F, 1.8017F, 0.2984F, -0.0087F, -0.0186F));

		PartDefinition cube_r267 = ArmL.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(94, 94).addBox(-0.5F, -2.825F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.2158F, 5.4553F, 1.8017F, 0.342F, -0.0087F, -0.0186F));

		PartDefinition cube_r268 = ArmL.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(95, 32).addBox(-0.5F, -2.825F, -0.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2272F, 5.7626F, 1.1452F, 0.5078F, -0.0087F, -0.0186F));

		PartDefinition cube_r269 = ArmL.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(11, 100).addBox(-0.5F, -0.775F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 2.1F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r270 = ArmL.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.2F, 0.4856F, 0.5305F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r271 = ArmL.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(104, 93).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.2F, 1.3965F, 0.0892F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r272 = ArmL.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(104, 53).addBox(-0.5F, -0.225F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 2.1801F, -0.6301F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r273 = ArmL.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(104, 77).addBox(-0.5F, -0.1F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(104, 69).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 3.4729F, -0.4942F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r274 = ArmL.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(104, 22).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.2F, 3.3713F, 0.08F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r275 = ArmL.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(100, 114).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2F, 0.9979F, -0.2983F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r276 = ArmL.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(114, 89).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 0.344F, -0.3202F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r277 = ArmL.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(105, 114).addBox(-0.5F, -0.1F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2F, -0.3714F, 0.4262F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r278 = ArmL.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 114).addBox(-0.5F, -1.1F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r279 = ArmL.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(114, 73).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4721F, 7.2687F, 1.1022F, 0.2077F, 0.15F, 0.2243F));

		PartDefinition cube_r280 = ElbowL.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(100, 29).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 2.0335F, -3.9966F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r281 = ElbowL.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(100, 33).addBox(-0.5F, -1.4F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2034F)), PartPose.offsetAndRotation(-0.2F, 0.5109F, -1.4117F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r282 = ElbowL.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(115, 30).addBox(-0.5F, -2.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 81).addBox(-0.5F, -2.2F, -0.425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2F, 1.0553F, -2.4838F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r283 = ElbowL.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5F, -1.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 115).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2F, 1.5148F, -0.1423F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r284 = ElbowL.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(115, 27).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 3.0988F, -3.6195F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r285 = ElbowL.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(115, 24).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(13, 115).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 3.0988F, -3.6195F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r286 = ElbowL.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(11, 50).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.2F, 2.1345F, -1.9824F, -1.0385F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 3.2999F, -4.137F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r287 = HandL.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 72).addBox(-1.025F, -1.3F, -3.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(100, 25).addBox(-1.025F, -1.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, 0.1213F, 0.0493F));

		PartDefinition cube_r288 = HandL.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(91, 103).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5524F, 0.8979F, 0.1754F, 2.6123F, 0.1213F, 0.0493F));

		PartDefinition cube_r289 = HandL.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(100, 41).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5858F, -2.2507F, -1.3701F, 1.216F, 0.1213F, 0.0493F));

		PartDefinition ArmL2 = chest2.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0072F, 6.6482F, -1.4589F, 0.2825F, -0.2708F, 0.1556F));

		PartDefinition cube_r290 = ArmL2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(40, 101).addBox(-0.5F, -1.175F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(117, 9).addBox(-0.5F, -0.175F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(117, 6).addBox(-0.5F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2376F, 6.6002F, 1.7354F, -0.0943F, 0.0087F, 0.0186F));

		PartDefinition cube_r291 = ArmL2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(54, 116).addBox(-0.5F, -0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2158F, 5.4553F, 1.8017F, 0.2984F, 0.0087F, 0.0186F));

		PartDefinition cube_r292 = ArmL2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5F, -2.825F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.2158F, 5.4553F, 1.8017F, 0.342F, 0.0087F, 0.0186F));

		PartDefinition cube_r293 = ArmL2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(54, 95).addBox(-0.5F, -2.825F, -0.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2272F, 5.7626F, 1.1452F, 0.5078F, 0.0087F, 0.0186F));

		PartDefinition cube_r294 = ArmL2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(54, 100).addBox(-0.5F, -0.775F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 2.1F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r295 = ArmL2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(100, 49).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.2F, 0.4856F, 0.5305F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r296 = ArmL2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(105, 28).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2F, 1.3965F, 0.0892F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r297 = ArmL2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(54, 104).addBox(-0.5F, -0.225F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 2.1801F, -0.6301F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r298 = ArmL2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(105, 25).addBox(-0.5F, -0.1F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(105, 0).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 3.4729F, -0.4942F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r299 = ArmL2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(24, 104).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2F, 3.3713F, 0.08F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r300 = ArmL2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(49, 116).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.2F, 0.9979F, -0.2983F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r301 = ArmL2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(44, 116).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 0.344F, -0.3202F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r302 = ArmL2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(23, 116).addBox(-0.5F, -0.1F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, -0.3714F, 0.4262F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r303 = ArmL2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(18, 116).addBox(-0.5F, -1.1F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r304 = ArmL2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4721F, 7.2687F, 1.1022F, -0.3976F, -0.0237F, -0.2563F));

		PartDefinition cube_r305 = ElbowL2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(100, 65).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 2.0335F, -3.9966F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r306 = ElbowL2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(100, 61).addBox(-0.5F, -1.4F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2034F)), PartPose.offsetAndRotation(0.2F, 0.5109F, -1.4117F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r307 = ElbowL2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(92, 116).addBox(-0.5F, -2.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 87).addBox(-0.5F, -2.2F, -0.425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2F, 1.0553F, -2.4838F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r308 = ElbowL2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(87, 116).addBox(-0.5F, -1.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 116).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2F, 1.5148F, -0.1423F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r309 = ElbowL2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(116, 68).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 3.0988F, -3.6195F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r310 = ElbowL2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(64, 116).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(116, 55).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 3.0988F, -3.6195F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r311 = ElbowL2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.2F, 2.1345F, -1.9824F, -1.0385F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 3.2999F, -4.137F, 0.7916F, -0.218F, -0.2156F));

		PartDefinition cube_r312 = HandL2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(72, 11).addBox(0.025F, -1.3F, -3.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(100, 85).addBox(0.025F, -1.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, -0.1213F, -0.0493F));

		PartDefinition cube_r313 = HandL2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(96, 103).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5524F, 0.8979F, 0.1754F, 2.6123F, -0.1213F, -0.0493F));

		PartDefinition cube_r314 = HandL2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(30, 101).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5858F, -2.2507F, -1.3701F, 1.216F, -0.1213F, -0.0493F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, -2.9F, 3.2F));

		PartDefinition cube_r315 = bone.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(79, 5).addBox(0.252F, 0.4724F, 4.7931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(79, 0).addBox(0.252F, -0.5276F, 4.5931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r316 = bone.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(110, 43).addBox(0.252F, -7.843F, -2.3631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(110, 40).addBox(0.252F, -7.843F, -2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r317 = bone.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(98, 37).addBox(0.252F, -7.9147F, 1.552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(110, 33).addBox(0.252F, -7.9147F, 1.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r318 = bone.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(110, 30).addBox(0.252F, -7.3485F, 2.1482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r319 = bone.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(61, 91).addBox(0.252F, -5.4431F, 3.9907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r320 = bone.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(53, 65).addBox(0.252F, -1.3242F, 2.9259F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r321 = bone.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(42, 65).addBox(0.252F, -0.1287F, -0.1583F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(49, 45).addBox(0.252F, -0.8287F, -0.1583F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 8.0272F, -5.4928F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r322 = bone.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(98, 81).addBox(-0.7759F, -0.8103F, 1.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.9272F, -5.4928F, 2.0365F, 0.1186F, 0.3087F));

		PartDefinition cube_r323 = bone.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(99, 17).addBox(-0.7759F, -2.1667F, 0.8726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.0F, 9.9272F, -5.4928F, 0.3348F, 0.1186F, 0.3087F));

		PartDefinition cube_r324 = bone.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(98, 89).addBox(-0.7759F, -1.2799F, 1.1339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(43, 54).addBox(-0.7759F, -2.2799F, 0.1339F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 9.9272F, -5.4928F, 1.2511F, 0.1186F, 0.3087F));

		PartDefinition cube_r325 = bone.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(83, 17).addBox(-0.7F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3887F, 9.9404F, -6.3783F, 1.3622F, 0.3143F, 0.9704F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, -2.9F, 3.2F));

		PartDefinition cube_r326 = bone3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(79, 5).mirror().addBox(-1.252F, 0.4724F, 4.7931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 0).mirror().addBox(-1.252F, -0.5276F, 4.5931F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r327 = bone3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(110, 43).mirror().addBox(-1.252F, -7.843F, -2.3631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(110, 40).mirror().addBox(-1.252F, -7.843F, -2.7631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r328 = bone3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-1.252F, -7.9147F, 1.552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(110, 33).mirror().addBox(-1.252F, -7.9147F, 1.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r329 = bone3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(110, 30).mirror().addBox(-1.252F, -7.3485F, 2.1482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r330 = bone3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-1.252F, -5.4431F, 3.9907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-1.252F, -1.3242F, 2.9259F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-1.252F, -0.1287F, -0.1583F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(49, 45).mirror().addBox(-1.252F, -0.8287F, -0.1583F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 8.0272F, -5.4928F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(98, 81).mirror().addBox(-0.2241F, -0.8103F, 1.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.9272F, -5.4928F, 2.0365F, -0.1186F, -0.3087F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(99, 17).mirror().addBox(-0.2241F, -2.1667F, 0.8726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.9272F, -5.4928F, 0.3348F, -0.1186F, -0.3087F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(98, 89).mirror().addBox(-0.2241F, -1.2799F, 1.1339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(43, 54).mirror().addBox(-0.2241F, -2.2799F, 0.1339F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.9272F, -5.4928F, 1.2511F, -0.1186F, -0.3087F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-0.3F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3887F, 9.9404F, -6.3783F, 1.3622F, -0.3143F, -0.9704F));

		PartDefinition Neck4 = chest2.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6615F, -4.5244F, 0.4644F, -0.248F, -0.0848F));

		PartDefinition cube_r337 = Neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(30, 98).addBox(0.0F, -1.0296F, -0.0247F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -1.8719F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r338 = Neck4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(118, 36).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8962F, -1.3085F, 0.8548F, 0.6426F, -0.4257F));

		PartDefinition cube_r339 = Neck4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(97, 9).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8962F, -1.3085F, 0.331F, 0.9682F, -1.0742F));

		PartDefinition cube_r340 = Neck4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(118, 36).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8962F, -1.3085F, 0.8548F, -0.6426F, 0.4257F));

		PartDefinition cube_r341 = Neck4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(97, 9).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8962F, -1.3085F, 0.331F, -0.9682F, 1.0742F));

		PartDefinition cube_r342 = Neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(71, 39).addBox(-0.5F, -0.0296F, 2.1754F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5739F, -4.9769F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2912F, -2.4818F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r343 = Neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(118, 78).addBox(0.0F, -2.5348F, 2.8697F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 56).addBox(-0.5F, -1.7348F, 1.8697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1906F, -3.5949F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r344 = Neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.395F, -0.6266F, 0.3425F, 0.6367F, -1.0859F));

		PartDefinition cube_r345 = Neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(97, 11).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.395F, -0.6266F, 0.3425F, -0.6367F, 1.0859F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8251F, -0.9379F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -0.4108F, 3.9161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(84, 90).addBox(-0.5F, -1.1109F, 3.9161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.269F, -4.1311F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(118, 86).addBox(0.0F, -1.0108F, -0.9839F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2094F, -0.2075F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0301F, -1.2888F, 0.0898F, 0.1683F, -1.2695F));

		PartDefinition cube_r349 = Neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(97, 13).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0301F, -1.2888F, 0.0898F, -0.1683F, 1.2695F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1102F, -1.0798F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Neck1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(89, 61).addBox(0.0F, -0.9455F, -0.1153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3343F, -0.8925F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-1.9348F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1403F, -0.709F, 0.0875F, 0.8717F, -1.2375F));

		PartDefinition cube_r352 = Neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(97, 15).addBox(-0.0652F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1403F, -0.709F, 0.0875F, -0.8717F, 1.2375F));

		PartDefinition cube_r353 = Neck1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(26, 94).addBox(-0.5F, -0.6455F, -0.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0203F, -1.2957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck1.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3113F, -1.885F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(119, 65).addBox(0.0F, -0.8455F, -0.0153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3065F, -2.4222F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(119, 21).addBox(0.0F, -1.3455F, -0.9153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1251F, 0.2431F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(95, 5).mirror().addBox(-1.9348F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6484F, -2.224F, 0.1932F, 0.8537F, -1.2883F));

		PartDefinition cube_r357 = Neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-1.9348F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1484F, -0.224F, 0.4864F, 1.1833F, -0.9406F));

		PartDefinition cube_r358 = Neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(95, 5).addBox(-0.0652F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6484F, -2.224F, 0.1932F, -0.8537F, 1.2883F));

		PartDefinition cube_r359 = Neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 59).addBox(-0.0652F, -0.0436F, -0.7066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1484F, -0.224F, 0.4864F, -1.1833F, 0.9406F));

		PartDefinition cube_r360 = Neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(11, 64).addBox(-0.5F, -0.6455F, -2.8153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -0.8957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1142F, -3.3554F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Neck6.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 119).addBox(0.0F, -1.4455F, -0.0153F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6885F, -0.7201F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Neck6.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(-0.9348F, -0.0436F, -0.7066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0342F, -0.5686F, 0.1096F, 0.7369F, -1.2539F));

		PartDefinition cube_r363 = Neck6.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(114, 76).addBox(-0.0652F, -0.0436F, -0.7066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0342F, -0.5686F, 0.1096F, -0.7369F, 1.2539F));

		PartDefinition cube_r364 = Neck6.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(12, 91).addBox(-0.5F, -0.6455F, -0.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -1.0957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5502F, -1.7776F, 0.499F, -0.0767F, -0.0417F));

		PartDefinition cube_r365 = Neck7.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(19, 91).addBox(0.0F, -1.6455F, 0.1847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 91).addBox(-0.5F, -0.6455F, -0.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -1.0957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Neck7.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(114, 92).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -0.5911F, 0.1192F, 0.7327F, -1.2046F));

		PartDefinition cube_r367 = Neck7.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(114, 92).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -0.5911F, 0.1192F, -0.7327F, 1.2046F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9054F, -1.5919F, 0.2281F, -0.1353F, 0.0214F));

		PartDefinition cube_r368 = Head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(86, 33).addBox(-1.5F, -0.082F, -0.1003F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -1.3022F, -0.1187F, -0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(9, 81).addBox(-2.0F, -0.1001F, -0.1186F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.377F, -0.9285F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 51).addBox(-1.5F, -1.9F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 1.7269F, -1.8748F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(110, 83).addBox(-2.0F, -0.231F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.5F, 2.4039F, -7.6179F, 1.0254F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(77, 110).addBox(-2.0F, -0.3603F, 0.4234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 2.4039F, -7.6179F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(93, 42).addBox(-2.0F, -0.0972F, -0.0977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.5F, 1.4083F, -6.7997F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(99, 54).addBox(-2.0F, -0.1031F, -0.0878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -0.017F, -4.664F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(46, 99).addBox(-2.0F, -0.0781F, -0.1128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 0.3696F, -5.3362F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(93, 50).addBox(-2.0F, -0.0942F, -0.0974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -0.7562F, -3.2348F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(92, 77).addBox(-2.0F, -0.0942F, -0.0974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -0.3961F, -3.9491F, 0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(84, 47).addBox(-2.0F, -0.103F, -0.0866F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.0504F, -2.5088F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(84, 43).addBox(-2.0F, -0.1209F, -0.0868F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, -1.2646F, -1.7473F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(86, 30).addBox(-1.5F, -1.7544F, -0.0293F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 0.6086F, -1.1266F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(86, 27).addBox(-1.5F, -0.6508F, -0.0621F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 1.5587F, -1.1266F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(85, 58).addBox(-1.5F, -0.15F, -0.275F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, 1.1586F, -0.5266F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r383 = Head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(83, 77).addBox(-1.0F, -1.625F, -0.85F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5F, 0.8694F, -0.0076F, 0.0393F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4354F, 0.8576F, -2.2052F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(115, 81).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5535F, -0.3656F, -1.011F, 0.6332F, 0.2123F, 0.0828F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(97, 99).addBox(-0.952F, -0.7873F, -0.5116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(113, 78).addBox(-0.952F, 0.2127F, -1.0116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.0235F, 0.258F, 0.1125F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(99, 93).addBox(-1.0F, -0.2251F, -0.0186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0646F, -2.2346F, 1.2767F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(113, 86).addBox(-0.5F, -0.207F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4354F, -2.1598F, 2.0865F, -0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(115, 62).addBox(-0.9399F, 0.1164F, -1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.1501F, 0.2394F, 0.1487F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(115, 59).addBox(-0.9197F, -0.8813F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.7653F, 0.2916F, 0.1497F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(115, 108).addBox(-0.4797F, -0.4611F, -0.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0798F, 1.6962F, -4.7492F, 0.3298F, 0.395F, -0.107F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(115, 48).addBox(-0.4765F, -0.4619F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0798F, 1.6962F, -4.7492F, 0.677F, 0.2112F, -0.2256F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(115, 111).addBox(-0.5F, -0.482F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1291F, 1.0984F, -4.105F, 0.9695F, 0.1219F, -0.3556F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(115, 45).addBox(-0.5F, -0.4816F, -0.7777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1291F, 1.0984F, -4.105F, 0.8386F, 0.1219F, -0.3556F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(100, 45).addBox(-0.9505F, -0.1156F, -0.1023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0296F, -1.6823F, -0.6052F, 0.3795F, -0.0136F, 0.0234F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(92, 99).addBox(-1.1505F, -0.3906F, 1.3477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4547F, -0.6207F, -2.5588F, 0.3944F, 0.2696F, 0.1392F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(81, 99).addBox(-0.8884F, -0.2369F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4547F, -0.6207F, -2.5588F, 0.486F, 0.1099F, 0.0679F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(77, 113).addBox(-1.0181F, -1.5907F, -0.9373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.6127F, 0.2043F, 0.1432F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(64, 113).addBox(-0.5026F, -0.1753F, -0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3312F, -1.371F, 0.1756F, -1.1737F, 0.0785F, 0.0131F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(105, 61).addBox(-0.6277F, -0.63F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(59, 105).addBox(-0.6277F, -0.83F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(105, 50).addBox(-0.6277F, -1.03F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.7236F, 0.676F, 0.281F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(105, 47).addBox(-0.6277F, -1.0496F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(105, 44).addBox(-0.6277F, -0.6496F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(105, 41).addBox(-0.6277F, -0.8497F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.9068F, 0.676F, 0.281F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(105, 64).addBox(-0.5F, -1.1506F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.7976F, 0.5147F, 0.1071F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(39, 105).addBox(-0.4973F, -1.1961F, -0.2851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.9955F, 0.5272F, 0.038F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(107, 18).addBox(-0.1498F, -2.0968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(106, 56).addBox(-0.1498F, -1.8968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(16, 106).addBox(-0.1498F, -1.6968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -1.2943F, 0.1949F, -0.1612F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(44, 107).addBox(-0.2478F, -1.4806F, -0.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.95F, 0.2749F, -0.1253F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(3, 106).addBox(-0.2478F, -1.5407F, -0.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -1.1551F, 0.2749F, -0.1253F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(24, 107).addBox(-0.3711F, -1.3218F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -0.855F, 0.3861F, -0.0242F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(101, 105).addBox(-0.3607F, -1.3662F, -0.2851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4913F, -0.6709F, -2.1874F, -1.0402F, 0.3785F, -0.0638F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(54, 113).addBox(-0.4125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 113).addBox(-0.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4403F, -0.5106F, -0.5545F, -1.3225F, 0.1928F, 0.0421F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(44, 113).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3565F, -1.4545F, 0.18F, -1.706F, 0.0218F, 0.0141F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(113, 36).addBox(-0.8479F, -0.8344F, -0.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0162F, -1.5028F, -0.5393F, -2.7762F, 0.1885F, 0.0311F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(95, 113).addBox(-0.8671F, -0.8274F, -0.1544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(21, 113).addBox(-0.8671F, -0.8274F, 0.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1162F, -1.2778F, -1.1893F, -2.1599F, 0.2268F, 0.0618F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(114, 21).addBox(-0.8671F, -1.1958F, -1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1162F, -1.2778F, -1.1893F, 2.1598F, 0.2268F, 0.0618F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(29, 114).addBox(-0.5F, -0.3272F, -0.4544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.897F, 0.4152F, -2.4808F, 1.3769F, 0.2485F, 0.1104F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(115, 114).addBox(-0.5038F, -0.5176F, -0.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.251F, 1.2126F, -4.81F, 0.8745F, 0.0446F, -0.0194F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(34, 114).addBox(-0.5038F, -0.6746F, -0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.251F, 1.2126F, -4.81F, 2.4452F, 0.0446F, -0.0194F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(8, 113).addBox(-0.5F, -0.6743F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.897F, 0.4152F, -2.4808F, 1.8568F, 0.2485F, 0.1104F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(90, 113).addBox(-0.8716F, -0.2423F, -1.8478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1162F, -1.2778F, -1.1893F, 1.5053F, 0.2268F, 0.0618F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(112, 100).addBox(-0.8158F, -0.3537F, -2.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0162F, -1.5028F, -0.5393F, 1.5925F, 0.2181F, 0.0574F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(115, 42).addBox(-0.5026F, -0.1747F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3617F, -0.4799F, -0.0646F, 0.8465F, 0.0785F, 0.0131F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(115, 39).addBox(-0.5026F, -0.4376F, -0.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3617F, -0.4799F, -0.0646F, 0.0611F, 0.0785F, 0.0131F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(111, 105).addBox(0.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(105, 111).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7104F, -1.8239F, 1.3557F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(100, 111).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -1.609F, 1.0184F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(99, 69).addBox(0.0F, -0.7F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(85, 111).addBox(0.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7104F, -1.608F, 1.0253F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(3, 112).addBox(0.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7104F, -0.8619F, 0.7688F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(72, 111).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-0.7104F, -0.8619F, 0.7688F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(67, 99).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2104F, 0.1963F, 1.1479F, -3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(112, 3).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2104F, -0.0701F, 0.8495F, -2.2995F, 0.0F, 0.0F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(111, 70).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-0.2104F, -0.4595F, 0.7578F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(59, 111).addBox(0.0F, -0.225F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7104F, -1.0866F, 1.4213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(112, 6).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -1.3335F, 1.5915F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(111, 56).addBox(0.0F, -0.3F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.7104F, -1.368F, 1.5838F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(112, 9).addBox(-0.5F, -0.3294F, -0.1294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(39, 111).addBox(-0.5F, -0.3294F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2104F, -1.8438F, 1.8505F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(112, 97).addBox(-1.0115F, 0.0005F, -2.6139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.2148F, 0.2047F, 0.1304F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(34, 111).addBox(-0.9615F, 0.3269F, -3.2367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.1057F, 0.2047F, 0.1304F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(112, 94).addBox(0.5F, -0.1544F, -0.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3354F, 0.501F, 2.3286F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(115, 33).addBox(0.3F, -0.5761F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1854F, -1.2739F, 2.7036F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(29, 111).addBox(-0.8875F, 0.2395F, -2.9008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.2269F, 0.2573F, 0.1045F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(110, 108).addBox(-0.8875F, 0.4256F, -2.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(110, 111).addBox(-0.8875F, 0.4248F, -1.2888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(95, 110).addBox(-0.8875F, 0.4248F, -1.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.1396F, 0.2573F, 0.1045F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(112, 18).addBox(-0.8875F, 0.4813F, -0.6257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.0088F, 0.2573F, 0.1045F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -0.925F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4645F, -0.0807F, -0.0322F, 0.1983F, 0.1271F, 0.0313F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(16, 112).addBox(-0.5F, 0.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5385F, 0.1501F, -0.5543F, 0.4601F, 0.1271F, 0.0313F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(90, 110).addBox(-1.75F, -0.2249F, -0.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0646F, 2.1463F, -5.5127F, 1.4094F, 0.0F, 0.0F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(99, 77).addBox(0.5F, -0.8044F, -0.7689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.3354F, 0.501F, 2.3286F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 61).addBox(-1.0115F, -1.6123F, -2.7101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(93, 46).addBox(-1.0115F, -0.9123F, -2.1101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2123F, 0.1236F, -1.0958F, 0.6249F, 0.2047F, 0.1304F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.4354F, 0.8576F, -2.2052F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5535F, -0.3656F, -1.011F, 0.6332F, -0.2123F, -0.0828F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(97, 99).mirror().addBox(-0.048F, -0.7873F, -0.5116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(113, 78).mirror().addBox(-0.048F, 0.2127F, -1.0116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.0235F, -0.258F, -0.1125F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(99, 93).mirror().addBox(0.0F, -0.2251F, -0.0186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0646F, -2.2346F, 1.2767F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(113, 86).mirror().addBox(-0.5F, -0.207F, -0.2003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4354F, -2.1598F, 2.0865F, -0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(115, 62).mirror().addBox(-0.0601F, 0.1164F, -1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.1501F, -0.2394F, -0.1487F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(115, 59).mirror().addBox(-0.0803F, -0.8813F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.7653F, -0.2916F, -0.1497F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(115, 108).mirror().addBox(-0.5203F, -0.4611F, -0.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0798F, 1.6962F, -4.7492F, 0.3298F, -0.395F, 0.107F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(115, 48).mirror().addBox(-0.5235F, -0.4619F, -0.3014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0798F, 1.6962F, -4.7492F, 0.677F, -0.2112F, 0.2256F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(115, 111).mirror().addBox(-0.5F, -0.482F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1291F, 1.0984F, -4.105F, 0.9695F, -0.1219F, 0.3556F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(115, 45).mirror().addBox(-0.5F, -0.4816F, -0.7777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1291F, 1.0984F, -4.105F, 0.8386F, -0.1219F, 0.3556F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(100, 45).mirror().addBox(-0.0495F, -0.1156F, -0.1023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.0296F, -1.6823F, -0.6052F, 0.3795F, 0.0136F, -0.0234F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(92, 99).mirror().addBox(0.1505F, -0.3906F, 1.3477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4547F, -0.6207F, -2.5588F, 0.3944F, -0.2696F, -0.1392F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(81, 99).mirror().addBox(-0.1116F, -0.2369F, 0.6576F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4547F, -0.6207F, -2.5588F, 0.486F, -0.1099F, -0.0679F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(77, 113).mirror().addBox(0.0181F, -1.5907F, -0.9373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.6127F, -0.2043F, -0.1432F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(64, 113).mirror().addBox(-0.4974F, -0.1753F, -0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3312F, -1.371F, 0.1756F, -1.1737F, -0.0785F, -0.0131F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(105, 61).mirror().addBox(-0.3723F, -0.63F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(59, 105).mirror().addBox(-0.3723F, -0.83F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(105, 50).mirror().addBox(-0.3723F, -1.03F, -0.1039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.7236F, -0.676F, -0.281F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(105, 47).mirror().addBox(-0.3723F, -1.0496F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(105, 44).mirror().addBox(-0.3723F, -0.6496F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(105, 41).mirror().addBox(-0.3723F, -0.8497F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.9068F, -0.676F, -0.281F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(105, 64).mirror().addBox(-0.5F, -1.1506F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.7976F, -0.5147F, -0.1071F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(39, 105).mirror().addBox(-0.5027F, -1.1961F, -0.2851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.9955F, -0.5272F, -0.038F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(107, 18).mirror().addBox(-0.8502F, -2.0968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(106, 56).mirror().addBox(-0.8502F, -1.8968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(16, 106).mirror().addBox(-0.8502F, -1.6968F, -0.5183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -1.2943F, -0.1949F, 0.1612F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(44, 107).mirror().addBox(-0.7522F, -1.4806F, -0.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.95F, -0.2749F, 0.1253F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(3, 106).mirror().addBox(-0.7522F, -1.5407F, -0.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -1.1551F, -0.2749F, 0.1253F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(24, 107).mirror().addBox(-0.6289F, -1.3218F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -0.855F, -0.3861F, 0.0242F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(101, 105).mirror().addBox(-0.6393F, -1.3662F, -0.2851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4913F, -0.6709F, -2.1874F, -1.0402F, -0.3785F, 0.0638F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(54, 113).mirror().addBox(-0.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(49, 113).mirror().addBox(-0.4125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4403F, -0.5106F, -0.5545F, -1.3225F, -0.1928F, -0.0421F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(44, 113).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3565F, -1.4545F, 0.18F, -1.706F, -0.0218F, -0.0141F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(113, 36).mirror().addBox(-0.1521F, -0.8344F, -0.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0162F, -1.5028F, -0.5393F, -2.7762F, -0.1885F, -0.0311F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-0.1329F, -0.8274F, -0.1544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(21, 113).mirror().addBox(-0.1329F, -0.8274F, 0.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1162F, -1.2778F, -1.1893F, -2.1599F, -0.2268F, -0.0618F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(114, 21).mirror().addBox(-0.1329F, -1.1958F, -1.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1162F, -1.2778F, -1.1893F, 2.1598F, -0.2268F, -0.0618F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(29, 114).mirror().addBox(-0.5F, -0.3272F, -0.4544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.897F, 0.4152F, -2.4808F, 1.3769F, -0.2485F, -0.1104F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(115, 114).mirror().addBox(-0.4962F, -0.5176F, -0.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.251F, 1.2126F, -4.81F, 0.8745F, -0.0446F, 0.0194F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(34, 114).mirror().addBox(-0.4962F, -0.6746F, -0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.251F, 1.2126F, -4.81F, 2.4452F, -0.0446F, 0.0194F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(8, 113).mirror().addBox(-0.5F, -0.6743F, -0.4607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.897F, 0.4152F, -2.4808F, 1.8568F, -0.2485F, -0.1104F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(90, 113).mirror().addBox(-0.1284F, -0.2423F, -1.8478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1162F, -1.2778F, -1.1893F, 1.5053F, -0.2268F, -0.0618F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(112, 100).mirror().addBox(-0.1842F, -0.3537F, -2.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0162F, -1.5028F, -0.5393F, 1.5925F, -0.2181F, -0.0574F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(115, 42).mirror().addBox(-0.4974F, -0.1747F, -0.7528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3617F, -0.4799F, -0.0646F, 0.8465F, -0.0785F, -0.0131F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(115, 39).mirror().addBox(-0.4974F, -0.4376F, -0.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3617F, -0.4799F, -0.0646F, 0.0611F, -0.0785F, -0.0131F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(111, 105).mirror().addBox(-1.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(105, 111).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.8239F, 1.3557F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(100, 111).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.609F, 1.0184F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(99, 69).mirror().addBox(-1.0F, -0.7F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(85, 111).mirror().addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.608F, 1.0253F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(3, 112).mirror().addBox(-1.0F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.8619F, 0.7688F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(72, 111).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.8619F, 0.7688F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(67, 99).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2104F, 0.1963F, 1.1479F, -3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(112, 3).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -0.0701F, 0.8495F, -2.2995F, 0.0F, 0.0F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -0.4595F, 0.7578F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(59, 111).mirror().addBox(-1.0F, -0.225F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.0866F, 1.4213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(112, 6).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.3335F, 1.5915F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-1.0F, -0.3F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.368F, 1.5838F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(112, 9).mirror().addBox(-0.5F, -0.3294F, -0.1294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(39, 111).mirror().addBox(-0.5F, -0.3294F, -0.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -1.8438F, 1.8505F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(112, 97).mirror().addBox(0.0115F, 0.0005F, -2.6139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.2148F, -0.2047F, -0.1304F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(34, 111).mirror().addBox(-0.0385F, 0.3269F, -3.2367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.1057F, -0.2047F, -0.1304F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(112, 94).mirror().addBox(-1.5F, -0.1544F, -0.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3354F, 0.501F, 2.3286F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(115, 33).mirror().addBox(-1.3F, -0.5761F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1854F, -1.2739F, 2.7036F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(29, 111).mirror().addBox(-0.1125F, 0.2395F, -2.9008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.2269F, -0.2573F, -0.1045F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(110, 108).mirror().addBox(-0.1125F, 0.4256F, -2.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(110, 111).mirror().addBox(-0.1125F, 0.4248F, -1.2888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(95, 110).mirror().addBox(-0.1125F, 0.4248F, -1.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.1396F, -0.2573F, -0.1045F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(112, 18).mirror().addBox(-0.1125F, 0.4813F, -0.6257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.0088F, -0.2573F, -0.1045F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.5F, -0.925F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4645F, -0.0807F, -0.0322F, 0.1983F, -0.1271F, -0.0313F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(16, 112).mirror().addBox(-0.5F, 0.025F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5385F, 0.1501F, -0.5543F, 0.4601F, -0.1271F, -0.0313F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(90, 110).mirror().addBox(0.75F, -0.2249F, -0.1724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0646F, 2.1463F, -5.5127F, 1.4094F, 0.0F, 0.0F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(99, 77).mirror().addBox(-1.5F, -0.8044F, -0.7689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.3354F, 0.501F, 2.3286F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(0.0115F, -1.6123F, -2.7101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(93, 46).mirror().addBox(0.0115F, -0.9123F, -2.1101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.2123F, 0.1236F, -1.0958F, 0.6249F, -0.2047F, -0.1304F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2712F, 0.4795F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r506 = Jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(54, 107).mirror().addBox(-0.3F, -0.0486F, -1.7484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(49, 107).mirror().addBox(-0.3F, -0.0486F, -1.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, -0.6065F, -0.0349F, 0.0F));

		PartDefinition cube_r507 = Jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(107, 15).mirror().addBox(-0.3F, -0.0301F, -0.6662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, -0.6458F, -0.0349F, 0.0F));

		PartDefinition cube_r508 = Jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(107, 12).mirror().addBox(-0.2012F, -0.853F, -0.9487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, -0.6021F, -0.1484F, 0.0F));

		PartDefinition cube_r509 = Jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(107, 9).mirror().addBox(-0.2012F, -0.9827F, -1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, -0.384F, -0.1484F, 0.0F));

		PartDefinition cube_r510 = Jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-0.2012F, -0.5856F, -2.2326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 96).mirror().addBox(-0.2012F, -0.2856F, -2.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, -0.1178F, -0.1484F, 0.0F));

		PartDefinition cube_r511 = Jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(95, 107).mirror().addBox(-0.2318F, -0.4994F, -0.7944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.2051F, -0.2705F, 0.0F));

		PartDefinition cube_r512 = Jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(39, 108).mirror().addBox(-0.8164F, -0.8224F, -0.7431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9F, -5.8F, 0.0262F, -0.0087F, 0.0F));

		PartDefinition cube_r513 = Jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(21, 110).mirror().addBox(-0.2318F, -1.2834F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(90, 107).mirror().addBox(-0.2318F, -1.1081F, -0.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.0611F, -0.2705F, 0.0F));

		PartDefinition cube_r514 = Jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(8, 110).mirror().addBox(-0.2318F, -1.2527F, -1.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(34, 108).mirror().addBox(-0.2318F, -1.2143F, -2.4899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.1484F, -0.2705F, 0.0F));

		PartDefinition cube_r515 = Jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-0.2318F, -1.1301F, -1.7466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(109, 91).mirror().addBox(-0.2318F, -1.1301F, -2.2466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.2793F, -0.2705F, 0.0F));

		PartDefinition cube_r516 = Jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(109, 75).mirror().addBox(-0.2318F, -1.2997F, -2.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(72, 108).mirror().addBox(-0.2318F, -0.5366F, -1.9077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.192F, -0.2705F, 0.0F));

		PartDefinition cube_r517 = Jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(109, 67).mirror().addBox(-0.2318F, -1.7944F, -2.8803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(108, 37).mirror().addBox(-0.2318F, -1.5944F, -2.8803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, 0.0262F, -0.2705F, 0.0F));

		PartDefinition cube_r518 = Jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(29, 108).mirror().addBox(-0.2318F, -0.8996F, -2.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.3229F, -0.2705F, 0.0F));

		PartDefinition cube_r519 = Jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(110, 27).mirror().addBox(-0.5F, -0.3678F, -0.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(109, 21).mirror().addBox(-0.5F, -0.5678F, -0.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1086F, -1.1167F, -6.704F, 0.8814F, 0.3403F, -0.1309F));

		PartDefinition cube_r520 = Jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(109, 53).mirror().addBox(-0.5F, -0.3463F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1086F, -1.1167F, -6.704F, 1.6668F, 0.3403F, -0.1309F));

		PartDefinition cube_r521 = Jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(16, 109).mirror().addBox(-1.0414F, -1.7511F, -1.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9F, -5.8F, 0.8814F, -0.0087F, 0.0F));

		PartDefinition cube_r522 = Jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.8164F, -0.9693F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9F, -5.8F, 1.0996F, -0.0087F, 0.0F));

		PartDefinition cube_r523 = Jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(100, 108).mirror().addBox(-0.8164F, -0.7842F, -0.9254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9F, -5.8F, 0.8378F, -0.0087F, 0.0F));

		PartDefinition cube_r524 = Jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(108, 88).mirror().addBox(-0.8164F, -0.2466F, -0.6537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9F, -5.8F, -0.0349F, -0.0087F, 0.0F));

		PartDefinition cube_r525 = Jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-0.2318F, -0.85F, -3.0329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.0349F, -0.2705F, 0.0F));

		PartDefinition cube_r526 = Jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(110, 24).mirror().addBox(-0.2318F, -0.854F, -2.8806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(3, 109).mirror().addBox(-0.2318F, -0.854F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 80).mirror().addBox(-0.2318F, -0.654F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.1222F, -0.2705F, 0.0F));

		PartDefinition cube_r527 = Jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(59, 108).mirror().addBox(-0.2318F, -0.4758F, -1.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.2443F, -0.2705F, 0.0F));

		PartDefinition cube_r528 = Jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(107, 102).mirror().addBox(-0.2318F, -1.0056F, -1.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -3.3F, -0.2356F, -0.2705F, 0.0F));

		PartDefinition cube_r529 = Jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(-0.2012F, -1.3786F, -1.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, 0.1571F, -0.1484F, 0.0F));

		PartDefinition cube_r530 = Jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(-0.2012F, -1.544F, -1.2118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, 0.3142F, -0.1484F, 0.0F));

		PartDefinition cube_r531 = Jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(-0.2012F, -1.6846F, -0.2228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(87, 97).mirror().addBox(-0.2012F, -1.8096F, -0.8228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2F, -1.5F, 1.3614F, -0.1484F, 0.0F));

		PartDefinition cube_r532 = Jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-0.3F, 0.0662F, -1.113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, -0.2531F, -0.0349F, 0.0F));

		PartDefinition cube_r533 = Jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(106, 105).mirror().addBox(-0.3F, -0.1417F, -1.7187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, -0.0349F, -0.0349F, 0.0F));

		PartDefinition cube_r534 = Jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(64, 107).mirror().addBox(-0.3F, -0.0332F, -0.7338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r535 = Jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(106, 72).mirror().addBox(-0.3F, -0.0326F, -0.2008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.2F, -0.1F, 0.0873F, -0.0349F, 0.0F));

		PartDefinition cube_r536 = Jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(54, 107).addBox(-0.7F, -0.0486F, -1.7484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(49, 107).addBox(-0.7F, -0.0486F, -1.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, -0.6065F, 0.0349F, 0.0F));

		PartDefinition cube_r537 = Jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(107, 15).addBox(-0.7F, -0.0301F, -0.6662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, -0.6458F, 0.0349F, 0.0F));

		PartDefinition cube_r538 = Jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(107, 12).addBox(-0.7988F, -0.853F, -0.9487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, -0.6021F, 0.1484F, 0.0F));

		PartDefinition cube_r539 = Jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(107, 9).addBox(-0.7988F, -0.9827F, -1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, -0.384F, 0.1484F, 0.0F));

		PartDefinition cube_r540 = Jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(107, 99).addBox(-0.7988F, -0.5856F, -2.2326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 96).addBox(-0.7988F, -0.2856F, -2.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, -0.1178F, 0.1484F, 0.0F));

		PartDefinition cube_r541 = Jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(95, 107).addBox(-0.7682F, -0.4994F, -0.7944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.2051F, 0.2705F, 0.0F));

		PartDefinition cube_r542 = Jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(39, 108).addBox(-0.1836F, -0.8224F, -0.7431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3F, -0.9F, -5.8F, 0.0262F, 0.0087F, 0.0F));

		PartDefinition cube_r543 = Jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(21, 110).addBox(-0.7682F, -1.2834F, -0.5795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(90, 107).addBox(-0.7682F, -1.1081F, -0.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.0611F, 0.2705F, 0.0F));

		PartDefinition cube_r544 = Jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(8, 110).addBox(-0.7682F, -1.2527F, -1.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(34, 108).addBox(-0.7682F, -1.2143F, -2.4899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.1484F, 0.2705F, 0.0F));

		PartDefinition cube_r545 = Jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(110, 0).addBox(-0.7682F, -1.1301F, -1.7466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(109, 91).addBox(-0.7682F, -1.1301F, -2.2466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.2793F, 0.2705F, 0.0F));

		PartDefinition cube_r546 = Jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(109, 75).addBox(-0.7682F, -1.2997F, -2.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(72, 108).addBox(-0.7682F, -0.5366F, -1.9077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.192F, 0.2705F, 0.0F));

		PartDefinition cube_r547 = Jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(109, 67).addBox(-0.7682F, -1.7944F, -2.8803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(108, 37).addBox(-0.7682F, -1.5944F, -2.8803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, 0.0262F, 0.2705F, 0.0F));

		PartDefinition cube_r548 = Jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(29, 108).addBox(-0.7682F, -0.8996F, -2.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.3229F, 0.2705F, 0.0F));

		PartDefinition cube_r549 = Jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(110, 27).addBox(-0.5F, -0.3678F, -0.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(109, 21).addBox(-0.5F, -0.5678F, -0.6495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1086F, -1.1167F, -6.704F, 0.8814F, -0.3403F, 0.1309F));

		PartDefinition cube_r550 = Jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(109, 53).addBox(-0.5F, -0.3463F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1086F, -1.1167F, -6.704F, 1.6668F, -0.3403F, 0.1309F));

		PartDefinition cube_r551 = Jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(16, 109).addBox(0.0414F, -1.7511F, -1.0556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.9F, -5.8F, 0.8814F, 0.0087F, 0.0F));

		PartDefinition cube_r552 = Jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(105, 108).addBox(-0.1836F, -0.9693F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3F, -0.9F, -5.8F, 1.0996F, 0.0087F, 0.0F));

		PartDefinition cube_r553 = Jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(100, 108).addBox(-0.1836F, -0.7842F, -0.9254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.9F, -5.8F, 0.8378F, 0.0087F, 0.0F));

		PartDefinition cube_r554 = Jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(108, 88).addBox(-0.1836F, -0.2466F, -0.6537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.9F, -5.8F, -0.0349F, 0.0087F, 0.0F));

		PartDefinition cube_r555 = Jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(85, 108).addBox(-0.7682F, -0.85F, -3.0329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.0349F, 0.2705F, 0.0F));

		PartDefinition cube_r556 = Jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(110, 24).addBox(-0.7682F, -0.854F, -2.8806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(3, 109).addBox(-0.7682F, -0.854F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 80).addBox(-0.7682F, -0.654F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.1222F, 0.2705F, 0.0F));

		PartDefinition cube_r557 = Jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(59, 108).addBox(-0.7682F, -0.4758F, -1.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.2443F, 0.2705F, 0.0F));

		PartDefinition cube_r558 = Jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(107, 102).addBox(-0.7682F, -1.0056F, -1.4209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -0.2F, -3.3F, -0.2356F, 0.2705F, 0.0F));

		PartDefinition cube_r559 = Jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(77, 107).addBox(-0.7988F, -1.3786F, -1.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, 0.1571F, 0.1484F, 0.0F));

		PartDefinition cube_r560 = Jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(107, 6).addBox(-0.7988F, -1.544F, -1.2118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, 0.3142F, 0.1484F, 0.0F));

		PartDefinition cube_r561 = Jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(19, 98).addBox(-0.7988F, -1.6846F, -0.2228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(87, 97).addBox(-0.7988F, -1.8096F, -0.8228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3F, -0.2F, -1.5F, 1.3614F, 0.1484F, 0.0F));

		PartDefinition cube_r562 = Jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(107, 3).addBox(-0.7F, 0.0662F, -1.113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, -0.2531F, 0.0349F, 0.0F));

		PartDefinition cube_r563 = Jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(106, 105).addBox(-0.7F, -0.1417F, -1.7187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, -0.0349F, 0.0349F, 0.0F));

		PartDefinition cube_r564 = Jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(64, 107).addBox(-0.7F, -0.0332F, -0.7338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r565 = Jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(106, 72).addBox(-0.7F, -0.0326F, -0.2008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.25F, -0.2F, -0.1F, 0.0873F, 0.0349F, 0.0F));

		PartDefinition Tail1 = Camptosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1472F, -0.339F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.1F, -0.4396F, 0.1186F, -0.0556F));

		PartDefinition cube_r566 = Tail1.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(82, 103).addBox(0.0F, -1.4618F, 0.8024F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 103).addBox(0.0F, -2.8855F, -0.7349F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6488F, 7.4856F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r567 = Tail1.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(21, 102).addBox(0.0F, -0.9297F, 1.3745F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 110).addBox(0.0F, -2.7F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5528F, 2.161F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r568 = Tail1.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8528F, 0.661F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r569 = Tail1.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8528F, 0.661F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r570 = Tail1.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(104, 10).addBox(0.0F, -3.1996F, -0.5288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0914F, 9.2642F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r571 = Tail1.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(10, 104).addBox(0.0F, -3.4995F, -0.5393F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 7.2727F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r572 = Tail1.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(24, 98).addBox(0.0F, -3.6996F, -0.534F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.096F, 5.2682F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r573 = Tail1.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(8, 95).addBox(0.0F, -4.5073F, -0.2446F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0483F, 2.9767F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r574 = Tail1.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(51, 94).addBox(0.0F, -4.4994F, -0.5445F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2006F, 1.28F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5F, -1.3217F, -0.0194F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1528F, 9.561F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r575 = Tail2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3217F, 0.9806F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r576 = Tail2.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(57, 8).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3217F, 0.9806F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r577 = Tail2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(97, 116).addBox(0.0F, -2.6997F, -0.1262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2013F, 5.0693F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r578 = Tail2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(79, 116).addBox(0.0F, -2.9997F, 0.0738F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3276F, 2.9665F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r579 = Tail2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(104, 4).addBox(0.0F, -2.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1945F, 6.3076F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r580 = Tail2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(16, 95).addBox(0.0F, 1.2376F, 3.9887F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 95).addBox(0.0F, -0.026F, 2.4082F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.496F, -2.0754F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r581 = Tail2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(27, 98).addBox(0.0F, -2.8997F, -0.5262F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2918F, 1.7025F, -0.5498F, 0.0F, 0.0F));

		PartDefinition tail = Tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -1.03F, -0.022F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2918F, 7.0025F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r582 = tail.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(33, 117).addBox(0.0F, -0.8607F, 1.2113F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4863F, -0.6949F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(42, 119).addBox(0.0F, -1.0978F, -0.4704F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.659F, 5.3768F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(36, 117).addBox(0.0F, -1.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0157F, 3.3463F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r585 = tail.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(21, 119).addBox(0.0F, -1.5F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9851F, 4.8128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r586 = tail.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(24, 119).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0113F, 2.6589F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r587 = tail.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(13, 110).addBox(0.0F, -5.4996F, 5.4738F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -6.4F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5F, -0.6272F, -0.3026F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.437F, 5.9355F, 0.1936F, -0.1285F, -0.0251F));

		PartDefinition cube_r588 = Tail3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(30, 90).addBox(0.0F, -1.05F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4332F, 5.7557F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r589 = Tail3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(48, 119).addBox(0.0F, -0.6013F, 0.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 119).addBox(0.0F, -1.4083F, -1.0307F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8236F, 1.8294F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r590 = Tail3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(5, 87).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5594F, 1.7954F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r591 = Tail3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(75, 55).addBox(0.0F, -1.55F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5986F, 0.168F, -0.3403F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(38, 28).addBox(-0.5F, -0.3113F, 0.0311F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.236F, 4.5664F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r592 = Tail4.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(119, 73).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3113F, 5.0311F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r593 = Tail4.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(72, 119).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3113F, 3.0311F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r594 = Tail4.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(62, 119).addBox(0.0F, 2.1988F, 8.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 119).addBox(0.0F, 1.5987F, 6.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 51).addBox(0.0F, 0.8987F, 4.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 119).addBox(0.0F, -0.0012F, 2.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0596F, -2.737F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r595 = Tail4.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(17, 34).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3113F, 1.0311F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F))
				.texOffs(85, 119).addBox(0.0F, -0.7F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 119).addBox(0.0F, -0.6F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 89).addBox(0.0F, -0.475F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0988F, 7.1956F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition cube_r596 = Tail5.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(82, 119).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r597 = Tail5.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(100, 119).addBox(0.0F, 6.1988F, 16.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 119).addBox(0.0F, 5.4988F, 14.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 119).addBox(0.0F, 4.6988F, 12.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 119).addBox(0.0F, 2.9988F, 10.8425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1584F, -9.9326F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r598 = Tail5.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(75, 119).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.2992F, 8.6212F, 0.009F, -0.2618F, -0.0023F));

		PartDefinition cube_r599 = Tail6.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(109, 119).addBox(0.0F, 8.6988F, 22.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 119).addBox(0.0F, 7.8987F, 20.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 119).addBox(0.0F, 6.9988F, 18.8425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8592F, -18.5539F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(23, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0007F, 7.9256F, -0.0813F, -0.261F, 0.021F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0236F, 7.9477F, -0.1355F, -0.2595F, 0.035F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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