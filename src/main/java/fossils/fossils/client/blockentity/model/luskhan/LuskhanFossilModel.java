package fossils.fossils.client.blockentity.model.luskhan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LuskhanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart tail;
	private final ModelPart leftbackflipper;
	private final ModelPart leftbackflipper2;
	private final ModelPart leftbackflipper3;
	private final ModelPart leftbackflipper4;
	private final ModelPart rightbackflipper;
	private final ModelPart rightbackflipper2;
	private final ModelPart rightbackflipper3;
	private final ModelPart rightbackflipper4;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart leftfrontflipper;
	private final ModelPart leftfrontflipper2;
	private final ModelPart leftfrontflipper3;
	private final ModelPart leftfrontflipper4;
	private final ModelPart rightfrontflipper;
	private final ModelPart rightfrontflipper2;
	private final ModelPart rightfrontflipper3;
	private final ModelPart rightfrontflipper4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart head;
	private final ModelPart jaw;

	public LuskhanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.tail = this.main.getChild("tail");
		this.leftbackflipper = this.tail.getChild("leftbackflipper");
		this.leftbackflipper2 = this.leftbackflipper.getChild("leftbackflipper2");
		this.leftbackflipper3 = this.leftbackflipper2.getChild("leftbackflipper3");
		this.leftbackflipper4 = this.leftbackflipper3.getChild("leftbackflipper4");
		this.rightbackflipper = this.tail.getChild("rightbackflipper");
		this.rightbackflipper2 = this.rightbackflipper.getChild("rightbackflipper2");
		this.rightbackflipper3 = this.rightbackflipper2.getChild("rightbackflipper3");
		this.rightbackflipper4 = this.rightbackflipper3.getChild("rightbackflipper4");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.main.getChild("body");
		this.leftfrontflipper = this.body.getChild("leftfrontflipper");
		this.leftfrontflipper2 = this.leftfrontflipper.getChild("leftfrontflipper2");
		this.leftfrontflipper3 = this.leftfrontflipper2.getChild("leftfrontflipper3");
		this.leftfrontflipper4 = this.leftfrontflipper3.getChild("leftfrontflipper4");
		this.rightfrontflipper = this.body.getChild("rightfrontflipper");
		this.rightfrontflipper2 = this.rightfrontflipper.getChild("rightfrontflipper2");
		this.rightfrontflipper3 = this.rightfrontflipper2.getChild("rightfrontflipper3");
		this.rightfrontflipper4 = this.rightfrontflipper3.getChild("rightfrontflipper4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.head = this.body3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.5F, 7.0F, -0.3328F, 0.1704F, 0.0906F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 101).addBox(0.0F, -4.5374F, 9.9577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 101).addBox(0.0F, -4.4374F, 7.9577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 101).addBox(0.0F, -4.3374F, 5.9577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 102).addBox(0.0F, -4.2374F, 3.9577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 102).addBox(0.0F, -4.0374F, 1.9577F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 102).addBox(0.0F, -3.8374F, -0.0423F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -4.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 94).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1761F, 16.2703F, -0.037F, 0.0982F, -0.3942F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1761F, 16.2703F, -0.0684F, 0.0796F, -0.7442F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-6.7707F, -3.8261F, -0.802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1761F, 16.2703F, -0.0956F, 0.0433F, -1.1799F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-7.7707F, -3.8261F, -0.802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 14.2703F, -0.0823F, 0.0756F, -1.1791F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 14.2703F, -0.0426F, 0.1033F, -0.7418F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 94).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 14.2703F, -0.0046F, 0.1116F, -0.3908F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 89).mirror().addBox(-9.7707F, -3.8261F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4761F, 12.2703F, -0.0823F, 0.0756F, -1.1442F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4761F, 12.2703F, -0.0426F, 0.1033F, -0.7069F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.4761F, 12.2703F, -0.0046F, 0.1116F, -0.3559F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 10.3703F, -0.0046F, 0.1116F, -0.3559F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 10.3703F, -0.0426F, 0.1033F, -0.7069F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 89).mirror().addBox(-9.7707F, -3.8261F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 10.3703F, -0.0823F, 0.0756F, -1.1442F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-10.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.6761F, 8.2703F, -0.0482F, 0.1366F, -1.1056F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.6761F, 8.2703F, 0.0144F, 0.1441F, -0.665F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.6761F, 8.2703F, 0.0631F, 0.1304F, -0.3128F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 6.2703F, 0.0294F, 0.1199F, -0.2646F));

		PartDefinition cube_r18 = main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 6.2703F, -0.0135F, 0.1227F, -0.6162F));

		PartDefinition cube_r19 = main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-10.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5761F, 6.2703F, -0.0643F, 0.1054F, -1.0551F));

		PartDefinition cube_r20 = main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-10.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 4.4703F, -0.0556F, 0.1206F, -1.0541F));

		PartDefinition cube_r21 = main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 4.4703F, 0.0008F, 0.1328F, -0.6144F));

		PartDefinition cube_r22 = main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.3761F, 4.4703F, 0.0464F, 0.1244F, -0.2625F));

		PartDefinition cube_r23 = main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-2.9866F, -0.0167F, -0.0983F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, 1.7703F, 0.0626F, 0.1325F, -0.1907F));

		PartDefinition cube_r24 = main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-6.8008F, -1.0372F, -0.0983F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, 1.7703F, 0.0132F, 0.1459F, -0.543F));

		PartDefinition cube_r25 = main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-10.7252F, -3.8142F, -0.0983F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, 1.7703F, -0.0501F, 0.1377F, -0.9837F));

		PartDefinition cube_r26 = main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-9.7707F, -3.8261F, 0.198F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, -0.6297F, -0.0166F, 0.1788F, -1.0655F));

		PartDefinition cube_r27 = main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-6.847F, -1.0288F, 0.198F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, -0.6297F, 0.0613F, 0.1689F, -0.6225F));

		PartDefinition cube_r28 = main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-3.0272F, 0.007F, 0.198F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0761F, -0.6297F, 0.1156F, 0.1378F, -0.2706F));

		PartDefinition cube_r29 = main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(63, 97).mirror().addBox(-3.0362F, -0.134F, -0.2823F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2239F, -2.0297F, 0.0821F, 0.1269F, -0.2924F));

		PartDefinition cube_r30 = main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 91).mirror().addBox(-6.8073F, -1.1644F, -0.2823F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2239F, -2.0297F, 0.0335F, 0.1473F, -0.6443F));

		PartDefinition cube_r31 = main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-8.6774F, -3.9322F, -0.2823F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.2239F, -2.0297F, -0.0324F, 0.1475F, -1.0855F));

		PartDefinition cube_r32 = main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-8.7707F, -3.8261F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3239F, -3.5297F, -0.0075F, 0.1938F, -1.0812F));

		PartDefinition cube_r33 = main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 91).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3239F, -3.5297F, 0.076F, 0.1786F, -0.6374F));

		PartDefinition cube_r34 = main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 97).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3239F, -3.5297F, 0.1327F, 0.1419F, -0.2857F));

		PartDefinition cube_r35 = main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(65, 94).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1761F, 16.2703F, -0.037F, -0.0982F, 0.3942F));

		PartDefinition cube_r36 = main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 85).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1761F, 16.2703F, -0.0684F, -0.0796F, 0.7442F));

		PartDefinition cube_r37 = main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(37, 62).addBox(5.7707F, -3.8261F, -0.802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1761F, 16.2703F, -0.0956F, -0.0433F, 1.1799F));

		PartDefinition cube_r38 = main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(37, 62).addBox(5.7707F, -3.8261F, -0.802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 14.2703F, -0.0823F, -0.0756F, 1.1791F));

		PartDefinition cube_r39 = main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(88, 85).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 14.2703F, -0.0426F, -0.1033F, 0.7418F));

		PartDefinition cube_r40 = main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 94).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 14.2703F, -0.0046F, -0.1116F, 0.3908F));

		PartDefinition cube_r41 = main.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(1, 89).addBox(5.7707F, -3.8261F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4761F, 12.2703F, -0.0823F, -0.0756F, 1.1442F));

		PartDefinition cube_r42 = main.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(88, 88).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4761F, 12.2703F, -0.0426F, -0.1033F, 0.7069F));

		PartDefinition cube_r43 = main.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(94, 94).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4761F, 12.2703F, -0.0046F, -0.1116F, 0.3559F));

		PartDefinition cube_r44 = main.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(1, 89).addBox(5.7707F, -3.8261F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 10.3703F, -0.0823F, -0.0756F, 1.1442F));

		PartDefinition cube_r45 = main.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 88).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 10.3703F, -0.0426F, -0.1033F, 0.7069F));

		PartDefinition cube_r46 = main.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 94).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 10.3703F, -0.0046F, -0.1116F, 0.3559F));

		PartDefinition cube_r47 = main.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 14).addBox(5.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.6761F, 8.2703F, -0.0482F, -0.1366F, 1.1056F));

		PartDefinition cube_r48 = main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 4).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.6761F, 8.2703F, 0.0144F, -0.1441F, 0.665F));

		PartDefinition cube_r49 = main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(95, 39).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.6761F, 8.2703F, 0.0631F, -0.1304F, 0.3128F));

		PartDefinition cube_r50 = main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(89, 53).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 4.4703F, 0.0008F, -0.1328F, 0.6144F));

		PartDefinition cube_r51 = main.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(65, 48).addBox(5.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 4.4703F, -0.0556F, -0.1206F, 1.0541F));

		PartDefinition cube_r52 = main.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(95, 47).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3761F, 4.4703F, 0.0464F, -0.1244F, 0.2625F));

		PartDefinition cube_r53 = main.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 53).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 6.2703F, -0.0135F, -0.1227F, 0.6162F));

		PartDefinition cube_r54 = main.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(95, 47).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 6.2703F, 0.0294F, -0.1199F, 0.2646F));

		PartDefinition cube_r55 = main.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 48).addBox(5.7707F, -3.8261F, -0.802F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5761F, 6.2703F, -0.0643F, -0.1054F, 1.0551F));

		PartDefinition cube_r56 = main.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(91, 26).addBox(2.8008F, -1.0372F, -0.0983F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, 1.7703F, 0.0132F, -0.1459F, 0.543F));

		PartDefinition cube_r57 = main.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 75).addBox(-0.0134F, -0.0167F, -0.0983F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, 1.7703F, 0.0626F, -0.1325F, 0.1907F));

		PartDefinition cube_r58 = main.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(28, 55).addBox(5.7252F, -3.8142F, -0.0983F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, 1.7703F, -0.0501F, -0.1377F, 0.9837F));

		PartDefinition cube_r59 = main.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(91, 56).addBox(2.847F, -1.0288F, 0.198F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, -0.6297F, 0.0613F, -0.1689F, 0.6225F));

		PartDefinition cube_r60 = main.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(97, 15).addBox(0.0272F, 0.007F, 0.198F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, -0.6297F, 0.1156F, -0.1378F, 0.2706F));

		PartDefinition cube_r61 = main.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 91).addBox(5.7707F, -3.8261F, 0.198F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.0761F, -0.6297F, -0.0166F, -0.1788F, 1.0655F));

		PartDefinition cube_r62 = main.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 82).addBox(5.6774F, -3.9322F, -0.2823F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2239F, -2.0297F, -0.0324F, -0.1475F, 1.0855F));

		PartDefinition cube_r63 = main.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 91).addBox(2.8073F, -1.1644F, -0.2823F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2239F, -2.0297F, 0.0335F, -0.1473F, 0.6443F));

		PartDefinition cube_r64 = main.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 97).addBox(0.0362F, -0.134F, -0.2823F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.2239F, -2.0297F, 0.0821F, -0.1269F, 0.2924F));

		PartDefinition cube_r65 = main.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(63, 97).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.3239F, -3.5297F, 0.1327F, -0.1419F, 0.2857F));

		PartDefinition cube_r66 = main.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(95, 82).addBox(5.7707F, -3.8261F, -0.802F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.3239F, -3.5297F, -0.0075F, -0.1938F, 1.0812F));

		PartDefinition cube_r67 = main.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 91).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.3239F, -3.5297F, 0.076F, -0.1786F, 0.6374F));

		PartDefinition cube_r68 = main.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.1537F, 0.1547F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = main.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 37).addBox(0.0F, -3.0808F, 7.9002F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 37).addBox(0.0F, -3.1808F, 5.9002F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 99).addBox(0.0F, -3.0808F, 3.9002F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 99).addBox(0.0F, -3.0808F, 1.9002F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 101).addBox(0.0F, -3.0808F, -0.0998F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 7.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r70 = main.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -5.4F, -6.0F, 19.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6811F, 8.5776F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r71 = main.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, 0.1F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4F, 6.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8861F, 17.1744F, -0.262F, 0.0421F, -0.0113F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(83, 61).addBox(0.0F, -2.8381F, 8.9426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 102).addBox(0.0F, -2.9381F, 6.9426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 102).addBox(0.0F, -3.0381F, 4.9426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 92).addBox(0.0F, -3.1381F, 2.9426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 3).addBox(0.0F, -3.1381F, 0.9426F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 30).addBox(-1.0F, -0.1381F, -0.0574F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0318F, -0.7058F, 0.0698F, 0.0F, 0.0F));

		PartDefinition basin_r1 = tail.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(1.1612F, 1.8037F, -9.7518F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 47).addBox(5.3612F, 1.8037F, -9.7518F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2612F, 6.2361F, 8.3295F, 0.5061F, 0.0F, 0.0F));

		PartDefinition basin_r2 = tail.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-4.0287F, 1.2833F, -5.0672F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 8.8109F, 4.3917F, 0.5394F, -0.1641F, 0.4704F));

		PartDefinition basin_r3 = tail.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-4.2799F, 1.2589F, -2.6486F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 8.8109F, 4.3917F, 0.8093F, -0.7954F, -0.0751F));

		PartDefinition basin_r4 = tail.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-0.2799F, 0.9612F, -1.3726F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 8.8109F, 4.3917F, 0.5912F, -0.7954F, -0.0751F));

		PartDefinition basin_r5 = tail.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(17, 44).mirror().addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 44).addBox(2.2F, 0.0F, -4.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 6.9557F, 9.9268F, 0.5934F, 0.0F, 0.0F));

		PartDefinition basin_r6 = tail.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(3.9987F, 1.6063F, 0.4216F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2612F, 6.2361F, 8.3295F, 0.7781F, -0.5783F, -0.4941F));

		PartDefinition basin_r7 = tail.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(0.0F, -2.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5054F, 1.7057F, 8.6372F, 1.3497F, 0.0899F, 0.3196F));

		PartDefinition basin_r8 = tail.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5054F, 1.7057F, 8.6372F, 1.9605F, 0.0899F, 0.3196F));

		PartDefinition basin_r9 = tail.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(84, 90).mirror().addBox(-2.6219F, -1.6095F, 0.3091F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2612F, 6.2361F, 8.3295F, 1.5242F, 0.0899F, 0.3196F));

		PartDefinition basin_r10 = tail.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(69, 8).addBox(-0.9713F, 1.2833F, -5.0672F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5677F, 8.8109F, 4.3917F, 0.5394F, 0.1641F, -0.4704F));

		PartDefinition basin_r11 = tail.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(47, 89).addBox(-1.7201F, 0.9612F, -1.3726F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5677F, 8.8109F, 4.3917F, 0.5912F, 0.7954F, 0.0751F));

		PartDefinition basin_r12 = tail.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(0, 68).addBox(0.2799F, 1.2589F, -2.6486F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5677F, 8.8109F, 4.3917F, 0.8093F, 0.7954F, 0.0751F));

		PartDefinition basin_r13 = tail.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(0, 83).addBox(-6.9987F, 1.6063F, 0.4216F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2612F, 6.2361F, 8.3295F, 0.7781F, 0.5783F, 0.4941F));

		PartDefinition basin_r14 = tail.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -2.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5054F, 1.7057F, 8.6372F, 1.3497F, -0.0899F, -0.3196F));

		PartDefinition basin_r15 = tail.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.5054F, 1.7057F, 8.6372F, 1.9605F, -0.0899F, -0.3196F));

		PartDefinition basin_r16 = tail.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(84, 90).addBox(1.6219F, -1.6095F, 0.3091F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2612F, 6.2361F, 8.3295F, 1.5242F, -0.0899F, -0.3196F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-3.0975F, 0.1071F, -0.6921F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.17F, 9.1324F, -0.0589F, 0.062F, -0.4616F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(97, 58).mirror().addBox(-4.8379F, -1.1594F, 0.155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1942F, 6.2277F, 0.0204F, 0.139F, -0.8017F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-3.0633F, -0.1188F, 0.155F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1942F, 6.2277F, 0.067F, 0.1236F, -0.4499F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(35, 45).mirror().addBox(-6.1997F, -0.9854F, 1.6721F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 45).mirror().addBox(-5.8589F, -1.0836F, -0.3364F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.5464F, 2.5951F, 0.0949F, 0.2138F, -0.7886F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-3.3437F, 0.1684F, 1.6721F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 91).mirror().addBox(-3.0571F, -0.0405F, -0.3364F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.5464F, 2.5951F, 0.1626F, 0.1685F, -0.436F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 1).mirror().addBox(-6.8931F, -0.9717F, -0.0348F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.6588F, 0.2441F, 0.1139F, 0.2323F, -0.7844F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(-3.051F, 0.0764F, -0.0348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.6588F, 0.2441F, 0.1867F, 0.1795F, -0.4318F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 39).addBox(0.0975F, 0.1071F, -0.6921F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.17F, 9.1324F, -0.0589F, -0.062F, 0.4616F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(97, 0).addBox(0.0633F, -0.1188F, 0.155F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1942F, 6.2277F, 0.067F, -0.1236F, 0.4499F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(97, 58).addBox(2.8379F, -1.1594F, 0.155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1942F, 6.2277F, 0.0204F, -0.139F, 0.8017F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(35, 45).addBox(3.1997F, -0.9854F, 1.6721F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 45).addBox(2.8589F, -1.0836F, -0.3364F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.5464F, 2.5951F, 0.0949F, -0.2138F, 0.7886F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(91, 91).addBox(0.3437F, 0.1684F, 1.6721F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 91).addBox(0.0571F, -0.0405F, -0.3364F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.5464F, 2.5951F, 0.1626F, -0.1685F, 0.436F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(85, 1).addBox(2.8931F, -0.9717F, -0.0348F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.6588F, 0.2441F, 0.1139F, -0.2323F, 0.7844F));

		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 44).addBox(0.051F, 0.0764F, -0.0348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.6588F, 0.2441F, 0.1867F, -0.1795F, 0.4318F));

		PartDefinition leftbackflipper = tail.addOrReplaceChild("leftbackflipper", CubeListBuilder.create().texOffs(67, 82).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(39, 69).addBox(-0.5F, 12.4F, -1.3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.25F, 6.3383F, 6.7991F, 0.7232F, 0.2799F, -0.8476F));

		PartDefinition cube_r87 = leftbackflipper.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 61).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 13.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.8F, 1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftbackflipper.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(13, 78).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.8F, 1.2F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftbackflipper2 = leftbackflipper.addOrReplaceChild("leftbackflipper2", CubeListBuilder.create().texOffs(99, 31).addBox(0.0F, 0.0F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 71).addBox(0.0F, 1.3F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 69).addBox(0.0F, 1.3F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 62).addBox(0.0F, 1.3F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.75F, 0.7F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition cube_r89 = leftbackflipper2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 2.15F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftbackflipper2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(7, 100).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.65F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftbackflipper3 = leftbackflipper2.addOrReplaceChild("leftbackflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.65F, -0.15F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r91 = leftbackflipper3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.7577F, 0.302F, 3.1241F, 0.0F, -3.1416F));

		PartDefinition leftbackflipper4 = leftbackflipper3.addOrReplaceChild("leftbackflipper4", CubeListBuilder.create(), PartPose.offset(0.1F, 5.0F, 0.0F));

		PartDefinition cube_r92 = leftbackflipper4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.48F, 7.0766F, -0.0558F, 3.002F, 0.0F, 3.1416F));

		PartDefinition cube_r93 = leftbackflipper4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(78, 82).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.49F, 3.1477F, 0.0623F, 3.0718F, 0.0F, 3.1416F));

		PartDefinition rightbackflipper = tail.addOrReplaceChild("rightbackflipper", CubeListBuilder.create().texOffs(51, 81).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(12, 69).addBox(-0.5F, 12.4F, -1.3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.25F, 6.3383F, 6.7991F, 0.8901F, -0.2126F, 0.8537F));

		PartDefinition cube_r94 = rightbackflipper.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(21, 54).addBox(0.0F, -0.5F, -2.0F, 1.0F, 13.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.8F, 1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightbackflipper.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(76, 55).addBox(0.0F, -0.5F, -1.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.8F, 1.2F, 0.192F, 0.0F, 0.0F));

		PartDefinition rightbackflipper2 = rightbackflipper.addOrReplaceChild("rightbackflipper2", CubeListBuilder.create().texOffs(66, 78).addBox(-1.0F, 0.0F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 62).addBox(-1.0F, 1.3F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 19).addBox(-1.0F, 1.3F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 34).addBox(-1.0F, 1.3F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.75F, 0.7F, 0.0852F, -0.0189F, 0.2174F));

		PartDefinition cube_r96 = rightbackflipper2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 64).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 2.15F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightbackflipper2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(74, 82).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.65F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightbackflipper3 = rightbackflipper2.addOrReplaceChild("rightbackflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.65F, -0.15F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r98 = rightbackflipper3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.1F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.2F, -2.15F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightbackflipper4 = rightbackflipper3.addOrReplaceChild("rightbackflipper4", CubeListBuilder.create(), PartPose.offset(-0.1F, 5.0F, 0.0F));

		PartDefinition cube_r99 = rightbackflipper4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(34, 30).addBox(0.02F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.8F, -1.75F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightbackflipper4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 34).addBox(0.01F, -0.1F, 0.1F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9F, -2.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.0629F, 9.8315F, 0.0882F, 0.2616F, 0.0039F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(8, 74).addBox(0.0F, -2.4F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 102).addBox(0.0F, -2.6F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 102).addBox(0.0F, -2.6F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 89).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 45).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.25F, -0.9F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-2.401F, -0.0264F, 7.0267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 6).mirror().addBox(-2.5402F, -0.0931F, 5.2361F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 50).mirror().addBox(-3.1152F, 0.1066F, 3.1795F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 71).mirror().addBox(-3.2209F, 0.0126F, 1.1696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.2328F, -0.699F, -0.0589F, 0.062F, -0.4616F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(74, 25).addBox(0.401F, -0.0264F, 7.0267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 6).addBox(0.5402F, -0.0931F, 5.2361F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 50).addBox(0.1152F, 0.1066F, 3.1795F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 71).addBox(0.2209F, 0.0126F, 1.1696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -0.2328F, -0.699F, -0.0589F, -0.062F, 0.4616F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 80).addBox(-1.0F, -0.65F, 0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(30, 59).addBox(0.0F, -2.85F, 1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 102).addBox(0.0F, -2.65F, 3.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.0F, 7.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r104 = tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-1.8265F, -0.3037F, 10.7337F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 22).mirror().addBox(-2.4799F, -0.2059F, 8.8602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.2328F, -7.699F, -0.0589F, 0.062F, -0.4616F));

		PartDefinition cube_r105 = tail3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(15, 37).addBox(0.8265F, -0.3037F, 10.7337F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 22).addBox(0.4799F, -0.2059F, 8.8602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.2328F, -7.699F, -0.0589F, -0.062F, 0.4616F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 97).addBox(-0.5F, -0.4981F, -0.1436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(56, 55).addBox(0.0F, -2.2981F, 0.8564F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(83, 78).addBox(-0.5F, -0.4497F, -0.1869F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 51).addBox(0.0F, -2.1497F, -0.1869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(0.0F, -1.9497F, 1.8131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0019F, 2.9564F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(83, 55).addBox(-0.5F, -0.4963F, 0.0609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(0, 34).addBox(0.0F, -1.6963F, 0.0609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 41).addBox(0.0F, -1.3963F, 2.0609F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0003F, 3.6131F, 0.1354F, 0.2039F, -0.0865F));

		PartDefinition cube_r106 = tail6.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 30).addBox(0.5F, -1.4019F, 2.0424F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 30).addBox(0.5F, -1.8019F, 0.0424F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 17).addBox(0.0F, -1.0019F, 0.0424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5037F, 3.9609F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.7504F, -8.147F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.25F, -5.0F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(63, 11).addBox(0.0F, -4.697F, 6.021F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 0).addBox(0.0F, -4.297F, 4.021F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 0).addBox(0.0F, -3.897F, 2.021F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 101).addBox(0.0F, -3.197F, 0.021F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6534F, -7.168F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-3.0158F, -0.5277F, -7.6778F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(39, 19).mirror().addBox(-8.0158F, -0.5277F, -4.6778F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.5013F, 0.0746F, 0.3592F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-8.626F, -0.4707F, 2.4079F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.3891F, 0.5666F, 0.1678F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(17, 19).mirror().addBox(-8.3876F, -0.4707F, 1.26F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.3264F, -0.0577F, 0.404F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(-8.0158F, -0.4707F, 0.3703F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.3268F, 0.0746F, 0.3592F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(50, 39).mirror().addBox(-8.4943F, -0.5277F, -2.7876F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.5004F, -0.0479F, 0.4262F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-6.318F, -0.5277F, -5.4753F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2842F, 11.2055F, -3.25F, -0.5358F, -0.352F, 0.6019F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-1.7146F, -0.0909F, 0.0635F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.439F, 4.949F, -10.9797F, -0.5027F, 0.4593F, 0.0653F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-4.4583F, -0.0909F, -0.5479F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.439F, 4.949F, -10.9797F, -0.6116F, 0.7195F, -0.1285F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(81, 45).mirror().addBox(-0.2047F, -0.0909F, -1.5661F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.439F, 4.949F, -10.9797F, -0.4551F, 0.1877F, 0.2133F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-1.0485F, -1.2667F, -0.5435F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.439F, 4.949F, -10.9797F, 0.8082F, -0.4979F, -0.2378F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 26).addBox(-1.5417F, -0.0909F, -0.5479F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.439F, 4.949F, -10.9797F, -0.6116F, -0.7195F, 0.1285F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 17).addBox(0.0485F, -1.2667F, -0.5435F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.439F, 4.949F, -10.9797F, 0.8082F, 0.4979F, 0.2378F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(81, 45).addBox(-3.7953F, -0.0909F, -1.5661F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.439F, 4.949F, -10.9797F, -0.4551F, -0.1877F, -0.2133F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(80, 31).addBox(-3.2854F, -0.0909F, 0.0635F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.439F, 4.949F, -10.9797F, -0.5027F, -0.4593F, -0.0653F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(50, 39).addBox(1.4943F, -0.5277F, -2.7876F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.5004F, 0.0479F, -0.4262F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(39, 19).addBox(0.0158F, -0.5277F, -4.6778F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(81, 73).addBox(0.0158F, -0.5277F, -7.6778F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.5013F, -0.0746F, -0.3592F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(34, 30).addBox(0.0158F, -0.4707F, 0.3703F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.3268F, -0.0746F, -0.3592F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(17, 19).addBox(2.3876F, -0.4707F, 1.26F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.3264F, 0.0577F, -0.404F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(73, 0).addBox(3.318F, -0.5277F, -5.4753F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.5358F, 0.352F, -0.6019F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 62).addBox(3.626F, -0.4707F, 2.4079F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2842F, 11.2055F, -3.25F, -0.3891F, -0.5666F, -0.1678F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-3.082F, -0.0543F, -0.0786F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1887F, -1.0736F, -0.0187F, 0.0961F, -0.3037F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-6.8776F, -1.1052F, -0.0786F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1887F, -1.0736F, -0.0505F, 0.084F, -0.654F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-7.7661F, -3.9082F, -0.0786F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1887F, -1.0736F, -0.0812F, 0.0548F, -1.0904F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-7.709F, -3.8715F, -0.6831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1426F, -2.4871F, -0.0569F, 0.1012F, -1.0885F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-6.8103F, -1.096F, -0.6831F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1426F, -2.4871F, -0.0086F, 0.1157F, -0.6498F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-3.0157F, -0.0688F, -0.6831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1426F, -2.4871F, 0.0316F, 0.1117F, -0.2985F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-6.8033F, -1.1547F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2642F, -4.7977F, -0.0156F, 0.1104F, -0.6506F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-3.0292F, -0.1262F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2642F, -4.7977F, 0.0232F, 0.1091F, -0.2994F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-6.8069F, -1.0999F, -0.6865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1659F, -6.5066F, -0.0156F, 0.1104F, -0.6506F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-3.0138F, -0.0736F, -0.6865F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1659F, -6.5066F, 0.0232F, 0.1091F, -0.2994F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(94, 7).mirror().addBox(-2.9872F, -0.1493F, -0.5697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1426F, -8.4871F, 0.038F, 0.12F, -0.3848F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-5.756F, -1.162F, -0.5697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1426F, -8.4871F, -0.0056F, 0.1257F, -0.7365F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(94, 7).addBox(-0.0128F, -0.1493F, -0.5697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1426F, -8.4871F, 0.038F, -0.12F, 0.3848F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(88, 12).addBox(2.756F, -1.162F, -0.5697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1426F, -8.4871F, -0.0056F, -0.1257F, 0.7365F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(88, 23).addBox(2.8069F, -1.0999F, -0.6865F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1659F, -6.5066F, -0.0156F, -0.1104F, 0.6506F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 96).addBox(0.0138F, -0.0736F, -0.6865F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1659F, -6.5066F, 0.0232F, -0.1091F, 0.2994F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(88, 23).addBox(2.8033F, -1.1547F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.2642F, -4.7977F, -0.0156F, -0.1104F, 0.6506F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(45, 96).addBox(0.0292F, -0.1262F, -0.3751F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.2642F, -4.7977F, 0.0232F, -0.1091F, 0.2994F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 41).addBox(2.8776F, -1.1052F, -0.0786F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1887F, -1.0736F, -0.0505F, -0.084F, 0.654F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 46).addBox(5.7661F, -3.9082F, -0.0786F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1887F, -1.0736F, -0.0812F, -0.0548F, 1.0904F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(94, 29).addBox(0.082F, -0.0543F, -0.0786F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1887F, -1.0736F, -0.0187F, -0.0961F, 0.3037F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(51, 46).addBox(5.709F, -3.8715F, -0.6831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1426F, -2.4871F, -0.0569F, -0.1012F, 1.0885F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 41).addBox(2.8103F, -1.096F, -0.6831F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1426F, -2.4871F, -0.0086F, -0.1157F, 0.6498F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(94, 29).addBox(0.0157F, -0.0688F, -0.6831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.1426F, -2.4871F, 0.0316F, -0.1117F, 0.2985F));

		PartDefinition leftfrontflipper = body.addOrReplaceChild("leftfrontflipper", CubeListBuilder.create().texOffs(93, 32).addBox(-0.5159F, -0.9414F, -1.2609F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.55F, 5.126F, -5.0818F, 0.0678F, 0.0882F, -1.8235F));

		PartDefinition cube_r152 = leftfrontflipper.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5159F, 8.9113F, 1.0243F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftfrontflipper.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 98).addBox(1.0F, 0.2895F, -2.019F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5159F, 4.1586F, 1.3391F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftfrontflipper.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(9, 92).addBox(1.0F, -0.7F, 0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5159F, 0.7586F, -0.8609F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftfrontflipper.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(55, 92).addBox(0.0F, -0.888F, -0.0216F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5159F, 6.9254F, -1.3868F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftfrontflipper.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(20, 87).addBox(1.0F, -0.7F, 0.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5159F, 0.7586F, -0.8609F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftfrontflipper2 = leftfrontflipper.addOrReplaceChild("leftfrontflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5159F, 5.0586F, -2.2609F, 0.0848F, -0.0016F, 0.1105F));

		PartDefinition leftfrontflipper3 = leftfrontflipper2.addOrReplaceChild("leftfrontflipper3", CubeListBuilder.create().texOffs(78, 100).addBox(-0.5F, -0.0171F, 0.4889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(101, 22).addBox(-0.5F, -0.0171F, -2.1111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 35).addBox(-0.5F, 1.3829F, -2.1111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 96).addBox(-0.5F, 1.3829F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 54).addBox(-0.5F, 1.3829F, 0.9889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.95F, 2.75F, 0.1231F, 0.0447F, -0.3463F));

		PartDefinition cube_r157 = leftfrontflipper3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(52, 69).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 5.172F, 0.077F, 0.0F, 3.1416F, 0.0F));

		PartDefinition leftfrontflipper4 = leftfrontflipper3.addOrReplaceChild("leftfrontflipper4", CubeListBuilder.create(), PartPose.offset(0.1F, 6.9829F, -0.2611F));

		PartDefinition cube_r158 = leftfrontflipper4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 58).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1141F, 5.5208F, -0.3506F, 3.0369F, 0.0F, -3.1416F));

		PartDefinition cube_r159 = leftfrontflipper4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(47, 51).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1041F, 2.1184F, -0.1108F, 3.1067F, 0.0F, -3.1416F));

		PartDefinition rightfrontflipper = body.addOrReplaceChild("rightfrontflipper", CubeListBuilder.create().texOffs(27, 93).addBox(-0.4841F, -0.9414F, -1.2609F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.55F, 5.126F, -5.0818F, -0.1793F, -0.2089F, 1.7832F));

		PartDefinition cube_r160 = rightfrontflipper.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(73, 73).addBox(-1.0F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5159F, 8.9113F, 1.0243F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightfrontflipper.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(22, 97).addBox(-2.0F, 0.2895F, -2.019F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5159F, 4.1586F, 1.3391F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightfrontflipper.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(51, 0).addBox(-2.0F, -0.7F, 0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5159F, 0.7586F, -0.8609F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r163 = rightfrontflipper.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(91, 68).addBox(-1.0F, -0.888F, -0.0216F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5159F, 6.9254F, -1.3868F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r164 = rightfrontflipper.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(86, 61).addBox(-2.0F, -0.7F, 0.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5159F, 0.7586F, -0.8609F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightfrontflipper2 = rightfrontflipper.addOrReplaceChild("rightfrontflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5159F, 5.0586F, -2.2609F, 0.0848F, 0.0016F, -0.1105F));

		PartDefinition rightfrontflipper3 = rightfrontflipper2.addOrReplaceChild("rightfrontflipper3", CubeListBuilder.create().texOffs(68, 22).addBox(-0.0062F, 2.672F, -2.423F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(100, 68).addBox(-0.5F, -0.0171F, 0.4889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 99).addBox(-0.5F, -0.0171F, -2.1111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 27).addBox(-0.5F, 1.3829F, -2.1111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 92).addBox(-0.5F, 1.3829F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 96).addBox(-0.5F, 1.3829F, 0.9889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 5.95F, 2.75F, 0.121F, -0.05F, 0.3897F));

		PartDefinition rightfrontflipper4 = rightfrontflipper3.addOrReplaceChild("rightfrontflipper4", CubeListBuilder.create(), PartPose.offset(-0.1F, 6.9829F, -0.2611F));

		PartDefinition cube_r165 = rightfrontflipper4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(77, 92).addBox(1.0141F, -0.0116F, -0.0003F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.7F, -2.05F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightfrontflipper4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(17, 19).addBox(1.0041F, -0.1113F, -0.008F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.8F, -2.15F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(61, 13).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.276F, -9.1318F, 0.176F, 0.2175F, 0.0078F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(6, 19).addBox(0.0F, -3.8F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).addBox(0.0F, -3.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 102).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 50).mirror().addBox(-4.0859F, 0.0257F, -0.3943F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 26).mirror().addBox(-3.9179F, 0.0323F, -2.375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.2261F, -1.7297F, 0.1066F, 0.1798F, -0.5469F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(39, 26).addBox(-0.0821F, 0.0323F, -2.375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 50).addBox(0.0859F, 0.0257F, -0.3943F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.2261F, -1.7297F, 0.1066F, -0.1798F, 0.5469F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.25F, 0.2829F, 0.179F, 0.1115F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(17, 102).addBox(0.0F, -3.6572F, 5.9353F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 19).addBox(0.0F, -2.9572F, 3.9353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 19).addBox(0.0F, -2.3572F, 1.9353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 39).addBox(0.0F, -1.5572F, -0.0647F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5734F, -8.2417F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(36, 39).addBox(-1.0F, -1.0685F, -0.5956F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.875F, -8.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 35).mirror().addBox(-3.0373F, -0.1692F, -0.6222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 57).mirror().addBox(-2.0476F, -0.4845F, -2.4683F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 41).mirror().addBox(-0.6894F, -0.8463F, -4.4357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 93).mirror().addBox(0.1356F, -1.2372F, -6.2264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1105F, -1.9054F, 0.1082F, 0.2493F, -0.5392F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(73, 93).addBox(-2.1356F, -1.2372F, -6.2264F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 41).addBox(-1.3106F, -0.8463F, -4.4357F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 57).addBox(-0.9524F, -0.4845F, -2.4683F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 35).addBox(0.0373F, -0.1692F, -0.6222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1105F, -1.9054F, 0.1082F, -0.2493F, 0.5392F));

		PartDefinition head = body3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(50, 80).addBox(0.8348F, -1.1497F, -10.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 80).mirror().addBox(-1.8348F, -1.1497F, -10.0732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.5005F, -9.192F, 0.0735F, 0.418F, 0.1783F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(71, 98).mirror().addBox(-5.0F, 0.2658F, 0.0021F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 98).addBox(3.0F, 0.2658F, 0.0021F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.7F, 1.8F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3397F, 1.572F, -3.3868F, -0.2726F, -0.3051F, 0.0138F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(47, 69).mirror().addBox(-0.1546F, -0.2F, -0.2004F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2F, -0.0008F, -3.5672F, -0.1486F, -0.1046F, 0.0023F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.1444F, 1.0355F, -0.476F, -0.3908F, -0.0239F, -0.0311F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 99).mirror().addBox(-5.0F, -0.0417F, -0.3789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 99).addBox(3.0F, -0.0417F, -0.3789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, -0.9F, 0.2F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-5.0F, 0.0498F, 0.0113F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 91).addBox(3.0F, 0.0498F, 0.0113F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, -0.1F, 1.6F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-0.0763F, -0.3048F, -1.4592F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6517F, 0.0926F, -9.1408F, -0.1128F, -0.2368F, 0.4498F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.0048F, -0.1977F, 0.2536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0735F, 0.0774F, -12.3005F, -0.118F, -0.158F, 0.4422F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-0.1025F, -0.222F, 1.1978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7511F, 0.1462F, -16.2573F, -0.0217F, -0.0524F, 0.3933F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(4, 47).mirror().addBox(-0.1479F, -0.2731F, -1.2995F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0735F, 0.0774F, -12.3005F, -0.0674F, -0.1611F, 0.3981F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(29, 99).mirror().addBox(-0.1227F, -0.0865F, -2.2724F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7511F, 0.1462F, -16.2573F, -0.0911F, -0.1133F, 0.2234F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(28, 83).mirror().addBox(0.1588F, 0.1223F, -4.7339F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3F, -18.8F, -0.1168F, -0.0868F, 0.3063F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(0.0F, -0.3675F, -4.8954F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3F, -18.8F, -0.0698F, -0.1047F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-0.2989F, -0.7008F, -0.2296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7511F, 0.1462F, -16.2573F, 0.0524F, -0.0567F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-0.2989F, -0.678F, -3.203F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7511F, 0.1462F, -16.2573F, -0.0524F, -0.0567F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.2765F, -0.737F, -1.2893F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0735F, 0.0774F, -12.3005F, -0.0349F, -0.1745F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-0.3983F, -0.6431F, -1.5458F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6517F, 0.0926F, -9.1408F, -0.0349F, -0.2618F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-1.7F, -0.3F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4382F, -5.6822F, 0.0695F, -0.1745F, 0.0031F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(58, 56).mirror().addBox(-1.5F, -0.6F, -1.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8299F, -0.8326F, -7.2248F, 0.2441F, -0.1745F, 0.0031F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.1F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.2382F, -4.318F, -0.4194F, -0.4026F, 0.1729F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(46, 85).mirror().addBox(0.0F, -1.8879F, -1.9283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -0.6225F, -2.7453F, 0.6458F, -0.192F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.1868F, -0.2206F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.9538F, -1.6015F, -5.0905F, 1.0036F, -0.192F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.1868F, -0.1706F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8384F, -1.8397F, -5.6841F, 1.1956F, -0.192F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.4618F, -0.3456F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.4898F, -1.9426F, -6.0365F, 1.3265F, -0.192F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(0.2F, -4.8151F, 1.6494F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8F, -0.6225F, -2.7453F, 1.9024F, -0.192F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(41, 87).mirror().addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-2.2848F, -0.6F, -5.6498F, -0.063F, -0.2263F, 0.0101F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-0.9039F, -0.4127F, -0.595F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 34).mirror().addBox(-0.6789F, -0.4127F, -0.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1243F, -0.8054F, -5.8967F, 0.0415F, -0.2438F, 0.0113F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-0.5F, 0.6F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.5865F, -1.1655F, -4.4111F, -0.8923F, -0.2438F, 0.0113F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(98, 64).mirror().addBox(-0.5939F, -0.6108F, -1.4096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.1243F, -0.8054F, -5.8967F, 0.1549F, -0.2438F, 0.0113F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(28, 83).addBox(-0.1588F, 0.1223F, -4.7339F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3F, -18.8F, -0.1168F, 0.0868F, -0.3063F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(29, 99).addBox(0.1227F, -0.0865F, -2.2724F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9511F, 0.1462F, -16.2573F, -0.0911F, 0.1133F, -0.2234F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(16, 47).addBox(0.1025F, -0.222F, 1.1978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9511F, 0.1462F, -16.2573F, -0.0217F, 0.0524F, -0.3933F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(4, 47).addBox(0.1479F, -0.2731F, -1.2995F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2735F, 0.0774F, -12.3005F, -0.0674F, 0.1611F, -0.3981F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 47).addBox(0.0048F, -0.1977F, 0.2536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2735F, 0.0774F, -12.3005F, -0.118F, 0.158F, -0.4422F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(98, 84).addBox(0.0763F, -0.3048F, -1.4592F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8517F, 0.0926F, -9.1408F, -0.1128F, 0.2368F, -0.4498F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(64, 71).addBox(-1.0F, -0.3675F, -4.8954F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3F, -18.8F, -0.0698F, 0.1047F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(34, 51).addBox(-1.0F, -0.0721F, 0.0155F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0F, -17.7F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(67, 39).addBox(-1.0F, -0.0795F, 0.0591F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.9F, -23.7F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(85, 6).addBox(-0.7011F, -0.678F, -3.203F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9511F, 0.1462F, -16.2573F, -0.0524F, 0.0567F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 35).addBox(-0.7011F, -0.7008F, -0.2296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9511F, 0.1462F, -16.2573F, 0.0524F, 0.0567F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(56, 62).addBox(-1.1F, -0.0387F, -4.5528F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.9F, -6.3F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(35, 78).addBox(-0.7235F, -0.737F, -1.2893F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2735F, 0.0774F, -12.3005F, -0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(75, 50).addBox(-0.6017F, -0.6431F, -1.5458F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8517F, 0.0926F, -9.1408F, -0.0349F, 0.2618F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(98, 9).addBox(0.0F, -0.0314F, -0.9713F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4F, -2.4F, -5.8F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(50, 62).addBox(0.0F, 0.0141F, -2.3083F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(50, 62).addBox(0.0F, 0.0141F, -2.0083F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -2.8473F, -3.5304F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(66, 22).addBox(-0.9F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -0.2382F, -4.318F, -0.4194F, 0.4026F, -0.1729F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(46, 85).addBox(-1.0F, -1.8879F, -1.9283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8F, -0.6225F, -2.7453F, 0.6458F, 0.192F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(42, 98).addBox(-2.8132F, -0.2206F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(3.1538F, -1.6015F, -5.0905F, 1.0036F, 0.192F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(42, 98).addBox(-2.8132F, -0.1706F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0384F, -1.8397F, -5.6841F, 1.1956F, 0.192F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(42, 98).addBox(-2.5382F, -0.3456F, -0.8246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.6898F, -1.9426F, -6.0365F, 1.3265F, 0.192F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(58, 69).addBox(-3.2F, -4.8151F, 1.6494F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, -0.6225F, -2.7453F, 1.9024F, 0.192F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(15, 34).addBox(-0.3211F, -0.4127F, -0.595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(58, 30).addBox(-1.0961F, -0.4127F, -0.595F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3243F, -0.8054F, -5.8967F, 0.0415F, 0.2438F, -0.0113F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(5, 34).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, -2.2497F, -5.9732F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(41, 87).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.4848F, -0.6F, -5.6498F, -0.063F, 0.2263F, -0.0101F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(99, 65).addBox(-0.5F, 0.6F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.7865F, -1.1655F, -4.4111F, -0.8923F, 0.2438F, -0.0113F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(98, 64).addBox(-0.4061F, -0.6108F, -1.4096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.3243F, -0.8054F, -5.8967F, 0.1549F, 0.2438F, -0.0113F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(58, 56).addBox(-1.5F, -0.6F, -1.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0299F, -0.8326F, -7.2248F, 0.2441F, 0.1745F, -0.0031F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(57, 55).addBox(-1.3F, -0.3F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4382F, -5.6822F, 0.0695F, 0.1745F, -0.0031F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(59, 100).mirror().addBox(-5.0F, -0.1417F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(59, 100).addBox(3.0F, -0.1417F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6F, -0.9F, 0.2F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(59, 100).mirror().addBox(-0.8909F, -0.995F, -1.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1862F, -0.604F, -0.7227F, -1.8888F, 0.0149F, 1.0468F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 100).mirror().addBox(-0.3331F, -0.995F, -1.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1862F, -0.604F, -0.7227F, -1.8533F, -0.1488F, 0.5293F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(59, 100).mirror().addBox(-1.5607F, -0.995F, -2.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1862F, -0.604F, -0.7227F, -1.8571F, 0.1412F, 1.4477F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(59, 100).addBox(-0.1091F, -0.995F, -1.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3862F, -0.604F, -0.7227F, -1.8888F, -0.0149F, -1.0468F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(59, 100).addBox(0.5607F, -0.995F, -2.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3862F, -0.604F, -0.7227F, -1.8571F, -0.1412F, -1.4477F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 100).addBox(-0.6669F, -0.995F, -1.1755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3862F, -0.604F, -0.7227F, -1.8533F, 0.1488F, -0.5293F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(16, 47).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3444F, 1.0355F, -0.476F, -0.3908F, 0.0239F, 0.0311F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(47, 69).addBox(-0.8454F, -0.2F, -0.2004F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4F, -0.0008F, -3.5672F, -0.1486F, 0.1046F, -0.0023F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.2672F, -0.5005F, -5.9107F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.1049F, 0.3134F, -3.4765F, -0.0323F, -0.364F, 0.0403F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(64, 0).addBox(-0.7328F, -0.5005F, -5.9107F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3049F, 0.3134F, -3.4765F, -0.0323F, 0.364F, -0.0403F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(15, 34).addBox(-1.0F, -1.4155F, -7.7256F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(80, 25).addBox(-2.0F, -2.1894F, -2.7257F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 2.279F, -1.0888F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(58, 26).addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5397F, 1.572F, -3.3868F, -0.2726F, 0.3051F, -0.0138F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(65, 35).addBox(-1.0F, 1.8F, 1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 86).addBox(-0.5F, 0.6F, 0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 17).addBox(-1.0F, 0.025F, 0.35F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.9F, -3.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(85, 19).addBox(-1.0F, 0.025F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1F, -2.4978F, -0.6246F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(2, 56).addBox(-2.5F, -2.5F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1F, 0.0567F, -0.3337F, -0.2531F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 2.8F, 0.3F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(0.0F, -0.1F, -5.9F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.25F, -2.3F, -18.0F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(73, 29).addBox(0.0F, -0.1F, -5.9F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -2.3F, -18.0F, -0.0526F, 0.0871F, -0.0046F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(1.1803F, -2.688F, -10.33F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.0171F, -0.0883F, 0.1222F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(0.4333F, -2.1149F, -6.6632F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.1043F, -0.2094F, 0.128F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(0.6803F, -1.412F, -10.2957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.0869F, -0.0883F, 0.1222F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(58, 78).mirror().addBox(0.6803F, -2.0938F, -10.4174F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.0345F, -0.0883F, 0.1222F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(67, 63).mirror().addBox(-0.0808F, -1.0543F, -5.6142F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.1483F, -0.2267F, 0.1299F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.0808F, -1.8783F, -5.6204F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, -0.0698F, -0.2267F, 0.1299F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(37, 91).mirror().addBox(-0.0009F, -1.9924F, -2.8983F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.9F, -4.7F, -0.2705F, -0.2967F, 0.0524F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(-0.0944F, -1.9272F, -0.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2F, -7.2F, 0.0676F, -0.3359F, 0.053F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.0009F, -2.8559F, -2.1684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.9F, -4.7F, 0.0698F, -0.2967F, 0.0524F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(34, 83).mirror().addBox(-0.1F, -0.5539F, -5.3049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.5498F, -0.1222F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(84, 96).mirror().addBox(-0.1F, -1.1391F, -2.7402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.3316F, -0.1222F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(93, 96).mirror().addBox(-0.1F, -1.0796F, -0.7333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.1222F, -0.1222F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(-0.1F, -2.5644F, -5.6762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.1571F, -0.1222F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.1F, -1.8253F, -5.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.1047F, -0.1222F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(6, 91).mirror().addBox(-0.1F, -1.6965F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(13, 97).mirror().addBox(-0.1F, -1.0965F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, 1.0F, -0.0175F, -0.1222F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(91, 14).addBox(-1.1803F, -2.688F, -10.33F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.0171F, 0.0883F, -0.1222F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(76, 37).addBox(-0.4333F, -2.1149F, -6.6632F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.1043F, 0.2094F, -0.128F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -18.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(0.0F, -1.0092F, -0.124F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.1651F, -23.1006F, -0.0567F, -0.1047F, 0.0698F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(0.0F, -1.0094F, 0.877F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.1651F, -23.1006F, -0.0262F, -0.1047F, 0.0698F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(21, 73).addBox(-1.0F, -1.0094F, 0.877F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -1.1651F, -23.1006F, -0.0262F, 0.1047F, -0.0698F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(40, 61).addBox(-1.0F, -1.0092F, -0.124F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.1651F, -23.1006F, -0.0567F, 0.1047F, -0.0698F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(42, 78).addBox(-1.6803F, -1.412F, -10.2957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.0869F, 0.0883F, -0.1222F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 78).addBox(-1.6803F, -2.0938F, -10.4174F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.0345F, 0.0883F, -0.1222F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 63).addBox(-0.9192F, -1.0543F, -5.6142F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.1483F, 0.2267F, -0.1299F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(78, 66).addBox(-0.9192F, -1.8783F, -5.6204F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, -0.0698F, 0.2267F, -0.1299F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(37, 91).addBox(-0.9991F, -1.9924F, -2.8983F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 0.9F, -4.7F, -0.2705F, 0.2967F, -0.0524F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(58, 80).addBox(-0.9056F, -1.9272F, -0.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9F, 0.2F, -7.2F, 0.0676F, 0.3359F, -0.053F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 97).addBox(-0.9991F, -2.8559F, -2.1684F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.8F, 0.9F, -4.7F, 0.0698F, 0.2967F, -0.0524F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(34, 83).addBox(-0.9F, -0.5539F, -5.3049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.5498F, 0.1222F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 96).addBox(-0.9F, -1.1391F, -2.7402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.3316F, 0.1222F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(93, 96).addBox(-0.9F, -1.0796F, -0.7333F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.1222F, 0.1222F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(6, 0).addBox(-0.9F, -2.5644F, -5.6762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.1571F, 0.1222F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(99, 49).addBox(-0.9F, -1.8253F, -5.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.1047F, 0.1222F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(6, 91).addBox(-0.9F, -1.6965F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(13, 97).addBox(-0.9F, -1.0965F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.4F, 1.4F, 1.0F, -0.0175F, 0.1222F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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