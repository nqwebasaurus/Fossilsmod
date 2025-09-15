package fossils.fossils.client.blockentity.model.hypselospinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypselospinusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public HypselospinusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.heads = this.neck5.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.tail2 = this.tail6.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.778F, 6.3237F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.3F, -9.3F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.655F, 8.9949F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(107, 8).addBox(0.0F, -4.6F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1395F, -2.6421F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-4.0F, 1.0F, 2.2F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 15).addBox(1.0F, 1.0F, 2.2F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, 1.2F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4076F, -4.8257F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.7508F, 0.5143F, 5.0478F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 95).addBox(-0.7281F, -0.0898F, -2.2058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3508F, 3.2336F, -2.1856F, -1.0373F, -0.3081F, -0.0039F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 101).addBox(-0.2661F, -0.2733F, -0.2354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5306F, 4.2585F, -3.0976F, 0.8901F, -0.2967F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 69).addBox(-0.7088F, 0.0141F, -4.5768F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, 0.1745F, -0.3229F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(99, 102).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1813F, -1.9592F, -6.21F, 0.0239F, -0.1258F, 0.0363F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 17).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3417F, -1.7587F, -5.0F, -0.4124F, -0.1258F, 0.0363F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(103, 65).addBox(-0.4967F, -1.0166F, -2.0423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3697F, 0.4686F, -10.2706F, 0.41F, -0.1309F, 0.0023F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 68).addBox(-0.4967F, -1.0166F, -3.0423F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.047F, -1.1876F, -7.7901F, 0.5845F, -0.1309F, 0.0023F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 45).addBox(-0.3F, -0.5F, -2.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3266F, -0.7261F, -9.8314F, 0.6304F, 0.1523F, 0.2071F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(94, 48).addBox(-0.525F, -0.5F, -1.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1753F, -1.0202F, -9.4434F, 0.6233F, -0.0601F, 0.0536F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(94, 5).addBox(-0.4967F, -0.0166F, -3.0423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(85, 117).addBox(-0.4967F, -0.0166F, -4.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1569F, -2.3201F, -8.6058F, 0.6282F, -0.1309F, 0.0023F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 78).addBox(-0.4967F, -0.1166F, -2.0422F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0965F, -2.7755F, -6.6723F, 0.2791F, -0.1309F, 0.0023F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 74).addBox(-0.3967F, -0.1916F, -2.1423F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(83, 50).addBox(-0.3967F, -0.1916F, -1.8423F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.3462F, -2.8149F, -4.6883F, 0.0063F, -0.1266F, 0.1066F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 29).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.041F, -1.0017F, 2.277F, -0.241F, -0.0264F, 0.1093F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 93).addBox(-0.5623F, -0.446F, -0.1794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2492F, -1.4141F, 1.1639F, -0.2474F, 0.2277F, 0.0459F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 60).addBox(-0.225F, -0.375F, -2.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2449F, -1.2168F, 1.6382F, -0.2273F, -0.0697F, 0.1551F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 24).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7492F, -2.0624F, -2.7821F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(41, 57).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.465F, -1.5874F, -0.0327F, -0.2202F, 0.2322F, 0.0906F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(106, 52).addBox(-0.5F, 0.15F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.4197F, 10.76F, 5.7125F, -1.6104F, -0.1902F, 0.1849F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(106, 44).addBox(-0.5F, -0.45F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0802F, 9.9359F, 4.7661F, -1.1304F, -0.1902F, 0.1849F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 54).addBox(-0.9209F, -0.2765F, -0.07F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4508F, 6.3336F, 2.1144F, -0.8512F, -0.1902F, 0.1849F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 9).addBox(-0.5F, 0.9908F, 2.4099F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3508F, 0.8336F, -2.8856F, -0.6458F, -0.2967F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(76, 89).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5306F, 4.2585F, -2.2976F, -0.0873F, -0.2967F, 0.0F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(65, 2).addBox(-0.5F, -0.8F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2508F, 3.3489F, -4.1049F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 74).addBox(0.2163F, -0.2399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.8508F, 2.267F, -7.0717F, -0.6914F, -0.3253F, 0.0656F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 23).addBox(0.2163F, -0.5399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8508F, 2.267F, -7.0717F, -0.7613F, -0.3253F, 0.0656F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(95, 115).addBox(-0.9928F, -0.2366F, -0.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4727F, 7.5522F, 0.4826F, -0.8398F, -0.3253F, 0.0656F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(94, 0).addBox(-0.9928F, -0.6366F, -0.1043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.6241F, 6.7336F, -1.8689F, -0.4907F, -0.3253F, 0.0656F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(93, 88).addBox(-0.9928F, -0.6366F, -0.1043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8508F, 5.267F, -3.8717F, -0.6216F, -0.3253F, 0.0656F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 94).addBox(-0.7281F, -0.9662F, -2.3783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3508F, 3.2336F, -2.1856F, -1.2816F, -0.3081F, -0.0039F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 103).addBox(-0.7088F, 1.3119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(76, 103).addBox(-0.7088F, 0.8119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, -2.5569F, -0.3229F, 0.0F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(108, 15).addBox(-0.7088F, -2.7679F, 4.9993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, 3.0718F, -0.3229F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 99).addBox(-0.7088F, 1.6939F, 4.3661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, -2.5133F, -0.3229F, 0.0F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(103, 0).addBox(-0.7088F, 0.3281F, -5.6194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, -0.1134F, -0.3229F, 0.0F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(13, 62).addBox(-0.7088F, -0.4303F, -3.9835F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, 0.1047F, -0.3229F, 0.0F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(77, 115).addBox(-0.7088F, -1.0858F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, 0.7243F, -0.3229F, 0.0F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 61).addBox(-0.7088F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1613F, 1.4828F, -6.1873F, 0.3316F, -0.3229F, 0.0F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 57).addBox(4.0F, -0.0054F, -3.8615F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 68).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.074F, 0.2055F, -0.0405F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.7508F, 0.5143F, 5.0478F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(37, 95).mirror().addBox(-0.2719F, -0.0898F, -2.2058F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3508F, 3.2336F, -2.1856F, -1.0373F, 0.3081F, 0.0039F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(21, 101).mirror().addBox(-0.7339F, -0.2733F, -0.2354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5306F, 4.2585F, -3.0976F, 0.8901F, 0.2967F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 69).mirror().addBox(-0.2912F, 0.0141F, -4.5768F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, 0.1745F, 0.3229F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(99, 102).mirror().addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1813F, -1.9592F, -6.21F, 0.0239F, 0.1258F, -0.0363F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 17).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3417F, -1.7587F, -5.0F, -0.4124F, 0.1258F, -0.0363F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(103, 65).mirror().addBox(-0.5033F, -1.0166F, -2.0423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3697F, 0.4686F, -10.2706F, 0.41F, 0.1309F, -0.0023F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-0.5033F, -1.0166F, -3.0423F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.047F, -1.1876F, -7.7901F, 0.5845F, 0.1309F, -0.0023F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(68, 45).mirror().addBox(-0.7F, -0.5F, -2.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3266F, -0.7261F, -9.8314F, 0.6304F, -0.1523F, -0.2071F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 48).mirror().addBox(-0.475F, -0.5F, -1.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1753F, -1.0202F, -9.4434F, 0.6233F, 0.0601F, -0.0536F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(94, 5).mirror().addBox(-0.5033F, -0.0166F, -3.0423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(85, 117).mirror().addBox(-0.5033F, -0.0166F, -4.0423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1569F, -2.3201F, -8.6058F, 0.6282F, 0.1309F, -0.0023F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(88, 78).mirror().addBox(-2.5033F, -0.1166F, -2.0422F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0965F, -2.7755F, -6.6723F, 0.2791F, 0.1309F, -0.0023F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-2.6033F, -0.1916F, -2.1423F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(83, 50).mirror().addBox(-2.6033F, -0.1916F, -1.8423F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.3462F, -2.8149F, -4.6883F, 0.0063F, 0.1266F, -0.1066F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.041F, -1.0017F, 2.277F, -0.241F, 0.0264F, -0.1093F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 93).mirror().addBox(-0.4377F, -0.446F, -0.1794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2492F, -1.4141F, 1.1639F, -0.2474F, -0.2277F, -0.0459F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.775F, -0.375F, -2.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2449F, -1.2168F, 1.6382F, -0.2273F, 0.0697F, -0.1551F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7492F, -2.0624F, -2.7821F, -0.1731F, -0.0227F, -0.1289F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.465F, -1.5874F, -0.0327F, -0.2202F, -0.2322F, -0.0906F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(106, 52).mirror().addBox(-0.5F, 0.15F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.4197F, 10.76F, 5.7125F, -1.6104F, 0.1902F, -0.1849F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(106, 44).mirror().addBox(-0.5F, -0.45F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0802F, 9.9359F, 4.7661F, -1.1304F, 0.1902F, -0.1849F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-0.0791F, -0.2765F, -0.07F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4508F, 6.3336F, 2.1144F, -0.8512F, 0.1902F, -0.1849F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-0.5F, 0.9908F, 2.4099F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3508F, 0.8336F, -2.8856F, -0.6458F, 0.2967F, 0.0F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(76, 89).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5306F, 4.2585F, -2.2976F, -0.0873F, 0.2967F, 0.0F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 2).mirror().addBox(-0.5F, -0.8F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2508F, 3.3489F, -4.1049F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.2163F, -0.2399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.8508F, 2.267F, -7.0717F, -0.6914F, 0.3253F, -0.0656F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-1.2163F, -0.5399F, -0.4772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.8508F, 2.267F, -7.0717F, -0.7613F, 0.3253F, -0.0656F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(95, 115).mirror().addBox(-0.0072F, -0.2366F, -0.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4727F, 7.5522F, 0.4826F, -0.8398F, 0.3253F, -0.0656F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.0072F, -0.6366F, -0.1043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.6241F, 6.7336F, -1.8689F, -0.4907F, 0.3253F, -0.0656F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(-0.0072F, -0.6366F, -0.1043F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8508F, 5.267F, -3.8717F, -0.6216F, 0.3253F, -0.0656F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-0.2719F, -0.9662F, -2.3783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3508F, 3.2336F, -2.1856F, -1.2816F, 0.3081F, 0.0039F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 103).mirror().addBox(-0.2912F, 1.3119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(76, 103).mirror().addBox(-0.2912F, 0.8119F, 3.6464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, -2.5569F, 0.3229F, 0.0F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(-0.2912F, -2.7679F, 4.9993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, 3.0718F, 0.3229F, 0.0F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 99).mirror().addBox(-0.2912F, 1.6939F, 4.3661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, -2.5133F, 0.3229F, 0.0F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.2912F, 0.3281F, -5.6194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, -0.1134F, 0.3229F, 0.0F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(13, 62).mirror().addBox(-0.2912F, -0.4303F, -3.9835F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, 0.1047F, 0.3229F, 0.0F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 115).mirror().addBox(-0.2912F, -1.0858F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, 0.7243F, 0.3229F, 0.0F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-0.2912F, -1.0165F, -3.4999F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1613F, 1.4828F, -6.1873F, 0.3316F, 0.3229F, 0.0F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(30, 57).mirror().addBox(-5.0F, -0.0054F, -3.8615F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7508F, -1.3219F, -0.8735F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 68).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.074F, -0.2055F, 0.0405F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 1.99F, 0.4012F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 10).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0375F, -0.66F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 82).addBox(-1.0F, -3.6F, -1.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.7756F, -0.4084F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 43).addBox(-1.0F, -5.4F, -1.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(90, 43).addBox(-1.0F, -0.0004F, 0.0426F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.8781F, -3.2758F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 94).addBox(-1.0F, -0.1004F, -0.1574F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0464F, -2.7329F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 82).addBox(-1.0F, 0.0746F, -0.0074F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.0464F, -2.7329F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(92, 36).addBox(-1.0F, -0.2254F, 1.0926F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(79, 74).addBox(-1.0F, -0.2254F, -0.1074F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.4668F, -1.6757F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 36).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.6519F, -1.6318F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8771F, -1.9244F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(105, 58).addBox(-0.5F, 0.225F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 0.4455F, 0.9988F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(21, 105).addBox(-0.5F, -0.725F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.4455F, 0.9988F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(67, 104).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.4455F, 0.9988F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(105, 117).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(117, 102).addBox(-0.5F, -0.625F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 8.7164F, -0.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 118).addBox(-0.5F, -0.125F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(117, 91).addBox(-0.5F, -0.625F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 8.7164F, -0.05F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(88, 88).addBox(-0.5F, -7.7F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.2F, 8.1137F, 0.2934F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 60).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 8.9271F, -0.5874F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(41, 61).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 0.7255F, 0.8001F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(85, 21).addBox(-1.0F, -2.0F, -0.1F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.5579F, 0.0483F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 12).addBox(-1.0F, -3.0F, -0.6F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 3.5579F, 0.0483F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 75).addBox(-1.0F, -4.5F, -0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 5.2122F, 0.6951F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(50, 75).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7073F, -0.4132F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(55, 37).addBox(-2.0F, -1.4696F, -1.8933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.672F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(29, 19).addBox(-2.0F, -1.4F, -3.9F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -1.9933F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 1.99F, 0.4012F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 22).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0375F, -0.66F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(60, 82).addBox(-1.0F, -3.6F, -1.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.7756F, -0.4084F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 82).addBox(-1.0F, -5.4F, -1.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(90, 54).addBox(-1.0F, -0.0004F, 0.0426F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.8781F, -3.2758F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(76, 94).addBox(-1.0F, -0.1004F, -0.1574F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0464F, -2.7329F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 36).addBox(-1.0F, 0.0746F, -0.0074F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.0464F, -2.7329F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(30, 93).addBox(-1.0F, -0.2254F, 1.0926F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(80, 60).addBox(-1.0F, -0.2254F, -0.1074F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.4668F, -1.6757F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 16).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.6519F, -1.6318F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8771F, -1.9244F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(42, 106).addBox(-0.5F, 0.225F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 0.4455F, 0.9988F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(106, 40).addBox(-0.5F, -0.725F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.4455F, 0.9988F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(104, 82).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.4455F, 0.9988F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(115, 117).addBox(-0.5F, -0.625F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 8.7164F, -0.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(10, 118).addBox(-0.5F, -0.125F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(110, 117).addBox(-0.5F, -0.625F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 8.7164F, -0.05F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -7.7F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.2F, 8.1137F, 0.2934F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(89, 65).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 8.9271F, -0.5874F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(39, 68).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 0.7255F, 0.8001F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(9, 86).addBox(-1.0F, -2.0F, -0.1F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.5579F, 0.0483F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 85).addBox(-1.0F, -3.0F, -0.6F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 3.5579F, 0.0483F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(13, 76).addBox(-1.0F, -4.5F, -0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 5.2122F, 0.6951F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(61, 75).addBox(-1.5F, -0.5443F, -1.1179F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7073F, -0.4132F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(15, 56).addBox(-2.0F, -1.4696F, -1.8933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8217F, 0.1167F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(36, 38).addBox(-2.0F, -1.4F, -3.9F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0696F, -1.9933F, -0.2602F, 0.0172F, 0.0103F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 27).addBox(-1.0F, -0.671F, -7.9355F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6079F, -3.7128F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 107).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.671F, -2.9355F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 107).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.671F, -0.9355F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(94, 107).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.671F, -4.9355F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(91, 107).addBox(0.0F, -4.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.671F, -6.9355F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(107, 109).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -0.6517F, 0.4673F, 0.3881F, -0.9177F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(111, 72).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -0.6517F, 0.5968F, 0.2221F, -0.4937F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(109, 94).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -2.6517F, 0.3846F, 0.283F, -0.945F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -2.6517F, 0.4802F, 0.1587F, -0.5158F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(108, 80).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -4.6517F, 0.3323F, 0.2119F, -0.9578F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(111, 68).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -4.6517F, 0.4038F, 0.1153F, -0.5263F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(111, 37).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -6.6517F, 0.268F, 0.0355F, -0.5365F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(108, 19).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -6.6517F, 0.2419F, 0.0827F, -0.9711F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-3.7084F, -1.8413F, -0.1369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2527F, -6.6517F, 0.1854F, 0.1767F, -1.401F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(111, 72).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -0.6517F, 0.5968F, -0.2221F, 0.4937F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 109).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -0.6517F, 0.4673F, -0.3881F, 0.9177F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(111, 70).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -2.6517F, 0.4802F, -0.1587F, 0.5158F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(109, 94).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -2.6517F, 0.3846F, -0.283F, 0.945F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(111, 68).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -4.6517F, 0.4038F, -0.1153F, 0.5263F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(108, 80).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -4.6517F, 0.3323F, -0.2119F, 0.9578F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 0).addBox(2.7085F, -1.8413F, -0.1369F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -6.6517F, 0.1854F, -0.1767F, 1.401F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(108, 19).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -6.6517F, 0.2419F, -0.0827F, 0.9711F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(111, 37).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2527F, -6.6517F, 0.268F, -0.0355F, 0.5365F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2481F, -7.931F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(42, 110).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.141F, -0.9881F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(8, 108).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3766F, -2.92F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(99, 80).mirror().addBox(-5.7084F, -1.8413F, -0.137F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6007F, -0.6207F, 0.1691F, 0.0821F, -1.4031F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(106, 56).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6007F, -0.6207F, 0.1878F, 0.0034F, -0.9734F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(110, 64).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.6007F, -0.6207F, 0.1855F, -0.0136F, -0.5374F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-8.7085F, -1.8413F, -0.137F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0008F, -2.6207F, 0.1691F, 0.0821F, -1.4031F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(105, 62).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0008F, -2.6207F, 0.1878F, 0.0034F, -0.9734F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0008F, -2.6207F, 0.1855F, -0.0136F, -0.5374F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(110, 48).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.5008F, -4.5207F, 0.2455F, 0.0222F, -0.5372F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(105, 33).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.5008F, -4.5207F, 0.2271F, 0.0611F, -0.9722F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-11.7085F, -1.8413F, -0.137F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.5008F, -4.5207F, 0.1809F, 0.1509F, -1.4017F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.0008F, -6.4207F, 0.2905F, 0.0489F, -0.5356F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(104, 86).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.0008F, -6.4207F, 0.2568F, 0.1043F, -0.9697F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-13.7085F, -1.8413F, -0.1369F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.0008F, -6.4207F, 0.1899F, 0.2025F, -1.4002F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(110, 64).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6007F, -0.6207F, 0.1855F, 0.0136F, 0.5374F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 56).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6007F, -0.6207F, 0.1878F, -0.0034F, 0.9734F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(99, 80).addBox(2.7085F, -1.8413F, -0.137F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.6007F, -0.6207F, 0.1691F, -0.0821F, 1.4031F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(110, 50).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0008F, -2.6207F, 0.1855F, 0.0136F, 0.5374F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(105, 62).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0008F, -2.6207F, 0.1878F, -0.0034F, 0.9734F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 52).addBox(2.7085F, -1.8413F, -0.137F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0008F, -2.6207F, 0.1691F, -0.0821F, 1.4031F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 22).addBox(2.7085F, -1.8413F, -0.137F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.5008F, -4.5207F, 0.1809F, -0.1509F, 1.4017F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(105, 33).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.5008F, -4.5207F, 0.2271F, -0.0611F, 0.9722F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(110, 48).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.5008F, -4.5207F, 0.2455F, -0.0222F, 0.5372F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(110, 31).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.0008F, -6.4207F, 0.2905F, -0.0489F, 0.5356F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(104, 86).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.0008F, -6.4207F, 0.2568F, -0.1043F, 0.9697F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 0).addBox(2.7085F, -1.8413F, -0.1369F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.0008F, -6.4207F, 0.1899F, -0.2025F, 1.4002F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 108).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8942F, -4.8518F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(107, 102).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4119F, -6.7837F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -0.392F, -6.9179F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1206F, -6.4482F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(85, 107).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5509F, -1.9367F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 109).addBox(0.0F, -4.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7466F, -3.4133F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 68).addBox(-1.0F, 0.0855F, 2.091F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.059F, -5.1699F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(110, 29).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.1801F, -2.9724F, 0.5343F, 0.1886F, -0.5065F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-12.7085F, -1.8413F, -0.1369F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.1801F, -2.9724F, 0.2426F, 0.4773F, -1.3824F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.1801F, -2.9724F, 0.4224F, 0.3323F, -0.9335F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(110, 12).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8801F, -1.4724F, 0.4879F, 0.163F, -0.5146F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8801F, -1.4724F, 0.3899F, 0.29F, -0.9435F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(36, 46).mirror().addBox(-13.7085F, -1.8413F, -0.1369F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8801F, -1.4724F, 0.2319F, 0.4259F, -1.3871F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(74, 43).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1801F, -2.9724F, 0.4224F, -0.3323F, 0.9335F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(48, 20).addBox(2.7085F, -1.8413F, -0.1369F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1801F, -2.9724F, 0.2426F, -0.4773F, 1.3824F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(110, 29).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1801F, -2.9724F, 0.5343F, -0.1886F, 0.5065F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(110, 12).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8801F, -1.4724F, 0.4879F, -0.163F, 0.5146F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(61, 45).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8801F, -1.4724F, 0.3899F, -0.29F, 0.9435F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(36, 46).addBox(2.7085F, -1.8413F, -0.1369F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8801F, -1.4724F, 0.2319F, -0.4259F, 1.3871F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.559F, -2.8699F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(54, 108).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0185F, -3.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(39, 108).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6418F, -2.0946F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(9, 81).addBox(0.0F, -2.5974F, -0.0441F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.363F, -4.9659F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(29, 10).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.2215F, -0.6536F, 0.0693F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(19, 48).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.1431F, -0.7492F, 0.0558F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(51, 54).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.1904F, -0.9039F, 0.0154F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.453F, -1.0393F, -0.0914F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(111, 86).mirror().addBox(-4.7085F, -1.8413F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.0211F, -4.3026F, 0.0344F, 0.792F, -1.5974F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(111, 82).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.0211F, -4.3026F, 0.4308F, 0.6878F, -1.0191F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(110, 104).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.0211F, -4.3026F, 0.7067F, 0.5056F, -0.5366F));

		PartDefinition cube_r194 = chest2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 34).mirror().addBox(-6.7084F, -1.8413F, -0.1369F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5211F, -2.8026F, 0.1742F, 0.6578F, -1.4619F));

		PartDefinition cube_r195 = chest2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(111, 78).mirror().addBox(-3.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5211F, -2.8026F, 0.4564F, 0.5191F, -0.962F));

		PartDefinition cube_r196 = chest2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5211F, -2.8026F, 0.6449F, 0.3452F, -0.5197F));

		PartDefinition cube_r197 = chest2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1211F, -1.4026F, 0.5477F, 0.2357F, -0.5217F));

		PartDefinition cube_r198 = chest2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-10.7085F, -1.8413F, -0.137F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1211F, -1.4026F, 0.2106F, 0.5173F, -1.4158F));

		PartDefinition cube_r199 = chest2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(111, 84).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.1211F, -1.4026F, 0.4142F, 0.3806F, -0.9545F));

		PartDefinition cube_r200 = chest2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(110, 104).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0211F, -4.3026F, 0.7067F, -0.5056F, 0.5366F));

		PartDefinition cube_r201 = chest2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(111, 82).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0211F, -4.3026F, 0.4308F, -0.6878F, 1.0191F));

		PartDefinition cube_r202 = chest2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(111, 86).addBox(2.7085F, -1.8413F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.0211F, -4.3026F, 0.0344F, -0.792F, 1.5974F));

		PartDefinition cube_r203 = chest2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(110, 102).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5211F, -2.8026F, 0.6449F, -0.3452F, 0.5197F));

		PartDefinition cube_r204 = chest2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(111, 78).addBox(1.2329F, -0.5242F, -0.1369F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5211F, -2.8026F, 0.4564F, -0.5191F, 0.962F));

		PartDefinition cube_r205 = chest2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(94, 34).addBox(2.7085F, -1.8413F, -0.1369F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5211F, -2.8026F, 0.1742F, -0.6578F, 1.4619F));

		PartDefinition cube_r206 = chest2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(111, 84).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1211F, -1.4026F, 0.4142F, -0.3806F, 0.9545F));

		PartDefinition cube_r207 = chest2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(55, 43).addBox(2.7085F, -1.8413F, -0.137F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1211F, -1.4026F, 0.2106F, -0.5173F, 1.4158F));

		PartDefinition cube_r208 = chest2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(110, 66).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.1211F, -1.4026F, 0.5477F, -0.2357F, 0.5217F));

		PartDefinition cube_r209 = chest2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(31, 82).addBox(-1.0F, -0.9F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.2762F, -0.7208F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(29, 10).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.2215F, 0.6536F, -0.0693F));

		PartDefinition cube_r211 = chest2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(19, 48).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.1431F, 0.7492F, -0.0558F));

		PartDefinition cube_r212 = chest2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(51, 54).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.1904F, 0.9039F, -0.0154F));

		PartDefinition cube_r213 = chest2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 30).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8239F, 2.2718F, 0.453F, 1.0393F, 0.0914F));

		PartDefinition cube_r214 = chest2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(16, 94).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8448F, 1.072F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(48, 11).addBox(-1.0F, -0.9762F, -5.9611F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7592F, 0.0F, 0.0F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9872F, -4.1156F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(118, 82).addBox(0.0F, -1.2F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.1148F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(39, 89).addBox(-0.5F, -2.0F, 3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9305F, -4.5991F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(112, 33).mirror().addBox(-3.7085F, -1.8413F, -0.137F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0339F, -1.4869F, 0.0344F, 0.792F, -1.5974F));

		PartDefinition cube_r219 = neck4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(110, 106).mirror().addBox(-1.3591F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0339F, -1.4869F, 0.7067F, 0.5056F, -0.5366F));

		PartDefinition cube_r220 = neck4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(111, 76).mirror().addBox(-3.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0339F, -1.4869F, 0.4308F, 0.6878F, -1.0191F));

		PartDefinition cube_r221 = neck4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(112, 33).addBox(2.7085F, -1.8413F, -0.137F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0339F, -1.4869F, 0.0344F, -0.792F, 1.5974F));

		PartDefinition cube_r222 = neck4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(111, 76).addBox(1.2329F, -0.5242F, -0.137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0339F, -1.4869F, 0.4308F, -0.6878F, 1.0191F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(110, 106).addBox(-0.6409F, 0.0441F, -0.2219F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0339F, -1.4869F, 0.7067F, -0.5056F, 0.5366F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4686F, -2.3702F, 0.289F, 0.0837F, 0.0248F));

		PartDefinition cube_r224 = neck3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(36, 119).addBox(0.0F, -2.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 53).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4712F, -3.9871F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(111, 74).mirror().addBox(-3.6628F, -0.8898F, -0.2835F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1346F, -0.6167F, 0.3248F, 0.5363F, -1.3595F));

		PartDefinition cube_r226 = neck3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(111, 21).mirror().addBox(-1.8925F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1346F, -0.6167F, 0.5432F, 0.4108F, -0.8884F));

		PartDefinition cube_r227 = neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(111, 21).addBox(-0.1075F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1346F, -0.6167F, 0.5432F, -0.4108F, 0.8884F));

		PartDefinition cube_r228 = neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(111, 74).addBox(1.6628F, -0.8898F, -0.2835F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1346F, -0.6167F, 0.3248F, -0.5363F, 1.3595F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3538F, -1.6621F, -0.0703F, 0.008F, 0.0307F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(42, 119).addBox(0.0F, -0.522F, 1.96F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 119).addBox(0.0F, -0.522F, 3.96F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 75).addBox(-0.5F, -0.022F, 1.96F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9F, -4.2F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(111, 25).mirror().addBox(-1.8925F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5808F, -3.1547F, 0.2316F, 0.6328F, -1.2162F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-1.8925F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2808F, -1.2547F, 0.292F, 0.6102F, -1.1125F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(111, 25).addBox(-0.1075F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.5808F, -3.1547F, 0.2316F, -0.6328F, 1.2162F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(111, 23).addBox(-0.1075F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2808F, -1.2547F, 0.292F, -0.6102F, 1.1125F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0711F, -2.9783F, -0.3592F, -0.2386F, -0.033F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(45, 119).addBox(0.0F, -0.2F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 30).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0174F, -2.9992F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(111, 27).mirror().addBox(-1.8925F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0097F, -1.7764F, 0.3881F, 0.819F, -1.0805F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(111, 27).addBox(-0.1075F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0097F, -1.7764F, 0.3881F, -0.819F, 1.0805F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8543F, -2.7004F, 0.1142F, -0.0577F, 0.0733F));

		PartDefinition cube_r237 = neck5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 107).addBox(0.0F, -1.4F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7365F, 0.1645F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(111, 35).mirror().addBox(-1.8925F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0446F, -1.576F, 0.1076F, 0.9134F, -1.2125F));

		PartDefinition cube_r239 = neck5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(111, 35).addBox(-0.1075F, -0.1102F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0446F, -1.576F, 0.1076F, -0.9134F, 1.2125F));

		PartDefinition cube_r240 = neck5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0174F, -2.9992F, -0.2967F, 0.0F, 0.0F));

		PartDefinition heads = neck5.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3461F, -2.143F, 0.0429F, -0.1213F, -0.2236F));

		PartDefinition cube_r241 = heads.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(42, 116).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.622F, -9.5227F, 1.6188F, 0.0F, 0.0F));

		PartDefinition cube_r242 = heads.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(104, 25).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.7035F, -8.2114F, 0.8334F, 0.0F, 0.0F));

		PartDefinition cube_r243 = heads.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(37, 116).addBox(-0.5F, 0.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.7138F, -9.1041F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r244 = heads.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(32, 116).addBox(-0.5F, 0.025F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.0476F, -8.4989F, 0.8334F, 0.0F, 0.0F));

		PartDefinition cube_r245 = heads.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(17, 116).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.3688F, -7.7646F, 0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r246 = heads.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(90, 103).addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2145F, -6.1313F, 0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r247 = heads.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(100, 115).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2569F, -5.3065F, 0.5192F, 0.0F, 0.0F));

		PartDefinition cube_r248 = heads.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(3, 115).addBox(-0.5F, -0.775F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.5534F, -5.1532F, 0.432F, 0.0F, 0.0F));

		PartDefinition cube_r249 = heads.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 10).addBox(-1.5F, -0.05F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1903F, -1.5663F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r250 = heads.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(46, 98).addBox(-1.0F, -0.05F, -1.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.793F, -2.4683F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r251 = heads.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(98, 14).addBox(-1.5F, -0.05F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.793F, -2.4683F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r252 = heads.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(48, 24).addBox(-1.5F, 0.0F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5129F, 0.2483F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r253 = heads.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(58, 89).addBox(-1.5F, 0.0F, 0.025F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.9434F, -0.6543F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(99, 72).addBox(-0.552F, -1.9614F, -1.8786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.341F, -1.7867F, 0.107F, -0.0348F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(112, 58).addBox(-0.552F, -2.6136F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.341F, -0.8268F, 0.107F, -0.0348F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(115, 0).addBox(-0.9878F, -0.2524F, -1.3401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8122F, 4.4034F, -5.6354F, 0.432F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(89, 70).addBox(-0.6373F, -0.5F, -1.4845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8386F, 0.1394F, -0.9541F, 0.6979F, 0.7525F, 0.469F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(20, 81).addBox(-0.8364F, -0.5F, -0.9173F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.8386F, 0.1394F, -0.9541F, 0.4885F, -0.0277F, -0.0662F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(98, 59).addBox(-0.631F, -1.9866F, -0.5447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.341F, -0.1149F, 0.1023F, -0.0417F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 94).addBox(-0.6352F, -1.0719F, -1.1827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.5847F, 0.1047F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(78, 0).addBox(-0.6351F, -0.7186F, -0.0385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.192F, 0.1047F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(104, 21).addBox(-0.6343F, -0.7475F, -1.4622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.4016F, 0.1046F, 0.0028F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(113, 114).addBox(-0.6822F, -0.5997F, -0.5582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.181F, 3.5444F, -4.4076F, 0.5326F, 0.1221F, 0.0028F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(55, 99).addBox(-0.55F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.6911F, 1.2172F, -0.5821F, 0.5394F, 0.1593F, 0.1364F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(97, 82).addBox(-0.5811F, -1.4861F, -1.0326F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.341F, 0.2585F, 0.0938F, 0.003F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(34, 112).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4412F, 2.4251F, 2.3237F, 0.2508F, 0.0737F, -0.0737F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 119).addBox(0.1938F, -0.4294F, -0.4369F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.181F, 3.5444F, -4.4076F, 0.5134F, 0.0603F, 0.1346F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(48, 119).addBox(0.219F, -0.5611F, -1.1447F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.3802F, 0.043F, 0.1345F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(69, 82).addBox(0.219F, -0.5225F, -0.1396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.2929F, 0.043F, 0.1345F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(67, 108).addBox(0.1978F, -0.5594F, 0.8503F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0228F, 2.9202F, -2.6978F, 0.1833F, 0.0524F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(118, 43).addBox(-0.5238F, -0.8147F, -0.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-2.1907F, 3.5952F, -5.4331F, 0.1242F, 0.0567F, 0.0212F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(118, 67).addBox(-0.474F, -0.1538F, -0.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 118).addBox(-0.474F, -0.3538F, -0.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-2.1907F, 3.5952F, -5.4331F, -0.443F, 0.0567F, 0.0212F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(67, 118).addBox(-0.474F, -0.0325F, -0.4814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(118, 54).addBox(-0.474F, -0.3325F, -0.4814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.1907F, 3.5952F, -5.4331F, -0.7484F, 0.0567F, 0.0212F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(118, 51).addBox(-0.5238F, -0.7952F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.1907F, 3.5952F, -5.4331F, -0.9666F, 0.0567F, 0.0212F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(118, 40).addBox(-0.5238F, -0.7024F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.1907F, 3.5952F, -5.4331F, -0.7048F, 0.0567F, 0.0212F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(22, 118).addBox(-0.4876F, -0.3741F, -0.8659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -0.2917F, 0.0768F, -0.0336F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(52, 116).addBox(-0.4876F, -0.1461F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(117, 29).addBox(-0.4876F, -0.6947F, 0.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -2.0283F, 0.0768F, -0.0336F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(47, 116).addBox(-0.4876F, 0.0209F, -0.1385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -1.5483F, 0.0768F, -0.0336F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(114, 108).addBox(-0.4876F, 0.0732F, 0.1876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -1.4611F, 0.0768F, -0.0336F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(57, 116).addBox(-0.4876F, -0.9285F, 0.2683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -2.3774F, 0.0768F, -0.0336F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(114, 99).addBox(-0.4876F, -0.4943F, 0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -1.9847F, 0.0768F, -0.0336F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(110, 8).addBox(-0.4876F, -0.9272F, -0.6155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(49, 108).addBox(-0.4876F, -1.2272F, -0.3155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -0.4226F, 0.0768F, -0.0336F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(118, 20).addBox(-0.4876F, -0.9594F, -1.1355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -1.1731F, 0.0768F, -0.0336F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(114, 96).addBox(-0.4876F, -0.8649F, -0.9747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -0.7804F, 0.0768F, -0.0336F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 114).addBox(-0.4973F, -1.0163F, -0.2991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 0.1872F, 0.0975F, 0.0253F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(113, 111).addBox(-0.4973F, -0.37F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, -1.0345F, 0.0975F, 0.0253F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(113, 55).addBox(-0.4973F, 0.0965F, -0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, -1.9072F, 0.0975F, 0.0253F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(113, 52).addBox(-0.4973F, -0.5355F, 0.1627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, -2.7798F, 0.0975F, 0.0253F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(113, 45).addBox(-0.4973F, -1.1243F, -0.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 2.6743F, 0.0975F, 0.0253F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(113, 42).addBox(-0.4973F, -0.5959F, -1.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 1.758F, 0.0975F, 0.0253F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(113, 39).addBox(-0.4973F, -0.5626F, -0.9916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 2.4125F, 0.0975F, 0.0253F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(85, 114).addBox(-0.4973F, -0.3976F, -0.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 113).addBox(-0.4973F, -0.3976F, -1.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 2.9361F, 0.0975F, 0.0253F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(102, 112).addBox(-0.4973F, 0.1297F, -1.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, 3.0234F, 0.0975F, 0.0253F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 112).addBox(-0.3973F, -0.4992F, -0.5506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(67, 112).addBox(-0.5223F, -0.4992F, -0.5506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4669F, 0.8046F, -0.5606F, -0.7073F, 0.0975F, 0.0253F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(118, 12).addBox(-0.4876F, -0.6914F, -0.8685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, -0.4313F, 0.0768F, -0.0336F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(118, 75).addBox(-0.4876F, -1.2689F, 0.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1453F, 0.3325F, 1.315F, 0.1534F, 0.0768F, -0.0336F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.6853F, 1.103F, -0.3755F, 0.4193F, 0.1268F, 0.0255F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(106, 75).addBox(-0.5703F, -2.746F, -1.7978F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3966F, 1.1462F, 1.341F, 1.0738F, 0.1268F, 0.0255F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(113, 14).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(97, 112).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.9082F, 4.8012F, -5.9134F, 0.4226F, 0.2168F, 0.1736F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(102, 92).addBox(-0.5F, -0.5975F, -0.1948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9225F, 2.2934F, -3.3346F, 0.5311F, 0.0738F, -0.1167F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(102, 88).addBox(-0.5F, -0.5792F, -1.8072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.9225F, 2.2934F, -3.3346F, 0.7492F, 0.0738F, -0.1167F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(44, 102).addBox(-0.2556F, -0.1887F, -0.3345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8694F, 4.4301F, -5.6413F, 0.9737F, -0.0273F, -0.1885F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.7735F, -2.7839F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-0.448F, -1.9614F, -1.8786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.341F, -1.7867F, -0.107F, 0.0348F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(112, 58).mirror().addBox(-0.448F, -2.6136F, -0.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.341F, -0.8268F, -0.107F, 0.0348F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.0122F, -0.2524F, -1.3401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8122F, 4.4034F, -5.6354F, 0.432F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(89, 70).mirror().addBox(-1.3627F, -0.5F, -1.4845F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8386F, 0.1394F, -0.9541F, 0.6979F, -0.7525F, -0.469F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-1.1636F, -0.5F, -0.9173F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.8386F, 0.1394F, -0.9541F, 0.4885F, 0.0277F, 0.0662F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-0.369F, -1.9866F, -0.5447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.341F, -0.1149F, -0.1023F, 0.0417F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.3648F, -1.0719F, -1.1827F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.5847F, -0.1047F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.3649F, -0.7186F, -0.0385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.192F, -0.1047F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(104, 21).mirror().addBox(-0.3657F, -0.7475F, -1.4622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.4016F, -0.1046F, -0.0028F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(113, 114).mirror().addBox(-0.3178F, -0.5997F, -0.5582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.181F, 3.5444F, -4.4076F, 0.5326F, -0.1221F, -0.0028F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(-0.45F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(1.6911F, 1.2172F, -0.5821F, 0.5394F, -0.1593F, -0.1364F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(-0.4189F, -1.4861F, -1.0326F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.341F, 0.2585F, -0.0938F, -0.003F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(34, 112).mirror().addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4412F, 2.4251F, 2.3237F, 0.2508F, -0.0737F, 0.0737F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(51, 119).mirror().addBox(-0.1938F, -0.4294F, -0.4369F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.181F, 3.5444F, -4.4076F, 0.5134F, -0.0603F, -0.1346F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(48, 119).mirror().addBox(-0.219F, -0.5611F, -1.1447F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.3802F, -0.043F, -0.1345F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.219F, -0.5225F, -0.1396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.2929F, -0.043F, -0.1345F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(67, 108).mirror().addBox(-0.1978F, -0.5594F, 0.8503F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0228F, 2.9202F, -2.6978F, 0.1833F, -0.0524F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(118, 43).mirror().addBox(-0.4762F, -0.8147F, -0.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(2.1907F, 3.5952F, -5.4331F, 0.1242F, -0.0567F, -0.0212F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(118, 67).mirror().addBox(-0.526F, -0.1538F, -0.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 118).mirror().addBox(-0.526F, -0.3538F, -0.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(2.1907F, 3.5952F, -5.4331F, -0.443F, -0.0567F, -0.0212F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(67, 118).mirror().addBox(-0.526F, -0.0325F, -0.4814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(118, 54).mirror().addBox(-0.526F, -0.3325F, -0.4814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(2.1907F, 3.5952F, -5.4331F, -0.7484F, -0.0567F, -0.0212F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(118, 51).mirror().addBox(-0.4762F, -0.7952F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.1907F, 3.5952F, -5.4331F, -0.9666F, -0.0567F, -0.0212F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(118, 40).mirror().addBox(-0.4762F, -0.7024F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.1907F, 3.5952F, -5.4331F, -0.7048F, -0.0567F, -0.0212F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(22, 118).mirror().addBox(-0.5124F, -0.3741F, -0.8659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -0.2917F, -0.0768F, 0.0336F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(52, 116).mirror().addBox(-0.5124F, -0.1461F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(117, 29).mirror().addBox(-0.5124F, -0.6947F, 0.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -2.0283F, -0.0768F, 0.0336F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(47, 116).mirror().addBox(-0.5124F, 0.0209F, -0.1385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -1.5483F, -0.0768F, 0.0336F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(114, 108).mirror().addBox(-0.5124F, 0.0732F, 0.1876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -1.4611F, -0.0768F, 0.0336F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(57, 116).mirror().addBox(-0.5124F, -0.9285F, 0.2683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -2.3774F, -0.0768F, 0.0336F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-0.5124F, -0.4943F, 0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -1.9847F, -0.0768F, 0.0336F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(110, 8).mirror().addBox(-0.5124F, -0.9272F, -0.6155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(49, 108).mirror().addBox(-0.5124F, -1.2272F, -0.3155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -0.4226F, -0.0768F, 0.0336F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(118, 20).mirror().addBox(-0.5124F, -0.9594F, -1.1355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -1.1731F, -0.0768F, 0.0336F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(114, 96).mirror().addBox(-0.5124F, -0.8649F, -0.9747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -0.7804F, -0.0768F, 0.0336F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(-0.5027F, -1.0163F, -0.2991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 0.1872F, -0.0975F, -0.0253F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(113, 111).mirror().addBox(-0.5027F, -0.37F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, -1.0345F, -0.0975F, -0.0253F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(113, 55).mirror().addBox(-0.5027F, 0.0965F, -0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, -1.9072F, -0.0975F, -0.0253F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(113, 52).mirror().addBox(-0.5027F, -0.5355F, 0.1627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, -2.7798F, -0.0975F, -0.0253F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(113, 45).mirror().addBox(-0.5027F, -1.1243F, -0.3936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 2.6743F, -0.0975F, -0.0253F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(113, 42).mirror().addBox(-0.5027F, -0.5959F, -1.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 1.758F, -0.0975F, -0.0253F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(113, 39).mirror().addBox(-0.5027F, -0.5626F, -0.9916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 2.4125F, -0.0975F, -0.0253F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(85, 114).mirror().addBox(-0.5027F, -0.3976F, -0.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 113).mirror().addBox(-0.5027F, -0.3976F, -1.001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 2.9361F, -0.0975F, -0.0253F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(102, 112).mirror().addBox(-0.5027F, 0.1297F, -1.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, 3.0234F, -0.0975F, -0.0253F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(80, 112).mirror().addBox(-0.6027F, -0.4992F, -0.5506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(67, 112).mirror().addBox(-0.4777F, -0.4992F, -0.5506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4669F, 0.8046F, -0.5606F, -0.7073F, -0.0975F, -0.0253F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(118, 12).mirror().addBox(-0.5124F, -0.6914F, -0.8685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, -0.4313F, -0.0768F, 0.0336F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(118, 75).mirror().addBox(-0.5124F, -1.2689F, 0.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1453F, 0.3325F, 1.315F, 0.1534F, -0.0768F, 0.0336F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.6853F, 1.103F, -0.3755F, 0.4193F, -0.1268F, -0.0255F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(106, 75).mirror().addBox(-0.4297F, -2.746F, -1.7978F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3966F, 1.1462F, 1.341F, 1.0738F, -0.1268F, -0.0255F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(113, 14).mirror().addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 112).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.9082F, 4.8012F, -5.9134F, 0.4226F, -0.2168F, -0.1736F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-0.5F, -0.5975F, -0.1948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9225F, 2.2934F, -3.3346F, 0.5311F, -0.0738F, 0.1167F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(102, 88).mirror().addBox(-0.5F, -0.5792F, -1.8072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.9225F, 2.2934F, -3.3346F, 0.7492F, -0.0738F, 0.1167F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(44, 102).mirror().addBox(-0.7444F, -0.1887F, -0.3345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8694F, 4.4301F, -5.6413F, 0.9737F, 0.0273F, 0.1885F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5351F, -0.7872F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(67, 115).mirror().addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4582F, 0.1662F, -4.2185F, 0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(62, 115).mirror().addBox(-0.5F, -0.65F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.3765F, 0.5831F, -5.1514F, 0.2094F, -0.0873F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-0.5F, 0.225F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.901F, -0.4035F, -0.8888F, -1.8588F, -0.2182F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(90, 114).mirror().addBox(-0.5F, -0.325F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8637F, -1.442F, -1.0569F, -0.9861F, -0.2182F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(28, 104).mirror().addBox(-0.5F, -0.575F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.901F, -0.4035F, -0.8888F, -1.3352F, -0.2182F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(34, 108).mirror().addBox(-0.5F, -1.525F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.792F, 0.469F, -1.3803F, 0.0175F, -0.2182F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 117).mirror().addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.9713F, -0.0202F, -0.5715F, 0.1047F, -0.2182F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(117, 88).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9713F, -0.0202F, -0.5715F, -0.7679F, -0.2182F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(117, 105).mirror().addBox(-0.5F, -0.85F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(117, 61).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.2953F, 0.7635F, 0.4387F, -0.3752F, -0.2182F, 0.0F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(117, 58).mirror().addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.2953F, 0.7635F, 0.4387F, 0.0175F, -0.2182F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(117, 48).mirror().addBox(-0.5F, -0.825F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4023F, 0.6896F, 0.9215F, 0.1484F, -0.2182F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(117, 32).mirror().addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4769F, 0.1886F, 1.2582F, 0.8029F, -0.2182F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(27, 115).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4769F, 0.1886F, 1.2582F, 1.2392F, -0.2182F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(57, 119).mirror().addBox(0.0F, 0.025F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7933F, -0.2955F, -5.1032F, 0.2538F, -0.0855F, -0.0174F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(54, 119).mirror().addBox(0.0F, 0.025F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8803F, -0.4772F, -4.1237F, 0.1838F, -0.0865F, -0.0114F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(20, 109).mirror().addBox(0.0F, -0.475F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9651F, -0.0567F, -3.0912F, 0.079F, -0.0865F, -0.0114F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(0.0F, -0.45F, -0.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6074F, 0.4417F, -5.9551F, 0.5934F, -0.0873F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(72, 117).mirror().addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, 1.0516F, -6.9911F, 0.542F, -0.0843F, -0.0226F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(22, 115).mirror().addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3199F, 0.6791F, -6.0801F, 0.4014F, -0.0873F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(51, 104).mirror().addBox(-0.35F, -0.9777F, -1.5962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5536F, 1.0714F, -4.8485F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(103, 48).mirror().addBox(-0.35F, -0.5777F, -1.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.6357F, -4.6042F, 0.1309F, -0.0873F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-0.5F, -0.475F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1456F, 1.2169F, -6.6434F, 0.3971F, -0.0873F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(115, 17).mirror().addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(115, 17).addBox(0.2F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.7528F, -8.2361F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(117, 64).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(117, 64).addBox(0.2F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 0.9578F, -7.7114F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(115, 9).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(115, 9).addBox(0.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.35F, 1.3832F, -7.6481F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(8, 115).mirror().addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(8, 115).addBox(0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.525F, 1.6416F, -8.1624F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(115, 6).mirror().addBox(-0.5F, -0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(115, 6).addBox(0.25F, -0.375F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.375F, 1.067F, -7.2958F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(115, 3).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(115, 3).addBox(0.25F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.375F, 1.5394F, -7.3518F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(104, 36).mirror().addBox(-0.5F, -1.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.6816F, 0.8807F, -1.6642F, 0.0611F, -0.0873F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5909F, 0.2431F, -2.7011F, 0.1047F, -0.0873F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(67, 115).addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4582F, 0.1662F, -4.2185F, 0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(62, 115).addBox(-0.5F, -0.65F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.3765F, 0.5831F, -5.1514F, 0.2094F, 0.0873F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(35, 104).addBox(-0.5F, 0.225F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.901F, -0.4035F, -0.8888F, -1.8588F, 0.2182F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(90, 114).addBox(-0.5F, -0.325F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8637F, -1.442F, -1.0569F, -0.9861F, 0.2182F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(28, 104).addBox(-0.5F, -0.575F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.901F, -0.4035F, -0.8888F, -1.3352F, 0.2182F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(34, 108).addBox(-0.5F, -1.525F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.792F, 0.469F, -1.3803F, 0.0175F, 0.2182F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(90, 117).addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.9713F, -0.0202F, -0.5715F, 0.1047F, 0.2182F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(117, 88).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9713F, -0.0202F, -0.5715F, -0.7679F, 0.2182F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -0.85F, -1.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(117, 61).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.2953F, 0.7635F, 0.4387F, -0.3752F, 0.2182F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(117, 58).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.2953F, 0.7635F, 0.4387F, 0.0175F, 0.2182F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(117, 48).addBox(-0.5F, -0.825F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4023F, 0.6896F, 0.9215F, 0.1484F, 0.2182F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(117, 32).addBox(-0.5F, -0.7F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4769F, 0.1886F, 1.2582F, 0.8029F, 0.2182F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(27, 115).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4769F, 0.1886F, 1.2582F, 1.2392F, 0.2182F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(57, 119).addBox(0.0F, 0.025F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7933F, -0.2955F, -5.1032F, 0.2538F, 0.0855F, 0.0174F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(54, 119).addBox(0.0F, 0.025F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8803F, -0.4772F, -4.1237F, 0.1838F, 0.0865F, 0.0114F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(20, 109).addBox(0.0F, -0.475F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9651F, -0.0567F, -3.0912F, 0.079F, 0.0865F, 0.0114F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 99).addBox(0.0F, -0.45F, -0.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6074F, 0.4417F, -5.9551F, 0.5934F, 0.0873F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(72, 117).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2402F, 1.0516F, -6.9911F, 0.542F, 0.0843F, 0.0226F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(22, 115).addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3199F, 0.6791F, -6.0801F, 0.4014F, 0.0873F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(51, 104).addBox(-0.65F, -0.9777F, -1.5962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5536F, 1.0714F, -4.8485F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(103, 48).addBox(-0.65F, -0.5777F, -1.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.575F, 0.6357F, -4.6042F, 0.1309F, 0.0873F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(103, 29).addBox(-0.5F, -0.475F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1456F, 1.2169F, -6.6434F, 0.3971F, 0.0873F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(104, 36).addBox(-0.5F, -1.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.6816F, 0.8807F, -1.6642F, 0.0611F, 0.0873F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(103, 4).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5909F, 0.2431F, -2.7011F, 0.1047F, 0.0873F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 7.046F, -4.6707F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r406 = bone2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 81).addBox(-0.2F, -0.8F, -1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3069F, 4.8941F, -2.2627F, 0.7276F, 0.3762F, 0.8375F));

		PartDefinition cube_r407 = bone2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(9, 95).addBox(-1.5F, -1.4836F, -1.7712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.6294F, 1.1355F, 0.2296F, 0.4552F));

		PartDefinition cube_r408 = bone2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(62, 99).addBox(-1.5F, -0.5836F, -0.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.6294F, 0.2628F, 0.2296F, 0.4552F));

		PartDefinition cube_r409 = bone2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(99, 43).addBox(-1.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.0F, 3.668F, -1.6294F, 2.0082F, 0.2296F, 0.4552F));

		PartDefinition cube_r410 = bone2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(88, 82).addBox(-0.5F, -1.4973F, -5.2068F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6F, -1.2606F, 2.2459F, 1.0498F, 0.0511F, 0.2185F));

		PartDefinition cube_r411 = bone2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0854F, -1.138F, -0.1047F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.7F, 0.6394F, 0.7459F, 0.8409F, -0.0533F, 0.0788F));

		PartDefinition cube_r412 = bone2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(110, 4).addBox(-1.0854F, 0.9F, 5.2109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.7F, 0.6394F, 0.7459F, 1.2074F, -0.0533F, 0.0788F));

		PartDefinition cube_r413 = bone2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(110, 0).addBox(-1.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.7F, 0.6394F, 0.7459F, 0.5092F, -0.0533F, 0.0788F));

		PartDefinition cube_r414 = bone2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(36, 48).addBox(-1.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.7F, 0.6394F, 0.7459F, 0.9107F, -0.0533F, 0.0788F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 7.046F, -4.6707F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r415 = bone4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.8F, -0.8F, -1.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3069F, 4.8941F, -2.2627F, 0.7276F, -0.3762F, -0.8375F));

		PartDefinition cube_r416 = bone4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(9, 95).mirror().addBox(0.5F, -1.4836F, -1.7712F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.6294F, 1.1355F, -0.2296F, -0.4552F));

		PartDefinition cube_r417 = bone4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(62, 99).mirror().addBox(0.5F, -0.5836F, -0.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.6294F, 0.2628F, -0.2296F, -0.4552F));

		PartDefinition cube_r418 = bone4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(0.5F, -0.7836F, -0.7712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.668F, -1.6294F, 2.0082F, -0.2296F, -0.4552F));

		PartDefinition cube_r419 = bone4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(-0.5F, -1.4973F, -5.2068F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6F, -1.2606F, 2.2459F, 1.0498F, -0.0511F, -0.2185F));

		PartDefinition cube_r420 = bone4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0854F, -1.138F, -0.1047F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6394F, 0.7459F, 0.8409F, 0.0533F, -0.0788F));

		PartDefinition cube_r421 = bone4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(110, 4).mirror().addBox(0.0854F, 0.9F, 5.2109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6394F, 0.7459F, 1.2074F, 0.0533F, -0.0788F));

		PartDefinition cube_r422 = bone4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(0.0854F, -3.3471F, 5.0498F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6394F, 0.7459F, 0.5092F, 0.0533F, -0.0788F));

		PartDefinition cube_r423 = bone4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(0.0854F, -1.1421F, -0.0394F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 0.6394F, 0.7459F, 0.9107F, 0.0533F, -0.0788F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7969F, 12.4961F, -4.8959F, 0.4091F, 0.114F, -0.573F));

		PartDefinition cube_r424 = leftArm.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(85, 98).addBox(0.0F, -2.3F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r425 = leftArm.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 102).addBox(0.0419F, -15.7734F, -7.7275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r426 = leftArm.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(48, 112).addBox(-0.3441F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3984F, -0.7317F, -1.0971F, -1.0374F, -0.4743F, -0.0768F));

		PartDefinition cube_r427 = leftArm.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(106, 69).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3984F, 1.6683F, -0.3971F, -0.06F, -0.4743F, -0.0768F));

		PartDefinition cube_r428 = leftArm.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(97, 106).addBox(-0.2622F, -0.0365F, -0.1808F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6168F, 3.2178F, -1.1103F, 0.5073F, -0.4743F, -0.0768F));

		PartDefinition cube_r429 = leftArm.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0263F, 1.8936F, 0.3562F, -0.0278F, 0.0171F, -0.0061F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(48, 89).addBox(-0.5909F, -0.1079F, -0.2717F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(25, 94).addBox(-0.5909F, 1.8921F, -1.3717F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6194F, 6.6087F, 2.2433F, -0.9292F, 0.299F, -0.0282F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(16, 86).addBox(-0.508F, -0.0675F, -1.0751F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.029F, 6.6122F, 0.0527F, 0.0501F, 0.3698F, 0.0634F));

		PartDefinition cube_r430 = leftArm3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(76, 99).addBox(-0.5F, -0.325F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.008F, 0.5357F, -2.7619F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r431 = leftArm3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(37, 100).addBox(-0.5F, -0.425F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.008F, 0.5357F, -2.7619F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r432 = leftArm3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(99, 98).addBox(-0.5F, -0.575F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.008F, 0.5357F, -2.7619F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r433 = leftArm3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(99, 22).addBox(-0.5674F, -3.7127F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, 3.6452F, -1.1751F, -0.0436F, 0.0F, 0.0087F));

		PartDefinition cube_r434 = leftArm3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(112, 88).addBox(-0.8003F, 0.6769F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0095F, 3.6452F, -1.1751F, -0.0416F, -0.0131F, -0.2964F));

		PartDefinition cube_r435 = leftArm3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(65, 16).addBox(11.9544F, -2.5239F, -11.9898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(112, 61).addBox(11.9544F, -2.0239F, -10.9898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5945F, 0.2152F, -0.5127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0399F, 0.0515F, 0.4663F, 0.437F, -0.005F, 0.0271F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7969F, 12.4961F, -4.8959F, -0.3951F, -0.2068F, 0.2478F));

		PartDefinition cube_r436 = rightArm.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(92, 98).addBox(-1.0F, -2.3F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4737F, 8.4624F, 1.3754F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r437 = rightArm.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(10, 102).addBox(-1.0419F, -15.7734F, -7.7275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5155F, 15.1874F, 11.8638F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r438 = rightArm.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(57, 112).addBox(-0.6559F, -2.0321F, 0.0903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3984F, -0.7317F, -1.0971F, -1.0374F, 0.4743F, 0.0768F));

		PartDefinition cube_r439 = rightArm.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(106, 96).addBox(-0.5F, -2.3784F, -0.7587F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3984F, 1.6683F, -0.3971F, -0.06F, 0.4743F, 0.0768F));

		PartDefinition cube_r440 = rightArm.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(102, 106).addBox(-0.7378F, -0.0365F, -0.1808F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6168F, 3.2178F, -1.1103F, 0.5073F, 0.4743F, 0.0768F));

		PartDefinition cube_r441 = rightArm.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(16, 99).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0263F, 1.8936F, 0.3562F, -0.0278F, -0.0171F, 0.0061F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(53, 89).addBox(-0.4091F, -0.1079F, -0.2717F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(98, 65).addBox(-0.4091F, 1.8921F, -1.3717F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6194F, 6.6087F, 2.2433F, -1.0127F, -0.052F, 0.0882F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(23, 86).addBox(-0.492F, -0.0675F, -1.0751F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.029F, 6.6122F, 0.0527F, 0.0501F, -0.3698F, -0.0634F));

		PartDefinition cube_r442 = rightArm3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(99, 76).addBox(-0.5F, -0.325F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.008F, 0.5357F, -2.7619F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r443 = rightArm3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(101, 17).addBox(-0.5F, -0.425F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.008F, 0.5357F, -2.7619F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightArm3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(30, 100).addBox(-0.5F, -0.575F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.008F, 0.5357F, -2.7619F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r445 = rightArm3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(99, 36).addBox(-0.4326F, -3.7127F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, 3.6452F, -1.1751F, -0.0436F, 0.0F, -0.0087F));

		PartDefinition cube_r446 = rightArm3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(112, 91).addBox(-0.1997F, 0.6769F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0095F, 3.6452F, -1.1751F, -0.0416F, 0.0131F, 0.2964F));

		PartDefinition cube_r447 = rightArm3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(78, 12).addBox(-12.9544F, -2.5239F, -11.9898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(62, 112).addBox(-12.9544F, -2.0239F, -10.9898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(11.2929F, 10.0564F, 10.9147F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(15, 106).addBox(-0.4055F, 0.2152F, -0.5127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0399F, 0.0515F, 0.4663F, 0.437F, 0.005F, -0.0271F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 38).addBox(-0.5F, -0.853F, -0.0264F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0424F, 8.1493F, -0.186F, 0.1716F, -0.0321F));

		PartDefinition cube_r448 = tail.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(28, 108).addBox(0.0F, 0.0024F, -1.2045F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0431F, 7.2136F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r449 = tail.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(111, 96).addBox(0.0F, -0.0976F, -0.1045F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.045F, 3.7184F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r450 = tail.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(118, 70).addBox(0.0F, 0.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8733F, 1.5228F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(61, 104).addBox(0.0F, -5.7F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.953F, 2.9736F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(58, 104).addBox(0.0F, -5.7F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.853F, 4.9736F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(85, 89).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.853F, 0.9736F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-2.3017F, -0.0018F, 0.1486F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.153F, 0.8736F, 0.0067F, 0.0694F, 0.0031F));

		PartDefinition cube_r455 = tail.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(51, 48).addBox(-0.6983F, -0.0018F, 0.1486F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.153F, 0.8736F, 0.0067F, -0.0694F, -0.0031F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(40, 27).addBox(-0.5F, -0.0798F, -0.0033F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7731F, 6.977F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r456 = tail6.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(45, 110).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0798F, 5.9967F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail6.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(11, 108).addBox(0.0F, -4.5F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0798F, 4.0967F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail6.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(110, 111).addBox(0.0F, 3.0024F, 2.7955F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 111).addBox(0.0F, 1.9024F, 0.7955F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8162F, 0.2366F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail6.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(88, 107).addBox(0.0F, -4.9F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0798F, 2.0967F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail6.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(64, 104).addBox(0.0F, -5.4F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0798F, 0.0967F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r461 = tail6.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-2.0027F, 0.0F, 0.061F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6202F, -0.0033F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r462 = tail6.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 43).addBox(0.0027F, 0.0F, 0.061F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6202F, -0.0033F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 2).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5249F, 6.898F, -0.0268F, 0.2181F, -0.0058F));

		PartDefinition cube_r463 = tail2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(15, 51).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(109, 88).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r465 = tail2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(118, 23).addBox(0.0F, 0.9024F, -1.2045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7188F, 5.1682F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r466 = tail2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(14, 112).addBox(0.0F, -0.0976F, -1.2045F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2946F, 2.9727F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r467 = tail2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 112).addBox(0.0F, 4.3024F, 4.7955F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2913F, -6.6614F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r468 = tail2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(31, 108).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-1.3048F, 0.0F, 0.081F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.0F, 0.0F, 0.0785F, 0.0F));

		PartDefinition cube_r470 = tail2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(57, 30).addBox(-0.6952F, 0.0F, 0.081F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.0F, 0.0F, -0.0785F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.043F, 6.941F, -0.0994F, 0.2606F, -0.0257F));

		PartDefinition cube_r471 = tail3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(76, 85).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r472 = tail3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(82, 115).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r473 = tail3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(95, 118).addBox(0.0F, 0.5024F, -0.2045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0285F, 4.4073F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r474 = tail3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(118, 35).addBox(0.0F, 2.4024F, 2.7955F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 118).addBox(0.0F, 1.7024F, 0.7955F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6758F, -1.7728F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r475 = tail3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(26, 62).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(66, 54).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0015F, 4.8855F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition cube_r476 = tail4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(118, 78).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(77, 118).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r478 = tail4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(101, 118).addBox(0.0F, 2.0024F, 3.7955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 118).addBox(0.0F, 1.2024F, 1.7955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.03F, -0.4782F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(18, 119).addBox(0.0F, -1.1F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0003F, 5.0201F, 0.0358F, 0.218F, 0.0077F));

		PartDefinition cube_r479 = tail5.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(15, 119).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r480 = tail5.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(119, 94).addBox(0.0F, 4.2024F, 7.7955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 111).addBox(0.0F, 2.5024F, 5.7955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0297F, -5.4983F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r481 = tail5.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(103, 69).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 67).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 119).addBox(0.0F, -1.0F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 119).addBox(0.0F, -0.9F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.925F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r482 = tail7.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(119, 108).addBox(0.0F, 5.7024F, 11.7955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 97).addBox(0.0F, 5.0024F, 9.7955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0297F, -10.4233F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0549F, -0.305F, -0.0165F));

		PartDefinition cube_r483 = tail8.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(120, 0).addBox(0.0F, 6.3024F, 13.7955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0297F, -15.4233F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(26, 74).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0354F, -0.1744F, 0.0062F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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