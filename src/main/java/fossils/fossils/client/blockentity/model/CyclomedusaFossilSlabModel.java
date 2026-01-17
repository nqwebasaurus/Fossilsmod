package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CyclomedusaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Cyclomedusae;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;

	public CyclomedusaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Cyclomedusae = this.fossil.getChild("Cyclomedusae");
		this.bone = this.Cyclomedusae.getChild("bone");
		this.bone2 = this.Cyclomedusae.getChild("bone2");
		this.bone3 = this.Cyclomedusae.getChild("bone3");
		this.bone4 = this.Cyclomedusae.getChild("bone4");
		this.bone5 = this.Cyclomedusae.getChild("bone5");
		this.bone6 = this.Cyclomedusae.getChild("bone6");
		this.bone7 = this.Cyclomedusae.getChild("bone7");
		this.bone8 = this.Cyclomedusae.getChild("bone8");
		this.bone9 = this.Cyclomedusae.getChild("bone9");
		this.bone10 = this.Cyclomedusae.getChild("bone10");
		this.bone11 = this.Cyclomedusae.getChild("bone11");
		this.bone12 = this.Cyclomedusae.getChild("bone12");
		this.bone13 = this.Cyclomedusae.getChild("bone13");
		this.bone14 = this.Cyclomedusae.getChild("bone14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-20.0F, -2.0F, -18.0F, 29.0F, 2.0F, 39.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(96, 76).addBox(-29.803F, -2.0F, 0.1008F, 30.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5F, 0.0F, 4.0F, 0.0F, 1.9722F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 42).addBox(-38.836F, -2.0F, -30.5819F, 39.0F, 2.0F, 31.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(13.5F, 0.0F, -24.0F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 76).addBox(-31.7198F, -2.0F, 0.1241F, 32.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.6F, 0.0F, -23.7F, 0.0F, 0.7156F, 0.0F));

		PartDefinition Cyclomedusae = fossil.addOrReplaceChild("Cyclomedusae", CubeListBuilder.create(), PartPose.offset(4.0F, 1.8F, 0.0F));

		PartDefinition bone = Cyclomedusae.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition bone2 = Cyclomedusae.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -4.0F, -16.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone3 = Cyclomedusae.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -4.0F, 14.0F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone4 = Cyclomedusae.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, 8.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition bone5 = Cyclomedusae.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(1, 7).addBox(-2.0F, -0.05F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(1, 12).addBox(-1.5F, -0.1F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 0).addBox(-2.0F, 0.2F, -3.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -4.0F, -30.6F, 0.0F, 1.2566F, 0.0F));

		PartDefinition bone6 = Cyclomedusae.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -4.0F, -3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition bone7 = Cyclomedusae.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -4.0F, -11.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition bone8 = Cyclomedusae.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -4.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone9 = Cyclomedusae.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.0F, -7.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone10 = Cyclomedusae.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -4.0F, 8.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone11 = Cyclomedusae.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(2, 9).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(1, 13).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 3).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 3).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 14).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -4.0F, 28.8F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone12 = Cyclomedusae.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(3, 10).addBox(-2.0F, -0.05F, 1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 14).addBox(-1.5F, -0.1F, 0.8F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 4).addBox(-2.0F, 0.0F, 1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 3).addBox(2.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 15).addBox(-3.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.0F, -4.0F, 14.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone13 = Cyclomedusae.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 18.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition bone14 = Cyclomedusae.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.05F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 7).addBox(-1.0F, -0.15F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 12).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.0F, -4.0F, 8.0F, 0.0F, 2.4435F, 0.0F));

		return LayerDefinition.create(meshdefinition, 224, 110);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}