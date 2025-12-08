package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PambdelurionFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart Pambdelurion;
	private final ModelPart leftFin4;
	private final ModelPart rightFin4;
	private final ModelPart leftFin5;
	private final ModelPart rightFin5;
	private final ModelPart leftFin6;
	private final ModelPart rightFin6;
	private final ModelPart tail1;
	private final ModelPart leftFin7;
	private final ModelPart rightFin7;
	private final ModelPart leftFin8;
	private final ModelPart rightFin8;
	private final ModelPart tail2;
	private final ModelPart leftFin9;
	private final ModelPart rightFin9;
	private final ModelPart tail3;
	private final ModelPart leftFin10;
	private final ModelPart rightFin10;
	private final ModelPart tail4;
	private final ModelPart leftFin11;
	private final ModelPart rightFin11;
	private final ModelPart leftFin12;
	private final ModelPart rightFin12;
	private final ModelPart leftLeg11;
	private final ModelPart rightLeg11;
	private final ModelPart neck1;
	private final ModelPart leftFin2;
	private final ModelPart rightFin2;
	private final ModelPart leftFin3;
	private final ModelPart rightFin3;
	private final ModelPart leftLeg2;
	private final ModelPart rightLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg3;
	private final ModelPart neck2;
	private final ModelPart leftFin1;
	private final ModelPart rightFin1;
	private final ModelPart leftLeg1;
	private final ModelPart rightLeg1;
	private final ModelPart head;
	private final ModelPart leftAppendage1;
	private final ModelPart leftAppendage2;
	private final ModelPart leftAppendage3;
	private final ModelPart leftSpine2;
	private final ModelPart leftSpine3;
	private final ModelPart rightAppendage1;
	private final ModelPart rightAppendage2;
	private final ModelPart rightAppendage3;
	private final ModelPart rightSpine1;
	private final ModelPart rightSpine2;
	private final ModelPart rightSpine3;

	public PambdelurionFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.Pambdelurion = this.bone.getChild("Pambdelurion");
		this.leftFin4 = this.Pambdelurion.getChild("leftFin4");
		this.rightFin4 = this.Pambdelurion.getChild("rightFin4");
		this.leftFin5 = this.Pambdelurion.getChild("leftFin5");
		this.rightFin5 = this.Pambdelurion.getChild("rightFin5");
		this.leftFin6 = this.Pambdelurion.getChild("leftFin6");
		this.rightFin6 = this.Pambdelurion.getChild("rightFin6");
		this.tail1 = this.Pambdelurion.getChild("tail1");
		this.leftFin7 = this.tail1.getChild("leftFin7");
		this.rightFin7 = this.tail1.getChild("rightFin7");
		this.leftFin8 = this.tail1.getChild("leftFin8");
		this.rightFin8 = this.tail1.getChild("rightFin8");
		this.tail2 = this.tail1.getChild("tail2");
		this.leftFin9 = this.tail2.getChild("leftFin9");
		this.rightFin9 = this.tail2.getChild("rightFin9");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftFin10 = this.tail3.getChild("leftFin10");
		this.rightFin10 = this.tail3.getChild("rightFin10");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftFin11 = this.tail4.getChild("leftFin11");
		this.rightFin11 = this.tail4.getChild("rightFin11");
		this.leftFin12 = this.tail4.getChild("leftFin12");
		this.rightFin12 = this.tail4.getChild("rightFin12");
		this.leftLeg11 = this.tail4.getChild("leftLeg11");
		this.rightLeg11 = this.tail4.getChild("rightLeg11");
		this.neck1 = this.Pambdelurion.getChild("neck1");
		this.leftFin2 = this.neck1.getChild("leftFin2");
		this.rightFin2 = this.neck1.getChild("rightFin2");
		this.leftFin3 = this.neck1.getChild("leftFin3");
		this.rightFin3 = this.neck1.getChild("rightFin3");
		this.leftLeg2 = this.neck1.getChild("leftLeg2");
		this.rightLeg2 = this.neck1.getChild("rightLeg2");
		this.leftLeg3 = this.neck1.getChild("leftLeg3");
		this.rightLeg3 = this.neck1.getChild("rightLeg3");
		this.neck2 = this.neck1.getChild("neck2");
		this.leftFin1 = this.neck2.getChild("leftFin1");
		this.rightFin1 = this.neck2.getChild("rightFin1");
		this.leftLeg1 = this.neck2.getChild("leftLeg1");
		this.rightLeg1 = this.neck2.getChild("rightLeg1");
		this.head = this.neck2.getChild("head");
		this.leftAppendage1 = this.head.getChild("leftAppendage1");
		this.leftAppendage2 = this.leftAppendage1.getChild("leftAppendage2");
		this.leftAppendage3 = this.leftAppendage2.getChild("leftAppendage3");
		this.leftSpine2 = this.leftAppendage3.getChild("leftSpine2");
		this.leftSpine3 = this.leftAppendage3.getChild("leftSpine3");
		this.rightAppendage1 = this.head.getChild("rightAppendage1");
		this.rightAppendage2 = this.rightAppendage1.getChild("rightAppendage2");
		this.rightAppendage3 = this.rightAppendage2.getChild("rightAppendage3");
		this.rightSpine1 = this.rightAppendage3.getChild("rightSpine1");
		this.rightSpine2 = this.rightAppendage3.getChild("rightSpine2");
		this.rightSpine3 = this.rightAppendage3.getChild("rightSpine3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 77).addBox(-11.0F, -1.0F, -7.0F, 22.0F, 1.0F, 23.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-11.275F, -1.0F, -29.525F, 23.0F, 1.0F, 23.0F, new CubeDeformation(0.01F))
				.texOffs(0, 52).addBox(-21.275F, -1.0F, -29.525F, 23.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -0.05F, 6.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(91, 77).addBox(-9.175F, -0.5F, -8.05F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(10.575F, -0.5F, 1.025F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.108F, -0.5F, -0.5805F, 23.0F, 1.0F, 25.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-21.175F, -0.5F, -5.975F, 0.0F, 0.3011F, 0.0F));

		PartDefinition Pambdelurion = bone.addOrReplaceChild("Pambdelurion", CubeListBuilder.create().texOffs(91, 87).addBox(-4.0F, 0.17F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-2.0F, -0.125F, -0.8F, 0.0F, -0.2618F, -3.1416F));

		PartDefinition leftFin4 = Pambdelurion.addOrReplaceChild("leftFin4", CubeListBuilder.create(), PartPose.offset(4.0F, -0.25F, -3.0F));

		PartDefinition cube_r3 = leftFin4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 102).addBox(-1.0458F, 0.325F, -1.5128F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition rightFin4 = Pambdelurion.addOrReplaceChild("rightFin4", CubeListBuilder.create(), PartPose.offset(-4.0F, -0.25F, -3.0F));

		PartDefinition cube_r4 = rightFin4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 102).addBox(-4.9542F, 0.325F, -1.5128F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftFin5 = Pambdelurion.addOrReplaceChild("leftFin5", CubeListBuilder.create(), PartPose.offset(4.0F, -0.25F, -0.25F));

		PartDefinition cube_r5 = leftFin5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 97).addBox(-0.6307F, 0.25F, -1.5057F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightFin5 = Pambdelurion.addOrReplaceChild("rightFin5", CubeListBuilder.create(), PartPose.offset(-4.0F, -0.25F, -0.25F));

		PartDefinition cube_r6 = rightFin5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 102).addBox(-5.3693F, 0.25F, -1.5057F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftFin6 = Pambdelurion.addOrReplaceChild("leftFin6", CubeListBuilder.create(), PartPose.offset(4.0F, -0.25F, 2.5F));

		PartDefinition cube_r7 = leftFin6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5654F, 0.325F, -1.5014F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightFin6 = Pambdelurion.addOrReplaceChild("rightFin6", CubeListBuilder.create(), PartPose.offset(-4.0F, -0.25F, 2.5F));

		PartDefinition cube_r8 = rightFin6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 102).addBox(-5.4346F, 0.325F, -1.5014F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0433F, 0.0F));

		PartDefinition tail1 = Pambdelurion.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(93, 27).addBox(-3.5F, 0.1F, -1.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition leftFin7 = tail1.addOrReplaceChild("leftFin7", CubeListBuilder.create(), PartPose.offset(3.5F, -0.4F, 1.0F));

		PartDefinition cube_r9 = leftFin7.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 5).addBox(-0.3846F, 0.4F, -1.5014F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightFin7 = tail1.addOrReplaceChild("rightFin7", CubeListBuilder.create(), PartPose.offset(-3.5F, -0.4F, 1.0F));

		PartDefinition cube_r10 = rightFin7.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(97, 15).addBox(-5.6154F, 0.4F, -1.5014F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition leftFin8 = tail1.addOrReplaceChild("leftFin8", CubeListBuilder.create(), PartPose.offset(3.5F, -0.35F, 3.5F));

		PartDefinition cube_r11 = leftFin8.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(97, 10).addBox(-1.3042F, 0.425F, -1.5128F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightFin8 = tail1.addOrReplaceChild("rightFin8", CubeListBuilder.create(), PartPose.offset(-3.5F, -0.35F, 3.5F));

		PartDefinition cube_r12 = rightFin8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(97, 20).addBox(-4.6958F, 0.425F, -1.5128F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(97, 0).addBox(-3.0F, 0.08F, -1.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition leftFin9 = tail2.addOrReplaceChild("leftFin9", CubeListBuilder.create(), PartPose.offset(3.0F, -0.35F, 0.15F));

		PartDefinition cube_r13 = leftFin9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(104, 107).addBox(-0.6917F, 0.35F, -1.3339F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightFin9 = tail2.addOrReplaceChild("rightFin9", CubeListBuilder.create(), PartPose.offset(-3.0F, -0.35F, 0.15F));

		PartDefinition cube_r14 = rightFin9.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(110, 97).addBox(-4.3083F, 0.35F, -1.3339F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(53, 107).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition leftFin10 = tail3.addOrReplaceChild("leftFin10", CubeListBuilder.create(), PartPose.offset(2.5F, -0.35F, 0.8F));

		PartDefinition cube_r15 = leftFin10.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 66).addBox(-0.5019F, 0.425F, -1.0261F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightFin10 = tail3.addOrReplaceChild("rightFin10", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.35F, 0.8F));

		PartDefinition cube_r16 = rightFin10.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(112, 70).addBox(-3.4981F, 0.425F, -1.0261F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 112).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(57, 116).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition leftFin11 = tail4.addOrReplaceChild("leftFin11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -0.35F, 0.4F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r17 = leftFin11.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 112).addBox(-0.7863F, 0.35F, -1.1732F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightFin11 = tail4.addOrReplaceChild("rightFin11", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.35F, 0.4F));

		PartDefinition cube_r18 = rightFin11.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 112).addBox(-3.2137F, 0.35F, -1.1732F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftFin12 = tail4.addOrReplaceChild("leftFin12", CubeListBuilder.create(), PartPose.offset(0.5F, -0.25F, 1.5F));

		PartDefinition cube_r19 = leftFin12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 19).addBox(-0.3709F, 0.25F, -0.0817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition rightFin12 = tail4.addOrReplaceChild("rightFin12", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.25F, 1.5F));

		PartDefinition cube_r20 = rightFin12.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(116, 23).addBox(-0.6291F, 0.25F, -0.0817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leftLeg11 = tail4.addOrReplaceChild("leftLeg11", CubeListBuilder.create(), PartPose.offset(1.25F, 1.0F, 0.25F));

		PartDefinition rightLeg11 = tail4.addOrReplaceChild("rightLeg11", CubeListBuilder.create(), PartPose.offset(-1.25F, 1.0F, 0.25F));

		PartDefinition neck1 = Pambdelurion.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(93, 35).addBox(-3.5F, 0.1F, -4.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftFin2 = neck1.addOrReplaceChild("leftFin2", CubeListBuilder.create(), PartPose.offset(3.5F, -0.35F, -3.5F));

		PartDefinition cube_r21 = leftFin2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 112).addBox(-1.342F, 0.425F, -1.0603F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition rightFin2 = neck1.addOrReplaceChild("rightFin2", CubeListBuilder.create(), PartPose.offset(-3.5F, -0.35F, -3.5F));

		PartDefinition cube_r22 = rightFin2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 112).addBox(-3.658F, 0.425F, -1.0603F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leftFin3 = neck1.addOrReplaceChild("leftFin3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -0.35F, -1.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftFin3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(95, 102).addBox(-1.3247F, 0.35F, -1.5356F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition rightFin3 = neck1.addOrReplaceChild("rightFin3", CubeListBuilder.create(), PartPose.offset(-3.5F, -0.35F, -1.5F));

		PartDefinition cube_r24 = rightFin3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 107).addBox(-4.6753F, 0.35F, -1.5356F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftLeg2 = neck1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offset(2.5F, 1.0F, -3.15F));

		PartDefinition rightLeg2 = neck1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.0F, -3.15F));

		PartDefinition leftLeg3 = neck1.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offset(2.75F, 1.0F, -1.2F));

		PartDefinition rightLeg3 = neck1.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offset(-2.75F, 1.0F, -1.2F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(93, 42).addBox(-3.0F, 0.08F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftFin1 = neck2.addOrReplaceChild("leftFin1", CubeListBuilder.create(), PartPose.offset(3.0F, -0.45F, -1.5F));

		PartDefinition cube_r25 = leftFin1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(112, 62).addBox(-0.9784F, 0.45F, -0.8452F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rightFin1 = neck2.addOrReplaceChild("rightFin1", CubeListBuilder.create(), PartPose.offset(-3.0F, -0.45F, -1.5F));

		PartDefinition cube_r26 = rightFin1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(95, 112).addBox(-3.0216F, 0.45F, -0.8452F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition leftLeg1 = neck2.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, -1.25F));

		PartDefinition rightLeg1 = neck2.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.0F, -1.25F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(112, 74).addBox(-2.0F, -0.23F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 64).addBox(-2.5F, -0.25F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(25, 116).addBox(1.75F, -0.15F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 116).addBox(-2.75F, -0.15F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, -3.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(86, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3512F, 0.75F, -0.8754F, -0.1745F, 2.3998F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8514F, 0.75F, -3.5074F, -0.1745F, 0.6545F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7026F, 0.75F, -2.2829F, 0.0F, 1.5708F, 0.1745F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7026F, 0.75F, -2.2829F, 0.0F, -1.5708F, -0.1745F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3512F, 0.75F, -0.8754F, -0.1745F, -2.3998F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(96, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8514F, 0.75F, -3.5074F, -0.1745F, -0.6545F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 116).addBox(-1.0F, -1.975F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 1.725F, -4.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(50, 116).addBox(-1.0F, -1.975F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.15F, 1.725F, -4.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 116).addBox(0.0F, -1.975F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.15F, 1.725F, -4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(116, 15).addBox(0.0F, -1.975F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 1.725F, -4.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftAppendage1 = head.addOrReplaceChild("leftAppendage1", CubeListBuilder.create().texOffs(93, 58).addBox(-1.0F, -0.48F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 0.25F, -1.0F, 0.0088F, 0.6605F, -0.0016F));

		PartDefinition cube_r37 = leftAppendage1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(114, 102).addBox(-0.5F, 0.4F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -0.9F, -2.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r38 = leftAppendage1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(18, 116).addBox(-0.25F, 0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -0.9F, -2.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leftAppendage2 = leftAppendage1.addOrReplaceChild("leftAppendage2", CubeListBuilder.create().texOffs(70, 107).addBox(-1.0F, -0.48F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -0.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r39 = leftAppendage2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(108, 112).addBox(-0.0081F, -0.25F, -3.4946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -0.25F, -1.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r40 = leftAppendage2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(116, 5).addBox(-0.0111F, -0.25F, -2.9906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -0.25F, -1.5F, 0.0F, -0.5061F, 0.0F));

		PartDefinition leftAppendage3 = leftAppendage2.addOrReplaceChild("leftAppendage3", CubeListBuilder.create().texOffs(43, 112).addBox(-1.0F, -0.98F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.95F, 0.5F, -0.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r41 = leftAppendage3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(114, 48).addBox(0.0F, -0.25F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.75F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition leftSpine2 = leftAppendage3.addOrReplaceChild("leftSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, -0.6F, -0.5F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r42 = leftSpine2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 107).addBox(0.5F, 0.5F, -4.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, 2.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftSpine3 = leftAppendage3.addOrReplaceChild("leftSpine3", CubeListBuilder.create().texOffs(93, 48).addBox(0.0F, -0.5F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -0.5F, 1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rightAppendage1 = head.addOrReplaceChild("rightAppendage1", CubeListBuilder.create().texOffs(93, 70).addBox(-4.0F, -0.43F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.5F, 0.2F, -1.0F, 0.0065F, -0.0933F, 0.0091F));

		PartDefinition cube_r43 = rightAppendage1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5F, 0.45F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -0.9F, -2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r44 = rightAppendage1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 116).addBox(-0.75F, 1.45F, -1.9F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -0.9F, -2.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r45 = rightAppendage1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(114, 54).addBox(-1.0F, 0.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -0.9F, -2.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition rightAppendage2 = rightAppendage1.addOrReplaceChild("rightAppendage2", CubeListBuilder.create().texOffs(87, 107).addBox(-4.0F, -0.43F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -0.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r46 = rightAppendage2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(114, 42).addBox(-0.9919F, -0.2F, -3.4946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -0.25F, -1.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r47 = rightAppendage2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(116, 10).addBox(-0.9889F, -0.2F, -2.9906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.25F, -1.5F, 0.0F, 0.5061F, 0.0F));

		PartDefinition rightAppendage3 = rightAppendage2.addOrReplaceChild("rightAppendage3", CubeListBuilder.create().texOffs(56, 112).addBox(-3.0F, -0.93F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.95F, 0.5F, -0.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r48 = rightAppendage3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 116).addBox(-1.0F, -0.2F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.75F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rightSpine1 = rightAppendage3.addOrReplaceChild("rightSpine1", CubeListBuilder.create().texOffs(112, 58).addBox(-4.2701F, -0.25F, -0.9865F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.7F, -0.9F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightSpine2 = rightAppendage3.addOrReplaceChild("rightSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, -0.6F, -0.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r49 = rightSpine2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 107).addBox(-5.5F, 0.55F, -4.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, 2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightSpine3 = rightAppendage3.addOrReplaceChild("rightSpine3", CubeListBuilder.create().texOffs(93, 53).addBox(-7.0F, -0.45F, -3.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.95F, -0.5F, 1.0F, 0.0F, -0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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