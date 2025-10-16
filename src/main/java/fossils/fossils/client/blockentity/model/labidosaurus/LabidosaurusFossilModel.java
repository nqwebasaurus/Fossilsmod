package fossils.fossils.client.blockentity.model.labidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LabidosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart leftArm9;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public LabidosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.leftArm9 = this.leftArm8.getChild("leftArm9");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.leftArm2 = this.bone.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone3 = this.bone.getChild("bone3");
		this.bone5 = this.bone.getChild("bone5");
		this.Neck = this.bone.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.5943F, 2.6001F, -0.217F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(86, 89).addBox(1.3842F, -2.2F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 89).addBox(1.3842F, -2.2F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 89).addBox(1.3842F, -2.2F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -1.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(17, 38).mirror().addBox(-3.8842F, -0.5F, 3.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 38).addBox(-0.8842F, -0.5F, 3.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-1.8842F, -1.0F, 2.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0119F, 2.2864F, 3.0353F, 0.1967F, -0.3864F, 0.1604F));

		PartDefinition cube_r1 = leftArm5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 66).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2781F, 0.6517F, -0.0412F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r2 = leftArm5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 64).addBox(-0.3F, -1.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6933F, 0.6517F, 0.4746F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r3 = leftArm5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 76).addBox(-16.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 85).addBox(-15.9684F, 2.1028F, -2.8567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7015F, -2.4511F, -17.198F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r4 = leftArm5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 86).addBox(-0.25F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1932F, 0.6517F, -1.0401F, 0.0F, -1.6581F, 0.0F));

		PartDefinition cube_r5 = leftArm5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 69).addBox(-4.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6556F, 0.1517F, -1.7434F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r6 = leftArm5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 76).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8474F, 0.1517F, -0.8409F, 0.0F, 0.1833F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4477F, 0.2816F, -0.5594F, 1.3517F, -0.5766F, 0.753F));

		PartDefinition cube_r7 = leftArm6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(11, 51).addBox(-2.8226F, -0.4473F, -0.6723F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9358F, -0.2626F, -0.4705F, 0.0136F, 0.662F, 0.0225F));

		PartDefinition cube_r8 = leftArm6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 24).addBox(-0.7831F, -0.5483F, -0.1246F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0329F, -0.2147F, -1.1939F, 0.0088F, 0.741F, 0.015F));

		PartDefinition cube_r9 = leftArm6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(83, 50).addBox(-1.618F, -0.5483F, 0.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0329F, -0.2147F, -1.1939F, 0.0079F, 0.6101F, 0.0136F));

		PartDefinition cube_r10 = leftArm6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 83).addBox(-1.4451F, -0.5483F, 0.2964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0329F, -0.2147F, -1.1939F, 0.0066F, 0.2174F, 0.0105F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(26, 44).addBox(-0.2706F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2441F, -0.2663F, -3.2249F, -0.8407F, 0.1235F, 1.1749F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create().texOffs(27, 60).addBox(-0.6347F, -2.5F, -1.724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.5272F, 0.0F));

		PartDefinition leftArm9 = leftArm8.addOrReplaceChild("leftArm9", CubeListBuilder.create().texOffs(34, 60).addBox(-0.2817F, -2.5F, -2.1223F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.347F, 0.0F, -1.5726F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0119F, 2.2864F, 3.0353F, 0.1673F, -0.5494F, -0.4129F));

		PartDefinition cube_r11 = rightArm5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2781F, 0.6517F, -0.0412F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r12 = rightArm5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.7F, -1.0F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6933F, 0.6517F, 0.4746F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r13 = rightArm5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 76).mirror().addBox(14.9684F, 2.1028F, -3.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 85).mirror().addBox(14.9684F, 2.1028F, -2.8567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7015F, -2.4511F, -17.198F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r14 = rightArm5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.75F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1932F, 0.6517F, -1.0401F, 0.0F, 1.6581F, 0.0F));

		PartDefinition cube_r15 = rightArm5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(1.275F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.6556F, 0.1517F, -1.7434F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r16 = rightArm5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8474F, 0.1517F, -0.8409F, 0.0F, -0.1833F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4477F, 0.2816F, -0.5594F, 1.3644F, 0.3786F, -0.6105F));

		PartDefinition cube_r17 = rightArm6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 51).mirror().addBox(-2.1774F, -0.4473F, -0.6723F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9358F, -0.2626F, -0.4705F, 0.0136F, -0.662F, -0.0225F));

		PartDefinition cube_r18 = rightArm6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-3.2169F, -0.5483F, -0.1246F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0329F, -0.2147F, -1.1939F, 0.0088F, -0.741F, -0.015F));

		PartDefinition cube_r19 = rightArm6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(0.618F, -0.5483F, 0.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0329F, -0.2147F, -1.1939F, 0.0079F, -0.6101F, -0.0136F));

		PartDefinition cube_r20 = rightArm6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(0.4451F, -0.5483F, 0.2964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0329F, -0.2147F, -1.1939F, 0.0066F, -0.2174F, -0.0105F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.7294F, -2.5F, -1.0583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2441F, -0.2663F, -3.2249F, -0.8407F, -0.1235F, -1.1749F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(-0.3653F, -2.5F, -1.724F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -1.1781F, 0.0F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create().texOffs(34, 60).mirror().addBox(-0.7183F, -2.5F, -2.1223F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.347F, 0.0F, -1.5726F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3842F, 0.1091F, -0.0063F, 0.0722F, -0.1306F, -0.0094F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(88, 71).addBox(1.3842F, -1.164F, 0.0151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5362F, -0.9034F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Belly.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-1.6555F, -0.3581F, -0.6484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.0709F, -2.2503F, 0.2424F, 0.4002F, -0.4399F));

		PartDefinition cube_r22 = Belly.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-2.3092F, -1.0689F, -0.6857F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.0709F, -2.2503F, 0.0174F, 0.4877F, -0.954F));

		PartDefinition cube_r23 = Belly.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-3.7124F, -3.1041F, -0.8011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, -0.1312F, 0.4215F, -1.5464F));

		PartDefinition cube_r24 = Belly.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-3.9237F, -1.2637F, -0.8011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, 0.1193F, 0.4249F, -0.9515F));

		PartDefinition cube_r25 = Belly.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-2.2941F, -0.2525F, -0.7481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, 0.2958F, 0.3011F, -0.464F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.0913F, -0.3959F, -0.0162F, 0.2108F, -0.4398F));

		PartDefinition cube_r26 = Belly.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 13).addBox(-0.3445F, -0.3581F, -0.6484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.0709F, -2.2503F, 0.2424F, -0.4002F, 0.4399F));

		PartDefinition cube_r27 = Belly.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 47).addBox(1.3092F, -1.0689F, -0.6857F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.0709F, -2.2503F, 0.0174F, -0.4877F, 0.954F));

		PartDefinition cube_r28 = Belly.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 70).addBox(2.7124F, -3.1041F, -0.8011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, -0.1312F, -0.4215F, 1.5464F));

		PartDefinition cube_r29 = Belly.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 3).addBox(1.9237F, -1.2637F, -0.8011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, 0.1193F, -0.4249F, 0.9515F));

		PartDefinition cube_r30 = Belly.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 9).addBox(0.2941F, -0.2525F, -0.7481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3842F, -0.4291F, -4.3503F, 0.2958F, -0.3011F, 0.464F));

		PartDefinition Belly_r3 = Belly.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(88, 62).addBox(1.3842F, -2.2F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 49).addBox(1.3842F, -2.3F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2638F, -8.7034F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Belly_r4 = Belly.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(85, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.0913F, -0.3959F, -0.0162F, -0.2108F, 0.4398F));

		PartDefinition Belly_r5 = Belly.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(0, 11).addBox(-1.1158F, -2.0F, -0.1F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.031F, -5.9035F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Belly_r6 = Belly.addOrReplaceChild("Belly_r6", CubeListBuilder.create().texOffs(17, 30).addBox(0.8842F, -1.0F, 3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2638F, -9.7034F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2362F, -5.9034F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-2.7459F, -0.3451F, -0.7879F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -0.4469F, 0.2673F, 0.2278F, -0.4817F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 28).mirror().addBox(-4.2833F, -1.5508F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -0.4469F, 0.1297F, 0.3471F, -0.9578F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(-3.8727F, -3.5354F, -0.8511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -0.4469F, -0.0759F, 0.3621F, -1.5356F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-2.7459F, -0.3451F, -0.7879F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -2.4469F, 0.2673F, 0.2278F, -0.4817F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 48).mirror().addBox(-4.2833F, -1.5508F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -2.4469F, 0.1297F, 0.3471F, -0.9578F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-4.8727F, -3.5354F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0842F, 0.1071F, -2.4469F, -0.0759F, 0.3621F, -1.5356F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-2.7711F, -0.2422F, -0.7337F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.0071F, -4.4469F, 0.1856F, 0.1732F, -0.4471F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-4.3537F, -1.4709F, -0.7981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.0071F, -4.4469F, 0.0813F, 0.2619F, -0.9215F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(-5.9743F, -3.5031F, -0.7981F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.0071F, -4.4469F, -0.0686F, 0.2654F, -1.4824F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 60).addBox(2.8727F, -3.5354F, -0.8511F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -0.4469F, -0.0759F, -0.3621F, 1.5356F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(40, 28).addBox(2.2833F, -1.5508F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -0.4469F, 0.1297F, -0.3471F, 0.9578F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 51).addBox(-0.2541F, -0.3451F, -0.7879F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -0.4469F, 0.2673F, -0.2278F, 0.4817F));

		PartDefinition Belly_r7 = body.addOrReplaceChild("Belly_r7", CubeListBuilder.create().texOffs(89, 89).addBox(1.3842F, -2.3F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Belly_r8 = body.addOrReplaceChild("Belly_r8", CubeListBuilder.create().texOffs(88, 79).addBox(1.3842F, -2.3F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 75).addBox(1.3842F, -2.3F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(71, 20).addBox(-0.2541F, -0.3451F, -0.7879F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -2.4469F, 0.2673F, -0.2278F, 0.4817F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(77, 48).addBox(2.2833F, -1.5508F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -2.4469F, 0.1297F, -0.3471F, 0.9578F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(80, 20).addBox(2.8727F, -3.5354F, -0.8511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6842F, 0.1071F, -2.4469F, -0.0759F, -0.3621F, 1.5356F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 57).addBox(-0.2289F, -0.2422F, -0.7337F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.0071F, -4.4469F, 0.1856F, -0.1732F, 0.4471F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(76, 57).addBox(2.3537F, -1.4709F, -0.7981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.0071F, -4.4469F, 0.0813F, -0.2619F, 0.9215F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(71, 14).addBox(2.9743F, -3.5031F, -0.7981F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.0071F, -4.4469F, -0.0686F, -0.2654F, 1.4824F));

		PartDefinition Belly_r9 = body.addOrReplaceChild("Belly_r9", CubeListBuilder.create().texOffs(21, 24).addBox(-1.1158F, -0.925F, -0.1F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4921F, -4.3047F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Belly_r10 = body.addOrReplaceChild("Belly_r10", CubeListBuilder.create().texOffs(42, 7).addBox(0.8842F, -1.0F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2906F, -4.9018F, -0.0064F, -0.0873F, 0.0006F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(21, 89).addBox(1.3842F, -1.2066F, -0.0709F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7331F, -1.9572F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(18, 89).addBox(1.3842F, -1.3312F, -0.0523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4331F, -3.9572F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-4.3862F, -1.3754F, -0.7568F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.2191F, -1.4434F, 0.0349F, 0.1967F, -0.8271F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-2.7558F, -0.1426F, -0.6922F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.2191F, -1.4434F, 0.1148F, 0.1357F, -0.3531F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-7.0513F, -3.438F, -0.7568F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.2191F, -1.4434F, -0.0726F, 0.1862F, -1.3784F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 81).mirror().addBox(-4.3613F, -1.3662F, -0.7579F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.0191F, -3.4434F, 0.0028F, 0.1769F, -0.7803F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-2.7295F, -0.1457F, -0.694F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.0191F, -3.4434F, 0.0774F, 0.1326F, -0.3053F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 8).mirror().addBox(-7.0347F, -3.4173F, -0.7579F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.0191F, -3.4434F, -0.0895F, 0.1529F, -1.3284F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-6.9085F, -3.4533F, -0.7615F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.1809F, -5.4434F, -0.0974F, 0.1538F, -1.3472F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-4.2716F, -1.462F, -0.7615F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.1809F, -5.4434F, -0.0036F, 0.1818F, -0.799F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-2.6931F, -0.2717F, -0.6991F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.1809F, -5.4434F, 0.074F, 0.1398F, -0.3233F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 80).addBox(2.3862F, -1.3754F, -0.7568F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.2191F, -1.4434F, 0.0349F, -0.1967F, 0.8271F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(72, 27).addBox(-0.2442F, -0.1426F, -0.6922F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.2191F, -1.4434F, 0.1148F, -0.1357F, 0.3531F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 6).addBox(3.0513F, -3.438F, -0.7568F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.2191F, -1.4434F, -0.0726F, -0.1862F, 1.3784F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(19, 81).addBox(2.3613F, -1.3662F, -0.7579F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.0191F, -3.4434F, 0.0028F, -0.1769F, 0.7803F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 70).addBox(-0.2705F, -0.1457F, -0.694F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.0191F, -3.4434F, 0.0774F, -0.1326F, 0.3053F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 8).addBox(3.0347F, -3.4173F, -0.7579F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.0191F, -3.4434F, -0.0895F, -0.1529F, 1.3284F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 22).addBox(2.9085F, -3.4533F, -0.7615F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.1809F, -5.4434F, -0.0974F, -0.1538F, 1.3472F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(81, 31).addBox(2.2716F, -1.462F, -0.7615F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.1809F, -5.4434F, -0.0036F, -0.1818F, 0.799F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 68).addBox(-0.3069F, -0.2717F, -0.6991F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.1809F, -5.4434F, 0.074F, -0.1398F, 0.3233F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(15, 89).addBox(1.3842F, -1.1652F, -0.1509F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3331F, -5.8572F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 20).addBox(-0.6158F, -1.0237F, -0.0391F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.509F, -5.3707F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(32, 30).addBox(0.8842F, -1.0237F, 4.9609F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.1669F, -10.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(89, 39).addBox(1.3842F, -1.2976F, -4.032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1669F, -5.9572F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Bodyfront_r6 = bone.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(43, 89).addBox(1.3842F, -1.1814F, -0.0414F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-4.8559F, -3.5291F, -0.7203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8842F, 0.0141F, -3.4862F, -0.0943F, 0.1181F, -1.5037F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-4.2657F, -1.5541F, -0.7203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8842F, 0.0141F, -3.4862F, -0.0197F, 0.1497F, -0.9585F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 11).mirror().addBox(-2.7285F, -0.3568F, -0.6575F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8842F, 0.0141F, -3.4862F, 0.045F, 0.1185F, -0.484F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-2.6871F, -0.3293F, -0.6591F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1842F, 0.2141F, -1.3862F, 0.0295F, 0.1111F, -0.3634F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(81, 44).mirror().addBox(-4.2411F, -1.5108F, -0.7211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1842F, 0.2141F, -1.3862F, -0.0301F, 0.1361F, -0.8377F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-5.8572F, -3.4794F, -0.7211F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1842F, 0.2141F, -1.3862F, -0.0961F, 0.1011F, -1.3815F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(78, 16).addBox(2.8559F, -3.5291F, -0.7203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8842F, 0.0141F, -3.4862F, -0.0943F, -0.1181F, 1.5037F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(12, 78).addBox(2.2657F, -1.5541F, -0.7203F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8842F, 0.0141F, -3.4862F, -0.0197F, -0.1497F, 0.9585F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 11).addBox(0.7286F, -0.3568F, -0.6575F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8842F, 0.0141F, -3.4862F, 0.045F, -0.1185F, 0.484F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(21, 75).addBox(-0.3129F, -0.3293F, -0.6591F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5842F, 0.2141F, -1.3862F, 0.0295F, -0.1111F, 0.3634F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(81, 44).addBox(2.2411F, -1.5108F, -0.7211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5842F, 0.2141F, -1.3862F, -0.0301F, -0.1361F, 0.8377F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 22).addBox(2.8572F, -3.4794F, -0.7211F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5842F, 0.2141F, -1.3862F, -0.0961F, -0.1011F, 1.3815F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(32, 38).addBox(-3.0F, -1.1F, -2.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3842F, 6.0338F, -4.5429F, -0.48F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = bone.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -0.6F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3842F, 5.6433F, -2.0235F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = bone.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(13, 44).addBox(0.8842F, -1.442F, -4.8209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = bone.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3961F, 4.1662F, -4.9301F, 0.1736F, -1.0633F, 0.2558F));

		PartDefinition cube_r79 = leftArm2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 84).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2781F, 0.6517F, -0.0412F, 0.0F, -2.5307F, 0.0F));

		PartDefinition cube_r80 = leftArm2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(83, 83).addBox(0.4F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6933F, 0.6517F, 0.4746F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r81 = leftArm2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 24).addBox(-16.9684F, 2.1028F, -2.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7015F, -2.4511F, -17.198F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r82 = leftArm2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(83, 80).addBox(-0.35F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1932F, 0.6517F, -1.0401F, 0.0F, -1.6581F, 0.0F));

		PartDefinition cube_r83 = leftArm2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 49).addBox(-4.275F, -0.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6556F, 0.1517F, -1.7434F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r84 = leftArm2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(56, 56).addBox(-1.2F, -0.5F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8474F, 0.1517F, -0.8409F, 0.0F, 0.1396F, 0.0F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(84, 40).addBox(-0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5223F, -0.171F, -1.1706F, 1.5177F, 0.3102F, 0.7562F));

		PartDefinition cube_r85 = leftArm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 37).addBox(-0.2F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6951F, 0.0F, -2.4096F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r86 = leftArm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(76, 0).addBox(-1.3F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6297F, 0.0F, -1.6313F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r87 = leftArm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(50, 84).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(65, 45).addBox(-0.3F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3341F, 0.0F, -0.9297F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r88 = leftArm.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 46).addBox(-1.95F, 0.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9F, -0.5F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(30, 75).addBox(-0.5568F, -2.5F, -0.9681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.772F, 0.3727F, -3.305F, -1.0688F, 0.2945F, 1.0037F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(53, 0).addBox(-1.0F, -2.5F, -3.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5346F, 0.0F, -0.8871F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightArm2 = bone.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6277F, 4.1662F, -4.9301F, 0.2065F, -0.1534F, -0.4001F));

		PartDefinition cube_r89 = rightArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2781F, 0.6517F, -0.0412F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r90 = rightArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(83, 83).mirror().addBox(-1.4F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6933F, 0.6517F, 0.4746F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r91 = rightArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(75, 24).mirror().addBox(14.9684F, 2.1028F, -2.3567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7015F, -2.4511F, -17.198F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r92 = rightArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-0.65F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1932F, 0.6517F, -1.0401F, 0.0F, 1.6581F, 0.0F));

		PartDefinition cube_r93 = rightArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(0.275F, -0.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.6556F, 0.1517F, -1.7434F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r94 = rightArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-2.8F, -0.5F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8474F, 0.1517F, -0.8409F, 0.0F, -0.1396F, 0.0F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(84, 40).mirror().addBox(-0.6F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5223F, -0.171F, -1.1706F, 1.5123F, -0.5281F, -0.7429F));

		PartDefinition cube_r95 = rightArm.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-2.8F, -0.5F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6951F, 0.0F, -2.4096F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r96 = rightArm.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.7F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6297F, 0.0F, -1.6313F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r97 = rightArm.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(65, 45).mirror().addBox(-2.7F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3341F, 0.0F, -0.9297F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r98 = rightArm.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(0.95F, 0.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.4432F, -2.5F, -0.9681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.772F, 0.3727F, -3.305F, -1.0596F, -0.1619F, -1.2357F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(0.0F, -2.5F, -3.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5346F, 0.0F, -0.8871F, 0.0F, -0.7418F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(5.7842F, 4.6381F, -4.6865F));

		PartDefinition Bodyfront_r10 = bone3.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(62, 0).addBox(-1.1F, -1.759F, -1.9145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3375F, 0.3189F, 0.9223F));

		PartDefinition Bodyfront_r11 = bone3.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5019F, 0.924F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3353F, 0.5644F, 3.1085F, 1.5897F, 0.0518F, 1.0383F));

		PartDefinition Bodyfront_r12 = bone3.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(83, 37).addBox(-0.5019F, 0.825F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3353F, 0.5644F, 3.1085F, 1.9824F, 0.0518F, 1.0383F));

		PartDefinition Bodyfront_r13 = bone3.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(41, 65).addBox(-0.5019F, -0.7596F, -0.6886F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3353F, 0.5644F, 3.1085F, 1.4151F, 0.0518F, 1.0383F));

		PartDefinition Bodyfront_r14 = bone3.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(65, 40).addBox(-0.5019F, -2.3815F, -0.5308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3353F, 0.5644F, 3.1085F, 1.6944F, 0.0518F, 1.0383F));

		PartDefinition Bodyfront_r15 = bone3.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(15, 83).addBox(-1.0F, -0.0324F, 0.7416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 0.5599F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r16 = bone3.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(37, 49).addBox(-1.0F, 0.2023F, -0.0227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.3453F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r17 = bone3.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.4977F, -0.0227F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.1708F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r18 = bone3.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(71, 10).addBox(-0.5F, -0.775F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0931F, -4.5543F, 2.1904F, 0.9526F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r19 = bone3.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(42, 72).addBox(-0.5F, -2.175F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.068F, -4.2323F, 1.8049F, 1.9126F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r20 = bone3.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(71, 16).addBox(-1.0F, 0.4065F, 2.989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.2F, 1.5635F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r21 = bone3.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(38, 0).addBox(-1.9F, -0.9F, -0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 1.2002F, 0.2522F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition Bodyfront_r22 = bone3.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(78, 63).addBox(-0.5F, -1.35F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2076F, -5.0225F, 1.2638F, 1.9126F, 0.0518F, -0.1398F));

		PartDefinition Bodyfront_r23 = bone3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -1.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0325F, -4.5453F, 3.3233F, 1.4762F, 0.0518F, -0.1398F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.0158F, 4.6381F, -4.6865F));

		PartDefinition Bodyfront_r24 = bone5.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(0.1F, -1.759F, -1.9145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3375F, -0.3189F, -0.9223F));

		PartDefinition Bodyfront_r25 = bone5.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.4981F, 0.924F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3353F, 0.5644F, 3.1085F, 1.5897F, -0.0518F, -1.0383F));

		PartDefinition Bodyfront_r26 = bone5.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-0.4981F, 0.825F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3353F, 0.5644F, 3.1085F, 1.9824F, -0.0518F, -1.0383F));

		PartDefinition Bodyfront_r27 = bone5.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(41, 65).mirror().addBox(-0.4981F, -0.7596F, -0.6886F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3353F, 0.5644F, 3.1085F, 1.4151F, -0.0518F, -1.0383F));

		PartDefinition Bodyfront_r28 = bone5.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-0.4981F, -2.3815F, -0.5308F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3353F, 0.5644F, 3.1085F, 1.6944F, -0.0518F, -1.0383F));

		PartDefinition Bodyfront_r29 = bone5.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(0.0F, -0.0324F, 0.7416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.2F, 0.5599F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r30 = bone5.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(37, 49).mirror().addBox(0.0F, 0.2023F, -0.0227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.2F, 1.3453F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r31 = bone5.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(0.0F, -1.4977F, -0.0227F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.2F, 1.1708F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r32 = bone5.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.5F, -0.775F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.0931F, -4.5543F, 2.1904F, 0.9526F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r33 = bone5.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-0.5F, -2.175F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.068F, -4.2323F, 1.8049F, 1.9126F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r34 = bone5.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(0.0F, 0.4065F, 2.989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.2F, 1.5635F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r35 = bone5.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.1F, -0.9F, -0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.2002F, 0.2522F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition Bodyfront_r36 = bone5.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-0.5F, -1.35F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.2076F, -5.0225F, 1.2638F, 1.9126F, -0.0518F, 0.1398F));

		PartDefinition Bodyfront_r37 = bone5.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.5F, -1.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0325F, -4.5453F, 3.3233F, 1.4762F, -0.0518F, 0.1398F));

		PartDefinition Neck = bone.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7849F, -4.9332F, -0.3358F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 90).addBox(1.3842F, -1.212F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4093F, -2.9119F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-1.5776F, -0.0766F, -0.5236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.0906F, -2.414F, 0.4215F, 0.336F, -0.594F));

		PartDefinition cube_r100 = Neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-2.3704F, -0.7833F, -0.5606F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, 0.0906F, -2.414F, 0.2195F, 0.5114F, -1.0757F));

		PartDefinition cube_r101 = Neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 78).mirror().addBox(-3.3704F, -0.7833F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.1094F, -0.414F, 0.1738F, 0.4341F, -0.9568F));

		PartDefinition cube_r102 = Neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-1.5776F, -0.0766F, -0.5236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.1094F, -0.414F, 0.3461F, 0.2863F, -0.4775F));

		PartDefinition cube_r103 = Neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(88, 83).addBox(1.3703F, -0.7833F, -0.5606F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.0906F, -2.414F, 0.2195F, -0.5114F, 1.0757F));

		PartDefinition cube_r104 = Neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(12, 80).addBox(-0.4224F, -0.0766F, -0.5236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, 0.0906F, -2.414F, 0.4215F, -0.336F, 0.594F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(46, 89).addBox(1.3842F, -1.512F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4093F, -0.9119F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 18).addBox(-0.4224F, -0.0766F, -0.5236F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.1094F, -0.414F, 0.3461F, -0.2863F, 0.4775F));

		PartDefinition cube_r106 = Neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(54, 78).addBox(1.3703F, -0.7833F, -0.5606F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.1094F, -0.414F, 0.1738F, -0.4341F, 0.9568F));

		PartDefinition Neck_r3 = Neck.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(47, 56).addBox(0.8842F, -1.0375F, 1.0526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7907F, -3.9119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.9119F, 0.0303F, -0.2932F, -0.0867F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(89, 43).addBox(1.3842F, -0.225F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0858F, -3.5106F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8842F, -0.0001F, -1.5021F, 0.3461F, 0.2863F, -0.7742F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8842F, -0.0001F, -1.5021F, 0.3461F, -0.2863F, 0.7742F));

		PartDefinition Neck_r5 = neck2.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(21, 71).addBox(0.8842F, -1.0572F, 1.3512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4942F, -1.3596F, 0.3453F, -0.0148F, 0.0409F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(42, 21).addBox(-1.1158F, -2.9912F, -3.0318F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.8645F, -4.5575F, 1.5533F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(77, 84).addBox(-0.1158F, -0.9912F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.0F, -0.5917F, -16.5947F, -2.8362F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(60, 84).addBox(-0.1158F, -0.9912F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5454F, -16.294F, 2.8362F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(7, 74).addBox(-0.1158F, -0.9912F, -2.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -2.0679F, -15.4414F, 2.1206F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(64, 73).addBox(-0.1158F, -0.9912F, -2.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1811F, -14.4478F, 1.6842F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(71, 72).addBox(-0.1158F, -0.9912F, -2.0318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -2.2248F, -13.4488F, 1.6144F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(64, 16).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3842F, -0.321F, -11.7856F, 1.309F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(64, 10).addBox(-0.1158F, -2.9912F, -2.0318F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0939F, -10.4516F, 1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, -1.5F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3842F, 1.0244F, -9.1307F, 1.3352F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(55, 7).addBox(-0.1158F, -2.8912F, -2.0318F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.9169F, -7.557F, 1.5097F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(35, 85).addBox(-0.1158F, -1.9912F, -0.8068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 35).addBox(-2.1158F, -1.9912F, -3.0318F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.725F, -2.5624F, 1.501F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(57, 52).addBox(-1.6158F, -1.1064F, -1.7358F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.0F, -1.5506F, -1.566F, 1.7191F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(23, 15).addBox(-4.1158F, -0.9814F, -2.0108F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.5506F, -1.566F, 1.4137F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(23, 9).addBox(-4.1158F, -3.0174F, -1.9817F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -0.8315F, -0.8038F, 1.6013F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(21, 20).addBox(-4.6158F, -0.0174F, -1.9817F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -1.5167F, -1.5322F, 0.8159F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0489F, -1.254F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Lowerjaw7_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r1", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-0.0402F, 4.2464F, -12.3029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.8046F, -0.2372F, 0.2017F));

		PartDefinition Lowerjaw8_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r1", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-0.4542F, -4.2283F, -7.1406F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, 0.0176F, -0.2733F, 0.214F));

		PartDefinition Lowerjaw7_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r2", CubeListBuilder.create().texOffs(64, 69).mirror().addBox(-0.4542F, -2.1343F, -9.2608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.2617F, -0.2733F, 0.214F));

		PartDefinition Lowerjaw6_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r1", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.4542F, 0.8788F, -9.4567F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.5584F, -0.2733F, 0.214F));

		PartDefinition Lowerjaw6_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r2", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.4064F, -0.3518F, -6.9612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.3646F, -0.2777F, 0.1717F));

		PartDefinition Lowerjaw5_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r1", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.6722F, -0.4668F, -4.997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.3375F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw6_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r3", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.6722F, -1.9285F, -6.3484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.3637F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw5_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r2", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.6722F, -0.8669F, -5.6272F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.5557F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw4_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r1", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.6722F, -0.615F, -4.1329F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.2939F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw4_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r2", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-0.6722F, -0.2335F, -2.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(9, 60).mirror().addBox(-0.6722F, 0.5665F, -2.1558F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.3812F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw3_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r1", CubeListBuilder.create().texOffs(38, 55).mirror().addBox(-0.6556F, 0.2945F, -2.7374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -1.0062F, -0.2968F, 0.1962F));

		PartDefinition Lowerjaw5_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r3", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(-0.2316F, -7.0507F, -12.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(82, 5).mirror().addBox(-0.2316F, -7.7507F, -12.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, 0.0469F, -0.246F, 0.2106F));

		PartDefinition Lowerjaw5_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r4", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.2316F, 4.4635F, -13.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.8694F, -0.246F, 0.2106F));

		PartDefinition Lowerjaw5_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r5", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.2316F, -13.6214F, -2.3729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, 0.9894F, -0.246F, 0.2106F));

		PartDefinition Lowerjaw7_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r3", CubeListBuilder.create().texOffs(31, 82).mirror().addBox(-0.0402F, 0.6896F, -11.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(7, 70).mirror().addBox(-0.0402F, 0.1896F, -12.2632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.5036F, -0.2372F, 0.2017F));

		PartDefinition Lowerjaw5_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r6", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.0629F, -0.8126F, -10.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.402F, -0.2382F, 0.1979F));

		PartDefinition Lowerjaw7_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r4", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5724F, -3.4628F, -7.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.1083F, -0.3407F, 0.0963F));

		PartDefinition Lowerjaw6_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r4", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-0.5724F, -2.094F, -9.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.2828F, -0.3407F, 0.0963F));

		PartDefinition Lowerjaw7_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r5", CubeListBuilder.create().texOffs(88, 36).mirror().addBox(-0.1352F, -0.8853F, -10.5473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.4456F, -0.2382F, 0.1979F));

		PartDefinition Lowerjaw7_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r6", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.0402F, -0.9414F, -11.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.4512F, -0.2372F, 0.2017F));

		PartDefinition Lowerjaw8_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r2", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.0402F, 3.0823F, -12.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.8003F, -0.2372F, 0.2017F));

		PartDefinition Lowerjaw10_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r1", CubeListBuilder.create().texOffs(81, 33).mirror().addBox(-0.5955F, -0.9869F, -0.4734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.9758F, -6.1098F, -11.635F, -0.1341F, -0.252F, 0.166F));

		PartDefinition Lowerjaw11_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r1", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-0.3265F, -2.5674F, -13.7331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.4156F, -0.246F, 0.2106F));

		PartDefinition Lowerjaw3_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r2", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.6722F, 0.158F, -0.5072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.0757F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw2_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r1", CubeListBuilder.create().texOffs(75, 5).mirror().addBox(-0.6722F, 0.1642F, -0.9712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.7739F, -0.3289F, 0.1576F));

		PartDefinition Lowerjaw8_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r3", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-0.1253F, 1.4712F, -10.2189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.619F, 0.0197F, 0.0557F, -0.6292F, -0.2301F, 0.2422F));

		PartDefinition Lowerjaw7_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r7", CubeListBuilder.create().texOffs(63, 77).addBox(-0.8747F, 1.4712F, -10.2189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.6292F, 0.2301F, -0.2422F));

		PartDefinition Lowerjaw6_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r5", CubeListBuilder.create().texOffs(18, 60).addBox(-0.9598F, 4.2464F, -12.3029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.8046F, 0.2372F, -0.2017F));

		PartDefinition Lowerjaw7_r8 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r8", CubeListBuilder.create().texOffs(64, 64).addBox(-0.5458F, -4.2283F, -7.1406F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, 0.0176F, 0.2733F, -0.214F));

		PartDefinition Lowerjaw6_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r6", CubeListBuilder.create().texOffs(64, 69).addBox(-0.5458F, -2.1343F, -9.2608F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.2617F, 0.2733F, -0.214F));

		PartDefinition Lowerjaw5_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r7", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5458F, 0.8788F, -9.4567F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.5584F, 0.2733F, -0.214F));

		PartDefinition Lowerjaw5_r8 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r8", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5936F, -0.3518F, -6.9612F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.3646F, 0.2777F, -0.1717F));

		PartDefinition Lowerjaw4_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r3", CubeListBuilder.create().texOffs(35, 78).addBox(-0.3278F, -0.4668F, -4.997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.3375F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw5_r9 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r9", CubeListBuilder.create().texOffs(40, 81).addBox(-0.3278F, -1.9285F, -6.3484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.3637F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw4_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r4", CubeListBuilder.create().texOffs(55, 13).addBox(-0.3278F, -0.8669F, -5.6272F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.5557F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw3_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r3", CubeListBuilder.create().texOffs(65, 59).addBox(-0.3278F, -0.615F, -4.1329F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.2939F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw3_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r4", CubeListBuilder.create().texOffs(88, 30).addBox(-0.3278F, -0.2335F, -2.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(9, 60).addBox(-0.3278F, 0.5665F, -2.1558F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.3812F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw2_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r2", CubeListBuilder.create().texOffs(38, 55).addBox(-0.3444F, 0.2945F, -2.7374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -1.0062F, 0.2968F, -0.1962F));

		PartDefinition Lowerjaw4_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r5", CubeListBuilder.create().texOffs(10, 82).addBox(-0.7684F, -7.0507F, -12.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(82, 5).addBox(-0.7684F, -7.7507F, -12.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, 0.0469F, 0.246F, -0.2106F));

		PartDefinition Lowerjaw4_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r6", CubeListBuilder.create().texOffs(0, 76).addBox(-0.7684F, 4.4635F, -13.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.8694F, 0.246F, -0.2106F));

		PartDefinition Lowerjaw4_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r7", CubeListBuilder.create().texOffs(30, 88).addBox(-0.7684F, -13.6214F, -2.3729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, 0.9894F, 0.246F, -0.2106F));

		PartDefinition Lowerjaw6_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r7", CubeListBuilder.create().texOffs(31, 82).addBox(-0.9598F, 0.6896F, -11.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(7, 70).addBox(-0.9598F, 0.1896F, -12.2632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.5036F, 0.2372F, -0.2017F));

		PartDefinition Lowerjaw4_r8 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r8", CubeListBuilder.create().texOffs(5, 88).addBox(-0.9371F, -0.8126F, -10.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.402F, 0.2382F, -0.1979F));

		PartDefinition Lowerjaw6_r8 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r8", CubeListBuilder.create().texOffs(83, 0).addBox(-0.4276F, -3.4628F, -7.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.1083F, 0.3407F, -0.0963F));

		PartDefinition Lowerjaw5_r10 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r10", CubeListBuilder.create().texOffs(5, 82).addBox(-0.4276F, -2.094F, -9.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.2828F, 0.3407F, -0.0963F));

		PartDefinition Lowerjaw6_r9 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r9", CubeListBuilder.create().texOffs(88, 36).addBox(-0.8648F, -0.8853F, -10.5473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.4456F, 0.2382F, -0.1979F));

		PartDefinition Lowerjaw6_r10 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r10", CubeListBuilder.create().texOffs(82, 24).addBox(-0.9598F, -0.9414F, -11.5674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.4512F, 0.2372F, -0.2017F));

		PartDefinition Lowerjaw7_r9 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r9", CubeListBuilder.create().texOffs(35, 88).addBox(-0.9598F, 3.0823F, -12.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.8003F, 0.2372F, -0.2017F));

		PartDefinition Lowerjaw9_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r1", CubeListBuilder.create().texOffs(81, 33).addBox(-0.4045F, -0.9869F, -0.4734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7926F, -6.1098F, -11.635F, -0.1341F, 0.252F, -0.166F));

		PartDefinition Lowerjaw10_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r2", CubeListBuilder.create().texOffs(21, 77).addBox(-0.6735F, -2.5674F, -13.7331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.4156F, 0.246F, -0.2106F));

		PartDefinition Lowerjaw2_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw2_r3", CubeListBuilder.create().texOffs(83, 56).addBox(-0.3278F, 0.158F, -0.5072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.0757F, 0.3289F, -0.1576F));

		PartDefinition Lowerjaw1_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw1_r1", CubeListBuilder.create().texOffs(75, 5).addBox(-0.3278F, 0.1642F, -0.9712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.3874F, 0.0197F, 0.0557F, -0.7739F, 0.3289F, -0.1576F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(3.9F, -1.8645F, -4.5575F));

		PartDefinition Head_r16 = leftFace2.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(42, 76).addBox(-0.6F, -2.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0158F, 0.78F, -6.4299F, 1.5268F, 0.1308F, -0.0057F));

		PartDefinition Head_r17 = leftFace2.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(57, 64).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0158F, -0.0139F, -2.8929F, 1.5076F, 0.2613F, -0.0164F));

		PartDefinition Head_r18 = leftFace2.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, -0.5491F, -0.2035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0658F, 1.8604F, -11.103F, -2.6915F, 0.331F, -0.0178F));

		PartDefinition Head_r19 = leftFace2.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(87, 18).addBox(-0.5F, -0.5398F, -0.7979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0658F, 1.8604F, -11.103F, -2.3948F, 0.331F, -0.0178F));

		PartDefinition Head_r20 = leftFace2.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(58, 41).addBox(-1.0158F, -3.9912F, -2.0318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.406F, 0.2692F, -0.5051F));

		PartDefinition Head_r21 = leftFace2.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0158F, 0.0088F, -2.0318F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2744F, 0.3595F, -0.5221F));

		PartDefinition Head_r22 = leftFace2.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(60, 34).addBox(-1.0158F, 0.0088F, -2.0318F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4816F, 0.4537F, -0.0085F));

		PartDefinition Head_r23 = leftFace2.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(58, 27).addBox(-1.0158F, -3.9912F, -2.0318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5524F, 0.3141F, -0.0057F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(-1.1316F, -1.8645F, -4.5575F));

		PartDefinition Head_r24 = rightFace2.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(-0.4F, -2.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0158F, 0.78F, -6.4299F, 1.5268F, -0.1308F, 0.0057F));

		PartDefinition Head_r25 = rightFace2.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.0158F, -0.0139F, -2.8929F, 1.5076F, -0.2613F, 0.0164F));

		PartDefinition Head_r26 = rightFace2.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-0.5F, -0.5491F, -0.2035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0658F, 1.8604F, -11.103F, -2.6915F, -0.331F, 0.0178F));

		PartDefinition Head_r27 = rightFace2.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-0.5F, -0.5398F, -0.7979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0658F, 1.8604F, -11.103F, -2.3948F, -0.331F, 0.0178F));

		PartDefinition Head_r28 = rightFace2.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(58, 41).mirror().addBox(0.0158F, -3.9912F, -2.0318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.406F, -0.2692F, 0.5051F));

		PartDefinition Head_r29 = rightFace2.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0158F, 0.0088F, -2.0318F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2744F, -0.3595F, 0.5221F));

		PartDefinition Head_r30 = rightFace2.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(60, 34).mirror().addBox(0.0158F, 0.0088F, -2.0318F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4816F, -0.4537F, 0.0085F));

		PartDefinition Head_r31 = rightFace2.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(0.0158F, -3.9912F, -2.0318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5524F, -0.3141F, 0.0057F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5711F, -0.8152F, -0.8835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.698F, 2.6078F, -2.3324F, -0.0698F, -0.0174F, -0.1559F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(69, 0).addBox(-1.0F, -1.9602F, -2.0026F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3655F, -2.5763F, -0.225F, -0.3764F, 0.2737F, -0.774F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -1.9602F, -2.0026F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4671F, -0.8508F, -0.799F, -0.3102F, 0.3474F, -0.5583F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(74, 29).addBox(-1.0F, -0.9602F, -2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4289F, 0.1454F, -0.8774F, -0.0873F, 0.4538F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(86, 33).addBox(-0.5055F, -0.5481F, -0.9261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.564F, -3.1004F, -13.0297F, 0.6481F, 0.3966F, 0.1759F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(30, 85).addBox(-0.875F, -0.175F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 53).addBox(-1.0F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9494F, -3.7051F, -13.0685F, 0.5608F, -0.0377F, 0.8838F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(86, 27).addBox(-0.4792F, -0.5402F, -0.0736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.564F, -3.1004F, -13.0297F, 0.4127F, 0.393F, 0.1053F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(0, 87).addBox(-1.755F, -0.6315F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6198F, -2.8535F, -12.2056F, 0.2002F, 0.2856F, 0.9365F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(45, 86).addBox(-0.9843F, -0.9842F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6198F, -2.8535F, -12.2056F, -0.1047F, 0.3316F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(55, 87).addBox(-1.755F, -0.6315F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3698F, -2.7535F, -11.6056F, 0.2002F, 0.2856F, 0.9365F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(50, 87).addBox(-0.9843F, -0.9842F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3698F, -2.7535F, -11.6056F, -0.1047F, 0.3316F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(56, 59).addBox(-0.625F, -0.35F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1095F, -4.4059F, -9.9645F, -0.0525F, 0.1287F, -0.402F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(56, 74).addBox(-0.9958F, -0.942F, -2.0774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.014F, -3.0926F, -9.4326F, -0.3575F, 0.0154F, -0.396F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(74, 53).addBox(-0.7958F, -1.142F, -2.0774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.2711F, -1.9546F, -9.7774F, -0.3229F, 0.1571F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(87, 24).addBox(-0.7958F, -1.0002F, -1.0867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2711F, -1.9546F, -9.7774F, -0.4538F, 0.1571F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(80, 67).addBox(-1.1278F, -1.9856F, -0.3757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8968F, -2.8041F, -9.2809F, -0.4077F, 0.059F, -0.3081F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(47, 28).addBox(-1.1278F, -0.1856F, 0.1243F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.495F, -4.7486F, -8.9474F, -0.0106F, 0.0067F, -0.3076F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(50, 64).addBox(-0.65F, -0.9F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.435F, -3.8839F, -6.3356F, -0.1027F, 0.2772F, -0.3105F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(62, 81).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.2127F, -1.368F, -7.4865F, -0.192F, 0.192F, 0.0175F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.3972F, -1.5561F, -8.4524F, -0.2356F, 0.192F, 0.0175F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(78, 80).addBox(-0.7F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 0).addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.2161F, -2.8084F, -12.7774F, 0.7206F, 0.3591F, 0.1635F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(87, 86).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.9181F, -2.5891F, -11.2247F, -0.2793F, 0.192F, 0.0175F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.7409F, -2.2789F, -10.2853F, -0.4102F, 0.192F, 0.0175F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(60, 87).addBox(-1.1278F, -0.3606F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(87, 21).addBox(-1.1278F, -0.7856F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9645F, -2.0583F, -9.5623F, -0.3665F, 0.192F, 0.0175F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(35, 66).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8348F, -2.415F, -8.2576F, -0.3763F, 0.0636F, -0.329F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(26, 82).addBox(-1.1278F, -0.764F, 0.6164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9645F, -2.0583F, -9.5623F, -0.3316F, 0.192F, 0.0175F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(55, 19).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7606F, -3.7606F, -6.1076F, -0.5081F, 0.2222F, -0.732F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(57, 80).addBox(-0.5F, -1.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.662F, -3.2831F, -7.6294F, -1.88F, 0.3423F, -0.4896F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(81, 53).addBox(-0.475F, -0.85F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5709F, -3.4258F, -7.2155F, -0.1625F, 0.1772F, -0.4164F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(50, 61).addBox(-0.475F, -0.425F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.5709F, -3.4258F, -7.2155F, -0.7734F, 0.1772F, -0.4164F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(82, 86).addBox(-0.3F, -0.4F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 86).addBox(-0.475F, -0.4F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(35, 70).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.1984F, -3.5213F, -6.1671F, -0.2656F, 0.3423F, -0.4896F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(20, 83).addBox(-0.95F, -2.575F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 54).addBox(-1.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1621F, -2.0293F, -6.9102F, -0.4401F, 0.3423F, -0.4896F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(20, 55).addBox(-1.5836F, -0.5947F, 1.1427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9645F, -2.0583F, -9.5623F, -0.2269F, 0.5061F, 0.0175F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(65, 27).addBox(-1.0F, -2.2F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4939F, -3.0325F, -4.1812F, -0.3017F, 0.282F, -0.7026F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(29, 55).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.4939F, -3.0325F, -4.1812F, -0.6944F, 0.282F, -0.7026F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(14, 65).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.107F, -1.3941F, -5.2609F, -0.6315F, 0.4166F, -0.5197F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(14, 70).addBox(-1.2034F, -0.7967F, -2.1226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4711F, -0.2546F, -4.7774F, -0.3578F, 0.6632F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(79, 59).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7923F, -2.6423F, -3.2314F, -0.6096F, 0.2334F, -0.713F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(78, 72).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3307F, -0.9475F, -4.1877F, -0.5401F, 0.3764F, -0.4828F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(10, 85).addBox(-0.9735F, -0.7092F, -1.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7711F, 0.1454F, -3.2774F, -0.3142F, 0.576F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(78, 76).addBox(-0.9735F, -1.9401F, -0.7999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7426F, -0.8533F, -3.2335F, -0.3549F, 0.4665F, -0.5932F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(85, 8).addBox(-0.9735F, -0.9401F, -0.8999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7711F, 0.1454F, -3.2774F, -0.0524F, 0.576F, 0.0F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(67, 52).addBox(-1.0F, -2.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3429F, -2.6662F, -2.2982F, -0.2195F, 0.4317F, -0.8546F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(79, 40).addBox(-1.0F, -2.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3448F, -0.9409F, -2.4638F, -0.0931F, 0.4727F, -0.567F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(14, 74).addBox(-1.0F, -1.3627F, -2.5616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4289F, 0.1454F, -0.8774F, 0.1658F, 0.4538F, 0.0F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(76, 37).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1701F, -0.3152F, 2.0825F, 0.0F, 0.3054F, 0.0F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3875F, -2.6278F, 0.8978F, 0.1706F, -0.1996F, -0.7153F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(7, 78).addBox(-1.9F, -1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6463F, -2.6278F, 1.8637F, 0.2863F, 0.1514F, -0.1123F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(73, 79).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6463F, -2.6278F, 1.8637F, 0.1737F, 0.2735F, -0.6338F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(74, 33).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -0.8152F, 2.0825F, 0.1142F, 0.2836F, -0.3911F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(47, 79).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4289F, -0.8152F, 1.1165F, 0.1128F, -0.2368F, -0.4498F));

		PartDefinition Head_r82 = leftFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(85, 15).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4289F, -0.3152F, 1.1165F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Head_r83 = leftFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(25, 85).addBox(-1.0F, -1.1F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4163F, -2.6278F, -0.9835F, -0.1745F, 0.0F, -0.6981F));

		PartDefinition Head_r84 = leftFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(68, 79).addBox(-1.0F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4163F, -2.6278F, 1.0165F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Head_r85 = leftFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(67, 32).addBox(-1.0F, -2.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4289F, -0.8152F, 1.0165F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Head_r86 = leftFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(74, 44).addBox(-0.5067F, -0.9906F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4574F, 0.0926F, 0.3538F, -0.6545F, 0.1309F, 0.0F));

		PartDefinition Head_r87 = leftFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(35, 74).addBox(-0.5067F, -0.4631F, -0.7002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4574F, 0.0926F, 0.3538F, -1.0036F, 0.1309F, 0.0F));

		PartDefinition Head_r88 = leftFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(68, 48).addBox(-3.3F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-4.9855F, 0.217F, -3.8422F, -0.9297F, -0.5109F, 0.99F));

		PartDefinition Head_r89 = leftFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(66, 24).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9855F, 0.217F, -3.8422F, -0.8369F, -0.3441F, 0.7679F));

		PartDefinition Head_r90 = leftFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(83, 71).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.1557F, 0.751F, -3.6796F, -0.7874F, -0.1634F, 0.5718F));

		PartDefinition Head_r91 = leftFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9344F, -1.545F, -5.516F, -0.9197F, 0.4974F, -0.1495F));

		PartDefinition Head_r92 = leftFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5067F, -0.496F, -8.5784F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4574F, 0.0926F, 0.3538F, -0.3961F, 0.4974F, -0.1495F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.4289F, -0.8152F, -0.8835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9296F, 2.6078F, -2.3324F, -0.0698F, 0.0174F, 0.1559F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.0F, -1.9602F, -2.0026F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3655F, -2.5763F, -0.225F, -0.3764F, -0.2737F, 0.774F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(0.0F, -1.9602F, -2.0026F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4671F, -0.8508F, -0.799F, -0.3102F, -0.3474F, 0.5583F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(0.0F, -0.9602F, -2.0026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, 0.1454F, -0.8774F, -0.0873F, -0.4538F, 0.0F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.4945F, -0.5481F, -0.9261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.564F, -3.1004F, -13.0297F, 0.6481F, -0.3966F, -0.1759F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.125F, -0.175F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(86, 53).mirror().addBox(0.0F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9494F, -3.7051F, -13.0685F, 0.5608F, 0.0377F, -0.8838F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.5208F, -0.5402F, -0.0736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.564F, -3.1004F, -13.0297F, 0.4127F, -0.393F, -0.1053F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(0.755F, -0.6315F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6198F, -2.8535F, -12.2056F, 0.2002F, -0.2856F, -0.9365F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.0157F, -0.9842F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6198F, -2.8535F, -12.2056F, -0.1047F, -0.3316F, 0.0F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(0.755F, -0.6315F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3698F, -2.7535F, -11.6056F, 0.2002F, -0.2856F, -0.9365F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.0157F, -0.9842F, -0.7028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3698F, -2.7535F, -11.6056F, -0.1047F, -0.3316F, 0.0F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-0.375F, -0.35F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.1095F, -4.4059F, -9.9645F, -0.0525F, -0.1287F, 0.402F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(56, 74).mirror().addBox(-0.0042F, -0.942F, -2.0774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.014F, -3.0926F, -9.4326F, -0.3575F, -0.0154F, 0.396F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.2042F, -1.142F, -2.0774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.2711F, -1.9546F, -9.7774F, -0.3229F, -0.1571F, 0.0F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(87, 24).mirror().addBox(-0.2042F, -1.0002F, -1.0867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.2711F, -1.9546F, -9.7774F, -0.4538F, -0.1571F, 0.0F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(0.1278F, -1.9856F, -0.3757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8968F, -2.8041F, -9.2809F, -0.4077F, -0.059F, 0.3081F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(0.1278F, -0.1856F, 0.1243F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.495F, -4.7486F, -8.9474F, -0.0106F, -0.0067F, 0.3076F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.35F, -0.9F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.435F, -3.8839F, -6.3356F, -0.1027F, -0.2772F, 0.3105F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(62, 81).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(4.2127F, -1.368F, -7.4865F, -0.192F, -0.192F, -0.0175F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(75, 87).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(4.3972F, -1.5561F, -8.4524F, -0.2356F, -0.192F, -0.0175F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-0.3F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(88, 0).mirror().addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.2161F, -2.8084F, -12.7774F, 0.7206F, -0.3591F, -0.1635F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(87, 86).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(4.9181F, -2.5891F, -11.2247F, -0.2793F, -0.192F, -0.0175F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(4.7409F, -2.2789F, -10.2853F, -0.4102F, -0.192F, -0.0175F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(60, 87).mirror().addBox(0.1278F, -0.3606F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 21).mirror().addBox(0.1278F, -0.7856F, -0.3758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9645F, -2.0583F, -9.5623F, -0.3665F, -0.192F, -0.0175F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8348F, -2.415F, -8.2576F, -0.3763F, -0.0636F, 0.329F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(26, 82).mirror().addBox(0.1278F, -0.764F, 0.6164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9645F, -2.0583F, -9.5623F, -0.3316F, -0.192F, -0.0175F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(55, 19).mirror().addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7606F, -3.7606F, -6.1076F, -0.5081F, -0.2222F, 0.732F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(-0.5F, -1.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.662F, -3.2831F, -7.6294F, -1.88F, -0.3423F, 0.4896F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(81, 53).mirror().addBox(-0.525F, -0.85F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5709F, -3.4258F, -7.2155F, -0.1625F, -0.1772F, 0.4164F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.525F, -0.425F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(4.5709F, -3.4258F, -7.2155F, -0.7734F, -0.1772F, 0.4164F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.7F, -0.4F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(65, 86).mirror().addBox(-0.525F, -0.4F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(35, 70).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.1984F, -3.5213F, -6.1671F, -0.2656F, -0.3423F, 0.4896F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.05F, -2.575F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 54).mirror().addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1621F, -2.0293F, -6.9102F, -0.4401F, -0.3423F, 0.4896F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(0.5836F, -0.5947F, 1.1427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9645F, -2.0583F, -9.5623F, -0.2269F, -0.5061F, -0.0175F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(65, 27).mirror().addBox(0.0F, -2.2F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4939F, -3.0325F, -4.1812F, -0.3017F, -0.282F, 0.7026F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.4939F, -3.0325F, -4.1812F, -0.6944F, -0.282F, 0.7026F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.107F, -1.3941F, -5.2609F, -0.6315F, -0.4166F, 0.5197F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(0.2034F, -0.7967F, -2.1226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4711F, -0.2546F, -4.7774F, -0.3578F, -0.6632F, 0.0F));

		PartDefinition Head_r129 = rightFace.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7923F, -2.6423F, -3.2314F, -0.6096F, -0.2334F, 0.713F));

		PartDefinition Head_r130 = rightFace.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3307F, -0.9475F, -4.1877F, -0.5401F, -0.3764F, 0.4828F));

		PartDefinition Head_r131 = rightFace.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.0265F, -0.7092F, -1.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7711F, 0.1454F, -3.2774F, -0.3142F, -0.576F, 0.0F));

		PartDefinition Head_r132 = rightFace.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-0.0265F, -1.9401F, -0.7999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7426F, -0.8533F, -3.2335F, -0.3549F, -0.4665F, 0.5932F));

		PartDefinition Head_r133 = rightFace.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(-0.0265F, -0.9401F, -0.8999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7711F, 0.1454F, -3.2774F, -0.0524F, -0.576F, 0.0F));

		PartDefinition Head_r134 = rightFace.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(67, 52).mirror().addBox(0.0F, -2.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3429F, -2.6662F, -2.2982F, -0.2195F, -0.4317F, 0.8546F));

		PartDefinition Head_r135 = rightFace.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(0.0F, -2.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3448F, -0.9409F, -2.4638F, -0.0931F, -0.4727F, 0.567F));

		PartDefinition Head_r136 = rightFace.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(0.0F, -1.3627F, -2.5616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, 0.1454F, -0.8774F, 0.1658F, -0.4538F, 0.0F));

		PartDefinition Head_r137 = rightFace.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -0.3152F, 2.0825F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Head_r138 = rightFace.addOrReplaceChild("Head_r138", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3875F, -2.6278F, 0.8978F, 0.1706F, 0.1996F, 0.7153F));

		PartDefinition Head_r139 = rightFace.addOrReplaceChild("Head_r139", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(0.9F, -1.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.6463F, -2.6278F, 1.8637F, 0.2863F, -0.1514F, 0.1123F));

		PartDefinition Head_r140 = rightFace.addOrReplaceChild("Head_r140", CubeListBuilder.create().texOffs(73, 79).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6463F, -2.6278F, 1.8637F, 0.1737F, -0.2735F, 0.6338F));

		PartDefinition Head_r141 = rightFace.addOrReplaceChild("Head_r141", CubeListBuilder.create().texOffs(74, 33).mirror().addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -0.8152F, 2.0825F, 0.1142F, -0.2836F, 0.3911F));

		PartDefinition Head_r142 = rightFace.addOrReplaceChild("Head_r142", CubeListBuilder.create().texOffs(47, 79).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.8152F, 1.1165F, 0.1128F, 0.2368F, 0.4498F));

		PartDefinition Head_r143 = rightFace.addOrReplaceChild("Head_r143", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.3152F, 1.1165F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Head_r144 = rightFace.addOrReplaceChild("Head_r144", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(0.0F, -1.1F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4163F, -2.6278F, -0.9835F, -0.1745F, 0.0F, 0.6981F));

		PartDefinition Head_r145 = rightFace.addOrReplaceChild("Head_r145", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(0.0F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.4163F, -2.6278F, 1.0165F, 0.0F, 0.0F, 0.6981F));

		PartDefinition Head_r146 = rightFace.addOrReplaceChild("Head_r146", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(0.0F, -2.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.8152F, 1.0165F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Head_r147 = rightFace.addOrReplaceChild("Head_r147", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-0.4933F, -0.9906F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4574F, 0.0926F, 0.3538F, -0.6545F, -0.1309F, 0.0F));

		PartDefinition Head_r148 = rightFace.addOrReplaceChild("Head_r148", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-0.4933F, -0.4631F, -0.7002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4574F, 0.0926F, 0.3538F, -1.0036F, -0.1309F, 0.0F));

		PartDefinition Head_r149 = rightFace.addOrReplaceChild("Head_r149", CubeListBuilder.create().texOffs(68, 48).mirror().addBox(0.3F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(4.9855F, 0.217F, -3.8422F, -0.9297F, 0.5109F, -0.99F));

		PartDefinition Head_r150 = rightFace.addOrReplaceChild("Head_r150", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9855F, 0.217F, -3.8422F, -0.8369F, 0.3441F, -0.7679F));

		PartDefinition Head_r151 = rightFace.addOrReplaceChild("Head_r151", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(4.1557F, 0.751F, -3.6796F, -0.7874F, 0.1634F, -0.5718F));

		PartDefinition Head_r152 = rightFace.addOrReplaceChild("Head_r152", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9344F, -1.545F, -5.516F, -0.9197F, -0.4974F, 0.1495F));

		PartDefinition Head_r153 = rightFace.addOrReplaceChild("Head_r153", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4933F, -0.496F, -8.5784F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4574F, 0.0926F, 0.3538F, -0.3961F, -0.4974F, 0.1495F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(49, 35).addBox(0.8842F, -0.6976F, -0.1156F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(68, 89).addBox(1.3842F, -1.9976F, -0.1156F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3842F, 0.6091F, 7.0187F, -0.084F, 0.2174F, -0.0182F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(71, 89).addBox(1.3842F, -1.5F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5976F, 2.7844F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail1.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-0.9842F, -0.5F, -1.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8684F, 0.3024F, 0.9844F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(41, 61).addBox(-0.0158F, -0.5F, -1.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.3024F, 0.9844F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3_r3 = Tail1.addOrReplaceChild("Tail3_r3", CubeListBuilder.create().texOffs(40, 88).addBox(1.3842F, 0.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4424F, -0.1171F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Tail2_r2 = Tail1.addOrReplaceChild("Tail2_r2", CubeListBuilder.create().texOffs(13, 41).addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3842F, 0.3646F, 3.724F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(32, 42).addBox(-0.5158F, -0.3711F, -0.0246F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(89, 56).addBox(-0.0158F, -1.7711F, -0.0246F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 89).addBox(-0.0158F, -1.4711F, 1.9754F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(49, 90).addBox(-0.0158F, -1.2711F, 3.9754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, -0.2978F, 3.8729F, -0.1414F, 0.2196F, -0.0354F));

		PartDefinition Tail4_r1 = Tail2.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(90, 14).addBox(0.0F, 1.1F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 8).addBox(0.0F, 0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0158F, 0.6625F, -0.1489F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 14).addBox(0.8842F, -0.4453F, -0.057F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 77).addBox(1.3842F, -1.2453F, 0.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 82).addBox(1.3842F, -1.0453F, 2.943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.0869F, 4.9738F, -0.1844F, 0.3467F, 0.0413F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 49).addBox(0.8842F, -0.5213F, -0.0258F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0681F, 4.9343F, 0.0776F, 0.3046F, 0.0233F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(45, 42).addBox(0.8842F, -0.5213F, -0.0258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0349F, 3.8763F, 0.2137F, -0.0435F, -0.0036F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.131F, 4.0168F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(28, 71).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0165F, 4.4348F, -2.4829F, -0.8378F, 0.0F, 0.3491F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(28, 66).addBox(-0.5F, -1.6F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0165F, 4.4348F, -2.4829F, -1.2305F, 0.0F, 0.3491F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(87, 11).addBox(-0.5F, -0.775F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.7418F, 3.6803F, -3.3701F, -1.6232F, 0.0F, 0.3491F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(87, 3).addBox(-1.0F, 0.7465F, 2.7191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.5F, 1.7303F, -0.7583F, -2.0595F, 0.0F, 0.3491F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(84, 59).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9413F, 4.2284F, 0.3085F, -1.1868F, 0.0F, 0.3491F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(83, 74).addBox(-1.0F, -0.0906F, 2.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.7303F, -0.7583F, -1.4923F, 0.0F, 0.3491F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(67, 83).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(83, 63).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0799F, 4.6093F, 0.5149F, -1.0908F, 0.0F, 0.3491F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(52, 80).addBox(-1.0F, -1.8433F, 1.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.7303F, -0.7583F, -1.7541F, 0.0F, 0.3491F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(55, 84).addBox(-1.0F, 0.7334F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 1.7303F, -0.7583F, -0.2793F, 0.0F, 0.3491F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(81, 27).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6694F, 3.4813F, 1.2752F, -1.2305F, 0.0F, 0.3491F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(72, 59).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6455F, 3.4157F, 0.1888F, -0.7418F, 0.0F, 0.3491F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(49, 72).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5409F, 3.1283F, 0.3536F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(57, 69).addBox(-0.375F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6284F, 3.0512F, -1.7281F, -2.2466F, -0.0111F, 0.3536F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(72, 40).addBox(-0.5F, -0.275F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 0.5676F, 0.3778F, 0.384F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(21, 66).addBox(-0.5F, -1.9983F, 0.0047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, 0.6303F, -2.1582F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 0.0303F, -1.3582F, -1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 0.1303F, -0.7583F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(15, 86).addBox(2.8842F, -0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.5842F, -0.0485F, -0.3483F, -0.2269F, 0.0F, 0.0F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.131F, 4.0168F, -0.0859F, -0.0151F, -0.1739F));

		PartDefinition Hips_r21 = bone4.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0165F, 4.4348F, -2.4829F, -0.8378F, 0.0F, -0.3491F));

		PartDefinition Hips_r22 = bone4.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(28, 66).mirror().addBox(-0.5F, -1.6F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0165F, 4.4348F, -2.4829F, -1.2305F, 0.0F, -0.3491F));

		PartDefinition Hips_r23 = bone4.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(87, 11).mirror().addBox(-0.5F, -0.775F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.7418F, 3.6803F, -3.3701F, -1.6232F, 0.0F, -0.3491F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(0.0F, 0.7465F, 2.7191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7303F, -0.7583F, -2.0595F, 0.0F, -0.3491F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9413F, 4.2284F, 0.3085F, -1.1868F, 0.0F, -0.3491F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(0.0F, -0.0906F, 2.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7303F, -0.7583F, -1.4923F, 0.0F, -0.3491F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(83, 63).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0799F, 4.6093F, 0.5149F, -1.0908F, 0.0F, -0.3491F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(0.0F, -1.8433F, 1.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7303F, -0.7583F, -1.7541F, 0.0F, -0.3491F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(0.0F, 0.7334F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7303F, -0.7583F, -0.2793F, 0.0F, -0.3491F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6694F, 3.4813F, 1.2752F, -1.2305F, 0.0F, -0.3491F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6455F, 3.4157F, 0.1888F, -0.7418F, 0.0F, -0.3491F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(49, 72).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5409F, 3.1283F, 0.3536F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-0.625F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.6284F, 3.0512F, -1.7281F, -2.2466F, 0.0111F, -0.3536F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-0.5F, -0.275F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5676F, 0.3778F, 0.384F, 0.0F, 0.0F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-0.5F, -1.9983F, 0.0047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.6303F, -2.1582F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, -0.9994F, -0.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0303F, -1.3582F, -1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1303F, -0.7583F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-3.8842F, -0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(3.5842F, -0.0485F, -0.3483F, -0.2269F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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