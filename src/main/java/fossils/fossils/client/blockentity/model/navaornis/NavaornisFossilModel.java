package fossils.fossils.client.blockentity.model.navaornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NavaornisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public NavaornisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4803F, -17.5786F, 6.8875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-1.0F, -0.4801F, 0.3415F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 21).addBox(1.0F, -0.4801F, 0.3415F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(0.0F, -0.9801F, -0.6585F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9803F, -1.2637F, -4.9355F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 28).addBox(0.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(50, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4803F, -0.1212F, -1.646F, -0.6632F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6197F, 0.1492F, -2.3006F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 14).addBox(-0.5F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 8.0255F, 1.5109F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(67, 63).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 7.4457F, 1.7638F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(67, 60).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 7.7661F, 2.23F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 57).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(46, 67).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 8.479F, 1.8668F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 67).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 8.4824F, 1.4668F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 11).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 8.1899F, 1.194F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 67).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 7.8643F, 0.9617F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 33).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 5.655F, 0.024F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -2.7F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 2.0011F, -0.2526F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, -2.7F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 1.9618F, -0.751F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 69).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.3507F, -0.2817F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(69, 29).addBox(-0.5F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.3404F, -0.3306F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 61).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.2F, 3.3599F, -0.6777F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 70).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 5.3395F, 1.6142F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 47).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 5.0003F, 1.4022F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 69).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 32).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 4.2586F, 1.1025F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(69, 50).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 4.4796F, 1.6233F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(25, 73).addBox(-0.5F, -0.3F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 1.3712F, 0.7097F, -2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5F, -0.7F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 1.562F, 0.4783F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 13).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 73).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.4166F, 1.5125F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2F, 2.8079F, 1.5957F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 69).addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 2.9844F, 1.2492F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 4.165F, 1.5427F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 49).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2F, 3.5323F, 1.1526F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 57).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 3.3599F, -0.6777F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 53).addBox(-0.2F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.8233F, 2.363F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(71, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.0516F, 1.7269F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(56, 17).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.139F, -0.2097F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(10, 70).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -1.6615F, -1.0624F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.7173F, -1.8604F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 49).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4838F, -2.8328F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -2.4427F, -2.5488F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5037F, -1.5507F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.9812F, -0.698F, -2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 65).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.5672F, -0.6733F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.5978F, 0.9665F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 20).addBox(-0.5F, -0.8053F, -0.5639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.3808F, 0.8723F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(43, 50).addBox(-0.5F, 1.05F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.8F, 0.7F, -0.4887F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5803F, 0.1492F, -2.3006F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(-0.5F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.0255F, 1.5109F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(67, 63).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 7.4457F, 1.7638F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, 7.7661F, 2.23F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(46, 67).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.479F, 1.8668F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.4824F, 1.4668F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 11).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.1899F, 1.194F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 7.8643F, 0.9617F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(5, 33).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.655F, 0.024F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 37).mirror().addBox(-0.5F, -2.7F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.0011F, -0.2526F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.5F, -2.7F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.9618F, -0.751F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.3507F, -0.2817F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-0.5F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.3404F, -0.3306F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.2F, 3.3599F, -0.6777F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.3395F, 1.6142F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 5.0003F, 1.4022F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 32).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 4.2586F, 1.1025F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 4.4796F, 1.6233F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(25, 73).mirror().addBox(-0.5F, -0.3F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.3712F, 0.7097F, -2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-0.5F, -0.7F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.562F, 0.4783F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 73).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.4166F, 1.5125F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.8079F, 1.5957F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 69).mirror().addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.9844F, 1.2492F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2F, 4.165F, 1.5427F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2F, 3.5323F, 1.1526F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(33, 57).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 3.3599F, -0.6777F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.8F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.8233F, 2.363F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0516F, 1.7269F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.139F, -0.2097F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.6615F, -1.0624F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.7173F, -1.8604F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.4838F, -2.8328F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4427F, -2.5488F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.5037F, -1.5507F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.9812F, -0.698F, -2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5672F, -0.6733F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5978F, 0.9665F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-0.5F, -0.8053F, -0.5639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3808F, 0.8723F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-0.5F, 1.05F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8F, 0.7F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7197F, 0.9252F, -2.4182F, -1.2983F, -0.1502F, 0.0893F));

		PartDefinition cube_r79 = leftLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 79).addBox(0.0F, -0.375F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 8.0031F, -1.4544F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 6).addBox(0.0F, 0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 7.7569F, -0.7544F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 8.8592F, -1.0089F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(20, 74).addBox(0.0F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 8.922F, -1.8064F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(74, 6).addBox(0.0F, -0.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(40, 73).addBox(0.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 7.7744F, -2.1573F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(7, 50).addBox(0.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 5.9755F, -2.2201F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.1824F, -2.0632F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(29, 48).addBox(0.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 2.4285F, -1.6583F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 71).addBox(0.0F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 0.0825F, 0.3521F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(40, 79).addBox(0.0F, -0.9F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 29).addBox(0.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 1.4394F, -0.4957F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(36, 49).addBox(0.0F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.9638F, -0.3412F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 50).addBox(0.0F, -0.45F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -0.2635F, -0.4782F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 8.397F, -0.7574F, 2.0155F, 0.0883F, 0.0971F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(74, 48).addBox(-0.6F, -0.75F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.7F, 10.1788F, -1.3622F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(74, 45).addBox(-0.6F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.7F, 10.4386F, -1.6664F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 32).addBox(-0.6F, 9.3F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 16).addBox(-0.6F, -0.3F, -0.375F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7F, 0.4352F, -0.2618F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(75, 38).addBox(-0.6F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 0.6066F, -0.2127F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 75).addBox(-0.6F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(15, 75).addBox(-0.6F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -0.0083F, -0.0643F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(74, 72).addBox(-0.6F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(74, 51).addBox(-0.6F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.7F, 0.4352F, -0.2618F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(50, 29).addBox(-0.5F, -0.6F, -1.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1553F, 0.3141F, 0.1594F, 1.2917F, 0.0073F, -0.0005F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(39, 40).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1566F, 0.0868F, -0.0089F, -0.1482F, 0.0073F, -0.0005F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(24, 45).addBox(-1.1F, -0.0447F, -0.5239F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 10.5037F, -1.5382F, -1.3526F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8132F, 3.5313F, 0.2662F, 1.4263F, 0.3795F, -3.0785F));

		PartDefinition cube_r99 = toe3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 65).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r100 = toe3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(10, 66).addBox(-0.3F, -0.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2679F, 1.2336F, 1.0899F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(32, 22).addBox(-2.0F, 0.0F, -1.85F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7455F, 0.2457F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(15, 13).addBox(-2.0F, -0.9F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.9031F, -1.8007F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6803F, 0.9252F, -2.4182F, -1.2983F, 0.1502F, -0.0893F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-1.0F, -0.375F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0031F, -1.4544F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-1.0F, 0.125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.7569F, -0.7544F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-1.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.8592F, -1.0089F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-1.0F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.922F, -1.8064F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-1.0F, -0.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(40, 73).mirror().addBox(-1.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.7744F, -2.1573F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(7, 50).mirror().addBox(-1.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9755F, -2.2201F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1824F, -2.0632F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 48).mirror().addBox(-1.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4285F, -1.6583F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(79, 71).mirror().addBox(-1.0F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0825F, 0.3521F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-1.0F, -0.9F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(74, 29).mirror().addBox(-1.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4394F, -0.4957F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-1.0F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9638F, -0.3412F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(50, 50).mirror().addBox(-1.0F, -0.45F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2635F, -0.4782F, 1.309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 8.397F, -0.7574F, 2.0155F, -0.0883F, -0.0971F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-0.4F, -0.75F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.7F, 10.1788F, -1.3622F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(74, 45).mirror().addBox(-0.4F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.7F, 10.4386F, -1.6664F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-0.4F, 9.3F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 16).mirror().addBox(-0.4F, -0.3F, -0.375F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.4352F, -0.2618F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(-0.4F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.6066F, -0.2127F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.4F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(15, 75).mirror().addBox(-0.4F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.0083F, -0.0643F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(74, 72).mirror().addBox(-0.4F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(74, 51).mirror().addBox(-0.4F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.4352F, -0.2618F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 29).mirror().addBox(-0.5F, -0.6F, -1.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1553F, 0.3141F, 0.1594F, 1.2917F, -0.0073F, 0.0005F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(39, 40).mirror().addBox(-0.5F, -0.4F, -0.575F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1566F, 0.0868F, -0.0089F, -0.1482F, -0.0073F, 0.0005F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(24, 45).mirror().addBox(0.1F, -0.0447F, -0.5239F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2F, 10.5037F, -1.5382F, -1.3526F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8132F, 3.5313F, 0.2662F, 1.4263F, -0.3795F, 3.0785F));

		PartDefinition cube_r121 = toe2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(62, 65).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r122 = toe2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 66).mirror().addBox(-0.7F, -0.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2679F, 1.2336F, 1.0899F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-1.0F, 0.0F, -1.85F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7455F, 0.2457F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(15, 13).mirror().addBox(-1.0F, -0.9F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9031F, -1.8007F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4803F, 1.1559F, -0.1894F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2835F, 1.8669F, 0.2007F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r123 = tail3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 56).addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3676F, 0.3161F, 2.4609F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(64, 29).addBox(-0.5F, -0.9F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3088F, 0.6305F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(54, 72).addBox(-0.5F, -1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 72).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0169F, 3.1315F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.7314F, 3.3677F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, -1.125F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 54).addBox(-0.5F, -1.125F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.3458F, 2.0297F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 45).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.706F, 0.0598F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4803F, -2.0197F, -4.8018F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 63).addBox(0.0F, 0.9699F, 4.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 83).addBox(0.0F, 0.8699F, 2.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.8F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-4.1997F, -1.8254F, -0.5631F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.4408F, -0.0011F, 0.0391F, -1.3977F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-2.8177F, -0.4809F, -0.5631F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.4408F, 0.0186F, 0.0344F, -0.8738F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 61).mirror().addBox(-0.9496F, 0.0103F, -0.5457F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.4408F, 0.0707F, 0.0011F, -0.3301F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(82, 63).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.0316F, -0.1063F, -1.466F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.0715F, -0.0423F, -0.3965F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(64, 3).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.0806F, -0.0763F, -0.941F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 3).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.0806F, 0.0763F, 0.941F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(83, 12).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.0715F, 0.0423F, 0.3965F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 63).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.0316F, 0.1063F, 1.466F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 61).addBox(-0.0504F, 0.0103F, -0.5457F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.4408F, 0.0707F, -0.0011F, 0.3301F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 47).addBox(0.8177F, -0.4809F, -0.5631F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.4408F, 0.0186F, -0.0344F, 0.8738F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(65, 37).addBox(2.1997F, -1.8254F, -0.5631F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.4408F, -0.0011F, -0.0391F, 1.3977F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 8).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.6908F, -1.85F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.1457F, -6.6053F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(5, 18).addBox(-1.0F, 0.9494F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.6F, -3.3F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.5F, -1.615F, -3.6408F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(16, 18).addBox(-1.0F, 0.9494F, -4.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.985F, 0.3408F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 83).addBox(0.0F, 0.8949F, -1.193F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 61).addBox(0.0F, 0.8949F, 0.807F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.285F, -1.1592F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 16).mirror().addBox(-5.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.6F, 0.0072F, 0.0645F, -1.3803F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.6F, 0.0385F, 0.0523F, -0.8559F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.6F, 0.0969F, 0.0061F, -0.313F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(41, 2).mirror().addBox(-6.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6F, -2.6F, 0.0138F, 0.0988F, -1.3797F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6F, -2.6F, 0.0615F, 0.0786F, -0.8544F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6F, -2.6F, 0.1301F, 0.0168F, -0.3126F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(81, 69).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, 0.1301F, -0.0168F, 0.3126F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(64, 24).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, 0.0615F, -0.0786F, 0.8544F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 2).addBox(2.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, 0.0138F, -0.0988F, 1.3797F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(82, 59).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0969F, -0.0061F, 0.313F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 5).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0385F, -0.0523F, 0.8559F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 16).addBox(2.2026F, -1.8494F, -0.5143F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.0072F, -0.0645F, 1.3803F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.2343F, -3.8409F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(58, 66).addBox(0.0F, -0.2468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(10, 58).addBox(0.0F, 0.0992F, -1.0624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(20, 65).addBox(0.0F, -0.8924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(16, 34).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, 0.1783F, 0.0675F, -0.3394F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-2.9689F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, 0.0766F, 0.1469F, -0.8815F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, -0.0077F, 0.1654F, -1.4113F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, 0.3215F, 0.0763F, -0.3568F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, 0.197F, 0.2275F, -0.8868F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(19, 6).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, 0.0548F, 0.2949F, -1.4248F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(38, 19).mirror().addBox(-6.1989F, -1.8196F, -0.5632F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, 0.0483F, 0.2518F, -1.4266F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(30, 4).mirror().addBox(-2.8141F, -0.4764F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, 0.169F, 0.1936F, -0.8926F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(27, 22).mirror().addBox(-0.9441F, 0.0123F, -0.5459F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, 0.2806F, 0.061F, -0.3596F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 22).addBox(-0.0559F, 0.0123F, -0.5459F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, 0.2806F, -0.061F, 0.3596F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(30, 4).addBox(0.8141F, -0.4764F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, 0.169F, -0.1936F, 0.8926F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(38, 19).addBox(2.1989F, -1.8196F, -0.5632F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, 0.0483F, -0.2518F, 1.4266F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(19, 6).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, 0.0548F, -0.2949F, 1.4248F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(64, 22).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, 0.197F, -0.2275F, 0.8868F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 14).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, 0.3215F, -0.0763F, 0.3568F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(41, 0).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, -0.0077F, -0.1654F, 1.4113F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(64, 20).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, 0.0766F, -0.1469F, 0.8815F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(16, 34).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, 0.1783F, -0.0675F, 0.3394F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9896F, -5.3098F, 1.7436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(64, 7).addBox(-0.5F, -4.0138F, -1.1844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.309F, -1.8264F, 0.6964F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(39, 9).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.8268F, -1.3407F, -0.3159F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(59, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.475F, -2.2768F, 1.2113F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(43, 61).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.533F, -4.0411F, 1.0804F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.3F, -4.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0777F, 0.9705F, -4.6675F, 1.8491F, -0.2289F, 2.9954F));

		PartDefinition cube_r186 = leftArm1.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.9F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F))
				.texOffs(79, 28).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1523F, 9.7296F, 0.5959F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftArm1.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.1523F, 7.8685F, 0.4338F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftArm1.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(48, 63).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1523F, 7.8685F, 0.4338F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftArm1.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(19, 49).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1523F, 4.1182F, -0.6139F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftArm1.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(55, 13).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1523F, 3.4112F, -0.7224F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftArm1.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1523F, 3.0199F, -1.0336F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftArm1.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1523F, -0.7479F, -0.0218F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftArm1.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(65, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.1523F, -0.6347F, 0.9717F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftArm1.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(10, 61).addBox(-0.5F, -1.825F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1523F, 1.0209F, 0.2022F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftArm1.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(60, 42).addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.1523F, 4.1551F, -0.5575F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3822F, 9.2951F, 0.5375F, 0.7617F, 0.0742F, 2.9799F));

		PartDefinition cube_r196 = leftArm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(41, 65).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.007F, 0.6067F, 0.1363F, 0.1438F, -0.0037F, -0.0067F));

		PartDefinition cube_r197 = leftArm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(63, 16).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(5, 63).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0112F, 1.3707F, 0.3936F, -0.0308F, -0.0037F, -0.0067F));

		PartDefinition cube_r198 = leftArm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(71, 3).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0047F, 0.5804F, 0.7181F, 0.0565F, -0.0037F, -0.0067F));

		PartDefinition cube_r199 = leftArm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(69, 53).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0002F, -0.5265F, 0.0045F, -2.2124F, -0.0037F, -0.0067F));

		PartDefinition cube_r200 = leftArm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0008F, -0.0187F, 0.6842F, -1.427F, -0.0037F, -0.0067F));

		PartDefinition cube_r201 = leftArm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(19, 60).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0287F, 3.5029F, -0.4769F, -0.1617F, -0.0037F, -0.0067F));

		PartDefinition cube_r202 = leftArm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -2.9F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.048F, 6.0226F, -1.1175F, -0.2489F, -0.0037F, -0.0067F));

		PartDefinition cube_r203 = leftArm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(19, 41).addBox(-0.5F, -5.8F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0775F, 9.7042F, -2.4042F, -0.3362F, -0.0037F, -0.0067F));

		PartDefinition cube_r204 = leftArm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(11, 29).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0344F, 4.7491F, 0.2727F, -0.3886F, -0.0037F, -0.0067F));

		PartDefinition cube_r205 = leftArm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0156F, 2.1796F, 0.6688F, -0.153F, -0.0037F, -0.0067F));

		PartDefinition cube_r206 = leftArm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0561F, 5.3322F, -1.4747F, -0.2519F, 0.007F, -0.0146F));

		PartDefinition cube_r207 = leftArm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(14, 41).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0001F, 1.1749F, -0.8091F, -0.2301F, 0.007F, -0.0146F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(36, 63).addBox(-1.1948F, 2.2502F, -0.1052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.2721F, 10.8809F, -1.3904F, 1.5169F, -0.2906F, 0.1798F));

		PartDefinition cube_r208 = leftHand.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(38, 58).addBox(-0.5F, -1.6F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.6948F, 6.6757F, 4.5177F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftHand.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(14, 55).addBox(-0.5F, -3.5F, -2.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(-0.3948F, 1.7443F, 1.7971F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftHand.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 36).addBox(-1.0F, -0.15F, 1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(16, 24).addBox(-1.0F, -0.15F, 0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0777F, 0.9705F, -4.6675F, 1.8491F, 0.2289F, -2.9954F));

		PartDefinition cube_r211 = rightArm1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.9F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false)
				.texOffs(79, 28).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 9.7296F, 0.5959F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightArm1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(59, 21).mirror().addBox(-0.5F, -1.1F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 7.8685F, 0.4338F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightArm1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 7.8685F, 0.4338F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightArm1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-0.5F, -0.1F, -0.05F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 4.1182F, -0.6139F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightArm1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 3.4112F, -0.7224F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightArm1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 3.0199F, -1.0336F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightArm1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1523F, -0.7479F, -0.0218F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightArm1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.1523F, -0.6347F, 0.9717F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.5F, -1.825F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 1.0209F, 0.2022F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightArm1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 4.1551F, -0.5575F, -0.1134F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3822F, 9.2951F, 0.5375F, 0.7617F, -0.0742F, -2.9799F));

		PartDefinition cube_r221 = rightArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(41, 65).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.007F, 0.6067F, 0.1363F, 0.1438F, 0.0037F, 0.0067F));

		PartDefinition cube_r222 = rightArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(5, 63).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0112F, 1.3707F, 0.3936F, -0.0308F, 0.0037F, 0.0067F));

		PartDefinition cube_r223 = rightArm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0047F, 0.5804F, 0.7181F, 0.0565F, 0.0037F, 0.0067F));

		PartDefinition cube_r224 = rightArm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0002F, -0.5265F, 0.0045F, -2.2124F, 0.0037F, 0.0067F));

		PartDefinition cube_r225 = rightArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0008F, -0.0187F, 0.6842F, -1.427F, 0.0037F, 0.0067F));

		PartDefinition cube_r226 = rightArm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0287F, 3.5029F, -0.4769F, -0.1617F, 0.0037F, 0.0067F));

		PartDefinition cube_r227 = rightArm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-0.5F, -2.9F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.048F, 6.0226F, -1.1175F, -0.2489F, 0.0037F, 0.0067F));

		PartDefinition cube_r228 = rightArm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(19, 41).mirror().addBox(-0.5F, -5.8F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0775F, 9.7042F, -2.4042F, -0.3362F, 0.0037F, 0.0067F));

		PartDefinition cube_r229 = rightArm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0344F, 4.7491F, 0.2727F, -0.3886F, 0.0037F, 0.0067F));

		PartDefinition cube_r230 = rightArm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.0156F, 2.1796F, 0.6688F, -0.153F, 0.0037F, 0.0067F));

		PartDefinition cube_r231 = rightArm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0561F, 5.3322F, -1.4747F, -0.2519F, -0.007F, 0.0146F));

		PartDefinition cube_r232 = rightArm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(14, 41).mirror().addBox(-0.5F, -1.8F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0001F, 1.1749F, -0.8091F, -0.2301F, -0.007F, 0.0146F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(36, 63).mirror().addBox(0.1948F, 2.2502F, -0.1052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.2721F, 10.8809F, -1.3904F, 1.5169F, 0.2906F, -0.1798F));

		PartDefinition cube_r233 = rightHand.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(-0.5F, -1.6F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.6948F, 6.6757F, 4.5177F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightHand.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-0.5F, -3.5F, -2.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 1.7443F, 1.7971F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightHand.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(25, 36).mirror().addBox(0.0F, -0.15F, 1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(16, 24).mirror().addBox(0.0F, -0.15F, 0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.5F, 3.8846F, -6.2622F));

		PartDefinition cube_r236 = bone.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6556F, -3.1821F, 5.6997F, -0.205F, -0.0931F, -0.318F));

		PartDefinition cube_r237 = bone.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(16, 36).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0669F, -2.2815F, 2.7261F, 0.0132F, -0.0931F, -0.318F));

		PartDefinition cube_r238 = bone.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(32, 35).addBox(-0.5164F, 0.0647F, -0.2487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1858F, -3.432F, 0.2587F, -0.0741F, -0.0931F, -0.318F));

		PartDefinition cube_r239 = bone.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(45, 54).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8326F, 0.4051F, 0.3856F, 2.0062F, 0.0085F, 0.9671F));

		PartDefinition cube_r240 = bone.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(38, 54).addBox(-0.9671F, -0.6106F, -3.8732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2575F, -2.8787F, -0.0882F, 1.8503F, 0.123F, 0.5904F));

		PartDefinition cube_r241 = bone.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(44, 70).addBox(-0.5F, -0.55F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0913F, 3.1754F, 5.0745F, -1.3646F, 0.2564F, 0.9291F));

		PartDefinition cube_r242 = bone.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.175F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9665F, 3.2202F, 5.4964F, -2.15F, 0.2564F, 0.9291F));

		PartDefinition cube_r243 = bone.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(66, 69).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.9665F, 3.2202F, 5.4964F, -0.2738F, 0.2564F, 0.9291F));

		PartDefinition cube_r244 = bone.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(39, 14).addBox(-0.575F, -0.7F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5F, 3.1141F, 5.9286F, -0.1417F, 0.2573F, 0.9359F));

		PartDefinition cube_r245 = bone.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(64, 72).addBox(-1.0F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 62).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0082F, 3.2724F, 4.1552F, 1.2897F, 0.2288F, 0.9521F));

		PartDefinition cube_r246 = bone.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(62, 57).addBox(-1.0F, -1.6F, 0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0082F, 2.3304F, 2.3909F, 1.4043F, 0.7671F, 0.7436F));

		PartDefinition cube_r247 = bone.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(31, 62).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0082F, 2.3304F, 2.3909F, 1.1861F, 0.7671F, 0.7436F));

		PartDefinition cube_r248 = bone.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(57, 62).addBox(-1.3F, 0.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(62, 12).addBox(-1.3F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0F, 2.6484F, 2.2212F, 1.2736F, 0.3961F, 0.8999F));

		PartDefinition cube_r249 = bone.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(52, 21).addBox(-0.9671F, -0.019F, -1.9702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2575F, -2.8787F, -0.0882F, 1.5448F, 0.123F, 0.5904F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.5F, 3.8846F, -6.2622F));

		PartDefinition cube_r250 = bone3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6556F, -3.1821F, 5.6997F, -0.205F, 0.0931F, 0.318F));

		PartDefinition cube_r251 = bone3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(16, 36).mirror().addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0669F, -2.2815F, 2.7261F, 0.0132F, 0.0931F, 0.318F));

		PartDefinition cube_r252 = bone3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(32, 35).mirror().addBox(-0.4836F, 0.0647F, -0.2487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -3.432F, 0.2587F, -0.0741F, 0.0931F, 0.318F));

		PartDefinition cube_r253 = bone3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8326F, 0.4051F, 0.3856F, 2.0062F, -0.0085F, -0.9671F));

		PartDefinition cube_r254 = bone3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.0329F, -0.6106F, -3.8732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2575F, -2.8787F, -0.0882F, 1.8503F, -0.123F, -0.5904F));

		PartDefinition cube_r255 = bone3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-0.5F, -0.55F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.0913F, 3.1754F, 5.0745F, -1.3646F, -0.2564F, -0.9291F));

		PartDefinition cube_r256 = bone3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -0.175F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9665F, 3.2202F, 5.4964F, -2.15F, -0.2564F, -0.9291F));

		PartDefinition cube_r257 = bone3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.9665F, 3.2202F, 5.4964F, -0.2738F, -0.2564F, -0.9291F));

		PartDefinition cube_r258 = bone3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(39, 14).mirror().addBox(-0.425F, -0.7F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.5F, 3.1141F, 5.9286F, -0.1417F, -0.2573F, -0.9359F));

		PartDefinition cube_r259 = bone3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(0.0F, 0.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 62).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.0082F, 3.2724F, 4.1552F, 1.2897F, -0.2288F, -0.9521F));

		PartDefinition cube_r260 = bone3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(0.0F, -1.6F, 0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.0082F, 2.3304F, 2.3909F, 1.4043F, -0.7671F, -0.7436F));

		PartDefinition cube_r261 = bone3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0082F, 2.3304F, 2.3909F, 1.1861F, -0.7671F, -0.7436F));

		PartDefinition cube_r262 = bone3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(0.3F, 0.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(62, 12).mirror().addBox(0.3F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.0F, 2.6484F, 2.2212F, 1.2736F, -0.3961F, -0.8999F));

		PartDefinition cube_r263 = bone3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(52, 21).mirror().addBox(-0.0329F, -0.019F, -1.9702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2575F, -2.8787F, -0.0882F, 1.5448F, -0.123F, -0.5904F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0555F, -5.6887F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck6.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 38).addBox(0.0F, -0.9943F, -3.1586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4982F, -2.5159F, -0.6281F, 0.1731F, 0.0902F));

		PartDefinition cube_r265 = neck5.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(24, 52).addBox(0.0F, -0.1F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5589F, -1.8987F, 0.2015F, 0.0855F, 0.0174F));

		PartDefinition cube_r266 = neck4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(57, 49).addBox(-1.0F, -1.0981F, 2.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -4.1F, -2.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.113F, -0.2527F, 0.2037F, 0.1217F, 0.0482F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(29, 66).addBox(-1.0F, 4.0773F, -1.9318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1057F, -0.5416F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7806F, -0.5453F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(24, 64).addBox(-1.0F, 1.9272F, -1.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -3.5032F, -2.1951F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5847F, -1.4611F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(52, 25).addBox(-1.0F, 0.8616F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -1.5265F, -3.4509F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3771F, -2.7602F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(24, 61).addBox(-0.505F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.495F, -2.8724F, -2.6625F, -2.5264F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(50, 60).addBox(-0.505F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.495F, -2.7708F, -2.0712F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(41, 34).addBox(-1.0F, -1.5F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.495F, -2.287F, -1.945F, -1.9591F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(59, 26).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.005F, -2.8604F, -1.9154F, -2.9714F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(59, 0).addBox(0.0F, 0.3977F, -0.2523F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.995F, -2.9074F, -0.7175F, -1.4879F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 58).addBox(0.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.995F, -2.9074F, -0.7175F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(28, 10).addBox(-1.0F, -0.2F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.495F, -2.9074F, -0.7175F, 1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(28, 14).addBox(-1.0F, -0.1F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 6).addBox(-1.0F, -0.2F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -2.7852F, -0.1301F, 1.1912F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(41, 30).addBox(-1.0F, -1.8F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -2.0951F, 0.9001F, 2.3169F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(27, 18).addBox(-1.0F, -0.2F, -0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -1.5322F, 1.1077F, -2.7882F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(43, 25).addBox(-1.0F, -0.2F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -0.947F, 1.2402F, -1.3483F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(44, 38).addBox(-1.0F, -0.6F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -1.1245F, 0.6249F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(21, 32).addBox(-1.5F, -0.675F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.005F, -0.9655F, -0.3856F, 2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(5, 24).addBox(-1.0F, -0.7F, -1.875F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.495F, -1.4494F, -1.1415F, 2.7969F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(44, 41).addBox(-1.0F, -0.2F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -0.767F, 1.359F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 28).addBox(-1.0F, -0.8F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.495F, -0.1675F, 1.3355F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.005F, 0.8388F, 0.7603F, 1.8806F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(48, 4).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.005F, 0.1154F, -1.2917F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(55, 78).addBox(-0.5F, 0.05F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(50, 78).addBox(-0.5F, -0.25F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.005F, -0.7553F, -2.4057F, -2.0464F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(70, 78).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(65, 78).addBox(-0.5F, 0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.005F, -0.226F, -1.4734F, -2.0464F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(60, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.005F, 0.1247F, -1.518F, -2.4827F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.244F)), PartPose.offsetAndRotation(0.005F, 0.1255F, -1.6948F, -2.4827F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(15, 65).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.005F, 0.4617F, -1.7817F, -2.3518F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.95F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(48, 10).addBox(-1.5F, -0.85F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.005F, 0.4617F, -1.7817F, -2.1337F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(48, 7).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.005F, 0.4617F, -1.7817F, -2.4827F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(44, 47).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.005F, 0.5336F, -1.3635F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 47).addBox(-1.5F, -0.8F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.005F, 1.0292F, -1.0564F, -0.4756F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(29, 45).addBox(-1.5F, -0.275F, -0.225F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.005F, 0.4519F, -0.5339F, -1.5664F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(32, 26).addBox(-1.5F, -0.5F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.005F, 1.0842F, -0.5208F, -1.8719F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(44, 44).addBox(-1.5F, -0.2F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.005F, 1.2159F, 0.137F, -2.8754F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.8F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.005F, 0.3741F, 0.244F, 2.2297F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -1.8F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.005F, 0.4127F, 1.1827F, 0.7898F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(21, 24).addBox(-1.0F, -0.225F, -0.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -0.4234F, 0.2653F, -0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 53).addBox(-0.5F, 0.9686F, -5.1237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.005F, -2.3386F, -4.0648F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(82, 34).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(0.008F, -1.7415F, -9.4945F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.008F, -1.846F, -9.3239F, -2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(25, 82).addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.008F, -1.846F, -9.3239F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(10, 82).addBox(-0.55F, -0.3483F, -0.3348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.058F, -1.9942F, -9.0607F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(82, 9).addBox(-0.5F, 0.0767F, -0.3348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.2305F, -8.3162F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -0.3018F, -0.6783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.005F, -2.2305F, -8.3162F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(82, 56).addBox(-0.5F, -1.1044F, -0.2969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -1.7805F, -7.5162F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(70, 81).addBox(-0.5F, -0.2969F, -0.2956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.005F, -1.7805F, -7.5162F, 3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(60, 81).addBox(-0.5F, -0.6934F, -0.6819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -1.7985F, -7.5412F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5F, -0.6952F, -0.3236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.005F, -1.7985F, -7.1412F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(39, 4).addBox(-0.5F, -0.7214F, -0.3022F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -1.8015F, -6.7912F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.8924F, -0.9983F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(65, 75).addBox(-0.805F, -0.825F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.695F, 7.02F, -1.6642F, -2.6017F, 0.2858F, 0.0575F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(60, 75).addBox(-0.805F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.395F, 7.1216F, -1.0728F, -1.7737F, 0.4228F, -0.1164F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(55, 75).addBox(-0.805F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6486F, 7.0295F, -1.6088F, -1.7564F, -0.0914F, -0.0151F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(57, 4).addBox(-0.7F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.245F, 7.6383F, -3.4025F, 0.0975F, 0.1737F, 0.0169F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(76, 0).addBox(-0.7F, -0.2987F, -1.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(0, 76).addBox(-0.7F, -0.2987F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1026F, 7.3161F, -2.6894F, 0.1379F, 0.1928F, -0.0031F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(75, 75).addBox(-0.7F, -0.2987F, -0.712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.9726F, 7.2751F, -2.3133F, 0.1082F, 0.331F, 0.0172F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(70, 75).addBox(-0.7F, -0.2987F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.895F, 7.265F, -2.0237F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(50, 75).addBox(-0.5F, -0.2987F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.2754F, -2.3236F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(45, 75).addBox(-0.5F, -0.2987F, 0.113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(75, 41).addBox(-0.5F, -0.2987F, -0.2871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.3729F, -3.1176F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(71, 26).addBox(-0.3F, -0.6737F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.695F, 7.8117F, -3.4464F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(30, 40).addBox(-0.4479F, -0.6339F, -3.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -2.6642F, 0.1855F, -0.4403F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(20, 71).addBox(-0.4442F, -0.6479F, -1.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -2.7669F, -0.0468F, -0.0041F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(70, 42).addBox(-0.4442F, -1.2373F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -1.7197F, -0.0468F, -0.0041F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(70, 39).addBox(-0.4442F, -0.9089F, -1.346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -2.5051F, -0.0468F, -0.0041F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(77, 35).addBox(-0.4599F, -0.9235F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -1.9042F, 0.1342F, -0.2986F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(77, 54).addBox(-0.4599F, -0.5173F, -0.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 77).addBox(-0.4599F, -0.6423F, -0.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -1.4242F, 0.1342F, -0.2986F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 9).addBox(-0.4599F, -0.5377F, -0.9137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -4.9176F, -2.8205F, 0.1342F, -0.2986F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(76, 68).addBox(-0.6616F, -0.4633F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(15, 72).addBox(-0.6616F, -0.4633F, -0.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.717F, 7.8054F, -2.3953F, -0.993F, 0.6134F, -0.4977F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(57, 8).addBox(-0.7123F, -0.5405F, -0.3657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.3276F, 9.2737F, -3.5176F, -0.7713F, 0.4127F, -0.0518F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(76, 25).addBox(-0.6684F, -0.4773F, -0.3381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(76, 22).addBox(-0.6684F, -0.4055F, 0.1178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, -0.1355F, 0.0733F, 0.132F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(40, 76).addBox(-0.6684F, -0.0653F, -1.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(30, 76).addBox(-0.6684F, -0.0653F, -1.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, 2.2643F, 0.0733F, 0.132F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, -0.3158F, -0.4651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.0707F, 9.985F, 0.0378F, 1.1822F, 0.0733F, -0.2345F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(48, 13).addBox(-0.5F, -0.3158F, -1.5349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.0707F, 9.985F, 0.0378F, 0.519F, 0.0733F, -0.2345F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(66, 0).addBox(-0.6684F, -0.0069F, -0.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, 0.9117F, 0.0733F, 0.132F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(25, 76).addBox(-0.6684F, -0.3307F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, 0.3008F, 0.0733F, 0.132F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(45, 81).addBox(-0.6684F, -0.1627F, -0.5528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, 1.348F, 0.0733F, 0.132F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(76, 19).addBox(-0.6684F, -0.5172F, -0.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2724F, 10.7737F, -1.6176F, 2.7443F, 0.0733F, 0.132F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(10, 76).addBox(-0.3315F, -2.7254F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.3276F, 9.2737F, -3.5176F, -2.044F, 0.186F, 0.068F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(45, 78).addBox(-0.3315F, -0.3663F, 1.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(5, 76).addBox(-0.3315F, -0.3663F, 1.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.3276F, 9.2737F, -3.5176F, -0.6041F, 0.186F, 0.068F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(76, 3).addBox(-0.7123F, -0.429F, 0.9198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.3276F, 9.2737F, -3.5176F, -0.684F, 0.4127F, -0.0518F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(53, 41).addBox(-0.8745F, -0.7436F, 0.8285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -5.7176F, -0.3113F, 0.4188F, -0.0057F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(77, 63).addBox(-0.6636F, -0.1305F, -1.122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.7768F, 0.157F, -0.0041F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(77, 60).addBox(-0.6636F, -0.2889F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.4714F, 0.157F, -0.0041F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(35, 78).addBox(-0.6636F, -0.3342F, -1.5309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 15).addBox(-0.6636F, -0.3342F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 78).addBox(-0.6636F, -0.3342F, -0.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 12).addBox(-0.6636F, -0.3342F, -0.6309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3041F, 8.2374F, -7.2548F, -0.1758F, 0.1914F, -0.0103F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(26, 57).addBox(-0.6636F, -0.4017F, -1.6457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.1223F, 0.157F, -0.0041F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(77, 57).addBox(-0.648F, -0.5454F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0673F, 8.6467F, -5.6705F, -0.1223F, 0.157F, -0.0041F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(53, 37).addBox(-0.5906F, -0.6745F, -0.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1277F, 8.7737F, -5.7176F, -0.2534F, 0.192F, -0.0042F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 82).addBox(-0.522F, -0.8754F, -1.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.0279F, 0.2972F, -0.1969F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(75, 81).addBox(-0.8548F, -0.8561F, -1.69F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.0128F, 0.0742F, 0.0018F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(82, 53).addBox(-0.675F, -1.0534F, -2.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 82).addBox(-0.675F, -1.0534F, -1.9761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, 0.1473F, 0.2118F, 0.0224F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(65, 81).addBox(-0.177F, -0.7284F, -1.3267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.103F, 8.4625F, -5.9903F, -0.0722F, -0.0783F, -1.7835F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(72, 10).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.395F, 6.9849F, 0.2808F, 0.0007F, 0.2637F, -0.0413F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(31, 53).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5513F, 6.9918F, -0.2984F, 0.1229F, 0.2637F, -0.0413F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(61, 69).addBox(-1.3325F, 1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 69).addBox(-1.6925F, 1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.1332F, 7.0949F, -1.6345F, -0.0876F, 0.2644F, 0.026F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.8924F, -0.9983F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.195F, -0.825F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.695F, 7.02F, -1.6642F, -2.6017F, -0.2858F, -0.0575F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-0.195F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.395F, 7.1216F, -1.0728F, -1.7737F, -0.4228F, 0.1164F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.195F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6486F, 7.0295F, -1.6088F, -1.7564F, 0.0914F, 0.0151F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.3F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.245F, 7.6383F, -3.4025F, 0.0975F, -0.1737F, -0.0169F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.3F, -0.2987F, -1.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.3F, -0.2987F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1026F, 7.3161F, -2.6894F, 0.1379F, -0.1928F, 0.0031F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-0.3F, -0.2987F, -0.712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.9726F, 7.2751F, -2.3133F, 0.1082F, -0.331F, -0.0172F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(70, 75).mirror().addBox(-0.3F, -0.2987F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.895F, 7.265F, -2.0237F, 0.0361F, -0.2616F, -0.0094F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-0.5F, -0.2987F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.2754F, -2.3236F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(45, 75).mirror().addBox(-0.5F, -0.2987F, 0.113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(75, 41).mirror().addBox(-0.5F, -0.2987F, -0.2871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.3729F, -3.1176F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-0.7F, -0.6737F, -0.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.695F, 7.8117F, -3.4464F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(30, 40).mirror().addBox(-0.5521F, -0.6339F, -3.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -2.6642F, -0.1855F, 0.4403F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-0.5558F, -0.6479F, -1.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -2.7669F, 0.0468F, 0.0041F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-0.5558F, -1.2373F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -1.7197F, 0.0468F, 0.0041F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 39).mirror().addBox(-0.5558F, -0.9089F, -1.346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -2.5051F, 0.0468F, 0.0041F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-0.5401F, -0.9235F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -1.9042F, -0.1342F, 0.2986F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5401F, -0.5173F, -0.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 77).mirror().addBox(-0.5401F, -0.6423F, -0.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -1.4242F, -0.1342F, 0.2986F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.5401F, -0.5377F, -0.9137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -4.9176F, -2.8205F, -0.1342F, 0.2986F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-0.3384F, -0.4633F, -0.8521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-0.3384F, -0.4633F, -0.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.717F, 7.8054F, -2.3953F, -0.993F, -0.6134F, 0.4977F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-0.2877F, -0.5405F, -0.3657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.3276F, 9.2737F, -3.5176F, -0.7713F, -0.4127F, 0.0518F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.3316F, -0.4773F, -0.3381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(76, 22).mirror().addBox(-0.3316F, -0.4055F, 0.1178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, -0.1355F, -0.0733F, -0.132F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.3316F, -0.0653F, -1.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(30, 76).mirror().addBox(-0.3316F, -0.0653F, -1.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, 2.2643F, -0.0733F, -0.132F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(32, 30).mirror().addBox(-0.5F, -0.3158F, -0.4651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.0707F, 9.985F, 0.0378F, 1.1822F, -0.0733F, 0.2345F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-0.5F, -0.3158F, -1.5349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.0707F, 9.985F, 0.0378F, 0.519F, -0.0733F, 0.2345F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.3316F, -0.0069F, -0.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, 0.9117F, -0.0733F, -0.132F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-0.3316F, -0.3307F, -0.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, 0.3008F, -0.0733F, -0.132F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.3316F, -0.1627F, -0.5528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, 1.348F, -0.0733F, -0.132F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-0.3316F, -0.5172F, -0.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2724F, 10.7737F, -1.6176F, 2.7443F, -0.0733F, -0.132F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.6686F, -2.7254F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.3276F, 9.2737F, -3.5176F, -2.044F, -0.186F, -0.068F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.6686F, -0.3663F, 1.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(5, 76).mirror().addBox(-0.6686F, -0.3663F, 1.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.3276F, 9.2737F, -3.5176F, -0.6041F, -0.186F, -0.068F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.2877F, -0.429F, 0.9198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.3276F, 9.2737F, -3.5176F, -0.684F, -0.4127F, 0.0518F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-0.1255F, -0.7436F, 0.8285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -5.7176F, -0.3113F, -0.4188F, 0.0057F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.3364F, -0.1305F, -1.122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.7768F, -0.157F, 0.0041F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-0.3364F, -0.2889F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.4714F, -0.157F, 0.0041F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.3364F, -0.3342F, -1.5309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(78, 15).mirror().addBox(-0.3364F, -0.3342F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 78).mirror().addBox(-0.3364F, -0.3342F, -0.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(78, 12).mirror().addBox(-0.3364F, -0.3342F, -0.6309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3041F, 8.2374F, -7.2548F, -0.1758F, -0.1914F, 0.0103F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(-0.3364F, -0.4017F, -1.6457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.1223F, -0.157F, 0.0041F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-0.352F, -0.5454F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0673F, 8.6467F, -5.6705F, -0.1223F, -0.157F, 0.0041F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-0.4094F, -0.6745F, -0.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1277F, 8.7737F, -5.7176F, -0.2534F, -0.192F, 0.0042F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.478F, -0.8754F, -1.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.0279F, -0.2972F, 0.1969F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-0.1452F, -0.8561F, -1.69F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.0128F, -0.0742F, -0.0018F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.325F, -1.0534F, -2.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 82).mirror().addBox(-0.325F, -1.0534F, -1.9761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, 0.1473F, -0.2118F, -0.0224F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(-0.823F, -0.7284F, -1.3267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.103F, 8.4625F, -5.9903F, -0.0722F, 0.0783F, 1.7835F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.395F, 6.9849F, 0.2808F, 0.0007F, -0.2637F, 0.0413F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(31, 53).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5513F, 6.9918F, -0.2984F, 0.1229F, -0.2637F, 0.0413F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(61, 69).mirror().addBox(0.3325F, 1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 69).mirror().addBox(0.6925F, 1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.1332F, 7.0949F, -1.6345F, -0.0876F, -0.2644F, -0.026F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.448F, -1.7172F, 0.437F, 0.0F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(80, 74).mirror().addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5273F, 0.3816F, 0.1826F, -0.2705F, -0.1396F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.4506F, 0.2786F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6981F, 0.2251F, 1.0427F, -1.309F, -0.1396F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -0.625F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 38).mirror().addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.3813F, 0.0509F, -0.8563F, -0.5672F, -0.1396F, 0.0F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.372F, -0.4956F, -0.9224F, -1.6144F, -0.1396F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.302F, -0.8253F, -0.2115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4479F, 0.1362F, -1.8053F, 1.1432F, -0.2269F, 0.0175F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.211F, -0.2137F, -0.2313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, 2.6422F, -0.3316F, 0.018F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-0.211F, 0.3675F, -0.7615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, -2.1138F, -0.3316F, 0.018F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(79, 31).mirror().addBox(-0.211F, 0.4045F, -0.9341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(79, 44).mirror().addBox(-0.211F, 0.5044F, -0.9341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, -2.201F, -0.3316F, 0.018F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-0.211F, -0.2064F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, -2.1312F, -0.3316F, 0.018F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-0.302F, -0.1595F, -0.9421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.4479F, 0.1362F, -1.8053F, -2.0944F, -0.2269F, 0.0175F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.211F, 0.52F, 0.5057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, 3.0786F, -0.3316F, 0.018F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.211F, 0.8843F, -0.9091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, -1.9829F, -0.3316F, 0.018F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.211F, -1.0554F, -2.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, -0.3248F, -0.3316F, 0.018F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.211F, 0.4035F, 1.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, -0.1388F, -2.4053F, 2.9913F, -0.3316F, 0.018F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.7292F, -0.6654F, -0.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(81, 24).mirror().addBox(-0.7292F, -0.6654F, -0.9031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1388F, -4.1053F, -0.2693F, -0.1571F, 0.0172F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(81, 18).mirror().addBox(-0.7292F, -0.7597F, -0.6671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, -0.182F, -0.1571F, 0.0172F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.7292F, -0.7985F, -2.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, -0.0948F, -0.1571F, 0.0172F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(81, 21).mirror().addBox(-0.7292F, -1.0285F, -2.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, 0.0274F, -0.1571F, 0.0172F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(69, 7).mirror().addBox(-0.7292F, 2.0401F, -0.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 69).mirror().addBox(-0.7292F, 2.2401F, -0.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, -1.7179F, -0.1571F, 0.0172F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(79, 50).mirror().addBox(-0.7292F, 2.1043F, 0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, -1.9797F, -0.1571F, 0.0172F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-0.7292F, -0.5945F, 1.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, 2.9508F, -0.1571F, 0.0172F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.7292F, -2.1349F, 0.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, 1.9124F, -0.1571F, 0.0172F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-0.8266F, 0.6968F, -3.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, -0.5835F, -0.1571F, 0.0172F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.8266F, -3.3883F, -2.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, 0.8564F, -0.1571F, 0.0172F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-0.8266F, -4.0907F, -0.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -1.1138F, -4.1053F, 1.38F, -0.1571F, 0.0172F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5494F, 0.2786F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6981F, 0.2251F, 1.0427F, -1.309F, 0.1396F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(80, 41).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.372F, -0.4956F, -0.9224F, -1.6144F, 0.1396F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(80, 38).addBox(-0.5F, -0.625F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(20, 80).addBox(-0.5F, -0.625F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3813F, 0.0509F, -0.8563F, -0.5672F, 0.1396F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(35, 81).addBox(-0.698F, -0.1595F, -0.9421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.4479F, 0.1362F, -1.8053F, -2.0944F, 0.2269F, -0.0175F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(81, 66).addBox(-0.789F, -0.2064F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, -2.1312F, 0.3316F, -0.018F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(79, 47).addBox(-0.789F, 0.4035F, 1.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, 2.9913F, 0.3316F, -0.018F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(20, 68).addBox(-0.789F, 0.52F, 0.5057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, 3.0786F, 0.3316F, -0.018F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(79, 44).addBox(-0.789F, 0.5044F, -0.9341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(79, 31).addBox(-0.789F, 0.4045F, -0.9341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, -2.201F, 0.3316F, -0.018F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 79).addBox(-0.2708F, -2.1349F, 0.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, 1.9124F, 0.1571F, -0.0172F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(66, 26).addBox(-0.2708F, -0.5945F, 1.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, 2.9508F, 0.1571F, -0.0172F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(65, 43).addBox(-0.1734F, -4.0907F, -0.3597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, 1.38F, 0.1571F, -0.0172F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(25, 79).addBox(-0.1734F, -3.3883F, -2.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, 0.8564F, 0.1571F, -0.0172F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(53, 66).addBox(-0.1734F, 0.6968F, -3.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, -0.5835F, 0.1571F, -0.0172F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(79, 50).addBox(-0.2708F, 2.1043F, 0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, -1.9797F, 0.1571F, -0.0172F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(15, 69).addBox(-0.2708F, 2.2401F, -0.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(69, 7).addBox(-0.2708F, 2.0401F, -0.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, -1.7179F, 0.1571F, -0.0172F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(81, 21).addBox(-0.2708F, -1.0285F, -2.5397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, 0.0274F, 0.1571F, -0.0172F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(57, 33).addBox(-0.2708F, -0.7985F, -2.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, -0.0948F, 0.1571F, -0.0172F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(81, 18).addBox(-0.2708F, -0.7597F, -0.6671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.7021F, -1.1138F, -4.1053F, -0.182F, 0.1571F, -0.0172F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(81, 24).addBox(-0.2708F, -0.6654F, -0.9031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 81).addBox(-0.2708F, -0.6654F, -0.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7021F, -1.1388F, -4.1053F, -0.2693F, 0.1571F, -0.0172F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(81, 3).addBox(-0.789F, -1.0554F, -2.3683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, -0.3248F, 0.3316F, -0.018F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(81, 0).addBox(-0.789F, 0.8843F, -0.9091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, -1.9829F, 0.3316F, -0.018F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(68, 17).addBox(-0.789F, 0.3675F, -0.7615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, -2.1138F, 0.3316F, -0.018F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(80, 80).addBox(-0.789F, -0.2137F, -0.2313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3979F, -0.1388F, -2.4053F, 2.6422F, 0.3316F, -0.018F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(80, 77).addBox(-0.698F, -0.8253F, -0.2115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4479F, 0.1362F, -1.8053F, 1.1432F, 0.2269F, -0.0175F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(80, 74).addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 29).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5273F, 0.3816F, 0.1826F, -0.2705F, 0.1396F, 0.0F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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