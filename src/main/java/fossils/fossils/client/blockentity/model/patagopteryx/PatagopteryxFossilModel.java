package fossils.fossils.client.blockentity.model.patagopteryx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PatagopteryxFossilModel extends SkullModelBase {
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
	private final ModelPart body;
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
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PatagopteryxFossilModel(ModelPart root) {
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
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
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4803F, -33.4036F, 4.5875F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 31).mirror().addBox(-1.0F, -0.4801F, 0.3415F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 31).addBox(1.0F, -0.4801F, 0.3415F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(0.0F, -0.9801F, -0.6585F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9803F, -1.2637F, -4.9355F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 35).addBox(0.5F, 0.5F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4803F, -0.1212F, -1.646F, -0.8378F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.1197F, 2.2492F, 1.6994F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2599F, 0.3081F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 69).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7486F, 0.9999F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 65).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9902F, 2.0759F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 8).addBox(-0.5F, 0.0F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 23).addBox(0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.3704F, -3.3454F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 71).addBox(-1.0F, -1.4168F, 0.6685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.3474F, -2.3622F, -2.0071F, 0.0F, 0.1745F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.7965F, 0.1794F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 9).addBox(-1.0F, -0.2035F, 1.4794F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.3474F, -2.3622F, -1.3963F, 0.0F, 0.1745F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 55).addBox(-1.0F, -0.6474F, -0.3673F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.3474F, -2.3622F, -1.7977F, 0.0F, 0.1745F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 61).addBox(0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -1.7012F, -4.0885F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 68).addBox(-1.0F, -0.9566F, 0.4927F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3474F, -2.3622F, -1.2305F, 0.0F, 0.1745F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 47).addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.2711F, -6.1354F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(61, 24).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.769F, -4.8101F, -2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.8766F, -3.0203F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(61, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.3541F, -2.1676F, -2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 49).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5715F, -1.5451F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.0803F, 2.2492F, 1.6994F));

		PartDefinition cube_r19 = bone4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2599F, 0.3081F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7486F, 0.9999F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9902F, 2.0759F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-0.5F, 0.0F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.5F, -0.9F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.3704F, -3.3454F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 71).mirror().addBox(0.0F, -1.4168F, 0.6685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3474F, -2.3622F, -2.0071F, 0.0F, -0.1745F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(0.0F, 0.7965F, 0.1794F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 9).mirror().addBox(0.0F, -0.2035F, 1.4794F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3474F, -2.3622F, -1.3963F, 0.0F, -0.1745F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(0.0F, -0.6474F, -0.3673F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3474F, -2.3622F, -1.7977F, 0.0F, -0.1745F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-1.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.7012F, -4.0885F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 68).mirror().addBox(0.0F, -0.9566F, 0.4927F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3474F, -2.3622F, -1.2305F, 0.0F, -0.1745F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2711F, -6.1354F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(61, 24).mirror().addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.769F, -4.8101F, -2.2951F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.8766F, -3.0203F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.3541F, -2.1676F, -2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5715F, -1.5451F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(36, 47).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7197F, 3.0945F, -1.276F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 53).addBox(-5.0F, 1.9306F, -3.3494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 52).addBox(-3.0F, 1.9306F, -3.5494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 6.7F, -1.1F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 52).addBox(-4.0F, 1.0003F, -3.7381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 6.7F, -1.1F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 51).addBox(-4.5F, 2.7227F, -0.9987F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.5F, 6.7F, -1.1F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 11).addBox(-4.5F, -0.0805F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 6.7F, -1.1F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 56).addBox(-4.5F, 0.0898F, 0.3061F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 6.7F, -1.1F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 46).addBox(-4.5F, -0.0261F, 0.003F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 3.8F, -1.1F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(16, 58).addBox(-4.5F, -0.181F, -0.0006F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 3.8F, -1.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 16).addBox(-1.5F, -1.6533F, 0.1514F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(40, 32).addBox(-1.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 3.2426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 52).addBox(-1.5F, -0.0279F, -0.29F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 39).addBox(-1.5F, 0.4655F, 1.4909F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(66, 14).addBox(-1.5F, 0.733F, 2.241F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 17).addBox(-1.5F, -1.7734F, 1.81F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(18, 43).addBox(-1.5F, -3.1159F, -2.2659F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 2.3F, -1.1F, -1.1345F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 9.7695F, 1.296F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 37).addBox(-2.5F, -3.507F, -2.3331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(33, 32).addBox(-2.5F, -2.6356F, 0.0547F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 3.8121F, -1.5756F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(26, 32).addBox(-1.0F, -9.0F, -0.9F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.7F, 14.2514F, -1.3209F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 51).addBox(-1.5F, -2.6F, -2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -4.5F, -0.375F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 5.4943F, -0.8464F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 17).addBox(-5.8F, -4.8498F, -0.7321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 68).addBox(-0.6532F, 0.206F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.3576F, 0.0073F, -0.0005F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(18, 35).addBox(-0.6532F, 1.4677F, -1.2621F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.0958F, 0.0073F, -0.0005F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(32, 15).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 16.4284F, -2.5554F, -0.5236F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3973F, 5.4788F, -0.3992F, -0.373F, 0.0143F, 0.5976F));

		PartDefinition cube_r57 = toe3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 70).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r58 = toe3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 59).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(13, 25).addBox(-2.5F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3982F, -0.2576F, 1.3963F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 17).addBox(-2.5F, 0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4931F, -2.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6803F, 3.0945F, -1.276F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(18, 53).mirror().addBox(4.0F, 1.9306F, -3.3494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 52).mirror().addBox(2.0F, 1.9306F, -3.5494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 6.7F, -1.1F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(3.0F, 1.0003F, -3.7381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 6.7F, -1.1F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(2.5F, 2.7227F, -0.9987F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 6.7F, -1.1F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(2.5F, -0.0805F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 6.7F, -1.1F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(2.5F, 0.0898F, 0.3061F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 6.7F, -1.1F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(2.5F, -0.0261F, 0.003F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.8F, -1.1F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(16, 58).mirror().addBox(2.5F, -0.181F, -0.0006F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.8F, -1.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.5F, -1.6533F, 0.1514F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(-0.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.2426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(36, 52).mirror().addBox(-0.5F, -0.0279F, -0.29F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(-0.5F, 0.4655F, 1.4909F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-0.5F, 0.733F, 2.241F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-0.5F, -1.7734F, 1.81F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-0.5F, -3.1159F, -2.2659F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -1.1F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 9.7695F, 1.296F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(0.5F, -3.507F, -2.3331F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(33, 32).mirror().addBox(0.5F, -2.6356F, 0.0547F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.8121F, -1.5756F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(-1.0F, -9.0F, -0.9F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.7F, 14.2514F, -1.3209F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-1.5F, -2.6F, -2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.0F, -4.5F, -0.375F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7F, 5.4943F, -0.8464F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(2.8F, -4.8498F, -0.7321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(-0.3468F, 0.206F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.3576F, -0.0073F, 0.0005F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(18, 35).mirror().addBox(-0.3468F, 1.4677F, -1.2621F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.0958F, -0.0073F, 0.0005F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(32, 15).mirror().addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 16.4284F, -2.5554F, -1.0908F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3973F, 5.4788F, -0.3992F, -0.373F, -0.0143F, -0.5976F));

		PartDefinition cube_r81 = toe2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r82 = toe2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(13, 25).mirror().addBox(-1.5F, 0.0F, -2.85F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3982F, -0.2576F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4931F, -2.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightToes.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(2.0F, 0.0F, -1.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.475F, -2.125F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(18, 48).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4803F, 3.5059F, 1.4857F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3085F, 2.8669F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.706F, 0.0598F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4803F, -2.0197F, -4.8018F, -0.0425F, 0.0838F, -0.0906F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(36, 75).addBox(0.0F, 0.9699F, 4.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 75).addBox(0.0F, 0.8699F, 2.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 38).addBox(0.0F, 0.8949F, 0.982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.8F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.4408F, -0.039F, -0.1757F, -1.3951F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.4408F, -0.122F, -0.1326F, -0.8668F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.4408F, -0.136F, -0.0692F, -0.3231F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 15).mirror().addBox(-8.2026F, -1.8494F, -0.5143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -4.2408F, -0.0326F, -0.1411F, -1.3787F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -4.2408F, -0.099F, -0.1059F, -0.8522F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(61, 14).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -4.2408F, -0.1025F, -0.0581F, -0.3078F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.039F, -0.1757F, -1.4649F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(71, 52).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.136F, -0.0692F, -0.3929F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(52, 68).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -0.4408F, -0.122F, -0.1326F, -0.9367F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(61, 14).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -4.2408F, -0.1025F, 0.0581F, 0.3078F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 69).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -4.2408F, -0.099F, 0.1059F, 0.8522F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(39, 15).addBox(2.2026F, -1.8494F, -0.5143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -4.2408F, -0.0326F, 0.1411F, 1.3787F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(52, 68).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.122F, 0.1326F, 0.9367F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(71, 52).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.136F, 0.0692F, 0.3929F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(59, 55).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -0.4408F, -0.039F, 0.1757F, 1.4649F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(5, 75).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.4408F, -0.136F, 0.0692F, 0.3231F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(64, 68).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.4408F, -0.122F, 0.1326F, 0.8668F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 13).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.4408F, -0.039F, 0.1757F, 1.3951F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(17, 17).addBox(-1.0F, 0.9494F, -2.0332F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.6F, -3.3F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0707F, -5.391F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(15, 75).addBox(0.0F, -0.2468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(23, 35).addBox(0.0F, 0.0992F, -1.0624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(30, 74).addBox(0.0F, 0.1076F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7345F, -6.6273F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 2).addBox(0.0F, -0.8924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, -0.1835F, -0.0619F, -0.3404F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-2.9689F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, -0.1668F, -0.1508F, -0.881F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-8.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.215F, -0.4408F, -0.0686F, -0.2138F, -1.4098F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(61, 49).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, -0.128F, -0.0933F, -0.3529F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 68).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, -0.1025F, -0.1492F, -0.8988F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(58, 43).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -4.2408F, -0.0135F, -0.1803F, -1.4288F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-7.1989F, -1.8196F, -0.5632F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, -0.0199F, -0.2234F, -1.4275F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-2.8141F, -0.4764F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, -0.1301F, -0.1832F, -0.8942F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.9441F, 0.0123F, -0.5459F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -2.2408F, -0.1692F, -0.1083F, -0.3488F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -6.2408F, 0.0058F, -0.012F, -0.9075F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-3.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -6.2408F, 0.011F, -0.0074F, -1.4311F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -6.2408F, 0.0357F, -0.032F, -0.3632F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(10, 75).addBox(-0.0559F, 0.0123F, -0.5459F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, -0.1692F, 0.1083F, 0.3488F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(24, 69).addBox(0.8141F, -0.4764F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, -0.1301F, 0.1832F, 0.8942F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(43, 0).addBox(2.1989F, -1.8196F, -0.5632F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -2.2408F, -0.0199F, 0.2234F, 1.4275F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(74, 43).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -6.2408F, 0.0357F, 0.032F, 0.3632F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(73, 26).addBox(2.3936F, -1.7918F, -0.5273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -6.2408F, 0.011F, 0.0074F, 1.4311F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 54).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -6.2408F, 0.0058F, 0.012F, 0.9075F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(58, 43).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, -0.0135F, 0.1803F, 1.4288F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 68).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, -0.1025F, 0.1492F, 0.8988F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(61, 49).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -4.2408F, -0.128F, 0.0933F, 0.3529F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(32, 6).addBox(2.3936F, -1.7918F, -0.5273F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, -0.0686F, 0.2138F, 1.4098F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 12).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, -0.1668F, 0.1508F, 0.881F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(61, 28).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.215F, -0.4408F, -0.1835F, 0.0619F, 0.3404F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 70).addBox(-0.5F, -4.0138F, -1.1844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.209F, -3.8265F, 0.6964F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(40, 68).addBox(-0.5F, -2.3302F, -0.2773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.209F, -3.8265F, 1.1153F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.3F, -5.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9842F, 4.7186F, -7.4076F, 2.2854F, -0.2289F, 2.9954F));

		PartDefinition cube_r136 = leftArm1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, -0.9F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(27, 43).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1523F, 5.8937F, -0.3138F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftArm1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1523F, 4.1182F, -0.6139F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftArm1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(68, 4).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1523F, 3.3964F, 0.1035F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftArm1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 8).addBox(-0.5F, -1.625F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.1523F, 1.6357F, 0.4778F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftArm1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(7, 31).addBox(-0.0442F, -1.6263F, -1.6078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6081F, 2.4786F, 1.4311F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftArm1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -1.4F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 0.2786F, 0.1311F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4703F, 6.4325F, 0.8341F, 0.458F, -0.0465F, 3.106F));

		PartDefinition cube_r142 = leftArm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 68).addBox(-0.5F, 1.025F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(68, 24).addBox(-0.5F, -0.375F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0117F, 2.3185F, -1.5203F, -0.0904F, 0.007F, -0.0146F));

		PartDefinition cube_r143 = leftArm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, 3.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 39).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0044F, 1.2963F, -0.428F, -0.2213F, 0.007F, -0.0146F));

		PartDefinition cube_r144 = leftArm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 49).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0001F, 1.1749F, -0.8091F, -0.3086F, 0.007F, -0.0146F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2482F, 4.6028F, -0.0001F, 1.735F, -0.2906F, 0.1798F));

		PartDefinition cube_r145 = leftHand.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 71).addBox(-0.45F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 70).addBox(-0.45F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5948F, 1.7197F, 1.6579F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftHand.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(68, 20).addBox(-1.2F, 2.25F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 67).addBox(-1.0F, -0.15F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9842F, 4.7186F, -7.4076F, 2.2854F, 0.2289F, -2.9954F));

		PartDefinition cube_r147 = rightArm1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(-0.5F, -0.9F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(27, 43).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 5.8937F, -0.3138F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightArm1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.5F, -0.1F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 4.1182F, -0.6139F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightArm1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 3.3964F, 0.1035F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightArm1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.5F, -1.625F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.1523F, 1.6357F, 0.4778F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightArm1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 31).mirror().addBox(-0.9558F, -1.6263F, -1.6078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 2.4786F, 1.4311F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightArm1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.5F, -1.4F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 0.2786F, 0.1311F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4703F, 6.4325F, 0.8341F, 0.458F, 0.0465F, -3.106F));

		PartDefinition cube_r153 = rightArm2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(-0.5F, 1.025F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(68, 24).mirror().addBox(-0.5F, -0.375F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0117F, 2.3185F, -1.5203F, -0.0904F, -0.007F, 0.0146F));

		PartDefinition cube_r154 = rightArm2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(24, 71).mirror().addBox(-0.5F, 3.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 39).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0044F, 1.2963F, -0.428F, -0.2213F, -0.007F, 0.0146F));

		PartDefinition cube_r155 = rightArm2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(66, 49).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0001F, 1.1749F, -0.8091F, -0.3086F, -0.007F, 0.0146F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2482F, 4.6028F, -0.0001F, 1.735F, 0.2906F, -0.1798F));

		PartDefinition cube_r156 = rightHand.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.55F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 70).mirror().addBox(-0.55F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5948F, 1.7197F, 1.6579F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightHand.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(0.2F, 2.25F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 67).mirror().addBox(0.0F, -0.15F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.5F, 5.8846F, -7.2622F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3482F, -5.2045F, 4.1076F, 0.1982F, 0.116F, -0.3106F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3593F, -4.522F, 2.2277F, 0.3291F, 0.116F, -0.3106F));

		PartDefinition cube_r160 = bone.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(39, 17).addBox(-0.1F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, 1.5378F, 0.9812F, 1.773F, -0.1047F, 0.7357F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(27, 46).addBox(-0.5164F, 0.0647F, -0.2487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1858F, -3.132F, -0.1413F, 0.5473F, 0.116F, -0.3106F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(23, 60).addBox(-0.689F, -0.6436F, -1.0153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -0.2F, 1.8777F, 0.2153F, 0.1146F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.5F, 5.8846F, -7.2622F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3482F, -5.2045F, 4.1076F, 0.1982F, -0.116F, 0.3106F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3593F, -4.522F, 2.2277F, 0.3291F, -0.116F, 0.3106F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.9F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.5F, 1.5378F, 0.9812F, 1.773F, 0.1047F, -0.7357F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(27, 46).mirror().addBox(-0.4836F, 0.0647F, -0.2487F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -3.132F, -0.1413F, 0.5473F, -0.116F, 0.3106F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-0.311F, -0.6436F, -1.0153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -0.2F, 1.8777F, -0.2153F, -0.1146F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.086F, -6.3881F, 0.2184F, 0.0426F, 0.0094F));

		PartDefinition cube_r168 = neck6.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(47, 2).addBox(0.0F, -0.9943F, -3.1586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4982F, -2.5159F, -0.4378F, 0.0791F, -0.037F));

		PartDefinition cube_r169 = neck5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -0.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0149F, -2.8449F, 0.3065F, 0.0832F, 0.0263F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 64).addBox(-1.0F, -1.0981F, 2.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -4.1F, -2.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7912F, -0.8336F, 0.1832F, 0.0435F, -0.0034F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(68, 45).addBox(-1.0F, 4.0773F, -1.9318F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, 0.2F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6875F, -0.6243F, -0.7873F, -0.0617F, 0.0618F));

		PartDefinition cube_r172 = neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 33).addBox(-1.0F, 0.9272F, -1.8396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -4.0F, -1.5F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7713F, -1.469F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(60, 30).addBox(-1.0F, 0.8616F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -1.5265F, -3.4509F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3461F, -1.9134F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck7.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 60).addBox(-1.0F, 0.8616F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.505F, -1.5467F, -3.4913F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3717F, -1.9625F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, 0.8616F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -1.5361F, -3.4692F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8493F, -1.9495F, 0.0575F, 0.2909F, 0.0945F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(67, 60).addBox(-0.5F, -1.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 42).addBox(-0.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -2.9915F, -3.282F, 1.9679F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 57).addBox(-1.0F, -0.8F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -3.0724F, -2.6875F, -3.0063F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(48, 57).addBox(-1.0F, -0.2F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.495F, -2.9708F, -2.0962F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 26).addBox(-1.0F, -1.5F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -2.487F, -1.97F, -1.9591F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(66, 57).addBox(0.0F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.995F, -2.8787F, -1.3168F, -1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 56).addBox(0.0F, -0.2F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.995F, -2.9074F, -0.7175F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(41, 27).addBox(-1.0F, -1.3F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(13, 30).addBox(-1.0F, -0.8F, -2.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -2.5357F, 0.3178F, 1.2261F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(52, 22).addBox(-1.0F, -1.8F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -2.0951F, 0.7251F, 2.3169F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 23).addBox(-1.0F, -0.2F, -0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -1.5322F, 0.9327F, -2.7882F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 7).addBox(-1.0F, -0.2F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -0.947F, 1.0652F, -1.3483F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -0.6F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -1.1245F, 0.4499F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(41, 8).addBox(-1.0F, -0.6F, -1.475F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.495F, -1.4494F, -1.1415F, 2.7969F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(39, 57).addBox(-1.0F, -0.2F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -1.2103F, -1.7284F, 2.1424F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(56, 3).addBox(-1.0F, -0.2F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.495F, -0.6389F, -1.5455F, 1.8806F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(33, 42).addBox(-1.0F, -0.8F, -0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.495F, -0.1983F, -1.1382F, 0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(7, 41).addBox(-1.0F, -0.925F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.495F, -0.4234F, 0.2653F, -0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(39, 60).addBox(-0.5F, 0.8686F, -5.0738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.005F, -3.0386F, -4.0648F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(72, 37).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(72, 34).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.7273F, -8.7561F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 72).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.7899F, -8.361F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 31).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.8352F, -7.9636F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(72, 28).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.8805F, -7.5662F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.8735F, -7.1662F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 72).addBox(-0.5F, -0.2987F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.8496F, -6.7549F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.6487F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.3264F, -5.4621F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 34).addBox(-0.5F, -0.3487F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.005F, -2.6386F, -4.0648F, 0.0087F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.8924F, -0.9983F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(21, 64).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.9497F, 7.9048F, -2.9393F, -1.4247F, 0.4117F, -0.0514F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5774F, -1.2967F, 3.8896F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.621F, 7.5406F, -8.26F, -0.397F, 0.1396F, -0.0053F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(39, 72).addBox(-0.2807F, -0.9091F, 2.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(53, 60).addBox(-0.2807F, -0.9091F, 2.6594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.621F, 7.5406F, -8.26F, -0.3052F, 0.0698F, -0.0041F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(61, 45).addBox(-0.4774F, -0.4958F, -0.4967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.621F, 7.5406F, -8.26F, 0.0306F, 0.144F, 0.0005F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(73, 45).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1661F, 7.2433F, -6.1725F, -0.0105F, 0.2116F, -0.1925F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(73, 23).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1608F, 7.2381F, -6.5724F, -0.013F, -0.0131F, 0.0018F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(73, 20).addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3417F, 7.4806F, -6.4093F, 0.0567F, 0.1265F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(46, 60).addBox(-0.4564F, -0.8187F, 0.7988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.621F, 7.5406F, -8.26F, -0.2487F, 0.1265F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(73, 14).addBox(-0.625F, -0.35F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(73, 9).addBox(-0.625F, -0.35F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.5118F, 7.1062F, -7.3084F, 0.125F, 0.0954F, -0.6485F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(73, 6).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.0572F, -6.9653F, 1.6591F, 0.0713F, -0.6775F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 17).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.0572F, -6.9653F, -3.0135F, -1.0378F, -1.0735F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(73, 3).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.0119F, -6.5678F, -3.0763F, 0.0929F, -0.9569F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 66).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.0189F, -6.1679F, -1.5808F, -0.0143F, -0.9599F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(72, 63).addBox(-0.7F, -0.6987F, -0.712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1673F, 7.2717F, -5.7706F, 0.0132F, -0.0596F, -1.7894F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(55, 72).addBox(-0.7F, -0.2987F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.0427F, -5.7565F, -0.0351F, -0.05F, -0.9591F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(7, 60).addBox(-0.7F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1673F, 7.3613F, -5.1046F, 0.0341F, -0.1264F, -1.8348F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(59, 51).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2311F, 7.8262F, -5.6701F, 0.034F, 0.1178F, -1.8265F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(9, 46).addBox(-0.7F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.495F, 7.1338F, -5.0747F, -0.0754F, -0.1071F, -0.9559F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(7, 64).addBox(-0.7F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2941F, 7.2106F, -3.6983F, -0.1603F, 0.2613F, -0.587F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 63).addBox(-0.7F, -0.3487F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.095F, 7.2537F, -3.0664F, 0.0092F, 0.3054F, 0.0028F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(25, 74).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.395F, 6.9849F, 0.2808F, 0.0007F, 0.2637F, -0.0413F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(74, 40).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5513F, 6.9918F, -0.2984F, 0.1229F, 0.2637F, -0.0413F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(5, 72).addBox(-1.0075F, 0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 0).addBox(-1.2675F, 0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1332F, 7.0949F, -1.6345F, -0.0876F, 0.2644F, 0.026F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 74).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6002F, 7.1189F, -2.8037F, 2.039F, 0.565F, 0.2467F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(20, 74).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.395F, 6.9009F, -2.2837F, 1.9852F, 0.328F, 0.123F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.8924F, -0.9983F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.9497F, 7.9048F, -2.9393F, -1.4247F, -0.4117F, 0.0514F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.4226F, -1.2967F, 3.8896F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.621F, 7.5406F, -8.26F, -0.397F, -0.1396F, 0.0053F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(-0.7193F, -0.9091F, 2.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(53, 60).mirror().addBox(-0.7193F, -0.9091F, 2.6594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.621F, 7.5406F, -8.26F, -0.3052F, -0.0698F, 0.0041F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-0.5226F, -0.4958F, -0.4967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.621F, 7.5406F, -8.26F, 0.0306F, -0.144F, -0.0005F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1661F, 7.2433F, -6.1725F, -0.0105F, -0.2116F, 0.1925F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1608F, 7.2381F, -6.5724F, -0.013F, 0.0131F, -0.0018F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-0.5F, -0.55F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3417F, 7.4806F, -6.4093F, 0.0567F, -0.1265F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(46, 60).mirror().addBox(-0.5436F, -0.8187F, 0.7988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.621F, 7.5406F, -8.26F, -0.2487F, -0.1265F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-0.375F, -0.35F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(73, 9).mirror().addBox(-0.375F, -0.35F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.5118F, 7.1062F, -7.3084F, 0.125F, -0.0954F, 0.6485F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.0572F, -6.9653F, 1.6591F, -0.0713F, 0.6775F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.0572F, -6.9653F, -3.0135F, 1.0378F, 1.0735F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(73, 3).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.0119F, -6.5678F, -3.0763F, -0.0929F, 0.9569F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(72, 66).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.0189F, -6.1679F, -1.5808F, 0.0143F, 0.9599F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-0.3F, -0.6987F, -0.712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1673F, 7.2717F, -5.7706F, 0.0132F, 0.0596F, 1.7894F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(55, 72).mirror().addBox(-0.3F, -0.2987F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.0427F, -5.7565F, -0.0351F, 0.05F, 0.9591F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-0.3F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1673F, 7.3613F, -5.1046F, 0.0341F, 0.1264F, 1.8348F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2311F, 7.8262F, -5.6701F, 0.034F, -0.1178F, 1.8265F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-0.3F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.495F, 7.1338F, -5.0747F, -0.0754F, 0.1071F, 0.9559F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.3F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2941F, 7.2106F, -3.6983F, -0.1603F, -0.2613F, 0.587F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.3F, -0.3487F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.095F, 7.2537F, -3.0664F, 0.0092F, -0.3054F, -0.0028F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 74).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.395F, 6.9849F, 0.2808F, 0.0007F, -0.2637F, 0.0413F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5513F, 6.9918F, -0.2984F, 0.1229F, -0.2637F, 0.0413F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(0.0075F, 0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 0).mirror().addBox(0.2675F, 0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1332F, 7.0949F, -1.6345F, -0.0876F, -0.2644F, -0.026F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6002F, 7.1189F, -2.8037F, 2.039F, -0.565F, -0.2467F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.395F, 6.9009F, -2.2837F, 1.9852F, -0.328F, -0.123F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.6222F, -0.5928F, -0.0429F, 0.0F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.4506F, -0.0874F, -2.3878F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(51, 64).mirror().addBox(-0.5506F, -0.3246F, -5.4294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -0.3054F, -0.1396F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-0.4506F, 0.0787F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 74).mirror().addBox(-0.4506F, -0.5213F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -1.309F, -0.1396F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(-0.4506F, 0.1005F, -3.9174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -0.3927F, -0.1396F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5506F, -0.0434F, -5.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -0.3272F, -0.1396F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(44, 42).mirror().addBox(-0.5506F, -0.5483F, -7.8235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -0.2618F, -0.1396F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5506F, -0.3286F, -7.8202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.0981F, 0.225F, 0.4427F, -0.2705F, -0.1396F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.7508F, -0.3857F, -1.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -1.875F, -6.6573F, -0.1309F, -0.0524F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-0.7508F, -0.5698F, -2.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 73).mirror().addBox(-0.7508F, -0.5698F, -2.493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -1.875F, -6.6573F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(44, 64).mirror().addBox(-0.7508F, -0.1858F, -1.6804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -1.875F, -6.6573F, -0.2007F, -0.0524F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.7508F, -0.1426F, -2.013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -1.875F, -6.6573F, -0.2356F, -0.0524F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.7508F, -0.4211F, -0.2675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8981F, -1.875F, -6.6573F, -1.1606F, -0.0524F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5494F, 0.1005F, -3.9174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -0.3927F, 0.1396F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4494F, -0.0434F, -5.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -0.3272F, 0.1396F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 46).addBox(-0.4494F, -0.3286F, -7.8202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -0.2705F, 0.1396F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(70, 73).addBox(-0.2492F, -0.5698F, -2.493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 56).addBox(-0.2492F, -0.5698F, -2.093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1019F, -1.875F, -6.6573F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(60, 73).addBox(-0.2492F, -0.1426F, -2.013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.1019F, -1.875F, -6.6573F, -0.2356F, 0.0524F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(65, 73).addBox(-0.2492F, -0.4211F, -0.2675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.1019F, -1.875F, -6.6573F, -1.1606F, 0.0524F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(44, 64).addBox(-0.2492F, -0.1858F, -1.6804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.1019F, -1.875F, -6.6573F, -0.2007F, 0.0524F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(37, 64).addBox(-0.2492F, -0.3857F, -1.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.1019F, -1.875F, -6.6573F, -0.1309F, 0.0524F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(44, 42).addBox(-0.4494F, -0.5483F, -7.8235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -0.2618F, 0.1396F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(51, 64).addBox(-0.4494F, -0.3246F, -5.4294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(65, 0).addBox(-0.5494F, -0.0874F, -2.3878F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -0.3054F, 0.1396F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(49, 74).addBox(-0.5494F, -0.5213F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 74).addBox(-0.5494F, 0.0787F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0981F, 0.225F, 0.4427F, -1.309F, 0.1396F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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