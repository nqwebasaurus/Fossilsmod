package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CaihongFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Anchiornis;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart ToesL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart ToesL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart UpperArmL;
	private final ModelPart feathers2;
	private final ModelPart LowerArmL;
	private final ModelPart feathers;
	private final ModelPart HandL;
	private final ModelPart HandwingL;
	private final ModelPart UpperArmL2;
	private final ModelPart feathers3;
	private final ModelPart LowerArmL2;
	private final ModelPart feathers4;
	private final ModelPart HandL2;
	private final ModelPart HandwingL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart head;
	private final ModelPart Jaw;

	public CaihongFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Anchiornis = this.fossil.getChild("Anchiornis");
		this.UpperLegL = this.Anchiornis.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.ToesL = this.FootL.getChild("ToesL");
		this.UpperLegL2 = this.Anchiornis.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.ToesL2 = this.FootL2.getChild("ToesL2");
		this.Tail1 = this.Anchiornis.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Body = this.Anchiornis.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.UpperArmL = this.Chest.getChild("UpperArmL");
		this.feathers2 = this.UpperArmL.getChild("feathers2");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.feathers = this.LowerArmL.getChild("feathers");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandwingL = this.HandL.getChild("HandwingL");
		this.UpperArmL2 = this.Chest.getChild("UpperArmL2");
		this.feathers3 = this.UpperArmL2.getChild("feathers3");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.feathers4 = this.LowerArmL2.getChild("feathers4");
		this.HandL2 = this.LowerArmL2.getChild("HandL2");
		this.HandwingL2 = this.HandL2.getChild("HandwingL2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.head = this.Neck3.getChild("head");
		this.Jaw = this.head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -2.0F, -21.5F, 37.0F, 2.0F, 43.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Anchiornis = fossil.addOrReplaceChild("Anchiornis", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -2.2F, -6.1F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition Basin_r1 = Anchiornis.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(47, 59).addBox(-0.8F, -0.3F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.9798F, 1.9603F, -1.6581F, 0.0F, 0.0F));

		PartDefinition Basin_r2 = Anchiornis.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(33, 63).addBox(-0.8F, -0.6525F, 0.3433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 59).addBox(-0.8F, -0.6525F, -0.2567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 3.7949F, 1.3601F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = Anchiornis.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(0, 68).addBox(-0.8F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.8654F, 2.774F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Basin_r4 = Anchiornis.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(66, 46).addBox(-0.4F, -0.5715F, -2.6652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(58, 46).addBox(-0.6F, -0.4715F, -5.1652F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, 0.2F, 3.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition UpperLegL = Anchiornis.addOrReplaceChild("UpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.7F, 2.3F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r1 = UpperLegL.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -1.5F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.63F, 5.7705F, -3.5723F, 1.0472F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = UpperLegL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 10).addBox(0.0F, -3.5F, -4.5F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, 5.6246F, 1.09F, 0.7854F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = UpperLegL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 32).addBox(-1.4F, -0.4F, -0.95F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1086F, 0.4314F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.5914F, -3.9686F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LowerLegL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 26).addBox(-0.9F, -0.2F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.35F, 3.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = FootL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 64).addBox(-0.9F, -0.1F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition ToesL = FootL.addOrReplaceChild("ToesL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6F, -3.0F, 0.0F, -0.829F, 1.5708F));

		PartDefinition cube_r6 = ToesL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 56).addBox(-1.0F, 0.0995F, -3.0209F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition UpperLegL2 = Anchiornis.addOrReplaceChild("UpperLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 3.2F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r7 = UpperLegL2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -0.4F, -0.95F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.8F, -5.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = LowerLegL2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 46).addBox(-0.8F, -0.2F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.85F, 3.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = FootL2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 30).addBox(0.0F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.2417F, 1.2294F, 0.6283F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = FootL2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 64).addBox(-0.8F, -0.1F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition ToesL2 = FootL2.addOrReplaceChild("ToesL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6F, -3.0F, 0.0F, 0.829F, -1.5708F));

		PartDefinition cube_r11 = ToesL2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 0).addBox(-1.7F, -0.4006F, -3.8974F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0479F, 0.9118F, 0.0F, 0.0175F, 1.5708F));

		PartDefinition Tail1 = Anchiornis.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3F, 3.5F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tail1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 63).addBox(-1.0F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(11, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.5603F, 1.7708F, 0.0F, -0.0873F, 1.5708F));

		PartDefinition cube_r14 = Tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 35).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.3249F, 2.1107F, 0.0F, -0.0873F, 1.5708F));

		PartDefinition cube_r15 = Tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 52).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.375F, 4.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 46).addBox(-4.5F, 0.0F, -8.0F, 9.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1925F, 8.037F, 0.0F, -0.0873F, 1.5708F));

		PartDefinition cube_r17 = Tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.0391F, 0.5469F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body = Anchiornis.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(5, 55).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3F, -1.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, -2.3143F, -0.9861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.5247F, -4.3845F, 2.4609F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5F, -0.9395F, -3.1919F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.7515F, -3.0328F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5F, 0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 46).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.305F, -3.1162F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5F, -1.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.625F, -3.7F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 62).addBox(-0.5F, -0.2074F, 0.0777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.3304F, -2.2231F, -0.0873F, 0.0F, 0.0F));

		PartDefinition UpperArmL = Chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(32, 20).addBox(-1.4913F, -0.0326F, -0.9348F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.15F, 2.1696F, -2.2731F, -0.671F, 0.0F, 0.0F));

		PartDefinition feathers2 = UpperArmL.addOrReplaceChild("feathers2", CubeListBuilder.create(), PartPose.offset(-0.8144F, -0.2244F, -1.2619F));

		PartDefinition cube_r24 = feathers2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(46, 46).addBox(0.0F, -3.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0231F, -5.0098F, -1.4788F, 1.0036F, 0.0F, 3.1416F));

		PartDefinition cube_r25 = feathers2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -5.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0231F, -4.2608F, 6.4017F, -2.1817F, 0.0F, 3.1416F));

		PartDefinition cube_r26 = feathers2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 8).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0344F, -2.3242F, -0.2318F, 0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r27 = feathers2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 46).addBox(0.0F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1231F, -0.5582F, 2.8271F, 0.0F, 0.0F, -3.1416F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8144F, -0.2244F, 3.4881F, 0.025F, 0.0F, 0.0F));

		PartDefinition cube_r28 = LowerArmL.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5857F, 1.0919F, 1.9098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0123F, -1.0271F, 0.1265F, -1.4835F, 0.0F, 0.0F));

		PartDefinition feathers = LowerArmL.addOrReplaceChild("feathers", CubeListBuilder.create(), PartPose.offset(-0.2623F, -1.0271F, 0.1265F));

		PartDefinition cube_r29 = feathers.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -3.0F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, 1.757F, 1.8291F, -1.6581F, 0.0F, -3.1416F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5877F, 2.8729F, -0.0735F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r30 = HandL.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 27).addBox(-1.3757F, -0.8875F, -2.1057F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.9F, 0.5518F, 0.0F, 0.0F));

		PartDefinition cube_r31 = HandL.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4007F, 1.6897F, -1.6975F, 2.7207F, 0.0F, -3.1416F));

		PartDefinition cube_r32 = HandL.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 6).addBox(-1.3757F, -1.4517F, -2.4795F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.9F, 0.4209F, 0.0F, 0.0F));

		PartDefinition HandwingL = HandL.addOrReplaceChild("HandwingL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.8F, 1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r33 = HandwingL.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6692F, 1.856F, -0.0588F, -0.3773F, 0.0F, -3.1416F));

		PartDefinition cube_r34 = HandwingL.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5603F, 0.3876F, 2.049F, -1.1973F, 0.0F, -3.1416F));

		PartDefinition UpperArmL2 = Chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.75F, -5.8304F, 3.7269F, -0.671F, -0.3793F, -0.0432F));

		PartDefinition feathers3 = UpperArmL2.addOrReplaceChild("feathers3", CubeListBuilder.create(), PartPose.offset(0.8144F, -0.2244F, -1.2619F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8269F, 5.235F, 0.8069F, 1.6237F, 0.2745F, 0.2631F));

		PartDefinition cube_r35 = LowerArmL2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(36, 63).addBox(-1.5139F, 1.0757F, 1.9081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9139F, -3.5333F, 1.2741F, -1.4835F, 0.0F, 0.0F));

		PartDefinition feathers4 = LowerArmL2.addOrReplaceChild("feathers4", CubeListBuilder.create(), PartPose.offset(1.1639F, -3.5333F, 1.2741F));

		PartDefinition HandL2 = LowerArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1141F, 0.3652F, 1.0664F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r36 = HandL2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 46).addBox(-0.7239F, -0.873F, -2.0983F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.9F, 0.5518F, 0.0F, 0.0F));

		PartDefinition cube_r37 = HandL2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.6738F, -1.7207F, 2.7207F, 0.0F, 3.1416F));

		PartDefinition cube_r38 = HandL2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 53).addBox(-0.7239F, -1.4382F, -2.4703F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.9F, 0.4209F, 0.0F, 0.0F));

		PartDefinition HandwingL2 = HandL2.addOrReplaceChild("HandwingL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.8F, 1.5F, 0.4363F, -0.0873F, 0.0F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0554F, -1.0731F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Neck1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 58).addBox(-0.5F, -0.2168F, -1.6714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.32F, -1.1156F, -1.2043F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 0.195F, -1.3906F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Neck2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, -0.0092F, -0.0184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.6F, -3.1887F, -0.5295F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -1.4377F, -1.0673F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Neck3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 67).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6627F, -1.8308F, -0.7679F, 0.0F, 0.0F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 46).addBox(-1.5F, -0.2983F, -2.3488F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F))
				.texOffs(54, 59).addBox(-1.5F, -0.6983F, -2.0988F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(36, 40).addBox(-1.28F, -0.6983F, -2.0988F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, -2.6488F, -1.9332F, -0.446F, -0.063F, 0.0301F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(51, 46).addBox(-0.5F, -0.1735F, -0.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 0).addBox(-0.5F, -0.1735F, 0.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1983F, -4.0488F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(4, 19).addBox(-1.0F, -0.1213F, 0.1239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.3983F, -3.0488F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 68).addBox(-1.5F, -0.1855F, -0.0982F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5983F, -2.2488F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 59).addBox(-0.8F, -0.8999F, -2.6052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.6017F, -2.1488F, 0.0163F, 0.2091F, -0.0111F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(6, 63).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.0877F, -3.468F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(58, 53).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.1017F, -4.2679F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 63).addBox(-0.6F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 40).addBox(-0.6F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -0.0262F, -2.6699F, 0.0181F, 0.2618F, 0.0047F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(24, 63).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 57).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -0.1983F, -0.6988F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 69).addBox(-1.0F, -0.7374F, -0.8775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6633F, -0.4319F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(26, 68).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, 0.0367F, -0.8319F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(12, 68).addBox(-1.0F, 0.2369F, -0.1782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 68).addBox(-1.0F, -0.1631F, -0.1782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.5F, -0.9106F, -1.606F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(11, 6).addBox(-1.5F, -0.1005F, -1.6537F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 65).addBox(-1.0F, -0.1005F, -4.1182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.5017F, -0.5488F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 13).addBox(-0.7671F, -0.9F, -0.1487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 0.7995F, -3.9537F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 75);
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