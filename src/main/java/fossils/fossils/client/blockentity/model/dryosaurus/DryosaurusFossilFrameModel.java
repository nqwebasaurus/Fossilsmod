package fossils.fossils.client.blockentity.model.dryosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DryosaurusFossilFrameModel extends SkullModelBase {
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

	public DryosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, 2.1F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -3.7F, -0.5F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.6F, -17.0F, -18.1F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6F, -17.0F, -18.1F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-5.1F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -17.0F, 2.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Dryosaurus = fossil.addOrReplaceChild("Dryosaurus", CubeListBuilder.create(), PartPose.offset(1.0F, -20.6F, -4.7F));

		PartDefinition Basin_r1 = Dryosaurus.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(37, 32).addBox(-1.0F, 0.1533F, 7.2177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 27).addBox(-1.0F, 0.1533F, 1.5177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.1226F, 3.5662F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Body = Dryosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.925F, 5.615F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 43).addBox(-0.5F, 0.2F, 3.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.24F, -9.04F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5368F, 0.04F, -5.0331F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 24).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4632F, 0.2F, -4.0069F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 0.1343F, -3.7964F, 0.0087F, -0.0436F, -0.0004F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.2572F, 0.0763F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5843F, -4.8723F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0368F, 0.6633F, -4.8199F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0515F, 0.0474F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4632F, 2.1625F, -5.3093F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Neck1 = chest2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0368F, 1.9715F, -5.4716F, 0.4785F, -0.0696F, -0.0271F));

		PartDefinition cube_r8 = Neck1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 59).addBox(-1.0F, 0.3357F, 2.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 58).addBox(-1.0F, 0.3357F, 0.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.76F, -0.192F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1987F, -1.5094F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 62).addBox(-1.0F, 0.1431F, 3.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 61).addBox(-1.0F, 0.1431F, 1.5988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.28F, -3.06F, -0.6458F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.894F, -1.3812F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0F, 0.0292F, 2.2426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 61).addBox(-1.0F, 0.0292F, 0.5426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9785F, -2.2949F, -0.7505F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4135F, -1.3549F, -0.7392F, -0.1875F, 0.0536F));

		PartDefinition cube_r11 = Neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 41).addBox(-0.5F, 0.2852F, -0.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.44F, -1.5F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2519F, -1.8251F, 0.1584F, -0.1293F, -0.0206F));

		PartDefinition cube_r12 = Neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 49).addBox(-0.5F, 0.2852F, -0.1007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6332F, -1.4482F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5428F, -1.6839F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Neck6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, 0.3852F, -0.4007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4881F, -1.3106F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.8503F, -1.1764F, -0.0717F, 0.0052F, -0.0871F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9354F, 0.8576F, -2.2052F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9354F, 0.8576F, -2.2052F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9387F, -0.2272F, 0.4363F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.968F, -10.7579F, 0.8024F, 0.1537F, 0.0329F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.8558F, 2.121F, 0.096F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.0604F, -3.5109F, 0.3316F, 0.0F, 0.0F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.968F, -10.7579F, 0.8024F, -0.1537F, -0.0329F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.8558F, 2.121F, 0.096F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.0604F, -3.5109F, 0.3316F, 0.0F, 0.0F));

		PartDefinition bone2 = Chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 5.4138F, -11.2701F, 0.0F, 0.0873F, 0.0873F));

		PartDefinition bone3 = Chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 5.4138F, -11.2701F, 0.0F, -0.0873F, -0.0873F));

		PartDefinition Tail1 = Dryosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.6802F, 11.3635F, 0.02F, 0.1331F, -0.0839F));

		PartDefinition cube_r14 = Tail1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 27).addBox(-2.0F, 0.3165F, -0.1704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.0659F, 0.1134F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.798F, 5.6645F, -0.1327F, 0.173F, -0.023F));

		PartDefinition cube_r15 = Tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 0).addBox(-0.9F, 0.3085F, -0.6029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 5).addBox(-0.9F, 0.3085F, 6.0971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.0332F, 0.258F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4378F, 6.6528F, -0.0371F, 0.2157F, -0.0932F));

		PartDefinition cube_r16 = Tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, 2.0F, -0.14F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.7F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.3983F, -0.3916F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 16).addBox(-0.5F, 0.3983F, 7.3084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4032F, 5.9596F, -0.0365F, -0.173F, 0.0493F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0177F, 7.9675F, 0.2922F, -0.3172F, -0.007F));

		PartDefinition cube_r17 = Tail5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, 2.0596F, -0.7196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1586F, 6.6534F, 0.0091F, -0.3554F, 0.1608F));

		PartDefinition cube_r18 = Tail6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 18).addBox(-1.5F, 2.0596F, -0.9196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1885F, 6.7478F, -0.2579F, -0.3547F, 0.2159F));

		PartDefinition cube_r19 = Tail7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 2.0596F, -1.0196F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.52F, 0.82F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Dryosaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2996F, -1.3875F, 7.1286F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4 = Dryosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2996F, -1.3875F, 7.1286F, 0.0F, 0.0F, 0.0873F));

		PartDefinition LegL = Dryosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -1.4432F, 7.3367F, 0.0087F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 9.6512F, -0.1829F, 1.0559F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 8.9861F, -0.6255F, -0.6981F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0737F, -0.2413F, 1.0559F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -1.1694F, 0.0F, 0.0F));

		PartDefinition LegL2 = Dryosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, -1.4432F, 7.3367F, -1.213F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 9.6512F, -0.1829F, 2.1904F, 0.0F, 0.0F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 8.9861F, -0.6255F, -2.0071F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0737F, -0.2413F, 2.3213F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.2967F, 0.0F, 0.0F));

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