package fossils.fossils.client.blockentity.model.paraceratheriumtransouralicum;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParaceratheriumtransouralicumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
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
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
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

	public ParaceratheriumtransouralicumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.leftLeg = this.bone.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.bone.getChild("rightLeg");
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
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.7139F, 30.3242F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(155, 44).addBox(-0.003F, 0.0014F, -1.9611F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8312F, -0.2641F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(105, 61).addBox(-0.006F, -0.5986F, -4.0611F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0679F, 2.8237F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 157).addBox(0.0F, -2.9986F, -0.0611F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0679F, 2.8237F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(105, 140).addBox(0.0F, -3.7986F, -0.0611F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9372F, 1.099F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 138).addBox(0.0F, -4.1986F, 0.0389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9968F, -0.7576F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 77).addBox(0.0F, -4.8986F, 0.0389F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7553F, -2.703F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 55).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3323F, 2.0023F, -2.6545F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(138, 5).mirror().addBox(-1.575F, 0.175F, -1.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0229F, 6.766F, 4.8749F, 0.7234F, 1.1133F, -1.8223F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(129, 33).mirror().addBox(-0.2178F, -0.5854F, -1.2055F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.7039F, 3.5201F, 2.1115F, -0.8407F, 0.5905F, -1.4107F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(145, 21).mirror().addBox(-0.575F, -0.325F, -1.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0646F, 5.8782F, 5.4225F, 0.277F, 1.0185F, -1.6347F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(140, 31).mirror().addBox(0.0255F, -0.0825F, -2.0127F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9104F, 8.6472F, 6.9177F, 0.4434F, -0.1967F, -2.1075F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(160, 44).mirror().addBox(0.1046F, 0.9405F, 7.1888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -1.516F, 1.2155F, -3.0649F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(102, 28).mirror().addBox(-5.8504F, 0.6274F, -2.4875F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9039F, 2.0201F, 1.5115F, -2.6536F, -0.5542F, 1.6006F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-7.0984F, -0.011F, -3.8834F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -1.7748F, -0.788F, 0.5527F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 59).mirror().addBox(-6.5384F, -0.2661F, -3.3429F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -1.3685F, -0.7462F, 0.2738F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 75).mirror().addBox(-0.0821F, -0.358F, -2.1133F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -0.6695F, 0.0948F, -1.3543F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 115).mirror().addBox(-7.8654F, 0.828F, -3.4987F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -2.0986F, -0.6043F, 0.8876F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(23, 160).mirror().addBox(1.5795F, 0.9405F, 6.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -0.8582F, 1.0939F, -2.3519F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 160).mirror().addBox(-3.6719F, 0.9405F, 6.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -2.3244F, 1.0744F, 2.3419F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(139, 47).mirror().addBox(-6.4958F, 0.0314F, 2.4628F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -2.624F, 0.3965F, 1.9346F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(129, 77).mirror().addBox(-8.2289F, 0.7903F, 0.4578F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -2.3508F, 0.0013F, 1.6616F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 116).mirror().addBox(-8.5627F, 0.7903F, -0.8794F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1039F, 2.0201F, 1.5115F, -2.3116F, -0.2713F, 1.3753F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(139, 137).mirror().addBox(-2.5745F, -0.3825F, -0.7126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3277F, 7.225F, 6.4561F, 0.7931F, -0.4147F, -2.809F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(156, 11).mirror().addBox(-1.175F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8884F, 6.0331F, 6.3946F, -0.3492F, 1.334F, -2.4202F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(129, 110).mirror().addBox(-1.7F, -0.6F, -1.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3007F, 4.7425F, 2.3422F, -0.0246F, -0.2021F, 0.6762F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 42).mirror().addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.4598F, 5.1957F, 1.1474F, -0.5595F, -1.4139F, 1.1364F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(147, 27).mirror().addBox(-2.0999F, -0.2225F, -1.7826F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1838F, 4.4052F, 4.4639F, -0.183F, -0.4818F, 1.3043F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(160, 44).addBox(-1.1046F, 0.9405F, 7.1888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -1.516F, -1.2155F, 3.0649F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(102, 28).addBox(4.8504F, 0.6274F, -2.4875F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2392F, 2.0201F, 1.5115F, -2.6536F, 0.5542F, -1.6006F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 14).addBox(2.0984F, -0.011F, -3.8834F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -1.7748F, 0.788F, -0.5527F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 59).addBox(0.5384F, -0.2661F, -3.3429F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -1.3685F, 0.7462F, -0.2738F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(129, 33).addBox(-2.7822F, -0.5854F, -1.2055F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0392F, 3.5201F, 2.1115F, -0.8407F, -0.5905F, 1.4107F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(88, 75).addBox(-5.9179F, -0.358F, -2.1133F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -0.6695F, -0.0948F, 1.3543F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 115).addBox(3.8654F, 0.828F, -3.4987F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -2.0986F, 0.6043F, -0.8876F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(23, 160).addBox(-2.5795F, 0.9405F, 6.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -0.8582F, -1.0939F, 2.3519F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 160).addBox(2.6719F, 0.9405F, 6.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -2.3244F, -1.0744F, -2.3419F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(139, 47).addBox(4.4958F, 0.0314F, 2.4628F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -2.624F, -0.3965F, -1.9346F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(129, 77).addBox(5.2289F, 0.7903F, 0.4578F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -2.3508F, -0.0013F, -1.6616F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 116).addBox(4.5627F, 0.7903F, -0.8794F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4392F, 2.0201F, 1.5115F, -2.3116F, 0.2713F, -1.3753F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(140, 31).addBox(-2.0255F, -0.0825F, -2.0127F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2457F, 8.6472F, 6.9177F, 0.4434F, 0.1967F, 2.1075F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(139, 137).addBox(0.5745F, -0.3825F, -0.7126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6631F, 7.225F, 6.4561F, 0.7931F, 0.4147F, 2.809F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(138, 5).addBox(-2.425F, 0.175F, -1.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3582F, 6.766F, 4.8749F, 0.7234F, -1.1133F, 1.8223F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(145, 21).addBox(-2.425F, -0.325F, -1.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3999F, 5.8782F, 5.4225F, 0.277F, -1.0185F, 1.6347F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(156, 11).addBox(-0.825F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2237F, 6.0331F, 6.3946F, -0.3492F, -1.334F, 2.4202F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(129, 110).addBox(-1.3F, -0.6F, -1.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.636F, 4.7425F, 2.3422F, -0.0246F, 0.2021F, -0.6762F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(80, 42).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7951F, 5.1957F, 1.1474F, -0.5595F, 1.4139F, -1.1364F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(147, 27).addBox(-0.9001F, -0.2225F, -1.7826F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5191F, 4.4052F, 4.4639F, -0.183F, 0.4818F, -1.3043F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 139).addBox(-0.5F, -0.2F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8323F, 7.8138F, 5.0383F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(140, 57).addBox(-0.5F, -0.7538F, -1.9052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8323F, 7.8864F, 1.6023F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(123, 43).addBox(-0.5F, -0.8538F, -2.9052F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8323F, 8.3166F, 4.4719F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftLeg = bone.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3677F, 6.7564F, 3.6487F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(100, 130).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(29, 128).addBox(-1.0F, -0.0842F, -2.0541F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, -2.6629F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 157).addBox(0.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7885F, 2.6155F, 0.5257F, -0.2457F, 0.134F, 0.4896F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(130, 0).addBox(-1.7885F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7885F, 2.6155F, 0.5257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(114, 81).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(93, 128).addBox(-1.0F, -6.0F, 1.1F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 68).addBox(-1.0F, -3.4F, -0.2F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.755F, -0.4575F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(140, 77).addBox(-1.0F, -2.4333F, -2.7068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 21.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(118, 28).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 18.3724F, -1.199F, -2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(118, 10).addBox(-1.5F, -1.0F, -1.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.7339F, -0.373F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 114).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 18.6535F, 3.479F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(88, 86).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 18.7243F, 1.8995F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(116, 98).addBox(-1.0F, -2.4F, 0.025F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 16.5858F, 0.5053F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(22, 117).addBox(-1.0F, -2.7499F, 0.7895F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8652F, -1.6822F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.5609F, 0.1101F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(120, 22).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.4436F, 2.0986F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 87).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 124).addBox(-2.9F, -0.1F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 13.5249F, -3.1364F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(144, 126).addBox(-0.5F, -12.5F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(144, 121).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.4F, 14.1934F, -1.3632F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(143, 81).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.4F, 8.6142F, -0.3423F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 143).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4F, 8.6142F, -0.3423F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(100, 140).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 5.5168F, 1.1159F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 147).addBox(-1.0F, -0.1F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.4772F, -0.1602F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 147).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(141, 35).addBox(-2.4F, -1.985F, -0.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 14.2921F, -2.918F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(67, 150).addBox(-1.0F, -2.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 14.202F, -1.2391F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(128, 48).addBox(-2.4F, 0.765F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 44).addBox(-2.4F, 2.79F, -2.2686F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 136).addBox(-1.9F, -1.035F, -1.6686F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(148, 93).addBox(-1.9F, -0.035F, -0.0686F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9F, 10.1164F, -1.4104F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 104).addBox(-1.9F, -9.035F, 0.2314F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 10.5752F, -1.5121F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(31, 103).addBox(-1.9F, -9.035F, -0.0686F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 10.5752F, -1.5121F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(31, 82).addBox(-1.5F, -0.4444F, -1.0179F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.235F, -1.7893F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(139, 141).addBox(-1.028F, -2.106F, -1.3161F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.619F, -0.3612F, 2.4052F, -0.7187F, -0.2163F, 0.0289F));

		PartDefinition cube_r83 = leftLeg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(115, 154).addBox(-0.9627F, -1.1594F, -0.2972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(154, 8).addBox(-0.9627F, -1.1594F, 0.4027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(154, 5).addBox(-0.9627F, -1.5594F, 0.4027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.619F, -0.3612F, 2.4052F, 0.1679F, -0.2173F, -0.0193F));

		PartDefinition cube_r84 = leftLeg3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(19, 131).addBox(-0.9982F, 0.2514F, -1.7158F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.619F, -0.3612F, 2.4052F, -0.0991F, -0.2163F, 0.0289F));

		PartDefinition cube_r85 = leftLeg3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(145, 71).addBox(-1.028F, -1.3355F, -0.5541F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.619F, -0.3612F, 2.4052F, -0.9718F, -0.2163F, 0.0289F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(93, 49).addBox(-1.0F, -1.0696F, -2.9933F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8772F, -0.1986F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 100).addBox(-1.7556F, 0.1612F, -1.9345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1745F, 0.2618F, -0.5672F));

		PartDefinition cube_r87 = leftLeg4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 99).addBox(-0.5017F, 0.3224F, -1.9339F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1309F, -0.1309F, 0.5672F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.0304F, -2.6933F, -0.787F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 128).addBox(-2.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.2782F, -1.685F, -0.4461F, 0.4802F, -0.2174F));

		PartDefinition cube_r89 = leftLeg5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 68).addBox(-2.5023F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.1F, -2.3F, -0.3957F, -0.1209F, 0.0503F));

		PartDefinition rightLeg = bone.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0324F, 6.7564F, 3.6487F, -0.3228F, -0.034F, -0.0544F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(130, 129).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8762F, -1.4199F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(129, 7).addBox(-1.0F, -0.0842F, -2.0541F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, -2.6629F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 157).addBox(-1.262F, -0.2203F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7885F, 2.6155F, 0.5257F, -0.2457F, -0.134F, -0.4896F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(130, 124).addBox(-1.2115F, -2.5513F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7885F, 2.6155F, 0.5257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(69, 115).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.3791F, 0.0024F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(129, 87).addBox(-1.0F, -6.0F, 1.1F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4349F, -1.543F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(71, 43).addBox(-1.0F, -3.4F, -0.2F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.755F, -0.4575F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(140, 110).addBox(-1.0F, -2.4333F, -2.7068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 21.5975F, -1.5021F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(118, 33).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 18.3724F, -1.199F, -2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(31, 118).addBox(-1.5F, -1.0F, -1.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 17.7339F, -0.373F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 114).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 18.6535F, 3.479F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 89).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 18.7243F, 1.8995F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 117).addBox(-1.0F, -2.4F, 0.025F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 16.5858F, 0.5053F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(93, 117).addBox(-1.0F, -2.7499F, 0.7895F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8652F, -1.6822F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.5609F, 0.1101F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(121, 38).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.4436F, 2.0986F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 79).addBox(-1.5F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8125F, 0.6687F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(90, 124).addBox(-0.1F, -0.1F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 13.5249F, -3.1364F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(145, 16).addBox(-0.5F, -12.5F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(144, 131).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.4F, 14.1934F, -1.3632F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 143).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.4F, 8.6142F, -0.3423F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(83, 143).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-1.4F, 8.6142F, -0.3423F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(23, 141).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, 5.5168F, 1.1159F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(148, 45).addBox(-1.0F, -0.1F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.4772F, -0.1602F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(148, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8336F, 1.2495F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(33, 142).addBox(-0.6F, -1.985F, -0.0436F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 14.2921F, -2.918F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(90, 150).addBox(-1.0F, -2.3F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 14.202F, -1.2391F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(129, 13).addBox(-0.6F, 0.765F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(66, 102).addBox(-0.6F, 2.79F, -2.2686F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(136, 86).addBox(-0.1F, -1.035F, -1.6686F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 10.7321F, 0.281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(98, 148).addBox(-0.1F, -0.035F, -0.0686F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.9F, 10.1164F, -1.4104F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(105, 0).addBox(-0.1F, -9.035F, 0.2314F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 10.5752F, -1.5121F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(86, 104).addBox(-0.1F, -9.035F, -0.0686F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 10.5752F, -1.5121F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(48, 85).addBox(-1.5F, -0.4444F, -1.0179F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 15.235F, -1.7893F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(142, 100).addBox(-0.972F, -2.106F, -1.3161F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.619F, -0.3612F, 2.4052F, -0.7187F, 0.2163F, -0.0289F));

		PartDefinition cube_r122 = rightLeg3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(122, 154).addBox(-1.0373F, -1.1594F, -0.2972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(17, 154).addBox(-1.0373F, -1.1594F, 0.4027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(10, 154).addBox(-1.0373F, -1.5594F, 0.4027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(-0.619F, -0.3612F, 2.4052F, 0.1679F, 0.2173F, 0.0193F));

		PartDefinition cube_r123 = rightLeg3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(131, 59).addBox(-1.0018F, 0.2514F, -1.7158F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.619F, -0.3612F, 2.4052F, -0.0991F, 0.2163F, -0.0289F));

		PartDefinition cube_r124 = rightLeg3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(38, 146).addBox(-0.972F, -1.3355F, -0.5541F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-0.619F, -0.3612F, 2.4052F, -0.9718F, 0.2163F, -0.0289F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(59, 94).addBox(-1.0F, -1.0696F, -2.9933F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8772F, -0.1986F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 101).addBox(-0.2444F, 0.1612F, -1.9345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0696F, -0.9933F, -0.1745F, -0.2618F, 0.5672F));

		PartDefinition cube_r126 = rightLeg4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 101).addBox(-1.4983F, 0.3224F, -1.9339F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0696F, -0.9933F, -0.1309F, 0.1309F, -0.5672F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.0304F, -2.6933F, -0.787F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(129, 27).addBox(1.8464F, -1.0F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.2782F, -1.685F, -0.4461F, -0.4802F, 0.2174F));

		PartDefinition cube_r128 = rightLeg5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(73, 2).addBox(-2.4977F, -1.3967F, -1.021F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -2.3F, -0.3957F, 0.1209F, -0.0503F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.6F, -0.2094F, 0.0854F, -0.0182F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(118, 77).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -12.6644F, -0.4864F, -0.2124F, -1.4074F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(124, 152).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -12.6644F, -0.5271F, -0.0155F, -1.0547F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(115, 152).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -12.6644F, -0.5157F, 0.1154F, -0.8275F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 114).mirror().addBox(-2.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.3F, -12.3F, -0.2005F, -0.0608F, -0.2906F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(10, 152).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3206F, -2.4644F, -0.523F, 0.0873F, -1.0194F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(145, 151).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8206F, -4.4644F, -0.5015F, 0.115F, -0.9648F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(151, 133).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2206F, -6.4644F, -0.48F, 0.1426F, -0.9097F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(148, 86).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7206F, -8.4644F, -0.4582F, 0.1701F, -0.8714F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(148, 69).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -9.9644F, -0.6008F, 0.0157F, -0.8503F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -9.9644F, -0.5881F, -0.1315F, -1.0673F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-7.1256F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.2206F, -9.9644F, -0.5042F, -0.3422F, -1.4197F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(152, 54).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -15.6644F, -0.4557F, 0.1794F, -0.8187F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(152, 42).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -15.6644F, -0.484F, 0.0603F, -1.0537F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(108, 44).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5206F, -15.6644F, -0.4721F, -0.1263F, -1.4098F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(31, 114).addBox(0.0F, -0.0193F, 11.5405F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3F, -12.3F, -0.2005F, 0.0608F, 0.2906F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(10, 152).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3206F, -2.4644F, -0.523F, -0.0873F, 1.0194F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(145, 151).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8206F, -4.4644F, -0.5015F, -0.115F, 0.9648F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(151, 133).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2206F, -6.4644F, -0.48F, -0.1426F, 0.9097F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(148, 86).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7206F, -8.4644F, -0.4582F, -0.1701F, 0.8714F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(148, 69).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -9.9644F, -0.6008F, -0.0157F, 0.8503F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(96, 66).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -9.9644F, -0.5881F, 0.1315F, 1.0673F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(40, 93).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -9.9644F, -0.5042F, 0.3422F, 1.4197F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(115, 152).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -12.6644F, -0.5157F, -0.1154F, 0.8275F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(124, 152).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -12.6644F, -0.5271F, 0.0155F, 1.0547F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(118, 77).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2206F, -12.6644F, -0.4864F, 0.2124F, 1.4074F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(152, 54).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -15.6644F, -0.4557F, -0.1794F, 0.8187F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(152, 42).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -15.6644F, -0.484F, -0.0603F, 1.0537F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(108, 44).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5206F, -15.6644F, -0.4721F, 0.1263F, 1.4098F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 131).addBox(-0.01F, -5.1202F, 0.0374F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0313F, -1.8422F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(9, 131).addBox(-0.01F, -5.3202F, 0.0374F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7172F, -4.7696F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(139, 129).addBox(-0.01F, -4.8202F, 0.0374F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3409F, -7.704F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(139, 121).addBox(-0.01F, -5.0202F, -0.0626F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7766F, -10.5868F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 143).addBox(-0.01F, -4.7202F, -0.0626F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1154F, -13.4946F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(109, 138).addBox(-0.01F, -5.0202F, -0.0626F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.46F, -16.4831F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(52, 32).addBox(-1.0F, 0.0104F, -7.8987F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.8F, -9.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(31, 19).addBox(-1.0F, -0.1512F, 3.7474F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -13.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5727F, -17.7444F, -0.1924F, 0.1285F, -0.0251F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(31, 15).mirror().addBox(-23.0366F, 2.7454F, -0.4644F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 23.3209F, -21.6295F, 0.9582F, 0.9209F, 1.0524F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 38).mirror().addBox(-4.876F, -0.2367F, -0.4644F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 23.3209F, -21.6295F, -0.2361F, 1.2048F, -0.2605F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(150, 90).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, -0.2793F, 1.1089F, -0.3047F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(31, 17).mirror().addBox(-19.0161F, 1.5663F, -0.378F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, 0.7995F, 0.909F, 0.9218F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-17.0161F, 1.5663F, -0.378F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, 0.5746F, 0.7984F, 0.7502F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(150, 88).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, -0.2154F, 0.9278F, -0.2517F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(21, 55).mirror().addBox(-15.0161F, 1.5663F, -0.378F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, 0.4333F, 0.7028F, 0.6518F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 150).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.3209F, -21.0295F, -0.1898F, 0.7881F, -0.2341F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(56, 29).mirror().addBox(-14.0161F, 1.5663F, -0.378F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.2209F, -21.3295F, 0.4787F, 0.6077F, 0.6848F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(150, 40).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.2209F, -21.3295F, -0.0571F, 0.7526F, -0.1362F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(149, 109).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6951F, -7.1643F, -0.3453F, 0.3125F, -0.6759F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(149, 104).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6951F, -7.1643F, -0.4115F, 0.2153F, -0.9279F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-16.1256F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6951F, -7.1643F, -0.4596F, 0.044F, -1.2945F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(150, 117).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -9.6643F, -0.406F, 0.2731F, -0.6761F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-17.8456F, -4.1072F, -0.6864F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -9.6643F, -0.4846F, -0.0216F, -1.2774F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(114, 79).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -9.6643F, -0.459F, 0.1628F, -0.9194F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(150, 115).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -12.6643F, -0.3704F, 0.3003F, -0.666F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-18.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -12.6643F, -0.472F, 0.0202F, -1.2774F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(112, 8).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -12.6643F, -0.432F, 0.1975F, -0.9146F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(149, 24).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1049F, -0.8643F, -0.2818F, 0.3176F, -0.6879F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(148, 98).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1049F, -0.8643F, -0.3528F, 0.2355F, -0.9465F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1049F, -0.8643F, -0.4135F, 0.0836F, -1.3233F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1951F, -4.1643F, -0.4596F, 0.044F, -1.2945F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(149, 102).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1951F, -4.1643F, -0.4115F, 0.2153F, -0.9279F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(149, 100).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1951F, -4.1643F, -0.3453F, 0.3125F, -0.6759F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(150, 113).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -15.6643F, -0.3342F, 0.327F, -0.6548F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(108, 46).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -15.6643F, -0.4047F, 0.232F, -0.9088F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(-18.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8951F, -15.6643F, -0.4594F, 0.062F, -1.2769F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(149, 24).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1049F, -0.8643F, -0.2818F, -0.3176F, 0.6879F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(148, 98).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1049F, -0.8643F, -0.3528F, -0.2355F, 0.9465F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 58).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1049F, -0.8643F, -0.4135F, -0.0836F, 1.3233F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 63).addBox(5.1255F, -3.0192F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6951F, -7.1643F, -0.4596F, -0.044F, 1.2945F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(149, 104).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6951F, -7.1643F, -0.4115F, -0.2153F, 0.9279F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(149, 109).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6951F, -7.1643F, -0.3453F, -0.3125F, 0.6759F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(68, 17).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1951F, -4.1643F, -0.4596F, -0.044F, 1.2945F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(149, 102).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1951F, -4.1643F, -0.4115F, -0.2153F, 0.9279F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(149, 100).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1951F, -4.1643F, -0.3453F, -0.3125F, 0.6759F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(114, 79).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -9.6643F, -0.459F, -0.1628F, 0.9194F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 62).addBox(7.8456F, -4.1072F, -0.6864F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -9.6643F, -0.4846F, 0.0216F, 1.2774F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(150, 117).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -9.6643F, -0.406F, -0.2731F, 0.6761F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(112, 8).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -12.6643F, -0.432F, -0.1975F, 0.9146F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(66, 0).addBox(7.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -12.6643F, -0.472F, -0.0202F, 1.2774F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(150, 115).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -12.6643F, -0.3704F, -0.3003F, 0.666F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(150, 113).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -15.6643F, -0.3342F, -0.327F, 0.6548F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(108, 46).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -15.6643F, -0.4047F, -0.232F, 0.9088F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 65).addBox(7.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8951F, -15.6643F, -0.4594F, -0.062F, 1.2769F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.951F, -9.746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(29, 32).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0157F, -0.8999F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(24, 155).addBox(-0.01F, -1.9202F, -0.0626F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -2.0155F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(33, 146).addBox(0.01F, -5.8735F, -0.3366F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -2.0155F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(155, 0).addBox(-0.01F, -1.9202F, -0.0626F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -5.0155F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(145, 114).addBox(0.01F, -5.8735F, -0.3366F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -5.0155F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(110, 152).addBox(-0.01F, -1.9202F, -0.0626F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -7.9155F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(114, 145).addBox(0.01F, -5.8735F, -0.3366F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -7.9155F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(105, 152).addBox(-0.01F, -1.9202F, -0.0626F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -10.7155F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 145).addBox(0.01F, -5.8735F, -0.3366F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -10.7155F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 152).addBox(-0.01F, -1.9202F, -0.0626F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -13.6155F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(96, 38).addBox(-0.124F, -0.2367F, -0.4644F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 23.3209F, -21.6295F, -0.2361F, -1.2048F, 0.2605F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(31, 15).addBox(4.0366F, 2.7454F, -0.4644F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 23.3209F, -21.6295F, 0.9582F, -0.9209F, -1.0524F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(31, 17).addBox(2.0161F, 1.5663F, -0.378F, 17.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, 0.7995F, -0.909F, -0.9218F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(150, 90).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, -0.2793F, -1.1089F, 0.3047F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(150, 88).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, -0.2154F, -0.9278F, 0.2517F));

		PartDefinition cube_r227 = body.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(33, 0).addBox(2.0161F, 1.5663F, -0.378F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, 0.5746F, -0.7984F, -0.7502F));

		PartDefinition cube_r228 = body.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(81, 150).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, -0.1898F, -0.7881F, 0.2341F));

		PartDefinition cube_r229 = body.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(21, 55).addBox(2.0161F, 1.5663F, -0.378F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.3209F, -21.0295F, 0.4333F, -0.7028F, -0.6518F));

		PartDefinition cube_r230 = body.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(150, 40).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.2209F, -21.3295F, -0.0571F, -0.7526F, 0.1362F));

		PartDefinition cube_r231 = body.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(56, 29).addBox(2.0161F, 1.5663F, -0.378F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.2209F, -21.3295F, 0.4787F, -0.6077F, -0.6848F));

		PartDefinition cube_r232 = body.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(57, 139).addBox(0.01F, -6.8735F, -0.3366F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1634F, -13.6155F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r233 = body.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(54, 152).addBox(-0.01F, -2.9482F, -0.0664F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.27F, -16.8465F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r234 = body.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(78, 139).addBox(0.01F, -5.0168F, -0.0492F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3634F, -15.6155F, -0.5934F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9474F, -16.6486F, -0.1784F, 0.1795F, 0.0115F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(123, 143).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0226F, -20.0979F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(42, 118).addBox(-0.01F, -11.8276F, -0.4147F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0226F, -20.0979F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(143, 93).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9226F, -17.3979F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(47, 120).addBox(-0.01F, -11.8276F, -0.4147F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9226F, -17.3979F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(52, 127).addBox(-0.01F, -10.8276F, -0.4147F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9226F, -14.4979F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(93, 143).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9226F, -14.4979F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(52, 137).addBox(-0.01F, -9.8642F, -0.3217F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9226F, -11.6979F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(133, 143).addBox(0.0F, -3.8891F, 0.0255F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9226F, -11.6979F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(118, 136).addBox(0.01F, -7.9168F, -0.1742F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2774F, -3.0979F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(69, 154).addBox(-0.01F, -1.9482F, -0.0664F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2774F, -3.0979F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 151).addBox(-0.01F, -3.6923F, -0.1997F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9226F, -5.8979F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(28, 139).addBox(0.01F, -9.6473F, -0.4288F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9226F, -5.8979F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(28, 148).addBox(-0.01F, -3.6923F, -0.1997F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4226F, -8.6979F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(47, 131).addBox(0.01F, -9.6473F, -0.4288F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4226F, -8.6979F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-13.0161F, 1.5663F, -0.378F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.05F, 22.7735F, -1.5809F, 0.4229F, 0.4004F, 0.6397F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(151, 131).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.05F, 22.7735F, -1.5809F, 0.08F, 0.569F, -0.0697F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(69, 60).mirror().addBox(-12.0161F, 1.5663F, -0.378F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.0735F, -3.3809F, 0.3787F, 0.344F, 0.6236F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(150, 38).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 23.0735F, -3.3809F, 0.0855F, 0.4993F, -0.0669F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-12.0161F, 1.5663F, -0.378F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 23.3735F, -5.3809F, 0.3284F, 0.2711F, 0.5735F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(150, 36).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 23.3735F, -5.3809F, 0.0952F, 0.4125F, -0.0975F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-11.0161F, 1.5663F, -0.378F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 23.3735F, -7.3809F, 0.2688F, 0.1892F, 0.6123F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(150, 34).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 23.3735F, -7.3809F, 0.1002F, 0.3122F, -0.0434F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(33, 13).mirror().addBox(-11.0161F, 1.5663F, -0.378F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 23.3735F, -9.3809F, 0.2276F, 0.1324F, 0.6188F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(151, 129).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 23.3735F, -9.3809F, 0.1024F, 0.2424F, -0.0297F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(69, 107).mirror().addBox(-3.2036F, -1.5982F, -3.8358F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9679F, -0.5907F, -9.1265F, 1.1639F, -0.2241F, 0.2971F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(145, 51).mirror().addBox(-3.2036F, -1.5789F, -0.8354F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-3.8268F, 1.1634F, -7.8151F, 1.6787F, -0.2241F, 0.2971F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(5, 144).mirror().addBox(-3.2036F, -1.1157F, -0.9625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7518F, 0.6651F, -7.4895F, 0.9806F, -0.2241F, 0.2971F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(153, 141).mirror().addBox(-3.2036F, -4.8866F, -2.3707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(140, 152).mirror().addBox(-3.2036F, -4.8866F, -1.6707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6987F, -3.789F, -10.3825F, 2.9441F, -0.2241F, 0.2971F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(54, 2).mirror().addBox(-3.2036F, -1.0902F, -2.7841F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-3.7866F, 5.788F, -13.8859F, 0.9021F, -0.2241F, 0.2971F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(156, 75).mirror().addBox(-4.4036F, -0.4911F, -0.8415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.845F, 13.3869F, -13.8062F, 0.8148F, -0.2241F, 0.2971F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(34, 157).mirror().addBox(-3.2036F, 0.0627F, -0.8382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9375F, 12.482F, -17.656F, 1.3122F, -0.2241F, 0.2971F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(148, 81).mirror().addBox(-4.4036F, -3.2187F, -0.9974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 2.0104F, -0.2241F, 0.2971F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(151, 125).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4477F, -18.9156F, -0.1338F, 0.4587F, -0.5777F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(116, 61).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4477F, -18.9156F, -0.2534F, 0.4079F, -0.8609F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-14.8456F, -4.1072F, -0.6864F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.4477F, -18.9156F, -0.3915F, 0.2788F, -1.2653F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-16.8456F, -4.1072F, -0.6864F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5477F, -16.3157F, -0.405F, 0.2372F, -1.2688F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5477F, -16.3157F, -0.284F, 0.3746F, -0.8726F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(151, 123).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.5477F, -16.3157F, -0.1741F, 0.4345F, -0.5951F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(151, 121).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5477F, -13.3157F, -0.1581F, 0.4442F, -0.5883F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(116, 20).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5477F, -13.3157F, -0.2719F, 0.388F, -0.8681F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-17.8456F, -4.1072F, -0.6864F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5477F, -13.3157F, -0.3997F, 0.2538F, -1.2675F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 66).mirror().addBox(-18.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4477F, -10.3157F, -0.4103F, 0.2205F, -1.27F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(116, 18).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4477F, -10.3157F, -0.296F, 0.3612F, -0.8769F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(38, 151).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4477F, -10.3157F, -0.19F, 0.4247F, -0.6018F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-19.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4477F, -7.7157F, -0.405F, 0.2372F, -1.2688F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(93, 115).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4477F, -7.7157F, -0.284F, 0.3746F, -0.8726F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(128, 150).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4477F, -7.7157F, -0.1741F, 0.4345F, -0.5951F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-19.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8477F, -4.7157F, -0.4077F, 0.2289F, -1.2694F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(114, 89).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8477F, -4.7157F, -0.29F, 0.368F, -0.8748F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(150, 119).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8477F, -4.7157F, -0.1821F, 0.4296F, -0.5985F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(119, 150).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2477F, -1.7157F, -0.1821F, 0.4296F, -0.5985F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(114, 87).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2477F, -1.7157F, -0.29F, 0.368F, -0.8748F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(21, 57).mirror().addBox(-19.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2477F, -1.7157F, -0.4077F, 0.2289F, -1.2694F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(-4.4036F, 3.1492F, -3.9171F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.715F, 5.7007F, -12.9084F, -2.8155F, -0.2241F, 0.2971F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(143, 88).mirror().addBox(-3.2036F, -0.745F, -1.9871F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0833F, -1.1682F, -7.9395F, 1.8533F, -0.2241F, 0.2971F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(93, 136).mirror().addBox(-4.4036F, 5.4317F, -1.0262F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.715F, 5.7007F, -12.9084F, 2.4816F, -0.2241F, 0.2971F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(123, 136).mirror().addBox(-3.2036F, -5.1196F, -2.3563F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3562F, -3.3605F, -12.3701F, -2.9638F, -0.2241F, 0.2971F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(74, 156).mirror().addBox(-4.4036F, 0.2026F, -1.3924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.1202F, -0.2241F, 0.2971F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-4.4036F, -0.9822F, -0.941F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.3384F, -0.2241F, 0.2971F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(118, 65).mirror().addBox(-3.2036F, 1.0875F, -0.6592F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.633F, 0.6312F, -16.3365F, 1.19F, -0.2241F, 0.2971F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0387F, -0.7952F, -7.676F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5417F, 5.7634F, -15.1716F, 1.36F, 0.3997F, 0.1568F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(156, 30).mirror().addBox(-4.4036F, -1.8296F, 1.4516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.4431F, -0.2241F, 0.2971F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-4.4036F, -3.9629F, 5.1148F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.3035F, -0.2241F, 0.2971F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(106, 49).mirror().addBox(-4.4036F, -1.1048F, 2.3161F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.7835F, -0.2241F, 0.2971F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(148, 136).mirror().addBox(-3.2036F, -0.5953F, -1.9017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-4.9269F, 11.1189F, -15.9495F, 0.9195F, -0.2241F, 0.2971F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(148, 64).mirror().addBox(-4.4036F, -1.3298F, -1.6612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.59F, 13.1007F, -14.5084F, 1.4868F, -0.2241F, 0.2971F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 29).mirror().addBox(-10.0161F, 1.5663F, -0.378F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 23.0735F, -11.3809F, 0.1418F, 0.0112F, 0.6126F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(149, 111).mirror().addBox(-2.5528F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 23.0735F, -11.3809F, 0.1068F, 0.0942F, -0.029F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 98).addBox(3.4036F, 3.1492F, -3.9171F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.715F, 5.7007F, -12.9084F, -2.8155F, 0.2241F, -0.2971F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(145, 51).addBox(2.2036F, -1.5789F, -0.8354F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(3.8268F, 1.1634F, -7.8151F, 1.6787F, 0.2241F, -0.2971F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(5, 144).addBox(2.2036F, -1.1157F, -0.9625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7518F, 0.6651F, -7.4895F, 0.9806F, 0.2241F, -0.2971F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(143, 88).addBox(2.2036F, -0.745F, -1.9871F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.0833F, -1.1682F, -7.9395F, 1.8533F, 0.2241F, -0.2971F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(93, 136).addBox(3.4036F, 5.4317F, -1.0262F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.715F, 5.7007F, -12.9084F, 2.4816F, 0.2241F, -0.2971F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(153, 141).addBox(2.2036F, -4.8866F, -2.3707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(140, 152).addBox(2.2036F, -4.8866F, -1.6707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6987F, -3.789F, -10.3825F, 2.9441F, 0.2241F, -0.2971F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(123, 136).addBox(2.2036F, -5.1196F, -2.3563F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3562F, -3.3605F, -12.3701F, -2.9638F, 0.2241F, -0.2971F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(156, 75).addBox(3.4036F, -0.4911F, -0.8415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.845F, 13.3869F, -13.8062F, 0.8148F, 0.2241F, -0.2971F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(74, 156).addBox(3.4036F, 0.2026F, -1.3924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.1202F, 0.2241F, -0.2971F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(69, 107).addBox(2.2036F, -1.5982F, -3.8358F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9679F, -0.5907F, -9.1265F, 1.1639F, 0.2241F, -0.2971F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(54, 2).addBox(2.2036F, -1.0902F, -2.7841F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(3.7866F, 5.788F, -13.8859F, 0.9021F, 0.2241F, -0.2971F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 31).addBox(3.4036F, -0.9822F, -0.941F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.3384F, 0.2241F, -0.2971F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(118, 65).addBox(2.2036F, 1.0875F, -0.6592F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.633F, 0.6312F, -16.3365F, 1.19F, 0.2241F, -0.2971F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 0).addBox(2.0387F, -0.7952F, -7.676F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5417F, 5.7634F, -15.1716F, 1.36F, -0.3997F, -0.1568F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(156, 30).addBox(3.4036F, -1.8296F, 1.4516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.4431F, 0.2241F, -0.2971F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(75, 19).addBox(3.4036F, -3.9629F, 5.1148F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.3035F, 0.2241F, -0.2971F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(106, 49).addBox(3.4036F, -1.1048F, 2.3161F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.7835F, 0.2241F, -0.2971F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(34, 157).addBox(2.2036F, 0.0627F, -0.8382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.9375F, 12.482F, -17.656F, 1.3122F, 0.2241F, -0.2971F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(148, 136).addBox(2.2036F, -0.5953F, -1.9017F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(4.9269F, 11.1189F, -15.9495F, 0.9195F, 0.2241F, -0.2971F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(148, 81).addBox(3.4036F, -3.2187F, -0.9974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 2.0104F, 0.2241F, -0.2971F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(148, 64).addBox(3.4036F, -1.3298F, -1.6612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.59F, 13.1007F, -14.5084F, 1.4868F, 0.2241F, -0.2971F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(151, 131).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 22.7735F, -1.5809F, 0.08F, -0.569F, 0.0697F));

		PartDefinition cube_r325 = chest.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 65).addBox(2.0161F, 1.5663F, -0.378F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 22.7735F, -1.5809F, 0.4229F, -0.4004F, -0.6397F));

		PartDefinition cube_r326 = chest.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(150, 38).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.0735F, -3.3809F, 0.0855F, -0.4993F, 0.0669F));

		PartDefinition cube_r327 = chest.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(69, 60).addBox(2.0161F, 1.5663F, -0.378F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, 23.0735F, -3.3809F, 0.3787F, -0.344F, -0.6236F));

		PartDefinition cube_r328 = chest.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(150, 36).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 23.3735F, -5.3809F, 0.0952F, -0.4125F, 0.0975F));

		PartDefinition cube_r329 = chest.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(73, 38).addBox(2.0161F, 1.5663F, -0.378F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 23.3735F, -5.3809F, 0.3284F, -0.2711F, -0.5735F));

		PartDefinition cube_r330 = chest.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(150, 34).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 23.3735F, -7.3809F, 0.1002F, -0.3122F, 0.0434F));

		PartDefinition cube_r331 = chest.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(75, 66).addBox(2.0161F, 1.5663F, -0.378F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 23.3735F, -7.3809F, 0.2688F, -0.1892F, -0.6123F));

		PartDefinition cube_r332 = chest.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(151, 129).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 23.3735F, -9.3809F, 0.1024F, -0.2424F, 0.0297F));

		PartDefinition cube_r333 = chest.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(33, 13).addBox(2.0161F, 1.5663F, -0.378F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 23.3735F, -9.3809F, 0.2276F, -0.1324F, -0.6188F));

		PartDefinition cube_r334 = chest.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(83, 29).addBox(2.0161F, 1.5663F, -0.378F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 23.0735F, -11.3809F, 0.1418F, -0.0112F, -0.6126F));

		PartDefinition cube_r335 = chest.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(149, 111).addBox(-0.4472F, 0.0376F, -0.378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 23.0735F, -11.3809F, 0.1068F, -0.0942F, 0.029F));

		PartDefinition cube_r336 = chest.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(92, 31).addBox(-0.5F, -1.0227F, 0.0259F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 23.864F, -5.3091F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r337 = chest.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(34, 68).addBox(-0.5F, -0.2227F, -0.3741F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 23.0065F, -11.9018F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r338 = chest.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(17, 67).addBox(-0.5F, -1.0252F, -7.1109F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 23.8624F, -12.1799F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r339 = chest.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(50, 44).addBox(-1.0F, 0.092F, -0.06F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5762F, -7.9928F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r340 = chest.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(90, 26).addBox(7.8456F, -4.1072F, -0.6864F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4477F, -18.9156F, -0.3915F, -0.2788F, 1.2653F));

		PartDefinition cube_r341 = chest.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(116, 61).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4477F, -18.9156F, -0.2534F, -0.4079F, 0.8609F));

		PartDefinition cube_r342 = chest.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(151, 125).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.4477F, -18.9156F, -0.1338F, -0.4587F, 0.5777F));

		PartDefinition cube_r343 = chest.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(151, 123).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5477F, -16.3157F, -0.1741F, -0.4345F, 0.5951F));

		PartDefinition cube_r344 = chest.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(31, 116).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5477F, -16.3157F, -0.284F, -0.3746F, 0.8726F));

		PartDefinition cube_r345 = chest.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(73, 40).addBox(7.8456F, -4.1072F, -0.6864F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.5477F, -16.3157F, -0.405F, -0.2372F, 1.2688F));

		PartDefinition cube_r346 = chest.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(69, 64).addBox(7.8456F, -4.1072F, -0.6864F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5477F, -13.3157F, -0.3997F, -0.2538F, 1.2675F));

		PartDefinition cube_r347 = chest.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(116, 20).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5477F, -13.3157F, -0.2719F, -0.388F, 0.8681F));

		PartDefinition cube_r348 = chest.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(151, 121).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5477F, -13.3157F, -0.1581F, -0.4442F, 0.5883F));

		PartDefinition cube_r349 = chest.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(38, 151).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4477F, -10.3157F, -0.19F, -0.4247F, 0.6018F));

		PartDefinition cube_r350 = chest.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(116, 18).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4477F, -10.3157F, -0.296F, -0.3612F, 0.8769F));

		PartDefinition cube_r351 = chest.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(50, 66).addBox(7.8456F, -4.1072F, -0.6864F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4477F, -10.3157F, -0.4103F, -0.2205F, 1.27F));

		PartDefinition cube_r352 = chest.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(128, 150).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4477F, -7.7157F, -0.1741F, -0.4345F, 0.5951F));

		PartDefinition cube_r353 = chest.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(93, 115).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4477F, -7.7157F, -0.284F, -0.3746F, 0.8726F));

		PartDefinition cube_r354 = chest.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 61).addBox(7.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4477F, -7.7157F, -0.405F, -0.2372F, 1.2688F));

		PartDefinition cube_r355 = chest.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(150, 119).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8477F, -4.7157F, -0.1821F, -0.4296F, 0.5985F));

		PartDefinition cube_r356 = chest.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(114, 89).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8477F, -4.7157F, -0.29F, -0.368F, 0.8748F));

		PartDefinition cube_r357 = chest.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 59).addBox(7.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8477F, -4.7157F, -0.4077F, -0.2289F, 1.2694F));

		PartDefinition cube_r358 = chest.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(21, 57).addBox(7.8456F, -4.1072F, -0.6864F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2477F, -1.7157F, -0.4077F, -0.2289F, 1.2694F));

		PartDefinition cube_r359 = chest.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(114, 87).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2477F, -1.7157F, -0.29F, -0.368F, 0.8748F));

		PartDefinition cube_r360 = chest.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(119, 150).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2477F, -1.7157F, -0.1821F, -0.4296F, 0.5985F));

		PartDefinition cube_r361 = chest.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -1.908F, -2.16F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.1F, -17.6F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.843F, 15.9002F, -17.409F, 0.7116F, 0.0721F, -0.1093F));

		PartDefinition cube_r362 = leftarm.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(122, 105).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 14.1714F, 2.8761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r363 = leftarm.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(58, 107).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 12.8978F, 4.4471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r364 = leftarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(159, 17).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5891F, -0.2255F, 2.9999F, -0.1048F, 0.0014F, -0.001F));

		PartDefinition cube_r365 = leftarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(110, 127).addBox(0.5F, -0.4F, 0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.5857F, -1.4012F, 0.4819F, -0.323F, 0.0014F, -0.001F));

		PartDefinition cube_r366 = leftarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(52, 147).addBox(0.5F, -1.5F, -0.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5848F, -0.955F, -0.413F, -1.1084F, 0.0014F, -0.001F));

		PartDefinition cube_r367 = leftarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(57, 134).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5894F, 0.3931F, 2.8069F, -0.1334F, 0.113F, 0.6897F));

		PartDefinition cube_r368 = leftarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5894F, 1.7477F, 1.8555F, -0.1746F, 0.0014F, -0.001F));

		PartDefinition cube_r369 = leftarm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(127, 65).addBox(0.5F, -1.9F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.589F, 4.1482F, -0.0211F, -1.0211F, 0.0014F, -0.001F));

		PartDefinition cube_r370 = leftarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(127, 53).addBox(0.5F, -1.8F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5931F, 6.4472F, 1.2843F, -1.1084F, 0.0014F, -0.001F));

		PartDefinition cube_r371 = leftarm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(120, 112).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5879F, 1.1327F, 0.3516F, -0.4313F, -0.0627F, -0.0248F));

		PartDefinition cube_r372 = leftarm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(111, 120).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.5894F, 4.4945F, 0.0024F, -0.3492F, 0.0014F, -0.001F));

		PartDefinition cube_r373 = leftarm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(100, 135).addBox(-1.0F, -2.0475F, 0.0581F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.5965F, 8.2281F, 2.5064F, 0.6719F, 0.0014F, -0.001F));

		PartDefinition cube_r374 = leftarm.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -6.9475F, -0.1419F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.6004F, 10.3985F, 3.763F, 0.445F, 0.0014F, -0.001F));

		PartDefinition cube_r375 = leftarm.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(130, 134).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 9.2766F, 5.8038F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r376 = leftarm.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(38, 129).addBox(-1.0F, -0.7F, -2.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 9.2766F, 5.8038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r377 = leftarm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(31, 92).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6F, 5.401F, 3.493F, 0.3142F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1913F, 14.8366F, 4.9226F, -1.1661F, 0.0789F, 0.103F));

		PartDefinition cube_r378 = leftarm2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(66, 134).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1501F, 0.8493F, -1.18F, 1.5283F, -0.9549F, -1.5101F));

		PartDefinition cube_r379 = leftarm2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(120, 119).addBox(0.25F, -0.5F, -2.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8672F, 11.2776F, 0.3219F, -1.3992F, -1.5352F, 1.4172F));

		PartDefinition cube_r380 = leftarm2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(120, 126).addBox(0.3725F, -3.1552F, -0.6251F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2265F, 2.291F, -0.9359F, -2.6186F, -1.5284F, 2.6421F));

		PartDefinition cube_r381 = leftarm2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(43, 77).addBox(-0.0549F, -1.0659F, -0.7944F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2265F, 2.291F, -0.9359F, 2.0782F, -1.4967F, -2.0182F));

		PartDefinition cube_r382 = leftarm2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(133, 102).addBox(-1.487F, -1.4383F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2122F, 15.7517F, 2.0188F, 1.5063F, -1.5276F, -1.4889F));

		PartDefinition cube_r383 = leftarm2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(132, 37).addBox(-0.3159F, -1.3262F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2122F, 15.7517F, 2.0188F, 1.5652F, -1.0478F, -1.5486F));

		PartDefinition cube_r384 = leftarm2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(44, 140).addBox(-0.6F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2236F, 0.3885F, 1.2089F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition cube_r385 = leftarm2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(9, 105).addBox(-2.0485F, -1.9905F, -1.0016F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.222F, -0.873F, 2.9354F, 1.5708F, -0.6545F, -1.5708F));

		PartDefinition cube_r386 = leftarm2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(131, 17).addBox(0.0216F, -2.9356F, -1.0016F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.222F, -0.873F, 2.9354F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r387 = leftarm2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(101, 124).addBox(-0.918F, -2.0528F, -1.0016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.222F, -0.873F, 2.9354F, -1.5708F, -1.0908F, 1.5708F));

		PartDefinition cube_r388 = leftarm2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(125, 81).addBox(-1.0122F, 0.6886F, -1.0016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.222F, -0.873F, 2.9354F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition cube_r389 = leftarm2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(102, 117).addBox(-1.975F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2236F, 6.2485F, 2.4317F, 1.5708F, -1.5359F, -1.5708F));

		PartDefinition cube_r390 = leftarm2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(102, 106).addBox(-0.025F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 6.3598F, 0.4917F, -1.5708F, -1.5053F, 1.5708F));

		PartDefinition cube_r391 = leftarm2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 109).addBox(-1.8F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.2122F, 10.1812F, 2.3925F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.422F, 17.1414F, 1.292F, 1.1671F, -0.0972F, 0.0079F));

		PartDefinition cube_r392 = leftArm3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 76).addBox(-2.5002F, -3.9818F, -0.491F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0F, -1.0F, -0.2177F, -0.0096F, -0.0084F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(107, 11).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 5.8459F, -1.09F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r393 = leftArm4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(37, 135).addBox(-1.5997F, -1.0455F, 0.5234F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9423F, 0.5743F, -1.0437F, 0.0735F, 0.8158F, 0.1714F));

		PartDefinition cube_r394 = leftArm4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 149).addBox(-0.7053F, -4.4031F, -0.3039F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2368F, 4.2008F, 0.0357F, -0.0322F, -0.8321F, -0.01F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1868F, 4.5391F, 0.5618F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r395 = leftArm5.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(118, 15).addBox(-2.3137F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5F, -3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftArm5.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(118, 72).addBox(-1.6565F, 2.6681F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.129F, -3.9649F, -1.6055F, 0.9497F, 0.8301F, 0.1502F));

		PartDefinition cube_r397 = leftArm5.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(101, 79).addBox(-1.665F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0501F, -0.3383F, -0.5261F, 1.0314F, -0.7945F, -0.0728F));

		PartDefinition cube_r398 = leftArm5.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(73, 9).addBox(-2.3124F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.843F, 15.9002F, -17.409F, 0.5834F, -0.0193F, 0.1295F));

		PartDefinition cube_r399 = rightarm.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(31, 123).addBox(-1.5F, -1.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 14.1714F, 2.8761F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightarm.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(107, 68).addBox(-1.5F, -3.0F, -1.2F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 12.8978F, 4.4471F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r401 = rightarm.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(159, 34).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5891F, -0.2255F, 2.9999F, -0.1048F, -0.0014F, 0.001F));

		PartDefinition cube_r402 = rightarm.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(84, 128).addBox(-1.5F, -0.4F, 0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.5857F, -1.4012F, 0.4819F, -0.323F, -0.0014F, 0.001F));

		PartDefinition cube_r403 = rightarm.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(138, 147).addBox(-1.5F, -1.5F, -0.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5848F, -0.955F, -0.413F, -1.1084F, -0.0014F, 0.001F));

		PartDefinition cube_r404 = rightarm.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(75, 134).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5894F, 0.3931F, 2.8069F, -0.1334F, -0.113F, -0.6897F));

		PartDefinition cube_r405 = rightarm.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(20, 124).addBox(-1.0F, -1.5F, -0.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5894F, 1.7477F, 1.8555F, -0.1746F, -0.0014F, 0.001F));

		PartDefinition cube_r406 = rightarm.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(75, 128).addBox(-1.5F, -1.9F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.589F, 4.1482F, -0.0211F, -1.0211F, -0.0014F, 0.001F));

		PartDefinition cube_r407 = rightarm.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(66, 128).addBox(-1.5F, -1.8F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5931F, 6.4472F, 1.2843F, -1.1084F, -0.0014F, 0.001F));

		PartDefinition cube_r408 = rightarm.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(61, 121).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5879F, 1.1327F, 0.3516F, -0.4313F, 0.0627F, 0.0248F));

		PartDefinition cube_r409 = rightarm.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(121, 0).addBox(-1.0F, -5.9475F, -0.1419F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(-1.5894F, 4.4945F, 0.0024F, -0.3492F, -0.0014F, 0.001F));

		PartDefinition cube_r410 = rightarm.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(136, 52).addBox(-1.0F, -2.0475F, 0.0581F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-1.5965F, 8.2281F, 2.5064F, 0.6719F, -0.0014F, 0.001F));

		PartDefinition cube_r411 = rightarm.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(22, 99).addBox(-1.0F, -6.9475F, -0.1419F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-1.6004F, 10.3985F, 3.763F, 0.445F, -0.0014F, 0.001F));

		PartDefinition cube_r412 = rightarm.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(19, 136).addBox(-1.0F, -0.1F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 9.2766F, 5.8038F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightarm.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(129, 71).addBox(-1.0F, -0.7F, -2.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 9.2766F, 5.8038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightarm.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(85, 93).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, 5.401F, 3.493F, 0.3142F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0652F, 15.7397F, 4.5122F, -0.4244F, -0.0789F, -0.103F));

		PartDefinition cube_r415 = rightarm2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(134, 81).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1501F, 0.8493F, -1.18F, 1.5283F, 0.9549F, 1.5101F));

		PartDefinition cube_r416 = rightarm2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(70, 121).addBox(-2.25F, -0.5F, -2.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8672F, 11.2776F, 0.3219F, -1.3992F, 1.5352F, -1.4172F));

		PartDefinition cube_r417 = rightarm2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(125, 126).addBox(-1.3725F, -3.1553F, -0.6251F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2265F, 2.291F, -0.9359F, -2.6186F, 1.5284F, -2.6421F));

		PartDefinition cube_r418 = rightarm2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(26, 82).addBox(-0.9451F, -1.0659F, -0.7944F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2265F, 2.291F, -0.9359F, 2.0782F, 1.4967F, 2.0182F));

		PartDefinition cube_r419 = rightarm2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(28, 134).addBox(-0.513F, -1.4383F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2122F, 15.7517F, 2.0188F, 1.5063F, 1.5276F, 1.4889F));

		PartDefinition cube_r420 = rightarm2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(109, 133).addBox(-1.6841F, -1.3262F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2122F, 15.7517F, 2.0188F, 1.5652F, 1.0478F, 1.5486F));

		PartDefinition cube_r421 = rightarm2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(16, 141).addBox(-0.4F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2236F, 0.3885F, 1.2089F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition cube_r422 = rightarm2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(105, 28).addBox(-1.9515F, -1.9906F, -1.0016F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.222F, -0.873F, 2.9354F, 1.5708F, 0.6545F, 1.5708F));

		PartDefinition cube_r423 = rightarm2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(131, 22).addBox(-2.0216F, -2.9357F, -1.0016F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.222F, -0.873F, 2.9354F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r424 = rightarm2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(9, 125).addBox(-1.082F, -2.0528F, -1.0016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.222F, -0.873F, 2.9354F, -1.5708F, 1.0908F, -1.5708F));

		PartDefinition cube_r425 = rightarm2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(125, 96).addBox(-0.9878F, 0.6886F, -1.0016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.222F, -0.873F, 2.9354F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition cube_r426 = rightarm2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(118, 53).addBox(-0.025F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2236F, 6.2485F, 2.4316F, 1.5708F, 1.5359F, 1.5708F));

		PartDefinition cube_r427 = rightarm2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(38, 107).addBox(-1.975F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 6.3599F, 0.4917F, -1.5708F, 1.5053F, -1.5708F));

		PartDefinition cube_r428 = rightarm2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(22, 109).addBox(-0.2F, -0.1F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.2122F, 10.1812F, 2.3925F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.422F, 17.1414F, 1.292F, 0.4253F, 0.0972F, -0.0079F));

		PartDefinition cube_r429 = rightArm3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(13, 76).addBox(-1.4998F, -3.9818F, -0.491F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.0F, -1.0F, -0.2177F, 0.0096F, 0.0084F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(47, 107).addBox(-2.0F, -0.2F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 5.8459F, -1.09F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightArm4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(136, 64).addBox(-0.4003F, -1.0455F, 0.5234F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9423F, 0.5743F, -1.0437F, 0.0735F, -0.8158F, -0.1714F));

		PartDefinition cube_r431 = rightArm4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(149, 5).addBox(-0.2947F, -4.4031F, -0.3039F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2368F, 4.2008F, 0.0357F, -0.0322F, 0.8321F, 0.01F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1868F, 4.5391F, 0.5618F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r432 = rightArm5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(133, 107).addBox(-1.6863F, -0.0065F, -0.1801F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5F, -3.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r433 = rightArm5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(118, 91).addBox(-0.3435F, 2.6681F, -5.0807F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.129F, -3.9649F, -1.6055F, 0.9497F, -0.8301F, -0.1502F));

		PartDefinition cube_r434 = rightArm5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(101, 85).addBox(-0.335F, -0.3106F, -3.307F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0501F, -0.3383F, -0.5261F, 1.0314F, 0.7945F, 0.0728F));

		PartDefinition cube_r435 = rightArm5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(73, 31).addBox(-1.6876F, -1.0061F, -2.4107F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8716F, -19.9344F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r436 = neck2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(140, 16).addBox(-0.01F, -8.8276F, -0.4147F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7847F, -2.7006F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r437 = neck2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(128, 143).addBox(0.0F, -3.8616F, -0.0706F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7847F, -2.7006F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r438 = neck2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-11.8456F, -4.1072F, -0.6864F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0239F, -1.3812F, -0.5734F, -0.3052F, -1.4373F));

		PartDefinition cube_r439 = neck2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(116, 63).mirror().addBox(-8.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0239F, -1.3812F, -0.6377F, -0.0745F, -1.1019F));

		PartDefinition cube_r440 = neck2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(151, 127).mirror().addBox(-2.9392F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0239F, -1.3812F, -0.6369F, 0.0819F, -0.8917F));

		PartDefinition cube_r441 = neck2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(93, 56).addBox(7.8456F, -4.1072F, -0.6864F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0239F, -1.3812F, -0.5734F, 0.3052F, 1.4373F));

		PartDefinition cube_r442 = neck2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(116, 63).addBox(2.8555F, -0.6994F, -0.6746F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0239F, -1.3812F, -0.6377F, 0.0745F, 1.1019F));

		PartDefinition cube_r443 = neck2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(151, 127).addBox(-0.0608F, 0.0635F, -0.6746F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0239F, -1.3812F, -0.6369F, -0.0819F, 0.8917F));

		PartDefinition cube_r444 = neck2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1471F, -2.6719F, -0.3842F, 0.0F, 0.0F));

		PartDefinition cube_r445 = neck.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(93, 154).addBox(0.0F, -4.5F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.151F, -0.7218F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r446 = neck.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(94, 93).addBox(-1.0F, -1.1F, -0.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6396F, -3.5166F, -0.2533F, 0.1267F, -0.033F));

		PartDefinition cube_r447 = neck3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(59, 152).mirror().addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.885F, -1.7171F, -0.0686F, 2.8904F, -0.0282F, -2.6624F));

		PartDefinition cube_r448 = neck3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(111, 112).mirror().addBox(0.0F, 0.0F, -4.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.4959F, -1.3034F, -0.0542F, 0.0282F, 0.4792F));

		PartDefinition cube_r449 = neck3.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(59, 152).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.885F, -1.7171F, -0.0686F, 2.8904F, 0.0282F, 2.6624F));

		PartDefinition cube_r450 = neck3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(111, 112).addBox(0.0F, 0.0F, -4.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4959F, -1.3034F, -0.0542F, -0.0282F, -0.4792F));

		PartDefinition cube_r451 = neck3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(33, 2).addBox(-1.0F, -1.1F, -4.2F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4516F, -7.6039F, -0.1666F, 0.2012F, 0.2715F));

		PartDefinition cube_r452 = neck4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(93, 106).mirror().addBox(0.0F, 0.0F, -2.9F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6495F, -4.3414F, 0.1426F, -0.0662F, 0.4316F));

		PartDefinition cube_r453 = neck4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(0.0F, 0.0F, -2.2F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0706F, -0.1636F, -0.1668F, 0.0955F, 0.5156F));

		PartDefinition cube_r454 = neck4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(93, 106).addBox(0.0F, 0.0F, -2.9F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6495F, -4.3414F, 0.1426F, 0.0662F, -0.4316F));

		PartDefinition cube_r455 = neck4.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(29, 44).addBox(-1.0F, -1.1F, -4.2F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r456 = neck4.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, 0.0F, -2.2F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0706F, -0.1636F, -0.1668F, -0.0955F, -0.5156F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5107F, -7.705F, 0.3211F, 0.2073F, 0.0684F));

		PartDefinition cube_r457 = neck5.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(52, 120).mirror().addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1707F, -10.1332F, 0.0597F, -0.0596F, 0.7836F));

		PartDefinition cube_r458 = neck5.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.1369F, -5.6757F, 0.3025F, -0.138F, 0.4153F));

		PartDefinition cube_r459 = neck5.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(52, 120).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1707F, -10.1332F, 0.0597F, 0.0596F, -0.7836F));

		PartDefinition cube_r460 = neck5.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1369F, -5.6757F, 0.3025F, 0.138F, -0.4153F));

		PartDefinition cube_r461 = neck5.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -1.1F, -2.025F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0393F, -5.5419F, 0.1831F, 0.0F, 0.0F));

		PartDefinition cube_r462 = neck6.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(9, 120).addBox(-2.5F, -3.5F, 0.8F, 5.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3193F, -1.2078F, 2.1118F, 0.0F, -3.1416F));

		PartDefinition cube_r463 = neck6.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0F, -1.1F, -3.025F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8863F, -6.4547F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r464 = head.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(138, 8).addBox(-2.0F, 0.9693F, -1.3613F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.6F, -2.6F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r465 = head.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(138, 27).addBox(-2.0F, -0.0307F, -1.0613F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4382F, -2.7009F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r466 = head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(83, 139).addBox(-0.5F, -1.0F, -0.475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 15.3646F, -2.1093F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r467 = head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(86, 154).addBox(-0.5F, 0.0F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 16.4273F, -3.5546F, 2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r468 = head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(152, 153).addBox(-0.5F, -0.3F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 16.0235F, -3.2598F, -2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(120, 157).addBox(-1.0F, -0.0288F, -0.9962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 14.202F, -6.0329F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(149, 76).addBox(-1.0F, -0.2287F, -2.9962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.2F, -6.2F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(160, 0).addBox(-1.0F, -0.1059F, -1.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 11.2F, -6.2F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(155, 83).addBox(-1.0F, -0.0557F, 0.0413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.2991F, -6.2436F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(90, 19).addBox(-2.0F, -0.6259F, -1.2099F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(155, 64).addBox(-1.0F, -0.026F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 7.7026F, -6.2618F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(140, 12).addBox(-1.0F, -0.026F, -2.0099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.7197F, -6.0007F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(153, 106).addBox(-1.0F, -0.026F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.766F, -5.7F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(7, 140).addBox(-1.0F, -0.026F, -0.0099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.766F, -5.7F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(72, 96).addBox(-1.5F, -0.9259F, -4.0099F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(80, 119).addBox(-2.0F, 0.0741F, -2.0099F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.9F, -4.1F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(117, 48).addBox(-2.5F, 2.0606F, -4.0004F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 110).addBox(-2.5F, 1.9606F, -2.8004F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.1F, -4.6F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(141, 39).addBox(-1.5F, -1.0898F, -0.9812F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -0.8729F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(140, 24).addBox(-1.5F, -0.6778F, -0.6669F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7742F, -1.6729F, 2.6005F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(105, 56).addBox(-1.5F, -0.4792F, -0.1597F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 10.5104F, -1.2445F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(144, 106).addBox(-1.5F, -1.0159F, -1.0408F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.7215F, 0.8389F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(13, 92).addBox(-1.5F, -3.0159F, -0.0408F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2375F, -0.795F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(94, 68).addBox(-1.5F, -3.0159F, -0.0408F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 7.1285F, -0.3411F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(80, 49).addBox(-1.5F, -4.2159F, -0.1408F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7742F, -1.7729F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(107, 23).addBox(-1.5F, -0.441F, -3.0452F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.5104F, -1.2445F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(19, 149).addBox(-2.0F, -5.8693F, -1.6329F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.7269F, -2.9533F, -0.2618F, 0.0F, 0.0873F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(40, 153).addBox(-2.0F, -1.8923F, -0.5175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.7269F, -2.9533F, -0.1309F, 0.0F, 0.0873F));

		PartDefinition cube_r490 = head.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(62, 139).addBox(-0.6701F, -4.0909F, 0.0164F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3299F, 14.5644F, -3.9318F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r491 = head.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(125, 102).addBox(-0.6701F, -1.591F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3299F, 15.9977F, -3.1038F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r492 = head.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(105, 75).addBox(-2.5F, -0.9F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4353F, -1.3726F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r493 = head.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(26, 77).addBox(-2.5F, -0.7F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.5609F, 0.8906F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r494 = head.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(0, 86).addBox(-2.5F, -1.9F, -1.4F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.6353F, -0.0253F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r495 = head.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(99, 40).mirror().addBox(-2.5F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(99, 40).addBox(1.5F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 1.5613F, 1.3869F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r496 = head.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(103, 18).addBox(-3.5F, 0.5606F, 2.0746F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 1.4267F, -2.6103F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r497 = head.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(140, 61).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1666F, -3.4202F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r498 = head.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(159, 151).addBox(-0.5F, -0.1449F, -2.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.8752F, -3.9841F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r499 = head.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(155, 80).addBox(-1.0F, 0.1966F, -0.4131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r500 = head.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(79, 68).addBox(-2.2F, -0.1F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6978F, 10.2075F, -4.1219F, 2.4255F, 0.0F, 0.0F));

		PartDefinition cube_r501 = head.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(73, 83).addBox(-2.2F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6978F, 11.7219F, -2.264F, 1.1601F, 0.0F, 0.0F));

		PartDefinition cube_r502 = head.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(0, 131).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1206F, -3.3849F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r503 = head.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(40, 95).addBox(-2.0F, 0.071F, -2.9934F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.9576F, -4.272F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r504 = head.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(92, 60).addBox(-2.0F, 1.096F, -0.1934F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r505 = head.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(45, 146).addBox(-1.0F, -0.504F, -0.1934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 2.3F, -3.8F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r506 = head.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(138, 71).addBox(-2.0605F, -0.9923F, -0.021F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 10.2573F, -5.3218F, 0.9702F, 0.0F, 0.0F));

		PartDefinition cube_r507 = head.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(105, 33).addBox(-3.0605F, -0.0673F, -0.196F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 10.2273F, -6.2213F, 1.5375F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(5, 156).addBox(-0.5F, -2.7987F, -0.743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5092F, 0.2745F, 2.4046F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(129, 119).addBox(-0.7298F, -0.4898F, -2.4857F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(129, 114).addBox(-0.3298F, -0.4898F, -2.4857F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3907F, -1.2278F, -2.0697F, 1.612F, -0.7802F, -0.0544F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(53, 95).addBox(-0.1F, -1.2327F, -0.1125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6113F, 10.8069F, -2.2627F, -0.2618F, 0.0F, 0.0785F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(143, 64).addBox(-0.1F, -2.3946F, -0.8395F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.6113F, 10.8069F, -2.2627F, 0.0F, 0.0F, 0.0785F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(52, 158).addBox(-0.7027F, -0.5081F, 0.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(158, 23).addBox(-0.3027F, -0.5081F, 0.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3907F, -1.2278F, -2.0697F, 1.5708F, -0.7854F, 0.0F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(157, 97).addBox(-0.2597F, -0.4233F, -0.6265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(115, 157).addBox(-0.2597F, 0.0767F, -0.6265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-2.7081F, 15.5326F, -1.0429F, 1.3597F, 0.3346F, -0.036F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(152, 156).addBox(-0.2597F, -1.1848F, -0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.7081F, 15.5326F, -1.0429F, 0.8798F, 0.3346F, -0.036F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(158, 100).addBox(-0.7745F, -0.5265F, -0.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(158, 103).addBox(-0.7745F, -0.0265F, -0.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-1.9831F, 15.5076F, -1.1429F, 1.3691F, 0.073F, -0.0341F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(158, 109).addBox(-0.7745F, -0.575F, -0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(101, 158).addBox(-0.7745F, -0.275F, -0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-1.9831F, 15.5076F, -1.1429F, 0.8891F, 0.073F, -0.0341F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(159, 37).addBox(-0.7744F, 0.2168F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0831F, 15.5076F, -1.1429F, 1.1031F, 0.1951F, -0.0347F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(106, 158).addBox(-0.5467F, 1.4169F, -0.6938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-2.5082F, 15.5076F, -2.1179F, 1.5394F, 0.1951F, -0.0347F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(157, 156).addBox(-0.601F, 0.5282F, -0.6885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4082F, 15.5076F, -2.1179F, 2.3911F, 0.1222F, 0.0F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(145, 157).addBox(-0.601F, -0.0925F, -0.9632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4082F, 15.5076F, -2.1179F, 2.6529F, 0.1222F, 0.0F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(154, 20).addBox(0.7366F, 0.1871F, -2.4807F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5092F, -5.4547F, -3.6082F, 1.5223F, -0.4526F, 0.3903F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(149, 30).addBox(-1.0F, -0.0259F, -0.0099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0092F, 2.7982F, -3.2027F, 1.2828F, -0.103F, -0.3341F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(39, 157).addBox(-0.375F, 0.075F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.1101F, 12.0237F, -2.4876F, -0.168F, 0.0494F, 0.2305F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-3.0092F, 1.1018F, -0.8973F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(5, 156).mirror().addBox(-0.5F, -2.7987F, -0.743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5092F, 0.2745F, 2.4046F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(129, 119).mirror().addBox(-0.2702F, -0.4898F, -2.4857F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(129, 114).mirror().addBox(-0.6702F, -0.4898F, -2.4857F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3907F, -1.2278F, -2.0697F, 1.612F, 0.7802F, 0.0544F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(53, 95).mirror().addBox(-0.9F, -1.2327F, -0.1125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6113F, 10.8069F, -2.2627F, -0.2618F, 0.0F, -0.0785F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(143, 64).mirror().addBox(-0.9F, -2.3946F, -0.8395F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.6113F, 10.8069F, -2.2627F, 0.0F, 0.0F, -0.0785F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(52, 158).mirror().addBox(-0.2973F, -0.5081F, 0.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(158, 23).mirror().addBox(-0.6973F, -0.5081F, 0.484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3907F, -1.2278F, -2.0697F, 1.5708F, 0.7854F, 0.0F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(157, 97).mirror().addBox(-0.7403F, -0.4233F, -0.6265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(115, 157).mirror().addBox(-0.7403F, 0.0767F, -0.6265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(2.7081F, 15.5326F, -1.0429F, 1.3597F, -0.3346F, 0.036F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(152, 156).mirror().addBox(-0.7403F, -1.1848F, -0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.7081F, 15.5326F, -1.0429F, 0.8798F, -0.3346F, 0.036F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(158, 100).mirror().addBox(-0.2255F, -0.5265F, -0.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(158, 103).mirror().addBox(-0.2255F, -0.0265F, -0.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(1.9831F, 15.5076F, -1.1429F, 1.3691F, -0.073F, 0.0341F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(158, 109).mirror().addBox(-0.2255F, -0.575F, -0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(101, 158).mirror().addBox(-0.2255F, -0.275F, -0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(1.9831F, 15.5076F, -1.1429F, 0.8891F, -0.073F, 0.0341F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(159, 37).mirror().addBox(-0.2255F, 0.2168F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0831F, 15.5076F, -1.1429F, 1.1031F, -0.1951F, 0.0347F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(106, 158).mirror().addBox(-0.4533F, 1.4169F, -0.6938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(2.5082F, 15.5076F, -2.1179F, 1.5394F, -0.1951F, 0.0347F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(157, 156).mirror().addBox(-0.399F, 0.5282F, -0.6885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4082F, 15.5076F, -2.1179F, 2.3911F, -0.1222F, 0.0F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(145, 157).mirror().addBox(-0.399F, -0.0925F, -0.9632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4082F, 15.5076F, -2.1179F, 2.6529F, -0.1222F, 0.0F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(154, 20).mirror().addBox(-2.7366F, 0.1871F, -2.4807F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5092F, -5.4547F, -3.6082F, 1.5223F, 0.4526F, -0.3903F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(149, 30).mirror().addBox(0.0F, -0.0259F, -0.0099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0092F, 2.7982F, -3.2027F, 1.2828F, 0.103F, 0.3341F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(39, 157).mirror().addBox(-0.625F, 0.075F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.1101F, 12.0237F, -2.4876F, -0.168F, -0.0494F, -0.2305F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1332F, 3.5162F, 0.0624F, 0.0F, 0.0F, 0.0262F));

		PartDefinition cube_r540 = leftOrbit.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(86, 157).addBox(-0.9214F, -0.394F, -0.816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.331F, 5.0959F, -2.5136F, 0.5624F, 1.3187F, -0.7453F));

		PartDefinition cube_r541 = leftOrbit.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(33, 153).addBox(-0.9452F, -0.8924F, -0.2662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1189F, 5.2909F, -2.371F, 0.0487F, 1.3871F, -1.3129F));

		PartDefinition cube_r542 = leftOrbit.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(134, 95).addBox(-1.187F, -0.5633F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1189F, 3.8909F, -2.371F, 2.5064F, 1.3525F, 0.9451F));

		PartDefinition cube_r543 = leftOrbit.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(107, 91).addBox(-0.0523F, -1.93F, -0.0298F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0993F, -2.8685F, -0.3397F, -3.0038F, 0.9815F, 1.2615F));

		PartDefinition cube_r544 = leftOrbit.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(159, 118).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.543F, -1.433F, -0.4562F, -2.909F, 1.2865F, 1.2221F));

		PartDefinition cube_r545 = leftOrbit.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(157, 159).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0352F, -0.9427F, -0.3707F, 2.0215F, 1.2865F, 1.2221F));

		PartDefinition cube_r546 = leftOrbit.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(74, 152).addBox(-1.0522F, -0.93F, -1.6298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.307F, -1.4955F, -0.9638F, 2.8512F, 1.3286F, 1.1775F));

		PartDefinition cube_r547 = leftOrbit.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(155, 92).addBox(-1.0522F, -2.93F, 0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5139F, -0.7558F, -0.74F, 3.0687F, 1.2865F, 1.2221F));

		PartDefinition cube_r548 = leftOrbit.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(159, 112).addBox(-0.0946F, -0.6061F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 0.4865F, -1.751F, 0.1146F, 0.5196F, -1.4446F));

		PartDefinition cube_r549 = leftOrbit.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(159, 115).addBox(0.1604F, -0.6061F, 0.5712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1064F, 0.4865F, -1.751F, 0.1009F, 0.1725F, -1.4843F));

		PartDefinition cube_r550 = leftOrbit.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(159, 89).addBox(-0.901F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, -0.8135F, -1.751F, 0.1302F, 0.4767F, -1.4749F));

		PartDefinition cube_r551 = leftOrbit.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(159, 86).addBox(-0.901F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1578F, -0.0738F, -2.422F, 0.1702F, 0.8219F, -1.4097F));

		PartDefinition cube_r552 = leftOrbit.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(159, 71).addBox(-0.901F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1477F, 0.9028F, -2.6368F, 0.4927F, 1.3245F, -1.0549F));

		PartDefinition cube_r553 = leftOrbit.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(84, 134).addBox(-0.901F, -0.5633F, 0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1189F, 3.8909F, -2.371F, 2.1743F, 1.4141F, 0.6074F));

		PartDefinition cube_r554 = leftOrbit.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(133, 152).addBox(-0.83F, -0.8924F, -0.3611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1189F, 5.2909F, -2.371F, 0.1674F, 1.5174F, -1.1936F));

		PartDefinition cube_r555 = leftOrbit.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(143, 42).addBox(1.1838F, 0.7F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4451F, 5.2024F, -4.9077F, 1.7957F, 0.2752F, -1.6528F));

		PartDefinition cube_r556 = leftOrbit.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(130, 139).addBox(-0.075F, -0.2F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4451F, 5.2024F, -4.9077F, 1.7934F, -0.2359F, -1.7678F));

		PartDefinition cube_r557 = leftOrbit.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(152, 16).addBox(-0.05F, -0.1F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2893F, 5.9639F, -4.8221F, 1.9217F, 0.4066F, -1.4295F));

		PartDefinition cube_r558 = leftOrbit.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(139, 0).addBox(-1.0414F, -0.4F, -1.395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.468F, 6.063F, -4.3658F, 2.3406F, -0.0313F, -0.2794F));

		PartDefinition cube_r559 = leftOrbit.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(149, 60).addBox(-0.35F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7366F, 6.9568F, -3.4112F, 1.5254F, 0.348F, 2.0219F));

		PartDefinition cube_r560 = leftOrbit.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(149, 56).addBox(-1.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1597F, 5.6729F, -2.7898F, 0.8236F, 0.0133F, 0.5012F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1332F, 3.5162F, 0.0624F, 0.0F, 0.0F, -0.0262F));

		PartDefinition cube_r561 = rightOrbit.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(86, 157).mirror().addBox(-0.0786F, -0.394F, -0.816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.331F, 5.0959F, -2.5136F, 0.5624F, -1.3187F, 0.7453F));

		PartDefinition cube_r562 = rightOrbit.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(33, 153).mirror().addBox(-0.0548F, -0.8924F, -0.2662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 5.2909F, -2.371F, 0.0487F, -1.3871F, 1.3129F));

		PartDefinition cube_r563 = rightOrbit.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(134, 95).mirror().addBox(0.187F, -0.5633F, -0.0434F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 3.8909F, -2.371F, 2.5064F, -1.3525F, -0.9451F));

		PartDefinition cube_r564 = rightOrbit.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(107, 91).mirror().addBox(-0.9477F, -1.93F, -0.0298F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0993F, -2.8685F, -0.3397F, -3.0038F, -0.9815F, -1.2615F));

		PartDefinition cube_r565 = rightOrbit.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(159, 118).mirror().addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.543F, -1.433F, -0.4562F, -2.909F, -1.2865F, -1.2221F));

		PartDefinition cube_r566 = rightOrbit.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(157, 159).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0352F, -0.9427F, -0.3707F, 2.0215F, -1.2865F, -1.2221F));

		PartDefinition cube_r567 = rightOrbit.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(74, 152).mirror().addBox(0.0522F, -0.93F, -1.6298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.307F, -1.4955F, -0.9638F, 2.8512F, -1.3286F, -1.1775F));

		PartDefinition cube_r568 = rightOrbit.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(155, 92).mirror().addBox(0.0522F, -2.93F, 0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5139F, -0.7558F, -0.74F, 3.0687F, -1.2865F, -1.2221F));

		PartDefinition cube_r569 = rightOrbit.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(159, 112).mirror().addBox(-0.9054F, -0.6061F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, 0.4865F, -1.751F, 0.1146F, -0.5196F, 1.4446F));

		PartDefinition cube_r570 = rightOrbit.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(159, 115).mirror().addBox(-1.1603F, -0.6061F, 0.5712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, 0.4865F, -1.751F, 0.1009F, -0.1725F, 1.4843F));

		PartDefinition cube_r571 = rightOrbit.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(159, 89).mirror().addBox(-0.099F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, -0.8135F, -1.751F, 0.1302F, -0.4767F, 1.4749F));

		PartDefinition cube_r572 = rightOrbit.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(159, 86).mirror().addBox(-0.099F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1578F, -0.0738F, -2.422F, 0.1702F, -0.8219F, 1.4097F));

		PartDefinition cube_r573 = rightOrbit.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(159, 71).mirror().addBox(-0.099F, -0.5633F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1477F, 0.9028F, -2.6368F, 0.4927F, -1.3245F, 1.0549F));

		PartDefinition cube_r574 = rightOrbit.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(84, 134).mirror().addBox(-0.099F, -0.5633F, 0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 3.8909F, -2.371F, 2.1743F, -1.4141F, -0.6074F));

		PartDefinition cube_r575 = rightOrbit.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(133, 152).mirror().addBox(-0.17F, -0.8924F, -0.3611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 5.2909F, -2.371F, 0.1674F, -1.5174F, 1.1936F));

		PartDefinition cube_r576 = rightOrbit.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(143, 42).mirror().addBox(-4.1838F, 0.7F, 0.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4451F, 5.2024F, -4.9077F, 1.7957F, -0.2752F, 1.6528F));

		PartDefinition cube_r577 = rightOrbit.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(130, 139).mirror().addBox(-1.925F, -0.2F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4451F, 5.2024F, -4.9077F, 1.7934F, 0.2359F, 1.7678F));

		PartDefinition cube_r578 = rightOrbit.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(152, 16).mirror().addBox(-0.95F, -0.1F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2893F, 5.9639F, -4.8221F, 1.9217F, -0.4066F, 1.4295F));

		PartDefinition cube_r579 = rightOrbit.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(139, 0).mirror().addBox(-0.9586F, -0.4F, -1.395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.468F, 6.063F, -4.3658F, 2.3406F, 0.0313F, 0.2794F));

		PartDefinition cube_r580 = rightOrbit.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(149, 60).mirror().addBox(-0.65F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7366F, 6.9568F, -3.4112F, 1.5254F, -0.348F, -2.0219F));

		PartDefinition cube_r581 = rightOrbit.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(149, 56).mirror().addBox(0.0052F, 0.2082F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1597F, 5.6729F, -2.7898F, 0.8236F, -0.0133F, -0.5012F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(64, 154).addBox(0.9F, -0.1F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(64, 154).mirror().addBox(-3.1F, -0.1F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 4.0525F, -1.5875F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(153, 147).addBox(-1.5417F, -0.4198F, -0.1368F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(145, 153).addBox(-1.3417F, -0.4198F, -0.1368F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1583F, 3.5919F, -9.7687F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(157, 67).mirror().addBox(-0.9262F, -1.2668F, -0.4477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(29, 157).mirror().addBox(-0.9262F, -0.8668F, -0.0227F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0417F, 3.5919F, -9.7687F, -1.9445F, -0.1193F, -0.0266F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(79, 158).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.564F, 4.2172F, -8.8557F, -1.7279F, -0.1222F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(156, 60).mirror().addBox(-0.9262F, -1.8522F, -1.0876F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0417F, 3.5919F, -9.7687F, -1.9881F, -0.1193F, -0.0266F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(156, 56).mirror().addBox(-0.9262F, -0.6637F, -0.8914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0417F, 3.5919F, -9.7687F, -1.2289F, -0.1193F, -0.0266F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(119, 145).mirror().addBox(-0.01F, -1.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 145).addBox(2.81F, -1.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.9177F, -7.7425F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(44, 135).mirror().addBox(0.0F, -1.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 135).addBox(2.8F, -1.3F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.1477F, -4.8214F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(21, 47).mirror().addBox(-1.0F, -2.2879F, -0.0865F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(21, 47).addBox(1.2F, -2.2879F, -0.0865F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 3.1122F, -5.9574F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(47, 156).mirror().addBox(-1.0F, 0.0323F, -0.9982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(47, 156).addBox(1.2F, 0.0323F, -0.9982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 5.5198F, -4.8872F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(12, 147).mirror().addBox(-1.0F, 0.0323F, -2.0232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(12, 147).addBox(1.2F, 0.0323F, -2.0232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 6.1187F, -3.5474F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(152, 71).mirror().addBox(-1.0F, 0.0323F, -2.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(152, 71).addBox(1.2F, 0.0323F, -2.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.2F, 6.3352F, -2.5711F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(134, 156).mirror().addBox(-1.0F, -1.1677F, -0.0232F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 156).addBox(1.2F, -1.1677F, -0.0232F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 3.1456F, -3.8622F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(129, 156).mirror().addBox(-1.0F, -0.0677F, -0.0732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(129, 156).addBox(1.2F, -0.0677F, -0.0732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.2F, 4.1944F, -6.7373F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(149, 12).mirror().addBox(-1.0F, 0.0073F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(149, 12).addBox(3.0F, 0.0073F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, 4.806F, 0.7908F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(97, 153).mirror().addBox(-1.0F, -0.0222F, -2.009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(97, 153).addBox(3.0F, -0.0222F, -2.009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1F, 5.6504F, 0.2227F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(146, 146).mirror().addBox(-1.0F, 0.89F, -1.5949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(146, 146).addBox(3.0F, 0.89F, -1.5949F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 5.6504F, 0.2227F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(138, 114).mirror().addBox(-1.0F, -2.0F, 0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(138, 114).addBox(3.0F, -2.0F, 0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.1F, 2.2534F, -2.2823F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(57, 158).mirror().addBox(-0.5F, -1.0949F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(57, 158).addBox(3.5F, -1.0949F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6F, 0.227F, -1.4291F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(0, 157).mirror().addBox(-0.5081F, -1.4922F, -0.517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.5031F, -0.0224F, -2.9319F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(139, 158).mirror().addBox(-0.4879F, -0.3754F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(158, 140).mirror().addBox(-0.4879F, -0.8754F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.1806F, 0.0516F, -2.9802F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(159, 49).mirror().addBox(-0.544F, -0.0235F, -0.7324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.0008F, -0.0643F, -3.058F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(62, 159).mirror().addBox(-0.5924F, -0.446F, -0.7268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(67, 159).mirror().addBox(-0.5924F, -0.946F, -0.7268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.1633F, -0.165F, -3.1275F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(158, 143).mirror().addBox(-0.5626F, -0.1136F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.2732F, -0.1243F, -3.0275F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(159, 14).mirror().addBox(-0.6091F, -0.5628F, -0.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0843F, 3.55F, -11.5187F, -1.4728F, -0.2122F, -3.1135F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(155, 135).mirror().addBox(-1.0F, -0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(155, 135).addBox(3.0F, -0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.869F, -1.7436F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(156, 26).mirror().addBox(-0.5F, -0.3899F, -0.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(156, 26).addBox(3.5F, -0.3899F, -0.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 0.227F, -1.4291F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(96, 157).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(96, 157).addBox(3.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 2.8597F, 0.8336F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(152, 50).mirror().addBox(-0.5F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(152, 50).addBox(3.5F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.6F, 2.8377F, 0.8059F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(47, 152).mirror().addBox(-0.5F, -0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(47, 152).addBox(3.5F, -0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6F, 3.8524F, 0.8487F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(146, 141).mirror().addBox(-1.0F, -0.3F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(146, 141).addBox(3.0F, -0.3F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-2.1F, 0.9F, 0.6F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(157, 67).addBox(-0.0738F, -1.2668F, -0.4477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(29, 157).addBox(-0.0738F, -0.8668F, -0.0227F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1583F, 3.5919F, -9.7687F, -1.9445F, 0.1193F, 0.0266F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(79, 158).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.364F, 4.2172F, -8.8557F, -1.7279F, 0.1222F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(156, 60).addBox(-0.0738F, -1.8522F, -1.0876F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1583F, 3.5919F, -9.7687F, -1.9881F, 0.1193F, 0.0266F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(156, 56).addBox(-0.0738F, -0.6637F, -0.8914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1583F, 3.5919F, -9.7687F, -1.2289F, 0.1193F, 0.0266F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(0, 157).addBox(-0.4919F, -1.4922F, -0.517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.5031F, 0.0224F, 2.9319F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(139, 158).addBox(-0.5121F, -0.3754F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(158, 140).addBox(-0.5121F, -0.8754F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.1806F, -0.0516F, 2.9802F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(159, 49).addBox(-0.456F, -0.0235F, -0.7324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.0008F, 0.0643F, 3.058F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(62, 159).addBox(-0.4076F, -0.446F, -0.7268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(67, 159).addBox(-0.4076F, -0.946F, -0.7268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.1633F, 0.165F, 3.1275F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(158, 143).addBox(-0.4374F, -0.1136F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.2732F, 0.1243F, 3.0275F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(159, 14).addBox(-0.3909F, -0.5628F, -0.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1157F, 3.55F, -11.5187F, -1.4728F, 0.2122F, 3.1135F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(73, 75).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4868F, 3.6351F, -0.8418F, -0.0901F, 0.1989F));

		PartDefinition cube_r622 = tail.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(74, 143).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 89).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r623 = tail.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(59, 147).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.5182F, -0.047F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(125, 157).addBox(0.0F, -1.7182F, 0.953F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3604F, 5.9539F, -0.3011F, -0.2925F, 0.0893F));

		PartDefinition cube_r624 = tail2.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(103, 23).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6182F, 2.953F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5864F, -0.0965F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0306F, 4.7584F, -0.5689F, -0.2975F, 0.1853F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(92, 7).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1024F, 4.7462F, -0.3237F, -0.3323F, 0.109F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(110, 38).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0173F, 4.9335F, 0.0569F, -0.6973F, -0.0366F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(111, 106).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0029F, 3.8954F, 0.3076F, -0.5457F, -0.1634F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(134, 42).addBox(-0.5F, -0.5083F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0389F, 3.8151F, 0.3001F, 0.504F, 0.1483F));

		return LayerDefinition.create(meshdefinition, 168, 168);
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