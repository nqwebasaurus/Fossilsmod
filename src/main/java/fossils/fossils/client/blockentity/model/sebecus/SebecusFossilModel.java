package fossils.fossils.client.blockentity.model.sebecus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SebecusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public SebecusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.head.getChild("crestl2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.0254F, 8.5353F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 92).addBox(0.0F, -2.3438F, -0.0741F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2508F, -2.9262F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 92).addBox(0.0F, -2.2F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 0.8989F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 90).addBox(0.0F, -0.0938F, 0.2259F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3605F, -0.9951F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9861F, -3.1789F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 22).mirror().addBox(-2.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 22).addBox(0.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9465F, 1.72F, 0.9342F, 0.1744F, -0.0076F, 0.0866F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 11).addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 33).addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 88).addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 26).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 69).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(95, 12).addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(95, 9).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 6).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 20).addBox(-0.55F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.747F, 0.9858F, 1.1894F, 0.0457F, 0.1134F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(98, 26).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 66).addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, 0.1222F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(98, 32).addBox(-0.8326F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(76, 12).addBox(-0.8326F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3916F, -0.3343F, 2.6621F, -0.0674F, 0.4759F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 96).addBox(-0.8326F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0542F, -0.3916F, -0.3343F, -2.2685F, -0.0674F, 0.4759F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 31).addBox(-0.8326F, 0.4843F, -0.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3916F, -0.3343F, -0.9159F, -0.0674F, 0.4759F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 96).addBox(-0.8576F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 76).addBox(-0.8576F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3916F, -0.3343F, -1.1777F, -0.0674F, 0.4759F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(24, 81).addBox(-0.863F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(70, 65).addBox(-0.863F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0542F, -0.3916F, -0.3343F, -1.6161F, -0.0932F, 0.482F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(11, 51).addBox(-0.8967F, -0.7692F, -3.6389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.092F, 0.1316F, -1.8807F, 1.1721F, 0.0046F, 0.445F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 65).addBox(-1.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3937F, -0.7399F, -1.4942F, -0.5871F, -0.0417F, 0.1149F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 87).addBox(-1.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(0.3937F, -0.7399F, -1.4942F, 0.3728F, -0.0417F, 0.1149F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 99).addBox(-1.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3937F, -0.7399F, -1.4942F, 1.3328F, -0.0417F, 0.1149F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(25, 85).addBox(-1.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3937F, -0.7399F, -1.4942F, 1.263F, -0.0417F, 0.1149F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 65).addBox(-0.9F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3937F, -2.0399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9465F, 1.72F, 0.9342F, 0.1744F, 0.0076F, -0.0866F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(95, 9).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 20).mirror().addBox(-0.45F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.747F, 0.9858F, 1.1894F, -0.0457F, -0.1134F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(41, 66).mirror().addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, -0.1222F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 32).mirror().addBox(-0.1674F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(76, 12).mirror().addBox(-0.1674F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3916F, -0.3343F, 2.6621F, 0.0674F, -0.4759F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.1674F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3916F, -0.3343F, -2.2685F, 0.0674F, -0.4759F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-0.1674F, 0.4843F, -0.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3916F, -0.3343F, -0.9159F, 0.0674F, -0.4759F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 96).mirror().addBox(-0.1424F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 76).mirror().addBox(-0.1424F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3916F, -0.3343F, -1.1777F, 0.0674F, -0.4759F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 81).mirror().addBox(-0.137F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(70, 65).mirror().addBox(-0.137F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3916F, -0.3343F, -1.6161F, 0.0932F, -0.482F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(11, 51).mirror().addBox(-0.1033F, -0.7692F, -3.6389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.1316F, -1.8807F, 1.1721F, -0.0046F, -0.445F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(31, 65).mirror().addBox(0.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -0.7399F, -1.4942F, -0.5871F, 0.0417F, -0.1149F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(0.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -0.7399F, -1.4942F, 0.3728F, 0.0417F, -0.1149F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 99).mirror().addBox(0.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -0.7399F, -1.4942F, 1.3328F, 0.0417F, -0.1149F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(0.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -0.7399F, -1.4942F, 1.263F, 0.0417F, -0.1149F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.1F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -2.0399F, 0.9058F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.7684F, 0.2109F, 0.0367F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(79, 52).addBox(0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3638F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(88, 68).addBox(0.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg2.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(72, 62).addBox(0.5F, -0.5531F, -0.528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5098F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(45, 88).addBox(0.5F, -0.6531F, 0.047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.6534F, -0.2882F, 0.7941F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(14, 65).addBox(-0.5F, -5.1F, -0.025F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 6.6448F, 0.9501F, 0.2094F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(61, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(10, 84).addBox(0.5F, -0.0686F, -1.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(94, 54).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(94, 51).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 9.4961F, 2.313F, -1.4224F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(94, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 8.8668F, 1.5358F, -0.6807F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg2.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(62, 78).addBox(-0.5F, -2.3578F, -0.6925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 8.0657F, 2.0253F, 0.2531F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(56, 83).addBox(-0.5F, -1.3F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 8.301F, 2.3488F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 10.1149F, 3.3404F, 1.4964F, 0.0F, 0.0F));

		PartDefinition leg6_r1 = leg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(33, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.4535F, 6.5529F, 0.2504F, 1.5708F, 0.7505F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(57, 78).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.4535F, 4.0421F, 0.5165F, 1.5708F, 1.5359F, 1.5708F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(19, 78).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 4.0421F, 0.5165F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition leg6_r2 = leg2.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(28, 94).addBox(-0.75F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(35, 91).addBox(-0.75F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(89, 80).addBox(-0.75F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 0.599F, -0.2867F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(7, 71).addBox(-0.725F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.4535F, 0.5968F, -0.2618F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition leg8_r1 = leg2.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(34, 81).addBox(-0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, 4.9893F, -0.2671F, 1.5708F, -1.405F, 1.5708F));

		PartDefinition leg7_r1 = leg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(36, 60).addBox(-0.1F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.6465F, -0.0039F, -0.5288F, -1.5708F, -1.5184F, -1.5708F));

		PartDefinition leg6_r3 = leg2.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(79, 89).addBox(-0.9F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(89, 77).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, -0.6175F, 0.5073F, -1.5708F, -0.192F, -1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(89, 63).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6465F, -0.0154F, 0.514F, -1.5708F, 0.8552F, -1.5708F));

		PartDefinition leg6_r4 = leg2.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(23, 94).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(89, 60).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6465F, 1.1476F, -0.0454F, -1.5708F, 1.2392F, -1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0487F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.2193F, 0.29F, -0.2046F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(45, 29).addBox(-2.0487F, -0.9978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.2967F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.7684F, 0.2109F, -0.5305F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(79, 56).addBox(-1.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.3638F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg3.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(88, 74).addBox(-1.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperleg3.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(26, 74).addBox(-1.5F, -0.5531F, -0.528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5098F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperleg7_r3 = upperleg3.addOrReplaceChild("upperleg7_r3", CubeListBuilder.create().texOffs(71, 21).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg6_r3 = upperleg3.addOrReplaceChild("upperleg6_r3", CubeListBuilder.create().texOffs(88, 71).addBox(-1.5F, -0.6531F, 0.047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.6534F, -0.2882F, 0.7941F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(19, 65).addBox(-0.5F, -5.1F, -0.025F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 6.6448F, 0.9501F, 0.2094F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg3.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(83, 69).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg3.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(49, 84).addBox(-1.5F, -0.0686F, -1.0385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.1833F, 0.0F, 0.0F));

		PartDefinition upperleg7_r4 = upperleg3.addOrReplaceChild("upperleg7_r4", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(94, 92).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 9.4961F, 2.313F, -1.4224F, 0.0F, 0.0F));

		PartDefinition upperleg5_r5 = upperleg3.addOrReplaceChild("upperleg5_r5", CubeListBuilder.create().texOffs(94, 89).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 8.8668F, 1.5358F, -0.6807F, 0.0F, 0.0F));

		PartDefinition upperleg4_r6 = upperleg3.addOrReplaceChild("upperleg4_r6", CubeListBuilder.create().texOffs(77, 78).addBox(-0.5F, -2.3578F, -0.6925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 8.0657F, 2.0253F, 0.2531F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperleg3.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(66, 83).addBox(-0.5F, -1.3F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 8.301F, 2.3488F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 10.1149F, 3.3404F, 1.3219F, 0.0F, 0.0F));

		PartDefinition leg7_r2 = leg3.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(94, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.4535F, 6.5529F, 0.2504F, 1.5708F, -0.7505F, -1.5708F));

		PartDefinition leg6_r5 = leg3.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(78, 73).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.4535F, 4.0421F, 0.5165F, 1.5708F, -1.5359F, -1.5708F));

		PartDefinition leg5_r2 = leg3.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(72, 78).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4535F, 4.0421F, 0.5165F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition leg7_r3 = leg3.addOrReplaceChild("leg7_r3", CubeListBuilder.create().texOffs(94, 78).addBox(-0.25F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(91, 39).addBox(-0.25F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(90, 2).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4535F, 0.599F, -0.2867F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(71, 9).addBox(-0.275F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.4535F, 0.5968F, -0.2618F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leg9_r1 = leg3.addOrReplaceChild("leg9_r1", CubeListBuilder.create().texOffs(39, 81).addBox(-0.9F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6465F, 4.9893F, -0.2671F, 1.5708F, 1.405F, -1.5708F));

		PartDefinition leg8_r2 = leg3.addOrReplaceChild("leg8_r2", CubeListBuilder.create().texOffs(9, 62).addBox(-0.9F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.6465F, -0.0039F, -0.5288F, -1.5708F, 1.5184F, 1.5708F));

		PartDefinition leg7_r4 = leg3.addOrReplaceChild("leg7_r4", CubeListBuilder.create().texOffs(0, 90).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(89, 89).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6465F, -0.6175F, 0.5073F, -1.5708F, 0.192F, 1.5708F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(84, 89).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6465F, -0.0154F, 0.514F, -1.5708F, -0.8552F, 1.5708F));

		PartDefinition leg7_r5 = leg3.addOrReplaceChild("leg7_r5", CubeListBuilder.create().texOffs(94, 75).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(89, 83).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6465F, 1.1476F, -0.0454F, -1.5708F, -1.2392F, 1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(0, 7).addBox(-1.9513F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.2193F, 0.29F, 0.0136F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(49, 6).addBox(-1.9513F, -0.9978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.6021F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.0001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1997F, -2.9825F, 0.0183F, -0.0852F, -0.0189F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0001F, -2.0122F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(58, 95).addBox(0.0F, -2.65F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, -4.0122F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-1.6143F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -1.5122F, 0.27F, 0.105F, -0.71F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-1.6132F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.0254F, 0.0243F, -0.7065F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 44).mirror().addBox(-2.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.0156F, 0.0315F, -1.0556F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 34).addBox(-0.3857F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -1.5122F, 0.27F, -0.105F, 0.71F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 37).addBox(-0.3868F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.0254F, -0.0243F, 0.7065F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(72, 44).addBox(1.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.0156F, -0.0315F, 1.0556F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(34, 22).addBox(-1.0F, -0.0764F, 0.0477F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.021F, -5.1119F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -2.0015F, -4.037F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.097F, 0.5879F, 0.384F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5F, 0.0F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9192F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 29).addBox(-1.0F, -0.125F, 0.0276F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2765F, -4.6459F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 91).addBox(0.0F, -2.825F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.1F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(50, 88).addBox(0.0F, -2.825F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1047F, -1.1018F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(58, 90).addBox(0.0F, -2.875F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.0706F, 0.0132F, -1.0319F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.0708F, -0.0117F, -0.6838F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-1.6054F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.1629F, 0.0521F, -0.6453F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-3.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.1356F, 0.1045F, -0.9915F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(-4.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.072F, 0.1552F, -1.473F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(-4.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -4.6F, 0.0843F, 0.2768F, -1.4703F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-3.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -4.6F, 0.2038F, 0.2065F, -0.981F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-1.3105F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, -4.6F, 0.2612F, 0.1252F, -0.6366F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 62).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.0706F, -0.0132F, 1.0319F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 82).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.0708F, 0.0117F, 0.6838F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(82, 46).addBox(-0.3945F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.1629F, -0.0521F, 0.6453F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 48).addBox(1.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.1356F, -0.1045F, 0.9915F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(67, 40).addBox(3.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.072F, -0.1552F, 1.473F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(79, 60).addBox(2.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9F, -4.6F, 0.0843F, -0.2768F, 1.4703F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 67).addBox(1.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9F, -4.6F, 0.2038F, -0.2065F, 0.981F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(64, 9).addBox(-0.6895F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9F, -4.6F, 0.2612F, -0.1252F, 0.6366F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(17, 14).addBox(-1.5F, -1.1581F, -8.9292F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.8123F, 4.4638F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(62, 16).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(49, 18).addBox(-1.0F, -3.7247F, -3.2273F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.1924F, -0.1308F, -0.0057F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 92).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 8).addBox(-1.5F, -0.925F, -1.975F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2541F, -2.1111F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.1795F, 0.1925F, -1.0207F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.2339F, 0.1201F, -0.6749F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-5.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.0693F, 0.2533F, -1.5092F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(82, 80).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.1795F, -0.1925F, 1.0207F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(82, 78).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.2339F, -0.1201F, 0.6749F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(82, 64).addBox(3.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.0693F, -0.2533F, 1.5092F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(60, 29).addBox(-0.5F, 6.4667F, -4.1296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0516F, -0.2083F, -2.9595F, 0.0311F, -0.1481F, 0.0007F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(34, 15).addBox(-1.0F, -0.05F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0508F, -3.4204F, -0.6456F, 0.1658F, 0.0009F, -0.0018F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(26, 43).addBox(-0.5457F, 0.1395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 92).addBox(0.0F, -2.7413F, -0.0199F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(26, 37).addBox(0.5F, -3.1328F, -0.037F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5059F, 0.758F, -5.0253F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(15, 92).addBox(0.0F, -2.9505F, 0.0138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6333F, 7.299F, -1.4821F, 0.8481F, -0.4451F, -0.4929F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.529F, 6.9537F, -1.4373F, 1.0146F, -0.6316F, -0.5638F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 62).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 7.3343F, -2.2058F, 1.2406F, -0.863F, -0.6249F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.3735F, 0.5365F, -0.9491F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.5306F, 0.3823F, -0.5988F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-5.4869F, -1.5872F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.0527F, 0.6412F, -1.5154F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(83, 13).mirror().addBox(-5.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.1298F, 0.3922F, -1.471F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(63, 46).mirror().addBox(-3.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.2992F, 0.2877F, -0.9732F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 11).mirror().addBox(-1.59F, 0.2685F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.3768F, 0.1709F, -0.6351F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-3.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.4306F, 0.4339F, -1.0134F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-5.1784F, -1.9179F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.1703F, 0.5797F, -1.5388F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-1.6819F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.5449F, 0.2688F, -0.6852F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5301F, 7.299F, -1.4821F, 0.8481F, 0.4451F, 0.4929F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(49, 24).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4258F, 6.9537F, -1.4373F, 1.0146F, 0.6316F, 0.5638F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 7.3343F, -2.2058F, 1.2406F, 0.863F, 0.6249F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(83, 15).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.3735F, -0.5365F, 0.9491F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 71).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.5306F, -0.3823F, 0.5988F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(36, 6).addBox(2.4869F, -1.5872F, -0.4758F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.0527F, -0.6412F, 1.5154F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(83, 13).addBox(3.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.1298F, -0.3922F, 1.471F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(63, 46).addBox(1.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.2992F, -0.2877F, 0.9732F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 11).addBox(-0.41F, 0.2685F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.3768F, -0.1709F, 0.6351F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(83, 9).addBox(1.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.4306F, -0.4339F, 1.0134F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(83, 7).addBox(3.1784F, -1.9179F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.1703F, -0.5797F, 1.5388F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(82, 82).addBox(-0.3181F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.5449F, -0.2688F, 0.6852F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5484F, 4.7857F, -5.3789F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r120 = UpperArmL.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(99, 51).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.7938F, 0.9823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r121 = UpperArmL.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(99, 54).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 7.0779F, 0.0235F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r122 = UpperArmL.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(28, 97).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.4068F, -0.407F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r123 = UpperArmL.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(91, 48).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.8316F, 0.8849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r124 = UpperArmL.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(95, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r125 = UpperArmL.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r126 = UpperArmL.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(66, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4973F, 0.1902F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r127 = UpperArmL.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(43, 73).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r128 = UpperArmL.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 32).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r129 = UpperArmL.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 15).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create().texOffs(44, 56).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 7.5835F, 0.6961F, -1.1487F, 0.1195F, 0.0535F));

		PartDefinition cube_r130 = LowerArmL.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 93).addBox(-1.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(71, 83).addBox(-1.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 2.2026F, -0.775F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r131 = LowerArmL.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r132 = LowerArmL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(77, 44).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(22, 56).addBox(-3.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 8.0624F, -0.7513F, 2.0508F, 0.0F, 0.0F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(19, 8).addBox(-3.0F, -1.0F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6069F, -1.8028F, -0.925F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6516F, 4.7857F, -5.3789F, 0.1308F, 0.0057F, -0.0433F));

		PartDefinition cube_r133 = UpperArmL2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 99).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.7938F, 0.9823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r134 = UpperArmL2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(99, 60).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.0779F, 0.0235F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r135 = UpperArmL2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 15).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.4068F, -0.407F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r136 = UpperArmL2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(94, 60).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.8316F, 0.8849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r137 = UpperArmL2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 35).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r138 = UpperArmL2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(95, 29).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r139 = UpperArmL2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(13, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.4973F, 0.1902F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r140 = UpperArmL2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r141 = UpperArmL2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(94, 57).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r142 = UpperArmL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create().texOffs(49, 56).addBox(1.0F, 0.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 7.5835F, 0.6961F, -0.8422F, -0.0979F, -0.087F));

		PartDefinition cube_r143 = LowerArmL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 63).addBox(0.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(83, 73).addBox(0.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, 2.2026F, -0.775F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r144 = LowerArmL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 78).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r145 = LowerArmL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 77).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(33, 56).addBox(0.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 8.0624F, -0.7513F, 0.9528F, -0.128F, 0.1182F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -1.0F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6069F, -1.8028F, -0.4014F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2893F, 4.9489F, -5.1662F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(61, 48).addBox(-0.5F, -0.719F, -0.634F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8781F, 1.2542F, 1.4276F, 1.8662F, 0.1206F, 0.8841F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(83, 27).addBox(-0.5F, -0.1698F, -0.7301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8781F, 1.2542F, 1.4276F, 1.4298F, 0.1206F, 0.8841F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(52, 77).addBox(-0.5F, -1.1698F, -1.3301F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8781F, 1.2542F, 1.4276F, 1.7353F, 0.1206F, 0.8841F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(71, 0).addBox(-0.4428F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.1147F, 0.0843F, -0.2571F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(31, 73).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7296F, -4.8156F, 2.1504F, -2.1752F, 0.0843F, -0.2571F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3551F, -3.4757F, 2.404F, -0.4735F, 0.0843F, -0.2571F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 17).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8094F, -4.7879F, 1.154F, -3.1351F, 0.0843F, -0.2571F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(73, 4).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8205F, -4.5109F, 0.1931F, 1.8391F, 0.0843F, -0.2571F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(92, 42).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7361F, -3.9212F, -0.6162F, 0.5301F, 0.0843F, -0.2571F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(83, 17).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4742F, -3.1646F, 0.1043F, 0.3555F, 0.0843F, -0.2571F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 56).addBox(-0.4653F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 0.0501F, 0.0843F, -0.2571F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 83).addBox(-0.4653F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 2.2056F, 0.0843F, -0.2571F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.3925F, 4.9489F, -5.1662F));

		PartDefinition cube_r158 = bone3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 48).mirror().addBox(-0.5F, -0.719F, -0.634F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8781F, 1.2542F, 1.4276F, 1.8662F, -0.1206F, -0.8841F));

		PartDefinition cube_r159 = bone3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.5F, -0.1698F, -0.7301F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8781F, 1.2542F, 1.4276F, 1.4298F, -0.1206F, -0.8841F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(52, 77).mirror().addBox(-0.5F, -1.1698F, -1.3301F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8781F, 1.2542F, 1.4276F, 1.7353F, -0.1206F, -0.8841F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5572F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.1147F, -0.0843F, 0.2571F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(31, 73).mirror().addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7296F, -4.8156F, 2.1504F, -2.1752F, -0.0843F, 0.2571F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3551F, -3.4757F, 2.404F, -0.4735F, -0.0843F, 0.2571F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 17).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.8094F, -4.7879F, 1.154F, -3.1351F, -0.0843F, 0.2571F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.8205F, -4.5109F, 0.1931F, 1.8391F, -0.0843F, 0.2571F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7361F, -3.9212F, -0.6162F, 0.5301F, -0.0843F, 0.2571F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4742F, -3.1646F, 0.1043F, 0.3555F, -0.0843F, 0.2571F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(84, 56).mirror().addBox(-0.5347F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 0.0501F, -0.0843F, 0.2571F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5347F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 2.2056F, -0.0843F, 0.2571F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.1486F, -0.0871F, 0.0053F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(41, 60).addBox(0.5F, -2.9805F, -0.1119F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6131F, -2.1009F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(63, 42).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0468F, -3.1046F, -1.06F, 0.0872F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.5034F, 0.6747F, -0.8749F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-4.4869F, -1.5872F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.0667F, 0.8155F, -1.506F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(19, 72).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.6927F, 0.4759F, -0.5312F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 72).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.6927F, -0.4759F, 0.5312F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 21).addBox(2.4869F, -1.5872F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.0667F, -0.8155F, 1.506F));

		PartDefinition cube_r177 = neck3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(83, 31).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.5034F, -0.6747F, 0.8749F));

		PartDefinition cube_r178 = neck3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(27, 60).addBox(-0.0457F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.1307F, -0.0864F, -0.0048F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(17, 83).addBox(0.5F, -3.2F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(64, 5).addBox(-1.0F, -0.475F, -0.525F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -3.4175F, -1.6721F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-1.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.089F, 0.8606F, -1.4715F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(99, 95).mirror().addBox(-0.9709F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.4501F, 0.7652F, -0.9796F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(98, 18).addBox(0.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.089F, -0.8606F, 1.4715F));

		PartDefinition cube_r184 = neck2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(99, 95).addBox(-0.0291F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.4501F, -0.7652F, 0.9796F));

		PartDefinition cube_r185 = neck2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(12, 72).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -2.0022F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r186 = neck4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(85, 92).addBox(0.5F, -2.9F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(63, 57).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -2.826F, -0.4461F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r188 = neck4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-1.9709F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.1404F, -0.6895F, 0.4936F, 1.0085F, -1.0199F));

		PartDefinition cube_r189 = neck4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(84, 66).addBox(-0.0291F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1404F, -0.6895F, 0.4936F, -1.0085F, 1.0199F));

		PartDefinition cube_r190 = neck4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 50).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.013F, -1.9261F, -0.2182F, -0.0435F, 0.0038F));

		PartDefinition cube_r191 = neck5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(9, 100).addBox(0.5F, -2.2F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(63, 61).addBox(-1.0F, -0.525F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -2.1097F, -1.9072F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-1.9709F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, 0.0466F, -0.7634F, 0.9885F, 1.233F, -0.5698F));

		PartDefinition cube_r194 = neck5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(81, 84).addBox(-0.0291F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0466F, -0.7634F, 0.9885F, -1.233F, 0.5698F));

		PartDefinition cube_r195 = neck5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 54).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.675F, -2.0F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition cube_r196 = neck6.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(12, 100).addBox(0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1133F, -0.9233F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r197 = neck6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-1.9709F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, 0.7216F, -0.7634F, 0.795F, 1.1792F, -0.7507F));

		PartDefinition cube_r198 = neck6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(85, 0).addBox(-0.0291F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7216F, -0.7634F, 0.795F, -1.1792F, 0.7507F));

		PartDefinition cube_r199 = neck6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(72, 58).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.1994F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0097F, 0.8396F, -1.4847F, 0.4605F, 0.0243F, -0.2448F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 90).addBox(-0.5098F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0456F, -0.0452F, -12.2932F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 90).addBox(-0.5098F, 0.6532F, -0.4014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0456F, -1.0731F, -11.0904F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(61, 90).addBox(-0.5098F, -0.1044F, -0.9112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0456F, -1.0731F, -11.0904F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 97).addBox(-0.5098F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.9695F, -6.2039F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(86, 97).addBox(-0.5098F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.3711F, -10.1484F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(81, 97).addBox(-0.5098F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.6046F, -9.1761F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(76, 97).addBox(-0.5098F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.7954F, -8.1944F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(97, 41).addBox(-0.5098F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.9259F, -7.203F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(33, 97).addBox(-0.5098F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.9695F, -6.2039F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(53, 93).addBox(-0.0089F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5464F, -2.0242F, -5.0714F, -1.4312F, 0.001F, -0.0032F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(91, 86).addBox(-0.0089F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5464F, -2.0242F, -5.0714F, -0.1658F, 0.001F, -0.0032F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(78, 0).addBox(-1.0613F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0059F, -1.8469F, -3.3253F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 93).addBox(-0.5098F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.8316F, -2.3427F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(69, 31).addBox(-1.0098F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.8491F, -3.3426F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(63, 53).addBox(-1.5098F, -1.6F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0456F, -0.1515F, -0.4167F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7372F, -0.7224F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(96, 38).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.0942F, -1.4383F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(94, 95).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.1006F, -1.4449F, 0.4887F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6716F, -1.4501F, -2.7318F, 0.0031F, 0.0872F, -0.0348F));

		PartDefinition cube_r218 = crestl.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(93, 72).addBox(-0.3F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 69).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1641F, 0.4855F, 3.0679F, 0.8039F, 0.6358F, -0.589F));

		PartDefinition cube_r219 = crestl.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(96, 84).addBox(-0.6895F, 1.2289F, -0.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(71, 96).addBox(-0.6895F, 0.8289F, -0.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2229F, -0.4321F, 1.3567F, 0.9782F, -0.0259F, -0.0517F));

		PartDefinition cube_r220 = crestl.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(83, 33).addBox(-0.3F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.1671F, 0.262F, 2.7362F, 0.4055F, 0.9178F, -1.1445F));

		PartDefinition cube_r221 = crestl.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(67, 34).addBox(-2.6895F, -0.3593F, 0.5024F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2229F, -0.4321F, 1.3567F, -0.2872F, -0.0259F, -0.0517F));

		PartDefinition cube_r222 = crestl.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(8, 97).addBox(-0.4F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 39).addBox(0.0F, -0.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4602F, -0.5796F, 1.2489F, -1.7822F, -0.2688F, 0.1554F));

		PartDefinition cube_r223 = crestl.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(3, 97).addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 49).addBox(0.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4568F, -0.4388F, 1.9419F, -0.6809F, -0.1186F, 0.1052F));

		PartDefinition cube_r224 = crestl.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 24).addBox(-2.7F, -0.3F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2219F, -0.2615F, 2.1431F, -1.7717F, -0.1186F, 0.1052F));

		PartDefinition cube_r225 = crestl.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 67).addBox(-2.6895F, -1.1045F, -0.2892F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2229F, -0.4321F, 1.3567F, -1.7707F, -0.0259F, -0.0517F));

		PartDefinition cube_r226 = crestl.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(48, 66).addBox(-2.6895F, -0.7284F, -0.7037F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2229F, -0.4321F, 1.3567F, 2.9853F, -0.0259F, -0.0517F));

		PartDefinition cube_r227 = crestl.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(67, 37).addBox(-2.7F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 21).addBox(-2.7F, -0.3F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2229F, -0.4321F, 0.9567F, 1.4991F, 0.0264F, -0.0517F));

		PartDefinition cube_r228 = crestl.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(78, 24).addBox(-0.9255F, -0.523F, -0.1618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8609F, -0.2281F, -0.4164F, -0.0698F, 0.2618F, -0.0524F));

		PartDefinition cube_r229 = crestl.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(57, 74).addBox(-1.7F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0662F, -0.2826F, -0.4685F, -1.5526F, 0.5934F, -0.0509F));

		PartDefinition cube_r230 = crestl.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 43).addBox(-1.5F, -0.5F, -1.975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5205F, -0.2452F, 0.4217F, -0.2286F, 1.1677F, -0.2452F));

		PartDefinition crestl2 = head.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7823F, -1.4501F, -2.7318F, 0.0031F, -0.0872F, 0.0348F));

		PartDefinition cube_r231 = crestl2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-0.7F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 69).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1641F, 0.4855F, 3.0679F, 0.8039F, -0.6358F, 0.589F));

		PartDefinition cube_r232 = crestl2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(96, 84).mirror().addBox(-0.3105F, 1.2289F, -0.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(71, 96).mirror().addBox(-0.3105F, 0.8289F, -0.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2229F, -0.4321F, 1.3567F, 0.9782F, 0.0259F, 0.0517F));

		PartDefinition cube_r233 = crestl2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(83, 33).mirror().addBox(-0.7F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.1671F, 0.262F, 2.7362F, 0.4055F, -0.9178F, 1.1445F));

		PartDefinition cube_r234 = crestl2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.3105F, -0.3593F, 0.5024F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2229F, -0.4321F, 1.3567F, -0.2872F, 0.0259F, 0.0517F));

		PartDefinition cube_r235 = crestl2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(8, 97).mirror().addBox(-0.6F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 39).mirror().addBox(-2.0F, -0.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4602F, -0.5796F, 1.2489F, -1.7822F, 0.2688F, -0.1554F));

		PartDefinition cube_r236 = crestl2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(3, 97).mirror().addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 49).mirror().addBox(-2.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4568F, -0.4388F, 1.9419F, -0.6809F, 0.1186F, -0.1052F));

		PartDefinition cube_r237 = crestl2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.3F, -0.3F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2219F, -0.2615F, 2.1431F, -1.7717F, 0.1186F, -0.1052F));

		PartDefinition cube_r238 = crestl2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.3105F, -1.1045F, -0.2892F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2229F, -0.4321F, 1.3567F, -1.7707F, 0.0259F, 0.0517F));

		PartDefinition cube_r239 = crestl2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-0.3105F, -0.7284F, -0.7037F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2229F, -0.4321F, 1.3567F, 2.9853F, 0.0259F, 0.0517F));

		PartDefinition cube_r240 = crestl2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-0.3F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 21).mirror().addBox(-0.3F, -0.3F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2229F, -0.4321F, 0.9567F, 1.4991F, -0.0264F, 0.0517F));

		PartDefinition cube_r241 = crestl2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-1.0745F, -0.523F, -0.1618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8609F, -0.2281F, -0.4164F, -0.0698F, -0.2618F, 0.0524F));

		PartDefinition cube_r242 = crestl2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-0.3F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0662F, -0.2826F, -0.4685F, -1.5526F, -0.5934F, 0.0509F));

		PartDefinition cube_r243 = crestl2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-0.5F, -0.5F, -1.975F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -0.2452F, 0.4217F, -0.2286F, -1.1677F, 0.2452F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6277F, 1.8192F, -9.1433F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(89, 54).addBox(0.0748F, -2.8288F, -2.1738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 1.2399F, 0.0641F, -0.1577F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(99, 44).addBox(-0.0752F, -1.8652F, -0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 2.2871F, 0.0641F, -0.1577F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(61, 99).addBox(-0.7569F, 5.511F, -2.3628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 66).addBox(-0.7569F, 4.711F, -2.3128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2828F, -1.674F, -2.4056F, 1.7418F, 0.0812F, -0.158F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(33, 77).addBox(-0.7569F, 3.9864F, -1.8962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 77).addBox(-0.7569F, 3.1864F, -1.7962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2828F, -1.674F, -2.4056F, 1.672F, 0.0812F, -0.158F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(40, 77).addBox(-0.9011F, 2.3218F, -1.679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1577F, -1.674F, -2.4056F, 1.6707F, 0.0986F, -0.1581F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(76, 69).addBox(-0.0752F, -0.806F, -1.2406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7577F, -1.674F, -0.0056F, 1.6762F, 0.0641F, -0.1577F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 35).addBox(0.0748F, -2.606F, -1.3406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 1.6762F, 0.0641F, -0.1577F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(93, 66).addBox(-0.5F, -0.65F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6519F, -1.9417F, 8.9641F, 1.4501F, 0.0F, -0.0698F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(66, 93).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6519F, -1.9417F, 8.9641F, 2.4101F, 0.0F, -0.0698F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(61, 93).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6519F, -1.9417F, 8.9641F, -3.0005F, 0.0F, -0.0698F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(12, 80).addBox(-0.7F, -3.8499F, 0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7457F, -3.4672F, 6.8172F, -1.9096F, 0.0F, -0.0698F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(50, 73).addBox(-1.9F, -2.1807F, 0.7348F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7457F, -3.4672F, 6.8172F, -1.7351F, 0.0F, -0.0698F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 70).addBox(-1.0F, 0.8451F, -2.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(0, 74).addBox(-1.0F, 0.0433F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8207F, -3.599F, 6.9706F, -0.0843F, 0.2233F, -0.0965F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(60, 24).addBox(-0.5F, -0.9268F, -0.0691F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4165F, -1.7795F, 5.756F, -1.1923F, 0.105F, -0.0373F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(18, 60).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4165F, -1.7795F, 5.756F, -1.4192F, 0.105F, -0.0373F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 57).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4165F, -1.7795F, 5.756F, -0.9829F, 0.105F, -0.0373F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(70, 46).addBox(-1.0F, 0.5556F, -3.0049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8207F, -3.599F, 6.9706F, 0.352F, 0.2233F, -0.0965F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(55, 69).addBox(-0.8719F, 6.2186F, -0.9767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, 1.6144F, 0.0959F, -0.0874F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(54, 56).addBox(-0.8719F, -0.4559F, -6.2572F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, 3.0979F, 0.0959F, -0.0874F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(69, 27).addBox(-0.8719F, -4.24F, -1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, -1.5446F, 0.0959F, -0.0874F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 98).addBox(-0.047F, -0.0675F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -2.8942F, 0.0612F, -0.0872F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(69, 87).addBox(0.153F, 1.6547F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 87).addBox(0.153F, 1.6547F, 0.6759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -2.1961F, 0.0612F, -0.0872F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(40, 86).addBox(0.153F, -1.0898F, 2.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 2.9875F, 0.0612F, -0.0872F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(86, 39).addBox(0.153F, -2.3295F, 1.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 2.5076F, 0.0612F, -0.0872F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 42).addBox(-0.047F, -2.5722F, -0.6037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 1.6436F, 0.0612F, -0.0872F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 51).addBox(-0.8719F, -0.9779F, 2.7239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, 0.1134F, 0.0959F, -0.0874F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(64, 87).addBox(0.053F, 0.9245F, 0.9523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -2.6499F, 0.0612F, -0.0872F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(89, 51).addBox(-0.047F, 0.3672F, -1.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -1.2623F, 0.0612F, -0.0872F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(19, 74).addBox(-0.9F, -0.1084F, 0.124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7457F, -3.4672F, 6.8172F, -0.1468F, 0.0F, -0.0698F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(30, 85).addBox(0.3043F, 1.8701F, -0.2796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -1.8586F, 0.0712F, -0.0944F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(35, 88).addBox(0.3043F, 0.9279F, 1.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(88, 17).addBox(0.3043F, 1.1029F, 1.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, -2.644F, 0.0712F, -0.0944F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(86, 86).addBox(0.3043F, -0.4376F, 1.5873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 2.8538F, 0.0712F, -0.0944F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(90, 14).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3518F, -2.3726F, 5.8045F, -2.9205F, 0.2233F, -0.0965F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(90, 11).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1867F, -2.5068F, 5.1377F, -1.786F, 0.2233F, -0.0965F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(53, 90).addBox(-0.5F, -0.125F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(90, 29).addBox(-0.5F, -0.125F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5596F, -3.246F, 7.6022F, -0.6725F, 0.0356F, -0.0557F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(90, 23).addBox(-0.575F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 36).addBox(-0.575F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 20).addBox(-0.575F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6593F, -2.5446F, 7.1938F, -1.7807F, 0.0356F, -0.0557F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, -0.225F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1787F, -3.3827F, 5.4744F, -1.2188F, 0.2233F, -0.0965F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(90, 8).addBox(-0.975F, 0.0183F, -1.7131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(90, 5).addBox(-0.975F, 0.0183F, -1.513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9957F, -3.524F, 6.9706F, -0.0843F, 0.2233F, -0.0965F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(24, 65).addBox(-0.8719F, -2.2782F, 5.3539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, -0.0437F, 0.0959F, -0.0874F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(81, 86).addBox(-0.8719F, -5.5321F, -1.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, -1.5272F, 0.0959F, -0.0874F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 48).addBox(-0.8719F, 0.4011F, -4.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, -3.0107F, 0.0959F, -0.0874F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(43, 99).addBox(-0.8719F, 2.7074F, 0.3045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, 1.7279F, 0.0959F, -0.0874F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 87).addBox(-0.047F, -1.5768F, -0.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 0.2474F, 0.0612F, -0.0872F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 57).addBox(-0.047F, -1.102F, -2.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 0.291F, 0.0612F, -0.0872F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(85, 23).addBox(-0.047F, -1.5481F, -1.5924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 0.771F, 0.0612F, -0.0872F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(66, 99).addBox(-0.047F, -0.8527F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9327F, -1.674F, -0.0056F, 1.2073F, 0.0612F, -0.0872F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(89, 45).addBox(-0.8719F, -0.8205F, 2.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3327F, -1.674F, -2.4056F, -0.1484F, 0.0959F, -0.0874F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7384F, 1.8192F, -9.1433F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-1.0748F, -2.8288F, -2.1738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 1.2399F, -0.0641F, 0.1577F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(99, 44).mirror().addBox(-0.9248F, -1.8652F, -0.1299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 2.2871F, -0.0641F, 0.1577F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(61, 99).mirror().addBox(-0.2431F, 5.511F, -2.3628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 66).mirror().addBox(-0.2431F, 4.711F, -2.3128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2828F, -1.674F, -2.4056F, 1.7418F, -0.0812F, 0.158F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(33, 77).mirror().addBox(-0.2431F, 3.9864F, -1.8962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 77).mirror().addBox(-0.2431F, 3.1864F, -1.7962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2828F, -1.674F, -2.4056F, 1.672F, -0.0812F, 0.158F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.0989F, 2.3218F, -1.679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1577F, -1.674F, -2.4056F, 1.6707F, -0.0986F, 0.1581F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-0.9248F, -0.806F, -1.2406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7577F, -1.674F, -0.0056F, 1.6762F, -0.0641F, 0.1577F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-1.0748F, -2.606F, -1.3406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 1.6762F, -0.0641F, 0.1577F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(-0.5F, -0.65F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6519F, -1.9417F, 8.9641F, 1.4501F, 0.0F, 0.0698F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(66, 93).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6519F, -1.9417F, 8.9641F, 2.4101F, 0.0F, 0.0698F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(61, 93).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6519F, -1.9417F, 8.9641F, -3.0005F, 0.0F, 0.0698F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-0.3F, -3.8499F, 0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7457F, -3.4672F, 6.8172F, -1.9096F, 0.0F, 0.0698F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-0.1F, -2.1807F, 0.7348F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7457F, -3.4672F, 6.8172F, -1.7351F, 0.0F, 0.0698F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(0.0F, 0.8451F, -2.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 74).mirror().addBox(0.0F, 0.0433F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8207F, -3.599F, 6.9706F, -0.0843F, -0.2233F, 0.0965F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(60, 24).mirror().addBox(-0.5F, -0.9268F, -0.0691F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4165F, -1.7795F, 5.756F, -1.1923F, -0.105F, 0.0373F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4165F, -1.7795F, 5.756F, -1.4192F, -0.105F, 0.0373F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4165F, -1.7795F, 5.756F, -0.9829F, -0.105F, 0.0373F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(0.0F, 0.5556F, -3.0049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8207F, -3.599F, 6.9706F, 0.352F, -0.2233F, 0.0965F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-0.1281F, 6.2186F, -0.9767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, 1.6144F, -0.0959F, 0.0874F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(54, 56).mirror().addBox(-0.1281F, -0.4559F, -6.2572F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, 3.0979F, -0.0959F, 0.0874F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-0.1281F, -4.24F, -1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, -1.5446F, -0.0959F, 0.0874F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(96, 98).mirror().addBox(-0.953F, -0.0675F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -2.8942F, -0.0612F, 0.0872F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(69, 87).mirror().addBox(-1.153F, 1.6547F, 0.7759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 87).mirror().addBox(-1.153F, 1.6547F, 0.6759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -2.1961F, -0.0612F, 0.0872F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-1.153F, -1.0898F, 2.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 2.9875F, -0.0612F, 0.0872F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-1.153F, -2.3295F, 1.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 2.5076F, -0.0612F, 0.0872F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 42).mirror().addBox(-0.953F, -2.5722F, -0.6037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 1.6436F, -0.0612F, 0.0872F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.1281F, -0.9779F, 2.7239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, 0.1134F, -0.0959F, 0.0874F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(64, 87).mirror().addBox(-1.053F, 0.9245F, 0.9523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -2.6499F, -0.0612F, 0.0872F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(89, 51).mirror().addBox(-0.953F, 0.3672F, -1.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -1.2623F, -0.0612F, 0.0872F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.1F, -0.1084F, 0.124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7457F, -3.4672F, 6.8172F, -0.1468F, 0.0F, 0.0698F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-1.3043F, 1.8701F, -0.2796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -1.8586F, -0.0712F, 0.0944F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-1.3043F, 0.9279F, 1.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(88, 17).mirror().addBox(-1.3043F, 1.1029F, 1.1318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, -2.644F, -0.0712F, 0.0944F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-1.3043F, -0.4376F, 1.5873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 2.8538F, -0.0712F, 0.0944F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3518F, -2.3726F, 5.8045F, -2.9205F, -0.2233F, 0.0965F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1867F, -2.5068F, 5.1377F, -1.786F, -0.2233F, 0.0965F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(53, 90).mirror().addBox(-0.5F, -0.125F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(90, 29).mirror().addBox(-0.5F, -0.125F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5596F, -3.246F, 7.6022F, -0.6725F, -0.0356F, 0.0557F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(90, 23).mirror().addBox(-0.425F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 36).mirror().addBox(-0.425F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(90, 20).mirror().addBox(-0.425F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6593F, -2.5446F, 7.1938F, -1.7807F, -0.0356F, 0.0557F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.5F, -0.225F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1787F, -3.3827F, 5.4744F, -1.2188F, -0.2233F, 0.0965F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-0.025F, 0.0183F, -1.7131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(90, 5).mirror().addBox(-0.025F, 0.0183F, -1.513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9957F, -3.524F, 6.9706F, -0.0843F, -0.2233F, 0.0965F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-0.1281F, -2.2782F, 5.3539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, -0.0437F, -0.0959F, 0.0874F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(81, 86).mirror().addBox(-0.1281F, -5.5321F, -1.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, -1.5272F, -0.0959F, 0.0874F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-0.1281F, 0.4011F, -4.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, -3.0107F, -0.0959F, 0.0874F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(43, 99).mirror().addBox(-0.1281F, 2.7074F, 0.3045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, 1.7279F, -0.0959F, 0.0874F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(59, 87).mirror().addBox(-0.953F, -1.5768F, -0.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 0.2474F, -0.0612F, 0.0872F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.953F, -1.102F, -2.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 0.291F, -0.0612F, 0.0872F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-0.953F, -1.5481F, -1.5924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 0.771F, -0.0612F, 0.0872F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.953F, -0.8527F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9327F, -1.674F, -0.0056F, 1.2073F, -0.0612F, 0.0872F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-0.1281F, -0.8205F, 2.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3327F, -1.674F, -2.4056F, -0.1484F, -0.0959F, 0.0874F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0554F, 0.8931F, 0.5464F, 1.3786F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(85, 2).mirror().addBox(1.1453F, 0.7401F, 10.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 2).mirror().addBox(1.1453F, 0.7401F, 10.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.5695F, -0.046F, -0.0967F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(29, 81).mirror().addBox(-0.1475F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(29, 81).mirror().addBox(-0.1475F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -2.2025F, -0.0628F, 0.0777F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.1475F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(35, 85).mirror().addBox(-0.1475F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.4226F, -0.0628F, 0.0777F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-0.1287F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(84, 52).mirror().addBox(-0.1287F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.8177F, -0.0624F, 0.0656F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-0.1475F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(89, 57).mirror().addBox(-0.1475F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.2827F, -0.0628F, 0.0777F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.1475F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(20, 85).mirror().addBox(-0.1475F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.0664F, -0.0628F, 0.0777F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-0.1475F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 88).mirror().addBox(-0.1475F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 1.6023F, -0.0628F, 0.0777F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-0.1475F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(95, 3).mirror().addBox(-0.1475F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.9549F, -0.0628F, 0.0777F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-0.1475F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(48, 69).mirror().addBox(-0.1475F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -1.8884F, -0.0628F, 0.0777F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.1475F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(80, 3).mirror().addBox(-0.1475F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.4921F, -0.0628F, 0.0777F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.1475F, -3.5466F, -2.3782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.1475F, -3.5466F, -2.3782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.7733F, -0.0628F, 0.0777F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-0.1475F, -2.8025F, 2.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(76, 83).mirror().addBox(-0.1475F, -2.8025F, 2.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.2132F, -0.0628F, 0.0777F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-0.1497F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(76, 27).mirror().addBox(-0.1497F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.728F, -0.0653F, 0.076F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-0.1244F, -5.7985F, -0.8434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(5, 82).mirror().addBox(-0.1244F, -5.7985F, -0.8434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.8351F, -0.0692F, 0.047F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-0.1244F, -7.4975F, -0.7448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(82, 42).mirror().addBox(-0.1244F, -7.4975F, -0.7448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.8525F, -0.0692F, 0.047F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.1244F, -10.1945F, -0.6166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-0.1244F, -10.1945F, -0.6166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.87F, -0.0692F, 0.047F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(44, 82).mirror().addBox(-0.0204F, -11.2972F, -1.2208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 82).mirror().addBox(-0.0204F, -11.2972F, -1.2208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.802F, -0.0613F, 0.0399F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(8, 94).mirror().addBox(-0.0204F, -11.1275F, -3.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(8, 94).mirror().addBox(-0.0204F, -11.1275F, -3.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.6275F, -0.0613F, 0.0399F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(0.3335F, 2.7588F, -11.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(64, 74).mirror().addBox(0.3335F, 2.7588F, -11.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -1.0204F, -0.0641F, -0.0095F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(18, 94).mirror().addBox(0.3335F, 9.2222F, -6.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(18, 94).mirror().addBox(0.3335F, 9.2222F, -6.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -1.736F, -0.0641F, -0.0095F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-1.4498F, 0.1574F, 11.0711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(76, 16).mirror().addBox(-1.4498F, 0.1574F, 11.0711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.4869F, -0.1297F, 0.152F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-1.4498F, -4.2804F, 11.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(5, 86).mirror().addBox(-1.4498F, -4.2804F, 11.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.1378F, -0.1297F, 0.152F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-1.4498F, -12.1373F, -2.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(20, 91).mirror().addBox(-1.4498F, -12.1373F, -2.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.6979F, -0.1297F, 0.152F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.0204F, -0.7641F, -11.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.0204F, -0.7641F, -11.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.6466F, -0.0613F, 0.0399F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(-0.0204F, 10.0956F, -1.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(25, 91).mirror().addBox(-0.0204F, 10.0956F, -1.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -2.1738F, -0.0613F, 0.0399F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-0.1244F, -1.6494F, 8.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(69, 70).mirror().addBox(-0.1244F, -1.6494F, 8.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.3535F, -0.0692F, 0.047F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(48, 96).mirror().addBox(-0.1244F, -2.2338F, 7.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(48, 96).mirror().addBox(-0.1244F, -2.2338F, 7.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.2837F, -0.0692F, 0.047F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.1244F, -8.0119F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(30, 91).mirror().addBox(-0.1244F, -8.0119F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 0.7129F, -0.0692F, 0.047F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-0.1244F, 1.6057F, -7.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(96, 48).mirror().addBox(-0.1244F, 1.6057F, -7.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.9103F, -0.0692F, 0.047F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(-0.1244F, 1.8811F, -6.5048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(24, 70).mirror().addBox(-0.1244F, 1.8811F, -6.5048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.9539F, -0.0692F, 0.047F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.1244F, 2.0524F, -5.0065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(5, 89).mirror().addBox(-0.1244F, 2.0524F, -5.0065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -0.9888F, -0.0692F, 0.047F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.1244F, 3.4052F, 1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(7, 77).mirror().addBox(-0.1244F, 3.4052F, 1.3056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 77).mirror().addBox(-0.1244F, 3.4052F, 1.3056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 88).mirror().addBox(-0.1244F, 3.4052F, 1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, -2.5247F, -0.0692F, 0.047F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.3182F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 89).mirror().addBox(-0.3182F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 89).mirror().addBox(-0.3182F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 89).mirror().addBox(-0.3182F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.5184F, -0.0696F, 0.0591F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(23, 97).mirror().addBox(-1.4984F, 4.6167F, 10.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 97).mirror().addBox(-1.4984F, 4.6167F, 10.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.824F, -0.13F, 0.1642F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-0.0457F, -1.7762F, 10.1822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 69).mirror().addBox(-0.0457F, -1.7762F, 10.1822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.2657F, -0.0617F, 0.052F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(0.0392F, -1.08F, 9.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 57).mirror().addBox(0.0392F, -1.08F, 9.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.3528F, -0.0892F, 0.0041F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-0.3041F, -0.4675F, 8.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 72).mirror().addBox(-0.3041F, -0.4675F, 8.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.403F, -0.0691F, 0.0838F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(91, 98).mirror().addBox(-0.1694F, -0.3753F, 7.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(91, 98).mirror().addBox(-0.1694F, -0.3753F, 7.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.4034F, -0.0696F, 0.0591F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(18, 97).mirror().addBox(-0.1694F, -0.9255F, 7.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 63).mirror().addBox(-0.1694F, -1.0255F, 6.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 63).mirror().addBox(-0.1694F, -1.0255F, 6.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 97).mirror().addBox(-0.1694F, -0.9255F, 7.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.3336F, -0.0696F, 0.0591F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.0204F, -1.6318F, 9.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(20, 88).mirror().addBox(-0.0204F, -1.6318F, 9.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6389F, 0.4628F, 0.3555F, 2.3554F, -0.0613F, 0.0399F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(20, 88).addBox(-0.9796F, -1.6318F, 9.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(20, 88).addBox(-0.9796F, -1.6318F, 9.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.3554F, 0.0613F, -0.0399F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(99, 63).addBox(-0.8306F, -1.0255F, 6.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 97).addBox(-0.8306F, -0.9255F, 7.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 63).addBox(-0.8306F, -1.0255F, 6.3148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 97).addBox(-0.8306F, -0.9255F, 7.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.3336F, 0.0696F, -0.0591F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(91, 98).addBox(-0.8306F, -0.3753F, 7.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 98).addBox(-0.8306F, -0.3753F, 7.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.4034F, 0.0696F, -0.0591F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(98, 72).addBox(-0.6959F, -0.4675F, 8.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 72).addBox(-0.6959F, -0.4675F, 8.5727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.403F, 0.0691F, -0.0838F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(99, 57).addBox(-1.0392F, -1.08F, 9.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 57).addBox(-1.0392F, -1.08F, 9.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.3528F, 0.0892F, -0.0041F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(98, 69).addBox(-0.9543F, -1.7762F, 10.1822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 69).addBox(-0.9543F, -1.7762F, 10.1822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.2657F, 0.0617F, -0.052F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(23, 97).addBox(0.4984F, 4.6167F, 10.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 97).addBox(0.4984F, 4.6167F, 10.6439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.824F, 0.13F, -0.1642F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(40, 89).addBox(-0.6818F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 89).addBox(-0.6818F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 89).addBox(-0.6818F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 89).addBox(-0.6818F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.5184F, 0.0696F, -0.0591F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(7, 77).addBox(-0.8756F, 3.4052F, 1.3056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 88).addBox(-0.8756F, 3.4052F, 1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(7, 77).addBox(-0.8756F, 3.4052F, 1.3056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 88).addBox(-0.8756F, 3.4052F, 1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -2.5247F, 0.0692F, -0.047F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(5, 89).addBox(-0.8756F, 2.0524F, -5.0065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(5, 89).addBox(-0.8756F, 2.0524F, -5.0065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.9888F, 0.0692F, -0.047F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(24, 70).addBox(-0.8756F, 1.8811F, -6.5048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(24, 70).addBox(-0.8756F, 1.8811F, -6.5048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.9539F, 0.0692F, -0.047F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(96, 48).addBox(-0.8756F, 1.6057F, -7.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(96, 48).addBox(-0.8756F, 1.6057F, -7.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.9103F, 0.0692F, -0.047F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(30, 91).addBox(-0.8756F, -8.0119F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(30, 91).addBox(-0.8756F, -8.0119F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.7129F, 0.0692F, -0.047F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(48, 96).addBox(-0.8756F, -2.2338F, 7.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(48, 96).addBox(-0.8756F, -2.2338F, 7.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.2837F, 0.0692F, -0.047F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(69, 70).addBox(-0.8756F, -1.6494F, 8.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(69, 70).addBox(-0.8756F, -1.6494F, 8.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.3535F, 0.0692F, -0.047F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(25, 91).addBox(-0.9796F, 10.0956F, -1.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(25, 91).addBox(-0.9796F, 10.0956F, -1.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -2.1738F, 0.0613F, -0.0399F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 87).addBox(-0.9796F, -0.7641F, -11.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(0, 87).addBox(-0.9796F, -0.7641F, -11.8022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.6466F, 0.0613F, -0.0399F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(20, 91).addBox(0.4498F, -12.1373F, -2.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 91).addBox(0.4498F, -12.1373F, -2.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.6979F, 0.1297F, -0.152F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(5, 86).addBox(0.4498F, -4.2804F, 11.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(5, 86).addBox(0.4498F, -4.2804F, 11.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.1378F, 0.1297F, -0.152F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(76, 16).addBox(0.4498F, 0.1574F, 11.0711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(76, 16).addBox(0.4498F, 0.1574F, 11.0711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.4869F, 0.1297F, -0.152F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(18, 94).addBox(-1.3335F, 9.2222F, -6.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(18, 94).addBox(-1.3335F, 9.2222F, -6.4976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -1.736F, 0.0641F, 0.0095F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(64, 74).addBox(-1.3335F, 2.7588F, -11.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(64, 74).addBox(-1.3335F, 2.7588F, -11.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -1.0204F, 0.0641F, 0.0095F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(8, 94).addBox(-0.9796F, -11.1275F, -3.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(8, 94).addBox(-0.9796F, -11.1275F, -3.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.6275F, 0.0613F, -0.0399F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(44, 82).addBox(-0.9796F, -11.2972F, -1.2208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 82).addBox(-0.9796F, -11.2972F, -1.2208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.802F, 0.0613F, -0.0399F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 78).addBox(-0.8756F, -10.1945F, -0.6166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 78).addBox(-0.8756F, -10.1945F, -0.6166F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.87F, 0.0692F, -0.047F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(82, 42).addBox(-0.8756F, -7.4975F, -0.7448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(82, 42).addBox(-0.8756F, -7.4975F, -0.7448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.8525F, 0.0692F, -0.047F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(5, 82).addBox(-0.8756F, -5.7985F, -0.8434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(5, 82).addBox(-0.8756F, -5.7985F, -0.8434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.8351F, 0.0692F, -0.047F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(76, 27).addBox(-0.8503F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F))
				.texOffs(76, 27).addBox(-0.8503F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.728F, 0.0653F, -0.076F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(76, 83).addBox(-0.8525F, -2.8025F, 2.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(76, 83).addBox(-0.8525F, -2.8025F, 2.9268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.2132F, 0.0628F, -0.0777F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 70).addBox(-0.8525F, -3.5466F, -2.3782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 70).addBox(-0.8525F, -3.5466F, -2.3782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.7733F, 0.0628F, -0.0777F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(80, 3).addBox(-0.8525F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(80, 3).addBox(-0.8525F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.4921F, 0.0628F, -0.0777F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(48, 69).addBox(-0.8525F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 69).addBox(-0.8525F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -1.8884F, 0.0628F, -0.0777F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(95, 3).addBox(-0.8525F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(95, 3).addBox(-0.8525F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.9549F, 0.0628F, -0.0777F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(25, 88).addBox(-0.8525F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 88).addBox(-0.8525F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 1.6023F, 0.0628F, -0.0777F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(20, 85).addBox(-0.8525F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(20, 85).addBox(-0.8525F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.0664F, 0.0628F, -0.0777F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(89, 57).addBox(-0.8525F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 57).addBox(-0.8525F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -0.2827F, 0.0628F, -0.0777F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(84, 52).addBox(-0.8713F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 52).addBox(-0.8713F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 0.8177F, 0.0624F, -0.0656F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(35, 85).addBox(-0.8525F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(35, 85).addBox(-0.8525F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.4226F, 0.0628F, -0.0777F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(29, 81).addBox(-0.8525F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(29, 81).addBox(-0.8525F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, -2.2025F, 0.0628F, -0.0777F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(85, 2).addBox(-2.1453F, 0.7401F, 10.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 2).addBox(-2.1453F, 0.7401F, 10.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6389F, 0.4628F, 0.3555F, 2.5695F, 0.046F, 0.0967F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 44).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, -0.1577F, -0.0862F, 0.0137F));

		PartDefinition cube_r418 = tail.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 8).addBox(0.0F, 0.0147F, -0.0659F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.767F, 0.8431F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r419 = tail.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(18, 100).addBox(0.0F, 0.6435F, -0.0999F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4867F, 2.8578F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r420 = tail.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, -2.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 92).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 2.0037F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r421 = tail.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(79, 92).addBox(0.0F, -2.2044F, 0.0292F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 0.0037F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r422 = tail.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.9715F, -0.8701F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(-1.5015F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 38).mirror().addBox(-1.5015F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, 0.0F, 0.07F, -0.0023F));

		PartDefinition cube_r424 = tail.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(56, 38).addBox(-0.4985F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 38).addBox(-0.4985F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, 0.0F, -0.07F, 0.0023F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(43, 36).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5438F, 4.9252F, 0.1496F, -0.1295F, -0.0195F));

		PartDefinition cube_r425 = tail7.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(99, 87).addBox(0.0F, -1.8581F, 0.0912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail7.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(99, 79).addBox(0.0F, -2.1054F, 0.0608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r427 = tail7.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -0.4666F, -0.1787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5058F, 3.3969F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r428 = tail7.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(99, 75).addBox(0.0F, 0.3899F, 0.0372F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0603F, 0.2541F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r429 = tail7.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, 0.0534F, -0.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.796F, 0.7702F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r430 = tail7.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-1.5198F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, -6.0F, 0.0F, 0.0525F, -0.0023F));

		PartDefinition cube_r431 = tail7.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(56, 34).addBox(-0.4802F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.0F, 0.0F, -0.0525F, 0.0023F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 29).addBox(-0.5F, -0.9857F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0021F, 4.9907F, 0.2037F, -0.171F, -0.0351F));

		PartDefinition cube_r432 = tail2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(6, 100).addBox(0.0F, -1.2206F, -0.0527F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9857F, 4.0362F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r433 = tail2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(100, 4).addBox(0.0F, -1.5003F, -0.0085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8857F, 2.0362F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(3, 100).addBox(0.0F, -2.0092F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6857F, 0.1362F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r435 = tail2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -0.4367F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0459F, 4.6903F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r436 = tail2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(71, 99).addBox(0.0F, -0.1261F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0541F, 2.3903F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(15, 100).addBox(0.0F, -0.2837F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3217F, 0.2876F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(50, 50).addBox(-0.5F, -0.9823F, -0.0136F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9506F, 2.1166F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r439 = tail2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(72, 40).addBox(-0.5F, -0.0823F, -0.0136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2775F, 0.3703F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(49, 11).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1857F, 6.0362F, 0.124F, -0.1732F, -0.0215F));

		PartDefinition cube_r440 = tail8.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(27, 100).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 12).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7334F, 2.0524F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail8.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 91).addBox(0.0F, -1.1889F, -0.016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail8.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(14, 62).addBox(0.0F, 0.1163F, 0.0485F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2397F, 3.0541F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r443 = tail8.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(18, 57).addBox(0.0F, 0.1521F, -0.1812F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1397F, 1.0541F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r444 = tail8.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(30, 36).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5957F, 0.5978F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(39, 43).addBox(-0.4968F, -0.1985F, -0.0349F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.591F, 4.8057F, -0.1158F, -0.0599F, 0.0064F));

		PartDefinition cube_r445 = tail3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(24, 100).addBox(-0.0106F, -0.3093F, -0.0686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 2.6192F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r446 = tail3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(100, 23).addBox(-0.0106F, -0.2218F, -0.1654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 0.5192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r447 = tail3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(39, 50).addBox(-0.5F, -0.175F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0706F, 0.4642F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r448 = tail3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(21, 100).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 20).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 0.9651F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 44).addBox(-0.4968F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 4.9757F, -0.2126F, 0.1707F, -0.0366F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 62).addBox(-0.4968F, -0.293F, -0.1999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3359F, 5.1416F, -0.1772F, 0.1719F, -0.0306F));

		return LayerDefinition.create(meshdefinition, 105, 105);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}