package fossils.fossils.client.blockentity.model.beipiaosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BeipiaosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public BeipiaosaurusFossilModel(ModelPart root) {
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
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -17.6F, 4.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 67).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 67).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 61).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 50).addBox(-1.4369F, 4.5437F, -2.5067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(0, 47).addBox(-1.4369F, 0.0437F, -1.5067F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3F, 1.2F, 0.7F, 0.4765F, 0.0631F, 0.0556F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5086F, 0.1401F, 0.3441F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 2.7F, -2.1F, 0.0163F, 0.0063F, 0.0175F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 56).mirror().addBox(-0.6034F, -0.6573F, 0.6198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9F, -2.1F, -0.1047F, 0.0F, -0.384F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-0.6034F, -0.3266F, -0.2889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1499F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9F, -2.1F, 0.2618F, 0.0F, -0.384F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 59).mirror().addBox(-0.2F, -0.162F, -0.9639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.2F, 0.7F, 0.2618F, 0.0F, -0.3665F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 29).mirror().addBox(-1.5F, -0.3656F, -0.979F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, 1.5F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-1.5F, 0.0343F, -0.9615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, 2.5F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.5F, -1.7F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6433F, -0.6148F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 48).mirror().addBox(-1.0F, -2.2062F, -2.1585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.2F, 1.85F, 0.3054F, 0.0873F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-1.0F, -1.6844F, -1.842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.2F, 1.501F, 0.3054F, 0.0873F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-1.0F, -0.8323F, -1.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.2F, 0.8378F, 0.3054F, 0.0873F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 61).mirror().addBox(-1.0F, -0.0194F, -1.0112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3F, -1.2F, -0.0698F, 0.3054F, 0.0873F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(-1.5F, -0.0465F, -0.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 2.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 34).mirror().addBox(-1.5F, -0.0585F, 0.0808F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3F, -1.3F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(31, 56).addBox(-0.3966F, -0.6573F, 0.6198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 0.9F, -2.1F, -0.1047F, 0.0F, 0.384F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(56, 37).addBox(-0.3966F, -0.3266F, -0.2889F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1499F)), PartPose.offsetAndRotation(0.9F, 0.9F, -2.1F, 0.2618F, 0.0F, 0.384F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 59).addBox(-0.8F, -0.162F, -0.9639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3F, 1.2F, 0.7F, 0.2618F, 0.0F, 0.3665F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 29).addBox(0.5F, -0.3656F, -0.979F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 1.5F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 52).addBox(0.5F, 0.0343F, -0.9615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.5F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(66, 52).addBox(0.5F, -0.0465F, -0.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 2.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 48).addBox(0.0F, -2.2062F, -2.1585F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3F, -1.2F, 1.85F, -0.3054F, -0.0873F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 17).addBox(0.0F, -1.6844F, -1.842F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.3F, -1.2F, 1.501F, -0.3054F, -0.0873F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(66, 64).addBox(0.0F, -0.8323F, -1.6828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3F, -1.2F, 0.8378F, -0.3054F, -0.0873F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 61).addBox(0.0F, -0.0194F, -1.0112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.3F, -1.2F, -0.0698F, -0.3054F, -0.0873F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 44).addBox(-0.5F, -1.7F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.6433F, -0.6148F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 34).addBox(0.5F, -0.0585F, 0.0808F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.3F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(19, 54).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.3711F, -0.3712F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 57).addBox(-1.0F, -0.0446F, -0.0669F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2052F, 0.0362F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, 1.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(30, 40).addBox(-0.9F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(42, 46).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1473F, 0.5958F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 34).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(10, 48).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0056F, 0.2103F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(39, 28).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1309F, -0.2031F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(13, 29).addBox(-2.0F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(40, 55).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 1.3711F, -0.3712F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(57, 14).addBox(-1.0F, -0.0446F, -0.0669F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2052F, 0.0362F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 1.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 32).addBox(-0.1F, 1.9946F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(48, 5).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1473F, 0.5958F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0056F, 0.2103F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(19, 40).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1309F, -0.2031F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(26, 29).addBox(-1.0F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.5F, 0.0F, -1.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -3.2F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 67).addBox(-0.5F, -0.8816F, -2.0767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 0).addBox(-1.0F, -0.0816F, -3.0767F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -4.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.4269F, -0.2482F, -0.2224F, -1.3304F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.4269F, -0.3267F, -0.1105F, -0.8658F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7745F, -2.4269F, -0.1513F, -0.0765F, -1.2227F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7745F, -2.4269F, -0.1751F, -0.0234F, -0.7538F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2745F, -4.3269F, -0.0851F, 0.0136F, -1.6063F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2745F, -4.3269F, -0.066F, 0.0555F, -1.0665F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2745F, -4.3269F, -0.0393F, 0.0556F, -0.5945F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4745F, -6.3269F, -0.0815F, 0.1183F, -1.5362F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 34).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4745F, -6.3269F, -0.0086F, 0.1433F, -0.991F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4745F, -6.3269F, 0.0519F, 0.1078F, -0.5173F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.4269F, -0.3267F, 0.1105F, 0.8658F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 67).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.4269F, -0.2482F, 0.2224F, 1.3304F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7745F, -2.4269F, -0.1751F, 0.0234F, 0.7538F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(39, 61).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7745F, -2.4269F, -0.1513F, 0.0765F, 1.2227F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2745F, -4.3269F, -0.0393F, -0.0556F, 0.5945F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(61, 36).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2745F, -4.3269F, -0.066F, -0.0555F, 1.0665F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 38).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2745F, -4.3269F, -0.0851F, -0.0136F, 1.6063F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(15, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4745F, -6.3269F, 0.0519F, -0.1078F, 0.5173F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(61, 34).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4745F, -6.3269F, -0.0086F, -0.1433F, 0.991F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(52, 35).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4745F, -6.3269F, -0.0815F, -0.1183F, 1.5362F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(59, 67).addBox(-0.5F, -1.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 58).addBox(-0.5F, -1.4F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 55).addBox(-0.5F, -1.3F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-1.0F, -0.4F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0087F, -1.9271F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7F, -6.4F, -0.4189F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -7.8F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(15, 61).addBox(0.0F, -1.77F, 3.9811F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 56).addBox(0.0F, -1.67F, 1.9811F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 55).addBox(0.0F, -1.47F, -0.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-0.5F, -1.07F, -0.0189F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-0.2F, 0.4016F, 0.0097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.4574F, -4.9965F, 0.2977F, 0.1483F, -0.449F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-0.5F, -0.2721F, 0.0095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7574F, -4.6965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 18).mirror().addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4574F, -2.6965F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-0.5F, 0.0065F, -0.0272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0426F, 0.3035F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(21, 18).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7745F, -4.3269F, -0.0725F, 0.3625F, -1.7261F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(59, 2).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7745F, -4.3269F, 0.1328F, 0.3457F, -1.1485F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(43, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7745F, -4.3269F, 0.2693F, 0.2252F, -0.673F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4745F, -2.3269F, -0.0752F, 0.2927F, -1.6222F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4745F, -2.3269F, 0.0908F, 0.2884F, -1.0569F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(36, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4745F, -2.3269F, 0.2062F, 0.1925F, -0.5814F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.3269F, 0.1131F, 0.1421F, -0.5096F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(41, 21).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.3269F, -0.079F, 0.1881F, -1.5359F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.3269F, 0.0304F, 0.2015F, -0.9843F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7745F, -4.3269F, 0.2693F, -0.2252F, 0.673F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 2).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7745F, -4.3269F, 0.1328F, -0.3457F, 1.1485F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(21, 18).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7745F, -4.3269F, -0.0725F, -0.3625F, 1.7261F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(36, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4745F, -2.3269F, 0.2062F, -0.1925F, 0.5814F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(59, 0).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4745F, -2.3269F, 0.0908F, -0.2884F, 1.0569F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 7).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4745F, -2.3269F, -0.0752F, -0.2927F, 1.6222F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.3269F, 0.0304F, -0.2015F, 0.9843F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 21).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.3269F, -0.079F, -0.1881F, 1.5359F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(64, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.3269F, 0.1131F, -0.1421F, 0.5096F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 24).addBox(-2.0F, -1.0163F, -1.9766F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7F, -0.4F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(50, 15).addBox(-0.5F, 0.0065F, -0.0272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, -0.0426F, 0.3035F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(43, 23).addBox(-0.8F, 0.4016F, 0.0097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.4574F, -4.9965F, 0.2977F, -0.1483F, 0.449F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(61, 44).addBox(-0.5F, -0.2721F, 0.0095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.7574F, -4.6965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(61, 40).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 18).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4574F, -2.6965F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2467F, 2.8686F, -3.2856F, 0.4417F, -0.3523F, -0.5031F));

		PartDefinition cube_r85 = leftArm1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(62, 10).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftArm1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 5).addBox(0.0F, 0.2F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1622F, 6.1012F, 0.3478F, -2.297F, 0.1413F, 0.1198F));

		PartDefinition cube_r87 = leftArm2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 4).addBox(-1.75F, 1.4308F, -0.2926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.65F, 0.6F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 54).addBox(-1.75F, -1.8995F, -0.8895F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.65F, 0.6F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 60).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(49, 42).addBox(-0.5F, -1.2991F, -0.4131F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(62, 60).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(36, 8).addBox(-2.0F, 1.7F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.098F, 4.9434F, 0.069F, 1.126F, -0.1333F, 0.1908F));

		PartDefinition cube_r91 = leftHand.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -0.15F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(45, 32).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.3568F, -0.2795F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2467F, 2.8686F, -3.2856F, 0.688F, 0.322F, 0.2259F));

		PartDefinition cube_r92 = rightArm1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 56).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 44).addBox(-1.0F, 0.2F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1622F, 6.1012F, 0.3478F, -2.2028F, -0.0359F, -0.1977F));

		PartDefinition cube_r94 = rightArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 60).addBox(0.75F, 1.4308F, -0.2926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.65F, 0.6F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(55, 4).addBox(0.75F, -1.8995F, -0.8895F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 1.65F, 0.6F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(24, 60).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(49, 48).addBox(-0.5F, -1.2991F, -0.4131F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(39, 63).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(12, 40).addBox(0.0F, 1.7F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.098F, 4.9434F, 0.069F, 1.126F, 0.1333F, -0.1908F));

		PartDefinition cube_r98 = rightHand.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(5, 36).addBox(0.0F, -0.15F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(35, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.3568F, -0.2795F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, 0.0F, 0.2618F, -0.0436F));

		PartDefinition cube_r99 = neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 34).addBox(0.0F, -1.2258F, 0.9825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 41).addBox(-0.5F, -1.0258F, -0.0175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r100 = neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(46, 68).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 68).addBox(0.0F, -0.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 37).addBox(0.0F, -0.3F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.2F, -2.1F, -1.0996F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.7F, -2.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 67).addBox(0.0F, -0.3F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 54).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.6F, -0.4712F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(17, 50).addBox(-1.0F, -1.1F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offset(0.0F, -0.8F, -1.2F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 61).mirror().addBox(-0.41F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.7459F, -5.9435F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.96F, 0.2189F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 29).mirror().addBox(-0.96F, -0.2811F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5744F, -2.8252F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-0.96F, -0.2944F, -0.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.2744F, -3.5252F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-0.96F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.2744F, -3.2252F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-1.01F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(64, 14).mirror().addBox(-1.01F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 64).addBox(0.01F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(64, 14).addBox(0.01F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2932F, -2.1081F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-1.01F, -1.0172F, -0.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(15, 64).addBox(0.01F, -1.0172F, -0.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8932F, -2.2081F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-0.43F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 65).mirror().addBox(-0.22F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 4).addBox(1.05F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 65).addBox(0.84F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.81F, -0.2379F, -1.6872F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 17).mirror().addBox(-1.01F, 0.0506F, 0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(64, 17).addBox(0.01F, 0.0506F, 0.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2932F, -0.9081F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-1.2F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(50, 23).mirror().addBox(-1.2F, -1.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 27).mirror().addBox(-1.2F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(50, 27).addBox(0.2F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(50, 23).addBox(0.2F, -1.3F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 61).addBox(0.2F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-0.96F, -0.9494F, -0.0839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 23).mirror().addBox(-0.96F, -0.9494F, -0.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 23).addBox(0.56F, -0.9494F, -0.5839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(64, 20).addBox(0.56F, -0.9494F, -0.0839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3F, -0.2932F, -1.0081F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-1.1F, -0.1791F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 65).mirror().addBox(-1.1F, 0.1209F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(25, 65).addBox(0.1F, 0.1209F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(10, 65).addBox(0.1F, -0.1791F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 57).addBox(-1.0F, -0.0791F, -0.0237F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.5F, -0.7F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(29, 61).addBox(0.0F, 1.003F, -0.0765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(45, 58).addBox(-0.5F, 0.003F, -0.0765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -2.2F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(57, 26).addBox(-1.0F, 0.0167F, 0.0262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.6F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 23).addBox(-1.0F, -0.0791F, -0.0237F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.5F, -0.7F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(67, 10).addBox(-1.0F, -0.1746F, 0.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 7).addBox(-1.0F, -0.1746F, -0.1848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2F, -5.8F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 19).addBox(-1.0F, -0.1746F, -1.7848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.2F, -5.8F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 67).addBox(-1.0F, -0.9F, -1.5315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(55, 10).addBox(-1.0F, -0.65F, -1.1315F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 64).addBox(-1.0F, -0.9F, -0.8315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.5F, -4.3F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(61, 64).addBox(-1.0F, -0.859F, -0.1302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.4F, -3.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(52, 31).addBox(-0.5F, -0.8085F, -0.2309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 2.8213F, -6.391F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, -0.9626F, -1.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8F, -2.6F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, -0.9767F, -0.3805F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7F, -2.2F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(34, 61).addBox(-0.59F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3F, 1.7459F, -5.9435F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 64).addBox(-0.04F, 0.2189F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(64, 29).addBox(-0.04F, -0.2811F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2F, 0.5744F, -2.8252F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 64).addBox(-0.04F, -0.2944F, -0.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.2F, 0.2744F, -3.5252F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 26).addBox(-0.04F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2F, 0.2744F, -3.2252F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(42, 51).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, 0.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(66, 43).addBox(0.0F, -0.3091F, -1.0498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 40).addBox(0.0F, -0.3091F, -0.6498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.5716F, -5.6787F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(66, 46).addBox(0.0F, -0.6249F, -0.2664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.2597F, -4.594F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 49).addBox(0.0F, -0.3253F, -0.9043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.5F, 1.4716F, -5.6787F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 38).addBox(0.0F, -0.3918F, -1.6919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F))
				.texOffs(26, 49).addBox(0.0F, -0.2918F, -1.6919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5F, 0.7716F, -4.4787F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-0.51F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1794F, -1.3908F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(54, 42).mirror().addBox(-1.0F, -0.2285F, -1.8558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.1284F, -3.0787F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(-1.0F, -0.7423F, -1.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.8716F, -2.5787F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-1.0F, -1.1258F, -1.9375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(5, 53).mirror().addBox(-1.0F, -0.8258F, -1.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.7716F, -1.0787F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(24, 53).mirror().addBox(-1.0F, -0.2261F, -0.5721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2284F, -2.7787F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(33, 52).mirror().addBox(-1.0F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0716F, 0.0213F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-1.0F, -0.2405F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.4F, -0.4F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-1.0F, -0.1477F, -0.1977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.6F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.6F, -1.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 42).addBox(0.0F, -0.2285F, -1.8558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3F, -0.1284F, -3.0787F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(24, 53).addBox(0.0F, -0.2261F, -0.5721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.2284F, -2.7787F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(54, 46).addBox(-0.49F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.1794F, -1.3908F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 16).addBox(0.0F, -1.1258F, -1.9375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F))
				.texOffs(5, 53).addBox(0.0F, -0.8258F, -1.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2F, 0.7716F, -1.0787F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(12, 54).addBox(0.0F, -0.7423F, -1.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.3F, 0.8716F, -2.5787F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(33, 52).addBox(0.0F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.0716F, 0.0213F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 0).addBox(0.0F, -0.2405F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2F, -0.4F, -0.4F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 65).addBox(0.0F, -0.1477F, -0.1977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.6F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 65).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2F, -0.6F, -1.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 34).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(0, 68).addBox(0.0F, -1.2F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 68).addBox(0.0F, -1.1F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.4F, -0.0688F, -0.479F, 0.0318F));

		PartDefinition cube_r150 = tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(45, 38).addBox(0.0F, 0.7F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 44).addBox(0.0F, 0.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 1.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 21).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(25, 68).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 68).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0087F, 3.8004F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r151 = tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(31, 68).addBox(0.0F, -0.8F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(16, 69).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2078F, 5.5226F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 13).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 69).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.278F, 1.5207F, 0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 5.9001F, -0.0567F, -0.3921F, 0.0217F));

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