package fossils.fossils.client.blockentity.model.fukuisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FukuisaurusFossilModel extends SkullModelBase {
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
	private final ModelPart tail6;
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
	private final ModelPart bone;
	private final ModelPart jaw;

	public FukuisaurusFossilModel(ModelPart root) {
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
		this.tail6 = this.tail.getChild("tail6");
		this.tail2 = this.tail6.getChild("tail2");
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
		this.bone = this.head.getChild("bone");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.8608F, -1.3873F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 47).addBox(0.0F, 0.0261F, 0.0538F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9846F, -1.9086F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 35).addBox(-0.003F, -1.7F, -0.1F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1846F, -4.7086F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(0.5632F, -1.8386F, 0.3684F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 44).mirror().addBox(0.5632F, -1.3165F, -3.5974F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 44).mirror().addBox(0.5632F, -1.5776F, -1.6145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 44).addBox(2.5632F, -1.8386F, 0.3684F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 44).addBox(2.5632F, -1.3165F, -3.5974F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 44).addBox(2.5632F, -1.5776F, -1.6145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -1.3989F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 12).mirror().addBox(-1.3463F, -5.0234F, -1.3551F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.1047F, -0.0436F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-1.3463F, -3.4361F, -2.6292F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.5236F, -0.0436F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-1.0789F, -2.2267F, -2.4003F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.5713F, -1.3544F, 0.216F, -0.2622F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-1.0789F, -1.5537F, -0.5787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.5713F, -0.7523F, 0.216F, -0.2622F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 47).mirror().addBox(-1.0853F, -1.8464F, 0.4611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.5713F, -0.7788F, 0.196F, -0.309F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-0.2253F, -3.1626F, 5.3327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.5713F, -1.0636F, 0.0111F, -0.1516F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 21).mirror().addBox(-1.6219F, -5.0605F, 0.538F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.2727F, -0.158F, 0.1082F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-1.6219F, -4.9532F, -2.731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -1.2327F, -0.158F, 0.1082F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.6219F, -2.2137F, 1.6737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.3381F, -0.158F, 0.1082F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-1.1606F, -5.1392F, -1.0183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.3483F, 0.1299F, -0.0183F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-1.1606F, -4.1438F, -3.2245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.1579F, 0.1299F, -0.0183F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-1.0724F, -1.9863F, -3.0217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.2712F, 0.1655F, 0.011F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-0.2367F, -0.7698F, -0.2079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.2537F, 1.2523F, -3.9713F, -0.5539F, 0.2069F, -0.0862F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 29).mirror().addBox(-0.2367F, -1.3528F, 2.1978F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2537F, 1.2523F, -3.9713F, -0.7808F, 0.2069F, -0.0862F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-1.0724F, -2.8778F, -4.9538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.3672F, 0.1655F, 0.011F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(-0.499F, -0.3577F, -1.5475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2346F, 1.0896F, -5.3174F, 0.3497F, 0.1655F, 0.011F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-1.0724F, -1.4056F, -3.9491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.0342F, 0.1655F, 0.011F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(41, 47).mirror().addBox(-1.0724F, -3.1147F, -2.2518F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.6552F, 0.1655F, 0.011F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-1.1606F, -4.4531F, -5.4763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.0444F, 0.1299F, -0.0183F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-1.6219F, -3.854F, 3.1081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, -0.0458F, -0.158F, 0.1082F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-0.211F, -2.3911F, 3.0623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.5713F, -0.9272F, 0.0201F, -0.1351F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-1.0724F, -2.5897F, -4.1618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 0.2974F, 0.1655F, 0.011F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.0607F, -4.9609F, -1.9365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1537F, 1.8523F, -2.2713F, 1.205F, 0.1655F, 0.011F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 78).addBox(0.0607F, -4.9609F, -1.9365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 1.205F, -0.1655F, -0.011F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(77, 68).addBox(0.0724F, -2.5897F, -4.1618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.2974F, -0.1655F, -0.011F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(52, 17).addBox(-0.789F, -2.3911F, 3.0623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.5713F, -0.9272F, -0.0201F, 0.1351F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 64).addBox(0.6219F, -3.854F, 3.1081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.0458F, 0.158F, -0.1082F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 52).addBox(0.1606F, -4.4531F, -5.4763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.0444F, -0.1299F, 0.0183F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 47).addBox(0.0724F, -3.1147F, -2.2518F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.6552F, -0.1655F, -0.011F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 77).addBox(0.0724F, -1.4056F, -3.9491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.0342F, -0.1655F, -0.011F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(23, 52).addBox(-0.501F, -0.3577F, -1.5475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2346F, 1.0896F, -5.3174F, 0.3497F, -0.1655F, -0.011F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(75, 19).addBox(0.0724F, -2.8778F, -4.9538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.3672F, -0.1655F, -0.011F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 29).addBox(-0.7633F, -1.3528F, 2.1978F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2537F, 1.2523F, -3.9713F, -0.7808F, -0.2069F, 0.0862F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 42).addBox(-0.7633F, -0.7698F, -0.2079F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.2537F, 1.2523F, -3.9713F, -0.5539F, -0.2069F, 0.0862F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 65).addBox(0.0724F, -1.9863F, -3.0217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.2712F, -0.1655F, -0.011F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(35, 65).addBox(0.1606F, -4.1438F, -3.2245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.1579F, -0.1299F, 0.0183F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 55).addBox(0.1606F, -5.1392F, -1.0183F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.3483F, -0.1299F, 0.0183F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 45).addBox(0.6219F, -2.2137F, 1.6737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, 0.3381F, 0.158F, -0.1082F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(75, 16).addBox(0.6219F, -4.9532F, -2.731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -1.2327F, 0.158F, -0.1082F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 21).addBox(0.6219F, -5.0605F, 0.538F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.2727F, 0.158F, -0.1082F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 5).addBox(-0.7747F, -3.1626F, 5.3327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.5713F, -1.0636F, -0.0111F, 0.1516F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(32, 47).addBox(0.0853F, -1.8464F, 0.4611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.5713F, -0.7788F, -0.196F, 0.309F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(5, 65).addBox(0.0789F, -1.5537F, -0.5787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.5713F, -0.7523F, -0.216F, 0.2622F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(53, 32).addBox(0.0789F, -2.2267F, -2.4003F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.5713F, -1.3544F, -0.216F, 0.2622F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 28).addBox(0.3463F, -3.4361F, -2.6292F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.5236F, 0.0436F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 12).addBox(0.3463F, -5.0234F, -1.3551F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1537F, 1.8523F, -2.2713F, -0.1047F, 0.0436F, 0.0F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, 0.7926F, -0.2693F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 0.1448F, -2.7216F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 73).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4417F, -0.5337F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 0).addBox(-1.0F, -0.2499F, -0.069F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.195F, 0.2496F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, -4.9811F, -0.287F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.305F, -1.3504F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 54).addBox(-1.0F, -0.9F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.6889F, -0.3489F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(49, 57).addBox(-1.0F, 0.0043F, -0.0594F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.205F, -1.5504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(62, 32).addBox(-1.9F, 3.8718F, -0.1614F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 42).addBox(-1.9F, 0.0969F, -0.96F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4619F, -0.391F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(12, 67).addBox(-0.5F, -4.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(39, 57).addBox(-0.5F, -4.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2F, 5.0969F, 0.14F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 30).addBox(-1.0F, -1.9F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 69).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 8.0969F, -0.46F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 42).addBox(-1.9F, -4.0981F, 0.0464F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.0969F, -0.06F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(61, 54).addBox(-1.9F, 0.0F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0969F, 1.24F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4198F, 0.2411F, -0.6417F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(30, 24).addBox(-2.0F, -0.0319F, -1.2504F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8044F, -0.4591F, 0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(15, 24).addBox(-2.0F, -0.3F, -2.2F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -1.0504F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 0.1448F, -2.7216F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4417F, -0.5337F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(61, 16).addBox(-1.0F, -0.2499F, -0.069F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.195F, 0.2496F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(16, 47).addBox(-1.0F, -4.9811F, -0.287F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.305F, -1.3504F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(56, 6).addBox(-1.0F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-1.0F, -0.9F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.6889F, -0.3489F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(59, 27).addBox(-1.0F, 0.0043F, -0.0594F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.205F, -1.5504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(62, 37).addBox(-0.1F, 3.8718F, -0.1614F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 12).addBox(-0.1F, 0.0969F, -0.96F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4619F, -0.391F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, -4.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 57).addBox(-0.5F, -4.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, 5.0969F, 0.14F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(33, 69).addBox(-1.0F, -1.9F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 69).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 8.0969F, -0.46F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 62).addBox(-0.1F, -4.0981F, 0.0464F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.0969F, -0.06F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(61, 59).addBox(-0.1F, 0.0F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0969F, 1.24F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(50, 27).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.4198F, 0.2411F, -1.4661F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(34, 8).addBox(-2.0F, -0.0319F, -1.2504F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8044F, -0.4591F, 1.6755F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -0.3F, -2.2F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2681F, -1.0504F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 29).addBox(-0.5F, -0.6929F, 4.0027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7316F, 1.0687F, -0.0723F, -0.2611F, 0.0187F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(80, 13).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6929F, 8.0027F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 11).addBox(0.0F, -5.2F, -2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 76).addBox(0.0F, -3.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9575F, 5.2031F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(16, 80).addBox(0.0F, -3.1F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.742F, 9.0627F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 36).addBox(0.0F, -2.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3938F, 6.9369F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(15, 20).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5929F, 6.0027F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(5, 59).addBox(1.1F, -1.5F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 59).addBox(1.1F, -1.5F, 1.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 59).addBox(1.1F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2715F, 4.6581F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 59).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5929F, 4.0027F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(35, 36).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6929F, 4.0027F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(14, 58).addBox(0.0F, -1.4696F, 0.0951F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6114F, 2.1778F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(67, 76).addBox(-0.1F, -1.5F, 1.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 76).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0378F, 0.441F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(67, 76).addBox(0.0F, -1.5583F, -0.0462F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7585F, 0.3279F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3004F, 9.0018F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r80 = tail6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 80).addBox(0.0F, -3.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 2.1F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(41, 80).addBox(0.0F, -3.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1529F, 4.1825F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 80).addBox(0.0F, -3.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2082F, 6.2433F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(80, 25).addBox(0.0F, -3.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7753F, 8.1959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(64, 51).addBox(-0.002F, -0.7377F, 0.0832F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 32).addBox(0.0F, -1.2377F, 0.0832F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5925F, 6.8008F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 71).addBox(0.0F, -1.3679F, 0.082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5925F, 4.8008F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 21).addBox(0.0F, -1.4016F, -0.0192F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5925F, 2.9008F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.5F, -1.0317F, 3.9866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 9).mirror().addBox(-0.5F, -1.2317F, 1.9866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 9).mirror().addBox(-0.5F, -1.3317F, -0.0134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3925F, 0.9008F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r88 = tail6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 9).addBox(0.5F, -1.0317F, 3.9866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 9).addBox(0.5F, -1.2317F, 1.9866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 9).addBox(0.5F, -1.3317F, -0.0134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3925F, 0.9008F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r89 = tail6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 9).addBox(0.0F, -1.7317F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3925F, 0.9008F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0075F, 0.0008F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2274F, 7.8994F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(80, 58).addBox(0.0F, -3.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6206F, 2.3559F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 55).addBox(0.0F, -2.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4065F, 4.4063F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(53, 80).addBox(0.0F, -2.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0983F, 6.4225F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 80).addBox(0.0F, -2.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7901F, 8.4386F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(47, 80).addBox(0.0F, -0.3578F, 0.0026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7113F, 4.9339F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 80).addBox(0.0F, -0.6307F, -0.0974F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6212F, 3.0368F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(22, 81).addBox(0.0F, -1.12F, 0.0438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4512F, 0.824F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2999F, -0.0157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.765F, 7.8853F, 0.0983F, 0.2171F, 0.0212F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(63, 80).addBox(0.0F, -2.4F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9494F, 2.82F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(60, 80).addBox(0.0F, -2.4F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8094F, 4.8376F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.049F, 3.8892F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 36).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9791F, 3.8696F, -0.1056F, 0.1302F, -0.0138F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.6F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(76, 36).addBox(0.0F, -2.6586F, 0.0534F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1876F, -2.157F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 50).addBox(0.0F, -2.3677F, -0.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1454F, -4.0177F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 75).addBox(0.0F, -2.3215F, -0.0896F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0264F, -5.9915F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(22, 73).addBox(0.0F, -2.3577F, 0.026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -8.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(57, 78).addBox(0.0F, -2.1829F, -0.1344F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.8F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, -0.0486F, 1.9985F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -11.8F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.257F, -1.4557F, 0.2497F, 0.128F, -0.5608F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.357F, -3.4557F, 0.3292F, 0.0347F, -0.7731F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.357F, -3.4557F, 0.298F, 0.1076F, -1.2045F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.357F, -9.2557F, 0.3786F, 0.106F, -0.5811F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 6).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.357F, -9.2557F, 0.3131F, 0.193F, -1.0138F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 10).mirror().addBox(-6.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.357F, -9.2557F, 0.2037F, 0.3063F, -1.4491F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.857F, -7.3557F, 0.3131F, 0.193F, -1.0836F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.857F, -7.3557F, 0.3786F, 0.106F, -0.651F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -5.4557F, 0.2441F, 0.1135F, -1.1465F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.457F, -5.4557F, 0.283F, 0.0625F, -0.7114F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(70, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.257F, -1.4557F, 0.2497F, -0.128F, 0.5608F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(73, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.357F, -3.4557F, 0.3292F, -0.0347F, 0.7731F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(79, 75).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.357F, -3.4557F, 0.298F, -0.1076F, 1.2045F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(73, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.357F, -9.2557F, 0.3786F, -0.106F, 0.5811F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 6).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.357F, -9.2557F, 0.3131F, -0.193F, 1.0138F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 10).addBox(3.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.357F, -9.2557F, 0.2037F, -0.3063F, 1.4491F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 14).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.857F, -7.3557F, 0.3131F, -0.193F, 1.0836F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(70, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.857F, -7.3557F, 0.3786F, -0.106F, 0.651F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(69, 45).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -5.4557F, 0.2441F, -0.1135F, 1.1465F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.457F, -5.4557F, 0.283F, -0.0625F, 0.7114F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -9.7F, 0.0352F, 0.2178F, -0.0132F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.7F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7133F, 5.2087F, -4.8236F, 1.4214F, -0.7026F, -1.2809F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-0.6376F, -0.0269F, -0.0417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7275F, 0.885F, -2.6282F, 0.4102F, 0.0F, 0.0873F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(20, 1).mirror().addBox(-0.5867F, 0.5489F, -1.3005F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7186F, 6.2815F, -2.6621F, -0.2632F, -0.5089F, 0.3584F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.6469F, 0.4668F, -0.9333F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8186F, 6.2815F, -2.6621F, -0.3722F, -0.7186F, 0.3805F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(23, 43).mirror().addBox(-0.2895F, 0.148F, -0.5094F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9186F, 6.4815F, -3.9621F, -0.359F, -0.943F, 0.4097F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(43, 17).mirror().addBox(0.6186F, -0.1107F, -1.4953F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 17).addBox(1.6186F, -0.1107F, -1.4953F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6186F, 6.2815F, -3.6621F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.8557F, 0.647F, 0.2194F, -0.6071F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.8557F, 0.5169F, 0.4056F, -1.0229F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(19, 71).mirror().addBox(-5.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.8557F, 0.2974F, 0.5818F, -1.4782F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(12, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -3.1557F, 0.54F, 0.1762F, -0.5758F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -3.1557F, 0.4333F, 0.3233F, -1.0004F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-6.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.657F, -3.1557F, 0.2574F, 0.4737F, -1.446F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.857F, -1.3557F, 0.4428F, 0.1345F, -0.556F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.857F, -1.3557F, 0.2243F, 0.3734F, -1.4248F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.857F, -1.3557F, 0.3602F, 0.2455F, -0.9861F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-0.6289F, 0.0629F, -0.276F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7275F, 0.785F, -2.6282F, 0.6711F, -0.0196F, 0.085F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(-2.2548F, -2.4324F, -5.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7275F, 1.285F, -0.8282F, 0.9035F, -0.2813F, -0.1905F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.8729F, -0.9454F, -0.1022F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7275F, 3.585F, -4.1282F, 0.7592F, 0.0F, 0.0873F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.9078F, -0.941F, -0.0455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7275F, 3.985F, -3.8282F, 0.9861F, 0.0F, 0.0873F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(20, 1).addBox(-0.4133F, 0.5489F, -1.3005F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7186F, 6.2815F, -2.6621F, -0.2632F, 0.5089F, -0.3584F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 33).addBox(-0.3531F, 0.4668F, -0.9333F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8186F, 6.2815F, -2.6621F, -0.3722F, 0.7186F, -0.3805F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(23, 43).addBox(-0.7105F, 0.148F, -0.5094F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9186F, 6.4815F, -3.9621F, -0.359F, 0.943F, -0.4097F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(34, 20).addBox(-2.1186F, -0.9339F, -2.0567F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6186F, 6.7815F, -5.2621F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, -2.252F, -0.0294F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 51).addBox(0.0F, -2.2285F, 0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.8F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 40).addBox(0.0F, -2.1633F, -0.155F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -5.1F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.8557F, 0.647F, -0.2194F, 0.6071F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(45, 71).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.8557F, 0.5169F, -0.4056F, 1.0229F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(19, 71).addBox(3.1021F, -2.3689F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.8557F, 0.2974F, -0.5818F, 1.4782F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(12, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -3.1557F, 0.54F, -0.1762F, 0.5758F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(70, 70).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -3.1557F, 0.4333F, -0.3233F, 1.0004F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(28, 63).addBox(3.1021F, -2.3689F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.657F, -3.1557F, 0.2574F, -0.4737F, 1.446F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.857F, -1.3557F, 0.4428F, -0.1345F, 0.556F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(36, 6).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.857F, -1.3557F, 0.2243F, -0.3734F, 1.4248F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 66).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.857F, -1.3557F, 0.3602F, -0.2455F, 0.9861F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(53, 37).addBox(-0.3711F, 0.0629F, -0.276F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7275F, 0.785F, -2.6282F, 0.6711F, 0.0196F, -0.085F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(54, 0).addBox(-0.3F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7133F, 5.2087F, -4.8236F, 1.4214F, 0.7026F, 1.2809F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(32, 57).addBox(1.2548F, -2.4324F, -5.7256F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7275F, 1.285F, -0.8282F, 0.9035F, 0.2813F, 0.1905F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 22).addBox(-0.3624F, -0.0269F, -0.0417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7275F, 0.885F, -2.6282F, 0.4102F, 0.0F, -0.0873F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(50, 47).addBox(-0.1271F, -0.9454F, -0.1022F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7275F, 3.585F, -4.1282F, 0.7592F, 0.0F, -0.0873F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(49, 67).addBox(-0.0922F, -0.941F, -0.0455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7275F, 3.985F, -3.8282F, 0.9861F, 0.0F, -0.0873F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, -0.011F, -0.02F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3F, -5.5F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(52, 71).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9335F, 5.7073F, -3.9724F, 0.6981F, 0.0F, -0.1745F));

		PartDefinition cube_r170 = leftArm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 69).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftArm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6491F, 0.6993F, -0.2799F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r172 = leftArm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 69).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8569F, 2.648F, -0.679F, 0.8465F, -0.48F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(56, 57).addBox(0.0F, 0.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 58).addBox(0.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4064F, 5.409F, 1.8476F, -0.8217F, 0.4728F, -0.1272F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(18, 57).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.0F, -1.5F, -0.0605F, 0.3156F, -0.1689F));

		PartDefinition cube_r173 = leftArm3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftArm3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(68, 0).addBox(-0.3F, -0.9F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.1484F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(26, 72).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9335F, 5.7073F, -3.9724F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r175 = rightArm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(69, 33).addBox(0.0F, -0.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.5F, 0.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightArm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(31, 72).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6491F, 0.6993F, -0.2799F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r177 = rightArm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(69, 41).addBox(-0.5F, -0.9F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8569F, 2.648F, -0.679F, 0.8465F, 0.48F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 47).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4064F, 5.409F, 1.8476F, -1.3889F, -0.4728F, 0.1272F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(25, 57).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.0F, -1.5F, 0.2086F, -0.3228F, -0.4311F));

		PartDefinition cube_r178 = rightArm3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(68, 51).addBox(-0.5F, 0.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightArm3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(68, 16).addBox(-0.7F, -0.9F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.1484F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(17, 73).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7029F, -5.2177F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(13, 80).addBox(-0.5F, -2.1891F, 1.9381F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2623F, -3.6861F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5623F, -1.2861F, 0.4653F, 0.9859F, -1.0528F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5623F, -1.2861F, 0.918F, 0.7518F, -0.4708F));

		PartDefinition cube_r183 = neck4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(62, 71).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5623F, -1.2861F, 0.4653F, -0.9859F, 1.0528F));

		PartDefinition cube_r184 = neck4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(71, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5623F, -1.2861F, 0.918F, -0.7518F, 0.4708F));

		PartDefinition cube_r185 = neck4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(47, 7).addBox(-1.0F, 0.017F, 0.7615F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.2623F, -3.4861F, 0.4887F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.3488F, -2.3068F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r186 = neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(80, 17).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9315F, -0.2715F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 28).addBox(0.0F, -0.9072F, -0.2767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 42).addBox(-0.5F, 0.0928F, -0.2767F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2683F, -2.4789F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r188 = neck3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-2.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0159F, -0.9978F, 0.5759F, 0.8621F, -0.8275F));

		PartDefinition cube_r189 = neck3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6345F, -2.7943F, 0.4905F, 0.719F, -0.9472F));

		PartDefinition cube_r190 = neck3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 4).addBox(0.1061F, 0.0724F, -0.3249F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0159F, -0.9978F, 0.5759F, -0.8621F, 0.8275F));

		PartDefinition cube_r191 = neck3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 72).addBox(0.0342F, 0.0303F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6345F, -2.7943F, 0.4905F, -0.719F, 0.9472F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8683F, -2.7789F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, 0.3F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 52).addBox(-0.5F, 1.0F, 1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.3626F, -3.5573F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.411F, -1.274F, 0.3854F, 0.7782F, -1.1192F));

		PartDefinition cube_r194 = neck2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(68, 24).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.411F, -1.274F, 0.3854F, -0.7782F, 1.1192F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.115F, -2.4679F, 0.1738F, 0.1076F, 0.1506F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(81, 44).addBox(0.0F, -1.184F, 0.7966F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 47).addBox(-0.5F, -0.284F, 0.7966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5303F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(80, 0).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5303F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(3, 81).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7831F, -0.227F, -0.384F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8087F, -2.0979F, 1.0314F, 0.0449F, 0.0749F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(25, 76).addBox(-0.6F, -0.7424F, -0.1533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.0629F, -4.5864F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(64, 47).addBox(-0.6F, -0.6458F, -1.7274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, -0.0371F, -4.5864F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(14, 63).addBox(-0.6F, -1.0458F, -1.8274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -0.0371F, -4.5864F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 79).addBox(0.66F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.4024F, -0.8067F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.8313F, -0.4647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(30, 79).addBox(1.34F, -0.8313F, -0.4647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -0.835F, -1.29F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.5F, -0.1762F, -0.1262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(79, 33).addBox(1.34F, -0.1762F, -0.1262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -1.235F, -1.89F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-0.5F, -0.1381F, -0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(79, 6).addBox(1.34F, -0.1381F, -0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.92F, -0.335F, -1.49F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -0.8628F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false)
				.texOffs(78, 78).addBox(1.34F, -0.8628F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(-0.92F, -0.7889F, -2.439F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(73, 78).addBox(1.34F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -0.3889F, -2.239F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.5F, -0.2688F, -0.4642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(79, 3).addBox(1.34F, -0.2688F, -0.4642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, -0.835F, -1.29F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.34F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 78).mirror().addBox(-0.55F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 47).mirror().addBox(-0.66F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 47).addBox(1.02F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 78).addBox(0.91F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 78).addBox(0.7F, -0.8152F, -0.3612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.68F, -0.8619F, -3.1826F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.34F, -0.478F, -0.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(40, 77).addBox(0.7F, -0.478F, -0.4439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.68F, -0.8619F, -3.1826F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(35, 77).addBox(-0.06F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.22F, -0.4633F, -6.5803F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.5F, -0.8196F, -0.6308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(42, 65).addBox(-0.06F, -0.8196F, -0.6308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.22F, -0.5633F, -5.8803F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-0.5F, -0.2473F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 26).addBox(-0.06F, -0.2473F, -0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9829F, -6.6803F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(43, 22).mirror().addBox(-0.5F, -1.0668F, -1.9537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(43, 22).addBox(0.1F, -1.0668F, -1.9537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.5629F, -2.6864F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(63, 68).addBox(-1.0F, -0.7452F, 0.0747F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(68, 59).addBox(-1.0F, -0.7452F, -0.2253F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1841F, -6.5421F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(56, 68).addBox(-1.0F, -0.4174F, -0.1015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.212F))
				.texOffs(67, 9).addBox(-1.0F, -0.4174F, -0.5015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, -0.3042F, -7.0951F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.5F, -0.8307F, -0.806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(76, 44).mirror().addBox(-0.5F, -0.8307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 77).addBox(0.9F, -0.8307F, -0.806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(76, 44).addBox(0.9F, -0.8307F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.6152F, -2.3717F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.5F, 0.0428F, -1.0062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(5, 74).addBox(0.9F, 0.0428F, -1.0062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7F, 0.1943F, -0.5677F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(-1.2F, -0.0408F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(46, 73).addBox(0.2F, -0.0408F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 0.1136F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(41, 73).mirror().addBox(-1.2F, 0.0046F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(41, 73).addBox(0.2F, 0.0046F, -0.018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0371F, 0.4136F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-1.4F, -0.8408F, -0.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 73).addBox(0.4F, -0.8408F, -0.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.0371F, 0.1136F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-0.3F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(69, 72).addBox(0.7F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, -0.533F, -2.3646F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(-0.3F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 59).addBox(0.7F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 0.3152F, -3.3717F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(57, 75).addBox(-0.5F, -1.3116F, -1.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.4371F, -5.6864F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(75, 56).addBox(-0.4F, 0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -1.7371F, -2.9864F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 75).addBox(-0.5F, -0.0363F, -1.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5371F, -5.8864F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(75, 22).addBox(-0.5F, -0.0439F, -0.9527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -4.9864F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.0175F, -1.0072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8371F, -3.9864F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 54).addBox(-0.5F, -0.0563F, -0.9157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -3.0864F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(63, 12).addBox(-1.0F, -0.0763F, -0.9336F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9371F, 0.4136F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 38).addBox(-1.0F, -0.126F, 0.0248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6371F, -1.1864F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(41, 52).addBox(-1.0F, 0.0158F, -2.0089F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -1.0864F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1841F, -6.5421F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0002F, 1.6541F, -1.0866F, 0.0874F, -0.0016F, 0.0113F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(30, 76).addBox(-0.4988F, -0.8439F, -0.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.0F, -1.9755F, -5.4492F, -2.1205F, 0.007F, -0.0019F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 30).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -1.4755F, -5.7492F, -1.213F, 0.007F, -0.0019F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.3F, -1.6339F, -2.8009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 80).addBox(0.2996F, -1.6339F, -2.8009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0004F, 0.0124F, -2.2964F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(19, 81).mirror().addBox(-0.41F, -1.2277F, -2.0967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 81).addBox(0.4096F, -1.2277F, -2.0967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0004F, 0.0124F, -2.2964F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(6, 81).mirror().addBox(-0.41F, -0.0726F, 0.0283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 81).addBox(1.0096F, -0.0726F, 0.0283F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2996F, -1.3876F, -3.0964F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-0.5F, -0.0682F, 0.2191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(77, 62).mirror().addBox(-0.5F, -0.0682F, 0.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 65).addBox(0.0996F, -0.0682F, 0.2191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(77, 62).addBox(0.0996F, -0.0682F, 0.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2996F, -1.2876F, -3.3964F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-1.2F, -1.0049F, 0.0785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 0).addBox(0.1996F, -1.0049F, 0.0785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0004F, 0.7122F, -0.7687F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.5F, -0.948F, -1.8455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(56, 64).addBox(0.0996F, -0.948F, -1.8455F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2996F, 0.1124F, -2.2964F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(81, 50).mirror().addBox(0.0F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 50).addBox(1.5996F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7996F, -0.8611F, -2.0022F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-1.2F, -0.3309F, 1.1971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(21, 63).addBox(0.1996F, -0.3309F, 1.1971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0004F, -0.9878F, -3.4687F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 33).addBox(-0.5F, -0.8234F, -1.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(74, 8).addBox(-0.5F, -0.8234F, -0.8161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0F, -0.6842F, -4.9377F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(74, 72).addBox(-0.5F, -1.7083F, -3.2209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(74, 41).addBox(-0.5F, -1.7083F, -2.9209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1124F, -2.2964F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(62, 77).addBox(-0.5F, -0.0682F, -0.9809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2876F, -3.3964F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(45, 77).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9759F, -4.4174F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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