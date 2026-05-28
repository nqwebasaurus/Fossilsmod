package fossils.fossils.client.blockentity.model.talenkauen;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TalenkauenFossilFrameModel extends SkullModelBase {
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

	public TalenkauenFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -21.0F, 2.3F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-3.4F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.2F, -18.4F, -16.5F, 0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -6.6F, -0.5F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.2F, -18.4F, -16.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.3F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -17.0F, 2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Talenkauen = fossil.addOrReplaceChild("Talenkauen", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -20.3F, -4.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Talenkauen.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(17, 29).addBox(-1.0F, 0.0533F, 1.9177F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.1227F, 3.5662F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Body = Talenkauen.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.925F, 5.615F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 42).addBox(-0.5F, 0.2F, 8.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 38).addBox(-0.5F, 0.2F, 3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.24F, -9.04F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5368F, 0.04F, -5.0331F, -0.0347F, 0.0871F, 0.0046F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, -0.4686F, -0.2003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4882F, 0.8668F, -3.895F, 0.0175F, 0.0175F, 0.0003F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 0.1343F, -3.7965F, -0.075F, 0.0903F, 0.0368F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5F, 0.2572F, -0.1237F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5843F, -4.8723F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0368F, 0.6633F, -4.8199F, 0.0087F, 0.0436F, 0.0004F));

		PartDefinition cube_r7 = chest2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, 0.0515F, -0.2526F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4632F, 2.1625F, -5.3093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition ArmL = chest2.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3843F, 5.4037F, -3.5159F, 0.7541F, 0.2598F, -0.1559F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 7.5854F, 2.9866F, -0.1648F, -0.695F, 0.3718F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 0.9614F, -6.2949F, 0.1134F, 0.0F, 0.0F));

		PartDefinition ArmL2 = chest2.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3107F, 5.4037F, -3.5159F, 0.4701F, -0.3002F, 0.2364F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 7.5854F, 2.9866F, 0.1208F, 0.651F, 0.0734F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 0.9614F, -6.2949F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone2 = chest2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0365F, 4.9101F, -3.99F, 0.0349F, 0.0842F, 0.0903F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9629F, 4.9101F, -3.99F, 0.0349F, -0.0842F, -0.0903F));

		PartDefinition Neck1 = chest2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 1.9715F, -5.4715F, 0.8769F, 0.084F, 0.1005F));

		PartDefinition cube_r8 = Neck1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 32).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5539F, -1.2037F, -0.1927F, 0.0857F, -0.0167F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1987F, -1.5094F, -0.1403F, 0.2882F, -0.1661F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 41).addBox(-1.0F, 0.2431F, 3.0488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 39).addBox(-1.0F, 0.2431F, 0.3488F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.28F, -3.06F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck2.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7928F, -2.2888F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 67).addBox(-0.5F, 0.3602F, 1.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(44, 67).addBox(-0.5F, 0.3602F, 0.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 66).addBox(-0.5F, 0.3602F, -0.8007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.44F, -1.5F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2519F, -1.8251F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(65, 67).addBox(-0.5F, 0.3602F, 1.0993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 66).addBox(-0.5F, 0.3602F, -0.6007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6332F, -1.4482F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5428F, -1.6839F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Neck6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 67).addBox(-0.5F, 0.3852F, -0.6007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.3106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 52).addBox(-0.5F, 0.3852F, 0.5993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 52).addBox(-0.5F, 0.3852F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.5106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck8 = Neck7.addOrReplaceChild("Neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.775F, -1.8F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 31).addBox(-0.5F, 0.3852F, 0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 31).addBox(-0.5F, 0.3852F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1881F, -1.6106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head = Neck8.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.6753F, -2.3983F, 0.3648F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9354F, 0.8576F, -2.4052F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9354F, 0.8576F, -2.4052F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5762F, -0.3962F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tail1 = Talenkauen.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.4484F, 12.2834F, 0.119F, -0.0867F, -0.0103F));

		PartDefinition cube_r15 = Tail1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 42).addBox(-2.025F, 0.2165F, 5.2296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 38).addBox(-2.025F, 0.2165F, 0.5296F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -0.2341F, -0.7866F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.498F, 4.7645F, 0.0113F, -0.1761F, 0.084F));

		PartDefinition cube_r16 = Tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 26).addBox(-0.9F, -0.0849F, 6.0847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(17, 20).addBox(-0.9F, -0.0849F, -0.4153F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.3332F, 0.258F, -0.2051F, -0.0085F, 0.0018F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4378F, 6.6528F, 0.1359F, -0.2782F, 0.09F));

		PartDefinition cube_r17 = Tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 38).addBox(-1.45F, 1.9F, -0.24F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.7F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.2233F, -0.6916F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 17).addBox(-0.5F, 0.2233F, 7.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.4032F, 5.9596F, 0.1021F, -0.2316F, 0.1049F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0177F, 7.9675F, 0.3884F, -0.1618F, -0.0658F));

		PartDefinition cube_r18 = Tail5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(6, 35).addBox(-0.5F, -1.073F, 6.2499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(0, 29).addBox(-0.5F, -1.073F, -0.2501F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.075F, 1.1925F, -0.5412F, -0.1745F, 0.0129F, -0.0023F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1586F, 6.6534F, -0.3311F, -0.2067F, 0.0704F));

		PartDefinition cube_r19 = Tail6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, 1.8596F, -0.6196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1885F, 6.7478F, -0.2401F, -0.1696F, 0.0413F));

		PartDefinition cube_r20 = Tail7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, 1.8596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, 7.8F, -0.264F, 0.1264F, -0.0341F));

		PartDefinition cube_r21 = Tail8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 10).addBox(-1.475F, 1.8596F, -0.7696F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, 7.8F, -0.3981F, 0.1611F, -0.0674F));

		PartDefinition cube_r22 = Tail9.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-1.45F, 1.8596F, -0.7196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Talenkauen.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2885F, -1.5151F, 8.0018F, -0.436F, -0.0211F, -0.0293F));

		PartDefinition bone4 = Talenkauen.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2885F, -1.5151F, 8.0018F, -0.436F, 0.0211F, 0.0293F));

		PartDefinition LegL = Talenkauen.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -1.0145F, 7.4889F, -0.4276F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 9.1826F, 2.9601F, 1.4923F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 10.2887F, -0.568F, -0.7418F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9553F, -0.1936F, 0.096F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.1658F, 0.0F, 0.0F));

		PartDefinition LegL2 = Talenkauen.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, -1.0145F, 7.4889F, -0.9512F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 9.1826F, 2.9601F, 1.5359F, 0.0F, 0.0F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 10.2887F, -0.568F, -0.5236F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9553F, -0.1936F, 0.1833F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, 0.0087F, 0.0F, 0.0F));

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