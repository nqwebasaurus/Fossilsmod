package fossils.fossils.client.blockentity.model.asiatyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AsiatyrannusFossilModel extends SkullModelBase {
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
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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

	public AsiatyrannusFossilModel(ModelPart root) {
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
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.2F, -5.0F, 0.0435F, -0.0057F, 0.0433F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 5).addBox(0.0F, 0.0554F, -0.0148F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 52).mirror().addBox(-0.1428F, 0.1916F, 2.3501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.8777F, -0.8696F, -1.3701F, 0.0F, -0.0873F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 39).mirror().addBox(-0.1428F, 1.4121F, 3.286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.8777F, -0.8696F, -1.7715F, 0.0F, -0.0873F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 57).mirror().addBox(-0.1428F, 2.0723F, 0.2431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.8777F, -0.8696F, -0.7941F, 0.0F, -0.0873F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 47).mirror().addBox(-0.1428F, 2.2562F, -0.8602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.8777F, -0.8696F, -0.3229F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 3).mirror().addBox(-0.5F, -1.8905F, -0.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(57, 3).addBox(1.7F, -1.8905F, -0.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.1F, 1.4998F, -1.4828F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-0.2F, -0.1837F, -0.4377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5777F, -0.8696F, -0.2356F, 0.0F, -0.5236F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 52).mirror().addBox(-0.1428F, -0.1359F, -0.8342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.8777F, -0.8696F, -0.4102F, 0.0F, -0.0873F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 65).addBox(1.7F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 1.8998F, -0.8828F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 43).mirror().addBox(-0.3698F, -0.4052F, -1.1679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.7F, 1.0F, 0.185F, -0.0147F, -0.3838F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 3).mirror().addBox(-0.1F, 0.1785F, -0.2943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7F, 1.0F, 0.1326F, 0.1148F, -0.3864F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.1F, -0.2725F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7F, 1.0F, 0.6911F, 0.1148F, -0.3864F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-0.3698F, 1.6547F, -1.0163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.7F, 1.0F, 1.3893F, -0.0147F, -0.3838F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.3698F, 0.1328F, -0.4456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.7F, 1.0F, 1.0926F, -0.0147F, -0.3838F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 54).mirror().addBox(-0.1F, -0.358F, -0.693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7F, 1.0F, 0.2024F, 0.1148F, -0.3864F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 43).mirror().addBox(-1.5F, -0.5798F, -2.0095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(12, 43).addBox(0.5F, -0.5798F, -2.0095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.9F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 59).mirror().addBox(-1.0F, 0.0225F, -2.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1F, -1.0F, 0.4538F, 0.3491F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-1.0F, -0.1425F, -2.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1F, -1.0F, 0.0873F, 0.3491F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-1.0F, -0.7392F, -2.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1F, -1.0F, 0.3665F, 0.3491F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 35).mirror().addBox(-1.0F, 0.0385F, -0.4462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0F, 1.0F, -0.0349F, -0.2967F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-1.0F, -1.056F, -1.7268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1F, -1.0F, 0.1396F, 0.3491F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(42, 40).mirror().addBox(-1.5F, 0.0296F, -1.9889F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(42, 40).addBox(0.5F, 0.0296F, -1.9889F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.0F, 1.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-1.0F, -0.93F, -0.2876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0F, 1.0F, -0.4014F, -0.2967F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 59).addBox(0.0F, 0.0225F, -2.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.0F, 0.4538F, -0.3491F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 59).addBox(0.0F, -0.1425F, -2.2187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.0F, 0.0873F, -0.3491F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 7).addBox(0.0F, -0.7392F, -2.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.0F, 0.3665F, -0.3491F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(44, 34).addBox(0.0F, -1.056F, -1.7268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.0F, 0.1396F, -0.3491F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 46).addBox(-0.6302F, 1.6547F, -1.0163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.7F, 1.0F, 1.3893F, 0.0147F, 0.3838F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 42).addBox(-0.6302F, 0.1328F, -0.4456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7F, 2.7F, 1.0F, 1.0926F, 0.0147F, 0.3838F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 43).addBox(-0.6302F, -0.4052F, -1.1679F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.7F, 1.0F, 0.185F, 0.0147F, 0.3838F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 3).addBox(-0.9F, 0.1785F, -0.2943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.4F, 1.7F, 1.0F, 0.1326F, -0.1148F, 0.3864F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 62).addBox(-0.9F, -0.2725F, -0.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 1.7F, 1.0F, 0.6911F, -0.1148F, 0.3864F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 39).addBox(-0.8572F, 1.4121F, 3.286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.8777F, -0.8696F, -1.7715F, 0.0F, 0.0873F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 47).addBox(-0.8572F, 2.2562F, -0.8602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.8777F, -0.8696F, -0.3229F, 0.0F, 0.0873F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 57).addBox(-0.8572F, 2.0723F, 0.2431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.7F, 2.8777F, -0.8696F, -0.7941F, 0.0F, 0.0873F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(17, 52).addBox(-0.8572F, 0.1916F, 2.3501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.7F, 2.8777F, -0.8696F, -1.3701F, 0.0F, 0.0873F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 52).addBox(-0.8572F, -0.1359F, -0.8342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.7F, 2.8777F, -0.8696F, -0.4102F, 0.0F, 0.0873F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(47, 54).addBox(-0.8F, -0.1837F, -0.4377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, 1.5777F, -0.8696F, -0.2356F, 0.0F, 0.5236F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(37, 54).addBox(-0.9F, -0.358F, -0.693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.4F, 1.7F, 1.0F, 0.2024F, -0.1148F, 0.3864F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 35).addBox(0.0F, 0.0385F, -0.4462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.0F, 1.0F, -0.0349F, 0.2967F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(11, 38).addBox(0.0F, -0.93F, -0.2876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.0F, 1.0F, -0.4014F, 0.2967F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 68).addBox(0.5F, -1.7198F, 3.9888F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 68).addBox(0.5F, -1.6198F, 1.9888F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 68).addBox(0.5F, -1.3198F, -0.0112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -4.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(17, 10).addBox(-1.5F, -1.8868F, -3.8884F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.4F, -0.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.9758F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3461F, -0.2705F, -0.0791F, -0.0593F, -0.6776F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-2.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3461F, -0.2705F, -0.0467F, -0.0871F, -1.1142F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.9758F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3461F, -2.2705F, 0.1328F, 0.0627F, -0.5899F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-2.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3461F, -2.2705F, 0.094F, 0.1128F, -1.0251F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-3.1849F, -1.9402F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3461F, -2.2705F, 0.0145F, 0.146F, -1.6228F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(-2.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -4.0705F, 0.1661F, 0.2122F, -0.9785F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(32, 23).mirror().addBox(-4.1849F, -1.9402F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -4.0705F, 0.0168F, 0.2682F, -1.5874F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-0.9758F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -4.0705F, 0.2395F, 0.1229F, -0.5451F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(57, 29).addBox(0.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3461F, -0.2705F, -0.0467F, 0.0871F, 1.1142F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 25).addBox(-0.0242F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3461F, -0.2705F, -0.0791F, 0.0593F, 0.6776F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 21).addBox(2.1849F, -1.9402F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3461F, -2.2705F, 0.0145F, -0.146F, 1.6228F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 57).addBox(0.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3461F, -2.2705F, 0.094F, -0.1128F, 1.0251F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(59, 53).addBox(-0.0242F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3461F, -2.2705F, 0.1328F, -0.0627F, 0.5899F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 14).addBox(-0.0242F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -4.0705F, 0.2395F, -0.1229F, 0.5451F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 23).addBox(2.1849F, -1.9402F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -4.0705F, 0.0168F, -0.2682F, 1.5874F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 19).addBox(0.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -4.0705F, 0.1661F, -0.2122F, 0.9785F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(15, 25).addBox(0.0F, -0.7F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(62, 68).addBox(0.5F, -1.5F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 68).addBox(0.5F, -1.1F, -3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 17).addBox(0.0F, -0.5F, -3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(28, 25).addBox(-1.0F, -0.9524F, -2.9998F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.7F, 0.0F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(0.0F, -1.5454F, -1.6953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.5705F, -3.4192F, 2.6035F, -0.4881F, -0.5423F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(0.0F, -0.8733F, -0.7481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.5705F, -3.4192F, 2.0974F, -0.4881F, -0.5423F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(27, 57).mirror().addBox(0.0F, -0.7622F, -1.4088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.5705F, -3.4192F, 1.312F, -0.4881F, -0.5423F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.5F, -0.1112F, 0.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 68).addBox(1.5F, -0.1112F, 0.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4746F, -1.1934F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.5F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 34).addBox(1.5F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1254F, -1.9934F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(-4.1849F, -1.9402F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1539F, -3.5705F, 0.0215F, 0.495F, -1.7253F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-2.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1539F, -3.5705F, 0.3095F, 0.3933F, -1.0751F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(-0.9758F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1539F, -3.5705F, 0.4426F, 0.2305F, -0.6489F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-0.9758F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -1.5705F, 0.3323F, 0.1735F, -0.4965F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-2.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -1.5705F, 0.2302F, 0.2965F, -0.9275F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-5.1849F, -1.9402F, -0.3993F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0461F, -1.5705F, 0.0188F, 0.3729F, -1.5518F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(36, 68).addBox(-0.0242F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1539F, -3.5705F, 0.4426F, -0.2305F, 0.6489F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 57).addBox(0.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1539F, -3.5705F, 0.3095F, -0.3933F, 1.0751F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 31).addBox(2.1849F, -1.9402F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1539F, -3.5705F, 0.0215F, -0.495F, 1.7253F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(19, 7).addBox(2.1849F, -1.9402F, -0.3993F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -1.5705F, 0.0188F, -0.3729F, 1.5518F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(57, 55).addBox(0.8963F, -0.3867F, -0.3993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -1.5705F, 0.2302F, -0.2965F, 0.9275F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 33).addBox(-0.0242F, 0.0283F, -0.3993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0461F, -1.5705F, 0.3323F, -0.1735F, 0.4965F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(5, 59).addBox(-1.0F, -0.8733F, -0.7481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.5705F, -3.4192F, 2.0974F, 0.4881F, 0.5423F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -1.5454F, -1.6953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5F, 2.5705F, -3.4192F, 2.6035F, 0.4881F, 0.5423F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(27, 57).addBox(-1.0F, -0.7622F, -1.4088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 2.5705F, -3.4192F, 1.312F, 0.4881F, 0.5423F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.401F, 3.5767F, -2.9481F, 0.3229F, 0.2618F, 0.0F));

		PartDefinition cube_r84 = leftArm1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(28, 7).addBox(6.0F, -1.2842F, 0.0838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-6.3188F, 1.2377F, -1.3736F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r85 = leftArm1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(52, 11).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0282F, 2.3853F, 0.2224F, -0.0702F, 0.0402F, 0.0703F));

		PartDefinition cube_r86 = leftArm1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 54).addBox(-0.9F, -0.0006F, 0.0073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4812F, 0.3377F, -0.6736F, 0.1741F, 0.0402F, 0.0703F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(32, 58).addBox(-0.8F, -0.4839F, -0.9517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 58).addBox(-0.8F, -0.5839F, -0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2812F, 2.6518F, 0.1564F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0446F, 1.2099F, 0.0219F, 0.1571F, 0.0F, 0.4363F));

		PartDefinition cube_r87 = leftHand.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(5, 43).addBox(0.0F, -2.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -0.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.401F, 3.5767F, -2.9481F, 1.0647F, -0.2618F, 0.0F));

		PartDefinition cube_r88 = rightArm1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 40).addBox(-7.0F, -1.2842F, 0.0838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3188F, 1.2377F, -1.3736F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r89 = rightArm1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0282F, 2.3853F, 0.2224F, -0.0702F, -0.0402F, -0.0703F));

		PartDefinition cube_r90 = rightArm1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(32, 54).addBox(-0.1F, -0.0006F, 0.0073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4812F, 0.3377F, -0.6736F, 0.1741F, -0.0402F, -0.0703F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(58, 33).addBox(-0.2F, -0.4839F, -0.9517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 58).addBox(-0.2F, -0.5839F, -0.1517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2812F, 2.6518F, 0.1564F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0446F, 1.2099F, 0.0219F, 0.1571F, 0.0F, -0.4363F));

		PartDefinition cube_r91 = rightHand.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(43, 5).addBox(-1.0F, -2.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -0.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -3.9F, -0.0873F, 0.3054F, 0.0F));

		PartDefinition cube_r92 = neck3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1674F, -1.7085F, -0.7854F, -0.3553F, 0.3428F));

		PartDefinition cube_r93 = neck3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1674F, -1.7085F, -0.7854F, 0.3553F, -0.3428F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 32).addBox(0.0F, -1.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.6F, 0.2896F, 0.2001F, -0.0849F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 68).addBox(0.0F, -0.533F, 2.061F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 68).addBox(0.0F, -0.733F, 0.061F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 32).addBox(-0.5F, -0.033F, 0.061F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.0F, -2.6F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8674F, -1.7085F, -1.0498F, -0.1664F, 0.2113F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3674F, -3.1085F, -1.0346F, -0.1003F, 0.0973F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 15).addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8674F, -1.7085F, -1.0498F, 0.1664F, -0.2113F));

		PartDefinition cube_r99 = neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 38).addBox(0.0F, -0.5413F, -0.0127F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3674F, -3.1085F, -1.0346F, 0.1003F, -0.0973F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -3.0F, -0.48F, 0.1745F, 0.0F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 68).addBox(0.0F, -0.8F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 48).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -1.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 13).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.0355F, 0.0844F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, -0.9796F, -0.038F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 1.4066F, -1.1493F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 52).addBox(-1.0F, -0.1F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6066F, -1.5493F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(47, 51).addBox(-1.0F, 0.0192F, -0.9915F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(43, 16).addBox(0.0F, -0.195F, -1.9051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5F, -0.46F, -3.2455F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 47).addBox(0.0F, -0.0102F, -1.8885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.06F, -4.1455F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(12, 48).addBox(0.0F, 0.2714F, -1.8944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F))
				.texOffs(42, 46).addBox(0.0F, -0.2286F, -1.8944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.54F, -5.0455F, 2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 37).addBox(-0.5F, -0.2004F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0159F, -4.3568F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.4135F, -4.4062F, 2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(25, 61).addBox(-0.5F, -0.1459F, -0.8015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5844F, -5.1856F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(10, 61).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.1844F, -5.1856F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(52, 59).addBox(0.0F, -0.3888F, -0.9205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5F, 0.94F, -5.5455F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(60, 24).addBox(-0.5F, -0.715F, -0.7882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.5884F, -5.7462F, -2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(5, 48).addBox(0.0F, -0.9006F, -1.8832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5F, 1.84F, -6.1455F, -2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(59, 50).addBox(0.0F, -0.9066F, -0.9008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.14F, -5.7455F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 65).addBox(0.0F, 0.4589F, -1.069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.44F, -5.1455F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 21).addBox(-0.5F, -0.1518F, -0.1888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.6479F, -3.815F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(40, 62).addBox(-0.97F, -0.9667F, -0.2323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.54F, -3.4455F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(45, 62).addBox(-0.97F, -1.8956F, -0.4645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.54F, -3.4455F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(41, 30).addBox(-1.0F, -0.9669F, -1.9572F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.3F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.0336F, -0.718F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.9959F, -0.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.4F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(51, 35).addBox(-1.0F, -0.3F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6F, 1.24F, -2.4455F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(35, 62).addBox(-1.0F, -0.998F, 0.0283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1118F, 0.0698F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(64, 49).addBox(-0.38F, -2.9931F, -1.2088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.1891F, -0.6992F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 55).addBox(-0.48F, -0.2848F, 0.0347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.3109F, -3.3992F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 52).addBox(-0.38F, -0.2848F, -0.356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.5F, 0.3109F, -3.3992F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(64, 27).addBox(-0.45F, -1.4931F, -0.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, -0.2891F, -0.7992F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(25, 64).addBox(-0.48F, -0.4026F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.48F, -0.7919F, -1.0343F, 1.4573F, 0.0698F, 0.0F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(15, 64).addBox(-0.9F, -0.6007F, -0.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1F, -0.926F, -0.4265F, 1.593F, 0.314F, 0.0536F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(10, 64).addBox(-0.9F, -0.5761F, -0.2463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, -0.926F, -0.4265F, 1.8898F, 0.314F, 0.0536F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 6).addBox(-0.48F, -0.5296F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.48F, -0.7919F, -1.0343F, 2.0944F, 0.0698F, 0.0F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(55, 25).addBox(-0.4F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.13F, -0.7038F, 1.6808F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 33).addBox(-0.5F, -0.7383F, -0.8028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.13F, -1.1757F, 0.5727F, 2.6878F, 0.2269F, 0.0524F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.426F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.13F, -1.1757F, 0.5727F, 1.309F, 0.2269F, 0.0524F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 62).addBox(-0.5F, -0.3612F, -0.3264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 65).addBox(-0.38F, -0.4612F, -0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 65).addBox(-0.3F, -0.4612F, -0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)), PartPose.offsetAndRotation(0.13F, -1.1757F, 0.5727F, 2.042F, 0.2269F, 0.0524F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5F, -0.703F, -0.1725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.13F, -1.1757F, 0.5727F, 1.4661F, 0.2269F, 0.0524F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -0.6322F, -0.5161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.13F, -1.1757F, 0.5727F, 1.9722F, 0.2269F, 0.0524F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(48, 21).addBox(-0.3103F, -0.3144F, -1.7137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.4F, -2.7735F, 1.3274F, 1.5119F, -0.6219F, 0.2976F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, -0.9338F, -0.458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 62).addBox(-1.0F, -0.9338F, -1.258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4F, -1.64F, 0.7455F, 1.9601F, 0.1617F, 0.066F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(30, 62).addBox(-1.0F, -0.9914F, -0.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.4F, 0.4F, 1.7308F, 0.1896F, 0.0304F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(20, 65).addBox(0.0F, -0.22F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -2.34F, 1.1455F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 19).addBox(0.0F, -0.7669F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -2.34F, 1.1455F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(62, 16).addBox(-1.0F, -0.9636F, -0.3127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.1417F, -0.0997F, 1.9773F, 0.3604F, 0.109F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2865F, -1.5315F, -0.5378F, 2.2668F, 0.4371F, 0.2419F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1135F, -1.8269F, -0.1832F, 2.3911F, 0.2793F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6F, 1.24F, -2.4455F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(0.0F, -0.998F, 0.0283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1118F, -0.0698F, 0.0F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-0.62F, -2.9931F, -1.2088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1891F, -0.6992F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(-0.52F, -0.2848F, 0.0347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.3109F, -3.3992F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-0.62F, -0.2848F, -0.356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3109F, -3.3992F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-0.55F, -1.4931F, -0.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.2891F, -0.7992F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-0.52F, -0.4026F, -0.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.48F, -0.7919F, -1.0343F, 1.4573F, -0.0698F, 0.0F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-0.1F, -0.6007F, -0.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.926F, -0.4265F, 1.593F, -0.314F, -0.0536F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-0.1F, -0.5761F, -0.2463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.926F, -0.4265F, 1.8898F, -0.314F, -0.0536F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.52F, -0.5296F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.48F, -0.7919F, -1.0343F, 2.0944F, -0.0698F, 0.0F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(55, 25).mirror().addBox(-0.6F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -0.7038F, 1.6808F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-0.5F, -0.7383F, -0.8028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -1.1757F, 0.5727F, 2.6878F, -0.2269F, -0.0524F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.5F, -0.426F, -0.5537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -1.1757F, 0.5727F, 1.309F, -0.2269F, -0.0524F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-0.5F, -0.3612F, -0.3264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(0, 65).mirror().addBox(-0.62F, -0.4612F, -0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 65).mirror().addBox(-0.7F, -0.4612F, -0.2264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -1.1757F, 0.5727F, 2.042F, -0.2269F, -0.0524F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 59).mirror().addBox(-0.5F, -0.703F, -0.1725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -1.1757F, 0.5727F, 1.4661F, -0.2269F, -0.0524F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.5F, -0.6322F, -0.5161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.13F, -1.1757F, 0.5727F, 1.9722F, -0.2269F, -0.0524F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.6897F, -0.3144F, -1.7137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.4F, -2.7735F, 1.3274F, 1.5119F, 0.6219F, -0.2976F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(0.0F, -0.9338F, -0.458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 62).mirror().addBox(0.0F, -0.9338F, -1.258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.64F, 0.7455F, 1.9601F, -0.1617F, -0.066F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(0.0F, -0.9914F, -0.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.4F, 0.4F, 1.7308F, -0.1896F, -0.0304F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-1.0F, -0.22F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.34F, 1.1455F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-1.0F, -0.7669F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.34F, 1.1455F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(0.0F, -0.9636F, -0.3127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.1417F, -0.0997F, 1.9773F, -0.3604F, -0.109F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2865F, -1.5315F, -0.5378F, 2.2668F, -0.4371F, -0.2419F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1135F, -1.8269F, -0.1832F, 2.3911F, -0.2793F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.2F, 0.0F, 0.0057F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(52, 55).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.1F, 3.6086F, -3.2672F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 55).addBox(-0.8F, 2.0338F, 0.1057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(25, 67).addBox(-0.8F, 1.6894F, -3.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(67, 15).addBox(-0.8F, 0.1668F, -3.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(67, 12).addBox(-0.8F, -0.3113F, -3.0261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(15, 67).addBox(-0.8F, -0.1127F, -2.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(10, 67).addBox(-0.8F, -0.7804F, -2.2981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(67, 58).addBox(-0.8F, -0.3804F, -2.4981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4F, 1.7F, -0.9F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-0.5118F, -0.5967F, -0.6449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0142F, 2.6382F, -1.6694F, 1.1967F, -0.0705F, -0.0569F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-0.5519F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0181F, 2.3698F, -1.6807F, 1.2665F, -0.0985F, -0.1596F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-0.5F, -0.5639F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2795F, 1.8239F, -1.4476F, 1.2347F, -0.1482F, -0.3142F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-0.5F, -0.5514F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.3302F, 1.6914F, -1.3987F, 1.1824F, -0.1482F, -0.3142F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-0.5F, -0.2574F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 40).addBox(0.7F, -0.2574F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.8575F, -1.3315F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-1.0F, -0.2F, -0.734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(65, 22).addBox(0.2F, -0.2F, -0.734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.2F, -0.4553F, -1.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 42).mirror().addBox(-0.2F, -0.4553F, -0.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.7F, -0.9F, 0.8057F, -0.2798F, -0.2665F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false)
				.texOffs(67, 3).mirror().addBox(-0.5F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4454F, 1.9183F, -1.0575F, 0.9453F, -0.2798F, -0.2665F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.4986F, -0.2915F, -0.9155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0142F, 2.6382F, -1.6694F, 0.7778F, -0.0705F, -0.0569F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 10).mirror().addBox(-0.2F, -0.107F, -1.6144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.7F, -0.9F, 0.7184F, -0.2657F, -0.2806F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-1.0F, -0.7654F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 65).addBox(0.2F, -0.7654F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-1.0F, -0.85F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(30, 65).mirror().addBox(-1.0F, -0.85F, -0.7598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 30).addBox(0.2F, -0.85F, -1.3598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(30, 65).addBox(0.2F, -0.85F, -0.7598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.3F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-1.0F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(50, 4).addBox(0.2F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.2232F, -0.8526F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-1.0F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 25).addBox(0.2F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(66, 36).addBox(-0.4882F, -0.5967F, -0.6449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2142F, 2.6382F, -1.6694F, 1.1967F, 0.0705F, 0.0569F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(61, 43).addBox(-0.4481F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2181F, 2.3698F, -1.6807F, 1.2665F, 0.0985F, 0.1596F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(61, 46).addBox(-0.5F, -0.5639F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4795F, 1.8239F, -1.4476F, 1.2347F, 0.1482F, 0.3142F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 65).addBox(-0.5F, -0.5514F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5302F, 1.6914F, -1.3987F, 1.1824F, 0.1482F, 0.3142F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 45).addBox(-0.8F, -0.4553F, -1.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 42).addBox(-0.8F, -0.4553F, -0.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.7F, -0.9F, 0.8057F, 0.2798F, 0.2665F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 9).addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F))
				.texOffs(67, 3).addBox(-0.5F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6454F, 1.9183F, -1.0575F, 0.9453F, 0.2798F, 0.2665F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 14).addBox(-0.5014F, -0.2915F, -0.9155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2142F, 2.6382F, -1.6694F, 0.7778F, 0.0705F, 0.0569F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(45, 10).addBox(-0.8F, -0.107F, -1.6144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.7F, -0.9F, 0.7184F, 0.2657F, 0.2806F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(22, 52).addBox(-0.3F, -0.5071F, -0.2616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9F, 0.4668F, -0.1211F, -0.8548F, -0.0353F, -0.0257F));

		PartDefinition cube_r199 = leftLeg1.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(55, 65).addBox(-1.5F, 0.0153F, 0.0165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, 0.3929F, -0.6616F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftLeg1.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 65).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.5071F, -0.2616F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftLeg1.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(57, 11).addBox(-5.5F, -0.0552F, 0.0457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 1.3929F, -0.2616F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftLeg1.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(50, 18).addBox(-2.0F, -0.9F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 32).addBox(-2.0F, -0.9F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, 6.1583F, 0.9424F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftLeg1.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 49).addBox(-5.5F, -0.0248F, 0.0158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2F, 3.2929F, -0.7616F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 6.5292F, 1.1169F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftLeg2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(54, 51).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 0.7836F, -0.2992F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftLeg2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(5, 62).addBox(-3.5F, -2.807F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftLeg2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 39).addBox(-3.5F, -0.0096F, -0.0336F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.6F, 0.6472F, -0.5117F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftLeg2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(20, 39).addBox(-4.8F, -11.4589F, -1.0338F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(35, 40).addBox(-1.0F, -0.1348F, -0.5272F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 7.5278F, -0.2113F, -0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(34, 12).addBox(-1.5F, -0.3953F, -1.5163F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.8399F, 0.0158F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(28, 30).addBox(-1.5F, -0.5F, -1.9924F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0972F, -1.5163F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(27, 52).addBox(-0.7F, -0.5071F, -0.2616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9F, 0.4668F, -0.1211F, 0.0616F, 0.1822F, -0.12F));

		PartDefinition cube_r208 = rightLeg1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 62).addBox(0.5F, 0.0153F, 0.0165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3929F, -0.6616F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightLeg1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(60, 65).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.5071F, -0.2616F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightLeg1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(15, 57).addBox(4.5F, -0.0552F, 0.0457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 1.3929F, -0.2616F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightLeg1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 29).addBox(0.0F, -0.9F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 51).addBox(0.0F, -0.9F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, 6.1583F, 0.9424F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightLeg1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 50).addBox(4.5F, -0.0248F, 0.0158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-5.2F, 3.2929F, -0.7616F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 6.5292F, 1.1169F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightLeg2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 55).addBox(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 0.7836F, -0.2992F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightLeg2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 10).addBox(2.5F, -2.807F, -0.4331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightLeg2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 40).addBox(2.5F, -0.0096F, -0.0336F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.6F, 0.6472F, -0.5117F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightLeg2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 39).addBox(3.8F, -11.4589F, -1.0338F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(41, 23).addBox(-1.0F, -0.1348F, -0.5272F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 7.5278F, -0.2113F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(24, 35).addBox(-1.5F, -0.3953F, -1.5163F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.8399F, 0.0158F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -0.5F, -1.9924F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0972F, -1.5163F, 0.3066F, 0.0062F, -0.0133F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.4F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition cube_r217 = tail.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(68, 68).addBox(0.0F, -1.6F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 68).addBox(0.0F, -1.7F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 68).addBox(0.0F, -1.7F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 68).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(69, 48).addBox(0.0F, 0.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 27).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 68).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1424F, 3.4667F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(69, 6).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4084F, 1.1818F, 0.733F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(69, 0).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 54).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 70).addBox(0.0F, -0.6F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0156F, 7.8012F, 0.1646F, 0.3016F, 0.0493F));

		PartDefinition cube_r220 = tail2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(69, 51).addBox(0.0F, 1.1F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 68).addBox(0.0F, 0.7F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1268F, -4.3345F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0131F, 4.9009F, 0.1372F, 0.3027F, 0.0411F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 6.9034F, -0.3213F, 0.2073F, -0.0684F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0684F, 5.8121F, -0.3819F, 0.4084F, -0.1582F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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