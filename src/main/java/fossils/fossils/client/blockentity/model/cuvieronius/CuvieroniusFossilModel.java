package fossils.fossils.client.blockentity.model.cuvieronius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CuvieroniusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart bone4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone5;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart bone3;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public CuvieroniusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone7 = this.hips.getChild("bone7");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.bone4 = this.leftarm2.getChild("bone4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone5 = this.rightarm2.getChild("bone5");
		this.bone2 = this.chest.getChild("bone2");
		this.bone6 = this.chest.getChild("bone6");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.bone3 = this.head.getChild("bone3");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -41.0247F, 16.607F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(146, 137).addBox(0.0F, -0.9125F, 0.0115F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 167).addBox(0.0F, -1.1885F, -0.0985F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -0.7F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 110).addBox(0.0F, -1.4063F, -0.0995F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-0.1197F, 0.4134F, -1.8197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5018F, -1.0117F, -1.2324F, -2.6552F, -0.5979F, 1.6015F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 23).addBox(-0.8803F, 0.4134F, -1.8197F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5018F, -1.0117F, -1.2324F, -2.6552F, 0.5979F, -1.6015F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 110).addBox(-2.5F, -0.945F, -2.6521F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.6249F, 5.8016F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9652F, 6.3254F, 4.3492F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(108, 19).addBox(1.429F, -0.4914F, 0.1619F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8654F, -6.4492F, -2.4927F, -1.4659F, 0.3619F, -0.0376F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 105).addBox(-3.0F, -0.5F, -1.775F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.2711F, -2.3544F, -2.3912F, -0.9694F, 0.2488F, 0.4196F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(108, 11).addBox(-2.1F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1094F, -7.4672F, -0.6609F, -0.7771F, 0.1541F, 0.908F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(79, 38).addBox(-4.0F, -0.275F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5787F, -5.0905F, -0.5252F, -0.9087F, -0.0161F, 1.1703F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(106, 99).addBox(-2.0F, -0.275F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5787F, -5.0905F, -0.5252F, -0.7744F, -0.0952F, 1.1083F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 94).addBox(-0.946F, -0.3307F, -1.4871F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5904F, -6.8992F, -2.7927F, -1.7018F, 0.3126F, -0.8224F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 151).addBox(0.9581F, -0.0988F, -3.3203F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5904F, -6.8992F, -2.7927F, -2.0244F, 0.1094F, -1.717F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(55, 134).addBox(0.3672F, -0.3199F, -2.5163F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5904F, -6.8992F, -2.7927F, -1.8597F, 0.2057F, -1.4245F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 114).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9804F, 7.2754F, 3.2667F, 0.3114F, 0.4318F, 2.1499F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(117, 129).addBox(2.6625F, -1.9898F, 1.6393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.4096F, 4.5789F, 3.8779F, 0.2918F, 0.4448F, 2.1039F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(125, 165).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.4216F, 7.5023F, 2.356F, 0.3891F, -0.6856F, 1.7882F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(165, 95).addBox(-1.25F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0515F, 2.8364F, 0.9165F, 0.4075F, 0.8562F, 2.465F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(111, 25).addBox(-1.4F, -0.5F, -2.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1134F, 4.9683F, 1.6293F, 0.5496F, 1.0505F, 2.6384F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 117).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3763F, 6.7183F, 4.4621F, 0.4418F, 0.8852F, 2.3656F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(38, 74).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8388F, 7.5862F, 4.0251F, 1.3287F, 1.2882F, -2.9494F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(126, 70).addBox(0.3782F, -0.4635F, -0.646F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9561F, 0.6992F, 2.3347F, -0.6167F, 0.6151F, -1.4401F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 139).addBox(-0.019F, -0.4334F, -0.646F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9561F, 0.6992F, 2.3347F, -0.7214F, 0.4793F, -1.6405F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(133, 63).addBox(0.0F, -0.8F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1741F, 6.0123F, 2.3471F, -0.3618F, 0.2855F, -1.0371F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(132, 94).addBox(-3.1F, -1.4F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4067F, 3.4338F, 1.4401F, -0.4037F, 0.2202F, -1.2043F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 165).addBox(-0.5898F, -4.079F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2457F, 3.0408F, -1.0889F, -0.4448F, 0.4407F, 0.6379F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 155).addBox(-0.5F, 0.5596F, -0.7037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8071F, 4.6601F, 0.6481F, -0.1592F, 0.5276F, 0.7651F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 151).addBox(-0.5F, -2.4652F, -1.6253F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8071F, 4.6601F, 0.6481F, 0.6699F, 0.5276F, 0.7651F));

		PartDefinition bone7 = hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9652F, 6.3254F, 4.3492F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone7.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(108, 19).mirror().addBox(-5.429F, -0.4914F, 0.1619F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8654F, -6.4492F, -2.4927F, -1.4659F, -0.3619F, 0.0376F));

		PartDefinition cube_r31 = bone7.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 105).mirror().addBox(-3.0F, -0.5F, -1.775F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2711F, -2.3544F, -2.3912F, -0.9694F, -0.2488F, -0.4196F));

		PartDefinition cube_r32 = bone7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(108, 11).mirror().addBox(-1.9F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.1094F, -7.4672F, -0.6609F, -0.7771F, -0.1541F, -0.908F));

		PartDefinition cube_r33 = bone7.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-2.0F, -0.275F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5787F, -5.0905F, -0.5252F, -0.9087F, 0.0161F, -1.1703F));

		PartDefinition cube_r34 = bone7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(106, 99).mirror().addBox(-2.0F, -0.275F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5787F, -5.0905F, -0.5252F, -0.7744F, 0.0952F, -1.1083F));

		PartDefinition cube_r35 = bone7.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-3.054F, -0.3307F, -1.4871F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5904F, -6.8992F, -2.7927F, -1.7018F, -0.3126F, 0.8224F));

		PartDefinition cube_r36 = bone7.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 151).mirror().addBox(-3.9581F, -0.0988F, -3.3203F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5904F, -6.8992F, -2.7927F, -2.0244F, -0.1094F, 1.717F));

		PartDefinition cube_r37 = bone7.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 134).mirror().addBox(-3.3672F, -0.3199F, -2.5163F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5904F, -6.8992F, -2.7927F, -1.8597F, -0.2057F, 1.4245F));

		PartDefinition cube_r38 = bone7.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 114).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.9804F, 7.2754F, 3.2667F, 0.3114F, -0.4318F, -2.1499F));

		PartDefinition cube_r39 = bone7.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(117, 129).mirror().addBox(-3.6625F, -1.9898F, 1.6393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.4096F, 4.5789F, 3.8779F, 0.2918F, -0.4448F, -2.1039F));

		PartDefinition cube_r40 = bone7.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(125, 165).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.4216F, 7.5023F, 2.356F, 0.3891F, 0.6856F, -1.7882F));

		PartDefinition cube_r41 = bone7.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(165, 95).mirror().addBox(-0.75F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0515F, 2.8364F, 0.9165F, 0.4075F, -0.8562F, -2.465F));

		PartDefinition cube_r42 = bone7.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(111, 25).mirror().addBox(-0.6F, -0.5F, -2.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1134F, 4.9683F, 1.6293F, 0.5496F, -1.0505F, -2.6384F));

		PartDefinition cube_r43 = bone7.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(20, 117).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3763F, 6.7183F, 4.4621F, 0.4418F, -0.8852F, -2.3656F));

		PartDefinition cube_r44 = bone7.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 74).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8388F, 7.5862F, 4.0251F, 1.3287F, -1.2882F, 2.9494F));

		PartDefinition cube_r45 = bone7.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(126, 70).mirror().addBox(-6.3782F, -0.4635F, -0.646F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9561F, 0.6992F, 2.3347F, -0.6167F, -0.6151F, 1.4401F));

		PartDefinition cube_r46 = bone7.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(55, 139).mirror().addBox(-4.981F, -0.4334F, -0.646F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9561F, 0.6992F, 2.3347F, -0.7214F, -0.4793F, 1.6405F));

		PartDefinition cube_r47 = bone7.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(133, 63).mirror().addBox(-6.0F, -0.8F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1741F, 6.0123F, 2.3471F, -0.3618F, -0.2855F, 1.0371F));

		PartDefinition cube_r48 = bone7.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(132, 94).mirror().addBox(-2.9F, -1.4F, 0.4F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4067F, 3.4338F, 1.4401F, -0.4037F, -0.2202F, 1.2043F));

		PartDefinition cube_r49 = bone7.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 165).mirror().addBox(-0.4102F, -4.079F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2457F, 3.0408F, -1.0889F, -0.4448F, -0.4407F, -0.6379F));

		PartDefinition cube_r50 = bone7.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 155).mirror().addBox(-0.5F, 0.5596F, -0.7037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8071F, 4.6601F, 0.6481F, -0.1592F, -0.5276F, -0.7651F));

		PartDefinition cube_r51 = bone7.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 151).mirror().addBox(-0.5F, -2.4652F, -1.6253F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8071F, 4.6601F, 0.6481F, 0.6699F, -0.5276F, -0.7651F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 13.2968F, 7.5641F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 157).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 154).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 154).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(166, 16).addBox(0.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7885F, 3.5156F, 0.9257F, -0.2457F, 0.134F, 0.4896F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(156, 0).addBox(-1.7885F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7885F, 3.5156F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(110, 122).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(97, 128).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 103).addBox(-1.0F, -3.4F, -0.9F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 140).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.2326F, -1.8341F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(157, 143).addBox(-1.5F, 2.3225F, 1.8198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(146, 132).addBox(-1.5F, 0.9938F, 1.6101F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 146).addBox(-1.5F, -0.2123F, 0.8913F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 78).addBox(-1.5F, 1.1302F, -0.0211F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 147).addBox(-1.0F, -0.9167F, 0.9268F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(145, 118).addBox(-1.0F, -1.5628F, -0.5908F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6862F, 0.6417F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(145, 43).addBox(-1.5F, -1.4F, -2.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7821F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(126, 112).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 143).addBox(0.0F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.9F, 9.0494F, 0.831F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(11, 104).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 9.2861F, 1.1686F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(59, 115).addBox(-1.0F, -3.0F, 0.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.4391F, 0.4406F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(39, 110).addBox(-1.9F, -11.735F, 0.1314F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(97, 121).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.5318F, -0.3589F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(119, 158).addBox(-0.4F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.5847F, -0.2182F, 0.0F));

		PartDefinition cube_r74 = leftLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 165).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(165, 53).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(48, 165).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.5036F, -1.6985F, 2.5963F, 0.3018F, -0.2129F, -0.0479F));

		PartDefinition cube_r75 = leftLeg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(155, 149).addBox(-0.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.6414F, 1.7936F, 0.0349F, -0.2182F, 0.0F));

		PartDefinition cube_r76 = leftLeg3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(163, 67).addBox(-0.4F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.2F, 0.8414F, 1.1936F, -0.8378F, -0.2182F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(115, 141).addBox(-1.0F, -1.0696F, -1.9933F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8771F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(147, 97).addBox(-1.7556F, 0.1612F, -0.9345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1745F, 0.2618F, -0.5672F));

		PartDefinition cube_r78 = leftLeg4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(147, 92).addBox(-0.5017F, 0.3224F, -0.934F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1309F, -0.1309F, 0.5672F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.4006F, -2.1417F, -0.4815F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(27, 149).addBox(-2.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.2782F, -1.685F, -0.4461F, 0.4802F, -0.2174F));

		PartDefinition cube_r80 = leftLeg5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 57).addBox(-2.5023F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3957F, -0.1209F, 0.0503F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 13.2968F, 7.5641F, -0.7026F, 0.0849F, 0.0998F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(157, 21).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 154).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7367F, -3.415F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(154, 80).addBox(-1.0F, -1.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3259F, -3.3164F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(166, 46).addBox(-1.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7885F, 3.5156F, 0.9257F, -0.2457F, -0.134F, -0.4896F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(156, 37).addBox(-1.2115F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7885F, 3.5156F, 0.9257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(33, 123).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 129).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, -3.4F, -0.9F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.7551F, -0.4575F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(40, 141).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.2326F, -1.8341F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 158).addBox(-1.5F, 2.3225F, 1.8198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(146, 144).addBox(-1.5F, 0.9938F, 1.6101F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 146).addBox(-1.5F, -0.2123F, 0.8913F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(116, 74).addBox(-1.5F, 1.1302F, -0.0211F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 147).addBox(-1.0F, -0.9167F, 0.9268F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(126, 145).addBox(-1.0F, -1.5628F, -0.5908F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1902F, -1.0572F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6862F, 0.6417F, 0.9057F, 0.0687F, -0.0538F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(146, 5).addBox(-1.5F, -1.4F, -2.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7821F, 3.5147F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(128, 57).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(165, 41).addBox(-1.0F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.9F, 9.0494F, 0.831F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(107, 151).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, 9.2861F, 1.1686F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(77, 133).addBox(-1.0F, -3.0F, 0.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.4391F, 0.4406F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 113).addBox(-0.1F, -11.735F, 0.1314F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(121, 105).addBox(-1.5F, -0.4444F, -1.1179F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.5318F, -0.3589F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(159, 47).addBox(-1.6F, -3.5205F, -1.1768F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.5847F, 0.2182F, 0.0F));

		PartDefinition cube_r103 = rightLeg3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(165, 92).addBox(-1.0F, 0.1F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(69, 165).addBox(-1.0F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(62, 165).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.5036F, -1.6985F, 2.5963F, 0.3018F, 0.2129F, 0.0479F));

		PartDefinition cube_r104 = rightLeg3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(151, 155).addBox(-1.5F, -0.6398F, -1.3734F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.6414F, 1.7936F, 0.0349F, 0.2182F, 0.0F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(163, 80).addBox(-1.6F, -2.7398F, -0.7734F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.2F, 0.8414F, 1.1936F, -0.8378F, 0.2182F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(27, 143).addBox(-1.0F, -1.0696F, -1.9933F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8771F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(148, 16).addBox(-0.2444F, 0.1612F, -0.9345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1745F, -0.2618F, 0.5672F));

		PartDefinition cube_r107 = rightLeg4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(113, 147).addBox(-1.4983F, 0.3224F, -0.934F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1309F, 0.1309F, -0.5672F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.4006F, -2.1417F, -0.4815F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(150, 48).addBox(1.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.2782F, -1.685F, -0.4461F, -0.4802F, 0.2174F));

		PartDefinition cube_r109 = rightLeg5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(100, 33).addBox(-2.4977F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3957F, 0.1209F, -0.0503F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 167).addBox(0.0F, -2.0798F, -0.0429F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7265F, -0.6463F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(3, 167).addBox(0.0F, -1.9545F, -0.0038F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4512F, -2.5261F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 166).addBox(0.0F, -2.6398F, -0.0023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6512F, -4.5261F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(66, 107).addBox(0.0F, -3.0115F, -0.0418F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1512F, -6.4261F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(96, 44).addBox(0.0F, -3.1402F, 0.0197F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6516F, -8.5174F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(165, 28).mirror().addBox(-2.8965F, 0.0881F, -0.4365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6133F, -8.2947F, -0.2832F, 0.3375F, -0.7508F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(165, 32).mirror().addBox(-5.8206F, -0.6646F, -0.4365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6133F, -8.2947F, -0.3594F, 0.2543F, -1.0105F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(33, 30).mirror().addBox(-11.931F, -3.1346F, -0.5367F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.6133F, -8.2947F, -0.4265F, 0.0982F, -1.4392F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-5.1436F, -2.1475F, -0.2137F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1133F, -0.5947F, -0.4158F, 0.0984F, -1.5252F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(157, 147).mirror().addBox(-4.6533F, -0.3578F, -0.2137F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1133F, -0.5947F, -0.3493F, 0.2501F, -1.1474F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 26).mirror().addBox(-1.6896F, 0.0823F, -0.2137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1133F, -0.5947F, -0.2744F, 0.3309F, -0.8873F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(141, 72).mirror().addBox(-10.029F, -3.1888F, -0.3912F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3133F, -6.4947F, -0.4242F, 0.1155F, -1.4913F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(165, 14).mirror().addBox(-5.93F, -0.6727F, -0.2892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3133F, -6.4947F, -0.3498F, 0.2691F, -1.0603F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(165, 0).mirror().addBox(-3.0043F, 0.1085F, -0.2892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3133F, -6.4947F, -0.2696F, 0.3494F, -0.7986F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-7.9275F, -3.2773F, -0.2342F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8133F, -4.6947F, -0.4242F, 0.1155F, -1.4826F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(154, 108).mirror().addBox(-5.8743F, -0.7987F, -0.1348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8133F, -4.6947F, -0.3498F, 0.2691F, -1.0516F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(165, 30).mirror().addBox(-2.9831F, -0.0275F, -0.1348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8133F, -4.6947F, -0.2696F, 0.3494F, -0.7899F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(165, 2).mirror().addBox(-2.9572F, -0.0366F, -0.1644F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4133F, -2.6947F, -0.2696F, 0.3494F, -0.8771F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(165, 26).mirror().addBox(-5.847F, -0.8007F, -0.1644F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4133F, -2.6947F, -0.3498F, 0.2691F, -1.1389F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 10).mirror().addBox(-6.9014F, -3.2675F, -0.2633F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4133F, -2.6947F, -0.4242F, 0.1155F, -1.5699F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 10).addBox(4.9014F, -3.2675F, -0.2633F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4133F, -2.6947F, -0.4242F, -0.1155F, 1.5699F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(165, 26).addBox(2.847F, -0.8007F, -0.1644F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4133F, -2.6947F, -0.3498F, -0.2691F, 1.1389F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(165, 2).addBox(-0.0428F, -0.0366F, -0.1644F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4133F, -2.6947F, -0.2696F, -0.3494F, 0.8771F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(165, 30).addBox(-0.0169F, -0.0275F, -0.1348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8133F, -4.6947F, -0.2696F, -0.3494F, 0.7899F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(154, 108).addBox(2.8743F, -0.7987F, -0.1348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8133F, -4.6947F, -0.3498F, -0.2691F, 1.0516F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 113).addBox(4.9275F, -3.2773F, -0.2342F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8133F, -4.6947F, -0.4242F, -0.1155F, 1.4826F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(165, 0).addBox(0.0043F, 0.1085F, -0.2892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3133F, -6.4947F, -0.2696F, -0.3494F, 0.7986F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(165, 14).addBox(2.93F, -0.6727F, -0.2892F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3133F, -6.4947F, -0.3498F, -0.2691F, 1.0603F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(141, 72).addBox(5.029F, -3.1888F, -0.3912F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3133F, -6.4947F, -0.4242F, -0.1155F, 1.4913F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(33, 30).addBox(4.931F, -3.1346F, -0.5367F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6133F, -8.2947F, -0.4265F, -0.0982F, 1.4392F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(165, 32).addBox(2.8206F, -0.6646F, -0.4365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6133F, -8.2947F, -0.3594F, -0.2543F, 1.0105F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(165, 28).addBox(-0.1035F, 0.0881F, -0.4365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6133F, -8.2947F, -0.2832F, -0.3375F, 0.7508F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 70).addBox(4.1436F, -2.1475F, -0.2137F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1133F, -0.5947F, -0.4158F, -0.0984F, 1.5252F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(157, 147).addBox(1.6533F, -0.3578F, -0.2137F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1133F, -0.5947F, -0.3493F, -0.2501F, 1.1474F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(85, 26).addBox(-0.3104F, 0.0823F, -0.2137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1133F, -0.5947F, -0.2744F, -0.3309F, 0.8873F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(27, 32).addBox(-1.0F, -0.1512F, 3.7474F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5202F, -13.0872F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0177F, -9.3559F, -0.3097F, -0.1674F, 0.0493F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -14.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2249F, -0.9744F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 135).addBox(0.0F, -4.0539F, -0.113F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.035F, -1.4981F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(119, 87).addBox(0.0F, -3.6496F, -0.11F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.565F, -2.8981F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(46, 59).addBox(0.0F, -5.1521F, 0.0413F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.535F, -14.8981F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(40, 165).addBox(-0.005F, -3.6881F, -0.1709F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.19F, -4.8231F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(37, 165).addBox(-0.005F, -3.6577F, -0.1217F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.19F, -6.8231F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(165, 34).addBox(0.0F, -3.9821F, -0.146F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0319F, -8.8152F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 136).addBox(0.0F, -4.432F, -0.146F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.51F, -10.9231F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(18, 167).addBox(0.0F, -1.5072F, -0.0066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.885F, -13.0481F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(163, 72).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.1745F, 0.4098F, -0.519F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(151, 74).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.2771F, 0.3508F, -0.7938F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(123, 103).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.3895F, 0.2176F, -1.1889F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(133, 66).mirror().addBox(-17.8305F, -8.3882F, -0.4098F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -10.6388F, -0.4373F, 0.0761F, -1.5118F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(163, 90).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.1595F, 0.4208F, -0.5652F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(151, 76).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.2662F, 0.3651F, -0.8423F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(126, 118).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.3855F, 0.2348F, -1.2403F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-16.8305F, -8.3882F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2044F, -8.6388F, -0.439F, 0.0937F, -1.5643F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(154, 54).mirror().addBox(-15.8305F, -8.3882F, -0.4098F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.4418F, 0.0936F, -1.6168F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(126, 120).mirror().addBox(-13.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.3882F, 0.2356F, -1.2933F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(151, 78).mirror().addBox(-7.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.2684F, 0.3668F, -0.8954F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(163, 120).mirror().addBox(-3.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9044F, -6.6388F, -0.1611F, 0.423F, -0.6182F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(163, 122).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.191F, 0.4011F, -0.5255F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(152, 27).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.2901F, 0.3383F, -0.7982F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.3962F, 0.2014F, -1.1903F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(133, 68).mirror().addBox(-17.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4044F, -12.5388F, -0.4383F, 0.0587F, -1.5119F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(163, 124).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.2235F, 0.3834F, -0.5379F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(152, 29).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.3157F, 0.3132F, -0.8064F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(128, 2).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.4093F, 0.169F, -1.1927F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(139, 55).mirror().addBox(-17.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6044F, -14.5388F, -0.4404F, 0.0239F, -1.512F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(164, 65).mirror().addBox(-14.7856F, -8.3818F, -0.4187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7044F, -4.6388F, -0.4434F, 0.1285F, -1.6607F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(128, 47).mirror().addBox(-13.9416F, -3.8454F, -0.4187F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7044F, -4.6388F, -0.3782F, 0.2692F, -1.3344F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(141, 70).mirror().addBox(-7.8865F, -0.8369F, -0.4187F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7044F, -4.6388F, -0.2448F, 0.394F, -0.9303F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(164, 78).mirror().addBox(-3.0048F, -0.0613F, -0.4187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7044F, -4.6388F, -0.1297F, 0.4431F, -0.6486F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(166, 50).mirror().addBox(-13.8394F, -8.3747F, -0.4396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4044F, -2.6388F, -0.4434F, 0.1285F, -1.6868F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(129, 8).mirror().addBox(-13.9897F, -3.8204F, -0.4396F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4044F, -2.6388F, -0.3782F, 0.2692F, -1.3606F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(86, 74).mirror().addBox(-7.921F, -0.795F, -0.4396F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4044F, -2.6388F, -0.2448F, 0.394F, -0.9564F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(164, 149).mirror().addBox(-3.0273F, -0.0119F, -0.4396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4044F, -2.6388F, -0.1297F, 0.4431F, -0.6748F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(129, 17).mirror().addBox(-13.9718F, -3.866F, -0.3575F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2044F, -0.7388F, -0.3732F, 0.2859F, -1.3941F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-7.9224F, -0.844F, -0.3575F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2044F, -0.7388F, -0.2328F, 0.4075F, -0.9867F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(164, 151).mirror().addBox(-3.0413F, -0.0589F, -0.3575F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2044F, -0.7388F, -0.1137F, 0.4529F, -0.7028F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(139, 55).addBox(11.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.4404F, -0.0239F, 1.512F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(128, 2).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.4093F, -0.169F, 1.1927F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(152, 29).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.3157F, -0.3132F, 0.8064F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(163, 124).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6044F, -14.5388F, -0.2235F, -0.3834F, 0.5379F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(133, 68).addBox(11.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.4383F, -0.0587F, 1.5119F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(128, 0).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.3962F, -0.2014F, 1.1903F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(152, 27).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.2901F, -0.3383F, 0.7982F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(163, 122).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -12.5388F, -0.191F, -0.4011F, 0.5255F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(164, 151).addBox(0.0413F, -0.0589F, -0.3575F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2044F, -0.7388F, -0.1137F, -0.4529F, 0.7028F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 64).addBox(2.9224F, -0.844F, -0.3575F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2044F, -0.7388F, -0.2328F, -0.4075F, 0.9867F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(129, 17).addBox(6.9718F, -3.866F, -0.3575F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2044F, -0.7388F, -0.3732F, -0.2859F, 1.3941F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(164, 149).addBox(0.0273F, -0.0119F, -0.4396F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4044F, -2.6388F, -0.1297F, -0.4431F, 0.6748F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(86, 74).addBox(2.9211F, -0.795F, -0.4396F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4044F, -2.6388F, -0.2448F, -0.394F, 0.9564F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(129, 8).addBox(6.9897F, -3.8204F, -0.4396F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4044F, -2.6388F, -0.3782F, -0.2692F, 1.3606F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(166, 50).addBox(11.8394F, -8.3747F, -0.4396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4044F, -2.6388F, -0.4434F, -0.1285F, 1.6868F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(164, 78).addBox(0.0048F, -0.0613F, -0.4187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7044F, -4.6388F, -0.1297F, -0.4431F, 0.6486F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(141, 70).addBox(2.8865F, -0.8369F, -0.4187F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7044F, -4.6388F, -0.2448F, -0.394F, 0.9303F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(128, 47).addBox(6.9416F, -3.8454F, -0.4187F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7044F, -4.6388F, -0.3782F, -0.2692F, 1.3344F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(164, 65).addBox(11.7856F, -8.3818F, -0.4187F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7044F, -4.6388F, -0.4434F, -0.1285F, 1.6607F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(163, 120).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.1611F, -0.423F, 0.6182F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(151, 78).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.2684F, -0.3668F, 0.8954F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(126, 120).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.3882F, -0.2356F, 1.2933F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(154, 54).addBox(11.8305F, -8.3882F, -0.4098F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9044F, -6.6388F, -0.4418F, -0.0936F, 1.6168F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(145, 110).addBox(11.8305F, -8.3882F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.439F, -0.0937F, 1.5643F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(126, 118).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.3855F, -0.2348F, 1.2403F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(151, 76).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.2662F, -0.3651F, 0.8423F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(163, 90).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2044F, -8.6388F, -0.1595F, -0.4208F, 0.5652F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(133, 66).addBox(11.8305F, -8.3882F, -0.4098F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.4373F, -0.0761F, 1.5118F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(123, 103).addBox(6.9859F, -3.8361F, -0.4098F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.3895F, -0.2176F, 1.1889F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(151, 74).addBox(2.9237F, -0.811F, -0.4098F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.2771F, -0.3508F, 0.7938F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(163, 72).addBox(0.034F, -0.0266F, -0.4098F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4044F, -10.6388F, -0.1745F, -0.4098F, 0.519F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(12, 166).addBox(-0.005F, -3.7704F, -0.0884F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2941F, -12.3702F, -0.2531F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2203F, -14.9253F, -0.2096F, -0.0427F, 0.0091F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(104, 157).addBox(0.0F, -6.8331F, -0.2365F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7101F, -9.3238F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(166, 141).addBox(-0.005F, -8.4359F, -0.5473F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3101F, -7.6988F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(112, 164).addBox(0.0F, -5.5659F, 0.0056F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3101F, -7.6988F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(23, 162).addBox(-0.005F, -8.1981F, -0.3698F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5601F, -5.6238F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(166, 136).addBox(0.0F, -2.3422F, -0.1411F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5601F, -5.6238F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(34, 84).addBox(-0.005F, -7.9496F, -0.4709F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4351F, -3.7238F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(92, 167).addBox(0.0F, -2.1057F, -0.2676F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4351F, -3.7238F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(76, 165).addBox(-0.005F, -7.0947F, -0.5056F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8351F, -2.1738F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(103, 166).addBox(0.0F, -3.2129F, -0.1129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8351F, -2.1738F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(108, 17).mirror().addBox(-8.2604F, 0.1085F, -0.8004F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 18.3735F, -2.8809F, 0.0616F, 0.2201F, 0.2028F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(163, 126).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.1579F, 0.4184F, -0.5123F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(152, 31).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.2641F, 0.3632F, -0.7893F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(128, 4).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.3828F, 0.2338F, -1.1874F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(139, 112).mirror().addBox(-17.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0841F, -1.2135F, -0.4363F, 0.0936F, -1.5118F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(163, 128).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.2073F, 0.3923F, -0.5318F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(152, 33).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.303F, 0.3258F, -0.8024F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(128, 6).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.4028F, 0.1852F, -1.1916F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(85, 151).mirror().addBox(-16.835F, -8.3453F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6841F, -3.0135F, -0.4394F, 0.0413F, -1.512F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(163, 130).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.241F, 0.3765F, -0.5792F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(152, 35).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.3302F, 0.3022F, -0.8456F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(128, 39).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.4181F, 0.1536F, -1.229F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(133, 163).mirror().addBox(-14.835F, -8.3453F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3841F, -5.0135F, -0.4439F, 0.0066F, -1.5468F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(77, 144).mirror().addBox(-13.835F, -8.3453F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.448F, -0.0283F, -1.599F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(128, 41).mirror().addBox(-13.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.4331F, 0.1218F, -1.2832F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(152, 57).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.357F, 0.2782F, -0.9055F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(164, 61).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9841F, -6.8135F, -0.2743F, 0.3599F, -0.6434F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(152, 59).mirror().addBox(-7.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.36F, 0.2803F, -0.976F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(139, 114).mirror().addBox(-12.9756F, -3.7942F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.4367F, 0.1227F, -1.3534F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(164, 63).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.6841F, -8.8135F, -0.2767F, 0.3628F, -0.714F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-8.4551F, -0.0333F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 18.3735F, -0.3809F, 0.0231F, 0.1948F, 0.0603F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(108, 9).mirror().addBox(-8.9551F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 18.3735F, 1.6191F, 0.044F, 0.2679F, 0.0488F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-9.3058F, -0.0027F, -0.4198F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 18.6735F, 3.6191F, 0.0802F, 0.3028F, 0.1966F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-9.9823F, -0.1031F, -0.3607F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 18.6735F, 4.6191F, 0.1006F, 0.4377F, 0.2657F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-11.3551F, -0.1333F, -0.5309F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 18.8735F, 5.0191F, 0.4284F, 0.6018F, 0.3222F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-12.0551F, -0.0333F, -0.5309F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 18.8735F, 5.4191F, 0.7023F, 0.7291F, 0.4944F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(33, 28).mirror().addBox(-6.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0789F, 17.3879F, -5.0091F, -0.3191F, 0.2265F, 0.0597F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(139, 116).mirror().addBox(-5.9F, -0.4F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6889F, 16.7826F, -7.0393F, -0.2854F, 0.2681F, 0.1972F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(60, 21).addBox(-0.9449F, -0.0333F, -0.5309F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 18.8735F, 5.4191F, 0.7023F, -0.7291F, -0.4944F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 12).addBox(-0.6449F, -0.1333F, -0.5309F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 18.8735F, 5.0191F, 0.4284F, -0.6018F, -0.3222F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 16).addBox(-1.0177F, -0.1031F, -0.3607F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 18.6735F, 4.6191F, 0.1006F, -0.4377F, -0.2657F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(62, 14).addBox(-0.6942F, -0.0027F, -0.4198F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 18.6735F, 3.6191F, 0.0802F, -0.3028F, -0.1966F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(108, 9).addBox(-0.0449F, -0.0333F, -0.5309F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 18.3735F, 1.6191F, 0.044F, -0.2679F, -0.0488F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(103, 72).addBox(-1.5449F, -0.0333F, -0.5309F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 18.3735F, -0.3809F, 0.0231F, -0.1948F, -0.0603F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(164, 63).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.2767F, -0.3628F, 0.714F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(139, 114).addBox(6.9756F, -3.7942F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.4367F, -0.1227F, 1.3534F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(152, 59).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.6841F, -8.8135F, -0.36F, -0.2803F, 0.976F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(164, 61).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.2743F, -0.3599F, 0.6434F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(152, 57).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.357F, -0.2782F, 0.9055F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(128, 41).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.4331F, -0.1218F, 1.2832F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(77, 144).addBox(11.835F, -8.3453F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9841F, -6.8135F, -0.448F, 0.0283F, 1.599F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(133, 163).addBox(11.835F, -8.3453F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.4439F, -0.0066F, 1.5468F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(128, 39).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.4181F, -0.1536F, 1.229F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(152, 35).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.3302F, -0.3022F, 0.8456F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(163, 130).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3841F, -5.0135F, -0.241F, -0.3765F, 0.5792F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 151).addBox(11.835F, -8.3453F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.4394F, -0.0413F, 1.512F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(128, 6).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.4028F, -0.1852F, 1.1916F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(152, 33).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.303F, -0.3258F, 0.8024F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(163, 128).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6841F, -3.0135F, -0.2073F, -0.3923F, 0.5318F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(139, 112).addBox(11.835F, -8.3453F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.4363F, -0.0936F, 1.5118F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(128, 4).addBox(6.9756F, -3.7942F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.3828F, -0.2338F, 1.1874F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(152, 31).addBox(2.8978F, -0.7765F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.2641F, -0.3632F, 0.7893F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(163, 126).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0841F, -1.2135F, -0.1579F, -0.4184F, 0.5123F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(139, 116).addBox(-0.1F, -0.4F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6889F, 16.7826F, -7.0393F, -0.2854F, -0.2681F, -0.1972F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(33, 28).addBox(-1.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0789F, 17.3879F, -5.0091F, -0.3191F, -0.2265F, -0.0597F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(108, 17).addBox(-0.7396F, 0.1085F, -0.8004F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 18.3735F, -2.8809F, 0.0616F, -0.2201F, -0.2028F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(52, 28).addBox(-1.0F, -0.7839F, 0.0248F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 18.5821F, -3.4872F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(65, 67).addBox(-1.5F, -0.2802F, -0.1543F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 14.9821F, -9.1872F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.908F, 2.84F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.9F, -12.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2664F, 11.1267F, -8.1605F, 0.235F, 0.011F, -0.0868F));

		PartDefinition cube_r286 = leftarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(145, 0).addBox(-1.5F, 0.0201F, -0.4278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 13.6766F, 5.7038F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(84, 133).addBox(-1.5F, -2.5096F, -1.4643F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 13.6766F, 5.7038F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(148, 21).addBox(-0.3758F, -4.0023F, -1.7463F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(2.0346F, 2.2012F, 1.3313F, -0.2365F, -0.0225F, 0.0026F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(129, 74).addBox(-0.3688F, -1.348F, -4.1861F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0346F, 2.2012F, 1.3313F, -1.1083F, -0.0335F, -0.001F));

		PartDefinition cube_r290 = leftarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(154, 69).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5894F, -0.3069F, 2.9069F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r291 = leftarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(68, 142).addBox(-1.0F, -2.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.0477F, 1.9555F, -0.0001F, 0.0014F, -0.001F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(68, 126).addBox(-0.3557F, -4.1048F, 0.7436F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0346F, 2.2012F, 1.3313F, -2.3812F, -0.1241F, 0.0938F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 125).addBox(-0.3706F, -0.3194F, -3.4027F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0346F, 2.2012F, 1.3313F, -0.9774F, -0.0335F, -0.001F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(104, 144).addBox(-0.3833F, -0.9215F, -3.9738F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0346F, 2.2012F, 1.3313F, -0.8231F, -0.0976F, -0.0249F));

		PartDefinition cube_r295 = leftarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 130).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.5894F, 3.7945F, 0.1024F, -0.3492F, 0.0014F, -0.001F));

		PartDefinition cube_r296 = leftarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(123, 87).addBox(-1.0F, -6.3F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.5993F, 8.2778F, 4.4194F, 0.6544F, 0.0014F, -0.001F));

		PartDefinition cube_r297 = leftarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(132, 31).addBox(-1.0F, -3.0F, -1.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 9.7326F, 5.4125F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r298 = leftarm.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(117, 40).addBox(-1.0F, -6.5F, -2.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 13.6853F, 6.4208F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftarm.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(137, 132).addBox(-1.0F, -5.3925F, -2.0621F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 13.6766F, 5.7038F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(75, 115).addBox(-1.0F, -0.9F, -1.1F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 1.6422F, 2.125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftarm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(31, 135).addBox(-1.0F, -1.5F, -0.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 5.401F, 3.493F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1927F, 15.3986F, 5.6804F, 0.0961F, 0.0711F, 0.0629F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(151, 160).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1501F, 0.8493F, -1.18F, 1.5001F, -1.2163F, -1.4785F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(156, 42).addBox(-0.25F, -3.2F, -2.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0672F, 12.5776F, 0.3219F, -1.3992F, -1.5352F, 1.4172F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(149, 165).addBox(-1.7F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.8118F, 6.7097F, 0.0685F, -1.6176F, -0.6926F, 1.7904F));

		PartDefinition cube_r305 = leftarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(92, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8225F, 7.1384F, -1.8849F, 1.7394F, -1.3547F, -1.5458F));

		PartDefinition cube_r306 = leftarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(27, 160).addBox(-0.448F, -0.8088F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1118F, 2.0963F, -0.961F, -1.9432F, -1.4718F, 2.1313F));

		PartDefinition cube_r307 = leftarm2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 153).addBox(0.3F, 1.2F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2764F, -1.5081F, 0.1246F, -1.5708F, -0.4014F, 1.5708F));

		PartDefinition cube_r308 = leftarm2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(11, 117).addBox(-0.5256F, -0.0299F, -1.3596F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.236F, 1.5425F, -0.1906F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r309 = leftarm2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(138, 10).addBox(-2.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2236F, 0.3885F, 1.2089F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition cube_r310 = leftarm2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(31, 130).addBox(-3.05F, -1.325F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, -1.4836F, 2.8962F, 1.5708F, -0.8727F, -1.5708F));

		PartDefinition cube_r311 = leftarm2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(65, 149).addBox(-1.075F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.5988F, 3.5671F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r312 = leftarm2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(154, 127).addBox(-0.8F, 0.35F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, -1.0818F, 3.7305F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition cube_r313 = leftarm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(112, 152).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2236F, 2.3653F, 0.7011F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition cube_r314 = leftarm2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(9, 139).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 8.4042F, 1.2858F, -1.5708F, -1.4748F, 1.5708F));

		PartDefinition cube_r315 = leftarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(145, 80).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 4.394F, 1.1956F, -1.5708F, -1.4748F, 1.5708F));

		PartDefinition cube_r316 = leftarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(154, 117).addBox(-0.55F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0122F, 10.6054F, 1.8073F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2822F, 11.3785F, 0.3226F, 0.2508F, -0.0972F, 0.0079F));

		PartDefinition cube_r317 = leftArm3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(125, 19).addBox(-2.5002F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.2177F, -0.0096F, -0.0084F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(134, 81).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 2.8459F, -0.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftArm4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(158, 10).addBox(-1.5997F, -1.0455F, 0.5234F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9423F, 0.5743F, -1.0437F, 0.0735F, 0.8158F, 0.1714F));

		PartDefinition cube_r319 = leftArm4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(163, 108).addBox(-0.7053F, -4.4031F, -0.3039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2368F, 4.2008F, 0.0357F, -0.0322F, -0.8321F, -0.01F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1868F, 4.5391F, 0.5618F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftArm5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 143).addBox(-1.6565F, 2.6682F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.129F, -4.8649F, -1.4055F, 0.9497F, 0.8301F, 0.1502F));

		PartDefinition cube_r321 = leftArm5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(123, 97).addBox(-1.6649F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0501F, -1.2383F, -0.3261F, 1.0314F, -0.7945F, -0.0728F));

		PartDefinition cube_r322 = leftArm5.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(92, 26).addBox(-2.3124F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone4 = leftarm2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2664F, 11.1267F, -8.1605F, 0.1477F, -0.011F, 0.0868F));

		PartDefinition cube_r323 = rightarm.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(145, 38).addBox(-1.5F, 0.0201F, -0.4278F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 13.6766F, 5.7038F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightarm.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(44, 134).addBox(-1.5F, -2.5096F, -1.4643F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 13.6766F, 5.7038F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightarm.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(47, 148).addBox(-0.6242F, -4.0023F, -1.7463F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-2.0346F, 2.2012F, 1.3313F, -0.2365F, 0.0225F, -0.0026F));

		PartDefinition cube_r326 = rightarm.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 129).addBox(-0.6312F, -1.348F, -4.1861F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0346F, 2.2012F, 1.3313F, -1.1083F, 0.0335F, 0.001F));

		PartDefinition cube_r327 = rightarm.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(154, 112).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5894F, -0.3069F, 2.9069F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r328 = rightarm.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(143, 31).addBox(-1.0F, -2.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.0477F, 1.9555F, -0.0001F, -0.0014F, 0.001F));

		PartDefinition cube_r329 = rightarm.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(11, 154).addBox(-0.6443F, -4.1048F, 0.7436F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0346F, 2.2012F, 1.3313F, -2.3812F, 0.1241F, -0.0938F));

		PartDefinition cube_r330 = rightarm.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(57, 126).addBox(-0.6294F, -0.3194F, -3.4027F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0346F, 2.2012F, 1.3313F, -0.9774F, 0.0335F, 0.001F));

		PartDefinition cube_r331 = rightarm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(137, 144).addBox(-0.6167F, -0.9215F, -3.9738F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0346F, 2.2012F, 1.3313F, -0.8231F, 0.0976F, 0.0249F));

		PartDefinition cube_r332 = rightarm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(117, 132).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.5894F, 3.7945F, 0.1024F, -0.3492F, -0.0014F, 0.001F));

		PartDefinition cube_r333 = rightarm.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(123, 122).addBox(-1.0F, -6.3F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-1.5993F, 8.2778F, 4.4194F, 0.6544F, -0.0014F, 0.001F));

		PartDefinition cube_r334 = rightarm.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(132, 87).addBox(-1.0F, -3.0F, -1.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 9.7326F, 5.4125F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightarm.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(117, 54).addBox(-1.0F, -6.5F, -2.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 13.6853F, 6.4208F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightarm.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(95, 138).addBox(-1.0F, -5.3925F, -2.0621F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 13.6766F, 5.7038F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightarm.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(86, 115).addBox(-1.0F, -0.9F, -1.1F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 1.6422F, 2.125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightarm.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(18, 136).addBox(-1.0F, -1.5F, -0.4F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 5.401F, 3.493F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1927F, 15.3986F, 5.6804F, 0.1834F, -0.0711F, -0.0629F));

		PartDefinition cube_r339 = rightarm2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(9, 161).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1501F, 0.8493F, -1.18F, 1.5001F, 1.2163F, 1.4785F));

		PartDefinition cube_r340 = rightarm2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(157, 5).addBox(-1.75F, -3.2F, -2.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0672F, 12.5776F, 0.3219F, -1.3992F, 1.5352F, -1.4172F));

		PartDefinition cube_r341 = rightarm2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(156, 165).addBox(-0.3F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8118F, 6.7097F, 0.0685F, -1.6176F, 0.6926F, -1.7904F));

		PartDefinition cube_r342 = rightarm2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(159, 16).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8225F, 7.1384F, -1.8849F, 1.7394F, 1.3547F, 1.5458F));

		PartDefinition cube_r343 = rightarm2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(32, 160).addBox(-0.552F, -0.8088F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1118F, 2.0963F, -0.961F, -1.9432F, 1.4718F, -2.1313F));

		PartDefinition cube_r344 = rightarm2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 154).addBox(-3.3F, 1.2F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2764F, -1.5081F, 0.1246F, -1.5708F, 0.4014F, -1.5708F));

		PartDefinition cube_r345 = rightarm2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 118).addBox(-1.4744F, -0.0299F, -1.3596F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.236F, 1.5425F, -0.1906F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r346 = rightarm2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(139, 49).addBox(-1.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2236F, 0.3885F, 1.2089F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition cube_r347 = rightarm2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(132, 122).addBox(-0.95F, -1.325F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.4836F, 2.8962F, 1.5708F, 0.8727F, 1.5708F));

		PartDefinition cube_r348 = rightarm2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(150, 137).addBox(-0.925F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, -0.5988F, 3.5671F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r349 = rightarm2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(27, 155).addBox(-1.2F, 0.35F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, -1.0818F, 3.7305F, -1.5708F, 0.9163F, -1.5708F));

		PartDefinition cube_r350 = rightarm2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(121, 152).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2236F, 2.3653F, 0.7011F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition cube_r351 = rightarm2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(139, 19).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 8.4042F, 1.2858F, -1.5708F, 1.4748F, -1.5708F));

		PartDefinition cube_r352 = rightarm2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(145, 103).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 4.394F, 1.1956F, -1.5708F, 1.4748F, -1.5708F));

		PartDefinition cube_r353 = rightarm2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(154, 122).addBox(-1.45F, -1.15F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0122F, 10.6054F, 1.8073F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2822F, 11.3785F, 0.3226F, 0.2508F, 0.0972F, -0.0079F));

		PartDefinition cube_r354 = rightArm3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(126, 25).addBox(-1.4998F, 0.0182F, -0.491F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.2177F, 0.0096F, 0.0084F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(136, 97).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 2.8459F, -0.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightArm4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(158, 92).addBox(-0.4003F, -1.0455F, 0.5234F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9423F, 0.5743F, -1.0437F, 0.0735F, -0.8158F, -0.1714F));

		PartDefinition cube_r356 = rightArm4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(163, 114).addBox(-0.2947F, -4.4031F, -0.3039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2368F, 4.2008F, 0.0357F, -0.0322F, 0.8321F, 0.01F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1868F, 4.5391F, 0.5618F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightArm5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(143, 87).addBox(-0.3435F, 2.6682F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.129F, -4.8649F, -1.4055F, 0.9497F, -0.8301F, -0.1502F));

		PartDefinition cube_r358 = rightArm5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(125, 11).addBox(-0.3351F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0501F, -1.2383F, -0.3261F, 1.0314F, 0.7945F, 0.0728F));

		PartDefinition cube_r359 = rightArm5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(92, 50).addBox(-1.6876F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone5 = rightarm2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8471F, 5.5225F, -3.0193F, 0.1739F, 0.0151F, 0.045F));

		PartDefinition cube_r360 = bone2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(165, 10).addBox(-0.325F, 0.575F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1224F, 3.6326F, -3.4419F, 1.1925F, 0.4605F, -0.3731F));

		PartDefinition cube_r361 = bone2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(70, 103).addBox(-0.2453F, -1.187F, -3.4804F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0461F, 0.457F, -0.0248F, 0.3809F, 0.3578F, -0.4093F));

		PartDefinition cube_r362 = bone2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(104, 83).addBox(-0.3742F, -0.8317F, -1.292F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0461F, 0.457F, -0.0248F, 0.049F, 0.4547F, -0.3661F));

		PartDefinition cube_r363 = bone2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(19, 64).addBox(-0.3141F, -1.2702F, -1.1198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8739F, 0.4217F, 5.8538F, 1.2356F, 0.4301F, -0.3657F));

		PartDefinition cube_r364 = bone2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(145, 125).addBox(-0.3141F, -1.9474F, -2.4026F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8739F, 0.4217F, 5.8538F, -0.117F, 0.4301F, -0.3657F));

		PartDefinition cube_r365 = bone2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(166, 146).addBox(-0.3141F, -0.0058F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(107, 161).addBox(-0.3141F, -2.0058F, 0.5188F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8739F, 0.4217F, 5.8538F, 0.4066F, 0.4301F, -0.3657F));

		PartDefinition cube_r366 = bone2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 139).addBox(-0.3644F, -2.8175F, -1.3692F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(38, 78).addBox(-0.3644F, -4.8175F, 1.6308F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0461F, 0.457F, -0.0248F, 0.6081F, 0.4287F, -0.3271F));

		PartDefinition cube_r367 = bone2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(33, 18).addBox(-1.9506F, 0.0434F, -4.6571F, 4.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0272F, -0.4817F, -2.1938F, 0.5751F, 0.995F, -1.1442F));

		PartDefinition cube_r368 = bone2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(115, 112).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.4229F, -5.0426F, -4.513F, 1.3584F, 0.1979F, -0.2842F));

		PartDefinition cube_r369 = bone2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(68, 133).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-4.0244F, -7.8099F, -3.5228F, 1.2275F, 0.1979F, -0.2842F));

		PartDefinition cube_r370 = bone2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(112, 158).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.1476F, -8.403F, 1.5046F, 2.2495F, 0.3146F, -0.3602F));

		PartDefinition cube_r371 = bone2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(56, 148).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.7557F, -9.2726F, -0.1907F, 1.0442F, 0.1979F, -0.2842F));

		PartDefinition cube_r372 = bone2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(126, 160).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.6046F, -8.0124F, -1.2296F, -0.0466F, 0.1979F, -0.2842F));

		PartDefinition cube_r373 = bone2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(7, 166).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.144F, -8.6122F, -2.9224F, 0.9133F, 0.1979F, -0.2842F));

		PartDefinition cube_r374 = bone2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(130, 152).addBox(-0.5F, -1.0F, 1.15F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7836F, -7.1626F, -3.2245F, 0.6515F, 0.1979F, -0.2842F));

		PartDefinition cube_r375 = bone2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(106, 136).addBox(-0.5F, -5.6F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1507F, 4.8419F, -1.177F, 1.0529F, 0.1979F, -0.2842F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(28, 110).addBox(-1.4579F, -5.5223F, -1.8155F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6202F, 0.1979F, -0.2842F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8471F, 5.5225F, -3.0193F, 0.1739F, -0.0151F, -0.045F));

		PartDefinition cube_r377 = bone6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(165, 10).mirror().addBox(-0.675F, 0.575F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1224F, 3.6326F, -3.4419F, 1.1925F, -0.4605F, 0.3731F));

		PartDefinition cube_r378 = bone6.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(70, 103).mirror().addBox(-0.7547F, -1.187F, -3.4804F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0461F, 0.457F, -0.0248F, 0.3809F, -0.3578F, 0.4093F));

		PartDefinition cube_r379 = bone6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(104, 83).mirror().addBox(-0.6258F, -0.8317F, -1.292F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0461F, 0.457F, -0.0248F, 0.049F, -0.4547F, 0.3661F));

		PartDefinition cube_r380 = bone6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(19, 64).mirror().addBox(-0.6859F, -1.2702F, -1.1198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8739F, 0.4217F, 5.8538F, 1.2356F, -0.4301F, 0.3657F));

		PartDefinition cube_r381 = bone6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(145, 125).mirror().addBox(-0.6859F, -1.9474F, -2.4026F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8739F, 0.4217F, 5.8538F, -0.117F, -0.4301F, 0.3657F));

		PartDefinition cube_r382 = bone6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(166, 146).mirror().addBox(-0.6859F, -0.0058F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(107, 161).mirror().addBox(-0.6859F, -2.0058F, 0.5188F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8739F, 0.4217F, 5.8538F, 0.4066F, -0.4301F, 0.3657F));

		PartDefinition cube_r383 = bone6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-0.6356F, -2.8175F, -1.3692F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 78).mirror().addBox(-0.6356F, -4.8175F, 1.6308F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0461F, 0.457F, -0.0248F, 0.6081F, -0.4287F, 0.3271F));

		PartDefinition cube_r384 = bone6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(33, 18).mirror().addBox(-2.0494F, 0.0434F, -4.6571F, 4.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0272F, -0.4817F, -2.1938F, 0.5751F, -0.995F, 1.1442F));

		PartDefinition cube_r385 = bone6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(115, 112).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.4229F, -5.0426F, -4.513F, 1.3584F, -0.1979F, 0.2842F));

		PartDefinition cube_r386 = bone6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(68, 133).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(4.0244F, -7.8099F, -3.5228F, 1.2275F, -0.1979F, 0.2842F));

		PartDefinition cube_r387 = bone6.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(112, 158).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.1476F, -8.403F, 1.5046F, 2.2495F, -0.3146F, 0.3602F));

		PartDefinition cube_r388 = bone6.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(56, 148).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.7557F, -9.2726F, -0.1907F, 1.0442F, -0.1979F, 0.2842F));

		PartDefinition cube_r389 = bone6.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(126, 160).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(3.6046F, -8.0124F, -1.2296F, -0.0466F, -0.1979F, 0.2842F));

		PartDefinition cube_r390 = bone6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(7, 166).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(4.144F, -8.6122F, -2.9224F, 0.9133F, -0.1979F, 0.2842F));

		PartDefinition cube_r391 = bone6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(130, 152).mirror().addBox(-0.5F, -1.0F, 1.15F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7836F, -7.1626F, -3.2245F, 0.6515F, -0.1979F, 0.2842F));

		PartDefinition cube_r392 = bone6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(106, 136).mirror().addBox(-0.5F, -5.6F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1507F, 4.8419F, -1.177F, 1.0529F, -0.1979F, 0.2842F));

		PartDefinition cube_r393 = bone6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(0.4579F, -5.5223F, -1.8155F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6202F, -0.1979F, 0.2842F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8613F, -10.4252F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(165, 163).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(166, 8).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.085F, -0.8212F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r395 = neck2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(166, 8).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(165, 163).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.085F, -0.8212F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r396 = neck2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(99, 157).addBox(-0.003F, -4.5379F, -1.1161F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8454F, -3.0433F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(115, 164).addBox(0.0F, -5.741F, 0.1309F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8454F, -1.3433F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r398 = neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(51, 107).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0555F, -4.0195F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4378F, -4.1064F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(28, 103).addBox(0.0F, -4.125F, -1.1131F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5899F, -0.6238F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r400 = neck.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(166, 20).mirror().addBox(-1.0931F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3406F, 1.4983F, -0.1183F, 0.2465F, -0.5962F));

		PartDefinition cube_r401 = neck.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(166, 20).addBox(-0.9069F, 0.1996F, -2.4244F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3406F, 1.4983F, -0.1183F, -0.2465F, 0.5962F));

		PartDefinition cube_r402 = neck.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(119, 32).addBox(-1.0F, -1.1F, 0.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.353F, -2.8009F, -1.4854F, 0.0692F, -0.0532F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(132, 127).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9517F, -0.7069F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 57).addBox(-4.5F, -1.1F, -2.6F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8957F, -0.624F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(35, 0).addBox(-4.0F, 0.4F, -2.6F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8997F, -4.1256F, 0.9675F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(60, 16).addBox(-4.5F, -0.0541F, -3.1567F, 10.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -3.4543F, -8.464F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(25, 59).addBox(-4.5F, 0.0F, -1.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0714F, -9.3F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(157, 132).addBox(-1.0F, -0.0795F, -2.0282F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0727F, -9.2413F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(128, 43).addBox(-2.5F, -0.0795F, -2.0282F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0819F, -9.433F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(71, 45).addBox(-5.0F, -0.0045F, -0.0282F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0881F, -9.2761F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(50, 58).addBox(-4.5F, -0.0045F, -0.0282F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0819F, -9.433F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, -0.0076F, -6.9546F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, -4.704F, -2.7143F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(19, 69).addBox(-4.5F, -0.0076F, -1.9546F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.3054F, -4.6218F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(52, 39).addBox(-5.0F, -2.0F, -2.2F, 10.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.742F, -5.8929F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(35, 10).addBox(-4.0F, -1.8076F, -2.9546F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -5.3054F, -4.6218F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(60, 23).addBox(-4.0F, -1.875F, -1.125F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.5389F, -5.4486F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(73, 60).addBox(-4.0F, -1.3258F, -0.8444F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.1939F, -6.9868F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(89, 18).addBox(-3.0F, -0.0236F, -0.0007F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.0276F, -9.5221F, 0.2258F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(51, 86).addBox(-4.0F, -0.0236F, -2.0007F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 4.0427F, -9.2762F, 1.4475F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -5.5F, -7.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.688F, 0.4731F, 0.1298F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(104, 105).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 11.7712F, -7.2643F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(111, 49).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.9229F, -5.5545F, 2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(89, 10).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.9155F, -3.3251F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(70, 96).addBox(-2.0F, -4.425F, 0.8F, 6.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 9.8973F, -0.6627F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(51, 101).addBox(-2.0F, -2.125F, -1.6F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 9.731F, -2.3187F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2976F, 12.8639F, -7.1884F, -0.2164F, -0.0283F, -0.1278F));

		PartDefinition cube_r426 = leftTusk.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(27, 45).addBox(-1.5F, -2.6731F, -0.7075F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4911F, 0.0F, -0.096F));

		PartDefinition cube_r427 = leftTusk.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(50, 45).addBox(-1.5F, -2.8646F, -0.0515F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6657F, 0.0F, -0.096F));

		PartDefinition cube_r428 = leftTusk.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(163, 103).addBox(-0.3281F, -0.2624F, 1.5262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.703F, -3.7142F, 3.2206F, 1.2966F, 0.0712F, 0.0329F));

		PartDefinition cube_r429 = leftTusk.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(135, 151).addBox(-0.5632F, -0.7297F, -0.8467F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.703F, -3.7142F, 3.2206F, 1.0012F, 0.0755F, 0.1613F));

		PartDefinition cube_r430 = leftTusk.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(19, 74).addBox(-0.3973F, -1.7547F, -16.0514F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.7862F, -0.0867F, 0.0342F));

		PartDefinition cube_r431 = leftTusk.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(75, 28).addBox(0.1367F, 0.4959F, -21.0961F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6466F, -0.0867F, 0.0691F));

		PartDefinition cube_r432 = leftTusk.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(86, 64).addBox(0.1367F, -0.9245F, -21.4003F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6902F, -0.0867F, 0.0691F));

		PartDefinition cube_r433 = leftTusk.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(82, 76).addBox(1.9283F, -0.6911F, -26.7168F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6728F, -0.0867F, 0.1564F));

		PartDefinition cube_r434 = leftTusk.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(17, 84).addBox(1.9283F, 1.6032F, -26.1324F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.5855F, -0.0867F, 0.1564F));

		PartDefinition cube_r435 = leftTusk.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(17, 94).addBox(-0.3198F, 3.1178F, -31.6487F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.5332F, -0.0867F, 0.0691F));

		PartDefinition cube_r436 = leftTusk.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(34, 101).addBox(-0.3198F, 5.8856F, -31.1737F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.4634F, -0.0867F, 0.0691F));

		PartDefinition cube_r437 = leftTusk.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(98, 0).addBox(-5.7317F, 10.8615F, -34.4001F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.3063F, -0.0867F, -0.1054F));

		PartDefinition cube_r438 = leftTusk.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(89, 96).addBox(-5.7317F, 7.8299F, -35.2337F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.3935F, -0.0867F, -0.1054F));

		PartDefinition cube_r439 = leftTusk.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(65, 76).addBox(3.7417F, 1.4489F, -25.9106F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.5855F, -0.0867F, 0.2088F));

		PartDefinition cube_r440 = leftTusk.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(99, 74).addBox(-3.9234F, 7.721F, -35.5163F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.3935F, -0.0867F, -0.053F));

		PartDefinition cube_r441 = leftTusk.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(0, 95).addBox(-3.9234F, 10.7776F, -34.6912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.3063F, -0.0867F, -0.053F));

		PartDefinition cube_r442 = leftTusk.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(100, 40).addBox(1.5058F, 5.7214F, -31.1309F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.4634F, -0.0867F, 0.1215F));

		PartDefinition cube_r443 = leftTusk.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(34, 92).addBox(1.5058F, 2.957F, -31.5946F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.5332F, -0.0867F, 0.1215F));

		PartDefinition cube_r444 = leftTusk.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(81, 0).addBox(3.7417F, -0.8255F, -26.4823F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6728F, -0.0867F, 0.2088F));

		PartDefinition cube_r445 = leftTusk.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 85).addBox(1.9623F, -1.0748F, -21.3217F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6902F, -0.0867F, 0.1215F));

		PartDefinition cube_r446 = leftTusk.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 75).addBox(1.9623F, 0.3423F, -21.0241F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.6466F, -0.0867F, 0.1215F));

		PartDefinition cube_r447 = leftTusk.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(73, 50).addBox(-0.3973F, -3.2029F, -16.0872F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.8299F, -0.0867F, 0.0342F));

		PartDefinition cube_r448 = leftTusk.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(0, 64).addBox(-1.31F, -2.9844F, -10.7136F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.8124F, -0.0867F, -0.053F));

		PartDefinition cube_r449 = leftTusk.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(46, 67).addBox(-2.1269F, -2.36F, -5.6624F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7652F, 5.3075F, 0.5466F, 1.699F, -0.0867F, -0.1927F));

		PartDefinition cube_r450 = leftTusk.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(62, 0).addBox(-1.5F, -2.9013F, -5.7726F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6649F, 0.0124F, -0.2263F));

		PartDefinition cube_r451 = leftTusk.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(103, 64).addBox(-2.95F, -1.5013F, -1.7726F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6469F, -0.0131F, -0.9723F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2976F, 12.8639F, -7.1884F, -0.2164F, 0.0283F, 0.1278F));

		PartDefinition cube_r452 = rightTusk.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-1.5F, -2.6731F, -0.7075F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4911F, 0.0F, 0.096F));

		PartDefinition cube_r453 = rightTusk.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-1.5F, -2.8646F, -0.0515F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6657F, 0.0F, 0.096F));

		PartDefinition cube_r454 = rightTusk.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(163, 103).mirror().addBox(-0.6719F, -0.2624F, 1.5262F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.703F, -3.7142F, 3.2206F, 1.2966F, -0.0712F, -0.0329F));

		PartDefinition cube_r455 = rightTusk.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(135, 151).mirror().addBox(-0.4368F, -0.7297F, -0.8467F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.703F, -3.7142F, 3.2206F, 1.0012F, -0.0755F, -0.1613F));

		PartDefinition cube_r456 = rightTusk.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-2.6027F, -1.7547F, -16.0514F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.7862F, 0.0867F, -0.0342F));

		PartDefinition cube_r457 = rightTusk.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-2.1367F, 0.4959F, -21.0961F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6466F, 0.0867F, -0.0691F));

		PartDefinition cube_r458 = rightTusk.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(86, 64).mirror().addBox(-2.1367F, -0.9245F, -21.4003F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6902F, 0.0867F, -0.0691F));

		PartDefinition cube_r459 = rightTusk.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-3.9283F, -0.6911F, -26.7168F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6728F, 0.0867F, -0.1564F));

		PartDefinition cube_r460 = rightTusk.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(17, 84).mirror().addBox(-3.9283F, 1.6032F, -26.1324F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.5855F, 0.0867F, -0.1564F));

		PartDefinition cube_r461 = rightTusk.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(17, 94).mirror().addBox(-1.6802F, 3.1178F, -31.6487F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.5332F, 0.0867F, -0.0691F));

		PartDefinition cube_r462 = rightTusk.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(34, 101).mirror().addBox(-1.6802F, 5.8856F, -31.1737F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.4634F, 0.0867F, -0.0691F));

		PartDefinition cube_r463 = rightTusk.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(3.7316F, 10.8615F, -34.4001F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.3063F, 0.0867F, 0.1054F));

		PartDefinition cube_r464 = rightTusk.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(89, 96).mirror().addBox(3.7316F, 7.8299F, -35.2337F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.3935F, 0.0867F, 0.1054F));

		PartDefinition cube_r465 = rightTusk.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-5.7417F, 1.4489F, -25.9106F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.5855F, 0.0867F, -0.2088F));

		PartDefinition cube_r466 = rightTusk.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(99, 74).mirror().addBox(1.9234F, 7.721F, -35.5163F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.3935F, 0.0867F, 0.053F));

		PartDefinition cube_r467 = rightTusk.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(1.9234F, 10.7776F, -34.6912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.3063F, 0.0867F, 0.053F));

		PartDefinition cube_r468 = rightTusk.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(100, 40).mirror().addBox(-3.5058F, 5.7214F, -31.1309F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.4634F, 0.0867F, -0.1215F));

		PartDefinition cube_r469 = rightTusk.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(34, 92).mirror().addBox(-3.5058F, 2.957F, -31.5946F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.5332F, 0.0867F, -0.1215F));

		PartDefinition cube_r470 = rightTusk.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-5.7417F, -0.8255F, -26.4823F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6728F, 0.0867F, -0.2088F));

		PartDefinition cube_r471 = rightTusk.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-3.9623F, -1.0748F, -21.3217F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6902F, 0.0867F, -0.1215F));

		PartDefinition cube_r472 = rightTusk.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-3.9623F, 0.3423F, -21.0241F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.6466F, 0.0867F, -0.1215F));

		PartDefinition cube_r473 = rightTusk.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(73, 50).mirror().addBox(-2.6027F, -3.2029F, -16.0872F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.8299F, 0.0867F, -0.0342F));

		PartDefinition cube_r474 = rightTusk.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-1.69F, -2.9844F, -10.7136F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.8124F, 0.0867F, 0.053F));

		PartDefinition cube_r475 = rightTusk.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.8731F, -2.36F, -5.6624F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7652F, 5.3075F, 0.5466F, 1.699F, 0.0867F, 0.1927F));

		PartDefinition cube_r476 = rightTusk.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.5F, -2.9013F, -5.7726F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6649F, -0.0124F, 0.2263F));

		PartDefinition cube_r477 = rightTusk.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(103, 64).mirror().addBox(-0.05F, -1.5013F, -1.7726F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6469F, 0.0131F, 0.9723F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1404F, 12.0764F, -8.9744F, -0.7869F, -0.2186F, -0.0975F));

		PartDefinition cube_r478 = leftOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(126, 132).addBox(-0.925F, 0.1F, -3.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6806F, -10.2785F, -9.229F, -0.5492F, 1.1685F, 1.3488F));

		PartDefinition cube_r479 = leftOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(86, 161).addBox(-0.925F, 0.575F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7388F, -8.7444F, -7.9472F, -0.2226F, 0.8741F, 1.4703F));

		PartDefinition cube_r480 = leftOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(146, 149).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6147F, -7.6384F, -6.6622F, 1.6124F, 0.6972F, 1.4245F));

		PartDefinition cube_r481 = leftOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(46, 126).addBox(-0.228F, -1.2586F, -1.9483F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4781F, -7.5324F, -5.3367F, 1.5389F, 0.4791F, 1.4335F));

		PartDefinition cube_r482 = leftOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(20, 128).addBox(-0.7016F, -1.3461F, -3.0773F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4781F, -7.5324F, -5.3367F, 2.0888F, 0.9587F, 1.4079F));

		PartDefinition cube_r483 = leftOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(141, 57).addBox(-0.3507F, 1.5501F, -3.0773F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4781F, -7.5324F, -5.3367F, 1.9753F, 0.7629F, 1.2591F));

		PartDefinition cube_r484 = leftOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(79, 161).addBox(-0.0894F, -1.0464F, -2.4694F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2635F, -5.845F, -3.7658F, 2.8039F, 0.5005F, 1.1794F));

		PartDefinition cube_r485 = leftOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(158, 160).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5039F, -3.6007F, -0.678F, -2.7791F, -0.0504F, 1.067F));

		PartDefinition cube_r486 = leftOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(160, 154).addBox(-0.875F, -0.575F, -0.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0849F, -3.5696F, -0.8737F, -2.7647F, 0.2755F, 1.1933F));

		PartDefinition cube_r487 = leftOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(44, 160).addBox(-0.4597F, -1.9582F, -0.7209F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.593F, 0.0593F, 0.7698F));

		PartDefinition cube_r488 = leftOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(92, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1683F, -7.6988F, -1.3237F, 2.2462F, 0.0558F, 0.3091F));

		PartDefinition cube_r489 = leftOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(99, 83).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3071F, -7.9796F, -0.4859F, 3.0316F, 0.0558F, 0.3091F));

		PartDefinition cube_r490 = leftOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(93, 161).addBox(-1.0155F, -3.8131F, 0.3773F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1218F, -8.7025F, 0.2284F, -2.9898F, 0.0558F, 0.3091F));

		PartDefinition cube_r491 = leftOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(97, 115).addBox(-1.0155F, -4.0598F, -0.5587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1218F, -8.7025F, 0.2284F, -3.0771F, 0.0558F, 0.3091F));

		PartDefinition cube_r492 = leftOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(137, 140).addBox(-1.8362F, -0.6347F, -3.224F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1227F, -13.22F, -7.3737F, -0.306F, -1.2872F, -2.1386F));

		PartDefinition cube_r493 = leftOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(139, 27).addBox(-3.3F, -0.5F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1227F, -13.22F, -7.3737F, -2.5386F, -1.2707F, 0.1504F));

		PartDefinition cube_r494 = leftOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(106, 93).addBox(-4.8116F, -0.3931F, -2.6014F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9406F, -12.8932F, -2.3715F, 2.9664F, -1.2704F, 0.9978F));

		PartDefinition cube_r495 = leftOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(119, 82).addBox(-3.6116F, 0.0319F, -1.2014F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9406F, -12.8932F, -2.3715F, -2.7855F, -0.3579F, 0.7603F));

		PartDefinition cube_r496 = leftOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(58, 160).addBox(-2.7684F, -0.7275F, 0.2381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5713F, -10.0541F, 0.068F, -2.5747F, -0.0126F, 0.3653F));

		PartDefinition cube_r497 = leftOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(51, 160).addBox(-2.7684F, -0.2525F, -0.0868F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.5713F, -10.0541F, 0.068F, -2.7929F, -0.0126F, 0.3653F));

		PartDefinition cube_r498 = leftOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(37, 160).addBox(-2.7684F, -0.2525F, -0.0869F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.875F, -8.2519F, 0.5849F, -2.8802F, -0.0126F, 0.3653F));

		PartDefinition cube_r499 = leftOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(159, 136).addBox(-0.2446F, -2.2747F, -1.255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9406F, -12.8932F, -2.3715F, -2.6039F, -0.1631F, 0.3286F));

		PartDefinition cube_r500 = leftOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(48, 115).addBox(-0.8F, -0.1F, -4.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8955F, -7.2343F, -7.2403F, 2.4648F, -0.0868F, 0.3607F));

		PartDefinition cube_r501 = leftOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(118, 164).addBox(-0.9F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1069F, -8.5091F, -8.6337F, 2.2985F, -0.0912F, 0.4194F));

		PartDefinition cube_r502 = leftOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(157, 61).addBox(-0.2446F, -2.0446F, -0.2361F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.9406F, -12.8932F, -2.3715F, -2.3421F, -0.1631F, 0.3286F));

		PartDefinition cube_r503 = leftOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(158, 98).addBox(-0.3078F, 0.2472F, 0.4947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, 2.9261F, 0.018F, 0.5164F));

		PartDefinition cube_r504 = leftOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(90, 157).addBox(-1.6F, -0.575F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3252F, -6.6346F, -5.0362F, 2.1553F, -0.4557F, 0.8818F));

		PartDefinition cube_r505 = leftOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(81, 157).addBox(-0.5F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.6109F, -7.4877F, -5.9746F, 2.3138F, -0.5773F, 0.826F));

		PartDefinition cube_r506 = leftOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(102, 112).addBox(1.1188F, -0.0236F, -4.275F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-5.9955F, -5.2527F, -4.1768F, 2.3735F, 0.1783F, 0.1331F));

		PartDefinition cube_r507 = leftOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(166, 4).addBox(-0.4286F, -1.0485F, 0.1497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.9165F, 0.0809F, 0.8046F));

		PartDefinition cube_r508 = leftOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(137, 165).addBox(-0.4286F, -0.6889F, -0.882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3467F, -4.3969F, 0.4582F, -2.9601F, 0.0809F, 0.8046F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1404F, 12.0764F, -8.9744F, -0.7869F, 0.2186F, 0.0975F));

		PartDefinition cube_r509 = rightOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(126, 132).mirror().addBox(-0.075F, 0.1F, -3.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6806F, -10.2785F, -9.229F, -0.5492F, -1.1685F, -1.3488F));

		PartDefinition cube_r510 = rightOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(86, 161).mirror().addBox(-0.075F, 0.575F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7388F, -8.7444F, -7.9472F, -0.2226F, -0.8741F, -1.4703F));

		PartDefinition cube_r511 = rightOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(146, 149).mirror().addBox(0.0F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6147F, -7.6384F, -6.6622F, 1.6124F, -0.6972F, -1.4245F));

		PartDefinition cube_r512 = rightOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(46, 126).mirror().addBox(-0.772F, -1.2586F, -1.9483F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4781F, -7.5324F, -5.3367F, 1.5389F, -0.4791F, -1.4335F));

		PartDefinition cube_r513 = rightOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(20, 128).mirror().addBox(-0.2984F, -1.3461F, -3.0773F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4781F, -7.5324F, -5.3367F, 2.0888F, -0.9587F, -1.4079F));

		PartDefinition cube_r514 = rightOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(141, 57).mirror().addBox(-0.6493F, 1.5501F, -3.0773F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4781F, -7.5324F, -5.3367F, 1.9753F, -0.7629F, -1.2591F));

		PartDefinition cube_r515 = rightOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(79, 161).mirror().addBox(-0.9106F, -1.0464F, -2.4694F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2635F, -5.845F, -3.7658F, 2.8039F, -0.5005F, -1.1794F));

		PartDefinition cube_r516 = rightOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(158, 160).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5039F, -3.6007F, -0.678F, -2.7791F, 0.0504F, -1.067F));

		PartDefinition cube_r517 = rightOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(160, 154).mirror().addBox(-0.125F, -0.575F, -0.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0849F, -3.5696F, -0.8737F, -2.7647F, -0.2755F, -1.1933F));

		PartDefinition cube_r518 = rightOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(44, 160).mirror().addBox(-0.5403F, -1.9582F, -0.7209F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.593F, -0.0593F, -0.7698F));

		PartDefinition cube_r519 = rightOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(92, 57).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1683F, -7.6988F, -1.3237F, 2.2462F, -0.0558F, -0.3091F));

		PartDefinition cube_r520 = rightOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3071F, -7.9796F, -0.4859F, 3.0316F, -0.0558F, -0.3091F));

		PartDefinition cube_r521 = rightOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(93, 161).mirror().addBox(0.0155F, -3.8131F, 0.3773F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1218F, -8.7025F, 0.2284F, -2.9898F, -0.0558F, -0.3091F));

		PartDefinition cube_r522 = rightOrbit.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(97, 115).mirror().addBox(0.0155F, -4.0598F, -0.5587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1218F, -8.7025F, 0.2284F, -3.0771F, -0.0558F, -0.3091F));

		PartDefinition cube_r523 = rightOrbit.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(137, 140).mirror().addBox(-2.1638F, -0.6347F, -3.224F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1227F, -13.22F, -7.3737F, -0.306F, 1.2872F, 2.1386F));

		PartDefinition cube_r524 = rightOrbit.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(139, 27).mirror().addBox(-0.7F, -0.5F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1227F, -13.22F, -7.3737F, -2.5386F, 1.2707F, -0.1504F));

		PartDefinition cube_r525 = rightOrbit.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(106, 93).mirror().addBox(0.8116F, -0.3931F, -2.6014F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9406F, -12.8932F, -2.3715F, 2.9664F, 1.2704F, -0.9978F));

		PartDefinition cube_r526 = rightOrbit.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(119, 82).mirror().addBox(-0.3884F, 0.0319F, -1.2014F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9406F, -12.8932F, -2.3715F, -2.7855F, 0.3579F, -0.7603F));

		PartDefinition cube_r527 = rightOrbit.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(58, 160).mirror().addBox(1.7684F, -0.7275F, 0.2381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5713F, -10.0541F, 0.068F, -2.5747F, 0.0126F, -0.3653F));

		PartDefinition cube_r528 = rightOrbit.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(51, 160).mirror().addBox(1.7684F, -0.2525F, -0.0868F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5713F, -10.0541F, 0.068F, -2.7929F, 0.0126F, -0.3653F));

		PartDefinition cube_r529 = rightOrbit.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(37, 160).mirror().addBox(1.7684F, -0.2525F, -0.0869F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.875F, -8.2519F, 0.5849F, -2.8802F, 0.0126F, -0.3653F));

		PartDefinition cube_r530 = rightOrbit.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(159, 136).mirror().addBox(-0.7554F, -2.2747F, -1.255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9406F, -12.8932F, -2.3715F, -2.6039F, 0.1631F, -0.3286F));

		PartDefinition cube_r531 = rightOrbit.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(48, 115).mirror().addBox(-0.2F, -0.1F, -4.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8955F, -7.2343F, -7.2403F, 2.4648F, 0.0868F, -0.3607F));

		PartDefinition cube_r532 = rightOrbit.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(118, 164).mirror().addBox(-0.1F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1069F, -8.5091F, -8.6337F, 2.2985F, 0.0912F, -0.4194F));

		PartDefinition cube_r533 = rightOrbit.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(157, 61).mirror().addBox(-0.7554F, -2.0446F, -0.2361F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.9406F, -12.8932F, -2.3715F, -2.3421F, 0.1631F, -0.3286F));

		PartDefinition cube_r534 = rightOrbit.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(158, 98).mirror().addBox(-0.6922F, 0.2472F, 0.4947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, 2.9261F, -0.018F, -0.5164F));

		PartDefinition cube_r535 = rightOrbit.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(90, 157).mirror().addBox(-0.4F, -0.575F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3252F, -6.6346F, -5.0362F, 2.1553F, 0.4557F, -0.8818F));

		PartDefinition cube_r536 = rightOrbit.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(81, 157).mirror().addBox(-1.5F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(4.6109F, -7.4877F, -5.9746F, 2.3138F, 0.5773F, -0.826F));

		PartDefinition cube_r537 = rightOrbit.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(102, 112).mirror().addBox(-3.1188F, -0.0236F, -4.275F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(5.9955F, -5.2527F, -4.1768F, 2.3735F, -0.1783F, -0.1331F));

		PartDefinition cube_r538 = rightOrbit.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(166, 4).mirror().addBox(-0.5714F, -1.0485F, 0.1497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.9165F, -0.0809F, -0.8046F));

		PartDefinition cube_r539 = rightOrbit.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(137, 165).mirror().addBox(-0.5714F, -0.6889F, -0.882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3467F, -4.3969F, 0.4582F, -2.9601F, -0.0809F, -0.8046F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.7742F, -4.3845F, -2.4985F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.8586F, 0.7297F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(148, 63).mirror().addBox(-0.5F, -1.1F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(148, 63).addBox(6.7F, -1.1F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-4.2F, 2.4F, -1.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(134, 105).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(134, 105).addBox(6.7F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.2F, 3.7678F, -2.2658F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(135, 157).mirror().addBox(-0.5F, 1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(135, 157).addBox(6.7F, 1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2F, -0.0651F, -5.6565F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(79, 166).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(79, 166).addBox(6.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.2F, 2.127F, -6.0864F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(154, 86).mirror().addBox(-1.0F, 0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(154, 86).addBox(6.2F, 0.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.7F, 0.969F, -4.2436F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(164, 74).mirror().addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(164, 74).addBox(6.7F, -0.3F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2F, 0.0F, -0.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(84, 166).mirror().addBox(-0.5F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(84, 166).addBox(6.7F, 0.3F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2F, 0.7F, -0.3F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(165, 56).mirror().addBox(-0.5F, -1.4F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(165, 56).addBox(6.7F, -1.4F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.2F, 0.7F, -0.3F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(166, 132).mirror().addBox(-0.5F, -0.7F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(166, 132).addBox(6.7F, -0.7F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 0.8507F, -1.3197F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(38, 147).mirror().addBox(-0.5F, -1.5F, -1.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(38, 147).addBox(6.7F, -1.5F, -1.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.2F, 4.7338F, -5.8332F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(111, 54).mirror().addBox(-0.5F, -2.2257F, -2.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 54).addBox(6.7F, -2.2257F, -2.0794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 6.4575F, 0.2983F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(0, 162).mirror().addBox(-0.5F, -2.7904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 162).addBox(6.7F, -2.7904F, -1.9586F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.2F, 4.3784F, 0.4536F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(18, 144).mirror().addBox(-0.9956F, -0.682F, -0.2162F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5929F, 5.5338F, -7.6737F, -1.6239F, -0.3412F, -0.125F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(98, 151).mirror().addBox(-2.2346F, -0.4008F, -0.0202F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -1.7247F, -0.4133F, -0.0588F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(16, 162).mirror().addBox(-1.8718F, -0.1137F, -3.4875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -0.5333F, -0.301F, 0.0251F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(98, 165).mirror().addBox(-1.6959F, 2.5638F, 0.0503F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -1.4844F, -0.2661F, 0.0564F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(165, 159).mirror().addBox(-0.8692F, -1.0096F, -0.4817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1767F, 5.9279F, -13.5633F, -1.7431F, -0.27F, 0.0324F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(75, 125).mirror().addBox(-0.9869F, -0.7379F, -2.2456F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5929F, 5.5338F, -7.6737F, -1.5889F, -0.349F, 0.0024F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(149, 10).mirror().addBox(-2.2775F, -0.5867F, -1.7564F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -1.4527F, -0.4451F, -0.0732F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(154, 102).mirror().addBox(-2.6F, -0.1379F, -2.6552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(154, 102).addBox(4.6F, -0.1379F, -2.6552F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 6.0606F, -3.9363F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.5F, 0.0063F, -4.9923F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(115, 0).addBox(6.7F, 0.0063F, -4.9923F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.2F, 6.1337F, -2.1064F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(99, 146).mirror().addBox(-0.1F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0878F, 3.0561F, -9.6018F, -1.5064F, -0.2513F, -0.0294F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(144, 155).mirror().addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(144, 155).addBox(6.7F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-4.2F, 7.1734F, -5.4686F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(163, 85).mirror().addBox(-1.8718F, 2.2723F, -2.6481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -1.2751F, -0.301F, 0.0251F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(65, 160).mirror().addBox(-1.8718F, 1.8103F, 3.2783F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1725F, 4.8859F, -10.2094F, -2.5404F, -0.301F, 0.0251F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(166, 22).mirror().addBox(-0.1F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4627F, 2.9705F, -8.1519F, -1.6392F, 0.0535F, -0.01F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(72, 160).mirror().addBox(-1.2787F, 0.6299F, 1.5004F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1345F, 4.9197F, -12.3594F, -2.535F, -0.0829F, 0.0241F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(163, 98).mirror().addBox(-1.2787F, 0.2218F, -2.057F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1345F, 4.9197F, -12.3594F, -1.2696F, -0.0829F, 0.0241F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(163, 165).mirror().addBox(-0.1385F, -1.0682F, -0.5376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1767F, 5.9279F, -13.5633F, -1.734F, -0.0529F, 0.05F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(132, 165).mirror().addBox(-1.1785F, 0.4158F, 0.2061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1345F, 4.9197F, -12.3594F, -1.4722F, -0.0483F, 0.0545F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(142, 162).mirror().addBox(-1.2787F, -1.2262F, -1.6664F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1345F, 4.9197F, -12.3594F, -0.5278F, -0.0829F, 0.0241F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(128, 49).mirror().addBox(-0.3869F, -1.7379F, -2.2456F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.5929F, 5.5338F, -7.6737F, -1.5879F, -0.0873F, -0.0023F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(166, 22).addBox(-0.9F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2627F, 2.9705F, -8.1519F, -1.6392F, -0.0535F, 0.01F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(99, 146).addBox(-0.9F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8878F, 3.0561F, -9.6018F, -1.5064F, 0.2513F, 0.0294F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(149, 10).addBox(0.2775F, -0.5867F, -1.7564F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -1.4527F, 0.4451F, 0.0732F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(128, 49).addBox(-1.6131F, -1.7379F, -2.2456F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3929F, 5.5338F, -7.6737F, -1.5879F, 0.0873F, 0.0023F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(75, 125).addBox(-1.0131F, -0.7379F, -2.2456F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.3929F, 5.5338F, -7.6737F, -1.5889F, 0.349F, -0.0024F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(142, 162).addBox(0.2787F, -1.2262F, -1.6664F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0655F, 4.9197F, -12.3594F, -0.5278F, 0.0829F, -0.0241F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(132, 165).addBox(0.1785F, 0.4158F, 0.2061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0655F, 4.9197F, -12.3594F, -1.4722F, 0.0483F, -0.0545F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(163, 165).addBox(-0.8615F, -1.0682F, -0.5376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0233F, 5.9279F, -13.5633F, -1.734F, 0.0529F, -0.05F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(163, 98).addBox(0.2787F, 0.2218F, -2.057F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0655F, 4.9197F, -12.3594F, -1.2696F, 0.0829F, -0.0241F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(72, 160).addBox(0.2787F, 0.6299F, 1.5004F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0655F, 4.9197F, -12.3594F, -2.535F, 0.0829F, -0.0241F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(165, 159).addBox(-0.1308F, -1.0096F, -0.4817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0233F, 5.9279F, -13.5633F, -1.7431F, 0.27F, -0.0324F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(98, 165).addBox(0.6959F, 2.5638F, 0.0503F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -1.4844F, 0.2661F, -0.0564F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(65, 160).addBox(0.8718F, 1.8103F, 3.2783F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -2.5404F, 0.301F, -0.0251F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(163, 85).addBox(0.8718F, 2.2723F, -2.6481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -1.2751F, 0.301F, -0.0251F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(16, 162).addBox(0.8718F, -0.1137F, -3.4875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -0.5333F, 0.301F, -0.0251F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(98, 151).addBox(0.2346F, -0.4008F, -0.0202F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0275F, 4.8859F, -10.2094F, -1.7247F, 0.4133F, 0.0588F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(18, 144).addBox(-1.0044F, -0.682F, -0.2162F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3929F, 5.5338F, -7.6737F, -1.6239F, 0.3412F, 0.125F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(87, 86).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0726F, 2.7644F, -0.7984F, -0.0916F, 0.0936F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(126, 139).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3617F, 6.8924F, -0.1226F, -0.0866F, 0.0107F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(140, 74).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0855F, 3.8481F, -0.1402F, -0.0864F, 0.0122F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(120, 63).addBox(-0.5F, -0.0083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.5688F, 3.7059F, -0.4192F, -0.0399F, 0.0178F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(20, 121).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5174F, 4.9015F, -0.2376F, 0.1273F, -0.0307F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, 4.8F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r589 = tail6.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(63, 155).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0917F, 0.0909F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 176);
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