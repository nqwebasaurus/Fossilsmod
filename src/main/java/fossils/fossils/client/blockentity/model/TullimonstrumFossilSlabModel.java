package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TullimonstrumFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart eyes;
	private final ModelPart matrix;

	public TullimonstrumFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.eyes = this.body.getChild("eyes");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(-2.05F, 23.6F, -2.275F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 26).addBox(-6.0F, -1.0F, -1.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 71).addBox(-5.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.325F, 0.0F, 5.875F, 0.0F, -0.1527F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 64).addBox(-4.0F, -1.0F, -6.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(15.025F, 0.0F, 7.45F, 0.0F, -0.5018F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 70).addBox(-4.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.25F, 0.0F, 4.3F, 0.0F, -2.9452F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 77).addBox(-4.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.125F, 0.0F, 5.15F, 0.0F, -2.5962F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 77).addBox(-4.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(13.625F, 0.0F, 3.65F, 0.0F, -2.5962F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 68).addBox(-6.0F, -1.0F, -2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(14.275F, 0.0F, 4.2F, 0.0F, -2.5962F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 15).addBox(-6.0F, -1.0F, -2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(15.675F, 0.0F, 4.3F, 0.0F, -2.5962F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 76).addBox(-6.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.675F, 0.0F, 1.575F, 0.0F, -3.0325F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 75).addBox(-6.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(14.875F, 0.0F, 0.2F, 0.0F, 2.9889F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 69).addBox(-8.0F, -1.0F, -4.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(14.875F, 0.0F, -4.25F, 0.0F, 2.378F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 50).addBox(-6.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.125F, 0.0F, -4.3F, 0.0F, 2.6834F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 60).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(19.725F, 0.0F, -1.6F, 0.0F, 0.4581F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 0).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(17.6F, 0.0F, 0.275F, 0.0F, 0.2836F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 60).addBox(-10.0F, -1.0F, -2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.325F, 0.0F, 1.675F, 0.0F, 0.2836F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 74).addBox(-11.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-25.175F, -0.2F, 1.175F, 0.0F, -2.33F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 45).addBox(-11.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-25.05F, -0.2F, -0.725F, 0.0F, -2.4609F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 74).addBox(-11.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-21.7F, -0.2F, 1.95F, 0.0F, -2.0682F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 53).addBox(-11.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-26.05F, -0.2F, 0.35F, 0.0F, -2.5045F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 77).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-22.475F, -0.2F, 4.225F, 0.0F, -1.8937F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 77).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-23.125F, -0.2F, 1.175F, 0.0F, -2.1991F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(18, 77).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-24.725F, -0.2F, 2.7F, 0.0F, -2.1991F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 77).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-20.8F, -0.2F, 5.425F, 0.0F, -1.6755F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(76, 76).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-14.925F, -0.2F, 5.125F, 0.0F, -1.021F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(70, 76).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-12.575F, -0.2F, 4.975F, 0.0F, -0.8029F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 76).addBox(-10.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-9.7F, -0.2F, 3.2F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 74).addBox(-11.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-7.55F, 0.0F, 0.825F, 0.0F, -0.1527F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 75).addBox(-11.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-8.5F, 0.0F, 4.1F, 0.0F, -0.4581F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 74).addBox(-10.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-6.75F, 0.0F, 4.95F, 0.0F, -0.4581F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(28, 73).addBox(-10.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-6.75F, 0.0F, 8.2F, 0.0F, -0.7636F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(66, 10).addBox(-11.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-6.4F, 0.0F, 9.65F, 0.0F, -0.8508F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 46).addBox(-9.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.0F, 5.875F, 0.0F, -0.2836F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(54, 73).addBox(-9.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.0F, 5.575F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 64).addBox(-9.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.825F, 0.0F, 6.825F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(42, 69).addBox(-9.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.95F, 0.0F, 7.475F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 55).addBox(-10.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.0F, 0.0F, 5.775F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 55).addBox(-10.0F, -1.0F, -3.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.825F, 0.0F, 4.625F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 22).addBox(-6.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(12.325F, 0.0F, 2.025F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 66).addBox(-6.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(8.675F, 0.0F, 0.775F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 26).addBox(-5.0F, -1.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.925F, 0.0F, 0.4F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 70).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.6F, 0.0F, 5.45F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 17).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.775F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition eyes = body.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(-12.0F, -0.325F, 6.025F));

		PartDefinition cube_r42 = eyes.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(38, 9).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.25F, 0.0F, -4.85F, 0.0F, -2.9671F, 0.0F));

		PartDefinition cube_r43 = eyes.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(36, 9).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-1.0F, -0.025F, -7.85F, 0.0F, 1.7017F, 0.0F));

		PartDefinition cube_r44 = eyes.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 21).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, -0.025F, -7.075F, 0.0F, 2.0071F, 0.0F));

		PartDefinition cube_r45 = eyes.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 31).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.225F, 0.025F, -4.65F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r46 = eyes.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 42).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.15F, 0.0F, -4.85F, 0.0F, 3.1154F, 0.0F));

		PartDefinition cube_r47 = eyes.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 21).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.025F, -0.075F, -1.825F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r48 = eyes.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(16, 69).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.55F, 0.0F, -3.75F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r49 = eyes.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 21).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.075F, -0.05F, -3.775F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r50 = eyes.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 19).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.3F, -0.05F, -1.1F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r51 = eyes.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(35, 19).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offset(-12.0F, 0.075F, 6.025F));

		PartDefinition cube_r52 = matrix.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(32, 39).addBox(2.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.275F, 0.0F, -0.65F, 0.0F, 2.1642F, 0.0F));

		PartDefinition cube_r53 = matrix.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 59).addBox(2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-7.825F, 0.0F, -18.825F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r54 = matrix.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(20, 63).addBox(2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.975F, 0.0F, -16.525F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r55 = matrix.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 5).addBox(2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-11.4F, 0.0F, -12.325F, 0.0F, 1.0734F, 0.0F));

		PartDefinition cube_r56 = matrix.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 32).addBox(2.0F, -1.0F, -1.0F, 7.0F, 1.0F, 9.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-10.05F, 0.0F, -5.625F, 0.0F, 1.597F, 0.0F));

		PartDefinition cube_r57 = matrix.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 0).addBox(2.0F, -1.0F, -1.0F, 7.0F, 1.0F, 8.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.475F, 0.0F, 0.55F, 0.0F, 2.7751F, 0.0F));

		PartDefinition cube_r58 = matrix.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 47).addBox(1.0F, -1.0F, -6.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.65F, 0.0F, -14.7F, 0.0F, 2.5787F, 0.0F));

		PartDefinition cube_r59 = matrix.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 10).addBox(2.0F, -1.0F, -10.0F, 6.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.075F, 0.0F, -10.05F, 0.0F, 2.378F, 0.0F));

		PartDefinition cube_r60 = matrix.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 17).addBox(2.0F, -1.0F, -7.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.725F, 0.0F, -9.475F, 0.0F, 2.7751F, 0.0F));

		PartDefinition cube_r61 = matrix.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(32, 32).addBox(2.0F, -1.0F, -5.0F, 11.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(20.45F, 0.0F, -10.075F, 0.0F, 3.1241F, 0.0F));

		PartDefinition cube_r62 = matrix.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(34, 10).addBox(2.0F, -1.0F, -5.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.275F, 0.0F, -9.375F, 0.0F, 3.0805F, 0.0F));

		PartDefinition cube_r63 = matrix.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(22, 55).addBox(2.0F, -1.0F, -6.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(33.775F, 0.0F, -7.825F, 0.0F, 2.8623F, 0.0F));

		PartDefinition cube_r64 = matrix.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(60, 39).addBox(2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(36.15F, 0.0F, -4.825F, 0.0F, 2.4696F, 0.0F));

		PartDefinition cube_r65 = matrix.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(38, 74).addBox(2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(35.875F, 0.0F, -1.925F, 0.0F, 1.9024F, 0.0F));

		PartDefinition cube_r66 = matrix.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 33).addBox(2.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(33.4F, 0.0F, 0.15F, 0.0F, 1.2043F, 0.0F));

		PartDefinition cube_r67 = matrix.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 28).addBox(2.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(30.375F, 0.0F, 0.8F, 0.0F, 0.637F, 0.0F));

		PartDefinition cube_r68 = matrix.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(38, 64).addBox(2.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.675F, 0.0F, -0.375F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r69 = matrix.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 47).addBox(2.0F, -1.0F, -6.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(22.575F, 0.0F, 1.95F, 0.0F, 0.4494F, 0.0F));

		PartDefinition cube_r70 = matrix.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 42).addBox(2.0F, -1.0F, -7.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.7F, 0.0F, 1.95F, 0.0F, 0.1353F, 0.0F));

		PartDefinition cube_r71 = matrix.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -1.0F, -8.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(12.0F, 0.0F, 2.125F, 0.0F, 0.048F, 0.0F));

		PartDefinition cube_r72 = matrix.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -8.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 0.0F, 1.15F, 0.0F, -0.1265F, 0.0F));

		PartDefinition cube_r73 = matrix.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -6.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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