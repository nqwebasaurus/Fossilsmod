package fossils.fossils.client.blockentity.model.pelecanimimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

@SuppressWarnings("unused")
public class PelecanimimusFossilModel extends SkullModelBase {
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PelecanimimusFossilModel(ModelPart root) {
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
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.5F, -1.9F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 9).addBox(0.0F, -0.2F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8051F, -0.5079F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 9).addBox(0.0F, -0.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8544F, 4.4469F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 59).addBox(0.0F, -1.0657F, -0.0263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1348F, 4.3511F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-1.0511F, 0.4509F, 2.1614F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 0.6493F, 0.1273F, -0.263F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0511F, 1.9664F, 2.4444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(51, 0).mirror().addBox(-1.0511F, 2.6664F, 1.4444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 0.5097F, 0.1273F, -0.263F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-0.4871F, -4.4519F, -4.6022F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 1.5555F, 0.0869F, -0.2563F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 38).mirror().addBox(0.9187F, -5.0294F, -3.1892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 0.1482F, 0.8392F, 0.1784F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 52).mirror().addBox(0.3894F, -1.1337F, -3.7657F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, -1.0411F, 0.5382F, -0.0961F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.4871F, -1.9156F, -4.989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 1.0755F, 0.0869F, -0.2563F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 33).mirror().addBox(-0.4871F, -1.629F, -2.2416F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 0.9359F, 0.0869F, -0.2563F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-1.0917F, -3.7201F, -1.1643F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, -0.2356F, 0.0F, 0.0873F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-2.0451F, -3.1748F, 1.1387F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, -0.0964F, -0.0121F, 0.3915F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 35).mirror().addBox(-2.9605F, -4.5481F, 1.3078F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, -0.2662F, 0.009F, 0.7357F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.0815F, -5.212F, -3.0187F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, 0.2338F, 0.3289F, 0.269F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(-2.686F, -4.456F, -1.5966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1083F, 3.0026F, -1.7718F, -0.0771F, 0.0409F, 0.5744F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 35).addBox(1.9605F, -4.5481F, 1.3078F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, -0.2662F, -0.009F, -0.7357F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 33).addBox(1.0451F, -3.1748F, 1.1387F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, -0.0964F, 0.0121F, -0.3915F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 37).addBox(0.0917F, -3.7201F, -1.1643F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, -0.2356F, 0.0F, -0.0873F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 11).addBox(1.686F, -4.456F, -1.5966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, -0.0771F, -0.0409F, -0.5744F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 12).addBox(0.0815F, -5.212F, -3.0187F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 0.2338F, -0.3289F, -0.269F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 52).addBox(-1.3894F, -1.1337F, -3.7657F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, -1.0411F, -0.5382F, 0.0961F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 38).addBox(-1.9187F, -5.0294F, -3.1892F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 0.1482F, -0.8392F, -0.1784F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 52).addBox(-0.5129F, -4.4519F, -4.6022F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 1.5555F, -0.0869F, 0.2563F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 19).addBox(-0.5129F, -1.9156F, -4.989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 1.0755F, -0.0869F, 0.2563F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5129F, -1.629F, -2.2416F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 0.9359F, -0.0869F, 0.2563F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 0).addBox(0.0511F, 2.6664F, 1.4444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(0, 58).addBox(0.0511F, 1.9664F, 2.4444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 0.5097F, -0.1273F, 0.263F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 54).addBox(0.0511F, 0.4509F, 2.1614F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1083F, 3.0026F, -1.7718F, 0.6493F, -0.1273F, 0.263F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.3F, -4.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(30, 54).addBox(-0.5F, -0.601F, -0.5674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6086F, 1.4F, -0.7661F, -0.6939F, 0.084F, 0.1005F));

		PartDefinition cube_r29 = leftLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 39).addBox(-0.5F, 0.0352F, -0.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.299F, 0.2326F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 44).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.399F, -0.5674F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(45, 7).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(29, 45).addBox(-0.9F, 2.9946F, -0.022F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.799F, 1.9326F, 1.3961F, -0.043F, 0.0076F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 0).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 46).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.378F, -0.7413F, -0.0295F, -0.0322F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(37, 29).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9934F, -0.3088F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(35, 37).addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-0.5F, -0.601F, -0.5674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6086F, 1.4251F, -0.7431F, -0.9581F, -0.0715F, -0.0501F));

		PartDefinition cube_r32 = rightLeg1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(-0.5F, 0.0352F, -0.0236F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.299F, 0.2326F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(24, 44).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.399F, -0.5674F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(45, 7).mirror().addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(29, 45).mirror().addBox(-0.1F, 2.9946F, -0.022F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.799F, 1.9326F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 0).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 46).mirror().addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.378F, -0.7413F, 0.0295F, 0.0322F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9934F, -0.3088F, 0.3052F, -0.0131F, 0.0416F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(35, 37).mirror().addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 59).addBox(0.0F, 0.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 58).addBox(0.0F, 0.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 58).addBox(0.0F, 0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3869F, -7.3207F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(31, 11).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.1126F, -0.122F, -1.0665F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.156F, -0.0565F, -0.589F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(24, 58).mirror().addBox(-3.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1887F, -1.3818F, -0.0147F, -0.2088F, -1.726F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-3.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0008F, -0.0349F, -1.6232F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0059F, 0.0064F, -0.9686F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2887F, -3.3818F, 0.0082F, 0.003F, -0.4887F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.0902F, 0.0328F, -0.3476F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 4).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.065F, 0.0707F, -0.8267F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-4.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3887F, -5.3818F, 0.0084F, 0.052F, -1.4835F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 11).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.1126F, 0.122F, 1.0665F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.156F, 0.0565F, 0.589F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 58).addBox(2.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1887F, -1.3818F, -0.0147F, 0.2088F, 1.726F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 42).addBox(2.0074F, -2.1238F, -0.4124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0008F, 0.0349F, 1.6232F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(53, 50).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0059F, -0.0064F, 0.9686F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(58, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2887F, -3.3818F, 0.0082F, -0.003F, 0.4887F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.0902F, -0.0328F, 0.3476F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 4).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.065F, -0.0707F, 0.8267F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 12).addBox(2.0074F, -2.1238F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3887F, -5.3818F, 0.0084F, -0.052F, 1.4835F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(13, 0).addBox(-3.5F, -3.2245F, -4.8669F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.6F, -2.8F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 13).addBox(-1.0F, 0.0235F, 1.9529F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -8.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -6.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 58).addBox(0.0F, -0.7012F, -0.6156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 12).addBox(0.0F, -0.7012F, -2.6156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 58).addBox(0.0F, -0.9012F, -4.6156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 22).addBox(-0.5F, -0.3012F, -4.6156F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0392F, 0.0822F, -0.5413F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.3379F, 0.1201F, -0.4158F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-2.9597F, -0.4069F, -0.5413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.2474F, 0.2612F, -0.8836F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-4.1002F, -2.1246F, -0.4497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4113F, -4.3818F, 0.0321F, 0.3128F, -1.5664F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-1.0326F, 0.0896F, -0.5301F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.2219F, 0.0799F, -0.3402F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 17).mirror().addBox(-2.9573F, -0.3973F, -0.5301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.1608F, 0.173F, -0.8151F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 20).mirror().addBox(-5.1036F, -2.1155F, -0.4383F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2113F, -2.3818F, 0.0207F, 0.1911F, -1.482F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(52, 26).mirror().addBox(-2.956F, -0.3938F, -0.525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.1246F, 0.1348F, -0.7857F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(10, 24).mirror().addBox(-6.1045F, -2.1119F, -0.4332F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.016F, 0.1389F, -1.4479F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-1.0298F, 0.0921F, -0.525F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -0.3818F, 0.1724F, 0.0624F, -0.3088F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-0.5F, -0.1292F, -0.0664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 49).addBox(4.5F, -0.1292F, -0.0664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.4671F, -1.6185F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(23, 35).mirror().addBox(-0.042F, -0.9589F, -2.1293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.5671F, -3.7185F, 0.799F, -0.4989F, -0.457F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 43).mirror().addBox(-0.5F, -0.7072F, 0.1671F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 43).addBox(4.5F, -0.7072F, 0.1671F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.5F, 2.5671F, -4.1185F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 22).mirror().addBox(-0.2234F, 0.3869F, 2.3392F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.4641F, -0.2279F, 0.7832F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.4404F, 0.6553F, 1.4124F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.3808F, -0.5956F, 0.9107F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(0.7543F, 1.0259F, 0.8896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.1739F, -0.8795F, 0.927F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(-1.5F, -0.8325F, -0.4351F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 41).addBox(0.5F, -0.8325F, -0.4351F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 0).addBox(0.0392F, 0.0822F, -0.5413F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.3379F, -0.1201F, 0.4158F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(50, 35).addBox(0.9597F, -0.4069F, -0.5413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.2474F, -0.2612F, 0.8836F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(51, 48).addBox(2.1002F, -2.1246F, -0.4497F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4113F, -4.3818F, 0.0321F, -0.3128F, 1.5664F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 27).addBox(0.0326F, 0.0896F, -0.5301F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.2219F, -0.0799F, 0.3402F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 17).addBox(0.9573F, -0.3973F, -0.5301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.1608F, -0.173F, 0.8151F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 20).addBox(2.1036F, -2.1155F, -0.4383F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2113F, -2.3818F, 0.0207F, -0.1911F, 1.482F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 26).addBox(0.956F, -0.3938F, -0.525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.1246F, -0.1348F, 0.7857F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 24).addBox(2.1045F, -2.1119F, -0.4332F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.016F, -0.1389F, 1.4479F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(56, 34).addBox(0.0298F, 0.0921F, -0.525F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -0.3818F, 0.1724F, -0.0624F, 0.3088F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(17, 29).addBox(-3.0F, -1.987F, -2.9085F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.6F, 0.7F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(23, 35).addBox(-0.958F, -0.9589F, -2.1293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 2.5671F, -3.7185F, 0.799F, 0.4989F, 0.457F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(28, 22).addBox(-0.7766F, 0.3869F, 2.3392F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.4641F, 0.2279F, -0.7832F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 18).addBox(-1.4404F, 0.6553F, 1.4124F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.3808F, 0.5956F, -0.9107F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 24).addBox(-1.7543F, 1.0259F, 0.8896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5251F, -3.9361F, -0.1739F, 0.8795F, -0.927F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5165F, -0.5184F, -0.7355F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0474F, 3.1395F, -3.1157F, 0.0134F, 0.3297F, -0.3658F));

		PartDefinition cube_r87 = leftArm1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 22).addBox(-0.0106F, -2.0849F, -1.0983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(52, 7).addBox(-0.5582F, -0.4527F, -0.3783F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0941F, 7.1353F, 0.0525F, -0.8286F, -0.0579F, -0.1086F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 52).addBox(-1.7582F, -0.104F, -0.8733F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5082F, -2.4064F, -0.4658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5082F, -0.5025F, -0.4889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(34, 45).addBox(-1.003F, -0.1508F, -0.5125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 46).addBox(-1.003F, 1.7992F, -0.5125F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 33).addBox(-1.003F, 1.7992F, 0.4875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.5F, 0.2646F, -0.0214F, -0.4902F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(41, 46).addBox(-1.003F, 0.099F, -0.4864F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.5603F, -0.0934F, -0.1476F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4835F, -0.5184F, -0.7355F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.0474F, 3.1395F, -3.1157F, 0.5233F, -0.3187F, 0.1359F));

		PartDefinition cube_r91 = rightArm1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(35, 22).mirror().addBox(-0.9894F, -2.0849F, -1.0983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-0.4418F, -0.4527F, -0.3783F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0941F, 7.1353F, 0.0525F, -1.6592F, 0.1352F, 0.0048F));

		PartDefinition cube_r92 = rightArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(0.7582F, -0.104F, -0.8733F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(-0.4918F, -2.4064F, -0.4658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-0.4918F, -0.5025F, -0.4889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(34, 45).mirror().addBox(0.003F, -0.1508F, -0.5125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(0.003F, 1.7992F, -0.5125F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 33).mirror().addBox(0.003F, 1.7992F, 0.4875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.5F, 0.22F, 0.1498F, -0.0196F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(41, 46).mirror().addBox(0.003F, 0.099F, -0.4864F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -4.6F, -0.2303F, 0.17F, -0.0396F));

		PartDefinition cube_r95 = neck4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(43, 34).addBox(-0.5F, -1.3001F, 4.0035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 54).addBox(-0.5F, -1.3001F, 2.0035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 11).addBox(-1.0F, -0.9001F, 2.0035F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-2.0404F, 0.0174F, -0.5898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -3.5818F, 0.745F, 0.8267F, -0.74F));

		PartDefinition cube_r97 = neck4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-2.9471F, -0.4417F, -0.5773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -1.5818F, 0.4419F, 0.714F, -1.0317F));

		PartDefinition cube_r98 = neck4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 46).mirror().addBox(-1.0441F, 0.0456F, -0.5773F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1113F, -1.5818F, 0.7115F, 0.4463F, -0.5506F));

		PartDefinition cube_r99 = neck4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 18).addBox(0.0404F, 0.0174F, -0.5898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -3.5818F, 0.745F, -0.8267F, 0.74F));

		PartDefinition cube_r100 = neck4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(45, 0).addBox(0.9471F, -0.4417F, -0.5773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -1.5818F, 0.4419F, -0.714F, 1.0317F));

		PartDefinition cube_r101 = neck4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 46).addBox(0.0441F, 0.0456F, -0.5773F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1113F, -1.5818F, 0.7115F, -0.4463F, 0.5506F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -3.8F, 0.0895F, 0.4828F, 0.3891F));

		PartDefinition cube_r102 = neck3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(39, 41).addBox(-1.0F, -0.96F, 2.0461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.2F, -4.4F, -0.6021F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -2.2F, 0.2636F, 0.3804F, 0.0999F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(45, 2).addBox(-0.5F, 0.1406F, 5.0414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1F, -3.6F, -1.0559F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, -1.4F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r104 = neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(46, 44).addBox(-0.5F, 0.0978F, 0.9208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.6F, -0.2793F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.9F, -0.0447F, 0.218F, -0.0097F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-0.5F, 2.7976F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 31).mirror().addBox(-0.5F, 2.3976F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -2.9504F, -0.235F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 57).mirror().addBox(-0.44F, -0.0297F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(39, 57).addBox(0.18F, -0.0297F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.37F, -0.3074F, -1.8908F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-0.44F, -0.6996F, -0.3048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(56, 14).addBox(0.58F, -0.6996F, -0.3048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.57F, -0.3074F, -0.7908F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.44F, -0.6711F, -0.2934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 36).addBox(0.58F, -0.6711F, -0.2934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.57F, 0.0926F, -0.6908F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(49, 56).mirror().addBox(-0.44F, -0.7213F, -0.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(49, 56).addBox(0.58F, -0.7213F, -0.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.57F, 0.4926F, -0.8908F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-0.44F, -0.7193F, -0.2885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(57, 6).addBox(0.58F, -0.7193F, -0.2885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.57F, 0.6926F, -1.1908F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-1.0F, -0.7886F, -0.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(57, 46).addBox(-0.6F, -0.7886F, -0.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 0.6804F, -1.33F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-0.44F, -0.2806F, -0.2692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(57, 9).addBox(0.58F, -0.2806F, -0.2692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.57F, 0.5926F, -1.8908F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 39).mirror().addBox(-0.44F, -0.1257F, -0.8855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(57, 39).addBox(0.18F, -0.1257F, -0.8855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.37F, -0.2074F, -1.8908F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-0.44F, -0.6409F, -0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(9, 57).addBox(0.58F, -0.6409F, -0.2837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.57F, 0.7926F, -1.5908F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(6, 41).mirror().addBox(-0.45F, -0.4614F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 52).mirror().addBox(-0.34F, -0.4614F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(6, 41).addBox(0.51F, -0.4614F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 52).addBox(0.4F, -0.4614F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.53F, 0.0914F, -1.3609F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.0F, -0.3F, -1.0026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(54, 55).addBox(-0.6F, -0.3F, -1.0026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, -0.2409F, -0.8927F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.31F))
				.texOffs(0, 41).addBox(-0.5F, -0.3409F, -0.8927F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 2.8859F, -5.1097F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(44, 34).addBox(-0.5F, -0.3755F, -0.3631F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(0.0F, 3.1859F, -5.4097F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-0.9F, -0.1434F, -1.8409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(49, 13).addBox(-0.7F, -0.1434F, -1.8409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.3F, -0.3F, -2.1F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-0.4F, -0.4171F, -1.0559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 17).addBox(0.0F, -0.4171F, -1.0559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.7676F, -2.1352F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-1.0F, -0.6984F, -1.5209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(32, 50).mirror().addBox(-1.0F, -0.7984F, -1.5209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(50, 22).addBox(-0.8F, -0.6984F, -1.5209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(32, 50).addBox(-0.8F, -0.7984F, -1.5209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4F, 1.2754F, -2.4356F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.53F, -0.6143F, -0.3485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(44, 57).mirror().addBox(-0.43F, 0.7857F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5126F, -2.4594F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 0.7032F, -2.1079F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-1.0F, -0.2349F, -0.2097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(50, 31).addBox(-0.8F, -0.2349F, -0.2097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.4804F, -3.83F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-0.4751F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3449F, -0.5418F, -0.8811F, 0.0F, -0.096F, 1.5708F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3449F, -0.4679F, -0.3866F, 0.0F, 0.2705F, 1.5708F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-1.0F, -0.1086F, -0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(5, 55).addBox(-0.6F, -0.1086F, -0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3F, -0.7F, -0.6F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, -0.06F, -0.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(0, 55).addBox(-0.6F, -0.06F, -0.0911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, -0.7F, -1.4F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-1.0F, -0.0894F, -0.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 28).addBox(-0.6F, -0.0894F, -0.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3F, -0.4F, -2.1F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.1368F, -0.8353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -1.1304F, -0.1803F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(39, 5).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5304F, -0.6803F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(14, 57).addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 23).addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.21F, 3.0228F, -5.0978F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.33F, 0.7032F, -2.1079F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(44, 57).addBox(-0.57F, 0.7857F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 43).addBox(-0.47F, -0.6143F, -0.3485F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.3F, 0.5126F, -2.4594F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 20).addBox(-0.5249F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3449F, -0.5418F, -0.8811F, 0.0F, 0.096F, -1.5708F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3449F, -0.4679F, -0.3866F, 0.0F, -0.2705F, -1.5708F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 31).addBox(-0.5F, 2.3976F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 57).addBox(-0.5F, 2.7976F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.51F, -2.9504F, -0.235F, -0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.8F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.2421F, -0.2762F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.1F, 1.6389F, -3.998F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(47, 27).addBox(-0.5F, -0.3421F, -0.0762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F))
				.texOffs(13, 12).addBox(-0.5F, -0.2421F, -0.7762F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 1.6389F, -3.998F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(12, 48).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F))
				.texOffs(46, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.1F, 2.5389F, -4.798F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(3, 51).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(3, 51).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.1F, 0.596F, -1.6808F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(-1.0F, -0.3079F, -1.3391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(24, 51).addBox(-0.2F, -0.3079F, -1.3391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.2F, -0.1248F, -0.0232F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-0.4F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 0.7614F, -1.6069F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(50, 52).addBox(-0.6F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.53F, 0.7614F, -1.6069F, -1.1257F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 5.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r145 = tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 11).addBox(0.0F, -0.8294F, -0.0601F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(39, 41).addBox(0.0F, 1.1F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 22).addBox(0.0F, -0.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 33).addBox(0.0F, -0.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4544F, -0.7531F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 3).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, 0.3693F, 0.2449F, 0.0936F));

		PartDefinition cube_r148 = tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 26).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 17).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 29).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(6, 12).addBox(0.0F, 3.3F, 14.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(0.0F, 2.7F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 29).addBox(0.0F, 2.2F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4544F, -9.6531F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(28, 29).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 18).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.1715F, 0.2581F, 0.0442F));

		PartDefinition cube_r150 = tail3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.4368F, 0.2783F, 0.1275F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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