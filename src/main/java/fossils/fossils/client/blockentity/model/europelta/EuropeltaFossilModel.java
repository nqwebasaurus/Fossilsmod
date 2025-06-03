package fossils.fossils.client.blockentity.model.europelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropeltaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms12;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart backPlates3;
	private final ModelPart backPlates4;
	private final ModelPart body;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms18;
	private final ModelPart chest;
	private final ModelPart backPlates;
	private final ModelPart backPlates6;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms19;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms20;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms21;
	private final ModelPart neck;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms22;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart backPlates2;
	private final ModelPart backPlates5;
	private final ModelPart tail;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms13;
	private final ModelPart tail2;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms14;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms15;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms16;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms17;

	public EuropeltaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms6 = this.hips.getChild("osteoderms6");
		this.osteoderms12 = this.hips.getChild("osteoderms12");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.backPlates3 = this.hips.getChild("backPlates3");
		this.backPlates4 = this.hips.getChild("backPlates4");
		this.body = this.hips.getChild("body");
		this.osteoderms5 = this.body.getChild("osteoderms5");
		this.osteoderms18 = this.body.getChild("osteoderms18");
		this.chest = this.body.getChild("chest");
		this.backPlates = this.chest.getChild("backPlates");
		this.backPlates6 = this.chest.getChild("backPlates6");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms19 = this.chest.getChild("osteoderms19");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms20 = this.neck3.getChild("osteoderms20");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms21 = this.neck2.getChild("osteoderms21");
		this.neck = this.neck2.getChild("neck");
		this.osteoderms = this.neck.getChild("osteoderms");
		this.osteoderms22 = this.neck.getChild("osteoderms22");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.osteoderms13 = this.tail.getChild("osteoderms13");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms14 = this.tail2.getChild("osteoderms14");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms15 = this.tail3.getChild("osteoderms15");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms16 = this.tail4.getChild("osteoderms16");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms17 = this.tail5.getChild("osteoderms17");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -19.1F, 6.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 37).addBox(0.5F, -1.8801F, -0.2166F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-3.0F, -3.4801F, 0.0834F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 50).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.0338F, -7.0284F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.9F, -2.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.1573F, 2.4521F, 1.2807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5807F, 2.6406F, 0.6435F, -0.109F, 0.0624F, -0.7807F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-1.804F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 68).mirror().addBox(-1.996F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-5.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-6.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 0).mirror().addBox(-7.0023F, 0.0417F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -7.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.6271F, -0.8301F, -5.5178F, -0.1881F, 0.401F, -0.3377F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 29).mirror().addBox(-0.2521F, -0.9713F, -0.4317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, 1.7365F, -1.5547F, 0.4386F, -0.1331F, -0.8233F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.2521F, 1.5386F, -0.1346F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, 1.7365F, -1.5547F, 0.2815F, -0.1331F, -0.8233F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(-0.2384F, 2.9003F, 0.2622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5807F, 2.6406F, 0.6435F, 0.1092F, 0.0624F, -0.7807F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 32).mirror().addBox(-0.2414F, -1.8541F, -0.7683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5807F, 2.6406F, 0.6435F, 0.6728F, 0.013F, -0.4172F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(11, 40).mirror().addBox(0.1425F, -2.4478F, -0.325F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.3019F, -0.0471F, -0.1499F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-0.2384F, -0.6777F, -0.6575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5807F, 2.6406F, 0.6435F, 0.467F, 0.0624F, -0.7807F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(17, 74).mirror().addBox(-0.6461F, -3.5033F, 0.3088F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 66).mirror().addBox(0.3539F, -3.5033F, 0.3088F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.6252F, 0.0135F, -0.3318F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-1.7943F, -3.5033F, 0.0799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.6612F, 0.3081F, -0.5537F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 61).mirror().addBox(-1.8707F, -3.2782F, -1.538F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.3924F, 0.0598F, -0.3061F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-1.9292F, -3.3884F, -7.9581F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.1758F, 0.1778F, -0.2949F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(-0.0626F, -3.3884F, -2.6129F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3068F, 2.1365F, -1.5547F, -0.2437F, 0.7764F, -0.4361F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(0.1583F, -3.2782F, -2.3833F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2068F, 2.1365F, -1.5547F, -0.3926F, -0.0692F, -0.2527F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 66).addBox(-1.3539F, -3.5033F, 0.3088F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(17, 74).addBox(-1.3539F, -3.5033F, 0.3088F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.6252F, -0.0135F, 0.3318F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(69, 31).addBox(-1.1583F, -3.2782F, -2.3833F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.3926F, 0.0692F, 0.2527F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 73).addBox(-1.9374F, -3.3884F, -2.6129F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3068F, 2.1365F, -1.5547F, -0.2437F, -0.7764F, 0.4361F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 32).addBox(0.9292F, -3.3884F, -7.9581F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.1758F, -0.1778F, 0.2949F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(77, 56).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 59).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.6271F, -0.8301F, -5.5178F, -0.1881F, -0.401F, 0.3377F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 61).addBox(-1.1293F, -3.2782F, -1.538F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.3924F, -0.0598F, 0.3061F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 70).addBox(0.7943F, -3.5033F, 0.0799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.6612F, -0.3081F, 0.5537F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 10).addBox(-0.7616F, -0.6777F, -0.6575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5807F, 2.6406F, 0.6435F, 0.467F, -0.0624F, 0.7807F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 40).addBox(-1.1425F, -2.4478F, -0.325F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2068F, 2.1365F, -1.5547F, -0.3019F, 0.0471F, 0.1499F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(82, 72).addBox(-2.196F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 70).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 68).addBox(-2.004F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 52).addBox(0.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(69, 28).addBox(0.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 0).addBox(0.0023F, 0.0417F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -7.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(41, 32).addBox(-0.7586F, -1.8541F, -0.7683F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5807F, 2.6406F, 0.6435F, 0.6728F, -0.013F, 0.4172F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 8).addBox(-0.8427F, 2.4521F, 1.2807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5807F, 2.6406F, 0.6435F, -0.109F, -0.0624F, 0.7807F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(33, 87).addBox(-0.7616F, 2.9003F, 0.2622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5807F, 2.6406F, 0.6435F, 0.1092F, -0.0624F, 0.7807F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 0).addBox(-0.7479F, 1.5386F, -0.1346F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.8068F, 1.7365F, -1.5547F, 0.2815F, 0.1331F, 0.8233F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 29).addBox(-0.7479F, -0.9713F, -0.4317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8068F, 1.7365F, -1.5547F, 0.4386F, 0.1331F, 0.8233F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 29).addBox(0.0F, 0.0F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(62, 62).addBox(0.48F, -1.9F, -0.1F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = hips.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -5.566F, -6.4611F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r40 = osteoderms6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(4, 90).addBox(-0.4494F, -0.3398F, -0.1298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5006F, 4.4793F, 11.8923F, 0.6586F, -0.0665F, 1.6276F));

		PartDefinition cube_r41 = osteoderms6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 99).addBox(-0.6046F, -0.7641F, -0.7421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5006F, 4.4793F, 11.8923F, 2.9537F, -0.0665F, 1.6276F));

		PartDefinition cube_r42 = osteoderms6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 24).addBox(-0.5533F, -0.7981F, -0.2671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5006F, 4.4793F, 11.8923F, 2.3254F, -0.0665F, 1.6276F));

		PartDefinition cube_r43 = osteoderms6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(89, 47).addBox(-0.4494F, -0.5163F, -0.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5006F, 4.4793F, 11.8923F, 1.3305F, -0.0665F, 1.6276F));

		PartDefinition cube_r44 = osteoderms6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 9).addBox(-0.4722F, -0.2925F, -0.7935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9375F, 4.4942F, 9.9856F, 0.8683F, -0.0768F, 1.6125F));

		PartDefinition cube_r45 = osteoderms6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 21).addBox(0.7734F, 2.919F, -1.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(16, 70).addBox(0.0635F, -0.5806F, -0.2058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.6086F, 3.5705F, 6.1073F, 1.5403F, -0.0768F, 1.6125F));

		PartDefinition cube_r46 = osteoderms6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(96, 32).addBox(0.6696F, 0.1799F, -3.7281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 96).addBox(0.0744F, -0.6857F, -0.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6086F, 3.5705F, 6.1073F, 2.5351F, -0.0768F, 1.6125F));

		PartDefinition cube_r47 = osteoderms6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(99, 27).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1497F, 4.3377F, 9.931F, -3.1198F, -0.0768F, 1.6125F));

		PartDefinition cube_r48 = osteoderms6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(38, 99).addBox(0.1232F, -0.5769F, -1.0595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6086F, 3.5705F, 6.1073F, 2.8493F, -0.0768F, 1.6125F));

		PartDefinition cube_r49 = osteoderms6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(28, 85).addBox(-0.4154F, -0.7397F, -0.2589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.132F, 4.2135F, 3.1672F, 1.6209F, -0.1658F, 1.5728F));

		PartDefinition cube_r50 = osteoderms6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(96, 21).addBox(-0.4044F, -0.8168F, -0.2866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.132F, 4.2135F, 3.1672F, 2.6158F, -0.1658F, 1.5728F));

		PartDefinition cube_r51 = osteoderms6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(10, 97).addBox(-0.3556F, -0.6693F, -0.9196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.132F, 4.2135F, 3.1672F, 2.9299F, -0.1658F, 1.5728F));

		PartDefinition cube_r52 = osteoderms6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(97, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2783F, 5.0841F, 0.7805F, 2.9292F, -0.4713F, 1.573F));

		PartDefinition cube_r53 = osteoderms6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(96, 62).addBox(-0.6067F, 1.4272F, -0.5051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7F, 5.9F, -0.7F, 2.6151F, -0.4713F, 1.573F));

		PartDefinition cube_r54 = osteoderms6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(43, 85).addBox(-0.6983F, -0.1492F, -0.8579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.1F, 5.6606F, -0.0422F, 1.6203F, -0.4713F, 1.573F));

		PartDefinition osteoderms12 = hips.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -5.566F, -6.4611F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r55 = osteoderms12.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(4, 90).mirror().addBox(-0.5506F, -0.3398F, -0.1298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5006F, 4.4793F, 11.8923F, 0.6586F, 0.0665F, -1.6276F));

		PartDefinition cube_r56 = osteoderms12.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.3954F, -0.7641F, -0.7421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5006F, 4.4793F, 11.8923F, 2.9537F, 0.0665F, -1.6276F));

		PartDefinition cube_r57 = osteoderms12.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 24).mirror().addBox(-0.4467F, -0.7981F, -0.2671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5006F, 4.4793F, 11.8923F, 2.3254F, 0.0665F, -1.6276F));

		PartDefinition cube_r58 = osteoderms12.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-0.5506F, -0.5163F, -0.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5006F, 4.4793F, 11.8923F, 1.3305F, 0.0665F, -1.6276F));

		PartDefinition cube_r59 = osteoderms12.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.5278F, -0.2925F, -0.7935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9375F, 4.4942F, 9.9856F, 0.8683F, 0.0768F, -1.6125F));

		PartDefinition cube_r60 = osteoderms12.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-1.7734F, 2.919F, -1.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 70).mirror().addBox(-1.0635F, -0.5806F, -0.2058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.6086F, 3.5705F, 6.1073F, 1.5403F, 0.0768F, -1.6125F));

		PartDefinition cube_r61 = osteoderms12.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(96, 32).mirror().addBox(-1.6696F, 0.1799F, -3.7281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 96).mirror().addBox(-1.0744F, -0.6857F, -0.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6086F, 3.5705F, 6.1073F, 2.5351F, 0.0768F, -1.6125F));

		PartDefinition cube_r62 = osteoderms12.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1497F, 4.3377F, 9.931F, -3.1198F, 0.0768F, -1.6125F));

		PartDefinition cube_r63 = osteoderms12.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 99).mirror().addBox(-1.1232F, -0.5769F, -1.0595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6086F, 3.5705F, 6.1073F, 2.8493F, 0.0768F, -1.6125F));

		PartDefinition cube_r64 = osteoderms12.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(28, 85).mirror().addBox(-0.5846F, -0.7397F, -0.2589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.132F, 4.2135F, 3.1672F, 1.6209F, 0.1658F, -1.5728F));

		PartDefinition cube_r65 = osteoderms12.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(96, 21).mirror().addBox(-0.5956F, -0.8168F, -0.2866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.132F, 4.2135F, 3.1672F, 2.6158F, 0.1658F, -1.5728F));

		PartDefinition cube_r66 = osteoderms12.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.6444F, -0.6693F, -0.9196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.132F, 4.2135F, 3.1672F, 2.9299F, 0.1658F, -1.5728F));

		PartDefinition cube_r67 = osteoderms12.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(97, 37).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2783F, 5.0841F, 0.7805F, 2.9292F, 0.4713F, -1.573F));

		PartDefinition cube_r68 = osteoderms12.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(96, 62).mirror().addBox(-0.3933F, 1.4272F, -0.5051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 5.9F, -0.7F, 2.6151F, 0.4713F, -1.573F));

		PartDefinition cube_r69 = osteoderms12.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(43, 85).mirror().addBox(-0.3017F, -0.1492F, -0.8579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.1F, 5.6606F, -0.0422F, 1.6203F, 0.4713F, -1.573F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(64, 72).addBox(-1.5F, 5.1833F, -3.0553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.4F, 1.1999F, -0.2448F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftleg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(22, 67).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftleg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.1075F, -1.1404F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftleg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1762F, -2.8099F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 29).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 3.2988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(10, 50).addBox(-0.1F, -1.2383F, 0.1721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(70, 6).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 77).addBox(-1.601F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftleg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(73, 0).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(73, 79).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftfoot.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(58, 37).addBox(-1.999F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(-1.5F, 5.1833F, -3.0553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 1.1999F, -0.2448F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-1.5F, -0.1075F, -1.1404F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1762F, -2.8099F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(49, 29).mirror().addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.8503F, 3.2988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-0.9F, -1.2383F, 0.1721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 77).mirror().addBox(-0.399F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 40).mirror().addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightleg3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(73, 79).mirror().addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightfoot.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(58, 37).mirror().addBox(-2.001F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, 0.0698F, 0.0F, 0.0F));

		PartDefinition backPlates3 = hips.addOrReplaceChild("backPlates3", CubeListBuilder.create(), PartPose.offset(3.5F, -3.7511F, -2.5674F));

		PartDefinition cube_r90 = backPlates3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(22, 13).addBox(-0.0969F, -0.1663F, -0.4019F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3068F, -0.08F, 0.6097F));

		PartDefinition cube_r91 = backPlates3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(22, 3).addBox(-0.0302F, -0.0636F, -7.0726F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.1F, -0.0118F, -0.0156F, 0.5566F));

		PartDefinition backPlates4 = hips.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offset(-3.5F, -3.7511F, -2.5674F));

		PartDefinition cube_r92 = backPlates4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 13).mirror().addBox(-4.9031F, -0.1663F, -0.4019F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3068F, 0.08F, -0.6097F));

		PartDefinition cube_r93 = backPlates4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(22, 3).mirror().addBox(-4.9698F, -0.0636F, -7.0726F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.1F, -0.0118F, 0.0156F, -0.5566F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -8.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 20).addBox(0.5F, -1.9241F, 2.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 37).addBox(0.5F, -1.9241F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(62, 0).addBox(0.5F, -1.883F, 1.9211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 61).addBox(0.5F, -1.783F, -0.0789F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -7.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, -0.0803F, -7.0585F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.2F, -1.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(40, 10).addBox(0.0F, -0.1F, -8.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-4.5418F, -5.0402F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.3089F, -1.4F, -0.0038F, -0.017F, -1.3526F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.3089F, -1.4F, -0.0144F, -0.0099F, -0.6021F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-4.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.4089F, -1.4F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-6.5418F, -5.0402F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.4089F, -3.4F, 0.0151F, 0.0682F, -1.3521F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.4089F, -3.4F, 0.0576F, 0.0395F, -0.601F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(82, 13).mirror().addBox(-4.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5089F, -3.4F, 0.0694F, -0.0079F, 0.1132F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(-8.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.5089F, -5.4F, 0.046F, 0.2044F, -1.3479F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(53, 67).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.5089F, -5.4F, 0.1734F, 0.118F, -0.5919F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(82, 42).mirror().addBox(-4.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6089F, -5.4F, 0.2081F, -0.0235F, 0.111F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-8.7582F, -6.0165F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -7.4F, 0.0744F, 0.3235F, -1.323F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(-6.1232F, -2.5127F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -7.4F, 0.2765F, 0.1855F, -0.5588F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(54, 82).mirror().addBox(-3.9916F, 0.1356F, -0.5326F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -7.4F, 0.3296F, -0.0369F, 0.1248F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 0).addBox(0.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.4089F, -1.4F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 62).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.3089F, -1.4F, -0.0144F, 0.0099F, 0.6021F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(59, 27).addBox(2.5418F, -5.0402F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.3089F, -1.4F, -0.0038F, 0.017F, 1.3526F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 13).addBox(0.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5089F, -3.4F, 0.0694F, 0.0079F, -0.1132F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 67).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.4089F, -3.4F, 0.0576F, -0.0395F, 0.601F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 61).addBox(2.5418F, -5.0402F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.4089F, -3.4F, 0.0151F, -0.0682F, 1.3521F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(82, 42).addBox(0.0023F, 0.0417F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6089F, -5.4F, 0.2081F, 0.0235F, -0.111F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(53, 67).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.5089F, -5.4F, 0.1734F, -0.118F, 0.5919F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(37, 51).addBox(2.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.5089F, -5.4F, 0.046F, -0.2044F, 1.3479F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(54, 82).addBox(-0.0084F, 0.1356F, -0.5326F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -7.4F, 0.3296F, 0.0369F, -0.1248F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 70).addBox(3.1232F, -2.5127F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -7.4F, 0.2765F, -0.1855F, 0.5588F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 45).addBox(2.7582F, -6.0165F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -7.4F, 0.0744F, -0.3235F, 1.323F));

		PartDefinition osteoderms5 = body.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -1.666F, -6.9611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r122 = osteoderms5.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(22, 13).addBox(-0.9435F, -0.2729F, -3.6731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, -2.5F, 7.1F, 0.2515F, -0.0177F, 0.1952F));

		PartDefinition cube_r123 = osteoderms5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 23).addBox(-1.0825F, -0.818F, -1.139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.6F, 4.8F, 0.4112F, 0.0094F, 0.1958F));

		PartDefinition cube_r124 = osteoderms5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(95, 29).addBox(-1.0825F, -1.1372F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, -1.6F, 4.8F, -0.7232F, 0.0094F, 0.1958F));

		PartDefinition cube_r125 = osteoderms5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(94, 92).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5899F, -1.4303F, 2.282F, -0.6719F, -0.0008F, 0.196F));

		PartDefinition cube_r126 = osteoderms5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(84, 2).addBox(-1.1997F, -0.9536F, -0.2808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, -0.3F, 0.9F, 0.2357F, -0.0008F, 0.196F));

		PartDefinition cube_r127 = osteoderms5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(40, 3).addBox(-1.0435F, -0.0283F, 0.0164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.1F, 0.4F, 0.4626F, -0.0008F, 0.196F));

		PartDefinition cube_r128 = osteoderms5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 90).addBox(-0.7152F, -1.2704F, -0.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 44).addBox(-0.7152F, -1.2704F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.3F, 2.1F, 5.2F, -0.5524F, -0.3666F, 1.5729F));

		PartDefinition cube_r129 = osteoderms5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 6).addBox(-0.7152F, -1.0728F, -0.1206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.3F, 2.1F, 5.2F, 0.3726F, -0.3666F, 1.5729F));

		PartDefinition cube_r130 = osteoderms5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(29, 97).addBox(-0.7152F, -0.369F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.3F, 2.1F, 5.2F, 2.6153F, -0.3666F, 1.5729F));

		PartDefinition cube_r131 = osteoderms5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 94).addBox(-0.7152F, -0.4558F, -1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 2.1F, 5.2F, -3.0395F, -0.3666F, 1.5729F));

		PartDefinition cube_r132 = osteoderms5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 94).addBox(-0.4838F, 0.0764F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8869F, 2.9503F, 3.3869F, -3.0398F, -0.4887F, 1.5731F));

		PartDefinition cube_r133 = osteoderms5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(24, 96).addBox(-0.4838F, -0.0291F, 0.0395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.8869F, 2.9503F, 3.3869F, 2.615F, -0.4887F, 1.5731F));

		PartDefinition cube_r134 = osteoderms5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(71, 90).addBox(-0.4838F, -1.5988F, -0.6716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 90).addBox(-0.4838F, -1.5988F, -0.9716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.8869F, 2.9503F, 3.3869F, -0.5527F, -0.4887F, 1.5731F));

		PartDefinition cube_r135 = osteoderms5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(87, 85).addBox(-0.4838F, -1.6268F, -0.1269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.8869F, 2.9503F, 3.3869F, 0.3723F, -0.4887F, 1.5731F));

		PartDefinition cube_r136 = osteoderms5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 15).addBox(-0.6907F, -0.839F, 0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 91).addBox(-0.6907F, -1.339F, 0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2F, 4.6F, 1.3F, 0.7387F, -0.5411F, 1.5731F));

		PartDefinition cube_r137 = osteoderms5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 96).addBox(-0.6907F, 0.5149F, -0.813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 4.6F, 1.3F, 2.8418F, -0.5411F, 1.5731F));

		PartDefinition cube_r138 = osteoderms5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(96, 66).addBox(-0.6907F, 0.473F, -0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2F, 4.6F, 1.3F, 2.6149F, -0.5411F, 1.5731F));

		PartDefinition cube_r139 = osteoderms5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 97).addBox(-0.6897F, 0.037F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 5.6F, -0.2F, 2.842F, -0.4713F, 1.573F));

		PartDefinition cube_r140 = osteoderms5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 98).addBox(-0.6897F, 0.0405F, -0.5061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5F, 5.6F, -0.2F, 2.6151F, -0.4713F, 1.573F));

		PartDefinition cube_r141 = osteoderms5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(21, 88).addBox(-0.6897F, -0.4697F, 0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 52).addBox(-0.6897F, -0.9697F, 0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5F, 5.6F, -0.2F, 0.7389F, -0.4713F, 1.573F));

		PartDefinition cube_r142 = osteoderms5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(99, 79).addBox(-0.6434F, -0.8384F, -0.3274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.02F, -1.3399F, 5.6755F, 1.9274F, -0.1745F, 0.7912F));

		PartDefinition cube_r143 = osteoderms5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(57, 92).addBox(-0.6434F, -0.7157F, -0.1135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.02F, -1.3399F, 5.6755F, 0.0512F, -0.1745F, 0.7912F));

		PartDefinition cube_r144 = osteoderms5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(40, 92).addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(5.12F, 2.2601F, 0.4755F, -0.0292F, -0.414F, 1.3465F));

		PartDefinition cube_r145 = osteoderms5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(99, 87).addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.12F, 2.2601F, 0.4755F, 1.847F, -0.414F, 1.3465F));

		PartDefinition cube_r146 = osteoderms5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(99, 91).addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.62F, 0.9601F, 2.4755F, 1.847F, -0.414F, 1.3465F));

		PartDefinition cube_r147 = osteoderms5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(92, 50).addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.62F, 0.9601F, 2.4755F, -0.0292F, -0.414F, 1.3465F));

		PartDefinition cube_r148 = osteoderms5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 100).addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.62F, -0.0399F, 4.7755F, 2.079F, -0.2218F, 1.2906F));

		PartDefinition cube_r149 = osteoderms5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(67, 92).addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.62F, -0.0399F, 4.7755F, 0.2028F, -0.2218F, 1.2906F));

		PartDefinition cube_r150 = osteoderms5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(92, 98).addBox(-0.8705F, 0.0888F, -0.5815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.1F, 2.1F, 2.355F, -0.0208F, 0.6846F));

		PartDefinition cube_r151 = osteoderms5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(94, 46).addBox(-0.8705F, -0.7521F, 0.8473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4F, -0.1F, 2.1F, 0.4788F, -0.0208F, 0.6846F));

		PartDefinition cube_r152 = osteoderms5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(42, 97).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.5F, -0.6F, 2.2869F, -0.0242F, 0.676F));

		PartDefinition cube_r153 = osteoderms5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(91, 24).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4F, 0.5F, -0.6F, 0.4107F, -0.0242F, 0.676F));

		PartDefinition osteoderms18 = body.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -1.666F, -6.9611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r154 = osteoderms18.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(22, 13).mirror().addBox(-0.0565F, -0.2729F, -3.6731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, -2.5F, 7.1F, 0.2515F, 0.0177F, -0.1952F));

		PartDefinition cube_r155 = osteoderms18.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(0.0825F, -0.818F, -1.139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.6F, 4.8F, 0.4112F, -0.0094F, -0.1958F));

		PartDefinition cube_r156 = osteoderms18.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(95, 29).mirror().addBox(0.0825F, -1.1372F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.6F, 4.8F, -0.7232F, -0.0094F, -0.1958F));

		PartDefinition cube_r157 = osteoderms18.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5899F, -1.4303F, 2.282F, -0.6719F, 0.0008F, -0.196F));

		PartDefinition cube_r158 = osteoderms18.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(84, 2).mirror().addBox(0.1997F, -0.9536F, -0.2808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.3F, 0.9F, 0.2357F, 0.0008F, -0.196F));

		PartDefinition cube_r159 = osteoderms18.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(40, 3).mirror().addBox(0.0435F, -0.0283F, 0.0164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.1F, 0.4F, 0.4626F, 0.0008F, -0.196F));

		PartDefinition cube_r160 = osteoderms18.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(63, 90).mirror().addBox(-0.2848F, -1.2704F, -0.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 44).mirror().addBox(-0.2848F, -1.2704F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 2.1F, 5.2F, -0.5524F, 0.3666F, -1.5729F));

		PartDefinition cube_r161 = osteoderms18.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.2848F, -1.0728F, -0.1206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 2.1F, 5.2F, 0.3726F, 0.3666F, -1.5729F));

		PartDefinition cube_r162 = osteoderms18.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(29, 97).mirror().addBox(-0.2848F, -0.369F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 2.1F, 5.2F, 2.6153F, 0.3666F, -1.5729F));

		PartDefinition cube_r163 = osteoderms18.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 94).mirror().addBox(-0.2848F, -0.4558F, -1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3F, 2.1F, 5.2F, -3.0395F, 0.3666F, -1.5729F));

		PartDefinition cube_r164 = osteoderms18.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 94).mirror().addBox(-0.5162F, 0.0764F, -0.9598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8869F, 2.9503F, 3.3869F, -3.0398F, 0.4887F, -1.5731F));

		PartDefinition cube_r165 = osteoderms18.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-0.5162F, -0.0291F, 0.0395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8869F, 2.9503F, 3.3869F, 2.615F, 0.4887F, -1.5731F));

		PartDefinition cube_r166 = osteoderms18.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(-0.5162F, -1.5988F, -0.6716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 90).mirror().addBox(-0.5162F, -1.5988F, -0.9716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8869F, 2.9503F, 3.3869F, -0.5527F, 0.4887F, -1.5731F));

		PartDefinition cube_r167 = osteoderms18.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(87, 85).mirror().addBox(-0.5162F, -1.6268F, -0.1269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8869F, 2.9503F, 3.3869F, 0.3723F, 0.4887F, -1.5731F));

		PartDefinition cube_r168 = osteoderms18.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(91, 15).mirror().addBox(-0.3093F, -0.839F, 0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 91).mirror().addBox(-0.3093F, -1.339F, 0.9063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 4.6F, 1.3F, 0.7387F, 0.5411F, -1.5731F));

		PartDefinition cube_r169 = osteoderms18.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(88, 96).mirror().addBox(-0.3093F, 0.5149F, -0.813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 4.6F, 1.3F, 2.8418F, 0.5411F, -1.5731F));

		PartDefinition cube_r170 = osteoderms18.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-0.3093F, 0.473F, -0.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 4.6F, 1.3F, 2.6149F, 0.5411F, -1.5731F));

		PartDefinition cube_r171 = osteoderms18.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(-0.3103F, 0.037F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 5.6F, -0.2F, 2.842F, 0.4713F, -1.573F));

		PartDefinition cube_r172 = osteoderms18.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.3103F, 0.0405F, -0.5061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 5.6F, -0.2F, 2.6151F, 0.4713F, -1.573F));

		PartDefinition cube_r173 = osteoderms18.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(-0.3103F, -0.4697F, 0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 52).mirror().addBox(-0.3103F, -0.9697F, 0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 5.6F, -0.2F, 0.7389F, 0.4713F, -1.573F));

		PartDefinition cube_r174 = osteoderms18.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.3566F, -0.8384F, -0.3274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.02F, -1.3399F, 5.6755F, 1.9274F, 0.1745F, -0.7912F));

		PartDefinition cube_r175 = osteoderms18.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-0.3566F, -0.7157F, -0.1135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.02F, -1.3399F, 5.6755F, 0.0512F, 0.1745F, -0.7912F));

		PartDefinition cube_r176 = osteoderms18.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-5.12F, 2.2601F, 0.4755F, -0.0292F, 0.414F, -1.3465F));

		PartDefinition cube_r177 = osteoderms18.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.12F, 2.2601F, 0.4755F, 1.847F, 0.414F, -1.3465F));

		PartDefinition cube_r178 = osteoderms18.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.62F, 0.9601F, 2.4755F, 1.847F, 0.414F, -1.3465F));

		PartDefinition cube_r179 = osteoderms18.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.62F, 0.9601F, 2.4755F, -0.0292F, 0.414F, -1.3465F));

		PartDefinition cube_r180 = osteoderms18.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.62F, -0.0399F, 4.7755F, 2.079F, 0.2218F, -1.2906F));

		PartDefinition cube_r181 = osteoderms18.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(67, 92).mirror().addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.62F, -0.0399F, 4.7755F, 0.2028F, 0.2218F, -1.2906F));

		PartDefinition cube_r182 = osteoderms18.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-0.1295F, 0.0888F, -0.5815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -0.1F, 2.1F, 2.355F, 0.0208F, -0.6846F));

		PartDefinition cube_r183 = osteoderms18.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(94, 46).mirror().addBox(-0.1295F, -0.7521F, 0.8473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -0.1F, 2.1F, 0.4788F, 0.0208F, -0.6846F));

		PartDefinition cube_r184 = osteoderms18.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(42, 97).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.5F, -0.6F, 2.2869F, 0.0242F, -0.676F));

		PartDefinition cube_r185 = osteoderms18.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.5F, -0.6F, 0.4107F, 0.0242F, -0.676F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -8.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 77).addBox(0.5F, -1.9477F, -0.1334F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9F, -5.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(68, 99).addBox(0.5F, -1.977F, -0.0731F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -7.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(6, 86).mirror().addBox(-0.1164F, -0.056F, 0.0751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2293F, 4.7505F, -8.2825F, 0.5746F, -0.6333F, -0.7819F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-0.4329F, 0.059F, -0.4003F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0354F, 8.0035F, 2.0862F, 0.5615F, -1.2695F, -0.3985F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.1427F, -2.2655F, -0.3702F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9293F, 3.4505F, -7.9825F, -0.6727F, -0.3055F, -0.0103F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.6248F, -4.6367F, 0.3007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.6293F, 0.3505F, -4.0825F, -1.241F, -0.1055F, 0.081F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.6248F, -3.8243F, 1.5825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6293F, 0.3505F, -4.0825F, -0.7F, -0.1055F, 0.081F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.8352F, -0.145F, -1.6373F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 8.0035F, -0.5138F, 0.9817F, -1.3212F, -0.6643F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(38, 42).mirror().addBox(0.1108F, 0.0923F, -1.6465F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 8.0035F, -0.5138F, 0.6845F, -1.2609F, -0.44F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-0.4329F, 0.059F, -0.2003F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0354F, 8.0035F, 1.1862F, 0.6278F, -1.2984F, -0.4676F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.5402F, 0.4719F, -1.5635F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 29).mirror().addBox(-1.5402F, 0.4719F, -2.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3293F, 3.1505F, -5.3825F, 0.0336F, -0.6333F, -0.7819F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(29, 70).mirror().addBox(-0.1703F, 0.4192F, -1.1354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6293F, 2.8505F, -5.3825F, 1.375F, -0.3141F, 0.0359F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(-0.1861F, -1.4813F, 0.1026F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6293F, 2.8505F, -5.3825F, 0.8382F, -0.2295F, -0.001F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-0.6248F, -0.9322F, -0.0413F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.6293F, 0.3505F, -4.0825F, 0.26F, -0.1055F, 0.081F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.9089F, -7.1F, 0.7996F, -0.0815F, 0.079F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(84, 63).mirror().addBox(-5.1089F, -3.0876F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.9089F, -7.1F, 0.2205F, 0.7786F, -1.2619F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(84, 74).mirror().addBox(-3.6508F, -0.8135F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.9089F, -7.1F, 0.7065F, 0.4196F, -0.4454F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(81, 23).mirror().addBox(-6.3253F, -4.0639F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.4089F, -5.1F, 0.156F, 0.6112F, -1.3033F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(12, 36).mirror().addBox(-4.4749F, -1.3799F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.4089F, -5.1F, 0.5395F, 0.3394F, -0.5075F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(-2.0087F, -0.0715F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.4089F, -5.1F, 0.6253F, -0.0666F, 0.0919F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-8.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5089F, -1.4F, 0.0961F, 0.4083F, -1.2455F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 70).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5089F, -1.4F, 0.3517F, 0.2325F, -0.4734F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(83, 34).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5089F, -1.4F, 0.4165F, -0.0461F, 0.191F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(37, 53).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -3.2F, 0.1194F, 0.4931F, -1.3225F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(83, 57).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -3.2F, 0.4285F, 0.2782F, -0.5412F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8089F, -3.2F, 0.5034F, -0.0549F, 0.0993F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(62, 86).addBox(-0.3752F, -4.6367F, 0.3007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.6293F, 0.3505F, -4.0825F, -1.241F, 0.1055F, -0.081F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 87).addBox(-0.3752F, -3.8243F, 1.5825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6293F, 0.3505F, -4.0825F, -0.7F, 0.1055F, -0.081F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(69, 52).addBox(-0.3752F, -0.9322F, -0.0413F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.6293F, 0.3505F, -4.0825F, 0.26F, 0.1055F, -0.081F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(33, 59).addBox(-0.8139F, -1.4813F, 0.1026F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6293F, 2.8505F, -5.3825F, 0.8382F, 0.2295F, 0.001F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(29, 70).addBox(-0.8297F, 0.4192F, -1.1354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6293F, 2.8505F, -5.3825F, 1.375F, 0.3141F, -0.0359F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(46, 67).addBox(-0.8573F, -2.2655F, -0.3702F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9293F, 3.4505F, -7.9825F, -0.6727F, 0.3055F, 0.0103F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(6, 86).addBox(-0.8836F, -0.056F, 0.0751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2293F, 4.7505F, -8.2825F, 0.5746F, 0.6333F, 0.7819F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(87, 29).addBox(0.5402F, 0.4719F, -2.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(0.5402F, 0.4719F, -1.5635F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3293F, 3.1505F, -5.3825F, 0.0336F, 0.6333F, 0.7819F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(51, 0).addBox(-4.1354F, -0.9922F, 0.0814F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1354F, 8.4035F, -3.7138F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(13, 57).addBox(-5.1354F, -0.2789F, -2.3723F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1354F, 7.1035F, -4.8138F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 20).addBox(-0.5671F, 0.059F, -0.4003F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0354F, 8.0035F, 2.0862F, 0.5615F, 1.2695F, 0.3985F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5671F, 0.059F, -0.2003F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0354F, 8.0035F, 1.1862F, 0.6278F, 1.2984F, 0.4676F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(38, 42).addBox(-1.1108F, 0.0923F, -1.6465F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 8.0035F, -0.5138F, 0.6845F, 1.2609F, 0.44F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(50, 47).addBox(-0.1648F, -0.145F, -1.6373F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 8.0035F, -0.5138F, 0.9817F, 1.3212F, 0.6643F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 76).addBox(0.0F, -0.0349F, -3.1774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -4.7F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 67).addBox(0.5F, -1.9103F, 1.901F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.5F, -1.8103F, -0.099F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, -3.8F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(83, 34).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5089F, -1.4F, 0.4165F, 0.0461F, -0.191F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(60, 70).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5089F, -1.4F, 0.3517F, -0.2325F, 0.4734F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 26).addBox(2.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5089F, -1.4F, 0.0961F, -0.4083F, 1.2455F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(84, 74).addBox(0.6508F, -0.8135F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.9089F, -7.1F, 0.7065F, -0.4196F, 0.4454F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(84, 63).addBox(2.1089F, -3.0876F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.9089F, -7.1F, 0.2205F, -0.7786F, 1.2619F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(61, 77).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.9089F, -7.1F, 0.7996F, 0.0815F, -0.079F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(9, 59).addBox(0.0087F, -0.0715F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.4089F, -5.1F, 0.6253F, 0.0666F, -0.0919F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(12, 36).addBox(1.4749F, -1.3799F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.4089F, -5.1F, 0.5395F, -0.3394F, 0.5075F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(81, 23).addBox(2.3253F, -4.0639F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.4089F, -5.1F, 0.156F, -0.6112F, 1.3033F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(84, 19).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -3.2F, 0.5034F, 0.0549F, -0.0993F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(83, 57).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -3.2F, 0.4285F, -0.2782F, 0.5412F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(37, 53).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8089F, -3.2F, 0.1194F, -0.4931F, 1.3225F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(60, 47).addBox(-2.0F, -0.0214F, -2.9189F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -5.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 32).addBox(-3.0F, 0.023F, -5.0607F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -0.1F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(62, 8).addBox(0.0F, -0.4F, -5.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.3F, 0.192F, 0.0F, 0.0F));

		PartDefinition backPlates = chest.addOrReplaceChild("backPlates", CubeListBuilder.create(), PartPose.offset(5.0293F, 3.5759F, -7.4825F));

		PartDefinition cube_r243 = backPlates.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(64, 15).addBox(-2.1525F, -0.0574F, -0.3353F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, 0.2884F, 1.4373F));

		PartDefinition cube_r244 = backPlates.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(52, 61).addBox(-0.0611F, -0.0011F, -4.0353F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -4.0F, 2.8F, 0.4869F, -0.1591F, 1.1984F));

		PartDefinition cube_r245 = backPlates.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0F, -0.3F, -1.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -3.6F, 0.8F, 0.489F, 0.1521F, 0.6303F));

		PartDefinition cube_r246 = backPlates.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(51, 10).addBox(-2.0024F, -0.3327F, -5.7744F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -3.5759F, 8.3825F, 0.3747F, 0.0416F, 0.7897F));

		PartDefinition cube_r247 = backPlates.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(49, 29).addBox(-2.4526F, -1.0358F, -5.7314F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -1.0759F, 8.8825F, 0.372F, -0.117F, 1.2992F));

		PartDefinition cube_r248 = backPlates.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(39, 55).addBox(0.0F, 0.023F, -5.0607F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5293F, -6.4759F, 7.3825F, 0.1869F, -0.1294F, 0.5987F));

		PartDefinition backPlates6 = chest.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offset(-5.0293F, 3.5759F, -7.4825F));

		PartDefinition cube_r249 = backPlates6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(0.1525F, -0.0574F, -0.3353F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, -0.2884F, -1.4373F));

		PartDefinition cube_r250 = backPlates6.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(52, 61).mirror().addBox(-2.9389F, -0.0011F, -4.0353F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.0F, 2.8F, 0.4869F, 0.1591F, -1.1984F));

		PartDefinition cube_r251 = backPlates6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.0F, -0.3F, -1.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.6F, 0.8F, 0.489F, -0.1521F, -0.6303F));

		PartDefinition cube_r252 = backPlates6.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(0.0024F, -0.3327F, -5.7744F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -3.5759F, 8.3825F, 0.3747F, -0.0416F, -0.7897F));

		PartDefinition cube_r253 = backPlates6.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(49, 29).mirror().addBox(-0.5474F, -1.0358F, -5.7314F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -1.0759F, 8.8825F, 0.372F, 0.117F, -1.2992F));

		PartDefinition cube_r254 = backPlates6.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-3.0F, 0.023F, -5.0607F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5293F, -6.4759F, 7.3825F, 0.1869F, 0.1294F, -0.5987F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.766F, -7.9611F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(54, 95).addBox(-1.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, -0.4F, 6.4F, -0.7917F, 0.023F, 0.1947F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(40, 13).addBox(-0.9435F, -0.2729F, -3.6731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, -0.8F, 6.2F, 0.2515F, -0.0177F, 0.1952F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(38, 42).addBox(-1.0435F, -0.1729F, -0.1731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, -0.4F, 6.4F, 0.046F, 0.023F, 0.1947F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.4F, 6.4F, 0.3427F, 0.023F, 0.1947F));

		PartDefinition cube_r259 = osteoderms4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(31, 81).addBox(-0.8567F, 0.0376F, -1.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.1F, 4.3F, 0.3727F, -0.0279F, 0.1941F));

		PartDefinition cube_r260 = osteoderms4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(95, 57).addBox(-1.0435F, -1.8506F, 0.831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1F, 2.7F, -0.5349F, -0.0279F, 0.1941F));

		PartDefinition cube_r261 = osteoderms4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.4F, -0.8431F, 0.0331F, 0.1932F));

		PartDefinition cube_r262 = osteoderms4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(21, 84).addBox(-1.0435F, -0.0972F, -0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -0.4F, 0.0644F, 0.0331F, 0.1932F));

		PartDefinition cube_r263 = osteoderms4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(7, 82).addBox(-1.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.4F, 0.2913F, 0.0331F, 0.1932F));

		PartDefinition cube_r264 = osteoderms4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(58, 89).addBox(-0.5267F, -0.7204F, -0.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6342F, 5.3264F, 5.0128F, 2.722F, -0.2179F, 1.6508F));

		PartDefinition cube_r265 = osteoderms4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5675F, -0.5368F, -0.0919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.6342F, 5.3264F, 5.0128F, 0.7572F, -0.2182F, 1.6585F));

		PartDefinition cube_r266 = osteoderms4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(82, 77).addBox(-0.5675F, 0.0846F, -0.0536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(5.6342F, 5.3264F, 5.0128F, 1.1237F, -0.2182F, 1.6585F));

		PartDefinition cube_r267 = osteoderms4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(30, 100).addBox(-0.5267F, -0.7497F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6342F, 5.3264F, 5.0128F, 2.9489F, -0.2179F, 1.6508F));

		PartDefinition cube_r268 = osteoderms4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(49, 94).addBox(-0.164F, -0.1625F, -0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4342F, 4.7264F, 2.2128F, -3.1382F, 0.0755F, 1.4758F));

		PartDefinition cube_r269 = osteoderms4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(48, 83).addBox(-0.202F, 0.1072F, 0.5623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.4342F, 4.7264F, 2.2128F, 1.4084F, 0.0755F, 1.4758F));

		PartDefinition cube_r270 = osteoderms4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(55, 84).addBox(-0.202F, -0.7364F, 0.4912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4342F, 4.7264F, 2.2128F, 1.0418F, 0.0755F, 1.4758F));

		PartDefinition cube_r271 = osteoderms4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(24, 92).addBox(-0.164F, -0.1269F, -0.6797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4342F, 4.7264F, 2.2128F, 2.9181F, 0.0755F, 1.4758F));

		PartDefinition cube_r272 = osteoderms4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(67, 87).addBox(-0.6901F, -0.4043F, -1.0521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 3.1275F, 0.4394F, 1.5447F));

		PartDefinition cube_r273 = osteoderms4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 65).addBox(-0.6901F, -0.2715F, -0.6725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 2.9006F, 0.4394F, 1.5447F));

		PartDefinition cube_r274 = osteoderms4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(6, 76).addBox(-0.6901F, -0.1919F, 0.7486F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 1.2862F, 0.4394F, 1.5447F));

		PartDefinition cube_r275 = osteoderms4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 81).addBox(-0.6901F, -1.0172F, 1.3217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 1.0244F, 0.4394F, 1.5447F));

		PartDefinition cube_r276 = osteoderms4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(15, 100).addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.22F, 3.6601F, 6.0755F, 1.9958F, -0.0209F, 1.2386F));

		PartDefinition cube_r277 = osteoderms4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(75, 92).addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(5.22F, 3.6601F, 6.0755F, 0.1195F, -0.0209F, 1.2386F));

		PartDefinition cube_r278 = osteoderms4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(92, 60).addBox(-0.976F, -1.0542F, 0.766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.3F, 1.8F, 6.0F, 0.3424F, 0.0573F, 1.3213F));

		PartDefinition cube_r279 = osteoderms4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(100, 34).addBox(-0.976F, 0.1022F, -0.269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 1.8F, 6.0F, 2.2186F, 0.0573F, 1.3213F));

		PartDefinition cube_r280 = osteoderms4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(92, 64).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.5F, 1.7F, 3.0F, 0.3639F, -0.0273F, 1.3216F));

		PartDefinition cube_r281 = osteoderms4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(100, 0).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.7F, 3.0F, 2.2402F, -0.0273F, 1.3216F));

		PartDefinition cube_r282 = osteoderms4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(99, 45).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 3.5F, 2.8F, 2.1655F, 0.2601F, 1.3129F));

		PartDefinition cube_r283 = osteoderms4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(92, 75).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.2F, 3.5F, 2.8F, 0.2892F, 0.2601F, 1.3129F));

		PartDefinition cube_r284 = osteoderms4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(57, 99).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 2.134F, 0.2905F, 1.1092F));

		PartDefinition cube_r285 = osteoderms4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 92).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 0.2577F, 0.2905F, 1.1092F));

		PartDefinition osteoderms19 = chest.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.766F, -7.9611F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r286 = osteoderms19.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(0.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.4F, 6.4F, -0.7917F, -0.023F, -0.1947F));

		PartDefinition cube_r287 = osteoderms19.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 13).mirror().addBox(-0.0565F, -0.2729F, -3.6731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.8F, 6.2F, 0.2515F, 0.0177F, -0.1952F));

		PartDefinition cube_r288 = osteoderms19.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(38, 42).mirror().addBox(0.0435F, -0.1729F, -0.1731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.4F, 6.4F, 0.046F, -0.023F, -0.1947F));

		PartDefinition cube_r289 = osteoderms19.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.4F, 6.4F, 0.3427F, -0.023F, -0.1947F));

		PartDefinition cube_r290 = osteoderms19.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(31, 81).mirror().addBox(-0.1433F, 0.0376F, -1.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.1F, 4.3F, 0.3727F, 0.0279F, -0.1941F));

		PartDefinition cube_r291 = osteoderms19.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(0.0435F, -1.8506F, 0.831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, 2.7F, -0.5349F, 0.0279F, -0.1941F));

		PartDefinition cube_r292 = osteoderms19.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, -0.4F, -0.8431F, -0.0331F, -0.1932F));

		PartDefinition cube_r293 = osteoderms19.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(0.0435F, -0.0972F, -0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, -0.4F, 0.0644F, -0.0331F, -0.1932F));

		PartDefinition cube_r294 = osteoderms19.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(0.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, -0.4F, 0.2913F, -0.0331F, -0.1932F));

		PartDefinition cube_r295 = osteoderms19.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-0.4733F, -0.7204F, -0.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6342F, 5.3264F, 5.0128F, 2.722F, 0.2179F, -1.6508F));

		PartDefinition cube_r296 = osteoderms19.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-0.4325F, -0.5368F, -0.0919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.6342F, 5.3264F, 5.0128F, 0.7572F, 0.2182F, -1.6585F));

		PartDefinition cube_r297 = osteoderms19.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.4325F, 0.0846F, -0.0536F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.6342F, 5.3264F, 5.0128F, 1.1237F, 0.2182F, -1.6585F));

		PartDefinition cube_r298 = osteoderms19.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(30, 100).mirror().addBox(-0.4733F, -0.7497F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6342F, 5.3264F, 5.0128F, 2.9489F, 0.2179F, -1.6508F));

		PartDefinition cube_r299 = osteoderms19.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(49, 94).mirror().addBox(-0.836F, -0.1625F, -0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4342F, 4.7264F, 2.2128F, -3.1382F, -0.0755F, -1.4758F));

		PartDefinition cube_r300 = osteoderms19.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(48, 83).mirror().addBox(-0.798F, 0.1072F, 0.5623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.4342F, 4.7264F, 2.2128F, 1.4084F, -0.0755F, -1.4758F));

		PartDefinition cube_r301 = osteoderms19.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.798F, -0.7364F, 0.4912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4342F, 4.7264F, 2.2128F, 1.0418F, -0.0755F, -1.4758F));

		PartDefinition cube_r302 = osteoderms19.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(24, 92).mirror().addBox(-0.836F, -0.1269F, -0.6797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4342F, 4.7264F, 2.2128F, 2.9181F, -0.0755F, -1.4758F));

		PartDefinition cube_r303 = osteoderms19.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-0.3099F, -0.4043F, -1.0521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 3.1275F, -0.4394F, -1.5447F));

		PartDefinition cube_r304 = osteoderms19.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-0.3099F, -0.2715F, -0.6725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 2.9006F, -0.4394F, -1.5447F));

		PartDefinition cube_r305 = osteoderms19.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(6, 76).mirror().addBox(-0.3099F, -0.1919F, 0.7486F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 1.2862F, -0.4394F, -1.5447F));

		PartDefinition cube_r306 = osteoderms19.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(43, 81).mirror().addBox(-0.3099F, -1.0172F, 1.3217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 1.0244F, -0.4394F, -1.5447F));

		PartDefinition cube_r307 = osteoderms19.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-0.5F, -0.8859F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.22F, 3.6601F, 6.0755F, 1.9958F, 0.0209F, -1.2386F));

		PartDefinition cube_r308 = osteoderms19.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(75, 92).mirror().addBox(-0.5F, -0.5764F, -0.1194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-5.22F, 3.6601F, 6.0755F, 0.1195F, 0.0209F, -1.2386F));

		PartDefinition cube_r309 = osteoderms19.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(-0.024F, -1.0542F, 0.766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.8F, 6.0F, 0.3424F, -0.0573F, -1.3213F));

		PartDefinition cube_r310 = osteoderms19.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(100, 34).mirror().addBox(-0.024F, 0.1022F, -0.269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.8F, 6.0F, 2.2186F, -0.0573F, -1.3213F));

		PartDefinition cube_r311 = osteoderms19.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(92, 64).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.7F, 3.0F, 0.3639F, 0.0273F, -1.3216F));

		PartDefinition cube_r312 = osteoderms19.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.7F, 3.0F, 2.2402F, 0.0273F, -1.3216F));

		PartDefinition cube_r313 = osteoderms19.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 3.5F, 2.8F, 2.1655F, -0.2601F, -1.3129F));

		PartDefinition cube_r314 = osteoderms19.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 3.5F, 2.8F, 0.2892F, -0.2601F, -1.3129F));

		PartDefinition cube_r315 = osteoderms19.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(57, 99).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 2.134F, -0.2905F, -1.1092F));

		PartDefinition cube_r316 = osteoderms19.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 0.2577F, -0.2905F, -1.1092F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3F, 5.5669F, -3.5334F, 0.5149F, -0.0008F, -0.2182F));

		PartDefinition cube_r317 = leftarm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(28, 39).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r318 = leftarm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 59).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r319 = leftarm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(75, 72).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftarm.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(73, 13).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftarm.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(14, 84).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.3571F, 1.7001F, -0.55F, -0.9424F, 1.0623F));

		PartDefinition cube_r322 = leftarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.308F, 0.1523F, -2.4156F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r323 = leftarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 67).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 6.5086F, -2.6347F, 0.9395F, 0.7562F, -0.2091F));

		PartDefinition cube_r324 = lefthand.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(28, 76).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r325 = lefthand.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(68, 21).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r326 = lefthand.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(51, 55).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r327 = lefthand.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(80, 81).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, 5.3669F, -3.5334F, -0.7451F, 0.0454F, 0.1941F));

		PartDefinition cube_r328 = rightarm.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(28, 39).mirror().addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r329 = rightarm.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r330 = rightarm.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(75, 72).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightarm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-1.0F, -3.6F, -0.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightarm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(14, 84).mirror().addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.3571F, 1.7001F, 1.0233F, 1.1447F, 0.2858F));

		PartDefinition cube_r333 = rightarm2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.308F, 0.1523F, -2.4156F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r334 = rightarm2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 6.5086F, -2.6347F, 0.9309F, -0.6437F, 0.5477F));

		PartDefinition cube_r335 = righthand.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r336 = righthand.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r337 = righthand.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r338 = righthand.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -7.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 99).addBox(0.5F, -2.3F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 49).addBox(-2.0F, -3.0F, -3.8F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(71, 39).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(35, 100).addBox(0.5F, -1.6346F, -0.0211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.1534F, 0.6858F, -1.1724F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.5833F, 0.412F, -0.3864F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.368F, 0.5997F, -1.0433F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.6573F, 0.2332F, -0.3628F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(45, 74).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.5833F, -0.412F, 0.3864F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(86, 36).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.1534F, -0.6858F, 1.1724F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(25, 75).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.6573F, -0.2332F, 0.3628F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(86, 59).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.368F, -0.5997F, 1.0433F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(2.0F, -2.766F, -3.2611F));

		PartDefinition cube_r349 = osteoderms3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(92, 78).addBox(-0.5F, -0.7634F, -0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.8089F, 0.0453F, 1.411F, -0.634F, 0.0297F, 0.1938F));

		PartDefinition cube_r350 = osteoderms3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(84, 25).addBox(-0.5F, -0.5819F, -1.3851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8089F, 0.0453F, 1.411F, 0.3085F, 0.0297F, 0.1938F));

		PartDefinition cube_r351 = osteoderms3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(39, 62).addBox(-1.0F, -2.8299F, 0.0963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.1891F, 0.3979F, -0.5522F));

		PartDefinition cube_r352 = osteoderms3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(62, 27).addBox(-1.0F, -3.1299F, 0.8963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.5692F, 0.3832F, -0.542F));

		PartDefinition cube_r353 = osteoderms3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(100, 30).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.3F, 0.2F, 1.83F, 0.097F, 1.6347F));

		PartDefinition cube_r354 = osteoderms3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(76, 89).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9F, 2.3F, 0.2F, -0.0462F, 0.097F, 1.6347F));

		PartDefinition osteoderms20 = neck3.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.766F, -3.2611F));

		PartDefinition cube_r355 = osteoderms20.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(92, 78).mirror().addBox(-0.5F, -0.7634F, -0.2074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.8089F, 0.0453F, 1.411F, -0.634F, -0.0297F, -0.1938F));

		PartDefinition cube_r356 = osteoderms20.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.5F, -0.5819F, -1.3851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8089F, 0.0453F, 1.411F, 0.3085F, -0.0297F, -0.1938F));

		PartDefinition cube_r357 = osteoderms20.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(0.0F, -2.8299F, 0.0963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.1891F, -0.3979F, 0.5522F));

		PartDefinition cube_r358 = osteoderms20.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(0.0F, -3.1299F, 0.8963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.5692F, -0.3832F, 0.542F));

		PartDefinition cube_r359 = osteoderms20.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(100, 30).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.3F, 0.2F, 1.83F, -0.097F, -1.6347F));

		PartDefinition cube_r360 = osteoderms20.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(76, 89).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.3F, 0.2F, -0.0462F, -0.097F, -1.6347F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.1745F, 0.2618F, 0.0F));

		PartDefinition cube_r361 = neck2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 29).addBox(0.5F, -1.5F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 29).addBox(0.5F, -1.3F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 70).addBox(0.0F, -0.6F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r362 = neck2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.3529F, 0.5783F, -0.9417F));

		PartDefinition cube_r363 = neck2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r364 = neck2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(22, 63).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.3529F, -0.5783F, 0.9417F));

		PartDefinition cube_r365 = neck2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(64, 21).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(51, 20).addBox(-1.0F, 0.0619F, -0.3727F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -3.2F, -0.0262F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.766F, -2.1611F));

		PartDefinition cube_r367 = osteoderms2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 92).addBox(-1.0406F, -0.4198F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, -0.0422F, 0.0128F, 0.1956F));

		PartDefinition cube_r368 = osteoderms2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(98, 94).addBox(-1.0406F, -0.1482F, -0.2586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.3941F, 0.0128F, 0.1956F));

		PartDefinition cube_r369 = osteoderms2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(84, 99).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0F, -0.4F, 1.838F, 0.219F, 1.636F));

		PartDefinition cube_r370 = osteoderms2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(88, 80).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 2.0F, -0.4F, -0.0383F, 0.219F, 1.636F));

		PartDefinition osteoderms21 = neck2.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.766F, -2.1611F));

		PartDefinition cube_r371 = osteoderms21.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(0.0406F, -0.4198F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, -0.0422F, -0.0128F, -0.1956F));

		PartDefinition cube_r372 = osteoderms21.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(0.0406F, -0.1482F, -0.2586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.3941F, -0.0128F, -0.1956F));

		PartDefinition cube_r373 = osteoderms21.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(-3.0F, -0.9453F, -0.2278F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.866F, -1.3389F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r374 = osteoderms21.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(84, 99).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.4F, 1.838F, -0.219F, -1.636F));

		PartDefinition cube_r375 = osteoderms21.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.4F, -0.0383F, -0.219F, -1.636F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r376 = neck.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(96, 100).addBox(0.5F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 64).addBox(-1.0F, -1.1F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(60, 72).mirror().addBox(-1.0151F, -0.0848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.1911F, -1.7F, 0.6295F, 0.8518F, -0.7876F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(60, 72).addBox(0.0151F, -0.0848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.1911F, -1.7F, 0.6295F, -0.8518F, 0.7876F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.366F, -1.2611F));

		PartDefinition cube_r379 = osteoderms.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(5, 93).addBox(-1.0406F, -0.4198F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.3F, -0.0081F, 0.095F, 0.1967F));

		PartDefinition cube_r380 = osteoderms.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(5, 99).addBox(-1.0406F, -0.1482F, -0.2586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.3F, 0.4283F, 0.095F, 0.1967F));

		PartDefinition cube_r381 = osteoderms.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(99, 59).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6F, -0.5F, 1.8334F, 0.1493F, 1.6351F));

		PartDefinition cube_r382 = osteoderms.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(86, 88).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 1.6F, -0.5F, -0.0428F, 0.1493F, 1.6351F));

		PartDefinition osteoderms22 = neck.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.366F, -1.2611F));

		PartDefinition cube_r383 = osteoderms22.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(0.0406F, -0.4198F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.3F, -0.0081F, -0.095F, -0.1967F));

		PartDefinition cube_r384 = osteoderms22.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(0.0406F, -0.1482F, -0.2586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.3F, 0.4283F, -0.095F, -0.1967F));

		PartDefinition cube_r385 = osteoderms22.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6F, -0.5F, 1.8334F, -0.1493F, -1.6351F));

		PartDefinition cube_r386 = osteoderms22.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(86, 88).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6F, -0.5F, -0.0428F, -0.1493F, -1.6351F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1742F, -2.7931F, 0.4115F, 0.08F, 0.0349F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(81, 9).addBox(-1.0F, -0.3F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 54).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.6334F, -2.6639F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(76, 30).addBox(-2.7F, -1.9824F, -0.0106F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.9406F, -1.124F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(52, 51).addBox(-1.7F, 0.4646F, -0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.2F, 1.1714F, -6.3084F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(78, 39).addBox(-2.7F, -0.9328F, -0.0933F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.6406F, -1.924F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(22, 80).addBox(-2.2F, -1.881F, -0.1312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.7406F, -3.424F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(22, 2).addBox(-1.2F, -2.9048F, -0.1312F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.2594F, -5.524F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(13, 79).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3213F, -0.9719F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(49, 37).addBox(-1.5F, -1.5451F, -0.0148F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0025F))
				.texOffs(49, 47).addBox(-1.5F, -0.9451F, -0.0148F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.5F, 1.547F, -6.2319F, -0.5061F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.2594F, -5.524F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(12, 76).addBox(-0.9F, 0.4646F, -0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.7F, 0.912F, -0.7844F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(15, 94).addBox(-0.9F, -1.0385F, 0.4165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(20, 94).addBox(-0.9F, -1.0385F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.7F, 2.012F, 0.5156F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(91, 2).addBox(-0.27F, -1.5451F, 0.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(91, 27).addBox(-0.9673F, -0.4747F, -2.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 63).addBox(-0.9709F, -0.7736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3873F, -0.3645F, 2.8533F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(36, 78).addBox(-0.8709F, -0.0736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1902F, 0.4005F, 0.0154F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(16, 88).addBox(-0.2947F, -1.0572F, -0.8224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1F, 0.9959F, 2.3675F, 0.0212F, 0.2425F, 0.0304F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5F, -0.0779F, -1.6598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2383F, 0.0291F, 5.0007F, 1.4051F, -0.2261F, 2.7629F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(77, 45).addBox(-0.9635F, -0.2965F, -2.4695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2383F, 1.1291F, 5.3007F, 0.5673F, -0.2261F, 2.7629F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(78, 4).addBox(-0.5F, -0.5272F, -1.3943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2383F, 0.0291F, 5.0007F, 1.0386F, -0.2261F, 2.7629F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(82, 85).addBox(-0.6904F, 0.3918F, -0.4605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.2143F, -1.868F, 4.8678F, -1.2171F, 0.4124F, 0.1469F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(47, 91).addBox(-0.8831F, -0.2915F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2143F, -1.868F, 4.8678F, -1.5095F, 0.0331F, 0.0111F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(19, 91).addBox(-0.9199F, -0.4798F, 0.1705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1143F, -1.868F, 6.6678F, -1.8177F, -0.2434F, -0.0713F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(77, 85).addBox(-0.8641F, -1.8496F, -0.3496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2143F, -1.868F, 5.0678F, -1.8689F, -0.6305F, 0.0472F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 91).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 91).addBox(-0.4864F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9764F, -0.7834F, 3.8226F, -0.5934F, 0.0349F, 0.0F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(84, 15).addBox(-1.3F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8101F, -0.1834F, 4.8361F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(76, 50).addBox(-1.4F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(91, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 91).addBox(-0.3899F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1899F, -0.7834F, 3.8152F, -0.2007F, 0.0349F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.2594F, -5.524F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(12, 76).mirror().addBox(-0.1F, 0.4646F, -0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.912F, -0.7844F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.1F, -1.0385F, 0.4165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(20, 94).mirror().addBox(-0.1F, -1.0385F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.012F, 0.5156F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(91, 2).mirror().addBox(-0.73F, -1.5451F, 0.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(-0.0327F, -0.4747F, -2.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(78, 63).mirror().addBox(-0.0291F, -0.7736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3873F, -0.3645F, 2.8533F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(36, 78).mirror().addBox(-0.1291F, -0.0736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1902F, -0.4005F, -0.0154F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(-0.7053F, -1.0572F, -0.8224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9959F, 2.3675F, 0.0212F, -0.2425F, -0.0304F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.5F, -0.0779F, -1.6598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.0291F, 5.0007F, 1.4051F, 0.2261F, -2.7629F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(77, 45).mirror().addBox(-0.0365F, -0.2965F, -2.4695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 1.1291F, 5.3007F, 0.5673F, 0.2261F, -2.7629F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.5F, -0.5272F, -1.3943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.0291F, 5.0007F, 1.0386F, 0.2261F, -2.7629F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(82, 85).mirror().addBox(-0.3096F, 0.3918F, -0.4605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.2143F, -1.868F, 4.8678F, -1.2171F, -0.4124F, -0.1469F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(-0.1169F, -0.2915F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2143F, -1.868F, 4.8678F, -1.5095F, -0.0331F, -0.0111F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(19, 91).mirror().addBox(-0.0801F, -0.4798F, 0.1705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1143F, -1.868F, 6.6678F, -1.8177F, 0.2434F, 0.0713F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-0.1359F, -1.8496F, -0.3496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2143F, -1.868F, 5.0678F, -1.8689F, 0.6305F, -0.0472F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 91).mirror().addBox(-0.5136F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9764F, -0.7834F, 3.8226F, -0.5934F, -0.0349F, 0.0F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.7F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8101F, -0.1834F, 4.8361F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-0.6F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(91, 32).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 91).mirror().addBox(-0.6101F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1899F, -0.7834F, 3.8152F, -0.2007F, -0.0349F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.3117F, 0.2096F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(9, 61).mirror().addBox(-0.4782F, -0.8932F, -1.5486F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.2177F, -0.3141F, 0.0022F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(92, 5).mirror().addBox(-0.5782F, -0.9676F, -1.8434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.4359F, -0.3141F, 0.0022F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(-0.1046F, -0.8205F, -3.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.4102F, -0.0698F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(-0.1046F, -1.648F, -2.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.7418F, -0.0698F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-2.0F, -1.0158F, -0.9821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5722F, -1.6333F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(52, 91).mirror().addBox(-2.0F, -1.0158F, 0.4179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0015F)).mirror(false)
				.texOffs(91, 68).mirror().addBox(-2.0F, -1.0158F, 0.0179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(52, 91).addBox(0.6F, -1.0158F, 0.4179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0015F))
				.texOffs(91, 68).addBox(0.6F, -1.0158F, 0.0179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 1.5722F, -1.6333F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(11, 88).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(11, 88).addBox(1.9F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.5021F, -0.6497F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.5F, -0.0114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 48).addBox(1.9F, -0.0114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.4452F, -1.734F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(70, 83).addBox(1.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.2548F, -0.834F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-0.5752F, -0.7046F, -1.087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.1479F, -0.3141F, 0.0022F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(26, 89).mirror().addBox(-0.5752F, -0.6594F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.0433F, -2.2018F, 0.1479F, -0.3141F, 0.0022F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(9, 61).addBox(0.4782F, -0.8932F, -1.5486F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.2177F, 0.3141F, -0.0022F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(92, 5).addBox(-0.4218F, -0.9676F, -1.8434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.4359F, 0.3141F, -0.0022F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(72, 87).addBox(-0.8954F, -0.8205F, -3.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.4102F, 0.0698F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(91, 83).addBox(-0.8954F, -1.648F, -2.4312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.7418F, 0.0698F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(91, 55).addBox(1.0F, -1.0158F, -0.9821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.5722F, -1.6333F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(93, 12).addBox(-0.4248F, -0.7046F, -1.087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.1479F, 0.3141F, -0.0022F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(26, 89).addBox(-0.4248F, -0.6594F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.0433F, -2.2018F, 0.1479F, 0.3141F, -0.0022F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offset(7.6F, 0.8F, -7.6F));

		PartDefinition cube_r447 = backPlates2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(14, 39).addBox(-0.1338F, -0.1404F, -0.0773F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0296F, -0.4121F, 1.0433F));

		PartDefinition cube_r448 = backPlates2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(22, 23).addBox(0.0F, -0.0803F, -7.0585F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, -4.0F, 6.4F, 0.129F, -0.0898F, 0.6051F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offset(-7.6F, 0.8F, -7.6F));

		PartDefinition cube_r449 = backPlates5.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-2.8662F, -0.1404F, -0.0773F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0296F, 0.4121F, -1.0433F));

		PartDefinition cube_r450 = backPlates5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(22, 23).mirror().addBox(-5.0F, -0.0803F, -7.0585F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.1F, -4.0F, 6.4F, 0.129F, 0.0898F, -0.6051F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(37, 55).addBox(0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 42).addBox(0.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 46).addBox(-0.4F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 32).addBox(0.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 55).mirror().addBox(-2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 42).mirror().addBox(-2.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 46).mirror().addBox(-1.6F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 32).mirror().addBox(-1.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 49).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 44).addBox(0.0F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 100).addBox(0.0F, -1.7F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 40).addBox(0.0F, -1.6F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.2961F, -0.0014F, 0.0248F));

		PartDefinition cube_r451 = tail.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(11, 40).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 100).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 52).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -4.466F, 5.0389F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r452 = osteoderms7.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(36, 83).addBox(-4.643F, -0.0723F, 0.4502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1686F, 8.0825F, 3.731F, 3.0761F, -0.6196F, 1.5749F));

		PartDefinition cube_r453 = osteoderms7.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(38, 87).addBox(-5.134F, -1.9019F, 0.8559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.8686F, 8.5825F, 3.731F, 1.8195F, -0.6403F, 1.4679F));

		PartDefinition cube_r454 = osteoderms7.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -0.5819F, -1.3851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1911F, 1.7468F, 2.8999F, 0.5241F, -0.1158F, 0.1131F));

		PartDefinition cube_r455 = osteoderms7.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(95, 53).addBox(-0.5F, -0.8144F, -0.263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.1911F, 1.7468F, 2.8999F, -0.6104F, -0.1158F, 0.1131F));

		PartDefinition cube_r456 = osteoderms7.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(22, 23).addBox(-0.9609F, -0.2881F, -1.4491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 2.8F, -1.6F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r457 = osteoderms7.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(95, 0).addBox(-0.9609F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.9F, 2.8F, -1.6F, -0.5092F, -0.0329F, 0.1933F));

		PartDefinition cube_r458 = osteoderms7.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 83).addBox(-5.0853F, -0.2423F, -0.4574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8686F, 8.5825F, 3.731F, 2.2034F, -0.6403F, 1.4679F));

		PartDefinition cube_r459 = osteoderms7.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(48, 87).addBox(-0.5248F, -1.6317F, -0.0298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.8693F, 3.5313F, 3.7996F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition cube_r460 = osteoderms7.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(77, 34).addBox(-0.476F, -0.713F, -1.7059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8693F, 3.5313F, 3.7996F, 3.0687F, -0.5324F, 1.5731F));

		PartDefinition cube_r461 = osteoderms7.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(83, 53).addBox(-0.476F, -0.0216F, -1.6084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8693F, 3.5313F, 3.7996F, 2.7022F, -0.5324F, 1.5731F));

		PartDefinition osteoderms13 = tail.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -4.466F, 5.0389F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r462 = osteoderms13.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(3.643F, -0.0723F, 0.4502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1686F, 8.0825F, 3.731F, 3.0761F, 0.6196F, -1.5749F));

		PartDefinition cube_r463 = osteoderms13.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(4.134F, -1.9019F, 0.8559F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.8686F, 8.5825F, 3.731F, 1.8195F, 0.6403F, -1.4679F));

		PartDefinition cube_r464 = osteoderms13.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-0.5F, -0.5819F, -1.3851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1911F, 1.7468F, 2.8999F, 0.5241F, 0.1158F, -0.1131F));

		PartDefinition cube_r465 = osteoderms13.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(95, 53).mirror().addBox(-0.5F, -0.8144F, -0.263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.1911F, 1.7468F, 2.8999F, -0.6104F, 0.1158F, -0.1131F));

		PartDefinition cube_r466 = osteoderms13.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(22, 23).mirror().addBox(-0.0391F, -0.2881F, -1.4491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9F, 2.8F, -1.6F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r467 = osteoderms13.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.0391F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, 2.8F, -1.6F, -0.5092F, 0.0329F, -0.1933F));

		PartDefinition cube_r468 = osteoderms13.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(4.0853F, -0.2423F, -0.4574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8686F, 8.5825F, 3.731F, 2.2034F, 0.6403F, -1.4679F));

		PartDefinition cube_r469 = osteoderms13.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(48, 87).mirror().addBox(-0.4752F, -1.6317F, -0.0298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8693F, 3.5313F, 3.7996F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition cube_r470 = osteoderms13.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.524F, -0.713F, -1.7059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8693F, 3.5313F, 3.7996F, 3.0687F, 0.5324F, -1.5731F));

		PartDefinition cube_r471 = osteoderms13.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(83, 53).mirror().addBox(-0.524F, -0.0216F, -1.6084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8693F, 3.5313F, 3.7996F, 2.7022F, 0.5324F, -1.5731F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(59, 18).addBox(0.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 6).addBox(0.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 43).addBox(0.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 64).addBox(-0.1F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 18).mirror().addBox(-1.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 6).mirror().addBox(-1.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 43).mirror().addBox(-1.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 64).mirror().addBox(-0.9F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 3).addBox(0.0F, -1.4F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 101).addBox(0.0F, -1.2F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(0.0F, -1.1F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 100).addBox(0.0F, -1.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0204F, -0.3459F, -0.0676F));

		PartDefinition cube_r472 = tail2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(55, 76).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 18).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 4).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 100).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -4.9071F, 6.1706F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r473 = osteoderms8.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(93, 18).addBox(-0.9609F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 3.5F, 2.0F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r474 = osteoderms8.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(89, 93).addBox(-0.9609F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7F, 3.5F, 2.0F, -0.5092F, -0.0329F, 0.1933F));

		PartDefinition cube_r475 = osteoderms8.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(93, 35).addBox(-0.9609F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 4.3F, -0.7F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r476 = osteoderms8.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(10, 94).addBox(-0.9609F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7F, 4.3F, -0.7F, -0.5092F, -0.0329F, 0.1933F));

		PartDefinition cube_r477 = osteoderms8.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(42, 78).addBox(-0.253F, -0.2908F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2693F, 4.5313F, 1.7996F, 2.7022F, -0.5324F, 1.5731F));

		PartDefinition cube_r478 = osteoderms8.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(87, 76).addBox(-0.253F, -0.6399F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2693F, 4.5313F, 1.7996F, 3.0687F, -0.5324F, 1.5731F));

		PartDefinition cube_r479 = osteoderms8.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(63, 98).addBox(-0.3017F, -0.6777F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.2693F, 4.5313F, 1.7996F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition cube_r480 = osteoderms8.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(99, 83).addBox(-0.0125F, -0.4012F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5693F, 5.4313F, -0.8004F, 1.917F, -0.4451F, 1.573F));

		PartDefinition cube_r481 = osteoderms8.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(89, 38).addBox(-0.5553F, -1.0019F, 4.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5693F, 3.4313F, 3.7996F, 3.0687F, -0.5324F, 1.5731F));

		PartDefinition cube_r482 = osteoderms8.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(81, 89).addBox(0.0362F, -0.1655F, -1.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5693F, 5.4313F, -0.8004F, 2.7024F, -0.4451F, 1.573F));

		PartDefinition osteoderms14 = tail2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -4.9071F, 6.1706F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r483 = osteoderms14.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(93, 18).mirror().addBox(-0.0391F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 3.5F, 2.0F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r484 = osteoderms14.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(89, 93).mirror().addBox(-0.0391F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 3.5F, 2.0F, -0.5092F, 0.0329F, -0.1933F));

		PartDefinition cube_r485 = osteoderms14.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-0.0391F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 4.3F, -0.7F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r486 = osteoderms14.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.0391F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7F, 4.3F, -0.7F, -0.5092F, 0.0329F, -0.1933F));

		PartDefinition cube_r487 = osteoderms14.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.747F, -0.2908F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2693F, 4.5313F, 1.7996F, 2.7022F, 0.5324F, -1.5731F));

		PartDefinition cube_r488 = osteoderms14.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(87, 76).mirror().addBox(-0.747F, -0.6399F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2693F, 4.5313F, 1.7996F, 3.0687F, 0.5324F, -1.5731F));

		PartDefinition cube_r489 = osteoderms14.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(-0.6983F, -0.6777F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.2693F, 4.5313F, 1.7996F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition cube_r490 = osteoderms14.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.9875F, -0.4012F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5693F, 5.4313F, -0.8004F, 1.917F, 0.4451F, -1.573F));

		PartDefinition cube_r491 = osteoderms14.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(89, 38).mirror().addBox(-0.4447F, -1.0019F, 4.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5693F, 3.4313F, 3.7996F, 3.0687F, 0.5324F, -1.5731F));

		PartDefinition cube_r492 = osteoderms14.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(81, 89).mirror().addBox(-1.0362F, -0.1655F, -1.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5693F, 5.4313F, -0.8004F, 2.7024F, 0.4451F, -1.573F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(79, 100).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 100).addBox(0.0F, -0.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 64).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0925F, 0.2444F, -0.1618F));

		PartDefinition cube_r493 = tail3.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(60, 47).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 61).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 71).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 47).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -4.5071F, 3.8706F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r494 = osteoderms9.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(93, 40).addBox(-0.9609F, 0.4119F, 1.4509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 93).addBox(-0.9609F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 2.9F, 4.0F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r495 = osteoderms9.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(93, 71).addBox(-0.9609F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 3.6F, 2.0F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r496 = osteoderms9.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(28, 94).addBox(-0.9609F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.2F, 3.6F, 2.0F, -0.5092F, -0.0329F, 0.1933F));

		PartDefinition cube_r497 = osteoderms9.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(71, 94).addBox(-0.9609F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 4.3F, -0.7F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r498 = osteoderms9.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(33, 94).addBox(-0.9609F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.4F, 4.3F, -0.7F, -0.5092F, -0.0329F, 0.1933F));

		PartDefinition cube_r499 = osteoderms9.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(20, 98).addBox(0.3983F, 2.8223F, -2.0745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(98, 40).addBox(-0.0017F, 1.1223F, -1.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(52, 98).addBox(-0.2017F, -0.3777F, -0.5745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6693F, 3.8313F, 2.3996F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition cube_r500 = osteoderms9.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(91, 87).addBox(-0.253F, -0.2908F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6693F, 4.5313F, 0.6996F, 2.7022F, -0.5324F, 1.5731F));

		PartDefinition cube_r501 = osteoderms9.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(43, 89).addBox(-0.253F, -0.6399F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6693F, 4.5313F, 0.6996F, 3.0687F, -0.5324F, 1.5731F));

		PartDefinition cube_r502 = osteoderms9.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(99, 6).addBox(-0.3017F, -0.6777F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6693F, 4.5313F, 0.6996F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition cube_r503 = osteoderms9.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(99, 55).addBox(-0.0125F, -0.4012F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.8693F, 5.1313F, -1.8004F, 1.917F, -0.4451F, 1.573F));

		PartDefinition cube_r504 = osteoderms9.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(9, 91).addBox(-0.5553F, -1.0019F, 4.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8693F, 3.1313F, 2.7996F, 3.0687F, -0.5324F, 1.5731F));

		PartDefinition cube_r505 = osteoderms9.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(53, 88).addBox(0.0362F, -0.1655F, -1.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8693F, 5.1313F, -1.8004F, 2.7024F, -0.4451F, 1.573F));

		PartDefinition osteoderms15 = tail3.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -4.5071F, 3.8706F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r506 = osteoderms15.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-0.0391F, 0.4119F, 1.4509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 93).mirror().addBox(-0.0391F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 2.9F, 4.0F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r507 = osteoderms15.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-0.0391F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 3.6F, 2.0F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r508 = osteoderms15.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(28, 94).mirror().addBox(-0.0391F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 3.6F, 2.0F, -0.5092F, 0.0329F, -0.1933F));

		PartDefinition cube_r509 = osteoderms15.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(-0.0391F, -0.2881F, -0.4491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.3F, -0.7F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r510 = osteoderms15.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(33, 94).mirror().addBox(-0.0391F, -0.6322F, -0.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.3F, -0.7F, -0.5092F, 0.0329F, -0.1933F));

		PartDefinition cube_r511 = osteoderms15.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-1.3983F, 2.8223F, -2.0745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(98, 40).mirror().addBox(-0.9983F, 1.1223F, -1.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(52, 98).mirror().addBox(-0.7983F, -0.3777F, -0.5745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, 3.8313F, 2.3996F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition cube_r512 = osteoderms15.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-0.747F, -0.2908F, -0.8267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, 4.5313F, 0.6996F, 2.7022F, 0.5324F, -1.5731F));

		PartDefinition cube_r513 = osteoderms15.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-0.747F, -0.6399F, -0.7176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, 4.5313F, 0.6996F, 3.0687F, 0.5324F, -1.5731F));

		PartDefinition cube_r514 = osteoderms15.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(-0.6983F, -0.6777F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, 4.5313F, 0.6996F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition cube_r515 = osteoderms15.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(99, 55).mirror().addBox(-0.9875F, -0.4012F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.8693F, 5.1313F, -1.8004F, 1.917F, 0.4451F, -1.573F));

		PartDefinition cube_r516 = osteoderms15.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(9, 91).mirror().addBox(-0.4447F, -1.0019F, 4.3141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8693F, 3.1313F, 2.7996F, 3.0687F, 0.5324F, -1.5731F));

		PartDefinition cube_r517 = osteoderms15.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(53, 88).mirror().addBox(-1.0362F, -0.1655F, -1.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8693F, 5.1313F, -1.8004F, 2.7024F, 0.4451F, -1.573F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 59).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.0021F, 0.2033F, 0.0126F));

		PartDefinition cube_r518 = tail4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(17, 40).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 50).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 59).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -0.2732F, 1.0074F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r519 = osteoderms10.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(38, 95).addBox(-1.1289F, 1.3956F, 2.307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 8).addBox(-1.0736F, 1.2209F, 1.3242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 96).addBox(-0.9908F, 0.7297F, -0.6121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 15).addBox(-1.0372F, 0.9503F, 0.3621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 43).addBox(-0.8242F, 0.3773F, -2.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.4F, -1.7492F, 1.202F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r520 = osteoderms10.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(97, 97).addBox(0.5625F, -1.0026F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 98).addBox(0.3886F, -1.8947F, -0.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 11).addBox(0.2149F, -2.8209F, -0.2839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 97).addBox(0.041F, -3.713F, 0.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 18).addBox(-0.2017F, -5.0777F, 0.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6693F, -2.2178F, 4.3016F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition osteoderms16 = tail4.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -0.2732F, 1.0074F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r521 = osteoderms16.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(0.1289F, 1.3956F, 2.307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 8).mirror().addBox(0.0736F, 1.2209F, 1.3242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 96).mirror().addBox(-0.0092F, 0.7297F, -0.6121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 15).mirror().addBox(0.0372F, 0.9503F, 0.3621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 43).mirror().addBox(-0.1758F, 0.3773F, -2.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -1.7492F, 1.202F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r522 = osteoderms16.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-1.5625F, -1.0026F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 98).mirror().addBox(-1.3886F, -1.8947F, -0.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 11).mirror().addBox(-1.2149F, -2.8209F, -0.2839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 97).mirror().addBox(-1.041F, -3.713F, 0.1449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(98, 18).mirror().addBox(-0.7983F, -5.0777F, 0.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, -2.2178F, 4.3016F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3024F, 0.0122F, -0.0223F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -0.6227F, 0.9654F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r523 = osteoderms11.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(66, 95).addBox(-0.4853F, 0.1326F, 3.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 95).addBox(-0.4853F, 0.0326F, 2.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 81).addBox(-0.4853F, -0.1674F, 1.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 85).addBox(-0.4853F, -0.2674F, 0.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 89).addBox(-0.4853F, -0.3674F, -0.2332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.7F, -0.6492F, 1.602F, 0.6379F, -0.188F, 0.0793F));

		PartDefinition cube_r524 = osteoderms11.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(93, 95).addBox(-0.9476F, 0.6601F, -1.6069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 3).addBox(-0.9476F, 0.5601F, -2.6069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.4F, -1.7492F, 1.202F, 0.6253F, -0.0329F, 0.1933F));

		PartDefinition cube_r525 = osteoderms11.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(47, 97).addBox(0.1896F, -0.1782F, -2.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 49).addBox(0.1981F, -1.0845F, -1.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 69).addBox(0.2066F, -1.9907F, -1.2224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 97).addBox(0.215F, -2.897F, -0.7881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 73).addBox(0.2235F, -3.8033F, -0.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 76).addBox(0.232F, -4.7095F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 97).addBox(0.2405F, -5.6158F, 0.5148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.6693F, -2.2178F, 4.3016F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition osteoderms17 = tail5.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -0.6227F, 0.9654F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r526 = osteoderms17.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(66, 95).mirror().addBox(-0.5147F, 0.1326F, 3.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 95).mirror().addBox(-0.5147F, 0.0326F, 2.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 81).mirror().addBox(-0.5147F, -0.1674F, 1.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 85).mirror().addBox(-0.5147F, -0.2674F, 0.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(-0.5147F, -0.3674F, -0.2332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.6492F, 1.602F, 0.6379F, 0.188F, -0.0793F));

		PartDefinition cube_r527 = osteoderms17.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-0.0524F, 0.6601F, -1.6069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 3).mirror().addBox(-0.0524F, 0.5601F, -2.6069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.4F, -1.7492F, 1.202F, 0.6253F, 0.0329F, -0.1933F));

		PartDefinition cube_r528 = osteoderms17.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(47, 97).mirror().addBox(-1.1896F, -0.1782F, -2.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 49).mirror().addBox(-1.1981F, -1.0845F, -1.6566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 69).mirror().addBox(-1.2066F, -1.9907F, -1.2224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 97).mirror().addBox(-1.215F, -2.897F, -0.7881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 73).mirror().addBox(-1.2235F, -3.8033F, -0.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 76).mirror().addBox(-1.232F, -4.7095F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 97).mirror().addBox(-1.2405F, -5.6158F, 0.5148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, -2.2178F, 4.3016F, 1.9168F, 0.5324F, -1.5731F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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