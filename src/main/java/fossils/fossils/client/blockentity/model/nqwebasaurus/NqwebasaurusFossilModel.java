package fossils.fossils.client.blockentity.model.nqwebasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NqwebasaurusFossilModel extends SkullModelBase {
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
	private final ModelPart tail4;

	public NqwebasaurusFossilModel(ModelPart root) {
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
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.0F, -3.0F, -0.1213F, 0.2482F, -0.1345F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 32).addBox(0.0F, -1.1F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7581F, 0.4049F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 4).mirror().addBox(-0.5F, 3.7647F, -1.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(45, 6).mirror().addBox(-0.5F, 2.3647F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.9495F, -1.2416F, -0.3229F, 0.0F, -0.5411F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 43).mirror().addBox(-1.0F, -0.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 30).mirror().addBox(-2.0F, -0.9F, 1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 30).addBox(2.0F, -0.9F, 1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 43).addBox(1.0F, -0.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 35).mirror().addBox(-0.2F, -0.7306F, -1.6946F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.6632F, 0.2284F, 2.4522F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.2F, -0.6376F, -0.7627F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.6632F, 0.2284F, 1.1083F, 0.3927F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 23).mirror().addBox(-0.2F, 0.4828F, -1.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.6632F, 0.2284F, 1.6319F, 0.3927F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.2F, -0.769F, -0.2862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.6632F, 0.2284F, 0.8814F, 0.3927F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 45).mirror().addBox(-0.5F, 2.2535F, 0.034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.9495F, -1.2416F, -0.5323F, 0.0F, -0.5411F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(-0.5F, -0.2402F, -0.4663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.9495F, -1.2416F, -0.3403F, 0.0F, -0.5411F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 37).mirror().addBox(-2.0F, 0.0339F, -2.0944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9F, -1.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 38).mirror().addBox(-2.0F, -0.0661F, -1.9944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-2.0F, -0.0138F, -0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-2.0F, -0.0321F, -1.9854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 18).addBox(2.0F, -0.0321F, -1.9854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(12, 0).addBox(3.5F, -0.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0F, -0.8668F, -0.0933F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 4).addBox(-0.5F, 3.7647F, -1.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(45, 6).addBox(-0.5F, 2.3647F, -0.5127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 0.9495F, -1.2416F, -0.3229F, 0.0F, 0.5411F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 45).addBox(-0.5F, 2.2535F, 0.034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2F, 0.9495F, -1.2416F, -0.5323F, 0.0F, 0.5411F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 11).addBox(-0.8F, -0.6376F, -0.7627F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.2F, 0.6632F, 0.2284F, 1.1083F, -0.3927F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 35).addBox(-0.8F, -0.7306F, -1.6946F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(2.2F, 0.6632F, 0.2284F, 2.4522F, -0.3927F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 23).addBox(-0.8F, 0.4828F, -1.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 0.6632F, 0.2284F, 1.6319F, -0.3927F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 44).addBox(-0.8F, -0.769F, -0.2862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 0.6632F, 0.2284F, 0.8814F, -0.3927F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(31, 45).addBox(-0.5F, -0.2402F, -0.4663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 0.9495F, -1.2416F, -0.3403F, 0.0F, 0.5411F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(37, 37).addBox(1.0F, 0.0339F, -2.0944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.9F, -1.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 38).addBox(1.0F, -0.0661F, -1.9944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 15).addBox(1.0F, -0.0138F, -0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.9F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.7F, -0.15F, -0.0417F, -0.0628F, 0.1316F));

		PartDefinition cube_r25 = leftLeg1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 20).addBox(-0.5F, 0.0575F, -0.0402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1052F, -0.0638F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 44).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(37, 0).addBox(-0.9F, -0.0054F, -0.822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.9052F, 0.8362F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 29).addBox(-0.5F, -7.5981F, -0.6117F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 7.6946F, 0.478F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(43, 27).addBox(-0.5F, -4.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, -6.85F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 7.7446F, 1.028F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.178F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(21, 18).addBox(-1.5F, -0.5F, -3.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, -2.5F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.7F, -0.15F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(43, 20).mirror().addBox(-0.5F, 0.0575F, -0.0402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.1052F, -0.0638F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-0.1F, -0.0054F, -0.822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9052F, 0.8362F, 0.8547F, -0.0329F, 0.0286F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 29).mirror().addBox(-0.5F, -7.5981F, -0.6117F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 7.6946F, 0.478F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 27).mirror().addBox(-0.5F, -4.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.4F, -6.85F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.7446F, 1.028F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.178F, -0.8616F, -0.051F, 0.1274F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(21, 18).mirror().addBox(-1.5F, -0.5F, -3.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -2.2F, -0.0409F, -0.1292F, 0.0486F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.6913F, -1.0316F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 25).addBox(-1.0F, 0.0087F, -2.0316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -3.8F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 0).addBox(-0.5F, -1.8F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 51).addBox(-0.5F, -1.6F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-3.0F, 3.5F, -4.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 26).addBox(-1.0F, -0.7F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.2F, 0.2F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(31, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2311F, -4.307F, 0.1949F, 0.0662F, -0.4316F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 21).mirror().addBox(-5.5176F, -1.2504F, -0.4812F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2311F, -4.307F, 0.087F, 0.177F, -1.3042F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2311F, -4.307F, 0.1619F, 0.1128F, -0.7967F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 20).mirror().addBox(-3.5176F, -1.2504F, -0.4812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -0.307F, 0.0322F, -0.0252F, -1.4131F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -0.307F, 0.016F, -0.0377F, -0.9069F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(50, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -0.307F, 0.0049F, -0.0221F, -0.5405F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(16, 26).mirror().addBox(-4.5176F, -1.2504F, -0.4812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -2.307F, 0.0685F, 0.1096F, -1.3418F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 12).mirror().addBox(-1.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -2.307F, 0.1131F, 0.0627F, -0.8359F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1311F, -2.307F, 0.1315F, 0.0368F, -0.4698F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -0.307F, 0.0049F, 0.0221F, 0.5405F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(50, 0).addBox(0.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -0.307F, 0.016F, 0.0377F, 0.9069F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 20).addBox(1.5176F, -1.2504F, -0.4812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -0.307F, 0.0322F, 0.0252F, 1.4131F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(42, 0).addBox(0.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2311F, -4.307F, 0.1619F, -0.1128F, 0.7967F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(8, 21).addBox(1.5176F, -1.2504F, -0.4812F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2311F, -4.307F, 0.087F, -0.177F, 1.3042F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(31, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2311F, -4.307F, 0.1949F, -0.0662F, 0.4316F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(16, 26).addBox(1.5176F, -1.2504F, -0.4812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -2.307F, 0.0685F, -0.1096F, 1.3418F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 12).addBox(0.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -2.307F, 0.1131F, -0.0627F, 0.8359F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1311F, -2.307F, 0.1315F, -0.0368F, 0.4698F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.8F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(3, 52).addBox(-0.5F, -1.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 52).addBox(-0.5F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.3F, -3.7F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(11, 11).addBox(-2.5F, -1.9601F, -3.9372F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.3F, 2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 9).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 9).addBox(4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 3.7F, -2.8F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(32, 34).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.7F, -2.8F, 1.1604F, -0.5595F, -0.8841F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 9).mirror().addBox(-3.5176F, -1.2504F, -0.4812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5311F, -2.307F, 0.106F, 0.2443F, -1.4748F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 28).mirror().addBox(-1.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5311F, -2.307F, 0.2114F, 0.1625F, -0.9644F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5311F, -2.307F, 0.2586F, 0.0952F, -0.601F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 5).mirror().addBox(-4.5176F, -1.2504F, -0.4812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0311F, -0.407F, 0.087F, 0.177F, -1.3915F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(31, 10).mirror().addBox(-1.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0311F, -0.407F, 0.1619F, 0.1128F, -0.8839F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(38, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0311F, -0.407F, 0.1949F, 0.0662F, -0.5189F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 34).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 3.7F, -2.8F, 1.1604F, 0.5595F, 0.8841F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(16, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5311F, -2.307F, 0.2586F, -0.0952F, 0.601F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 28).addBox(0.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5311F, -2.307F, 0.2114F, -0.1625F, 0.9644F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 9).addBox(1.5176F, -1.2504F, -0.4812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5311F, -2.307F, 0.106F, -0.2443F, 1.4748F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(38, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0311F, -0.407F, 0.1949F, -0.0662F, 0.5189F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(31, 10).addBox(0.9336F, -0.3579F, -0.4812F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0311F, -0.407F, 0.1619F, -0.1128F, 0.8839F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(22, 5).addBox(1.5176F, -1.2504F, -0.4812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0311F, -0.407F, 0.087F, -0.177F, 1.3915F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(7, 38).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5474F, 4.1395F, -2.7157F, 0.7929F, 0.0569F, -0.3716F));

		PartDefinition cube_r72 = leftArm1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(44, 39).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(15, 32).addBox(-0.45F, -0.25F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0941F, 3.5353F, -0.0475F, -1.2658F, 0.0387F, -0.0202F));

		PartDefinition cube_r73 = leftArm2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(10, 46).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftArm2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(44, 44).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(35, 10).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(33, 22).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 3.8F, -0.3F, 0.499F, -0.223F, -0.0302F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(34, 29).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.474F, -0.056F, -0.211F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(7, 38).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5474F, 4.1395F, -2.7157F, -0.0596F, -0.2218F, 0.2273F));

		PartDefinition cube_r75 = rightArm1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(15, 32).mirror().addBox(-0.55F, -0.25F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0941F, 3.5353F, -0.0475F, -1.2519F, 0.2938F, 0.1277F));

		PartDefinition cube_r76 = rightArm2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(10, 46).mirror().addBox(0.75F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightArm2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(35, 10).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(33, 22).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.8F, -0.3F, 0.4868F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(34, 29).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.4765F, -0.024F, 0.0558F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -3.7F, -0.1309F, 0.1745F, 0.0F));

		PartDefinition cube_r78 = neck3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(45, 10).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.9F, -1.0448F, -0.3265F, 0.5048F));

		PartDefinition cube_r79 = neck3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 10).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -0.9F, -1.0448F, 0.3265F, -0.5048F));

		PartDefinition cube_r80 = neck3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(19, 39).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.1429F, -0.4663F, -0.1698F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.6F, -3.8F, -1.1312F, -0.1495F, 0.1561F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5F, -2.8F, -1.1942F, -0.1756F, 0.2217F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.8F, -1.21F, -0.207F, 0.3047F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -0.8F, -1.1409F, -0.2441F, 0.3857F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -3.8F, -1.1312F, 0.1495F, -0.1561F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 31).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5F, -2.8F, -1.1942F, 0.1756F, -0.2217F));

		PartDefinition cube_r87 = neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2F, -1.8F, -1.21F, 0.207F, -0.3047F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 47).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -0.8F, -1.1409F, 0.2441F, -0.3857F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(13, 18).addBox(-1.0F, -0.6F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.6F, -0.6F, -0.829F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2F, -3.8F, 0.1874F, -0.4199F, -0.0065F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 5).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r91 = neck.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 15).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -2.1F, -0.7822F, -0.1495F, 0.1561F));

		PartDefinition cube_r92 = neck.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 18).mirror().addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -1.0F, -0.9392F, -0.1495F, 0.1561F));

		PartDefinition cube_r93 = neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 15).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.1F, -0.7822F, 0.1495F, -0.1561F));

		PartDefinition cube_r94 = neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(22, 18).addBox(0.0F, -0.6399F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -1.0F, -0.9392F, 0.1495F, -0.1561F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(29, 50).addBox(-0.1F, -1.298F, -1.1661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 48).addBox(0.0F, -1.5F, -1.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 48).mirror().addBox(-1.0F, -1.5F, -1.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 50).mirror().addBox(-0.9F, -1.298F, -1.1661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, -2.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(31, 41).addBox(0.0F, 0.2119F, -1.7624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F))
				.texOffs(42, 2).addBox(0.0F, 0.0119F, -1.6624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.198F, -3.6661F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(49, 35).addBox(0.0F, -0.2881F, -2.1624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(10, 42).addBox(0.0F, -0.2881F, -1.7624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5F, -0.198F, -3.6661F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(35, 49).addBox(0.0F, -0.7102F, -0.0883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.3F, 0.602F, -3.4661F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-1.0F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1902F)).mirror(false)
				.texOffs(49, 38).addBox(0.2F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1902F)), PartPose.offsetAndRotation(-0.1F, 0.1732F, 0.0479F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(-1.0F, -0.7F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 50).mirror().addBox(-1.0F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(24, 50).addBox(-0.2F, -0.7F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 50).addBox(-0.2F, -0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(49, 45).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(49, 45).addBox(0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.1F, -1.298F, -0.1661F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(42, 36).mirror().addBox(-1.35F, 0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 30).mirror().addBox(-1.02F, 0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(43, 17).mirror().addBox(-1.24F, 0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 36).addBox(-0.85F, 0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 17).addBox(-0.96F, 0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 30).addBox(-0.18F, 0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(50, 27).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, -1.298F, -1.1661F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 19).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 9).addBox(0.94F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 19).addBox(0.94F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.72F, -0.6085F, -0.5963F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 50).mirror().addBox(-0.8F, -1.013F, -1.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(19, 50).addBox(-0.2F, -1.013F, -1.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-1.2F, -0.142F, -0.8581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(17, 43).mirror().addBox(-1.0F, -0.142F, -1.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(10, 50).addBox(-0.4F, -0.142F, -0.8581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(17, 43).addBox(-0.6F, -0.142F, -1.8581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.3F, -0.998F, -2.1661F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.5F, -0.66F, -0.7046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 4).mirror().addBox(-0.5F, -0.66F, -1.1046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(48, 42).mirror().addBox(-0.2F, -0.76F, -2.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 42).addBox(0.04F, -0.76F, -2.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 4).addBox(0.34F, -0.66F, -1.1046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(5, 49).addBox(0.34F, -0.66F, -0.7046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.42F, -0.1011F, -2.5271F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-1.0F, -0.9102F, -0.0883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 41).addBox(-0.6F, -0.9102F, -0.0883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 0.602F, -3.4661F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(48, 48).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(0, 49).addBox(0.34F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(48, 48).addBox(0.34F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.42F, 0.0748F, -2.8936F, 0.0349F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(40, 13).addBox(0.1F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F))
				.texOffs(40, 13).mirror().addBox(-1.1F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 47).addBox(0.0F, -0.8108F, -2.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(48, 24).addBox(0.0F, -0.8108F, -2.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2103F))
				.texOffs(26, 39).mirror().addBox(-0.3F, -0.8108F, -0.8722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 39).addBox(0.3F, -0.8108F, -0.8722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 32).addBox(0.0F, -0.8108F, -1.6722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.0F, -0.2558F, -0.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(0, 40).addBox(0.0F, -0.2558F, -0.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.4F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(47, 14).mirror().addBox(-0.5F, -0.4901F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 14).addBox(0.94F, -0.4901F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.72F, -0.0677F, -1.199F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(-0.5F, -0.4837F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(43, 24).addBox(0.74F, -0.4837F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.62F, -0.0677F, -1.199F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(-1.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 8).addBox(0.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(20, 47).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 47).addBox(0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.3F, -0.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(31, 15).addBox(0.0F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.5F, -0.5774F, -3.7342F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 24).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(39, 51).addBox(0.0F, -1.5F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 51).addBox(0.0F, -1.3F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.9F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(5, 4).addBox(0.0F, 0.1F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 14).addBox(0.0F, -0.6F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.4F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(41, 45).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 15).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 11).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 32).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.8F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(31, 30).addBox(0.0F, 2.5F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 22).addBox(0.0F, 2.0F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 11).addBox(0.0F, 0.8F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.4F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.1949F, -0.1713F, -0.0336F));

		PartDefinition cube_r117 = tail3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 30).addBox(0.0F, 3.9F, 11.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 5).addBox(0.0F, 3.1F, 9.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -10.4F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1347F, -0.4329F, 0.0568F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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