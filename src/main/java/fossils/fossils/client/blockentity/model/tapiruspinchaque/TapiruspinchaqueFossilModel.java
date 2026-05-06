package fossils.fossils.client.blockentity.model.tapiruspinchaque;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TapiruspinchaqueFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public TapiruspinchaqueFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.chest = this.body7.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone4 = this.neck2.getChild("bone4");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.7442F, 20.0612F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, 0.1274F, -4.0768F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 1.4F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 89).mirror().addBox(-2.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4404F, -0.2224F, -0.185F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(87, 33).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3819F, 0.1253F, 0.1768F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(87, 33).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3819F, -0.1253F, -0.1768F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 89).addBox(-0.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4404F, 0.2224F, 0.185F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 75).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.187F, -0.0541F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 6.9764F, 0.0931F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 17).addBox(-1.0F, -1.6F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 64).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 68).addBox(-0.5F, -3.525F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 106).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.4931F, -4.8245F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(79, 5).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7573F, -3.4287F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(79, 24).addBox(-1.0F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.9435F, -2.8719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 0).addBox(-1.0F, -1.0317F, -1.4745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.9586F, -2.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 91).addBox(0.0F, -4.0F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7425F, 4.7811F, 0.4939F, 0.109F, 0.9904F, -0.1404F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 100).addBox(0.3F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.251F, 5.2756F, -0.4394F, -1.0487F, 0.8683F, -0.3958F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, 0.0F, -0.825F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 3.2834F, -0.4367F, -0.4276F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2053F, -3.4214F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(87, 87).addBox(-2.0F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(87, 39).addBox(-2.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 78).addBox(-2.0F, -0.875F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 1.427F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(95, 65).addBox(-1.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 18).addBox(-1.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.7022F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(112, 60).addBox(-0.5108F, -4.7152F, -0.21F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0945F, 4.8471F, 1.1438F, -0.236F, 0.0869F, -0.0076F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5108F, -2.0704F, -0.4044F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0945F, 4.8471F, 1.1438F, -0.3407F, 0.0869F, -0.0076F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 106).addBox(-0.5F, 1.75F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(19, 107).addBox(0.0F, -2.15F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(65, 106).addBox(-1.5F, 4.6869F, -0.7332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 8).addBox(-1.0F, 1.1869F, -0.7332F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 11.4214F, -1.2303F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 114).addBox(-1.0F, -1.9014F, -1.1384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 0.1935F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(78, 113).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, -1.659F, 0.6091F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 26).addBox(-1.3F, -1.0F, -0.4F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.5705F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.3889F, 1.7667F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 108).addBox(7.9905F, -4.5937F, 0.0578F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-10.6782F, 1.1557F, -0.7078F, -0.2973F, 0.1816F, 0.3244F));

		PartDefinition cube_r31 = leftLeg4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(91, 108).addBox(-0.6F, -1.4F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.6782F, 1.1557F, -0.7078F, -0.2973F, -0.1816F, -0.3244F));

		PartDefinition cube_r32 = leftLeg4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 87).addBox(-2.1391F, -0.9148F, 0.1596F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.1391F, 0.6553F, -1.3739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 6.9764F, 0.0931F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 53).addBox(-1.0F, -1.6F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 64).addBox(-0.5F, -3.525F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(51, 106).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.4931F, -4.8245F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(79, 19).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7573F, -3.4287F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(9, 80).addBox(-1.0F, -0.2F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.9435F, -2.8719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 41).addBox(-1.0F, -1.0317F, -1.4745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.9586F, -2.3965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 93).addBox(0.0F, -4.0F, -2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7425F, 4.7811F, 0.4939F, 0.109F, -0.9904F, 0.1404F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 103).addBox(-0.3F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.251F, 5.2756F, -0.4394F, -1.0487F, -0.8683F, 0.3958F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, 0.0F, -0.825F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 3.2834F, -0.4367F, -0.4276F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.2053F, -3.4214F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(87, 43).addBox(0.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -0.875F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 1.427F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(96, 25).addBox(0.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(95, 58).addBox(0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 1.7022F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(112, 83).addBox(-0.4892F, -4.7152F, -0.21F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0945F, 4.8471F, 1.1438F, -0.236F, -0.0869F, 0.0076F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(16, 63).addBox(-0.4892F, -2.0704F, -0.4044F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.0945F, 4.8471F, 1.1438F, -0.3407F, -0.0869F, 0.0076F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(106, 95).addBox(-1.5F, 1.75F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(108, 25).addBox(-1.0F, -2.15F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 106).addBox(-0.5F, 4.6869F, -0.7332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 62).addBox(0.0F, 1.1869F, -0.7332F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 11.4214F, -1.2303F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(114, 52).addBox(0.0F, -1.9014F, -1.1384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, 0.1935F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(108, 113).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, -1.659F, 0.6091F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(21, 63).addBox(-1.7F, -1.0F, -0.4F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.5705F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.3889F, 1.7667F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(108, 90).addBox(-8.9905F, -4.5937F, 0.0578F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(10.6782F, 1.1557F, -0.7078F, -0.2973F, -0.1816F, -0.3244F));

		PartDefinition cube_r56 = rightLeg4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(96, 108).addBox(-0.4F, -1.4F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.6782F, 1.1557F, -0.7078F, -0.2973F, 0.1816F, 0.3244F));

		PartDefinition cube_r57 = rightLeg4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(80, 87).addBox(0.1391F, -0.9148F, 0.1596F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.1391F, 0.6553F, -1.3739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 5.6573F, 0.6987F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(89, 55).addBox(-1.275F, -0.5F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4879F, 1.3972F, 1.2753F, -0.0052F, -0.8315F, -0.1362F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 10).addBox(-1.4F, 0.0F, -0.325F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.658F, 0.7981F, -0.7335F, -0.6193F, 0.3801F, -0.5408F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 97).addBox(0.1694F, -0.6208F, -1.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0268F, -1.5948F, -0.1618F, -0.0225F, 0.2699F, 1.803F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(14, 97).addBox(0.1694F, -0.5985F, -2.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0268F, -1.5948F, -0.1618F, 0.0996F, 0.2699F, 1.803F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 16).addBox(-0.722F, -0.4023F, -0.6108F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0268F, -1.6948F, -2.1618F, -1.9947F, 0.9578F, -1.812F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(110, 77).addBox(-0.4221F, -0.4023F, -0.3108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0268F, -1.6948F, -2.1618F, -1.6734F, 1.0155F, -1.4285F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 29).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.9702F, -3.133F, -8.4509F, -2.7393F, -0.3852F, -2.7486F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 77).addBox(-3.3137F, -0.3484F, -0.9852F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5922F, -3.6635F, -5.9936F, -2.4012F, -1.0028F, 3.0367F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 59).addBox(-0.9F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9178F, -2.6024F, -4.5285F, -2.2343F, -1.0922F, 2.8444F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 8).addBox(-1.95F, -0.5F, -0.575F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6542F, -2.7057F, -5.7454F, -2.6205F, -0.754F, -2.9644F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(41, 29).addBox(-2.5967F, -0.3484F, -1.2868F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5922F, -3.6635F, -5.9936F, -2.6726F, -0.6388F, -2.8834F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(47, 63).addBox(-1.5F, -0.5F, -1.05F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4412F, -4.2103F, -5.2757F, -2.7297F, -0.2158F, -2.1521F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(113, 71).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(113, 40).addBox(-1.0F, -0.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1785F, -5.836F, -5.7814F, -2.6678F, 0.5413F, -1.8005F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(67, 45).addBox(-0.3492F, -0.081F, -2.8357F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5922F, -3.6635F, -5.9936F, -2.7353F, 0.1452F, -1.9967F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(87, 29).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6856F, -4.0702F, -4.3506F, -2.8554F, 0.4683F, -2.2617F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 35).addBox(-1.925F, 0.0F, -2.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.708F, -0.1058F, 2.439F, 3.0419F, 0.5477F, -1.0281F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 80).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4605F, -0.24F, 2.7153F, 2.9637F, 0.1784F, -1.1589F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(102, 0).addBox(-0.075F, -0.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6598F, 0.6892F, 3.8006F, 0.2176F, 0.7156F, 2.4276F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(101, 91).addBox(0.075F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6598F, 0.6892F, 3.8006F, 2.6758F, 1.1996F, -1.2961F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 70).addBox(-0.575F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6598F, 0.6892F, 3.8006F, 2.9089F, 0.7861F, -1.0242F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 50).addBox(-1.575F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0805F, -0.3404F, 0.8637F, 2.6902F, 1.2315F, -1.7856F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 110).addBox(-0.9F, 1.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8969F, -0.4689F, 0.2364F, -1.6036F, 0.2766F, -1.3532F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(12, 105).addBox(-0.9F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8969F, -0.4689F, 0.2364F, -1.611F, 0.669F, -1.3692F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 5.6573F, 0.6987F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-1.725F, -0.5F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4879F, 1.3972F, 1.2753F, -0.0052F, 0.8315F, 0.1362F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-1.6F, 0.0F, -0.325F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.658F, 0.7981F, -0.7335F, -0.6193F, -0.3801F, 0.5408F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(21, 97).mirror().addBox(-1.1694F, -0.6208F, -1.9873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.5948F, -0.1618F, -0.0225F, -0.2699F, -1.803F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(14, 97).mirror().addBox(-1.1694F, -0.5985F, -2.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.5948F, -0.1618F, 0.0996F, -0.2699F, -1.803F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-3.278F, -0.4023F, -0.6108F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.6948F, -2.1618F, -1.9947F, -0.9578F, 1.812F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(110, 77).mirror().addBox(-1.5779F, -0.4023F, -0.3108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.6948F, -2.1618F, -1.6734F, -1.0155F, 1.4285F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9702F, -3.133F, -8.4509F, -2.7393F, 0.3852F, 2.7486F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(9, 77).mirror().addBox(1.3137F, -0.3484F, -0.9852F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5922F, -3.6635F, -5.9936F, -2.4012F, 1.0028F, -3.0367F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.1F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9178F, -2.6024F, -4.5285F, -2.2343F, 1.0922F, -2.8444F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-2.05F, -0.5F, -0.575F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6542F, -2.7057F, -5.7454F, -2.6205F, 0.754F, 2.9644F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 29).mirror().addBox(-1.4033F, -0.3484F, -1.2868F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5922F, -3.6635F, -5.9936F, -2.6726F, 0.6388F, 2.8834F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-1.5F, -0.5F, -1.05F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4412F, -4.2103F, -5.2757F, -2.7297F, 0.2158F, 2.1521F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(113, 71).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(113, 40).mirror().addBox(0.0F, -0.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1785F, -5.836F, -5.7814F, -2.6678F, -0.5413F, 1.8005F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-2.6508F, -0.081F, -2.8357F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5922F, -3.6635F, -5.9936F, -2.7353F, -0.1452F, 1.9967F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(87, 29).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6856F, -4.0702F, -4.3506F, -2.8554F, -0.4683F, 2.2617F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-0.075F, 0.0F, -2.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.708F, -0.1058F, 2.439F, 3.0419F, -0.5477F, 1.0281F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(101, 80).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4605F, -0.24F, 2.7153F, 2.9637F, -0.1784F, 1.1589F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.925F, -0.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6598F, 0.6892F, 3.8006F, 0.2176F, -0.7156F, -2.4276F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(101, 91).mirror().addBox(-1.075F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6598F, 0.6892F, 3.8006F, 2.6758F, -1.1996F, 1.2961F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(-0.425F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6598F, 0.6892F, 3.8006F, 2.9089F, -0.7861F, 1.0242F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(-1.425F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0805F, -0.3404F, 0.8637F, 2.6902F, -1.2315F, 1.7856F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(48, 110).mirror().addBox(-1.1F, 1.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8969F, -0.4689F, 0.2364F, -1.6036F, -0.2766F, 1.3532F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 105).mirror().addBox(-1.1F, -0.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8969F, -0.4689F, 0.2364F, -1.611F, -0.669F, 1.3692F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.4189F, 0.0159F, -0.0071F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 113).addBox(0.0F, -3.2354F, -0.1789F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6548F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(89, 113).addBox(0.0F, -3.1589F, 0.0958F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.347F, -4.8381F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(113, 88).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8171F, -2.8061F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-2.9F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2565F, 0.1841F, -0.3587F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-2.3F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6004F, -0.2429F, 0.0788F, -0.2409F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6725F, -4.2268F, -0.333F, 0.3796F, -0.7241F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 74).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6725F, -4.2268F, -0.4173F, 0.2831F, -0.9817F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6725F, -4.2268F, -0.4893F, 0.1052F, -1.3491F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 98).addBox(-0.7F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6004F, -0.2429F, -0.0788F, 0.2409F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(97, 96).addBox(-0.1F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2565F, -0.1841F, 0.3587F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(101, 35).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6725F, -4.2268F, -0.333F, -0.3796F, 0.7241F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(101, 74).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6725F, -4.2268F, -0.4173F, -0.2831F, 0.9817F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(96, 87).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6725F, -4.2268F, -0.4893F, -0.1052F, 1.3491F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(80, 117).addBox(0.0F, -3.1408F, 0.0224F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 117).addBox(0.0F, -2.8594F, -0.0812F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.259F, 0.4896F, -0.9216F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(24, 32).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.4306F, 0.3518F, -1.3357F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(98, 11).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.1128F, 0.5384F, -0.6259F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.267F, -1.6528F, -0.4391F, 0.3178F, -1.3385F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.267F, -1.6528F, -0.2826F, 0.4617F, -0.9324F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.267F, -1.6528F, -0.1454F, 0.5177F, -0.6423F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(101, 33).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.267F, -1.6528F, -0.1454F, -0.5177F, 0.6423F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(100, 70).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.267F, -1.6528F, -0.2826F, -0.4617F, 0.9324F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(64, 4).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.267F, -1.6528F, -0.4391F, -0.3178F, 1.3385F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(98, 11).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.1128F, -0.5384F, 0.6259F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(24, 32).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.4306F, -0.3518F, 1.3357F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(98, 9).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.259F, -0.4896F, 0.9216F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.0786F, 0.0348F, -0.0027F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 23).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(98, 13).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, 0.0258F, 0.616F, -0.5501F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.157F, 0.5987F, -0.8687F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.3939F, 0.4873F, -1.3207F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(34, 98).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.0102F, 0.5974F, -0.5706F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(51, 98).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.1838F, 0.5719F, -0.8835F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(23, 12).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.4035F, 0.4535F, -1.325F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(23, 12).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.4035F, -0.4535F, 1.325F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(51, 98).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.1838F, -0.5719F, 0.8835F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(34, 98).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.0102F, -0.5974F, 0.5706F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 18).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.3939F, -0.4873F, 1.3207F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(98, 15).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.157F, -0.5987F, 0.8687F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(98, 13).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, 0.0258F, -0.616F, 0.5501F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(44, 115).addBox(0.0F, -2.8611F, -0.1182F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(53, 8).addBox(0.0F, -2.6088F, -0.0606F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.2967F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(29, 51).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(116, 98).addBox(0.0F, -2.5745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(116, 88).addBox(0.0F, -2.8501F, 0.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.4757F, 0.1648F, -1.3472F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(98, 54).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.3814F, 0.3337F, -0.9708F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.2829F, 0.4196F, -0.7046F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4757F, 0.1648F, -1.3472F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 98).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.3814F, 0.3337F, -0.9708F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 98).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.2829F, 0.4196F, -0.7046F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(78, 98).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.2829F, -0.4196F, 0.7046F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 98).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.3814F, -0.3337F, 0.9708F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 12).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4757F, -0.1648F, 1.3472F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(98, 56).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.2829F, -0.4196F, 0.7046F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(98, 54).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.3814F, -0.3337F, 0.9708F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 2).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.4757F, -0.1648F, 1.3472F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.002F, -3.9751F, 0.0786F, 0.0348F, 0.0027F));

		PartDefinition cube_r162 = body5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(32, 117).addBox(0.0F, -2.9745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 114).addBox(0.0F, -3.2501F, 0.0278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.5027F, 0.0456F, -1.3501F));

		PartDefinition cube_r165 = body5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.4522F, 0.2321F, -0.9905F));

		PartDefinition cube_r166 = body5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(19, 105).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.3815F, 0.3387F, -0.7411F));

		PartDefinition cube_r167 = body5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4989F, 0.0626F, -1.3499F));

		PartDefinition cube_r168 = body5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4423F, 0.2467F, -0.9882F));

		PartDefinition cube_r169 = body5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.3678F, 0.3505F, -0.7365F));

		PartDefinition cube_r170 = body5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(5, 100).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.3678F, -0.3505F, 0.7365F));

		PartDefinition cube_r171 = body5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(97, 98).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4423F, -0.2467F, 0.9882F));

		PartDefinition cube_r172 = body5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 6).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4989F, -0.0626F, 1.3499F));

		PartDefinition cube_r173 = body5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(19, 105).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.3815F, -0.3387F, 0.7411F));

		PartDefinition cube_r174 = body5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(103, 84).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.4522F, -0.2321F, 0.9905F));

		PartDefinition cube_r175 = body5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 4).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.5027F, -0.0456F, 1.3501F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(42, 33).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0164F, -3.9466F, 0.1658F, 0.0172F, 0.0029F));

		PartDefinition cube_r176 = body6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(95, 113).addBox(0.0F, -3.6745F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body6.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(58, 63).addBox(0.0F, -4.2501F, 0.0278F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5372F, -0.1076F, -1.349F));

		PartDefinition cube_r179 = body6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(96, 46).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5385F, 0.1001F, -1.0049F));

		PartDefinition cube_r180 = body6.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5004F, 0.2306F, -0.7746F));

		PartDefinition cube_r181 = body6.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.541F, -0.1247F, -1.3485F));

		PartDefinition cube_r182 = body6.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(100, 17).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5479F, 0.0853F, -1.0057F));

		PartDefinition cube_r183 = body6.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(100, 19).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5131F, 0.2184F, -0.7774F));

		PartDefinition cube_r184 = body6.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(100, 19).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5131F, -0.2184F, 0.7774F));

		PartDefinition cube_r185 = body6.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(100, 17).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5479F, -0.0853F, 1.0057F));

		PartDefinition cube_r186 = body6.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 10).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.541F, 0.1247F, 1.3485F));

		PartDefinition cube_r187 = body6.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(96, 48).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5004F, -0.2306F, 0.7746F));

		PartDefinition cube_r188 = body6.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(96, 46).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5385F, -0.1001F, 1.0049F));

		PartDefinition cube_r189 = body6.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 8).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5372F, 0.1076F, 1.349F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(51, 39).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0022F, -3.9751F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(40, 108).addBox(0.0F, -4.8745F, 0.0098F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(69, 98).addBox(0.0F, -5.8501F, 0.0278F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.5528F, -0.1757F, -1.3468F));

		PartDefinition cube_r193 = body7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(100, 21).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.5759F, 0.0411F, -1.0075F));

		PartDefinition cube_r194 = body7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.5511F, 0.1815F, -0.785F));

		PartDefinition cube_r195 = body7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5528F, -0.1757F, -1.3468F));

		PartDefinition cube_r196 = body7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(28, 100).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5759F, 0.0411F, -1.0075F));

		PartDefinition cube_r197 = body7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(37, 100).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.5511F, 0.1815F, -0.785F));

		PartDefinition cube_r198 = body7.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(37, 100).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5511F, -0.1815F, 0.785F));

		PartDefinition cube_r199 = body7.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(28, 100).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5759F, -0.0411F, 1.0075F));

		PartDefinition cube_r200 = body7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 14).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.5528F, 0.1757F, 1.3468F));

		PartDefinition cube_r201 = body7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(100, 23).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.5511F, -0.1815F, 0.785F));

		PartDefinition cube_r202 = body7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(100, 21).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.5759F, -0.0411F, 1.0075F));

		PartDefinition cube_r203 = body7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 20).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.5528F, 0.1757F, 1.3468F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0536F, -3.8395F, -0.3055F, 0.0166F, -0.0052F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(31, 90).addBox(0.0F, -6.9226F, -0.0168F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(7, 40).addBox(0.0F, -7.3222F, -0.0133F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-10.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9773F, 13.396F, 3.8257F, -0.4696F, 0.9927F, 0.0891F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-12.0F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9773F, 13.396F, 3.8257F, -0.486F, 1.1002F, 0.1014F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 14).mirror().addBox(-7.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.345F, 13.1034F, 4.4694F, -0.4952F, 0.832F, -0.0104F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-6.3F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4723F, 13.0919F, 4.4986F, -0.4366F, 0.6716F, -0.081F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 34).mirror().addBox(-5.9F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0313F, 13.3337F, 4.0015F, -0.1931F, 0.4533F, 0.0946F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(-4.7F, 0.2F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 12.2225F, -0.4082F, -0.334F, 0.3638F, 0.1188F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 56).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9339F, 11.514F, -1.7706F, -0.4336F, 0.2226F, 0.1894F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(42, 15).mirror().addBox(-5.3F, 0.0F, -1.2F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0405F, 13.2956F, 3.6814F, 0.0085F, 0.2915F, 0.1525F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-5.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.001F, 13.2102F, 1.3935F, -0.0647F, 0.2776F, 0.2377F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(23, 16).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4835F, 0.1308F, -1.3484F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(46, 100).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4021F, 0.3048F, -0.9772F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(55, 100).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.3118F, 0.3968F, -0.716F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4717F, 0.1818F, -1.3814F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(94, 85).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.3709F, 0.3481F, -1.0022F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.2683F, 0.4309F, -0.7335F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-2.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0815F, 9.9834F, -3.2318F, -0.8438F, 0.106F, 0.0826F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(95, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.2683F, -0.4309F, 0.7335F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(94, 85).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.3709F, -0.3481F, 1.0022F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(25, 9).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4717F, -0.1818F, 1.3814F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(55, 100).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.3118F, -0.3968F, 0.716F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(46, 100).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4021F, -0.3048F, 0.9772F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(23, 16).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4835F, -0.1308F, 1.3484F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(36, 18).addBox(-2.0856F, -1.021F, 0.0041F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0856F, 13.6034F, 0.4799F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(44, 0).addBox(-0.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.001F, 13.2102F, 1.3935F, -0.0647F, -0.2776F, -0.2377F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(42, 15).addBox(-0.7F, 0.0F, -1.2F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0405F, 13.2956F, 3.6814F, 0.0085F, -0.2915F, -0.1525F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(25, 2).addBox(-2.1131F, -0.946F, -4.9459F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1131F, 12.419F, -1.2389F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(35, 106).addBox(-0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0815F, 9.9834F, -3.2318F, -0.8438F, -0.106F, -0.0826F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 56).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9339F, 11.514F, -1.7706F, -0.4336F, -0.2226F, -0.1894F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(42, 13).addBox(-1.3F, 0.2F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 12.2225F, -0.4082F, -0.334F, -0.3638F, -0.1188F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(82, 14).addBox(-1.0F, -0.9035F, -1.5298F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 13.23F, 0.1233F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(24, 34).addBox(-1.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0313F, 13.3337F, 4.0015F, -0.1931F, -0.4533F, -0.0946F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(27, 0).addBox(-0.7F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4723F, 13.0919F, 4.4986F, -0.4366F, -0.6716F, 0.081F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(23, 14).addBox(-0.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.345F, 13.1034F, 4.4694F, -0.4952F, -0.832F, 0.0104F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9773F, 13.396F, 3.8257F, -0.486F, -1.1002F, -0.1014F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9773F, 13.396F, 3.8257F, -0.4696F, -0.9927F, -0.0891F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(49, 83).addBox(0.0F, -7.5489F, -0.0609F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(46, 83).addBox(0.0F, -7.4489F, 0.0391F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.7109F, 0.0195F, -0.8884F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(100, 60).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.6977F, -0.1506F, -1.0881F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.607F, -0.3966F, -1.4187F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 76).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.6977F, -0.1506F, -1.1055F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.607F, -0.3966F, -1.4361F));

		PartDefinition cube_r249 = neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(101, 78).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.7109F, 0.0195F, -0.9058F));

		PartDefinition cube_r250 = neck2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(101, 78).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.7109F, -0.0195F, 0.9058F));

		PartDefinition cube_r251 = neck2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(104, 72).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.607F, 0.3966F, 1.4361F));

		PartDefinition cube_r252 = neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 76).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.6977F, 0.1506F, 1.1055F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(64, 6).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.607F, 0.3966F, 1.4187F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(100, 60).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.6977F, 0.1506F, 1.0881F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(100, 58).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.7109F, -0.0195F, 0.8884F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6F, 6.2605F, -4.6499F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(111, 104).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(104, 100).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(112, 11).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftarm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(107, 14).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(91, 13).addBox(-1.0F, -2.7306F, -0.0847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftarm.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(102, 4).addBox(-1.0F, -2.5556F, -0.0597F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftarm.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(51, 51).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.6022F, 0.0014F, -0.001F));

		PartDefinition cube_r263 = leftarm.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 45).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r264 = leftarm.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(83, 64).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftarm.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftarm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(11, 59).addBox(-0.5F, -4.5F, 0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftarm.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(29, 110).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.9899F, 3.273F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftarm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(94, 33).addBox(-1.625F, -1.725F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -1.7248F, 0.3442F, 1.5708F, 1.0734F, -1.5708F));

		PartDefinition cube_r269 = leftarm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(109, 0).addBox(0.0F, -0.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1764F, -0.3428F, 0.3411F, 1.5708F, 1.0734F, -1.5708F));

		PartDefinition cube_r270 = leftarm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(111, 107).addBox(-0.5028F, -1.2199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.1776F, 1.5708F, -0.1047F, -1.5708F));

		PartDefinition cube_r271 = leftarm2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(22, 115).addBox(0.7F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(3, 115).addBox(0.7F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(114, 14).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -1.9597F, 2.6354F, 1.5708F, 0.2967F, -1.5708F));

		PartDefinition cube_r272 = leftarm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(87, 47).addBox(-0.2028F, -1.8199F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.1776F, 1.5708F, -0.5411F, -1.5708F));

		PartDefinition cube_r273 = leftarm2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(89, 80).addBox(0.3799F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3236F, -1.389F, -0.0224F, -1.5708F, -1.5097F, 1.5708F));

		PartDefinition cube_r274 = leftarm2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(26, 90).addBox(-0.909F, -0.6719F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3236F, 4.8444F, 0.9397F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r275 = leftarm2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(87, 96).addBox(-0.7799F, 4.8057F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 0.5922F, -0.8512F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r276 = leftarm2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(21, 90).addBox(-1.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 0.5922F, -0.8512F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r277 = leftarm2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(96, 74).addBox(-0.05F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 5.1852F, -0.0019F, 1.5708F, -1.5533F, -1.5708F));

		PartDefinition cube_r278 = leftarm2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(18, 39).addBox(-0.55F, -2.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.6387F, 0.1231F, 1.5708F, -1.4224F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 9.3969F, 0.1286F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftArm3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(109, 57).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftArm4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(42, 39).addBox(-0.5F, -0.4F, -0.3F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 0.0601F, 0.1092F, 0.0356F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0765F, 5.9923F, 0.3328F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftArm5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 110).addBox(9.7542F, -5.744F, -0.2778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.7705F, -0.0536F, 0.1143F, -0.8812F, 0.3215F, 0.2298F));

		PartDefinition cube_r282 = leftArm5.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(110, 31).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4942F, -0.0536F, 0.1143F, -0.8812F, -0.3215F, -0.2298F));

		PartDefinition cube_r283 = leftArm5.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(87, 91).addBox(-1.0765F, -0.8029F, -0.5191F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6F, 6.2605F, -4.6499F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(111, 110).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(104, 104).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(112, 43).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(109, 20).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(66, 93).addBox(-1.0F, -2.7306F, -0.0847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(97, 104).addBox(-1.0F, -2.5556F, -0.0597F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 10.1436F, 2.3001F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(20, 57).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.6022F, -0.0014F, 0.001F));

		PartDefinition cube_r290 = rightarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(57, 8).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r291 = rightarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(34, 86).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(62, 50).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(62, 39).addBox(-0.5F, -4.5F, 0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(84, 110).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.9899F, 3.273F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightarm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(94, 80).addBox(-0.375F, -1.725F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -1.7248F, 0.3442F, 1.5708F, -1.0734F, 1.5708F));

		PartDefinition cube_r296 = rightarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(12, 109).addBox(-1.0F, -0.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1764F, -0.3428F, 0.3411F, 1.5708F, -1.0734F, 1.5708F));

		PartDefinition cube_r297 = rightarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(112, 8).addBox(-1.4972F, -1.2199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.1776F, 1.5708F, 0.1047F, 1.5708F));

		PartDefinition cube_r298 = rightarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(39, 115).addBox(-1.7F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(115, 31).addBox(-1.7F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(27, 115).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, -1.9597F, 2.6354F, 1.5708F, -0.2967F, 1.5708F));

		PartDefinition cube_r299 = rightarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(87, 51).addBox(-2.7972F, -1.8199F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.1776F, 1.5708F, 0.5411F, 1.5708F));

		PartDefinition cube_r300 = rightarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(16, 90).addBox(-1.3799F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3236F, -1.389F, -0.0224F, -1.5708F, 1.5097F, -1.5708F));

		PartDefinition cube_r301 = rightarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(9, 91).addBox(-0.091F, -0.6719F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3236F, 4.8444F, 0.9397F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r302 = rightarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 97).addBox(-0.2201F, 4.8057F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7764F, 0.5922F, -0.8512F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r303 = rightarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(90, 62).addBox(0.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7764F, 0.5922F, -0.8512F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r304 = rightarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(92, 96).addBox(-0.95F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 5.1852F, -0.0019F, 1.5708F, 1.5533F, 1.5708F));

		PartDefinition cube_r305 = rightarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(41, 83).addBox(-0.45F, -2.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.6387F, 0.1231F, 1.5708F, 1.4224F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 9.3969F, 0.1286F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightArm3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(109, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, -0.4049F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightArm4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(31, 43).addBox(-2.5F, -0.4F, -0.3F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 0.0601F, 0.1092F, 0.0356F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0765F, 5.9923F, 1.0328F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightArm5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(24, 110).addBox(-10.7542F, -5.744F, -0.2778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.7705F, -0.0536F, 0.1142F, -0.8812F, -0.3215F, -0.2298F));

		PartDefinition cube_r309 = rightArm5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(111, 99).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4942F, -0.0536F, 0.1142F, -0.8812F, 0.3215F, 0.2298F));

		PartDefinition cube_r310 = rightArm5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(80, 93).addBox(-0.9235F, -0.8029F, -0.5191F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7082F, 2.5445F, -2.2377F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(59, 87).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1595F, 1.5393F, 1.4677F, -0.7202F, 0.169F, -0.3803F));

		PartDefinition cube_r312 = bone2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(31, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2424F, 0.5371F, 3.1965F, -2.6401F, 0.169F, -0.3803F));

		PartDefinition cube_r313 = bone2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(73, 94).addBox(-1.1021F, -5.1282F, -0.5613F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3529F, -2.439F, 4.7436F, 2.0136F, 0.2934F, -0.242F));

		PartDefinition cube_r314 = bone2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 109).addBox(-0.0244F, -1.1821F, -1.3142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3243F, -2.885F, 5.0525F, 2.1723F, -0.1139F, -0.5491F));

		PartDefinition cube_r315 = bone2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -2.0F, 0.1F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2552F, -0.3247F, 5.0012F, 2.0287F, 0.169F, -0.3803F));

		PartDefinition cube_r316 = bone2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(52, 86).addBox(-0.5F, -1.725F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7916F, -3.0219F, 7.9487F, 0.1961F, 0.169F, -0.3803F));

		PartDefinition cube_r317 = bone2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(82, 77).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.375F, -6.1536F, 6.1442F, -2.1165F, 0.169F, -0.3803F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 71).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6074F, -5.8268F, 4.1686F, -3.0328F, 0.169F, -0.3803F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3439F, -3.6487F, 0.8651F, 0.7633F, 0.169F, -0.3803F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9269F, -2.0643F, -0.3117F, -1.8111F, 0.169F, -0.3803F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(67, 39).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8747F, -2.0217F, -0.1206F, -0.5457F, 0.169F, -0.3803F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, 0.0F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.6712F, -5.1186F, 2.2812F, 1.9414F, 0.169F, -0.3803F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5F, -2.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.273F, 0.169F, -0.3803F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(5, 106).addBox(-2.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8383F, 1.4405F, -2.4F, 1.6098F, 0.169F, -0.3803F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(95, 0).addBox(-1.5272F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition bone4 = neck2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7082F, 2.5445F, -2.2377F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r326 = bone4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(59, 87).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1595F, 1.5393F, 1.4677F, -0.7202F, -0.169F, 0.3803F));

		PartDefinition cube_r327 = bone4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(31, 57).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2424F, 0.5371F, 3.1965F, -2.6401F, -0.169F, 0.3803F));

		PartDefinition cube_r328 = bone4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(73, 94).mirror().addBox(0.1021F, -5.1282F, -0.5613F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3529F, -2.439F, 4.7436F, 2.0136F, -0.2934F, 0.242F));

		PartDefinition cube_r329 = bone4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.9756F, -1.1821F, -1.3142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3243F, -2.885F, 5.0525F, 2.1723F, 0.1139F, 0.5491F));

		PartDefinition cube_r330 = bone4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.5F, -2.0F, 0.1F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2552F, -0.3247F, 5.0012F, 2.0287F, -0.169F, 0.3803F));

		PartDefinition cube_r331 = bone4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-0.5F, -1.725F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7916F, -3.0219F, 7.9487F, 0.1961F, -0.169F, 0.3803F));

		PartDefinition cube_r332 = bone4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.375F, -6.1536F, 6.1442F, -2.1165F, -0.169F, 0.3803F));

		PartDefinition cube_r333 = bone4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6074F, -5.8268F, 4.1686F, -3.0328F, -0.169F, 0.3803F));

		PartDefinition cube_r334 = bone4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3439F, -3.6487F, 0.8651F, 0.7633F, -0.169F, 0.3803F));

		PartDefinition cube_r335 = bone4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.5F, -2.2F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9269F, -2.0643F, -0.3117F, -1.8111F, -0.169F, 0.3803F));

		PartDefinition cube_r336 = bone4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8747F, -2.0217F, -0.1206F, -0.5457F, -0.169F, 0.3803F));

		PartDefinition cube_r337 = bone4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, 0.0F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.6712F, -5.1186F, 2.2812F, 1.9414F, -0.169F, 0.3803F));

		PartDefinition cube_r338 = bone4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.5F, -2.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.273F, -0.169F, 0.3803F));

		PartDefinition cube_r339 = bone4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(0.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8383F, 1.4405F, -2.4F, 1.6098F, -0.169F, 0.3803F));

		PartDefinition cube_r340 = bone4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.4728F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.6458F, 0.0139F, -0.0105F));

		PartDefinition cube_r341 = neck.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(110, 36).addBox(0.0F, -4.6828F, -0.0159F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r342 = neck.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(30, 70).addBox(-0.5F, -0.6165F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(56, 70).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(16, 59).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 117).addBox(0.0F, -2.8F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(53, 2).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0125F, -2.9567F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(9, 70).addBox(0.0F, -1.3F, -1.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(69, 54).addBox(-0.5F, -0.375F, -3.0256F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.215F, -3.8788F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(113, 23).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8673F, -1.2431F, 0.121F, -0.05F, 0.3897F));

		PartDefinition cube_r347 = neck5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(17, 113).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8673F, -1.2431F, 0.121F, 0.05F, -0.3897F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0051F, -3.314F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(37, 24).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3805F, -2.5577F, 2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 64).addBox(-3.0F, -2.05F, 0.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5254F, 0.7081F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(64, 0).addBox(-3.0F, -1.175F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0876F, -0.5552F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 2).addBox(-1.575F, -1.4F, -0.775F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.075F, 1.6408F, -1.438F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(21, 18).addBox(-1.0F, 1.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.634F, -3.7568F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(25, 86).addBox(-0.813F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.187F, 13.911F, -9.0426F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(62, 110).addBox(-0.813F, -0.9F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 110).addBox(-0.813F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.187F, 13.0378F, -10.2946F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(110, 49).addBox(-0.813F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.187F, 12.2599F, -10.4813F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(86, 0).addBox(-0.813F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.187F, 10.6856F, -9.6087F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(85, 58).addBox(-0.813F, -1.9F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.187F, 10.2874F, -7.0944F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(55, 75).addBox(-0.813F, -1.9F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.187F, 9.063F, -6.4157F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(65, 71).addBox(-0.813F, -0.1F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.187F, 7.5772F, -7.709F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(56, 102).addBox(-0.3F, -1.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.1538F, -6.0637F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(49, 102).addBox(-0.3F, -1.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(103, 50).addBox(-0.8F, -1.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7477F, -6.2031F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(47, 67).addBox(-0.5F, -0.45F, 0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 5.6448F, -7.3363F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(64, 76).addBox(-0.5F, -0.6F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.9285F, -7.6926F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(34, 92).addBox(-0.5F, -0.7F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.6448F, -7.3363F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(116, 56).addBox(-0.8F, 0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.5829F, -7.5225F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(117, 83).addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(117, 77).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.004F, 5.8807F, -10.5953F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(28, 102).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.004F, 4.4813F, -9.8196F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(35, 102).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.004F, 4.4813F, -9.8196F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.004F, 3.2556F, -8.7911F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(42, 102).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.004F, 3.9245F, -8.1889F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(60, 14).addBox(-1.0F, -0.675F, -0.65F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.004F, 3.3484F, -8.0348F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(118, 115).addBox(-0.5F, -0.725F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.004F, 3.4543F, -7.7368F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(118, 112).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.496F, 1.8802F, -7.8866F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(72, 101).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.996F, 0.9739F, -7.464F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(28, 106).addBox(0.0F, -0.025F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.503F, 0.0017F, -6.4465F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(100, 62).addBox(-0.5F, -0.5F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.2588F, -3.9643F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(71, 11).addBox(0.5F, -0.225F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -1.2944F, -5.0279F, 0.8552F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7299F, -7.7083F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(116, 20).addBox(0.3186F, -1.0341F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.371F, -10.7061F, 4.8739F, 0.4317F, 1.0569F, -0.8978F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(79, 104).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8448F, -11.67F, 3.9193F, 0.8893F, 0.4402F, -0.029F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(97, 100).addBox(-1.0F, 0.225F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.425F, -11.7942F, 3.5059F, 0.9439F, 0.1667F, 0.2251F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 40).addBox(-0.65F, -4.2F, -0.2F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9154F, -3.7503F, 1.9264F, -0.4691F, 0.239F, -0.0653F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(88, 4).addBox(-0.65F, -0.2F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.9154F, -3.7503F, 1.9264F, -0.123F, -0.3243F, 0.0026F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(88, 18).addBox(-0.65F, -0.6F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0949F, -5.3182F, 2.19F, -0.1733F, -0.301F, 0.1659F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(8, 118).addBox(-0.8F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(3, 118).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.729F, -1.6956F, -3.2177F, 1.3006F, 0.0714F, 0.2521F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(103, 37).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.029F, -2.8054F, -2.9112F, 1.0663F, 0.0423F, 0.0764F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(103, 41).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.179F, -4.2102F, -2.1434F, 0.8745F, 0.0561F, 0.0669F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(118, 71).addBox(-0.4985F, -0.6301F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8515F, -10.8242F, 5.0742F, 1.2254F, 0.5505F, 0.0972F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(118, 93).addBox(-0.4985F, -1.012F, -1.1024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8515F, -10.8242F, 5.0742F, 0.2219F, 0.5505F, 0.0972F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(113, 113).addBox(-0.5015F, -0.3096F, -0.1794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8515F, -10.8242F, 5.0742F, 0.44F, 0.5505F, 0.0972F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(52, 92).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7026F, -5.2197F, 2.3618F, -1.6339F, 0.1468F, -1.4563F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(106, 108).addBox(-0.1F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7704F, -5.9242F, 3.4958F, -2.0974F, 0.1391F, -2.68F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(80, 29).addBox(-2.1F, -2.2F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8369F, -7.2823F, 1.8706F, -1.6435F, 0.5386F, -1.4844F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(52, 80).addBox(-0.075F, -1.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(34, 80).addBox(-0.675F, -1.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.9313F, -6.7618F, 2.9471F, -1.6604F, 0.7995F, -1.5114F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(27, 80).addBox(-0.9F, -1.5F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8369F, -7.2823F, 1.8706F, -1.6896F, 1.0165F, -1.5482F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(59, 81).addBox(-0.8F, -0.025F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2993F, -8.8803F, 2.2617F, -0.8087F, 0.7635F, -0.4649F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(53, 33).addBox(-2.9F, -1.5F, -1.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0267F, -9.5126F, 3.5191F, -1.5241F, 0.8427F, -1.5233F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 83).addBox(-0.7F, -1.875F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9224F, -9.6938F, 2.7327F, -0.9271F, 0.5898F, -0.6529F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(83, 118).addBox(0.3F, -0.05F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.925F, -4.6871F, -0.1359F, 1.9171F, -0.0447F, 0.1231F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(78, 100).addBox(-0.9F, 0.05F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.05F, -4.4585F, -0.1059F, 1.3315F, 0.0592F, -0.2188F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(118, 40).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0496F, -3.6589F, 0.7061F, 1.538F, 0.0089F, 0.342F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(100, 66).addBox(-0.425F, -0.528F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.175F, -2.9118F, 0.6917F, 1.5272F, 0.0019F, 0.2007F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7299F, -7.7083F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(116, 20).mirror().addBox(-1.3186F, -1.0341F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.371F, -10.7061F, 4.8739F, 0.4317F, -1.0569F, 0.8978F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(79, 104).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8448F, -11.67F, 3.9193F, 0.8893F, -0.4402F, 0.029F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(97, 100).mirror().addBox(0.0F, 0.225F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -11.7942F, 3.5059F, 0.9439F, -0.1667F, -0.2251F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.35F, -4.2F, -0.2F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9154F, -3.7503F, 1.9264F, -0.4691F, -0.239F, 0.0653F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.35F, -0.2F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.9154F, -3.7503F, 1.9264F, -0.123F, 0.3243F, -0.0026F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(88, 18).mirror().addBox(-0.35F, -0.6F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0949F, -5.3182F, 2.19F, -0.1733F, 0.301F, -0.1659F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(8, 118).mirror().addBox(-0.2F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(3, 118).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.729F, -1.6956F, -3.2177F, 1.3006F, -0.0714F, -0.2521F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.029F, -2.8054F, -2.9112F, 1.0663F, -0.0423F, -0.0764F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(103, 41).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.179F, -4.2102F, -2.1434F, 0.8745F, -0.0561F, -0.0669F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(118, 71).mirror().addBox(-0.5015F, -0.6301F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8515F, -10.8242F, 5.0742F, 1.2254F, -0.5505F, -0.0972F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(118, 93).mirror().addBox(-0.5015F, -1.012F, -1.1024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8515F, -10.8242F, 5.0742F, 0.2219F, -0.5505F, -0.0972F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(113, 113).mirror().addBox(-0.4985F, -0.3096F, -0.1794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8515F, -10.8242F, 5.0742F, 0.44F, -0.5505F, -0.0972F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(52, 92).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.7026F, -5.2197F, 2.3618F, -1.6339F, -0.1468F, 1.4563F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 108).mirror().addBox(-0.9F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7704F, -5.9242F, 3.4958F, -2.0974F, -0.1391F, 2.68F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(80, 29).mirror().addBox(1.1F, -2.2F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8369F, -7.2823F, 1.8706F, -1.6435F, -0.5386F, 1.4844F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(-0.925F, -1.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(34, 80).mirror().addBox(-0.325F, -1.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.9313F, -6.7618F, 2.9471F, -1.6604F, -0.7995F, 1.5114F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(27, 80).mirror().addBox(-0.1F, -1.5F, -1.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8369F, -7.2823F, 1.8706F, -1.6896F, -1.0165F, 1.5482F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-0.2F, -0.025F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2993F, -8.8803F, 2.2617F, -0.8087F, -0.7635F, 0.4649F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(53, 33).mirror().addBox(-0.1F, -1.5F, -1.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0267F, -9.5126F, 3.5191F, -1.5241F, -0.8427F, 1.5233F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-0.3F, -1.875F, -0.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9224F, -9.6938F, 2.7327F, -0.9271F, -0.5898F, 0.6529F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(83, 118).mirror().addBox(-1.3F, -0.05F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -4.6871F, -0.1359F, 1.9171F, 0.0447F, -0.1231F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(78, 100).mirror().addBox(-0.1F, 0.05F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.05F, -4.4585F, -0.1059F, 1.3315F, -0.0592F, 0.2188F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(118, 40).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0496F, -3.6589F, 0.7061F, 1.538F, -0.0089F, -0.342F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(100, 66).mirror().addBox(-0.575F, -0.528F, -1.9104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -2.9118F, 0.6917F, 1.5272F, -0.0019F, -0.2007F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6659F, 8.4212F, -5.3853F, -0.0522F, 0.0046F, 0.0871F));

		PartDefinition cube_r426 = leftOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(11, 22).addBox(-1.4037F, -0.9196F, -0.4926F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9942F, -7.8799F, 3.2406F, -2.3583F, 0.5464F, 0.4976F));

		PartDefinition cube_r427 = leftOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(118, 103).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9216F, -6.9568F, 2.6592F, -2.8896F, -0.0305F, -0.1132F));

		PartDefinition cube_r428 = leftOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(85, 102).addBox(-0.8631F, -1.3892F, -1.8511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F))
				.texOffs(95, 5).addBox(-0.8631F, -0.7392F, -1.8511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(2.3555F, -6.7717F, 0.9562F, -2.281F, 0.01F, -0.1168F));

		PartDefinition cube_r429 = leftOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(113, 28).addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.1027F, -6.04F, 1.6021F, -1.7603F, 0.0862F, -0.0795F));

		PartDefinition cube_r430 = leftOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(96, 42).addBox(-0.7814F, 0.1424F, -1.8051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(96, 38).addBox(-0.7814F, 0.5174F, -1.8051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.2055F, -4.0717F, 2.1812F, -1.6377F, 0.0934F, 0.1561F));

		PartDefinition cube_r431 = leftOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(20, 53).addBox(-1.6458F, -0.5948F, -0.5017F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9942F, -7.8799F, 3.2406F, -2.3054F, 0.4797F, 0.6162F));

		PartDefinition cube_r432 = leftOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(113, 94).addBox(-0.863F, -1.817F, -0.8373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1805F, -8.1717F, 1.6312F, -2.6453F, -0.0305F, -0.1132F));

		PartDefinition cube_r433 = leftOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(72, 117).addBox(-0.5F, -0.725F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8872F, -7.655F, 1.0501F, -2.5603F, 0.01F, -0.1168F));

		PartDefinition cube_r434 = leftOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(112, 65).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.9681F, -6.952F, 0.8925F, -1.7313F, 0.01F, -0.1168F));

		PartDefinition cube_r435 = leftOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(67, 117).addBox(-0.8631F, -0.7516F, -0.5526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.3555F, -6.7717F, 0.9562F, -1.6004F, 0.01F, -0.1168F));

		PartDefinition cube_r436 = leftOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(117, 65).addBox(-0.8826F, -0.7687F, -1.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(117, 62).addBox(-0.8826F, -0.7687F, -0.8026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.4555F, -5.7717F, 0.9812F, -1.516F, 0.0862F, -0.0795F));

		PartDefinition cube_r437 = leftOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(96, 50).addBox(-0.4442F, -0.4281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6805F, -0.7717F, -0.6938F, -2.1096F, 0.1526F, 0.2261F));

		PartDefinition cube_r438 = leftOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(62, 117).addBox(-0.9568F, -0.9199F, 0.0553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.82F, -0.178F, -0.3567F, 1.8267F, 0.1006F, 0.2284F));

		PartDefinition cube_r439 = leftOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 84).addBox(-1.5F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.788F, -1.1421F, 0.0521F, 0.489F, 0.2634F, 0.3932F));

		PartDefinition cube_r440 = leftOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(101, 25).addBox(-1.4442F, 1.1087F, -1.5641F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6805F, -0.7717F, -0.6938F, 2.7163F, 0.1526F, 0.2261F));

		PartDefinition cube_r441 = leftOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(63, 113).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6002F, -3.1445F, 1.3087F, -3.1306F, 0.1526F, 0.2261F));

		PartDefinition cube_r442 = leftOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(68, 113).addBox(-0.5F, -0.675F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.8588F, -3.7372F, 2.0832F, -2.7815F, 0.1526F, 0.2261F));

		PartDefinition cube_r443 = leftOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(116, 17).addBox(-0.5F, -0.125F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.6405F, -2.5726F, 2.3974F, -1.3678F, 0.1526F, 0.2261F));

		PartDefinition cube_r444 = leftOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(116, 4).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4529F, -1.9898F, 2.0581F, -0.5126F, 0.1526F, 0.2261F));

		PartDefinition cube_r445 = leftOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(77, 110).addBox(-1.5F, -0.85F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1797F, -1.2062F, 1.4693F, 2.0356F, 0.1526F, 0.2261F));

		PartDefinition cube_r446 = leftOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(110, 74).addBox(-1.5F, -0.85F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.2603F, -1.4371F, 1.643F, 0.9447F, 0.1526F, 0.2261F));

		PartDefinition cube_r447 = leftOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(83, 115).addBox(-0.4442F, -2.8712F, 0.6167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.6805F, -0.7717F, -0.6938F, -0.626F, 0.1526F, 0.2261F));

		PartDefinition cube_r448 = leftOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(117, 59).addBox(-0.425F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1355F, -2.0018F, 0.4495F, 1.1395F, 0.1898F, 0.2209F));

		PartDefinition cube_r449 = leftOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(57, 117).addBox(-0.4442F, -2.6055F, 0.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6805F, -0.7717F, -0.6938F, -0.277F, 0.1526F, 0.2261F));

		PartDefinition cube_r450 = leftOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(115, 80).addBox(-0.4442F, -2.2012F, -2.604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6805F, -0.7717F, -0.6938F, -1.4551F, 0.1526F, 0.2261F));

		PartDefinition cube_r451 = leftOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(52, 117).addBox(-0.3527F, -0.8523F, -0.2406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.416F, -1.2674F, -1.5418F, 0.7359F, 0.7393F, 0.0802F));

		PartDefinition cube_r452 = leftOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(69, 49).addBox(-0.627F, -0.272F, -0.2652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0306F, -5.7828F, -2.2419F, 1.1323F, -0.5246F, -0.3418F));

		PartDefinition cube_r453 = leftOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(76, 59).addBox(-0.6284F, 0.2381F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F))
				.texOffs(0, 74).addBox(-0.6284F, -0.1619F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0306F, -5.7828F, -2.2419F, 1.1942F, 0.0392F, -0.588F));

		PartDefinition cube_r454 = leftOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(117, 49).addBox(-0.3527F, -0.9376F, -0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.416F, -1.2674F, -1.5418F, 1.3817F, 0.7393F, 0.0802F));

		PartDefinition cube_r455 = leftOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(47, 117).addBox(-0.4613F, -0.7545F, -0.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.416F, -1.2674F, -1.5418F, 1.9428F, 0.6489F, 0.2404F));

		PartDefinition cube_r456 = leftOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(105, 86).addBox(-1.4F, 4.804F, -0.4578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, -0.5133F, 0.0584F, -0.1272F));

		PartDefinition cube_r457 = leftOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(105, 45).addBox(-1.4F, 5.9294F, -0.5548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, -0.3824F, 0.0584F, -0.1272F));

		PartDefinition cube_r458 = leftOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(80, 83).addBox(-1.8033F, -0.6627F, -0.2401F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4831F, -1.7835F, 0.1821F, -2.4136F, 0.3411F, 0.3319F));

		PartDefinition cube_r459 = leftOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(113, 117).addBox(-1.9025F, 1.3534F, -2.5857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 0.508F, -0.0514F, -0.2207F));

		PartDefinition cube_r460 = leftOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(9, 53).addBox(-1.2408F, 0.5966F, -5.7403F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 0.691F, -0.7765F, 0.4484F));

		PartDefinition cube_r461 = leftOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(76, 36).addBox(-1.9025F, 0.1195F, -5.5403F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 0.9879F, -0.0514F, -0.2207F));

		PartDefinition cube_r462 = leftOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(46, 73).addBox(-1.305F, 0.9851F, -2.4311F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 0.7386F, 0.0687F, -0.0311F));

		PartDefinition cube_r463 = leftOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(21, 101).addBox(-0.3544F, -0.876F, -1.5314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1235F, -0.1003F, 1.7836F, 0.7176F, 0.1312F, 0.0764F));

		PartDefinition cube_r464 = leftOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(14, 101).addBox(-0.7083F, -0.9841F, -1.7017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4106F, -1.5833F, 3.0943F, 0.925F, -0.0049F, -0.0945F));

		PartDefinition cube_r465 = leftOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(70, 19).addBox(-1.3886F, 1.566F, -2.3627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 0.7125F, 0.0687F, -0.0311F));

		PartDefinition cube_r466 = leftOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(72, 104).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3924F, -3.3092F, 0.6016F, 0.7296F, 0.3194F, 0.0276F));

		PartDefinition cube_r467 = leftOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(59, 93).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3924F, -3.3092F, 0.6016F, 0.692F, 0.4049F, -0.0784F));

		PartDefinition cube_r468 = leftOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(67, 65).addBox(-1.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.365F, -4.2275F, 1.7874F, 0.6383F, 0.1776F, -0.2636F));

		PartDefinition cube_r469 = leftOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(67, 59).addBox(0.0F, -1.175F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4452F, -3.4822F, 2.9784F, 0.6548F, 0.0829F, -0.1372F));

		PartDefinition cube_r470 = leftOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(43, 78).addBox(-0.7634F, -1.2081F, 0.0923F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4477F, -1.1056F, 0.9645F, 0.9599F, -0.0049F, -0.0945F));

		PartDefinition cube_r471 = leftOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(40, 47).addBox(-0.8116F, -1.2868F, -2.5108F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4477F, -1.1056F, 0.9645F, 0.7956F, 0.1165F, 0.0872F));

		PartDefinition cube_r472 = leftOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(117, 46).addBox(-0.8508F, 0.2514F, -0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.82F, -0.178F, -0.3567F, -2.9426F, 0.1751F, 0.1652F));

		PartDefinition cube_r473 = leftOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(103, 117).addBox(0.5778F, 2.3225F, 5.0364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, -1.5056F, -0.025F, 0.2261F));

		PartDefinition cube_r474 = leftOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(73, 29).addBox(-0.8954F, -3.5211F, -0.9631F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, 2.6544F, 0.214F, -0.0457F));

		PartDefinition cube_r475 = leftOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(108, 117).addBox(-0.7087F, 2.3225F, 4.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7437F, -0.6194F, -1.3719F, -1.5015F, -0.0085F, -0.0177F));

		PartDefinition cube_r476 = leftOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(98, 117).addBox(-0.5059F, -0.6977F, -1.1434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(116, 68).addBox(-0.5059F, -0.6977F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.416F, -1.2674F, -1.5418F, 2.6142F, 0.3128F, 0.171F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6659F, 8.4212F, -5.3853F, -0.0522F, -0.0046F, -0.0871F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(11, 22).mirror().addBox(-1.5963F, -0.9196F, -0.4926F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9942F, -7.8799F, 3.2406F, -2.3583F, -0.5464F, -0.4976F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(118, 103).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.9216F, -6.9568F, 2.6592F, -2.8896F, 0.0305F, 0.1132F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(85, 102).mirror().addBox(-0.1369F, -1.3892F, -1.8511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(95, 5).mirror().addBox(-0.1369F, -0.7392F, -1.8511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-2.3555F, -6.7717F, 0.9562F, -2.281F, -0.01F, 0.1168F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(113, 28).mirror().addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.1027F, -6.04F, 1.6021F, -1.7603F, -0.0862F, 0.0795F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(-0.2186F, 0.1424F, -1.8051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(96, 38).mirror().addBox(-0.2186F, 0.5174F, -1.8051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.2055F, -4.0717F, 2.1812F, -1.6377F, -0.0934F, -0.1561F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-1.3542F, -0.5948F, -0.5017F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9942F, -7.8799F, 3.2406F, -2.3054F, -0.4797F, -0.6162F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(-0.137F, -1.817F, -0.8373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1805F, -8.1717F, 1.6312F, -2.6453F, 0.0305F, 0.1132F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(72, 117).mirror().addBox(-0.5F, -0.725F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8872F, -7.655F, 1.0501F, -2.5603F, -0.01F, 0.1168F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(112, 65).mirror().addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.9681F, -6.952F, 0.8925F, -1.7313F, -0.01F, 0.1168F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(67, 117).mirror().addBox(-0.1369F, -0.7516F, -0.5526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.3555F, -6.7717F, 0.9562F, -1.6004F, -0.01F, 0.1168F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(117, 65).mirror().addBox(-0.1174F, -0.7687F, -1.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(117, 62).mirror().addBox(-0.1174F, -0.7687F, -0.8026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.4555F, -5.7717F, 0.9812F, -1.516F, -0.0862F, 0.0795F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(96, 50).mirror().addBox(-0.5558F, -0.4281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, -0.7717F, -0.6938F, -2.1096F, -0.1526F, -0.2261F));

		PartDefinition cube_r489 = rightOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(62, 117).mirror().addBox(-0.0432F, -0.9199F, 0.0553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.82F, -0.178F, -0.3567F, 1.8267F, -0.1006F, -0.2284F));

		PartDefinition cube_r490 = rightOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.788F, -1.1421F, 0.0521F, 0.489F, -0.2634F, -0.3932F));

		PartDefinition cube_r491 = rightOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.5558F, 1.1087F, -1.5641F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, -0.7717F, -0.6938F, 2.7163F, -0.1526F, -0.2261F));

		PartDefinition cube_r492 = rightOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(63, 113).mirror().addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6002F, -3.1445F, 1.3087F, -3.1306F, -0.1526F, -0.2261F));

		PartDefinition cube_r493 = rightOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(68, 113).mirror().addBox(-0.5F, -0.675F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.8588F, -3.7372F, 2.0832F, -2.7815F, -0.1526F, -0.2261F));

		PartDefinition cube_r494 = rightOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(116, 17).mirror().addBox(-0.5F, -0.125F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.6405F, -2.5726F, 2.3974F, -1.3678F, -0.1526F, -0.2261F));

		PartDefinition cube_r495 = rightOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(116, 4).mirror().addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4529F, -1.9898F, 2.0581F, -0.5126F, -0.1526F, -0.2261F));

		PartDefinition cube_r496 = rightOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(77, 110).mirror().addBox(-0.5F, -0.85F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1797F, -1.2062F, 1.4693F, 2.0356F, -0.1526F, -0.2261F));

		PartDefinition cube_r497 = rightOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(110, 74).mirror().addBox(-0.5F, -0.85F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.2603F, -1.4371F, 1.643F, 0.9447F, -0.1526F, -0.2261F));

		PartDefinition cube_r498 = rightOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(83, 115).mirror().addBox(-0.5558F, -2.8712F, 0.6167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, -0.7717F, -0.6938F, -0.626F, -0.1526F, -0.2261F));

		PartDefinition cube_r499 = rightOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(117, 59).mirror().addBox(-0.575F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1355F, -2.0018F, 0.4495F, 1.1395F, -0.1898F, -0.2209F));

		PartDefinition cube_r500 = rightOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-0.5558F, -2.6055F, 0.2989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, -0.7717F, -0.6938F, -0.277F, -0.1526F, -0.2261F));

		PartDefinition cube_r501 = rightOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(115, 80).mirror().addBox(-0.5558F, -2.2012F, -2.604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, -0.7717F, -0.6938F, -1.4551F, -0.1526F, -0.2261F));

		PartDefinition cube_r502 = rightOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(52, 117).mirror().addBox(-0.6473F, -0.8523F, -0.2406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.416F, -1.2674F, -1.5418F, 0.7359F, -0.7393F, -0.0802F));

		PartDefinition cube_r503 = rightOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-0.373F, -0.272F, -0.2652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0306F, -5.7828F, -2.2419F, 1.1323F, 0.5246F, 0.3418F));

		PartDefinition cube_r504 = rightOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.3716F, 0.2381F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(0, 74).mirror().addBox(-0.3716F, -0.1619F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0306F, -5.7828F, -2.2419F, 1.1942F, -0.0392F, 0.588F));

		PartDefinition cube_r505 = rightOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(117, 49).mirror().addBox(-0.6473F, -0.9376F, -0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.416F, -1.2674F, -1.5418F, 1.3817F, -0.7393F, -0.0802F));

		PartDefinition cube_r506 = rightOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(47, 117).mirror().addBox(-0.5387F, -0.7545F, -0.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.416F, -1.2674F, -1.5418F, 1.9428F, -0.6489F, -0.2404F));

		PartDefinition cube_r507 = rightOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(105, 86).mirror().addBox(0.4F, 4.804F, -0.4578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, -0.5133F, -0.0584F, 0.1272F));

		PartDefinition cube_r508 = rightOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(105, 45).mirror().addBox(0.4F, 5.9294F, -0.5548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, -0.3824F, -0.0584F, 0.1272F));

		PartDefinition cube_r509 = rightOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.1967F, -0.6627F, -0.2401F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4831F, -1.7835F, 0.1821F, -2.4136F, -0.3411F, -0.3319F));

		PartDefinition cube_r510 = rightOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(113, 117).mirror().addBox(0.9025F, 1.3534F, -2.5857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 0.508F, 0.0514F, 0.2207F));

		PartDefinition cube_r511 = rightOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(0.2408F, 0.5966F, -5.7403F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 0.691F, 0.7765F, -0.4484F));

		PartDefinition cube_r512 = rightOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(0.9025F, 0.1195F, -5.5403F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 0.9879F, 0.0514F, 0.2207F));

		PartDefinition cube_r513 = rightOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(0.305F, 0.9851F, -2.4311F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 0.7386F, -0.0687F, 0.0311F));

		PartDefinition cube_r514 = rightOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(21, 101).mirror().addBox(-0.6456F, -0.876F, -1.5314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1235F, -0.1003F, 1.7836F, 0.7176F, -0.1312F, -0.0764F));

		PartDefinition cube_r515 = rightOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(14, 101).mirror().addBox(-0.2917F, -0.9841F, -1.7017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4106F, -1.5833F, 3.0943F, 0.925F, 0.0049F, 0.0945F));

		PartDefinition cube_r516 = rightOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(0.3886F, 1.566F, -2.3627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 0.7125F, -0.0687F, 0.0311F));

		PartDefinition cube_r517 = rightOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(72, 104).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3924F, -3.3092F, 0.6016F, 0.7296F, -0.3194F, -0.0276F));

		PartDefinition cube_r518 = rightOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3924F, -3.3092F, 0.6016F, 0.692F, -0.4049F, 0.0784F));

		PartDefinition cube_r519 = rightOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.365F, -4.2275F, 1.7874F, 0.6383F, -0.1776F, 0.2636F));

		PartDefinition cube_r520 = rightOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-1.0F, -1.175F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4452F, -3.4822F, 2.9784F, 0.6548F, -0.0829F, 0.1372F));

		PartDefinition cube_r521 = rightOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(43, 78).mirror().addBox(-1.2366F, -1.2081F, 0.0923F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4477F, -1.1056F, 0.9645F, 0.9599F, 0.0049F, 0.0945F));

		PartDefinition cube_r522 = rightOrbit.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(40, 47).mirror().addBox(-1.1884F, -1.2868F, -2.5108F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4477F, -1.1056F, 0.9645F, 0.7956F, -0.1165F, -0.0872F));

		PartDefinition cube_r523 = rightOrbit.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(117, 46).mirror().addBox(-0.1492F, 0.2514F, -0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.82F, -0.178F, -0.3567F, -2.9426F, -0.1751F, -0.1652F));

		PartDefinition cube_r524 = rightOrbit.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(103, 117).mirror().addBox(-1.5778F, 2.3225F, 5.0364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, -1.5056F, 0.025F, -0.2261F));

		PartDefinition cube_r525 = rightOrbit.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-0.1046F, -3.5211F, -0.9631F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, 2.6544F, -0.214F, 0.0457F));

		PartDefinition cube_r526 = rightOrbit.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(108, 117).mirror().addBox(-0.2913F, 2.3225F, 4.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7437F, -0.6194F, -1.3719F, -1.5015F, 0.0085F, 0.0177F));

		PartDefinition cube_r527 = rightOrbit.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(98, 117).mirror().addBox(-0.4941F, -0.6977F, -1.1434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(116, 68).mirror().addBox(-0.4941F, -0.6977F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.416F, -1.2674F, -1.5418F, 2.6142F, -0.3128F, -0.171F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.6732F, -1.7883F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(101, 108).mirror().addBox(-0.5F, -2.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3179F, 1.1084F, -3.5664F, -0.2967F, -0.192F, 0.0175F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(34, 113).mirror().addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6181F, -0.9262F, -1.8393F, 0.0524F, -0.192F, 0.0175F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(117, 74).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.611F, -2.0072F, -1.7792F, -1.0821F, -0.192F, 0.0175F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(31, 36).mirror().addBox(-0.128F, -1.1406F, -3.5346F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 4.3009F, -1.9187F, -0.7796F, -0.1767F, 0.0333F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(61, 19).mirror().addBox(-0.103F, -3.8616F, -1.7077F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 4.3009F, -1.9187F, -0.1222F, -0.192F, 0.0175F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(18, 84).mirror().addBox(-0.103F, -3.9352F, -3.0106F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 4.3009F, -1.9187F, -0.6458F, -0.192F, 0.0175F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(66, 81).mirror().addBox(-0.975F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1875F, 0.8653F, -7.3884F, -2.1434F, -0.1491F, 0.0209F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(58, 113).mirror().addBox(-0.128F, 1.2952F, -3.359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0985F, 4.3009F, -1.9187F, -1.3177F, -0.192F, 0.0175F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(118, 106).mirror().addBox(-0.5F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.794F, 0.5562F, -1.068F, 0.0349F, -0.192F, 0.0175F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(43, 110).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6348F, 1.606F, -8.7788F, -2.2606F, -0.0657F, 0.0293F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(107, 54).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7362F, -3.4757F, -13.5251F, -2.5414F, -0.0605F, 0.0784F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-1.0F, -0.7F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0495F, -1.8383F, -10.4885F, -0.29F, -0.0605F, 0.0784F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(-0.4868F, -4.3143F, 0.6063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4917F, -1.0354F, -9.7373F, -2.1907F, -0.0657F, 0.0293F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(73, 89).mirror().addBox(-0.0396F, -2.4219F, -2.0908F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4801F, 3.4103F, -6.1365F, -2.2067F, -0.161F, 0.0953F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-0.0104F, -0.7061F, -1.9938F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4801F, 3.4103F, -6.1365F, -2.1236F, -0.186F, 0.0858F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.5F, 0.05F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7098F, 0.1324F, -6.7439F, -2.2169F, -0.0657F, 0.0293F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(53, 113).mirror().addBox(-0.5F, -1.2F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.592F, -1.055F, -8.1092F, -2.3244F, -0.0708F, -0.0168F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-0.5F, -1.625F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6947F, 0.3923F, -6.319F, -2.1586F, -0.0708F, -0.0168F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(13, 118).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6226F, -2.6368F, -1.6629F, -0.1658F, -0.192F, 0.0175F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(18, 118).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4623F, -2.1644F, -2.5296F, -1.9111F, -0.192F, 0.0175F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(118, 109).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8691F, -0.2872F, -0.6057F, 0.8639F, -0.192F, 0.0175F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(113, 36).mirror().addBox(-0.5F, -0.8F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4269F, -0.2978F, -11.0881F, -2.3915F, -0.0657F, 0.0293F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(18, 80).mirror().addBox(-1.0F, -0.825F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.8835F, -2.5696F, -12.2727F, -0.6827F, -0.0605F, 0.0784F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 80).mirror().addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 5).mirror().addBox(-1.0F, -1.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7083F, -3.8918F, -13.4471F, -1.9393F, -0.0605F, 0.0784F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(109, 17).mirror().addBox(-1.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7642F, -3.0596F, -13.6031F, 2.3455F, -0.0605F, 0.0784F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-1.0F, -0.6F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.8231F, -2.6341F, -13.1842F, 0.7136F, -0.0605F, 0.0784F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-1.0F, -0.2F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.8231F, -2.6341F, -13.1842F, 0.8881F, -0.0605F, 0.0784F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.4772F, 4.782F, -4.0861F, 2.6366F, -0.161F, 0.0953F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(23, 118).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8487F, 5.7184F, -2.3583F, 1.764F, -0.161F, 0.0953F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(118, 23).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.987F, 5.5123F, -1.3896F, 0.9786F, -0.161F, 0.0953F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(118, 26).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9972F, 4.6779F, -0.8387F, -0.505F, -0.161F, 0.0953F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(92, 102).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9912F, 3.7993F, -0.3612F, -1.7267F, -0.161F, 0.0953F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(118, 34).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.922F, 2.8135F, -0.2079F, -3.0793F, -0.161F, 0.0953F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(48, 113).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5867F, -1.8077F, -8.3624F, -2.115F, -0.0708F, -0.0168F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(118, 37).mirror().addBox(-0.5F, -0.375F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4389F, -1.7191F, -10.032F, -2.8278F, -0.0657F, 0.0293F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(73, 113).mirror().addBox(-0.375F, -1.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3073F, -4.0589F, -12.8361F, -3.0725F, -0.0684F, -0.0517F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(38, 118).mirror().addBox(-0.325F, -0.575F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1419F, -4.2188F, -13.538F, -2.6361F, -0.0684F, -0.0517F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(35, 108).addBox(-0.5F, -1.625F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4947F, 0.3923F, -6.319F, -2.1586F, 0.0708F, 0.0168F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(38, 118).addBox(-0.675F, -0.575F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0581F, -4.2188F, -13.538F, -2.6361F, 0.0684F, 0.0517F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(73, 113).addBox(-0.625F, -1.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1073F, -4.0589F, -12.8361F, -3.0725F, 0.0684F, 0.0517F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(48, 113).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3867F, -1.8077F, -8.3624F, -2.115F, 0.0708F, 0.0168F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(53, 113).addBox(-0.5F, -1.2F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.392F, -1.055F, -8.1092F, -2.3244F, 0.0708F, 0.0168F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(118, 37).addBox(-0.5F, -0.375F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2389F, -1.7191F, -10.032F, -2.8278F, 0.0657F, -0.0293F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(74, 71).addBox(-0.5F, 0.05F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5098F, 0.1324F, -6.7439F, -2.2169F, 0.0657F, -0.0293F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(94, 91).addBox(-0.9896F, -0.7061F, -1.9938F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2801F, 3.4103F, -6.1365F, -2.1236F, 0.186F, -0.0858F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(118, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.722F, 2.8135F, -0.2079F, -3.0793F, 0.161F, -0.0953F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(92, 102).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7912F, 3.7993F, -0.3612F, -1.7267F, 0.161F, -0.0953F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(118, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7972F, 4.6779F, -0.8387F, -0.505F, 0.161F, -0.0953F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(118, 23).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.787F, 5.5123F, -1.3896F, 0.9786F, 0.161F, -0.0953F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(23, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6487F, 5.7184F, -2.3583F, 1.764F, 0.161F, -0.0953F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(89, 75).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.2772F, 4.782F, -4.0861F, 2.6366F, 0.161F, -0.0953F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(73, 89).addBox(-0.9604F, -2.4219F, -2.0908F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2801F, 3.4103F, -6.1365F, -2.2067F, 0.161F, -0.0953F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(98, 113).addBox(-0.5132F, -4.3143F, 0.6063F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2917F, -1.0354F, -9.7373F, -2.1907F, 0.0657F, -0.0293F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(18, 80).addBox(-1.0F, -0.825F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.3165F, -2.5696F, -12.2727F, -0.6827F, 0.0605F, -0.0784F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(80, 10).addBox(-1.0F, -0.7F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1505F, -1.8383F, -10.4885F, -0.29F, 0.0605F, -0.0784F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(109, 5).addBox(-1.0F, -1.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(108, 80).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4917F, -3.8918F, -13.4471F, -1.9393F, 0.0605F, -0.0784F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(88, 70).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3769F, -2.6341F, -13.1842F, 0.8881F, 0.0605F, -0.0784F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(88, 24).addBox(-1.0F, -0.6F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3769F, -2.6341F, -13.1842F, 0.7136F, 0.0605F, -0.0784F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(109, 17).addBox(-1.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4358F, -3.0596F, -13.6031F, 2.3455F, 0.0605F, -0.0784F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(107, 54).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4638F, -3.4757F, -13.5251F, -2.5414F, 0.0605F, -0.0784F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(113, 36).addBox(-0.5F, -0.8F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(112, 46).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2269F, -0.2978F, -11.0881F, -2.3915F, 0.0657F, -0.0293F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(43, 110).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4348F, 1.606F, -8.7788F, -2.2606F, 0.0657F, -0.0293F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(118, 109).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6691F, -0.2872F, -0.6057F, 0.8639F, 0.192F, -0.0175F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(118, 106).addBox(-0.5F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.594F, 0.5562F, -1.068F, 0.0349F, 0.192F, -0.0175F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(58, 113).addBox(-0.872F, 1.2952F, -3.359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8985F, 4.3009F, -1.9187F, -1.3177F, 0.192F, -0.0175F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(66, 81).addBox(-0.025F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0125F, 0.8653F, -7.3884F, -2.1434F, 0.1491F, -0.0209F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(18, 84).addBox(-0.897F, -3.9352F, -3.0106F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8985F, 4.3009F, -1.9187F, -0.6458F, 0.192F, -0.0175F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(61, 19).addBox(-0.897F, -3.8616F, -1.7077F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8985F, 4.3009F, -1.9187F, -0.1222F, 0.192F, -0.0175F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(31, 36).addBox(-0.872F, -1.1406F, -3.5346F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8985F, 4.3009F, -1.9187F, -0.7796F, 0.1767F, -0.0333F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(13, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4226F, -2.6368F, -1.6629F, -0.1658F, 0.192F, -0.0175F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(18, 118).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2623F, -2.1644F, -2.5296F, -1.9111F, 0.192F, -0.0175F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(117, 74).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.411F, -2.0072F, -1.7792F, -1.0821F, 0.192F, -0.0175F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(34, 113).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4181F, -0.9262F, -1.8393F, 0.0524F, 0.192F, -0.0175F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(101, 108).addBox(-0.5F, -2.8F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1179F, 1.1084F, -3.5664F, -0.2967F, 0.192F, -0.0175F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 75).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r602 = tail.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(9, 85).addBox(-0.003F, -1.9F, -0.1F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(101, 29).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r603 = tail2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(103, 113).addBox(0.0F, -1.05F, -0.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(78, 51).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(25, 75).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, -0.0943F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2316F, 2.8957F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 7).addBox(-0.5F, -0.0193F, -0.024F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 3.0F, -0.2443F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 124, 124);
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