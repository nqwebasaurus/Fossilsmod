package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CoccosteusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart matrix;

	public CoccosteusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone3 = this.fossil.getChild("bone3");
		this.bone = this.fossil.getChild("bone");
		this.bone2 = this.fossil.getChild("bone2");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(-3.125F, 23.6F, 2.45F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-4.85F, 0.0F, -6.7F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 64).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-16.375F, 0.0F, -5.15F, 0.0F, 0.9512F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 39).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-12.05F, 0.0F, 0.6F, 0.0F, 2.8754F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 80).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-11.3F, 0.0F, 1.3F, 0.0F, 2.282F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 80).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-11.175F, 0.0F, 1.55F, 0.0F, 2.1773F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 59).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-11.15F, 0.0F, 2.15F, 0.0F, 1.8282F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 76).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-10.975F, 0.0F, 2.375F, 0.0F, 2.0028F, 0.0F));

		PartDefinition cube_r8 = fossil.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-16.9F, 0.0F, -3.15F, 0.0F, 2.474F, 0.0F));

		PartDefinition cube_r9 = fossil.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-16.8F, 0.0F, -3.025F, 0.0F, 2.4216F, 0.0F));

		PartDefinition cube_r10 = fossil.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-16.65F, 0.0F, -3.175F, 0.0F, 2.8493F, 0.0F));

		PartDefinition cube_r11 = fossil.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 82).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-15.925F, 0.0F, -3.025F, 0.0F, 2.8929F, 0.0F));

		PartDefinition cube_r12 = fossil.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 64).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-16.525F, 0.0F, -3.225F, 0.0F, 2.7707F, 0.0F));

		PartDefinition cube_r13 = fossil.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 82).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.525F, 0.0F, -3.425F, 0.0F, 2.8929F, 0.0F));

		PartDefinition cube_r14 = fossil.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-16.425F, 0.0F, -3.125F, 0.0F, 2.8929F, 0.0F));

		PartDefinition cube_r15 = fossil.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.8F, 0.0F, -3.15F, 0.0F, 2.3606F, 0.0F));

		PartDefinition cube_r16 = fossil.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 76).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-15.95F, 0.0F, -3.7F, 0.0F, 1.8021F, 0.0F));

		PartDefinition cube_r17 = fossil.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(6, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.65F, 0.0F, -2.9F, 0.0F, 1.8021F, 0.0F));

		PartDefinition cube_r18 = fossil.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 76).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-16.675F, 0.0F, -2.625F, 0.0F, 1.2348F, 0.0F));

		PartDefinition cube_r19 = fossil.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 72).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-14.95F, 0.0F, -2.225F, 0.0F, 1.357F, 0.0F));

		PartDefinition cube_r20 = fossil.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 76).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-15.45F, 0.0F, -2.2F, 0.0F, -2.186F, 0.0F));

		PartDefinition cube_r21 = fossil.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, -1.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-15.45F, 0.0F, -2.0F, 0.0F, -1.8195F, 0.0F));

		PartDefinition cube_r22 = fossil.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-15.25F, 0.0F, -1.75F, 0.0F, -1.2959F, 0.0F));

		PartDefinition cube_r23 = fossil.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 72).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-14.95F, 0.0F, -1.7F, 0.0F, -0.9468F, 0.0F));

		PartDefinition cube_r24 = fossil.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-15.45F, 0.0F, -2.675F, 0.0F, 2.5962F, 0.0F));

		PartDefinition cube_r25 = fossil.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-15.275F, 0.0F, -2.5F, 0.0F, 2.0377F, 0.0F));

		PartDefinition cube_r26 = fossil.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(50, 47).addBox(0.0F, -1.0F, -2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-14.65F, 0.0F, -1.8F, 0.0F, 0.7199F, 0.0F));

		PartDefinition cube_r27 = fossil.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 81).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-15.075F, 0.0F, -2.425F, 0.0F, 1.7235F, 0.0F));

		PartDefinition cube_r28 = fossil.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-16.075F, 0.0F, -3.425F, 0.0F, 2.0202F, 0.0F));

		PartDefinition cube_r29 = fossil.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 76).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-16.225F, 0.0F, -3.925F, 0.0F, 2.3867F, 0.0F));

		PartDefinition cube_r30 = fossil.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 76).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-16.475F, 0.0F, -3.725F, 0.0F, 1.741F, 0.0F));

		PartDefinition cube_r31 = fossil.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 39).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.175F, 0.0F, -5.975F, 0.0F, 1.9417F, 0.0F));

		PartDefinition cube_r32 = fossil.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 76).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.175F, 0.0F, 0.75F, 0.0F, 0.5454F, 0.0F));

		PartDefinition cube_r33 = fossil.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 60).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-13.575F, 0.0F, 1.75F, 0.0F, 1.4879F, 0.0F));

		PartDefinition cube_r34 = fossil.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 71).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-13.275F, 0.0F, 1.775F, 0.0F, 1.4879F, 0.0F));

		PartDefinition cube_r35 = fossil.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 76).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-13.975F, 0.0F, 1.775F, 0.0F, 1.3134F, 0.0F));

		PartDefinition cube_r36 = fossil.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 75).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.875F, 0.0F, 0.975F, 0.0F, 1.3134F, 0.0F));

		PartDefinition cube_r37 = fossil.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(80, 73).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.65F, 0.0F, 1.075F, 0.0F, 1.837F, 0.0F));

		PartDefinition cube_r38 = fossil.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(76, 56).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.125F, 0.0F, 0.6F, 0.0F, 2.8143F, 0.0F));

		PartDefinition cube_r39 = fossil.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(72, 80).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.425F, 0.0F, 1.075F, 0.0F, 2.2907F, 0.0F));

		PartDefinition cube_r40 = fossil.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(50, 67).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.375F, 0.0F, -0.975F, 0.0F, 1.6973F, 0.0F));

		PartDefinition cube_r41 = fossil.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(62, 75).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-16.5F, 0.0F, -4.175F, 0.0F, 1.9155F, 0.0F));

		PartDefinition cube_r42 = fossil.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 75).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-16.725F, 0.0F, -4.225F, 0.0F, 1.4748F, 0.0F));

		PartDefinition cube_r43 = fossil.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(70, 46).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.125F, 0.0F, -5.475F, 0.0F, 0.9948F, 0.0F));

		PartDefinition cube_r44 = fossil.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 68).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-16.05F, 0.0F, -5.725F, 0.0F, 0.8029F, 0.0F));

		PartDefinition cube_r45 = fossil.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.025F, 0.0F, -5.95F, 0.0F, 0.4712F, 0.0F));

		PartDefinition cube_r46 = fossil.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(28, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-14.95F, 0.0F, -6.275F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r47 = fossil.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-14.35F, 0.0F, -6.35F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r48 = fossil.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-13.175F, 0.0F, -6.625F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r49 = fossil.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-11.85F, 0.0F, -6.75F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r50 = fossil.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 28).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-10.425F, 0.0F, -7.025F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r51 = fossil.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(26, 44).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-8.4F, 0.0F, -7.025F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r52 = fossil.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(46, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-7.1F, 0.0F, -7.0F, 0.0F, -0.0742F, 0.0F));

		PartDefinition cube_r53 = fossil.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(68, 25).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.525F, 0.0F, -6.575F, 0.0F, 0.0131F, 0.0F));

		PartDefinition cube_r54 = fossil.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 23).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.35F, 0.0F, -1.25F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r55 = fossil.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 65).addBox(0.6879F, -1.0F, -0.7028F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(16.35F, 0.0F, -1.85F, 0.0F, 0.5716F, 0.0F));

		PartDefinition cube_r56 = fossil.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 36).addBox(0.6879F, -1.0F, -0.7028F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(15.45F, 0.0F, -2.25F, 0.0F, 0.4843F, 0.0F));

		PartDefinition cube_r57 = fossil.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 54).addBox(0.6879F, -1.0F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(15.05F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r58 = fossil.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(78, 46).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(14.35F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r59 = fossil.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(78, 44).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(13.65F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r60 = fossil.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(78, 42).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(12.95F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r61 = fossil.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(42, 78).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(12.25F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r62 = fossil.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 40).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(11.55F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r63 = fossil.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 80).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(10.85F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r64 = fossil.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 38).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(10.15F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r65 = fossil.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 80).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(9.45F, 0.0F, -1.75F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r66 = fossil.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(78, 33).addBox(-0.3121F, -1.0F, -0.7028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.85F, 0.0F, -1.85F, 0.0F, 0.7898F, 0.0F));

		PartDefinition cube_r67 = fossil.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(82, 68).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.4F, 0.0F, -1.275F, 0.0F, -3.0936F, 0.0F));

		PartDefinition cube_r68 = fossil.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 82).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.55F, 0.0F, -1.925F, 0.0F, -2.4696F, 0.0F));

		PartDefinition cube_r69 = fossil.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 60).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(8.375F, 0.0F, -2.225F, 0.0F, -1.9591F, 0.0F));

		PartDefinition cube_r70 = fossil.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(4, 83).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(7.475F, 0.0F, -1.9F, 0.0F, -1.5664F, 0.0F));

		PartDefinition cube_r71 = fossil.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(82, 58).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(7.475F, 0.0F, -2.2F, 0.0F, -1.5664F, 0.0F));

		PartDefinition cube_r72 = fossil.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 82).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.775F, 0.0F, 0.775F, 0.0F, 0.6763F, 0.0F));

		PartDefinition cube_r73 = fossil.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 82).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.375F, 0.0F, 0.525F, 0.0F, 0.3534F, 0.0F));

		PartDefinition cube_r74 = fossil.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 41).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.175F, 0.0F, -1.925F, 0.0F, -2.2995F, 0.0F));

		PartDefinition cube_r75 = fossil.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 82).addBox(-0.6948F, -1.0F, -0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.4F, 0.0F, -0.35F, 0.0F, 2.4566F, 0.0F));

		PartDefinition cube_r76 = fossil.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(82, 82).addBox(-0.6956F, -1.0F, -0.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(8.0F, 0.0F, -0.275F, 0.0F, 2.4042F, 0.0F));

		PartDefinition cube_r77 = fossil.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(82, 64).addBox(-0.6956F, -1.0F, -0.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.2F, 0.0F, -0.15F, 0.0F, 2.4042F, 0.0F));

		PartDefinition cube_r78 = fossil.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(74, 82).addBox(-0.7032F, -1.0F, -0.2918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.425F, 0.0F, -0.275F, 0.0F, 0.1789F, 0.0F));

		PartDefinition cube_r79 = fossil.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 62).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(8.275F, 0.0F, 1.525F, 0.0F, 1.4443F, 0.0F));

		PartDefinition cube_r80 = fossil.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(78, 82).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(7.25F, 0.0F, 1.275F, 0.0F, 0.9207F, 0.0F));

		PartDefinition cube_r81 = fossil.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(82, 56).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.85F, 0.0F, 1.15F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r82 = fossil.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 31).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.95F, 0.0F, -0.85F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r83 = fossil.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(78, 29).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.15F, 0.0F, -0.85F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r84 = fossil.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 27).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(5.45F, 0.0F, -0.95F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r85 = fossil.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 25).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(4.75F, 0.0F, -1.05F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r86 = fossil.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(78, 21).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(4.05F, 0.0F, -1.15F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r87 = fossil.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(78, 19).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(2.7F, 0.0F, -1.35F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r88 = fossil.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(78, 17).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(2.05F, 0.0F, -1.45F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r89 = fossil.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(54, 82).addBox(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.15F, 0.0F, -1.525F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r90 = fossil.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(82, 52).addBox(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7F, 0.0F, -1.75F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r91 = fossil.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 15).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.55F, 0.0F, -1.65F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r92 = fossil.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(42, 54).addBox(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.2F, 0.0F, -1.75F, 0.0F, 1.1825F, 0.0F));

		PartDefinition cube_r93 = fossil.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 58).addBox(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(7.7F, 0.0F, -1.65F, 0.0F, 1.4006F, 0.0F));

		PartDefinition cube_r94 = fossil.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(66, 53).addBox(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.1F, 0.0F, -1.85F, 0.0F, 1.2697F, 0.0F));

		PartDefinition cube_r95 = fossil.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 29).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.1F, 0.0F, -2.45F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r96 = fossil.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 80).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.1F, 0.0F, -2.25F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r97 = fossil.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 78).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.7F, 0.0F, -2.55F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r98 = fossil.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 78).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.3F, 0.0F, -2.85F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r99 = fossil.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 83).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(4.025F, 0.0F, -2.625F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r100 = fossil.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(8, 83).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(3.5F, 0.0F, -2.8F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r101 = fossil.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 50).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8F, 0.0F, -3.05F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r102 = fossil.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 48).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.1F, 0.0F, -3.05F, 0.0F, 0.7025F, 0.0F));

		PartDefinition cube_r103 = fossil.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 78).addBox(1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(2.0F, 0.0F, -3.05F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r104 = fossil.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(16, 74).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.3F, 0.0F, -2.05F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r105 = fossil.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(8, 74).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.825F, 0.0F, -2.25F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r106 = fossil.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.375F, 0.0F, -2.45F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r107 = fossil.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(24, 74).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.225F, 0.0F, -2.55F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r108 = fossil.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(28, 83).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(15.775F, 0.0F, -3.55F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r109 = fossil.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(24, 83).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(15.475F, 0.0F, -3.75F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r110 = fossil.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(20, 83).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(14.975F, 0.0F, -3.25F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r111 = fossil.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(16, 83).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(14.675F, 0.0F, -3.45F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r112 = fossil.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(80, 35).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(13.775F, 0.0F, -3.55F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r113 = fossil.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 80).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(13.275F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r114 = fossil.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(36, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(12.475F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r115 = fossil.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(30, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(11.675F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r116 = fossil.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(24, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.875F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r117 = fossil.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(66, 80).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.075F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r118 = fossil.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(18, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(9.275F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r119 = fossil.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(12, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.475F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r120 = fossil.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(6, 79).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.575F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r121 = fossil.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(78, 78).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.775F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r122 = fossil.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(48, 80).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.975F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r123 = fossil.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 78).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.175F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r124 = fossil.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 66).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.375F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r125 = fossil.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(66, 78).addBox(1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.575F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r126 = fossil.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 74).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.775F, 0.0F, -3.35F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r127 = fossil.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.875F, 0.0F, -3.45F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r128 = fossil.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(72, 74).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.925F, 0.0F, -4.15F, 0.0F, -0.7898F, 0.0F));

		PartDefinition cube_r129 = fossil.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(84, 13).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.225F, 0.0F, -0.25F, 0.0F, 0.8029F, 0.0F));

		PartDefinition cube_r130 = fossil.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(84, 11).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, 0.0F, 0.325F, 0.0F, 1.2785F, 0.0F));

		PartDefinition cube_r131 = fossil.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(84, 9).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.225F, 0.0F, 1.2785F, 0.0F));

		PartDefinition cube_r132 = fossil.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.775F, 0.0F, -1.175F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r133 = fossil.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(36, 83).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.6F, 0.0F, -0.95F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r134 = fossil.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(84, 31).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.375F, 0.0F, -0.65F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r135 = fossil.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(84, 15).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.025F, 0.0F, -0.625F, 0.0F, 0.5192F, 0.0F));

		PartDefinition cube_r136 = fossil.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(32, 83).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.125F, 0.0F, -0.6F, 0.0F, 0.6501F, 0.0F));

		PartDefinition cube_r137 = fossil.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 74).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.175F, 0.0F, -3.55F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r138 = fossil.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(72, 72).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.975F, 0.0F, -3.55F, 0.0F, -0.6152F, 0.0F));

		PartDefinition cube_r139 = fossil.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(78, 13).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.425F, 0.0F, -2.95F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r140 = fossil.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(78, 11).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-1.025F, 0.0F, -3.05F, 0.0F, 0.6152F, 0.0F));

		PartDefinition cube_r141 = fossil.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 82).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.625F, 0.0F, -3.25F, 0.0F, 0.4407F, 0.0F));

		PartDefinition cube_r142 = fossil.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(66, 67).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.225F, 0.0F, -3.15F, 0.0F, -0.2574F, 0.0F));

		PartDefinition cube_r143 = fossil.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 44).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(3.075F, 0.0F, -2.1F, 0.0F, -0.1265F, 0.0F));

		PartDefinition cube_r144 = fossil.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(12, 69).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(6.475F, 0.0F, -1.7F, 0.0F, -0.0654F, 0.0F));

		PartDefinition cube_r145 = fossil.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 69).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(11.15F, 0.0F, -1.65F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r146 = fossil.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 9).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(15.875F, 0.0F, -1.95F, 0.0F, 0.3622F, 0.0F));

		PartDefinition cube_r147 = fossil.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(14.575F, 0.0F, -1.65F, 0.0F, 0.1004F, 0.0F));

		PartDefinition cube_r148 = fossil.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(9.875F, 0.0F, -1.6F, 0.0F, 0.1004F, 0.0F));

		PartDefinition cube_r149 = fossil.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 69).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.525F, 0.0F, -3.65F, 0.0F, -0.4669F, 0.0F));

		PartDefinition cube_r150 = fossil.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.525F, 0.0F, -6.35F, 0.0F, -0.4669F, 0.0F));

		PartDefinition cube_r151 = fossil.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.725F, 0.0F, -5.95F, 0.0F, -0.2923F, 0.0F));

		PartDefinition cube_r152 = fossil.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 52).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.475F, 0.0F, -5.6F, 0.0F, 0.2574F, 0.0F));

		PartDefinition cube_r153 = fossil.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(24, 68).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.85F, 0.0F, -4.75F, 0.0F, 0.6676F, 0.0F));

		PartDefinition cube_r154 = fossil.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(14, 55).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.875F, 0.0F, -4.1F, 0.0F, -0.9905F, 0.0F));

		PartDefinition cube_r155 = fossil.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-3.15F, 0.0F, -3.125F, 0.0F, -0.8247F, 0.0F));

		PartDefinition cube_r156 = fossil.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-2.1F, 0.0F, -2.2F, 0.0F, -0.6458F, 0.0F));

		PartDefinition cube_r157 = fossil.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(68, 69).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.975F, 0.0F, -1.425F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r158 = fossil.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(26, 54).addBox(-3.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-1.9F, 0.0F, 1.525F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r159 = fossil.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 41).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-16.325F, 0.0F, 0.15F, 0.0F, -0.8945F, 0.0F));

		PartDefinition cube_r160 = fossil.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-15.325F, 0.0F, 1.125F, 0.0F, -0.6501F, 0.0F));

		PartDefinition cube_r161 = fossil.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(76, 62).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-16.525F, 0.0F, -1.5F, 0.0F, 2.4042F, 0.0F));

		PartDefinition cube_r162 = fossil.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-16.6F, 0.0F, -1.75F, 0.0F, 1.0952F, 0.0F));

		PartDefinition cube_r163 = fossil.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(24, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-12.8F, 0.0F, 1.425F, 0.0F, 0.4407F, 0.0F));

		PartDefinition cube_r164 = fossil.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(16, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-11.5F, 0.0F, 3.125F, 0.0F, -0.8683F, 0.0F));

		PartDefinition cube_r165 = fossil.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(8, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-10.375F, 0.0F, 4.0F, 0.0F, -0.5192F, 0.0F));

		PartDefinition cube_r166 = fossil.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 58).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-9.875F, 0.0F, 3.2F, 0.0F, -1.9591F, 0.0F));

		PartDefinition cube_r167 = fossil.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(40, 67).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-9.275F, 0.0F, 2.375F, 0.0F, -2.3431F, 0.0F));

		PartDefinition cube_r168 = fossil.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 53).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-8.575F, 0.0F, 1.775F, 0.0F, -2.7096F, 0.0F));

		PartDefinition cube_r169 = fossil.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(66, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-7.95F, 0.0F, 1.475F, 0.0F, -3.0412F, 0.0F));

		PartDefinition cube_r170 = fossil.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(70, 49).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-7.25F, 0.0F, 1.375F, 0.0F, 2.9932F, 0.0F));

		PartDefinition cube_r171 = fossil.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(46, 32).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-3.95F, 0.0F, -1.325F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r172 = fossil.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(14, 59).addBox(-1.0F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-6.25F, 0.0F, 1.875F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r173 = fossil.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(66, 32).addBox(-1.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.125F, 0.0F, 1.55F, 0.0F, 0.1833F, 0.0F));

		PartDefinition cube_r174 = fossil.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 69).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.576F, 0.0F));

		PartDefinition bone3 = fossil.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.0F, -2.1F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r175 = bone3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(84, 17).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2785F, 0.0F));

		PartDefinition cube_r176 = bone3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(84, 19).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.225F, 0.0F, 0.05F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r177 = bone3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(84, 21).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.275F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r178 = bone3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(24, 64).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.625F, 0.0F, 0.575F, 0.0F, 0.9294F, 0.0F));

		PartDefinition cube_r179 = bone3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 23).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.975F, 0.0F, 0.6F, 0.0F, 0.5192F, 0.0F));

		PartDefinition cube_r180 = bone3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(24, 66).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.875F, 0.0F, 0.625F, 0.0F, 0.6501F, 0.0F));

		PartDefinition cube_r181 = bone3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(84, 25).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.225F, 0.0F, 0.975F, 0.0F, 0.8029F, 0.0F));

		PartDefinition cube_r182 = bone3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(84, 27).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-1.275F, 0.0F, 1.55F, 0.0F, 1.2785F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.35F, 0.0F, -7.35F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 54).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9766F, 0.0F));

		PartDefinition bone2 = fossil.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.925F, 0.0F, -6.025F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(68, 38).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5F, 0.0F, 2.075F, 0.0F, 1.645F, 0.0F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(54, 65).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9766F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, 0.0F));

		PartDefinition cube_r186 = matrix.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 0).addBox(-33.0F, -2.0F, -1.0F, 46.0F, 1.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(12.6F, 1.0F, -9.9F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r187 = matrix.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -2.0F, -9.0F, 13.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.925F, 1.0F, 4.1F, 0.0F, 2.1118F, 0.0F));

		PartDefinition cube_r188 = matrix.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 44).addBox(10.0F, -2.0F, -9.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(21.6F, 1.0F, 9.1F, 0.0F, 1.3265F, 0.0F));

		PartDefinition cube_r189 = matrix.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -2.0F, -9.0F, 13.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.9F, 1.0F, 4.5F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r190 = matrix.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 9).addBox(-14.0F, -2.0F, -11.0F, 27.0F, 1.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 1.0F, 5.8F, 0.0F, 0.1047F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 88);
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