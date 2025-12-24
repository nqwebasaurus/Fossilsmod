package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArchaeopteryxFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Anchiornis;
	private final ModelPart UpperLegR;
	private final ModelPart LowerLegR;
	private final ModelPart FootR;
	private final ModelPart ToesR;
	private final ModelPart clawR;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart ToesL;
	private final ModelPart clawL;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart UpperArmR;
	private final ModelPart feathers3;
	private final ModelPart LowerArmR;
	private final ModelPart feathers4;
	private final ModelPart HandR;
	private final ModelPart HandwingR;
	private final ModelPart HandsR;
	private final ModelPart UpperArmR2;
	private final ModelPart feathers2;
	private final ModelPart LowerArmR2;
	private final ModelPart feathers5;
	private final ModelPart HandR2;
	private final ModelPart HandwingR2;
	private final ModelPart HandsR2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart head;
	private final ModelPart Jaw;

	public ArchaeopteryxFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Anchiornis = this.fossil.getChild("Anchiornis");
		this.UpperLegR = this.Anchiornis.getChild("UpperLegR");
		this.LowerLegR = this.UpperLegR.getChild("LowerLegR");
		this.FootR = this.LowerLegR.getChild("FootR");
		this.ToesR = this.FootR.getChild("ToesR");
		this.clawR = this.ToesR.getChild("clawR");
		this.UpperLegL = this.Anchiornis.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.ToesL = this.FootL.getChild("ToesL");
		this.clawL = this.ToesL.getChild("clawL");
		this.Tail1 = this.Anchiornis.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Body = this.Anchiornis.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.UpperArmR = this.Chest.getChild("UpperArmR");
		this.feathers3 = this.UpperArmR.getChild("feathers3");
		this.LowerArmR = this.UpperArmR.getChild("LowerArmR");
		this.feathers4 = this.LowerArmR.getChild("feathers4");
		this.HandR = this.LowerArmR.getChild("HandR");
		this.HandwingR = this.HandR.getChild("HandwingR");
		this.HandsR = this.HandR.getChild("HandsR");
		this.UpperArmR2 = this.Chest.getChild("UpperArmR2");
		this.feathers2 = this.UpperArmR2.getChild("feathers2");
		this.LowerArmR2 = this.UpperArmR2.getChild("LowerArmR2");
		this.feathers5 = this.LowerArmR2.getChild("feathers5");
		this.HandR2 = this.LowerArmR2.getChild("HandR2");
		this.HandwingR2 = this.HandR2.getChild("HandwingR2");
		this.HandsR2 = this.HandR2.getChild("HandsR2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.head = this.Neck3.getChild("head");
		this.Jaw = this.head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-22.0F, -2.2F, -26.0F, 44.0F, 2.0F, 52.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Anchiornis = fossil.addOrReplaceChild("Anchiornis", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, -1.9F, -4.3F, -0.1745F, 0.0F, 1.5708F));

		PartDefinition Basin_r1 = Anchiornis.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(0, 75).addBox(-0.4F, -1.368F, 0.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 48).addBox(-0.4F, -0.8096F, -0.6201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 3.0996F, 6.2584F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Anchiornis.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(40, 41).addBox(-0.5F, 0.6F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 48).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.8521F, 5.3093F, -0.576F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = Anchiornis.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(31, 48).addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(43, 33).addBox(-0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, -0.3896F, 2.9306F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Basin_r4 = Anchiornis.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(65, 66).addBox(-0.2F, 0.1F, -1.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.8695F, 1.1929F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Anchiornis.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-1.1F, 0.0F, -1.9F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.6053F, -9.3547F, 0.0F, 1.0472F, -1.5708F));

		PartDefinition cube_r2 = Anchiornis.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 41).addBox(-2.8F, 0.0F, -3.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.3096F, -5.9132F, -3.1416F, 0.7418F, 1.5708F));

		PartDefinition UpperLegR = Anchiornis.addOrReplaceChild("UpperLegR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.8F, 3.7F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r3 = UpperLegR.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 5).addBox(-1.0F, -0.4F, 1.05F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LowerLegR = UpperLegR.addOrReplaceChild("LowerLegR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 4.8F, -2.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LowerLegR.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 73).addBox(-0.2F, -4.0F, -1.4F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 72).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 2.9444F, 1.4305F, 0.384F, 0.0F, 0.0F));

		PartDefinition FootR = LowerLegR.addOrReplaceChild("FootR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 6.5316F, 2.6769F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = FootR.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(65, 64).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition ToesR = FootR.addOrReplaceChild("ToesR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.25F, -2.15F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r6 = ToesR.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 27).addBox(-0.4F, -0.3F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition clawR = ToesR.addOrReplaceChild("clawR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.25F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r7 = clawR.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 39).addBox(0.1F, -1.3F, -3.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 1.75F, 0.0524F, 0.0F, 0.0F));

		PartDefinition UpperLegL = Anchiornis.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.8F, 5.4F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r8 = UpperLegL.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 13).addBox(-1.0F, -3.9F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6203F, -2.7567F, -1.0036F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.8F, -4.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = LowerLegL.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 72).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.15F, 3.55F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r10 = FootL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 13).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition ToesL = FootL.addOrReplaceChild("ToesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.35F, -2.75F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = ToesL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 42).addBox(-0.6F, -0.3F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition clawL = ToesL.addOrReplaceChild("clawL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.65F, -0.25F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r12 = clawL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.3F, -3.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 1.75F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail1 = Anchiornis.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, -0.1F, 3.5F, 0.0F, 0.8378F, -1.5708F));

		PartDefinition cube_r13 = Tail1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 34).addBox(-3.5F, 0.1F, -3.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4F, 3.7F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r14 = Tail1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -0.7F, -2.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5211F, 0.9F, 3.9479F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -0.15F, 6.9F, -0.0873F, -0.0435F, 0.0038F));

		PartDefinition cube_r15 = Tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 34).addBox(-3.9992F, 0.65F, -0.6F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0873F, 0.0015F, -0.0174F));

		PartDefinition cube_r16 = Tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 64).addBox(-1.0F, 0.3F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 5.5F, -0.0328F, -0.3866F, -0.0505F));

		PartDefinition cube_r17 = Tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-5.8F, 0.0F, -7.1F, 9.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8212F, -0.1847F, 6.5859F, 0.1272F, -0.0442F, 0.004F));

		PartDefinition cube_r18 = Tail3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 55).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0997F, 0.5246F, 3.4158F, 0.1299F, 0.046F, -0.0075F));

		PartDefinition Body = Anchiornis.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, -1.0F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 55).addBox(-0.3F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3F, -1.0176F, -3.8683F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 55).addBox(-0.3F, -1.4F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3F, 1.2726F, -1.9177F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 6).addBox(0.5F, -0.6555F, -1.1607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.8265F, 3.0649F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -0.5504F, -0.3231F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.9F, -0.8265F, 3.0649F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 13).addBox(0.5F, -0.6555F, -1.1607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8F, -0.4265F, 1.9649F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 48).addBox(0.5F, -0.5504F, -0.3231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.9F, -0.4265F, 1.9649F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(5, 13).addBox(0.5F, -0.6555F, -1.1607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8F, -0.0265F, 0.7649F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 0).addBox(0.5F, -0.5504F, -0.3231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.9F, -0.0265F, 0.7649F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 27).addBox(0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.9F, 0.2027F, -0.2404F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 6).addBox(0.5F, -0.5F, -2.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8F, -0.0634F, -0.379F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 55).addBox(-0.2F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.9F, -1.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -3.0F, -4.0F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(39, 64).addBox(-0.2F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition UpperArmR = Chest.addOrReplaceChild("UpperArmR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5F, 0.4F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r31 = UpperArmR.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(19, 42).addBox(-0.2F, -0.6F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1386F, -0.5475F, 0.8548F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r32 = UpperArmR.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(29, 13).addBox(-0.3F, -0.7F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1386F, -1.0073F, 0.6583F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r33 = UpperArmR.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 6).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1386F, -0.2291F, 3.7238F, -0.0436F, 0.0F, 0.0F));

		PartDefinition feathers3 = UpperArmR.addOrReplaceChild("feathers3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3614F, -0.7291F, 2.9738F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerArmR = UpperArmR.addOrReplaceChild("LowerArmR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8886F, 1.0709F, 5.9738F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r34 = LowerArmR.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 55).addBox(-1.1F, -0.75F, -0.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 64).addBox(-1.1F, 0.05F, -0.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.2F, -1.4835F, 0.0F, 0.0F));

		PartDefinition feathers4 = LowerArmR.addOrReplaceChild("feathers4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, 2.6F, -0.2F, 0.9164F, -0.0032F, 0.0245F));

		PartDefinition cube_r35 = feathers4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(19, 13).addBox(-0.2F, -3.9F, -4.5F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0549F, -2.0188F, 5.9949F, -1.3963F, -0.0168F, -0.006F));

		PartDefinition HandR = LowerArmR.addOrReplaceChild("HandR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 5.0F, 0.1F, 1.4835F, 0.0436F, 0.0F));

		PartDefinition HandwingR = HandR.addOrReplaceChild("HandwingR", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.8F, 1.5F, -0.7005F, 0.0514F, 0.1813F));

		PartDefinition cube_r36 = HandwingR.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 7).addBox(-0.2F, -6.5F, -2.3F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3146F, 4.129F, 5.9309F, -2.0665F, 0.0122F, -0.1594F));

		PartDefinition cube_r37 = HandwingR.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 55).addBox(-0.75F, -13.1127F, -0.6518F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, -1.5952F, 0.0389F, -0.1356F));

		PartDefinition HandsR = HandR.addOrReplaceChild("HandsR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -0.7F, -0.3894F, -0.0925F, 0.235F));

		PartDefinition cube_r38 = HandsR.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 42).addBox(-0.375F, 0.15F, -2.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3337F, 0.0956F, -0.1667F));

		PartDefinition cube_r39 = HandsR.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(22, 34).addBox(-0.4F, 0.15F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5518F, 0.0956F, -0.1667F));

		PartDefinition cube_r40 = HandsR.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 73).addBox(-0.4F, -0.6F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4209F, 0.0956F, -0.1667F));

		PartDefinition UpperArmR2 = Chest.addOrReplaceChild("UpperArmR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -2.4F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r41 = UpperArmR2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(56, 58).addBox(-0.3F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3386F, 0.5475F, 0.8548F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = UpperArmR2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 47).addBox(-0.4F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3386F, 1.0073F, 0.6583F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r43 = UpperArmR2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3386F, 0.2291F, 3.7238F, 0.0436F, 0.0F, 0.0F));

		PartDefinition feathers2 = UpperArmR2.addOrReplaceChild("feathers2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3614F, 0.7291F, 2.9738F, 0.5236F, 0.0F, 0.0F));

		PartDefinition LowerArmR2 = UpperArmR2.addOrReplaceChild("LowerArmR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8886F, -1.0709F, 5.9738F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r44 = LowerArmR2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(10, 13).addBox(-1.2F, -0.25F, -0.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 42).addBox(-1.2F, -1.05F, -0.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, 1.4835F, 0.0F, 0.0F));

		PartDefinition feathers5 = LowerArmR2.addOrReplaceChild("feathers5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, -2.6F, -0.2F, -0.9163F, -0.0351F, 0.0171F));

		PartDefinition cube_r45 = feathers5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 13).addBox(0.1F, -6.7F, -4.4F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 3.056F, 4.3913F, 1.2042F, 0.0348F, -0.003F));

		PartDefinition HandR2 = LowerArmR2.addOrReplaceChild("HandR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -5.0F, 0.1F, -1.4835F, 0.0436F, 0.0F));

		PartDefinition HandwingR2 = HandR2.addOrReplaceChild("HandwingR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.8F, 1.5F, 0.6565F, 0.0402F, -0.1679F));

		PartDefinition cube_r46 = HandwingR2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 55).addBox(-0.4426F, -0.2844F, -4.5203F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3146F, -4.129F, 0.4309F, 1.8916F, 0.0441F, 0.137F));

		PartDefinition cube_r47 = HandwingR2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(13, 55).addBox(0.0F, -6.2F, -3.5F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8157F, -1.5377F, 5.7784F, 1.4207F, 0.0389F, 0.1356F));

		PartDefinition HandsR2 = HandR2.addOrReplaceChild("HandsR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, 0.5678F, -0.0167F, -0.2547F));

		PartDefinition cube_r48 = HandsR2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 34).addBox(-0.375F, -4.15F, -2.5F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3337F, 0.0956F, 0.1667F));

		PartDefinition cube_r49 = HandsR2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 55).addBox(-0.4F, -4.15F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5518F, 0.0956F, 0.1667F));

		PartDefinition cube_r50 = HandsR2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 73).addBox(-0.4F, -6.4F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4209F, 0.0956F, 0.1667F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offset(0.4F, 0.9F, -1.5F));

		PartDefinition cube_r51 = Neck1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(49, 64).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7705F, 1.0F, -1.7628F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5053F, 0.117F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Neck2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.011F)), PartPose.offsetAndRotation(0.0F, -2.8939F, -1.4129F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Neck2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 13).addBox(-0.3F, -0.4F, -1.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5397F, -0.7297F, -2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Neck2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 62).addBox(-0.5F, -0.1F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.9197F, -2.0957F, -2.4696F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4428F, -2.3397F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Neck3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 55).addBox(-0.5F, -0.7F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9441F, -3.4248F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 55).addBox(-1.0F, -0.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(72, 55).addBox(-1.0F, 0.15F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(39, 68).addBox(-1.18F, 0.15F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 64).addBox(-1.18F, 0.45F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 55).addBox(-1.18F, 0.45F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 75).addBox(-1.18F, 0.45F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 59).addBox(-1.39F, 0.15F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 69).addBox(-1.0F, 0.6F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(29, 18).addBox(-1.0F, 0.6F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, -5.35F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 7).addBox(-1.0F, 0.0566F, 0.5662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(72, 74).addBox(-1.0F, 0.0566F, 1.3162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.6F, -5.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 74).addBox(-1.5F, 0.6841F, -0.5022F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(74, 66).addBox(-1.5F, 0.6841F, -0.2522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(10, 75).addBox(-1.0F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 55).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.39F, 0.95F, -4.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(31, 7).addBox(-1.5F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(58, 55).addBox(-1.5F, 0.0F, -3.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(14, 55).addBox(-1.5F, 0.0F, -4.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.1F, 0.0F, -0.096F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 83);
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