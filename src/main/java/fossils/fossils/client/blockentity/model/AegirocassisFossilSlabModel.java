package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AegirocassisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart Helement_shell;
	private final ModelPart PelementL;
	private final ModelPart PelementR;
	private final ModelPart headbase;
	private final ModelPart eyeR;
	private final ModelPart segments;
	private final ModelPart segment1;
	private final ModelPart finupperR;
	private final ModelPart finlowerL;
	private final ModelPart finlowerR;
	private final ModelPart segment2;
	private final ModelPart finlowerR2;
	private final ModelPart finupperR2;
	private final ModelPart finupperL2;
	private final ModelPart finlowerL2;
	private final ModelPart segment3;
	private final ModelPart finlowerR3;
	private final ModelPart segment4;
	private final ModelPart finupperR4;
	private final ModelPart finlowerL4;
	private final ModelPart finlowerR4;
	private final ModelPart segment5;
	private final ModelPart finupperR5;
	private final ModelPart finlowerR5;
	private final ModelPart finlowerL5;
	private final ModelPart segment6;
	private final ModelPart finlowerR6;
	private final ModelPart finupperL6;
	private final ModelPart finlowerL6;
	private final ModelPart segment7;
	private final ModelPart finupperR7;
	private final ModelPart finlowerL7;
	private final ModelPart finlowerR7;
	private final ModelPart segment8;
	private final ModelPart finlowerL8;
	private final ModelPart finupperR8;
	private final ModelPart finlowerR8;
	private final ModelPart segment9;
	private final ModelPart finlowerR9;
	private final ModelPart finlowerL9;
	private final ModelPart finupperR9;
	private final ModelPart segment10;
	private final ModelPart finupperR10;
	private final ModelPart finlowerL10;
	private final ModelPart finlowerR10;
	private final ModelPart segment11;

	public AegirocassisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.head = this.body.getChild("head");
		this.Helement_shell = this.head.getChild("Helement_shell");
		this.PelementL = this.head.getChild("PelementL");
		this.PelementR = this.head.getChild("PelementR");
		this.headbase = this.head.getChild("headbase");
		this.eyeR = this.headbase.getChild("eyeR");
		this.segments = this.body.getChild("segments");
		this.segment1 = this.segments.getChild("segment1");
		this.finupperR = this.segment1.getChild("finupperR");
		this.finlowerL = this.segment1.getChild("finlowerL");
		this.finlowerR = this.segment1.getChild("finlowerR");
		this.segment2 = this.segment1.getChild("segment2");
		this.finlowerR2 = this.segment2.getChild("finlowerR2");
		this.finupperR2 = this.segment2.getChild("finupperR2");
		this.finupperL2 = this.segment2.getChild("finupperL2");
		this.finlowerL2 = this.segment2.getChild("finlowerL2");
		this.segment3 = this.segment2.getChild("segment3");
		this.finlowerR3 = this.segment3.getChild("finlowerR3");
		this.segment4 = this.segment3.getChild("segment4");
		this.finupperR4 = this.segment4.getChild("finupperR4");
		this.finlowerL4 = this.segment4.getChild("finlowerL4");
		this.finlowerR4 = this.segment4.getChild("finlowerR4");
		this.segment5 = this.segment4.getChild("segment5");
		this.finupperR5 = this.segment5.getChild("finupperR5");
		this.finlowerR5 = this.segment5.getChild("finlowerR5");
		this.finlowerL5 = this.segment5.getChild("finlowerL5");
		this.segment6 = this.segment5.getChild("segment6");
		this.finlowerR6 = this.segment6.getChild("finlowerR6");
		this.finupperL6 = this.segment6.getChild("finupperL6");
		this.finlowerL6 = this.segment6.getChild("finlowerL6");
		this.segment7 = this.segment6.getChild("segment7");
		this.finupperR7 = this.segment7.getChild("finupperR7");
		this.finlowerL7 = this.segment7.getChild("finlowerL7");
		this.finlowerR7 = this.segment7.getChild("finlowerR7");
		this.segment8 = this.segment7.getChild("segment8");
		this.finlowerL8 = this.segment8.getChild("finlowerL8");
		this.finupperR8 = this.segment8.getChild("finupperR8");
		this.finlowerR8 = this.segment8.getChild("finlowerR8");
		this.segment9 = this.segment8.getChild("segment9");
		this.finlowerR9 = this.segment9.getChild("finlowerR9");
		this.finlowerL9 = this.segment9.getChild("finlowerL9");
		this.finupperR9 = this.segment9.getChild("finupperR9");
		this.segment10 = this.segment9.getChild("segment10");
		this.finupperR10 = this.segment10.getChild("finupperR10");
		this.finlowerL10 = this.segment10.getChild("finlowerL10");
		this.finlowerR10 = this.segment10.getChild("finlowerR10");
		this.segment11 = this.segment10.getChild("segment11");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -12.0F, -17.0F, 10.0F, 12.0F, 18.0F, new CubeDeformation(-0.003F))
				.texOffs(31, 80).addBox(-4.0F, -9.0F, -25.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 78).addBox(-7.0F, -7.0F, -12.0F, 2.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(102, 45).addBox(-7.0F, -5.0F, -21.0F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-7.0F, -8.0F, 1.0F, 12.0F, 8.0F, 18.0F, new CubeDeformation(0.003F))
				.texOffs(76, 71).addBox(-7.0F, -8.0F, 19.0F, 5.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(76, 51).addBox(-2.0F, -7.0F, 19.0F, 6.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(35, 36).addBox(4.0F, -4.0F, -15.0F, 4.0F, 4.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(4.0F, -4.0F, 13.0F, 6.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(97, 29).addBox(1.0F, -9.0F, 7.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, -0.0436F, -0.3491F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(76, 0).addBox(-5.5F, -1.9F, -8.0F, 11.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Helement_shell = head.addOrReplaceChild("Helement_shell", CubeListBuilder.create(), PartPose.offset(0.0F, -3.25F, 0.0F));

		PartDefinition Helement_R1_r1 = Helement_shell.addOrReplaceChild("Helement_R1_r1", CubeListBuilder.create().texOffs(19, 98).addBox(-0.2F, 0.0F, -6.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.85F, 2.0F, -7.25F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Helement_R2_r1 = Helement_shell.addOrReplaceChild("Helement_R2_r1", CubeListBuilder.create().texOffs(99, 80).addBox(0.2F, -0.1F, -6.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.75F, 2.1F, -7.25F, 0.0F, 0.0F, 0.5672F));

		PartDefinition Helement_R_r1 = Helement_shell.addOrReplaceChild("Helement_R_r1", CubeListBuilder.create().texOffs(43, 0).addBox(-0.89F, -12.25F, -30.0F, 8.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(66, 34).addBox(-0.89F, -12.25F, -14.0F, 8.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.25F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Helement_L_r1 = Helement_shell.addOrReplaceChild("Helement_L_r1", CubeListBuilder.create().texOffs(43, 63).addBox(-7.11F, -12.25F, -14.0F, 8.0F, 2.0F, 14.0F, new CubeDeformation(0.002F))
				.texOffs(45, 17).addBox(-7.11F, -12.25F, -30.0F, 8.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.25F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition PelementL = head.addOrReplaceChild("PelementL", CubeListBuilder.create(), PartPose.offset(4.0F, 1.0F, -7.0F));

		PartDefinition PelementL1_r1 = PelementL.addOrReplaceChild("PelementL1_r1", CubeListBuilder.create().texOffs(90, 96).addBox(5.25F, -9.75F, -13.25F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 8.75F, 7.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition PelementR = head.addOrReplaceChild("PelementR", CubeListBuilder.create(), PartPose.offset(-4.0F, 1.0F, -7.0F));

		PartDefinition PelementR2_r1 = PelementR.addOrReplaceChild("PelementR2_r1", CubeListBuilder.create().texOffs(80, 12).addBox(-4.0F, -9.75F, -13.251F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 8.5F, 7.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition PelementR1_r1 = PelementR.addOrReplaceChild("PelementR1_r1", CubeListBuilder.create().texOffs(71, 92).addBox(-8.25F, -9.5F, -13.25F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 8.5F, 7.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition headbase = head.addOrReplaceChild("headbase", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition eyeR = headbase.addOrReplaceChild("eyeR", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(28, 58).addBox(-3.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 0.5F, -0.5F));

		PartDefinition segments = body.addOrReplaceChild("segments", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition segment1 = segments.addOrReplaceChild("segment1", CubeListBuilder.create().texOffs(99, 71).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition finupperR = segment1.addOrReplaceChild("finupperR", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, -2.0F, 1.0F, 0.0F, 0.0F, -0.4276F));

		PartDefinition finlowerL = segment1.addOrReplaceChild("finlowerL", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition finlowerR = segment1.addOrReplaceChild("finlowerR", CubeListBuilder.create().texOffs(90, 92).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition segment2 = segment1.addOrReplaceChild("segment2", CubeListBuilder.create().texOffs(99, 12).addBox(-5.0F, -2.01F, 0.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition finlowerR2 = segment2.addOrReplaceChild("finlowerR2", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition finupperR2 = segment2.addOrReplaceChild("finupperR2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, -2.0F, 1.0F, 0.0F, 0.0F, -0.7069F));

		PartDefinition finupperL2 = segment2.addOrReplaceChild("finupperL2", CubeListBuilder.create().texOffs(9, 108).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, -2.0F, 1.0F, 0.0F, 0.0F, 2.9234F));

		PartDefinition finlowerL2 = segment2.addOrReplaceChild("finlowerL2", CubeListBuilder.create().texOffs(72, 39).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition segment3 = segment2.addOrReplaceChild("segment3", CubeListBuilder.create().texOffs(0, 99).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition finlowerR3 = segment3.addOrReplaceChild("finlowerR3", CubeListBuilder.create().texOffs(66, 34).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition segment4 = segment3.addOrReplaceChild("segment4", CubeListBuilder.create().texOffs(28, 63).addBox(-5.0F, -2.01F, 0.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition finupperR4 = segment4.addOrReplaceChild("finupperR4", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.2217F));

		PartDefinition finlowerL4 = segment4.addOrReplaceChild("finlowerL4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition finlowerR4 = segment4.addOrReplaceChild("finlowerR4", CubeListBuilder.create().texOffs(6, 63).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition segment5 = segment4.addOrReplaceChild("segment5", CubeListBuilder.create().texOffs(66, 109).addBox(-4.5F, -2.0F, 0.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0873F));

		PartDefinition finupperR5 = segment5.addOrReplaceChild("finupperR5", CubeListBuilder.create().texOffs(52, 27).addBox(0.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.5F, -2.0F, 1.0F, 0.0F, 0.0F, 1.2217F));

		PartDefinition finlowerR5 = segment5.addOrReplaceChild("finlowerR5", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 3.0F, 1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition finlowerL5 = segment5.addOrReplaceChild("finlowerL5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition segment6 = segment5.addOrReplaceChild("segment6", CubeListBuilder.create().texOffs(44, 103).addBox(-4.5F, -2.01F, 0.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition finlowerR6 = segment6.addOrReplaceChild("finlowerR6", CubeListBuilder.create().texOffs(43, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 3.0F, 1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition finupperL6 = segment6.addOrReplaceChild("finupperL6", CubeListBuilder.create().texOffs(73, 51).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.0F, 1.0F, 0.0F, 0.0F, 2.8362F));

		PartDefinition finlowerL6 = segment6.addOrReplaceChild("finlowerL6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition segment7 = segment6.addOrReplaceChild("segment7", CubeListBuilder.create().texOffs(109, 96).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition finupperR7 = segment7.addOrReplaceChild("finupperR7", CubeListBuilder.create().texOffs(13, 6).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.4835F));

		PartDefinition finlowerL7 = segment7.addOrReplaceChild("finlowerL7", CubeListBuilder.create().texOffs(11, 35).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition finlowerR7 = segment7.addOrReplaceChild("finlowerR7", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition segment8 = segment7.addOrReplaceChild("segment8", CubeListBuilder.create().texOffs(18, 78).addBox(-3.5F, -1.5F, 0.0F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0436F, 0.0F, 0.0436F));

		PartDefinition finlowerL8 = segment8.addOrReplaceChild("finlowerL8", CubeListBuilder.create().texOffs(32, 98).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.5F, 1.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition finupperR8 = segment8.addOrReplaceChild("finupperR8", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.5F, -1.5F, 1.0F, 0.0F, 0.0F, 1.3526F));

		PartDefinition finlowerR8 = segment8.addOrReplaceChild("finlowerR8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 2.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition segment9 = segment8.addOrReplaceChild("segment9", CubeListBuilder.create().texOffs(107, 0).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0873F, 0.0873F, 0.0F));

		PartDefinition finlowerR9 = segment9.addOrReplaceChild("finlowerR9", CubeListBuilder.create().texOffs(66, 51).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition finlowerL9 = segment9.addOrReplaceChild("finlowerL9", CubeListBuilder.create().texOffs(39, 34).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.5F, 1.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition finupperR9 = segment9.addOrReplaceChild("finupperR9", CubeListBuilder.create().texOffs(47, 38).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition segment10 = segment9.addOrReplaceChild("segment10", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 3.0F));

		PartDefinition finupperR10 = segment10.addOrReplaceChild("finupperR10", CubeListBuilder.create().texOffs(74, 71).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, -1.5F, 1.0F, 0.0F, 0.0F, 1.3526F));

		PartDefinition finlowerL10 = segment10.addOrReplaceChild("finlowerL10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.5F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition finlowerR10 = segment10.addOrReplaceChild("finlowerR10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 1.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition segment11 = segment10.addOrReplaceChild("segment11", CubeListBuilder.create().texOffs(39, 27).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 133, 130);
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