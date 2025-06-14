package fossils.fossils.client.blockentity.model.mantellisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MantellisaurusFossilModel extends SkullModelBase {
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

	public MantellisaurusFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.5F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 73).addBox(0.0F, -3.8696F, -0.0049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0502F, 3.1438F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 73).addBox(0.0F, -3.6583F, -0.1462F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1973F, 1.2939F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -3.8492F, 0.028F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9973F, -0.9061F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 76).addBox(0.0F, -3.7211F, -0.031F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0846F, -2.8086F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 76).addBox(0.0F, -3.6F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1846F, -4.7086F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4368F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(9, 49).mirror().addBox(-0.4368F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 49).addBox(2.5632F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(4.5632F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-0.5368F, -0.6178F, -1.9183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, 0.2182F, 0.2094F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(0.4249F, -0.1661F, 0.3946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 5.3261F, 1.1011F, -1.0908F, 0.3335F, -0.1549F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-1.2869F, -0.4547F, -0.7277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.7261F, -2.7989F, -0.6526F, 0.3567F, -0.0861F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(-1.2869F, -1.2366F, -1.9006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.7261F, -2.7989F, -1.2547F, 0.3567F, -0.0861F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-1.343F, -0.9356F, 1.666F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.7261F, -5.4989F, -0.736F, 0.3241F, -0.0715F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 58).mirror().addBox(-1.2869F, -1.5459F, 0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.7261F, -2.7989F, -2.3194F, 0.3567F, -0.0861F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 52).mirror().addBox(0.4249F, -0.1312F, 0.3029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 5.3261F, 1.1011F, -0.9861F, 0.3335F, -0.1549F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 45).mirror().addBox(-0.4085F, -0.3618F, -2.3028F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 3.5261F, -0.6989F, -0.9312F, 0.3411F, -0.1367F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 29).mirror().addBox(-1.4368F, -0.0379F, -3.5729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.6261F, -2.3989F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-1.343F, -0.4829F, -0.8199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.7261F, -5.4989F, -0.5091F, 0.3241F, -0.0715F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-0.5368F, 0.398F, -2.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(65, 6).mirror().addBox(-0.5368F, 0.398F, -4.4284F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, -0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-0.5368F, -0.571F, -3.3846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, 0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5368F, -0.4355F, -4.4252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, -0.1396F, 0.2094F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 31).mirror().addBox(-0.5368F, -1.4325F, -1.7414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, 0.6021F, 0.2094F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-0.9051F, -3.6436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, -0.0016F, 0.1736F, -0.0184F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-1.4777F, -2.7086F, 1.2264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, 0.2431F, -0.1562F, 0.0166F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-1.4777F, -3.7176F, 1.5107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, 0.3827F, -0.1562F, 0.0166F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(-1.4777F, -4.9797F, -1.073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, -0.5773F, -0.1562F, 0.0166F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-0.9051F, -5.1593F, -3.2011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, 0.3475F, 0.1736F, -0.0184F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 32).mirror().addBox(-1.7648F, -0.1821F, -2.8059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.5739F, -6.9989F, 0.1642F, 0.1736F, -0.0184F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 32).addBox(0.7648F, -0.1821F, -2.8059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.5739F, -6.9989F, 0.1642F, -0.1736F, 0.0184F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 31).addBox(-0.4632F, -1.4325F, -1.7414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, 0.6021F, -0.2094F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 58).addBox(-0.4632F, -0.4355F, -4.4252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, -0.1396F, -0.2094F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 57).addBox(-0.4632F, -0.571F, -3.3846F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, 0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 77).addBox(-0.4632F, 0.398F, -2.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 6).addBox(-0.4632F, 0.398F, -4.4284F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, -0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(45, 20).addBox(0.343F, -0.9356F, 1.666F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0632F, 1.7261F, -5.4989F, -0.736F, -0.3241F, 0.0715F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 20).addBox(0.343F, -0.4829F, -0.8199F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.0632F, 1.7261F, -5.4989F, -0.5091F, -0.3241F, 0.0715F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(70, 32).addBox(-0.4632F, -0.6178F, -1.9183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, 0.2182F, -0.2094F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 70).addBox(-0.0949F, -3.6436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -2.3989F, -0.0016F, -0.1736F, 0.0184F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 70).addBox(-0.0949F, -5.1593F, -3.2011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -2.3989F, 0.3475F, -0.1736F, 0.0184F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(62, 45).addBox(0.4777F, -2.7086F, 1.2264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -2.3989F, 0.2431F, 0.1562F, -0.0166F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 52).addBox(0.4777F, -4.9797F, -1.073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -2.3989F, -0.5773F, 0.1562F, -0.0166F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(53, 65).addBox(0.4777F, -3.7176F, 1.5107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -2.3989F, 0.3827F, 0.1562F, -0.0166F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 29).addBox(-1.4249F, -0.1661F, 0.3946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 5.3261F, 1.1011F, -1.0908F, -0.3335F, 0.1549F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 52).addBox(-1.4249F, -0.1312F, 0.3029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 5.3261F, 1.1011F, -0.9861F, -0.3335F, 0.1549F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(6, 58).addBox(0.2869F, -1.5459F, 0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.7261F, -2.7989F, -2.3194F, -0.3567F, 0.0861F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(43, 45).addBox(-0.5915F, -0.3618F, -2.3028F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 3.5261F, -0.6989F, -0.9312F, -0.3411F, 0.1367F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 70).addBox(0.2869F, -0.4547F, -0.7277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0632F, 1.7261F, -2.7989F, -0.6526F, -0.3567F, 0.0861F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(61, 38).addBox(0.2869F, -1.2366F, -1.9006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.7261F, -2.7989F, -1.2547F, -0.3567F, 0.0861F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 29).addBox(0.4368F, -0.0379F, -3.5729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.6261F, -2.3989F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.0074F, -0.2693F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -0.5F, -3.7F, 0.0419F, 0.0114F, -0.0044F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 29).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0721F, -0.6261F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 54).addBox(-1.0F, 0.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 4).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(53, 35).addBox(-1.9F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 0.1F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, 0.0181F, -0.9346F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 63).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(53, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 43).addBox(-1.9F, -0.0158F, -1.0373F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.0811F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(62, 60).addBox(-1.9F, -4.0981F, -0.0536F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(8, 62).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.3189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(32, 50).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.2354F, -1.1811F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(41, 0).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -0.5F, -3.7F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0721F, -0.6261F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(52, 13).addBox(-1.0F, 0.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 17).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 52).addBox(-0.1F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 0.1F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.0181F, -0.9346F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -5.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(67, 37).addBox(-0.1F, -0.0158F, -1.0373F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.0811F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 2).addBox(-0.1F, -4.0981F, -0.0536F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 57).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.3189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(15, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.2354F, -1.1811F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(39, 27).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 1.0647F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(33, 37).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, 4.8F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r68 = tail.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 4.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(20, 81).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1925F, 7.0992F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 81).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3454F, 9.1816F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(81, 42).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4007F, 11.2424F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 81).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9678F, 13.195F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(82, 9).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5468F, 15.1528F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 74).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4504F, 1.2005F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(81, 56).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2349F, 5.06F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(75, 75).addBox(0.0F, -1.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8867F, 2.9343F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 71).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(65, 71).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(22, 76).addBox(0.0F, -3.711F, -0.0155F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 13.9F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(25, 76).addBox(0.0F, -4.1377F, 0.0832F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 11.8F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(68, 72).addBox(0.0F, -4.3679F, 0.082F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 9.8F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 73).addBox(0.0F, -4.3016F, -0.0192F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 7.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 73).addBox(0.0F, -4.3317F, -0.0134F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 5.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 4).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 5.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 14.9F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r85 = tail2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(73, 81).addBox(0.0F, -1.5108F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 11.1496F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(76, 81).addBox(0.0F, -2.0298F, -0.0644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0885F, 9.0496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(81, 71).addBox(0.0F, -1.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5205F, 2.3716F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(63, 81).addBox(0.0F, -2.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3063F, 4.422F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(81, 18).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9982F, 6.4382F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 5).addBox(0.0F, -1.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.69F, 8.4544F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(81, 1).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.006F, 10.3337F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(41, 0).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.187F, 12.7242F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(51, 80).addBox(0.0F, -2.3383F, -0.0859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1885F, 7.0496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(60, 80).addBox(0.0F, -2.6578F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1885F, 4.9496F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(68, 80).addBox(0.0F, -3.0307F, -0.0974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2786F, 3.0525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(71, 76).addBox(0.0F, -3.62F, 0.0438F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4487F, 0.8398F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(28, 27).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.9F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r98 = tail3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 25).addBox(0.0F, -1.2081F, 0.0034F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 6.9004F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 52).addBox(0.0F, -1.3744F, -0.0978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 5.0004F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(39, 27).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9494F, 2.82F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(69, 63).addBox(0.0F, -1.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6694F, 6.8551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8094F, 4.8376F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 19).addBox(0.0F, -1.4477F, 0.0009F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 2.9004F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(59, 48).addBox(0.0F, -1.5174F, -0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 0.9004F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.9004F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition cube_r105 = tail4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(24, 58).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 25).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3103F, 3.1875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(18, 58).addBox(0.0F, -1.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5653F, 1.1937F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 58).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(67, 32).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, -0.925F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 7.9F, -0.1063F, -0.1736F, 0.0184F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0403F, 0.0116F, -0.0204F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(40, 11).addBox(0.0F, -3.6586F, 0.0534F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8876F, -1.757F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 63).addBox(0.0F, -3.2677F, -0.0777F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8454F, -3.6177F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(42, 73).addBox(0.0F, -3.1215F, -0.0896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7264F, -5.5915F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(45, 74).addBox(0.0F, -3.2577F, 0.026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -7.6F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 74).addBox(0.0F, -3.0829F, -0.1344F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -9.4F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 74).addBox(0.0F, -2.9667F, -6.1256F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.4F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5F, -0.0486F, -0.0015F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -11.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -1.0557F, -0.0623F, -0.4811F, -1.0495F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -1.0557F, -0.2488F, -0.3481F, -0.5943F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.843F, -2.9557F, -0.021F, -0.418F, -0.9959F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.843F, -2.9557F, -0.1843F, -0.3076F, -0.5435F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.843F, -4.8557F, -0.1461F, -0.1345F, -0.4164F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.843F, -4.8557F, -0.0635F, -0.2455F, -0.8464F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -6.9557F, 0.1091F, -0.0468F, -0.8717F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.643F, -6.9557F, 0.093F, -0.0258F, -0.4356F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -8.9557F, 0.2354F, 0.0405F, -0.4346F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -8.9557F, 0.2102F, 0.0735F, -0.8704F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-6.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.057F, -8.9557F, 0.1601F, 0.1551F, -1.302F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 9).mirror().addBox(-8.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -10.8557F, 0.1987F, 0.2896F, -1.2935F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -10.8557F, 0.3015F, 0.1798F, -0.8588F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -10.8557F, 0.3626F, 0.0988F, -0.4257F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(20, 45).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -1.0557F, -0.0623F, 0.4811F, 1.0495F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -1.0557F, -0.2488F, 0.3481F, 0.5943F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(73, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.843F, -2.9557F, -0.1843F, 0.3076F, 0.5435F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 15).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.843F, -2.9557F, -0.021F, 0.418F, 0.9959F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(54, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -10.8557F, 0.3626F, -0.0988F, 0.4257F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 58).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -10.8557F, 0.3015F, -0.1798F, 0.8588F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 9).addBox(3.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -10.8557F, 0.1987F, -0.2896F, 1.2935F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(75, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -8.9557F, 0.2354F, -0.0405F, 0.4346F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 4).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -8.9557F, 0.2102F, -0.0735F, 0.8704F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(30, 11).addBox(3.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.057F, -8.9557F, 0.1601F, -0.1551F, 1.302F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 8).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -6.9557F, 0.1091F, 0.0468F, 0.8717F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(75, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.643F, -6.9557F, 0.093F, 0.0258F, 0.4356F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(75, 32).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.843F, -4.8557F, -0.0635F, 0.2455F, 0.8464F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(75, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.843F, -4.8557F, -0.1461F, 0.1345F, 0.4164F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(24, 37).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.8F, -5.6F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -12.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 43).mirror().addBox(0.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 7.1804F, -3.0793F, 0.056F, -0.9731F, 0.3309F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(0.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 7.1804F, -3.0793F, -0.0312F, -0.7638F, 0.3302F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-0.3558F, -0.2046F, -0.6786F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1703F, 7.1804F, -3.0793F, 0.1444F, -1.1113F, 0.2888F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-1.0F, 0.43F, 2.4291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 16).addBox(0.0F, 0.43F, 2.4291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7F, -6.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(15, 7).mirror().addBox(-2.0F, -0.0808F, -0.3345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 7).addBox(0.0F, -0.0808F, -0.3345F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7F, -6.8F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.7F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7133F, 5.5087F, -6.2236F, 1.4214F, -0.7026F, -1.2809F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 63).mirror().addBox(-2.2548F, -2.4324F, -5.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.585F, -2.2282F, 0.9035F, -0.2813F, -0.1905F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-0.6725F, -1.2616F, 1.8138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.585F, -2.2282F, 0.4451F, 0.0F, 0.0873F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.6725F, -0.655F, -4.0731F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(11, 41).mirror().addBox(-0.6725F, -0.955F, -4.0731F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.585F, -2.2282F, 0.7592F, 0.0F, 0.0873F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(46, 6).mirror().addBox(-0.6289F, 0.0505F, -0.1533F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.085F, -2.7282F, 0.9687F, 0.0F, 0.0873F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(30, 0).addBox(-1.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 7.1804F, -3.0793F, -0.0312F, 0.7638F, -0.3302F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(33, 43).addBox(-1.3442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 7.1804F, -3.0793F, 0.056F, 0.9731F, -0.3309F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 46).addBox(-0.6442F, -0.2046F, -0.6786F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1703F, 7.1804F, -3.0793F, 0.1444F, 1.1113F, -0.2888F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(15, 80).addBox(0.0F, -2.852F, -0.0294F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.3F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(45, 80).addBox(0.0F, -2.8285F, 0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.1F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 80).addBox(0.0F, -2.7035F, 0.139F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.7F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.743F, -0.6557F, 0.4428F, 0.1345F, -0.4164F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.743F, -0.6557F, 0.3602F, 0.2455F, -0.8464F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(12, 29).mirror().addBox(-9.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.743F, -0.6557F, 0.2243F, 0.3734F, -1.2851F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-8.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -2.3557F, 0.2461F, 0.4403F, -1.2765F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -2.3557F, 0.4086F, 0.2975F, -0.8335F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.943F, -2.3557F, 0.5075F, 0.1624F, -0.4068F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.143F, -3.9557F, 0.2783F, 0.532F, -1.2614F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.143F, -3.9557F, 0.4777F, 0.3679F, -0.8109F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.143F, -3.9557F, 0.5974F, 0.1997F, -0.3906F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(52, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.143F, -3.9557F, 0.5974F, -0.1997F, 0.3906F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(53, 41).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.143F, -3.9557F, 0.4777F, -0.3679F, 0.8109F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 10).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.143F, -3.9557F, 0.2783F, -0.532F, 1.2614F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(50, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -2.3557F, 0.5075F, -0.1624F, 0.4068F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(59, 30).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -2.3557F, 0.4086F, -0.2975F, 0.8335F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 0).addBox(3.1021F, -2.3689F, -0.3751F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.943F, -2.3557F, 0.2461F, -0.4403F, 1.2765F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(72, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.743F, -0.6557F, 0.4428F, -0.1345F, 0.4164F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(12, 29).addBox(3.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.743F, -0.6557F, 0.2243F, -0.3734F, 1.2851F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 68).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.743F, -0.6557F, 0.3602F, -0.2455F, 0.8464F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 62).addBox(-0.3275F, -1.2616F, 1.8138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.4451F, 0.0F, -0.0873F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(15, 63).addBox(-0.3F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7133F, 5.5087F, -6.2236F, 1.4214F, 0.7026F, 1.2809F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(41, 63).addBox(1.2548F, -2.4324F, -5.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.9035F, 0.2813F, 0.1905F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(46, 6).addBox(-0.3711F, 0.0505F, -0.1533F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7275F, 1.085F, -2.7282F, 0.9687F, 0.0F, -0.0873F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(11, 41).addBox(-0.3275F, -0.955F, -4.0731F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.3275F, -0.655F, -4.0731F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7275F, 1.585F, -2.2282F, 0.7592F, 0.0F, -0.0873F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(15, 32).addBox(-0.5F, -0.011F, -0.02F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.8F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(73, 54).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 44).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 6.5F, -5.4F, 0.9599F, 0.0F, -0.1745F));

		PartDefinition cube_r187 = leftArm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(67, 66).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftArm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 63).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6491F, 0.6993F, -0.2799F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r189 = leftArm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(73, 47).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.648F, -0.679F, 0.8465F, -0.48F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(65, 21).addBox(0.0F, 0.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(27, 64).addBox(0.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 5.6F, 1.4F, -1.1865F, 0.3624F, -0.2385F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(11, 55).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.0F, -1.5F, 0.3228F, 0.2204F, 0.5468F));

		PartDefinition cube_r190 = leftArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(67, 14).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftArm3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(60, 66).addBox(-0.4F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(76, 19).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(18, 73).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 20).addBox(-1.0F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 6.5F, -5.4F, 1.0036F, 0.0F, 0.1745F));

		PartDefinition cube_r192 = rightArm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(32, 67).addBox(0.0F, -0.1F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightArm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 45).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6491F, 0.6993F, -0.2799F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r194 = rightArm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(71, 26).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8569F, 2.648F, -0.679F, 0.8465F, 0.48F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(63, 50).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(48, 63).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 5.6F, 1.4F, -1.2308F, -0.3507F, 0.2465F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.0F, -1.5F, 0.2294F, -0.3165F, -0.1985F));

		PartDefinition cube_r195 = rightArm3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 28).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r196 = rightArm3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(66, 55).addBox(-0.6F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.2182F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(75, 43).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.5F, 0.257F, -4.9557F));

		PartDefinition cube_r197 = neck4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(18, 77).addBox(-0.5F, -3.1891F, 1.9381F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -1.8891F, -0.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r198 = neck4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(24, 36).mirror().addBox(-4.1021F, -2.3689F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.8F, 0.1811F, 0.6443F, -1.503F));

		PartDefinition cube_r199 = neck4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(43, 9).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.8F, 0.4546F, 0.5047F, -1.0081F));

		PartDefinition cube_r200 = neck4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.8F, 0.6368F, 0.3328F, -0.5677F));

		PartDefinition cube_r201 = neck4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(41, 6).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, -2.7F, 0.5913F, 0.7853F, -1.0369F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, -2.7F, 0.8798F, 0.5383F, -0.5761F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(41, 6).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.7F, 0.5913F, -0.7853F, 1.0369F));

		PartDefinition cube_r204 = neck4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(39, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.7F, 0.8798F, -0.5383F, 0.5761F));

		PartDefinition cube_r205 = neck4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(24, 36).addBox(3.1021F, -2.3689F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.8F, 0.1811F, -0.6443F, 1.503F));

		PartDefinition cube_r206 = neck4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(43, 9).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.8F, 0.4546F, -0.5047F, 1.0081F));

		PartDefinition cube_r207 = neck4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(20, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.8F, 0.6368F, -0.3328F, 0.5677F));

		PartDefinition cube_r208 = neck4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(43, 52).addBox(-1.0F, 0.017F, -0.2385F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.0F, 0.4887F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.343F, -2.9443F, 0.2882F, -0.0418F, -0.0124F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(33, 37).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1519F, -1.3861F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(13, 14).addBox(0.0F, -0.9072F, -0.2767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 19).addBox(-0.5F, 0.0928F, -0.2767F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4887F, -3.5934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(29, 46).mirror().addBox(-2.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7637F, -2.1123F, 0.41F, 0.475F, -1.0893F));

		PartDefinition cube_r212 = neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(-2.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1452F, -3.9088F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r213 = neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(29, 46).addBox(0.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7637F, -2.1123F, 0.41F, -0.475F, 1.0893F));

		PartDefinition cube_r214 = neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(18, 49).addBox(0.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1452F, -3.9088F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0887F, -3.8934F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, 0.5F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 57).addBox(0.0F, 0.3F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 38).addBox(-0.5F, 1.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.3626F, -3.5573F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.411F, -1.274F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(75, 51).mirror().addBox(-1.9485F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3316F, -3.1159F, 0.4561F, 0.6012F, -1.0218F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(75, 51).addBox(-0.0515F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3316F, -3.1159F, 0.4561F, -0.6012F, 1.0218F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(75, 70).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.411F, -1.274F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0626F, -4.2573F, 0.131F, -0.0433F, -0.0057F));

		PartDefinition cube_r220 = neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(36, 46).addBox(0.0F, 0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.411F, -3.5428F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 7).addBox(0.0F, -1.184F, 0.7966F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 48).addBox(-0.5F, -0.284F, -0.2034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5303F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(41, 58).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5303F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(46, 38).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7831F, -0.227F, -0.384F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.111F, -3.1428F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(0.1F, -0.9589F, -0.9893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 7).addBox(0.9F, -0.9589F, -0.9893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5629F, -5.7864F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(0.1F, -0.9366F, -1.9916F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 73).addBox(0.9F, -0.9366F, -1.9916F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, -3.7864F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(0.0F, -0.9573F, -1.0457F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 20).addBox(1.0F, -0.9573F, -1.0457F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.977F, -2.7885F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(71, 71).mirror().addBox(-1.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(71, 71).addBox(0.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0371F, 0.5136F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(37, 69).mirror().addBox(-1.4F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 69).addBox(0.4F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1371F, 0.5136F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(10, 80).addBox(0.9F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 0.3152F, -3.3717F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(64, 78).mirror().addBox(-0.5F, -1.0307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 78).addBox(0.9F, -1.0307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.6152F, -2.3717F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(32, 73).mirror().addBox(-1.2F, -0.0629F, -1.0265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(32, 73).addBox(0.2F, -0.0629F, -1.0265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1629F, -0.5864F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(42, 45).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(42, 45).addBox(1.34F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -0.5675F, -1.563F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(76, 25).addBox(1.34F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -1.2397F, -0.9144F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(38, 62).addBox(1.34F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -1.2801F, -0.6064F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.5F, -0.8398F, -0.8945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(76, 60).addBox(1.34F, -0.8398F, -0.8945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, -0.4793F, -1.0751F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 78).addBox(0.66F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.6178F, -0.749F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.5F, -2.1F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 0).addBox(0.9F, -2.1F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, -0.533F, -2.3646F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(36, 77).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(36, 77).addBox(0.94F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.72F, -0.8471F, -2.7993F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(36, 77).mirror().addBox(-0.5F, -0.0176F, -0.8842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(36, 77).addBox(0.94F, -0.0176F, -0.8842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.72F, -0.973F, -3.4711F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 10).mirror().addBox(-0.71F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 72).mirror().addBox(-0.82F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 72).addBox(1.26F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 10).addBox(1.15F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 80).addBox(0.94F, -0.6039F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.72F, -1.173F, -2.6711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-0.5F, -0.0241F, -0.9842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(79, 28).addBox(0.94F, -0.0241F, -0.9842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.72F, -1.773F, -2.8711F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-0.5F, -0.2645F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 34).addBox(-0.06F, -0.2645F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.1829F, -7.3803F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-0.5F, -0.2063F, -0.1958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(77, 40).addBox(-0.06F, -0.2063F, -0.1958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.22F, -0.6829F, -7.1803F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(70, 4).addBox(-0.06F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.22F, -0.4633F, -6.5803F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(68, 50).mirror().addBox(-0.5F, -0.2473F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 50).addBox(-0.06F, -0.2473F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9829F, -6.6803F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-0.5F, -0.9912F, -0.0146F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 25).addBox(0.1F, -0.9912F, -0.0146F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.3629F, -4.3864F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 79).addBox(0.74F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.62F, -0.4455F, -3.6992F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(47, 33).mirror().addBox(-0.6F, -0.4F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(47, 33).addBox(-0.2F, -0.4F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -1.7371F, -2.9864F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(18, 58).addBox(-0.6F, -0.9745F, -1.9956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3629F, -5.3864F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(69, 59).addBox(-0.6F, -1.9059F, -1.1951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.3629F, -4.4864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -0.771F, -0.2174F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9841F, -7.9421F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(46, 13).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.6841F, -8.1421F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(3, 69).addBox(-0.5F, -0.8196F, -0.6308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.22F, -0.5633F, -5.8803F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.62F, -1.593F, -0.4815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(80, 13).addBox(-0.5F, -1.3752F, -1.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1629F, -6.4864F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(80, 22).addBox(-0.5F, 0.0175F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5371F, -7.6864F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(70, 9).addBox(-0.5F, 0.0153F, 0.0228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.1371F, -6.8864F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(28, 80).addBox(-0.5F, -0.0377F, -0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0371F, -4.1864F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(33, 80).addBox(-0.5F, 0.0364F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1371F, -4.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(69, 18).addBox(-1.0F, -0.0502F, 0.0219F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -0.2864F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(70, 22).addBox(-1.0F, -0.2679F, -0.1049F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -1.1864F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(60, 11).addBox(-1.0F, -0.0072F, 0.0138F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1371F, -3.1864F, -0.0698F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6629F, -1.2864F, 0.0002F, -0.0016F, 0.0113F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(78, 53).addBox(-0.5F, -0.0097F, 0.0471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9878F, -6.1687F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(78, 66).addBox(-0.5F, -1.2624F, -1.1145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3122F, -6.2687F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(44, 58).mirror().addBox(-1.2F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(44, 58).addBox(0.2F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9878F, -3.4687F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(17, 69).mirror().addBox(-0.8F, 0.0032F, -1.4674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 69).addBox(0.8F, 0.0032F, -1.4674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2878F, -0.5687F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(18, 31).mirror().addBox(0.0F, -0.0235F, -1.0163F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 31).addBox(0.8F, -0.0235F, -1.0163F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3531F, -4.2018F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.01F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 39).addBox(0.81F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.6531F, -3.3018F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(12, 31).mirror().addBox(0.1F, 0.0393F, -0.0253F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 31).addBox(1.1F, 0.0393F, -0.0253F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.1531F, -2.2018F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(78, 75).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, -0.4212F, -5.8992F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5F, -0.7F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4876F, -4.8964F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(77, 63).addBox(-0.5F, 0.0174F, -1.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1876F, -4.5964F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(78, 47).addBox(-0.5F, -0.0038F, -1.0431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0876F, -3.5964F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4876F, -4.8964F, 0.0785F, 0.0F, 0.0F));

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