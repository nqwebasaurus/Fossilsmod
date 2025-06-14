package fossils.fossils.client.blockentity.model.skorpiovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SkorpiovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public SkorpiovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck4 = this.chest.getChild("neck4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.75F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.9F, -4.6F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 89).addBox(0.0F, -1.9069F, -0.0231F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.4F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 86).addBox(0.0F, -2.0429F, -0.0825F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 89).addBox(0.0F, -2.1121F, 0.0377F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 89).addBox(0.0F, -2.064F, 0.0594F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 89).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -4.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.8186F, -7.8814F, -4.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -1.3254F, -0.1565F, 0.248F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 58).mirror().addBox(-0.8186F, -5.84F, 2.479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(78, 7).mirror().addBox(-0.8186F, -6.74F, 2.579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.0862F, -0.1565F, 0.248F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-0.8186F, -7.8575F, 3.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(70, 49).mirror().addBox(-0.8186F, -7.8575F, 0.6471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.348F, -0.1565F, 0.248F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-1.5288F, -7.5661F, -1.1305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, 0.3316F, 0.1134F, 0.2618F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 58).mirror().addBox(-1.5288F, -6.0885F, -4.6795F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.1745F, 0.1134F, 0.2618F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-1.5288F, -6.8962F, -0.9193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, 0.4363F, 0.1134F, 0.2618F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-1.5288F, -7.4012F, -1.5764F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, 0.1396F, 0.1134F, 0.2618F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-0.2215F, -5.0314F, -2.9886F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.3933F, 0.0045F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-1.4912F, -7.5763F, -0.7556F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.1484F, 0.0F, 0.2618F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-1.4912F, -3.9202F, 3.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, 0.3316F, 0.0F, 0.2618F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 73).mirror().addBox(-0.8186F, -6.4313F, 2.2106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.3131F, -0.1565F, 0.248F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-0.2215F, -5.3133F, -0.2418F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.0268F, 0.0045F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(1.1771F, 0.6752F, 7.8729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 2.734F, -3.5603F, -2.0747F, 0.0F, 0.0175F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(0.7595F, 5.3023F, -1.151F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 2.734F, -3.5603F, -0.4477F, 0.0808F, -0.0871F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(0.2284F, -1.2113F, 3.6366F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2088F, 3.334F, 0.4397F, -0.9942F, -0.0045F, -0.0349F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 13).mirror().addBox(-0.2098F, -0.3491F, -1.0769F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2088F, 3.334F, 0.4397F, -0.7884F, 0.0226F, -0.1736F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 83).mirror().addBox(1.1771F, 1.7356F, 7.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.199F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 2.734F, -3.5603F, -1.682F, 0.0F, 0.0175F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 50).mirror().addBox(-0.2305F, -0.2389F, -0.598F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 2.734F, -3.5603F, -0.5591F, 0.0045F, -0.2443F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 2).mirror().addBox(-0.2215F, -2.8276F, -1.4038F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.0268F, 0.0045F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 75).mirror().addBox(-0.2215F, -2.6103F, -3.0162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6088F, 3.934F, -1.3603F, -0.4195F, 0.0045F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 2).mirror().addBox(0.2284F, -5.2451F, 5.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2088F, 3.334F, 0.4397F, -1.5877F, -0.0045F, -0.0349F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-0.2098F, -1.3022F, -1.2417F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2088F, 3.334F, 0.4397F, -1.0502F, 0.0226F, -0.1736F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(67, 18).addBox(0.5288F, -7.4012F, -1.5764F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, 0.1396F, -0.1134F, -0.2618F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 25).addBox(0.5288F, -6.8962F, -0.9193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, 0.4363F, -0.1134F, -0.2618F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 87).addBox(0.5288F, -7.5661F, -1.1305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, 0.3316F, -0.1134F, -0.2618F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 75).addBox(-2.1771F, 0.6752F, 7.8729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.6088F, 2.734F, -3.5603F, -2.0747F, 0.0F, -0.0175F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 83).addBox(-2.1771F, 1.7356F, 7.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.199F)), PartPose.offsetAndRotation(1.6088F, 2.734F, -3.5603F, -1.682F, 0.0F, -0.0175F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(82, 72).addBox(-1.7595F, 5.3023F, -1.151F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6088F, 2.734F, -3.5603F, -0.4477F, -0.0808F, 0.0871F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(13, 50).addBox(-0.7695F, -0.2389F, -0.598F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6088F, 2.734F, -3.5603F, -0.5591F, -0.0045F, 0.2443F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 2).addBox(-0.7785F, -2.8276F, -1.4038F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.0268F, -0.0045F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 75).addBox(-0.7785F, -2.6103F, -3.0162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.4195F, -0.0045F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 2).addBox(-1.2284F, -5.2451F, 5.2997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2088F, 3.334F, 0.4397F, -1.5877F, 0.0045F, 0.0349F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(63, 31).addBox(-1.2284F, -1.2113F, 3.6366F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2088F, 3.334F, 0.4397F, -0.9942F, 0.0045F, 0.0349F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 13).addBox(-0.7902F, -0.3491F, -1.0769F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2088F, 3.334F, 0.4397F, -0.7884F, -0.0226F, 0.1736F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(50, 31).addBox(-0.7902F, -1.3022F, -1.2417F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2088F, 3.334F, 0.4397F, -1.0502F, -0.0226F, 0.1736F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(53, 54).addBox(-0.7785F, -5.0314F, -2.9886F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.3933F, -0.0045F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 64).addBox(-0.7785F, -5.3133F, -0.2418F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.0268F, -0.0045F, 0.0F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(11, 64).addBox(0.4912F, -7.5763F, -0.7556F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.1484F, 0.0F, -0.2618F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 89).addBox(-0.1814F, -7.8814F, -4.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -1.3254F, 0.1565F, -0.248F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(87, 73).addBox(-0.1814F, -7.8575F, 3.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(70, 49).addBox(-0.1814F, -7.8575F, 0.6471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.348F, 0.1565F, -0.248F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 7).addBox(-0.1814F, -6.74F, 2.579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(22, 58).addBox(-0.1814F, -5.84F, 2.479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.0862F, 0.1565F, -0.248F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(41, 76).addBox(0.4912F, -3.9202F, 3.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, 0.3316F, 0.0F, -0.2618F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 73).addBox(-0.1814F, -6.4313F, 2.2106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.3131F, 0.1565F, -0.248F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(11, 58).addBox(0.5288F, -6.0885F, -4.6795F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6088F, 3.934F, -1.3603F, -0.1745F, -0.1134F, -0.2618F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(27, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.7F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.8676F, -0.2003F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(69, 7).addBox(-1.0F, -1.5F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.8049F, 0.6575F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(46, 82).addBox(-1.0F, -0.037F, 0.6228F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(28, 81).addBox(-1.0F, -0.037F, 0.1228F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 4.6F, -1.1F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(41, 80).addBox(-1.0F, 0.0F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(48, 76).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(74, 29).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(82, 39).addBox(1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(9, 71).addBox(0.0F, 0.0F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 64).addBox(0.0F, 1.0F, 0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 9.3448F, 1.2795F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(80, 59).addBox(0.0F, -0.6F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(29, 64).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 0.6F, 0.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(68, 37).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.1721F, 0.9543F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(50, 26).addBox(-2.0F, -0.4881F, -2.6918F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2071F, -0.0649F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(52, 20).addBox(-2.0F, -0.5F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.8676F, -0.2003F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(70, 44).addBox(-1.0F, -1.5F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.8049F, 0.6575F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 82).addBox(0.0F, -0.037F, 0.6228F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(82, 52).addBox(0.0F, -0.037F, 0.1228F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 4.6F, -1.1F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(79, 80).addBox(0.0F, 0.0F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(74, 80).addBox(0.0F, 0.0F, -1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(75, 34).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(82, 63).addBox(-2.0F, -0.2F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(0, 74).addBox(-1.0F, 0.0F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(39, 65).addBox(-1.0F, 1.0F, 0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 9.3448F, 1.2795F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(14, 81).addBox(-1.0F, -0.6F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.6F, 0.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(59, 68).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.1721F, 0.9543F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(53, 38).addBox(-2.0F, -0.4881F, -2.6918F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2071F, -0.0649F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(53, 43).addBox(-2.0F, -0.5F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.2F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.7016F, -0.0686F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(85, 8).addBox(0.6F, 0.2984F, -0.0686F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 21).addBox(0.3F, 0.2984F, 1.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 85).addBox(0.1F, 0.2984F, 3.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 92).addBox(0.9F, 0.2984F, 5.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 56).addBox(0.8F, 0.2984F, 7.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 58).addBox(0.7F, 0.2984F, 9.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 8).mirror().addBox(-2.6F, 0.2984F, -0.0686F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 21).mirror().addBox(-2.3F, 0.2984F, 1.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 85).mirror().addBox(-2.1F, 0.2984F, 3.9314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 92).mirror().addBox(-1.9F, 0.2984F, 5.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 56).mirror().addBox(-1.8F, 0.2984F, 7.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 58).mirror().addBox(-1.7F, 0.2984F, 9.9314F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, 5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(89, 80).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 9.9314F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 89).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 7.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 76).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 5.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 87).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 3.9314F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 87).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 1.9314F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(87, 52).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4038F, 9.8266F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(51, 87).addBox(0.0F, -0.6F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 86).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6813F, 5.407F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(68, 89).addBox(0.0F, 0.0F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 29).addBox(0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8313F, -0.2266F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6016F, -0.0686F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2984F, 10.8314F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 76).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 9.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(65, 7).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(24, 91).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 91).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(90, 52).addBox(0.0F, 0.9F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 28).addBox(0.0F, 0.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 72).addBox(0.0F, 0.0F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 90).addBox(0.0F, -0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 90).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1396F, 1.1041F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(89, 84).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 27).addBox(-0.5F, -0.4039F, -0.0679F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(92, 79).addBox(0.0F, -0.9039F, 0.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 85).addBox(0.0F, -0.8039F, 2.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 2).addBox(0.0F, -0.7039F, 4.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 9).addBox(0.0F, -0.7039F, 6.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 12).addBox(0.0F, -0.6039F, 8.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(92, 82).addBox(0.0F, 1.3407F, 0.8469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 91).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4808F, 7.8357F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 91).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.712F, 5.6116F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 41).addBox(0.0F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 32).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5961F, 1.4321F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.5005F, 0.0218F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0961F, 10.8321F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5005F, 8.0218F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 63).addBox(0.0F, -1.4029F, -1.8627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 92).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2567F, -11.1969F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 91).addBox(0.0F, -0.6904F, -3.8185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.9F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -11.1979F, 0.1841F, 0.04F, -0.4955F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -11.1979F, 0.1547F, 0.0802F, -0.9747F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-9.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -11.1979F, 0.1125F, 0.1332F, -1.3661F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -9.1979F, 0.1034F, 0.0067F, -0.4799F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 32).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -9.1979F, 0.0985F, 0.0134F, -0.9599F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-9.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2998F, -9.1979F, 0.0859F, 0.05F, -1.3511F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0002F, -1.3979F, -0.0419F, -0.0533F, -0.6161F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 30).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0002F, -1.3979F, -0.0028F, -0.1068F, -1.0947F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 22).mirror().addBox(-5.4912F, -1.5298F, -0.4598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0002F, -1.3979F, 0.0384F, -0.0997F, -1.4895F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(90, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -3.2979F, -0.0252F, -0.0478F, -0.5472F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -3.2979F, 0.0095F, -0.0942F, -1.0261F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-7.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0998F, -3.2979F, 0.0449F, -0.0834F, -1.4203F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-8.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1998F, -5.1979F, 0.0555F, -0.0502F, -1.386F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(83, 19).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1998F, -5.1979F, 0.032F, -0.0676F, -0.993F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1998F, -5.1979F, 0.0071F, -0.0345F, -0.5135F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 48).mirror().addBox(-9.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -7.1979F, 0.0648F, -0.0166F, -1.3689F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -7.1979F, 0.0536F, -0.0401F, -0.9767F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3998F, -7.1979F, 0.0389F, -0.02F, -0.4969F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 0).addBox(2.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -11.1979F, 0.1125F, -0.1332F, 1.3661F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 6).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -11.1979F, 0.1547F, -0.0802F, 0.9747F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(92, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -11.1979F, 0.1841F, -0.04F, 0.4955F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(91, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -9.1979F, 0.1034F, -0.0067F, 0.4799F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(83, 32).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -9.1979F, 0.0985F, -0.0134F, 0.9599F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 50).addBox(2.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2998F, -9.1979F, 0.0859F, -0.05F, 1.3511F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(91, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0002F, -1.3979F, -0.0419F, 0.0533F, 0.6161F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 30).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0002F, -1.3979F, -0.0028F, 0.1068F, 1.0947F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 22).addBox(2.4912F, -1.5298F, -0.4598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0002F, -1.3979F, 0.0384F, 0.0997F, 1.4895F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(90, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -3.2979F, -0.0252F, 0.0478F, 0.5472F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 28).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -3.2979F, 0.0095F, 0.0942F, 1.0261F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 59).addBox(2.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0998F, -3.2979F, 0.0449F, 0.0834F, 1.4203F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 10).addBox(2.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1998F, -5.1979F, 0.0555F, 0.0502F, 1.386F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 19).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1998F, -5.1979F, 0.032F, 0.0676F, 0.993F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1998F, -5.1979F, 0.0071F, 0.0345F, 0.5135F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 48).addBox(2.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -7.1979F, 0.0648F, 0.0166F, 1.3689F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(82, 0).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -7.1979F, 0.0536F, 0.0401F, 0.9767F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -7.1979F, 0.0389F, 0.02F, 0.4969F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 40).addBox(-1.0F, -0.1167F, -5.8801F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 91).addBox(0.0F, -1.608F, -0.0782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 91).addBox(0.0F, -1.5586F, -0.0804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(91, 45).addBox(0.0F, -1.5424F, 0.029F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -3.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 8.792F, -6.0782F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(36, 40).addBox(-1.0F, -0.108F, -0.0782F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -5.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -11.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 5).addBox(0.0F, -1.1327F, -0.0227F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3651F, -2.0994F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(92, 64).addBox(0.0F, -1.206F, 0.0376F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1349F, -4.0994F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2351F, -5.3973F, 0.3106F, 0.3231F, -1.1718F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2351F, -5.3973F, 0.4328F, 0.1857F, -0.6959F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-6.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2351F, -5.3973F, 0.1606F, 0.4162F, -1.5815F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(-8.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9351F, -3.3973F, 0.1484F, 0.2773F, -1.446F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9351F, -3.3973F, 0.2433F, 0.1999F, -1.0495F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(88, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9351F, -3.3973F, 0.3174F, 0.106F, -0.573F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(83, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5351F, -1.3973F, 0.2539F, 0.0765F, -0.5261F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(33, 84).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5351F, -1.3973F, 0.2001F, 0.1446F, -1.0043F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(-9.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5351F, -1.3973F, 0.1298F, 0.21F, -1.3978F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(36, 57).mirror().addBox(0.2358F, -2.4026F, -3.4917F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.6099F, -3.8653F, 1.3186F, -0.4848F, -0.4607F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)).mirror(false), PartPose.offsetAndRotation(-3.0098F, 4.7188F, -4.7223F, 1.8858F, -0.4848F, -0.4607F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-0.4882F, 0.1778F, -0.3804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.5408F, -4.0471F, 0.5424F, -0.2457F, -0.1968F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-0.4418F, 0.583F, -0.8073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.5408F, -4.0471F, 0.8216F, -0.2457F, -0.1968F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.2166F, 0.5044F, 1.3326F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 4.5408F, -4.0471F, 0.7349F, 0.0648F, 0.0585F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(84, 36).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2351F, -5.3973F, 0.3106F, -0.3231F, 1.1718F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2351F, -5.3973F, 0.4328F, -0.1857F, 0.6959F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 0).addBox(2.4912F, -1.5298F, -0.4598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2351F, -5.3973F, 0.1606F, -0.4162F, 1.5815F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(45, 62).addBox(2.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9351F, -3.3973F, 0.1484F, -0.2773F, 1.446F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 34).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9351F, -3.3973F, 0.2433F, -0.1999F, 1.0495F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(88, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9351F, -3.3973F, 0.3174F, -0.106F, 0.573F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5351F, -1.3973F, 0.2539F, -0.0765F, 0.5261F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(33, 84).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5351F, -1.3973F, 0.2001F, -0.1446F, 1.0043F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(53, 52).addBox(2.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5351F, -1.3973F, 0.1298F, -0.21F, 1.3978F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(92, 60).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6349F, -5.9994F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 57).addBox(-1.2358F, -2.4026F, -3.4917F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.0F, 5.6099F, -3.8653F, 1.3186F, 0.4848F, 0.4607F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(83, 24).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)), PartPose.offsetAndRotation(3.0098F, 4.7188F, -4.7223F, 1.8858F, 0.4848F, 0.4607F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(34, 76).addBox(-0.5118F, 0.1778F, -0.3804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 4.5408F, -4.0471F, 0.5424F, 0.2457F, 0.1968F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(75, 76).addBox(-0.5582F, 0.583F, -0.8073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 4.5408F, -4.0471F, 0.8216F, 0.2457F, 0.1968F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 50).addBox(0.2166F, 0.5044F, 1.3326F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 4.5408F, -4.0471F, 0.7349F, -0.0648F, -0.0585F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(19, 49).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6349F, -5.9994F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(66, 68).addBox(-0.4391F, -0.6794F, 0.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.481F, 6.9537F, -3.2566F, -0.9886F, -1.0435F, -1.5832F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(22, 85).addBox(-1.0F, -0.8402F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 86).addBox(-1.0F, 0.2598F, 0.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 86).addBox(-1.0F, -0.8402F, 0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(33, 86).addBox(-1.0F, 0.2598F, 0.8232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.6993F, -0.5682F, 2.8784F, -0.5302F, -0.0869F, 0.1515F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(76, 17).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0094F, 0.3F, 1.6399F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5609F, -0.6794F, 0.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.481F, 6.9537F, -3.2566F, -0.9886F, 1.0435F, 1.5832F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(86, 43).addBox(0.0F, -0.8402F, 0.2232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 46).addBox(0.0F, 0.2598F, 0.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(86, 49).addBox(0.0F, -0.8402F, 0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(65, 86).addBox(0.0F, 0.2598F, 0.8232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6993F, -0.5682F, 2.8784F, -0.5302F, 0.0869F, -0.1515F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(18, 76).addBox(0.0F, -1.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0094F, 0.3F, 1.6399F, 0.0F, 0.3054F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9349F, -5.8994F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(0.0F, -0.2734F, -0.547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -1.5F, 0.177F, -0.2159F, 0.5287F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(33, 58).addBox(0.0F, -0.2734F, -0.547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -1.5F, 0.177F, 0.2159F, -0.5287F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(13, 92).addBox(-0.5F, -1.1984F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -1.7F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(60, 62).addBox(-1.0F, -0.2F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.2F, -2.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.7F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r162 = neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(33, 92).addBox(-0.5F, -1.2918F, -0.6851F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -0.4F, -1.2419F, -0.2004F, 0.4388F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3F, -2.4F, -1.1391F, -0.1716F, 0.355F));

		PartDefinition cube_r165 = neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 54).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.4F, -1.2419F, 0.2004F, -0.4388F));

		PartDefinition cube_r166 = neck3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 39).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -2.4F, -1.1391F, 0.1716F, -0.355F));

		PartDefinition cube_r167 = neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 92).addBox(-0.5F, -1.2499F, 0.0629F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3F, -2.0F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.0918F, -3.6851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 92).addBox(-0.5F, -1.6321F, 0.032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -0.7F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(92, 68).addBox(-0.5F, -1.5471F, -0.0282F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9F, -2.3F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9921F, -2.8338F, -0.9745F, -0.1966F, 0.2353F));

		PartDefinition cube_r172 = neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0079F, -1.1338F, -1.1054F, -0.1966F, 0.2353F));

		PartDefinition cube_r173 = neck2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(45, 57).addBox(-0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0079F, -1.1338F, -1.1054F, 0.1966F, -0.2353F));

		PartDefinition cube_r174 = neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(84, 80).addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9921F, -2.8338F, -0.9745F, 0.1966F, -0.2353F));

		PartDefinition cube_r175 = neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(18, 71).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -2.4F, -3.2F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -2.5F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r176 = neck.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(39, 92).addBox(0.0F, -1.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r177 = neck.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(44, 71).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(83, 11).mirror().addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.9F, -0.5476F, -0.2249F, 0.1352F));

		PartDefinition cube_r179 = neck.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(83, 11).addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.9F, -0.5476F, 0.2249F, -0.1352F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(64, 54).addBox(-2.0F, -0.052F, -0.042F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9F, -2.9F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 63).addBox(-2.0F, -3.0119F, -1.97F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.6184F, -1.6359F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 57).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2503F, -0.3625F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(65, 2).addBox(-2.0F, -0.0056F, -0.002F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -2.0F, -0.9F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(87, 67).addBox(0.0F, -0.5881F, -1.6736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 79).addBox(0.0F, -0.9881F, -1.6736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.4F, -5.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(67, 78).addBox(0.0F, -1.5773F, -1.2244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 3.6F, -6.6F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(9, 76).addBox(-2.0F, -0.0282F, 0.0027F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(65, 12).addBox(-2.0F, 0.0295F, 0.0061F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -2.0F, -2.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.4F, 1.3936F, -1.65F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(22, 88).addBox(0.92F, 0.0364F, -0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(17, 85).addBox(0.92F, -0.0374F, -0.0118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9547F, 0.1026F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.42F, -0.359F, 1.4655F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 15).addBox(1.4F, -0.9215F, 0.1299F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.5064F, -2.05F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 23).addBox(1.4F, -0.8895F, -1.7156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.6064F, -2.25F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(71, 61).addBox(1.0F, -0.9523F, -0.7859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 0.8248F, 0.714F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 66).addBox(1.0F, -0.0681F, -1.9954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.9936F, 1.55F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(84, 84).addBox(0.0F, -1.9955F, -0.9414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.4064F, -4.05F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(76, 2).addBox(0.5F, -2.033F, -1.9691F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 2.0064F, -2.15F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 64).addBox(0.6F, 1.5295F, -2.9939F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -3.3936F, -1.25F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(83, 15).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.42F, -1.4281F, 0.8076F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 23).addBox(0.92F, -0.2732F, -0.421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 88).addBox(0.92F, 1.1268F, -0.621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5861F, -1.0683F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(88, 2).addBox(0.92F, -0.3369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(75, 86).addBox(1.26F, -0.2369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 86).addBox(1.15F, -0.2369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 88).addBox(0.92F, 0.2631F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.5861F, -1.0683F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(88, 16).addBox(-0.5F, -0.9226F, -0.3475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 13).addBox(-0.5F, -0.9226F, -0.7475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, -0.4262F, -2.9144F, 0.925F, 0.1571F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(83, 88).addBox(-0.5F, -0.2189F, -0.5654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(88, 10).addBox(-0.5F, -0.2189F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -0.4262F, -2.9144F, 0.2443F, 0.1571F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(12, 85).addBox(-0.5F, -1.1242F, 0.2116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1F, -0.4262F, -2.9144F, 0.4712F, 0.1571F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(60, 78).addBox(0.0F, -0.9799F, -0.072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 80).addBox(0.0F, -1.2799F, -0.072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -0.4936F, -5.35F, -0.7777F, 0.1231F, 0.124F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 48).addBox(-0.6F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6F, 0.2707F, -4.6404F, -0.3614F, 0.0623F, 0.1632F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(27, 75).addBox(0.3F, -0.3138F, -0.1429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, -2.3936F, -2.25F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(89, 38).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.73F, 0.4253F, -5.2179F, -0.1208F, 0.1321F, 0.0712F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 67).addBox(-1.2631F, -2.6903F, 0.5336F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, -1.88F, -4.895F, -1.0261F, 0.1373F, 0.1304F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(82, 77).addBox(-1.7811F, -1.199F, -0.3926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(0, 83).addBox(-1.7811F, -0.799F, -0.3926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3074F, -2.8281F, -2.0345F, -1.0628F, -0.0987F, -0.1516F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(65, 82).addBox(-1.7333F, -1.7756F, -0.3302F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6317F, -1.9319F, -3.1467F, -0.8277F, 0.3255F, 0.2169F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(53, 81).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3675F, -3.1143F, -1.0146F, -1.5173F, -0.0123F, -0.1394F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.4F, 1.3936F, -1.65F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(22, 88).mirror().addBox(-1.92F, 0.0364F, -0.0188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(-1.92F, -0.0374F, -0.0118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9547F, 0.1026F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.42F, -0.359F, 1.4655F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-1.4F, -0.9215F, 0.1299F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.5064F, -2.05F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-1.4F, -0.8895F, -1.7156F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.6064F, -2.25F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-2.0F, -0.9523F, -0.7859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8248F, 0.714F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-2.0F, -0.0681F, -1.9954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.9936F, 1.55F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(-1.0F, -1.9955F, -0.9414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.4064F, -4.05F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-1.5F, -2.033F, -1.9691F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.0064F, -2.15F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-1.6F, 1.5295F, -2.9939F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -3.3936F, -1.25F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.42F, -1.4281F, 0.8076F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-1.92F, -0.2732F, -0.421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 88).mirror().addBox(-1.92F, 1.1268F, -0.621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5861F, -1.0683F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 2).mirror().addBox(-1.92F, -0.3369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(75, 86).mirror().addBox(-2.26F, -0.2369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 86).mirror().addBox(-2.15F, -0.2369F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 88).mirror().addBox(-1.92F, 0.2631F, -0.4495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5861F, -1.0683F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(88, 16).mirror().addBox(-0.5F, -0.9226F, -0.3475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 13).mirror().addBox(-0.5F, -0.9226F, -0.7475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4262F, -2.9144F, 0.925F, -0.1571F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(-0.5F, -0.2189F, -0.5654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(88, 10).mirror().addBox(-0.5F, -0.2189F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4262F, -2.9144F, 0.2443F, -0.1571F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(12, 85).mirror().addBox(-0.5F, -1.1242F, 0.2116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4262F, -2.9144F, 0.4712F, -0.1571F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(60, 78).mirror().addBox(-1.0F, -0.9799F, -0.072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 80).mirror().addBox(-1.0F, -1.2799F, -0.072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.4936F, -5.35F, -0.7777F, -0.1231F, -0.124F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(79, 48).mirror().addBox(-0.4F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2707F, -4.6404F, -0.3614F, -0.0623F, -0.1632F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(-1.3F, -0.3138F, -0.1429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -2.3936F, -2.25F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(89, 38).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.4253F, -5.2179F, -0.1208F, -0.1321F, -0.0712F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(0.2631F, -2.6903F, 0.5336F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.88F, -4.895F, -1.0261F, -0.1373F, -0.1304F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.2189F, -1.199F, -0.3926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(0, 83).mirror().addBox(-0.2189F, -0.799F, -0.3926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3074F, -2.8281F, -2.0345F, -1.0628F, 0.0987F, 0.1516F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.2667F, -1.7756F, -0.3302F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6317F, -1.9319F, -3.1467F, -0.8277F, -0.3255F, -0.2169F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(53, 81).mirror().addBox(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3675F, -3.1143F, -1.0146F, -1.5173F, 0.0123F, 0.1394F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, 1.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(37, 89).mirror().addBox(-0.6F, 0.0305F, 0.08F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 89).addBox(0.6F, 0.0305F, 0.08F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -3.2F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-1.0F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(74, 24).addBox(1.0F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -0.2F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(32, 89).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 89).addBox(0.76F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.63F, 2.1655F, -2.9804F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-1.0F, -0.9478F, -1.0137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(88, 88).addBox(1.0F, -0.9478F, -1.0137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 2.2F, -1.3F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-1.0F, -1.0207F, -1.8724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 44).addBox(1.0F, -1.0207F, -1.8724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1F, 0.2F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(13, 89).mirror().addBox(-1.0F, -0.3323F, -0.9536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(13, 89).addBox(0.2F, -0.3323F, -0.9536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 1.7F, -3.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(21, 81).mirror().addBox(-1.0F, 0.0083F, -2.0312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(21, 81).addBox(0.2F, 0.0083F, -2.0312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, 1.6F, -3.7F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-1.0F, -1.0203F, -0.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(74, 12).addBox(0.2F, -1.0203F, -0.0209F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 3.3F, -5.1F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 26).addBox(0.6F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.0439F, -7.4072F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-0.05F, 0.3968F, -0.9421F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 71).addBox(1.35F, 0.3968F, -0.9421F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, 1.4539F, -5.8983F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-1.4F, -0.8581F, -2.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 79).addBox(-0.4F, -0.8581F, -2.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.1F, -4.7F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-0.7F, -1.0005F, -1.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(87, 60).addBox(-0.5F, -1.0005F, -1.5298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(87, 70).addBox(-0.3F, -1.0005F, -1.0298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 3.3F, -6.9F, -0.3403F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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