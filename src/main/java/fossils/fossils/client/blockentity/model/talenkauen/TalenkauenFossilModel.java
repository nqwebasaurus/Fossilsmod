package fossils.fossils.client.blockentity.model.talenkauen;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TalenkauenFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Talenkauen;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Chest;
	private final ModelPart chest2;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Neck8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
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

	public TalenkauenFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Talenkauen = this.fossil.getChild("Talenkauen");
		this.Body = this.Talenkauen.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Chest = this.body2.getChild("Chest");
		this.chest2 = this.Chest.getChild("chest2");
		this.ArmL = this.chest2.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.chest2.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.bone2 = this.chest2.getChild("bone2");
		this.bone3 = this.chest2.getChild("bone3");
		this.Neck1 = this.chest2.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck4 = this.Neck2.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Neck8 = this.Neck7.getChild("Neck8");
		this.Head = this.Neck8.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Tail1 = this.Talenkauen.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.bone = this.Talenkauen.getChild("bone");
		this.bone4 = this.Talenkauen.getChild("bone4");
		this.LegL = this.Talenkauen.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.TarsalsL = this.KneeL.getChild("TarsalsL");
		this.FootL = this.TarsalsL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Talenkauen.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.TarsalsL2 = this.KneeL2.getChild("TarsalsL2");
		this.FootL3 = this.TarsalsL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Talenkauen = fossil.addOrReplaceChild("Talenkauen", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -20.3F, -4.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Talenkauen.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(34, 20).addBox(-0.6F, -1.9479F, -1.0167F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1227F, 6.5662F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Talenkauen.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(15, 45).mirror().addBox(-1.0F, -0.1467F, 2.9177F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 45).addBox(1.0F, -0.1467F, 2.9177F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 29).addBox(0.0F, -0.6467F, 1.9177F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.1227F, 3.5662F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Body = Talenkauen.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.925F, 5.615F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 90).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -4.6904F, -0.0986F, -0.0875F, -0.6578F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -4.6904F, -0.0803F, -0.129F, -1.2041F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(97, 54).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -2.6904F, -0.1751F, -0.1304F, -0.7193F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -2.6904F, -0.1235F, -0.2051F, -1.2667F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.1906F, -0.6904F, -0.2914F, -0.1933F, -0.8227F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 97).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -0.6904F, -0.2914F, 0.1933F, 0.8227F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 65).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -2.6904F, -0.1235F, 0.2051F, 1.2667F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 54).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -2.6904F, -0.1751F, 0.1304F, 0.7193F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 8).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -4.6904F, -0.0803F, 0.129F, 1.2041F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 90).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1906F, -4.6904F, -0.0986F, 0.0875F, 0.6578F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 97).addBox(-0.1F, -2.0397F, -0.0093F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.36F, -1.04F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(55, 89).addBox(-0.1F, -2.2048F, -0.0096F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.36F, -3.04F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 89).addBox(-0.1F, -2.2699F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.26F, -5.04F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.0F, 0.24F, -9.04F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5368F, 0.04F, -5.0331F, -0.0347F, 0.0871F, 0.0046F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(69, 86).addBox(-0.1F, -2.235F, -0.0084F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, -0.3F, -2.0069F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, -0.0127F, 0.2147F, -1.5931F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, 0.0977F, 0.1919F, -1.0587F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 31).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -3.6573F, 0.2195F, 0.0954F, -0.5169F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -1.6573F, 0.0278F, -0.0096F, -0.5592F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.1506F, -1.6573F, -0.0126F, 0.0031F, -1.1036F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(64, 9).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -1.6573F, -0.0126F, -0.0031F, 1.1036F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 96).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -1.6573F, 0.0278F, 0.0096F, 0.5592F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 31).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, 0.2195F, -0.0954F, 0.5169F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 22).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, 0.0977F, -0.1919F, 1.0587F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(31, 96).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.1506F, -3.6573F, -0.0127F, -0.2147F, 1.5931F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 85).addBox(-0.1F, -2.0001F, -0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, -0.3F, -4.0069F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4632F, 0.2F, -4.0069F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 0.1343F, -3.7965F, -0.075F, 0.0903F, 0.0368F));

		PartDefinition cube_r28 = Chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(97, 41).addBox(-0.1F, -1.79F, -0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2157F, -2.0723F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(39, 97).addBox(-0.1F, -1.5448F, 0.0091F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0157F, -4.0723F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5F, -0.4428F, -0.1237F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, 0.5843F, -4.8723F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, 0.1551F, 0.2702F, -0.976F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 96).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, 0.3082F, 0.1338F, -0.4371F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(51, 17).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4163F, -3.6608F, -0.0048F, 0.3106F, -1.5215F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(96, 69).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, 0.2691F, 0.1142F, -0.4775F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, 0.131F, 0.2335F, -1.0175F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2163F, -1.6608F, -0.0058F, 0.2671F, -1.5573F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-0.187F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, 3.5232F, -2.5898F, 0.6229F, -1.0126F, -2.016F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(95, 52).mirror().addBox(0.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, 3.5232F, -2.5898F, 0.3529F, -0.4646F, -1.6323F));

		PartDefinition cube_r39 = Chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.8068F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, 3.5232F, -2.5898F, 0.3494F, 0.4447F, -1.3133F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 98).mirror().addBox(-0.8883F, -0.0228F, -1.7535F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, 3.5232F, -2.5898F, 2.5568F, 0.9767F, 1.1711F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-1.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4616F, 3.5232F, -2.5898F, 1.672F, 1.255F, 0.2085F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.187F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2366F, 2.8232F, -0.9898F, 0.6247F, -1.0143F, -1.9041F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(0.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2366F, 2.8232F, -0.9898F, 0.3532F, -0.4665F, -1.5191F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.8068F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2366F, 2.8232F, -0.9898F, 0.349F, 0.4428F, -1.2001F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-0.8883F, -0.0228F, -1.7536F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2366F, 2.8232F, -0.9898F, 2.5552F, 0.9784F, 1.2832F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-1.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2366F, 2.8232F, -0.9898F, 1.666F, 1.2552F, 0.3161F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 98).addBox(-0.813F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2366F, 2.8232F, -0.9898F, 0.6247F, 1.0143F, 1.9041F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(47, 98).addBox(-1.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2366F, 2.8232F, -0.9898F, 0.3532F, 0.4665F, 1.5191F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 66).addBox(-0.1932F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2366F, 2.8232F, -0.9898F, 0.349F, -0.4428F, 1.2001F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(98, 63).addBox(-0.1117F, -0.0228F, -1.7536F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2366F, 2.8232F, -0.9898F, 2.5552F, -0.9784F, -1.2832F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(96, 29).addBox(0.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2366F, 2.8232F, -0.9898F, 1.666F, -1.2552F, -0.3161F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 62).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, -0.0058F, -0.2671F, 1.5573F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 60).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, 0.131F, -0.2335F, 1.0175F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(96, 69).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2163F, -1.6608F, 0.2691F, -0.1142F, 0.4775F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(98, 15).addBox(-0.813F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4616F, 3.5232F, -2.5898F, 0.6229F, 1.0126F, 2.016F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 52).addBox(-1.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4616F, 3.5232F, -2.5898F, 0.3529F, 0.4646F, 1.6323F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(57, 72).addBox(-0.1932F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4616F, 3.5232F, -2.5898F, 0.3494F, -0.4447F, 1.3133F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(31, 98).addBox(-0.1117F, -0.0228F, -1.7535F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4616F, 3.5232F, -2.5898F, 2.5568F, -0.9767F, -1.1711F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(81, 30).addBox(0.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4616F, 3.5232F, -2.5898F, 1.672F, -1.255F, -0.2085F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 17).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, -0.0048F, -0.3106F, 1.5215F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(48, 96).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, 0.3082F, -0.1338F, 0.4371F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 64).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4163F, -3.6608F, 0.1551F, -0.2702F, 0.976F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0368F, 0.6633F, -4.8199F, 0.0087F, 0.0436F, 0.0004F));

		PartDefinition cube_r63 = chest2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 96).addBox(-0.1F, -1.7931F, 0.0738F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 0.0625F, -1.1092F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 96).addBox(-0.1F, -1.6082F, -0.0308F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 0.6625F, -2.9093F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(96, 77).addBox(-0.1F, -1.345F, 0.0872F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4632F, 1.3625F, -4.9092F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r66 = chest2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5607F, 7.4442F, -2.0967F, 0.0035F, -0.9895F, 0.193F));

		PartDefinition cube_r67 = chest2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5683F, 7.427F, -2.1043F, -0.0954F, -0.6316F, 0.3218F));

		PartDefinition cube_r68 = chest2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5688F, 7.4121F, -2.1052F, -0.0261F, -0.5611F, 0.3365F));

		PartDefinition cube_r69 = chest2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, 0.222F, 0.3955F, -1.0225F));

		PartDefinition cube_r70 = chest2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 10).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, -0.0185F, 0.4503F, -1.595F));

		PartDefinition cube_r71 = chest2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(96, 71).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.903F, -2.4409F, 0.4284F, 0.209F, -0.485F));

		PartDefinition cube_r72 = chest2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, 0.3346F, 0.1593F, -0.4673F));

		PartDefinition cube_r73 = chest2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, 0.1648F, 0.3055F, -1.0073F));

		PartDefinition cube_r74 = chest2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 0.153F, -0.5409F, -0.0158F, 0.3456F, -1.5591F));

		PartDefinition cube_r75 = chest2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 75).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, 0.5422F, 0.2614F, -0.5629F));

		PartDefinition cube_r76 = chest2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, 0.298F, 0.4969F, -1.0941F));

		PartDefinition cube_r77 = chest2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, 1.653F, -4.2409F, -0.0177F, 0.5727F, -1.6991F));

		PartDefinition cube_r78 = chest2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(98, 67).mirror().addBox(-0.5F, -0.2154F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9407F, 5.3228F, -1.2038F, 0.6141F, 0.4308F, -1.6499F));

		PartDefinition cube_r79 = chest2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.8068F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2998F, 4.5599F, -0.2699F, 0.3014F, 0.4509F, -1.5697F));

		PartDefinition cube_r80 = chest2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 2).mirror().addBox(-1.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2998F, 4.5599F, -0.2699F, 1.6888F, 1.2983F, -0.011F));

		PartDefinition cube_r81 = chest2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(0.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2998F, 4.5599F, -0.2699F, 0.3046F, -0.4714F, -1.8462F));

		PartDefinition cube_r82 = chest2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-0.187F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2998F, 4.5599F, -0.2699F, 0.5501F, -1.0343F, -2.1894F));

		PartDefinition cube_r83 = chest2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.8883F, -0.0228F, -1.7535F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2998F, 4.5599F, -0.2699F, 2.6272F, 0.9967F, 0.9942F));

		PartDefinition cube_r84 = chest2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 98).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4365F, 4.7834F, -1.146F, 0.5741F, -0.2686F, -2.1062F));

		PartDefinition cube_r85 = chest2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(3, 99).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3647F, 5.6893F, -0.7284F, 1.6233F, 1.0189F, -0.3038F));

		PartDefinition cube_r86 = chest2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(98, 10).mirror().addBox(0.2011F, 0.098F, 0.9803F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 36).mirror().addBox(-0.7989F, 0.1052F, -0.0197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5132F, 4.8522F, 1.0666F, 0.2025F, 0.3418F, -1.6026F));

		PartDefinition cube_r87 = chest2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-1.6637F, 0.1252F, -0.9072F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5132F, 4.8522F, 1.0666F, 0.9735F, 1.3396F, -0.7104F));

		PartDefinition cube_r88 = chest2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(1.3111F, 0.1252F, -1.848F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5132F, 4.8522F, 1.0666F, 0.2314F, -0.5989F, -1.8034F));

		PartDefinition cube_r89 = chest2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(90, 98).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5101F, 4.7834F, -1.146F, 0.5741F, 0.2686F, 2.1062F));

		PartDefinition cube_r90 = chest2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(3, 99).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4383F, 5.6893F, -0.7284F, 1.6233F, -1.0189F, 0.3038F));

		PartDefinition cube_r91 = chest2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(98, 67).addBox(-0.5F, -0.2154F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0143F, 5.3228F, -1.2038F, 0.6141F, -0.4308F, 1.6499F));

		PartDefinition cube_r92 = chest2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 28).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, -0.0177F, -0.5727F, 1.6991F));

		PartDefinition cube_r93 = chest2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(65, 26).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, 0.298F, -0.4969F, 1.0941F));

		PartDefinition cube_r94 = chest2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(96, 75).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 1.653F, -4.2409F, 0.5422F, -0.2614F, 0.5629F));

		PartDefinition cube_r95 = chest2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(50, 72).addBox(-2.3111F, 0.1252F, -1.848F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5868F, 4.8522F, 1.0666F, 0.2314F, 0.5989F, 1.8034F));

		PartDefinition cube_r96 = chest2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(7, 72).addBox(0.6637F, 0.1252F, -0.9072F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5868F, 4.8522F, 1.0666F, 0.9735F, -1.3396F, 0.7104F));

		PartDefinition cube_r97 = chest2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 36).addBox(-2.2011F, 0.1052F, -0.0197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 10).addBox(-1.2011F, 0.098F, 0.9803F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5868F, 4.8522F, 1.0666F, 0.2025F, -0.3418F, 1.6026F));

		PartDefinition cube_r98 = chest2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(59, 49).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, -0.0158F, -0.3456F, 1.5591F));

		PartDefinition cube_r99 = chest2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 24).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, 0.1648F, -0.3055F, 1.0073F));

		PartDefinition cube_r100 = chest2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(96, 73).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.153F, -0.5409F, 0.3346F, -0.1593F, 0.4673F));

		PartDefinition cube_r101 = chest2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 71).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, 0.4284F, -0.209F, 0.485F));

		PartDefinition cube_r102 = chest2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(10, 98).addBox(-0.1117F, -0.0228F, -1.7535F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3734F, 4.5599F, -0.2699F, 2.6272F, -0.9967F, -0.9942F));

		PartDefinition cube_r103 = chest2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(98, 2).addBox(0.5976F, -0.0211F, -1.1452F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3734F, 4.5599F, -0.2699F, 1.6888F, -1.2983F, 0.011F));

		PartDefinition cube_r104 = chest2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(98, 8).addBox(-0.813F, -0.0226F, -1.0123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3734F, 4.5599F, -0.2699F, 0.5501F, 1.0343F, 2.1894F));

		PartDefinition cube_r105 = chest2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(98, 4).addBox(-1.2466F, -0.021F, -0.3629F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3734F, 4.5599F, -0.2699F, 0.3046F, 0.4714F, 1.8462F));

		PartDefinition cube_r106 = chest2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 72).addBox(-0.1932F, -0.0264F, -0.6134F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3734F, 4.5599F, -0.2699F, 0.3014F, -0.4509F, 1.5697F));

		PartDefinition cube_r107 = chest2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 10).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, -0.0185F, -0.4503F, 1.595F));

		PartDefinition cube_r108 = chest2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(64, 64).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0368F, 0.903F, -2.4409F, 0.222F, -0.3955F, 1.0225F));

		PartDefinition cube_r109 = chest2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3576F, 7.4121F, -2.1052F, -0.0261F, 0.5611F, -0.3365F));

		PartDefinition cube_r110 = chest2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(51, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3581F, 7.427F, -2.1043F, -0.0954F, 0.6316F, -0.3218F));

		PartDefinition cube_r111 = chest2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3657F, 7.4442F, -2.0967F, 0.0035F, 0.9895F, -0.193F));

		PartDefinition cube_r112 = chest2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(86, 69).addBox(-1.217F, -0.0223F, -1.468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2538F, 7.1361F, -1.1584F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(62, 0).addBox(-1.717F, 0.3247F, -3.1689F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2538F, 7.1361F, -1.1584F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, -0.6485F, -0.2526F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4632F, 2.1625F, -5.3093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition ArmL = chest2.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3843F, 5.4037F, -3.5159F, 0.7541F, 0.2598F, -0.1559F));

		PartDefinition cube_r115 = ArmL.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, -0.125F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2248F, 5.7394F, 3.4206F, -1.0291F, -0.0025F, -0.0078F));

		PartDefinition cube_r116 = ArmL.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 18).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.2306F, 6.4216F, 3.2636F, -0.2262F, -0.0025F, -0.0078F));

		PartDefinition cube_r117 = ArmL.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 75).addBox(-0.5F, -1.075F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.2261F, 5.7411F, 2.9243F, 0.2974F, -0.0025F, -0.0078F));

		PartDefinition cube_r118 = ArmL.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 63).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.2F, 1.6521F, 0.6073F, 0.5155F, -0.0025F, -0.0078F));

		PartDefinition cube_r119 = ArmL.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5F, -0.15F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2F, 1.6131F, 0.0357F, 0.5864F, -0.007F, -0.0192F));

		PartDefinition cube_r120 = ArmL.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2F, 1.5434F, 0.1116F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r121 = ArmL.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 84).addBox(-0.5F, -1.15F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(83, 10).addBox(-0.5F, -1.15F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r122 = ArmL.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(25, 80).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 1.5443F, 1.1442F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r123 = ArmL.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 80).addBox(-0.5F, -0.85F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.2F, 0.6231F, 0.3217F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 7.5854F, 2.9866F, -0.1648F, -0.695F, 0.3718F));

		PartDefinition cube_r124 = ElbowL.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 85).addBox(-0.5F, -2.1027F, -0.1842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(85, 60).addBox(-0.5F, -1.9027F, -0.1842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.5413F, -2.4032F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r125 = ElbowL.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(44, 56).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5F, -0.8085F, -1.135F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r126 = ElbowL.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(5, 84).addBox(0.0F, -0.975F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(69, 83).addBox(0.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, -0.1066F, -0.4839F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r127 = ElbowL.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(83, 0).addBox(0.0F, -1.275F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 54).addBox(0.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, 0.3629F, -1.3668F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r128 = ElbowL.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 75).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5F, 1.0464F, -3.7493F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r129 = ElbowL.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(35, 45).addBox(-0.5F, -0.25F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 0.3301F, -1.3536F, -1.3003F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.9614F, -6.2949F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r130 = HandL.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(92, 81).addBox(-1.025F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 92).addBox(-1.025F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, 0.1213F, 0.0493F));

		PartDefinition cube_r131 = HandL.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(87, 92).addBox(-1.025F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(92, 81).addBox(-1.025F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6051F, 0.1213F, 0.0493F));

		PartDefinition ArmL2 = chest2.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3107F, 5.4037F, -3.5159F, 0.4701F, -0.3002F, 0.2364F));

		PartDefinition cube_r132 = ArmL2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(14, 69).addBox(-0.5F, -0.125F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2248F, 5.7394F, 3.4206F, -1.0291F, 0.0025F, 0.0078F));

		PartDefinition cube_r133 = ArmL2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(56, 83).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.2306F, 6.4216F, 3.2636F, -0.2262F, 0.0025F, 0.0078F));

		PartDefinition cube_r134 = ArmL2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(76, 14).addBox(-0.5F, -1.075F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.2261F, 5.7411F, 2.9243F, 0.2974F, 0.0025F, 0.0078F));

		PartDefinition cube_r135 = ArmL2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(31, 64).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.2F, 1.6521F, 0.6073F, 0.5155F, 0.0025F, 0.0078F));

		PartDefinition cube_r136 = ArmL2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, -0.15F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 1.6131F, 0.0357F, 0.5864F, 0.007F, 0.0192F));

		PartDefinition cube_r137 = ArmL2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 38).addBox(-0.5F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.2F, 1.5434F, 0.1116F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r138 = ArmL2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(35, 84).addBox(-0.5F, -1.15F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(15, 83).addBox(-0.5F, -1.15F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r139 = ArmL2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(80, 50).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 1.5443F, 1.1442F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r140 = ArmL2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(46, 80).addBox(-0.5F, -0.85F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(-0.2F, 0.6231F, 0.3217F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 7.5854F, 2.9866F, 0.1208F, 0.651F, 0.0734F));

		PartDefinition cube_r141 = ElbowL2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -2.1027F, -0.1842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(79, 85).addBox(-0.5F, -1.9027F, -0.1842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.5413F, -2.4032F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r142 = ElbowL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(49, 56).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5F, -0.8085F, -1.135F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r143 = ElbowL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(50, 84).addBox(-1.0F, -0.975F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(45, 84).addBox(-1.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, -0.1066F, -0.4839F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r144 = ElbowL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 83).addBox(-1.0F, -1.275F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 3).addBox(-1.0F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, 0.3629F, -1.3668F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r145 = ElbowL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 1.0464F, -3.7493F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r146 = ElbowL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 69).addBox(-0.5F, -0.25F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.3301F, -1.3536F, -1.3003F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 0.9614F, -6.2949F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r147 = HandL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(23, 93).addBox(0.025F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(28, 93).addBox(0.025F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6051F, -0.1213F, -0.0493F));

		PartDefinition cube_r148 = HandL2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(28, 93).addBox(0.025F, -0.6F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(23, 93).addBox(0.025F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.387F, -0.1213F, -0.0493F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0365F, 4.9101F, -3.99F, 0.0349F, 0.0842F, 0.0903F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 90).addBox(-0.5F, 0.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(89, 89).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0568F, -4.4419F, 3.6255F, -0.1735F, -0.2452F, -0.1688F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(89, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1325F, -3.7778F, 4.3693F, 0.8737F, -0.2452F, -0.1688F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, -1.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0661F, -3.4741F, 4.3114F, 1.7028F, -0.2452F, -0.1688F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(64, 70).addBox(-0.4815F, -0.0704F, -0.0541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.164F, -2.5665F, 1.291F, 1.0221F, -0.2452F, -0.1688F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(36, 64).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4813F, -2.7612F, 2.4865F, 0.5247F, -0.2452F, -0.1688F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(93, 66).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(18, 90).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5877F, 0.6831F, -1.2251F, 0.703F, 0.0116F, 0.3076F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(43, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2949F, -0.2471F, -1.4463F, 1.7938F, 0.0116F, 0.3076F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 92).addBox(-0.527F, -1.1815F, 0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5251F, 0.6012F, -0.5496F, 1.0521F, 0.0116F, 0.3076F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(43, 70).addBox(-0.527F, -0.0575F, -0.9532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5251F, 0.6012F, -0.5496F, 1.7066F, 0.0116F, 0.3076F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.0467F, -2.0168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.164F, -2.0288F, 0.8396F, 0.4166F, 0.0F, 0.0F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(56, 24).addBox(-0.5F, -0.0467F, -0.2169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.164F, -0.4665F, -0.4091F, 0.8965F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9629F, 4.9101F, -3.99F, 0.0349F, -0.0842F, -0.0903F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.5F, 0.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(89, 89).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0568F, -4.4419F, 3.6255F, -0.1735F, 0.2452F, 0.1688F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.1325F, -3.7778F, 4.3693F, 0.8737F, 0.2452F, 0.1688F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -1.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(1.0661F, -3.4741F, 4.3114F, 1.7028F, 0.2452F, 0.1688F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(-0.5185F, -0.0704F, -0.0541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.164F, -2.5665F, 1.291F, 1.0221F, 0.2452F, 0.1688F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4813F, -2.7612F, 2.4865F, 0.5247F, 0.2452F, 0.1688F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(18, 90).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5877F, 0.6831F, -1.2251F, 0.703F, -0.0116F, -0.3076F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(43, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2949F, -0.2471F, -1.4463F, 1.7938F, -0.0116F, -0.3076F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(-0.473F, -1.1815F, 0.2666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5251F, 0.6012F, -0.5496F, 1.0521F, -0.0116F, -0.3076F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-0.473F, -0.0575F, -0.9532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5251F, 0.6012F, -0.5496F, 1.7066F, -0.0116F, -0.3076F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5F, -0.0467F, -2.0168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.164F, -2.0288F, 0.8396F, 0.4166F, 0.0F, 0.0F));

		PartDefinition cube_r170 = bone3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(56, 24).mirror().addBox(-0.5F, -0.0467F, -0.2169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.164F, -0.4665F, -0.4091F, 0.8965F, 0.0F, 0.0F));

		PartDefinition Neck1 = chest2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 1.9715F, -5.4715F, 0.8769F, 0.084F, 0.1005F));

		PartDefinition cube_r171 = Neck1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(97, 33).addBox(-0.6F, -1.1826F, -0.0154F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.76F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Neck1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(65, 32).addBox(-1.0F, -0.3643F, 0.9478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.76F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Neck1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(96, 95).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0185F, -0.5694F, 0.1565F, 0.0334F, -0.695F));

		PartDefinition cube_r174 = Neck1.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0185F, -0.5694F, 0.0756F, 0.1064F, -1.2361F));

		PartDefinition cube_r175 = Neck1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 30).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0185F, -0.5694F, 0.0756F, -0.1064F, 1.2361F));

		PartDefinition cube_r176 = Neck1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(96, 95).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0185F, -0.5694F, 0.1565F, -0.0334F, 0.695F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1987F, -1.5094F, -0.1403F, 0.2882F, -0.1661F));

		PartDefinition cube_r177 = Neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(100, 33).addBox(-0.6F, -0.9569F, -0.1512F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9409F, -2.1937F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(36, 97).addBox(-0.6F, -1.3569F, -0.1512F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4746F, -0.6641F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 0).mirror().addBox(0.7255F, -1.0466F, -1.0372F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.1948F, -0.81F, 0.2969F, 0.4686F, -0.947F));

		PartDefinition cube_r180 = Neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(98, 0).addBox(-1.7255F, -1.0466F, -1.0372F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 32).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, -0.1948F, -0.81F, 0.2969F, -0.4686F, 0.947F));

		PartDefinition cube_r181 = Neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(54, 39).addBox(-1.0F, -0.4569F, 0.8488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.28F, -3.06F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck2.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7928F, -2.2888F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(56, 80).addBox(-0.1F, -0.7898F, -0.4007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 66).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.44F, -1.5F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Neck4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(0.0802F, -0.2093F, -1.0017F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0876F, -0.5239F, 0.2366F, 0.9882F, -1.2582F));

		PartDefinition cube_r184 = Neck4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(97, 6).addBox(-1.0802F, -0.2093F, -1.0017F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0876F, -0.5239F, 0.2366F, -0.9882F, 1.2582F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2519F, -1.8251F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Neck5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(15, 99).addBox(-0.1F, -0.7398F, -0.4007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 66).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5F, -0.6332F, -1.4482F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(97, 37).mirror().addBox(0.117F, -0.2366F, -0.9168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0604F, -0.5988F, 0.3775F, 1.0056F, -1.2337F));

		PartDefinition cube_r187 = Neck5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(97, 37).addBox(-1.117F, -0.2366F, -0.9168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0604F, -0.5988F, 0.3775F, -1.0056F, 1.2337F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5428F, -1.6839F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Neck6.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(18, 99).addBox(-0.1F, -0.7148F, -0.4007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 67).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.3106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Neck6.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(0.1404F, -0.0996F, -1.0526F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0824F, -0.5149F, 0.1048F, 0.7938F, -1.3359F));

		PartDefinition cube_r190 = Neck6.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 39).addBox(-1.1404F, -0.0996F, -1.0526F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0824F, -0.5149F, 0.1048F, -0.7938F, 1.3359F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Neck7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(30, 100).addBox(-0.1F, -0.7148F, -0.4007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 51).addBox(-0.5F, -0.3148F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.5106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Neck7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(97, 81).mirror().addBox(0.0937F, -0.1F, -0.9251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0824F, -0.7149F, 0.1048F, 0.7938F, -1.3359F));

		PartDefinition cube_r193 = Neck7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 81).addBox(-1.0937F, -0.1F, -0.9251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0824F, -0.7149F, 0.1048F, -0.7938F, 1.3359F));

		PartDefinition Neck8 = Neck7.addOrReplaceChild("Neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.775F, -1.8F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Neck8.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(33, 100).addBox(-0.1F, -1.1148F, -0.4007F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1881F, -1.6106F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Neck8.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 92).mirror().addBox(0.1927F, -0.1148F, -0.9508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3824F, -0.8149F, 0.1048F, 0.7938F, -1.3359F));

		PartDefinition cube_r196 = Neck8.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 92).addBox(-1.1927F, -0.1148F, -0.9508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3824F, -0.8149F, 0.1048F, -0.7938F, 1.3359F));

		PartDefinition cube_r197 = Neck8.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 29).addBox(-0.5F, -0.3148F, -1.4007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1881F, -1.6106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head = Neck8.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.6753F, -2.3983F, 0.3648F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(28, 71).addBox(-2.003F, -0.0001F, -0.8686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.999F, -0.9905F, 0.0302F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(50, 68).addBox(-1.0F, -1.85F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 1.4696F, -1.6611F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5585F, -5.1997F, 1.0952F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 78).addBox(-2.0F, -0.2167F, -0.7904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.5F, 1.1131F, -4.8136F, 0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(86, 75).addBox(-2.0F, -0.1485F, -0.8472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.6175F, -4.3136F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(86, 72).addBox(-2.0F, -0.1053F, -0.9077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.5F, 0.1289F, -3.6679F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 79).addBox(-2.0F, -0.1031F, -0.9128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -0.3461F, -3.0179F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(15, 79).addBox(-1.5F, -0.0942F, -0.0974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -0.3461F, -3.0357F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(36, 68).addBox(-2.003F, -0.103F, -0.9117F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.003F, -0.9F, -1.5171F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(7, 68).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.9019F, -1.534F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(76, 11).addBox(-1.5F, -0.675F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(10, 76).addBox(-1.5F, -0.675F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.5F, 1.1586F, -0.5266F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9354F, 0.8576F, -2.4052F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(91, 19).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 12).addBox(-0.9F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0316F, -1.5103F, 0.1711F, 0.3964F, 0.1065F, 0.0209F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 89).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5566F, -0.6392F, -0.6592F, 0.6332F, 0.2123F, 0.0828F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 89).addBox(-0.8908F, -0.7747F, -0.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2754F, 0.3667F, -0.7452F, 0.4534F, 0.2223F, 0.0561F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 88).addBox(-0.5458F, -0.676F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6759F, 0.6466F, -0.853F, 0.1138F, 0.2183F, 0.0625F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 88).addBox(-0.5571F, -0.6664F, -0.6885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6759F, 0.6466F, -0.853F, 0.2385F, 0.1967F, 0.0966F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(88, 66).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.294F, -0.7135F, -1.286F, 0.6362F, 0.2152F, 0.088F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 63).addBox(-0.9897F, -0.7585F, -1.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4552F, 0.2043F, 0.0789F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(60, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7489F, 1.1793F, -2.5816F, -0.5194F, 0.1184F, -0.06F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 88).addBox(-0.494F, -0.5248F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7468F, 0.9622F, -2.4591F, -0.5252F, 0.129F, -0.1118F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(88, 16).addBox(-0.4907F, -0.7491F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.7468F, 0.9622F, -2.4591F, -0.5247F, 0.1312F, -0.108F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(91, 31).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8243F, 1.3565F, -3.1912F, 2.482F, 0.0756F, -0.1379F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(91, 28).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(91, 25).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7411F, 1.5817F, -2.5112F, 1.8275F, 0.0756F, -0.1379F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(91, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.7807F, 1.3019F, -2.5221F, 0.824F, 0.0756F, -0.1379F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8888F, 1.0157F, -2.3558F, 0.6981F, 0.1658F, -0.084F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 3).addBox(-0.775F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 0.9999F, -2.0174F, 1.0458F, 0.1828F, -0.0825F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 0).addBox(-0.7878F, -0.52F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(84, 87).addBox(-0.7878F, -0.72F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F))
				.texOffs(87, 54).addBox(-0.7878F, -0.92F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0549F, -0.8261F, -0.9147F, -1.1909F, 0.6621F, 0.0548F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(50, 87).addBox(-0.7878F, -0.9092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(87, 45).addBox(-0.7878F, -0.5092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(45, 87).addBox(-0.7878F, -0.7092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0549F, -0.8261F, -0.9147F, -1.3742F, 0.6621F, 0.0548F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 39).addBox(-0.3939F, -0.4803F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 36).addBox(-0.5689F, -0.4803F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, -1.3265F, 0.0785F, 0.0175F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(82, 90).addBox(-0.5445F, -0.8846F, -0.3672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 51).addBox(-0.5445F, -0.8846F, -0.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, -1.1615F, 0.0801F, 0.0444F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5445F, -0.6308F, -0.9089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, -1.5542F, 0.0801F, 0.0444F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(90, 48).addBox(-0.5384F, -0.0924F, -0.3649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, -2.5994F, 0.1658F, 0.0612F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(45, 90).addBox(-0.5384F, -0.4076F, -0.0949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, -2.9921F, 0.1658F, 0.0612F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(90, 60).addBox(-0.5528F, -0.0434F, -0.5147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, 1.0195F, 0.1308F, 0.0423F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(90, 57).addBox(-0.5464F, -0.4632F, -0.9438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, 1.7197F, 0.1399F, 0.0573F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(35, 87).addBox(-0.5384F, -0.8941F, -0.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3387F, -0.5068F, 0.1452F, 2.4184F, 0.1658F, 0.0612F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(20, 96).addBox(-0.325F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 18).addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5104F, -1.6501F, 1.8546F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 96).addBox(0.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(96, 12).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7104F, -1.6239F, 1.5557F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(95, 46).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -1.409F, 1.2184F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(94, 84).addBox(0.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.7104F, -1.0124F, 1.1662F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(10, 95).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2104F, -1.0124F, 1.1662F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(5, 96).addBox(0.0F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(91, 95).addBox(0.0F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7104F, -0.8866F, 1.6213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(73, 94).addBox(-0.5F, -1.6044F, -0.1794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2104F, -0.3489F, 1.0786F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.87F, 0.7831F, -1.8202F, 0.2385F, 0.1117F, 0.0703F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 95).addBox(0.5F, -0.2794F, -0.8439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3354F, 0.5011F, 2.3286F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(95, 49).addBox(-0.65F, -0.3682F, -0.6483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(94, 87).addBox(-0.35F, -0.3682F, -0.6483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3354F, -1.7318F, 2.4617F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 90).addBox(-0.65F, -0.084F, -0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 87).addBox(-0.35F, -0.084F, -0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.3354F, -1.7318F, 2.4617F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(82, 45).addBox(-0.5F, -0.5125F, -0.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F))
				.texOffs(82, 42).addBox(-0.5F, -0.5125F, -0.6096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.8129F, 0.8607F, -1.1459F, 0.2635F, 0.3165F, 0.0367F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, -0.5232F, -0.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.8129F, 0.8607F, -1.1459F, 0.1762F, 0.3165F, 0.0367F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -1.9824F, -0.698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4354F, 0.7155F, 0.6373F, 0.242F, 0.1271F, 0.0313F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 95).addBox(0.5F, -0.6794F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3354F, 0.5011F, 2.3286F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.8874F, 0.3039F, -1.8576F, 0.7502F, 0.0808F, 0.0477F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9354F, 0.8576F, -2.4052F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 12).mirror().addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0316F, -1.5103F, 0.1711F, 0.3964F, -0.1065F, -0.0209F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5566F, -0.6392F, -0.6592F, 0.6332F, -0.2123F, -0.0828F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.1092F, -0.7747F, -0.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2754F, 0.3667F, -0.7452F, 0.4534F, -0.2223F, -0.0561F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(77, 88).mirror().addBox(-0.4542F, -0.676F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6759F, 0.6466F, -0.853F, 0.1138F, -0.2183F, -0.0625F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(72, 88).mirror().addBox(-0.4429F, -0.6664F, -0.6885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6759F, 0.6466F, -0.853F, 0.2385F, -0.1967F, -0.0966F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(88, 66).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.294F, -0.7135F, -1.286F, 0.6362F, -0.2152F, -0.088F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-0.0103F, -0.7585F, -1.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4552F, -0.2043F, -0.0789F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7489F, 1.1793F, -2.5816F, -0.5194F, -0.1184F, 0.06F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.506F, -0.5248F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7468F, 0.9622F, -2.4591F, -0.5252F, -0.129F, 0.1118F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(88, 16).mirror().addBox(-0.5093F, -0.7491F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.7468F, 0.9622F, -2.4591F, -0.5247F, -0.1312F, 0.108F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.8243F, 1.3565F, -3.1912F, 2.482F, -0.0756F, 0.1379F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(91, 25).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7411F, 1.5817F, -2.5112F, 1.8275F, -0.0756F, 0.1379F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.7807F, 1.3019F, -2.5221F, 0.824F, -0.0756F, 0.1379F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8888F, 1.0157F, -2.3558F, 0.6981F, -0.1658F, 0.084F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 3).mirror().addBox(-0.225F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5521F, 0.9999F, -2.0174F, 1.0458F, -0.1828F, 0.0825F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.2122F, -0.52F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(84, 87).mirror().addBox(-0.2122F, -0.72F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(87, 54).mirror().addBox(-0.2122F, -0.92F, -0.3814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0549F, -0.8261F, -0.9147F, -1.1909F, -0.6621F, -0.0548F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.2122F, -0.9092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(87, 45).mirror().addBox(-0.2122F, -0.5092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(45, 87).mirror().addBox(-0.2122F, -0.7092F, -0.4698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0549F, -0.8261F, -0.9147F, -1.3742F, -0.6621F, -0.0548F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-0.6061F, -0.4803F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 36).mirror().addBox(-0.4311F, -0.4803F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, -1.3265F, -0.0785F, -0.0175F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-0.4555F, -0.8846F, -0.3672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 51).mirror().addBox(-0.4555F, -0.8846F, -0.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, -1.1615F, -0.0801F, -0.0444F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-0.4555F, -0.6308F, -0.9089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, -1.5542F, -0.0801F, -0.0444F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-0.4616F, -0.0924F, -0.3649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, -2.5994F, -0.1658F, -0.0612F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(45, 90).mirror().addBox(-0.4616F, -0.4076F, -0.0949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, -2.9921F, -0.1658F, -0.0612F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-0.4472F, -0.0434F, -0.5147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, 1.0195F, -0.1308F, -0.0423F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(90, 57).mirror().addBox(-0.4535F, -0.4632F, -0.9438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, 1.7197F, -0.1399F, -0.0573F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.4616F, -0.8941F, -0.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3387F, -0.5068F, 0.1452F, 2.4184F, -0.1658F, -0.0612F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.675F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 18).mirror().addBox(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5104F, -1.6501F, 1.8546F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-1.0F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(96, 12).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.6239F, 1.5557F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(95, 46).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.409F, 1.2184F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(94, 84).mirror().addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -1.0124F, 1.1662F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -1.0124F, 1.1662F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-1.0F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(91, 95).mirror().addBox(-1.0F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.7104F, -0.8866F, 1.6213F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(73, 94).mirror().addBox(-0.5F, -1.6044F, -0.1794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2104F, -0.3489F, 1.0786F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.87F, 0.7831F, -1.8202F, 0.2385F, -0.1117F, -0.0703F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.5F, -0.2794F, -0.8439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3354F, 0.5011F, 2.3286F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(-0.35F, -0.3682F, -0.6483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(94, 87).mirror().addBox(-0.65F, -0.3682F, -0.6483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3354F, -1.7318F, 2.4617F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-0.35F, -0.084F, -0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 87).mirror().addBox(-0.65F, -0.084F, -0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.3354F, -1.7318F, 2.4617F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(82, 45).mirror().addBox(-0.5F, -0.5125F, -0.9096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false)
				.texOffs(82, 42).mirror().addBox(-0.5F, -0.5125F, -0.6096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.8129F, 0.8607F, -1.1459F, 0.2635F, -0.3165F, -0.0367F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5F, -0.5232F, -0.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.8129F, 0.8607F, -1.1459F, 0.1762F, -0.3165F, -0.0367F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.5F, -1.9824F, -0.698F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4354F, 0.7155F, 0.6373F, 0.242F, -0.1271F, -0.0313F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-1.5F, -0.6794F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3354F, 0.5011F, 2.3286F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.8874F, 0.3039F, -1.8576F, 0.7502F, -0.0808F, -0.0477F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5762F, -0.3962F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r291 = Jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.5F, -0.3F, -0.6965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, -0.0092F, -0.0485F, 0.0198F));

		PartDefinition cube_r292 = Jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.5F, -0.5F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 60).mirror().addBox(-0.5F, -0.7F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, -1.0477F, -0.0485F, 0.0198F));

		PartDefinition cube_r293 = Jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(38, 94).mirror().addBox(-0.5F, -1.0787F, -0.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 1.518F, -0.0485F, 0.0198F));

		PartDefinition cube_r294 = Jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(53, 94).mirror().addBox(-0.5F, -0.1944F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, -0.5764F, -0.0485F, 0.0198F));

		PartDefinition cube_r295 = Jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-0.5F, 0.0586F, -0.9965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, -1.2309F, -0.0485F, 0.0198F));

		PartDefinition cube_r296 = Jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-0.5F, -0.8024F, 0.4265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 2.9753F, -0.0485F, 0.0198F));

		PartDefinition cube_r297 = Jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.5F, -0.8227F, 0.3005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 2.7571F, -0.0485F, 0.0198F));

		PartDefinition cube_r298 = Jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(63, 94).mirror().addBox(-0.5F, 0.3289F, -0.2561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, -2.0163F, -0.0485F, 0.0198F));

		PartDefinition cube_r299 = Jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.5F, -1.4555F, 0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(68, 94).mirror().addBox(-0.5F, -1.4555F, 1.2856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 2.2772F, -0.0485F, 0.0198F));

		PartDefinition cube_r300 = Jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(58, 91).mirror().addBox(-0.5F, -2.0177F, 0.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(91, 72).mirror().addBox(-0.5F, -2.4177F, 0.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 1.9717F, -0.0485F, 0.0198F));

		PartDefinition cube_r301 = Jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(63, 91).mirror().addBox(-0.5F, -1.0219F, 1.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(68, 91).mirror().addBox(-0.5F, -0.6219F, 1.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(91, 69).mirror().addBox(-0.5F, -0.6969F, 1.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 0.1653F, 0.226F, 2.8706F, -0.0485F, 0.0198F));

		PartDefinition cube_r302 = Jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(73, 91).mirror().addBox(-0.6606F, -0.3438F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, 3.114F, -0.2691F, -0.0041F));

		PartDefinition cube_r303 = Jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-0.6606F, 0.033F, -0.523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, -3.0383F, -0.2691F, -0.0041F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(91, 78).mirror().addBox(-0.6606F, -0.3525F, -0.0517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, 3.0791F, -0.2691F, -0.0041F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.6606F, -0.5459F, -1.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, -0.1934F, -0.2691F, -0.0041F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.6606F, 0.3413F, -0.5912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, -1.7205F, -0.2691F, -0.0041F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.2583F, -0.746F, -0.9773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.1653F, -3.374F, -0.2077F, -0.0914F, -0.0528F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(92, 34).mirror().addBox(-0.2583F, -0.9695F, -0.3129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.1653F, -3.374F, 0.7958F, -0.0914F, -0.0528F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.6606F, -1.7264F, 0.0047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, 1.5258F, -0.2691F, -0.0041F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-0.2583F, -0.7342F, -1.378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.1653F, -3.374F, -0.2252F, -0.0914F, -0.0528F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-0.2583F, -1.7247F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(92, 43).mirror().addBox(-0.2583F, -1.9247F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.1653F, -3.374F, 0.9966F, -0.0914F, -0.0528F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.6109F, -1.5691F, 0.3066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.1653F, -2.274F, 1.6126F, -0.2255F, -0.0022F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(95, 60).addBox(-0.5F, -0.7F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(95, 57).addBox(-0.5F, -0.5F, -0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, -1.0477F, 0.0485F, -0.0198F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(91, 72).addBox(-0.5F, -2.4177F, 0.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 91).addBox(-0.5F, -2.0177F, 0.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 1.9717F, 0.0485F, -0.0198F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(68, 94).addBox(-0.5F, -1.4555F, 1.2856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 91).addBox(-0.5F, -1.4555F, 0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 2.2772F, 0.0485F, -0.0198F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(21, 71).addBox(-0.5F, -0.8227F, 0.3005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 2.7571F, 0.0485F, -0.0198F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(91, 69).addBox(-0.5F, -0.6969F, 1.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(68, 91).addBox(-0.5F, -0.6219F, 1.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(63, 91).addBox(-0.5F, -1.0219F, 1.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 2.8706F, 0.0485F, -0.0198F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(91, 75).addBox(-0.3394F, 0.033F, -0.523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, -3.0383F, 0.2691F, 0.0041F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(92, 6).addBox(-0.3394F, 0.3413F, -0.5912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, -1.7205F, 0.2691F, 0.0041F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(35, 80).addBox(-0.3891F, -1.5691F, 0.3066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, 1.6126F, 0.2255F, 0.0022F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(30, 80).addBox(-0.3394F, -1.7264F, 0.0047F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, 1.5258F, 0.2691F, 0.0041F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(92, 34).addBox(-0.7417F, -0.9695F, -0.3129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.375F, 0.1653F, -3.374F, 0.7958F, 0.0914F, 0.0528F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(92, 43).addBox(-0.7417F, -1.9247F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 40).addBox(-0.7417F, -1.7247F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.375F, 0.1653F, -3.374F, 0.9966F, 0.0914F, 0.0528F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(92, 37).addBox(-0.7417F, -0.7342F, -1.378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.375F, 0.1653F, -3.374F, -0.2252F, 0.0914F, 0.0528F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(10, 92).addBox(-0.7417F, -0.746F, -0.9773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.375F, 0.1653F, -3.374F, -0.2077F, 0.0914F, 0.0528F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 92).addBox(-0.3394F, -0.5459F, -1.7355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, -0.1934F, 0.2691F, 0.0041F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(91, 78).addBox(-0.3394F, -0.3525F, -0.0517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, 3.0791F, 0.2691F, 0.0041F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(73, 91).addBox(-0.3394F, -0.3438F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.325F, 0.1653F, -2.274F, 3.114F, 0.2691F, 0.0041F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(71, 19).addBox(-0.5F, -0.8024F, 0.4265F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 2.9753F, 0.0485F, -0.0198F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(38, 94).addBox(-0.5F, -1.0787F, -0.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, 1.518F, 0.0485F, -0.0198F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(63, 94).addBox(-0.5F, 0.3289F, -0.2561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, -2.0163F, 0.0485F, -0.0198F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(58, 94).addBox(-0.5F, 0.0586F, -0.9965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, -1.2309F, 0.0485F, -0.0198F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(53, 94).addBox(-0.5F, -0.1944F, -0.8657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, -0.5764F, 0.0485F, -0.0198F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, -0.3F, -0.6965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.625F, 0.1653F, 0.226F, -0.0092F, 0.0485F, -0.0198F));

		PartDefinition Tail1 = Talenkauen.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.4484F, 12.2834F, 0.119F, -0.0867F, -0.0103F));

		PartDefinition cube_r335 = Tail1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(64, 97).addBox(-1.6F, -1.9364F, -0.0531F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.7659F, 4.0134F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Tail1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(61, 97).addBox(-1.6F, -2.0181F, -0.0607F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.1659F, 2.1134F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r337 = Tail1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(89, 81).addBox(-0.1F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8684F, 4.1633F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r338 = Tail1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(78, 91).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.0711F, 1.9547F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r339 = Tail1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(28, 96).addBox(-1.6F, 0.2753F, -0.8019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3341F, 0.1134F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Tail1.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(87, 98).addBox(-1.6F, -2.1247F, -0.0019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.3341F, 0.1134F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Tail1.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-1.4754F, 0.0884F, -0.0739F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0341F, 0.1134F, -0.2971F, 0.0501F, -0.0153F));

		PartDefinition cube_r342 = Tail1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(38, 6).addBox(-0.5246F, 0.0884F, -0.0739F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0341F, 0.1134F, -0.2971F, -0.0501F, 0.0153F));

		PartDefinition cube_r343 = Tail1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(28, 38).addBox(-2.0F, -0.4835F, 0.8296F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5F, -0.2341F, -0.7866F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.498F, 4.7645F, 0.0113F, -0.1761F, 0.084F));

		PartDefinition cube_r344 = Tail2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(73, 97).addBox(-0.5F, -1.4034F, -0.0041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5332F, 4.958F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r345 = Tail2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(96, 21).addBox(-0.5F, -1.6279F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1332F, 2.958F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Tail2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(70, 97).addBox(-0.1F, 0.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6983F, 4.9616F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Tail2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(96, 25).addBox(-0.1F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4623F, 3.2979F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Tail2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(24, 51).addBox(-0.1F, -0.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.969F, 0.9915F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r349 = Tail2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(67, 97).addBox(-0.5F, -1.7339F, -0.0022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3668F, 1.0579F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Tail2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.5F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7062F, 3.3834F, -0.2096F, 0.0427F, -0.0091F));

		PartDefinition cube_r351 = Tail2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7062F, 3.3834F, -0.2096F, -0.0427F, 0.0091F));

		PartDefinition cube_r352 = Tail2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(17, 20).addBox(-0.9F, -0.4915F, -0.3029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0332F, 0.258F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4378F, 6.6528F, 0.1359F, -0.2782F, 0.09F));

		PartDefinition cube_r353 = Tail3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(99, 21).addBox(-1.1F, -0.8718F, 0.0433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Tail3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(21, 99).addBox(-1.1F, -1.0378F, -0.0552F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, 2.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Tail3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, -0.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.9964F, 4.6356F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Tail3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(84, 98).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.2782F, 2.361F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r357 = Tail3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.4272F, 0.3268F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r358 = Tail3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(96, 97).addBox(-1.1F, -1.3216F, 0.0543F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(41, 44).mirror().addBox(-0.7011F, -0.2179F, 0.0166F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1992F, 0.0028F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r360 = Tail3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(41, 44).addBox(-0.2989F, -0.2179F, 0.0166F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1992F, 0.0028F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r361 = Tail3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, 1.2F, -0.14F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.7F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.4017F, 0.0084F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4032F, 5.9596F, 0.1021F, -0.2316F, 0.1049F));

		PartDefinition cube_r362 = Tail4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(8, 100).addBox(-0.6F, -0.5272F, -0.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3744F, 6.0473F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Tail4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(99, 97).addBox(-0.6F, -0.5272F, -0.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3744F, 4.0473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Tail4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(99, 89).addBox(-0.6F, -1.0273F, 0.0611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0744F, 1.9473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Tail4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(99, 86).addBox(-0.6F, -1.0772F, -0.1389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0744F, 0.1473F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Tail4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(99, 83).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.0199F, 7.6151F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Tail4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(99, 77).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.4944F, 5.3939F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Tail4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(56, 99).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.7398F, 3.3865F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Tail4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(99, 24).addBox(0.0F, 0.2F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.6102F, 0.86F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0177F, 7.9675F, 0.3884F, -0.1618F, -0.0658F));

		PartDefinition cube_r370 = Tail5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(27, 100).addBox(-1.1F, -0.3061F, 0.0728F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.68F, 5.72F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Tail5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(100, 41).addBox(-1.1F, -0.4406F, -0.004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.38F, 3.82F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Tail5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(24, 100).addBox(-1.1F, -0.3281F, -0.046F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.12F, 1.92F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Tail5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(46, 77).addBox(-0.1F, -0.725F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2311F, 1.5692F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Tail5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(17, 76).addBox(-0.1F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2311F, 1.5692F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Tail5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(11, 100).addBox(-1.1F, -0.4861F, -0.1401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.32F, 0.02F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Tail5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1586F, 6.6534F, -0.3311F, -0.2067F, 0.0704F));

		PartDefinition cube_r377 = Tail6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1885F, 6.7478F, -0.2401F, -0.1696F, 0.0413F));

		PartDefinition cube_r378 = Tail7.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, 7.8F, -0.264F, 0.1264F, -0.0341F));

		PartDefinition cube_r379 = Tail8.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(19, 10).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, 7.8F, -0.3981F, 0.1611F, -0.0674F));

		PartDefinition cube_r380 = Tail9.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 1.2596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Talenkauen.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2885F, -1.5151F, 8.0018F, -0.436F, -0.0211F, -0.0293F));

		PartDefinition cube_r381 = bone.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(18, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5073F, 2.9695F, -5.3267F, -2.4337F, -0.0217F, -0.0069F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(70, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5526F, 2.5178F, -3.3789F, -2.9136F, -0.0217F, -0.0069F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(33, 93).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5753F, 2.1263F, -2.459F, 1.9733F, -0.0217F, -0.0069F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(93, 15).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5954F, 1.4124F, -1.759F, 0.7952F, -0.0217F, -0.0069F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(81, 22).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4169F, 1.4659F, -1.9535F, -1.3019F, -0.1037F, 0.019F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(7, 57).addBox(-0.2F, -5.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.251F, 1.6926F, 1.7067F, -2.0656F, -0.2037F, 0.0496F));

		PartDefinition cube_r387 = bone.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(76, 69).addBox(-0.8977F, -0.8311F, -1.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0787F, 0.916F, 0.6728F, -2.8243F, -0.3184F, 0.115F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(76, 73).addBox(-0.8977F, -1.5648F, -0.9622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0787F, 0.916F, 0.6728F, -2.4752F, -0.3184F, 0.115F));

		PartDefinition cube_r389 = bone.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 78).addBox(-0.8977F, -0.1933F, -0.3558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0787F, 0.916F, 0.6728F, -2.0545F, -0.0109F, -0.0533F));

		PartDefinition cube_r390 = bone.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(76, 77).addBox(-0.8977F, -1.7933F, -0.3558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0787F, 0.916F, 0.6728F, -2.0825F, -0.3184F, 0.115F));

		PartDefinition cube_r391 = bone.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5007F, -8.5584F, -1.0323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 73).addBox(-0.5007F, -6.9584F, -1.0323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4204F, 1.3124F, -1.759F, -2.127F, -0.1962F, -0.007F));

		PartDefinition cube_r392 = bone.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5007F, -4.3908F, -0.8501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4204F, 1.3124F, -1.759F, -2.0834F, -0.1962F, -0.007F));

		PartDefinition cube_r393 = bone.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(81, 14).addBox(-0.5007F, -1.8414F, -0.709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4204F, 1.3124F, -1.759F, -1.9961F, -0.1962F, -0.007F));

		PartDefinition cube_r394 = bone.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(81, 73).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5954F, 1.4124F, -1.759F, -1.1683F, -0.0217F, -0.0069F));

		PartDefinition cube_r395 = bone.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(23, 90).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.6F, 0.8025F, -1.7383F, -0.6447F, -0.0217F, -0.0069F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, -1.0482F, 0.088F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(35, 55).addBox(-2.1F, -1.0346F, -6.431F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0F, 0.5F, 4.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(93, 3).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6F, -1.7186F, 3.2019F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(5, 93).addBox(-2.1F, -0.3268F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -2.0F, 1.7F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(54, 44).addBox(-2.1F, -0.2518F, -1.3903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.0F, 1.7F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(80, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, -1.4245F, -3.2568F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(51, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6F, -2.2697F, -1.4442F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, -2.4434F, -0.4593F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(71, 4).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.6F, -1.6739F, 0.7016F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r405 = bone.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(93, 0).addBox(-0.575F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.542F, -0.1378F, 0.7851F, -1.2953F, -0.0871F, 0.0539F));

		PartDefinition bone4 = Talenkauen.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2885F, -1.5151F, 8.0018F, -0.436F, 0.0211F, 0.0293F));

		PartDefinition cube_r406 = bone4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(18, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5073F, 2.9695F, -5.3267F, -2.4337F, 0.0217F, 0.0069F));

		PartDefinition cube_r407 = bone4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5526F, 2.5178F, -3.3789F, -2.9136F, 0.0217F, 0.0069F));

		PartDefinition cube_r408 = bone4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(33, 93).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5753F, 2.1263F, -2.459F, 1.9733F, 0.0217F, 0.0069F));

		PartDefinition cube_r409 = bone4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5954F, 1.4124F, -1.759F, 0.7952F, 0.0217F, 0.0069F));

		PartDefinition cube_r410 = bone4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4169F, 1.4659F, -1.9535F, -1.3019F, 0.1037F, -0.019F));

		PartDefinition cube_r411 = bone4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-0.8F, -5.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.251F, 1.6926F, 1.7067F, -2.0656F, 0.2037F, -0.0496F));

		PartDefinition cube_r412 = bone4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-0.1023F, -0.8311F, -1.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 0.916F, 0.6728F, -2.8243F, 0.3184F, -0.115F));

		PartDefinition cube_r413 = bone4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(-0.1023F, -1.5648F, -0.9622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 0.916F, 0.6728F, -2.4752F, 0.3184F, -0.115F));

		PartDefinition cube_r414 = bone4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.1023F, -0.1933F, -0.3558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 0.916F, 0.6728F, -2.0545F, 0.0109F, 0.0533F));

		PartDefinition cube_r415 = bone4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.1023F, -1.7933F, -0.3558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 0.916F, 0.6728F, -2.0825F, 0.3184F, -0.115F));

		PartDefinition cube_r416 = bone4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-0.4993F, -8.5584F, -1.0323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 73).mirror().addBox(-0.4993F, -6.9584F, -1.0323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4204F, 1.3124F, -1.759F, -2.127F, 0.1962F, 0.007F));

		PartDefinition cube_r417 = bone4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.4993F, -4.3908F, -0.8501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4204F, 1.3124F, -1.759F, -2.0834F, 0.1962F, 0.007F));

		PartDefinition cube_r418 = bone4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(81, 14).mirror().addBox(-0.4993F, -1.8414F, -0.709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4204F, 1.3124F, -1.759F, -1.9961F, 0.1962F, 0.007F));

		PartDefinition cube_r419 = bone4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5954F, 1.4124F, -1.759F, -1.1683F, 0.0217F, 0.0069F));

		PartDefinition cube_r420 = bone4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(23, 90).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.8025F, -1.7383F, -0.6447F, 0.0217F, 0.0069F));

		PartDefinition cube_r421 = bone4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.0482F, 0.088F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r422 = bone4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(1.1F, -1.0346F, -6.431F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, 4.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r423 = bone4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.7186F, 3.2019F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r424 = bone4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(1.1F, -0.3268F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 1.7F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r425 = bone4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(1.1F, -0.2518F, -1.3903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 1.7F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r426 = bone4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.4245F, -3.2568F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r427 = bone4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.2697F, -1.4442F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r428 = bone4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.4434F, -0.4593F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r429 = bone4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.6739F, 0.7016F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r430 = bone4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.425F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.542F, -0.1378F, 0.7851F, -1.2953F, 0.0871F, -0.0539F));

		PartDefinition LegL = Talenkauen.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(41, 77).addBox(-0.5F, 2.302F, -0.7005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(25, 84).addBox(-0.5F, 3.127F, 0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7F, -1.0145F, 7.4889F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r431 = LegL.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(85, 48).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.1869F, -0.0649F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r432 = LegL.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(40, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.657F, 0.7832F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r433 = LegL.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(77, 55).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.131F, 1.3989F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r434 = LegL.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.8636F, 0.5542F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r435 = LegL.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(48, 93).addBox(-0.5F, -0.725F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0298F, -0.3325F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r436 = LegL.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(28, 90).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 7.6447F, 2.2884F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r437 = LegL.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(86, 27).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 24).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.6045F, 1.3456F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r438 = LegL.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.0309F, 0.5265F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r439 = LegL.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(74, 85).addBox(-0.5F, -0.225F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2331F, 0.8482F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r440 = LegL.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(78, 4).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(78, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 6.3441F, -0.5481F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r441 = LegL.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(86, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, 3.8348F, 0.3535F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r442 = LegL.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(83, 63).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 3.0402F, 0.4899F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r443 = LegL.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(30, 84).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.327F, 0.8995F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r444 = LegL.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(77, 38).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 5.8849F, 0.5606F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r445 = LegL.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(81, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4964F, -1.3135F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r446 = LegL.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(81, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.504F, -1.4878F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r447 = LegL.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(74, 81).addBox(-1.0F, 0.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7018F, -0.5526F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r448 = LegL.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(81, 69).addBox(-1.0F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.7018F, -0.5526F, -0.1745F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 9.1826F, 2.9601F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r449 = KneeL.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(62, 12).addBox(-1.0F, -2.05F, -1.125F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 0.4122F, 0.1622F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r450 = KneeL.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(70, 46).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r451 = KneeL.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(54, 56).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.01F, 0.5645F, -0.5953F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r452 = KneeL.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r453 = KneeL.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.01F, 8.1181F, -0.3902F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r454 = KneeL.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(75, 50).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(1.19F, 0.3181F, 1.8078F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r455 = KneeL.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(69, 11).addBox(-0.5F, -1.025F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(1.19F, 0.4616F, 0.894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r456 = KneeL.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(21, 75).addBox(-0.5F, -1.025F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(1.19F, 0.4616F, 0.894F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r457 = KneeL.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(54, 60).addBox(0.7F, -0.3F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.01F, 0.1303F, 1.4419F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r458 = KneeL.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(14, 51).addBox(0.7F, -3.3F, -0.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.01F, 2.7027F, 0.2964F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r459 = KneeL.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(73, 8).addBox(-1.0F, -1.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(59, 51).addBox(-1.0F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.01F, 1.0775F, 1.6815F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r460 = KneeL.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(12, 63).addBox(-1.0F, -2.8F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.01F, 2.985F, 1.0801F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r461 = KneeL.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(74, 23).addBox(-1.0F, -0.55F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.01F, 9.1735F, -0.7677F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r462 = KneeL.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(73, 62).addBox(-1.0F, 0.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(73, 59).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(14, 73).addBox(-1.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.01F, 8.9621F, 0.5572F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r463 = KneeL.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(7, 46).addBox(-1.0F, -3.8F, 0.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(28, 45).addBox(-1.0F, -3.8F, -0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.01F, 3.9027F, 0.0964F, -0.0873F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.2232F, -0.4912F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 10.2887F, -0.568F, -0.7418F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9553F, -0.1936F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r464 = FootL.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(53, 6).addBox(-1.01F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r465 = FootL2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(49, 19).addBox(-1.01F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

		PartDefinition LegL2 = Talenkauen.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(77, 46).addBox(-0.5F, 2.302F, -0.7005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(84, 81).addBox(-0.5F, 3.127F, 0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.7F, -1.0145F, 7.4889F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r466 = LegL2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(85, 57).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.1869F, -0.0649F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r467 = LegL2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(85, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.657F, 0.7832F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r468 = LegL2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(64, 77).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.131F, 1.3989F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r469 = LegL2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.8636F, 0.5542F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r470 = LegL2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(93, 63).addBox(-0.5F, -0.725F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0298F, -0.3325F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r471 = LegL2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(92, 54).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 7.6447F, 2.2884F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r472 = LegL2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(69, 15).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(55, 86).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 33).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 8.6045F, 1.3456F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r473 = LegL2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.0309F, 0.5265F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r474 = LegL2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -0.225F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2331F, 0.8482F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r475 = LegL2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(78, 65).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(78, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 6.3441F, -0.5481F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r476 = LegL2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, 3.8348F, 0.3535F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r477 = LegL2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(83, 66).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 3.0402F, 0.4899F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r478 = LegL2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(84, 84).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.327F, 0.8995F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r479 = LegL2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(77, 42).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 5.8849F, 0.5606F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r480 = LegL2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(64, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4964F, -1.3135F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r481 = LegL2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.504F, -1.4878F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r482 = LegL2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(79, 81).addBox(0.0F, 0.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7018F, -0.5526F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r483 = LegL2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(81, 77).addBox(0.0F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7018F, -0.5526F, -0.1745F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 9.1826F, 2.9601F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r484 = KneeL2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(63, 44).addBox(-1.0F, -2.05F, -1.125F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 0.4122F, 0.1622F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r485 = KneeL2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(70, 55).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r486 = KneeL2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.01F, 0.5645F, -0.5953F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r487 = KneeL2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(24, 61).addBox(-1.0F, -3.625F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r488 = KneeL2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(64, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.01F, 8.1181F, -0.3902F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r489 = KneeL2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(54, 75).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.19F, 0.3181F, 1.8078F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r490 = KneeL2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(70, 38).addBox(-0.5F, -1.025F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.19F, 0.4616F, 0.894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r491 = KneeL2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(49, 75).addBox(-0.5F, -1.025F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-1.19F, 0.4616F, 0.894F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r492 = KneeL2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(59, 60).addBox(-1.7F, -0.3F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.01F, 0.1303F, 1.4419F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r493 = KneeL2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(19, 51).addBox(-1.7F, -3.3F, -0.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.01F, 2.7027F, 0.2964F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r494 = KneeL2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(64, 74).addBox(-1.0F, -1.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(33, 60).addBox(-1.0F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.01F, 1.0775F, 1.6815F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r495 = KneeL2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(63, 39).addBox(-1.0F, -2.8F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.01F, 2.985F, 1.0801F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r496 = KneeL2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(42, 74).addBox(-1.0F, -0.55F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.01F, 9.1735F, -0.7677F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r497 = KneeL2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(74, 35).addBox(-1.0F, 0.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(74, 29).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(74, 26).addBox(-1.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.01F, 8.9621F, 0.5572F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r498 = KneeL2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(49, 24).addBox(-1.0F, -3.8F, 0.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(0, 46).addBox(-1.0F, -3.8F, -0.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, 3.9027F, 0.0964F, -0.0873F, 0.0F, 0.0F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create().texOffs(63, 55).addBox(-1.5F, -0.2232F, -0.4912F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 10.2887F, -0.568F, -0.5236F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9553F, -0.1936F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r499 = FootL3.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(54, 35).addBox(-1.99F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r500 = FootL4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(35, 50).addBox(-1.99F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.95F, -0.0698F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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