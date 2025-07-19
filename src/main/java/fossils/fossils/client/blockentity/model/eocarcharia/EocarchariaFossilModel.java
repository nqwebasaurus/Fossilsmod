package fossils.fossils.client.blockentity.model.eocarcharia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EocarchariaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart heads;
	private final ModelPart leftHead;
	private final ModelPart rightHead;
	private final ModelPart jaw;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public EocarchariaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.heads = this.neck.getChild("heads");
		this.leftHead = this.heads.getChild("leftHead");
		this.rightHead = this.heads.getChild("rightHead");
		this.jaw = this.heads.getChild("jaw");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(-2.0F, 0.5F, 3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 68).addBox(0.0F, 0.5F, 3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(23, 53).addBox(0.0F, -5.0F, 3.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(41, 98).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -4.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(0.1472F, -1.2413F, -1.9512F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5193F, -2.6858F, 4.5362F, 0.1213F, 0.0352F, 0.4214F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 2).mirror().addBox(0.1543F, -1.215F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0999F, -3.6216F, 4.8069F, -0.4109F, 0.0211F, 0.3924F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(0.0364F, -2.2995F, -2.3197F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6195F, -4.4471F, -2.0174F, -0.0579F, 0.343F, 0.3201F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(0.0523F, -5.4412F, -0.163F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -1.5688F, -1.3468F, -0.3093F, 0.0679F, 0.3959F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 14).mirror().addBox(0.9297F, 7.2811F, 1.3319F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.8189F, 2.4323F, 0.4847F, 0.0218F, -0.126F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 81).mirror().addBox(-0.4312F, -0.5224F, 1.9792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.8189F, 2.4323F, -0.8133F, 0.3136F, -0.3372F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-0.146F, -0.4855F, 0.0115F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, -0.1167F, 0.0431F, -0.2733F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-0.146F, -0.4255F, -1.0494F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 0.0404F, 0.0431F, -0.2733F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 102).mirror().addBox(1.039F, 6.9414F, -4.7797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(19, 91).mirror().addBox(1.039F, 7.9414F, -4.7797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 0.5203F, 0.0431F, -0.0813F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(1.039F, -4.9161F, -7.7868F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 2.1784F, 0.0431F, -0.0813F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(1.039F, 8.573F, -6.3166F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 0.3633F, 0.0431F, -0.0813F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(1.039F, 3.6851F, -9.6711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 0.9916F, 0.0431F, -0.0813F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(102, 96).mirror().addBox(1.039F, -8.2584F, -4.2962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, 2.8067F, 0.0431F, -0.0813F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(1.039F, 5.7212F, 0.1469F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7036F, 1.7164F, -2.3711F, -0.1516F, 0.0431F, -0.0813F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 86).mirror().addBox(0.1F, -1.5945F, -1.1733F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 86).addBox(5.3F, -1.5945F, -1.1733F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -0.6688F, -1.3468F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 53).mirror().addBox(-0.4312F, -0.2708F, 0.0203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.8189F, 2.4323F, -0.6912F, 0.3136F, -0.3372F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 62).mirror().addBox(0.9297F, 3.7167F, -0.3917F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.8189F, 2.4323F, 0.7726F, 0.0218F, -0.126F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(0.1F, -0.3042F, -1.16F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(73, 36).addBox(5.3F, -0.3042F, -1.16F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.2F, -0.6688F, -1.3468F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 70).addBox(-1.0364F, -2.2995F, -2.3197F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6195F, -4.4471F, -2.0174F, -0.0579F, -0.343F, -0.3201F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 81).addBox(-1.0523F, -5.4412F, -0.163F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -1.5688F, -1.3468F, -0.3093F, -0.0679F, -0.3959F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 2).addBox(-1.1543F, -1.215F, -2.0809F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0999F, -3.6216F, 4.8069F, -0.4109F, -0.0211F, -0.3924F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(81, 83).addBox(-1.1472F, -1.2413F, -1.9512F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5193F, -2.6858F, 4.5362F, 0.1213F, -0.0352F, -0.4214F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 62).addBox(-1.9297F, 3.7167F, -0.3917F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.8189F, 2.4323F, 0.7726F, -0.0218F, 0.126F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(95, 14).addBox(-1.9297F, 7.2811F, 1.3319F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7F, 0.8189F, 2.4323F, 0.4847F, -0.0218F, 0.126F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(29, 81).addBox(-0.5688F, -0.5224F, 1.9792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.8189F, 2.4323F, -0.8133F, -0.3136F, 0.3372F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 53).addBox(-0.5688F, -0.2708F, 0.0203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.8189F, 2.4323F, -0.6912F, -0.3136F, 0.3372F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(85, 90).addBox(-0.854F, -0.4855F, 0.0115F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, -0.1167F, -0.0431F, 0.2733F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 90).addBox(-0.854F, -0.4255F, -1.0494F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 0.0404F, -0.0431F, 0.2733F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 62).addBox(-2.039F, 5.7212F, 0.1469F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, -0.1516F, -0.0431F, 0.0813F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 58).addBox(-2.039F, 8.573F, -6.3166F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 0.3633F, -0.0431F, 0.0813F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 102).addBox(-2.039F, 6.9414F, -4.7797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(19, 91).addBox(-2.039F, 7.9414F, -4.7797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 0.5203F, -0.0431F, 0.0813F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 70).addBox(-2.039F, -4.9161F, -7.7868F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 2.1784F, -0.0431F, 0.0813F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(102, 96).addBox(-2.039F, -8.2584F, -4.2962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 2.8067F, -0.0431F, 0.0813F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(97, 5).addBox(-2.039F, 3.6851F, -9.6711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7036F, 1.7164F, -2.3711F, 0.9916F, -0.0431F, 0.0813F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -0.8959F, -11.7175F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.006F))
				.texOffs(5, 92).addBox(0.0F, -6.2959F, -10.7175F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 92).addBox(0.0F, -6.4959F, -7.7175F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 91).addBox(0.0F, -6.4959F, -4.7175F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, -0.0433F, -0.0437F, -0.0038F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 93).addBox(0.0F, -5.0907F, -1.7158F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 4).addBox(-1.0F, -0.0907F, -4.7158F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -12.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(56, 93).addBox(0.0F, 0.0557F, -2.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6F, -14.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(102, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.231F, -15.4704F, 0.258F, 0.045F, -0.256F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(99, 30).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.231F, -15.4704F, 0.2161F, 0.149F, -0.6819F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(34, 41).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.231F, -15.4704F, 0.0957F, 0.244F, -1.2798F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-3.6882F, -2.8327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -1.2704F, -0.0251F, -0.0652F, -1.5176F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -1.2704F, -0.0572F, -0.04F, -0.9239F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -1.2704F, -0.0688F, -0.0121F, -0.4883F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 14).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, -1.4835F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(100, 53).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, -0.8901F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, -0.4538F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -6.9704F, 0.0313F, 0.0815F, -1.4299F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(100, 88).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -6.9704F, 0.0715F, 0.05F, -0.836F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(102, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -6.9704F, 0.0859F, 0.0151F, -0.4008F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -9.9704F, 0.0503F, 0.1303F, -1.3581F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(100, 94).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -9.9704F, 0.1146F, 0.0799F, -0.7634F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(102, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -9.9704F, 0.1375F, 0.0242F, -0.3299F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -12.9704F, 0.076F, 0.1953F, -1.3015F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(100, 99).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -12.9704F, 0.1724F, 0.1195F, -0.7052F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -12.9704F, 0.2063F, 0.0361F, -0.2755F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(102, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -1.2704F, -0.0688F, 0.0121F, 0.4883F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(99, 81).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -1.2704F, -0.0572F, 0.04F, 0.9239F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(49, 66).addBox(2.6882F, -2.8327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -1.2704F, -0.0251F, 0.0652F, 1.5176F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(102, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, 0.4538F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(100, 53).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, 0.8901F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(100, 14).addBox(2.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -3.9704F, 0.0F, 0.0F, 1.4835F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(102, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -6.9704F, 0.0859F, -0.0151F, 0.4008F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(100, 88).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -6.9704F, 0.0715F, -0.05F, 0.836F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(32, 58).addBox(2.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -6.9704F, 0.0313F, -0.0815F, 1.4299F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(102, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -9.9704F, 0.1375F, -0.0242F, 0.3299F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(100, 94).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -9.9704F, 0.1146F, -0.0799F, 0.7634F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 59).addBox(2.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -9.9704F, 0.0503F, -0.1303F, 1.3581F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(34, 41).addBox(2.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.231F, -15.4704F, 0.0957F, -0.244F, 1.2798F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(99, 30).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.231F, -15.4704F, 0.2161F, -0.149F, 0.6819F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(102, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.231F, -15.4704F, 0.258F, -0.045F, 0.256F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(102, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -12.9704F, 0.2063F, -0.0361F, 0.2755F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(100, 99).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -12.9704F, 0.1724F, -0.1195F, 0.7052F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 0).addBox(2.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -12.9704F, 0.076F, -0.1953F, 1.3015F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(38, 98).addBox(0.0F, -5.5959F, -0.0175F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.7F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 20).addBox(-5.0F, -3.0456F, -3.976F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.4F, -12.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.9959F, -12.0175F, 11.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 14.4F, -0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -16.7F, -0.1309F, 0.0429F, -0.0114F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 99).addBox(0.0F, -4.6763F, 6.0088F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(0.0F, -3.9763F, 4.0088F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 101).addBox(0.0F, -3.1763F, 2.0088F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 103).addBox(0.0F, -2.3763F, 0.0088F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(32, 56).mirror().addBox(-7.4816F, -0.1757F, -0.7511F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 11.3737F, -2.1886F, -0.1275F, 1.0388F, 0.2655F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(-6.0816F, -0.1757F, -0.7511F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 11.3737F, -2.1886F, -0.0765F, 0.8669F, 0.326F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-5.0605F, 0.0573F, -0.6143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 11.2737F, -2.4886F, 0.0178F, 0.6549F, 0.3009F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-4.043F, 0.1012F, -0.9191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 11.0737F, -3.1886F, -0.4093F, 0.6581F, 0.2953F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-3.7799F, 0.9102F, -5.7298F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.0737F, -2.1886F, -0.7221F, -0.3724F, 0.3102F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.1F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0641F, 9.3989F, -6.9993F, 1.3804F, -0.6408F, -1.0093F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(11, 87).mirror().addBox(-0.8737F, -0.5549F, -3.3353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1263F, 5.893F, -4.9854F, 0.733F, 0.0F, -0.192F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(91, 37).mirror().addBox(-0.8737F, -0.0673F, -3.3001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1263F, 5.893F, -4.9854F, 0.8901F, 0.0F, -0.192F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(85, 25).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.931F, -7.2704F, 0.1982F, 0.5053F, -1.4005F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.931F, -7.2704F, 0.4491F, 0.3099F, -0.7871F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(102, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.931F, -7.2704F, 0.5309F, 0.1018F, -0.3944F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(102, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.831F, -5.2704F, 0.4478F, 0.0762F, -0.2968F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.831F, -5.2704F, 0.3801F, 0.2542F, -0.7013F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 36).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.831F, -5.2704F, 0.173F, 0.4216F, -1.3068F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(102, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.431F, -3.2704F, 0.3787F, 0.0651F, -0.2319F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.431F, -3.2704F, 0.3196F, 0.2166F, -0.6456F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.431F, -3.2704F, 0.1438F, 0.3573F, -1.2481F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(102, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.2704F, 0.3269F, 0.0566F, -0.235F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.2704F, 0.2749F, 0.1878F, -0.6546F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(35, 2).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.069F, -1.2704F, 0.1228F, 0.3088F, -1.255F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(102, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.931F, -7.2704F, 0.5309F, -0.1018F, 0.3944F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(88, 84).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.931F, -7.2704F, 0.4491F, -0.3099F, 0.7871F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 25).addBox(2.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.931F, -7.2704F, 0.1982F, -0.5053F, 1.4005F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(55, 36).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.831F, -5.2704F, 0.173F, -0.4216F, 1.3068F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 74).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.831F, -5.2704F, 0.3801F, -0.2542F, 0.7013F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(102, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.831F, -5.2704F, 0.4478F, -0.0762F, 0.2968F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(35, 0).addBox(2.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.431F, -3.2704F, 0.1438F, -0.3573F, 1.2481F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(99, 0).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.431F, -3.2704F, 0.3196F, -0.2166F, 0.6456F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(102, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.431F, -3.2704F, 0.3787F, -0.0651F, 0.2319F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.2704F, 0.3269F, -0.0566F, 0.235F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(99, 9).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.2704F, 0.2749F, -0.1878F, 0.6546F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 2).addBox(2.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.069F, -1.2704F, 0.1228F, -0.3088F, 1.255F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(12, 64).mirror().addBox(-0.3797F, -0.293F, 0.4459F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6263F, 5.893F, -4.9854F, 1.1693F, -0.0027F, 0.1045F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-0.3797F, -0.0895F, -0.5865F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6263F, 5.893F, -4.9854F, 1.0646F, -0.0003F, 0.1047F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(53, 49).addBox(-0.6203F, -0.0895F, -0.5865F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6263F, 5.893F, -4.9854F, 1.0646F, 0.0003F, -0.1047F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(12, 64).addBox(-0.6203F, -0.293F, 0.4459F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6263F, 5.893F, -4.9854F, 1.1693F, 0.0027F, -0.1045F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 37).addBox(-0.1263F, -0.0673F, -3.3001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1263F, 5.893F, -4.9854F, 0.8901F, 0.0F, 0.192F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 87).addBox(-0.1263F, -0.5549F, -3.3353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1263F, 5.893F, -4.9854F, 0.733F, 0.0F, 0.192F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 50).addBox(-1.1F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0641F, 9.3989F, -6.9993F, 1.3804F, 0.6408F, 1.0093F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(81, 62).addBox(-1.0F, 0.9102F, -6.3441F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 11.0737F, -2.1886F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(69, 21).addBox(1.7799F, 0.9102F, -5.7298F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0737F, -2.1886F, -0.7221F, 0.3724F, -0.3102F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 12).addBox(-3.0F, -0.045F, -2.886F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 11.0737F, -2.1886F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 2).addBox(-0.957F, 0.1012F, -0.9191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 11.0737F, -3.1886F, -0.4093F, -0.6581F, -0.2953F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(77, 30).addBox(-0.9395F, 0.0573F, -0.6143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 11.2737F, -2.4886F, 0.0178F, -0.6549F, -0.3009F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5184F, -0.1757F, -0.7511F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 11.3737F, -2.1886F, -0.1275F, -1.0388F, -0.2655F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 67).addBox(-0.9184F, -0.1757F, -0.7511F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 11.3737F, -2.1886F, -0.0765F, -0.8669F, -0.326F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.9584F, -0.0058F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.1F, -8.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 10.031F, -5.3704F, 0.7505F, 0.2618F, 0.0F));

		PartDefinition cube_r125 = leftArm1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(44, 102).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.2808F, 0.5509F, -0.7676F, 0.1498F));

		PartDefinition cube_r126 = leftArm1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(47, 28).addBox(-1.0F, -1.4618F, 0.0715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.4893F, 1.0077F, -0.6678F, 0.2037F));

		PartDefinition cube_r127 = leftArm1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 21).addBox(6.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftArm1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(64, 0).addBox(-0.7F, -0.1479F, 0.0289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 1.8847F, 0.2893F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(33, 98).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 99).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.0347F, 1.6893F, -1.3103F, -0.3084F, 0.3163F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(50, 76).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 10.031F, -5.3704F, 1.3177F, -0.2618F, 0.0F));

		PartDefinition cube_r129 = rightArm1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(91, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.2808F, 0.5509F, 0.7676F, -0.1498F));

		PartDefinition cube_r130 = rightArm1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(42, 4).addBox(0.0F, -1.4618F, 0.0715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.4893F, 1.0077F, 0.6678F, -0.2037F));

		PartDefinition cube_r131 = rightArm1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 12).addBox(-7.0F, -1.6842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightArm1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 28).addBox(-0.3F, -0.1479F, 0.0289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2F, 1.8847F, 0.2893F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(61, 97).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 58).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.0347F, 1.6893F, -1.3537F, 0.3344F, -0.2891F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(37, 75).addBox(0.0F, 0.0F, -2.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -8.7F, -0.0873F, -0.0436F, 0.0F));

		PartDefinition cube_r133 = neck4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(18, 87).addBox(0.0F, -3.5F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 49).addBox(0.0F, -3.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 28).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = neck4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 63).mirror().addBox(-4.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -2.5704F, -0.0113F, 0.4427F, -1.552F));

		PartDefinition cube_r135 = neck4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -2.5704F, 0.1879F, 0.4034F, -1.0746F));

		PartDefinition cube_r136 = neck4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(102, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -0.5704F, 0.6285F, 0.1415F, -0.6443F));

		PartDefinition cube_r137 = neck4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -0.5704F, 0.5288F, 0.3831F, -1.0218F));

		PartDefinition cube_r138 = neck4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(61, 87).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.169F, -0.5704F, 0.2198F, 0.6084F, -1.6509F));

		PartDefinition cube_r139 = neck4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(102, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -2.5704F, 0.1879F, -0.4034F, 1.0746F));

		PartDefinition cube_r140 = neck4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(90, 63).addBox(1.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -2.5704F, -0.0113F, -0.4427F, 1.552F));

		PartDefinition cube_r141 = neck4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(102, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -0.5704F, 0.6285F, -0.1415F, 0.6443F));

		PartDefinition cube_r142 = neck4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 61).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -0.5704F, 0.5288F, -0.3831F, 1.0218F));

		PartDefinition cube_r143 = neck4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(61, 87).addBox(2.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -0.5704F, 0.2198F, -0.6084F, 1.6509F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.5F, -0.1304F, 0.0007F, 0.0114F));

		PartDefinition cube_r144 = neck3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 87).addBox(0.0F, -1.5422F, 1.911F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 104).addBox(0.0F, -1.9422F, -0.089F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, -2.8F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r145 = neck3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-4.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.569F, -1.5704F, -0.0094F, 0.53F, -1.5512F));

		PartDefinition cube_r146 = neck3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 49).mirror().addBox(-4.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.569F, -3.2704F, -0.0094F, 0.53F, -1.5512F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(101, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.569F, -3.2704F, 0.2347F, 0.4797F, -1.0546F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.569F, -1.5704F, 0.2347F, 0.4797F, -1.0546F));

		PartDefinition cube_r149 = neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(101, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.569F, -3.2704F, 0.2347F, -0.4797F, 1.0546F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 49).addBox(1.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.569F, -3.2704F, -0.0094F, -0.53F, 1.5512F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(100, 101).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.569F, -1.5704F, 0.2347F, -0.4797F, 1.0546F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 58).addBox(1.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.569F, -1.5704F, -0.0094F, -0.53F, 1.5512F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 42).addBox(-1.0F, -0.0422F, -0.089F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.6F, -2.8F, -0.5323F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -3.4F, -0.2556F, 0.2502F, 0.2323F));

		PartDefinition cube_r154 = neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(72, 104).addBox(0.0F, -2.0715F, -0.1742F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -1.0F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(103, 103).addBox(0.0F, -3.6F, -4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 51).addBox(-1.0F, -1.5F, -5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.3F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.969F, -3.2704F, -0.0102F, 0.4951F, -1.5515F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(101, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.969F, -3.2704F, 0.2156F, 0.4493F, -1.0632F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-4.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.869F, -1.4704F, -0.0103F, 0.4863F, -1.5516F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.869F, -1.4704F, 0.2109F, 0.4417F, -1.0652F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(101, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.969F, -3.2704F, 0.2156F, -0.4493F, 1.0632F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(22, 69).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.969F, -3.2704F, -0.0102F, -0.4951F, 1.5515F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(101, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.869F, -1.4704F, 0.2109F, -0.4417F, 1.0652F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(20, 73).addBox(1.8126F, -0.8452F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.869F, -1.4704F, -0.0103F, -0.4863F, 1.5516F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 87).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.4F, -3.7F, -0.1329F, 0.173F, -0.023F));

		PartDefinition cube_r164 = neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 105).addBox(0.0F, -2.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.7F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(66, 38).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.169F, -2.2704F, 0.0685F, -0.5613F, 1.2996F));

		PartDefinition cube_r166 = neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(-2.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -0.8704F, -0.0086F, 0.5649F, -1.5507F));

		PartDefinition cube_r167 = neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.031F, -0.8704F, 0.2544F, 0.51F, -1.0453F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(18, 62).addBox(1.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -0.8704F, -0.0086F, -0.5649F, 1.5507F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(101, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.031F, -0.8704F, 0.2544F, -0.51F, 1.0453F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 104).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition heads = neck.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1726F, -0.0355F, 0.0504F));

		PartDefinition cube_r171 = heads.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 32).addBox(-1.0F, -2.2319F, 0.0117F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -7.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r172 = heads.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, -4.9719F, -0.0695F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.1F, -11.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r173 = heads.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(33, 93).addBox(-1.0F, -1.9557F, -0.0032F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -12.3F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r174 = heads.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 98).addBox(-1.0F, -1.9543F, -0.7618F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7F, -11.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = heads.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(98, 83).addBox(-1.0F, -1.3F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(61, 93).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 5.7071F, -10.5776F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r176 = heads.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(42, 94).addBox(-1.5F, -1.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 5.7973F, -9.5044F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r177 = heads.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 49).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.3433F, -8.6133F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r178 = heads.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(91, 42).addBox(-1.5F, -1.7701F, 1.6105F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(88, 79).addBox(-1.5F, -1.9701F, 2.6105F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.5F, -9.2F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r179 = heads.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 62).addBox(-1.5F, -2.0968F, -4.9683F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, -5.2F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r180 = heads.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 21).addBox(-1.5F, -1.0497F, -2.9679F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(82, 12).addBox(-2.0F, -5.0497F, -1.9679F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, -2.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r181 = heads.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(90, 30).addBox(-1.5F, -1.9996F, -1.9713F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5F, -9.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r182 = heads.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(98, 64).addBox(-1.0F, -2.0617F, -1.0122F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -3.0F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r183 = heads.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(40, 86).addBox(-1.0F, -0.2643F, -1.0347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -3.1F, 2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r184 = heads.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(85, 20).addBox(-2.0F, -2.0811F, -1.9821F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.0F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r185 = heads.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(33, 105).mirror().addBox(-1.0F, -0.0764F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 105).addBox(2.0F, -0.0764F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, -0.1F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r186 = heads.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(98, 44).mirror().addBox(-1.0F, -1.2724F, -2.2821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(98, 44).addBox(2.0F, -1.2724F, -2.2821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 3.2551F, 1.6206F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r187 = heads.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(85, 74).addBox(-2.0F, 0.0116F, -1.9447F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.1F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r188 = heads.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 66).addBox(-2.0F, -0.4F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftHead = heads.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offset(1.6F, -0.4631F, -3.1808F));

		PartDefinition cube_r189 = leftHead.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(103, 27).addBox(-0.16F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(104, 6).addBox(-0.38F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 101).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftHead.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(104, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3F, 4.0518F, -6.8991F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftHead.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(104, 43).addBox(-0.5F, 0.9329F, -0.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(105, 39).addBox(-0.99F, 0.3329F, -1.1458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 2.4544F, -5.4572F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftHead.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(100, 48).addBox(-1.4F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5407F, -7.09F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftHead.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(104, 57).addBox(-0.5F, -0.2998F, 0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 100).addBox(-0.5F, -2.2998F, 1.1506F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, 0.0909F, 0.0522F, 0.0699F));

		PartDefinition cube_r194 = leftHead.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 104).addBox(-0.5F, -0.6528F, -2.4521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, 0.7891F, 0.0522F, 0.0699F));

		PartDefinition cube_r195 = leftHead.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(104, 60).addBox(-0.5F, 0.7936F, -1.7672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, -0.2756F, 0.0522F, 0.0699F));

		PartDefinition cube_r196 = leftHead.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 35).addBox(-0.5F, 0.383F, -1.3569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, -0.6596F, 0.0522F, 0.0699F));

		PartDefinition cube_r197 = leftHead.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(95, 89).addBox(-0.5F, -1.4352F, -1.2952F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, -0.7992F, 0.0522F, 0.0699F));

		PartDefinition cube_r198 = leftHead.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(97, 77).addBox(-0.5F, -1.9758F, -1.6366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, -1.061F, 0.0522F, 0.0699F));

		PartDefinition cube_r199 = leftHead.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(98, 19).addBox(-0.5F, -2.1376F, 0.6451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4F, 2.1977F, -3.5929F, -1.3752F, 0.0522F, 0.0699F));

		PartDefinition cube_r200 = leftHead.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(8, 105).addBox(-0.5F, -0.8301F, -0.9104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.297F, 3.1652F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftHead.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(16, 105).addBox(-0.5F, -0.0651F, -1.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1978F, 2.3662F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftHead.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5F, -0.9798F, -2.9749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.9022F, 2.4662F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftHead.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(27, 100).addBox(-0.5F, -1.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(100, 39).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2022F, 0.0662F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftHead.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(28, 105).addBox(-0.5F, 0.2851F, -0.9437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7978F, 0.0662F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftHead.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 101).addBox(-0.5F, -1.4316F, -0.0819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.2022F, -0.4338F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftHead.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(10, 93).addBox(-0.3173F, -0.1605F, -0.1376F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6F, 0.4252F, -4.1567F, -0.9324F, 0.1104F, 0.1715F));

		PartDefinition cube_r207 = leftHead.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 4).addBox(-0.0254F, -0.0502F, -0.1011F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.4748F, -2.0567F, -0.8495F, 0.0318F, 0.1219F));

		PartDefinition cube_r208 = leftHead.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(33, 86).addBox(-0.3057F, -4.4426F, -2.1146F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6F, 0.1252F, -4.7567F, -1.7396F, 0.0318F, 0.1219F));

		PartDefinition cube_r209 = leftHead.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(95, 94).addBox(-0.5F, -0.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4369F, -0.936F, -0.1488F, 0.6015F, 0.1559F, 1.495F));

		PartDefinition rightHead = heads.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offset(-1.6F, -0.4631F, -3.1808F));

		PartDefinition cube_r210 = rightHead.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 27).mirror().addBox(-0.84F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(104, 6).mirror().addBox(-0.62F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(50, 101).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightHead.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(104, 36).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3F, 4.0518F, -6.8991F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightHead.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 43).mirror().addBox(-0.5F, 0.9329F, -0.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(105, 39).mirror().addBox(-0.01F, 0.3329F, -1.1458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.4544F, -5.4572F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightHead.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(100, 48).mirror().addBox(0.4F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5407F, -7.09F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightHead.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(104, 57).mirror().addBox(-0.5F, -0.2998F, 0.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 100).mirror().addBox(-0.5F, -2.2998F, 1.1506F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, 0.0909F, -0.0522F, -0.0699F));

		PartDefinition cube_r215 = rightHead.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(59, 104).mirror().addBox(-0.5F, -0.6528F, -2.4521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, 0.7891F, -0.0522F, -0.0699F));

		PartDefinition cube_r216 = rightHead.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.5F, 0.7936F, -1.7672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, -0.2756F, -0.0522F, -0.0699F));

		PartDefinition cube_r217 = rightHead.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 35).mirror().addBox(-0.5F, 0.383F, -1.3569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, -0.6596F, -0.0522F, -0.0699F));

		PartDefinition cube_r218 = rightHead.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(95, 89).mirror().addBox(-0.5F, -1.4352F, -1.2952F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, -0.7992F, -0.0522F, -0.0699F));

		PartDefinition cube_r219 = rightHead.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(97, 77).mirror().addBox(-0.5F, -1.9758F, -1.6366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, -1.061F, -0.0522F, -0.0699F));

		PartDefinition cube_r220 = rightHead.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-0.5F, -2.1376F, 0.6451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1977F, -3.5929F, -1.3752F, -0.0522F, -0.0699F));

		PartDefinition cube_r221 = rightHead.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(8, 105).mirror().addBox(-0.5F, -0.8301F, -0.9104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.297F, 3.1652F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightHead.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(16, 105).mirror().addBox(-0.5F, -0.0651F, -1.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1978F, 2.3662F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightHead.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-0.5F, -0.9798F, -2.9749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9022F, 2.4662F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightHead.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(27, 100).mirror().addBox(-0.5F, -1.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(100, 39).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2022F, 0.0662F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightHead.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(-0.5F, 0.2851F, -0.9437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7978F, 0.0662F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightHead.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 101).mirror().addBox(-0.5F, -1.4316F, -0.0819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2022F, -0.4338F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightHead.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.6827F, -0.1605F, -0.1376F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.4252F, -4.1567F, -0.9324F, -0.1104F, -0.1715F));

		PartDefinition cube_r228 = rightHead.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(35, 4).mirror().addBox(-0.9746F, -0.0502F, -0.1011F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.4748F, -2.0567F, -0.8495F, -0.0318F, -0.1219F));

		PartDefinition cube_r229 = rightHead.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.6943F, -4.4426F, -2.1146F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.1252F, -4.7567F, -1.7396F, -0.0318F, -0.1219F));

		PartDefinition cube_r230 = rightHead.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(95, 94).mirror().addBox(-0.5F, -0.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4369F, -0.936F, -0.1488F, 0.6015F, -0.1559F, -1.495F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(86, 49).addBox(1.0F, -0.3F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(86, 49).mirror().addBox(-2.0F, -0.3F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, 2.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.7F, -0.8445F, -3.6776F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 84).mirror().addBox(-1.0F, -0.0445F, -2.7776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 22).addBox(1.7F, -0.8445F, -3.6776F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(34, 38).addBox(0.0F, -0.0445F, -3.7776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 84).addBox(1.0F, -0.0445F, -2.7776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -9.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 9).mirror().addBox(-0.5F, -0.0047F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 9).addBox(1.5F, -0.0047F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.932F, -13.7441F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(64, 87).mirror().addBox(-0.5F, -0.9673F, -0.057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 87).addBox(1.5F, -0.9673F, -0.057F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.532F, -12.8441F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 65).addBox(1.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.9077F, -8.5109F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-1.0F, 0.034F, -3.0765F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 0).addBox(1.0F, 0.034F, -3.0765F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -6.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-1.0F, 0.0209F, -2.0182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 95).addBox(2.0F, 0.0209F, -2.0182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.8F, -5.0F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-1.0F, -1.0595F, -2.9841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 4).addBox(2.0F, -1.0595F, -2.9841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.2F, -5.7F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(93, 47).mirror().addBox(-1.0F, -3.0172F, -2.0232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 47).addBox(2.0F, -3.0172F, -2.0232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.6F, -3.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(-1.0F, -1.0379F, -1.9648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 59).addBox(2.0F, -1.0379F, -1.9648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.2F, -1.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-1.0F, -1.01F, -0.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 43).addBox(2.0F, -1.01F, -0.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7F, -0.9F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(17, 101).mirror().addBox(-0.43F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(17, 101).addBox(2.63F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6F, 0.7352F, -4.1151F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(46, 75).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 75).addBox(2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3F, -1.5F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(74, 76).addBox(-1.5F, -1.2248F, -1.4437F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.1F, -0.3F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftLeg1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(64, 49).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.2842F, 0.682F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftLeg1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 85).addBox(-5.5F, -0.1024F, -0.0698F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 6.8752F, -1.4437F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftLeg1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(63, 76).addBox(-5.5F, -8.0F, -2.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0F, 6.7752F, 0.5563F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2752F, 0.5563F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftLeg2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 12).addBox(-1.5F, -1.5F, -2.2F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.6353F, 0.323F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftLeg2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(19, 18).addBox(-3.5F, -11.2914F, -0.9297F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 13.9472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftLeg2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(11, 73).addBox(-3.5F, -0.3064F, -0.354F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 2.9472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftLeg2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(96, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.6977F, 0.9121F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftLeg2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 90).addBox(-2.5F, 0.1715F, -0.731F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(68, 66).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 14.1472F, -1.1617F, -0.7679F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(61, 59).addBox(-3.0F, -1.0746F, -2.9368F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5553F, 0.4261F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(55, 28).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5746F, -2.9368F, 0.0125F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -1.2248F, -1.4437F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.1F, -0.3F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightLeg1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(13, 53).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.2842F, 0.682F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightLeg1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(34, 43).addBox(2.5F, -0.1024F, -0.0698F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 6.8752F, -1.4437F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightLeg1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 0).addBox(2.5F, -8.0F, -2.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.0F, 6.7752F, 0.5563F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2752F, 0.5563F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightLeg2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -1.5F, -2.2F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.6353F, 0.323F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightLeg2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -11.2914F, -0.9297F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 13.9472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightLeg2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 71).addBox(0.5F, -0.3064F, -0.354F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 2.9472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightLeg2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(17, 96).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.6977F, 0.9121F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightLeg2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(75, 87).addBox(1.5F, 0.1715F, -0.731F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 2.5472F, 0.9883F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(53, 66).addBox(-2.5F, -0.4447F, -0.8239F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 14.1472F, -1.1617F, -0.5934F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(40, 59).addBox(-3.0F, -1.0746F, -2.9368F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5553F, 0.4261F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(51, 41).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5746F, -2.9368F, 0.0125F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 43).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.006F))
				.texOffs(24, 96).addBox(0.0F, -6.3F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 7.0F, -0.13F, 0.1688F, -0.0566F));

		PartDefinition cube_r259 = tail.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(66, 99).addBox(0.0F, -5.1605F, 4.0049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 99).addBox(0.0F, -5.3605F, 2.0049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(0.0F, -5.6605F, 0.0049F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 4.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(11, 18).mirror().addBox(-0.016F, -2.0F, 6.1484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 18).mirror().addBox(-0.016F, -1.8F, 8.2484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0791F, -0.1747F, 0.0F, -0.0175F, -1.5708F));

		PartDefinition cube_r261 = tail.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(11, 18).addBox(0.016F, -1.8F, 8.2484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(0.016F, -2.0F, 6.1484F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(0.016F, -2.0F, 4.1484F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(0.016F, -2.5F, 2.1484F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(0.016F, -3.0F, 0.1484F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0791F, -0.1747F, 0.0F, 0.0175F, 1.5708F));

		PartDefinition cube_r262 = tail.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(13, 50).addBox(0.0F, 0.8077F, 1.8445F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 0).addBox(0.0F, -0.3923F, -0.1555F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2225F, 6.443F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r263 = tail.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(85, 99).addBox(0.0F, 0.5927F, 1.7093F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 99).addBox(0.0F, -0.0073F, -0.2907F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2225F, 2.143F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r264 = tail.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(30, 18).addBox(0.0F, -5.9F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 21).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.9F, 0.108F, 0.1354F, -0.0332F));

		PartDefinition cube_r265 = tail2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(6, 101).addBox(0.0F, -3.0519F, 5.9609F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 20).addBox(0.0F, -3.1519F, 4.0609F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 103).addBox(0.0F, -3.1519F, 2.0609F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 69).addBox(0.0F, -3.2519F, 0.0609F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r266 = tail2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(14, 100).addBox(0.0F, -3.5647F, 0.0363F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 4.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r267 = tail2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(38, 20).addBox(0.0F, 7.6077F, 13.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 36).addBox(0.0F, 5.8077F, 11.8445F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 80).addBox(0.0F, 4.9077F, 9.8445F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 85).addBox(0.0F, 4.0077F, 7.8445F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 26).addBox(0.0F, 2.3077F, 5.8445F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2225F, -3.457F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r268 = tail2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(11, 26).addBox(0.0F, -0.1942F, 0.1036F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7225F, 0.543F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r269 = tail2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(69, 100).addBox(0.0F, -4.5F, 1.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r270 = tail2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(0.2F, -0.7F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.6F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.6F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.5F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.5F, 7.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.4F, 9.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 99).mirror().addBox(0.2F, -0.3F, 11.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1953F, 0.2241F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r271 = tail2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(91, 99).addBox(-0.2F, -0.3F, 11.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.4F, 9.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.5F, 7.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.5F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.6F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.6F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-0.2F, -0.7F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1953F, 0.2241F, 0.0F, 0.0F, 1.5708F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.0F, -0.0811F, 0.3416F, -0.1423F));

		PartDefinition cube_r272 = tail3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(38, 28).addBox(0.0F, -2.0F, 12.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 75).addBox(0.0F, -2.0F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 76).addBox(0.0F, -2.0F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 32).addBox(0.0F, -2.0F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 68).addBox(0.0F, -2.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 79).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 87).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r273 = tail3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(50, 4).addBox(0.0F, 13.8077F, 25.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 50).addBox(0.0F, 12.8077F, 23.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 12).addBox(0.0F, 11.9077F, 21.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 4).addBox(0.0F, 9.9077F, 19.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 46).addBox(0.0F, 9.1077F, 17.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 37).addBox(0.0F, 8.3077F, 15.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2225F, -17.457F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 4).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(73, 9).addBox(0.0F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 56).addBox(0.0F, -1.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 12).addBox(0.0F, -1.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 49).addBox(0.0F, -1.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 60).addBox(0.0F, -1.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 53).addBox(0.0F, -0.9F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 53).addBox(0.0F, -0.8F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 14.0F, -0.1801F, 0.2839F, -0.1608F));

		PartDefinition cube_r274 = tail4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(82, 63).addBox(0.0F, 20.8077F, 39.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 87).addBox(0.0F, 19.6077F, 37.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 91).addBox(0.0F, 18.6077F, 35.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 55).addBox(0.0F, 17.5077F, 33.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 0).addBox(0.0F, 16.4077F, 31.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 38).addBox(0.0F, 15.5077F, 29.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 50).addBox(0.0F, 14.7077F, 27.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8225F, -31.457F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(41, 28).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.9F, -0.2074F, 0.3851F, -0.0789F));

		PartDefinition cube_r275 = tail5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(78, 46).addBox(0.0F, 21.5077F, 41.8445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8225F, -45.357F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.9F, -0.3468F, 0.6251F, -0.2084F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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