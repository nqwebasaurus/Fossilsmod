package fossils.fossils.client.blockentity.model.proa;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProaFossilModel extends SkullModelBase {
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
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public ProaFossilModel(ModelPart root) {
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
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.6951F, 3.9164F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 97).addBox(0.0F, -1.8696F, -0.0049F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0502F, 3.1438F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 94).addBox(0.0F, -1.9583F, -0.1462F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1973F, 1.2939F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 93).mirror().addBox(-1.0F, -2.5492F, 4.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 93).mirror().addBox(-1.0F, -2.5492F, 2.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 93).mirror().addBox(-1.0F, -2.5492F, 0.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 93).mirror().addBox(-1.0F, -2.5492F, -1.972F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9973F, -0.9061F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 93).mirror().addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0492F, -0.9973F, -4.3781F, 0.0F, 0.1745F, -1.5708F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 93).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0492F, -0.9973F, -4.3781F, 0.0F, -0.1745F, 1.5708F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 93).addBox(1.0F, -2.5492F, -1.972F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 93).addBox(1.0F, -2.5492F, 4.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 93).addBox(1.0F, -2.5492F, 2.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 93).addBox(1.0F, -2.5492F, 0.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9973F, -0.9061F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 93).addBox(0.0F, -2.5492F, 0.028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9973F, -0.9061F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 93).addBox(0.0F, -2.5211F, -0.031F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0846F, -2.8086F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, -2.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1846F, -4.7086F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-0.2523F, 0.0071F, -0.926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3727F, 8.3071F, 7.4315F, -1.2652F, 0.3637F, -0.0467F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-1.4368F, 0.036F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 88).addBox(4.5632F, 0.036F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0632F, -2.6739F, -0.1989F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-1.4368F, -0.0274F, 0.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 87).addBox(4.5632F, -0.0274F, 0.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0632F, -2.5739F, -2.2989F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-1.4685F, 0.7114F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(84, 27).mirror().addBox(-1.4685F, -0.0886F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.5739F, -2.2989F, 0.2253F, 0.1736F, -0.0184F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-1.7212F, -0.051F, -2.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -1.2739F, -3.8989F, 0.1031F, 0.1736F, -0.0184F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-1.7721F, -0.0877F, -2.2725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.1739F, -4.0989F, 0.426F, 0.1736F, -0.0184F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-0.5368F, -0.2325F, 0.3586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.5261F, -3.9989F, 0.6021F, 0.2094F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-1.399F, 0.0063F, -0.1635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 2.0261F, -8.0989F, 0.3033F, 0.199F, 0.0656F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.5368F, -0.471F, -3.3846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.5261F, -3.9989F, 0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(-1.5347F, -0.9597F, -0.1124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 2.8261F, -8.7989F, -0.6807F, 0.2094F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(84, 23).mirror().addBox(-1.1605F, -0.8811F, -1.7097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 2.9261F, -6.9989F, 0.4363F, 0.2094F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 51).mirror().addBox(-0.666F, -0.7088F, -0.4648F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 3.1261F, -2.1989F, -0.4723F, 0.3264F, -0.0597F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 72).mirror().addBox(-1.343F, -0.4829F, -0.8199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.9261F, -4.0989F, -0.4723F, 0.3264F, -0.0597F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.5368F, -0.5178F, -1.2183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.5261F, -3.9989F, 0.1309F, 0.2094F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-0.9051F, -3.1436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.8261F, 0.5011F, -0.0016F, 0.1736F, -0.0184F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2602F, -0.6141F, 2.5912F, 0.5699F, -0.1201F, 0.1015F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-1.4106F, -0.7388F, 0.8553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.3739F, 1.8011F, -1.1755F, -0.1201F, 0.1015F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-1.4106F, 0.0814F, -0.0299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.3739F, 1.8011F, -0.2155F, -0.1201F, 0.1015F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(29, 64).mirror().addBox(-1.0101F, -0.7558F, 4.6313F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.5261F, 1.3011F, -0.7205F, 0.3656F, -0.0268F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 63).mirror().addBox(-1.0101F, -0.2748F, 4.578F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.5261F, 1.3011F, -0.6158F, 0.3656F, -0.0268F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(94, 21).mirror().addBox(-1.0478F, -1.3247F, 0.8987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.0261F, 0.9011F, -2.0956F, 0.3665F, -0.0067F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-0.9692F, -0.0426F, -0.4069F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.5261F, 1.3011F, -0.5597F, 0.3665F, -0.0067F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-1.0478F, 0.4054F, -1.0328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.0261F, 0.9011F, -0.4288F, 0.3665F, -0.0067F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-1.0478F, -0.355F, -1.6648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.0261F, 0.9011F, -1.031F, 0.3665F, -0.0067F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-1.4368F, -0.0379F, -3.5729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.4261F, 0.5011F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.4368F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 48).addBox(4.5632F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0632F, 1.8261F, 0.5011F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(84, 43).addBox(0.7721F, -0.0877F, -2.2725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.1739F, -4.0989F, 0.426F, -0.1736F, 0.0184F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 72).addBox(-0.4632F, -0.2325F, 0.3586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9632F, 1.5261F, -3.9989F, 0.6021F, -0.2094F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 70).addBox(0.399F, 0.0063F, -0.1635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 2.0261F, -8.0989F, 0.3033F, -0.199F, -0.0656F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(70, 72).addBox(-0.4632F, -0.471F, -3.3846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9632F, 1.5261F, -3.9989F, 0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(48, 94).addBox(0.5347F, -0.9597F, -0.1124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9632F, 2.8261F, -8.7989F, -0.6807F, -0.2094F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(84, 23).addBox(0.1605F, -0.8811F, -1.7097F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9632F, 2.9261F, -6.9989F, 0.4363F, -0.2094F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 51).addBox(-0.334F, -0.7088F, -0.4648F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0632F, 3.1261F, -2.1989F, -0.4723F, -0.3264F, 0.0597F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 72).addBox(0.343F, -0.4829F, -0.8199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.0632F, 1.9261F, -4.0989F, -0.4723F, -0.3264F, 0.0597F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 88).addBox(-0.4632F, -0.5178F, -1.2183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 1.5261F, -3.9989F, 0.1309F, -0.2094F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(19, 89).addBox(0.7212F, -0.051F, -2.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0632F, -1.2739F, -3.8989F, 0.1031F, -0.1736F, 0.0184F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 10).addBox(-0.0949F, -3.1436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.8261F, 0.5011F, -0.0016F, -0.1736F, 0.0184F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 31).addBox(0.4685F, 0.7114F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(84, 27).addBox(0.4685F, -0.0886F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0632F, -2.5739F, -2.2989F, 0.2253F, -0.1736F, 0.0184F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 72).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2602F, -0.6141F, 2.5912F, 0.5699F, 0.1201F, -0.1015F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(91, 14).addBox(0.4106F, -0.7388F, 0.8553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.3739F, 1.8011F, -1.1755F, 0.1201F, -0.1015F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 39).addBox(0.4106F, 0.0814F, -0.0299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, -2.3739F, 1.8011F, -0.2155F, 0.1201F, -0.1015F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(98, 55).addBox(-0.7477F, 0.0071F, -0.926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3727F, 8.3071F, 7.4315F, -1.2652F, -0.3637F, 0.0467F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(29, 64).addBox(0.0101F, -0.7558F, 4.6313F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.5261F, 1.3011F, -0.7205F, -0.3656F, 0.0268F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(18, 63).addBox(0.0101F, -0.2748F, 4.578F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 2.5261F, 1.3011F, -0.6158F, -0.3656F, 0.0268F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 21).addBox(0.0478F, -1.3247F, 0.8987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.0261F, 0.9011F, -2.0956F, -0.3665F, 0.0067F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(55, 41).addBox(-0.0308F, -0.0426F, -0.4069F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 2.5261F, 1.3011F, -0.5597F, -0.3665F, 0.0067F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(84, 35).addBox(0.0478F, 0.4054F, -1.0328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0632F, 2.0261F, 0.9011F, -0.4288F, -0.3665F, 0.0067F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 43).addBox(0.0478F, -0.355F, -1.6648F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.0261F, 0.9011F, -1.031F, -0.3665F, 0.0067F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 6).addBox(0.4368F, -0.0379F, -3.5729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.4261F, 0.5011F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.0074F, -0.2693F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 0.6439F, -0.5901F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 15).addBox(-0.5F, -0.9742F, -1.9695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.4721F, 1.0739F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(24, 51).addBox(-0.5F, -0.095F, -1.9532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7721F, 0.0739F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 58).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(59, 21).addBox(-1.0F, 2.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(55, 27).addBox(-1.9F, 0.1354F, -1.8811F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5197F, 0.5597F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, 0.0181F, -0.9346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(50, 77).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(74, 5).addBox(-1.0F, 0.6F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(77, 43).addBox(-1.9F, -0.0158F, -1.0373F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.0811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(11, 67).addBox(-1.9F, -3.1582F, 0.059F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -1.4811F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 80).addBox(-1.9F, -0.2587F, 0.0101F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.0354F, -1.4811F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 37).addBox(-1.9F, -4.0981F, -0.0536F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 57).addBox(-1.9F, -5.9249F, -0.929F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.1811F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(37, 57).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.9387F, -1.395F, -0.672F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(38, 44).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.6439F, -0.5901F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 19).addBox(-0.5F, -0.9742F, -1.9695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.4721F, 1.0739F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(14, 77).addBox(-0.5F, -0.095F, -1.9532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7721F, 0.0739F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 12).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, 2.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(59, 57).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(55, 34).addBox(-0.1F, 0.1354F, -1.8811F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5197F, 0.5597F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 82).addBox(-0.5F, 0.0181F, -0.9346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 77).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(25, 75).addBox(-1.0F, 0.6F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(77, 77).addBox(-0.1F, -0.0158F, -1.0373F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.0811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(68, 32).addBox(-0.1F, -3.1582F, 0.059F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -1.4811F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(82, 65).addBox(-0.1F, -0.2587F, 0.0101F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.0354F, -1.4811F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 61).addBox(-0.1F, -4.0981F, -0.0536F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(18, 69).addBox(-0.1F, -5.9249F, -0.929F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.1811F, -0.192F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(48, 57).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.9387F, -1.395F, -0.672F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(46, 6).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.8901F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(15, 45).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -1.1781F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 19).addBox(-0.5F, -0.7285F, 0.0617F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, 4.5F, -0.2126F, -0.1707F, 0.0366F));

		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(26, 99).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7285F, 4.0617F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(10, 95).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6641F, 7.1608F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 91).addBox(0.0F, 2.2112F, 1.236F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(94, 84).addBox(0.0F, 2.8848F, 3.1526F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(99, 20).addBox(0.0F, 4.3213F, 5.3132F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 16).addBox(0.0F, 5.2355F, 7.2192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(91, 18).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9219F, 1.2621F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 94).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7064F, 5.1217F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 78).addBox(0.0F, -1.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3583F, 2.9959F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(99, 6).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6285F, 2.0617F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(6, 99).mirror().addBox(-1.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 99).mirror().addBox(-1.0F, -2.2F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 99).mirror().addBox(-1.0F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6285F, 0.0617F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(6, 99).addBox(1.0F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 99).addBox(1.0F, -2.2F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 99).addBox(1.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6285F, 0.0617F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r97 = tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(6, 99).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6285F, 0.0617F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 94).addBox(0.0F, -6.4867F, 7.9367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(3, 99).addBox(0.0F, -5.5311F, 6.0301F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 99).addBox(0.0F, -4.112F, 4.3998F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(91, 99).addBox(0.0F, -2.787F, 2.6511F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(85, 99).mirror().addBox(0.05F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 99).mirror().addBox(0.05F, -1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 99).mirror().addBox(0.05F, -0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 99).mirror().addBox(0.05F, -0.6F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 99).mirror().addBox(0.05F, -0.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.223F, 6.4487F, 0.0F, 0.0873F, -1.5708F));

		PartDefinition cube_r103 = tail.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 99).addBox(-0.05F, -0.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 99).addBox(-0.05F, -0.6F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 99).addBox(-0.05F, -0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 99).addBox(-0.05F, -1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 99).addBox(-0.05F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.223F, 6.4487F, 0.0F, -0.0873F, 1.5708F));

		PartDefinition cube_r104 = tail.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 99).addBox(0.0F, -2.2651F, 0.7816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(23, 14).addBox(-0.5F, -0.5999F, -0.093F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 5.0617F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0048F, 14.5917F, 0.2346F, -0.2549F, -0.0602F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(9, 100).addBox(0.0F, -0.5108F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 11.1496F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(11, 48).addBox(0.0F, -1.0298F, -0.0644F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0885F, 9.0496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(52, 99).addBox(0.0F, -2.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5205F, 2.3716F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(39, 99).addBox(0.0F, -2.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3063F, 4.422F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(32, 99).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9982F, 6.4382F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(101, 10).addBox(0.0F, -1.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.69F, 8.4544F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(94, 99).addBox(0.0F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.006F, 10.3337F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(40, 80).addBox(0.0F, -2.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.187F, 12.7242F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(74, 84).addBox(0.0F, -1.6383F, -0.0859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1885F, 7.0496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -1.9578F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1885F, 4.9496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 99).addBox(0.0F, -2.0307F, -0.0974F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2786F, 3.0525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(88, 98).addBox(0.0F, -2.42F, 0.0438F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4487F, 0.8398F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.9F, 0.1535F, -0.2589F, -0.0396F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(32, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.9004F, -0.2009F, -0.5148F, 0.0999F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9635F, 4.8612F, -0.1446F, -0.5625F, 0.0775F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -4.7F, 0.1418F, -0.1728F, -0.0245F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 93).addBox(0.0F, -2.6586F, 0.0534F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2876F, -2.057F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 98).addBox(0.0F, -2.4677F, -0.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2454F, -3.9177F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(13, 95).addBox(0.0F, -2.2215F, -0.0896F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1264F, -5.8915F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 92).addBox(0.0F, -2.2577F, 0.026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -7.9F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(58, 99).addBox(0.0F, -1.9829F, -0.1344F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -9.7F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 99).addBox(0.0F, -1.6667F, -6.1256F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -5.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(40, 27).addBox(-0.5F, -0.0486F, -0.0015F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -11.7F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -7.1557F, 0.1404F, -0.0037F, -0.4363F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -7.1557F, 0.1427F, -0.0067F, -0.8726F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-6.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.157F, -7.1557F, 0.1323F, 0.0541F, -1.3049F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(84, 63).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.3557F, -0.0623F, -0.4811F, -1.0495F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.3557F, -0.2488F, -0.3481F, -0.5943F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(91, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -3.2557F, -0.1843F, -0.3076F, -0.5435F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -3.2557F, -0.021F, -0.418F, -0.9959F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.057F, -11.1557F, 0.3307F, 0.0844F, -0.4286F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 32).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.057F, -11.1557F, 0.2784F, 0.1533F, -0.8627F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.057F, -11.1557F, 0.1888F, 0.256F, -1.2961F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -9.2557F, 0.2512F, 0.0479F, -0.4339F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -9.2557F, 0.2215F, 0.0868F, -0.8695F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -9.2557F, 0.1648F, 0.1719F, -1.3012F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -5.1557F, -0.0635F, -0.2455F, -0.8464F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.757F, -5.1557F, -0.1461F, -0.1345F, -0.4164F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(84, 63).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.3557F, -0.0623F, 0.4811F, 1.0495F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(91, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.3557F, -0.2488F, 0.3481F, 0.5943F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -3.2557F, -0.1843F, 0.3076F, 0.5435F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 90).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -3.2557F, -0.021F, 0.418F, 0.9959F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(33, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.057F, -11.1557F, 0.3307F, -0.0844F, 0.4286F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(91, 32).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.057F, -11.1557F, 0.2784F, -0.1533F, 0.8627F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 48).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.057F, -11.1557F, 0.1888F, -0.256F, 1.2961F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 8).addBox(3.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -7.1557F, 0.1323F, -0.0541F, 1.3049F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(91, 61).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -7.1557F, 0.1427F, 0.0067F, 0.8726F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(92, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.157F, -7.1557F, 0.1404F, 0.0037F, 0.4363F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(91, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -9.2557F, 0.2512F, -0.0479F, 0.4339F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(91, 28).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -9.2557F, 0.2215F, -0.0868F, 0.8695F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(73, 70).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -9.2557F, 0.1648F, -0.1719F, 1.3012F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(91, 26).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -5.1557F, -0.0635F, 0.2455F, 0.8464F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(91, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.757F, -5.1557F, -0.1461F, 0.1345F, 0.4164F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2F, -11.3F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-0.3588F, 0.0303F, -0.0098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 0.685F, -1.2282F, -0.8476F, -0.0269F, 0.083F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(98, 58).mirror().addBox(-0.3402F, -0.0093F, -0.0058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 0.785F, -2.2282F, 0.06F, -0.0269F, 0.083F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.6976F, -1.5152F, -0.3292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(34, 75).mirror().addBox(-0.6976F, -0.9152F, -0.3292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 5.585F, -3.7282F, 0.7756F, -0.0269F, 0.083F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-0.4185F, 0.011F, -0.0276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 2.185F, -3.6282F, 0.793F, -0.0269F, 0.083F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.357F, -6.8557F, 0.581F, 0.1931F, -0.3938F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.357F, -6.8557F, 0.4649F, 0.3552F, -0.8154F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.357F, -6.8557F, 0.2722F, 0.5153F, -1.2645F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(21, 27).mirror().addBox(-0.14F, -0.1888F, -1.1839F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 12.1804F, -3.3793F, 0.0079F, -0.8335F, 0.3243F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(38, 36).mirror().addBox(0.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 12.1804F, -4.0793F, 0.0735F, -0.9731F, 0.3309F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-0.3558F, -0.2046F, -0.6786F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 12.1804F, -4.0793F, 0.3713F, -1.1113F, 0.2888F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(-1.0F, 0.43F, 2.4291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 70).addBox(0.0F, 0.43F, 2.4291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.7F, -7.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(68, 27).mirror().addBox(-2.0F, -0.0808F, -0.3345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 27).addBox(0.0F, -0.0808F, -0.3345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.7F, -7.8F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -4.9557F, 0.4994F, 0.159F, -0.4081F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(89, 89).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -4.9557F, 0.4024F, 0.2911F, -0.8352F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-8.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.257F, -4.9557F, 0.2433F, 0.432F, -1.2777F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -3.3557F, 0.4589F, 0.1415F, -0.4141F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -3.3557F, 0.3722F, 0.2586F, -0.8434F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(27, 12).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -3.3557F, 0.2297F, 0.3901F, -1.2832F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(91, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.6557F, 0.3946F, 0.1132F, -0.4223F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(27, 10).mirror().addBox(-11.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.6557F, 0.2088F, 0.3231F, -1.2904F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(91, 38).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.6557F, 0.3248F, 0.2062F, -0.8544F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-0.5F, -1.1F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2469F, 2.7169F, -1.5224F, 0.5487F, -0.0269F, 0.083F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-0.0629F, -1.7736F, -1.8864F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 10.785F, -6.4282F, 1.4525F, -0.3856F, -1.1624F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.3164F, -2.1938F, -0.0374F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 10.785F, -6.4282F, 1.2189F, -0.2093F, -0.2677F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-0.5826F, 0.0227F, -0.064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 4.685F, -5.2282F, 1.0024F, -0.0269F, 0.083F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.8628F, -0.1171F, 0.1814F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 8.585F, -6.8282F, 1.1421F, -0.0269F, 0.083F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-1.0559F, -1.0122F, 1.9182F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2275F, 10.785F, -6.4282F, 1.0723F, -0.0269F, 0.083F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(21, 27).addBox(-0.86F, -0.1888F, -1.1839F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 12.1804F, -3.3793F, 0.0079F, 0.8335F, -0.3243F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(38, 36).addBox(-1.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 12.1804F, -4.0793F, 0.0735F, 0.9731F, -0.3309F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(46, 12).addBox(-0.6442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 12.1804F, -4.0793F, 0.3713F, 1.1113F, -0.2888F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(64, 99).addBox(0.0F, -1.552F, -0.0294F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.3F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(98, 96).addBox(0.0F, -1.6285F, 0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(79, 99).addBox(0.0F, -0.8035F, -2.061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 99).addBox(0.0F, -1.5035F, 0.139F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.7F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 48).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.357F, -6.8557F, 0.2722F, -0.5153F, 1.2645F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(90, 2).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.357F, -6.8557F, 0.4649F, -0.3552F, 0.8154F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(90, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.357F, -6.8557F, 0.581F, -0.1931F, 0.3938F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -4.9557F, 0.4994F, -0.159F, 0.4081F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(89, 89).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -4.9557F, 0.4024F, -0.2911F, 0.8352F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(68, 41).addBox(3.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.257F, -4.9557F, 0.2433F, -0.432F, 1.2777F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(43, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -3.3557F, 0.4589F, -0.1415F, 0.4141F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(51, 64).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -3.3557F, 0.3722F, -0.2586F, 0.8434F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(27, 12).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -3.3557F, 0.2297F, -0.3901F, 1.2832F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.6557F, 0.3946F, -0.1132F, 0.4223F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(27, 10).addBox(3.1021F, -2.3689F, -0.3751F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.6557F, 0.2088F, -0.3231F, 1.2904F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(91, 38).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.6557F, 0.3248F, -0.2062F, 0.8544F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 50).addBox(-0.5F, -1.1F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2469F, 2.7169F, -1.5224F, 0.5487F, 0.0269F, -0.083F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 18).addBox(-0.9371F, -1.7736F, -1.8864F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2275F, 10.785F, -6.4282F, 1.4525F, 0.3856F, 1.1624F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(60, 77).addBox(-0.6836F, -2.1938F, -0.0374F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2275F, 10.785F, -6.4282F, 1.2189F, 0.2093F, 0.2677F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(98, 69).addBox(-0.6412F, 0.0303F, -0.0098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.2275F, 0.685F, -1.2282F, -0.8476F, 0.0269F, -0.083F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 58).addBox(-0.6598F, -0.0093F, -0.0058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2275F, 0.785F, -2.2282F, 0.06F, 0.0269F, -0.083F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(68, 88).addBox(-0.5815F, 0.011F, -0.0276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.2275F, 2.185F, -3.6282F, 0.793F, 0.0269F, -0.083F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(75, 32).addBox(-0.4174F, 0.0227F, -0.064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2275F, 4.685F, -5.2282F, 1.0024F, 0.0269F, -0.083F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 67).addBox(-0.1372F, -0.1171F, 0.1814F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2275F, 8.585F, -6.8282F, 1.1421F, 0.0269F, -0.083F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(75, 56).addBox(-0.3024F, -1.5152F, -0.3292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(34, 75).addBox(-0.3024F, -0.9152F, -0.3292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.2275F, 5.585F, -3.7282F, 0.7756F, 0.0269F, -0.083F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 66).addBox(0.0559F, -1.0122F, 1.9182F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.2275F, 10.785F, -6.4282F, 1.0723F, 0.0269F, -0.083F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.011F, -3.02F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.8F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(78, 92).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 74).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0621F, 11.5206F, -5.0148F, -0.1396F, 0.0F, -0.1745F));

		PartDefinition cube_r213 = leftArm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 80).addBox(-1.0F, 3.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(79, 24).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(7, 88).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6491F, 0.6993F, -0.5799F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r215 = leftArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(68, 92).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.648F, -0.979F, 0.8465F, -0.48F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(9, 76).addBox(0.0F, -1.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(67, 77).addBox(0.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3374F, 7.874F, 2.266F, -0.3225F, 0.3084F, 0.3913F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(70, 12).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.0F, -1.5F, 0.2294F, 0.3165F, 0.1985F));

		PartDefinition cube_r216 = leftArm3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(60, 83).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(82, 82).addBox(-0.4F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(15, 39).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(83, 92).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 89).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0621F, 11.5206F, -5.0148F, 0.6894F, 0.0F, 0.1745F));

		PartDefinition cube_r218 = rightArm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(82, 10).addBox(0.0F, 3.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(35, 80).addBox(0.0F, -0.1F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6491F, 0.6993F, -0.5799F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r220 = rightArm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(73, 92).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8569F, 2.648F, -0.979F, 0.8465F, 0.48F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(77, 10).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(72, 77).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3374F, 7.874F, 2.266F, -0.4882F, -0.5379F, -0.0026F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(70, 19).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.0F, -1.5F, 0.2294F, -0.3165F, -0.1985F));

		PartDefinition cube_r221 = rightArm3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(83, 0).addBox(-0.6F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(32, 45).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.457F, -8.4557F, -0.2619F, 0.1843F, 0.18F));

		PartDefinition cube_r223 = neck4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(70, 99).addBox(-0.5F, -2.1891F, 1.9381F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 99).addBox(-0.5F, -1.4891F, -0.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4F, -3.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r224 = neck4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7F, -3.0F, 0.7763F, 0.9582F, -0.8946F));

		PartDefinition cube_r225 = neck4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7F, -3.0F, 1.0993F, 0.6419F, -0.4534F));

		PartDefinition cube_r226 = neck4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(-4.1021F, -2.3689F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.1F, 0.2462F, 1.0963F, -1.4519F));

		PartDefinition cube_r227 = neck4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.1F, 0.8221F, 0.862F, -0.7708F));

		PartDefinition cube_r228 = neck4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.1F, 1.0831F, 0.5426F, -0.3748F));

		PartDefinition cube_r229 = neck4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(91, 55).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7F, -3.0F, 0.7763F, -0.9582F, 0.8946F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(54, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7F, -3.0F, 1.0993F, -0.6419F, 0.4534F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(54, 85).addBox(3.1021F, -2.3689F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.1F, 0.2462F, -1.0963F, 1.4519F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 44).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.1F, 0.8221F, -0.862F, 0.7708F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(91, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.1F, 1.0831F, -0.5426F, 0.3748F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, 0.017F, -0.2385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4F, -3.3F, 0.4887F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.943F, -3.2443F, 0.2277F, 0.0838F, 0.0187F));

		PartDefinition cube_r235 = neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(76, 99).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1519F, -1.3861F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 99).addBox(0.0F, -1.1072F, -0.2767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 66).addBox(-0.5F, 0.0928F, -0.2767F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4887F, -3.5934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(91, 59).mirror().addBox(-2.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7637F, -2.1123F, 0.41F, 0.475F, -1.0893F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-2.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1452F, -3.9088F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(91, 59).addBox(0.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7637F, -2.1123F, 0.41F, -0.475F, 1.0893F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 57).addBox(0.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1452F, -3.9088F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0887F, -3.8934F, -0.0432F, 0.0469F, -0.0332F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 77).addBox(0.0F, 0.1F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 100).addBox(0.0F, 0.1F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 100).addBox(0.0F, 0.0F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 36).addBox(-0.5F, 1.0F, -2.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.3626F, -3.5573F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-1.9387F, -0.0508F, -0.7231F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3316F, -5.0159F, 0.3519F, 0.7822F, -1.1675F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-1.9485F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3316F, -3.1159F, 0.4561F, 0.6012F, -1.0218F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(61, 92).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.411F, -1.274F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(90, 6).addBox(-0.0613F, -0.0508F, -0.7231F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3316F, -5.0159F, 0.3519F, -0.7822F, 1.1675F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(90, 6).addBox(-0.0515F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3316F, -3.1159F, 0.4561F, -0.6012F, 1.0218F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(61, 92).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.411F, -1.274F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9107F, -6.038F, 0.2166F, 0.2559F, 0.0557F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5303F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(42, 87).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5303F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(45, 100).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7831F, -0.227F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(84, 55).addBox(-0.5F, -0.284F, 1.7966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 92).addBox(0.2F, 0.6146F, -2.7153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(40, 92).mirror().addBox(-1.2F, 0.6146F, -2.7153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.594F, -1.7977F, 0.5045F, -0.0423F, 0.0764F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(0.1F, -0.9366F, -2.9916F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 50).addBox(0.9F, -0.9366F, -2.9916F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2629F, -5.1864F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(97, 100).mirror().addBox(0.1F, -0.9573F, -1.0457F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 100).addBox(0.9F, -0.9573F, -1.0457F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.577F, -4.1885F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(12, 87).addBox(-0.6F, -0.5319F, -0.9981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.9629F, -8.5864F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(47, 85).addBox(-0.6F, -0.9551F, -1.2273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 0.9629F, -7.2864F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(82, 86).addBox(-0.6F, -0.9382F, -0.0753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.8629F, -5.6864F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(28, 85).addBox(-0.6F, -0.3059F, 1.8049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.3629F, -9.4864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(26, 96).mirror().addBox(-0.5F, -0.9344F, -1.1435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 96).addBox(-0.06F, -0.9344F, -1.1435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, 0.6518F, -9.4741F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(-0.5F, -0.6972F, -0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(67, 84).mirror().addBox(-0.5F, -0.4668F, -1.3749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(31, 96).addBox(-0.06F, -0.6972F, -0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(67, 84).addBox(-0.06F, -0.4668F, -1.3749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.22F, 0.6518F, -9.4741F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-0.5F, -0.6666F, -0.3506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(21, 85).addBox(-0.06F, -0.6666F, -0.3506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, 0.6518F, -9.4741F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-0.5F, -0.9339F, -0.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(96, 63).addBox(0.94F, -0.9339F, -0.035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.72F, 0.3529F, -3.6993F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.5F, 0.0154F, -0.0079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(53, 96).addBox(0.94F, 0.0154F, -0.0079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.72F, 0.427F, -3.6711F, 2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(39, 96).mirror().addBox(-0.5F, -0.3038F, -1.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(39, 96).addBox(0.94F, -0.3038F, -1.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.72F, -1.673F, -3.7711F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-0.5F, 0.0138F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(97, 49).addBox(0.94F, 0.0138F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.72F, 0.0529F, -4.5993F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(-0.77F, -0.7039F, -0.5543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(31, 93).mirror().addBox(-0.61F, -0.7039F, -0.5543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 93).addBox(1.21F, -0.7039F, -0.5543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(31, 93).addBox(1.05F, -0.7039F, -0.5543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.72F, -0.773F, -3.5711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-0.5F, 0.0429F, -0.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(97, 46).addBox(0.94F, 0.0429F, -0.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.72F, -1.073F, -2.5711F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(96, 13).mirror().addBox(-0.5F, -0.2073F, -0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 13).addBox(0.94F, -0.2073F, -0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -1.673F, -3.7711F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(44, 97).mirror().addBox(-0.5F, 0.0023F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(44, 97).addBox(0.94F, 0.0023F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.72F, -0.173F, -2.8711F, 2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.46F, -0.1611F, -0.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 91).addBox(1.3F, -0.1611F, -0.2378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -1.0675F, -2.063F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-0.46F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(93, 72).addBox(1.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -0.9397F, -1.7144F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(-0.46F, -0.1872F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(94, 18).addBox(1.3F, -0.1872F, -0.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, -0.5548F, -1.2274F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-0.46F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(93, 69).addBox(1.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, -0.2548F, -1.5274F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, -0.1509F, -0.8176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 85).addBox(0.66F, -0.1509F, -0.8176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.8178F, 0.151F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.5F, -0.1863F, -0.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 93).addBox(0.66F, -0.1863F, -0.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.9178F, -0.549F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(73, 65).addBox(-0.5F, -0.9912F, -0.0146F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3629F, -4.3864F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(75, 89).addBox(-1.0F, -0.7686F, -0.1421F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6841F, -9.3421F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 66).addBox(-1.0F, -0.8005F, 0.3391F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 63).addBox(-1.0F, -0.8005F, -0.2609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2841F, -10.2421F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(97, 3).mirror().addBox(-0.7F, -0.8266F, 0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(97, 3).addBox(-0.3F, -0.8266F, 0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.216F))
				.texOffs(97, 0).mirror().addBox(-0.7F, -0.8266F, -0.183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false)
				.texOffs(97, 0).addBox(-0.3F, -0.8266F, -0.183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(0.0F, 1.4841F, -10.7421F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(89, 81).addBox(-1.0F, -0.7536F, -0.1536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.9841F, -10.8421F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(42, 89).addBox(-1.0F, -0.9F, 0.3348F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.8841F, -11.3421F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(84, 77).addBox(-0.5F, -0.5268F, -0.2241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.22F, 0.6518F, -9.4741F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 72).addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.62F, -1.593F, -0.4815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.45F, -0.1393F, -0.1578F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9002F, -1.6006F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(26, 92).mirror().addBox(-0.45F, -0.4036F, -0.3478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(26, 92).addBox(1.25F, -0.4036F, -0.3478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, -0.3998F, -1.0006F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-1.4F, -0.2236F, -0.1611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 59).addBox(0.4F, -0.2236F, -0.1611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3371F, 0.5136F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-1.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(89, 84).addBox(0.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9371F, 0.7136F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(43, 77).addBox(0.9F, -1.1F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, -0.824F, -2.1517F, -1.946F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(96, 10).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 10).addBox(0.9F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.1199F, -2.3252F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, -1.9842F, -0.9703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 92).addBox(0.9F, -1.9842F, -0.9703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 2.4199F, -2.9252F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(91, 77).addBox(0.9F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 1.302F, -3.6147F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-0.5F, -1.9749F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 46).addBox(0.9F, -1.9749F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7F, 1.602F, -4.2147F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 96).addBox(-0.5F, -0.8752F, -0.2479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3629F, -9.6864F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(-0.6F, 0.8F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(58, 50).addBox(-0.2F, 0.8F, -0.6F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -1.7371F, -7.9864F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(93, 96).addBox(-0.5F, 0.0018F, -0.9615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3371F, -9.2864F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(92, 50).addBox(-0.5F, 0.0693F, -0.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9371F, -8.4864F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(83, 96).addBox(-0.5F, 0.0379F, -0.9496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5371F, -6.5864F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -0.0354F, -1.0038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2371F, -7.4864F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(96, 81).addBox(-0.5F, -0.0083F, -1.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -5.5864F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(88, 95).addBox(-0.5F, -0.0206F, -1.0205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9371F, -4.5864F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(18, 58).addBox(-0.55F, -0.1393F, -0.1578F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9F, 0.9002F, -1.6006F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(40, 83).addBox(-1.0F, -0.0412F, -1.0195F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9371F, -0.7864F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(14, 83).addBox(-1.0F, -0.0467F, -1.0393F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7371F, 0.2136F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 4).addBox(-1.0F, 0.0123F, -0.758F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.1371F, 0.6136F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(74, 0).addBox(-1.0F, 0.0105F, -1.9712F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.3371F, -3.3864F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(86, 70).addBox(-1.0F, 0.0632F, -1.5828F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 73).addBox(-1.0F, 0.0632F, -0.9828F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1371F, -1.7864F, -0.1571F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(97, 84).addBox(-0.4774F, -1.4777F, -6.4577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0226F, 3.6628F, -1.586F, 0.2183F, -0.0016F, 0.0113F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(96, 78).addBox(-0.4779F, 0.0403F, -0.9715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0005F, -1.8877F, -7.3687F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(16, 98).addBox(-0.4779F, -0.8025F, -0.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0005F, -0.3877F, -7.2687F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(21, 98).addBox(-0.4779F, -0.2402F, -0.1192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0005F, -1.3877F, -8.1687F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 96).addBox(-0.4779F, -0.6366F, -0.3884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0005F, -0.6877F, -8.2687F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(100, 100).mirror().addBox(0.0F, -0.0235F, -1.0163F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 100).addBox(0.7557F, -0.0235F, -1.0163F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3553F, -2.253F, -5.2018F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-0.01F, -0.0235F, -0.0163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 72).addBox(0.7657F, -0.0235F, -0.0163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3553F, -2.253F, -5.2018F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(98, 42).mirror().addBox(-1.1957F, -0.0392F, -0.9821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0447F, -1.1877F, -1.6687F, -0.1396F, -0.0061F, 0.0008F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(98, 39).mirror().addBox(-1.2F, -0.9545F, -1.4494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(98, 33).mirror().addBox(-1.2F, -0.9545F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(98, 39).addBox(0.1557F, -0.9545F, -1.4494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(98, 33).addBox(0.1557F, -0.9545F, -0.9494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0447F, 0.7123F, -1.8687F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(98, 36).mirror().addBox(-1.2F, -0.0764F, -0.9814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0447F, -0.3877F, -1.0687F, -0.8901F, -0.0061F, 0.0008F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 30).mirror().addBox(-1.2F, -1.0417F, -0.9456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(98, 30).addBox(0.1557F, -1.0417F, -0.9456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0447F, 0.7123F, -0.8687F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(98, 27).mirror().addBox(-1.2F, -0.9646F, 0.4504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(98, 24).mirror().addBox(-1.2F, -0.9646F, -0.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(98, 27).addBox(0.1557F, -0.9646F, 0.4504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(98, 24).addBox(0.1557F, -0.9646F, -0.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0447F, 0.8123F, -0.3687F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(0.0F, -0.5F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 91).addBox(1.5557F, -0.5F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7553F, -1.1558F, -2.106F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 47).mirror().addBox(-1.2F, -0.2309F, 1.1971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(85, 47).addBox(0.1557F, -0.2309F, 1.1971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0447F, -0.9877F, -3.1687F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(97, 90).addBox(-0.4779F, -1.0302F, -0.0707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0005F, -0.3213F, -4.5922F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(97, 87).addBox(-0.4779F, -1.0564F, -0.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, -0.4213F, -5.4922F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(96, 75).addBox(-0.4779F, -1.0338F, 0.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, -0.3213F, -7.3922F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(85, 51).addBox(-0.4779F, -1.0137F, 0.1225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0005F, -0.2876F, -4.2964F, -0.3752F, 0.003F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(97, 93).addBox(-0.4779F, -0.0681F, -1.0313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0005F, -1.7876F, -6.7964F, 0.3578F, -0.0008F, -0.0001F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(73, 96).addBox(-0.4779F, -0.0837F, -0.9531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0005F, -1.9876F, -5.8964F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(35, 87).addBox(-0.4779F, 0.0167F, -0.047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0005F, -1.7876F, -3.8964F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(97, 52).addBox(-0.4779F, -0.0045F, -0.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0005F, -1.9876F, -4.8964F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(68, 96).addBox(-0.4779F, -0.2431F, -0.5446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0005F, -1.7876F, -5.3964F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(96, 66).addBox(-0.4779F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0005F, -1.0016F, -7.2852F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(98, 42).addBox(0.1957F, -0.0392F, -0.9821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0005F, -1.1877F, -1.6687F, -0.1396F, 0.0061F, -0.0008F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(98, 36).addBox(0.2F, -0.0764F, -0.9814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, -0.3877F, -1.0687F, -0.8901F, 0.0061F, -0.0008F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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