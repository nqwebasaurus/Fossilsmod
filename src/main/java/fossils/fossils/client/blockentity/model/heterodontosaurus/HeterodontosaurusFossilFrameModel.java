package fossils.fossils.client.blockentity.model.heterodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HeterodontosaurusFossilFrameModel extends SkullModelBase {
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

	public HeterodontosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -15.2F, 1.7F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -14.0F, -8.3F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(4.0F, -2.0F, 9.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -11.0F, -7.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Heterodontosaurus = fossil.addOrReplaceChild("Heterodontosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.0F, 2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Heterodontosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(18, 38).addBox(-1.0F, 0.493F, 0.8476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5F, -1.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Heterodontosaurus.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.2F, -0.728F, -0.0446F));

		PartDefinition bone3 = Heterodontosaurus.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.2F, -0.728F, -0.0446F));

		PartDefinition LegL = Heterodontosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offset(1.9F, 0.5065F, 0.3316F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.585F, 5.5996F, 0.049F, -0.0399F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9732F, 6.5912F, -0.3687F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.734F, 1.9945F, 0.0873F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1048F, -0.5624F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LegL2 = Heterodontosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.5065F, 0.3316F, -0.7418F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.585F, 5.5996F, 0.049F, 1.0073F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9732F, 6.5912F, -1.765F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.734F, 1.9945F, 1.789F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1048F, -0.5624F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tail1 = Heterodontosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, 2.675F, -0.0011F, -0.1745F, 0.0F));

		PartDefinition cube_r2 = Tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.9F, 4.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 8).addBox(-0.5F, -0.9F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0836F, -0.6941F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.625F, -0.0076F, -0.0873F, 0.0007F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 3.9F, 0.055F, 0.0871F, 0.0048F));

		PartDefinition cube_r3 = Tail3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 31).addBox(-1.0F, 0.4F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 28).addBox(-1.0F, 0.4F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.041F, -0.0028F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(15, 15).addBox(-0.5F, 0.2427F, 0.1416F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.034F, 3.8972F, 0.0152F, 0.1309F, 0.002F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2427F, -0.1084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.95F, -0.1168F, 0.13F, -0.0152F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.2427F, -0.3084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.95F, -0.1335F, 0.1038F, -0.2321F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.2427F, -0.5084F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 5).addBox(-0.5F, 0.2427F, 5.1916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.975F, -0.0896F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, 0.2427F, -0.1084F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.95F, -0.065F, -0.2177F, 0.0141F));

		PartDefinition Body = Heterodontosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -0.5F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, 0.7932F, 0.248F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6874F, -3.8385F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, 0.375F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 34).addBox(-0.5F, 0.375F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Chest = body2.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 28).addBox(-0.5F, -0.7F, -0.825F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.2F, -2.8F, 0.3142F, 0.0F, 0.0F));

		PartDefinition bone = Chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.5F, 1.3708F, -2.2531F));

		PartDefinition bone4 = Chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.3708F, -2.2531F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.632F, 4.0882F, -3.2454F, 0.4677F, 0.3814F, -0.199F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0332F, 3.2551F, 2.784F, -0.9166F, 0.0038F, -0.0123F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.6F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.632F, 4.0882F, -3.2454F, 0.6208F, -0.1863F, 0.1246F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0332F, 3.2551F, 2.784F, -0.9336F, -0.0023F, -0.1309F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4F, -1.6F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.35F, -3.45F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 43).addBox(-0.5F, 1.3465F, 0.9357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6999F, -2.3956F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4499F, -1.7206F, 0.0596F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 48).addBox(-0.5F, -0.8425F, 1.54F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 47).addBox(-0.5F, -0.8425F, -0.16F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4263F, -2.1226F, -0.7156F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -1.375F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Neck1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 40).addBox(-0.5F, 0.9F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 39).addBox(-0.5F, 0.9F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9148F, -0.7114F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck1.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 68).addBox(-0.5F, 0.6263F, -1.1152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9148F, -1.7114F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 13).addBox(-0.5F, 0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9148F, -0.7114F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = Neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5654F, -2.3655F, 0.5672F, 0.0F, 0.0F));

		PartDefinition lefFace = head.addOrReplaceChild("lefFace", CubeListBuilder.create(), PartPose.offset(0.0736F, 1.6649F, -5.2388F));

		PartDefinition lefFace2 = head.addOrReplaceChild("lefFace2", CubeListBuilder.create(), PartPose.offset(-0.0736F, 1.6649F, -5.2388F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9597F, -0.677F, 0.3491F, 0.0F, 0.0F));

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