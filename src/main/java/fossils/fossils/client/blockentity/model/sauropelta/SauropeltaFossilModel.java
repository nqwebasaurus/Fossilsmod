package fossils.fossils.client.blockentity.model.sauropelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SauropeltaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms18;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart leftleg6;
	private final ModelPart leftfoot3;
	private final ModelPart leftfoot4;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart backPlates3;
	private final ModelPart backPlates6;
	private final ModelPart body;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms17;
	private final ModelPart chest;
	private final ModelPart backPlates;
	private final ModelPart backPlates4;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms16;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms15;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms14;
	private final ModelPart neck;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms13;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart backPlates2;
	private final ModelPart backPlates5;
	private final ModelPart tail;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms19;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms20;
	private final ModelPart tail2;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms21;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms22;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms23;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms24;

	public SauropeltaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms6 = this.hips.getChild("osteoderms6");
		this.osteoderms18 = this.hips.getChild("osteoderms18");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.leftleg4 = this.hips.getChild("leftleg4");
		this.leftleg5 = this.leftleg4.getChild("leftleg5");
		this.leftleg6 = this.leftleg5.getChild("leftleg6");
		this.leftfoot3 = this.leftleg6.getChild("leftfoot3");
		this.leftfoot4 = this.leftfoot3.getChild("leftfoot4");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.backPlates3 = this.hips.getChild("backPlates3");
		this.backPlates6 = this.hips.getChild("backPlates6");
		this.body = this.hips.getChild("body");
		this.osteoderms5 = this.body.getChild("osteoderms5");
		this.osteoderms17 = this.body.getChild("osteoderms17");
		this.chest = this.body.getChild("chest");
		this.backPlates = this.chest.getChild("backPlates");
		this.backPlates4 = this.chest.getChild("backPlates4");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms16 = this.chest.getChild("osteoderms16");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms15 = this.neck3.getChild("osteoderms15");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms14 = this.neck2.getChild("osteoderms14");
		this.neck = this.neck2.getChild("neck");
		this.osteoderms = this.neck.getChild("osteoderms");
		this.osteoderms13 = this.neck.getChild("osteoderms13");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms19 = this.tail.getChild("osteoderms19");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.osteoderms20 = this.tail.getChild("osteoderms20");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms21 = this.tail2.getChild("osteoderms21");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms22 = this.tail3.getChild("osteoderms22");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms23 = this.tail4.getChild("osteoderms23");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms24 = this.tail5.getChild("osteoderms24");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -18.5F, 8.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(0.5F, -1.9106F, -5.0576F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 0).addBox(-4.0F, -0.0338F, -7.0284F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 10).addBox(-3.0F, -0.1303F, -0.0543F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.8F, -1.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 69).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.9185F, -0.6913F, 0.7136F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(82, 24).mirror().addBox(-1.9185F, -0.6913F, 0.7136F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, -0.6252F, 0.0135F, -0.3318F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0164F, -0.3984F, -2.513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, -0.3926F, -0.0692F, -0.2527F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(-1.0321F, 0.3934F, -4.5938F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3068F, -1.4635F, -2.3547F, -0.2073F, 0.3209F, -0.506F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-2.4638F, 0.4191F, -6.5496F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3068F, -1.4635F, -2.3547F, -0.1989F, 0.1499F, -0.4698F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-1.618F, -0.5964F, -5.3304F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.9547F, -0.1929F, 0.3417F, -0.738F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(0.6435F, 0.5474F, -6.1883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3068F, -1.4635F, -2.3547F, -0.2214F, 0.4744F, -0.5422F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 25).mirror().addBox(-3.0159F, -0.3984F, -1.8299F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, -0.3924F, 0.0598F, -0.3061F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-3.1273F, -0.6913F, 0.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, -0.6612F, 0.3081F, -0.5537F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 36).mirror().addBox(-2.4548F, 1.9033F, -1.106F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, 0.467F, 0.0624F, -0.7807F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.7315F, 0.5133F, -0.7229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, -0.3019F, -0.0471F, -0.1499F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-1.804F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 44).mirror().addBox(-1.996F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 29).mirror().addBox(-5.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 55).mirror().addBox(-6.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 10).mirror().addBox(-7.0023F, 0.0417F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -7.7F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 7).mirror().addBox(-1.385F, 1.1306F, -2.0171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, 0.6728F, 0.013F, -0.4172F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.7763F, -0.2316F, -0.3786F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0772F, 4.4698F, 1.9599F, -0.0217F, 0.0624F, -0.7807F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(49, 57).mirror().addBox(-2.1692F, 2.8128F, -1.6013F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, 0.2815F, -0.1331F, -0.8233F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.1692F, 0.0577F, -2.0797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8068F, -0.3635F, -0.2547F, 0.4386F, -0.1331F, -0.8233F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 81).addBox(-0.0815F, -0.6913F, 0.7136F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(82, 24).addBox(-0.0815F, -0.6913F, 0.7136F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, -0.6252F, -0.0135F, 0.3318F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(50, 69).addBox(0.0164F, -0.3984F, -2.513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, -0.3926F, 0.0692F, 0.2527F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 61).addBox(-0.9679F, 0.3934F, -4.5938F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3068F, -1.4635F, -2.3547F, -0.2073F, -0.3209F, 0.506F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(60, 38).addBox(0.4638F, 0.4191F, -6.5496F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3068F, -1.4635F, -2.3547F, -0.1989F, -0.1499F, 0.4698F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(89, 10).addBox(0.618F, -0.5964F, -5.3304F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.9547F, -0.1929F, -0.3417F, 0.738F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(5, 95).addBox(-1.6435F, 0.5474F, -6.1883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.3068F, -1.4635F, -2.3547F, -0.2214F, -0.4744F, 0.5422F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 25).addBox(0.0159F, -0.3984F, -1.8299F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, -0.3924F, -0.0598F, 0.3061F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(70, 81).addBox(2.1273F, -0.6913F, 0.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, -0.6612F, -0.3081F, 0.5537F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 36).addBox(1.4548F, 1.9033F, -1.106F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, 0.467F, -0.0624F, 0.7807F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 86).addBox(-0.2685F, 0.5133F, -0.7229F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, -0.3019F, 0.0471F, 0.1499F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 92).addBox(-2.196F, -0.0347F, 1.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 31).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 44).addBox(-2.004F, 0.0347F, -2.4997F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 29).addBox(0.0023F, 0.0417F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 55).addBox(0.0023F, 0.0417F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 10).addBox(0.0023F, 0.0417F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -7.7F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(8, 7).addBox(0.385F, 1.1306F, -2.0171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, 0.6728F, -0.013F, 0.4172F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 7).addBox(-0.2237F, -0.2316F, -0.3786F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0772F, 4.4698F, 1.9599F, -0.0217F, -0.0624F, 0.7807F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 57).addBox(1.1692F, 2.8128F, -1.6013F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, 0.2815F, 0.1331F, 0.8233F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(1.1692F, 0.0577F, -2.0797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8068F, -0.3635F, -0.2547F, 0.4386F, 0.1331F, 0.8233F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(81, 81).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 75).addBox(0.48F, -1.717F, -0.192F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = hips.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, -2.066F, -8.4611F, -0.3499F, -0.0656F, 0.0239F));

		PartDefinition cube_r45 = osteoderms6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 100).addBox(0.7013F, 4.3486F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 0.5051F, -0.544F, 1.7013F));

		PartDefinition cube_r46 = osteoderms6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 105).addBox(0.5462F, -0.6405F, -7.1113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 2.8002F, -0.544F, 1.7013F));

		PartDefinition cube_r47 = osteoderms6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 96).addBox(0.5974F, 3.0456F, -5.3473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 2.1719F, -0.544F, 1.7013F));

		PartDefinition cube_r48 = osteoderms6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(101, 23).addBox(0.7013F, 5.8377F, 0.2121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 1.177F, -0.544F, 1.7013F));

		PartDefinition cube_r49 = osteoderms6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(21, 99).addBox(0.5362F, 2.8134F, 2.3036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 0.7219F, -0.5564F, 1.6856F));

		PartDefinition cube_r50 = osteoderms6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(100, 36).addBox(0.5362F, 3.4662F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 10).addBox(-0.1738F, -0.0334F, 0.8005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 1.3938F, -0.5564F, 1.6856F));

		PartDefinition cube_r51 = osteoderms6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 103).addBox(0.4323F, 1.3219F, -3.6389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(103, 12).addBox(-0.1628F, 0.4563F, -0.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 2.3887F, -0.5564F, 1.6856F));

		PartDefinition cube_r52 = osteoderms6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 105).addBox(0.3811F, -1.0309F, -4.716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 3.017F, -0.5564F, 1.6856F));

		PartDefinition cube_r53 = osteoderms6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 104).addBox(-0.114F, 0.5368F, -1.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1914F, 2.8865F, 8.0867F, 2.7028F, -0.5564F, 1.6856F));

		PartDefinition cube_r54 = osteoderms6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(101, 44).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.9178F, 0.0131F, 1.281F, 0.2392F, -0.2776F, 0.5931F));

		PartDefinition cube_r55 = osteoderms6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5449F, -0.0018F, 0.7049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.868F, 3.5295F, 5.0466F, 1.6209F, -0.1658F, 1.5728F));

		PartDefinition cube_r56 = osteoderms6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(45, 92).addBox(-0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 93).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9925F, -0.5704F, 1.3819F, 0.2293F, -0.1268F, 0.4399F));

		PartDefinition cube_r57 = osteoderms6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 26).addBox(-0.5339F, 0.3933F, -0.3805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.868F, 3.5295F, 5.0466F, 2.6158F, -0.1658F, 1.5728F));

		PartDefinition cube_r58 = osteoderms6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(58, 61).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.842F, -3.3103F, 7.882F, 0.0644F, 0.0331F, 0.1932F));

		PartDefinition cube_r59 = osteoderms6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -0.2F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 66).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4366F, -1.4303F, 1.1587F, 0.3262F, 0.0331F, 0.1932F));

		PartDefinition cube_r60 = osteoderms6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(8, 104).addBox(-0.4852F, 0.4526F, -1.3829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.868F, 3.5295F, 5.0466F, 2.9299F, -0.1658F, 1.5728F));

		PartDefinition cube_r61 = osteoderms6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(31, 104).addBox(-0.4167F, 0.6237F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7217F, 4.4F, 2.6598F, 2.9292F, -0.4713F, 1.573F));

		PartDefinition cube_r62 = osteoderms6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(103, 30).addBox(-0.5234F, 2.641F, -0.6044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3F, 5.216F, 1.1794F, 2.6151F, -0.4713F, 1.573F));

		PartDefinition cube_r63 = osteoderms6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(16, 98).addBox(-0.6149F, 0.5952F, 0.1059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 4.9765F, 1.8372F, 1.6203F, -0.4713F, 1.573F));

		PartDefinition osteoderms18 = hips.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -2.066F, -8.4611F, -0.3499F, 0.0656F, -0.0239F));

		PartDefinition cube_r64 = osteoderms18.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(31, 100).mirror().addBox(-1.7013F, 4.3486F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 0.5051F, 0.544F, -1.7013F));

		PartDefinition cube_r65 = osteoderms18.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 105).mirror().addBox(-1.5462F, -0.6405F, -7.1113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 2.8002F, 0.544F, -1.7013F));

		PartDefinition cube_r66 = osteoderms18.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(104, 96).mirror().addBox(-1.5974F, 3.0456F, -5.3473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 2.1719F, 0.544F, -1.7013F));

		PartDefinition cube_r67 = osteoderms18.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-1.7013F, 5.8377F, 0.2121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 1.177F, 0.544F, -1.7013F));

		PartDefinition cube_r68 = osteoderms18.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-1.5362F, 2.8134F, 2.3036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 0.7219F, 0.5564F, -1.6856F));

		PartDefinition cube_r69 = osteoderms18.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(100, 36).mirror().addBox(-1.5362F, 3.4662F, -0.3031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 10).mirror().addBox(-0.8262F, -0.0334F, 0.8005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 1.3938F, 0.5564F, -1.6856F));

		PartDefinition cube_r70 = osteoderms18.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-1.4323F, 1.3219F, -3.6389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(103, 12).mirror().addBox(-0.8372F, 0.4563F, -0.3019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 2.3887F, 0.5564F, -1.6856F));

		PartDefinition cube_r71 = osteoderms18.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 105).mirror().addBox(-1.3811F, -1.0309F, -4.716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 3.017F, 0.5564F, -1.6856F));

		PartDefinition cube_r72 = osteoderms18.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.886F, 0.5368F, -1.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1914F, 2.8865F, 8.0867F, 2.7028F, 0.5564F, -1.6856F));

		PartDefinition cube_r73 = osteoderms18.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(101, 33).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(101, 44).mirror().addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.9178F, 0.0131F, 1.281F, 0.2392F, 0.2776F, -0.5931F));

		PartDefinition cube_r74 = osteoderms18.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-0.4551F, -0.0018F, 0.7049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.868F, 3.5295F, 5.0466F, 1.6209F, 0.1658F, -1.5728F));

		PartDefinition cube_r75 = osteoderms18.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9925F, -0.5704F, 1.3819F, 0.2293F, 0.1268F, -0.4399F));

		PartDefinition cube_r76 = osteoderms18.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-0.4661F, 0.3933F, -0.3805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.868F, 3.5295F, 5.0466F, 2.6158F, 0.1658F, -1.5728F));

		PartDefinition cube_r77 = osteoderms18.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.842F, -3.3103F, 7.882F, 0.0644F, -0.0331F, -0.1932F));

		PartDefinition cube_r78 = osteoderms18.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -0.2F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 66).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.4366F, -1.4303F, 1.1587F, 0.3262F, -0.0331F, -0.1932F));

		PartDefinition cube_r79 = osteoderms18.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(8, 104).mirror().addBox(-0.5148F, 0.4526F, -1.3829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.868F, 3.5295F, 5.0466F, 2.9299F, 0.1658F, -1.5728F));

		PartDefinition cube_r80 = osteoderms18.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 104).mirror().addBox(-0.5833F, 0.6237F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7217F, 4.4F, 2.6598F, 2.9292F, 0.4713F, -1.573F));

		PartDefinition cube_r81 = osteoderms18.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(103, 30).mirror().addBox(-0.4766F, 2.641F, -0.6044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.3F, 5.216F, 1.1794F, 2.6151F, 0.4713F, -1.573F));

		PartDefinition cube_r82 = osteoderms18.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(16, 98).mirror().addBox(-0.3851F, 0.5952F, 0.1059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.9765F, 1.8372F, 1.6203F, 0.4713F, -1.573F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(42, 27).addBox(-1.5F, 6.3833F, -3.1553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.4F, 1.4999F, -1.1448F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(59, 79).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 57).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(8, 0).addBox(-0.1F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(8, 84).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 15).addBox(-1.601F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftleg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 13).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(24, 90).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftfoot.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(21, 77).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(73, 40).addBox(-1.999F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, 0.288F, 0.0F, 0.0F));

		PartDefinition leftleg4 = hips.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(42, 27).mirror().addBox(-1.5F, 6.3833F, -3.1553F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 1.4999F, -1.1448F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftleg4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 79).mirror().addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftleg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftleg5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftleg5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.9F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftleg5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(8, 84).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftleg5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-0.399F, 2.1011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftleg5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg6 = leftleg5.addOrReplaceChild("leftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftleg6.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(24, 90).mirror().addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot3 = leftleg6.addOrReplaceChild("leftfoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftfoot3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.1697F, -0.2131F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot4 = leftfoot3.addOrReplaceChild("leftfoot4", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-2.001F, -0.5853F, -3.8254F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0567F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 1.4999F, -1.1448F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9762F, -2.3099F, 0.3578F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.2705F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition backPlates3 = hips.addOrReplaceChild("backPlates3", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -2.7511F, -8.4674F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r101 = backPlates3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 0).addBox(0.1175F, -0.1637F, -0.0241F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.6F, 6.2F, -0.307F, 0.03F, 1.4399F));

		PartDefinition cube_r102 = backPlates3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 27).addBox(-0.0969F, -0.2663F, -0.7019F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.2917F, 0.0701F, 0.7274F));

		PartDefinition cube_r103 = backPlates3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(43, 37).addBox(-0.0736F, 0.5614F, -3.164F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9484F, 2.2331F, 2.5321F, 0.1225F, 0.0653F, 1.3415F));

		PartDefinition cube_r104 = backPlates3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(43, 18).addBox(-0.0287F, -0.0645F, -7.0699F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.1F, 0.076F, 0.1849F, 0.5588F));

		PartDefinition backPlates6 = hips.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -2.7511F, -8.4674F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r105 = backPlates6.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-4.1175F, -0.1637F, -0.0241F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.6F, 6.2F, -0.307F, -0.03F, -1.4399F));

		PartDefinition cube_r106 = backPlates6.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(-4.9031F, -0.2663F, -0.7019F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.2917F, -0.0701F, -0.7274F));

		PartDefinition cube_r107 = backPlates6.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 37).mirror().addBox(-4.9264F, 0.5614F, -3.164F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9484F, 2.2331F, 2.5321F, 0.1225F, -0.0653F, -1.3415F));

		PartDefinition cube_r108 = backPlates6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 18).mirror().addBox(-4.9713F, -0.0645F, -7.0699F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 7.1F, 0.076F, -0.1849F, -0.5588F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -9.3F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 0).addBox(0.5F, -1.9278F, -0.0823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(48, 78).addBox(0.5F, -2.1248F, 3.8203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 81).addBox(0.5F, -1.9918F, 1.8215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 81).addBox(0.5F, -1.8918F, -0.1785F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 68).addBox(0.0F, 0.0082F, -0.1785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(17, 16).addBox(-4.0F, -0.1414F, 0.1585F, 9.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4998F, -6.0586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 65).mirror().addBox(-4.9892F, 0.1512F, 5.9009F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.052F, 0.0059F, 0.1133F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(95, 11).mirror().addBox(-6.8833F, -3.1599F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0432F, -0.0296F, -0.6015F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-4.8727F, -7.0082F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0113F, -0.0511F, -1.3523F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-4.9306F, 0.666F, 3.8747F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0347F, -0.004F, 0.1134F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-7.1769F, -2.7327F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0288F, 0.0198F, -0.6019F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-7.3788F, -6.896F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0076F, 0.0341F, -1.3525F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-4.8982F, 0.95F, 1.7833F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1734F, -0.0197F, 0.1117F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-7.3399F, -2.4956F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1443F, 0.0985F, -0.595F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-9.6598F, -6.8337F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0381F, 0.1704F, -1.3494F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(90, 38).mirror().addBox(-4.8982F, 0.8706F, -0.3256F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.295F, -0.0325F, 0.126F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-7.2896F, -2.5527F, -0.2931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.2465F, 0.1669F, -0.5641F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(40, 46).mirror().addBox(-9.584F, -6.8413F, -0.2931F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0655F, 0.2896F, -1.3257F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(91, 65).addBox(0.9892F, 0.1512F, 5.9009F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.052F, -0.0059F, -0.1133F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(95, 11).addBox(3.8833F, -3.1599F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0432F, 0.0296F, 0.6015F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(22, 72).addBox(2.8727F, -7.0082F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0113F, 0.0511F, 1.3523F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 20).addBox(0.9306F, 0.666F, 3.8747F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0347F, 0.004F, -0.1134F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 60).addBox(4.1769F, -2.7327F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0288F, -0.0198F, 0.6019F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 36).addBox(3.3788F, -6.896F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0076F, -0.0341F, 1.3525F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(90, 24).addBox(0.8982F, 0.95F, 1.7833F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1734F, 0.0197F, -0.1117F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(93, 22).addBox(4.3399F, -2.4956F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1443F, -0.0985F, 0.595F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(14, 39).addBox(3.6598F, -6.8337F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0381F, -0.1704F, 1.3494F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 38).addBox(0.8982F, 0.8706F, -0.3256F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.295F, 0.0325F, -0.126F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(93, 26).addBox(4.2896F, -2.5527F, -0.2931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.2465F, -0.1669F, 0.5641F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 46).addBox(3.584F, -6.8413F, -0.2931F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0655F, -0.2896F, 1.3257F));

		PartDefinition osteoderms5 = body.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0577F, -4.6722F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r137 = osteoderms5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 105).addBox(-1.0517F, 0.0122F, -5.3404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4F, 5.5F, 0.3F, -3.0389F, -0.0524F, 1.5728F));

		PartDefinition cube_r138 = osteoderms5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(75, 105).addBox(-1.0517F, 2.4938F, -3.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.4F, 5.5F, 0.3F, 2.616F, -0.0524F, 1.5728F));

		PartDefinition cube_r139 = osteoderms5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(83, 104).addBox(-1.0517F, -4.2146F, 2.843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 9).addBox(-1.0517F, -4.2146F, 2.543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4F, 5.5F, 0.3F, -0.5518F, -0.0524F, 1.5728F));

		PartDefinition cube_r140 = osteoderms5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(102, 47).addBox(-1.0517F, -0.3942F, 4.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4F, 5.5F, 0.3F, 0.3733F, -0.0524F, 1.5728F));

		PartDefinition cube_r141 = osteoderms5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(43, 100).addBox(-0.6889F, 0.562F, 1.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 102).addBox(-0.6889F, 0.062F, 1.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 0.7397F, -0.1048F, 1.5728F));

		PartDefinition cube_r142 = osteoderms5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(50, 103).addBox(-0.6889F, 0.7427F, -2.5732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 2.8428F, -0.1048F, 1.5728F));

		PartDefinition cube_r143 = osteoderms5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(103, 103).addBox(-0.6889F, 1.091F, -1.919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 2.6159F, -0.1048F, 1.5728F));

		PartDefinition cube_r144 = osteoderms5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 68).addBox(-0.8F, -1.7F, 7.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4214F, 0.5283F, -4.6971F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r145 = osteoderms5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.206F, -1.2082F, 0.6851F, 0.2215F, 0.0331F, 0.1932F));

		PartDefinition cube_r146 = osteoderms5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(89, 101).addBox(1.1F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(94, 101).addBox(1.1F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(99, 101).addBox(-0.7F, -0.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(4, 102).addBox(-0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(16, 102).addBox(-0.7F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7234F, 2.6424F, 0.5212F, 0.3008F, -0.1132F, 1.1907F));

		PartDefinition cube_r147 = osteoderms5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(88, 104).addBox(-0.6006F, 0.0238F, -0.9167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 2.8429F, -0.0349F, 1.5728F));

		PartDefinition cube_r148 = osteoderms5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(93, 50).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 93).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1532F, -0.1216F, 0.89F, 0.2274F, 0.0093F, 0.4715F));

		PartDefinition cube_r149 = osteoderms5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(101, 56).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(101, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(84, 101).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.0373F, 0.7641F, 2.4118F, 0.23F, -0.0229F, 0.6545F));

		PartDefinition cube_r150 = osteoderms5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 104).addBox(-0.6006F, 0.0178F, -0.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 2.616F, -0.0349F, 1.5728F));

		PartDefinition cube_r151 = osteoderms5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(90, 98).addBox(-0.6006F, -0.5004F, 0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 87).addBox(-0.6006F, -1.0004F, 0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.6F, 5.5F, 0.5F, 0.7398F, -0.0349F, 1.5728F));

		PartDefinition osteoderms17 = body.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0577F, -4.6722F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r152 = osteoderms17.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(0.0517F, 0.0122F, -5.3404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 5.5F, 0.3F, -3.0389F, 0.0524F, -1.5728F));

		PartDefinition cube_r153 = osteoderms17.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 105).mirror().addBox(0.0517F, 2.4938F, -3.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 5.5F, 0.3F, 2.616F, 0.0524F, -1.5728F));

		PartDefinition cube_r154 = osteoderms17.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(83, 104).mirror().addBox(0.0517F, -4.2146F, 2.843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 9).mirror().addBox(0.0517F, -4.2146F, 2.543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 5.5F, 0.3F, -0.5518F, 0.0524F, -1.5728F));

		PartDefinition cube_r155 = osteoderms17.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(0.0517F, -0.3942F, 4.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 5.5F, 0.3F, 0.3733F, 0.0524F, -1.5728F));

		PartDefinition cube_r156 = osteoderms17.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 100).mirror().addBox(-0.3111F, 0.562F, 1.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 102).mirror().addBox(-0.3111F, 0.062F, 1.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 0.7397F, 0.1048F, -1.5728F));

		PartDefinition cube_r157 = osteoderms17.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-0.3111F, 0.7427F, -2.5732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 2.8428F, 0.1048F, -1.5728F));

		PartDefinition cube_r158 = osteoderms17.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(103, 103).mirror().addBox(-0.3111F, 1.091F, -1.919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 2.6159F, 0.1048F, -1.5728F));

		PartDefinition cube_r159 = osteoderms17.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-0.2F, -1.7F, 7.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4214F, 0.5283F, -4.6971F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r160 = osteoderms17.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(69, 48).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.206F, -1.2082F, 0.6851F, 0.2215F, -0.0331F, -0.1932F));

		PartDefinition cube_r161 = osteoderms17.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(89, 101).mirror().addBox(-2.1F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(94, 101).mirror().addBox(-2.1F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(99, 101).mirror().addBox(-0.3F, -0.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(4, 102).mirror().addBox(-0.3F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(16, 102).mirror().addBox(-0.3F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7234F, 2.6424F, 0.5212F, 0.3008F, 0.1132F, -1.1907F));

		PartDefinition cube_r162 = osteoderms17.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(88, 104).mirror().addBox(-0.3994F, 0.0238F, -0.9167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 2.8429F, 0.0349F, -1.5728F));

		PartDefinition cube_r163 = osteoderms17.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 93).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1532F, -0.1216F, 0.89F, 0.2274F, -0.0093F, -0.4715F));

		PartDefinition cube_r164 = osteoderms17.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(101, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(84, 101).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.0373F, 0.7641F, 2.4118F, 0.23F, 0.0229F, -0.6545F));

		PartDefinition cube_r165 = osteoderms17.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 104).mirror().addBox(-0.3994F, 0.0178F, -0.4667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 2.616F, 0.0349F, -1.5728F));

		PartDefinition cube_r166 = osteoderms17.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 98).mirror().addBox(-0.3994F, -0.5004F, 0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 87).mirror().addBox(-0.3994F, -1.0004F, 0.5358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 5.5F, 0.5F, 0.7398F, 0.0349F, -1.5728F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -6.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(11, 21).addBox(-2.0354F, -2.8566F, 1.7649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(18, 44).addBox(-2.0354F, -2.3047F, -0.1939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(6, 16).mirror().addBox(-2.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.0035F, -6.5138F, 1.2594F, -0.2286F, -0.0214F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-2.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, -1.1535F, -0.1122F, 0.0715F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-2.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, -0.6124F, -0.1122F, 0.0715F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-2.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 1.5447F, -5.5231F, 0.3999F, -0.1122F, 0.0715F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(43, 18).mirror().addBox(-2.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.9278F, -0.2286F, -0.0214F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-2.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, -0.5812F, -0.3034F, -0.0377F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-3.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.6482F, -0.5705F, -0.8236F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(41, 68).mirror().addBox(-3.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-3.3634F, 0.1949F, 0.1506F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.1071F, -0.5705F, -0.8236F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(65, 1).mirror().addBox(6.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8017F, -1.2264F, -0.6264F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(5.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8769F, -1.2497F, -0.706F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(11, 66).mirror().addBox(4.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.9129F, -1.2152F, -0.6561F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(3.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 1.208F, -1.2599F, -0.8819F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(11, 75).mirror().addBox(-1.4535F, 1.0586F, 5.6645F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5023F, -0.0624F, 0.1863F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-4.7974F, -0.1627F, 5.6645F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.4323F, 0.2715F, -0.4533F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-9.3913F, -3.3936F, 5.6645F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.1277F, 0.4909F, -1.2317F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-2.5898F, 0.3658F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7942F, 0.4558F, -0.4082F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-5.1372F, -1.5015F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.2612F, 0.8614F, -1.2321F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(0.5593F, 0.0092F, -0.2884F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.887F, -0.0881F, 0.0716F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(34, 77).mirror().addBox(-0.3518F, 0.8463F, 1.6847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7124F, -0.0743F, 0.0858F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(94, 96).mirror().addBox(-3.8266F, 0.3999F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.6216F, 0.3807F, -0.4785F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(73, 92).mirror().addBox(-7.065F, -2.3201F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.186F, 0.6952F, -1.2851F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 40).mirror().addBox(-1.3316F, 1.0807F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5904F, -0.0633F, 0.0942F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-4.7198F, -0.066F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5073F, 0.3223F, -0.5179F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(51, 86).mirror().addBox(-8.4005F, -3.27F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.145F, 0.5775F, -1.3095F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 0).addBox(1.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -1.1535F, 0.1122F, -0.0715F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(61, 18).addBox(1.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -0.6124F, 0.1122F, -0.0715F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 48).addBox(1.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0354F, 1.5447F, -5.5231F, 0.3999F, 0.1122F, -0.0715F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(6, 16).addBox(1.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0354F, 3.0035F, -6.5138F, 1.2594F, 0.2286F, 0.0214F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(43, 18).addBox(1.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.9278F, 0.2286F, 0.0214F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(80, 6).addBox(1.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -0.5812F, 0.3034F, 0.0377F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(33, 68).addBox(2.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.6482F, 0.5705F, 0.8236F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(41, 68).addBox(2.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 53).addBox(2.3634F, 0.1949F, 0.1506F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.1071F, 0.5705F, 0.8236F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(38, 57).addBox(-3.0354F, 5.6968F, 2.2793F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(31, 10).addBox(-4.0354F, 4.3062F, 0.7182F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(65, 1).addBox(-7.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8017F, 1.2264F, 0.6264F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 64).addBox(-6.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8769F, 1.2497F, 0.706F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(11, 66).addBox(-5.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.9129F, 1.2152F, 0.6561F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 10).addBox(-4.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 1.208F, 1.2599F, 0.8819F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 56).addBox(-2.5354F, -0.4162F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 105).addBox(-2.0354F, -3.0507F, 5.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 105).addBox(-2.0354F, -2.9507F, 3.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(11, 75).addBox(-1.5465F, 1.0586F, 5.6645F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5023F, 0.0624F, -0.1863F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(92, 89).addBox(1.7974F, -0.1627F, 5.6645F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.4323F, -0.2715F, 0.4533F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(17, 12).addBox(3.3913F, -3.3936F, 5.6645F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.1277F, -0.4909F, 1.2317F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(95, 67).addBox(-0.4102F, 0.3658F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7942F, -0.4558F, 0.4082F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 0).addBox(2.1372F, -1.5015F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2612F, -0.8614F, 1.2321F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(25, 94).addBox(-1.5593F, 0.0092F, -0.2884F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.887F, 0.0881F, -0.0716F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(34, 77).addBox(-1.6482F, 0.8463F, 1.6847F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7124F, 0.0743F, -0.0858F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(94, 96).addBox(0.8266F, 0.3999F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.6216F, -0.3807F, 0.4785F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(73, 92).addBox(3.065F, -2.3201F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.186F, -0.6952F, 1.2851F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 40).addBox(-1.6684F, 1.0807F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5904F, 0.0633F, -0.0942F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(97, 42).addBox(1.7198F, -0.066F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5073F, -0.3223F, 0.5179F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(51, 86).addBox(3.4005F, -3.27F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.145F, -0.5775F, 1.3095F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(74, 69).addBox(-2.0F, 0.0734F, -2.9506F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.111F, -5.606F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(23, 36).addBox(-3.0F, -0.125F, 0.3203F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1605F, -5.8752F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5354F, -0.6794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition backPlates = chest.addOrReplaceChild("backPlates", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0293F, 5.0998F, -7.1849F, 0.0F, 0.0349F, -0.0015F));

		PartDefinition cube_r224 = backPlates.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(73, 33).addBox(-2.1525F, -0.0574F, -0.3353F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, 0.2884F, 1.4373F));

		PartDefinition cube_r225 = backPlates.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(18, 44).addBox(-0.0611F, -0.0011F, -4.0353F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -4.0F, 2.8F, 0.4869F, -0.1591F, 1.1984F));

		PartDefinition cube_r226 = backPlates.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 0).addBox(-2.0F, -0.3F, -1.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -3.6F, 0.8F, 0.489F, 0.1521F, 0.6303F));

		PartDefinition cube_r227 = backPlates.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(14, 32).addBox(-2.0024F, -0.3327F, -5.7744F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -3.5759F, 8.3825F, 0.3747F, 0.0416F, 0.7897F));

		PartDefinition cube_r228 = backPlates.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(61, 18).addBox(-2.4526F, -1.0358F, -5.7314F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -1.0759F, 8.8825F, 0.372F, -0.117F, 1.2992F));

		PartDefinition cube_r229 = backPlates.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 74).addBox(0.0F, 0.023F, -5.0607F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5293F, -6.4759F, 7.3825F, 0.1869F, -0.1294F, 0.5987F));

		PartDefinition backPlates4 = chest.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0293F, 5.0998F, -7.1849F, 0.0F, -0.0349F, 0.0015F));

		PartDefinition cube_r230 = backPlates4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(-0.8475F, -0.0574F, -0.3353F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, -0.2884F, -1.4373F));

		PartDefinition cube_r231 = backPlates4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(-2.9389F, -0.0011F, -4.0353F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.0F, 2.8F, 0.4869F, 0.1591F, -1.1984F));

		PartDefinition cube_r232 = backPlates4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-1.0F, -0.3F, -1.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, -3.6F, 0.8F, 0.489F, -0.1521F, -0.6303F));

		PartDefinition cube_r233 = backPlates4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 32).mirror().addBox(0.0024F, -0.3327F, -5.7744F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -3.5759F, 8.3825F, 0.3747F, -0.0416F, -0.7897F));

		PartDefinition cube_r234 = backPlates4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-2.5474F, -1.0358F, -5.7314F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -1.0759F, 8.8825F, 0.372F, 0.117F, -1.2992F));

		PartDefinition cube_r235 = backPlates4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-3.0F, 0.023F, -5.0607F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5293F, -6.4759F, 7.3825F, 0.1869F, 0.1294F, -0.5987F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.5886F, -6.9554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r236 = osteoderms4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(103, 59).addBox(-1.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.4F, -0.8431F, 0.0331F, 0.1932F));

		PartDefinition cube_r237 = osteoderms4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(96, 2).addBox(-1.0435F, -0.0972F, -0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -0.4F, 0.0644F, 0.0331F, 0.1932F));

		PartDefinition cube_r238 = osteoderms4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 57).addBox(-0.5F, -0.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(77, 81).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4214F, -0.5026F, 3.5861F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r239 = osteoderms4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(93, 92).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4314F, 0.0087F, 6.4981F, 0.0878F, 0.0093F, 0.4715F));

		PartDefinition cube_r240 = osteoderms4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(13, 94).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2872F, 0.2305F, 3.5098F, 0.0882F, 0.0046F, 0.5237F));

		PartDefinition cube_r241 = osteoderms4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(26, 84).addBox(-1.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.4F, 0.2913F, 0.0331F, 0.1932F));

		PartDefinition cube_r242 = osteoderms4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(95, 7).addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.6781F, 5.1461F, 6.1651F, 1.1933F, -0.2149F, 1.4675F));

		PartDefinition cube_r243 = osteoderms4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(94, 33).addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.6781F, 5.1461F, 6.1651F, 1.5598F, -0.2149F, 1.4675F));

		PartDefinition cube_r244 = osteoderms4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(66, 94).addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5781F, 5.1461F, 4.4651F, 1.1933F, -0.2149F, 1.4675F));

		PartDefinition cube_r245 = osteoderms4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(5.5781F, 5.1461F, 4.4651F, 1.5598F, -0.2149F, 1.4675F));

		PartDefinition cube_r246 = osteoderms4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(69, 61).addBox(-0.1643F, 0.6998F, -1.3794F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 2.7004F, 0.0579F, 1.8568F));

		PartDefinition cube_r247 = osteoderms4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 7).addBox(-0.1652F, 0.7861F, 0.639F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 1.1296F, 0.0579F, 1.8568F));

		PartDefinition cube_r248 = osteoderms4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(43, 0).addBox(-0.2138F, -0.6002F, 0.4688F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 0.9725F, 0.0579F, 1.8568F));

		PartDefinition cube_r249 = osteoderms4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(33, 68).addBox(-0.2138F, -0.057F, 4.9625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 0.9725F, 0.0579F, 1.8568F));

		PartDefinition cube_r250 = osteoderms4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(26, 77).addBox(-0.2138F, -1.2378F, 4.9799F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 0.8504F, 0.0579F, 1.8568F));

		PartDefinition cube_r251 = osteoderms4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 44).addBox(-0.1758F, -1.2135F, -1.7341F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7342F, 4.5099F, 1.4365F, 2.744F, 0.0579F, 1.8568F));

		PartDefinition cube_r252 = osteoderms4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 98).addBox(-0.6509F, -0.6059F, -0.8575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 3.0313F, 0.4353F, 1.5039F));

		PartDefinition cube_r253 = osteoderms4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(75, 98).addBox(-0.6509F, -0.5116F, -0.5283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 2.8044F, 0.4353F, 1.5039F));

		PartDefinition cube_r254 = osteoderms4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 87).addBox(-0.6509F, -0.3255F, 0.5024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 1.19F, 0.4353F, 1.5039F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(40, 48).addBox(-0.6509F, -1.0825F, 1.0493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3F, 4.3F, -0.6F, 0.9282F, 0.4353F, 1.5039F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(105, 35).addBox(-0.6817F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 2.134F, 0.2905F, 1.1092F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(21, 102).addBox(-1.1F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.5851F, 1.1934F, 6.2458F, 0.1581F, 0.143F, 0.7867F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(100, 50).addBox(-0.6F, -0.7F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(100, 69).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7641F, 2.5177F, 5.338F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r259 = osteoderms4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(74, 102).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(6.126F, 3.9735F, 6.684F, 0.2105F, 0.2129F, 1.4894F));

		PartDefinition cube_r260 = osteoderms4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 102).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(5.4414F, 3.8665F, 5.211F, 0.4188F, -0.0419F, 1.3744F));

		PartDefinition cube_r261 = osteoderms4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(102, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7046F, 4.0021F, 3.5261F, 0.4276F, -0.2011F, 1.3023F));

		PartDefinition cube_r262 = osteoderms4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(100, 80).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.6194F, 2.1467F, 2.5881F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r263 = osteoderms4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(101, 20).addBox(-0.6817F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 0.2577F, 0.2905F, 1.1092F));

		PartDefinition osteoderms16 = chest.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.5886F, -6.9554F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r264 = osteoderms16.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(103, 59).mirror().addBox(0.0435F, -1.7884F, 0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, -0.4F, -0.8431F, -0.0331F, -0.1932F));

		PartDefinition cube_r265 = osteoderms16.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(96, 2).mirror().addBox(0.0435F, -0.0972F, -0.0752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, -0.4F, 0.0644F, -0.0331F, -0.1932F));

		PartDefinition cube_r266 = osteoderms16.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-0.5F, -0.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 81).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4214F, -0.5026F, 3.5861F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r267 = osteoderms16.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(93, 92).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4314F, 0.0087F, 6.4981F, 0.0878F, -0.0093F, -0.4715F));

		PartDefinition cube_r268 = osteoderms16.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2872F, 0.2305F, 3.5098F, 0.0882F, -0.0046F, -0.5237F));

		PartDefinition cube_r269 = osteoderms16.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(0.0435F, -0.0729F, -0.0731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, -0.4F, 0.2913F, -0.0331F, -0.1932F));

		PartDefinition cube_r270 = osteoderms16.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(95, 7).mirror().addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.6781F, 5.1461F, 6.1651F, 1.1933F, 0.2149F, -1.4675F));

		PartDefinition cube_r271 = osteoderms16.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.6781F, 5.1461F, 6.1651F, 1.5598F, 0.2149F, -1.4675F));

		PartDefinition cube_r272 = osteoderms16.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(66, 94).mirror().addBox(-0.5F, -0.6217F, -1.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.5781F, 5.1461F, 4.4651F, 1.1933F, 0.2149F, -1.4675F));

		PartDefinition cube_r273 = osteoderms16.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-0.5F, -0.3532F, -0.9573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.5781F, 5.1461F, 4.4651F, 1.5598F, 0.2149F, -1.4675F));

		PartDefinition cube_r274 = osteoderms16.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(-0.8357F, 0.6998F, -1.3794F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 2.7004F, -0.0579F, -1.8568F));

		PartDefinition cube_r275 = osteoderms16.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.8348F, 0.7861F, 0.639F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 1.1296F, -0.0579F, -1.8568F));

		PartDefinition cube_r276 = osteoderms16.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-0.7862F, -0.6002F, 0.4688F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 0.9725F, -0.0579F, -1.8568F));

		PartDefinition cube_r277 = osteoderms16.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-0.7862F, -0.057F, 4.9625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 0.9725F, -0.0579F, -1.8568F));

		PartDefinition cube_r278 = osteoderms16.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(-0.7862F, -1.2378F, 4.9799F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 0.8504F, -0.0579F, -1.8568F));

		PartDefinition cube_r279 = osteoderms16.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.8242F, -1.2135F, -1.7341F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7342F, 4.5099F, 1.4365F, 2.744F, -0.0579F, -1.8568F));

		PartDefinition cube_r280 = osteoderms16.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(80, 98).mirror().addBox(-0.3491F, -0.6059F, -0.8575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 3.0313F, -0.4353F, -1.5039F));

		PartDefinition cube_r281 = osteoderms16.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.3491F, -0.5116F, -0.5283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 2.8044F, -0.4353F, -1.5039F));

		PartDefinition cube_r282 = osteoderms16.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.3491F, -0.3255F, 0.5024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 1.19F, -0.4353F, -1.5039F));

		PartDefinition cube_r283 = osteoderms16.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(-0.3491F, -1.0825F, 1.0493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.3F, -0.6F, 0.9282F, -0.4353F, -1.5039F));

		PartDefinition cube_r284 = osteoderms16.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(105, 35).mirror().addBox(-0.3183F, -0.0489F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 2.134F, -0.2905F, -1.1092F));

		PartDefinition cube_r285 = osteoderms16.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 102).mirror().addBox(0.1F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.5851F, 1.1934F, 6.2458F, 0.1581F, -0.143F, -0.7867F));

		PartDefinition cube_r286 = osteoderms16.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(100, 50).mirror().addBox(-0.4F, -0.7F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(100, 69).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7641F, 2.5177F, 5.338F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r287 = osteoderms16.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(74, 102).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-6.126F, 3.9735F, 6.684F, 0.2105F, -0.2129F, -1.4894F));

		PartDefinition cube_r288 = osteoderms16.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(79, 102).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-5.4414F, 3.8665F, 5.211F, 0.4188F, 0.0419F, -1.3744F));

		PartDefinition cube_r289 = osteoderms16.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(102, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7046F, 4.0021F, 3.5261F, 0.4276F, 0.2011F, -1.3023F));

		PartDefinition cube_r290 = osteoderms16.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.6194F, 2.1467F, 2.5881F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r291 = osteoderms16.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(101, 20).mirror().addBox(-0.3183F, -0.5314F, 0.7724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 0.2577F, -0.2905F, -1.1092F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3F, 7.5669F, -6.0334F, -0.0523F, -0.0008F, -0.2182F));

		PartDefinition cube_r292 = leftarm.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(17, 16).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r293 = leftarm.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 16).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r294 = leftarm.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(85, 31).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftarm.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 63).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.0571F, 2.3001F, -0.7904F, -0.7781F, 1.3773F));

		PartDefinition cube_r297 = leftarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(61, 36).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.67F, 0.5245F, -2.7163F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r298 = leftarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(32, 96).addBox(-1.1537F, -0.6337F, -2.2401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6967F, 1.9934F, -1.3352F, 2.1923F, -0.9327F, 1.4486F));

		PartDefinition cube_r299 = leftarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(96, 13).addBox(-1.1537F, -0.8561F, -2.3018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.6967F, 1.9934F, -1.3352F, 2.6548F, -0.9327F, 1.4486F));

		PartDefinition cube_r300 = leftarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(64, 102).addBox(-1.0F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1161F, -2.3194F, -0.3821F, 1.6606F, -1.0239F, 1.9594F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(43, 96).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.0661F, -2.6294F, -2.1363F, 1.8534F, -1.0012F, 1.7324F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(25, 96).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.7016F, -2.6699F, -1.5259F, 1.8534F, -1.0012F, 1.7324F));

		PartDefinition cube_r303 = leftarm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(102, 88).addBox(-1.1F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2484F, -2.2789F, -0.9925F, 1.3267F, -0.9123F, 1.8537F));

		PartDefinition cube_r304 = leftarm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 89).addBox(-0.5F, -0.5681F, -2.5258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.6967F, -0.0066F, -1.3352F, 2.4366F, -0.9327F, 1.4486F));

		PartDefinition cube_r305 = leftarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(6, 90).addBox(-0.5F, -0.634F, -2.4905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6967F, -0.0066F, -1.3352F, 2.1923F, -0.9327F, 1.4486F));

		PartDefinition cube_r306 = leftarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(39, 78).addBox(0.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 0.9791F, 0.5331F, -0.7742F));

		PartDefinition cube_r307 = lefthand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(87, 0).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r308 = lefthand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 25).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r309 = lefthand.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(77, 18).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r310 = lefthand.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(31, 92).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, 7.5669F, -6.0334F, 0.5149F, 0.0008F, 0.2182F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(17, 16).mirror().addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r312 = rightarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r313 = rightarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(85, 31).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-1.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightarm.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.0571F, 2.3001F, -0.7904F, 0.7781F, -1.3773F));

		PartDefinition cube_r316 = rightarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.67F, 0.5245F, -2.7163F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r317 = rightarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(32, 96).mirror().addBox(0.1537F, -0.6337F, -2.2401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6967F, 1.9934F, -1.3352F, 2.1923F, 0.9327F, -1.4486F));

		PartDefinition cube_r318 = rightarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(96, 13).mirror().addBox(0.1537F, -0.8561F, -2.3018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.6967F, 1.9934F, -1.3352F, 2.6548F, 0.9327F, -1.4486F));

		PartDefinition cube_r319 = rightarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(0.0F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1161F, -2.3194F, -0.3821F, 1.6606F, 1.0239F, -1.9594F));

		PartDefinition cube_r320 = rightarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(4.0661F, -2.6294F, -2.1363F, 1.8534F, 1.0012F, -1.7324F));

		PartDefinition cube_r321 = rightarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(25, 96).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.7016F, -2.6699F, -1.5259F, 1.8534F, 1.0012F, -1.7324F));

		PartDefinition cube_r322 = rightarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(102, 88).mirror().addBox(0.1F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2484F, -2.2789F, -0.9925F, 1.3267F, 0.9123F, -1.8537F));

		PartDefinition cube_r323 = rightarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-0.5F, -0.5681F, -2.5258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.6967F, -0.0066F, -1.3352F, 2.4366F, 0.9327F, -1.4486F));

		PartDefinition cube_r324 = rightarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(6, 90).mirror().addBox(-0.5F, -0.634F, -2.4905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6967F, -0.0066F, -1.3352F, 2.1923F, 0.9327F, -1.4486F));

		PartDefinition cube_r325 = rightarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(39, 78).mirror().addBox(-2.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 0.5515F, -0.9369F, 0.7112F));

		PartDefinition cube_r326 = righthand.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r327 = righthand.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r328 = righthand.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r329 = righthand.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(31, 92).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -6.8F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition cube_r330 = neck3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 105).addBox(0.5F, -2.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 84).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(105, 79).addBox(0.5F, -1.6346F, -0.0211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r332 = neck3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(103, 75).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.5833F, 0.412F, -0.3864F));

		PartDefinition cube_r333 = neck3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(55, 79).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.1534F, 0.6858F, -1.1724F));

		PartDefinition cube_r334 = neck3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.6573F, 0.2332F, -0.3628F));

		PartDefinition cube_r335 = neck3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.368F, 0.5997F, -1.0433F));

		PartDefinition cube_r336 = neck3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(103, 75).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.5833F, -0.412F, 0.3864F));

		PartDefinition cube_r337 = neck3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(55, 79).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.1534F, -0.6858F, 1.1724F));

		PartDefinition cube_r338 = neck3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(33, 90).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.6573F, -0.2332F, 0.3628F));

		PartDefinition cube_r339 = neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(76, 6).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.368F, -0.5997F, 1.0433F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(67, 25).addBox(-2.0F, 0.0003F, -0.0519F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2343F, -3.9679F, 0.0611F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -2.2664F, -3.3527F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r341 = osteoderms3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(48, 78).addBox(-1.0F, -2.8299F, 0.0963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.1891F, 0.3979F, -0.5522F));

		PartDefinition cube_r342 = osteoderms3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(79, 46).addBox(-1.0F, -3.1299F, 0.8963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.5692F, 0.3832F, -0.542F));

		PartDefinition cube_r343 = osteoderms3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(103, 15).addBox(-0.5306F, 0.4487F, -0.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3061F, 3.1679F, 1.8367F, 0.2774F, 0.0103F, 1.742F));

		PartDefinition cube_r344 = osteoderms3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 97).addBox(-0.4242F, -2.6667F, 0.2178F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.3061F, 3.1679F, 1.8367F, -0.1198F, 0.0032F, 1.8164F));

		PartDefinition cube_r345 = osteoderms3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(71, 87).addBox(-0.4597F, -0.3865F, -1.8981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3061F, 3.1679F, 1.8367F, 0.8838F, 0.0032F, 1.8164F));

		PartDefinition cube_r346 = osteoderms3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(87, 51).addBox(-0.1504F, -0.9142F, -1.6022F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1783F, -0.9305F, 1.5458F, 0.8838F, 0.0032F, 0.7256F));

		PartDefinition cube_r347 = osteoderms3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(102, 93).addBox(-0.1786F, -0.1292F, -1.0509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1783F, -0.9305F, 1.5458F, 0.2774F, 0.0103F, 0.6512F));

		PartDefinition cube_r348 = osteoderms3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(50, 97).addBox(-0.1148F, -3.1998F, -0.0682F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1783F, -0.9305F, 1.5458F, -0.1198F, 0.0032F, 0.7256F));

		PartDefinition osteoderms15 = neck3.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -2.2664F, -3.3527F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r349 = osteoderms15.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(0.0F, -2.8299F, 0.0963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.1891F, -0.3979F, 0.5522F));

		PartDefinition cube_r350 = osteoderms15.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(0.0F, -3.1299F, 0.8963F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.5692F, -0.3832F, 0.542F));

		PartDefinition cube_r351 = osteoderms15.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(103, 15).mirror().addBox(-0.4694F, 0.4487F, -0.9891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3061F, 3.1679F, 1.8367F, 0.2774F, -0.0103F, -1.742F));

		PartDefinition cube_r352 = osteoderms15.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.5758F, -2.6667F, 0.2178F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.3061F, 3.1679F, 1.8367F, -0.1198F, -0.0032F, -1.8164F));

		PartDefinition cube_r353 = osteoderms15.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(71, 87).mirror().addBox(-0.5403F, -0.3865F, -1.8981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3061F, 3.1679F, 1.8367F, 0.8838F, -0.0032F, -1.8164F));

		PartDefinition cube_r354 = osteoderms15.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-0.8496F, -0.9142F, -1.6022F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1783F, -0.9305F, 1.5458F, 0.8838F, -0.0032F, -0.7256F));

		PartDefinition cube_r355 = osteoderms15.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(102, 93).mirror().addBox(-0.8214F, -0.1292F, -1.0509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1783F, -0.9305F, 1.5458F, 0.2774F, -0.0103F, -0.6512F));

		PartDefinition cube_r356 = osteoderms15.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(50, 97).mirror().addBox(-0.8852F, -3.1998F, -0.0682F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1783F, -0.9305F, 1.5458F, -0.1198F, -0.0032F, -0.7256F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.0076F, -0.0438F, 0.0426F));

		PartDefinition cube_r357 = neck2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 25).addBox(0.5F, -1.5F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 25).addBox(0.5F, -1.3F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 84).addBox(0.0F, -0.6F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.3529F, 0.5783F, -0.9417F));

		PartDefinition cube_r359 = neck2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(11, 70).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r360 = neck2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(59, 53).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.3529F, -0.5783F, 0.9417F));

		PartDefinition cube_r361 = neck2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(11, 70).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition cube_r362 = neck2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(57, 71).addBox(-1.0F, -0.0434F, -0.0745F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.8039F, -3.689F, -0.1658F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r363 = osteoderms2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(55, 97).addBox(-0.485F, -3.1151F, -0.0993F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2084F, -0.3478F, 1.0979F, -0.1793F, 0.0398F, 0.5498F));

		PartDefinition cube_r364 = osteoderms2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(69, 102).addBox(-0.5534F, -0.0906F, -1.1072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2084F, -0.3478F, 1.0979F, 0.2153F, 0.0423F, 0.475F));

		PartDefinition cube_r365 = osteoderms2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(89, 72).addBox(-0.5206F, -0.8949F, -1.6903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2084F, -0.3478F, 1.0979F, 0.8243F, 0.0398F, 0.5498F));

		PartDefinition cube_r366 = osteoderms2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(102, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0947F, 2.7539F, 0.2949F, 0.2153F, 0.0423F, 1.8102F));

		PartDefinition cube_r367 = osteoderms2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(89, 84).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4493F, 2.8555F, 0.1085F, 0.8243F, 0.0398F, 1.885F));

		PartDefinition cube_r368 = osteoderms2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(11, 98).addBox(0.7462F, -3.5221F, -0.2335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5673F, 1.6532F, 0.9063F, -0.1793F, 0.0398F, 1.885F));

		PartDefinition osteoderms14 = neck2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.7664F, -2.2484F));

		PartDefinition cube_r369 = osteoderms14.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(55, 97).mirror().addBox(-0.515F, -3.1151F, -0.0993F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.2084F, -0.3478F, 1.0979F, -0.1793F, -0.0398F, -0.5498F));

		PartDefinition cube_r370 = osteoderms14.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(69, 102).mirror().addBox(-0.4466F, -0.0906F, -1.1072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2084F, -0.3478F, 1.0979F, 0.2153F, -0.0423F, -0.475F));

		PartDefinition cube_r371 = osteoderms14.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-0.4794F, -0.8949F, -1.6903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2084F, -0.3478F, 1.0979F, 0.8243F, -0.0398F, -0.5498F));

		PartDefinition cube_r372 = osteoderms14.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(102, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0947F, 2.7539F, 0.2949F, 0.2153F, -0.0423F, -1.8102F));

		PartDefinition cube_r373 = osteoderms14.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4493F, 2.8555F, 0.1085F, 0.8243F, -0.0398F, -1.885F));

		PartDefinition cube_r374 = osteoderms14.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(11, 98).mirror().addBox(-1.7462F, -3.5221F, -0.2335F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5673F, 1.6532F, 0.9063F, -0.1793F, -0.0398F, -1.885F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r375 = neck.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(86, 87).addBox(0.5F, -0.9219F, 1.9925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 57).addBox(0.0F, -0.2219F, -0.0075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-3.3697F, 0.1338F, 0.1453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5F, -3.9F, 0.7087F, 0.8998F, -0.7267F));

		PartDefinition cube_r377 = neck.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(103, 62).addBox(2.3697F, 0.1338F, 0.1453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, 0.7087F, -0.8998F, 0.7267F));

		PartDefinition cube_r378 = neck.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 73).addBox(-1.5F, -0.0885F, 0.0352F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1088F, -4.3603F, 0.0785F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r379 = osteoderms.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 10).addBox(-0.2903F, -0.0533F, -2.2586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2884F, 2.7937F, 0.6832F, 1.2398F, 0.095F, 1.8373F));

		PartDefinition cube_r380 = osteoderms.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(94, 54).addBox(-0.2903F, 0.0217F, -2.0716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.2884F, 2.7937F, 0.6832F, 0.8646F, 0.095F, 1.8373F));

		PartDefinition cube_r381 = osteoderms.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(82, 18).addBox(-0.5F, -0.323F, -1.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.342F, -0.4634F, 0.2303F, 1.2398F, 0.095F, 0.5894F));

		PartDefinition cube_r382 = osteoderms.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(95, 82).addBox(-0.5F, -0.586F, -1.2648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.342F, -0.4634F, 0.2303F, 0.8646F, 0.095F, 0.5894F));

		PartDefinition osteoderms13 = neck.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.3664F, -1.3484F));

		PartDefinition cube_r383 = osteoderms13.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.7097F, -0.0533F, -2.2586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, 2.7937F, 0.6832F, 1.2398F, -0.095F, -1.8373F));

		PartDefinition cube_r384 = osteoderms13.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-0.7097F, 0.0217F, -2.0716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, 2.7937F, 0.6832F, 0.8646F, -0.095F, -1.8373F));

		PartDefinition cube_r385 = osteoderms13.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.5F, -0.323F, -1.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.342F, -0.4634F, 0.2303F, 1.2398F, -0.095F, -0.5894F));

		PartDefinition cube_r386 = osteoderms13.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-0.5F, -0.586F, -1.2648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.342F, -0.4634F, 0.2303F, 0.8646F, -0.095F, -0.5894F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4258F, -3.8931F, 0.1816F, -0.1935F, -0.0988F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(89, 61).addBox(-1.0F, -0.4F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 74).addBox(-1.0F, -0.7F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.6334F, -2.6639F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(86, 46).addBox(-2.7F, -2.6824F, -0.1106F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.9406F, -1.124F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(86, 40).addBox(-2.7F, -1.9968F, -0.0796F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.3406F, -2.324F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(15, 90).addBox(-2.2F, -1.9297F, -0.1205F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.8406F, -4.024F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(73, 94).addBox(-1.2F, -1.8258F, -0.138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.1594F, -5.324F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(88, 67).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3213F, -0.9719F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(66, 4).addBox(-1.5F, -1.0167F, 0.0066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.5F, 0.747F, -6.1319F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(69, 52).addBox(-1.5F, -0.8709F, -0.0149F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.5F, 1.547F, -6.4319F, -0.384F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.2594F, -5.524F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(15, 77).addBox(-1.2F, 0.3375F, -0.3062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.7F, 0.912F, -0.7844F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(102, 64).addBox(-0.8F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 1.212F, 0.6156F, 1.0297F, 0.0239F, 0.006F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(103, 2).addBox(-0.9F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.4F, 2.012F, 0.0156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(35, 102).addBox(-0.27F, -0.4739F, 0.1102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(95, 70).addBox(-0.6709F, 0.6264F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 87).addBox(-0.8709F, -0.0736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1902F, 0.4005F, 0.0154F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(88, 4).addBox(-0.9709F, -0.7736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3873F, -0.3645F, 2.8533F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(38, 89).addBox(-0.5F, -0.0779F, -1.6598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2383F, 0.0291F, 5.0007F, 1.4051F, -0.2261F, 2.7629F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(88, 79).addBox(-0.9635F, -0.2965F, -2.4695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2383F, 1.1291F, 5.3007F, 0.5673F, -0.2261F, 2.7629F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(54, 88).addBox(-0.5F, -0.5272F, -1.3943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2383F, 0.0291F, 5.0007F, 1.0386F, -0.2261F, 2.7629F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(14, 32).addBox(-0.6904F, 0.3918F, -0.4605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.9143F, -1.868F, 4.8678F, -1.2171F, 0.4124F, 0.1469F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(38, 99).addBox(-0.8831F, -0.2915F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9143F, -1.868F, 4.8678F, -1.5095F, 0.0331F, 0.0111F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(99, 53).addBox(-0.9199F, -0.4798F, 0.1705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1143F, -1.868F, 6.6678F, -1.8177F, -0.2434F, -0.0713F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(44, 10).addBox(-0.8641F, -1.8496F, -0.3496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9143F, -1.868F, 5.0678F, -1.8689F, -0.6305F, 0.0472F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(26, 100).addBox(-0.5564F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0764F, -0.7834F, 4.1226F, -0.5934F, 0.0349F, 0.0F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(59, 94).addBox(-1.3F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8101F, -0.1834F, 4.8361F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(62, 86).addBox(-1.4F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(98, 91).addBox(-0.5599F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 98).addBox(-0.4499F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2899F, -0.7834F, 4.1152F, -0.2007F, 0.0349F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.2594F, -5.524F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(0.2F, 0.3375F, -0.3062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.912F, -0.7844F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(102, 64).mirror().addBox(-0.2F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.212F, 0.6156F, 1.0297F, -0.0239F, -0.006F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(103, 2).mirror().addBox(-0.1F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.012F, 0.0156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-0.73F, -0.4739F, 0.1102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(95, 70).mirror().addBox(-0.3291F, 0.6264F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 87).mirror().addBox(-0.1291F, -0.0736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1902F, -0.4005F, -0.0154F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.0291F, -0.7736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3873F, -0.3645F, 2.8533F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-0.5F, -0.0779F, -1.6598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.0291F, 5.0007F, 1.4051F, 0.2261F, -2.7629F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(-0.0365F, -0.2965F, -2.4695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 1.1291F, 5.3007F, 0.5673F, 0.2261F, -2.7629F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(-0.5F, -0.5272F, -1.3943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2383F, 0.0291F, 5.0007F, 1.0386F, 0.2261F, -2.7629F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(14, 32).mirror().addBox(-0.3096F, 0.3918F, -0.4605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.9143F, -1.868F, 4.8678F, -1.2171F, -0.4124F, -0.1469F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(38, 99).mirror().addBox(-0.1169F, -0.2915F, -0.3204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9143F, -1.868F, 4.8678F, -1.5095F, -0.0331F, -0.0111F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(99, 53).mirror().addBox(-0.0801F, -0.4798F, 0.1705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1143F, -1.868F, 6.6678F, -1.8177F, 0.2434F, 0.0713F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(-0.1359F, -1.8496F, -0.3496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9143F, -1.868F, 5.0678F, -1.8689F, 0.6305F, -0.0472F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(26, 100).mirror().addBox(-0.4436F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0764F, -0.7834F, 4.1226F, -0.5934F, -0.0349F, 0.0F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(59, 94).mirror().addBox(-0.7F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8101F, -0.1834F, 4.8361F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(-0.6F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-0.4401F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 98).mirror().addBox(-0.5501F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2899F, -0.7834F, 4.1152F, -0.2007F, -0.0349F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.3117F, -0.1904F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3923F, 0.8058F, -3.7103F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(26, 106).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6879F, 0.6914F, -2.782F, 0.0902F, -0.3121F, 0.0362F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(7, 81).mirror().addBox(-0.1046F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.4433F, -2.2018F, 0.3052F, -0.0694F, 0.0073F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(80, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8523F, 1.4547F, -4.3136F, 0.375F, -0.0694F, 0.0073F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(38, 94).mirror().addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(38, 94).addBox(1.9F, -0.6F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.5021F, -0.6497F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-0.5F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 58).addBox(1.9F, -0.1114F, -1.7698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.4452F, -1.734F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(87, 94).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 94).addBox(1.9F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.2548F, -0.834F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(0.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.6433F, -4.1018F, 0.6467F, -0.0506F, -0.0512F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-0.2309F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.2433F, -3.2018F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(99, 28).mirror().addBox(-0.5758F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3433F, -2.2018F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-0.5758F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3433F, -2.2018F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(54, 88).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7923F, 0.8058F, -3.7103F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(26, 106).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0879F, 0.6914F, -2.782F, 0.0902F, 0.3121F, -0.0362F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(7, 81).addBox(-0.8954F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7954F, 1.4433F, -2.2018F, 0.3052F, 0.0694F, -0.0073F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(80, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2523F, 1.4547F, -4.3136F, 0.375F, 0.0694F, -0.0073F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(5, 99).addBox(-1.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.6433F, -4.1018F, 0.6467F, 0.0506F, 0.0512F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(100, 6).addBox(-0.7691F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.2433F, -3.2018F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(99, 28).addBox(-0.4242F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 1.3433F, -2.2018F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(85, 98).addBox(-0.4242F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.3433F, -2.2018F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7F, 4.5F, 0.9021F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition cube_r448 = backPlates2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(41, 48).addBox(-4.5153F, -0.8034F, -7.0849F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5107F, 1.4352F, 0.6292F, -0.2548F, -0.3092F, 1.4002F));

		PartDefinition cube_r449 = backPlates2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 44).addBox(-0.3139F, -0.0399F, -6.9139F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.008F, -5.3315F, -2.6683F, -0.0652F, -0.3944F, 0.6071F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.7F, 4.5F, 0.9021F, -0.1586F, -0.4921F, 0.0754F));

		PartDefinition cube_r450 = backPlates5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(-0.4847F, -0.8034F, -7.0849F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5107F, 1.4352F, 0.6292F, -0.2548F, 0.3092F, -1.4002F));

		PartDefinition cube_r451 = backPlates5.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-4.6861F, -0.0399F, -6.9139F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.008F, -5.3315F, -2.6683F, -0.0652F, 0.3944F, -0.6071F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(25, 50).addBox(0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 32).addBox(0.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-0.4F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 27).addBox(0.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 50).mirror().addBox(-2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 32).mirror().addBox(-2.1F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-1.6F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 27).mirror().addBox(-1.4F, 0.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 40).addBox(0.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(0.0F, -2.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 71).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 44).addBox(0.0F, -2.2F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.3583F, 0.0665F, -0.0714F));

		PartDefinition cube_r452 = tail.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(27, 25).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 21).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 53).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(24, 25).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -1.4664F, 9.4473F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r454 = osteoderms12.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(14, 53).addBox(0.0797F, -1.6648F, 0.3546F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.793F, 0.2737F, -6.1239F, -2.4927F, -0.653F, -0.4691F));

		PartDefinition cube_r455 = osteoderms12.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(26, 57).addBox(-1.056F, -0.0878F, -0.1305F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.893F, -1.2263F, -6.4239F, -2.264F, 0.139F, -1.2591F));

		PartDefinition cube_r456 = osteoderms12.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(58, 49).addBox(-0.8172F, -2.8617F, -0.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2846F, -1.0921F, -2.5064F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms19 = tail.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -1.4664F, 9.4473F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r457 = osteoderms19.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-1.0797F, -1.6648F, 0.3546F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.793F, 0.2737F, -6.1239F, -2.4927F, 0.653F, 0.4691F));

		PartDefinition cube_r458 = osteoderms19.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(0.056F, -0.0878F, -0.1305F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.893F, -1.2263F, -6.4239F, -2.264F, -0.139F, 1.2591F));

		PartDefinition cube_r459 = osteoderms19.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.1828F, -2.8617F, -0.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2846F, -1.0921F, -2.5064F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -2.4926F, 1.8292F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r460 = osteoderms7.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(60, 98).addBox(-0.3032F, -1.154F, -0.3124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.175F, 0.2689F, 4.5862F, 2.3277F, -0.51F, 1.4763F));

		PartDefinition cube_r461 = osteoderms7.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(98, 74).addBox(-0.3121F, -0.189F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.175F, 0.2689F, 4.5862F, 1.8914F, -0.51F, 1.4763F));

		PartDefinition cube_r462 = osteoderms7.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(70, 98).addBox(-5.5374F, -2.2572F, -0.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.5686F, 5.2243F, 6.1232F, 2.3431F, -0.6403F, 1.4679F));

		PartDefinition cube_r463 = osteoderms7.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(98, 86).addBox(-5.5463F, -1.1635F, -1.1845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5686F, 5.2243F, 6.1232F, 1.9067F, -0.6403F, 1.4679F));

		PartDefinition osteoderms20 = tail.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -2.4926F, 1.8292F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r464 = osteoderms20.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(60, 98).mirror().addBox(-0.6968F, -1.154F, -0.3124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.175F, 0.2689F, 4.5862F, 2.3277F, 0.51F, -1.4763F));

		PartDefinition cube_r465 = osteoderms20.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(98, 74).mirror().addBox(-0.6879F, -0.189F, -0.6639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.175F, 0.2689F, 4.5862F, 1.8914F, 0.51F, -1.4763F));

		PartDefinition cube_r466 = osteoderms20.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(70, 98).mirror().addBox(4.5374F, -2.2572F, -0.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.5686F, 5.2243F, 6.1232F, 2.3431F, 0.6403F, -1.4679F));

		PartDefinition cube_r467 = osteoderms20.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(4.5463F, -1.1635F, -1.1845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5686F, 5.2243F, 6.1232F, 1.9067F, 0.6403F, -1.4679F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(58, 61).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 53).addBox(0.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 79).addBox(0.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 80).addBox(0.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 46).addBox(-0.1F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 53).mirror().addBox(-1.3F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 79).mirror().addBox(-1.1F, 0.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 80).mirror().addBox(-1.0F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 46).mirror().addBox(-0.9F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 69).addBox(0.0F, -2.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 25).addBox(0.0F, -1.9F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 68).addBox(0.0F, -1.8F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 10).addBox(0.0F, -1.8F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0651F, 0.1771F, -0.0319F));

		PartDefinition cube_r468 = tail2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(82, 24).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 87).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 56).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 87).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(25, 44).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r470 = tail2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(0.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3846F, -2.5586F, -0.0591F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition cube_r471 = tail2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(47, 57).addBox(-1.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3846F, -2.5586F, -0.0591F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r472 = osteoderms8.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(105, 18).addBox(-3.2447F, -1.0403F, -0.2055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2448F, 5.8357F, 5.5359F, 2.2421F, -0.3645F, 1.8326F));

		PartDefinition cube_r473 = osteoderms8.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(98, 17).addBox(-3.1994F, -0.6886F, -0.5571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2448F, 5.8357F, 5.5359F, 1.4245F, -0.3683F, 1.8267F));

		PartDefinition cube_r474 = osteoderms8.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(97, 46).addBox(-1.8385F, -1.5186F, -0.2213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0448F, 5.8357F, 2.5359F, 2.2421F, -0.3645F, 1.8326F));

		PartDefinition cube_r475 = osteoderms8.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(16, 84).addBox(-1.7899F, -0.625F, -0.995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0448F, 5.8357F, 2.5359F, 1.4245F, -0.3683F, 1.8267F));

		PartDefinition cube_r476 = osteoderms8.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(65, 98).addBox(-0.901F, -1.1708F, -0.2319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6448F, 5.8357F, -0.4641F, 2.2421F, -0.3645F, 1.8326F));

		PartDefinition cube_r477 = osteoderms8.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(98, 62).addBox(-0.8502F, -0.3826F, -0.7537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6448F, 5.8357F, -0.4641F, 1.4245F, -0.3683F, 1.8267F));

		PartDefinition osteoderms21 = tail2.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r478 = osteoderms21.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(105, 18).mirror().addBox(2.2447F, -1.0403F, -0.2055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2448F, 5.8357F, 5.5359F, 2.2421F, 0.3645F, -1.8326F));

		PartDefinition cube_r479 = osteoderms21.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(98, 17).mirror().addBox(2.1994F, -0.6886F, -0.5571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2448F, 5.8357F, 5.5359F, 1.4245F, 0.3683F, -1.8267F));

		PartDefinition cube_r480 = osteoderms21.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(0.8385F, -1.5186F, -0.2213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0448F, 5.8357F, 2.5359F, 2.2421F, 0.3645F, -1.8326F));

		PartDefinition cube_r481 = osteoderms21.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(16, 84).mirror().addBox(0.7899F, -0.625F, -0.995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0448F, 5.8357F, 2.5359F, 1.4245F, 0.3683F, -1.8267F));

		PartDefinition cube_r482 = osteoderms21.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(65, 98).mirror().addBox(-0.099F, -1.1708F, -0.2319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6448F, 5.8357F, -0.4641F, 2.2421F, 0.3645F, -1.8326F));

		PartDefinition cube_r483 = osteoderms21.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(98, 62).mirror().addBox(-0.1498F, -0.3826F, -0.7537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6448F, 5.8357F, -0.4641F, 1.4245F, 0.3683F, -1.8267F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(14, 55).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(5, 64).addBox(0.0F, -1.7F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 57).addBox(0.0F, -1.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 57).addBox(0.0F, -1.4F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 29).addBox(0.0F, -1.4F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1311F, 0.2345F, -0.0982F));

		PartDefinition cube_r484 = tail3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(74, 33).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 47).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 81).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 74).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r486 = osteoderms9.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(26, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7919F, 3.3523F, 4.1938F, 2.1961F, -0.5324F, 1.5731F));

		PartDefinition cube_r487 = osteoderms9.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(104, 52).addBox(-0.2531F, -1.4286F, -0.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6693F, 3.8313F, 2.3996F, 2.1786F, -0.5324F, 1.5731F));

		PartDefinition cube_r488 = osteoderms9.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(40, 103).addBox(-0.0282F, -0.9672F, -1.3339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.8693F, 5.1313F, -1.8004F, 2.6588F, -0.4451F, 1.573F));

		PartDefinition osteoderms22 = tail3.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r489 = osteoderms22.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(26, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7919F, 3.3523F, 4.1938F, 2.1961F, 0.5324F, -1.5731F));

		PartDefinition cube_r490 = osteoderms22.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(104, 52).mirror().addBox(-0.7469F, -1.4286F, -0.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6693F, 3.8313F, 2.3996F, 2.1786F, 0.5324F, -1.5731F));

		PartDefinition cube_r491 = osteoderms22.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.9718F, -0.9672F, -1.3339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.8693F, 5.1313F, -1.8004F, 2.6588F, 0.4451F, -1.573F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 57).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(44, 106).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 41).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 106).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 106).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.1046F, 0.3188F, -0.0926F));

		PartDefinition cube_r492 = tail4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(6, 53).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 53).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 90).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r494 = osteoderms10.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(105, 38).addBox(0.1875F, 1.4038F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(36, 105).addBox(-0.2029F, -0.5317F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8814F, -0.873F, 3.6312F, 2.2659F, -0.5324F, 1.5731F));

		PartDefinition cube_r495 = osteoderms10.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(104, 67).addBox(-0.2027F, -0.6004F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9814F, 0.3827F, 0.4721F, 2.3706F, -0.5324F, 1.5731F));

		PartDefinition osteoderms23 = tail4.addOrReplaceChild("osteoderms23", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r496 = osteoderms23.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(105, 38).mirror().addBox(-1.1875F, 1.4038F, -2.4806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(36, 105).mirror().addBox(-0.7971F, -0.5317F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8814F, -0.873F, 3.6312F, 2.2659F, 0.5324F, -1.5731F));

		PartDefinition cube_r497 = osteoderms23.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(-0.7973F, -0.6004F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9814F, 0.3827F, 0.4721F, 2.3706F, 0.5324F, -1.5731F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5157F, -0.1994F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0262F, 8.9999F, 0.0248F, 0.2696F, -0.162F));

		PartDefinition cube_r498 = tail5.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9998F, 0.0061F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.2996F, 0.7751F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition cube_r499 = osteoderms11.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(34, 79).addBox(1.147F, 6.2196F, -4.8292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 98).addBox(1.0536F, 5.4133F, -4.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 104).addBox(0.9177F, 4.1975F, -3.9916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 100).addBox(0.7086F, 2.327F, -3.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 104).addBox(0.5923F, 0.3338F, -2.3817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 5).addBox(0.5067F, -1.4142F, -1.643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 105).addBox(0.3897F, -3.4428F, -0.8029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 105).addBox(0.2825F, -5.4127F, -0.0886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6693F, -3.2188F, 3.8454F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition osteoderms24 = tail5.addOrReplaceChild("osteoderms24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.2996F, 0.7751F, -0.5062F, -0.0153F, 0.0085F));

		PartDefinition cube_r500 = osteoderms24.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(34, 79).mirror().addBox(-2.147F, 6.2196F, -4.8292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 98).mirror().addBox(-2.0536F, 5.4133F, -4.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 104).mirror().addBox(-1.9177F, 4.1975F, -3.9916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 100).mirror().addBox(-1.7086F, 2.327F, -3.3153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 104).mirror().addBox(-1.5923F, 0.3338F, -2.3817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 5).mirror().addBox(-1.5067F, -1.4142F, -1.643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(13, 105).mirror().addBox(-1.3897F, -3.4428F, -0.8029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 105).mirror().addBox(-1.2825F, -5.4127F, -0.0886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6693F, -3.2188F, 3.8454F, 1.9168F, 0.5324F, -1.5731F));

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