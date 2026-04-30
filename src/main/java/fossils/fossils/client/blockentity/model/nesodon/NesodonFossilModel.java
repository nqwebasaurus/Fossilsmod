package fossils.fossils.client.blockentity.model.nesodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NesodonFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
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
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
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
	private final ModelPart tail7;

	public NesodonFossilModel(ModelPart root) {
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
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone3 = this.neck2.getChild("bone3");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
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
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.2442F, 19.0612F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 68).addBox(0.0F, -2.0986F, 0.0389F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4336F, -0.1433F, -0.2225F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3819F, 0.1253F, 0.1768F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(81, 64).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3819F, -0.1253F, -0.1768F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4336F, 0.1433F, 0.2225F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 51).addBox(-1.0F, 7.2014F, 8.0389F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(26, 35).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 5.596F, 0.1102F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 95).addBox(-1.0F, -1.4F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 95).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 74).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 82).addBox(-5.134F, -1.2908F, -0.0148F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8843F, 6.5839F, -1.1852F, -0.5593F, 0.0408F, 1.3056F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(105, 110).addBox(-0.6516F, -3.0361F, 0.0673F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8843F, 6.5839F, -1.1852F, -0.2091F, -0.5643F, 0.0663F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 118).addBox(-0.5149F, -1.688F, -0.0273F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8843F, 6.5839F, -1.1852F, -0.3778F, -0.475F, 0.4035F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 105).addBox(0.5F, 0.0347F, -0.7619F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.4365F, 0.2629F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 119).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(93, 113).addBox(-0.5F, -3.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.2628F, 0.3126F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.074F, -3.6246F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 85).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.8543F, -2.8033F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 4).addBox(-1.0F, -0.423F, -1.8543F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -1.4535F, -1.2247F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -0.9173F, -0.4473F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 69).addBox(-0.5F, -6.0F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 5.9564F, -1.7987F, -0.2531F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7144F, -1.4208F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(23, 97).addBox(-2.0F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 119).addBox(-1.5515F, -3.989F, 0.0643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0384F, 4.1739F, 0.6861F, -1.4399F, 1.3526F, -1.5708F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 75).addBox(-2.0F, -1.875F, -0.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.4271F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 85).addBox(-2.5F, -5.2F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 80).addBox(-2.5F, -0.5F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.7023F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 106).addBox(-0.4515F, -3.6051F, -0.0301F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0384F, 4.1739F, 0.6861F, -1.501F, 1.3526F, -1.5708F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 106).addBox(-0.4485F, 0.9078F, 0.1993F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0384F, 4.1739F, 0.6861F, -1.693F, 1.3526F, -1.5708F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(43, 96).addBox(-1.5F, -2.15F, -0.75F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(16, 96).addBox(-2.5F, 1.1869F, -0.7332F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 10.1167F, -0.9736F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 123).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.7065F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 69).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(67, 34).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, -1.7753F, 1.3875F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(22, 57).addBox(-2.3F, -1.0F, -0.4F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(73, 32).addBox(-2.5F, -1.0F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 3.0473F, 0.9234F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 40).addBox(-1.0F, -2.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.8F, 1.6246F, 1.0716F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.0765F, 1.0456F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(50, 97).addBox(-0.7F, -3.4F, -0.575F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.6782F, 1.8557F, -1.0078F, -0.2809F, -0.2065F, -0.4096F));

		PartDefinition cube_r36 = leftLeg4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 69).addBox(-3.6391F, -1.9148F, 0.1596F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.1391F, 1.3553F, -1.6739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 5.596F, 0.1102F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -1.4F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(99, 101).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.081F, -1.1742F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 80).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.3318F, 0.0001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(91, 28).addBox(1.134F, -1.2908F, -0.0148F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8843F, 6.5839F, -1.1852F, -0.5593F, -0.0408F, -1.3056F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 112).addBox(-0.3484F, -3.0361F, 0.0673F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8843F, 6.5839F, -1.1852F, -0.2091F, 0.5643F, -0.0663F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(119, 0).addBox(-0.4851F, -1.688F, -0.0273F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8843F, 6.5839F, -1.1852F, -0.3778F, 0.475F, -0.4035F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(93, 105).addBox(-1.5F, 0.0347F, -0.7619F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4365F, 0.2629F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 121).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.1182F, -1.0942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(14, 118).addBox(-0.5F, -3.7F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.2628F, 0.3126F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(7, 118).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.074F, -3.6246F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 90).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.8543F, -2.8033F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(92, 36).addBox(-1.0F, -0.423F, -1.8543F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(25, 92).addBox(-1.0F, -1.4535F, -1.2247F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(61, 112).addBox(-0.5F, -0.9173F, -0.4473F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.7889F, -1.6315F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 74).addBox(-0.5F, -6.0F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 5.9564F, -1.7987F, -0.2531F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7144F, -1.4208F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(32, 102).addBox(0.0F, -0.1F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(121, 90).addBox(-0.4485F, -3.989F, 0.0643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0384F, 4.1739F, 0.6861F, -1.4399F, -1.3526F, 1.5708F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(81, 58).addBox(0.0F, -1.875F, -0.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.4271F, 0.2014F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(73, 92).addBox(0.5F, -5.2F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 92).addBox(0.5F, -0.5F, -0.7F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 1.7023F, -0.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(78, 112).addBox(-0.5485F, -3.6051F, -0.0301F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0384F, 4.1739F, 0.6861F, -1.501F, -1.3526F, 1.5708F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(73, 112).addBox(-0.5515F, 0.9078F, 0.1993F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.0384F, 4.1739F, 0.6861F, -1.693F, -1.3526F, 1.5708F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(102, 28).addBox(-0.5F, -2.15F, -0.75F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.9945F, -0.1342F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(16, 102).addBox(0.5F, 1.1869F, -0.7332F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 10.1167F, -0.9736F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(124, 68).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.7065F, 1.0594F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 126).addBox(0.0F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(126, 7).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3F, -1.7753F, 1.3875F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 47).addBox(-1.7F, -1.0F, -0.4F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(80, 27).addBox(-1.5F, -1.0F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.0473F, 0.9234F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 93).addBox(-2.0F, -2.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.8F, 1.6246F, 1.0716F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.0765F, 1.0456F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 102).addBox(-1.3F, -3.4F, -0.575F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.6782F, 1.8557F, -1.0078F, -0.2809F, 0.2065F, 0.4096F));

		PartDefinition cube_r66 = rightLeg4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 41).addBox(-0.3609F, -1.9148F, 0.1596F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.1391F, 1.3553F, -1.6739F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 4.5433F, 1.2457F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 85).addBox(-0.749F, -0.6375F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(33, 57).addBox(0.151F, -0.6375F, -1.1652F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7418F, -2.3528F, -3.0311F, -0.19F, 0.4363F, 1.7883F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 46).addBox(-0.749F, -0.0712F, -2.1984F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 31).addBox(0.151F, -0.0712F, -0.1984F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7418F, -2.3528F, -3.0311F, -0.0678F, 0.4363F, 1.7883F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 119).addBox(1.0694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0268F, -1.5948F, -0.1618F, 0.1817F, 0.5661F, 1.8367F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(79, 72).addBox(-0.2176F, -0.6905F, -0.3794F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7418F, -2.3528F, -3.0311F, -1.1486F, 0.9424F, -0.8608F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(52, 37).addBox(-2.507F, -0.4922F, -1.1038F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5316F, -5.2618F, -5.3941F, -2.5788F, 0.447F, -1.9181F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 4).addBox(-0.1F, -0.575F, -0.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4218F, -1.1541F, -1.0399F, -0.324F, -1.2859F, 1.4524F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(33, 68).addBox(-0.1F, -0.575F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4218F, -1.1541F, -1.0399F, -0.4247F, -1.0339F, 0.9958F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 28).addBox(-0.1F, -0.575F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4218F, -1.1541F, -1.0399F, -0.5975F, -1.1868F, 1.188F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(67, 24).addBox(-1.1F, -0.525F, 0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9069F, -0.9746F, -3.646F, -1.5365F, -1.0293F, 2.2827F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(41, 27).addBox(-2.1F, -0.35F, 0.6F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9576F, -1.7711F, -5.1498F, -1.6805F, -0.851F, 2.4929F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 19).addBox(-0.35F, -0.35F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5048F, -1.7921F, -6.4171F, -2.3246F, 0.4539F, -1.9279F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(26, 28).addBox(-0.1F, -0.35F, -3.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3762F, -1.9701F, -6.4595F, -1.8064F, 0.8313F, -1.1082F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(90, 74).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.359F, -0.6935F, -6.4211F, -1.1104F, 0.7503F, -0.1653F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(90, 69).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.3508F, -2.57F, -8.7653F, -0.7839F, 0.3813F, 0.4214F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5874F, -4.2523F, -9.5316F, -0.7887F, -0.3932F, 1.1448F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(23, 101).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2553F, -5.737F, -9.6759F, -1.6805F, -0.851F, 2.4929F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -1.0F, -5.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7538F, -7.3331F, -8.1141F, -2.3552F, -0.3875F, -2.7268F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(101, 16).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2889F, -7.6777F, -6.3694F, -2.0997F, -0.8086F, -3.0542F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(57, 68).addBox(-1.6326F, -0.4546F, -0.6383F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5316F, -5.2618F, -5.3941F, -2.5015F, -0.06F, -2.2076F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(72, 8).addBox(-1.2F, -0.625F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5496F, 0.7165F, 1.9903F, 0.1841F, 0.2559F, 2.2319F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(97, 55).addBox(-0.4602F, 0.0064F, -0.0916F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.583F, 0.3877F, 2.4027F, 0.4532F, 0.5372F, 2.3591F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(85, 90).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4681F, 2.0925F, 0.3155F, 1.1865F, 1.0991F, -2.9303F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 117).addBox(-0.5F, -1.175F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9332F, 1.7188F, 0.4478F, 1.1811F, 1.1249F, -2.7418F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(101, 36).addBox(0.0F, -0.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6263F, 2.9041F, 3.8775F, 1.9406F, 1.1287F, -1.9095F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(117, 120).addBox(-1.1F, -0.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0188F, 2.6517F, 1.369F, 2.5291F, 1.3807F, -1.2968F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(97, 51).addBox(-1.924F, 0.0064F, 0.3895F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.583F, 0.3877F, 2.4027F, 1.9209F, 1.1588F, -2.2183F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 4.5433F, 1.2457F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(-0.251F, -0.6375F, -0.1652F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(33, 57).mirror().addBox(-1.151F, -0.6375F, -1.1652F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7418F, -2.3528F, -3.0311F, -0.19F, -0.4363F, -1.7883F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.251F, -0.0712F, -2.1984F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 31).mirror().addBox(-1.151F, -0.0712F, -0.1984F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7418F, -2.3528F, -3.0311F, -0.0678F, -0.4363F, -1.7883F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(74, 119).mirror().addBox(-2.0694F, -0.3985F, -5.0014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.5948F, -0.1618F, 0.1817F, -0.5661F, -1.8367F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-3.7824F, -0.6905F, -0.3794F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7418F, -2.3528F, -3.0311F, -1.1486F, -0.9424F, 0.8608F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(-1.493F, -0.4922F, -1.1038F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5316F, -5.2618F, -5.3941F, -2.5788F, -0.447F, 1.9181F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-3.9F, -0.575F, -0.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4218F, -1.1541F, -1.0399F, -0.324F, 1.2859F, -1.4524F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-3.9F, -0.575F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4218F, -1.1541F, -1.0399F, -0.4247F, 1.0339F, -0.9958F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-3.9F, -0.575F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4218F, -1.1541F, -1.0399F, -0.5975F, 1.1868F, -1.188F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-2.9F, -0.525F, 0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9069F, -0.9746F, -3.646F, -1.5365F, 1.0293F, -2.2827F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-1.9F, -0.35F, 0.6F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9576F, -1.7711F, -5.1498F, -1.6805F, 0.851F, -2.4929F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-1.65F, -0.35F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5048F, -1.7921F, -6.4171F, -2.3246F, -0.4539F, 1.9279F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 28).mirror().addBox(-1.9F, -0.35F, -3.8F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3762F, -1.9701F, -6.4595F, -1.8064F, -0.8313F, 1.1082F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.359F, -0.6935F, -6.4211F, -1.1104F, -0.7503F, 0.1653F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(90, 69).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.3508F, -2.57F, -8.7653F, -0.7839F, -0.3813F, -0.4214F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5874F, -4.2523F, -9.5316F, -0.7887F, 0.3932F, -1.1448F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(23, 101).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2553F, -5.737F, -9.6759F, -1.6805F, 0.851F, -2.4929F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.0F, -1.0F, -5.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7538F, -7.3331F, -8.1141F, -2.3552F, 0.3875F, 2.7268F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 16).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2889F, -7.6777F, -6.3694F, -2.0997F, 0.8086F, 3.0542F));

		PartDefinition cube_r111 = bone4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-2.3674F, -0.4546F, -0.6383F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5316F, -5.2618F, -5.3941F, -2.5015F, 0.06F, 2.2076F));

		PartDefinition cube_r112 = bone4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.8F, -0.625F, -2.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5496F, 0.7165F, 1.9903F, 0.1841F, -0.2559F, -2.2319F));

		PartDefinition cube_r113 = bone4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(97, 55).mirror().addBox(-1.5398F, 0.0064F, -0.0916F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.583F, 0.3877F, 2.4027F, 0.4532F, -0.5372F, -2.3591F));

		PartDefinition cube_r114 = bone4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4681F, 2.0925F, 0.3155F, 1.1865F, -1.0991F, 2.9303F));

		PartDefinition cube_r115 = bone4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(60, 117).mirror().addBox(-0.5F, -1.175F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9332F, 1.7188F, 0.4478F, 1.1811F, -1.1249F, 2.7418F));

		PartDefinition cube_r116 = bone4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 36).mirror().addBox(-2.0F, -0.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6263F, 2.9041F, 3.8775F, 1.9406F, -1.1287F, 1.9095F));

		PartDefinition cube_r117 = bone4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(117, 120).mirror().addBox(-0.9F, -0.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0188F, 2.6517F, 1.369F, 2.5291F, -1.3807F, 1.2968F));

		PartDefinition cube_r118 = bone4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-0.076F, 0.0064F, 0.3895F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.583F, 0.3877F, 2.4027F, 1.9209F, -1.1588F, 2.2183F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(75, 87).addBox(0.0F, -2.2354F, -0.1789F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6548F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 107).addBox(0.0F, -2.4589F, 0.0958F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.347F, -4.8381F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(54, 74).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8171F, -2.8061F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2533F, 0.0996F, -0.3365F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(51, 25).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8375F, -0.7612F, -4.302F, -0.2521F, 0.0151F, -0.3147F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-1.8F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6004F, -0.2439F, 0.1211F, -0.2514F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(105, 83).addBox(-0.2F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6004F, -0.2439F, -0.1211F, 0.2514F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(51, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8375F, -0.7612F, -4.302F, -0.2521F, -0.0151F, 0.3147F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(42, 11).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2533F, -0.0996F, 0.3365F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2532F, -0.0872F, 0.0038F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(106, 124).addBox(0.0F, -2.8408F, 0.0224F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 108).addBox(0.0F, -2.7193F, -0.1646F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1423F, -3.935F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(119, 98).mirror().addBox(-1.736F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2369F, -1.6803F, -0.2482F, 0.2181F, -0.448F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(32, 100).mirror().addBox(-3.66F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.567F, -3.6528F, -0.0561F, 0.4113F, -0.1936F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-9.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.567F, -3.6528F, -0.1658F, 0.3821F, -0.4759F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(82, 105).mirror().addBox(-11.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.567F, -3.6528F, -0.3476F, 0.2314F, -1.0605F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(123, 32).mirror().addBox(-10.3118F, -9.9262F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.567F, -3.6528F, -0.4066F, 0.0851F, -1.4299F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(119, 98).addBox(-0.264F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2369F, -1.6803F, -0.2482F, -0.2181F, 0.448F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(32, 100).addBox(-0.34F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.567F, -3.6528F, -0.0561F, -0.4113F, 0.1936F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 60).addBox(3.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.567F, -3.6528F, -0.1658F, -0.3821F, 0.4759F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 105).addBox(7.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.567F, -3.6528F, -0.3476F, -0.2314F, 1.0605F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(123, 32).addBox(8.3118F, -9.9262F, -0.5163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.567F, -3.6528F, -0.4066F, -0.0851F, 1.4299F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(100, 22).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7651F, -2.2868F, 0.1902F, 0.4488F, -0.1255F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7651F, -2.2868F, 0.059F, 0.4816F, -0.4163F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7651F, -2.2868F, -0.2314F, 0.43F, -1.0575F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(-12.3118F, -9.9262F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7651F, -2.2868F, -0.3788F, 0.3103F, -1.4594F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(113, 48).mirror().addBox(-11.3118F, -9.9262F, -0.5162F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2651F, -0.2868F, -0.3868F, 0.2409F, -1.4441F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2651F, -0.2868F, -0.2681F, 0.3689F, -1.0544F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2651F, -0.2868F, -0.012F, 0.4523F, -0.4309F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(100, 26).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2651F, -0.2868F, 0.1136F, 0.4389F, -0.1409F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(100, 26).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2651F, -0.2868F, 0.1136F, -0.4389F, 0.1409F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 66).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2651F, -0.2868F, -0.012F, -0.4523F, 0.4309F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(105, 81).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2651F, -0.2868F, -0.2681F, -0.3689F, 1.0544F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(113, 48).addBox(8.3118F, -9.9262F, -0.5162F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2651F, -0.2868F, -0.3868F, -0.2409F, 1.4441F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(100, 22).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7651F, -2.2868F, 0.1902F, -0.4488F, 0.1255F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(33, 66).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7651F, -2.2868F, 0.059F, -0.4816F, 0.4163F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(105, 79).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7651F, -2.2868F, -0.2314F, -0.43F, 1.0575F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(100, 24).addBox(8.3118F, -9.9262F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7651F, -2.2868F, -0.3788F, -0.3103F, 1.4594F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(57, 48).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(49, 123).addBox(0.0F, -3.1611F, -0.1182F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(10, 122).addBox(0.0F, -3.3088F, 0.0394F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(57, 54).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(38, 124).addBox(0.0F, -3.4745F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(123, 62).addBox(0.0F, -3.6501F, 0.0278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(99, 77).mirror().addBox(-3.66F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.0717F, 0.3965F, -0.2858F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(33, 64).mirror().addBox(-9.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.1762F, 0.3639F, -0.5657F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 105).mirror().addBox(-11.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.3455F, 0.2108F, -1.1461F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-14.3118F, -9.9262F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.3973F, 0.0667F, -1.5153F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-13.3118F, -9.9262F, -0.5162F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4155F, -0.3973F, 0.0667F, -1.4978F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(71, 105).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4155F, -0.3455F, 0.2108F, -1.1286F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4155F, -0.1762F, 0.3639F, -0.5482F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(83, 99).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4155F, -0.0717F, 0.3965F, -0.2684F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(83, 99).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4155F, -0.0717F, -0.3965F, 0.2684F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(65, 39).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4155F, -0.1762F, -0.3639F, 0.5482F));

		PartDefinition cube_r173 = body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(71, 105).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4155F, -0.3455F, -0.2108F, 1.1286F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 21).addBox(8.3118F, -9.9262F, -0.5162F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4155F, -0.3973F, -0.0667F, 1.4978F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(99, 77).addBox(-0.34F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.0717F, -0.3965F, 0.2858F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(33, 64).addBox(3.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.1762F, -0.3639F, 0.5657F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(60, 105).addBox(7.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.3455F, -0.2108F, 1.1461F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 37).addBox(8.3118F, -9.9262F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.3973F, -0.0667F, 1.5153F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(44, 58).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 123).addBox(0.0F, -4.0745F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(93, 119).addBox(0.0F, -4.8501F, 0.0278F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(99, 73).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4156F, -0.1786F, 0.3632F, -0.3429F));

		PartDefinition cube_r182 = body5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4156F, -0.2678F, 0.3049F, -0.6132F));

		PartDefinition cube_r183 = body5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4156F, -0.3872F, 0.1145F, -1.1703F));

		PartDefinition cube_r184 = body5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(27, 16).mirror().addBox(-16.3118F, -9.9262F, -0.5162F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4156F, -0.4013F, -0.038F, -1.5328F));

		PartDefinition cube_r185 = body5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(46, 17).mirror().addBox(-15.3118F, -9.9262F, -0.5162F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.4019F, -0.0554F, -1.524F));

		PartDefinition cube_r186 = body5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.3941F, 0.0985F, -1.1623F));

		PartDefinition cube_r187 = body5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.2827F, 0.2948F, -0.6089F));

		PartDefinition cube_r188 = body5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(99, 75).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.1962F, 0.3573F, -0.3404F));

		PartDefinition cube_r189 = body5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(99, 75).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.1962F, -0.3573F, 0.3404F));

		PartDefinition cube_r190 = body5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 22).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.2827F, -0.2948F, 0.6089F));

		PartDefinition cube_r191 = body5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(103, 93).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.3941F, -0.0985F, 1.1623F));

		PartDefinition cube_r192 = body5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(46, 17).addBox(8.3118F, -9.9262F, -0.5162F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.4019F, 0.0554F, 1.524F));

		PartDefinition cube_r193 = body5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(99, 73).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4156F, -0.1786F, -0.3632F, 0.3429F));

		PartDefinition cube_r194 = body5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(64, 20).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4156F, -0.2678F, -0.3049F, 0.6132F));

		PartDefinition cube_r195 = body5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(103, 20).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4156F, -0.3872F, -0.1145F, 1.1703F));

		PartDefinition cube_r196 = body5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(27, 16).addBox(8.3118F, -9.9262F, -0.5162F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4156F, -0.4013F, 0.038F, 1.5328F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(52, 112).addBox(0.0F, -5.7745F, 0.0098F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body6.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(53, 103).addBox(0.0F, -6.6501F, 0.0278F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body6.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-3.66F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.3453F, 0.2887F, -0.4488F));

		PartDefinition cube_r200 = body6.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-9.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.4054F, 0.1922F, -0.6996F));

		PartDefinition cube_r201 = body6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(102, 34).mirror().addBox(-11.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.4437F, -0.0506F, -1.2245F));

		PartDefinition cube_r202 = body6.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-15.3118F, -9.9262F, -0.5163F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -2.4155F, -0.3956F, -0.2124F, -1.5859F));

		PartDefinition cube_r203 = body6.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.3742F, 0.2168F, -0.6583F));

		PartDefinition cube_r204 = body6.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(23, 11).mirror().addBox(-16.3118F, -9.9262F, -0.5162F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.3955F, -0.1732F, -1.551F));

		PartDefinition cube_r205 = body6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(102, 48).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.4297F, -0.014F, -1.19F));

		PartDefinition cube_r206 = body6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(72, 99).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.4156F, -0.3079F, 0.3049F, -0.403F));

		PartDefinition cube_r207 = body6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(72, 99).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.3079F, -0.3049F, 0.403F));

		PartDefinition cube_r208 = body6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(102, 48).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.4297F, 0.014F, 1.19F));

		PartDefinition cube_r209 = body6.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(23, 11).addBox(8.3118F, -9.9262F, -0.5162F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.3955F, 0.1732F, 1.551F));

		PartDefinition cube_r210 = body6.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(64, 18).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.4156F, -0.3742F, -0.2168F, 0.6583F));

		PartDefinition cube_r211 = body6.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(99, 71).addBox(-0.34F, -0.0036F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.3453F, -0.2887F, 0.4488F));

		PartDefinition cube_r212 = body6.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(63, 16).addBox(3.5341F, -0.9507F, -0.5163F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.4054F, -0.1922F, 0.6996F));

		PartDefinition cube_r213 = body6.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(102, 34).addBox(7.4778F, -5.9898F, -0.5163F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.4437F, 0.0506F, 1.2245F));

		PartDefinition cube_r214 = body6.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(46, 2).addBox(8.3118F, -9.9262F, -0.5163F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -2.4155F, -0.3956F, 0.2124F, 1.5859F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(55, 60).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body7.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(57, 97).addBox(0.0F, -7.6745F, 0.0098F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(63, 79).addBox(0.0F, -8.8501F, 0.0278F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body7.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-13.3543F, -9.892F, -0.6001F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2395F, -2.4155F, -0.39F, -0.3869F, -1.6136F));

		PartDefinition cube_r218 = body7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-9.53F, -0.8963F, -0.6001F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2395F, -2.4155F, -0.5374F, 0.0766F, -0.7434F));

		PartDefinition cube_r219 = body7.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-3.642F, 0.048F, -0.6001F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2395F, -2.4155F, -0.5047F, 0.2075F, -0.5142F));

		PartDefinition cube_r220 = body7.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-11.504F, -5.9419F, -0.6001F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2395F, -2.4155F, -0.5016F, -0.2155F, -1.2429F));

		PartDefinition cube_r221 = body7.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-14.3118F, -9.9262F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.5156F, -0.3902F, -0.3694F, -1.6049F));

		PartDefinition cube_r222 = body7.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-11.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.5156F, -0.4953F, -0.1992F, -1.2355F));

		PartDefinition cube_r223 = body7.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-9.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.5156F, -0.5241F, 0.0879F, -0.7336F));

		PartDefinition cube_r224 = body7.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(99, 69).mirror().addBox(-3.66F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2145F, -0.5156F, -0.4889F, 0.2155F, -0.5022F));

		PartDefinition cube_r225 = body7.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(99, 69).addBox(-0.34F, -0.0036F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.5156F, -0.4889F, -0.2155F, 0.5022F));

		PartDefinition cube_r226 = body7.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(63, 2).addBox(3.5341F, -0.9507F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.5156F, -0.5241F, -0.0879F, 0.7336F));

		PartDefinition cube_r227 = body7.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(101, 10).addBox(7.4778F, -5.9898F, -0.5162F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.5156F, -0.4953F, 0.1992F, 1.2355F));

		PartDefinition cube_r228 = body7.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(58, 32).addBox(8.3118F, -9.9262F, -0.5162F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2145F, -0.5156F, -0.3902F, 0.3694F, 1.6049F));

		PartDefinition cube_r229 = body7.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(97, 59).addBox(-0.358F, 0.048F, -0.6001F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2395F, -2.4155F, -0.5047F, -0.2075F, 0.5142F));

		PartDefinition cube_r230 = body7.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 0).addBox(3.53F, -0.8963F, -0.6001F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2395F, -2.4155F, -0.5374F, -0.0766F, 0.7434F));

		PartDefinition cube_r231 = body7.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(92, 20).addBox(7.504F, -5.9419F, -0.6001F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2395F, -2.4155F, -0.5016F, 0.2155F, 1.2429F));

		PartDefinition cube_r232 = body7.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 0).addBox(8.3543F, -9.892F, -0.6001F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2395F, -2.4155F, -0.39F, 0.3869F, 1.6136F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0536F, -3.8395F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(21, 74).addBox(0.0F, -9.8226F, -0.0168F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(66, 72).addBox(0.0F, -10.1222F, -0.0133F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(48, 42).addBox(-1.9773F, -0.9107F, -0.3024F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9773F, 16.396F, -1.9743F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(0.3F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.3033F, 15.9722F, 10.5488F, -0.534F, 0.7748F, 0.1089F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.3F, 0.0F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.4124F, 15.2043F, 12.4829F, -0.4609F, 0.8134F, 0.1683F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(0.3F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0335F, 15.9126F, 8.6836F, -0.5015F, 0.7339F, 0.1073F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(21, 18).mirror().addBox(0.0F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.432F, 15.3458F, 6.1629F, -0.4241F, 0.6349F, 0.1391F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(23, 2).mirror().addBox(0.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1131F, 14.6813F, 3.8144F, -0.327F, 0.5425F, 0.1858F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(29, 13).mirror().addBox(0.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7333F, 13.3452F, -1.5177F, -0.2502F, 0.1973F, 0.2849F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(41, 32).mirror().addBox(-0.3F, 0.0F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6885F, 12.6121F, -3.4116F, -0.115F, 0.0866F, 0.2221F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(23, 9).mirror().addBox(-6.0279F, -0.0372F, 1.6682F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3712F, 14.9454F, -2.6229F, -0.1699F, 0.4162F, 0.2347F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(0.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.3607F, 14.0218F, 0.0271F, -0.2493F, 0.2084F, 0.251F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-3.6781F, -0.0551F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3608F, -0.276F, -0.4425F, 0.2419F, -0.5353F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-9.5382F, -1.0051F, -0.4324F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3608F, -0.276F, -0.486F, 0.1241F, -0.7732F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 2).mirror().addBox(-11.4516F, -6.0377F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3608F, -0.276F, -0.4795F, -0.1492F, -1.2818F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(101, 4).mirror().addBox(-12.2692F, -9.9604F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3608F, -0.276F, -0.3938F, -0.3172F, -1.6473F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(-3.6781F, -0.0551F, -0.4324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6608F, -2.576F, -0.4114F, 0.2596F, -0.5275F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-9.5382F, -1.0051F, -0.4324F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6608F, -2.576F, -0.4608F, 0.1485F, -0.7698F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(-11.4516F, -6.0377F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6608F, -2.576F, -0.4694F, -0.1157F, -1.2831F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(111, 46).mirror().addBox(-11.2693F, -9.9604F, -0.4324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6608F, -2.576F, -0.3966F, -0.2824F, -1.6464F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(33, 0).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3607F, 14.0218F, 0.0271F, -0.2493F, -0.2084F, -0.251F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(23, 9).addBox(-2.9721F, -0.0372F, 1.6682F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3712F, 14.9454F, -2.6229F, -0.1699F, -0.4162F, -0.2347F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 25).addBox(-2.1131F, 2.3701F, -2.7091F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1131F, 11.419F, -3.0389F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(41, 32).addBox(-6.7F, 0.0F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6885F, 12.6121F, -3.4116F, -0.115F, -0.0866F, -0.2221F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(29, 13).addBox(-8.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7333F, 13.3452F, -1.5177F, -0.2502F, -0.1973F, -0.2849F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(98, 105).addBox(-1.0F, 2.9007F, -0.2937F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.23F, -1.6767F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(23, 2).addBox(-10.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1131F, 14.6813F, 3.8144F, -0.327F, -0.5425F, -0.1858F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(21, 18).addBox(-11.0F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.432F, 15.3458F, 6.1629F, -0.4241F, -0.6349F, -0.1391F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 16).addBox(-12.3F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0335F, 15.9126F, 8.6836F, -0.5015F, -0.7339F, -0.1073F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 0).addBox(-15.3F, 0.0F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.4124F, 15.2043F, 12.4829F, -0.4609F, -0.8134F, -0.1683F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 14).addBox(-13.3F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.3033F, 15.9722F, 10.5488F, -0.534F, -0.7748F, -0.1089F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(111, 46).addBox(8.2692F, -9.9604F, -0.4324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.6608F, -2.576F, -0.3966F, 0.2824F, 1.6464F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(101, 6).addBox(7.4516F, -6.0377F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.6608F, -2.576F, -0.4694F, 0.1157F, 1.2831F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(63, 66).addBox(3.5382F, -1.0051F, -0.4324F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.6608F, -2.576F, -0.4608F, -0.1485F, 0.7698F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(114, 93).addBox(0.6781F, -0.0551F, -0.4324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.6608F, -2.576F, -0.4114F, -0.2596F, 0.5275F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(101, 0).addBox(-0.3219F, -0.0551F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3608F, -0.276F, -0.4425F, -0.2419F, 0.5353F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 62).addBox(3.5382F, -1.0051F, -0.4324F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3608F, -0.276F, -0.486F, -0.1241F, 0.7732F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(101, 2).addBox(7.4516F, -6.0377F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3608F, -0.276F, -0.4795F, 0.1492F, 1.2818F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 4).addBox(8.2692F, -9.9604F, -0.4324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3608F, -0.276F, -0.3938F, 0.3172F, 1.6473F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 4).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(42, 113).addBox(0.0F, -6.0489F, -0.0609F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(24, 74).addBox(0.0F, -9.3489F, 0.0391F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 93).mirror().addBox(-1.9303F, -0.0031F, -0.3803F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1495F, -0.7211F, -0.8291F, -0.0018F, -0.6174F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-7.8635F, -0.5025F, -0.3803F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1495F, -0.7211F, -0.8115F, -0.1937F, -0.7965F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(101, 8).mirror().addBox(-10.3208F, -4.7041F, -0.3803F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1495F, -0.7211F, -0.6295F, -0.5813F, -1.2618F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(120, 123).mirror().addBox(-9.7348F, -8.2956F, -0.3803F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1495F, -0.7211F, -0.3472F, -0.7693F, -1.7069F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(123, 93).addBox(-0.0697F, -0.0031F, -0.3803F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1495F, -0.7211F, -0.8291F, 0.0018F, 0.6174F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(66, 64).addBox(1.8635F, -0.5025F, -0.3803F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1495F, -0.7211F, -0.8115F, 0.1937F, 0.7965F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(101, 8).addBox(6.3208F, -4.7041F, -0.3803F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1495F, -0.7211F, -0.6295F, 0.5813F, 1.2618F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(120, 123).addBox(7.7348F, -8.2956F, -0.3803F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1495F, -0.7211F, -0.3472F, 0.7693F, 1.7069F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(54, 85).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1975F, 4.4288F, -5.5793F, -0.0202F, 0.1296F, -0.0892F));

		PartDefinition cube_r284 = leftarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(117, 87).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(114, 60).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(110, 119).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(123, 10).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(119, 95).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(122, 46).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -1.5F, -2.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.2968F, 0.0014F, -0.001F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(61, 10).addBox(-1.0F, -1.0F, -1.175F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.5586F, 0.0009F, -0.0014F));

		PartDefinition cube_r290 = leftarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5F, -2.8F, -0.95F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.7652F, -0.1244F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, 0.025F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(124, 0).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5861F, 2.519F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(60, 97).addBox(-0.5F, -4.5F, 0.65F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(55, 114).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.0027F, 2.5598F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftarm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(117, 68).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -2.8408F, -0.1372F, -1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r296 = leftarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(101, 40).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1764F, -1.962F, -0.6144F, 1.5708F, 1.0734F, -1.5708F));

		PartDefinition cube_r297 = leftarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(9, 94).addBox(-0.2F, -2.05F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -1.1086F, 0.288F, -1.5708F, 1.4573F, 1.5708F));

		PartDefinition cube_r298 = leftarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(70, 123).addBox(-0.575F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3236F, -2.2268F, 1.0216F, -1.5708F, 1.4573F, 1.5708F));

		PartDefinition cube_r299 = leftarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(5, 127).addBox(-0.2028F, -1.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.2776F, 1.5708F, -0.1047F, -1.5708F));

		PartDefinition cube_r300 = leftarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 98).addBox(-1.175F, -1.375F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -0.2691F, 0.5142F, 1.5708F, -0.3229F, -1.5708F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(56, 107).addBox(-0.1201F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3236F, -1.389F, 0.0776F, -1.5708F, -1.5097F, 1.5708F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(98, 114).addBox(-0.609F, 0.0281F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3236F, 4.2019F, 0.1928F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(86, 122).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 5.6592F, -1.74F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(106, 50).addBox(-1.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 0.8922F, -0.7512F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r305 = leftarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 120).addBox(-0.025F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3236F, 5.2035F, -0.9518F, 1.5708F, -1.3788F, -1.5708F));

		PartDefinition cube_r306 = leftarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(97, 61).addBox(-1.15F, -3.4F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.6387F, 0.2231F, -1.5708F, -1.5446F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 8.3947F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftArm3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(72, 13).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftArm3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(107, 12).addBox(-1.9F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0457F, -0.3051F, -0.0138F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1722F, -0.2105F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftArm4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -2.1F, -0.7F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 2.3601F, 0.1092F, 0.0411F, -0.3027F, -0.1372F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0765F, 4.2923F, 0.7328F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftArm5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(61, 107).addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3792F, 1.7195F, -2.7027F, -0.8531F, -0.4081F, -0.3084F));

		PartDefinition cube_r311 = leftArm5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 85).addBox(-1.5765F, -0.8029F, -0.5191F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -1.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1975F, 4.4288F, -5.5793F, -0.4928F, -0.041F, 0.1626F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(118, 43).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(118, 22).addBox(-1.0F, -1.3285F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(121, 104).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightarm.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(123, 29).addBox(-1.0F, -0.7306F, -0.6847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(103, 121).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(123, 26).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 8.9436F, 1.8751F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightarm.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(44, 4).addBox(-1.0F, -1.5F, -2.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.2968F, -0.0014F, 0.001F));

		PartDefinition cube_r317 = rightarm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(68, 53).addBox(-1.0F, -1.0F, -1.175F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.5586F, -0.0009F, 0.0014F));

		PartDefinition cube_r318 = rightarm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(94, 5).addBox(-0.5F, -2.8F, -0.95F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.7652F, -0.1244F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightarm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(83, 112).addBox(-0.5F, 0.025F, 0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightarm.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(124, 72).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5861F, 2.519F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightarm.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(102, 61).addBox(-0.5F, -4.5F, 0.65F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightarm.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(19, 118).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.0027F, 2.5598F, -0.8176F, 0.013F, 0.0166F));

		PartDefinition cube_r323 = rightarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(118, 39).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -2.8408F, -0.1372F, -1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r324 = rightarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(103, 85).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1764F, -1.962F, -0.6144F, 1.5708F, -1.0734F, 1.5708F));

		PartDefinition cube_r325 = rightarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(95, 45).addBox(-0.8F, -2.05F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -1.1086F, 0.288F, -1.5708F, -1.4573F, -1.5708F));

		PartDefinition cube_r326 = rightarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(80, 124).addBox(-0.425F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3236F, -2.2268F, 1.0216F, -1.5708F, -1.4573F, -1.5708F));

		PartDefinition cube_r327 = rightarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(41, 127).addBox(-0.7972F, -1.8199F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.2776F, 1.5708F, 0.1047F, 1.5708F));

		PartDefinition cube_r328 = rightarm2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(102, 44).addBox(-1.825F, -1.375F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, -0.2691F, 0.5142F, 1.5708F, 0.3229F, 1.5708F));

		PartDefinition cube_r329 = rightarm2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 112).addBox(-0.8799F, 1.5365F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3236F, -1.389F, 0.0776F, -1.5708F, 1.5097F, -1.5708F));

		PartDefinition cube_r330 = rightarm2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(24, 118).addBox(-0.391F, 0.0281F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3236F, 4.2019F, 0.1928F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r331 = rightarm2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(110, 122).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7764F, 5.6592F, -1.74F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r332 = rightarm2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(112, 83).addBox(0.0292F, -0.1611F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7764F, 0.8922F, -0.7512F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r333 = rightarm2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(5, 122).addBox(-0.975F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3236F, 5.2035F, -0.9518F, 1.5708F, 1.3788F, 1.5708F));

		PartDefinition cube_r334 = rightarm2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(48, 103).addBox(0.15F, -3.4F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.6387F, 0.2231F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 8.3947F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArm3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(62, 126).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightArm3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(112, 90).addBox(-1.1F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0457F, 0.3051F, 0.0138F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1722F, -0.2105F, -0.2107F, 0.0027F, -0.0102F));

		PartDefinition cube_r337 = rightArm4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(69, 81).addBox(-2.5F, -2.1F, -0.7F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 2.3601F, 0.1092F, 0.0411F, 0.3027F, 0.1372F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0765F, 4.2923F, 0.7328F, 0.2867F, 0.085F, -0.092F));

		PartDefinition cube_r338 = rightArm5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(112, 95).addBox(-2.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3792F, 1.7195F, -2.7027F, -0.8531F, 0.4081F, 0.3084F));

		PartDefinition cube_r339 = rightArm5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(93, 31).addBox(-1.4235F, -0.8029F, -0.5191F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -1.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9082F, 3.8271F, -4.0787F, -0.3043F, -0.0262F, -0.0832F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(15, 28).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0782F, -3.2645F, 7.9859F, -1.1042F, 0.169F, -0.3803F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(78, 79).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.203F, -4.3475F, 9.6626F, -2.5877F, 0.169F, -0.3803F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(24, 49).addBox(-0.5F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5274F, -8.3487F, 11.1582F, 1.6883F, 0.169F, -0.3803F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(110, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2893F, -9.6514F, 9.8458F, 0.7284F, 0.169F, -0.3803F));

		PartDefinition cube_r344 = bone2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(65, 99).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.8933F, -10.3463F, 8.0703F, -0.4497F, 0.169F, -0.3803F));

		PartDefinition cube_r345 = bone2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(117, 55).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0545F, -10.2963F, 7.0847F, -1.5842F, 0.169F, -0.3803F));

		PartDefinition cube_r346 = bone2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(48, 48).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.9721F, -8.8759F, 4.4435F, -2.675F, 0.169F, -0.3803F));

		PartDefinition cube_r347 = bone2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(59, 90).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0471F, 0.2611F, 0.9993F, 2.2468F, 0.169F, -0.3803F));

		PartDefinition cube_r348 = bone2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 57).addBox(-0.5F, -2.0F, -1.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9977F, -2.063F, 0.3691F, 2.6832F, 0.169F, -0.3803F));

		PartDefinition cube_r349 = bone2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(52, 90).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7618F, -3.3773F, -0.9304F, -0.8511F, 0.169F, -0.3803F));

		PartDefinition cube_r350 = bone2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(110, 74).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3153F, -5.1272F, -0.1359F, -0.4148F, 0.169F, -0.3803F));

		PartDefinition cube_r351 = bone2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(14, 113).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.6672F, -6.6055F, 1.1644F, 0.8506F, 0.169F, -0.3803F));

		PartDefinition cube_r352 = bone2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(13, 39).addBox(-0.5F, -2.0F, -2.325F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1573F, -6.5053F, 3.7209F, 2.1596F, 0.169F, -0.3803F));

		PartDefinition cube_r353 = bone2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(114, 104).addBox(-2.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8383F, -1.2595F, -0.9F, 1.6098F, 0.169F, -0.3803F));

		PartDefinition cube_r354 = bone2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(107, 61).addBox(-1.5272F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, -2.2851F, 3.2751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r355 = bone2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(98, 12).addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6011F, -1.9371F, 3.1938F, 0.8565F, -0.9774F, -0.0505F));

		PartDefinition cube_r356 = bone2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(92, 41).addBox(-1.8F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4176F, -1.7312F, 3.3118F, 0.4297F, 0.3354F, 0.8775F));

		PartDefinition cube_r357 = bone2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(96, 120).addBox(-1.0F, -0.2F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2047F, -3.0185F, 2.9095F, 0.4044F, -0.0244F, 0.7174F));

		PartDefinition cube_r358 = bone2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(80, 0).addBox(-1.85F, -0.5F, -0.775F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.123F, -4.5467F, 5.8296F, 0.4892F, -0.5789F, 0.4444F));

		PartDefinition cube_r359 = bone2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 36).addBox(-2.2F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.123F, -4.5467F, 5.8296F, 0.6934F, -0.9079F, 0.1479F));

		PartDefinition cube_r360 = bone2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(103, 89).addBox(-0.2F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2047F, -3.0185F, 2.9095F, 0.4892F, -0.5789F, 0.4444F));

		PartDefinition cube_r361 = bone2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 2).addBox(-0.9F, -0.5F, -4.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2178F, -3.4096F, 3.8533F, 0.6457F, -0.3894F, 0.112F));

		PartDefinition bone3 = neck2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9082F, 3.8271F, -4.0787F, -0.3043F, 0.0262F, 0.0832F));

		PartDefinition cube_r362 = bone3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0782F, -3.2645F, 7.9859F, -1.1042F, -0.169F, 0.3803F));

		PartDefinition cube_r363 = bone3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(78, 79).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.203F, -4.3475F, 9.6626F, -2.5877F, -0.169F, 0.3803F));

		PartDefinition cube_r364 = bone3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(24, 49).mirror().addBox(-0.5F, -3.0F, -4.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5274F, -8.3487F, 11.1582F, 1.6883F, -0.169F, 0.3803F));

		PartDefinition cube_r365 = bone3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(110, 69).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.2893F, -9.6514F, 9.8458F, 0.7284F, -0.169F, 0.3803F));

		PartDefinition cube_r366 = bone3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.8933F, -10.3463F, 8.0703F, -0.4497F, -0.169F, 0.3803F));

		PartDefinition cube_r367 = bone3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.0545F, -10.2963F, 7.0847F, -1.5842F, -0.169F, 0.3803F));

		PartDefinition cube_r368 = bone3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(48, 48).mirror().addBox(-0.5F, -6.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.9721F, -8.8759F, 4.4435F, -2.675F, -0.169F, 0.3803F));

		PartDefinition cube_r369 = bone3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(59, 90).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0471F, 0.2611F, 0.9993F, 2.2468F, -0.169F, 0.3803F));

		PartDefinition cube_r370 = bone3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 57).mirror().addBox(-0.5F, -2.0F, -1.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9977F, -2.063F, 0.3691F, 2.6832F, -0.169F, 0.3803F));

		PartDefinition cube_r371 = bone3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7618F, -3.3773F, -0.9304F, -0.8511F, -0.169F, 0.3803F));

		PartDefinition cube_r372 = bone3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(110, 74).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3153F, -5.1272F, -0.1359F, -0.4148F, -0.169F, 0.3803F));

		PartDefinition cube_r373 = bone3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(14, 113).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.6672F, -6.6055F, 1.1644F, 0.8506F, -0.169F, 0.3803F));

		PartDefinition cube_r374 = bone3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(-0.5F, -2.0F, -2.325F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1573F, -6.5053F, 3.7209F, 2.1596F, -0.169F, 0.3803F));

		PartDefinition cube_r375 = bone3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(114, 104).mirror().addBox(0.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8383F, -1.2595F, -0.9F, 1.6098F, -0.169F, 0.3803F));

		PartDefinition cube_r376 = bone3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-0.4728F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, -2.2851F, 3.2751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r377 = bone3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6011F, -1.9371F, 3.1938F, 0.8565F, 0.9774F, 0.0505F));

		PartDefinition cube_r378 = bone3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-0.2F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4176F, -1.7312F, 3.3118F, 0.4297F, -0.3354F, -0.8775F));

		PartDefinition cube_r379 = bone3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(96, 120).mirror().addBox(-1.0F, -0.2F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2047F, -3.0185F, 2.9095F, 0.4044F, 0.0244F, -0.7174F));

		PartDefinition cube_r380 = bone3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-1.15F, -0.5F, -0.775F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.123F, -4.5467F, 5.8296F, 0.4892F, 0.5789F, -0.4444F));

		PartDefinition cube_r381 = bone3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-0.8F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.123F, -4.5467F, 5.8296F, 0.6934F, 0.9079F, -0.1479F));

		PartDefinition cube_r382 = bone3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(103, 89).mirror().addBox(-1.8F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2047F, -3.0185F, 2.9095F, 0.4892F, 0.5789F, -0.4444F));

		PartDefinition cube_r383 = bone3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-0.1F, -0.5F, -4.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2178F, -3.4096F, 3.8533F, 0.6457F, 0.3894F, -0.112F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.2548F, -0.128F, 0.0274F));

		PartDefinition cube_r384 = neck.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(41, 121).addBox(0.0F, -4.0828F, -0.0159F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(16, 86).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(43, 86).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.3246F, -0.0299F, 0.054F));

		PartDefinition cube_r386 = neck3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(70, 127).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(46, 127).addBox(0.0F, -2.8F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0125F, -2.9567F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(98, 79).addBox(0.0F, -0.5F, -1.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2759F, -3.9889F, -0.4302F, -0.1312F, 0.1513F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(52, 34).addBox(-3.0F, -0.9F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5816F, -1.8861F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(23, 4).addBox(-4.0F, -0.6F, -0.975F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.5909F, -1.3405F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(79, 17).addBox(-3.0F, -2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5254F, -0.0919F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(78, 75).addBox(-3.0F, -1.0F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0876F, -1.3552F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(48, 11).addBox(-1.575F, -1.525F, -1.65F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.075F, 1.6408F, -1.438F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(21, 20).addBox(-1.575F, -3.2F, -0.975F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.075F, 5.5099F, -2.7944F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(81, 101).addBox(-1.0F, -1.9F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 11.325F, -11.0708F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(108, 57).addBox(-1.0F, -0.45F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 10.9149F, -11.4234F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(80, 23).addBox(-1.5F, -1.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F))
				.texOffs(78, 13).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 10.2078F, -11.3113F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(110, 115).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 9.5028F, -11.5081F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(37, 42).addBox(-1.5F, -4.875F, -0.525F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9894F, -9.2306F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -1.8328F, -1.8623F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.8276F, -10.0751F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(11, 63).addBox(-0.8F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(61, 41).addBox(-0.3F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.0829F, -11.9475F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(72, 101).addBox(-1.504F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.004F, 1.6396F, -9.4428F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(117, 83).addBox(-0.604F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.396F, 3.0904F, -10.8195F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(124, 113).addBox(-0.104F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.396F, 3.8784F, -11.4352F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(43, 91).addBox(-1.0F, -1.0F, -1.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 7.0644F, -11.1194F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(90, 101).addBox(-0.604F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(117, 72).addBox(-0.104F, -0.75F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.396F, 7.2222F, -12.7124F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(34, 121).addBox(0.503F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.503F, -0.6052F, -7.1584F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(90, 17).addBox(-0.497F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.503F, 0.132F, -7.834F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(87, 79).addBox(0.003F, -0.65F, -2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.003F, -0.2656F, -6.7095F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(45, 120).addBox(1.0F, -1.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, -2.0632F, -3.7047F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(83, 9).addBox(-2.5F, -1.15F, -1.375F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -3.4513F, -2.2895F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(66, 87).addBox(1.5F, -0.925F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, -1.2944F, -5.0279F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(107, 66).addBox(-2.0F, -1.1F, -1.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -3.2956F, -3.0143F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(9, 87).addBox(0.0F, -1.4F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -2.1561F, -3.0516F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7298F, -7.7083F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(119, 6).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.918F, -12.3708F, 3.4955F, 0.3497F, 0.7287F, -1.0697F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(108, 101).addBox(-1.0F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.3498F, -7.1947F, 6.3145F, -0.4687F, 0.408F, -1.8598F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(16, 91).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.7135F, -10.9908F, 5.6217F, -0.0371F, 0.5752F, -1.6216F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(118, 50).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.79F, -11.8776F, 4.0059F, 0.7343F, 0.3356F, -0.3499F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(116, 10).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.398F, -8.9706F, 0.9108F, 0.8395F, -0.538F, -0.614F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(68, 107).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2646F, -11.6664F, 3.5035F, 1.0603F, 0.4145F, 0.6234F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(91, 23).addBox(-2.9F, -2.3F, -0.9F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3243F, -10.0994F, 3.5677F, -2.6561F, 0.748F, -1.6834F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(56, 25).addBox(-2.9F, -1.5F, -1.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3243F, -10.0994F, 3.5677F, -1.9929F, 0.748F, -1.6834F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(27, 72).addBox(-1.075F, -1.5F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1189F, -8.925F, 2.5709F, -0.754F, 0.0598F, -0.0864F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(57, 121).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4415F, -6.3633F, 0.5139F, -1.2178F, -0.8361F, 1.2864F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(57, 72).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4415F, -6.3633F, 0.5139F, -0.697F, 0.2005F, 0.0113F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(36, 72).addBox(-0.9F, -2.0F, -0.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2175F, -7.0035F, 1.1055F, -0.7187F, -0.0567F, -0.2871F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(9, 100).addBox(-0.875F, 0.0F, -0.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1557F, -9.2947F, 1.2668F, -0.7224F, 0.1075F, -0.4309F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(105, 95).addBox(-0.95F, -0.1F, -0.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1115F, -10.7542F, 2.6335F, -0.8357F, 0.3996F, -0.4366F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(88, 45).addBox(-0.8F, -1.5F, -0.35F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3139F, -11.1518F, 3.0347F, -1.0485F, 0.6895F, -0.3644F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(0, 116).addBox(-0.4331F, -0.8441F, -1.9634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4831F, -6.4128F, -0.6002F, 1.9199F, -0.1745F, 0.48F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(121, 59).addBox(-1.225F, -0.675F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7439F, -7.564F, 0.1997F, 2.2759F, 0.429F, 0.7029F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(124, 119).addBox(-0.4551F, -0.0081F, -0.1941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4831F, -6.4128F, -0.6002F, 2.3294F, -0.1112F, 0.2602F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(124, 116).addBox(-0.4551F, -0.6648F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4831F, -6.4128F, -0.6002F, 1.3694F, -0.1112F, 0.2602F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 66).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0285F, -5.6282F, -1.8826F, 1.185F, 0.7613F, -1.7948F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(124, 17).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6245F, -6.3223F, -2.4784F, 2.2972F, 0.4575F, -0.1533F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(117, 108).addBox(-1.7269F, -1.0F, -0.6504F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0504F, -3.2478F, -3.2833F, 1.5419F, 0.9538F, -1.7654F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(33, 124).addBox(-0.2976F, -1.0F, 0.0649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0504F, -3.2478F, -3.2833F, 2.5057F, 0.2293F, -0.3253F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(124, 54).addBox(-0.6504F, -1.0F, 0.2269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0504F, -3.2478F, -3.2833F, 2.5248F, -0.0189F, -0.1457F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(124, 34).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3995F, -5.6155F, -3.1492F, 2.4492F, 0.5327F, -0.136F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(28, 124).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3995F, -5.6155F, -3.1492F, 2.5484F, 0.1811F, 0.1418F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(124, 13).addBox(-0.675F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.325F, -6.0206F, -2.0602F, 2.3913F, 0.1811F, 0.1418F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(18, 124).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1133F, -7.4055F, -1.2948F, 2.1631F, 0.459F, -0.1018F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(13, 124).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.425F, -7.6067F, -0.2401F, 2.2671F, 0.2477F, 0.1953F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(117, 100).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.425F, -3.1741F, -4.8161F, 0.5769F, -0.8635F, 0.8627F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(23, 124).addBox(-0.5F, -0.3F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4135F, -0.5944F, -3.5979F, 0.4272F, 0.0366F, -0.0238F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(110, 110).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8476F, -2.6805F, -4.056F, 0.9944F, 0.0366F, -0.0238F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(46, 68).addBox(-1.5F, -0.7224F, 0.0534F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5759F, -2.0368F, 0.6086F, 0.6095F, 0.3201F, 0.0821F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(11, 56).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5297F, -2.334F, -1.1927F, 0.2101F, 0.3871F, -0.1878F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(24, 42).addBox(-1.5F, -0.7976F, -3.5649F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5759F, -2.0368F, 0.6086F, 0.3041F, 0.3201F, 0.0821F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 125).addBox(-0.85F, 1.1F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7256F, -1.9209F, -2.8864F, 0.9878F, 0.1462F, -0.0957F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.238F, -0.8087F, -1.1738F, 0.9863F, 0.1607F, -0.1055F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7298F, -7.7083F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.918F, -12.3708F, 3.4955F, 0.3497F, -0.7287F, 1.0697F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(108, 101).mirror().addBox(-2.0F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3498F, -7.1947F, 6.3145F, -0.4687F, -0.408F, 1.8598F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(16, 91).mirror().addBox(0.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7135F, -10.9908F, 5.6217F, -0.0371F, -0.5752F, 1.6216F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.79F, -11.8776F, 4.0059F, 0.7343F, -0.3356F, 0.3499F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.398F, -8.9706F, 0.9108F, 0.8395F, 0.538F, 0.614F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(68, 107).mirror().addBox(0.0F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2646F, -11.6664F, 3.5035F, 1.0603F, -0.4145F, -0.6234F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-0.1F, -2.3F, -0.9F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3243F, -10.0994F, 3.5677F, -2.6561F, -0.748F, 1.6834F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(56, 25).mirror().addBox(-0.1F, -1.5F, -1.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3243F, -10.0994F, 3.5677F, -1.9929F, -0.748F, 1.6834F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(0.075F, -1.5F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1189F, -8.925F, 2.5709F, -0.754F, -0.0598F, 0.0864F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(57, 121).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4415F, -6.3633F, 0.5139F, -1.2178F, 0.8361F, -1.2864F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4415F, -6.3633F, 0.5139F, -0.697F, -0.2005F, -0.0113F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-0.1F, -2.0F, -0.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2175F, -7.0035F, 1.1055F, -0.7187F, 0.0567F, 0.2871F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(9, 100).mirror().addBox(-0.125F, 0.0F, -0.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1557F, -9.2947F, 1.2668F, -0.7224F, -0.1075F, 0.4309F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(105, 95).mirror().addBox(-0.05F, -0.1F, -0.35F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1115F, -10.7542F, 2.6335F, -0.8357F, -0.3996F, 0.4366F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(88, 45).mirror().addBox(-0.2F, -1.5F, -0.35F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3139F, -11.1518F, 3.0347F, -1.0485F, -0.6895F, 0.3644F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-0.5669F, -0.8441F, -1.9634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4831F, -6.4128F, -0.6002F, 1.9199F, 0.1745F, -0.48F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(121, 59).mirror().addBox(-0.775F, -0.675F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.7439F, -7.564F, 0.1997F, 2.2759F, -0.429F, -0.7029F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(124, 119).mirror().addBox(-0.5449F, -0.0081F, -0.1941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4831F, -6.4128F, -0.6002F, 2.3294F, 0.1112F, -0.2602F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(124, 116).mirror().addBox(-0.5449F, -0.6648F, -0.5444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4831F, -6.4128F, -0.6002F, 1.3694F, 0.1112F, -0.2602F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(0.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0285F, -5.6282F, -1.8826F, 1.185F, -0.7613F, 1.7948F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(124, 17).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6245F, -6.3223F, -2.4784F, 2.2972F, -0.4575F, 0.1533F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(117, 108).mirror().addBox(-0.2731F, -1.0F, -0.6504F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0504F, -3.2478F, -3.2833F, 1.5419F, -0.9538F, 1.7654F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(33, 124).mirror().addBox(-0.7024F, -1.0F, 0.0649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0504F, -3.2478F, -3.2833F, 2.5057F, -0.2293F, 0.3253F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(124, 54).mirror().addBox(-0.3496F, -1.0F, 0.2269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0504F, -3.2478F, -3.2833F, 2.5248F, 0.0189F, 0.1457F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(124, 34).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3995F, -5.6155F, -3.1492F, 2.4492F, -0.5327F, 0.136F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(28, 124).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3995F, -5.6155F, -3.1492F, 2.5484F, -0.1811F, -0.1418F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(124, 13).mirror().addBox(-0.325F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.325F, -6.0206F, -2.0602F, 2.3913F, -0.1811F, -0.1418F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(18, 124).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1133F, -7.4055F, -1.2948F, 2.1631F, -0.459F, 0.1018F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(13, 124).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.425F, -7.6067F, -0.2401F, 2.2671F, -0.2477F, -0.1953F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(117, 100).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.425F, -3.1741F, -4.8161F, 0.5769F, 0.8635F, -0.8627F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(23, 124).mirror().addBox(-0.5F, -0.3F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4135F, -0.5944F, -3.5979F, 0.4272F, -0.0366F, 0.0238F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(110, 110).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8476F, -2.6805F, -4.056F, 0.9944F, -0.0366F, 0.0238F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-0.5F, -0.7224F, 0.0534F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5759F, -2.0368F, 0.6086F, 0.6095F, -0.3201F, -0.0821F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(11, 56).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5297F, -2.334F, -1.1927F, 0.2101F, -0.3871F, 0.1878F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(24, 42).mirror().addBox(-0.5F, -0.7976F, -3.5649F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5759F, -2.0368F, 0.6086F, 0.3041F, -0.3201F, -0.0821F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-0.15F, 1.1F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7256F, -1.9209F, -2.8864F, 0.9878F, -0.1462F, 0.0957F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.238F, -0.8087F, -1.1738F, 0.9863F, -0.1607F, 0.1055F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1989F, 7.9935F, -6.7648F, -0.0525F, 0.1091F, 0.0817F));

		PartDefinition cube_r489 = leftOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(117, 76).addBox(-1.6217F, -0.9359F, -0.1703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4009F, -9.1283F, 3.3269F, -1.7863F, 0.3009F, 0.9437F));

		PartDefinition cube_r490 = leftOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(126, 95).addBox(1.4345F, -0.9506F, -8.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -1.7717F, -1.0938F, -2.1337F, 0.0271F, -0.114F));

		PartDefinition cube_r491 = leftOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(28, 113).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(2.2134F, -8.3245F, 3.8697F, -2.0115F, 0.0271F, -0.114F));

		PartDefinition cube_r492 = leftOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(91, 126).addBox(1.4345F, -1.4809F, -6.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8805F, -1.7717F, -1.0938F, -2.0464F, 0.0271F, -0.114F));

		PartDefinition cube_r493 = leftOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(15, 25).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.377F, -6.6427F, 2.8104F, -1.8282F, 0.0271F, -0.114F));

		PartDefinition cube_r494 = leftOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(117, 14).addBox(-0.5F, -0.575F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3708F, -5.7662F, 2.6714F, -1.2877F, 0.119F, 0.1376F));

		PartDefinition cube_r495 = leftOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(116, 79).addBox(-1.7661F, -0.3599F, -0.1671F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4009F, -9.1283F, 3.3269F, -1.8076F, 0.5308F, 0.9168F));

		PartDefinition cube_r496 = leftOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(124, 83).addBox(1.4345F, -0.1962F, -8.539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -1.7717F, -1.0938F, -2.1511F, 0.0271F, -0.114F));

		PartDefinition cube_r497 = leftOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(73, 127).addBox(-0.6305F, -0.8714F, -0.1159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1682F, -9.3429F, 1.6706F, -2.1057F, -0.0033F, -0.1171F));

		PartDefinition cube_r498 = leftOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(124, 110).addBox(-0.6305F, -0.7436F, 0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1682F, -9.3429F, 1.6706F, -1.9312F, -0.0033F, -0.1171F));

		PartDefinition cube_r499 = leftOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(109, 28).addBox(-0.5F, -1.85F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.1951F, -8.0148F, 1.064F, -1.8439F, -0.0033F, -0.1171F));

		PartDefinition cube_r500 = leftOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(126, 65).addBox(1.4345F, -0.1977F, -6.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(126, 62).addBox(1.4345F, -0.1977F, -6.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8805F, -1.7717F, -1.0938F, -2.1075F, 0.0271F, -0.114F));

		PartDefinition cube_r501 = leftOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(116, 64).addBox(-0.4442F, -0.0281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, -2.1096F, 0.1526F, 0.2261F));

		PartDefinition cube_r502 = leftOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(45, 116).addBox(-0.4442F, 2.9337F, -1.3141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, 2.7163F, 0.1526F, 0.2261F));

		PartDefinition cube_r503 = leftOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(125, 21).addBox(-0.5F, -0.65F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(2.0264F, -4.7305F, 1.5349F, -2.9997F, 0.1526F, 0.2261F));

		PartDefinition cube_r504 = leftOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(116, 31).addBox(-0.4442F, 3.1686F, -2.4207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, 3.0217F, 0.1526F, 0.2261F));

		PartDefinition cube_r505 = leftOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(103, 117).addBox(-0.5F, 0.525F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(124, 107).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1137F, -3.9261F, 3.2607F, -3.1219F, 0.1526F, 0.2261F));

		PartDefinition cube_r506 = leftOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(101, 124).addBox(-0.4442F, -2.4899F, -3.6035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, -1.8216F, 0.1526F, 0.2261F));

		PartDefinition cube_r507 = leftOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(124, 100).addBox(-0.4442F, -3.4797F, 0.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, -0.5562F, 0.1526F, 0.2261F));

		PartDefinition cube_r508 = leftOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.5631F, -2.1618F, 2.3428F, 0.4211F, 0.1526F, 0.2261F));

		PartDefinition cube_r509 = leftOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(124, 87).addBox(-0.4442F, -2.8712F, 0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9805F, -1.3467F, 0.2062F, -0.626F, 0.1526F, 0.2261F));

		PartDefinition cube_r510 = leftOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(111, 22).addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5364F, -2.939F, 1.0407F, -2.9386F, 0.1526F, 0.2261F));

		PartDefinition cube_r511 = leftOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(38, 108).addBox(-0.5F, -0.95F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.7611F, -3.5132F, 1.6278F, -2.2841F, 0.1526F, 0.2261F));

		PartDefinition cube_r512 = leftOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(12, 108).addBox(-0.5F, -1.3F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.2506F, -6.1376F, 1.2489F, -1.4186F, 0.119F, 0.1376F));

		PartDefinition cube_r513 = leftOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(107, 105).addBox(-0.3824F, -1.8908F, -1.1871F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0996F, -3.7273F, -0.863F, 1.3369F, 0.6237F, 0.204F));

		PartDefinition cube_r514 = leftOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(124, 76).addBox(-0.3102F, -0.6609F, -0.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0996F, -3.7273F, -0.863F, 1.6039F, 0.5505F, 0.066F));

		PartDefinition cube_r515 = leftOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(117, 112).addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1371F, 2.3385F, -3.5243F, -0.903F, -0.1179F, -0.1779F));

		PartDefinition cube_r516 = leftOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(116, 27).addBox(-1.3F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2632F, 3.7872F, -3.9155F, -1.0775F, -0.1179F, -0.1779F));

		PartDefinition cube_r517 = leftOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(82, 107).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7839F, -0.0423F, 0.1955F, 0.4995F, 0.1312F, 0.0764F));

		PartDefinition cube_r518 = leftOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(36, 79).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1361F, -1.0932F, 2.0865F, 0.6702F, 0.1324F, 0.0136F));

		PartDefinition cube_r519 = leftOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(111, 41).addBox(-0.5F, -0.525F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.304F, 1.2379F, -3.132F, 0.8916F, 0.1165F, 0.0872F));

		PartDefinition cube_r520 = leftOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(75, 107).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5653F, 0.6529F, -1.3433F, 0.3244F, 0.1165F, 0.0872F));

		PartDefinition cube_r521 = leftOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(80, 92).addBox(-0.3491F, -0.8595F, -1.0265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0996F, -3.7273F, -0.863F, 3.0764F, 0.2118F, 0.1141F));

		PartDefinition cube_r522 = leftOrbit.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(27, 79).addBox(-0.3741F, -1.5755F, -2.0954F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0996F, -3.7273F, -0.863F, 2.3687F, 0.4908F, 0.2756F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1989F, 7.9935F, -6.7648F, -0.0525F, -0.1091F, -0.0817F));

		PartDefinition cube_r523 = rightOrbit.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(117, 76).mirror().addBox(-0.3783F, -0.9359F, -0.1703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4009F, -9.1283F, 3.3269F, -1.7863F, -0.3009F, -0.9437F));

		PartDefinition cube_r524 = rightOrbit.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(126, 95).mirror().addBox(-2.4345F, -0.9506F, -8.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -1.7717F, -1.0938F, -2.1337F, -0.0271F, 0.114F));

		PartDefinition cube_r525 = rightOrbit.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-2.2134F, -8.3245F, 3.8697F, -2.0115F, -0.0271F, 0.114F));

		PartDefinition cube_r526 = rightOrbit.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(91, 126).mirror().addBox(-2.4345F, -1.4809F, -6.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -1.7717F, -1.0938F, -2.0464F, -0.0271F, 0.114F));

		PartDefinition cube_r527 = rightOrbit.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(15, 25).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.377F, -6.6427F, 2.8104F, -1.8282F, -0.0271F, 0.114F));

		PartDefinition cube_r528 = rightOrbit.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(117, 14).mirror().addBox(-0.5F, -0.575F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.3708F, -5.7662F, 2.6714F, -1.2877F, -0.119F, -0.1376F));

		PartDefinition cube_r529 = rightOrbit.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(116, 79).mirror().addBox(-0.2339F, -0.3599F, -0.1671F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4009F, -9.1283F, 3.3269F, -1.8076F, -0.5308F, -0.9168F));

		PartDefinition cube_r530 = rightOrbit.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(124, 83).mirror().addBox(-2.4345F, -0.1962F, -8.539F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -1.7717F, -1.0938F, -2.1511F, -0.0271F, 0.114F));

		PartDefinition cube_r531 = rightOrbit.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(73, 127).mirror().addBox(-0.3695F, -0.8714F, -0.1159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1682F, -9.3429F, 1.6706F, -2.1057F, 0.0033F, 0.1171F));

		PartDefinition cube_r532 = rightOrbit.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(124, 110).mirror().addBox(-0.3695F, -0.7436F, 0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1682F, -9.3429F, 1.6706F, -1.9312F, 0.0033F, 0.1171F));

		PartDefinition cube_r533 = rightOrbit.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(109, 28).mirror().addBox(-0.5F, -1.85F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.1951F, -8.0148F, 1.064F, -1.8439F, 0.0033F, 0.1171F));

		PartDefinition cube_r534 = rightOrbit.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(126, 65).mirror().addBox(-2.4345F, -0.1977F, -6.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(126, 62).mirror().addBox(-2.4345F, -0.1977F, -6.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8805F, -1.7717F, -1.0938F, -2.1075F, -0.0271F, 0.114F));

		PartDefinition cube_r535 = rightOrbit.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(116, 64).mirror().addBox(-0.5558F, -0.0281F, -4.6195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, -2.1096F, -0.1526F, -0.2261F));

		PartDefinition cube_r536 = rightOrbit.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(45, 116).mirror().addBox(-0.5558F, 2.9337F, -1.3141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, 2.7163F, -0.1526F, -0.2261F));

		PartDefinition cube_r537 = rightOrbit.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(125, 21).mirror().addBox(-0.5F, -0.65F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-2.0264F, -4.7305F, 1.5349F, -2.9997F, -0.1526F, -0.2261F));

		PartDefinition cube_r538 = rightOrbit.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(116, 31).mirror().addBox(-0.5558F, 3.1686F, -2.4207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, 3.0217F, -0.1526F, -0.2261F));

		PartDefinition cube_r539 = rightOrbit.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(103, 117).mirror().addBox(-0.5F, 0.525F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(124, 107).mirror().addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1137F, -3.9261F, 3.2607F, -3.1219F, -0.1526F, -0.2261F));

		PartDefinition cube_r540 = rightOrbit.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-0.5558F, -2.4899F, -3.6035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, -1.8216F, -0.1526F, -0.2261F));

		PartDefinition cube_r541 = rightOrbit.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(124, 100).mirror().addBox(-0.5558F, -3.4797F, 0.5536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, -0.5562F, -0.1526F, -0.2261F));

		PartDefinition cube_r542 = rightOrbit.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, -1.85F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.5631F, -2.1618F, 2.3428F, 0.4211F, -0.1526F, -0.2261F));

		PartDefinition cube_r543 = rightOrbit.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(124, 87).mirror().addBox(-0.5558F, -2.8712F, 0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9805F, -1.3467F, 0.2062F, -0.626F, -0.1526F, -0.2261F));

		PartDefinition cube_r544 = rightOrbit.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(111, 22).mirror().addBox(-0.5F, -1.0F, -0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5364F, -2.939F, 1.0407F, -2.9386F, -0.1526F, -0.2261F));

		PartDefinition cube_r545 = rightOrbit.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(38, 108).mirror().addBox(-0.5F, -0.95F, -1.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.7611F, -3.5132F, 1.6278F, -2.2841F, -0.1526F, -0.2261F));

		PartDefinition cube_r546 = rightOrbit.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(12, 108).mirror().addBox(-0.5F, -1.3F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.2506F, -6.1376F, 1.2489F, -1.4186F, -0.119F, -0.1376F));

		PartDefinition cube_r547 = rightOrbit.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(107, 105).mirror().addBox(-0.6176F, -1.8908F, -1.1871F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0996F, -3.7273F, -0.863F, 1.3369F, -0.6237F, -0.204F));

		PartDefinition cube_r548 = rightOrbit.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(124, 76).mirror().addBox(-0.6898F, -0.6609F, -0.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0996F, -3.7273F, -0.863F, 1.6039F, -0.5505F, -0.066F));

		PartDefinition cube_r549 = rightOrbit.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(117, 112).mirror().addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1371F, 2.3385F, -3.5243F, -0.903F, 0.1179F, 0.1779F));

		PartDefinition cube_r550 = rightOrbit.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(116, 27).mirror().addBox(0.3F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2632F, 3.7872F, -3.9155F, -1.0775F, 0.1179F, 0.1779F));

		PartDefinition cube_r551 = rightOrbit.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(82, 107).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7839F, -0.0423F, 0.1955F, 0.4995F, -0.1312F, -0.0764F));

		PartDefinition cube_r552 = rightOrbit.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(36, 79).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1361F, -1.0932F, 2.0865F, 0.6702F, -0.1324F, -0.0136F));

		PartDefinition cube_r553 = rightOrbit.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(111, 41).mirror().addBox(-0.5F, -0.525F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.304F, 1.2379F, -3.132F, 0.8916F, -0.1165F, -0.0872F));

		PartDefinition cube_r554 = rightOrbit.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(75, 107).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5653F, 0.6529F, -1.3433F, 0.3244F, -0.1165F, -0.0872F));

		PartDefinition cube_r555 = rightOrbit.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(-0.6509F, -0.8595F, -1.0265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0996F, -3.7273F, -0.863F, 3.0764F, -0.2118F, -0.1141F));

		PartDefinition cube_r556 = rightOrbit.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(27, 79).mirror().addBox(-0.6259F, -1.5755F, -2.0954F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0996F, -3.7273F, -0.863F, 2.3687F, -0.4908F, -0.2756F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.7293F, -2.2951F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(117, 18).mirror().addBox(-0.3224F, -1.0433F, 5.2883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -1.1665F, -0.1839F, 0.1561F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(13, 48).mirror().addBox(-0.3284F, -0.2616F, 2.8417F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.6429F, -0.1839F, 0.1561F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(98, 109).mirror().addBox(-0.3271F, -2.1389F, 2.3515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -1.0464F, -0.1787F, 0.181F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(52, 120).mirror().addBox(-0.3271F, -4.3899F, 2.7846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.8282F, -0.1787F, 0.181F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(75, 123).mirror().addBox(-0.3284F, 1.0322F, 3.1541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.8261F, -0.1839F, 0.1561F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.3194F, 1.6495F, 2.7788F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.0407F, -0.1839F, 0.1561F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(7, 113).mirror().addBox(-0.3197F, -3.7045F, 2.7919F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.957F, -0.1839F, 0.1561F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(35, 117).mirror().addBox(-0.3284F, -3.455F, 4.414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -1.6552F, -0.1839F, 0.1561F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(-0.2365F, -1.6684F, 2.0468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -1.4559F, -0.1808F, 0.1728F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(96, 123).mirror().addBox(-0.3197F, -3.1271F, 5.0093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -0.7127F, -0.1839F, 0.1561F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(79, 52).mirror().addBox(-0.0294F, -0.306F, 1.7819F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -2.3441F, -0.0541F, 0.1671F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(54, 79).mirror().addBox(-0.0882F, -1.3654F, 1.7346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -2.152F, -0.0598F, 0.1559F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(67, 119).mirror().addBox(-0.3034F, -3.4164F, 3.9503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -1.8122F, -0.1839F, 0.1561F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(110, 15).mirror().addBox(-0.3034F, -5.0758F, 1.9595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -2.3358F, -0.1839F, 0.1561F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-0.2115F, -3.1694F, 1.7779F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -2.1191F, -0.1808F, 0.1728F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-0.0114F, -0.5335F, -2.9017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -2.4254F, -0.0969F, 0.2481F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(115, 123).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1885F, -5.9223F, -10.6418F, 2.9203F, 0.125F, -0.0834F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.0868F, -1.6919F, 0.5624F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1488F, -1.3214F, -5.8637F, -2.2333F, -0.0613F, 0.1651F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(0.0092F, 0.0627F, -1.7265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -2.4833F, -0.0881F, 0.2375F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(45, 111).mirror().addBox(0.0092F, -0.4659F, -2.6305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -1.2179F, -0.0881F, 0.2375F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(117, 116).mirror().addBox(0.0092F, -3.2361F, -2.0671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, 0.1347F, -0.0881F, 0.2375F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(125, 38).mirror().addBox(0.0092F, -2.5977F, 2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, 1.531F, -0.0881F, 0.2375F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(125, 41).mirror().addBox(0.0092F, 3.587F, 1.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, 3.0145F, -0.0881F, 0.2375F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(125, 49).mirror().addBox(0.0092F, 2.6735F, -5.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -1.8724F, -0.0881F, 0.2375F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(52, 125).mirror().addBox(0.0496F, -1.464F, -6.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -1.1739F, -0.0926F, 0.2292F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(120, 125).mirror().addBox(0.0496F, -1.1904F, -5.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(125, 125).mirror().addBox(0.0496F, -0.6904F, -5.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -1.2262F, -0.0926F, 0.2292F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(21, 113).mirror().addBox(0.0496F, -4.3461F, -1.1853F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, 0.2573F, -0.0926F, 0.2292F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(111, 50).mirror().addBox(0.0496F, -2.7932F, -0.3962F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, 0.5627F, -0.0926F, 0.2292F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.0114F, 1.9172F, -2.1329F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -2.8618F, -0.0969F, 0.2481F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(112, 5).mirror().addBox(-0.0114F, 3.2632F, -3.2152F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2488F, 0.1786F, -9.3637F, -2.6F, -0.0969F, 0.2481F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(126, 4).mirror().addBox(0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3209F, -5.1419F, -10.6176F, -1.1658F, -0.0414F, 0.1085F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(98, 95).addBox(-0.9132F, -1.6919F, 0.5624F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -2.2333F, 0.0613F, -0.1651F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(115, 123).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0115F, -5.9223F, -10.6418F, 2.9203F, -0.125F, 0.0834F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(112, 5).addBox(-0.9886F, 3.2632F, -3.2152F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -2.6F, 0.0969F, -0.2481F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(112, 0).addBox(-0.9886F, 1.9172F, -2.1329F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -2.8618F, 0.0969F, -0.2481F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(110, 36).addBox(-0.9886F, -0.5335F, -2.9017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -2.4254F, 0.0969F, -0.2481F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(79, 66).addBox(-0.7885F, -3.1694F, 1.7779F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -2.1191F, 0.1808F, -0.1728F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(110, 15).addBox(-0.6966F, -5.0758F, 1.9595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -2.3358F, 0.1839F, -0.1561F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(67, 119).addBox(-0.6966F, -3.4164F, 3.9503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -1.8122F, 0.1839F, -0.1561F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(54, 79).addBox(-0.9118F, -1.3654F, 1.7346F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -2.152F, 0.0598F, -0.1559F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(111, 50).addBox(-1.0496F, -2.7932F, -0.3962F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, 0.5627F, 0.0926F, -0.2292F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(21, 113).addBox(-1.0496F, -4.3461F, -1.1853F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, 0.2573F, 0.0926F, -0.2292F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(125, 125).addBox(-1.0496F, -0.6904F, -5.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(120, 125).addBox(-1.0496F, -1.1904F, -5.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -1.2262F, 0.0926F, -0.2292F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(126, 4).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1209F, -5.1419F, -10.6176F, -1.1658F, 0.0414F, -0.1085F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(52, 125).addBox(-1.0496F, -1.464F, -6.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -1.1739F, 0.0926F, -0.2292F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(125, 49).addBox(-1.0092F, 2.6735F, -5.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -1.8724F, 0.0881F, -0.2375F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(125, 41).addBox(-1.0092F, 3.587F, 1.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, 3.0145F, 0.0881F, -0.2375F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(125, 38).addBox(-1.0092F, -2.5977F, 2.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, 1.531F, 0.0881F, -0.2375F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(117, 116).addBox(-1.0092F, -3.2361F, -2.0671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, 0.1347F, 0.0881F, -0.2375F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(45, 111).addBox(-1.0092F, -0.4659F, -2.6305F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -1.2179F, 0.0881F, -0.2375F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(92, 0).addBox(-1.0092F, 0.0627F, -1.7265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0488F, 0.1786F, -9.3637F, -2.4833F, 0.0881F, -0.2375F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(79, 52).addBox(-0.9706F, -0.306F, 1.7819F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -2.3441F, 0.0541F, -0.1671F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(96, 123).addBox(-0.6803F, -3.1271F, 5.0093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.7127F, 0.1839F, -0.1561F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(123, 79).addBox(-0.7635F, -1.6684F, 2.0468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -1.4559F, 0.1808F, -0.1728F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(35, 117).addBox(-0.6716F, -3.455F, 4.414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -1.6552F, 0.1839F, -0.1561F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(7, 113).addBox(-0.6803F, -3.7045F, 2.7919F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.957F, 0.1839F, -0.1561F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(79, 46).addBox(-0.6806F, 1.6495F, 2.7788F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.0407F, 0.1839F, -0.1561F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(75, 123).addBox(-0.6716F, 1.0322F, 3.1541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.8261F, 0.1839F, -0.1561F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(52, 120).addBox(-0.6729F, -4.3899F, 2.7846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.8282F, 0.1787F, -0.181F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(98, 109).addBox(-0.6729F, -2.1389F, 2.3515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -1.0464F, 0.1787F, -0.181F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(13, 48).addBox(-0.6716F, -0.2616F, 2.8417F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -0.6429F, 0.1839F, -0.1561F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(117, 18).addBox(-0.6776F, -1.0433F, 5.2883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9488F, -1.3214F, -5.8637F, -1.1665F, 0.1839F, -0.1561F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(88, 52).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(85, 127).addBox(0.0F, -1.9F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.6021F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(117, 35).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r619 = tail2.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(88, 127).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(88, 64).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(96, 127).addBox(0.0F, -1.7F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r620 = tail3.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(99, 127).addBox(0.0F, -1.4F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(34, 95).addBox(-0.5F, -0.0943F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2316F, 2.8957F, -0.384F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5F, -0.0193F, -0.024F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(34, 90).addBox(-0.5F, -0.0193F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 132, 132);
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