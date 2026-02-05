package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SchinderhannesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Head;
	private final ModelPart Eye;
	private final ModelPart flappies;
	private final ModelPart Endite;
	private final ModelPart rightendite;
	private final ModelPart matrix;

	public SchinderhannesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Head = this.fossil.getChild("Head");
		this.Eye = this.Head.getChild("Eye");
		this.flappies = this.Head.getChild("flappies");
		this.Endite = this.flappies.getChild("Endite");
		this.rightendite = this.Endite.getChild("rightendite");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = fossil.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(-3.175F, -1.375F, -7.675F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 37).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 1.3483F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 82).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.75F, 0.0F, 4.275F, 0.0F, -0.9774F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(82, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.975F, 0.0F, 3.35F, 0.0F, -0.7592F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.075F, 0.0F, 2.775F, 0.0F, -0.3665F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 9).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.025F, 0.0F, 2.6F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 13).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.925F, 0.0F, 2.75F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.0F, 3.2F, 0.0F, 1.0297F, 0.0F));

		PartDefinition Eye = Head.addOrReplaceChild("Eye", CubeListBuilder.create(), PartPose.offset(0.0F, -0.075F, 0.0F));

		PartDefinition cube_r8 = Eye.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.75F, 0.0F, 6.55F, 0.0F, -1.549F, 0.0F));

		PartDefinition cube_r9 = Eye.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.375F, 0.0F, 7.0F, 0.0F, -1.069F, 0.0F));

		PartDefinition cube_r10 = Eye.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.025F, 0.0F, 7.325F, 0.0F, -0.8508F, 0.0F));

		PartDefinition cube_r11 = Eye.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.55F, 0.0F, 7.475F, 0.0F, -0.5018F, 0.0F));

		PartDefinition cube_r12 = Eye.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.975F, 0.0F, 7.375F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r13 = Eye.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 88).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.55F, 0.0F, 6.975F, 0.0F, 0.5454F, 0.0F));

		PartDefinition cube_r14 = Eye.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.75F, 0.0F, 5.575F, 0.0F, -2.0551F, 0.0F));

		PartDefinition cube_r15 = Eye.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-2.825F, 0.0F, 6.05F, 0.0F, -1.837F, 0.0F));

		PartDefinition cube_r16 = Eye.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-2.625F, 0.0F, 5.2F, 0.0F, -2.2733F, 0.0F));

		PartDefinition cube_r17 = Eye.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 91).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.45F, 0.0F, 5.0F, 0.0F, -2.2733F, 0.0F));

		PartDefinition cube_r18 = Eye.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(98, 62).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.725F, 0.0F, 4.8F, 0.0F, 1.741F, 0.0F));

		PartDefinition cube_r19 = Eye.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(5.775F, 0.0F, 6.425F, 0.0F, -2.1991F, 0.0F));

		PartDefinition cube_r20 = Eye.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(94, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.5F, 0.0F, 6.225F, 0.0F, -2.1991F, 0.0F));

		PartDefinition cube_r21 = Eye.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.275F, 0.0F, 5.775F, 0.0F, -2.5002F, 0.0F));

		PartDefinition cube_r22 = Eye.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(98, 88).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.15F, 0.0F, 5.35F, 0.0F, -2.7096F, 0.0F));

		PartDefinition cube_r23 = Eye.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(98, 86).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.15F, 0.0F, 4.85F, 0.0F, -3.0151F, 0.0F));

		PartDefinition cube_r24 = Eye.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(98, 56).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.325F, 0.0F, 4.425F, 0.0F, 2.9191F, 0.0F));

		PartDefinition cube_r25 = Eye.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.8F, 0.0F, 4.45F, 0.0F, 2.6136F, 0.0F));

		PartDefinition cube_r26 = Eye.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 58).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(7.225F, 0.0F, 5.975F, 0.0F, 1.5664F, 0.0F));

		PartDefinition cube_r27 = Eye.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(98, 84).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(7.075F, 0.0F, 5.675F, 0.0F, 1.7846F, 0.0F));

		PartDefinition cube_r28 = Eye.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(98, 82).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(6.85F, 0.0F, 5.275F, 0.0F, 1.9591F, 0.0F));

		PartDefinition cube_r29 = Eye.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.55F, 0.0F, 5.325F, 0.0F, 2.1773F, 0.0F));

		PartDefinition cube_r30 = Eye.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(82, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.55F, 0.0F, 4.925F, 0.0F, 2.1773F, 0.0F));

		PartDefinition cube_r31 = Eye.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(98, 64).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(6.275F, 0.0F, 4.625F, 0.0F, 2.2646F, 0.0F));

		PartDefinition cube_r32 = Eye.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 60).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.275F, 0.0F, 4.425F, 0.0F, 2.2646F, 0.0F));

		PartDefinition cube_r33 = Eye.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.15F, 0.0F, 4.2F, 0.0F, 2.5264F, 0.0F));

		PartDefinition cube_r34 = Eye.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(44, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-2.225F, 0.0F, 4.575F, 0.0F, -2.6224F, 0.0F));

		PartDefinition cube_r35 = Eye.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 90).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.75F, 0.0F, 4.25F, 0.0F, 3.05F, 0.0F));

		PartDefinition flappies = Head.addOrReplaceChild("flappies", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r36 = flappies.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 80).addBox(-1.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.45F, 0.0F, 8.6F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r37 = flappies.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 24).addBox(-1.0F, -1.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(9.525F, 0.0F, 9.0F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r38 = flappies.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 22).addBox(-1.0F, -1.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(9.525F, 0.0F, 8.225F, 0.0F, -0.0611F, 0.0F));

		PartDefinition cube_r39 = flappies.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 88).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.3F, 0.0F, 8.9F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r40 = flappies.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(6, 92).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(8.3F, 0.0F, 9.15F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r41 = flappies.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(70, 90).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.15F, 0.0F, 7.95F, 0.0F, -0.3229F, 0.0F));

		PartDefinition cube_r42 = flappies.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 56).addBox(-5.0F, -1.0F, -1.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.45F, 0.0F, 10.3F, 0.0F, -1.5882F, 0.0F));

		PartDefinition cube_r43 = flappies.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 36).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.35F, 0.0F, 19.2F, 0.0F, -2.0857F, 0.0F));

		PartDefinition cube_r44 = flappies.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 93).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(3.1F, 0.0F, 15.325F, 0.0F, -3.111F, 0.0F));

		PartDefinition cube_r45 = flappies.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 92).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.9F, 0.0F, 16.375F, 0.0F, -2.8929F, 0.0F));

		PartDefinition cube_r46 = flappies.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.875F, 0.0F, 8.725F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r47 = flappies.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 50).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.875F, 0.0F, 10.6F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r48 = flappies.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(94, 44).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.875F, 0.0F, 9.6F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r49 = flappies.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(94, 26).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.075F, 0.0F, 11.8F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r50 = flappies.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 2).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.175F, 0.0F, 8.375F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r51 = flappies.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.175F, 0.0F, 9.25F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r52 = flappies.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(36, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.175F, 0.0F, 10.275F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r53 = flappies.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 0).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.375F, 0.0F, 11.475F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r54 = flappies.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 46).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.375F, 0.0F, 14.25F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r55 = flappies.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(6, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.375F, 0.0F, 13.2F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r56 = flappies.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 93).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.375F, 0.0F, 12.325F, 0.0F, 2.4478F, 0.0F));

		PartDefinition cube_r57 = flappies.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.075F, 0.0F, 12.7F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r58 = flappies.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 52).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.075F, 0.0F, 15.525F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r59 = flappies.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(30, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.075F, 0.0F, 14.575F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r60 = flappies.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.075F, 0.0F, 13.525F, 0.0F, 2.7096F, 0.0F));

		PartDefinition cube_r61 = flappies.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(58, 80).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.775F, 0.0F, 16.775F, -3.1416F, 0.0567F, 3.1416F));

		PartDefinition cube_r62 = flappies.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.875F, 0.0F, 15.775F, -3.1416F, 0.0567F, 3.1416F));

		PartDefinition cube_r63 = flappies.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(12, 94).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(3.075F, 0.0F, 14.975F, -3.1416F, 0.0567F, 3.1416F));

		PartDefinition cube_r64 = flappies.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 92).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(3.375F, 0.0F, 14.375F, 0.0F, 2.8667F, 0.0F));

		PartDefinition cube_r65 = flappies.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(94, 48).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(3.15F, 0.075F, 15.35F, 0.0F, 2.8667F, 0.0F));

		PartDefinition cube_r66 = flappies.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.6F, 0.0F, 18.975F, 0.0F, -2.8274F, 0.0F));

		PartDefinition cube_r67 = flappies.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(92, 8).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.8F, 0.0F, 19.15F, 0.0F, -3.1329F, 0.0F));

		PartDefinition cube_r68 = flappies.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(78, 90).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.9F, 0.0F, 19.1F, 0.0F, -1.4312F, 0.0F));

		PartDefinition cube_r69 = flappies.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 93).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.8F, 0.0F, 19.1F, 0.0F, -2.042F, 0.0F));

		PartDefinition cube_r70 = flappies.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(20, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.475F, 0.0F, 18.4F, 0.0F, 1.885F, 0.0F));

		PartDefinition cube_r71 = flappies.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 90).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.025F, 0.0F, 18.525F, 0.0F, 2.7576F, 0.0F));

		PartDefinition cube_r72 = flappies.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(98, 18).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.175F, 0.0F, 18.925F, 0.0F, -2.6965F, 0.0F));

		PartDefinition cube_r73 = flappies.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(4, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 19.3F, 0.0F, -1.9111F, 0.0F));

		PartDefinition cube_r74 = flappies.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 97).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1F, 0.0F, 18.7F, 0.0F, -2.3911F, 0.0F));

		PartDefinition cube_r75 = flappies.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(92, 5).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.4F, 0.0F, 18.3F, 0.0F, -2.7402F, 0.0F));

		PartDefinition cube_r76 = flappies.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(42, 88).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0F, 0.0F, 18.6F, 0.0F, -2.3475F, 0.0F));

		PartDefinition cube_r77 = flappies.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8F, 0.0F, 19.55F, 0.0F, -2.3475F, 0.0F));

		PartDefinition cube_r78 = flappies.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(98, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(4.3F, 0.0F, 15.9F, 0.0F, -1.885F, 0.0F));

		PartDefinition cube_r79 = flappies.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.825F, 0.0F, 16.125F, 0.0F, -0.8814F, 0.0F));

		PartDefinition cube_r80 = flappies.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(4.75F, 0.0F, 16.425F, 0.0F, -0.8814F, 0.0F));

		PartDefinition cube_r81 = flappies.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 97).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(4.625F, 0.0F, 15.375F, 0.0F, -0.8814F, 0.0F));

		PartDefinition cube_r82 = flappies.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(16, 98).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.625F, 0.0F, 17.075F, 0.0F, -0.8814F, 0.0F));

		PartDefinition cube_r83 = flappies.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(82, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(4.025F, 0.0F, 19.7F, 0.0F, -1.7366F, 0.0F));

		PartDefinition cube_r84 = flappies.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.075F, 0.0F, 18.525F, 0.0F, -1.4748F, 0.0F));

		PartDefinition cube_r85 = flappies.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(84, 92).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.175F, 0.0F, 18.125F, 0.0F, -1.8937F, 0.0F));

		PartDefinition cube_r86 = flappies.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 94).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.5F, 0.0F, 24.15F, 0.0F, -1.7977F, 0.0F));

		PartDefinition cube_r87 = flappies.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(94, 90).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.25F, 0.0F, 25.25F, 0.0F, -1.7541F, 0.0F));

		PartDefinition cube_r88 = flappies.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(96, 92).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.0F, 25.575F, 0.0F, -2.0508F, 0.0F));

		PartDefinition cube_r89 = flappies.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(84, 94).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.475F, 0.0F, 25.25F, 0.0F, -2.0508F, 0.0F));

		PartDefinition cube_r90 = flappies.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 54).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.875F, 0.0F, 24.125F, 0.0F, -1.7628F, 0.0F));

		PartDefinition cube_r91 = flappies.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 88).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.225F, 0.0F, 16.925F, 0.0F, -1.8937F, 0.0F));

		PartDefinition cube_r92 = flappies.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(78, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.925F, 0.0F, 17.55F, 0.0F, -1.3701F, 0.0F));

		PartDefinition cube_r93 = flappies.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(78, 94).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(4.675F, 0.0F, 14.375F, 0.0F, -3.0718F, 0.0F));

		PartDefinition cube_r94 = flappies.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(80, 82).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.275F, 0.0F, 14.05F, 0.0F, -2.1991F, 0.0F));

		PartDefinition cube_r95 = flappies.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(68, 86).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.725F, 0.0F, 13.075F, 0.0F, -1.8064F, 0.0F));

		PartDefinition cube_r96 = flappies.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 60).addBox(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.475F, 0.025F, 14.175F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r97 = flappies.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(72, 52).addBox(-5.0F, -1.0F, -3.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.25F, 0.0F, 9.775F, 0.0F, -1.4661F, 0.0F));

		PartDefinition cube_r98 = flappies.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 86).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.825F, 0.0F, 12.85F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r99 = flappies.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(58, 84).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.65F, 0.0F, 12.175F, 0.0F, -1.2392F, 0.0F));

		PartDefinition cube_r100 = flappies.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(18, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.725F, 0.0F, 10.9F, 0.0F, -0.8465F, 0.0F));

		PartDefinition cube_r101 = flappies.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(6, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.9F, 0.0F, 10.325F, 0.0F, -0.8465F, 0.0F));

		PartDefinition cube_r102 = flappies.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.075F, 0.0F, 9.75F, 0.0F, -0.8465F, 0.0F));

		PartDefinition cube_r103 = flappies.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(24, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(6.075F, 0.0F, 9.25F, 0.0F, -0.6283F, 0.0F));

		PartDefinition cube_r104 = flappies.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(10, 88).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.0F, 19.975F, 0.0F, -1.6493F, 0.0F));

		PartDefinition cube_r105 = flappies.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 82).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.2F, 0.0F, 19.975F, -3.1416F, -1.2305F, 3.1416F));

		PartDefinition cube_r106 = flappies.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 41).addBox(-2.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.2F, 0.0F, 19.975F, -3.1416F, -1.4486F, 3.1416F));

		PartDefinition cube_r107 = flappies.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(84, 80).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.0F, 19.975F, 0.0F, -1.7366F, 0.0F));

		PartDefinition cube_r108 = flappies.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.275F, 0.0F, 5.775F, 0.0F, -1.9373F, 0.0F));

		PartDefinition cube_r109 = flappies.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 44).addBox(-1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.35F, 0.0F, 7.2F, 0.0F, -3.0718F, 0.0F));

		PartDefinition cube_r110 = flappies.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 0).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.025F, 0.0F, 6.0F, 0.0F, -2.7663F, 0.0F));

		PartDefinition cube_r111 = flappies.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.3F, 0.0F, 5.975F, 0.0F, 2.6878F, 0.0F));

		PartDefinition cube_r112 = flappies.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(78, 28).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(6.2F, 0.0F, 4.9F, 0.0F, 1.946F, 0.0F));

		PartDefinition cube_r113 = flappies.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 88).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.825F, 0.0F, 5.425F, 0.0F, 1.946F, 0.0F));

		PartDefinition cube_r114 = flappies.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.825F, 0.0F, 5.05F, 0.0F, 0.8552F, 0.0F));

		PartDefinition cube_r115 = flappies.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(72, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.15F, 0.0F, 4.95F, 0.0F, -0.0611F, 0.0F));

		PartDefinition cube_r116 = flappies.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(2.75F, 0.0F, 5.25F, 0.0F, -0.6283F, 0.0F));

		PartDefinition cube_r117 = flappies.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(12, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(6.2F, 0.0F, 8.775F, 0.0F, -0.6283F, 0.0F));

		PartDefinition cube_r118 = flappies.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(90, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.875F, 0.0F, 7.525F, 0.0F, -0.3229F, 0.0F));

		PartDefinition cube_r119 = flappies.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(88, 86).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.575F, 0.0F, 8.875F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r120 = flappies.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(90, 39).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.575F, 0.0F, 8.35F, 0.0F, 0.5498F, 0.0F));

		PartDefinition cube_r121 = flappies.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(86, 90).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.775F, 0.0F, 8.05F, 0.0F, 0.5498F, 0.0F));

		PartDefinition cube_r122 = flappies.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(88, 88).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.875F, 0.0F, 7.65F, 0.0F, 0.5498F, 0.0F));

		PartDefinition cube_r123 = flappies.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(90, 84).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-3.125F, 0.0F, 9.45F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r124 = flappies.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 26).addBox(-4.0F, -1.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-3.125F, 0.0F, 9.45F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r125 = flappies.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 3).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.125F, 0.0F, 9.025F, 0.0F, 0.1134F, 0.0F));

		PartDefinition Endite = flappies.addOrReplaceChild("Endite", CubeListBuilder.create(), PartPose.offset(2.725F, -0.125F, 1.725F));

		PartDefinition cube_r126 = Endite.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 28).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.15F, 0.0F, 2.3F, -3.1416F, -1.1825F, 3.1416F));

		PartDefinition cube_r127 = Endite.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(92, 17).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.15F, 0.0F, 2.1F, -3.1416F, -1.1825F, 3.1416F));

		PartDefinition cube_r128 = Endite.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(92, 14).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.15F, 0.0F, 1.9F, -3.1416F, -1.1825F, 3.1416F));

		PartDefinition cube_r129 = Endite.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(98, 14).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.375F, 0.0F, 3.25F, 0.0F, -1.5184F, 0.0F));

		PartDefinition cube_r130 = Endite.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(98, 12).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.175F, 0.0F, 3.55F, 0.0F, -1.5184F, 0.0F));

		PartDefinition cube_r131 = Endite.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(12, 98).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.325F, 0.0F, 3.55F, 0.0F, -1.5184F, 0.0F));

		PartDefinition cube_r132 = Endite.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.95F, 0.0F, 3.575F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r133 = Endite.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(98, 10).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.45F, 0.0F, 3.85F, 0.0F, -1.5184F, 0.0F));

		PartDefinition cube_r134 = Endite.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(42, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.075F, 0.0F, 3.875F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r135 = Endite.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.275F, 0.0F, 4.175F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r136 = Endite.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(96, 94).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, 0.0F, 4.05F, 0.0F, -1.693F, 0.0F));

		PartDefinition cube_r137 = Endite.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 97).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, 0.0F, 4.025F, 0.0F, -1.693F, 0.0F));

		PartDefinition cube_r138 = Endite.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 8).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.15F, 0.0F, 4.325F, 0.0F, -1.693F, 0.0F));

		PartDefinition cube_r139 = Endite.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(8, 98).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.325F, 0.0F, 4.35F, 0.0F, -1.693F, 0.0F));

		PartDefinition cube_r140 = Endite.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(70, 97).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.875F, 0.0F, 4.475F, 0.0F, -1.4312F, 0.0F));

		PartDefinition cube_r141 = Endite.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.375F, 0.0F, 4.45F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r142 = Endite.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(98, 16).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.65F, 0.0F, 4.8F, 0.0F, -1.5621F, 0.0F));

		PartDefinition cube_r143 = Endite.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.025F, 0.0F, 4.825F, 0.0F, -1.4312F, 0.0F));

		PartDefinition cube_r144 = Endite.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(78, 96).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.525F, 0.0F, 4.8F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r145 = Endite.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(90, 32).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.175F, 0.075F, 3.125F, 0.0F, -1.1257F, 0.0F));

		PartDefinition cube_r146 = Endite.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(58, 97).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -1.693F, 0.0F));

		PartDefinition rightendite = Endite.addOrReplaceChild("rightendite", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.625F, 0.075F, -1.025F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r147 = rightendite.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(96, 80).addBox(-2.9877F, -1.0F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.425F, -0.075F, 1.825F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r148 = rightendite.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(28, 98).addBox(-2.8252F, -1.0F, -2.1695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.075F, -0.075F, 1.85F, 0.0F, 1.4312F, 0.0F));

		PartDefinition cube_r149 = rightendite.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(98, 38).addBox(-2.6398F, -1.0F, -2.6588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.45F, -0.075F, 1.825F, 0.0F, 1.5621F, 0.0F));

		PartDefinition cube_r150 = rightendite.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(98, 36).addBox(-2.3922F, -1.0F, -3.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.775F, -0.075F, 1.375F, 0.0F, 1.693F, 0.0F));

		PartDefinition cube_r151 = rightendite.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 98).addBox(-2.3922F, -1.0F, -3.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.95F, -0.075F, 1.35F, 0.0F, 1.693F, 0.0F));

		PartDefinition cube_r152 = rightendite.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 24).addBox(-2.8252F, -1.0F, -2.1695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.225F, -0.075F, 1.5F, 0.0F, 1.4312F, 0.0F));

		PartDefinition cube_r153 = rightendite.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 6).addBox(-2.9877F, -1.0F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.275F, -0.075F, 1.475F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r154 = rightendite.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(98, 20).addBox(-2.3922F, -1.0F, -3.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.1F, -0.075F, 1.025F, 0.0F, 1.693F, 0.0F));

		PartDefinition cube_r155 = rightendite.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(98, 22).addBox(-2.3922F, -1.0F, -3.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -0.075F, 1.05F, 0.0F, 1.693F, 0.0F));

		PartDefinition cube_r156 = rightendite.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(24, 98).addBox(-2.3922F, -1.0F, -3.1197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7F, -0.075F, 1.075F, 0.0F, 1.693F, 0.0F));

		PartDefinition cube_r157 = rightendite.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 97).addBox(-2.9877F, -1.0F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.175F, -0.075F, 1.2F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r158 = rightendite.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(32, 98).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.65F, -0.075F, 0.875F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r159 = rightendite.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(98, 4).addBox(-2.9877F, -1.0F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.025F, -0.075F, 0.9F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r160 = rightendite.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(98, 30).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.925F, -0.075F, 0.575F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r161 = rightendite.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(98, 42).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.775F, -0.075F, 0.575F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r162 = rightendite.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(98, 28).addBox(-2.9877F, -1.0F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.15F, -0.075F, 0.6F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r163 = rightendite.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(92, 11).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -0.075F, -0.675F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r164 = rightendite.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(92, 41).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.8F, -0.075F, -0.475F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r165 = rightendite.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(92, 56).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.725F, -0.075F, -0.275F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r166 = rightendite.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(98, 40).addBox(-2.7087F, -1.0F, -2.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.725F, -0.075F, 0.275F, 0.0F, 1.5184F, 0.0F));

		PartDefinition cube_r167 = rightendite.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(90, 34).addBox(-4.9998F, -1.0F, -0.9651F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.125F, 0.0F, 0.2F, 0.0F, 1.1257F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(58, 66).addBox(-16.675F, -2.0F, -14.875F, 17.0F, 2.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r168 = matrix.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -2.0F, -4.0F, 16.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.225F, 0.0F, 0.675F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r169 = matrix.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -2.0F, -4.0F, 9.0F, 2.0F, 20.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-10.125F, 0.0F, 17.35F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r170 = matrix.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 0).addBox(-20.0F, -2.0F, -4.0F, 21.0F, 2.0F, 20.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(19.125F, 0.0F, -7.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r171 = matrix.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 22).addBox(-18.0F, -2.0F, -4.0F, 19.0F, 2.0F, 20.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(13.975F, 0.0F, 10.8F, 0.0F, -0.6981F, 0.0F));

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