package fossils.fossils.client.blockentity.model.yuanyanglong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YuanyanglongFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public YuanyanglongFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck = this.neck5.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 7.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.6F, -6.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 25).addBox(-0.5F, -1.0012F, 0.0471F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 25).mirror().addBox(-1.0F, -0.2231F, -2.1435F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(5, 25).addBox(0.8F, -0.2231F, -2.1435F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9F, -0.5537F, -0.2254F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-0.0201F, 6.502F, -5.3985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(35, 55).mirror().addBox(-0.0201F, 6.502F, -4.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 1.8163F, -0.7929F, 0.2943F, -0.2711F, -0.0705F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 37).mirror().addBox(0.1915F, 2.4773F, 0.2262F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 1.8163F, -0.7929F, -0.4054F, -0.2056F, -0.0624F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-0.1905F, -0.0983F, -0.5603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.86F, 1.8163F, -0.7929F, -0.0633F, -0.1426F, -0.2001F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 26).mirror().addBox(-0.1258F, -0.9149F, -1.9526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9139F, 1.7435F, 0.9776F, 0.473F, -0.0135F, -0.1044F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-0.6874F, -0.2561F, -0.4063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.36F, 1.4163F, 0.5071F, 0.3794F, 0.1647F, -0.2828F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-0.5895F, 1.1023F, -2.1357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.36F, 1.4163F, 0.5071F, 1.2305F, 0.1239F, -0.2192F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 37).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7139F, 0.2435F, -0.0224F, -0.0331F, -0.0135F, -0.052F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 39).mirror().addBox(-0.3384F, -0.5941F, -0.6795F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8415F, 0.5025F, -0.9162F, 0.1355F, 0.0315F, -0.0505F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.5F, -0.0693F, -1.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 61).addBox(2.5F, -0.0693F, -1.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -1.6514F, 1.218F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-1.2183F, -4.7379F, -2.1374F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 2.1163F, -0.6929F, 0.2994F, 0.2079F, 0.0259F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 53).mirror().addBox(-0.4309F, -0.0053F, -1.0057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1376F, -1.8141F, -3.8892F, 0.7008F, 0.2079F, 0.0259F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 12).mirror().addBox(-1.2183F, -4.1974F, -2.5422F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.76F, 2.1163F, -0.6929F, 0.0027F, 0.2079F, 0.0259F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-0.5F, -0.0699F, -2.039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(49, 39).addBox(2.5F, -0.0699F, -2.039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -2.0514F, 0.318F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(34, 24).addBox(2.5F, -0.5F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, -1.2583F, -0.1671F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 44).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 44).addBox(2.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0881F, 1.3985F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 22).mirror().addBox(-0.5F, -0.8535F, -1.4747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(43, 22).addBox(2.5F, -0.8535F, -1.4747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, -0.5881F, 2.1985F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 12).addBox(0.2183F, -4.1974F, -2.5422F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.76F, 2.1163F, -0.6929F, 0.0027F, -0.2079F, -0.0259F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(41, 53).addBox(-0.5691F, -0.0053F, -1.0057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1376F, -1.8141F, -3.8892F, 0.7008F, -0.2079F, -0.0259F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 0).addBox(0.2183F, -4.7379F, -2.1374F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.76F, 2.1163F, -0.6929F, 0.2994F, -0.2079F, -0.0259F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 26).addBox(-0.8742F, -0.9149F, -1.9526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9139F, 1.7435F, 0.9776F, 0.473F, 0.0135F, 0.1044F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 37).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7139F, 0.2435F, -0.0224F, -0.0331F, 0.0135F, 0.052F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 39).addBox(-0.6616F, -0.5941F, -0.6795F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8415F, 0.5025F, -0.9162F, 0.1355F, -0.0315F, 0.0505F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(31, 50).addBox(-0.3126F, -0.2561F, -0.4063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.36F, 1.4163F, 0.5071F, 0.3794F, -0.1647F, 0.2828F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(50, 25).addBox(-0.4105F, 1.1023F, -2.1357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.36F, 1.4163F, 0.5071F, 1.2305F, -0.1239F, 0.2192F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 61).addBox(-0.4105F, 1.5514F, -2.3111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.66F, 1.4163F, 0.5071F, 1.056F, -0.1239F, 0.3763F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 53).addBox(-0.8095F, -0.0983F, -0.5603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, 1.8163F, -0.7929F, -0.0633F, 0.1426F, 0.2001F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(23, 37).addBox(-1.1915F, 2.4773F, 0.2262F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.86F, 1.8163F, -0.7929F, -0.4054F, 0.2056F, 0.0624F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 55).addBox(-0.9799F, 6.502F, -4.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(44, 39).addBox(-0.9799F, 6.502F, -5.3985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.86F, 1.8163F, -0.7929F, 0.2943F, 0.2711F, 0.0705F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.55F, 0.7234F, -0.3841F, -0.1913F, 0.0166F, 0.0857F));

		PartDefinition cube_r32 = leftLeg1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.2837F, -0.4058F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(5, 50).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1837F, -0.4058F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.0209F, -0.101F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0837F, 0.6942F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.1837F, -0.4058F, 0.2007F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(41, 17).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(18, 25).addBox(-0.9F, 1.9946F, -0.022F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 9.488F, 2.968F, 1.6756F, -0.0434F, -0.0046F));

		PartDefinition cube_r36 = leftLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 41).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(5, 31).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1466F, 0.0891F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 5).addBox(-1.6F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.998F, -0.3342F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(23, 32).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(28, 37).addBox(-2.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 0.7234F, -0.3841F, -1.1964F, 0.0256F, -0.065F));

		PartDefinition cube_r37 = rightLeg1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2837F, -0.4058F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1837F, -0.4058F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.0209F, -0.101F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0837F, 0.6942F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1837F, -0.4058F, 0.2007F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(18, 25).mirror().addBox(-0.1F, 1.9946F, -0.022F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.488F, 2.968F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 41).mirror().addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(5, 31).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.1466F, 0.0891F, -0.3924F, 0.0167F, 0.0403F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(19, 12).mirror().addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 5).mirror().addBox(-0.4F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.998F, -0.3342F, 0.3914F, -0.0334F, 0.0807F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(23, 32).mirror().addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(28, 37).mirror().addBox(0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.0732F, 0.0359F, -0.6787F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 35).mirror().addBox(-3.891F, -0.4534F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.0434F, 0.0889F, -1.1479F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, -0.0802F, 0.1532F, -1.5361F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.0108F, 0.1724F, -0.9879F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.0824F, 0.125F, -0.5137F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.0732F, -0.0359F, 0.6787F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(41, 35).addBox(0.891F, -0.4534F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.0434F, -0.0889F, 1.1479F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 48).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, -0.0802F, -0.1532F, 1.5361F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.0108F, -0.1724F, 0.9879F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.0824F, -0.125F, 0.5137F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -1.9612F, -3.9789F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3434F, -1.3099F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(19, 0).addBox(-2.5F, -0.9886F, -2.923F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4434F, -4.8099F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(10, 63).addBox(-0.5F, -1.0016F, -0.0017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 5).addBox(-1.0F, 0.0044F, -6.9051F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.8F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 63).addBox(-0.5F, -0.6964F, -1.2441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 45).addBox(-1.0F, 0.0036F, -2.2441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 33).addBox(-0.5F, -1.309F, 0.9833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(20, 63).addBox(-0.5F, -1.076F, 0.8892F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-3.9698F, 0.1436F, -0.5411F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6366F, 6.4371F, -2.8418F, -0.222F, 1.027F, 0.4113F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(0.3842F, -1.8193F, -0.1636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 5.8261F, -4.8865F, 0.888F, -0.0037F, 0.0374F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-1.3903F, -0.7334F, -1.7068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 1.3261F, -4.8865F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(10, 57).mirror().addBox(-1.3903F, -0.2742F, -0.2153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, -0.2739F, -2.2865F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(43, 4).mirror().addBox(-1.3903F, -0.2398F, -0.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 0.9261F, -5.1865F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -4.5269F, 0.4469F, 0.2514F, -0.5259F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -4.5269F, 0.2871F, 0.4469F, -0.9837F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -4.5269F, -0.0043F, 0.5259F, -1.5916F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -2.5269F, 0.2976F, 0.2483F, -0.455F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -2.5269F, 0.1476F, 0.3788F, -0.9319F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -2.5269F, -0.0797F, 0.3978F, -1.5174F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(32, 10).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.5269F, -0.0031F, 0.3021F, -1.4422F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.5269F, 0.1565F, 0.2595F, -0.8802F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.5269F, 0.2501F, 0.138F, -0.4153F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(35, 42).mirror().addBox(-1.3903F, -0.1911F, -0.2651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(35, 42).addBox(3.6097F, -0.1911F, -0.2651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.6097F, 0.1261F, -3.7865F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(42, 42).mirror().addBox(-1.3903F, -0.5649F, -0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 2.3261F, -6.0865F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-0.1597F, 0.1578F, -1.2102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1124F, 2.7262F, -5.6776F, 0.1418F, -0.5239F, -0.5752F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(0.3345F, -2.7673F, -0.2337F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 6.9261F, -2.5865F, 1.0974F, -0.0037F, 0.0374F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-2.6568F, 0.0948F, -0.9148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6366F, 6.0371F, -3.3418F, 0.0789F, 0.6136F, 0.8895F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -4.5269F, 0.4469F, -0.2514F, 0.5259F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(55, 16).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -4.5269F, 0.2871F, -0.4469F, 0.9837F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(55, 14).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -4.5269F, -0.0043F, -0.5259F, 1.5916F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(62, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -2.5269F, 0.2976F, -0.2483F, 0.455F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 12).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -2.5269F, 0.1476F, -0.3788F, 0.9319F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(36, 0).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -2.5269F, -0.0797F, -0.3978F, 1.5174F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(32, 10).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.5269F, -0.0031F, -0.3021F, 1.4422F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 37).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.5269F, 0.1565F, -0.2595F, 0.8802F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.5269F, 0.2501F, -0.138F, 0.4153F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 57).addBox(0.3903F, -0.2742F, -0.2153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, -0.2739F, -2.2865F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(43, 4).addBox(0.3903F, -0.2398F, -0.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 0.9261F, -5.1865F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(43, 8).addBox(0.3903F, -0.7334F, -1.7068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 1.3261F, -4.8865F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(42, 42).addBox(0.3903F, -0.5649F, -0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.6097F, 2.3261F, -6.0865F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(55, 30).addBox(-0.8403F, 0.1578F, -1.2102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1124F, 2.7262F, -5.6776F, 0.1418F, 0.5239F, 0.5752F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 53).addBox(-1.3842F, -1.8193F, -0.1636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 5.8261F, -4.8865F, 0.888F, 0.0037F, -0.0374F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 4).addBox(-1.3345F, -2.7673F, -0.2337F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 6.9261F, -2.5865F, 1.0974F, 0.0037F, -0.0374F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(36, 2).addBox(-0.0302F, 0.1436F, -0.5411F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6366F, 6.4371F, -2.8418F, -0.222F, -1.027F, -0.4113F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 37).addBox(-0.3432F, 0.0948F, -0.9148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6366F, 6.0371F, -3.3418F, 0.0789F, -0.6136F, -0.8895F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(30, 12).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1436F, 3.1193F, -4.8012F, 0.8985F, 0.3187F, -0.1359F));

		PartDefinition cube_r98 = leftArm1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(55, 4).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftArm1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 54).addBox(0.0F, -2.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(36, 50).addBox(0.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0972F, 4.1035F, -0.291F, -2.0948F, 0.0387F, -0.0202F));

		PartDefinition cube_r101 = leftArm2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, -0.0888F, -0.4065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 1.6531F, 0.1416F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(48, 50).addBox(-0.5F, -2.4116F, -0.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 1.6531F, 0.1416F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 50).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(41, 30).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(12, 31).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 47).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1588F, 3.6311F, -0.2472F, 0.9973F, -0.212F, 0.2292F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(34, 30).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1436F, 3.1193F, -4.8012F, 0.6367F, -0.3187F, 0.1359F));

		PartDefinition cube_r105 = rightArm1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightArm1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-1.0F, -2.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightArm1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(36, 50).mirror().addBox(-1.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0972F, 4.1035F, -0.291F, -2.0948F, -0.0387F, 0.0202F));

		PartDefinition cube_r108 = rightArm2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.5F, -0.0888F, -0.4065F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.6531F, 0.1416F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightArm2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.5F, -2.4116F, -0.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.6531F, 0.1416F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightArm2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightArm2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(12, 31).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 47).mirror().addBox(0.0F, 1.7F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1588F, 3.6311F, -0.2472F, 0.9973F, 0.212F, -0.2292F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -5.8F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r112 = neck3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(6, 65).addBox(-0.5F, -1.5643F, 0.2306F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 62).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r113 = neck3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(55, 26).mirror().addBox(0.0F, -0.5349F, -0.0012F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2865F, -0.9737F, -0.7522F, -0.5052F, 0.5654F));

		PartDefinition cube_r114 = neck3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(3, 65).mirror().addBox(0.0F, -0.5155F, 0.0187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6F, -2.8F, -0.7894F, -0.4318F, 0.2166F));

		PartDefinition cube_r115 = neck3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(55, 26).addBox(0.0F, -0.5349F, -0.0012F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2865F, -0.9737F, -0.7522F, 0.5052F, -0.5654F));

		PartDefinition cube_r116 = neck3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(63, 49).addBox(-0.5F, -1.3F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 46).addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(3, 65).addBox(0.0F, -0.5155F, 0.0187F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.8F, -0.7894F, 0.4318F, -0.2166F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(63, 52).addBox(-0.5F, -0.3262F, 1.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 46).addBox(-1.0F, -0.0262F, 1.9312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9F, -2.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(0.0F, -0.528F, -0.0795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8339F, -1.6339F, -1.1768F, -0.2014F, 0.2807F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(55, 64).addBox(0.0F, -0.528F, -0.0795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8339F, -1.6339F, -1.1768F, 0.2014F, -0.2807F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0F, -1.2F, -0.0475F, -0.346F, 0.1392F));

		PartDefinition cube_r121 = neck4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(43, 64).addBox(-0.5F, -2.0F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 52).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.6F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(0.0F, 0.0373F, -0.4643F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7575F, -1.1684F, -0.0495F, 0.017F, 0.3312F));

		PartDefinition cube_r123 = neck4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(52, 64).addBox(0.0F, 0.0373F, -0.4643F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7575F, -1.1684F, -0.0495F, -0.017F, -0.3312F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r124 = neck5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(37, 64).addBox(-0.5F, -1.2F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 22).addBox(-1.0F, -2.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(0.0F, -0.017F, -0.6294F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8432F, -0.5505F, -0.0543F, -0.0515F, 0.2982F));

		PartDefinition cube_r126 = neck5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(49, 64).addBox(0.0F, -0.017F, -0.6294F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8432F, -0.5505F, -0.0543F, 0.0515F, -0.2982F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.79F, -0.4566F, -0.2375F, -0.2974F, 0.0708F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 62).addBox(0.0F, -0.6762F, -0.0153F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.143F, -1.7968F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(34, 64).addBox(0.0F, -0.3617F, 0.947F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 46).addBox(-0.5F, -0.0617F, -0.053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.843F, -0.7968F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r129 = neck.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(0.0F, -0.8544F, -0.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.543F, -0.9968F, -1.4344F, -0.0301F, 0.2161F));

		PartDefinition cube_r130 = neck.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(46, 64).addBox(0.0F, -0.8544F, -0.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.543F, -0.9968F, -1.4344F, 0.0301F, -0.2161F));

		PartDefinition cube_r131 = neck.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(33, 46).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.643F, -2.6968F, -0.4014F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.343F, -2.6968F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(60, 24).mirror().addBox(-0.5F, -0.6807F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(60, 27).mirror().addBox(-0.5F, -0.7807F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 27).addBox(0.74F, -0.7807F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 24).addBox(0.74F, -0.6807F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.62F, 0.9968F, 0.0014F, 2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-0.5F, -0.6789F, -0.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 18).addBox(0.74F, -0.6789F, -0.3578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.62F, 0.5968F, -0.0986F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(20, 60).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(30, 59).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(60, 21).addBox(0.74F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(20, 60).addBox(0.74F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(30, 59).addBox(0.74F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.62F, -0.0032F, -0.5986F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(60, 3).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 3).addBox(0.74F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.62F, -0.0032F, -0.5986F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(30, 59).addBox(-0.64F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.52F, -0.6108F, -0.6256F, -3.1416F, -0.3142F, -1.5708F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 59).addBox(-0.68F, -0.5F, -0.3458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.52F, -0.7108F, -0.9256F, -3.1416F, 0.4712F, -1.5708F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-0.32F, -0.5F, -0.3458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.52F, -0.7108F, -0.9256F, -3.1416F, -0.4712F, 1.5708F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-0.36F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.52F, -0.6108F, -0.6256F, -3.1416F, 0.3142F, 1.5708F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-0.5F, -0.6897F, -0.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(10, 60).addBox(0.74F, -0.6897F, -0.3221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.62F, 0.1968F, -0.1986F, -2.81F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(-0.565F, -0.3699F, -0.6017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(58, 50).addBox(0.075F, -0.3699F, -0.6017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.565F, -0.6938F, -0.5522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(50, 58).addBox(0.075F, -0.6938F, -0.5522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-0.665F, -0.3219F, -0.8828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 58).addBox(0.175F, -0.3219F, -0.8828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-0.565F, -0.2447F, -0.2269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(58, 53).addBox(0.075F, -0.2447F, -0.2269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-0.565F, -0.9201F, -0.4652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(46, 55).addBox(0.075F, -0.9201F, -0.4652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-0.565F, -0.7551F, -0.2593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(45, 58).addBox(0.075F, -0.7551F, -0.2593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.255F, 0.8669F, -1.2937F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.5F, -0.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 55).addBox(0.1F, -0.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.278F, -0.858F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-1.2F, -0.1906F, -0.8108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 18).addBox(-0.8F, -0.1906F, -0.8108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.1285F, -1.8506F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 41).mirror().addBox(-0.8F, -1.7464F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 41).addBox(-0.2F, -1.7464F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.0065F, -1.3685F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.6F, -0.7639F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(59, 0).addBox(0.24F, -0.7639F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.32F, 1.1118F, -1.9629F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(25, 59).mirror().addBox(-0.6F, -0.2363F, -0.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 59).addBox(0.24F, -0.2363F, -0.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, 1.9118F, -1.8629F, 2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-0.5F, -0.6281F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(35, 58).mirror().addBox(-0.5F, -0.8281F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 58).addBox(-0.06F, -0.8281F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 58).addBox(-0.06F, -0.6281F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.22F, 1.7907F, -2.4144F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 58).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 58).addBox(-0.06F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(56, 39).addBox(-0.06F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.22F, 1.9907F, -2.2144F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-0.6F, -0.2585F, -0.2997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 59).addBox(0.24F, -0.2585F, -0.2997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.32F, 1.6118F, -2.1629F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(40, 57).mirror().addBox(-1.0F, -0.1749F, 0.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(40, 57).addBox(0.0F, -0.1749F, 0.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(49, 43).addBox(-1.0F, -0.1749F, -0.2264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.778F, -0.858F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(48, 16).addBox(-1.3F, -0.2254F, -0.2455F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.478F, -1.358F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(57, 34).addBox(-1.0F, -0.2269F, -0.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, 2.5246F, -2.0315F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(20, 57).addBox(-1.0F, -0.1687F, -0.2275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.9832F, -2.3776F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(48, 12).addBox(-1.0F, -0.2308F, -0.2012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, 1.4832F, -2.5776F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(12, 48).addBox(-1.0F, -0.2312F, -0.1802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.8832F, -2.5776F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, -0.1604F, -0.1869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, 0.2832F, -2.2776F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(25, 55).addBox(-0.3F, -0.276F, -0.172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.6065F, -1.8685F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.435F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 30).mirror().addBox(-0.565F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false)
				.texOffs(60, 30).addBox(0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F))
				.texOffs(56, 42).addBox(0.345F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.455F, 0.7075F, -1.4329F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 34).addBox(-1.0F, -0.7424F, -0.2034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.9793F, -0.7605F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(50, 9).addBox(-1.0F, -0.6283F, -1.3187F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 46).addBox(-1.0F, -1.6283F, -0.7187F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.7793F, 0.4395F, 0.576F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.9338F, 0.6112F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-0.5F, -0.4758F, -1.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 61).mirror().addBox(-0.5F, -0.4758F, -0.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 60).mirror().addBox(-0.5F, -0.4758F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false)
				.texOffs(61, 46).addBox(0.9F, -0.4758F, -1.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 61).addBox(0.9F, -0.4758F, -0.803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 60).addBox(0.9F, -0.4758F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(-0.8F, 0.0799F, -0.0802F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-0.52F, -0.7773F, 0.3158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 40).mirror().addBox(-0.52F, -0.7773F, -0.0842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(19, 49).mirror().addBox(-0.5F, -0.7099F, -0.2842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 43).addBox(0.32F, -0.7773F, 0.3158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 40).addBox(0.32F, -0.7773F, -0.0842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(19, 49).addBox(0.3F, -0.7099F, -0.2842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.7799F, -1.8802F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.2724F, -1.0897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 59).mirror().addBox(-0.5F, -0.2724F, -0.6897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 61).addBox(0.3F, -0.2724F, -1.0897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 59).addBox(0.3F, -0.2724F, -0.6897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.1201F, -1.1802F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-0.5F, -0.4758F, -1.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false)
				.texOffs(60, 56).addBox(0.9F, -0.4758F, -1.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(-0.8F, 0.0799F, -0.0802F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-0.5F, -0.4758F, -1.503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(48, 30).addBox(0.9F, -0.4758F, -1.503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(-0.8F, 0.0799F, -0.0802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 8).addBox(0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8F, 0.0799F, 0.0198F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(61, 37).addBox(-0.5F, -0.7442F, -0.3114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 1.0799F, -2.1802F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 61).addBox(-0.5F, -0.2618F, -1.1282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(15, 61).addBox(-0.5F, -0.2618F, -0.7282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.1799F, -1.8802F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(65, 3).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3174F, 2.6015F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition cube_r174 = tail.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(25, 62).addBox(0.0F, -1.1719F, -0.3732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9809F, 2.9397F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(31, 62).addBox(0.0F, -1.4F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 17).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(64, 0).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 64).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 64).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.128F, -0.3031F, -0.0384F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 16).addBox(0.0F, 2.1F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 62).addBox(0.0F, 0.6F, 3.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5077F, -0.9941F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(19, 39).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2813F, 1.0582F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2913F, -0.0804F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.2096F, 6.0005F, -0.1737F, 0.3011F, -0.052F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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