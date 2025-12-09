package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DidymograptusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart boneR8;
	private final ModelPart boneR29;
	private final ModelPart boneR26;
	private final ModelPart boneR20;
	private final ModelPart grappy;
	private final ModelPart boneR10;
	private final ModelPart boneR9;
	private final ModelPart grappy2;
	private final ModelPart boneR16;
	private final ModelPart boneR17;
	private final ModelPart grappy3;
	private final ModelPart boneR35;
	private final ModelPart boneR36;
	private final ModelPart right5;
	private final ModelPart boneR5;
	private final ModelPart right24;
	private final ModelPart boneR32;
	private final ModelPart right27;
	private final ModelPart boneR37;
	private final ModelPart right19;
	private final ModelPart boneR25;
	private final ModelPart right10;
	private final ModelPart boneR13;
	private final ModelPart full;
	private final ModelPart right;
	private final ModelPart boneR;
	private final ModelPart right2;
	private final ModelPart boneR2;
	private final ModelPart full8;
	private final ModelPart right17;
	private final ModelPart boneR23;
	private final ModelPart right18;
	private final ModelPart boneR24;
	private final ModelPart full4;
	private final ModelPart right8;
	private final ModelPart boneR11;
	private final ModelPart right9;
	private final ModelPart boneR12;
	private final ModelPart full11;
	private final ModelPart right25;
	private final ModelPart boneR33;
	private final ModelPart right26;
	private final ModelPart boneR34;
	private final ModelPart full9;
	private final ModelPart right20;
	private final ModelPart boneR27;
	private final ModelPart right21;
	private final ModelPart boneR28;
	private final ModelPart full2;
	private final ModelPart right3;
	private final ModelPart boneR3;
	private final ModelPart right4;
	private final ModelPart boneR4;
	private final ModelPart full10;
	private final ModelPart right22;
	private final ModelPart boneR30;
	private final ModelPart right23;
	private final ModelPart boneR31;
	private final ModelPart full5;
	private final ModelPart right11;
	private final ModelPart boneR14;
	private final ModelPart right12;
	private final ModelPart boneR15;
	private final ModelPart full7;
	private final ModelPart right15;
	private final ModelPart boneR21;
	private final ModelPart right16;
	private final ModelPart boneR22;
	private final ModelPart full3;
	private final ModelPart right6;
	private final ModelPart boneR6;
	private final ModelPart right7;
	private final ModelPart boneR7;
	private final ModelPart full6;
	private final ModelPart right13;
	private final ModelPart boneR18;
	private final ModelPart right14;
	private final ModelPart boneR19;

	public DidymograptusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.boneR8 = this.fossil.getChild("boneR8");
		this.boneR29 = this.fossil.getChild("boneR29");
		this.boneR26 = this.fossil.getChild("boneR26");
		this.boneR20 = this.fossil.getChild("boneR20");
		this.grappy = this.fossil.getChild("grappy");
		this.boneR10 = this.grappy.getChild("boneR10");
		this.boneR9 = this.grappy.getChild("boneR9");
		this.grappy2 = this.fossil.getChild("grappy2");
		this.boneR16 = this.grappy2.getChild("boneR16");
		this.boneR17 = this.grappy2.getChild("boneR17");
		this.grappy3 = this.fossil.getChild("grappy3");
		this.boneR35 = this.grappy3.getChild("boneR35");
		this.boneR36 = this.grappy3.getChild("boneR36");
		this.right5 = this.fossil.getChild("right5");
		this.boneR5 = this.right5.getChild("boneR5");
		this.right24 = this.fossil.getChild("right24");
		this.boneR32 = this.right24.getChild("boneR32");
		this.right27 = this.fossil.getChild("right27");
		this.boneR37 = this.right27.getChild("boneR37");
		this.right19 = this.fossil.getChild("right19");
		this.boneR25 = this.right19.getChild("boneR25");
		this.right10 = this.fossil.getChild("right10");
		this.boneR13 = this.right10.getChild("boneR13");
		this.full = this.fossil.getChild("full");
		this.right = this.full.getChild("right");
		this.boneR = this.right.getChild("boneR");
		this.right2 = this.full.getChild("right2");
		this.boneR2 = this.right2.getChild("boneR2");
		this.full8 = this.fossil.getChild("full8");
		this.right17 = this.full8.getChild("right17");
		this.boneR23 = this.right17.getChild("boneR23");
		this.right18 = this.full8.getChild("right18");
		this.boneR24 = this.right18.getChild("boneR24");
		this.full4 = this.fossil.getChild("full4");
		this.right8 = this.full4.getChild("right8");
		this.boneR11 = this.right8.getChild("boneR11");
		this.right9 = this.full4.getChild("right9");
		this.boneR12 = this.right9.getChild("boneR12");
		this.full11 = this.fossil.getChild("full11");
		this.right25 = this.full11.getChild("right25");
		this.boneR33 = this.right25.getChild("boneR33");
		this.right26 = this.full11.getChild("right26");
		this.boneR34 = this.right26.getChild("boneR34");
		this.full9 = this.fossil.getChild("full9");
		this.right20 = this.full9.getChild("right20");
		this.boneR27 = this.right20.getChild("boneR27");
		this.right21 = this.full9.getChild("right21");
		this.boneR28 = this.right21.getChild("boneR28");
		this.full2 = this.fossil.getChild("full2");
		this.right3 = this.full2.getChild("right3");
		this.boneR3 = this.right3.getChild("boneR3");
		this.right4 = this.full2.getChild("right4");
		this.boneR4 = this.right4.getChild("boneR4");
		this.full10 = this.fossil.getChild("full10");
		this.right22 = this.full10.getChild("right22");
		this.boneR30 = this.right22.getChild("boneR30");
		this.right23 = this.full10.getChild("right23");
		this.boneR31 = this.right23.getChild("boneR31");
		this.full5 = this.fossil.getChild("full5");
		this.right11 = this.full5.getChild("right11");
		this.boneR14 = this.right11.getChild("boneR14");
		this.right12 = this.full5.getChild("right12");
		this.boneR15 = this.right12.getChild("boneR15");
		this.full7 = this.fossil.getChild("full7");
		this.right15 = this.full7.getChild("right15");
		this.boneR21 = this.right15.getChild("boneR21");
		this.right16 = this.full7.getChild("right16");
		this.boneR22 = this.right16.getChild("boneR22");
		this.full3 = this.fossil.getChild("full3");
		this.right6 = this.full3.getChild("right6");
		this.boneR6 = this.right6.getChild("boneR6");
		this.right7 = this.full3.getChild("right7");
		this.boneR7 = this.right7.getChild("boneR7");
		this.full6 = this.fossil.getChild("full6");
		this.right13 = this.full6.getChild("right13");
		this.boneR18 = this.right13.getChild("boneR18");
		this.right14 = this.full6.getChild("right14");
		this.boneR19 = this.right14.getChild("boneR19");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-26.0F, -2.0F, -32.0F, 54.0F, 2.0F, 61.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 64).addBox(-76.0F, -1.0F, -17.5F, 83.0F, 2.0F, 30.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-42.8816F, -1.0F, -17.9681F, 0.0F, -2.9671F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 64).addBox(-6.6752F, -1.0F, -18.1703F, 27.0F, 2.0F, 73.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -1.0F, 33.5F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 140).addBox(12.0F, -1.0F, -30.5F, 28.0F, 2.0F, 59.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -1.5F, 0.0F, -0.6109F, 0.0F));

		PartDefinition boneR8 = fossil.addOrReplaceChild("boneR8", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, -2.25F, 15.4F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rightb_r1 = boneR8.addOrReplaceChild("rightb_r1", CubeListBuilder.create().texOffs(20, 20).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 3).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 8).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition boneR29 = fossil.addOrReplaceChild("boneR29", CubeListBuilder.create(), PartPose.offsetAndRotation(26.0F, -2.25F, -7.6F, -1.8326F, 0.0F, -1.5708F));

		PartDefinition rightb_r2 = boneR29.addOrReplaceChild("rightb_r2", CubeListBuilder.create().texOffs(20, 20).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 3).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 8).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition boneR26 = fossil.addOrReplaceChild("boneR26", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.25F, 47.4F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rightb_r3 = boneR26.addOrReplaceChild("rightb_r3", CubeListBuilder.create().texOffs(20, 20).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 3).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 8).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition boneR20 = fossil.addOrReplaceChild("boneR20", CubeListBuilder.create(), PartPose.offsetAndRotation(-29.0F, -2.25F, -18.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rightb_r4 = boneR20.addOrReplaceChild("rightb_r4", CubeListBuilder.create().texOffs(20, 20).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 3).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 8).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition grappy = fossil.addOrReplaceChild("grappy", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, -2.25F, -19.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition boneR10 = grappy.addOrReplaceChild("boneR10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition rightb_r5 = boneR10.addOrReplaceChild("rightb_r5", CubeListBuilder.create().texOffs(18, 3).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 6).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 9).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition boneR9 = grappy.addOrReplaceChild("boneR9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0F, 3.8F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition rightb_r6 = boneR9.addOrReplaceChild("rightb_r6", CubeListBuilder.create().texOffs(18, 12).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 15).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 18).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition grappy2 = fossil.addOrReplaceChild("grappy2", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, -2.25F, 4.6F, 0.0F, 2.6616F, 0.0F));

		PartDefinition boneR16 = grappy2.addOrReplaceChild("boneR16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition rightb_r7 = boneR16.addOrReplaceChild("rightb_r7", CubeListBuilder.create().texOffs(18, 3).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 6).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 9).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition boneR17 = grappy2.addOrReplaceChild("boneR17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0F, 3.8F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition rightb_r8 = boneR17.addOrReplaceChild("rightb_r8", CubeListBuilder.create().texOffs(18, 12).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 15).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 18).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition grappy3 = fossil.addOrReplaceChild("grappy3", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, -2.25F, 31.6F, 0.0F, 0.3491F, 0.0F));

		PartDefinition boneR35 = grappy3.addOrReplaceChild("boneR35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition rightb_r9 = boneR35.addOrReplaceChild("rightb_r9", CubeListBuilder.create().texOffs(18, 3).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 6).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 9).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition boneR36 = grappy3.addOrReplaceChild("boneR36", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0F, 3.8F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition rightb_r10 = boneR36.addOrReplaceChild("rightb_r10", CubeListBuilder.create().texOffs(18, 12).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 15).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 18).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right5 = fossil.addOrReplaceChild("right5", CubeListBuilder.create(), PartPose.offsetAndRotation(22.8767F, -2.0956F, 1.2743F, 0.48F, 0.0F, -1.5708F));

		PartDefinition rightt_r1 = right5.addOrReplaceChild("rightt_r1", CubeListBuilder.create().texOffs(26, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 23).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1233F, -3.1816F, -1.0292F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR5 = right5.addOrReplaceChild("boneR5", CubeListBuilder.create(), PartPose.offset(0.1233F, 2.0684F, 1.4708F));

		PartDefinition rightb_r11 = boneR5.addOrReplaceChild("rightb_r11", CubeListBuilder.create().texOffs(18, 26).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 27).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right24 = fossil.addOrReplaceChild("right24", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1233F, -2.0956F, 6.2743F, 2.4871F, 0.0F, -1.5708F));

		PartDefinition rightt_r2 = right24.addOrReplaceChild("rightt_r2", CubeListBuilder.create().texOffs(26, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 23).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1233F, -3.1816F, -1.0292F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR32 = right24.addOrReplaceChild("boneR32", CubeListBuilder.create(), PartPose.offset(0.1233F, 2.0684F, 1.4708F));

		PartDefinition rightb_r12 = boneR32.addOrReplaceChild("rightb_r12", CubeListBuilder.create().texOffs(18, 26).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 27).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right27 = fossil.addOrReplaceChild("right27", CubeListBuilder.create(), PartPose.offsetAndRotation(-38.1233F, -2.0956F, -24.7257F, 1.6144F, 0.0F, -1.5708F));

		PartDefinition rightt_r3 = right27.addOrReplaceChild("rightt_r3", CubeListBuilder.create().texOffs(26, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 23).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1233F, -3.1816F, -1.0292F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR37 = right27.addOrReplaceChild("boneR37", CubeListBuilder.create(), PartPose.offset(0.1233F, 2.0684F, 1.4708F));

		PartDefinition rightb_r13 = boneR37.addOrReplaceChild("rightb_r13", CubeListBuilder.create().texOffs(18, 26).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 27).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right19 = fossil.addOrReplaceChild("right19", CubeListBuilder.create(), PartPose.offsetAndRotation(22.8767F, -2.0956F, -16.7257F, 2.7925F, 0.0F, -1.5708F));

		PartDefinition rightt_r4 = right19.addOrReplaceChild("rightt_r4", CubeListBuilder.create().texOffs(26, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 23).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1233F, -3.1816F, -1.0292F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR25 = right19.addOrReplaceChild("boneR25", CubeListBuilder.create(), PartPose.offset(0.1233F, 2.0684F, 1.4708F));

		PartDefinition rightb_r14 = boneR25.addOrReplaceChild("rightb_r14", CubeListBuilder.create().texOffs(18, 26).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 27).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right10 = fossil.addOrReplaceChild("right10", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.1233F, -2.0956F, 38.2743F, 2.2253F, 0.0F, -1.5708F));

		PartDefinition rightt_r5 = right10.addOrReplaceChild("rightt_r5", CubeListBuilder.create().texOffs(26, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 23).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1233F, -3.1816F, -1.0292F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR13 = right10.addOrReplaceChild("boneR13", CubeListBuilder.create(), PartPose.offset(0.1233F, 2.0684F, 1.4708F));

		PartDefinition rightb_r15 = boneR13.addOrReplaceChild("rightb_r15", CubeListBuilder.create().texOffs(18, 26).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 27).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition full = fossil.addOrReplaceChild("full", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -14.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, -2.3F, 0.0F, 0.3927F, 0.0F, -1.5708F));

		PartDefinition right = full.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition rightt_r6 = right.addOrReplaceChild("rightt_r6", CubeListBuilder.create().texOffs(6, 25).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 25).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR = right.addOrReplaceChild("boneR", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r16 = boneR.addOrReplaceChild("rightb_r16", CubeListBuilder.create().texOffs(13, 25).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right2 = full.addOrReplaceChild("right2", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.0F, 0.5F));

		PartDefinition rightt_r7 = right2.addOrReplaceChild("rightt_r7", CubeListBuilder.create().texOffs(26, 26).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR2 = right2.addOrReplaceChild("boneR2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r17 = boneR2.addOrReplaceChild("rightb_r17", CubeListBuilder.create().texOffs(16, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 20).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 24).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full8 = fossil.addOrReplaceChild("full8", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -14.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(43.0F, -2.3F, -4.0F, -0.6109F, 0.0F, -1.5708F));

		PartDefinition right17 = full8.addOrReplaceChild("right17", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition rightt_r8 = right17.addOrReplaceChild("rightt_r8", CubeListBuilder.create().texOffs(6, 25).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 25).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR23 = right17.addOrReplaceChild("boneR23", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r18 = boneR23.addOrReplaceChild("rightb_r18", CubeListBuilder.create().texOffs(13, 25).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right18 = full8.addOrReplaceChild("right18", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.0F, 0.5F));

		PartDefinition rightt_r9 = right18.addOrReplaceChild("rightt_r9", CubeListBuilder.create().texOffs(26, 26).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR24 = right18.addOrReplaceChild("boneR24", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r19 = boneR24.addOrReplaceChild("rightb_r19", CubeListBuilder.create().texOffs(16, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 20).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 24).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full4 = fossil.addOrReplaceChild("full4", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -14.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -2.3F, 19.0F, 2.3998F, 0.0F, -1.5708F));

		PartDefinition right8 = full4.addOrReplaceChild("right8", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition rightt_r10 = right8.addOrReplaceChild("rightt_r10", CubeListBuilder.create().texOffs(6, 25).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 25).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR11 = right8.addOrReplaceChild("boneR11", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r20 = boneR11.addOrReplaceChild("rightb_r20", CubeListBuilder.create().texOffs(13, 25).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right9 = full4.addOrReplaceChild("right9", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.0F, 0.5F));

		PartDefinition rightt_r11 = right9.addOrReplaceChild("rightt_r11", CubeListBuilder.create().texOffs(26, 26).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR12 = right9.addOrReplaceChild("boneR12", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r21 = boneR12.addOrReplaceChild("rightb_r21", CubeListBuilder.create().texOffs(16, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 20).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 24).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full11 = fossil.addOrReplaceChild("full11", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -14.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, -2.3F, 19.0F, -1.3963F, 0.0F, -1.5708F));

		PartDefinition right25 = full11.addOrReplaceChild("right25", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition rightt_r12 = right25.addOrReplaceChild("rightt_r12", CubeListBuilder.create().texOffs(6, 25).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 25).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR33 = right25.addOrReplaceChild("boneR33", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r22 = boneR33.addOrReplaceChild("rightb_r22", CubeListBuilder.create().texOffs(13, 25).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right26 = full11.addOrReplaceChild("right26", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.0F, 0.5F));

		PartDefinition rightt_r13 = right26.addOrReplaceChild("rightt_r13", CubeListBuilder.create().texOffs(26, 26).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR34 = right26.addOrReplaceChild("boneR34", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r23 = boneR34.addOrReplaceChild("rightb_r23", CubeListBuilder.create().texOffs(16, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 20).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 24).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full9 = fossil.addOrReplaceChild("full9", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -14.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -2.3F, 28.0F, 1.309F, 0.0F, -1.5708F));

		PartDefinition right20 = full9.addOrReplaceChild("right20", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.5F));

		PartDefinition rightt_r14 = right20.addOrReplaceChild("rightt_r14", CubeListBuilder.create().texOffs(6, 25).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 25).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR27 = right20.addOrReplaceChild("boneR27", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r24 = boneR27.addOrReplaceChild("rightb_r24", CubeListBuilder.create().texOffs(13, 25).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 25).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right21 = full9.addOrReplaceChild("right21", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.0F, 0.5F));

		PartDefinition rightt_r15 = right21.addOrReplaceChild("rightt_r15", CubeListBuilder.create().texOffs(26, 26).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR28 = right21.addOrReplaceChild("boneR28", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r25 = boneR28.addOrReplaceChild("rightb_r25", CubeListBuilder.create().texOffs(16, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 20).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 24).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full2 = fossil.addOrReplaceChild("full2", CubeListBuilder.create().texOffs(24, 15).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.3F, 0.0F, 1.8762F, 0.0F, -1.5708F));

		PartDefinition right3 = full2.addOrReplaceChild("right3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightt_r16 = right3.addOrReplaceChild("rightt_r16", CubeListBuilder.create().texOffs(24, 9).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 12).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR3 = right3.addOrReplaceChild("boneR3", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r26 = boneR3.addOrReplaceChild("rightb_r26", CubeListBuilder.create().texOffs(3, 24).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 3).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 6).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right4 = full2.addOrReplaceChild("right4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -11.4F, 0.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightt_r17 = right4.addOrReplaceChild("rightt_r17", CubeListBuilder.create().texOffs(27, 3).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 6).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR4 = right4.addOrReplaceChild("boneR4", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r27 = boneR4.addOrReplaceChild("rightb_r27", CubeListBuilder.create().texOffs(0, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full10 = fossil.addOrReplaceChild("full10", CubeListBuilder.create().texOffs(24, 15).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.3F, -34.0F, -2.9671F, 0.0F, -1.5708F));

		PartDefinition right22 = full10.addOrReplaceChild("right22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightt_r18 = right22.addOrReplaceChild("rightt_r18", CubeListBuilder.create().texOffs(24, 9).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 12).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR30 = right22.addOrReplaceChild("boneR30", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r28 = boneR30.addOrReplaceChild("rightb_r28", CubeListBuilder.create().texOffs(3, 24).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 3).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 6).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right23 = full10.addOrReplaceChild("right23", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -11.4F, 0.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightt_r19 = right23.addOrReplaceChild("rightt_r19", CubeListBuilder.create().texOffs(27, 3).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 6).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR31 = right23.addOrReplaceChild("boneR31", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r29 = boneR31.addOrReplaceChild("rightb_r29", CubeListBuilder.create().texOffs(0, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full5 = fossil.addOrReplaceChild("full5", CubeListBuilder.create().texOffs(24, 15).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, -2.3F, -4.0F, 1.0908F, 0.0F, -1.5708F));

		PartDefinition right11 = full5.addOrReplaceChild("right11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightt_r20 = right11.addOrReplaceChild("rightt_r20", CubeListBuilder.create().texOffs(24, 9).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 12).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR14 = right11.addOrReplaceChild("boneR14", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r30 = boneR14.addOrReplaceChild("rightb_r30", CubeListBuilder.create().texOffs(3, 24).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 3).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 6).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right12 = full5.addOrReplaceChild("right12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -11.4F, 0.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightt_r21 = right12.addOrReplaceChild("rightt_r21", CubeListBuilder.create().texOffs(27, 3).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 6).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR15 = right12.addOrReplaceChild("boneR15", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r31 = boneR15.addOrReplaceChild("rightb_r31", CubeListBuilder.create().texOffs(0, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full7 = fossil.addOrReplaceChild("full7", CubeListBuilder.create().texOffs(24, 15).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-38.0F, -2.3F, -4.0F, -1.4399F, 0.0F, -1.5708F));

		PartDefinition right15 = full7.addOrReplaceChild("right15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightt_r22 = right15.addOrReplaceChild("rightt_r22", CubeListBuilder.create().texOffs(24, 9).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 12).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR21 = right15.addOrReplaceChild("boneR21", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r32 = boneR21.addOrReplaceChild("rightb_r32", CubeListBuilder.create().texOffs(3, 24).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 3).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 6).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right16 = full7.addOrReplaceChild("right16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -11.4F, 0.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightt_r23 = right16.addOrReplaceChild("rightt_r23", CubeListBuilder.create().texOffs(27, 3).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 6).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR22 = right16.addOrReplaceChild("boneR22", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r33 = boneR22.addOrReplaceChild("rightb_r33", CubeListBuilder.create().texOffs(0, 24).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-0.1F, 4.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full3 = fossil.addOrReplaceChild("full3", CubeListBuilder.create().texOffs(22, 22).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.3F, 31.0F, 3.0543F, 0.0F, -1.5708F));

		PartDefinition right6 = full3.addOrReplaceChild("right6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightt_r24 = right6.addOrReplaceChild("rightt_r24", CubeListBuilder.create().texOffs(14, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 18).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 16).addBox(0.01F, 0.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR6 = right6.addOrReplaceChild("boneR6", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r34 = boneR6.addOrReplaceChild("rightb_r34", CubeListBuilder.create().texOffs(21, 15).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 21).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 22).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right7 = full3.addOrReplaceChild("right7", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.4F, 0.1F));

		PartDefinition rightt_r25 = right7.addOrReplaceChild("rightt_r25", CubeListBuilder.create().texOffs(21, 12).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR7 = right7.addOrReplaceChild("boneR7", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r35 = boneR7.addOrReplaceChild("rightb_r35", CubeListBuilder.create().texOffs(21, 6).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 9).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition full6 = fossil.addOrReplaceChild("full6", CubeListBuilder.create().texOffs(22, 22).addBox(0.0F, -11.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.3F, -28.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition right13 = full6.addOrReplaceChild("right13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5F, 0.9F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightt_r26 = right13.addOrReplaceChild("rightt_r26", CubeListBuilder.create().texOffs(14, 22).addBox(-0.19F, 2.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 18).addBox(-0.19F, 4.0F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 16).addBox(0.01F, 0.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition boneR18 = right13.addOrReplaceChild("boneR18", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, 2.5F));

		PartDefinition rightb_r36 = boneR18.addOrReplaceChild("rightb_r36", CubeListBuilder.create().texOffs(21, 15).addBox(-0.1F, 0.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 21).addBox(-0.1F, 2.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 22).addBox(-0.1F, 4.05F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(0.0F, 0.05F, -0.8F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right14 = full6.addOrReplaceChild("right14", CubeListBuilder.create(), PartPose.offset(-0.1F, -11.4F, 0.1F));

		PartDefinition rightt_r27 = right14.addOrReplaceChild("rightt_r27", CubeListBuilder.create().texOffs(21, 12).addBox(-0.19F, 2.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.19F, 4.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.01F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition boneR19 = right14.addOrReplaceChild("boneR19", CubeListBuilder.create(), PartPose.offset(0.0F, 5.75F, -2.5F));

		PartDefinition rightb_r37 = boneR19.addOrReplaceChild("rightb_r37", CubeListBuilder.create().texOffs(21, 6).addBox(-0.1F, 0.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 9).addBox(-0.1F, 2.05F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 16).addBox(0.0F, 0.05F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 368, 230);
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