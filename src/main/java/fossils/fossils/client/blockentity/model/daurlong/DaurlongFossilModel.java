package fossils.fossils.client.blockentity.model.daurlong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DaurlongFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public DaurlongFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 4.4F, -1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.671F, -0.8101F, -0.1913F, -0.0166F, -0.0857F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 60).mirror().addBox(-1.0615F, -0.3862F, -4.0001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, -0.7854F, 0.2094F, 0.2182F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-1.0615F, -4.0449F, -1.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.4887F, 0.2094F, 0.2182F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-1.0615F, -3.3517F, -2.4107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.0873F, 0.2094F, 0.2182F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-1.1141F, -3.0558F, -1.4503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, -0.2793F, 0.0F, 0.2182F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-1.1141F, -2.4275F, -2.1051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.0524F, 0.0F, 0.2182F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-0.7621F, -2.1552F, -0.9683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.384F, 0.0F, -0.0436F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-1.1141F, -3.0623F, -0.3861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, -0.5585F, 0.0F, 0.2182F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-0.5138F, 3.3564F, -0.942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.7728F, 0.0557F, -0.1686F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 33).mirror().addBox(-0.5138F, 0.4864F, -0.7797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.7292F, 0.0557F, -0.1686F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(-0.3531F, 0.7216F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 1.8797F, 0.0405F, -0.0406F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 64).mirror().addBox(-0.4692F, 0.6834F, 0.4688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 1.2453F, 0.1111F, -0.0659F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.4692F, -1.4554F, 0.6856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.8788F, 0.1111F, -0.0659F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 54).mirror().addBox(-0.5138F, -1.4163F, -0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8859F, 1.514F, 1.2792F, 0.5896F, 0.0557F, -0.1686F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 60).addBox(0.0615F, -0.3862F, -4.0001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, -0.7854F, -0.2094F, -0.2182F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 68).addBox(0.0615F, -4.0449F, -1.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.4887F, -0.2094F, -0.2182F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 55).addBox(0.0615F, -3.3517F, -2.4107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.0873F, -0.2094F, -0.2182F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 27).addBox(0.1141F, -3.0558F, -1.4503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, -0.2793F, 0.0F, -0.2182F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 68).addBox(0.1141F, -3.0623F, -0.3861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, -0.5585F, 0.0F, -0.2182F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 21).addBox(-0.4862F, 3.3564F, -0.942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.7728F, -0.0557F, 0.1686F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 33).addBox(-0.4862F, 0.4864F, -0.7797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.7292F, -0.0557F, 0.1686F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(67, 40).addBox(-0.6469F, 0.7216F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 1.8797F, -0.0405F, 0.0406F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(27, 64).addBox(-0.5308F, 0.6834F, 0.4688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 1.2453F, -0.1111F, 0.0659F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(65, 20).addBox(-0.5308F, -1.4554F, 0.6856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.8788F, -0.1111F, 0.0659F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 54).addBox(-0.4862F, -1.4163F, -0.6929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.5896F, -0.0557F, 0.1686F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 11).addBox(-0.2379F, -2.1552F, -0.9683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.384F, 0.0F, 0.0436F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 71).addBox(0.0F, -0.657F, 0.0041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.65F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 71).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.35F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 43).addBox(0.1141F, -2.4275F, -2.1051F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8859F, 1.514F, 1.2792F, 0.0524F, 0.0F, -0.2182F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5F, -0.9948F, -0.6638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0038F, 0.4098F, 0.8785F, -0.4087F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 61).addBox(-0.5F, 0.0059F, -0.0767F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2052F, -1.9638F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(57, 31).addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(60, 41).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(0, 39).addBox(-0.9F, 0.9946F, -0.022F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0359F, -1.5924F, 0.8826F, -0.1354F, 0.1105F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -3.9F, -0.7F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 5.5045F, 0.7429F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 53).addBox(-0.5F, -4.4F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(47, 4).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.9029F, 0.1797F, -0.6178F, -0.0506F, -0.0711F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(11, 38).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7934F, -0.3088F, 0.3488F, 0.0149F, -0.041F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(24, 43).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7261F, -0.2841F, 0.1996F, -0.6121F, 0.2466F, 0.0F));

		PartDefinition cube_r33 = leftSickleClaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(38, 23).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0174F, -2.4015F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(37, 67).addBox(-0.5F, -0.9948F, -0.6638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0016F, 0.4489F, 0.7962F, 0.2852F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(12, 62).addBox(-0.5F, 0.0059F, -0.0767F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2052F, -1.9638F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(46, 60).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(5, 39).addBox(-0.1F, 0.9946F, -0.022F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.0359F, -1.5924F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(10, 43).addBox(-0.5F, -3.9F, -0.7F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 5.5045F, 0.7429F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 38).addBox(-0.5F, -4.4F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(15, 48).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.9029F, 0.1797F, -1.1855F, 0.0809F, 0.0328F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(22, 38).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7934F, -0.3088F, 0.3488F, -0.0149F, 0.041F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(33, 43).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7261F, -0.2841F, 0.1996F, -0.3503F, -0.2466F, 0.0F));

		PartDefinition cube_r38 = rightSickleClaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 32).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(33, 38).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0174F, -2.4015F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 3.55F, 0.067F, 0.2002F, 0.0863F));

		PartDefinition cube_r39 = tail1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(3, 72).addBox(0.0F, -0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2089F, -0.1695F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 72).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 72).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9843F, 1.2442F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 23).addBox(-0.5F, -0.1084F, -0.1257F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2204F, 4.7363F, 0.0791F, 0.1744F, 0.0062F));

		PartDefinition cube_r41 = tail2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 72).addBox(0.0F, -0.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2047F, -3.4921F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.4395F, -0.0878F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3614F, 6.8539F, 0.1594F, 0.1255F, 0.0374F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2209F, -0.0996F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2407F, 8.9832F, 0.1965F, 0.2141F, 0.0423F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.75F, -1.25F, 0.1672F, 0.1291F, 0.0217F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, -3.0363F, 0.003F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8296F, -0.6518F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(21, 15).addBox(-2.5F, -1.9912F, -5.0773F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.8296F, -0.5518F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 71).addBox(0.0F, -0.5714F, 2.9735F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -0.0714F, -0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(60, 71).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.37F, -2.5284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 71).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.1095F, -0.0827F, -0.6449F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.1473F, -0.0876F, -1.0828F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 51).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.2759F, 0.1388F, -0.9889F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.3215F, 0.0686F, -0.5558F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(63, 3).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.3478F, 0.2382F, -0.9568F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.4277F, 0.1293F, -0.5267F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.1996F, 0.3707F, -1.4413F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.2076F, 0.4224F, -1.4202F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.3796F, 0.2805F, -0.9307F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.4737F, 0.155F, -0.5022F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 71).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.1095F, 0.0827F, 0.6449F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(67, 31).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.1473F, 0.0876F, 1.0828F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 51).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.2759F, -0.1388F, 0.9889F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(71, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.3215F, -0.0686F, 0.5558F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(63, 3).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.3478F, -0.2382F, 0.9568F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(58, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.4277F, -0.1293F, 0.5267F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(51, 46).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.1996F, -0.3707F, 1.4413F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 58).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.2076F, -0.4224F, 1.4202F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 29).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.3796F, -0.2805F, 0.9307F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(67, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.4737F, -0.155F, 0.5022F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 71).addBox(0.0F, -0.45F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 64).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 43).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, -6.9F, 0.4192F, -0.0399F, -0.0178F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 49).mirror().addBox(-1.8828F, -0.0531F, -0.27F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 4.5115F, -2.4471F, -0.5882F, 0.6378F, 0.3567F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(-0.5553F, -1.0128F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6706F, 4.2608F, -3.9056F, 0.6264F, 0.0074F, 0.0369F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(-3.0F, -0.5873F, 2.6108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(33, 56).addBox(2.0F, -0.5873F, 2.6108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5036F, -4.2961F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-3.0F, -0.2076F, -0.0333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 38).addBox(2.0F, -0.2076F, -0.0333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5036F, -4.2961F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-0.5F, 1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6706F, 2.6608F, -4.4056F, 0.8708F, 0.0074F, 0.0369F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 50).mirror().addBox(-0.5F, 0.0002F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.4473F, -4.3533F, 0.99F, -0.4454F, -0.285F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.4473F, -4.3533F, 1.3221F, -0.6787F, -0.8905F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.2863F, 0.1594F, -0.6405F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 7).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.2048F, 0.2063F, -1.0818F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 56).mirror().addBox(-3.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.0853F, 0.2771F, -1.5711F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-1.5845F, 0.0032F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 4.0115F, -3.0471F, -0.3577F, 0.2915F, 0.8854F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 5).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.1658F, 0.146F, -1.4321F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.214F, 0.0537F, -0.9585F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(70, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.2297F, 0.0173F, -0.5234F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 71).addBox(-0.4447F, -1.0128F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6706F, 4.2608F, -3.9056F, 0.6264F, -0.0074F, -0.0369F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(65, 11).addBox(-0.5F, 1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6706F, 2.6608F, -4.4056F, 0.8708F, -0.0074F, -0.0369F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(59, 50).addBox(-0.5F, 0.0002F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.4473F, -4.3533F, 0.99F, 0.4454F, 0.285F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(22, 48).addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5F, 0.4473F, -4.3533F, 1.3221F, 0.6787F, 0.8905F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 46).addBox(-0.5F, -0.5558F, -0.401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.682F, -5.2376F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(71, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.2863F, -0.1594F, 0.6405F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 7).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.2048F, -0.2063F, 1.0818F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(70, 56).addBox(2.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.0853F, -0.2771F, 1.5711F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(66, 49).addBox(-0.1172F, -0.0531F, -0.27F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 4.5115F, -2.4471F, -0.5882F, -0.6378F, -0.3567F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(66, 9).addBox(-0.4155F, 0.0032F, -0.5167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 4.0115F, -3.0471F, -0.3577F, -0.2915F, -0.8854F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 5).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.1658F, -0.146F, 1.4321F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 60).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.214F, -0.0537F, 0.9585F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.2297F, -0.0173F, 0.5234F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(37, 64).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 50).addBox(0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 32).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4339F, -3.9914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(31, 48).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8848F, 1.6889F, -4.0679F, 0.532F, 0.3187F, -0.1359F));

		PartDefinition cube_r95 = leftArm1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(32, 64).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.6353F, -0.6475F, -1.4839F, 0.0387F, -0.0202F));

		PartDefinition cube_r96 = leftArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 64).addBox(-1.75F, 2.3964F, -0.7639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(40, 62).addBox(-1.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 6).addBox(-0.5F, -4.6812F, -0.7872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 3.75F, -0.5F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftArm2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(58, 63).addBox(-0.5F, -2.6984F, -0.568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 3.75F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(54, 6).addBox(-0.9629F, -0.1904F, -1.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(14, 55).addBox(-0.9629F, 1.7596F, -1.1965F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(17, 64).addBox(-0.9629F, 1.7596F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 3.8F, -0.5F, 0.9145F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(51, 11).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(36, 48).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8848F, 1.6889F, -4.0679F, 0.4448F, -0.3187F, 0.1359F));

		PartDefinition cube_r100 = rightArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(45, 64).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.6353F, -0.6475F, -1.7457F, -0.0387F, 0.0202F));

		PartDefinition cube_r101 = rightArm2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(5, 64).addBox(0.75F, 2.3964F, -0.7639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(63, 15).addBox(0.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(62, 31).addBox(-0.5F, -4.6812F, -0.7872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 3.75F, -0.5F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(63, 63).addBox(-0.5F, -2.6984F, -0.568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 3.75F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(46, 55).addBox(-0.0371F, -0.1904F, -1.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(41, 55).addBox(-0.0371F, 1.7596F, -1.1965F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(22, 64).addBox(-0.0371F, 1.7596F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 3.8F, -0.5F, 0.9145F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(51, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2661F, -4.0914F, -0.2507F, 0.3006F, 0.1828F));

		PartDefinition cube_r105 = neck1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(47, 11).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.345F, -1.3272F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4208F, -2.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0527F, -2.6216F, -0.4749F, 0.4744F, -0.2307F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(21, 72).addBox(0.0F, -0.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 59).addBox(-0.5F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.805F, -4.8573F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0621F, -1.4962F, -1.0634F, 0.4256F, 0.0458F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(72, 36).addBox(0.0F, -0.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 33).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 32).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2174F, -3.7909F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 39).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3919F, -0.2892F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.1047F, -1.9973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6877F, 0.1599F, 0.192F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7072F, -1.52F, 1.2704F, 0.0469F, 0.2132F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(70, 53).addBox(1.5F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, 0.4534F, 0.0969F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 60).mirror().addBox(-0.5F, -0.3F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(26, 60).addBox(1.5F, -0.3F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 0.1657F, 0.6601F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.5F, -0.5F, -0.4192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(15, 69).addBox(1.34F, -0.5F, -0.4192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.92F, -0.979F, -0.1125F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-0.2674F, -2.1371F, -0.348F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9361F, -0.5476F, -3.5967F, -1.1797F, -0.321F, -0.0556F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2414F, -1.2616F, -1.2501F, -1.4725F, -0.8337F, 0.0588F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(5, 69).addBox(1.74F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.12F, -0.0877F, 0.2808F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-1.32F, -0.2F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 69).addBox(0.92F, -0.2F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 0.1052F, -0.1927F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-1.43F, -0.8162F, -0.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(69, 24).addBox(0.83F, -0.8162F, -0.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.2F, 0.7133F, -2.07F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(-1.42F, -0.2564F, -0.2919F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(54, 3).addBox(-0.98F, -0.2564F, -0.2919F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3F, 0.2133F, -0.87F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(41, 52).mirror().addBox(-1.42F, -0.2595F, -0.2671F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2867F, -0.57F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-1.42F, -0.1647F, -0.8353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 52).addBox(-0.98F, -0.1647F, -0.8353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.2867F, -0.47F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-1.22F, 0.0208F, -0.9515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(68, 62).addBox(0.82F, 0.0208F, -0.9515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -1.2867F, -1.07F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-1.42F, -0.2067F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(53, 0).addBox(-0.98F, -0.2067F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3F, -0.8867F, -0.57F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 68).mirror().addBox(-1.3F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 65).mirror().addBox(-1.52F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 65).addBox(1.12F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 68).addBox(0.9F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1867F, -1.57F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.43F, -0.1653F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false)
				.texOffs(69, 0).addBox(0.83F, -0.1653F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-0.2F, -0.3867F, -2.47F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.43F, -0.1177F, -0.0842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 69).addBox(0.83F, -0.1177F, -0.0842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, -1.0867F, -2.07F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(-1.43F, -0.7162F, -0.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 68).addBox(0.83F, -0.7162F, -0.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.7133F, -2.07F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-1.1408F, -0.9656F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, 1.3406F, -2.5786F, 0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(-0.9844F, -0.9358F, -0.8411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, 1.4406F, -3.5786F, -0.096F, -0.1571F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.9687F, -1.003F, -0.9158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4679F, -4.3181F, -0.1245F, -0.1542F, 0.0302F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-0.6F, -0.8326F, -1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(70, 11).addBox(-0.4F, -0.8326F, -1.8333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.4679F, -4.3181F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-0.57F, -0.5F, -0.693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 71).mirror().addBox(-0.57F, -0.5F, -0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 0.3237F, -5.9758F, 0.2849F, -0.0817F, 0.0305F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-0.5171F, -0.6374F, -0.2714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.594F, 0.4173F, -3.2135F, -1.5792F, -0.0862F, -0.017F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(25, 71).mirror().addBox(-0.5171F, -0.6586F, -0.8248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-0.594F, 0.4173F, -3.2135F, -1.1604F, -0.0862F, -0.017F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-0.5171F, -0.3404F, -0.8167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)).mirror(false), PartPose.offsetAndRotation(-0.594F, 0.4173F, -3.2135F, -0.5146F, -0.0862F, -0.017F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 68).addBox(-0.0313F, -1.003F, -0.9158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4679F, -4.3181F, -0.1245F, 0.1542F, -0.0302F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 70).addBox(-0.0156F, -0.9358F, -0.8411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1013F, 1.4406F, -3.5786F, -0.096F, 0.1571F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(70, 18).addBox(0.1408F, -0.9656F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, 1.3406F, -2.5786F, 0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2414F, -1.2616F, -1.2501F, -1.4725F, 0.8337F, -0.0588F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 15).addBox(-0.7326F, -2.1371F, -0.348F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9361F, -0.5476F, -3.5967F, -1.1797F, 0.321F, 0.0556F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(66, 45).addBox(-0.5F, -0.0106F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6668F, -3.6623F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(42, 0).addBox(-1.5F, -0.9618F, 0.0375F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3668F, -2.0623F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 23).addBox(-1.0F, -1.8377F, -0.0674F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(41, 48).addBox(-1.0F, -1.0377F, -0.0674F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5668F, -3.7623F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(53, 55).addBox(-0.5F, -3.8723F, -0.0174F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.064F, -6.6578F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(67, 37).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.5545F, -6.207F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(0.2344F, -0.9273F, 0.0576F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 1.917F, -4.7048F, 0.1292F, -0.0266F, 0.0194F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(17, 26).mirror().addBox(0.4262F, -0.3929F, 0.8787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 29).mirror().addBox(0.5262F, -0.6929F, -0.5213F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.938F, 1.0603F, -6.1489F, -0.2335F, -0.0291F, -0.0214F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 25).addBox(-0.2344F, -0.9273F, 0.0576F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 1.917F, -4.7048F, 0.1292F, 0.0266F, -0.0194F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5262F, -0.6929F, -0.5213F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 26).addBox(-0.4262F, -0.3929F, 0.8787F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.938F, 1.0603F, -6.1489F, -0.2335F, 0.0291F, 0.0214F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 68).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1263F, 0.5353F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.5392F, -1.8502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.7657F, 0.6601F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(48, 28).addBox(-1.0F, -0.0185F, -0.0295F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -0.35F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(42, 19).addBox(-1.0F, -2.6912F, -0.1647F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(50, 48).addBox(-1.0F, -1.9912F, 0.0353F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(41, 52).addBox(-1.58F, -0.2595F, -0.2671F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3F, -0.2867F, -0.57F, -2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(40, 71).addBox(-0.43F, -0.5F, -0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 67).addBox(-0.43F, -0.5F, -0.693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.33F, 0.3237F, -5.9758F, 0.2849F, 0.0817F, -0.0305F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 71).addBox(-0.4829F, -0.4358F, -0.2768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.594F, 0.4173F, -3.2135F, -2.4694F, 0.0862F, 0.017F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(71, 27).addBox(-0.4829F, -0.6374F, -0.2714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.594F, 0.4173F, -3.2135F, -1.5792F, 0.0862F, 0.017F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(35, 71).addBox(-0.4829F, -0.3404F, -0.8167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(0.594F, 0.4173F, -3.2135F, -0.5146F, 0.0862F, 0.017F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(25, 71).addBox(-0.4829F, -0.6586F, -0.8248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(0.594F, 0.4173F, -3.2135F, -1.1604F, 0.0862F, 0.017F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(22, 53).addBox(-1.5F, -0.8612F, -0.1129F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0505F, -1.6216F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(39, 34).addBox(-1.0F, -1.3912F, -1.4647F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.05F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3196F, -0.1186F, -0.5455F, 0.0F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(0.1F, -0.4F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5804F, 2.4003F, -3.7635F, 0.4639F, -0.0662F, -0.0423F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(0.0003F, -0.8385F, -1.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5247F, -2.289F, 0.4799F, -0.1567F, -0.1056F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(0.0003F, -0.8857F, -1.9547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5247F, -2.289F, 0.5061F, -0.1567F, -0.1056F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-1.6F, -0.9761F, 0.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(27, 68).addBox(-0.4F, -0.9761F, 0.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 2.6568F, -2.2659F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-1.5F, -1.025F, -0.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(70, 21).addBox(0.5F, -1.025F, -0.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.6668F, -0.8087F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-1.6F, -0.0183F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 56).addBox(-0.4F, -0.0183F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7568F, -1.3659F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(68, 15).mirror().addBox(-2.0F, -0.0183F, -0.9433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 15).addBox(0.0F, -0.0183F, -0.9433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7568F, -1.3659F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-1.5F, -2.7834F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(19, 60).addBox(0.5F, -2.7834F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.4668F, -0.6087F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(26, 56).addBox(-1.0003F, -0.8857F, -1.9547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1F, 2.5247F, -2.289F, 0.5061F, 0.1567F, 0.1056F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0003F, -0.8385F, -1.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.1F, 2.5247F, -2.289F, 0.4799F, 0.1567F, 0.1056F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(39, 28).addBox(-0.1F, -0.4F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5804F, 2.4003F, -3.7635F, 0.4639F, 0.0662F, 0.0423F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(47, 68).addBox(-0.5F, -0.7F, 2.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9104F, -7.5176F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.9857F, -1.6248F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.477F, -3.8739F, 0.3752F, 0.0F, 0.0F));

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