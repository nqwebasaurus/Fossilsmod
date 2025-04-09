package fossils.fossils.client.blockentity.model.therizinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TherizinosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
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

	public TherizinosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.9076F, -0.1745F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(151, 3).addBox(0.0F, -3.1804F, -0.4983F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 7.9F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -4.9895F, -0.0265F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5F, -2.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 120).addBox(-0.5F, -6.2F, 0.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1F, -6.1F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 110).mirror().addBox(-0.5F, -3.0506F, 0.0343F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-9.2696F, -2.3813F, -5.7031F, 1.272F, 1.2691F, 0.5215F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(107, 72).mirror().addBox(-0.5F, -3.1F, -1.8F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.9586F, -9.6093F, -4.1405F, 0.0537F, 0.7561F, -0.2374F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-0.5F, -2.2F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7529F, -9.0205F, 1.6899F, -0.7669F, 0.3384F, 0.3596F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(122, 131).mirror().addBox(-0.5F, -0.8753F, -2.5644F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7373F, -5.4164F, 6.7086F, -1.2515F, -0.0333F, 0.7996F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(131, 121).mirror().addBox(-0.2F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3288F, -5.8891F, 4.4287F, -0.147F, -0.1837F, 0.7212F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(116, 84).mirror().addBox(-0.5F, -0.0506F, -3.9657F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-11.6171F, -5.9957F, -6.8967F, 2.2232F, 1.2691F, 0.5215F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 119).mirror().addBox(-0.5F, -2.3971F, -0.5848F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-9.299F, -6.3772F, -6.3304F, 1.9963F, 1.2691F, 0.5215F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, 97).mirror().addBox(-0.2F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0603F, -8.2807F, -5.3538F, 0.66F, 1.1039F, -0.0431F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 54).mirror().addBox(-0.5F, -3.4F, -0.9F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2996F, -9.7079F, -2.4061F, -0.1645F, 0.7561F, -0.2374F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(113, 105).mirror().addBox(-0.5F, -3.5F, -1.9F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7194F, -9.1715F, -0.2917F, -0.4034F, 0.5113F, -0.1196F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(0.828F, 9.8556F, -1.6121F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, -0.4312F, -0.042F, -0.2408F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 125).mirror().addBox(0.828F, 4.916F, 0.1508F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, -0.2742F, -0.042F, -0.2408F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 127).mirror().addBox(0.828F, 4.3467F, 1.4569F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, -0.5883F, -0.042F, -0.2408F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(100, 132).mirror().addBox(-0.0419F, 6.9398F, 3.6166F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, 0.3254F, 0.1942F, -0.2868F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(133, 107).mirror().addBox(-0.0419F, 4.8354F, -1.0994F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, 0.9014F, 0.1942F, -0.2868F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(1.1848F, -1.73F, -2.8987F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, 0.3866F, -0.0302F, -0.1719F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(0.677F, -5.9826F, -4.6055F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 87).addBox(7.677F, -5.9826F, -4.6055F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.677F, -0.6663F, 1.0537F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(122, 102).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6915F, -8.0455F, 2.8281F, -0.636F, 0.3384F, 0.3596F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(113, 131).mirror().addBox(-0.5F, -0.8913F, -0.4338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7373F, -5.4164F, 6.7086F, -1.0333F, -0.0333F, 0.7996F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(108, 49).mirror().addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6512F, -6.2434F, -3.403F, -0.3927F, 0.0867F, 0.1268F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(1.029F, -0.2061F, -9.7335F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 24).mirror().addBox(0.029F, -0.2061F, -2.7335F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -2.8F, 7.0F, -0.3914F, -0.0343F, 0.1768F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5F, -0.2F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3151F, -4.8965F, 5.7448F, -0.1217F, -0.2013F, 0.5891F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(71, 110).addBox(-0.5F, -3.0506F, 0.0343F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.2696F, -2.3813F, -5.7031F, 1.272F, -1.2691F, -0.5215F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(116, 84).addBox(-0.5F, -0.0506F, -3.9657F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(11.6171F, -5.9957F, -6.8967F, 2.2232F, -1.2691F, -0.5215F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 119).addBox(-0.5F, -2.3971F, -0.5848F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.299F, -6.3772F, -6.3304F, 1.9963F, -1.2691F, -0.5215F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 97).addBox(-0.8F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0603F, -8.2807F, -5.3538F, 0.66F, -1.1039F, 0.0431F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(107, 72).addBox(-0.5F, -3.1F, -1.8F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.9586F, -9.6093F, -4.1405F, 0.0537F, -0.7561F, 0.2374F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(23, 54).addBox(-0.5F, -3.4F, -0.9F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2996F, -9.7079F, -2.4061F, -0.1645F, -0.7561F, 0.2374F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(113, 105).addBox(-0.5F, -3.5F, -1.9F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7194F, -9.1715F, -0.2917F, -0.4034F, -0.5113F, 0.1196F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(101, 96).addBox(-1.828F, 9.8556F, -1.6121F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, -0.4312F, 0.042F, 0.2408F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(22, 125).addBox(-1.828F, 4.916F, 0.1508F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, -0.2742F, 0.042F, 0.2408F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 127).addBox(-1.828F, 4.3467F, 1.4569F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, -0.5883F, 0.042F, 0.2408F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(100, 132).addBox(-0.9581F, 6.9398F, 3.6166F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, 0.3254F, -0.1942F, 0.2868F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(133, 107).addBox(-0.9581F, 4.8354F, -1.0994F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, 0.9014F, -0.1942F, 0.2868F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 83).addBox(-2.1848F, -1.73F, -2.8987F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.677F, -0.6663F, 1.0537F, 0.3866F, 0.0302F, 0.1719F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 113).addBox(-0.5F, -2.2F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7529F, -9.0205F, 1.6899F, -0.7669F, -0.3384F, -0.3596F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 102).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6915F, -8.0455F, 2.8281F, -0.636F, -0.3384F, -0.3596F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(122, 131).addBox(-0.5F, -0.8753F, -2.5644F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7373F, -5.4164F, 6.7086F, -1.2515F, 0.0333F, -0.7996F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(113, 131).addBox(-0.5F, -0.8913F, -0.4338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7373F, -5.4164F, 6.7086F, -1.0333F, 0.0333F, -0.7996F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(108, 49).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6512F, -6.2434F, -3.403F, -0.3927F, -0.0867F, -0.1268F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(21, 79).addBox(-5.029F, -0.2061F, -9.7335F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(108, 24).addBox(-5.029F, -0.2061F, -2.7335F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -2.8F, 7.0F, -0.3914F, 0.0343F, -0.1768F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(131, 121).addBox(-0.8F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3288F, -5.8891F, 4.4287F, -0.147F, 0.1837F, -0.7212F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, -0.2F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3151F, -4.8965F, 5.7448F, -0.1217F, 0.2013F, -0.5891F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1F, -6.1F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(91, 50).addBox(-1.0F, -2.7F, -14.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -8.0F, -7.0F, -0.0399F, 0.089F, 0.0399F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(92, 122).addBox(-0.5F, -6.3548F, -1.0824F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 120).addBox(-0.5F, -7.004F, -0.0035F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -5.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 119).addBox(-0.5F, -6.6264F, -0.9848F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -7.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(148, 18).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -10.1087F, -0.0349F, -0.0505F, 0.2671F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(141, 29).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -10.1087F, -0.0265F, 0.0104F, -0.1475F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(141, 27).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -10.1087F, -0.0483F, 0.0812F, -0.6756F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-16.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -10.1087F, -0.0877F, 0.0351F, -1.3296F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-17.2497F, -6.6268F, -0.9947F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -13.1087F, -0.0625F, 0.1368F, -1.3275F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(140, 123).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -13.1087F, 0.0343F, 0.1464F, -0.6662F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(140, 121).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -13.1087F, 0.0771F, 0.0257F, -0.1456F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(127, 44).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.457F, -13.1087F, 0.0664F, -0.0779F, 0.2606F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(124, 121).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -1.4087F, -0.4095F, 0.0679F, 0.2801F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(140, 112).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -1.4087F, -0.4168F, -0.0325F, -0.1268F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(140, 110).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -1.4087F, -0.3644F, -0.1528F, -0.6478F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 54).mirror().addBox(-10.2497F, -6.6268F, -0.9947F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -1.4087F, -0.1996F, -0.3418F, -1.2959F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 122).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -4.6087F, -0.2404F, 0.0233F, 0.3396F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(140, 108).mirror().addBox(-4.7913F, -1.0095F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -4.6087F, -0.2441F, -0.0055F, -0.0783F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(140, 106).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -4.6087F, -0.228F, -0.0427F, -0.6094F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-13.2497F, -6.6268F, -0.9947F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -4.6087F, -0.1562F, -0.1722F, -1.2553F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-15.2497F, -6.6268F, -0.9947F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -7.2087F, -0.1183F, -0.0559F, -1.2596F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(98, 139).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -7.2087F, -0.1279F, 0.0274F, -0.6101F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(132, 138).mirror().addBox(-4.7913F, -1.0095F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -7.2087F, -0.1223F, 0.0041F, -0.0784F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -1.257F, -7.2087F, -0.1252F, -0.0175F, 0.3399F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(124, 121).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -1.4087F, -0.4095F, -0.0679F, -0.2801F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(140, 112).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -1.4087F, -0.4168F, 0.0325F, 0.1268F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(140, 110).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -1.4087F, -0.3644F, 0.1528F, 0.6478F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(108, 54).addBox(3.2497F, -6.6268F, -0.9947F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -1.4087F, -0.1996F, 0.3418F, 1.2959F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(99, 122).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -4.6087F, -0.2404F, -0.0233F, -0.3396F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(140, 108).addBox(1.7913F, -1.0095F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -4.6087F, -0.2441F, 0.0055F, 0.0783F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(140, 106).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -4.6087F, -0.228F, 0.0427F, 0.6094F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(88, 85).addBox(3.2497F, -6.6268F, -0.9947F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -4.6087F, -0.1562F, 0.1722F, 1.2553F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(39, 17).addBox(3.2497F, -6.6268F, -0.9947F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -7.2087F, -0.1183F, 0.0559F, 1.2596F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 139).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -7.2087F, -0.1279F, -0.0274F, 0.6101F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(132, 138).addBox(1.7913F, -1.0095F, -0.617F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -7.2087F, -0.1223F, -0.0041F, 0.0784F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 40).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.257F, -7.2087F, -0.1252F, 0.0175F, -0.3399F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.1628F, -5.1061F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 62).addBox(3.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -10.1087F, -0.0877F, -0.0351F, 1.3296F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(141, 27).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -10.1087F, -0.0483F, -0.0812F, 0.6756F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(141, 29).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -10.1087F, -0.0265F, -0.0104F, 0.1475F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(148, 18).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -10.1087F, -0.0349F, 0.0505F, -0.2671F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 42).addBox(3.2497F, -6.6268F, -0.9947F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -13.1087F, -0.0625F, -0.1368F, 1.3275F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(140, 123).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -13.1087F, 0.0343F, -0.1464F, 0.6662F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(140, 121).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -13.1087F, 0.0771F, -0.0257F, 0.1456F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(127, 44).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -1.457F, -13.1087F, 0.0664F, 0.0779F, -0.2606F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 51).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.9803F, -13.0183F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(33, 36).addBox(-4.0F, -6.0F, -8.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.1628F, -5.1061F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(121, 58).addBox(-0.5F, -6.7353F, -0.0681F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -10.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(59, 121).addBox(-0.5F, -6.3F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -13.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(23, 66).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.5F, -8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -13.9F, -0.0361F, 0.0453F, 0.0414F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(128, 53).addBox(-0.5F, -5.8682F, -0.1375F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2566F, -2.8963F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(117, 137).addBox(-0.5F, -5.1595F, -0.0718F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1566F, -4.9963F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-13.2F, 0.0F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6733F, 13.1019F, -8.9243F, -0.5061F, 0.934F, -0.0737F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-12.2F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6733F, 13.1019F, -8.9243F, -0.5302F, 0.8237F, -0.101F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(106, 38).mirror().addBox(-8.6F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6733F, 13.1019F, -8.9243F, -0.3958F, 0.8823F, 0.0772F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(123, 91).mirror().addBox(-0.4871F, -2.8319F, -0.7763F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.7348F, 6.7646F, -10.3786F, -0.1079F, -0.6024F, -0.2465F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 136).mirror().addBox(-0.4871F, -2.9558F, -1.4248F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.7348F, 6.7646F, -10.3786F, 0.3284F, -0.6024F, -0.2465F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(101, 87).mirror().addBox(-0.8254F, -3.4649F, -0.0654F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-8.6746F, 9.0475F, -7.0243F, 1.0073F, -0.2765F, 0.1452F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(131, 127).mirror().addBox(-0.8254F, -4.8939F, 4.8381F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.6746F, 9.0475F, -7.0243F, 0.7455F, -0.2765F, 0.1452F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(141, 22).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -6.6087F, 0.2625F, 0.3432F, -0.7162F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-16.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -6.6087F, -0.012F, 0.4287F, -1.4191F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(140, 135).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -6.6087F, 0.3662F, 0.0914F, -0.2345F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(147, 118).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -6.6087F, 0.36F, -0.1254F, 0.1247F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-14.2497F, -6.6268F, -0.9947F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -8.5087F, -0.0383F, 0.4884F, -1.6046F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(140, 133).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -8.5087F, 0.2853F, 0.4038F, -0.8817F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(132, 140).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -8.5087F, 0.4133F, 0.1353F, -0.4029F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(147, 103).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, 0.043F, -8.5087F, 0.4195F, -0.1004F, -0.0558F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-16.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, -0.0205F, 0.377F, -1.4224F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(140, 131).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, 0.2211F, 0.3085F, -0.7295F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(140, 129).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, 0.3151F, 0.0791F, -0.2388F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(147, 63).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, 0.3077F, -0.1188F, 0.1311F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-17.2497F, -6.6268F, -0.9947F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -2.0087F, -0.0287F, 0.2723F, -1.3383F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(140, 127).mirror().addBox(-6.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -2.0087F, 0.1462F, 0.2323F, -0.6628F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(140, 125).mirror().addBox(-4.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -2.0087F, 0.2152F, 0.0466F, -0.1583F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(143, 88).mirror().addBox(-2.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.357F, -2.0087F, 0.2022F, -0.1121F, 0.23F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(84, 110).mirror().addBox(-0.5F, -2.5F, -2.3F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8074F, 9.8471F, -11.0284F, 1.8389F, -0.9092F, -1.0001F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 109).mirror().addBox(-0.4871F, -3.3308F, -3.3881F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7348F, 6.7646F, -10.3786F, 0.9829F, -0.6024F, -0.2465F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.8254F, -2.8429F, -0.2156F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-8.6746F, 9.0475F, -7.0243F, 0.9899F, -0.2765F, 0.1452F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(108, 56).mirror().addBox(-6.6F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, 12.286F, -9.4877F, -0.16F, 0.8002F, 0.4115F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(39, 19).addBox(3.2497F, -6.6268F, -0.9947F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -8.5087F, -0.0383F, -0.4884F, 1.6046F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(140, 133).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -8.5087F, 0.2853F, -0.4038F, 0.8817F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(132, 140).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -8.5087F, 0.4133F, -0.1353F, 0.4029F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(147, 103).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, 0.043F, -8.5087F, 0.4195F, 0.1004F, 0.0558F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(147, 118).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -6.6087F, 0.36F, 0.1254F, -0.1247F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(140, 135).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -6.6087F, 0.3662F, -0.0914F, 0.2345F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(70, 14).addBox(3.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -6.6087F, -0.012F, -0.4287F, 1.4191F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(141, 22).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -6.6087F, 0.2625F, -0.3432F, 0.7162F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(70, 12).addBox(3.2497F, -6.6268F, -0.9947F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, -0.0205F, -0.377F, 1.4224F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(140, 131).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, 0.2211F, -0.3085F, 0.7295F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(140, 129).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, 0.3151F, -0.0791F, 0.2388F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(147, 63).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, 0.3077F, 0.1188F, -0.1311F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 44).addBox(3.2497F, -6.6268F, -0.9947F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -2.0087F, -0.0287F, -0.2723F, 1.3383F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(140, 127).addBox(3.6173F, -3.2794F, -0.9947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -2.0087F, 0.1462F, -0.2323F, 0.6628F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(140, 125).addBox(1.7913F, -1.0095F, -0.6169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -2.0087F, 0.2152F, -0.0466F, 0.1583F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(143, 88).addBox(0.047F, -0.2006F, -0.4743F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.357F, -2.0087F, 0.2022F, 0.1121F, -0.23F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(122, 137).addBox(-0.5F, -3.6961F, -2.3884F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1566F, -6.6963F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(112, 137).addBox(-0.5F, -4.3961F, -0.3884F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1566F, -6.6963F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(84, 110).addBox(-0.5F, -2.5F, -2.3F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8074F, 9.8471F, -11.0284F, 1.8389F, 0.9092F, 1.0001F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(123, 91).addBox(-0.5129F, -2.8319F, -0.7763F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.7348F, 6.7646F, -10.3786F, -0.1079F, 0.6024F, 0.2465F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(7, 136).addBox(-0.5129F, -2.9558F, -1.4248F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.7348F, 6.7646F, -10.3786F, 0.3284F, 0.6024F, 0.2465F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 109).addBox(-0.5129F, -3.3308F, -3.3881F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7348F, 6.7646F, -10.3786F, 0.9829F, 0.6024F, 0.2465F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(101, 87).addBox(-0.1746F, -3.4649F, -0.0654F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(8.6746F, 9.0475F, -7.0243F, 1.0073F, 0.2765F, -0.1452F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(131, 127).addBox(-0.1746F, -4.8939F, 4.8381F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.6746F, 9.0475F, -7.0243F, 0.7455F, 0.2765F, -0.1452F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(39, 0).addBox(-0.1746F, -2.8429F, -0.2156F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.6746F, 9.0475F, -7.0243F, 0.9899F, 0.2765F, -0.1452F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(113, 144).addBox(-1.0F, -0.5675F, -4.9405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 24).addBox(-2.0F, -0.5675F, -3.9405F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4874F, -9.0233F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 46).addBox(-0.8F, 0.0F, -0.5F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6733F, 13.1019F, -8.9243F, -0.5061F, -0.934F, 0.0737F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(66, 48).addBox(-0.8F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6733F, 13.1019F, -8.9243F, -0.5302F, -0.8237F, 0.101F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 38).addBox(-0.4F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6733F, 13.1019F, -8.9243F, -0.3958F, -0.8823F, -0.0772F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(108, 56).addBox(-0.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9504F, 12.286F, -9.4877F, -0.16F, -0.8002F, -0.4115F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(62, 62).addBox(-1.0F, -0.1F, -9.8F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.67F, 10.5868F, -7.6405F, -0.9044F, -0.2333F, -1.0074F));

		PartDefinition cube_r157 = leftArm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(80, 130).addBox(-0.8F, -1.0F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4393F, 0.6635F, 3.4606F, -0.4144F, -0.1153F, -0.3762F));

		PartDefinition cube_r158 = leftArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(113, 116).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 10.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(97, 40).addBox(-1.0F, -2.0F, -3.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0496F, 1.2093F, 2.0519F, -0.2359F, -0.0065F, 0.0651F));

		PartDefinition cube_r160 = leftArm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(99, 8).addBox(-1.0F, -0.7F, -2.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, 0.2005F, -0.0065F, 0.0651F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(141, 137).addBox(-0.5F, -1.1F, -1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2306F, 2.3536F, 12.0364F, 0.5678F, -0.3865F, -0.1857F));

		PartDefinition cube_r161 = leftArm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 148).addBox(-0.5F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 8.5524F, 0.1057F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftArm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 148).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 7.3627F, -0.4553F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(148, 43).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 7.3627F, -0.4553F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftArm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(46, 141).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.7F, -1.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(66, 141).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0875F, 1.1626F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftArm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(148, 90).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0875F, 1.1626F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftArm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(96, 147).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7583F, 1.32F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftArm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(15, 83).addBox(-0.5F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9002F, 0.7412F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftArm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(51, 132).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(57, 88).addBox(-0.6F, -1.0F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0438F, 8.9975F, -0.2953F, -0.0433F, 0.0057F, 0.3489F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.6011F, -0.0651F, -0.2986F));

		PartDefinition cube_r170 = leftArm4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(127, 35).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r171 = leftArm4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(128, 62).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r172 = leftArm5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(106, 113).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7941F, 4.8296F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r173 = leftArm5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(125, 0).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 2.0F, 0.4303F, 0.0393F, -0.303F));

		PartDefinition cube_r174 = leftArm6.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(127, 68).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r175 = leftArm6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 12).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.67F, 10.5868F, -7.6405F, -1.432F, 0.5044F, 0.854F));

		PartDefinition cube_r176 = rightArm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(57, 131).addBox(-0.2F, -1.0F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4393F, 0.6635F, 3.4606F, -0.4144F, 0.1153F, 0.3762F));

		PartDefinition cube_r177 = rightArm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 118).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 10.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightArm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(53, 97).addBox(-1.0F, -2.0F, -3.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0496F, 1.2093F, 2.0519F, -0.2359F, 0.0065F, -0.0651F));

		PartDefinition cube_r179 = rightArm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(15, 103).addBox(-1.0F, -0.7F, -2.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, 0.2005F, 0.0065F, -0.0651F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(142, 59).addBox(-0.5F, -1.1F, -1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2306F, 2.3536F, 12.0364F, 0.5332F, 0.2004F, 0.0666F));

		PartDefinition cube_r180 = rightArm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 148).addBox(-0.5F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 8.5524F, 0.1057F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightArm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(148, 74).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 7.3627F, -0.4553F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightArm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(71, 148).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 7.3627F, -0.4553F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightArm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(51, 141).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.7F, -1.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightArm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(98, 141).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.0875F, 1.1626F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightArm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(101, 148).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0875F, 1.1626F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightArm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(106, 147).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7583F, 1.32F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightArm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(143, 43).addBox(-0.5F, -2.9F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9002F, 0.7412F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightArm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(66, 132).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(118, 72).addBox(-0.4F, -1.0F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0438F, 8.9975F, -0.2953F, -0.0433F, -0.0057F, -0.3489F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.6011F, 0.0651F, 0.2986F));

		PartDefinition cube_r189 = rightArm4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(127, 77).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r190 = rightArm4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(71, 130).addBox(0.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r191 = rightArm5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(116, 91).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7941F, 4.8296F, -0.5F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r192 = rightArm5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(125, 21).addBox(0.0F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 2.0F, 0.1249F, -0.0393F, 0.303F));

		PartDefinition cube_r193 = rightArm6.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r194 = rightArm6.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(132, 28).addBox(0.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -9.3F, -0.0961F, 0.0434F, -0.0042F));

		PartDefinition cube_r195 = neck5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(67, 76).addBox(-1.0F, 0.1F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.1F, -5.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(138, 104).mirror().addBox(-2.9988F, -0.1251F, -0.7108F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9131F, -0.257F, -1.6087F, 0.4841F, 0.2465F, -0.4559F));

		PartDefinition cube_r197 = neck5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(134, 25).mirror().addBox(-5.5069F, -1.6151F, -0.9602F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9131F, -0.257F, -1.6087F, 0.2964F, 0.5345F, -0.9431F));

		PartDefinition cube_r198 = neck5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-13.4466F, -3.5655F, -1.1259F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9131F, -0.257F, -1.6087F, -0.0059F, 0.6014F, -1.4089F));

		PartDefinition cube_r199 = neck5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(108, 124).mirror().addBox(-0.6634F, -1.895F, -2.0612F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, -0.8553F, -5.8119F, 0.9154F, -0.2815F, 0.0888F));

		PartDefinition cube_r200 = neck5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(146, 137).mirror().addBox(-0.4908F, 1.3145F, -0.9633F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, -0.8553F, -5.8119F, 0.6107F, -0.2431F, 0.1684F));

		PartDefinition cube_r201 = neck5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 149).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2215F, -0.489F, -6.7767F, 1.5551F, -0.2602F, 0.2952F));

		PartDefinition cube_r202 = neck5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(147, 148).mirror().addBox(-0.3566F, -1.7755F, -1.2385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, -0.8553F, -5.8119F, 1.686F, -0.2961F, 0.2592F));

		PartDefinition cube_r203 = neck5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(141, 90).mirror().addBox(-0.4992F, -0.8043F, -1.755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(151, 138).mirror().addBox(-0.4992F, -1.3043F, -1.455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, -0.8553F, -5.8119F, 2.0862F, -0.2265F, 0.1665F));

		PartDefinition cube_r204 = neck5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(151, 135).mirror().addBox(-0.5769F, -1.3414F, -1.9735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(131, 151).mirror().addBox(-0.5769F, -1.3414F, -2.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, -0.8553F, -5.8119F, 2.0921F, -0.1812F, 0.0908F));

		PartDefinition cube_r205 = neck5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(145, 100).mirror().addBox(-1.2413F, -1.0993F, -2.5947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -2.0356F, -5.1303F, 1.4158F, -0.0258F, -0.1638F));

		PartDefinition cube_r206 = neck5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(143, 71).mirror().addBox(-1.5791F, -0.4693F, -0.3593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1739F, -1.6772F, -5.7344F, 1.7493F, -0.1548F, -1.3071F));

		PartDefinition cube_r207 = neck5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(142, 114).mirror().addBox(-0.6903F, -1.4693F, 0.5316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -1.4356F, -5.4303F, 1.4102F, 0.1091F, 0.6036F));

		PartDefinition cube_r208 = neck5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(20, 149).mirror().addBox(-0.3374F, -0.5222F, -0.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1739F, -1.6772F, -5.7344F, 1.5971F, -0.2034F, -0.6386F));

		PartDefinition cube_r209 = neck5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(145, 100).addBox(-0.7587F, -1.0993F, -2.5947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -2.0356F, -5.1303F, 1.4158F, 0.0258F, 0.1638F));

		PartDefinition cube_r210 = neck5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(143, 71).addBox(-0.4209F, -0.4693F, -0.3593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1739F, -1.6772F, -5.7344F, 1.7493F, 0.1548F, 1.3071F));

		PartDefinition cube_r211 = neck5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(142, 114).addBox(-0.3097F, -1.4693F, 0.5316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -1.4356F, -5.4303F, 1.4102F, -0.1091F, -0.6036F));

		PartDefinition cube_r212 = neck5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(20, 149).addBox(-0.6626F, -0.5222F, -0.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1739F, -1.6772F, -5.7344F, 1.5971F, 0.2034F, 0.6386F));

		PartDefinition cube_r213 = neck5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(131, 151).addBox(-0.4231F, -1.3414F, -2.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(151, 135).addBox(-0.4231F, -1.3414F, -1.9735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5839F, -0.8553F, -5.8119F, 2.0921F, 0.1812F, -0.0908F));

		PartDefinition cube_r214 = neck5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(151, 138).addBox(-0.5008F, -1.3043F, -1.455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(141, 90).addBox(-0.5008F, -0.8043F, -1.755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, -0.8553F, -5.8119F, 2.0862F, 0.2265F, -0.1665F));

		PartDefinition cube_r215 = neck5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(147, 148).addBox(-0.6434F, -1.7755F, -1.2385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, -0.8553F, -5.8119F, 1.686F, 0.2961F, -0.2592F));

		PartDefinition cube_r216 = neck5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 149).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2215F, -0.489F, -6.7767F, 1.5551F, 0.2602F, -0.2952F));

		PartDefinition cube_r217 = neck5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(146, 137).addBox(-0.5092F, 1.3145F, -0.9633F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, -0.8553F, -5.8119F, 0.6107F, 0.2431F, -0.1684F));

		PartDefinition cube_r218 = neck5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(108, 124).addBox(-0.3366F, -1.895F, -2.0612F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, -0.8553F, -5.8119F, 0.9154F, 0.2815F, -0.0888F));

		PartDefinition cube_r219 = neck5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(131, 99).addBox(0.0F, -3.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8164F, -4.6381F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(68, 147).addBox(0.0F, -4.2202F, -0.0982F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(91, 60).addBox(4.4466F, -3.5655F, -1.1259F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9131F, -0.257F, -1.6087F, -0.0059F, -0.6014F, 1.4089F));

		PartDefinition cube_r222 = neck5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(134, 25).addBox(2.5069F, -1.6151F, -0.9602F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9131F, -0.257F, -1.6087F, 0.2964F, -0.5345F, 0.9431F));

		PartDefinition cube_r223 = neck5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(138, 104).addBox(-0.0012F, -0.1251F, -0.7108F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9131F, -0.257F, -1.6087F, 0.4841F, -0.2465F, 0.4559F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0335F, -7.9736F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(121, 151).mirror().addBox(-0.7F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(116, 151).mirror().addBox(-0.7F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 1.0302F, -1.0346F, 2.3582F, -0.1985F, 0.0403F));

		PartDefinition cube_r225 = neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(111, 151).mirror().addBox(-0.5873F, -0.6562F, -0.8368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 151).mirror().addBox(-0.5873F, -0.1562F, -1.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, 0.5783F, -1.6383F, 2.3536F, -0.2616F, 0.1015F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(142, 148).mirror().addBox(-0.5018F, -1.093F, -0.5368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 146).mirror().addBox(-0.5018F, -1.993F, 0.0632F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5839F, 0.5783F, -1.6383F, 1.9559F, -0.3525F, 0.1727F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 145).mirror().addBox(-1.3515F, -2.4077F, -0.7002F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7523F, 2.2507F, 1.1935F, 0.8792F, -0.2782F, 0.0988F));

		PartDefinition cube_r228 = neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(145, 97).mirror().addBox(-1.2413F, -1.0993F, -2.0947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -0.8567F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r229 = neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(149, 142).mirror().addBox(-0.3889F, -1.0582F, -0.0742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.002F, -0.8567F, 1.5107F, -0.2371F, -1.18F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(66, 121).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7523F, 1.3507F, -1.7065F, 1.1882F, -0.2946F, 0.0109F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(91, 142).mirror().addBox(-0.6903F, -1.4693F, 0.5316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.502F, -2.8567F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(148, 31).mirror().addBox(-0.3223F, -1.1253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -0.002F, -0.8567F, 1.3592F, -0.1231F, -0.5192F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(143, 0).mirror().addBox(-0.445F, -1.2839F, 0.1637F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.948F, -2.3091F, -6.8839F, 1.3739F, 0.1338F, 0.5992F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(143, 40).mirror().addBox(-0.385F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5659F, -1.1304F, -6.1293F, 1.5828F, -0.3707F, -0.9259F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(144, 56).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5659F, -1.1304F, -6.1293F, 1.8464F, -0.2935F, -1.6202F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(145, 94).mirror().addBox(-1.3246F, -1.1302F, -1.8281F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.948F, -1.1091F, -5.4839F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(107, 135).mirror().addBox(-0.5F, -3.3F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.896F, 0.1724F, -5.6761F, 1.214F, -0.2154F, -0.0203F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(145, 97).addBox(-0.7587F, -1.0993F, -2.0947F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -0.8567F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(149, 142).addBox(-0.6111F, -1.0582F, -0.0742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9586F, -0.002F, -0.8567F, 1.5107F, 0.2371F, 1.18F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(85, 145).addBox(0.3515F, -2.4077F, -0.7002F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7523F, 2.2507F, 1.1935F, 0.8792F, 0.2782F, -0.0988F));

		PartDefinition cube_r241 = neck4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(111, 151).addBox(-0.4127F, -0.6562F, -0.8368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 151).addBox(-0.4127F, -0.1562F, -1.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, 0.5783F, -1.6383F, 2.3536F, 0.2616F, -0.1015F));

		PartDefinition cube_r242 = neck4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(121, 151).addBox(-0.3F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(116, 151).addBox(-0.3F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.6343F, 1.0302F, -1.0346F, 2.3582F, 0.1985F, -0.0403F));

		PartDefinition cube_r243 = neck4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(142, 148).addBox(-0.4982F, -1.093F, -0.5368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 146).addBox(-0.4982F, -1.993F, 0.0632F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5839F, 0.5783F, -1.6383F, 1.9559F, 0.3525F, -0.1727F));

		PartDefinition cube_r244 = neck4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(66, 121).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7523F, 1.3507F, -1.7065F, 1.1882F, 0.2946F, -0.0109F));

		PartDefinition cube_r245 = neck4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(91, 142).addBox(-0.3097F, -1.4693F, 0.5316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -0.502F, -2.8567F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(148, 31).addBox(-0.6777F, -1.1253F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9586F, -0.002F, -0.8567F, 1.3592F, 0.1231F, 0.5192F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(141, 12).addBox(0.0F, -1.4F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7621F, -1.3898F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(91, 136).addBox(0.0F, -1.3F, -1.1F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3111F, -6.2738F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(143, 0).addBox(-0.555F, -1.2839F, 0.1637F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.948F, -2.3091F, -6.8839F, 1.3739F, -0.1338F, -0.5992F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(143, 40).addBox(-1.615F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5659F, -1.1304F, -6.1293F, 1.5828F, 0.3707F, 0.9259F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(144, 56).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5659F, -1.1304F, -6.1293F, 1.8464F, 0.2935F, 1.6202F));

		PartDefinition cube_r252 = neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(145, 94).addBox(-0.6754F, -1.1302F, -1.8281F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.948F, -1.1091F, -5.4839F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r253 = neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(107, 135).addBox(-0.5F, -3.3F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.896F, 0.1724F, -5.6761F, 1.214F, 0.2154F, 0.0203F));

		PartDefinition cube_r254 = neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.8417F, -8.8835F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.4F, -0.2705F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7759F, -8.072F, 0.2998F, 0.1707F, 0.0366F));

		PartDefinition cube_r255 = neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.0286F, -8.5275F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(127, 138).addBox(0.0F, -1.1F, 0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1482F, -2.6393F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-0.7343F, -3.7498F, 0.2329F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -2.0768F, -1.6112F, 1.0316F, 0.3439F, 0.517F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(123, 99).mirror().addBox(-0.135F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5813F, -1.6083F, -2.6744F, 1.3078F, -0.6037F, -0.8453F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(143, 68).mirror().addBox(-1.4291F, -0.4694F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5813F, -1.6083F, -2.6744F, 1.8255F, -0.6289F, -1.6604F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(78, 145).mirror().addBox(-1.1857F, -3.0966F, -0.8774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 0.4232F, -0.9111F, 0.9838F, -0.0924F, -0.1379F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(76, 136).mirror().addBox(-0.5F, -3.0F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8197F, -0.292F, -2.6487F, 0.9093F, -0.142F, 0.0168F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 136).mirror().addBox(-0.5F, -3.0F, -1.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8807F, -3.7683F, -6.1039F, 0.8652F, -0.1411F, 0.023F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.385F, -0.4248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -4.9258F, -6.6072F, 1.1856F, -0.4892F, -0.8078F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(71, 145).mirror().addBox(-0.6877F, -1.1049F, -1.7581F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4822F, -4.7055F, -6.4554F, 1.2434F, -0.0538F, -0.1569F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(143, 79).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -4.9258F, -6.6072F, 1.6345F, -0.6226F, -1.5745F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(143, 6).mirror().addBox(-0.7451F, -4.6984F, 0.2446F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.8768F, -4.2112F, 1.0316F, 0.3439F, 0.517F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 137).addBox(-0.2657F, -3.7498F, 0.2329F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -2.0768F, -1.6112F, 1.0316F, -0.3439F, -0.517F));

		PartDefinition cube_r268 = neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(123, 99).addBox(-1.865F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5813F, -1.6083F, -2.6744F, 1.3078F, 0.6037F, 0.8453F));

		PartDefinition cube_r269 = neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(143, 68).addBox(-0.5709F, -0.4694F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5813F, -1.6083F, -2.6744F, 1.8255F, 0.6289F, 1.6604F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(78, 145).addBox(-0.8143F, -3.0966F, -0.8774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 0.4232F, -0.9111F, 0.9838F, 0.0924F, 0.1379F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(76, 136).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8197F, -0.292F, -2.6487F, 0.9093F, 0.142F, -0.0168F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(71, 136).addBox(-0.5F, -3.0F, -1.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8807F, -3.7683F, -6.1039F, 0.8652F, 0.1411F, -0.023F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(45, 103).addBox(-1.615F, -0.4248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4946F, -4.9258F, -6.6072F, 1.1856F, 0.4892F, 0.8078F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(71, 145).addBox(-1.3123F, -1.1049F, -1.7581F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4822F, -4.7055F, -6.4554F, 1.2434F, 0.0538F, 0.1569F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(143, 79).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4946F, -4.9258F, -6.6072F, 1.6345F, 0.6226F, 1.5745F));

		PartDefinition cube_r276 = neck3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(143, 6).addBox(-0.2549F, -4.6984F, 0.2446F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -3.8768F, -4.2112F, 1.0316F, -0.3439F, -0.517F));

		PartDefinition cube_r277 = neck3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(143, 74).addBox(0.0F, -1.3F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7673F, -6.1662F, -0.6196F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0141F, -9.7104F, -0.1567F, 0.0099F, 0.0867F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0275F, -6.9742F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(56, 137).mirror().addBox(-0.6213F, 0.2015F, 0.0917F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.6009F, -3.0083F, 0.9992F, 0.361F, 0.5058F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(143, 24).mirror().addBox(-0.385F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -1.1081F, -0.4508F, 1.2183F, -0.5829F, -0.7387F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(144, 48).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -1.1081F, -0.4508F, 1.7427F, -0.6686F, -1.5538F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(81, 136).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7534F, 0.6328F, -0.8926F, 0.61F, -0.1308F, 0.0578F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(146, 15).mirror().addBox(-1.2455F, 1.8447F, -1.7351F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -2.4009F, -2.3083F, 0.949F, -0.0972F, -0.1346F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(146, 12).mirror().addBox(-1.2118F, -3.5002F, -1.3332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -2.0008F, -2.0083F, 0.949F, -0.0972F, -0.1346F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(143, 85).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -4.0154F, -4.3546F, 1.7903F, -0.6683F, -1.6058F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(141, 31).mirror().addBox(-0.385F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -4.0154F, -4.3546F, 1.2494F, -0.6101F, -0.7786F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(138, 5).mirror().addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5235F, -5.2522F, -3.8055F, 0.9463F, 0.3622F, 0.524F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(137, 59).mirror().addBox(-0.6888F, -4.8359F, -1.1139F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, -0.9519F, -2.3252F, 0.7419F, -0.1372F, 0.0401F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(48, 147).mirror().addBox(-0.6926F, -0.868F, -1.8026F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4517F, -6.0304F, -6.9421F, 1.3986F, -0.0287F, -0.1633F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(143, 82).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3659F, -6.3724F, -7.3388F, 1.7066F, -0.4313F, -1.6156F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(143, 34).mirror().addBox(-0.385F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3659F, -6.3724F, -7.3388F, 1.3794F, -0.3903F, -0.8954F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(43, 147).mirror().addBox(-0.3038F, -1.5534F, -0.1033F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9099F, -7.4745F, -7.1854F, 1.0154F, 0.3525F, 0.5115F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 136).mirror().addBox(-0.5F, -2.9F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7387F, -4.5338F, -6.8748F, 0.8036F, -0.1394F, 0.0316F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(146, 15).addBox(-0.7545F, 1.8447F, -1.7351F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -2.4009F, -2.3083F, 0.949F, 0.0972F, 0.1346F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(81, 136).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7534F, 0.6328F, -0.8926F, 0.61F, 0.1308F, -0.0578F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(144, 48).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4659F, -1.1081F, -0.4508F, 1.7427F, 0.6686F, 1.5538F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(143, 24).addBox(-1.615F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4659F, -1.1081F, -0.4508F, 1.2183F, 0.5829F, 0.7387F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(134, 18).addBox(0.0F, -1.0F, -0.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.192F, 0.3344F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(56, 137).addBox(-0.3787F, 0.2015F, 0.0917F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -3.6009F, -3.0083F, 0.9992F, -0.361F, -0.5058F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(146, 12).addBox(-0.7882F, -3.5002F, -1.3332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -2.0008F, -2.0083F, 0.949F, 0.0972F, 0.1346F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(18, 134).addBox(0.0F, -1.6132F, -0.0165F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5218F, -3.7487F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r302 = neck2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(143, 85).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4659F, -4.0154F, -4.3546F, 1.7903F, 0.6683F, 1.6058F));

		PartDefinition cube_r303 = neck2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(141, 31).addBox(-1.615F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4659F, -4.0154F, -4.3546F, 1.2494F, 0.6101F, 0.7786F));

		PartDefinition cube_r304 = neck2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(138, 5).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5235F, -5.2522F, -3.8055F, 0.9463F, -0.3622F, -0.524F));

		PartDefinition cube_r305 = neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(137, 59).addBox(-0.3112F, -4.8359F, -1.1139F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, -0.9519F, -2.3252F, 0.7419F, 0.1372F, -0.0401F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(48, 147).addBox(-1.3074F, -0.868F, -1.8026F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4517F, -6.0304F, -6.9421F, 1.3986F, 0.0287F, 0.1633F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(22, 119).addBox(0.0F, -1.4574F, 0.0606F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.7437F, -7.3258F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(143, 82).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3659F, -6.3724F, -7.3388F, 1.7066F, 0.4313F, 1.6156F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(143, 34).addBox(-1.615F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3659F, -6.3724F, -7.3388F, 1.3794F, 0.3903F, 0.8954F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(43, 147).addBox(-0.6962F, -1.5534F, -0.1033F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9099F, -7.4745F, -7.1854F, 1.0154F, -0.3525F, -0.5115F));

		PartDefinition cube_r311 = neck2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(86, 136).addBox(-0.5F, -2.9F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7387F, -4.5338F, -6.8748F, 0.8036F, 0.1394F, -0.0316F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5711F, -8.7081F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r312 = neck.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(127, 144).mirror().addBox(-0.4362F, -1.796F, 0.0871F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, -0.8915F, -0.9467F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r313 = neck.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(121, 35).mirror().addBox(-0.135F, -0.5248F, -0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3813F, -0.7557F, -2.2494F, 1.3592F, -0.1231F, -0.6589F));

		PartDefinition cube_r314 = neck.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(106, 144).mirror().addBox(-1.4291F, -0.4693F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3813F, -0.7557F, -2.2494F, 1.5107F, -0.2371F, -1.3196F));

		PartDefinition cube_r315 = neck.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(61, 137).mirror().addBox(-0.5F, -2.3F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7607F, 0.9413F, -1.952F, 0.9115F, -0.1422F, -0.0145F));

		PartDefinition cube_r316 = neck.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 145).mirror().addBox(-1.3024F, -1.1638F, -1.774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, -0.5915F, -1.4467F, 1.3297F, -0.0399F, -0.161F));

		PartDefinition cube_r317 = neck.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(29, 145).mirror().addBox(-1.2954F, -0.8564F, -1.632F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, -1.5323F, -4.9271F, 1.3728F, -0.0329F, -0.1625F));

		PartDefinition cube_r318 = neck.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(138, 83).mirror().addBox(-1.3909F, -0.7189F, -1.7446F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, -1.5323F, -4.9271F, 1.0429F, -0.1414F, -0.0208F));

		PartDefinition cube_r319 = neck.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(120, 144).mirror().addBox(-1.4291F, -0.4693F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2813F, -1.6421F, -5.3133F, 1.5085F, -0.282F, -1.3536F));

		PartDefinition cube_r320 = neck.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(132, 96).mirror().addBox(-0.135F, -0.5248F, -0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2813F, -1.6421F, -5.3133F, 1.3296F, -0.1572F, -0.6893F));

		PartDefinition cube_r321 = neck.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(144, 143).mirror().addBox(-0.4666F, -1.4903F, 0.1316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9115F, -1.8323F, -4.1271F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r322 = neck.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(10, 145).addBox(-0.6976F, -1.1638F, -1.774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9115F, -0.5915F, -1.4467F, 1.3297F, 0.0399F, 0.161F));

		PartDefinition cube_r323 = neck.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(61, 137).addBox(-0.5F, -2.3F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7607F, 0.9413F, -1.952F, 0.9115F, 0.1422F, 0.0145F));

		PartDefinition cube_r324 = neck.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(106, 144).addBox(-0.5709F, -0.4693F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3813F, -0.7557F, -2.2494F, 1.5107F, 0.2371F, 1.3196F));

		PartDefinition cube_r325 = neck.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(121, 35).addBox(-0.865F, -0.5248F, -0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3813F, -0.7557F, -2.2494F, 1.3592F, 0.1231F, 0.6589F));

		PartDefinition cube_r326 = neck.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(127, 144).addBox(-0.5638F, -1.796F, 0.0871F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9115F, -0.8915F, -0.9467F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r327 = neck.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(152, 57).addBox(0.0F, -0.7F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.929F, -0.905F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(29, 145).addBox(-0.7046F, -0.8564F, -1.632F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9115F, -1.5323F, -4.9271F, 1.3728F, 0.0329F, 0.1625F));

		PartDefinition cube_r329 = neck.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(138, 83).addBox(0.3909F, -0.7189F, -1.7446F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9115F, -1.5323F, -4.9271F, 1.0429F, 0.1414F, 0.0208F));

		PartDefinition cube_r330 = neck.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(120, 144).addBox(-0.5709F, -0.4693F, -0.4593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2813F, -1.6421F, -5.3133F, 1.5085F, 0.282F, 1.3536F));

		PartDefinition cube_r331 = neck.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(132, 96).addBox(-0.865F, -0.5248F, -0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2813F, -1.6421F, -5.3133F, 1.3296F, 0.1572F, 0.6893F));

		PartDefinition cube_r332 = neck.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(95, 110).addBox(-0.9115F, -1.5212F, -0.7981F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9115F, -1.8323F, -4.1271F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(144, 143).addBox(-0.5334F, -1.4903F, 0.1316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9115F, -1.8323F, -4.1271F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r334 = neck.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(46, 66).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.2F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(83, 101).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0601F, -5.2093F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r335 = neck6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(143, 37).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.079F, 0.3266F, -4.6607F, 1.6958F, -0.0193F, -0.8088F));

		PartDefinition cube_r336 = neck6.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(56, 145).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6645F, 0.9352F, -4.6204F, 1.6137F, -0.0079F, 0.1831F));

		PartDefinition cube_r337 = neck6.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.8F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2733F, 1.3204F, -4.2856F, 0.9926F, -0.1322F, -0.0546F));

		PartDefinition cube_r338 = neck6.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(5, 143).mirror().addBox(-0.1597F, -2.4214F, -0.3157F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.6997F, -1.7491F, 1.5751F, -0.0058F, 0.6121F));

		PartDefinition cube_r339 = neck6.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(116, 102).mirror().addBox(-0.8792F, -0.8763F, -0.7926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1054F, -0.7997F, -2.9491F, 1.6084F, 0.0221F, -0.5319F));

		PartDefinition cube_r340 = neck6.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(142, 65).mirror().addBox(-2.3415F, -0.8478F, -0.4046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1054F, -0.7997F, -2.9491F, 1.6191F, 0.03F, -1.1913F));

		PartDefinition cube_r341 = neck6.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(24, 143).mirror().addBox(-0.6F, -1.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8733F, 1.4204F, -2.8856F, 0.9926F, -0.1322F, -0.0546F));

		PartDefinition cube_r342 = neck6.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(36, 145).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.0352F, -3.2204F, 1.6137F, -0.0079F, 0.1831F));

		PartDefinition cube_r343 = neck6.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(5, 143).addBox(-0.8403F, -2.4214F, -0.3157F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.6997F, -1.7491F, 1.5751F, 0.0058F, -0.6121F));

		PartDefinition cube_r344 = neck6.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(19, 152).addBox(-0.9054F, -1.861F, -0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.4997F, -5.2491F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck6.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(22, 152).addBox(-0.9054F, -0.7324F, -1.2529F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.6997F, -1.7491F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck6.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 145).addBox(-0.2F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2733F, 1.3204F, -4.2856F, 0.9926F, 0.1322F, 0.0546F));

		PartDefinition cube_r347 = neck6.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(56, 145).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6645F, 0.9352F, -4.6204F, 1.6137F, 0.0079F, -0.1831F));

		PartDefinition cube_r348 = neck6.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(143, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.079F, 0.3266F, -4.6607F, 1.6958F, 0.0193F, 0.8088F));

		PartDefinition cube_r349 = neck6.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(116, 102).addBox(-0.1208F, -0.8763F, -0.7926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1054F, -0.7997F, -2.9491F, 1.6084F, -0.0221F, 0.5319F));

		PartDefinition cube_r350 = neck6.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(142, 65).addBox(0.3415F, -0.8478F, -0.4046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1054F, -0.7997F, -2.9491F, 1.6191F, -0.03F, 1.1913F));

		PartDefinition cube_r351 = neck6.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(24, 143).addBox(-0.4F, -1.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8733F, 1.4204F, -2.8856F, 0.9926F, 0.1322F, 0.0546F));

		PartDefinition cube_r352 = neck6.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(36, 145).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2645F, 1.0352F, -3.2204F, 1.6137F, 0.0079F, -0.1831F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5552F, -5.7707F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(37, 148).mirror().addBox(-0.9F, -0.4636F, -0.4102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(37, 148).addBox(-0.5F, -0.4636F, -0.4102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.5F, -9.6F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(144, 51).mirror().addBox(-1.1F, -0.0281F, -0.5419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(144, 51).addBox(-0.3F, -0.0281F, -0.5419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.1469F, -8.6963F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(150, 83).addBox(-1.2F, 0.0421F, -0.863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, -0.6799F, -11.3862F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(111, 84).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4154F, -0.2076F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(118, 81).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9298F, -0.7773F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(114, 46).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.328F, 0.0213F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(114, 13).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4185F, -0.4612F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(124, 116).addBox(-1.0F, -0.0791F, -0.0567F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -1.6F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(40, 132).addBox(-1.0F, 1.4788F, -1.9937F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(127, 86).addBox(-1.0F, -0.0212F, -1.9937F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.1936F, -3.6132F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(89, 132).addBox(-1.0F, -0.0212F, 0.0063F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.1936F, -3.6132F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(112, 58).addBox(-1.0F, -0.3532F, -0.2455F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(151, 54).addBox(-0.5F, 0.0281F, -2.1301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(32, 136).addBox(-0.5F, 0.0281F, -1.7301F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4059F, -9.2881F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 116).addBox(-1.5F, -1.2F, -1.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0233F, -2.1212F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(41, 136).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6919F, -5.354F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(132, 142).addBox(-1.0F, -1.9F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6865F, -4.4485F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(29, 132).addBox(-1.0F, -1.2562F, -0.9742F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.6741F, -2.482F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(127, 7).addBox(-1.0F, -2.02F, -1.9545F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.3437F, -3.311F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(60, 106).addBox(-1.0F, -0.92F, -0.8545F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.3462F, -2.4055F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.2F, -0.0052F, -1.304F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(137, 148).addBox(0.42F, -1.4F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(84, 150).addBox(0.93F, -1.3173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(149, 120).addBox(0.93F, -0.9173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.5848F, -1.6167F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(149, 65).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.83F, -0.4943F, -3.3165F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(149, 105).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.83F, 0.6647F, -2.6334F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(150, 86).addBox(0.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -0.5236F, -0.9375F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(151, 0).addBox(0.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.6F, -1.496F, -1.1709F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(32, 148).addBox(-0.1F, -0.0466F, 0.008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.8666F, -4.8759F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(63, 147).addBox(0.93F, -2.2173F, -2.4874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5052F, -0.796F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(149, 108).addBox(-0.705F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(149, 111).addBox(-0.495F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.945F, -1.0294F, -2.2966F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(147, 59).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.83F, -0.5936F, -2.5418F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(149, 123).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.83F, -0.4943F, -3.3165F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(151, 47).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5F, -0.257F, -5.4328F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(149, 51).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.277F, -4.5651F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(63, 151).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.5F, -1.1622F, -4.7362F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(151, 8).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.5F, -0.257F, -5.4328F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(95, 151).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.5F, -0.7032F, -4.5379F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(149, 145).addBox(-1.0F, 0.0927F, 0.1531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.2052F, -10.396F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(121, 68).addBox(-0.27F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.1F, -1.0702F, -8.3357F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(93, 8).addBox(-0.27F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 0.0295F, -9.6436F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 150).addBox(-1.0F, -0.4275F, -0.1253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.7052F, -9.096F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(111, 147).addBox(-0.1F, -0.4636F, -0.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5052F, -8.296F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(14, 141).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 2.2674F, 0.163F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(139, 143).addBox(0.1F, -0.0281F, -0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 0.1522F, -7.3923F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(132, 91).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.8382F, -5.7901F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(138, 96).addBox(-0.1F, 0.0534F, 0.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, -1.8094F, -6.8776F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2F, -0.0052F, -1.304F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(137, 148).mirror().addBox(-1.42F, -1.4F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(84, 150).mirror().addBox(-1.93F, -1.3173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(149, 120).mirror().addBox(-1.93F, -0.9173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.5848F, -1.6167F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(149, 65).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.4943F, -3.3165F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(149, 105).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.83F, 0.6647F, -2.6334F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(150, 86).mirror().addBox(-1.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.5236F, -0.9375F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(151, 0).mirror().addBox(-1.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.496F, -1.1709F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(32, 148).mirror().addBox(-0.9F, -0.0466F, 0.008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.8666F, -4.8759F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(63, 147).mirror().addBox(-1.93F, -2.2173F, -2.4874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.5052F, -0.796F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(149, 108).mirror().addBox(-0.295F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(149, 111).mirror().addBox(-0.505F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.945F, -1.0294F, -2.2966F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(147, 59).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.5936F, -2.5418F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(149, 123).mirror().addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.4943F, -3.3165F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(151, 47).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.257F, -5.4328F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(149, 51).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.277F, -4.5651F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(63, 151).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1622F, -4.7362F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(151, 8).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.257F, -5.4328F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(95, 151).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7032F, -4.5379F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(149, 145).mirror().addBox(0.0F, 0.0927F, 0.1531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2052F, -10.396F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(121, 68).mirror().addBox(-0.73F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.0702F, -8.3357F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(-0.73F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0295F, -9.6436F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.0F, -0.4275F, -0.1253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7052F, -9.096F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(111, 147).mirror().addBox(-0.9F, -0.4636F, -0.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5052F, -8.296F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(14, 141).mirror().addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2674F, 0.163F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(139, 143).mirror().addBox(-1.1F, -0.0281F, -0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.1522F, -7.3923F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(132, 91).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8382F, -5.7901F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(138, 96).mirror().addBox(-0.9F, 0.0534F, 0.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.8094F, -6.8776F, 0.0785F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9043F, -0.9921F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(135, 54).mirror().addBox(-0.347F, -0.7214F, -0.2318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2843F, 1.4704F, -1.158F, 0.3543F, -0.0287F, 0.1486F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(138, 100).mirror().addBox(-0.3965F, -0.6912F, -0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3844F, -3.5635F, -0.1826F, -0.4015F, 0.0963F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(39, 141).mirror().addBox(-0.647F, -0.5213F, -0.2318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.4103F, -2.4847F, 0.0644F, -0.1922F, 0.0872F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(149, 132).mirror().addBox(-0.5F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(149, 129).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(149, 126).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(149, 129).addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(149, 132).addBox(-0.1F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(149, 126).addBox(-0.1F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 3.0933F, -8.4387F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(32, 141).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(32, 141).addBox(1.3F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.4F, 0.8944F, -1.0571F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(150, 39).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(150, 39).addBox(1.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 0.3793F, -0.2F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(134, 44).mirror().addBox(-1.0F, 0.0055F, -2.9722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(134, 44).addBox(0.8F, 0.0055F, -2.9722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9F, -0.7991F, -1.635F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(150, 23).mirror().addBox(-1.0F, -0.2932F, -0.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(150, 23).addBox(0.8F, -0.2932F, -0.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.5F, -1.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(121, 147).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(121, 147).addBox(1.2F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.652F, -8.6353F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(116, 147).mirror().addBox(0.0F, 0.0152F, -0.0092F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 147).addBox(1.2F, 0.0152F, -0.0092F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.3153F, -7.9428F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(126, 149).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(126, 149).addBox(-0.1F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.644F, -6.9764F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(134, 39).mirror().addBox(-0.3F, -1.1709F, -0.0663F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(134, 39).addBox(0.5F, -1.1709F, -0.0663F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1F, 2.0819F, -6.4026F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(147, 114).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(147, 114).addBox(1.74F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.62F, 0.1249F, -2.5356F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(134, 34).mirror().addBox(-0.3F, -1.1312F, -0.3915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(134, 34).addBox(0.5F, -1.1312F, -0.3915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.0819F, -6.4026F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(141, 18).mirror().addBox(-0.9F, -1.012F, -0.122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 18).addBox(0.9F, -1.012F, -0.122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.3039F, -4.5574F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(150, 20).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(150, 20).addBox(1.3F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.4F, -0.0795F, -0.8553F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(135, 54).addBox(-0.653F, -0.7214F, -0.2318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2843F, 1.4704F, -1.158F, 0.3543F, 0.0287F, -0.1486F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(39, 141).addBox(-0.353F, -0.5213F, -0.2318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.287F, 1.4103F, -2.4847F, 0.0644F, 0.1922F, -0.0872F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(138, 100).addBox(-0.6035F, -0.6912F, -0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.3844F, -3.5635F, -0.1826F, 0.4015F, -0.0963F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(66, 17).addBox(-1.0F, -1.0164F, -0.2023F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.1548F, 8.9126F, -0.3424F, -0.2472F, 0.087F));

		PartDefinition cube_r440 = tail.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(17, 145).addBox(0.0F, -3.1372F, -0.8633F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0164F, 8.7977F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(150, 26).addBox(0.0F, -2.6845F, -0.8936F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0164F, 6.7977F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(25, 149).addBox(0.0F, -2.6318F, -0.924F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0164F, 4.7977F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r443 = tail.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(103, 141).addBox(0.0F, 0.0897F, 0.2363F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9256F, 7.2778F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r444 = tail.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(18, 127).addBox(0.0F, 0.255F, -0.0117F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4256F, 5.5778F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r445 = tail.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(21, 141).addBox(0.0F, -0.2789F, -0.4028F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4408F, 1.6029F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r446 = tail.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(7, 128).addBox(0.0F, -0.0937F, -0.4226F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3256F, 3.7778F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r447 = tail.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(14, 136).addBox(0.0F, -2.779F, -0.9544F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0164F, 2.7977F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r448 = tail.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(148, 0).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0164F, -0.2023F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(87, 64).addBox(-0.5F, -0.8985F, -0.1488F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2209F, 9.6922F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r449 = tail2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(150, 78).addBox(0.0F, -2.3F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, 6.6512F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r450 = tail2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(150, 68).addBox(0.0F, -2.8F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, 4.0512F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(51, 150).addBox(0.0F, -3.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, 2.0512F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(29, 148).addBox(0.0F, -3.1F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, 0.0512F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(10, 148).addBox(0.0F, -0.2F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5079F, 7.7003F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(148, 6).addBox(0.0F, -0.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9906F, 5.7187F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(76, 148).addBox(0.0F, -1.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2921F, 3.6525F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(60, 148).addBox(0.0F, 0.9897F, 2.0363F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0434F, -1.4687F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(89, 30).addBox(-0.5F, -0.9532F, -0.0544F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(35, 152).addBox(0.0F, -2.3532F, 3.9456F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 152).addBox(0.0F, -2.2532F, 5.9456F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 152).addBox(0.0F, -2.4532F, 1.9456F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0015F, 7.5512F, -0.3065F, 0.0832F, -0.0263F));

		PartDefinition cube_r457 = tail3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(32, 152).addBox(0.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8532F, 0.0455F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(125, 53).addBox(0.0F, -0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9173F, 7.0909F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(150, 34).addBox(0.0F, -0.0608F, -0.4072F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8905F, 4.6588F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(13, 148).addBox(0.0F, -0.6804F, -0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7585F, 2.7268F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(67, 87).addBox(-0.5F, -0.4994F, 0.0209F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(44, 152).addBox(0.0F, -1.7995F, 1.0209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 111).addBox(0.0F, -1.4994F, 3.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 83).addBox(0.0F, -1.4994F, 5.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 152).addBox(0.0F, -1.2995F, 7.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.47F, 6.8584F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r461 = tail4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(57, 152).addBox(0.0F, 0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 152).addBox(0.0F, 0.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 150).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2093F, 3.1143F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(88, 75).addBox(-0.5F, -0.4815F, -0.1797F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(89, 152).addBox(0.0F, -0.9815F, 2.8203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 152).addBox(0.0F, -0.8815F, 4.8203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 94).addBox(0.0F, -0.7815F, 6.8203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0006F, 8.0209F, 0.3099F, 0.1664F, 0.053F));

		PartDefinition cube_r462 = tail5.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(152, 97).addBox(0.0F, 0.5311F, 1.8089F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 151).addBox(0.0F, -0.5689F, -0.1911F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3088F, 4.5934F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r463 = tail5.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(98, 101).addBox(0.0F, -0.3507F, -0.2177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3088F, 2.4934F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail5.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(83, 97).addBox(0.0F, -0.4061F, -0.9961F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3088F, 1.1934F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r465 = tail5.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(79, 152).addBox(0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3815F, 0.8203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 106).addBox(-0.5F, -0.4592F, -0.0336F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.01F, 7.6567F, 0.1962F, 0.4721F, 0.0902F));

		PartDefinition cube_r466 = tail6.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(152, 100).addBox(0.0F, 1.0311F, 5.8089F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 152).addBox(0.0F, 0.8311F, 3.8089F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3188F, -3.0633F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(106, 64).addBox(-0.5F, -0.4472F, -0.0182F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0401F, 5.8543F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(122, 110).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2468F, 6.1824F, -0.2355F, 0.3829F, -0.0894F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(106, 30).addBox(-2.0F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -2.5236F, -1.6627F, -0.6068F, 0.0749F, 0.1074F));

		PartDefinition cube_r467 = leftLeg.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(110, 16).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.8794F, 4.2478F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r468 = leftLeg.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(113, 123).addBox(-1.0F, -5.2F, 0.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 13).addBox(-1.0F, -5.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 14.6119F, 2.5844F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r469 = leftLeg.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(135, 114).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.547F, 1.1877F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r470 = leftLeg.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(41, 114).addBox(-1.0F, -7.2F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.7126F, 2.7382F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r471 = leftLeg.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(48, 124).addBox(-1.0F, -5.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.1908F, 0.4884F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r472 = leftLeg.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(134, 68).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8784F, 0.8867F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r473 = leftLeg.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(29, 125).addBox(-1.0F, -4.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.3F, -0.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(37, 21).addBox(-0.6F, -1.7F, 1.7F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(121, 29).addBox(-1.1F, -2.3F, -0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 15.591F, 5.9009F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r474 = leftLeg2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(114, 7).addBox(-1.4F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.7F, 13.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r475 = leftLeg2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(28, 111).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.2815F, 10.7127F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r476 = leftLeg2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(131, 133).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 1.0743F, 0.9888F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r477 = leftLeg2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(134, 73).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.2172F, 3.6965F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r478 = leftLeg2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.5F, -0.5569F, 6.6772F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r479 = leftLeg2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(66, 30).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.1F, 5.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(91, 16).addBox(-1.0F, -0.5F, -0.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0979F, 16.7847F, -0.5218F, 0.1478F, -0.0932F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 88).addBox(-1.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6635F, 4.9103F, -1.2915F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(15, 96).addBox(-1.0F, -1.2F, -0.1F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, -0.0174F, 3.9015F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -2.5236F, -1.6627F, -0.2164F, -0.0283F, -0.1278F));

		PartDefinition cube_r480 = rightLeg.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(15, 111).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.8794F, 4.2478F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r481 = rightLeg.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(39, 124).addBox(-1.0F, -5.2F, 0.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(122, 123).addBox(-1.0F, -5.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 14.6119F, 2.5844F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r482 = rightLeg.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(25, 136).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.547F, 1.1877F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r483 = rightLeg.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(50, 114).addBox(-1.0F, -7.2F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.7126F, 2.7382F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightLeg.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(99, 124).addBox(-1.0F, -5.2F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.1908F, 0.4884F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightLeg.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(134, 78).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8784F, 0.8867F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r486 = rightLeg.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(125, 46).addBox(-1.0F, -4.1F, 0.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.3F, -0.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(33, 51).addBox(-1.4F, -1.7F, 1.7F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 122).addBox(-1.9F, -2.3F, -0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 15.591F, 5.9009F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightLeg2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(114, 40).addBox(-1.6F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.7F, 13.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r488 = rightLeg2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.2815F, 10.7127F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r489 = rightLeg2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(134, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.5F, 1.0743F, 0.9888F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r490 = rightLeg2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(135, 49).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.2172F, 3.6965F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r491 = rightLeg2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(98, 105).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.5F, -0.5569F, 6.6772F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r492 = rightLeg2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.1F, 5.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(93, 0).addBox(-3.0F, -0.5F, -0.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0979F, 16.7847F, -0.5602F, -0.074F, 0.0463F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(36, 88).addBox(-4.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6635F, 4.9103F, -1.5533F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(34, 96).addBox(-4.0F, -1.2F, -0.1F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, -0.0174F, 3.9015F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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