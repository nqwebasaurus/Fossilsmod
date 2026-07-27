package fossils.fossils.client.blockentity.model.yacarerani;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YacareraniFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
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
	private final ModelPart tail6;
	private final ModelPart tail9;

	public YacareraniFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.head = this.neck4.getChild("head");
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
		this.tail6 = this.tail5.getChild("tail6");
		this.tail9 = this.tail6.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.8111F, 7.7618F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 41).addBox(0.0F, -0.9438F, -0.0741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2508F, -2.9262F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 98).addBox(0.0F, -1.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 0.8989F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 98).addBox(0.0F, -1.1938F, 0.0259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0522F, -1.0366F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(-2.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 7).addBox(0.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(17, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.886F, -0.1037F, 0.0071F, 0.005F, -0.6108F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.886F, -0.1037F, 0.0071F, -0.005F, 0.6108F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.0F, -0.15F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8612F, -2.9449F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9149F, 2.043F, 1.3976F, 0.1744F, -0.0076F, 0.0866F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 11).addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 63).addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(91, 90).addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(91, 87).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 23).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 89).addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(91, 61).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 97).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 81).addBox(-0.55F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.747F, 0.9858F, 1.1894F, 0.0457F, 0.1134F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 91).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 81).addBox(-0.5F, -2.825F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0188F, -0.5466F, 2.3057F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 91).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0188F, -1.0502F, 2.7919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 63).addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, 0.1222F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(25, 97).addBox(-0.8326F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(42, 80).addBox(-0.8326F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, 2.6621F, -0.0674F, 0.4759F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 91).addBox(-0.8326F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -2.2685F, -0.0674F, 0.4759F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(74, 67).addBox(-0.8326F, 0.4843F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -0.9159F, -0.0674F, 0.4759F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 91).addBox(-0.8576F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 63).addBox(-0.8576F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -1.1777F, -0.0674F, 0.4759F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(84, 58).addBox(-0.863F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(74, 48).addBox(-0.863F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -1.6161F, -0.0932F, 0.482F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(27, 91).addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(22, 91).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.3322F, 2.1887F, -2.6078F, -0.486F, 0.0046F, 0.445F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(17, 91).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-1.4362F, 2.3999F, -3.267F, 0.3431F, 0.0046F, 0.445F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 44).addBox(-0.5F, -0.85F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9628F, 1.4187F, -2.1644F, 0.7794F, 0.0046F, 0.445F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 91).addBox(-0.8967F, -0.7442F, -1.4139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.092F, 0.1316F, -1.8807F, 1.4164F, 0.0046F, 0.445F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 40).addBox(-0.8967F, -0.7692F, -1.6389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.092F, 0.1316F, -1.8807F, 1.3466F, 0.0046F, 0.445F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(84, 54).addBox(-1.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, -0.5871F, -0.0417F, 0.1149F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(71, 90).addBox(-1.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 0.3728F, -0.0417F, 0.1149F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 90).addBox(-1.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 1.3328F, -0.0417F, 0.1149F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(61, 90).addBox(-1.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 1.263F, -0.0417F, 0.1149F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 73).addBox(-0.9F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9149F, 2.043F, 1.3976F, 0.1744F, 0.0076F, -0.0866F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(91, 90).mirror().addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(81, 23).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 89).mirror().addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(91, 61).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(14, 81).mirror().addBox(-0.45F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.747F, 0.9858F, 1.1894F, -0.0457F, -0.1134F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-0.5F, -2.825F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -0.5466F, 2.3057F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(49, 91).mirror().addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.0502F, 2.7919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 63).mirror().addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, -0.1222F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(-0.1674F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(42, 80).mirror().addBox(-0.1674F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, 2.6621F, 0.0674F, -0.4759F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(44, 91).mirror().addBox(-0.1674F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -2.2685F, 0.0674F, -0.4759F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(74, 67).mirror().addBox(-0.1674F, 0.4843F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -0.9159F, 0.0674F, -0.4759F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(39, 91).mirror().addBox(-0.1424F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 63).mirror().addBox(-0.1424F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -1.1777F, 0.0674F, -0.4759F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.137F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(74, 48).mirror().addBox(-0.137F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -1.6161F, 0.0932F, -0.482F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(27, 91).mirror().addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(22, 91).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.3322F, 2.1887F, -2.6078F, -0.486F, -0.0046F, -0.445F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(1.4362F, 2.3999F, -3.267F, 0.3431F, -0.0046F, -0.445F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-0.5F, -0.85F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.9628F, 1.4187F, -2.1644F, 0.7794F, -0.0046F, -0.445F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.1033F, -0.7442F, -1.4139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.1316F, -1.8807F, 1.4164F, -0.0046F, -0.445F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-0.1033F, -0.7692F, -1.6389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.1316F, -1.8807F, 1.3466F, -0.0046F, -0.445F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(84, 54).mirror().addBox(0.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, -0.5871F, 0.0417F, -0.1149F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(0.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 0.3728F, 0.0417F, -0.1149F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(0.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 1.3328F, 0.0417F, -0.1149F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(61, 90).mirror().addBox(0.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 1.263F, 0.0417F, -0.1149F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.1F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.7644F, 0.9725F, -0.6614F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(85, 0).addBox(0.5F, -0.375F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3638F, 0.014F, 0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(93, 9).addBox(0.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(88, 68).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(76, 32).addBox(-0.5F, -4.0F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 4.5907F, 0.5135F, 0.192F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(84, 83).addBox(0.5F, -0.0186F, -0.8635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(86, 92).addBox(-0.5F, -0.8F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(81, 92).addBox(-0.5F, -0.2F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 6.89F, 2.523F, -1.3788F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(96, 88).addBox(-0.5F, -0.2958F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 6.7242F, 2.3279F, -1.1606F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg2.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(84, 79).addBox(-0.5F, -0.0454F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 4.6064F, 0.4771F, 0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(96, 85).addBox(-0.5F, 1.492F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.6064F, 0.4771F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 7.2965F, 2.6286F, 0.9554F, 0.0F, 0.0F));

		PartDefinition leg6_r1 = leg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(89, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.4535F, 7.1529F, 0.2504F, 1.5708F, 0.7505F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(59, 81).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.4535F, 4.6421F, 0.5165F, 1.5708F, 1.5359F, 1.5708F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(54, 81).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 4.6421F, 0.5165F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition leg6_r2 = leg2.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(76, 92).addBox(-0.75F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(92, 71).addBox(-0.75F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(32, 92).addBox(-0.75F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 1.199F, -0.2867F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(76, 26).addBox(-0.725F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.4535F, 1.1968F, -0.2618F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition leg8_r1 = leg2.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(84, 75).addBox(-0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, 5.5893F, -0.2671F, 1.5708F, -1.405F, 1.5708F));

		PartDefinition leg7_r1 = leg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(51, 63).addBox(-0.1F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.6465F, 0.5961F, -0.5288F, -1.5708F, -1.5184F, -1.5708F));

		PartDefinition leg6_r3 = leg2.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(92, 20).addBox(-0.9F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(92, 17).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, -0.0175F, 0.5073F, -1.5708F, -0.192F, -1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(92, 14).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6465F, 0.5846F, 0.514F, -1.5708F, 0.8552F, -1.5708F));

		PartDefinition leg6_r4 = leg2.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(10, 92).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(92, 6).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6465F, 1.7476F, -0.0454F, -1.5708F, 1.2392F, -1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0487F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.4856F, 0.473F, -0.1609F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(34, 7).addBox(-2.0487F, -0.9978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.7644F, 0.9725F, -0.3123F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg3.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-1.5F, -0.375F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3638F, 0.014F, 0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg3.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-1.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg3.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(-0.5F, -4.0F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.5907F, 0.5135F, 0.192F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(39, 27).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg3.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-1.5F, -0.0186F, -0.8635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg7_r3 = upperleg3.addOrReplaceChild("upperleg7_r3", CubeListBuilder.create().texOffs(86, 92).mirror().addBox(-0.5F, -0.8F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(81, 92).mirror().addBox(-0.5F, -0.2F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.89F, 2.523F, -1.3788F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg3.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(96, 88).mirror().addBox(-0.5F, -0.2958F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.7242F, 2.3279F, -1.1606F, 0.0F, 0.0F));

		PartDefinition upperleg4_r6 = upperleg3.addOrReplaceChild("upperleg4_r6", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(-0.5F, -0.0454F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6064F, 0.4771F, 0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperleg3.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(96, 85).mirror().addBox(-0.5F, 1.492F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6064F, 0.4771F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 7.2965F, 2.6286F, 1.3044F, 0.0F, 0.0F));

		PartDefinition leg7_r2 = leg3.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 7.1529F, 0.2504F, 1.5708F, -0.7505F, -1.5708F));

		PartDefinition leg6_r5 = leg3.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 4.6421F, 0.5165F, 1.5708F, -1.5359F, -1.5708F));

		PartDefinition leg5_r2 = leg3.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(54, 81).mirror().addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 4.6421F, 0.5165F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition leg7_r3 = leg3.addOrReplaceChild("leg7_r3", CubeListBuilder.create().texOffs(76, 92).mirror().addBox(-0.25F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(92, 71).mirror().addBox(-0.25F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(32, 92).mirror().addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 1.199F, -0.2867F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-0.275F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 1.1968F, -0.2618F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leg9_r1 = leg3.addOrReplaceChild("leg9_r1", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-0.9F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6465F, 5.5893F, -0.2671F, 1.5708F, 1.405F, -1.5708F));

		PartDefinition leg8_r2 = leg3.addOrReplaceChild("leg8_r2", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.9F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.6465F, 0.5961F, -0.5288F, -1.5708F, 1.5184F, 1.5708F));

		PartDefinition leg7_r4 = leg3.addOrReplaceChild("leg7_r4", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-0.1F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(92, 17).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6465F, -0.0175F, 0.5073F, -1.5708F, 0.192F, 1.5708F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.6465F, 0.5846F, 0.514F, -1.5708F, -0.8552F, 1.5708F));

		PartDefinition leg7_r5 = leg3.addOrReplaceChild("leg7_r5", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(92, 6).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.6465F, 1.7476F, -0.0454F, -1.5708F, -1.2392F, 1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.9513F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.4856F, 0.473F, -0.2482F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition toes3_r1 = toes3.addOrReplaceChild("toes3_r1", CubeListBuilder.create().texOffs(34, 7).mirror().addBox(-7.3513F, 0.4022F, 4.8364F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.4F, -5.65F, -5.575F, -0.6109F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 37).addBox(-0.5F, -0.0001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(19, 0).addBox(-1.0F, -1.6835F, -4.9326F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1997F, -2.9826F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 99).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0001F, -2.0122F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 98).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, -4.0122F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.0F, 0.0236F, -0.0523F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7071F, -4.8803F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(99, 58).mirror().addBox(-2.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.2342F, 0.3926F, -1.0087F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-1.6132F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.3542F, 0.2902F, -0.6541F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(12, 87).mirror().addBox(-1.6143F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -1.5122F, 0.27F, 0.105F, -0.71F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(12, 87).addBox(-0.3857F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -1.5122F, 0.27F, -0.105F, 0.71F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 87).addBox(-0.3868F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.3542F, -0.2902F, 0.6541F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 58).addBox(1.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.2342F, -0.3926F, 1.0087F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, 0.0236F, -0.0523F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7071F, -4.8803F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0F, -0.2739F, 1.9255F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7039F, -5.7795F, 0.2967F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 12).addBox(-0.5F, 0.0F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9192F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.5172F, 0.301F, -0.582F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.3911F, 0.4557F, -0.9194F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-5.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.1204F, 0.5805F, -1.4552F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-4.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.1123F, 0.5198F, -1.4594F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 27).mirror().addBox(-3.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.3508F, 0.4068F, -0.9363F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(-1.6054F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.4643F, 0.267F, -0.5968F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.4166F, 0.2592F, -0.6403F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.3066F, 0.384F, -0.9843F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 63).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6993F, -1.2263F, -0.0214F, -0.015F, -0.6107F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7386F, -2.7258F, 0.0931F, 0.065F, -0.6078F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(27, 68).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7386F, -2.7258F, 0.0931F, -0.065F, 0.6078F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(58, 26).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7386F, -2.7258F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 63).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.6993F, -1.2263F, -0.0214F, 0.015F, 0.6107F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(24, 58).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2257F, -2.239F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 100).addBox(0.0F, -1.125F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 96).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1047F, -1.1018F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 99).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.1F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(85, 19).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.3066F, -0.384F, 0.9843F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(85, 17).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.4166F, -0.2592F, 0.6403F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(17, 85).addBox(-0.3945F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.4643F, -0.267F, 0.5968F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(32, 27).addBox(1.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.3508F, -0.4068F, 0.9363F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 19).addBox(3.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.1123F, -0.5198F, 1.4594F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 15).addBox(3.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.1204F, -0.5805F, 1.4552F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(34, 87).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.3911F, -0.4557F, 0.9194F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 85).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.5172F, -0.301F, 0.582F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, -0.7805F, -2.7982F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.5491F, -1.6709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(36, 68).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(-5.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.0811F, 0.4275F, -1.5053F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.3735F, 0.2277F, -0.6506F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(31, 85).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.2759F, 0.3402F, -0.9952F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8404F, -1.45F, 0.0353F, 0.0256F, -0.6279F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 12).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.8404F, -1.45F, 0.0353F, -0.0256F, 0.6279F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(49, 7).addBox(-1.0F, -0.525F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3246F, -1.2273F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 98).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 58).addBox(-1.5F, -0.889F, -4.7874F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.6714F, 2.0946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(31, 85).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.2759F, -0.3402F, 0.9952F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(24, 85).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.3735F, -0.2277F, 0.6506F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 21).addBox(3.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.0811F, -0.4275F, 1.5053F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0516F, -0.2083F, -2.9595F, 0.1092F, -0.0174F, -0.0073F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-1.6819F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.5449F, 0.2688F, -0.6852F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(-4.1784F, -1.9179F, -0.6508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.1703F, 0.5797F, -1.5388F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-3.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.4306F, 0.4339F, -1.0134F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-1.59F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.4634F, 0.2323F, -0.6178F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(34, 19).mirror().addBox(-3.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.3624F, 0.3737F, -0.9526F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(-5.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.1417F, 0.4964F, -1.4659F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(78, 75).mirror().addBox(-3.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.0527F, 0.6412F, -1.5154F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 94).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.5306F, 0.3823F, -0.5988F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.3735F, 0.5365F, -0.9491F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 68).mirror().addBox(0.8677F, 1.107F, 0.3794F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.7758F, -0.9955F, -0.2493F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.8243F, 1.5627F, 1.1789F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.6544F, -0.7653F, -0.3302F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(0.1034F, 1.6646F, 1.7046F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.5282F, -0.5693F, -0.3362F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0535F, -1.3114F, -3.4819F, 0.0219F, 0.0144F, -0.6092F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.055F, -1.4577F, -1.0759F, 0.0906F, 0.0684F, -0.6499F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(14, 77).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9518F, -1.4577F, -1.0759F, 0.0906F, -0.0684F, 0.6499F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0044F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0472F, -0.3495F, -1.9555F, 0.1134F, 0.0007F, -0.0015F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(9, 64).addBox(0.0F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9503F, -1.3114F, -3.4819F, 0.0219F, -0.0144F, 0.6092F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 58).addBox(-1.0016F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.05F, -0.7708F, -4.9676F, 0.0262F, 0.0007F, -0.0015F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 37).addBox(-0.5457F, 0.1395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(99, 100).addBox(0.0F, -0.8413F, -0.0199F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(99, 45).addBox(0.5F, -1.6328F, -0.037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5059F, 0.758F, -5.0253F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 64).addBox(0.0F, -1.2505F, 0.0138F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4035F, -0.8675F, -0.1239F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(54, 34).addBox(-1.1034F, 1.6646F, 1.7046F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.5282F, 0.5693F, 0.3362F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 59).addBox(-1.8243F, 1.5627F, 1.1789F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.6544F, 0.7653F, 0.3302F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(65, 68).addBox(-1.8677F, 1.107F, 0.3794F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.7758F, 0.9955F, 0.2493F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 86).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.3735F, -0.5365F, 0.9491F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(96, 94).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.5306F, -0.3823F, 0.5988F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 75).addBox(2.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.0527F, -0.6412F, 1.5154F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(47, 86).addBox(3.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.1417F, -0.4964F, 1.4659F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(34, 19).addBox(1.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.3624F, -0.3737F, 0.9526F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 86).addBox(-0.41F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.4634F, -0.2323F, 0.6178F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(85, 73).addBox(1.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.4306F, -0.4339F, 1.0134F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 38).addBox(3.1784F, -1.9179F, -0.6508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.1703F, -0.5797F, 1.5388F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(85, 71).addBox(-0.3181F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.5449F, -0.2688F, 0.6852F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5484F, 4.082F, -4.8672F, 0.3489F, 0.0079F, -0.0082F));

		PartDefinition cube_r149 = UpperArmL.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(93, 41).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.7939F, 0.7823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r150 = UpperArmL.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.0779F, -0.1765F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r151 = UpperArmL.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 35).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.8316F, 0.6849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r152 = UpperArmL.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 32).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r153 = UpperArmL.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 29).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r154 = UpperArmL.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4973F, 0.1903F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r155 = UpperArmL.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(42, 76).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r156 = UpperArmL.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 23).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r157 = UpperArmL.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 81).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create().texOffs(45, 68).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 6.2359F, 0.8519F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r158 = LowerArmL.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 44).addBox(-1.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(61, 86).addBox(-1.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 2.2026F, -0.7749F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r159 = LowerArmL.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(79, 85).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r160 = LowerArmL.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(81, 63).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(54, 40).addBox(-3.0F, -0.9F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.0971F, -0.3152F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(32, 21).addBox(-3.0F, -1.0F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6516F, 4.082F, -4.8672F, 0.6544F, -0.0079F, 0.0082F));

		PartDefinition cube_r161 = UpperArmL2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.7939F, 0.7823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r162 = UpperArmL2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.0779F, -0.1765F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r163 = UpperArmL2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8316F, 0.6849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r164 = UpperArmL2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 32).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r165 = UpperArmL2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 29).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r166 = UpperArmL2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4973F, 0.1903F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r167 = UpperArmL2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r168 = UpperArmL2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r169 = UpperArmL2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(-0.5F, -1.0F, 0.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create().texOffs(45, 68).mirror().addBox(1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.2359F, 0.8519F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r170 = LowerArmL2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(0.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(61, 86).mirror().addBox(0.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.2026F, -0.7749F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r171 = LowerArmL2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r172 = LowerArmL2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(0.0F, -0.9F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.0971F, -0.3152F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r173 = HandL4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(32, 21).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.45F, -3.05F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7386F, 2.373F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 40).addBox(-0.4767F, -0.8811F, -0.5906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.8662F, 0.1206F, 1.1895F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 86).addBox(-0.4767F, -0.3351F, -0.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.4298F, 0.1206F, 1.1895F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(64, 81).addBox(-0.4767F, -1.3362F, -1.3082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.7353F, 0.1206F, 1.1895F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(35, 77).addBox(-0.4428F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 1.1147F, 0.0843F, -0.2571F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 77).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.1789F, -2.7445F, 1.0882F, -2.1752F, 0.0843F, -0.2571F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1956F, -1.4046F, 1.3418F, -0.4735F, 0.0843F, -0.2571F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(64, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2587F, -2.7168F, 0.0917F, -3.1351F, 0.0843F, -0.2571F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(21, 77).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2698F, -2.4398F, -0.8691F, 1.8391F, 0.0843F, -0.2571F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(59, 93).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.1854F, -1.85F, -1.6784F, 0.5301F, 0.0843F, -0.2571F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(66, 86).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0765F, -1.0935F, -0.9579F, 0.3555F, 0.0843F, -0.2571F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(86, 62).addBox(-0.4653F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 0.0501F, 0.0843F, -0.2571F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 10).addBox(-0.4653F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 2.2056F, 0.0843F, -0.2571F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8418F, 2.373F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-0.5233F, -0.8811F, -0.5906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.8662F, -0.1206F, -1.1895F));

		PartDefinition cube_r187 = bone4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 86).mirror().addBox(-0.5233F, -0.3351F, -0.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.4298F, -0.1206F, -1.1895F));

		PartDefinition cube_r188 = bone4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-0.5233F, -1.3362F, -1.3082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.7353F, -0.1206F, -1.1895F));

		PartDefinition cube_r189 = bone4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5572F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 1.1147F, -0.0843F, 0.2571F));

		PartDefinition cube_r190 = bone4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.1789F, -2.7445F, 1.0882F, -2.1752F, -0.0843F, 0.2571F));

		PartDefinition cube_r191 = bone4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1956F, -1.4046F, 1.3418F, -0.4735F, -0.0843F, 0.2571F));

		PartDefinition cube_r192 = bone4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 93).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2587F, -2.7168F, 0.0917F, -3.1351F, -0.0843F, 0.2571F));

		PartDefinition cube_r193 = bone4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.2698F, -2.4398F, -0.8691F, 1.8391F, -0.0843F, 0.2571F));

		PartDefinition cube_r194 = bone4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.1854F, -1.85F, -1.6784F, 0.5301F, -0.0843F, 0.2571F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 86).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0765F, -1.0935F, -0.9579F, 0.3555F, -0.0843F, 0.2571F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.5347F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 0.0501F, -0.0843F, 0.2571F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-0.5347F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 2.2056F, -0.0843F, 0.2571F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r198 = neck3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 98).addBox(0.5F, -1.4805F, -0.1119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6131F, -2.1009F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r199 = neck3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.6465F, 0.7906F, -0.779F));

		PartDefinition cube_r200 = neck3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.8516F, 0.5503F, -0.453F));

		PartDefinition cube_r201 = neck3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0445F, -2.6452F, -1.7224F, 0.0756F, 0.0436F, -0.522F));

		PartDefinition cube_r202 = neck3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(28, 73).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9532F, -2.6452F, -1.7224F, 0.0756F, -0.0436F, 0.522F));

		PartDefinition cube_r203 = neck3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 18).addBox(-0.9989F, 0.4F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0468F, -3.1047F, -1.0599F, 0.0872F, 0.0F, 0.0F));

		PartDefinition cube_r204 = neck3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(97, 56).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.8516F, -0.5503F, 0.453F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(86, 66).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.6465F, -0.7906F, 0.779F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 45).addBox(-0.0457F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.1752F, 0.0868F, -0.0162F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 33).addBox(0.5F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(55, 99).addBox(-0.9709F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.5893F, 0.8912F, -0.8768F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-1.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.1185F, 1.0167F, -1.4477F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0389F, -2.5624F, -1.1679F, 0.2434F, 0.1382F, -0.5067F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(63, 77).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9476F, -2.5624F, -1.1679F, 0.2434F, -0.1382F, 0.5067F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(69, 22).addBox(-0.9932F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -2.1093F, -0.934F, 0.2792F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(99, 3).addBox(0.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.1185F, -1.0167F, 1.4477F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(98, 68).addBox(-0.0291F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.5893F, -0.8912F, 0.8768F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(81, 27).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -2.0022F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r216 = neck4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 49).addBox(0.5F, -1.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-1.9709F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.1404F, -0.6895F, 0.4936F, 1.0085F, -1.0199F));

		PartDefinition cube_r218 = neck4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0457F, -2.0244F, -1.3038F, 0.2511F, 0.1425F, -0.5056F));

		PartDefinition cube_r219 = neck4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9117F, -1.545F, -1.1618F, 0.7804F, 1.2232F, 0.2338F));

		PartDefinition cube_r220 = neck4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(94, 79).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8204F, -1.545F, -1.1618F, 0.7804F, -1.2232F, -0.2338F));

		PartDefinition cube_r221 = neck4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(94, 58).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9543F, -2.0244F, -1.3038F, 0.2511F, -0.1425F, 0.5056F));

		PartDefinition cube_r222 = neck4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(9, 69).addBox(-0.9932F, -0.475F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -1.5831F, -1.1209F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 4).addBox(-0.0291F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1404F, -0.6895F, 0.4936F, -1.0085F, 1.0199F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(49, 77).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0019F, -0.0746F, -1.3769F, 0.4872F, 0.3551F, 0.4559F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(77, 52).addBox(-0.5F, -0.625F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0553F, 0.2949F, -10.2497F, -0.5149F, 0.0015F, -0.0027F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(88, 34).addBox(-0.5F, -0.3745F, -2.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0554F, -1.0671F, -7.8429F, 0.637F, 0.0015F, -0.0027F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(50, 97).addBox(-0.4923F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.83F, -4.8687F, -2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(45, 97).addBox(-0.4923F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -2.067F, -4.1831F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(15, 94).addBox(-0.4923F, -2.0262F, -0.906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -1.0671F, -7.8429F, 2.1205F, 0.0015F, -0.0027F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(97, 73).addBox(-0.4923F, -0.9778F, 0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -1.0671F, -7.8429F, -2.6617F, 0.0015F, -0.0027F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(98, 9).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 98).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.057F, -0.9131F, -9.1848F, -2.749F, 0.0053F, -0.0068F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(97, 76).addBox(-0.5F, -0.2778F, -0.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0543F, -0.3547F, -8.4281F, -3.0544F, 0.0015F, -0.0027F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 31).addBox(-0.5F, -0.8778F, -1.1698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0554F, -1.0671F, -7.8429F, -2.9671F, 0.0015F, -0.0027F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 94).addBox(-0.4923F, 0.9476F, -0.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -1.5671F, -5.9929F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(94, 3).addBox(-0.4923F, -0.0099F, -1.0002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -1.5671F, -5.9929F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(91, 93).addBox(-0.4923F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.5934F, -5.8134F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(18, 68).addBox(-0.9922F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -1.9674F, -2.1845F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(93, 67).addBox(-0.5476F, 0.1289F, -1.6783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0006F, -1.4949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(69, 26).addBox(-0.5554F, -0.4755F, -3.3027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.0006F, -1.4949F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5057F, -0.2006F, -0.9196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0005F, -1.9781F, -1.3974F, 1.1257F, 0.0036F, -0.0061F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(97, 53).addBox(-0.5F, -0.092F, -0.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.0006F, -1.4949F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(28, 81).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0006F, -1.4949F, 0.0087F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7113F, -1.5301F, -3.4114F, 0.0644F, 0.1207F, 0.0742F));

		PartDefinition cube_r243 = crestl.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 88).addBox(-1.1333F, -0.8351F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 93).addBox(-1.1333F, -0.4351F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1761F, 0.8451F, 2.9051F, 1.173F, 0.7515F, -0.2637F));

		PartDefinition cube_r244 = crestl.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(90, 0).addBox(-0.6677F, 0.0933F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 89).addBox(-0.6677F, -0.3067F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1761F, 0.8451F, 2.9051F, 1.2836F, -0.0354F, 0.0261F));

		PartDefinition cube_r245 = crestl.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(18, 64).addBox(-0.775F, -1.9533F, -0.3681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.1761F, 0.8451F, 2.9051F, 0.784F, 1.1596F, -0.7277F));

		PartDefinition cube_r246 = crestl.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 8).addBox(-2.6683F, -0.6406F, -0.353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1761F, 0.7701F, 2.6051F, -0.2848F, -0.0174F, 0.0127F));

		PartDefinition cube_r247 = crestl.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(68, 60).addBox(-2.6625F, -0.7747F, -0.3156F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1761F, 0.7701F, 2.2051F, -0.3744F, -0.0259F, 0.0355F));

		PartDefinition cube_r248 = crestl.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(71, 5).addBox(-2.5706F, -0.4189F, 1.6828F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1761F, -0.5299F, 0.2051F, -0.4267F, -0.0207F, 0.0388F));

		PartDefinition cube_r249 = crestl.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(58, 31).addBox(-2.5706F, -2.2856F, -0.2456F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1761F, -0.5299F, 0.2051F, -1.9103F, -0.0207F, 0.0388F));

		PartDefinition cube_r250 = crestl.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(45, 34).addBox(-2.5706F, -0.8234F, -1.8817F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1761F, -0.5299F, 0.2051F, 2.8458F, -0.0207F, 0.0388F));

		PartDefinition cube_r251 = crestl.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(67, 36).addBox(-0.7914F, -0.3033F, -1.6975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.8581F, -0.3657F, -1.2987F, 0.2506F, 0.0822F, 0.0205F));

		PartDefinition cube_r252 = crestl.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 82).addBox(-0.3914F, -0.2783F, -0.6975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.2769F, -0.4185F, 0.1061F, 1.3413F, -0.0486F, 0.0163F));

		PartDefinition cube_r253 = crestl.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(79, 81).addBox(-0.3914F, -0.6533F, -0.6975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-2.2277F, -0.3846F, -0.9172F, 1.6031F, -0.0486F, 0.0163F));

		PartDefinition cube_r254 = crestl.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(35, 73).addBox(-0.3914F, -1.6533F, -0.6975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.1449F, -0.4153F, 0.0789F, 1.6032F, 0.0822F, 0.0205F));

		PartDefinition cube_r255 = crestl.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(56, 68).addBox(-2.6914F, -0.5283F, -0.9225F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1761F, -0.5299F, 0.2051F, 1.3589F, 0.0822F, 0.0205F));

		PartDefinition cube_r256 = crestl.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(60, 22).addBox(-1.6934F, -0.3329F, -0.2983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1637F, -0.3944F, -0.0675F, -0.2595F, 0.0489F, -0.0417F));

		PartDefinition cube_r257 = crestl.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(81, 47).addBox(-0.9093F, -0.5204F, -0.1922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7187F, -0.2281F, -0.3828F, -0.1779F, 0.2549F, -0.08F));

		PartDefinition cube_r258 = crestl.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(71, 0).addBox(-1.7F, -0.35F, -0.275F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3923F, -0.5342F, -1.1274F, -1.4288F, 0.4982F, -0.0906F));

		PartDefinition cube_r259 = crestl.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(80, 8).addBox(-0.9853F, -0.2788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 60).addBox(-0.9853F, -0.6788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7187F, -0.2281F, -0.3828F, -1.6781F, 0.5844F, -0.1207F));

		PartDefinition crestl2 = head.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8065F, -1.5301F, -3.4114F, 0.0644F, -0.1207F, -0.0742F));

		PartDefinition cube_r260 = crestl2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(56, 88).mirror().addBox(0.1333F, -0.8351F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 93).mirror().addBox(0.1333F, -0.4351F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, 0.8451F, 2.9051F, 1.173F, -0.7515F, 0.2637F));

		PartDefinition cube_r261 = crestl2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.3323F, 0.0933F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 89).mirror().addBox(-0.3323F, -0.3067F, -0.3681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, 0.8451F, 2.9051F, 1.2836F, 0.0354F, -0.0261F));

		PartDefinition cube_r262 = crestl2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-0.225F, -1.9533F, -0.3681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, 0.8451F, 2.9051F, 0.784F, -1.1596F, 0.7277F));

		PartDefinition cube_r263 = crestl2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-0.3317F, -0.6406F, -0.353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, 0.7701F, 2.6051F, -0.2848F, 0.0174F, -0.0127F));

		PartDefinition cube_r264 = crestl2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-0.3375F, -0.7747F, -0.3156F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, 0.7701F, 2.2051F, -0.3744F, 0.0259F, -0.0355F));

		PartDefinition cube_r265 = crestl2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-0.4294F, -0.4189F, 1.6828F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, -0.5299F, 0.2051F, -0.4267F, 0.0207F, -0.0388F));

		PartDefinition cube_r266 = crestl2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(-0.4294F, -2.2856F, -0.2456F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, -0.5299F, 0.2051F, -1.9103F, 0.0207F, -0.0388F));

		PartDefinition cube_r267 = crestl2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-0.4294F, -0.8234F, -1.8817F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, -0.5299F, 0.2051F, 2.8458F, 0.0207F, -0.0388F));

		PartDefinition cube_r268 = crestl2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-1.2086F, -0.3033F, -1.6975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.8581F, -0.3657F, -1.2987F, 0.2506F, -0.0822F, -0.0205F));

		PartDefinition cube_r269 = crestl2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.6086F, -0.2783F, -0.6975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.2769F, -0.4185F, 0.1061F, 1.3413F, 0.0486F, -0.0163F));

		PartDefinition cube_r270 = crestl2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.6086F, -0.6533F, -0.6975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(2.2277F, -0.3846F, -0.9172F, 1.6031F, 0.0486F, -0.0163F));

		PartDefinition cube_r271 = crestl2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-1.6086F, -1.6533F, -0.6975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.1449F, -0.4153F, 0.0789F, 1.6032F, -0.0822F, -0.0205F));

		PartDefinition cube_r272 = crestl2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-0.3086F, -0.5283F, -0.9225F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, -0.5299F, 0.2051F, 1.3589F, -0.0822F, -0.0205F));

		PartDefinition cube_r273 = crestl2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(60, 22).mirror().addBox(-0.3066F, -0.3329F, -0.2983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1637F, -0.3944F, -0.0675F, -0.2595F, -0.0489F, 0.0417F));

		PartDefinition cube_r274 = crestl2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-1.0907F, -0.5204F, -0.1922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7187F, -0.2281F, -0.3828F, -0.1779F, -0.2549F, 0.08F));

		PartDefinition cube_r275 = crestl2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.3F, -0.35F, -0.275F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3923F, -0.5342F, -1.1274F, -1.4288F, -0.4982F, 0.0906F));

		PartDefinition cube_r276 = crestl2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-1.0147F, -0.2788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 60).mirror().addBox(-1.0147F, -0.6788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7187F, -0.2281F, -0.3828F, -1.6781F, -0.5844F, 0.1207F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1875F, 0.2348F, -5.3797F, 0.1224F, 0.0606F, 0.0075F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 43).addBox(-0.5F, -0.9393F, -0.9974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6592F, 0.1174F, -4.9513F, 0.5505F, 0.0494F, -0.2834F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(81, 39).addBox(-0.5F, -0.0716F, -1.0976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6592F, 0.1174F, -4.9513F, 0.7687F, 0.0494F, -0.2834F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(81, 35).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.732F, 0.1986F, -3.5656F, 1.3665F, 0.0812F, -0.158F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5985F, 0.6407F, -2.7996F, 1.4974F, 0.0812F, -0.158F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(77, 56).addBox(-0.5F, -0.2F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1794F, 2.9969F, -2.2681F, 1.5847F, 0.0812F, -0.158F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 94).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0571F, 0.8143F, 5.0657F, -3.0884F, 0.0194F, -0.0672F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(94, 82).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0841F, 1.2008F, 4.3084F, -2.1278F, 0.0F, -0.0698F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(88, 23).addBox(-0.7583F, -2.9182F, 0.3843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2533F, -0.082F, 2.0674F, -1.7351F, 0.0F, -0.0698F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(67, 31).addBox(-0.234F, -1.824F, 0.2985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.9467F, -0.032F, 0.1173F, -0.9319F, 0.4164F, -0.0095F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(68, 55).addBox(-0.234F, -2.4569F, -0.1437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9467F, -0.032F, 0.1173F, -1.1588F, 0.4164F, -0.0095F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(65, 63).addBox(-0.234F, -1.1012F, 0.3461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9467F, -0.032F, 0.1173F, -0.7225F, 0.4164F, -0.0095F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(7, 87).addBox(-0.9974F, -0.6755F, 0.0476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2533F, -0.082F, 2.0674F, -0.2589F, 0.2233F, -0.0965F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(94, 50).addBox(-1.2373F, 0.322F, -1.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5033F, -0.032F, 2.0174F, -0.2839F, 0.4577F, -0.105F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(21, 81).addBox(-1.4435F, -1.7538F, -1.4105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5033F, -0.032F, 2.0174F, 1.1565F, 0.3306F, -0.092F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(89, 75).addBox(-1.0551F, -0.6291F, -0.4019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(89, 55).addBox(-1.0551F, -0.6291F, 0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2033F, -0.032F, -0.4826F, -2.7567F, 0.1829F, -0.1059F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0551F, 0.6159F, 0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2033F, -0.032F, -0.4826F, -2.0149F, 0.1829F, -0.1059F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(50, 72).addBox(-1.4435F, -0.9238F, 1.0479F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5033F, -0.032F, 2.0174F, 3.0328F, 0.3306F, -0.092F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(94, 47).addBox(-0.047F, -0.0674F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1967F, -0.032F, -2.5827F, -2.8942F, 0.0612F, -0.0872F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.7354F, -0.35F, -5.3096F, 2.6385F, 0.0612F, -0.0872F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(65, 50).addBox(-1.0551F, -0.8571F, -2.5757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2033F, -0.032F, -0.4826F, 0.1057F, 0.1829F, -0.1059F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(47, 94).addBox(0.053F, 0.9245F, 0.9523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.1967F, -0.032F, -2.5827F, -2.6499F, 0.0612F, -0.0872F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(97, 6).addBox(-0.2526F, -1.0064F, -0.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1967F, -1.132F, -4.3827F, -1.332F, 0.0549F, -0.0912F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(56, 77).addBox(-0.7583F, -1.6728F, 0.6021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2533F, -0.082F, 2.0674F, -0.365F, 0.0F, -0.0698F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(57, 58).addBox(-2.7583F, -1.1112F, 0.9466F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2533F, -0.082F, 2.0674F, -0.1468F, 0.0F, -0.0698F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 97).addBox(-0.4249F, 0.2382F, 0.3573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1324F, 0.3397F, 3.3333F, 0.3769F, -0.0036F, -0.0557F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(97, 18).addBox(-0.4249F, -0.8085F, 0.5632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(94, 96).addBox(-0.4249F, -0.8085F, 0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1324F, 0.3397F, 3.3333F, -0.3212F, -0.0036F, -0.0557F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 96).addBox(-0.2662F, -0.0018F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(79, 95).addBox(-0.2662F, -0.0018F, -0.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.0574F, 0.3397F, 3.3333F, -1.8399F, 0.2751F, -0.0932F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(20, 97).addBox(-0.2662F, 0.2919F, -0.4924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(97, 15).addBox(-0.2662F, 0.4669F, -0.4924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.0574F, 0.3397F, 3.3333F, -2.4507F, 0.2751F, -0.0932F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 88).addBox(-0.2662F, -1.5333F, 0.4702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0574F, 0.3397F, 3.3333F, 2.3926F, 0.2751F, -0.0932F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(96, 91).addBox(-0.4249F, -0.5518F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1324F, 0.3397F, 3.3333F, -1.7785F, -0.0036F, -0.0557F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 52).addBox(-0.4334F, -1.2383F, -0.2947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1324F, 0.3397F, 3.3333F, -1.8658F, -0.0036F, -0.0557F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 95).addBox(-0.2846F, 0.5756F, -0.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(74, 95).addBox(-0.2846F, 0.0006F, -0.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0574F, 0.3397F, 3.3333F, -1.6182F, 0.2335F, -0.0794F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(42, 94).addBox(-0.4334F, -0.577F, -0.1911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.1324F, 0.3397F, 3.3333F, -1.6913F, -0.0036F, -0.0557F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 50).addBox(-0.5292F, -1.4371F, -0.9205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, -1.535F, 0.3625F, -0.1356F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(15, 97).addBox(-0.5453F, 0.0121F, 0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0006F, -0.8546F, 0.0512F, -2.965F, 0.2934F, -0.1501F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(88, 40).addBox(-0.5453F, -1.4561F, 0.3176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0006F, -0.8546F, 0.0512F, 2.14F, 0.2934F, -0.1501F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(88, 27).addBox(-0.5453F, -1.8189F, -0.4348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.0006F, -0.8546F, 0.0512F, 1.6601F, 0.2934F, -0.1501F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 31).addBox(-0.5453F, -1.0144F, -1.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0006F, -0.8546F, 0.0512F, 0.8311F, 0.2934F, -0.1501F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5453F, -0.5357F, -0.7183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0006F, -0.8546F, 0.0512F, -0.3907F, 0.2934F, -0.1501F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5292F, -0.5001F, -0.5123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, -1.6659F, 0.3625F, -0.1356F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(83, 11).addBox(-0.5292F, -1.5438F, -0.8643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, -2.9313F, 0.3625F, -0.1356F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(97, 12).addBox(-0.5292F, -0.4425F, -1.6973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(70, 77).addBox(-0.5292F, -0.0426F, -1.6973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, 2.4793F, 0.3625F, -0.1356F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5292F, -0.0899F, 0.0021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, 1.3448F, 0.3625F, -0.1356F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(89, 49).addBox(-0.5292F, 0.4271F, 0.6261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0006F, -0.9046F, 0.0512F, 0.9521F, 0.3625F, -0.1356F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(81, 68).addBox(-1.9974F, 0.6021F, 0.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.1252F, -1.9629F, 2.3038F, -0.126F, 0.2244F, -0.0876F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(87, 6).addBox(-1.2373F, -1.5891F, -1.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5033F, -0.032F, 2.0174F, -0.1094F, 0.4577F, -0.105F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(60, 17).addBox(-2.4435F, -1.6464F, -2.1823F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5033F, -0.032F, 2.0174F, -0.1525F, 0.3306F, -0.092F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(24, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3823F, -1.9278F, 0.4752F, 1.5286F, 0.1873F, -0.1008F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(69, 81).addBox(-1.0635F, -1.8827F, 0.8134F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2033F, -0.032F, -0.4826F, 1.7032F, 0.1873F, -0.1008F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(37, 94).addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.832F, -0.8515F, -2.777F, 0.0554F, 0.0596F, -0.0882F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(10, 95).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7838F, 0.5425F, -4.0932F, -1.8383F, 0.0612F, -0.0872F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(25, 94).addBox(-0.5F, -0.3F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8077F, -0.0354F, -3.6619F, -0.8871F, 0.0612F, -0.0872F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(20, 94).addBox(-0.047F, -0.8527F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1967F, -0.032F, -2.5827F, 1.2073F, 0.0612F, -0.0872F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(89, 96).addBox(-1.0551F, 0.2105F, -2.2712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2033F, -0.032F, -0.4826F, -0.1561F, 0.1829F, -0.1059F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2827F, 0.2348F, -5.3797F, 0.1224F, -0.0606F, -0.0075F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.5F, -0.9393F, -0.9974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.6592F, 0.1174F, -4.9513F, 0.5505F, -0.0494F, 0.2834F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(81, 39).mirror().addBox(-0.5F, -0.0716F, -1.0976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.6592F, 0.1174F, -4.9513F, 0.7687F, -0.0494F, 0.2834F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.732F, 0.1986F, -3.5656F, 1.3665F, -0.0812F, 0.158F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5985F, 0.6407F, -2.7996F, 1.4974F, -0.0812F, 0.158F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-0.5F, -0.2F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1794F, 2.9969F, -2.2681F, 1.5847F, -0.0812F, 0.158F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(52, 94).mirror().addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0571F, 0.8143F, 5.0657F, -3.0884F, -0.0194F, 0.0672F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(94, 82).mirror().addBox(-0.5F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0841F, 1.2008F, 4.3084F, -2.1278F, 0.0F, 0.0698F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-0.2417F, -2.9182F, 0.3843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2533F, -0.082F, 2.0674F, -1.7351F, 0.0F, 0.0698F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-0.766F, -1.824F, 0.2985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.9467F, -0.032F, 0.1173F, -0.9319F, -0.4164F, 0.0095F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-0.766F, -2.4569F, -0.1437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9467F, -0.032F, 0.1173F, -1.1588F, -0.4164F, 0.0095F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(65, 63).mirror().addBox(-0.766F, -1.1012F, 0.3461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9467F, -0.032F, 0.1173F, -0.7225F, -0.4164F, 0.0095F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-0.0026F, -0.6755F, 0.0476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2533F, -0.082F, 2.0674F, -0.2589F, -0.2233F, 0.0965F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(94, 50).mirror().addBox(0.2373F, 0.322F, -1.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5033F, -0.032F, 2.0174F, -0.2839F, -0.4577F, 0.105F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(21, 81).mirror().addBox(0.4435F, -1.7538F, -1.4105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5033F, -0.032F, 2.0174F, 1.1565F, -0.3306F, 0.092F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(0.0551F, -0.6291F, -0.4019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(89, 55).mirror().addBox(0.0551F, -0.6291F, 0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2033F, -0.032F, -0.4826F, -2.7567F, -0.1829F, 0.1059F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0551F, 0.6159F, 0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2033F, -0.032F, -0.4826F, -2.0149F, -0.1829F, 0.1059F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(0.4435F, -0.9238F, 1.0479F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5033F, -0.032F, 2.0174F, 3.0328F, -0.3306F, 0.092F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(94, 47).mirror().addBox(-0.953F, -0.0674F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1967F, -0.032F, -2.5827F, -2.8942F, -0.0612F, 0.0872F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.7354F, -0.35F, -5.3096F, 2.6385F, -0.0612F, 0.0872F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(65, 50).mirror().addBox(0.0551F, -0.8571F, -2.5757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2033F, -0.032F, -0.4826F, 0.1057F, -0.1829F, 0.1059F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(47, 94).mirror().addBox(-1.053F, 0.9245F, 0.9523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.1967F, -0.032F, -2.5827F, -2.6499F, -0.0612F, 0.0872F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(97, 6).mirror().addBox(-0.7474F, -1.0064F, -0.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.1967F, -1.132F, -4.3827F, -1.332F, -0.0549F, 0.0912F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-0.2417F, -1.6728F, 0.6021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2533F, -0.082F, 2.0674F, -0.365F, 0.0F, 0.0698F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-0.2417F, -1.1112F, 0.9466F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2533F, -0.082F, 2.0674F, -0.1468F, 0.0F, 0.0698F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.5751F, 0.2382F, 0.3573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1324F, 0.3397F, 3.3333F, 0.3769F, 0.0036F, 0.0557F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(97, 18).mirror().addBox(-0.5751F, -0.8085F, 0.5632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(94, 96).mirror().addBox(-0.5751F, -0.8085F, 0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1324F, 0.3397F, 3.3333F, -0.3212F, 0.0036F, 0.0557F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(57, 96).mirror().addBox(-0.7338F, -0.0018F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(79, 95).mirror().addBox(-0.7338F, -0.0018F, -0.8046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.0574F, 0.3397F, 3.3333F, -1.8399F, -0.2751F, 0.0932F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.7338F, 0.2919F, -0.4924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(97, 15).mirror().addBox(-0.7338F, 0.4669F, -0.4924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(-1.0574F, 0.3397F, 3.3333F, -2.4507F, -0.2751F, 0.0932F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.7338F, -1.5333F, 0.4702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0574F, 0.3397F, 3.3333F, 2.3926F, -0.2751F, 0.0932F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(96, 91).mirror().addBox(-0.5751F, -0.5518F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1324F, 0.3397F, 3.3333F, -1.7785F, 0.0036F, 0.0557F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-0.5666F, -1.2383F, -0.2947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1324F, 0.3397F, 3.3333F, -1.8658F, 0.0036F, 0.0557F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 95).mirror().addBox(-0.7154F, 0.5756F, -0.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(74, 95).mirror().addBox(-0.7154F, 0.0006F, -0.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0574F, 0.3397F, 3.3333F, -1.6182F, -0.2335F, 0.0794F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-0.5666F, -0.577F, -0.1911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.1324F, 0.3397F, 3.3333F, -1.6913F, 0.0036F, 0.0557F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-0.4708F, -1.4371F, -0.9205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, -1.535F, -0.3625F, 0.1356F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(15, 97).mirror().addBox(-0.4547F, 0.0121F, 0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.8546F, 0.0512F, -2.965F, -0.2934F, 0.1501F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-0.4547F, -1.4561F, 0.3176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.8546F, 0.0512F, 2.14F, -0.2934F, 0.1501F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.4547F, -1.8189F, -0.4348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.8546F, 0.0512F, 1.6601F, -0.2934F, 0.1501F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.4547F, -1.0144F, -1.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.8546F, 0.0512F, 0.8311F, -0.2934F, 0.1501F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-0.4547F, -0.5357F, -0.7183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.8546F, 0.0512F, -0.3907F, -0.2934F, 0.1501F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.4708F, -0.5001F, -0.5123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, -1.6659F, -0.3625F, 0.1356F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(83, 11).mirror().addBox(-0.4708F, -1.5438F, -0.8643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, -2.9313F, -0.3625F, 0.1356F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(97, 12).mirror().addBox(-0.4708F, -0.4425F, -1.6973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(70, 77).mirror().addBox(-0.4708F, -0.0426F, -1.6973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, 2.4793F, -0.3625F, 0.1356F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.4708F, -0.0899F, 0.0021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, 1.3448F, -0.3625F, 0.1356F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-0.4708F, 0.4271F, 0.6261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.0006F, -0.9046F, 0.0512F, 0.9521F, -0.3625F, 0.1356F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(-0.0026F, 0.6021F, 0.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1252F, -1.9629F, 2.3038F, -0.126F, -0.2244F, 0.0876F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(0.2373F, -1.5891F, -1.0634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5033F, -0.032F, 2.0174F, -0.1094F, -0.4577F, 0.105F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(0.4435F, -1.6464F, -2.1823F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5033F, -0.032F, 2.0174F, -0.1525F, -0.3306F, 0.092F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3823F, -1.9278F, 0.4752F, 1.5286F, -0.1873F, 0.1008F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(69, 81).mirror().addBox(0.0635F, -1.8827F, 0.8134F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2033F, -0.032F, -0.4826F, 1.7032F, -0.1873F, 0.1008F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(37, 94).mirror().addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.832F, -0.8515F, -2.777F, 0.0554F, -0.0596F, 0.0882F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 0).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7838F, 0.5425F, -4.0932F, -1.8383F, -0.0612F, 0.0872F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(-0.5F, -0.3F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8077F, -0.0354F, -3.6619F, -0.8871F, -0.0612F, 0.0872F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-0.953F, -0.8527F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1967F, -0.032F, -2.5827F, 1.2073F, -0.0612F, 0.0872F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(89, 96).mirror().addBox(0.0551F, 0.2105F, -2.2712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2033F, -0.032F, -0.4826F, -0.1561F, -0.1829F, 0.1059F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0573F, 1.6649F, -0.1393F, 1.0732F, 0.0016F, -0.0016F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.6199F, -0.9343F, -0.9456F, -2.569F, -0.0628F, 0.0777F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.7827F, 0.1846F, 0.2551F, -2.3072F, -0.0628F, 0.0777F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.823F, 1.5086F, -0.7401F, -1.3037F, -0.0628F, 0.0777F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-0.5F, -0.15F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.7681F, 0.9324F, -0.8982F, -0.9808F, -0.0628F, 0.0777F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.1412F, -0.4585F, -1.8511F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.8644F, -1.6539F, -1.8976F, -0.9374F, -0.234F, 0.3857F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.1412F, 1.2614F, -1.7625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-2.8644F, -1.6539F, -1.8976F, -2.1765F, -0.234F, 0.3857F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(29, 87).mirror().addBox(-0.1412F, 0.0243F, 1.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.8644F, -1.6539F, -1.8976F, 2.6667F, -0.234F, 0.3857F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.891F, -0.4765F, -0.6138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.9644F, -2.9539F, -3.9976F, 1.1188F, -0.1715F, 0.2683F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-0.891F, 0.3213F, 0.2646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9644F, -2.9539F, -3.9976F, 2.5151F, -0.1715F, 0.2683F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-0.8905F, -0.2317F, -0.8895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(40, 97).mirror().addBox(-0.9402F, -0.5367F, -1.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -2.4096F, -0.1501F, 0.2297F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(88, 37).mirror().addBox(-0.8905F, -0.8084F, -1.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -0.9697F, -0.1501F, 0.2297F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(46, 88).mirror().addBox(-0.8905F, -2.1409F, -0.4198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, 0.4266F, -0.1501F, 0.2297F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(76, 89).mirror().addBox(-0.8905F, -0.8444F, 1.7353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, 1.7792F, -0.1501F, 0.2297F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-0.8548F, -0.0613F, -0.4492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0606F, -6.2539F, -5.4976F, -2.9223F, -0.0899F, 0.0649F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(51, 88).mirror().addBox(-0.8548F, -0.5167F, 0.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0606F, -6.2539F, -5.4976F, 1.8338F, -0.0899F, 0.0649F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.8548F, -0.8859F, -0.5203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.0606F, -6.2539F, -5.4976F, 1.572F, -0.0899F, 0.0649F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(98, 30).mirror().addBox(-0.8905F, -1.438F, 1.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, 1.6919F, -0.1501F, 0.2297F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(89, 78).mirror().addBox(-0.8905F, -1.9231F, -1.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, 0.3829F, -0.1501F, 0.2297F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(81, 89).mirror().addBox(-0.8905F, 0.0083F, -1.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -1.1879F, -0.1501F, 0.2297F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(89, 81).mirror().addBox(-0.8905F, -0.3681F, -0.0477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -2.6278F, -0.1501F, 0.2297F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(41, 88).mirror().addBox(-0.891F, -1.0052F, 0.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(80, 4).mirror().addBox(-0.891F, -0.4052F, -0.7491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.9644F, -2.9539F, -3.9976F, 2.1224F, -0.1715F, 0.2683F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-0.891F, -0.6591F, -0.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9644F, -2.9539F, -3.9976F, 0.6825F, -0.1715F, 0.2683F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(-0.1412F, -0.6545F, -3.0361F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-2.8644F, -1.6539F, -1.8976F, -0.8152F, -0.234F, 0.3857F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(62, 96).mirror().addBox(-0.8905F, -0.361F, -0.1329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(67, 96).mirror().addBox(-0.8905F, -0.361F, -0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, 2.1283F, -0.1501F, 0.2297F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.9402F, 0.2476F, -1.1967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -2.5405F, -0.1501F, 0.2297F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.9466F, 1.0256F, -1.0726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -2.6717F, -0.1406F, 0.2353F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-0.9466F, 1.8043F, -0.7513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5644F, -3.9539F, -4.6976F, -2.8463F, -0.1406F, 0.2353F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(98, 27).mirror().addBox(-0.9054F, -0.0084F, -0.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(30, 98).mirror().addBox(-0.9054F, 0.6916F, -0.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0606F, -6.2539F, -5.4976F, -2.835F, -0.0805F, 0.0705F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-0.3989F, 0.2559F, -2.5654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0606F, -6.2539F, -5.4976F, -1.8422F, 0.0545F, -0.2409F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-0.1412F, 0.1083F, -1.0044F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 19).mirror().addBox(-0.1412F, -0.1917F, -1.0044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.8644F, -1.6539F, -1.8976F, -2.6129F, -0.234F, 0.3857F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.5913F, -0.3171F, -2.1601F, -0.8935F, -0.0628F, 0.0777F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(57, 72).addBox(-0.8588F, -0.4585F, -1.8511F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.8837F, -1.6539F, -1.8976F, -0.9374F, 0.234F, -0.3857F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.6106F, -0.3171F, -2.1601F, -0.8935F, 0.0628F, -0.0777F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5F, -0.15F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.7875F, 0.9324F, -0.8982F, -0.9808F, 0.0628F, -0.0777F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(96, 61).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.8423F, 1.5086F, -0.7401F, -1.3037F, 0.0628F, -0.0777F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.802F, 0.1846F, 0.2551F, -2.3072F, 0.0628F, -0.0777F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(64, 72).addBox(-0.8588F, -0.6545F, -3.0361F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(2.8837F, -1.6539F, -1.8976F, -0.8152F, 0.234F, -0.3857F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(97, 70).addBox(-0.109F, -0.6591F, -0.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9837F, -2.9539F, -3.9976F, 0.6825F, 0.1715F, -0.2683F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(80, 4).addBox(-0.109F, -0.4052F, -0.7491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F))
				.texOffs(41, 88).addBox(-0.109F, -1.0052F, 0.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.9837F, -2.9539F, -3.9976F, 2.1224F, 0.1715F, -0.2683F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(67, 96).addBox(-0.1095F, -0.361F, -0.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 96).addBox(-0.1095F, -0.361F, -0.1329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, 2.1283F, 0.1501F, -0.2297F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(89, 81).addBox(-0.1095F, -0.3681F, -0.0477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -2.6278F, 0.1501F, -0.2297F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 89).addBox(-0.1095F, 0.0083F, -1.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -1.1879F, 0.1501F, -0.2297F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(89, 78).addBox(-0.1095F, -1.9231F, -1.0083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, 0.3829F, 0.1501F, -0.2297F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(98, 30).addBox(-0.1095F, -1.438F, 1.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, 1.6919F, 0.1501F, -0.2297F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(21, 73).addBox(-0.1453F, -0.8859F, -0.5203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.0413F, -6.2539F, -5.4976F, 1.572F, 0.0899F, -0.0649F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(51, 88).addBox(-0.1453F, -0.5167F, 0.6249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0413F, -6.2539F, -5.4976F, 1.8338F, 0.0899F, -0.0649F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(88, 46).addBox(-0.1453F, -0.0613F, -0.4492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0413F, -6.2539F, -5.4976F, -2.9223F, 0.0899F, -0.0649F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(76, 89).addBox(-0.1095F, -0.8444F, 1.7353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, 1.7792F, 0.1501F, -0.2297F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(46, 88).addBox(-0.1095F, -2.1409F, -0.4198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, 0.4266F, 0.1501F, -0.2297F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(88, 37).addBox(-0.1095F, -0.8084F, -1.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -0.9697F, 0.1501F, -0.2297F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(30, 98).addBox(-0.0946F, 0.6916F, -0.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(98, 27).addBox(-0.0946F, -0.0084F, -0.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0413F, -6.2539F, -5.4976F, -2.835F, 0.0805F, -0.0705F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(35, 81).addBox(-0.6011F, 0.2559F, -2.5654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0413F, -6.2539F, -5.4976F, -1.8422F, -0.0545F, 0.2409F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(98, 24).addBox(-0.0534F, 1.8043F, -0.7513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -2.8463F, 0.1406F, -0.2353F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(98, 21).addBox(-0.0534F, 1.0256F, -1.0726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -2.6717F, 0.1406F, -0.2353F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(10, 98).addBox(-0.0598F, 0.2476F, -1.1967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -2.5405F, 0.1501F, -0.2297F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(40, 97).addBox(-0.0598F, -0.5367F, -1.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(88, 43).addBox(-0.1095F, -0.2317F, -0.8895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5837F, -3.9539F, -4.6976F, -2.4096F, 0.1501F, -0.2297F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(12, 89).addBox(-0.109F, 0.3213F, 0.2646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9837F, -2.9539F, -3.9976F, 2.5151F, 0.1715F, -0.2683F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(14, 73).addBox(-0.109F, -0.4765F, -0.6138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.9837F, -2.9539F, -3.9976F, 1.1188F, 0.1715F, -0.2683F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(29, 87).addBox(-0.8588F, 0.0243F, 1.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.8837F, -1.6539F, -1.8976F, 2.6667F, 0.234F, -0.3857F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(78, 15).addBox(-0.8588F, 1.2614F, -1.7625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(2.8837F, -1.6539F, -1.8976F, -2.1765F, 0.234F, -0.3857F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(78, 19).addBox(-0.8588F, -0.1917F, -1.0044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(71, 72).addBox(-0.8588F, 0.1083F, -1.0044F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8837F, -1.6539F, -1.8976F, -2.6129F, 0.234F, -0.3857F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(69, 12).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.6392F, -0.9343F, -0.9456F, -2.569F, 0.0628F, -0.0777F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r447 = tail.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(94, 74).addBox(0.0F, -0.0853F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.767F, 0.8431F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r448 = tail.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(94, 53).addBox(0.0F, -0.4565F, -0.0999F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4867F, 2.8578F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r449 = tail.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(50, 100).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 99).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 2.0037F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r450 = tail.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(15, 100).addBox(0.0F, -1.2044F, 0.0292F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 0.0037F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-1.5015F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 8).mirror().addBox(-1.5015F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, 0.0F, 0.07F, -0.0023F));

		PartDefinition cube_r452 = tail.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5141F, -0.0451F, -0.0762F, -0.0584F, -0.6523F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(52, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.5141F, -0.0451F, -0.0762F, 0.0584F, 0.6523F));

		PartDefinition cube_r454 = tail.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5141F, -0.0451F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(60, 8).addBox(-0.4985F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(60, 4).addBox(-0.4985F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, 0.0F, -0.07F, 0.0023F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(41, 37).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5438F, 4.9252F, -0.0219F, 0.0872F, -0.0019F));

		PartDefinition cube_r456 = tail7.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(42, 73).addBox(0.0F, -1.0581F, 0.0912F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail7.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(65, 55).addBox(0.0F, -1.1054F, 0.0608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail7.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(63, 99).addBox(0.0F, -0.7666F, -0.1787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5058F, 3.3969F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail7.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(98, 37).addBox(0.0F, 0.1899F, 0.0372F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0603F, 0.2541F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail7.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-1.5198F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, -6.0F, 0.0F, 0.0525F, -0.0023F));

		PartDefinition cube_r461 = tail7.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0452F, -0.1363F, -0.0257F, 0.0866F, 0.0107F));

		PartDefinition cube_r462 = tail7.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8212F, -2.4917F, 1.8684F, 0.05F, 0.0753F, 0.8863F));

		PartDefinition cube_r463 = tail7.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8212F, -2.4917F, 1.8684F, 0.05F, -0.0753F, -0.8863F));

		PartDefinition cube_r464 = tail7.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(13, 44).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.0452F, -0.1363F, -0.0257F, -0.0866F, -0.0107F));

		PartDefinition cube_r465 = tail7.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, -0.9716F, -0.0016F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5737F, -0.147F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r466 = tail7.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(60, 0).addBox(-0.4802F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.0F, 0.0F, -0.0525F, 0.0023F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 29).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.982F, 4.7913F, -0.0572F, 0.1307F, -0.0075F));

		PartDefinition cube_r467 = tail2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(10, 82).addBox(0.0F, -0.9206F, -0.0527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0143F, 4.0362F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r468 = tail2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(47, 100).addBox(0.0F, -1.1003F, -0.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1143F, 2.0362F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(44, 100).addBox(0.0F, -1.3092F, -0.0816F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3143F, 0.1362F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r470 = tail2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(90, 99).addBox(0.0F, -0.3367F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9541F, 4.6903F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r471 = tail2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(87, 99).addBox(0.0F, -0.4261F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0541F, 2.3903F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r472 = tail2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(99, 79).addBox(0.0F, -0.4837F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3217F, 0.2876F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r473 = tail2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(30, 29).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4248F, 0.0217F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 44).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(39, 44).addBox(-0.5F, -1.1731F, -0.0087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1196F, 5.9509F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r474 = tail8.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 86).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0334F, 2.0524F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r475 = tail8.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(74, 52).addBox(0.0F, -0.7889F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r476 = tail8.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(69, 99).addBox(0.0F, -0.4837F, 0.0485F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9397F, 3.0541F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail8.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(66, 99).addBox(0.0F, -0.3479F, -0.1812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8397F, 1.0541F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 45).addBox(-0.4968F, -0.1985F, -0.0349F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, 0.109F, 4.8057F, -0.0283F, 0.0268F, -0.0037F));

		PartDefinition cube_r478 = tail3.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(21, 100).addBox(-0.0106F, 0.1907F, -0.0686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 2.6192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r479 = tail3.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(18, 100).addBox(-0.0106F, 0.2782F, -0.1654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 0.5192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r480 = tail3.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(45, 27).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3113F, 0.0873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r481 = tail3.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 23).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 0.9651F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 51).addBox(-0.4968F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 4.9757F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r482 = tail4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(41, 100).addBox(-0.0106F, 2.2907F, 3.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 100).addBox(-0.0106F, 1.0907F, 1.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0365F, -2.3135F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r483 = tail4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(89, 58).addBox(-0.5F, -0.825F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 51).addBox(-0.5F, -0.825F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0032F, -0.2168F, -0.1415F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 19).addBox(-0.4968F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(13, 51).addBox(-0.4968F, -0.95F, 0.075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r484 = tail5.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(35, 100).addBox(-0.0106F, 5.3907F, 9.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 100).addBox(-0.0106F, 4.3907F, 7.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 100).addBox(-0.0106F, 3.1907F, 5.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.164F, -7.2943F, 0.5411F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(47, 0).addBox(-0.4968F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail6.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(47, 12).addBox(-0.5F, -0.125F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0032F, -1.7997F, 0.2327F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail9 = tail6.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(13, 58).addBox(-0.4968F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0006F, 0.0047F));

		return LayerDefinition.create(meshdefinition, 104, 104);
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