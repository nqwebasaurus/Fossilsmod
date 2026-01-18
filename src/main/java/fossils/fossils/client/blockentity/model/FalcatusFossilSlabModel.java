package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FalcatusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart female;
	private final ModelPart male;
	private final ModelPart bone2;
	private final ModelPart matrix;

	public FalcatusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.female = this.fossil.getChild("female");
		this.male = this.fossil.getChild("male");
		this.bone2 = this.male.getChild("bone2");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition female = fossil.addOrReplaceChild("female", CubeListBuilder.create(), PartPose.offset(-14.7F, -0.25F, -6.8F));

		PartDefinition cube_r1 = female.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 84).addBox(-6.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.0F, 0.575F, 0.0F, 0.4974F, 0.0F));

		PartDefinition cube_r2 = female.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 48).addBox(-6.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.0F, 1.2F, 0.0F, 0.4974F, 0.0F));

		PartDefinition cube_r3 = female.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 57).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.0F, 1.6F, 0.0F, -0.6807F, 0.0F));

		PartDefinition cube_r4 = female.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 78).addBox(-5.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, -0.025F, 1.25F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r5 = female.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 78).addBox(-7.0F, -1.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, -0.025F, 0.65F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r6 = female.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 70).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, 0.25F, 2.275F, 0.0F, -0.2836F, 0.0F));

		PartDefinition cube_r7 = female.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 33).addBox(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 0.225F, 3.975F, 0.0F, -0.2836F, 0.0F));

		PartDefinition cube_r8 = female.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 27).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(25.95F, 0.1F, 8.175F, 0.0F, 0.1702F, 0.0F));

		PartDefinition cube_r9 = female.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 25).addBox(-9.0F, -1.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(30.65F, -0.025F, 7.375F, 0.0F, 0.1702F, 0.0F));

		PartDefinition cube_r10 = female.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 87).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(28.65F, 0.025F, 7.625F, 0.0F, -0.1876F, 0.0F));

		PartDefinition cube_r11 = female.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 87).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(28.65F, 0.0F, 7.625F, 0.0F, -0.3622F, 0.0F));

		PartDefinition cube_r12 = female.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(82, 73).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(30.65F, -0.05F, 7.375F, 0.0F, 0.0305F, 0.0F));

		PartDefinition cube_r13 = female.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 82).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.55F, 0.2F, 7.675F, 0.0F, 0.0305F, 0.0F));

		PartDefinition cube_r14 = female.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 73).addBox(-4.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(17.725F, 0.175F, 7.05F, 0.0F, 1.9853F, 0.0F));

		PartDefinition cube_r15 = female.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 88).addBox(-4.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(17.725F, 0.075F, 9.05F, 0.0F, 2.378F, 0.0F));

		PartDefinition cube_r16 = female.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 54).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.75F, 0.15F, 7.875F, 0.0F, 0.8508F, 0.0F));

		PartDefinition cube_r17 = female.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 61).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(22.25F, 0.025F, 8.425F, 0.0F, 0.1527F, 0.0F));

		PartDefinition cube_r18 = female.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 57).addBox(-6.0F, -1.0F, -5.0F, 9.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(17.25F, -0.025F, 8.375F, 0.0F, -0.0916F, 0.0F));

		PartDefinition cube_r19 = female.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(86, 86).addBox(-6.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.65F, 0.125F, 4.175F, 0.0F, 0.9207F, 0.0F));

		PartDefinition cube_r20 = female.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 74).addBox(-6.0F, -1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4F, 0.25F, 7.0F, 0.0F, 0.1178F, 0.0F));

		PartDefinition cube_r21 = female.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(80, 59).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.55F, 0.2F, 7.775F, 0.0F, 0.1178F, 0.0F));

		PartDefinition cube_r22 = female.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 57).addBox(-6.0F, -1.0F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.75F, 0.225F, 7.775F, 0.0F, -0.4232F, 0.0F));

		PartDefinition cube_r23 = female.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 75).addBox(-6.0F, -1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.55F, 0.2F, 5.475F, 0.0F, -0.5629F, 0.0F));

		PartDefinition cube_r24 = female.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 83).addBox(-6.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.95F, 0.2F, 6.375F, 0.0F, -1.6362F, 0.0F));

		PartDefinition cube_r25 = female.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 50).addBox(-6.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.05F, 0.15F, 6.775F, 0.0F, -2.1075F, 0.0F));

		PartDefinition cube_r26 = female.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(22, 84).addBox(-6.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, -0.05F, -1.975F, 0.0F, 0.9032F, 0.0F));

		PartDefinition cube_r27 = female.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(44, 89).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.95F, 0.2F, 6.525F, 0.0F, -1.9679F, 0.0F));

		PartDefinition cube_r28 = female.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 89).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.95F, 0.175F, 8.275F, 0.0F, -1.8457F, 0.0F));

		PartDefinition cube_r29 = female.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 4).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.225F, 4.775F, 0.0F, -1.2348F, 0.0F));

		PartDefinition cube_r30 = female.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(90, 22).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.95F, 0.175F, 4.775F, 0.0F, -1.2348F, 0.0F));

		PartDefinition cube_r31 = female.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 81).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.05F, 0.125F, 2.875F, 0.0F, -0.7549F, 0.0F));

		PartDefinition cube_r32 = female.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(76, 80).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.15F, 0.25F, 2.975F, 0.0F, -0.1265F, 0.0F));

		PartDefinition cube_r33 = female.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 71).addBox(-9.0F, -1.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(21.05F, 0.0F, 2.975F, 0.0F, -0.0044F, 0.0F));

		PartDefinition cube_r34 = female.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 83).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.8F, -0.05F, 4.425F, 0.0F, -0.1178F, 0.0F));

		PartDefinition cube_r35 = female.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 37).addBox(-9.0F, -1.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(19.0F, -0.075F, 4.425F, 0.0F, 0.0044F, 0.0F));

		PartDefinition cube_r36 = female.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 81).addBox(-9.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(27.25F, -0.05F, 3.825F, 0.0F, 0.0654F, 0.0F));

		PartDefinition cube_r37 = female.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(18, 70).addBox(-9.0F, -1.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(27.75F, 0.0F, 2.525F, 0.0F, 0.0654F, 0.0F));

		PartDefinition cube_r38 = female.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 14).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(29.225F, 0.025F, 2.575F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r39 = female.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 6).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(28.15F, 0.0F, 5.0F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r40 = female.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(18, 89).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(28.575F, 0.025F, 2.925F, 0.0F, 1.2959F, 0.0F));

		PartDefinition cube_r41 = female.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(28.725F, 0.0F, 4.025F, 0.0F, 0.637F, 0.0F));

		PartDefinition cube_r42 = female.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(26, 64).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(25.225F, 0.05F, 3.075F, 0.0F, 0.1178F, 0.0F));

		PartDefinition cube_r43 = female.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 20).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(25.75F, -0.025F, 2.675F, 0.0F, 0.9468F, 0.0F));

		PartDefinition cube_r44 = female.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 18).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(26.375F, -0.05F, 2.675F, 0.0F, 0.9468F, 0.0F));

		PartDefinition cube_r45 = female.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 2).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(29.975F, -0.025F, 4.1F, 0.0F, -0.9381F, 0.0F));

		PartDefinition cube_r46 = female.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(32, 84).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(27.125F, -0.075F, 5.425F, 0.0F, -0.973F, 0.0F));

		PartDefinition cube_r47 = female.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 68).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.075F, 0.225F, 5.425F, 0.0F, -0.4494F, 0.0F));

		PartDefinition cube_r48 = female.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(12, 89).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.825F, 0.15F, 5.425F, 0.0F, 0.1702F, 0.0F));

		PartDefinition cube_r49 = female.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(6, 89).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.625F, 0.175F, 4.425F, 0.0F, 0.781F, 0.0F));

		PartDefinition cube_r50 = female.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 90).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(29.125F, 0.1F, 3.075F, 0.0F, 1.2086F, 0.0F));

		PartDefinition cube_r51 = female.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 16).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(30.575F, 0.05F, 3.075F, 0.0F, 0.4407F, 0.0F));

		PartDefinition cube_r52 = female.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 88).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(31.275F, 0.0F, 3.225F, 0.0F, -0.2836F, 0.0F));

		PartDefinition cube_r53 = female.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 88).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(30.775F, 0.125F, 3.175F, 0.0F, -0.2836F, 0.0F));

		PartDefinition cube_r54 = female.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 89).addBox(-6.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.025F, -0.75F, 0.0F, 1.0123F, 0.0F));

		PartDefinition male = fossil.addOrReplaceChild("male", CubeListBuilder.create(), PartPose.offset(8.0F, -0.525F, -7.0F));

		PartDefinition cube_r55 = male.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(24, 89).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8F, 0.4F, 4.8F, 0.0F, 0.6894F, 0.0F));

		PartDefinition cube_r56 = male.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 10).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.35F, 5.2F, 0.0F, 2.3824F, 0.0F));

		PartDefinition cube_r57 = male.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 8).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, 0.4F, 7.3F, 0.0F, 2.7663F, 0.0F));

		PartDefinition cube_r58 = male.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 80).addBox(-15.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-13.625F, 0.225F, 19.35F, 0.0F, -0.7592F, 0.0F));

		PartDefinition cube_r59 = male.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 53).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-27.025F, 0.3F, 21.35F, 0.0F, -2.2078F, 0.0F));

		PartDefinition cube_r60 = male.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(54, 86).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-27.425F, 0.35F, 14.05F, 0.0F, -2.9845F, 0.0F));

		PartDefinition cube_r61 = male.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(86, 31).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-25.325F, 0.275F, 24.95F, 0.0F, -1.9024F, 0.0F));

		PartDefinition cube_r62 = male.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(88, 35).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-28.125F, 0.3F, 23.35F, 0.0F, -2.2515F, 0.0F));

		PartDefinition cube_r63 = male.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(88, 63).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-27.925F, 0.3F, 21.35F, 0.0F, -2.3736F, 0.0F));

		PartDefinition cube_r64 = male.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(24, 87).addBox(-11.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-26.9F, 0.35F, 4.725F, 0.0F, 2.4347F, 0.0F));

		PartDefinition cube_r65 = male.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 29).addBox(-11.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-27.6F, 0.275F, 4.725F, 0.0F, 2.4347F, 0.0F));

		PartDefinition cube_r66 = male.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 88).addBox(-9.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-26.625F, 0.275F, 17.55F, 0.0F, -2.4958F, 0.0F));

		PartDefinition cube_r67 = male.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 46).addBox(-10.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-26.625F, 0.35F, 18.25F, 0.0F, -2.4958F, 0.0F));

		PartDefinition cube_r68 = male.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(58, 71).addBox(-11.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-26.225F, 0.3F, 17.65F, 0.0F, -2.5831F, 0.0F));

		PartDefinition cube_r69 = male.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 78).addBox(-11.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-27.625F, 0.3F, 6.45F, 0.0F, 2.6704F, 0.0F));

		PartDefinition cube_r70 = male.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 84).addBox(-11.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-25.925F, 0.25F, 8.45F, 0.0F, 2.7925F, 0.0F));

		PartDefinition cube_r71 = male.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(16, 80).addBox(-11.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-21.55F, 0.3F, 9.925F, 0.0F, 2.7707F, 0.0F));

		PartDefinition cube_r72 = male.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 64).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-18.05F, 0.35F, 12.525F, 0.0F, 2.9452F, 0.0F));

		PartDefinition cube_r73 = male.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 72).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-11.95F, 0.3F, 15.225F, 0.0F, -3.111F, 0.0F));

		PartDefinition cube_r74 = male.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(32, 76).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.45F, 0.25F, 15.925F, 0.0F, -2.9714F, 0.0F));

		PartDefinition cube_r75 = male.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(76, 82).addBox(-13.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-21.125F, 0.225F, 10.925F, 0.0F, 3.0238F, 0.0F));

		PartDefinition cube_r76 = male.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 77).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-14.85F, 0.25F, 12.825F, 0.0F, -3.0805F, 0.0F));

		PartDefinition cube_r77 = male.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 79).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-8.425F, 0.225F, 12.9F, 0.0F, -3.0063F, 0.0F));

		PartDefinition cube_r78 = male.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(86, 88).addBox(-8.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.675F, 0.3F, 19.1F, 0.0F, -2.7533F, 0.0F));

		PartDefinition cube_r79 = male.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(84, 44).addBox(-10.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.375F, 0.325F, 15.825F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r80 = male.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(84, 42).addBox(-10.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.125F, 0.175F, 14.425F, 0.0F, 0.24F, 0.0F));

		PartDefinition cube_r81 = male.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(88, 65).addBox(-8.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-8.65F, 0.3F, 22.225F, 0.0F, -1.3308F, 0.0F));

		PartDefinition cube_r82 = male.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 83).addBox(-8.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.375F, 0.325F, 22.625F, 0.0F, -1.4617F, 0.0F));

		PartDefinition cube_r83 = male.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 90).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-13.75F, 0.3F, 21.05F, 0.0F, -2.2035F, 0.0F));

		PartDefinition cube_r84 = male.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(48, 76).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-11.75F, 0.3F, 22.325F, 0.0F, -2.0726F, 0.0F));

		PartDefinition cube_r85 = male.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(32, 87).addBox(-7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.85F, 0.275F, 23.125F, 0.0F, -1.5403F, 0.0F));

		PartDefinition cube_r86 = male.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(38, 87).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.975F, 0.25F, 16.475F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r87 = male.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(58, 81).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.125F, 0.3F, 17.975F, 0.0F, -0.7112F, 0.0F));

		PartDefinition cube_r88 = male.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 68).addBox(-11.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.125F, 0.25F, 17.925F, 0.0F, -0.7636F, 0.0F));

		PartDefinition cube_r89 = male.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 86).addBox(-11.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.375F, 0.3F, 18.1F, 0.0F, -0.8421F, 0.0F));

		PartDefinition cube_r90 = male.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 55).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.3F, 0.25F, 18.475F, 0.0F, -0.8421F, 0.0F));

		PartDefinition cube_r91 = male.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(44, 83).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-12.55F, 0.275F, 24.725F, 0.0F, -2.0202F, 0.0F));

		PartDefinition cube_r92 = male.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(74, 84).addBox(-11.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.75F, 0.3F, 20.025F, 0.0F, -2.5875F, 0.0F));

		PartDefinition cube_r93 = male.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 79).addBox(-13.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.45F, 0.3F, 15.125F, 0.0F, -3.0063F, 0.0F));

		PartDefinition cube_r94 = male.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(10, 85).addBox(-12.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.05F, 0.3F, 15.775F, 0.0F, -2.8842F, 0.0F));

		PartDefinition cube_r95 = male.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 86).addBox(-11.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.825F, 0.325F, 2.2F, 0.0F, 1.3701F, 0.0F));

		PartDefinition cube_r96 = male.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 87).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.775F, 0.3F, 12.4F, 0.0F, -2.906F, 0.0F));

		PartDefinition cube_r97 = male.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(88, 33).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.375F, 0.325F, 5.4F, 0.0F, 2.6354F, 0.0F));

		PartDefinition cube_r98 = male.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(50, 88).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.625F, 0.275F, 2.2F, 0.0F, 2.1118F, 0.0F));

		PartDefinition cube_r99 = male.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(48, 64).addBox(-12.0F, -1.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.725F, 0.325F, 2.5F, 0.0F, 1.9548F, 0.0F));

		PartDefinition cube_r100 = male.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 88).addBox(-11.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(12.225F, 0.3F, 2.8F, 0.0F, 1.0123F, 0.0F));

		PartDefinition cube_r101 = male.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 39).addBox(-12.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(9.225F, 0.275F, 1.7F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r102 = male.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 86).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.675F, 0.3F, 10.4F, 0.0F, 2.9671F, 0.0F));

		PartDefinition cube_r103 = male.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(86, 70).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.575F, 0.275F, 16.9F, 0.0F, -2.7053F, 0.0F));

		PartDefinition cube_r104 = male.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(8, 87).addBox(-12.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.625F, 0.3F, 19.8F, 0.0F, -2.3213F, 0.0F));

		PartDefinition cube_r105 = male.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 37).addBox(-12.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.575F, 0.3F, 15.4F, 0.0F, -2.6747F, 0.0F));

		PartDefinition cube_r106 = male.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 90).addBox(-12.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.275F, 0.3F, 22.875F, 0.0F, -1.5839F, 0.0F));

		PartDefinition cube_r107 = male.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(34, 90).addBox(-12.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.375F, 0.325F, 15.7F, 0.0F, -2.6747F, 0.0F));

		PartDefinition cube_r108 = male.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 82).addBox(-12.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.475F, 0.3F, 13.575F, 0.0F, -2.8231F, 0.0F));

		PartDefinition cube_r109 = male.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 67).addBox(-12.0F, -1.0F, -2.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-23.375F, 0.325F, 11.575F, 0.0F, -3.0892F, 0.0F));

		PartDefinition cube_r110 = male.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 80).addBox(-12.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-20.975F, 0.275F, 12.075F, 0.0F, -3.0238F, 0.0F));

		PartDefinition cube_r111 = male.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(68, 73).addBox(-12.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-19.1F, 0.3F, 12.525F, 0.0F, -2.954F, 0.0F));

		PartDefinition cube_r112 = male.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(70, 27).addBox(-12.0F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-16.525F, 0.325F, 12.625F, 0.0F, -2.8929F, 0.0F));

		PartDefinition cube_r113 = male.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(30, 57).addBox(-12.0F, -1.0F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-10.15F, 0.275F, 9.825F, 0.0F, -3.1285F, 0.0F));

		PartDefinition cube_r114 = male.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(32, 78).addBox(-12.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.25F, 9.825F, 0.0F, 3.1372F, 0.0F));

		PartDefinition cube_r115 = male.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 75).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.5F, 9.1F, 0.0F, 3.002F, 0.0F));

		PartDefinition cube_r116 = male.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(90, 24).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.925F, 0.425F, 4.95F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r117 = male.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(70, 23).addBox(-7.0F, -1.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.0F, 0.175F, 7.1F, 0.0F, 0.1789F, 0.0F));

		PartDefinition cube_r118 = male.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 21).addBox(-7.0F, -1.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.0F, 0.2F, 7.1F, 0.0F, 0.1047F, 0.0F));

		PartDefinition bone2 = male.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 3.2F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(22, 67).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4F, -2.1F, 0.0F, 1.4224F, 0.0F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 90).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.4F, -1.4F, 0.0F, 1.2828F, 0.0F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(90, 12).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.375F, 0.0F, 0.0F, 1.501F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, -7.0F));

		PartDefinition cube_r122 = matrix.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(36, 73).addBox(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.3F, 0.0F, 4.95F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r123 = matrix.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 40).addBox(-7.0F, -1.0F, -8.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.0F, 0.1F, 15.4F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r124 = matrix.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 40).addBox(-11.0F, -1.0F, -12.0F, 12.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.0F, 0.025F, 9.4F, 0.0F, -1.4399F, 0.0F));

		PartDefinition cube_r125 = matrix.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -1.0F, -1.0F, 25.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.075F, 17.4F, 0.0F, 3.0107F, 0.0F));

		PartDefinition cube_r126 = matrix.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 50).addBox(-11.0F, -1.0F, -1.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.025F, 18.4F, 0.0F, -2.8362F, 0.0F));

		PartDefinition cube_r127 = matrix.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 64).addBox(-11.0F, -1.0F, -1.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 0.075F, 16.0F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r128 = matrix.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 54).addBox(-16.0F, -1.0F, -1.0F, 17.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9F, -0.025F, -1.8F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r129 = matrix.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 21).addBox(-16.0F, -1.0F, -1.0F, 17.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8F, 0.05F, -0.4F, 0.0F, -0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 98);
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