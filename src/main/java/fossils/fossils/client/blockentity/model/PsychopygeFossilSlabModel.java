package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PsychopygeFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart headspike;
	private final ModelPart headspike2;

	public PsychopygeFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.headspike = this.main.getChild("headspike");
		this.headspike2 = this.main.getChild("headspike2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -7.0F, 13.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-6.0F, -3.3F, 0.5F, 12.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(46, 21).addBox(-2.0F, 0.0F, -13.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 39).addBox(-2.0F, -0.3F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -10.5F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 27).addBox(-0.9F, -1.0F, -1.6F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(34, 52).addBox(-0.9F, -1.0F, -4.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.5F, 0.0F, -9.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 50).addBox(-7.0031F, -1.0F, -1.0247F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7F, 0.0F, -13.4F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 0).addBox(-2.8522F, -1.0F, -3.4034F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, 0.0F, -9.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 39).addBox(-3.0402F, -1.0F, -7.9225F, 3.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(8.0F, 0.0F, -7.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 27).addBox(0.1021F, -2.0F, 0.0296F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-8.6F, 0.0F, 2.3F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.1F, -1.0F, 0.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.0F, 0.0F, -7.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r8 = fossil.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, 3.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r9 = fossil.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 13).addBox(-4.5F, -0.6581F, -5.649F, 9.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.5575F, 2.2749F, 0.5236F, 0.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(46, 29).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 55).addBox(-0.9754F, 0.0F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9479F, -1.0F, -7.0325F, 0.0F, 1.1912F, 0.0F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 56).addBox(-0.675F, 0.0F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(42, 52).addBox(-1.675F, 0.0F, 0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.0F, -6.0F, 0.0F, 0.7505F, 0.0F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 55).addBox(-0.0246F, 0.0F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.9479F, -1.0F, -7.0325F, 0.0F, -1.1912F, 0.0F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 6).addBox(-0.325F, 0.0F, 0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 57).addBox(-0.325F, 0.0F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -6.0F, 0.0F, -0.7505F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.325F, -9.625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.5F, -0.325F, -12.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 39).addBox(-3.8739F, 0.3F, -0.727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.3099F, 0.1664F, 0.053F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 4).addBox(-4.5898F, 0.25F, -0.1736F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.3242F, 0.3364F, 0.1105F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 3).addBox(-4.4324F, 0.3899F, -0.4896F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.476F, 0.2299F, 0.1169F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 24).addBox(-4.7407F, 0.3649F, 0.2922F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.4941F, 0.3457F, 0.1806F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 40).addBox(-2.1557F, 0.438F, 1.5278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 0).addBox(-5.0302F, 0.488F, -1.8257F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0537F, 0.6233F, 0.0314F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(14, 40).addBox(-6.5515F, 0.338F, -2.1757F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0878F, 1.0499F, 0.0762F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(47, 10).addBox(-6.8964F, 0.338F, -2.2224F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.3331F, 1.437F, 0.3303F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(37, 0).addBox(1.1557F, 0.438F, 1.5278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 60).addBox(-0.5F, 0.438F, 1.9267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 52).addBox(-2.0F, -0.062F, -0.0733F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 60).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5F, -1.2413F, -5.86F, 0.0433F, -0.0057F, 0.1308F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 60).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(28, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.2413F, -5.86F, 0.0433F, 0.0057F, -0.1308F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 42).addBox(2.8739F, 0.3F, -0.727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.3099F, -0.1664F, -0.053F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 44).addBox(2.5898F, 0.25F, -0.1736F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.3242F, -0.3364F, -0.1105F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(43, 21).addBox(1.4324F, 0.3899F, -0.4896F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.476F, -0.2299F, -0.1169F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 34).addBox(1.7407F, 0.3649F, 0.2922F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.4941F, -0.3457F, -0.1806F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(51, 42).addBox(1.0302F, 0.488F, -1.8257F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0537F, -0.6233F, -0.0314F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 43).addBox(0.5515F, 0.338F, -2.1757F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0878F, -1.0499F, -0.0762F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 39).addBox(-0.1036F, 0.338F, -2.2224F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.3331F, -1.437F, -0.3303F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 0).addBox(-2.7496F, -1.0582F, -0.1042F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.2675F, 0.0468F, -0.1647F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(6, 5).addBox(2.395F, -0.6472F, 1.9677F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 5).addBox(2.395F, -0.7472F, -0.0323F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.4564F, -0.0776F, 0.1565F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 5).addBox(-2.395F, -0.6472F, 1.9677F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 5).addBox(-2.395F, -0.7472F, -0.0323F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.4564F, 0.0776F, -0.1565F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 27).addBox(-1.914F, -0.4251F, -0.0733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0433F, 0.0057F, -0.1308F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 13).addBox(1.914F, -0.4251F, -0.0733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, 0.0433F, -0.0057F, 0.1308F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(41, 47).addBox(-2.5F, -0.1101F, -0.0323F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 13).addBox(2.7496F, -1.0582F, -0.1042F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.2675F, -0.0468F, 0.1647F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 51).addBox(-3.0F, -0.3F, -0.1F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(38, 60).addBox(-0.5F, -0.45F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, -0.45F, -0.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.925F, -6.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.3289F, 0.7503F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 27).addBox(-0.5F, -0.1779F, -0.3042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.8621F, 0.5858F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(6, 13).addBox(0.0F, -0.6891F, -0.2195F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 13).addBox(0.0F, -0.6891F, 1.7805F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.5829F, -0.174F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4621F, -2.1142F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -1.1133F, 0.1949F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 13).addBox(-0.5F, -0.9071F, -0.2596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(6, 27).addBox(0.0F, -0.9339F, -0.0291F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7637F, -5.1594F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 60).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -5.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition headspike = main.addOrReplaceChild("headspike", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.0F, -6.0F));

		PartDefinition cube_r47 = headspike.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 52).addBox(-0.9587F, 0.05F, -0.0201F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5289F, 0.5F, 3.3683F, 0.0F, 0.384F, 0.0F));

		PartDefinition cube_r48 = headspike.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 13).addBox(-0.675F, 0.5F, 1.925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.7505F, 0.0F));

		PartDefinition headspike2 = main.addOrReplaceChild("headspike2", CubeListBuilder.create(), PartPose.offset(2.5F, -1.0F, -6.0F));

		PartDefinition cube_r49 = headspike2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(13, 51).addBox(-0.0413F, 0.05F, -0.0201F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5289F, 0.5F, 3.3683F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r50 = headspike2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 5).addBox(-0.325F, 0.5F, 1.925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, -0.7505F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 65);
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