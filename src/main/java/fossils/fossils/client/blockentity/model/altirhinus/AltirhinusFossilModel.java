package fossils.fossils.client.blockentity.model.altirhinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AltirhinusFossilModel extends SkullModelBase {
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
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public AltirhinusFossilModel(ModelPart root) {
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
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.3F, -3.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 83).addBox(0.0F, -3.1696F, -0.0049F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0502F, 2.1438F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 83).addBox(0.0F, -3.1583F, -0.1462F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1973F, 0.2939F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 83).addBox(0.0F, -3.4492F, 0.028F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9973F, -1.9061F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 83).addBox(0.0F, -3.4211F, -0.031F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0846F, -3.8086F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-0.7955F, 0.7809F, -0.4328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(25, 81).mirror().addBox(-0.7955F, -0.0191F, -1.1328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 84).mirror().addBox(-0.7955F, -0.0191F, -1.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.6294F, -0.3419F, -7.5634F, 0.1933F, 0.1953F, -0.076F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-1.1773F, -0.4245F, -2.748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.0261F, -6.6989F, 0.4289F, 0.1953F, -0.076F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-1.7648F, -0.1821F, -3.8059F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.5739F, -4.9989F, 0.1642F, 0.1736F, -0.0184F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1504F, 0.4642F, -3.9368F, 0.1409F, 0.1953F, -0.076F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6294F, 0.7581F, -6.4634F, -0.3391F, 0.1953F, -0.076F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 13).mirror().addBox(-0.5368F, -0.2874F, -3.4823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.0261F, -3.3989F, -0.0424F, 0.1953F, -0.076F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.5368F, 2.8817F, -5.1308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.0261F, -3.3989F, -0.7056F, 0.1953F, -0.076F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.6088F, -0.4133F, -0.4549F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.9261F, -1.4989F, -0.7229F, 0.3166F, -0.1003F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-1.3552F, -0.404F, -0.7596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.6261F, -3.4989F, -0.6007F, 0.3166F, -0.1003F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-0.5368F, -0.225F, -1.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.0261F, -3.3989F, -0.1558F, 0.1953F, -0.076F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 77).mirror().addBox(-0.9051F, -3.6436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -0.3989F, -0.0016F, 0.1736F, -0.0184F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-0.9051F, -5.1593F, -3.2011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -0.3989F, 0.3475F, 0.1736F, -0.0184F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-1.4139F, 1.0739F, 0.2782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.8739F, 0.3011F, 0.0842F, -0.1517F, 0.041F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-1.4139F, -1.7066F, 1.0466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.8739F, 0.3011F, -0.7362F, -0.1517F, 0.041F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 3).mirror().addBox(-1.4139F, -0.1039F, 0.0453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.8739F, 0.3011F, 0.2238F, -0.1517F, 0.041F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.1306F, -1.3225F, 5.7406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5632F, 5.7261F, 3.3011F, -0.8489F, 0.0971F, -0.0749F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-0.1306F, -0.7214F, 0.009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5632F, 5.7261F, 3.3011F, -0.7442F, 0.0971F, -0.0749F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.9565F, -1.3968F, 0.2372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.4261F, 0.1011F, -2.3194F, 0.3567F, -0.0861F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.9769F, -0.4528F, -0.6299F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.7261F, 0.1011F, -0.7091F, 0.3618F, -0.06F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.9565F, -0.1046F, -1.514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.4261F, 0.1011F, -0.6526F, 0.3567F, -0.0861F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(-0.9565F, -0.5027F, -2.3503F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.4261F, 0.1011F, -1.2547F, 0.3567F, -0.0861F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-1.4368F, -0.1288F, -4.1489F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.4261F, 0.1011F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-0.4368F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-1.4368F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(11, 29).addBox(2.5632F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(4.5632F, -4.1106F, -3.1363F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -0.3989F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 26).addBox(0.7648F, -0.1821F, -3.8059F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.5739F, -4.9989F, 0.1642F, -0.1736F, 0.0184F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 11).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1504F, 0.4642F, -3.9368F, 0.1409F, -0.1953F, 0.076F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 41).addBox(-0.2045F, 0.7809F, -0.4328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(25, 81).addBox(-0.2045F, -0.0191F, -1.1328F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 84).addBox(-0.2045F, -0.0191F, -1.6328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.6294F, -0.3419F, -7.5634F, 0.1933F, -0.1953F, 0.076F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 8).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6294F, 0.7581F, -6.4634F, -0.3391F, -0.1953F, 0.076F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 0).addBox(0.1773F, -0.4245F, -2.748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9632F, 1.0261F, -6.6989F, 0.4289F, -0.1953F, 0.076F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 13).addBox(-0.4632F, -0.2874F, -3.4823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9632F, 1.0261F, -3.3989F, -0.0424F, -0.1953F, 0.076F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(71, 32).addBox(-0.4632F, 2.8817F, -5.1308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9632F, 1.0261F, -3.3989F, -0.7056F, -0.1953F, 0.076F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 6).addBox(-0.3912F, -0.4133F, -0.4549F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0632F, 2.9261F, -1.4989F, -0.7229F, -0.3166F, 0.1003F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 29).addBox(0.3552F, -0.404F, -0.7596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.0632F, 1.6261F, -3.4989F, -0.6007F, -0.3166F, 0.1003F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(77, 35).addBox(-0.4632F, -0.225F, -1.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 1.0261F, -3.3989F, -0.1558F, -0.1953F, 0.076F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(62, 77).addBox(-0.0949F, -3.6436F, -4.6593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -0.3989F, -0.0016F, -0.1736F, 0.0184F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 40).addBox(-0.0949F, -5.1593F, -3.2011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0632F, 1.0261F, -0.3989F, 0.3475F, -0.1736F, 0.0184F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(24, 69).addBox(0.4139F, 1.0739F, 0.2782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0632F, -2.8739F, 0.3011F, 0.0842F, 0.1517F, -0.041F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(41, 77).addBox(0.4139F, -1.7066F, 1.0466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.8739F, 0.3011F, -0.7362F, 0.1517F, -0.041F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 3).addBox(0.4139F, -0.1039F, 0.0453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, -2.8739F, 0.3011F, 0.2238F, 0.1517F, -0.041F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(73, 64).addBox(-0.8694F, -1.3225F, 5.7406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5632F, 5.7261F, 3.3011F, -0.8489F, -0.0971F, 0.0749F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(28, 43).addBox(-0.8694F, -0.7214F, 0.009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5632F, 5.7261F, 3.3011F, -0.7442F, -0.0971F, 0.0749F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(83, 76).addBox(-0.0435F, -1.3968F, 0.2372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.4261F, 0.1011F, -2.3194F, -0.3567F, 0.0861F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(27, 51).addBox(-0.0231F, -0.4528F, -0.6299F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 2.7261F, 0.1011F, -0.7091F, -0.3618F, 0.06F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(77, 50).addBox(-0.0435F, -0.1046F, -1.514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0632F, 2.4261F, 0.1011F, -0.6526F, -0.3567F, 0.0861F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 68).addBox(-0.0435F, -0.5027F, -2.3503F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.4261F, 0.1011F, -1.2547F, -0.3567F, 0.0861F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 0).addBox(0.4368F, -0.1288F, -4.1489F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.4261F, 0.1011F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.0074F, -0.2693F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -0.5F, -0.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(79, 26).addBox(-0.5F, 3.5463F, -0.796F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 53).addBox(-1.0F, -0.7268F, -0.59F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 20).addBox(-1.0F, 2.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(13, 17).addBox(-1.0F, 3.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(61, 34).addBox(-1.9F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7F, 0.1F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 55).addBox(0.7F, -0.3854F, -0.7392F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5354F, 0.4189F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(24, 64).addBox(-1.9F, 3.764F, -0.7905F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.2811F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 71).addBox(-1.9F, -0.0574F, -0.8417F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.2811F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(57, 71).addBox(-1.9F, -4.0981F, -0.0536F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 45).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.3189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(55, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 13.1354F, -1.4811F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(39, 27).addBox(-2.0F, -1.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -0.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(17, 39).addBox(-2.0F, -1.3F, -3.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -0.5F, -0.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(50, 4).addBox(-0.5F, 3.5463F, -0.796F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -0.7268F, -0.59F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 37).addBox(-1.0F, 2.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 3.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(58, 58).addBox(-0.1F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7F, 0.1F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 53).addBox(-1.7F, -0.3854F, -0.7392F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5354F, 0.4189F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(63, 24).addBox(-0.1F, 3.764F, -0.7905F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.2811F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(64, 71).addBox(-0.1F, -0.0574F, -0.8417F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1354F, -0.2811F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 69).addBox(-0.1F, -4.0981F, -0.0536F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.1354F, -0.9811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 64).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.3189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(15, 4).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 13.1354F, -1.4811F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -1.0319F, -3.2504F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -0.4F, 0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(32, 36).addBox(-2.0F, -1.3F, -3.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, -0.9234F, 0.0096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.5F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(48, 87).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9234F, 4.0096F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 85).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4691F, 7.1088F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 85).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.622F, 9.1912F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 83).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6772F, 11.252F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(88, 29).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2444F, 13.2046F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 36).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8233F, 15.1624F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(36, 83).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7269F, 1.2101F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(45, 87).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5114F, 5.0696F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 79).addBox(0.0F, -1.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1633F, 2.9439F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(64, 83).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8234F, 2.0096F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(39, 83).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8234F, 0.0096F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.111F, -0.0155F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1234F, 13.9096F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(87, 63).addBox(0.0F, -2.2377F, 0.0832F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1234F, 11.8096F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 87).addBox(0.0F, -2.3679F, 0.082F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1234F, 9.8096F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 88).addBox(0.0F, -2.4016F, -0.0192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1234F, 7.9096F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, -2.7317F, -0.0134F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9234F, 5.9096F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(17, 4).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5234F, 5.0096F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7234F, 14.9096F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 88).addBox(0.0F, -1.2108F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0108F, 11.1147F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 88).addBox(0.0F, -1.4298F, -0.0644F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9108F, 9.0147F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 55).addBox(0.0F, -1.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5211F, 2.3367F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(18, 56).addBox(0.0F, -2.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3069F, 4.3871F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(11, 88).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9988F, 6.4033F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(14, 88).addBox(0.0F, -1.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6906F, 8.4195F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(17, 88).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0066F, 10.2988F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 88).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1876F, 12.6893F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 88).addBox(0.0F, -1.7383F, -0.0859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8108F, 7.0147F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(88, 72).addBox(0.0F, -1.6578F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8108F, 4.9147F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(88, 76).addBox(0.0F, -1.5307F, -0.0974F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7207F, 3.0176F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(89, 11).addBox(0.0F, -1.92F, 0.0438F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5507F, 0.8049F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3994F, -0.0349F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9994F, 11.8651F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 89).addBox(0.0F, -1.2081F, 0.0034F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 6.9004F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 8).addBox(0.0F, -1.0744F, -0.0978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 5.0004F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(39, 27).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9494F, 2.82F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(21, 68).addBox(0.0F, -1.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6694F, 6.8551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(40, 13).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8094F, 4.8376F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, -1.0477F, 0.0009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 2.9004F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 80).addBox(0.0F, -1.3174F, -0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 0.9004F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.9004F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(70, 29).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(89, 22).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 66).addBox(0.0F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3103F, 3.1875F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, -1.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5653F, 1.1937F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 33).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(88, 84).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, -0.925F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 7.9F, -0.2288F, 0.1275F, -0.0296F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -4.8F, -0.1747F, -0.043F, 0.0076F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(48, 78).addBox(0.0F, -3.0942F, -0.1039F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1801F, -0.812F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(23, 84).addBox(0.0F, -3.0481F, -4.0948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1801F, 1.188F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(20, 82).addBox(0.0F, -2.6956F, -6.0802F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1801F, 1.188F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(29, 84).addBox(0.0F, -4.1245F, 3.8354F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5199F, -10.612F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(48, 20).addBox(0.0F, -3.2597F, 1.8985F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5199F, -10.612F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(32, 84).addBox(0.0F, -2.5884F, -0.0861F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5199F, -10.612F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5F, -0.0486F, -0.0015F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -11.612F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 10).mirror().addBox(-3.0328F, -1.2084F, 0.0514F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3801F, -0.612F, 0.0629F, -0.2662F, -1.0955F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-2.3819F, -0.2404F, -0.0932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3801F, -0.612F, -0.0426F, -0.2051F, -0.6509F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(82, 33).mirror().addBox(-2.3434F, -0.313F, -0.2131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2199F, -2.412F, -0.0167F, -0.2046F, -0.5861F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(82, 35).mirror().addBox(-3.9751F, -1.2599F, -0.0716F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2199F, -2.412F, 0.0864F, -0.2549F, -1.0315F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-2.4508F, -0.2133F, -0.4629F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.4106F, 0.1203F, -0.4204F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-4.1297F, -1.2176F, -0.3128F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.3365F, 0.2193F, -0.8519F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-11.2282F, -2.8488F, -0.3128F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.2139F, 0.3399F, -1.2888F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-2.4649F, -0.1801F, -0.4461F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.3466F, 0.0916F, -0.4272F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-4.1553F, -1.1931F, -0.2947F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.2899F, 0.1666F, -0.8608F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-7.2617F, -2.8375F, -0.2947F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.1937F, 0.2728F, -1.2949F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-5.1588F, -1.1531F, -0.0466F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4199F, -6.412F, 0.154F, 0.0067F, -0.8726F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-2.4668F, -0.1389F, -0.1982F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4199F, -6.412F, 0.1563F, 0.0037F, -0.4363F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-4.2743F, -1.0724F, -0.1624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1199F, -4.412F, 0.0865F, -0.0735F, -0.8704F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-2.5306F, -0.0189F, -0.3199F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1199F, -4.412F, 0.0613F, -0.0405F, -0.4346F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 10).addBox(2.0328F, -1.2084F, 0.0514F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3801F, -0.612F, 0.0629F, 0.2662F, 1.0955F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(30, 82).addBox(0.3819F, -0.2404F, -0.0932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3801F, -0.612F, -0.0426F, 0.2051F, 0.6509F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(82, 33).addBox(0.3434F, -0.313F, -0.2131F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2199F, -2.412F, -0.0167F, 0.2046F, 0.5861F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 35).addBox(1.9751F, -1.2599F, -0.0716F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2199F, -2.412F, 0.0864F, 0.2549F, 1.0315F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 39).addBox(0.4508F, -0.2133F, -0.4629F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.4106F, -0.1203F, 0.4204F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 50).addBox(2.1297F, -1.2176F, -0.3128F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.3365F, -0.2193F, 0.8519F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(45, 35).addBox(3.2282F, -2.8488F, -0.3128F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1199F, -10.112F, 0.2139F, -0.3399F, 1.2888F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 2).addBox(0.4649F, -0.1801F, -0.4461F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.3466F, -0.0916F, 0.4272F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(72, 0).addBox(2.1553F, -1.1931F, -0.2947F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.2899F, -0.1666F, 0.8608F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 10).addBox(3.2617F, -2.8375F, -0.2947F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -8.212F, 0.1937F, -0.2728F, 1.2949F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 21).addBox(2.1588F, -1.1531F, -0.0466F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4199F, -6.412F, 0.154F, -0.0067F, 0.8726F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 58).addBox(0.4668F, -0.1389F, -0.1982F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4199F, -6.412F, 0.1563F, -0.0037F, 0.4363F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(82, 68).addBox(2.2743F, -1.0724F, -0.1624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1199F, -4.412F, 0.0865F, 0.0735F, 0.8704F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 0).addBox(0.5306F, -0.0189F, -0.3199F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1199F, -4.412F, 0.0613F, 0.0405F, 0.4346F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(41, 2).addBox(-0.5F, -0.3164F, -8.9828F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1801F, 3.088F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2199F, -11.712F, 0.3406F, -0.0411F, -0.0146F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.6543F, -0.0247F, -0.5768F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 13.1F, -4.0F, -0.2413F, -0.8933F, 0.4458F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(86, 19).mirror().addBox(-0.2638F, -1.0864F, -0.9932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7151F, 0.6847F, 0.5863F, 1.3014F, 0.0269F, 0.083F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.2947F, -1.0078F, -0.9928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7151F, 1.2847F, 1.2863F, 0.8651F, 0.0269F, 0.083F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(43, 37).mirror().addBox(-0.6347F, 0.0634F, 0.057F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 44).mirror().addBox(-0.6347F, -0.2366F, 0.057F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 3.485F, -5.0282F, 0.4462F, 0.0269F, 0.083F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-2.4381F, -0.2773F, -0.7071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1404F, -0.0037F, -0.4363F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-4.1067F, -1.2737F, -0.5581F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1427F, -0.0067F, -0.8726F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-12.1836F, -2.89F, -0.5581F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1323F, 0.0541F, -1.3049F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-2.459F, -0.1896F, -0.423F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.2592F, 0.0515F, -0.4335F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-4.1445F, -1.1989F, -0.2721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.2271F, 0.0935F, -0.869F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-11.2495F, -2.8381F, -0.2721F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.1672F, 0.1803F, -1.3008F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-0.6543F, -0.0247F, -0.6768F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 13.1F, -4.0F, -0.3175F, -1.1467F, 0.5751F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-0.5567F, 0.0191F, -0.8857F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 12.9F, -4.8F, -0.0242F, -1.237F, 0.5564F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-1.0F, 0.3961F, 2.7272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 17).addBox(0.0F, 0.3961F, 2.7272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1F, -8.8F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-2.0F, -0.176F, -0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 20).addBox(0.0F, -0.176F, -0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1F, -8.8F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-2.4418F, -0.2395F, -0.5079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.3706F, 0.1024F, -0.4249F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-4.1134F, -1.2383F, -0.3586F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.3073F, 0.1864F, -0.8578F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(-9.2046F, -2.8607F, -0.3586F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.2012F, 0.298F, -1.2928F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(81, 81).mirror().addBox(-2.4501F, -0.1766F, -0.2073F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.2037F, 0.0258F, -0.4356F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(15, 2).mirror().addBox(-12.2428F, -2.8146F, -0.0573F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.1508F, 0.1214F, -1.3033F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-4.1285F, -1.1805F, -0.0573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.1876F, 0.0468F, -0.8717F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(29, 27).mirror().addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7151F, 2.8847F, -1.4137F, 0.3764F, 0.0269F, 0.083F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-3.0475F, -2.5882F, -2.2148F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7133F, 7.9087F, -6.8236F, 1.4214F, -0.7026F, -1.2809F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-2.6899F, -3.6916F, -7.634F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 3.985F, -2.8282F, 0.9035F, -0.2813F, -0.1905F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(37, 45).mirror().addBox(-0.5388F, -0.1512F, -1.9043F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 2.685F, -3.9282F, 0.5334F, 0.0269F, 0.083F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-0.6173F, -0.0232F, -4.0076F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 3.285F, -5.1282F, 0.6545F, 0.0F, 0.0873F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.6783F, -1.8123F, -5.1959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 3.985F, -2.8282F, 0.7592F, 0.0F, 0.0873F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 0).addBox(-0.3457F, -0.0247F, -0.5768F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 13.1F, -4.0F, -0.2413F, 0.8933F, -0.4458F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 20).addBox(-0.3457F, -0.0247F, -0.6768F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 13.1F, -4.0F, -0.3175F, 1.1467F, -0.5751F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(9, 46).addBox(-0.4433F, 0.0191F, -0.8857F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.9F, -4.8F, -0.0242F, 1.237F, -0.5564F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(11, 28).addBox(0.0F, -2.8291F, -0.0819F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(15, 0).addBox(3.1836F, -2.89F, -0.5581F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1323F, -0.0541F, 1.3049F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(77, 60).addBox(2.1067F, -1.2737F, -0.5581F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1427F, 0.0067F, 0.8726F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(50, 73).addBox(0.4381F, -0.2773F, -0.7071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.2F, 0.1404F, 0.0037F, 0.4363F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(42, 85).addBox(0.0F, -2.8291F, -0.0819F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(56, 85).addBox(0.0F, -3.851F, 3.0048F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -7.4F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(59, 85).addBox(0.0F, -2.5522F, 1.4345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -7.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 0).addBox(3.2495F, -2.8381F, -0.2721F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.1672F, -0.1803F, 1.3008F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(80, 4).addBox(2.1445F, -1.1989F, -0.2721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.2271F, -0.0935F, 0.869F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(78, 72).addBox(0.459F, -0.1896F, -0.423F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.7F, 0.2592F, -0.0515F, 0.4335F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 74).addBox(0.4418F, -0.2395F, -0.5079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.3706F, -0.1024F, 0.4249F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(81, 79).addBox(2.1134F, -1.2383F, -0.3586F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.3073F, -0.1864F, 0.8578F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(18, 46).addBox(3.2046F, -2.8607F, -0.3586F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -5.6F, 0.2012F, -0.298F, 1.2928F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(81, 81).addBox(0.4501F, -0.1766F, -0.2073F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.2037F, -0.0258F, 0.4356F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 2).addBox(3.2428F, -2.8146F, -0.0573F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.1508F, -0.1214F, 1.3033F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(82, 12).addBox(2.1285F, -1.1805F, -0.0573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -2.2F, 0.1876F, -0.0468F, 0.8717F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 19).addBox(-0.7362F, -1.0864F, -0.9932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7151F, 0.6847F, 0.5863F, 1.3014F, -0.0269F, -0.083F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(86, 26).addBox(-0.7053F, -1.0078F, -0.9928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7151F, 1.2847F, 1.2863F, 0.8651F, -0.0269F, -0.083F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(29, 27).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7151F, 2.8847F, -1.4137F, 0.3764F, -0.0269F, -0.083F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(72, 24).addBox(2.0475F, -2.5882F, -2.2148F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7133F, 7.9087F, -6.8236F, 1.4214F, 0.7026F, 1.2809F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 61).addBox(1.6899F, -3.6916F, -7.634F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 3.985F, -2.8282F, 0.9035F, 0.2813F, 0.1905F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(37, 45).addBox(-0.4612F, -0.1512F, -1.9043F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7275F, 2.685F, -3.9282F, 0.5334F, -0.0269F, -0.083F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 44).addBox(-0.3653F, -0.2366F, 0.057F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(43, 37).addBox(-0.3653F, 0.0634F, 0.057F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7275F, 3.485F, -5.0282F, 0.4462F, -0.0269F, -0.083F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(57, 52).addBox(-0.3827F, -0.0232F, -4.0076F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7275F, 3.285F, -5.1282F, 0.6545F, 0.0F, -0.0873F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(25, 58).addBox(-0.3217F, -1.8123F, -5.1959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7275F, 3.985F, -2.8282F, 0.7592F, 0.0F, -0.0873F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, -0.079F, 0.2311F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.4F, -6.5F, 0.3752F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 9.7F, -7.5F, -0.3927F, 0.0F, -0.1745F));

		PartDefinition cube_r203 = leftArm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -0.7F, -1.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftArm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(81, 18).addBox(-1.0F, -0.0619F, -0.9672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 5.7F, 1.7F, 0.3438F, 0.0563F, -0.0106F));

		PartDefinition cube_r205 = leftArm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 81).addBox(-1.0F, -0.0619F, -0.9672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 5.7F, 1.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 44).addBox(-0.6744F, -0.4886F, -0.3818F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, -0.8F, 0.0F, -0.3252F, -0.478F, 0.0453F));

		PartDefinition cube_r207 = leftArm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(9, 46).addBox(-0.6744F, 1.6794F, -3.2295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.8F, 0.0F, 0.7482F, -0.478F, 0.0453F));

		PartDefinition cube_r208 = leftArm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(52, 27).addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 48).addBox(-1.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.8F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(10, 64).addBox(-0.3523F, -0.3843F, 0.2318F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(35, 63).addBox(-0.3523F, -0.3843F, -0.8682F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 7.5F, 1.3F, -0.2289F, 0.5701F, 0.0983F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1523F, 7.8157F, -0.6682F, 0.2431F, 0.3063F, 0.2431F));

		PartDefinition cube_r209 = leftArm3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(73, 46).addBox(-0.7F, 0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 9.7F, -7.5F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r211 = rightArm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(72, 51).addBox(0.0F, -0.7F, -1.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightArm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(10, 81).addBox(0.0F, -0.0619F, -0.9672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 5.7F, 1.7F, 0.3438F, -0.0563F, 0.0106F));

		PartDefinition cube_r213 = rightArm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(15, 81).addBox(0.0F, -0.0619F, -0.9672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 5.7F, 1.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightArm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(37, 43).addBox(-0.3256F, -0.4886F, -0.3818F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, -0.8F, 0.0F, -0.3252F, 0.478F, -0.0453F));

		PartDefinition cube_r215 = rightArm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(20, 29).addBox(-0.3256F, 1.6794F, -3.2295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.8F, 0.0F, 0.7482F, 0.478F, -0.0453F));

		PartDefinition cube_r216 = rightArm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(30, 4).addBox(-0.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 47).addBox(0.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.8F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(5, 63).addBox(-0.6477F, -0.3843F, 0.2318F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 63).addBox(-0.6477F, -0.3843F, -0.8682F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 7.5F, 1.3F, -0.7344F, -0.4728F, 0.1272F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1523F, 7.8157F, -0.6682F, 0.303F, -0.2472F, -0.4615F));

		PartDefinition cube_r217 = rightArm3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(13, 73).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightArm3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(31, 73).addBox(-0.3F, 0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(80, 54).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.557F, -5.9557F, -0.1839F, 0.0858F, -0.0159F));

		PartDefinition cube_r219 = neck5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(26, 85).addBox(-0.5F, -3.015F, 1.7678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.4F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0768F, -0.0358F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(-3.7904F, -0.8686F, -0.4958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7F, -3.0F, 0.5552F, 0.7399F, -1.0619F));

		PartDefinition cube_r222 = neck5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(80, 66).mirror().addBox(-1.986F, -0.0406F, -0.6196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7F, -3.0F, 0.8295F, 0.5092F, -0.6012F));

		PartDefinition cube_r223 = neck5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(-7.047F, -2.3563F, -0.2643F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -1.3F, 0.1741F, 0.5572F, -1.5069F));

		PartDefinition cube_r224 = neck5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(81, 62).mirror().addBox(-3.7573F, -0.8478F, -0.2643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -1.3F, 0.4034F, 0.4303F, -1.0312F));

		PartDefinition cube_r225 = neck5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-1.9617F, -0.0324F, -0.3862F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8F, -1.3F, 0.5602F, 0.285F, -0.591F));

		PartDefinition cube_r226 = neck5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(80, 48).addBox(1.7904F, -0.8686F, -0.4958F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.0F, 0.5552F, -0.7399F, 1.0619F));

		PartDefinition cube_r227 = neck5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(80, 66).addBox(-0.014F, -0.0406F, -0.6196F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.0F, 0.8295F, -0.5092F, 0.6012F));

		PartDefinition cube_r228 = neck5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(46, 45).addBox(3.047F, -2.3563F, -0.2643F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.3F, 0.1741F, -0.5572F, 1.5069F));

		PartDefinition cube_r229 = neck5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 62).addBox(1.7573F, -0.8478F, -0.2643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.3F, 0.4034F, -0.4303F, 1.0312F));

		PartDefinition cube_r230 = neck5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(64, 81).addBox(-0.0383F, -0.0324F, -0.3862F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.3F, 0.5602F, -0.285F, 0.591F));

		PartDefinition cube_r231 = neck5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(18, 56).addBox(-1.0F, -0.1596F, -0.1446F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.4F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.043F, -3.4443F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(30, 8).addBox(0.0F, -1.6448F, 2.8627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 61).addBox(0.0F, -1.1975F, 0.8876F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 48).addBox(-0.5F, -0.1975F, -0.1124F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-4.5253F, 0.9037F, 1.2445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, 0.3747F, 0.4129F, -1.1044F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-3.1662F, 0.0621F, 0.0094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, 0.3837F, 0.4615F, -1.083F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(80, 10).addBox(2.5253F, 0.9037F, 1.2445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, 0.3747F, -0.4129F, 1.1044F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(9, 44).addBox(1.1662F, 0.0621F, 0.0094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, 0.3837F, -0.4615F, 1.083F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7132F, -4.4827F, -0.3765F, 0.0812F, -0.0321F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(54, 20).addBox(-0.5F, -0.4933F, 0.9738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 57).addBox(-0.5F, -0.6933F, 2.9738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 55).addBox(-1.0F, 0.0067F, -0.0262F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.046F, -2.9785F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-3.3202F, 0.6221F, -0.6484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.046F, -2.9785F, 0.4344F, 0.5714F, -1.0337F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-5.0194F, 1.5348F, 0.3283F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.046F, -2.9785F, 0.4023F, 0.4923F, -1.0745F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(83, 6).addBox(1.3202F, 0.6221F, -0.6484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.046F, -2.9785F, 0.4344F, -0.5714F, 1.0337F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(83, 14).addBox(3.0194F, 1.5348F, 0.3283F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.046F, -2.9785F, 0.4023F, -0.4923F, 1.0745F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5975F, -3.0619F, -0.1262F, 0.1354F, 0.0265F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(45, 37).addBox(0.0F, -0.9663F, -0.0766F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 66).addBox(-0.5F, -0.0663F, -0.0766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.7658F, -2.407F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-3.2652F, 0.2838F, 0.1111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7658F, -2.407F, 0.2625F, 0.4777F, -1.2043F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(27, 51).addBox(2.2652F, 0.2838F, 0.1111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7658F, -2.407F, 0.2625F, -0.4777F, 1.2043F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(52, 37).addBox(0.0F, -1.1009F, 1.8627F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7658F, -2.407F, -0.6632F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5379F, -2.5912F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(66, 55).addBox(-1.0F, -0.9156F, -2.8221F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 0.5762F, 0.0414F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(45, 20).addBox(-0.5F, -1.2911F, -1.3795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5762F, 0.0414F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.1035F, -0.3211F, -0.9366F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5762F, 0.0414F, 0.7276F, 1.0741F, -0.8136F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(21, 63).addBox(-0.8965F, -0.3211F, -0.9366F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5762F, 0.0414F, 0.7276F, -1.0741F, 0.8136F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2721F, -2.0158F, 0.4521F, -0.0449F, 0.0749F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(29, 29).addBox(-0.6F, -0.4F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(15, 85).mirror().addBox(-0.8F, -0.4F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(40, 2).mirror().addBox(-1.1F, -0.4F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(15, 85).addBox(0.0F, -0.4F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(40, 2).addBox(0.3F, -0.4F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -1.4796F, -2.5578F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 20).addBox(1.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9877F, -3.9343F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(13, 14).mirror().addBox(0.1F, -3.6589F, -1.7893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 14).addBox(0.9F, -3.6589F, -1.7893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.8204F, -5.3578F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(0.1F, -3.4366F, -3.3916F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 28).addBox(0.9F, -3.4366F, -3.3916F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.9204F, -3.3578F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(13, 37).mirror().addBox(-0.3F, -0.6884F, 0.0054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(13, 37).addBox(0.3F, -0.6884F, 0.0054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6204F, -4.9578F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(19, 78).mirror().addBox(-0.3F, -0.9832F, -1.5765F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(19, 78).addBox(0.3F, -0.9832F, -1.5765F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0204F, -6.9578F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-0.3F, -0.7094F, -2.3941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(32, 58).addBox(0.3F, -0.7094F, -2.3941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(15, 62).mirror().addBox(-0.4F, -2.0094F, -2.3941F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 62).addBox(0.4F, -2.0094F, -2.3941F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6204F, -4.5578F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.5F, -1.0455F, -1.7974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(5, 73).addBox(0.3F, -1.0455F, -1.7974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 0.7204F, -6.7578F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-0.3F, -0.0087F, -1.6603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 8).addBox(0.1F, -0.0087F, -1.6603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, 0.5204F, -8.8578F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(25, 76).addBox(-0.6F, -1.9059F, -1.1951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.6204F, -4.0578F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-0.5F, -1.0307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 5).addBox(0.9F, -1.0307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.8727F, -1.9431F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-0.5F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 61).addBox(0.5F, -0.3F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.486F, -2.4501F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false)
				.texOffs(56, 32).mirror().addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(56, 32).addBox(-0.4F, -0.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 0).addBox(-0.4F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.3F, 2.2416F, -10.5135F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-1.0F, -0.7956F, -0.2297F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(77, 15).mirror().addBox(-1.0F, -0.7956F, 0.3703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(77, 15).addBox(-0.4F, -0.7956F, 0.3703F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 45).addBox(-0.4F, -0.7956F, -0.2297F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3F, 2.3416F, -8.7135F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-1.0F, -0.771F, -0.2174F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(70, 38).addBox(-0.4F, -0.771F, -0.2174F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 2.5416F, -10.3135F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-1.5F, 0.0305F, 0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(10, 85).addBox(0.54F, 0.0305F, 0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.02F, -0.7155F, -4.0425F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(-1.5F, -0.7236F, -0.6949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(85, 16).addBox(0.54F, -0.7236F, -0.6949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.02F, -0.7155F, -3.2425F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-1.5F, -0.7654F, -1.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 81).addBox(0.54F, -0.7654F, -1.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.02F, -0.9155F, -2.4425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(-1.5F, -0.9823F, -0.9741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 70).addBox(0.54F, -0.9823F, -0.9741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.02F, -0.5155F, -2.0425F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-1.5F, -0.9782F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(5, 85).addBox(0.54F, -0.9782F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.02F, 0.2845F, -2.6425F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-1.165F, -1.0956F, -0.9708F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
				.texOffs(59, 6).mirror().addBox(-1.335F, -1.0956F, -0.9708F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(59, 6).addBox(0.305F, -1.0956F, -0.9708F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(48, 68).addBox(1.135F, -1.0956F, -0.9708F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-0.985F, -0.7402F, -2.9955F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-1.5F, -1.5728F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(0, 84).addBox(0.94F, -1.5728F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.22F, 0.79F, -1.6345F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-1.5F, -5.8296F, -1.6941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 0).addBox(0.94F, -5.8296F, -1.6941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.22F, 4.69F, -3.0345F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-1.5F, -4.1269F, 2.9418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(72, 60).addBox(0.94F, -4.1269F, 2.9418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.22F, 4.0178F, -2.3858F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-1.5F, -0.674F, -1.7356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 68).addBox(0.94F, -0.674F, -1.7356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.22F, -1.1822F, 0.2142F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(85, 44).addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.62F, -1.3354F, -0.0529F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(87, 60).mirror().addBox(-0.5F, -0.9525F, -0.9467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(87, 60).addBox(1.5F, -0.9525F, -0.9467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.7245F, -2.136F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(6, 88).mirror().addBox(-0.5F, -0.9478F, -0.9679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(6, 88).addBox(1.5F, -0.9478F, -0.9679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.8245F, -1.136F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.9424F, -0.938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 80).addBox(1.5F, -0.9424F, -0.938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0245F, -2.836F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-2.0F, -0.3783F, -0.3289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 11).addBox(1.0F, -0.3783F, -0.3289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.5972F, -3.7208F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.3044F, 0.0321F, -1.6014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -1.8486F, -3.9858F, 0.626F, -0.5726F, -0.3733F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(20, 74).addBox(-0.6956F, 0.0321F, -1.6014F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, -1.8486F, -3.9858F, 0.626F, 0.5726F, 0.3733F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(61, 41).addBox(-2.2F, 2.9369F, -0.1097F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(52, 13).addBox(-2.2F, -0.0631F, -0.1097F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, -1.6755F, 0.164F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(51, 85).addBox(-0.5F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, 0.5727F, -2.9431F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 79).addBox(-0.5F, -0.017F, -1.864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(72, 42).mirror().addBox(-0.7F, -0.317F, -1.864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(72, 42).addBox(-0.3F, -0.317F, -1.864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -0.0796F, -10.4578F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.7F, -0.2855F, -1.7041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 56).addBox(-0.3F, -0.2855F, -1.7041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.2796F, -7.1578F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 75).mirror().addBox(-0.6F, -0.3117F, -1.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(36, 75).addBox(-0.4F, -0.3117F, -1.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.8796F, -8.4578F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-0.6F, -0.3106F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(50, 75).addBox(-0.4F, -0.3106F, -1.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -0.9796F, -9.6578F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(42, 81).addBox(-0.5F, -0.0257F, -1.0082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.3796F, -6.1578F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(46, 11).addBox(-0.5F, -0.033F, -1.7547F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.9796F, -4.4578F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(76, 75).addBox(-0.5F, 0.005F, -1.7297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.8796F, -2.7578F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-0.8F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(84, 22).addBox(1.2F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7F, 1.8484F, -0.335F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-1.2F, -0.1869F, -0.1926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(12, 77).addBox(0.2F, -0.1869F, -0.1926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0796F, 1.2422F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(76, 30).addBox(-1.0F, 0.4439F, -0.0849F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.8482F, 0.4722F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 77).addBox(-1.0F, -0.0561F, 0.0151F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8482F, 0.4722F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(64, 52).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8482F, -0.1278F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(77, 22).addBox(-1.0F, -0.2679F, -0.1049F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4796F, -0.7578F, -0.2443F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7513F, -0.1653F, 0.3056F, -0.0016F, 0.0113F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-0.4955F, 0.0082F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(85, 55).addBox(0.0955F, 0.0082F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.3F, -1.5878F, -8.6687F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(-0.4955F, 0.0295F, 0.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(30, 69).addBox(0.0955F, 0.0295F, 0.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, -1.6878F, -9.6687F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(86, 2).mirror().addBox(-0.4955F, -0.6532F, -3.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(86, 2).addBox(0.0955F, -0.6532F, -3.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.3F, 0.3122F, -6.2687F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(34, 89).mirror().addBox(0.0045F, -1.0332F, -2.7655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 89).addBox(0.7955F, -1.0332F, -2.7655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3531F, -4.2018F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(0.1F, 0.0393F, -0.0253F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 69).addBox(1.1F, 0.0393F, -0.0253F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.9531F, -3.9018F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(-0.01F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 79).addBox(0.81F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.4531F, -5.0018F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-0.1955F, -0.9893F, -3.2732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(86, 8).addBox(0.3955F, -0.9893F, -3.2732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -0.4212F, -5.8992F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.4928F, 0.0058F, -2.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(78, 6).addBox(0.1072F, 0.0058F, -2.0266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3072F, -1.4559F, -4.8467F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.4928F, -0.0145F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(78, 0).addBox(0.1072F, -0.0145F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3072F, -1.8559F, -6.7467F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-0.4928F, -0.0569F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(55, 77).addBox(0.1072F, -0.0569F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3072F, -1.6559F, -4.7467F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-0.4928F, -1.2036F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 18).mirror().addBox(0.1072F, -1.2036F, -2.5994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(84, 52).addBox(1.5072F, -1.2036F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 18).addBox(0.9072F, -1.2036F, -2.5994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0072F, 0.1441F, -2.5467F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-0.4928F, -1.1036F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(69, 77).mirror().addBox(0.1072F, -1.1036F, -2.5994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(87, 47).addBox(1.5072F, -1.1036F, -0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(69, 77).addBox(0.9072F, -1.1036F, -2.5994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0072F, 0.1441F, -2.5467F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(35, 53).mirror().addBox(-0.4955F, -0.7827F, -3.7383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(35, 53).addBox(0.0955F, -0.7827F, -3.7383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -1.1876F, -4.5964F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.4931F, -1.0541F, -0.0497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(30, 78).addBox(0.0979F, -1.0541F, -0.0497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3024F, -0.2764F, -8.2898F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.02F, 0.3F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 62).addBox(2.22F, 0.3F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.978F, -1.6197F, -2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(54, 81).mirror().addBox(-0.8F, 0.3032F, -1.9674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 81).addBox(1.4F, 0.3032F, -1.9674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.2878F, -0.5687F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-1.2F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(68, 19).addBox(0.8F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, -0.9878F, -3.4687F, -0.3491F, 0.0F, 0.0F));

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